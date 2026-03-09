#!/usr/bin/env bash
set -euo pipefail

REMOTE_HOST="${REMOTE_HOST:-111.228.35.186}"
REMOTE_USER="${REMOTE_USER:-root}"
REMOTE_PASS="${REMOTE_PASS:-Izumi2486}"
REMOTE_APP_DIR="${REMOTE_APP_DIR:-/opt/shizuki-site}"
REMOTE_DEPLOY_DIR="${REMOTE_DEPLOY_DIR:-${REMOTE_APP_DIR}/deploy}"
LOCAL_APP_DIR="${LOCAL_APP_DIR:-$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)}"

if ! command -v sshpass >/dev/null 2>&1; then
  echo "[ERROR] sshpass not found. Install with: sudo apt-get update && sudo apt-get install -y sshpass" >&2
  exit 1
fi

if ! command -v rsync >/dev/null 2>&1; then
  echo "[ERROR] rsync not found. Install with: sudo apt-get update && sudo apt-get install -y rsync" >&2
  exit 1
fi

echo "[1/2] Uploading local code to ${REMOTE_USER}@${REMOTE_HOST}:${REMOTE_APP_DIR} ..."
sshpass -p "${REMOTE_PASS}" rsync -az --delete \
  --exclude ".git/" \
  --exclude ".beads/" \
  --exclude ".idea/" \
  --exclude ".vscode/" \
  --exclude ".mvn/repository/" \
  --exclude "node_modules/" \
  --exclude "target/" \
  --exclude "dist-temp/" \
  --exclude ".DS_Store" \
  --exclude "deploy/.env.server" \
  -e "ssh -o StrictHostKeyChecking=no" \
  "${LOCAL_APP_DIR}/" "${REMOTE_USER}@${REMOTE_HOST}:${REMOTE_APP_DIR}/"

echo "[2/2] Rebuilding and deploying containers ..."
sshpass -p "${REMOTE_PASS}" ssh -o StrictHostKeyChecking=no "${REMOTE_USER}@${REMOTE_HOST}" \
  "set -e; cd ${REMOTE_DEPLOY_DIR}; docker compose -f docker-compose.server.yml --env-file .env.server up -d --build; docker compose -f docker-compose.server.yml --env-file .env.server ps"

echo "Update code + redeploy finished."
