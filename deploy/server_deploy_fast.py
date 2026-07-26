"""Fast deploy helper for shizuki-site (single-archive upload).

Drop-in companion of server_deploy.py:
- Reuses its exclude rules, protected prefixes, SSH config and the existing
  remote runner (deploy/scripts/remote-compose-build.sh). Same semantics:
  size+mtime incremental sync, remote deletions, protected data/.env.server.
- Replaces the slow per-file SFTP walk with:
    1) one remote `find` to index the server tree (seconds instead of minutes)
    2) one tar.gz with only changed files, uploaded as a single stream
    3) one remote extract + batched deletions
- Writes live progress to deploy/logs/fast-deploy-<ts>.log and a one-line
  status to deploy/.local-deploy.status so progress can be watched from
  outside this console.

Usage:  python server_deploy_fast.py update   (or: restart)
"""

from __future__ import annotations

import io
import os
import posixpath
import shlex
import sys
import tarfile
import tempfile
import time
import traceback
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent))
import server_deploy as base  # noqa: E402  (reuse config + helpers)

DEPLOY_DIR = Path(__file__).resolve().parent
LOGS_DIR = DEPLOY_DIR / "logs"
STATUS_FILE = DEPLOY_DIR / ".local-deploy.status"
UPLOAD_EXTRA_EXCLUDES = ("deploy/logs", "deploy/.local-deploy.status")

_log_fh = None


def _now() -> str:
    return time.strftime("%Y-%m-%d %H:%M:%S")


def tee(message: str) -> None:
    line = f"[{time.strftime('%H:%M:%S')}] {message}"
    try:
        print(line, flush=True)
    except Exception:
        pass
    if _log_fh is not None:
        _log_fh.write(line + "\n")
        _log_fh.flush()


def set_status(text: str) -> None:
    try:
        STATUS_FILE.write_text(f"{text} | {_now()}\n", encoding="utf-8")
    except OSError:
        pass


def parse_config() -> tuple[str, base.DeployConfig]:
    command = sys.argv[1] if len(sys.argv) > 1 else "update"
    if command not in ("update", "restart"):
        raise SystemExit("usage: server_deploy_fast.py [update|restart]")
    config = base.DeployConfig(
        host=os.getenv("REMOTE_HOST", base.DEFAULT_HOST),
        user=os.getenv("REMOTE_USER", base.DEFAULT_USER),
        password=os.getenv("REMOTE_PASS", base.DEFAULT_PASSWORD),
        remote_app_dir=os.getenv("REMOTE_APP_DIR", base.DEFAULT_REMOTE_APP_DIR).rstrip("/"),
        remote_deploy_dir=(
            os.getenv("REMOTE_DEPLOY_DIR")
            or os.getenv("REMOTE_APP_DIR", base.DEFAULT_REMOTE_APP_DIR).rstrip("/") + "/deploy"
        ).rstrip("/"),
        upload_retries=max(int(os.getenv("UPLOAD_RETRIES", str(base.DEFAULT_UPLOAD_RETRIES))), 1),
        deploy_timeout_seconds=max(
            int(os.getenv("DEPLOY_TIMEOUT_SECONDS", str(base.DEFAULT_DEPLOY_TIMEOUT_SECONDS))), 1
        ),
        deploy_poll_interval_seconds=max(
            int(os.getenv("DEPLOY_POLL_INTERVAL_SECONDS", str(base.DEFAULT_DEPLOY_POLL_INTERVAL_SECONDS))), 1
        ),
    )
    return command, config


def local_tree() -> tuple[set[str], dict[str, Path]]:
    dirs, files = base.build_local_tree(base.repo_root())
    for rel in list(files):
        if rel.startswith(UPLOAD_EXTRA_EXCLUDES) or any(
            rel == p or rel.startswith(p + "/") for p in UPLOAD_EXTRA_EXCLUDES
        ):
            del files[rel]
    dirs = {d for d in dirs if not any(d == p or d.startswith(p + "/") for p in UPLOAD_EXTRA_EXCLUDES)}
    return dirs, files


def remote_index(ssh, config) -> tuple[set[str], dict[str, tuple[int, int]]]:
    """One-shot remote index: rel -> (size, int_mtime); plus the dir set."""
    app = shlex.quote(config.remote_app_dir)
    base.require_success(ssh, f"mkdir -p {app}")
    cmd = (
        f"cd {app} && "
        "{ find . -path ./data -prune -o -type f -printf '%P\\t%s\\t%T@\\n' ; "
        "find . -path ./data -prune -o -type d -printf '%P/D\\n' ; } 2>/dev/null || true"
    )
    _, out, _ = base.read_command(ssh, cmd, timeout=120)
    files: dict[str, tuple[int, int]] = {}
    dirs: set[str] = set()
    for raw in out.splitlines():
        if not raw:
            continue
        if raw.endswith("/D") and "\t" not in raw:
            rel = raw[:-2].rstrip("/")
            if rel and rel != ".":
                dirs.add(rel)
            continue
        parts = raw.split("\t")
        if len(parts) != 3:
            continue
        rel, size_s, mtime_s = parts
        if not rel or rel.startswith(".fast-deploy"):
            continue
        try:
            files[rel] = (int(size_s), int(float(mtime_s)))
        except ValueError:
            continue
    return dirs, files


