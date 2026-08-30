from __future__ import annotations

import argparse
import json
import os
import posixpath
import shlex
import stat
import subprocess
import sys
import time
from dataclasses import dataclass
from pathlib import Path
from urllib.parse import urlparse

import paramiko


PERSONAL_SITE_HOST = "111.228.35.186"
# Compatibility defaults intentionally contain no authentication material.  The
# active entry point validates credentials before it opens an SSH connection.
DEFAULT_HOST = PERSONAL_SITE_HOST
DEFAULT_USER = ""
DEFAULT_PASSWORD: str | None = None
DEFAULT_REMOTE_APP_DIR = "/opt/shizuki-site"
DEFAULT_UPLOAD_RETRIES = 4
DEFAULT_DEPLOY_TIMEOUT_SECONDS = 5400
DEFAULT_DEPLOY_POLL_INTERVAL_SECONDS = 10
DEFAULT_HEALTH_URL = "http://127.0.0.1:8080/actuator/health"
DEFAULT_SITE_URL = "http://127.0.0.1:5173/"
DEFAULT_HEALTH_ATTEMPTS = 24
DEFAULT_REMOTE_BACKUP_DIR = "/opt/shizuki-site-backups"
DEFAULT_BACKUP_HELPER_IMAGE = "busybox:1.36"

ROOT_LEVEL_EXCLUDES = {
    ".antigravity",
    ".git",
    ".github",
    ".idea",
    ".kiro",
    ".codex-tmp",
    ".vscode",
    "data",
    "tmp",
}
ANYWHERE_DIR_EXCLUDES = {
    "__pycache__",
    "_to_delete",
    "dist-temp",
    "node_modules",
    "target",
}
PREFIX_EXCLUDES = {
    ".mvn/repository",
    "deploy/.env.server",
    "deploy/.local-deploy.status",
    "deploy/logs",
    "fronted/vue3-merged/android",
    "fronted/vue3-merged/desktop-release",
    "fronted/vue3-merged/dist",
    "fronted/vue3-merged/prototypes",
    "fronted/vue3-merged/release",
    "fronted/vue3-merged/public/fonts/_unused_old_fonts",
    "fronted/vue3-merged/shizuki-release.keystore",
    "fronted/vue3-merged/scripts/qianji-local-sync.config.jsonc",
    "fronted/vue3-merged/scripts/qianji-local-sync.secret.bat",
    "tools/qianji-sync/qianji-local-sync.config.jsonc",
    "tools/qianji-sync/qianji-local-sync.secret.bat",
    "resouces/yaml/common-config.yaml",
    "resouces/yaml/middleware-config.yaml",
}
PROTECTED_REMOTE_PREFIXES = {
    "data",
    "deploy/.env.server",
    "deploy/.local-deploy.status",
    "deploy/logs",
    "fronted/vue3-merged/desktop-release",
    "fronted/vue3-merged/prototypes",
    "fronted/vue3-merged/release",
    "resouces/yaml/common-config.yaml",
    "resouces/yaml/middleware-config.yaml",
}


def log(message: str) -> None:
    print(message, flush=True)


@dataclass(frozen=True)
class DeployConfig:
    host: str
    user: str
    password: str | None
    remote_app_dir: str
    remote_deploy_dir: str
    upload_retries: int
    deploy_timeout_seconds: int
    deploy_poll_interval_seconds: int
    ssh_key_path: str | None = None
    ssh_key_passphrase: str | None = None
    known_hosts_path: str | None = None
    port: int = 22
    health_url: str = DEFAULT_HEALTH_URL
    site_url: str = DEFAULT_SITE_URL
    health_attempts: int = DEFAULT_HEALTH_ATTEMPTS
    remote_backup_dir: str = DEFAULT_REMOTE_BACKUP_DIR
    database_backup_command: str | None = None
    database_restore_command: str | None = None


@dataclass(frozen=True)
class RemoteBackup:
    """A verified pre-deployment restore point kept outside the synced app tree."""

    snapshot_dir: str
    app_archive: str
    database_archive: str
    volume_list: str
    snapshot_id: str


