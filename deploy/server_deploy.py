from __future__ import annotations

import argparse
import os
import posixpath
import shlex
import stat
import sys
import time
from dataclasses import dataclass
from pathlib import Path

import paramiko


DEFAULT_HOST = "111.228.35.186"
DEFAULT_USER = "root"
DEFAULT_PASSWORD = "Izumi2486"
DEFAULT_REMOTE_APP_DIR = "/opt/shizuki-site"
DEFAULT_UPLOAD_RETRIES = 4
DEFAULT_DEPLOY_TIMEOUT_SECONDS = 5400
DEFAULT_DEPLOY_POLL_INTERVAL_SECONDS = 10

ROOT_LEVEL_EXCLUDES = {
    ".beads",
    ".git",
    ".idea",
    ".vscode",
    "data",
}
ANYWHERE_DIR_EXCLUDES = {
    "__pycache__",
    "dist-temp",
    "node_modules",
    "target",
}
PREFIX_EXCLUDES = {
    ".mvn/repository",
    "deploy/.env.server",
}
PROTECTED_REMOTE_PREFIXES = {
    "data",
    "deploy/.env.server",
}


@dataclass(frozen=True)
class DeployConfig:
    host: str
    user: str
    password: str
    remote_app_dir: str
    remote_deploy_dir: str
    upload_retries: int
    deploy_timeout_seconds: int
    deploy_poll_interval_seconds: int


def parse_args() -> tuple[str, DeployConfig]:
    parser = argparse.ArgumentParser(
        description="Windows-native deploy helper for shizuki-site."
    )
    parser.add_argument("command", choices=("update", "restart"))
    parser.add_argument("--host", default=os.getenv("REMOTE_HOST", DEFAULT_HOST))
    parser.add_argument("--user", default=os.getenv("REMOTE_USER", DEFAULT_USER))
    parser.add_argument(
        "--password", default=os.getenv("REMOTE_PASS", DEFAULT_PASSWORD)
    )
    parser.add_argument(
        "--remote-app-dir",
        default=os.getenv("REMOTE_APP_DIR", DEFAULT_REMOTE_APP_DIR),
    )
    parser.add_argument(
        "--remote-deploy-dir",
        default=os.getenv("REMOTE_DEPLOY_DIR"),
    )
    parser.add_argument(
        "--upload-retries",
        type=int,
        default=int(os.getenv("UPLOAD_RETRIES", str(DEFAULT_UPLOAD_RETRIES))),
    )
    parser.add_argument(
        "--deploy-timeout-seconds",
        type=int,
        default=int(
            os.getenv(
                "DEPLOY_TIMEOUT_SECONDS", str(DEFAULT_DEPLOY_TIMEOUT_SECONDS)
            )
        ),
    )
    parser.add_argument(
        "--deploy-poll-interval-seconds",
        type=int,
        default=int(
            os.getenv(
                "DEPLOY_POLL_INTERVAL_SECONDS",
                str(DEFAULT_DEPLOY_POLL_INTERVAL_SECONDS),
            )
        ),
    )
    args = parser.parse_args()

    remote_deploy_dir = (
        args.remote_deploy_dir or f"{args.remote_app_dir.rstrip('/')}/deploy"
    )
    config = DeployConfig(
        host=args.host,
        user=args.user,
        password=args.password,
        remote_app_dir=args.remote_app_dir.rstrip("/"),
        remote_deploy_dir=remote_deploy_dir.rstrip("/"),
        upload_retries=max(args.upload_retries, 1),
        deploy_timeout_seconds=max(args.deploy_timeout_seconds, 1),
        deploy_poll_interval_seconds=max(args.deploy_poll_interval_seconds, 1),
    )
    return args.command, config


def repo_root() -> Path:
    return Path(__file__).resolve().parent.parent


def to_rel_posix(path: Path, root: Path) -> str:
    return path.relative_to(root).as_posix()


