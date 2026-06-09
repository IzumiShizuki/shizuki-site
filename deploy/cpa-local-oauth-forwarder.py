#!/usr/bin/env python3
"""Local OAuth callback bridge for remote CLI Proxy API deployments.

This helper listens on a local loopback port such as 1455 and handles
OAuth callbacks for a CPA instance running on a remote server.

Two modes are supported:
1. redirect: 302 redirect the browser to a remote CPA callback URL.
2. ssh-write: write the callback payload directly into the remote CPA
   auth directory through SSH. This avoids relying on a public callback
   route and works better for Docker deployments that only publish the
   management port.
"""

from __future__ import annotations

import argparse
import http.server
import json
import posixpath
import re
import socketserver
import sys
from dataclasses import dataclass
from pathlib import Path
from urllib.parse import parse_qs, urlsplit


SUCCESS_HTML = """<html><head><meta charset="utf-8"><title>Authentication successful</title>
<script>setTimeout(function(){window.close();},5000);</script></head>
<body><h1>Authentication successful!</h1><p>You can close this window.</p>
<p>This window will close automatically in 5 seconds.</p></body></html>"""


@dataclass
class SSHConfig:
    host: str
    user: str
    password: str
    auth_dir: str


def read_text(path: str) -> str:
    return Path(path).read_text(encoding="utf-8")


def parse_deploy_script(path: str) -> SSHConfig:
    text = read_text(path)

    def extract(name: str) -> str:
        pattern = rf'{name}="\$\{{{name}:-([^}}]+)\}}"'
        match = re.search(pattern, text)
        if not match:
            raise ValueError(f"cannot find {name} in {path}")
        return match.group(1)

    return SSHConfig(
        host=extract("REMOTE_HOST"),
        user=extract("REMOTE_USER"),
        password=extract("REMOTE_PASS"),
        auth_dir="/opt/cli-proxy-plus/auth",
    )


def write_remote_callback_file(ssh_cfg: SSHConfig, provider: str, query: str) -> None:
    import paramiko

    params = parse_qs(query, keep_blank_values=True)
    state = (params.get("state") or [""])[0].strip()
    code = (params.get("code") or [""])[0].strip()
    error_message = (params.get("error") or params.get("error_description") or [""])[0].strip()
    if not state:
        raise ValueError("callback URL missing state")

    payload = json.dumps(
        {
            "code": code,
            "state": state,
            "error": error_message,
        },
        ensure_ascii=False,
    )

    remote_name = f".oauth-{provider}-{state}.oauth"
    remote_path = posixpath.join(ssh_cfg.auth_dir, remote_name)

    client = paramiko.SSHClient()
    client.set_missing_host_key_policy(paramiko.AutoAddPolicy())
    client.connect(
        hostname=ssh_cfg.host,
        username=ssh_cfg.user,
        password=ssh_cfg.password,
        timeout=10,
        banner_timeout=10,
        auth_timeout=10,
    )
    try:
        sftp = client.open_sftp()
        try:
            with sftp.file(remote_path, "w") as handle:
                handle.write(payload)
            sftp.chmod(remote_path, 0o600)
        finally:
            sftp.close()
    finally:
        client.close()


class ReusableTCPServer(socketserver.TCPServer):
    allow_reuse_address = True


