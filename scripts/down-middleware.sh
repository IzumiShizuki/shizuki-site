#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "${ROOT_DIR}"

echo "[middleware] stopping mysql, redis, nacos ..."
docker compose stop mysql redis nacos

echo "[middleware] done."