def compute_plan(local_files: dict[str, Path], remote_files: dict[str, tuple[int, int]]):
    to_upload: list[str] = []
    skipped = 0
    for rel, path in local_files.items():
        try:
            st = path.stat()
        except OSError:
            continue
        remote = remote_files.get(rel)
        if remote is not None and remote[0] == st.st_size and remote[1] == int(st.st_mtime):
            skipped += 1
            continue
        to_upload.append(rel)
    to_delete = [
        rel
        for rel in remote_files
        if rel not in local_files
        and not base.is_protected_remote(rel)
        and not rel.startswith(".fast-deploy")
    ]
    return sorted(to_upload), sorted(to_delete), skipped


def pack_archive(to_upload: list[str], local_files: dict[str, Path]) -> tuple[str, int]:
    fd, tmp_path = tempfile.mkstemp(prefix="shizuki-fast-deploy-", suffix=".tar.gz")
    os.close(fd)
    packed = 0
    with tarfile.open(tmp_path, "w:gz", compresslevel=6) as tar:
        for rel in to_upload:
            path = local_files[rel]
            try:
                tar.add(str(path), arcname=rel, recursive=False)
            except OSError:
                tee(f"[pack] WARN cannot read {rel}, skipped")
                continue
            packed += 1
            if packed % 300 == 0:
                tee(f"[pack] {packed}/{len(to_upload)} files packed")
                set_status(f"PACK {packed}/{len(to_upload)}")
    return tmp_path, packed


def upload_archive(ssh, config, tmp_path: str, remote_tmp: str) -> None:
    size = os.path.getsize(tmp_path)
    sftp = ssh.open_sftp()
    try:
        last_pct = -10

        def cb(done: int, total: int) -> None:
            nonlocal last_pct
            pct = int(done * 100 / total) if total else 100
            if pct >= last_pct + 5:
                last_pct = pct
                tee(f"[upload] {pct}% ({done // 1048576}/{total // 1048576} MB)")
                set_status(f"UPLOAD {pct}% ({done // 1048576}/{total // 1048576} MB)")

        sftp.put(tmp_path, remote_tmp, callback=cb)
    finally:
        sftp.close()
    tee(f"[upload] archive uploaded ({size // 1048576} MB)")


def chunked_commands(ssh, items: list[str], template: str, chunk: int = 150) -> None:
    for i in range(0, len(items), chunk):
        batch = " ".join(shlex.quote(x) for x in items[i : i + chunk])
        base.require_success(ssh, template.format(batch=batch), timeout=120)


