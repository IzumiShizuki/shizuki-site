#!/usr/bin/env bash
set -euo pipefail

REMOTE_HOST="${REMOTE_HOST:-111.228.35.186}"
REMOTE_USER="${REMOTE_USER:-root}"
REMOTE_PASS="${REMOTE_PASS:-Izumi2486}"
REMOTE_APP_DIR="${REMOTE_APP_DIR:-/opt/shizuki-site}"
REMOTE_DEPLOY_DIR="${REMOTE_DEPLOY_DIR:-${REMOTE_APP_DIR}/deploy}"
LOCAL_APP_DIR="${LOCAL_APP_DIR:-$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)}"
UPLOAD_RETRIES="${UPLOAD_RETRIES:-4}"

SSH_OPTS=(
  -o StrictHostKeyChecking=no
  -o UserKnownHostsFile=/dev/null
  -o LogLevel=ERROR
  -o PreferredAuthentications=password
  -o PubkeyAuthentication=no
  -o ConnectTimeout=10
  -o ConnectionAttempts=3
  -o ServerAliveInterval=15
  -o ServerAliveCountMax=8
  -o TCPKeepAlive=yes
)

if ! command -v sshpass >/dev/null 2>&1; then
  echo "[ERROR] sshpass not found. Install with: sudo apt-get update && sudo apt-get install -y sshpass" >&2
  exit 1
fi

if ! command -v rsync >/dev/null 2>&1; then
  echo "[ERROR] rsync not found. Install with: sudo apt-get update && sudo apt-get install -y rsync" >&2
  exit 1
fi

retry() {
  local max_attempts="$1"
  shift
  local attempt=1
  until "$@"; do
    local ec=$?
    if [ "${attempt}" -ge "${max_attempts}" ]; then
      echo "[ERROR] command failed after ${attempt} attempts (exit=${ec})" >&2
      return "${ec}"
    fi
    attempt=$((attempt + 1))
    echo "[WARN] command failed (exit=${ec}), retry ${attempt}/${max_attempts} in 3s..."
    sleep 3
  done
}

echo "[0/2] Checking SSH connectivity ..."
retry 3 sshpass -p "${REMOTE_PASS}" ssh "${SSH_OPTS[@]}" "${REMOTE_USER}@${REMOTE_HOST}" "echo ok >/dev/null"

echo "[1/2] Uploading local code to ${REMOTE_USER}@${REMOTE_HOST}:${REMOTE_APP_DIR} ..."
retry "${UPLOAD_RETRIES}" sshpass -p "${REMOTE_PASS}" rsync -az --delete --partial \
  --timeout=120 \
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
  -e "ssh ${SSH_OPTS[*]}" \
  "${LOCAL_APP_DIR}/" "${REMOTE_USER}@${REMOTE_HOST}:${REMOTE_APP_DIR}/"

echo "[2/2] Rebuilding and deploying containers ..."
sshpass -p "${REMOTE_PASS}" ssh "${SSH_OPTS[@]}" "${REMOTE_USER}@${REMOTE_HOST}" \
  "set -e; cd ${REMOTE_DEPLOY_DIR}; docker compose -f docker-compose.server.yml --env-file .env.server up -d --build; docker compose -f docker-compose.server.yml --env-file .env.server ps"

echo "Update code + redeploy finished."