class ForwardHandler(http.server.BaseHTTPRequestHandler):
    mode = "redirect"
    provider = "codex"
    target_base_url = ""
    ssh_config: SSHConfig | None = None

    def do_GET(self) -> None:
        parsed = urlsplit(self.path)
        if parsed.path == "/health":
            body = b'{"status":"ok"}'
            self.send_response(200)
            self.send_header("Content-Type", "application/json")
            self.send_header("Content-Length", str(len(body)))
            self.end_headers()
            self.wfile.write(body)
            return

        if parsed.path != "/auth/callback":
            body = b"Not Found"
            self.send_response(404)
            self.send_header("Content-Type", "text/plain; charset=utf-8")
            self.send_header("Content-Length", str(len(body)))
            self.end_headers()
            self.wfile.write(body)
            return

        if self.mode == "redirect":
            target = self.target_base_url
            if parsed.query:
                separator = "&" if "?" in target else "?"
                target = f"{target}{separator}{parsed.query}"

            self.send_response(302)
            self.send_header("Cache-Control", "no-store")
            self.send_header("Location", target)
            self.end_headers()
            return

        if self.mode == "ssh-write":
            if self.ssh_config is None:
                raise RuntimeError("ssh configuration is missing")
            try:
                write_remote_callback_file(self.ssh_config, self.provider, parsed.query)
            except Exception as exc:
                body = f"OAuth callback bridge failed: {exc}".encode("utf-8")
                self.send_response(502)
                self.send_header("Content-Type", "text/plain; charset=utf-8")
                self.send_header("Content-Length", str(len(body)))
                self.end_headers()
                self.wfile.write(body)
                return

            body = SUCCESS_HTML.encode("utf-8")
            self.send_response(200)
            self.send_header("Content-Type", "text/html; charset=utf-8")
            self.send_header("Content-Length", str(len(body)))
            self.end_headers()
            self.wfile.write(body)
            return

        body = b"Unsupported mode"
        self.send_response(500)
        self.send_header("Content-Type", "text/plain; charset=utf-8")
        self.send_header("Content-Length", str(len(body)))
        self.end_headers()
        self.wfile.write(body)

    def log_message(self, fmt: str, *args: object) -> None:
        sys.stdout.write("%s - - [%s] %s\n" % (self.client_address[0], self.log_date_time_string(), fmt % args))
        sys.stdout.flush()


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Bridge localhost OAuth callback to a remote CPA instance.")
    parser.add_argument(
        "--listen-host",
        default="127.0.0.1",
        help="Loopback host to bind locally. Default: 127.0.0.1",
    )
    parser.add_argument(
        "--listen-port",
        type=int,
        default=1455,
        help="Local callback port to bind. Default: 1455",
    )
    parser.add_argument(
        "--mode",
        choices=("redirect", "ssh-write"),
        default="redirect",
        help="Bridge mode. Default: redirect",
    )
    parser.add_argument(
        "--provider",
        default="codex",
        help="OAuth provider name used in the remote callback file. Default: codex",
    )
    parser.add_argument(
        "--target-base-url",
        default="",
        help="Remote CPA callback base URL, for example http://<server>:8317/codex/callback",
    )
    parser.add_argument(
        "--deploy-script",
        default="",
        help="Deployment script path used to discover SSH host/user/password, for example deploy/update-code-and-deploy.sh",
    )
    parser.add_argument("--ssh-host", default="", help="Remote SSH host override")
    parser.add_argument("--ssh-user", default="", help="Remote SSH user override")
    parser.add_argument("--ssh-password", default="", help="Remote SSH password override")
    parser.add_argument(
        "--ssh-auth-dir",
        default="/opt/cli-proxy-plus/auth",
        help="Remote CPA auth directory. Default: /opt/cli-proxy-plus/auth",
    )
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    ForwardHandler.mode = args.mode
    ForwardHandler.provider = args.provider
    ForwardHandler.target_base_url = args.target_base_url
    if args.mode == "redirect" and not args.target_base_url:
        raise SystemExit("--target-base-url is required in redirect mode")
    if args.mode == "ssh-write":
        ssh_cfg = None
        if args.deploy_script:
            ssh_cfg = parse_deploy_script(args.deploy_script)
        if ssh_cfg is None:
            ssh_cfg = SSHConfig(host="", user="", password="", auth_dir=args.ssh_auth_dir)
        if args.ssh_host:
            ssh_cfg.host = args.ssh_host
        if args.ssh_user:
            ssh_cfg.user = args.ssh_user
        if args.ssh_password:
            ssh_cfg.password = args.ssh_password
        if args.ssh_auth_dir:
            ssh_cfg.auth_dir = args.ssh_auth_dir
        missing = [name for name, value in (("ssh-host", ssh_cfg.host), ("ssh-user", ssh_cfg.user), ("ssh-password", ssh_cfg.password)) if not value]
        if missing:
            raise SystemExit(f"missing required SSH settings: {', '.join(missing)}")
        ForwardHandler.ssh_config = ssh_cfg
    with ReusableTCPServer((args.listen_host, args.listen_port), ForwardHandler) as server:
        if args.mode == "redirect":
            print(
                f"Listening on http://{args.listen_host}:{args.listen_port} "
                f"and forwarding /auth/callback to {args.target_base_url}",
                flush=True,
            )
        else:
            print(
                f"Listening on http://{args.listen_host}:{args.listen_port} "
                f"and writing {args.provider} callback payloads to {ForwardHandler.ssh_config.auth_dir} on {ForwardHandler.ssh_config.host}",
                flush=True,
            )
        try:
            server.serve_forever()
        except KeyboardInterrupt:
            print("Stopping forwarder", flush=True)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
