#!/usr/bin/env bash
set -euo pipefail

REMOTE_HOST="${REMOTE_HOST:-111.228.35.186}"
REMOTE_USER="${REMOTE_USER:-root}"
REMOTE_PASS="${REMOTE_PASS:-Izumi2486}"
REMOTE_APP_DIR="${REMOTE_APP_DIR:-/opt/shizuki-site}"
REMOTE_DEPLOY_DIR="${REMOTE_DEPLOY_DIR:-${REMOTE_APP_DIR}/deploy}"
LOCAL_APP_DIR="${LOCAL_APP_DIR:-$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)}"
UPLOAD_RETRIES="${UPLOAD_RETRIES:-4}"
DEPLOY_TIMEOUT_SECONDS="${DEPLOY_TIMEOUT_SECONDS:-5400}"
DEPLOY_POLL_INTERVAL_SECONDS="${DEPLOY_POLL_INTERVAL_SECONDS:-10}"

REMOTE_STATUS_FILE="${REMOTE_DEPLOY_DIR}/.remote-deploy.status"
REMOTE_LOG_FILE="${REMOTE_DEPLOY_DIR}/.remote-deploy.log"
REMOTE_PID_FILE="${REMOTE_DEPLOY_DIR}/.remote-deploy.pid"
REMOTE_RUNNER="${REMOTE_DEPLOY_DIR}/remote-compose-build.sh"

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

ssh_run() {
  sshpass -p "${REMOTE_PASS}" ssh "${SSH_OPTS[@]}" "${REMOTE_USER}@${REMOTE_HOST}" "$@"
}

echo "[0/2] Checking SSH connectivity ..."
retry 3 ssh_run "echo ok >/dev/null"

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

echo "[2/2] Starting remote rebuild in background ..."
ssh_run "set -e; cd ${REMOTE_DEPLOY_DIR}; : > ${REMOTE_LOG_FILE}; echo 'STARTING \$(date '+%Y-%m-%d %H:%M:%S')' > ${REMOTE_STATUS_FILE}; nohup bash ${REMOTE_RUNNER} >/dev/null 2>&1 < /dev/null & echo \$! > ${REMOTE_PID_FILE}"

start_ts="$(date +%s)"
while true; do
  now_ts="$(date +%s)"
  elapsed="$((now_ts - start_ts))"
  if [ "${elapsed}" -gt "${DEPLOY_TIMEOUT_SECONDS}" ]; then
    echo "[ERROR] Remote deploy timed out after ${DEPLOY_TIMEOUT_SECONDS}s"
    ssh_run "tail -n 80 ${REMOTE_LOG_FILE}" || true
    exit 1
  fi

  status_line="$(ssh_run "cat ${REMOTE_STATUS_FILE} 2>/dev/null || true" || true)"
  case "${status_line}" in
    SUCCESS*)
      echo "[OK] Remote deploy finished successfully."
      ssh_run "tail -n 40 ${REMOTE_LOG_FILE}" || true
      break
      ;;
    FAILED*)
      echo "[ERROR] Remote deploy failed."
      ssh_run "tail -n 80 ${REMOTE_LOG_FILE}" || true
      exit 1
      ;;
    RUNNING*|STARTING*)
      echo "[WAIT] ${status_line:-RUNNING} (${elapsed}s)"
      ;;
    *)
      echo "[WAIT] Remote status unavailable yet (${elapsed}s)"
      ;;
  esac

  sleep "${DEPLOY_POLL_INTERVAL_SECONDS}"
done

echo "Update code + redeploy finished."
