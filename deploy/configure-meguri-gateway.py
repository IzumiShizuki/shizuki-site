"""One-shot Meguri gateway configurator for shizuki-site.

Does three things against the production server (reusing server_deploy.py's
connection config and credential handling):
  1) Patches /opt/shizuki-site/deploy/.env.server with the MEGURI_* settings
     (token is read locally from the desktop pet's shared token file and is
     NEVER printed or logged).
  2) Uploads the Meguri sprite pack (one tar.gz stream) into
     /opt/shizuki-site/data/meguri-assets/sprites/meguri/ (only missing or
     size-changed files).
  3) Recreates only the backend container so the new env takes effect, then
     waits for /actuator/health to report UP.

Local inputs (override via env vars):
  MEGURI_TOKEN_FILE   default D:\\environment\\secrets\\meguri\\desktop-core-token.txt
  MEGURI_SPRITES_DIR  default D:\\program\\meguri-pet\\data\\meguri\\assets\\sprites\\meguri
  MEGURI_CORE_URL     default keeps existing value, else https://bot.shizuki.online/meguri-core

Usage:  python configure-meguri-gateway.py
"""

from __future__ import annotations

import os
import posixpath
import shlex
import sys
import tarfile
import tempfile
import time
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent))
import server_deploy as base  # noqa: E402

DEPLOY_DIR = Path(__file__).resolve().parent
LOGS_DIR = DEPLOY_DIR / "logs"

DEFAULT_TOKEN_FILE = r"D:\environment\secrets\meguri\desktop-core-token.txt"
DEFAULT_SPRITES_DIR = r"D:\program\meguri-pet\data\meguri\assets\sprites\meguri"
DEFAULT_CORE_URL = "https://bot.shizuki.online/meguri-core"

REMOTE_APP = os.getenv("REMOTE_APP_DIR", base.DEFAULT_REMOTE_APP_DIR).rstrip("/")
REMOTE_ENV = f"{REMOTE_APP}/deploy/.env.server"
REMOTE_SPRITES = f"{REMOTE_APP}/data/meguri-assets/sprites/meguri"

_log_fh = None


def tee(message: str) -> None:
    line = f"[{time.strftime('%H:%M:%S')}] {message}"
    print(line, flush=True)
    if _log_fh is not None:
        _log_fh.write(line + "\n")
        _log_fh.flush()


def read_token() -> str:
    token_file = os.getenv("MEGURI_TOKEN_FILE", DEFAULT_TOKEN_FILE)
    env_token = os.getenv("MEGURI_CORE_TOKEN", "").strip()
    if env_token:
        tee("token: taken from MEGURI_CORE_TOKEN env var")
        return env_token
    path = Path(token_file)
    if not path.is_file():
        raise RuntimeError(
            f"token file not found: {token_file} "
            "(set MEGURI_TOKEN_FILE or MEGURI_CORE_TOKEN)"
        )
    token = path.read_text(encoding="utf-8").strip()
    if not token:
        raise RuntimeError(f"token file is empty: {token_file}")
    tee(f"token: loaded from {token_file} (length {len(token)}, value not logged)")
    return token


def upsert_env(text: str, updates: dict[str, str], keep_existing: set[str]) -> str:
    lines = text.splitlines()
    seen: set[str] = set()
    out: list[str] = []
    for line in lines:
        stripped = line.strip()
        replaced = False
        for key, value in updates.items():
            if stripped.startswith(f"{key}="):
                seen.add(key)
                if key in keep_existing and stripped[len(key) + 1 :].strip():
                    out.append(line)  # keep the operator's existing value
                else:
                    out.append(f"{key}={value}")
                replaced = True
                break
        if not replaced:
            out.append(line)
    missing = [key for key in updates if key not in seen]
    if missing:
        out.append("")
        out.append("# --- Meguri website gateway (added by configure-meguri-gateway) ---")
        for key in missing:
            out.append(f"{key}={updates[key]}")
    return "\n".join(out) + "\n"


def patch_remote_env(ssh, token: str) -> None:
    sftp = ssh.open_sftp()
    try:
        with sftp.open(REMOTE_ENV, "r") as handle:
            current = handle.read().decode("utf-8")
    except OSError as exc:
        sftp.close()
        raise RuntimeError(f"cannot read {REMOTE_ENV}: {exc}") from exc

    stamp = time.strftime("%Y%m%d-%H%M%S")
    base.require_success(ssh, f"cp {shlex.quote(REMOTE_ENV)} {shlex.quote(REMOTE_ENV)}.bak-{stamp}")
    tee(f"env: backup created .env.server.bak-{stamp}")

    updates = {
        "MEGURI_GATEWAY_ENABLED": "true",
        "MEGURI_CORE_BASE_URL": os.getenv("MEGURI_CORE_URL", DEFAULT_CORE_URL),
        "MEGURI_CORE_TOKEN": token,
        "MEGURI_TENANT_ID": "meguri-staging",
        "MEGURI_OWNER_USER_ID": "local-airi-user",
        "MEGURI_SPRITE_HOST_DIR": f"{REMOTE_APP}/data/meguri-assets/sprites",
        "MEGURI_DEFAULT_SPRITE": "ce04001l.png",
    }
    # For these keys an existing non-empty value wins (operator may have tuned them);
    # ENABLED and TOKEN are always enforced. CORE_BASE_URL: env override wins, else existing.
    keep_existing = {"MEGURI_TENANT_ID", "MEGURI_OWNER_USER_ID", "MEGURI_SPRITE_HOST_DIR", "MEGURI_DEFAULT_SPRITE"}
    if not os.getenv("MEGURI_CORE_URL"):
        keep_existing.add("MEGURI_CORE_BASE_URL")

    patched = upsert_env(current, updates, keep_existing)
    with sftp.open(REMOTE_ENV, "w") as handle:
        handle.write(patched.encode("utf-8"))
    sftp.close()
    tee("env: MEGURI_* keys written (gateway enabled)")