def is_excluded(rel_posix: str) -> bool:
    if not rel_posix:
        return False
    parts = rel_posix.split("/")
    if parts[0] in ROOT_LEVEL_EXCLUDES:
        return True
    if any(part in ANYWHERE_DIR_EXCLUDES for part in parts):
        return True
    if rel_posix.endswith(".DS_Store"):
        return True
    for prefix in PREFIX_EXCLUDES:
        if rel_posix == prefix or rel_posix.startswith(prefix + "/"):
            return True
    return False


def is_protected_remote(rel_posix: str) -> bool:
    for prefix in PROTECTED_REMOTE_PREFIXES:
        if rel_posix == prefix or rel_posix.startswith(prefix + "/"):
            return True
    return False


def build_local_tree(root: Path) -> tuple[set[str], dict[str, Path]]:
    dirs: set[str] = set()
    files: dict[str, Path] = {}

    for current_root, current_dirs, current_files in os.walk(root, topdown=True):
        root_path = Path(current_root)
        rel_dir = "" if root_path == root else to_rel_posix(root_path, root)

        kept_dirs: list[str] = []
        for name in current_dirs:
            child_rel = f"{rel_dir}/{name}" if rel_dir else name
            if is_excluded(child_rel):
                continue
            kept_dirs.append(name)
            dirs.add(child_rel)
        current_dirs[:] = kept_dirs

        for name in current_files:
            child_path = root_path / name
            child_rel = f"{rel_dir}/{name}" if rel_dir else name
            if is_excluded(child_rel):
                continue
            files[child_rel] = child_path
            parent = Path(child_rel).parent.as_posix()
            if parent != ".":
                dirs.add(parent)

    return dirs, files


def remote_join(base: str, rel_posix: str) -> str:
    if not rel_posix:
        return base
    return posixpath.join(base, rel_posix)


def ensure_remote_dir(sftp: paramiko.SFTPClient, remote_dir: str) -> None:
    current = "/"
    for part in [piece for piece in remote_dir.split("/") if piece]:
        current = posixpath.join(current, part)
        try:
            attrs = sftp.stat(current)
            if not stat.S_ISDIR(attrs.st_mode):
                raise NotADirectoryError(current)
        except OSError:
            sftp.mkdir(current)


def list_remote_tree(
    sftp: paramiko.SFTPClient, remote_base: str
) -> tuple[set[str], dict[str, paramiko.SFTPAttributes]]:
    dirs: set[str] = set()
    files: dict[str, paramiko.SFTPAttributes] = {}

    def walk(rel_dir: str) -> None:
        remote_dir = remote_join(remote_base, rel_dir)
        try:
            entries = sftp.listdir_attr(remote_dir)
        except OSError:
            return

        for entry in entries:
            child_rel = f"{rel_dir}/{entry.filename}" if rel_dir else entry.filename
            if stat.S_ISDIR(entry.st_mode):
                dirs.add(child_rel)
                if not is_protected_remote(child_rel):
                    walk(child_rel)
            elif stat.S_ISREG(entry.st_mode):
                files[child_rel] = entry

    walk("")
    return dirs, files


def remove_remote_tree(sftp: paramiko.SFTPClient, remote_path: str) -> None:
    try:
        attrs = sftp.stat(remote_path)
    except OSError:
        return

    if stat.S_ISDIR(attrs.st_mode):
        for entry in sftp.listdir_attr(remote_path):
            remove_remote_tree(sftp, posixpath.join(remote_path, entry.filename))
        sftp.rmdir(remote_path)
        return

    sftp.remove(remote_path)


def desired_mode(local_path: Path) -> int:
    return 0o755 if local_path.suffix == ".sh" else 0o644


