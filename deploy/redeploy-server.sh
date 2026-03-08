#!/usr/bin/env bash
set -euo pipefail

REMOTE_HOST="${REMOTE_HOST:-111.228.35.186}"
REMOTE_USER="${REMOTE_USER:-root}"
REMOTE_PASS="${REMOTE_PASS:-Izumi2486}"
REMOTE_DIR="${REMOTE_DIR:-/opt/shizuki-site/deploy}"

if ! command -v sshpass >/dev/null 2>&1; then
  echo "[ERROR] sshpass not found. Install with: sudo apt-get update && sudo apt-get install -y sshpass" >&2
  exit 1
fi

sshpass -p "${REMOTE_PASS}" ssh -o StrictHostKeyChecking=no "${REMOTE_USER}@${REMOTE_HOST}" \
  "set -e; cd ${REMOTE_DIR}; docker compose -f docker-compose.server.yml --env-file .env.server up -d --build; docker compose -f docker-compose.server.yml --env-file .env.server ps"

echo "Redeploy finished."