def run_update(config: base.DeployConfig) -> None:
    root = base.repo_root()
    common_cfg = root / "resouces" / "yaml" / "common-config.yaml"
    if not common_cfg.is_file() or common_cfg.stat().st_size == 0:
        raise RuntimeError("resouces/yaml/common-config.yaml missing or empty locally")

    set_status("INDEX local")
    tee("[1/6] Building local file index...")
    local_dirs, local_files = local_tree()
    tee(f"[1/6] local files: {len(local_files)}, dirs: {len(local_dirs)}")

    attempt = 1
    while True:
        tmp_path = None
        try:
            with base.open_ssh(config) as ssh:
                base.require_success(ssh, "echo ok >/dev/null")
                set_status("INDEX remote")
                tee("[2/6] Indexing remote tree (one-shot find)...")
                remote_dirs, remote_files = remote_index(ssh, config)
                tee(f"[2/6] remote files: {len(remote_files)}, dirs: {len(remote_dirs)}")

                to_upload, to_delete, skipped = compute_plan(local_files, remote_files)
                tee(
                    f"[3/6] plan: upload {len(to_upload)}, delete {len(to_delete)}, "
                    f"unchanged {skipped}"
                )

                app = config.remote_app_dir
                missing_dirs = sorted(d for d in local_dirs if d not in remote_dirs)
                if missing_dirs:
                    chunked_commands(
                        ssh,
                        missing_dirs,
                        "cd " + shlex.quote(app) + " && mkdir -p -- {batch}",
                    )

                # dir/file type conflicts (rare): local file where remote dir, and vice versa
                file_over_dir = [r for r in to_upload if r in remote_dirs]
                dir_over_file = sorted(d for d in local_dirs if d in remote_files)
                if file_over_dir:
                    chunked_commands(
                        ssh, file_over_dir, "cd " + shlex.quote(app) + " && rm -rf -- {batch}"
                    )
                if dir_over_file:
                    chunked_commands(
                        ssh, dir_over_file, "cd " + shlex.quote(app) + " && rm -f -- {batch}"
                    )
                    chunked_commands(
                        ssh, dir_over_file, "cd " + shlex.quote(app) + " && mkdir -p -- {batch}"
                    )

                if to_upload:
                    set_status(f"PACK 0/{len(to_upload)}")
                    tee("[4/6] Packing changed files...")
                    tmp_path, packed = pack_archive(to_upload, local_files)
                    tee(f"[4/6] packed {packed} files -> {os.path.getsize(tmp_path) // 1048576} MB archive")
                    remote_tmp = f"{app}/.fast-deploy-upload-{os.getpid()}.tar.gz"
                    tee("[4/6] Uploading archive (single stream)...")
                    try:
                        upload_archive(ssh, config, tmp_path, remote_tmp)
                        set_status("EXTRACT")
                        tee("[4/6] Extracting on server...")
                        base.require_success(
                            ssh,
                            "set -e; cd {app}; tar -xzf {tmp}; rm -f {tmp}; "
                            "find . -name '*.sh' -not -path './data/*' -exec chmod 755 {{}} + "
                            "2>/dev/null || true".format(
                                app=shlex.quote(app), tmp=shlex.quote(remote_tmp)
                            ),
                            timeout=600,
                        )
                    finally:
                        base.read_command(ssh, f"rm -f {shlex.quote(remote_tmp)}")
                else:
                    tee("[4/6] Nothing to upload, tree already in sync.")

                if to_delete:
                    set_status(f"DELETE {len(to_delete)}")
                    tee(f"[5/6] Deleting {len(to_delete)} obsolete remote files...")
                    chunked_commands(
                        ssh, to_delete, "cd " + shlex.quote(app) + " && rm -f -- {batch}"
                    )
                base.read_command(
                    ssh,
                    "cd {app} && find . -mindepth 1 -depth -type d -empty "
                    "-not -path './data' -not -path './data/*' "
                    "-exec rmdir {{}} + 2>/dev/null || true".format(app=shlex.quote(app)),
                )

                set_status("BUILD starting")
                tee("[6/6] Starting remote rebuild (docker compose build)...")
                base.start_remote_rebuild(ssh, config)
                poll_build(ssh, config)
                set_status("SUCCESS")
                tee("Update code + deploy finished successfully.")
                return
        except Exception as exc:
            if attempt >= config.upload_retries:
                raise
            tee(f"[WARN] attempt {attempt} failed: {exc}; retrying in 5s (resume is incremental)")
            set_status(f"RETRY {attempt}")
            attempt += 1
            time.sleep(5)
        finally:
            if tmp_path:
                try:
                    os.unlink(tmp_path)
                except OSError:
                    pass


def poll_build(ssh, config: base.DeployConfig) -> None:
    status_file = f"{config.remote_deploy_dir}/.remote-deploy.status"
    log_file = f"{config.remote_deploy_dir}/.remote-deploy.log"
    start = time.time()
    last_tail = 0.0
    while True:
        elapsed = int(time.time() - start)
        if elapsed > config.deploy_timeout_seconds:
            tail = base.tail_remote_log(ssh, log_file, 80).strip()
            if tail:
                tee(tail)
            raise RuntimeError(f"remote deploy timed out after {config.deploy_timeout_seconds}s")
        _, status_line, _ = base.read_command(ssh, f"cat {shlex.quote(status_file)} 2>/dev/null || true")
        status_line = status_line.strip()
        if status_line.startswith("SUCCESS"):
            tee("[OK] remote deploy finished successfully.")
            tail = base.tail_remote_log(ssh, log_file, 40).strip()
            if tail:
                tee(tail)
            return
        if status_line.startswith("FAILED"):
            tail = base.tail_remote_log(ssh, log_file, 120).strip()
            if tail:
                tee(tail)
            raise RuntimeError(status_line)
        set_status(f"BUILD {status_line or 'starting'} ({elapsed}s)")
        if time.time() - last_tail > 30:
            last_tail = time.time()
            tail = base.tail_remote_log(ssh, log_file, 2).strip()
            if tail:
                for line in tail.splitlines():
                    tee(f"[build] {line}")
        time.sleep(config.deploy_poll_interval_seconds)


def main() -> int:
    global _log_fh
    LOGS_DIR.mkdir(parents=True, exist_ok=True)
    log_path = LOGS_DIR / f"fast-deploy-{time.strftime('%Y%m%d-%H%M%S')}.log"
    _log_fh = open(log_path, "a", encoding="utf-8")
    base.log = tee  # route reused helpers' logging through the tee
    command, config = parse_config()
    tee(f"fast deploy: command={command}, host={config.host}, app={config.remote_app_dir}")
    tee(f"log file: {log_path}")
    try:
        if command == "update":
            run_update(config)
        else:
            set_status("RESTART")
            base.run_restart(config)
            set_status("SUCCESS")
        return 0
    except Exception as exc:
        set_status(f"FAILED {exc}")
        tee(f"[ERROR] {exc}")
        tee(traceback.format_exc())
        return 1
    finally:
        _log_fh.close()


if __name__ == "__main__":
    raise SystemExit(main())