def sync_project(ssh: paramiko.SSHClient, config: DeployConfig) -> None:
    root = repo_root()
    local_dirs, local_files = build_local_tree(root)
    print(f"[sync] local files: {len(local_files)}, local dirs: {len(local_dirs)}")

    sftp = ssh.open_sftp()
    try:
        ensure_remote_dir(sftp, config.remote_app_dir)
        remote_dirs, remote_files = list_remote_tree(sftp, config.remote_app_dir)

        for rel_dir in sorted(local_dirs, key=lambda item: (item.count("/"), item)):
            ensure_remote_dir(sftp, remote_join(config.remote_app_dir, rel_dir))

        uploaded = 0
        skipped = 0
        total = len(local_files)
        for index, rel_file in enumerate(sorted(local_files), start=1):
            local_path = local_files[rel_file]
            remote_path = remote_join(config.remote_app_dir, rel_file)
            local_stat = local_path.stat()
            remote_attr = remote_files.get(rel_file)

            if remote_attr is not None:
                same_size = remote_attr.st_size == local_stat.st_size
                same_mtime = int(remote_attr.st_mtime) == int(local_stat.st_mtime)
                if same_size and same_mtime:
                    skipped += 1
                    continue

            if rel_file in remote_dirs:
                remove_remote_tree(sftp, remote_path)

            sftp.put(str(local_path), remote_path)
            try:
                sftp.chmod(remote_path, desired_mode(local_path))
                sftp.utime(
                    remote_path,
                    (int(local_stat.st_atime), int(local_stat.st_mtime)),
                )
            except OSError:
                pass
            uploaded += 1
            if uploaded == 1 or uploaded % 100 == 0 or index == total:
                print(
                    f"[sync] uploaded {uploaded}, skipped {skipped}, scanned {index}/{total}"
                )

        deleted_files = 0
        deleted_dirs = 0
        local_file_set = set(local_files)

        for rel_file in sorted(remote_files):
            if is_protected_remote(rel_file):
                continue
            if rel_file not in local_file_set:
                sftp.remove(remote_join(config.remote_app_dir, rel_file))
                deleted_files += 1

        for rel_dir in sorted(remote_dirs, key=lambda item: item.count("/"), reverse=True):
            if is_protected_remote(rel_dir):
                continue
            if rel_dir not in local_dirs:
                try:
                    sftp.rmdir(remote_join(config.remote_app_dir, rel_dir))
                    deleted_dirs += 1
                except OSError:
                    pass

        print(
            f"[sync] uploaded {uploaded}, skipped {skipped}, deleted files {deleted_files}, deleted dirs {deleted_dirs}"
        )
    finally:
        sftp.close()


def read_command(
    ssh: paramiko.SSHClient,
    command: str,
    timeout: int | None = None,
) -> tuple[int, str, str]:
    stdin, stdout, stderr = ssh.exec_command(command, timeout=timeout)
    del stdin
    out = stdout.read().decode("utf-8", errors="replace")
    err = stderr.read().decode("utf-8", errors="replace")
    code = stdout.channel.recv_exit_status()
    return code, out, err


def require_success(
    ssh: paramiko.SSHClient, command: str, timeout: int | None = None
) -> str:
    code, out, err = read_command(ssh, command, timeout=timeout)
    if code != 0:
        message = err.strip() or out.strip() or f"remote command failed: {command}"
        raise RuntimeError(message)
    return out


def start_remote_rebuild(ssh: paramiko.SSHClient, config: DeployConfig) -> None:
    status_file = f"{config.remote_deploy_dir}/.remote-deploy.status"
    log_file = f"{config.remote_deploy_dir}/.remote-deploy.log"
    pid_file = f"{config.remote_deploy_dir}/.remote-deploy.pid"
    runner = f"{config.remote_deploy_dir}/scripts/remote-compose-build.sh"

    command = (
        "set -e; "
        f"cd {shlex.quote(config.remote_deploy_dir)}; "
        f": > {shlex.quote(log_file)}; "
        f"echo 'STARTING $(date \"+%Y-%m-%d %H:%M:%S\")' > {shlex.quote(status_file)}; "
        f"nohup bash {shlex.quote(runner)} >/dev/null 2>&1 < /dev/null & "
        f"echo $! > {shlex.quote(pid_file)}"
    )
    require_success(ssh, command)


