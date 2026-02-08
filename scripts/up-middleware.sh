#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "${ROOT_DIR}"

echo "[middleware] starting mysql, redis, nacos ..."
docker compose up -d mysql redis nacos

echo "[middleware] current status:"
docker compose ps mysql redis nacos

echo "[middleware] done."
