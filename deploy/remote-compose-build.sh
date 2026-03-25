#!/usr/bin/env bash
set -euo pipefail

DEPLOY_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
STATUS_FILE="${DEPLOY_DIR}/.remote-deploy.status"
LOG_FILE="${DEPLOY_DIR}/.remote-deploy.log"

timestamp() {
  date '+%Y-%m-%d %H:%M:%S'
}

echo "RUNNING $(timestamp)" > "${STATUS_FILE}"

if {
  echo "=== remote deploy started at $(timestamp) ==="
  cd "${DEPLOY_DIR}"

  if [ ! -s ../resouces/yaml/common-config.yaml ]; then
    echo "[ERROR] ../resouces/yaml/common-config.yaml is missing or empty" >&2
    exit 1
  fi

  docker compose -f docker-compose.server.yml --env-file .env.server build
  docker compose -f docker-compose.server.yml --env-file .env.server up -d --no-build
  docker compose -f docker-compose.server.yml --env-file .env.server ps
  echo "=== remote deploy finished at $(timestamp) ==="
} >> "${LOG_FILE}" 2>&1; then
  echo "SUCCESS $(timestamp)" > "${STATUS_FILE}"
else
  rc=$?
  echo "FAILED ${rc} $(timestamp)" > "${STATUS_FILE}"
  exit "${rc}"
fi