def parse_args() -> tuple[str, DeployConfig, Path | None]:
    parser = argparse.ArgumentParser(
        description="Windows-native deploy helper for shizuki-site."
    )
    parser.add_argument("command", choices=("update", "restart"))
    parser.add_argument("--host", default=os.getenv("REMOTE_HOST", DEFAULT_HOST))
    parser.add_argument("--user", default=os.getenv("REMOTE_USER", DEFAULT_USER))
    parser.add_argument("--password", default=os.getenv("REMOTE_PASS"), help=argparse.SUPPRESS)
    parser.add_argument(
        "--ssh-key",
        default=os.getenv("REMOTE_SSH_KEY_PATH"),
        help="Path to an existing private SSH key (recommended; also accepted from REMOTE_SSH_KEY_PATH).",
    )
    parser.add_argument(
        "--ssh-key-passphrase",
        default=os.getenv("REMOTE_SSH_KEY_PASSPHRASE"),
        help=argparse.SUPPRESS,
    )
    parser.add_argument(
        "--known-hosts",
        default=os.getenv("REMOTE_KNOWN_HOSTS"),
        help="Path to an existing known_hosts file (also accepted from REMOTE_KNOWN_HOSTS).",
    )
    parser.add_argument("--port", type=int, default=int(os.getenv("REMOTE_PORT", "22")))
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
        "--health-url",
        default=os.getenv("DEPLOY_HEALTH_URL", DEFAULT_HEALTH_URL),
        help="Loopback API health URL checked on the personal-site server after restart.",
    )
    parser.add_argument(
        "--site-url",
        default=os.getenv("DEPLOY_SITE_URL", DEFAULT_SITE_URL),
        help="Loopback site entry URL checked after restart (defaults to the site container port).",
    )
    parser.add_argument(
        "--health-attempts",
        type=int,
        default=int(os.getenv("DEPLOY_HEALTH_ATTEMPTS", str(DEFAULT_HEALTH_ATTEMPTS))),
    )
    parser.add_argument(
        "--remote-backup-dir",
        default=os.getenv("DEPLOY_REMOTE_BACKUP_DIR", DEFAULT_REMOTE_BACKUP_DIR),
        help="Remote directory outside the synchronized app tree used for restore points.",
    )
    parser.add_argument(
        "--database-backup-command",
        default=os.getenv("DEPLOY_DATABASE_BACKUP_COMMAND"),
        help=argparse.SUPPRESS,
    )
    parser.add_argument(
        "--database-restore-command",
        default=os.getenv("DEPLOY_DATABASE_RESTORE_COMMAND"),
        help=argparse.SUPPRESS,
    )
    parser.add_argument(
        "--dry-run-manifest",
        type=Path,
        metavar="PATH",
        help="Write the excluded deployment payload manifest and exit without connecting to the server.",
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
        ssh_key_path=args.ssh_key,
        ssh_key_passphrase=args.ssh_key_passphrase,
        known_hosts_path=args.known_hosts,
        port=max(args.port, 1),
        health_url=args.health_url,
        site_url=args.site_url,
        health_attempts=max(args.health_attempts, 1),
        remote_backup_dir=args.remote_backup_dir.rstrip("/"),
        database_backup_command=args.database_backup_command,
        database_restore_command=args.database_restore_command,
    )
    return args.command, config, args.dry_run_manifest


def repo_root() -> Path:
    return Path(__file__).resolve().parent.parent


def run_git(*args: str) -> str:
    completed = subprocess.run(
        ["git", *args],
        cwd=repo_root(),
        check=False,
        capture_output=True,
        text=True,
        encoding="utf-8",
        errors="replace",
    )
    if completed.returncode != 0:
        raise RuntimeError(f"Git preflight failed while running git {' '.join(args[:2])}.")
    return completed.stdout.strip()


