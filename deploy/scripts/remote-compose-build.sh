#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
DEPLOY_DIR="$(cd "${SCRIPT_DIR}/.." && pwd)"
STATUS_FILE="${DEPLOY_DIR}/.remote-deploy.status"
LOG_FILE="${DEPLOY_DIR}/.remote-deploy.log"
BUILD_PLAN_FILE="${DEPLOY_DIR}/.remote-deploy.services"
ALL_BUILD_SERVICES=(
  backend
  document-converter
  meting-api
  music-ncm-api
  music-web-auth-sidecar
  notion-mcp-sidecar
  presentation-generator
  site
)

timestamp() {
  date '+%Y-%m-%d %H:%M:%S'
}

echo "RUNNING $(timestamp)" > "${STATUS_FILE}"

run_deploy() {
  echo "=== remote deploy started at $(timestamp) ==="
  cd "${DEPLOY_DIR}"

  if [ ! -s ../resouces/yaml/common-config.yaml ]; then
    echo "[ERROR] ../resouces/yaml/common-config.yaml is missing or empty" >&2
    return 1
  fi

  local -a build_services=()
  if [ -f "${BUILD_PLAN_FILE}" ]; then
    while IFS= read -r service; do
      [ -z "${service}" ] && continue
      case "${service}" in
        backend|document-converter|meting-api|music-ncm-api|music-web-auth-sidecar|notion-mcp-sidecar|presentation-generator|site)
          build_services+=("${service}")
          ;;
        *)
          echo "[ERROR] unknown service in build plan: ${service}" >&2
          return 1
          ;;
      esac
    done < "${BUILD_PLAN_FILE}"
  else
    echo "[WARN] build plan missing; rebuilding every buildable service"
    build_services=("${ALL_BUILD_SERVICES[@]}")
  fi

  if [ "${#build_services[@]}" -gt 0 ]; then
    echo "[build-plan] building: ${build_services[*]}"
    docker compose -f docker-compose.server.yml --env-file .env.server build "${build_services[@]}"
  else
    echo "[build-plan] no image builds required"
  fi
  docker compose -f docker-compose.server.yml --env-file .env.server up -d --no-build
  docker compose -f docker-compose.server.yml --env-file .env.server ps
  echo "=== remote deploy finished at $(timestamp) ==="
}

finalize_deploy() {
  local rc=$?
  trap - EXIT
  if [ "${rc}" -eq 0 ]; then
    echo "SUCCESS $(timestamp)" > "${STATUS_FILE}"
  else
    echo "FAILED ${rc} $(timestamp)" > "${STATUS_FILE}"
  fi
  exit "${rc}"
}

trap finalize_deploy EXIT
run_deploy >> "${LOG_FILE}" 2>&1