def tail_remote_log(ssh: paramiko.SSHClient, log_file: str, lines: int) -> str:
    _, out, err = read_command(
        ssh,
        f"tail -n {lines} {shlex.quote(log_file)} 2>/dev/null || true",
    )
    if err.strip():
        return err
    return out


def poll_remote_rebuild(ssh: paramiko.SSHClient, config: DeployConfig) -> None:
    status_file = f"{config.remote_deploy_dir}/.remote-deploy.status"
    log_file = f"{config.remote_deploy_dir}/.remote-deploy.log"
    start = time.time()

    while True:
        elapsed = int(time.time() - start)
        if elapsed > config.deploy_timeout_seconds:
            print(f"[ERROR] remote deploy timed out after {config.deploy_timeout_seconds}s")
            tail = tail_remote_log(ssh, log_file, 80).strip()
            if tail:
                print(tail)
            raise RuntimeError("remote deploy timed out")

        _, status_line, _ = read_command(
            ssh,
            f"cat {shlex.quote(status_file)} 2>/dev/null || true",
        )
        status_line = status_line.strip()

        if status_line.startswith("SUCCESS"):
            print("[OK] remote deploy finished successfully.")
            tail = tail_remote_log(ssh, log_file, 40).strip()
            if tail:
                print(tail)
            return
        if status_line.startswith("FAILED"):
            print("[ERROR] remote deploy failed.")
            tail = tail_remote_log(ssh, log_file, 80).strip()
            if tail:
                print(tail)
            raise RuntimeError(status_line)
        if status_line:
            print(f"[WAIT] {status_line} ({elapsed}s)")
        else:
            print(f"[WAIT] remote status unavailable yet ({elapsed}s)")

        time.sleep(config.deploy_poll_interval_seconds)


def restart_remote(ssh: paramiko.SSHClient, config: DeployConfig) -> None:
    command = (
        "set -e; "
        f"cd {shlex.quote(config.remote_deploy_dir)}; "
        "docker compose -f docker-compose.server.yml --env-file .env.server "
        "up -d --no-build; "
        "docker compose -f docker-compose.server.yml --env-file .env.server ps"
    )
    output = require_success(ssh, command)
    if output.strip():
        print(output.strip())


def open_ssh(config: DeployConfig) -> paramiko.SSHClient:
    ssh = paramiko.SSHClient()
    ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
    ssh.connect(
        hostname=config.host,
        username=config.user,
        password=config.password,
        timeout=10,
        banner_timeout=10,
        auth_timeout=10,
        look_for_keys=False,
        allow_agent=False,
    )
    transport = ssh.get_transport()
    if transport is not None:
        transport.set_keepalive(15)
    return ssh


def run_update(config: DeployConfig) -> None:
    attempt = 1
    while True:
        try:
            with open_ssh(config) as ssh:
                print("[0/3] Checking SSH connectivity...")
                require_success(ssh, "echo ok >/dev/null")
                print("[1/3] Uploading local code to server...")
                sync_project(ssh, config)
                print("[2/3] Starting remote rebuild...")
                start_remote_rebuild(ssh, config)
                print("[3/3] Polling remote rebuild status...")
                poll_remote_rebuild(ssh, config)
                print("Update code + deploy finished.")
                return
        except Exception as exc:  # pragma: no cover
            if attempt >= config.upload_retries:
                raise RuntimeError(
                    f"update deploy failed after {attempt} attempt(s): {exc}"
                ) from exc
            print(f"[WARN] update deploy attempt {attempt} failed: {exc}")
            print("[WARN] retrying in 3 seconds...")
            attempt += 1
            time.sleep(3)


def run_restart(config: DeployConfig) -> None:
    with open_ssh(config) as ssh:
        print("[1/1] Restarting existing containers without uploading code...")
        restart_remote(ssh, config)
        print("Restart-only deployment finished.")


def main() -> int:
    command, config = parse_args()
    try:
        if command == "update":
            run_update(config)
        else:
            run_restart(config)
        return 0
    except Exception as exc:
        print(f"[ERROR] {exc}", file=sys.stderr)
        return 1


if __name__ == "__main__":
    raise SystemExit(main())