def require_clean_master() -> str:
    branch = run_git("branch", "--show-current")
    if branch != "master":
        raise RuntimeError("Deployment requires a clean local master branch.")
    if run_git("status", "--porcelain=v1"):
        raise RuntimeError("Deployment requires a clean worktree.")

    head = run_git("rev-parse", "HEAD")
    origin_master = run_git("rev-parse", "origin/master")
    if head != origin_master:
        raise RuntimeError(
            "Deployment requires local master to exactly match the fetched origin/master."
        )
    return head


def validate_loopback_url(url: str, variable_name: str) -> None:
    parsed = urlparse(url)
    if (
        parsed.scheme not in {"http", "https"}
        or parsed.hostname not in {"127.0.0.1", "localhost", "::1"}
        or parsed.username
        or parsed.password
    ):
        raise RuntimeError(
            f"{variable_name} must be an unauthenticated localhost HTTP(S) endpoint."
        )


def validate_backup_path(config: DeployConfig) -> None:
    backup_dir = config.remote_backup_dir
    app_dir = config.remote_app_dir
    if (
        not backup_dir.startswith("/")
        or backup_dir == "/"
        or "/../" in f"{backup_dir}/"
        or backup_dir == app_dir
        or backup_dir.startswith(f"{app_dir}/")
    ):
        raise RuntimeError(
            "DEPLOY_REMOTE_BACKUP_DIR must be an absolute path outside REMOTE_APP_DIR."
        )


def validate_remote_app_paths(config: DeployConfig) -> None:
    expected_deploy_dir = posixpath.join(DEFAULT_REMOTE_APP_DIR, "deploy")
    if config.remote_app_dir != DEFAULT_REMOTE_APP_DIR or config.remote_deploy_dir != expected_deploy_dir:
        raise RuntimeError(
            "Deployment paths are locked to /opt/shizuki-site and its deploy directory."
        )


def require_backup_configuration(config: DeployConfig) -> None:
    if not config.database_backup_command or not config.database_restore_command:
        raise RuntimeError(
            "Set both DEPLOY_DATABASE_BACKUP_COMMAND and DEPLOY_DATABASE_RESTORE_COMMAND "
            "in a private secret source before deployment."
        )


def require_private_ssh_source(config: DeployConfig) -> None:
    if config.host != PERSONAL_SITE_HOST:
        raise RuntimeError(
            f"Deployment is limited to the personal-site server ({PERSONAL_SITE_HOST})."
        )
    if not config.user:
        raise RuntimeError("REMOTE_USER is required; no deployment account is stored in this repository.")

    has_password = bool(config.password)
    has_key = bool(config.ssh_key_path)
    if has_password == has_key:
        raise RuntimeError(
            "Provide exactly one private SSH source: REMOTE_SSH_KEY_PATH (recommended) or REMOTE_PASS."
        )
    if has_key and not Path(config.ssh_key_path or "").is_file():
        raise RuntimeError("REMOTE_SSH_KEY_PATH must reference an existing private key file.")
    if not config.known_hosts_path or not Path(config.known_hosts_path).is_file():
        raise RuntimeError(
            "REMOTE_KNOWN_HOSTS must reference an existing known_hosts file; unknown host keys are rejected."
        )
    validate_loopback_url(config.health_url, "DEPLOY_HEALTH_URL")
    validate_loopback_url(config.site_url, "DEPLOY_SITE_URL")
    validate_remote_app_paths(config)
    validate_backup_path(config)


def require_deploy_preflight(config: DeployConfig, require_backup: bool = True) -> str:
    commit = require_clean_master()
    require_private_ssh_source(config)
    if require_backup:
        require_backup_configuration(config)
    return commit