def sync_sprites(ssh) -> None:
    sprites_dir = Path(os.getenv("MEGURI_SPRITES_DIR", DEFAULT_SPRITES_DIR))
    if not sprites_dir.is_dir():
        tee(f"sprites: local dir missing ({sprites_dir}) - SKIPPED; page falls back to no-sprite mode")
        return
    local_files = {p.name: p.stat().st_size for p in sprites_dir.iterdir() if p.is_file()}
    if not local_files:
        tee("sprites: local dir empty - skipped")
        return

    base.require_success(ssh, f"mkdir -p {shlex.quote(REMOTE_SPRITES)}")
    _, out, _ = base.read_command(
        ssh, f"cd {shlex.quote(REMOTE_SPRITES)} && find . -maxdepth 1 -type f -printf '%f\\t%s\\n' 2>/dev/null || true"
    )
    remote_files: dict[str, int] = {}
    for raw in out.splitlines():
        parts = raw.split("\t")
        if len(parts) == 2 and parts[1].isdigit():
            remote_files[parts[0]] = int(parts[1])

    todo = [name for name, size in local_files.items() if remote_files.get(name) != size]
    tee(f"sprites: local {len(local_files)}, remote {len(remote_files)}, to upload {len(todo)}")
    if not todo:
        tee("sprites: already in sync")
        return

    fd, tmp_path = tempfile.mkstemp(prefix="meguri-sprites-", suffix=".tar.gz")
    os.close(fd)
    try:
        with tarfile.open(tmp_path, "w:gz", compresslevel=1) as tar:
            for name in todo:
                tar.add(str(sprites_dir / name), arcname=name, recursive=False)
        size_mb = os.path.getsize(tmp_path) / 1048576
        tee(f"sprites: archive ready ({size_mb:.1f} MB), uploading...")
        remote_tmp = f"{REMOTE_SPRITES}/.upload-{os.getpid()}.tar.gz"
        sftp = ssh.open_sftp()
        try:
            last = [-10]

            def cb(done, total):
                pct = int(done * 100 / total) if total else 100
                if pct >= last[0] + 20:
                    last[0] = pct
                    tee(f"sprites: upload {pct}%")

            sftp.put(tmp_path, remote_tmp, callback=cb)
        finally:
            sftp.close()
        base.require_success(
            ssh,
            "set -e; cd {d}; tar -xzf {t}; rm -f {t}".format(
                d=shlex.quote(REMOTE_SPRITES), t=shlex.quote(remote_tmp)
            ),
            timeout=300,
        )
        tee(f"sprites: {len(todo)} files extracted to {REMOTE_SPRITES}")
    finally:
        try:
            os.unlink(tmp_path)
        except OSError:
            pass


def recreate_backend(ssh) -> None:
    tee("backend: recreating container with new env...")
    base.require_success(
        ssh,
        "set -e; cd {d}; docker compose -f docker-compose.server.yml --env-file .env.server "
        "up -d --no-build backend".format(d=shlex.quote(f"{REMOTE_APP}/deploy")),
        timeout=300,
    )
    tee("backend: waiting for /actuator/health ...")
    deadline = time.time() + 180
    while time.time() < deadline:
        code, out, _ = base.read_command(
            ssh, "curl -sf -m 4 http://127.0.0.1:8080/actuator/health || true"
        )
        if '"UP"' in out:
            tee(f"backend: health OK -> {out.strip()[:120]}")
            return
        time.sleep(6)
    raise RuntimeError("backend health did not report UP within 180s; check docker logs shizuki-site-backend")


def main() -> int:
    global _log_fh
    LOGS_DIR.mkdir(parents=True, exist_ok=True)
    log_path = LOGS_DIR / f"meguri-config-{time.strftime('%Y%m%d-%H%M%S')}.log"
    _log_fh = open(log_path, "a", encoding="utf-8")
    tee(f"log file: {log_path}")
    config = base.DeployConfig(
        host=os.getenv("REMOTE_HOST", base.DEFAULT_HOST),
        user=os.getenv("REMOTE_USER", base.DEFAULT_USER),
        password=os.getenv("REMOTE_PASS", base.DEFAULT_PASSWORD),
        remote_app_dir=REMOTE_APP,
        remote_deploy_dir=f"{REMOTE_APP}/deploy",
        upload_retries=2,
        deploy_timeout_seconds=600,
        deploy_poll_interval_seconds=5,
    )
    try:
        token = read_token()
        with base.open_ssh(config) as ssh:
            base.require_success(ssh, "echo ok >/dev/null")
            patch_remote_env(ssh, token)
            sync_sprites(ssh)
            recreate_backend(ssh)
        tee("Meguri gateway configured successfully.")
        tee("验收：ADMIN 登录网站 -> AI Hub -> 爱莉伴聊，应显示「Meguri Core 在线」并出现默认立绘。")
        return 0
    except Exception as exc:
        tee(f"[ERROR] {exc}")
        return 1
    finally:
        _log_fh.close()


if __name__ == "__main__":
    raise SystemExit(main())
