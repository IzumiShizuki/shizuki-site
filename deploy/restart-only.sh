#!/usr/bin/env bash
set -euo pipefail

REMOTE_HOST="${REMOTE_HOST:-111.228.35.186}"
REMOTE_USER="${REMOTE_USER:-root}"
REMOTE_PASS="${REMOTE_PASS:-Izumi2486}"
REMOTE_APP_DIR="${REMOTE_APP_DIR:-/opt/shizuki-site}"
REMOTE_DEPLOY_DIR="${REMOTE_DEPLOY_DIR:-${REMOTE_APP_DIR}/deploy}"

if ! command -v sshpass >/dev/null 2>&1; then
  echo "[ERROR] sshpass not found. Install with: sudo apt-get update && sudo apt-get install -y sshpass" >&2
  exit 1
fi

echo "[1/1] Restarting existing containers without uploading code ..."
sshpass -p "${REMOTE_PASS}" ssh -o StrictHostKeyChecking=no "${REMOTE_USER}@${REMOTE_HOST}" \
  "set -e; cd ${REMOTE_DEPLOY_DIR}; docker compose -f docker-compose.server.yml --env-file .env.server up -d --no-build; docker compose -f docker-compose.server.yml --env-file .env.server ps"

echo "Restart-only deployment finished."