def write_dry_run_manifest(output_path: Path) -> None:
    root = repo_root()
    if not output_path.parent.is_dir():
        raise RuntimeError("The dry-run manifest parent directory must already exist.")
    local_dirs, local_files = build_local_tree(root)
    manifest = {
        "schemaVersion": 1,
        "commit": require_clean_master(),
        "generatedAt": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
        "directories": sorted(local_dirs),
        "files": [
            {"path": relative_path, "bytes": local_files[relative_path].stat().st_size}
            for relative_path in sorted(local_files)
        ],
        "excluded": {
            "root": sorted(ROOT_LEVEL_EXCLUDES),
            "prefix": sorted(PREFIX_EXCLUDES),
        },
    }
    output_path.write_text(
        json.dumps(manifest, ensure_ascii=False, indent=2) + "\n", encoding="utf-8"
    )
    log(f"[OK] Wrote dry-run payload manifest: {output_path}")


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
    scanned_dirs = 0
    scanned_files = 0

    def walk(rel_dir: str) -> None:
        nonlocal scanned_dirs, scanned_files
        remote_dir = remote_join(remote_base, rel_dir)
        try:
            entries = sftp.listdir_attr(remote_dir)
        except OSError:
            return

        for entry in entries:
            child_rel = f"{rel_dir}/{entry.filename}" if rel_dir else entry.filename
            if stat.S_ISDIR(entry.st_mode):
                dirs.add(child_rel)
                scanned_dirs += 1
                if scanned_dirs == 1 or scanned_dirs % 100 == 0:
                    log(
                        f"[sync] remote index dirs {scanned_dirs}, files {scanned_files}"
                    )
                # Excluded build/dependency/scratch trees are intentionally preserved
                # on the server and must not make remote indexing scan thousands of
                # irrelevant files on every deployment.
                if not is_protected_remote(child_rel) and not is_excluded(child_rel):
                    walk(child_rel)
            elif stat.S_ISREG(entry.st_mode):
                files[child_rel] = entry
                scanned_files += 1
                if scanned_files == 1 or scanned_files % 200 == 0:
                    log(
                        f"[sync] remote index dirs {scanned_dirs}, files {scanned_files}"
                    )

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
    log(f"[sync] local files: {len(local_files)}, local dirs: {len(local_dirs)}")

    sftp = ssh.open_sftp()
    try:
        ensure_remote_dir(sftp, config.remote_app_dir)
        log("[sync] indexing remote files...")
        remote_dirs, remote_files = list_remote_tree(sftp, config.remote_app_dir)
        log(
            f"[sync] remote files: {len(remote_files)}, remote dirs: {len(remote_dirs)}"
        )

        for rel_dir in sorted(local_dirs, key=lambda item: (item.count("/"), item)):
            ensure_remote_dir(sftp, remote_join(config.remote_app_dir, rel_dir))

        uploaded = 0
        missing_local = 0
        skipped = 0
        total = len(local_files)
        for index, rel_file in enumerate(sorted(local_files), start=1):
            local_path = local_files[rel_file]
            remote_path = remote_join(config.remote_app_dir, rel_file)
            try:
                local_stat = local_path.stat()
            except FileNotFoundError:
                missing_local += 1
                continue
            remote_attr = remote_files.get(rel_file)

            if remote_attr is not None:
                same_size = remote_attr.st_size == local_stat.st_size
                same_mtime = int(remote_attr.st_mtime) == int(local_stat.st_mtime)
                if same_size and same_mtime:
                    skipped += 1
                    continue

            if rel_file in remote_dirs:
                remove_remote_tree(sftp, remote_path)

            try:
                sftp.put(str(local_path), remote_path)
            except FileNotFoundError:
                missing_local += 1
                continue
            try:
                sftp.chmod(remote_path, desired_mode(local_path))
                sftp.utime(
                    remote_path,
                    (int(local_stat.st_atime), int(local_stat.st_mtime)),
                )
            except OSError:
                pass
            uploaded += 1
            if uploaded == 1 or uploaded % 100 == 0:
                log(
                    f"[sync] uploaded {uploaded}, skipped {skipped}, missing {missing_local}, scanned {index}/{total}"
                )
            if index == 1 or index % 100 == 0 or index == total:
                log(
                    f"[sync] progress scanned {index}/{total}, uploaded {uploaded}, skipped {skipped}, missing {missing_local}"
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

        log(
            f"[sync] uploaded {uploaded}, skipped {skipped}, missing {missing_local}, deleted files {deleted_files}, deleted dirs {deleted_dirs}"
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
            log(f"[ERROR] remote deploy timed out after {config.deploy_timeout_seconds}s")
            tail = tail_remote_log(ssh, log_file, 80).strip()
            if tail:
                log(tail)
            raise RuntimeError("remote deploy timed out")

        _, status_line, _ = read_command(
            ssh,
            f"cat {shlex.quote(status_file)} 2>/dev/null || true",
        )
        status_line = status_line.strip()

        if status_line.startswith("SUCCESS"):
            log("[OK] remote deploy finished successfully.")
            tail = tail_remote_log(ssh, log_file, 40).strip()
            if tail:
                log(tail)
            return
        if status_line.startswith("FAILED"):
            log("[ERROR] remote deploy failed.")
            tail = tail_remote_log(ssh, log_file, 80).strip()
            if tail:
                log(tail)
            raise RuntimeError(status_line)
        if status_line:
            log(f"[WAIT] {status_line} ({elapsed}s)")
        else:
            log(f"[WAIT] remote status unavailable yet ({elapsed}s)")

        time.sleep(config.deploy_poll_interval_seconds)


def verify_remote_health(ssh: paramiko.SSHClient, config: DeployConfig) -> None:
    health_url = shlex.quote(config.health_url)
    command = (
        "set -e; "
        f"for attempt in $(seq 1 {config.health_attempts}); do "
        f"if curl -fsS --max-time 10 {health_url} 2>/dev/null "
        "| grep -Eq '\"status\"[[:space:]]*:[[:space:]]*\"UP\"'; then exit 0; fi; "
        "sleep 5; "
        "done; exit 1"
    )
    code, _, _ = read_command(ssh, command, timeout=config.health_attempts * 6 + 15)
    if code != 0:
        raise RuntimeError("Remote health gate did not report status UP after deployment.")
    log("[OK] Remote health gate reported status UP.")


def verify_remote_site_entry(ssh: paramiko.SSHClient, config: DeployConfig) -> None:
    site_url = shlex.quote(config.site_url)
    command = (
        "set -e; "
        f"for attempt in $(seq 1 {config.health_attempts}); do "
        f"if curl -fsS --max-time 10 {site_url} -o /dev/null 2>/dev/null; then exit 0; fi; "
        "sleep 5; "
        "done; exit 1"
    )
    code, _, _ = read_command(ssh, command, timeout=config.health_attempts * 6 + 15)
    if code != 0:
        raise RuntimeError("Remote site entry gate did not return a successful response after deployment.")
    log("[OK] Remote site entry gate returned a successful response.")


def verify_remote_post_deploy(ssh: paramiko.SSHClient, config: DeployConfig) -> None:
    verify_remote_health(ssh, config)
    verify_remote_site_entry(ssh, config)


def record_remote_deployed_commit(
    ssh: paramiko.SSHClient, config: DeployConfig, commit: str
) -> None:
    commit_file = f"{config.remote_deploy_dir}/.deployed-commit"
    temporary_file = f"{commit_file}.tmp"
    command = (
        "set -e; "
        f"printf '%s\\n' {shlex.quote(commit)} > {shlex.quote(temporary_file)}; "
        f"mv {shlex.quote(temporary_file)} {shlex.quote(commit_file)}"
    )
    require_success_silently(ssh, command, "Deployed commit recording")


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
        log(output.strip())


def open_ssh(config: DeployConfig) -> paramiko.SSHClient:
    ssh = paramiko.SSHClient()
    ssh.load_host_keys(config.known_hosts_path or "")
    ssh.set_missing_host_key_policy(paramiko.RejectPolicy())
    connect_kwargs: dict[str, object] = {
        "hostname": config.host,
        "port": config.port,
        "username": config.user,
        "timeout": 10,
        "banner_timeout": 10,
        "auth_timeout": 10,
        "look_for_keys": False,
        "allow_agent": False,
    }
    if config.ssh_key_path:
        connect_kwargs["key_filename"] = config.ssh_key_path
        if config.ssh_key_passphrase:
            connect_kwargs["passphrase"] = config.ssh_key_passphrase
    else:
        connect_kwargs["password"] = config.password
    ssh.connect(**connect_kwargs)
    transport = ssh.get_transport()
    if transport is not None:
        transport.set_keepalive(15)
    return ssh


def make_snapshot_id(commit: str) -> str:
    short_commit = commit[:12]
    if len(short_commit) < 7 or any(char not in "0123456789abcdef" for char in short_commit.lower()):
        raise RuntimeError("Deployment commit is not a valid Git object id.")
    return f"snapshot-{time.strftime('%Y%m%d-%H%M%S')}-{short_commit}"


def require_success_silently(
    ssh: paramiko.SSHClient,
    command: str,
    operation: str,
    timeout: int | None = None,
) -> None:
    """Run a secret-adjacent command without echoing its stderr back to the console."""
    code, _, _ = read_command(ssh, command, timeout=timeout)
    if code != 0:
        raise RuntimeError(f"{operation} failed.")


def run_database_hook(
    ssh: paramiko.SSHClient,
    command: str,
    archive_path: str,
    operation: str,
    require_archive: bool,
) -> None:
    # The command is intentionally supplied only from a private environment.
    # Do not log it or its output: a database URI/password may be part of it.
    archive = shlex.quote(archive_path)
    archive_check = f"test -s {archive}; " if require_archive else ""
    remote_command = (
        "set -eu; "
        f"DEPLOY_DATABASE_BACKUP_PATH={archive}; export DEPLOY_DATABASE_BACKUP_PATH; "
        f"sh -c {shlex.quote(command)} >/dev/null 2>&1; "
        f"{archive_check}true"
    )
    require_success_silently(ssh, remote_command, operation, timeout=1800)


def create_remote_backup(
    ssh: paramiko.SSHClient, config: DeployConfig, commit: str
) -> RemoteBackup:
    snapshot_id = make_snapshot_id(commit)
    snapshot_dir = posixpath.join(config.remote_backup_dir, snapshot_id)
    app_archive = posixpath.join(snapshot_dir, "app.tar.gz")
    database_archive = posixpath.join(snapshot_dir, "database.dump")
    volume_list = posixpath.join(snapshot_dir, "volumes.list")
    app_parent = posixpath.dirname(config.remote_app_dir)
    app_basename = posixpath.basename(config.remote_app_dir)
    snapshot = shlex.quote(snapshot_dir)

    log("[1/6] Creating a private pre-deployment restore point...")
    prepare_command = (
        "set -eu; umask 077; "
        f"test -d {shlex.quote(config.remote_app_dir)}; "
        f"test ! -e {snapshot}; "
        f"mkdir -p {snapshot}/volumes; "
        f"printf '%s\\n' {shlex.quote(commit)} > {snapshot}/deployed-commit.txt; "
        f"tar -C {shlex.quote(app_parent)} -czf {shlex.quote(app_archive)} "
        f"{shlex.quote(app_basename)}; "
        f"test -s {shlex.quote(app_archive)}"
    )
    require_success_silently(
        ssh, prepare_command, "Application/configuration backup", timeout=1800
    )

    configured_volume_list = posixpath.join(snapshot_dir, "configured-volumes.list")
    volume_command = (
        "set -eu; "
        f"snapshot={snapshot}; "
        f"cd {shlex.quote(config.remote_deploy_dir)}; "
        "docker compose -f docker-compose.server.yml --env-file .env.server "
        f"config --volumes > {shlex.quote(configured_volume_list)}; "
        f": > {shlex.quote(volume_list)}; "
        "while IFS= read -r configured_volume; do "
        "[ -n \"$configured_volume\" ] || continue; "
        "case \"$configured_volume\" in *[!A-Za-z0-9_.-]* ) exit 1 ;; esac; "
        "volume=\"$configured_volume\"; "
        "if ! docker volume inspect \"$volume\" >/dev/null 2>&1; then "
        "matches=$(docker volume ls -q --filter \"label=com.docker.compose.volume=$configured_volume\"); "
        "[ $(printf '%s\\n' \"$matches\" | sed '/^$/d' | wc -l) -eq 1 ]; "
        "volume=$(printf '%s\\n' \"$matches\" | sed -n '1p'); "
        "fi; "
        "docker volume inspect \"$volume\" >/dev/null 2>&1; "
        "printf '%s\\n' \"$volume\" >> "
        f"{shlex.quote(volume_list)}; "
        "if [ -n \"$volume\" ]; then "
        "docker run --rm --pull=never "
        "-v \"$volume\":/source:ro -v \"$snapshot\":/backup "
        f"{shlex.quote(DEFAULT_BACKUP_HELPER_IMAGE)} "
        "sh -c 'tar -C /source -czf \"/backup/volumes/$1.tar.gz\" .' sh \"$volume\"; "
        "fi; "
        f"done < {shlex.quote(configured_volume_list)}; "
        f"rm -f {shlex.quote(configured_volume_list)}"
    )
    require_success_silently(
        ssh, volume_command, "Docker volume backup", timeout=1800
    )

    run_database_hook(
        ssh,
        config.database_backup_command or "",
        database_archive,
        "Database backup",
        require_archive=True,
    )
    require_success_silently(
        ssh,
        f"set -eu; touch {shlex.quote(posixpath.join(snapshot_dir, 'READY'))}",
        "Backup finalization",
    )
    log(f"[OK] Restore point created: {snapshot_id}")
    return RemoteBackup(
        snapshot_dir=snapshot_dir,
        app_archive=app_archive,
        database_archive=database_archive,
        volume_list=volume_list,
        snapshot_id=snapshot_id,
    )


def restore_remote_backup(
    ssh: paramiko.SSHClient, config: DeployConfig, backup: RemoteBackup
) -> None:
    app_parent = posixpath.dirname(config.remote_app_dir)
    app_basename = posixpath.basename(config.remote_app_dir)
    staging_parent = f"{config.remote_app_dir}.rollback-{backup.snapshot_id}"
    failed_app_dir = f"{config.remote_app_dir}.failed-{backup.snapshot_id}"
    snapshot = shlex.quote(backup.snapshot_dir)

    log("[ROLLBACK] Stopping current services and restoring the pre-deployment snapshot...")
    restore_app_command = (
        "set -eu; "
        f"test -f {shlex.quote(posixpath.join(backup.snapshot_dir, 'READY'))}; "
        f"test -s {shlex.quote(backup.app_archive)}; "
        f"cd {shlex.quote(config.remote_deploy_dir)}; "
        "docker compose -f docker-compose.server.yml --env-file .env.server down || true; "
        f"rm -rf {shlex.quote(staging_parent)} {shlex.quote(failed_app_dir)}; "
        f"mkdir -p {shlex.quote(staging_parent)}; "
        f"tar -xzf {shlex.quote(backup.app_archive)} -C {shlex.quote(staging_parent)}; "
        f"test -d {shlex.quote(posixpath.join(staging_parent, app_basename))}; "
        f"mv {shlex.quote(config.remote_app_dir)} {shlex.quote(failed_app_dir)}; "
        f"mv {shlex.quote(posixpath.join(staging_parent, app_basename))} {shlex.quote(config.remote_app_dir)}; "
        f"rmdir {shlex.quote(staging_parent)}"
    )
    require_success_silently(
        ssh, restore_app_command, "Application/configuration rollback", timeout=1800
    )

    run_database_hook(
        ssh,
        config.database_restore_command or "",
        backup.database_archive,
        "Database rollback",
        require_archive=False,
    )

    volume_restore_command = (
        "set -eu; "
        f"snapshot={snapshot}; "
        f"while IFS= read -r volume; do "
        "[ -n \"$volume\" ] || continue; "
        "case \"$volume\" in *[!A-Za-z0-9_.-]* ) exit 1 ;; esac; "
        "archive=\"$snapshot/volumes/$volume.tar.gz\"; "
        "if [ -f \"$archive\" ]; then "
        "docker volume inspect \"$volume\" >/dev/null 2>&1; "
        "docker run --rm --pull=never "
        "-v \"$volume\":/target -v \"$snapshot\":/backup "
        f"{shlex.quote(DEFAULT_BACKUP_HELPER_IMAGE)} "
        "sh -c 'find /target -mindepth 1 -maxdepth 1 -exec rm -rf {} +; "
        "tar -C /target -xzf \"/backup/volumes/$1.tar.gz\"' sh \"$volume\"; "
        "fi; "
        f"done < {shlex.quote(backup.volume_list)}"
    )
    require_success_silently(
        ssh, volume_restore_command, "Docker volume rollback", timeout=1800
    )

    rebuild_command = (
        "set -eu; "
        f"cd {shlex.quote(config.remote_deploy_dir)}; "
        "docker compose -f docker-compose.server.yml --env-file .env.server build; "
        "docker compose -f docker-compose.server.yml --env-file .env.server "
        "up -d --no-build --force-recreate; "
        "docker compose -f docker-compose.server.yml --env-file .env.server ps"
    )
    require_success_silently(
        ssh, rebuild_command, "Rollback service rebuild", timeout=config.deploy_timeout_seconds
    )
    log("[ROLLBACK] Pre-deployment snapshot restored.")


def discard_failed_app_tree(
    ssh: paramiko.SSHClient, config: DeployConfig, backup: RemoteBackup
) -> None:
    failed_app_dir = f"{config.remote_app_dir}.failed-{backup.snapshot_id}"
    read_command(ssh, f"rm -rf {shlex.quote(failed_app_dir)}")


def run_update(config: DeployConfig, commit: str) -> None:
    backup: RemoteBackup | None = None
    try:
        with open_ssh(config) as ssh:
            log("[0/6] Checking SSH connectivity...")
            require_success(ssh, "echo ok >/dev/null")
            backup = create_remote_backup(ssh, config, commit)
            log("[2/6] Uploading approved local payload to server...")
            sync_project(ssh, config)
            log("[3/6] Starting remote rebuild...")
            start_remote_rebuild(ssh, config)
            log("[4/6] Polling remote rebuild status...")
            poll_remote_rebuild(ssh, config)
            log("[5/6] Checking API health and site entry...")
            verify_remote_post_deploy(ssh, config)
            record_remote_deployed_commit(ssh, config, commit)
            log("[6/6] Deployment gates passed; retaining restore point for recovery.")
            log("Update code + deploy finished.")
            return
    except Exception as deploy_error:
        if backup is None:
            raise RuntimeError(
                f"update deploy stopped before a complete restore point was available: {deploy_error}"
            ) from deploy_error
        log("[ROLLBACK] Deployment gate failed; starting automatic rollback.")
        try:
            with open_ssh(config) as ssh:
                restore_remote_backup(ssh, config, backup)
                log("[ROLLBACK] Verifying restored API health and site entry...")
                verify_remote_post_deploy(ssh, config)
                discard_failed_app_tree(ssh, config, backup)
        except Exception as rollback_error:
            raise RuntimeError(
                "update deployment failed and the automatic rollback also failed; "
                "leave the server unchanged and restore the recorded remote snapshot manually."
            ) from rollback_error
        raise RuntimeError(
            "update deployment failed; the pre-deployment snapshot was restored and verified."
        ) from deploy_error


def run_restart(config: DeployConfig) -> None:
    with open_ssh(config) as ssh:
        log("[1/2] Restarting existing containers without uploading code...")
        restart_remote(ssh, config)
        log("[2/2] Checking API health and site entry...")
        verify_remote_post_deploy(ssh, config)
        log("Restart-only deployment finished.")


def main() -> int:
    command, config, dry_run_manifest = parse_args()
    try:
        if dry_run_manifest is not None:
            if command != "update":
                raise RuntimeError("--dry-run-manifest is only available for update deployments.")
            write_dry_run_manifest(dry_run_manifest)
            return 0
        commit = require_deploy_preflight(config, require_backup=command == "update")
        log(f"[OK] Clean master preflight passed for commit {commit}.")
        if command == "update":
            run_update(config, commit)
        else:
            run_restart(config)
        return 0
    except Exception as exc:
        print(f"[ERROR] {exc}", file=sys.stderr, flush=True)
        return 1


if __name__ == "__main__":
    raise SystemExit(main())
