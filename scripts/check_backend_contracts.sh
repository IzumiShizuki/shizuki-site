#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "${ROOT_DIR}"

RG_BIN="${RG_BIN:-}"
if [[ -z "${RG_BIN}" ]]; then
  if command -v rg >/dev/null 2>&1; then
    RG_BIN="rg"
  else
    echo "[backend-check][error] rg is required but not found"
    exit 1
  fi
fi

REGISTRY_FILE="resouces/md/standards/registry/backend-contract-exceptions.yml"
INVENTORY_FILE="resouces/md/standards/registry/backend-package-migration-inventory.tsv"
ERRORS=0
WRITE_INVENTORY=0

print_error() {
  local msg="$1"
  echo "[backend-check][error] ${msg}"
  ERRORS=$((ERRORS + 1))
}

usage() {
  cat <<'EOF'
Usage:
  ./scripts/check_backend_contracts.sh
  ./scripts/check_backend_contracts.sh --write-inventory

Checks:
  - public request/response filenames must not end with Dto/DTO/View/VO
  - controller-level ApiResponse<Map<...>> count must match registry exceptions
  - controller-level @RequestBody Map<String, Object> count must match registry exceptions
  - emits current model/request|response package migration inventory
EOF
}

legacy_suffix_files() {
  find model/request/src/main/java model/response/src/main/java \
    -type f -name '*.java' | sort | while read -r file; do
    local base
    base="$(basename "${file}")"
    if [[ "${base}" =~ (Dto|DTO|View|VO)\.java$ ]]; then
      echo "${file}"
    fi
  done
}

controller_map_response_hits() {
  "${RG_BIN}" -n 'ApiResponse<\s*Map<' modules/*/src/main/java -g '*Controller.java' -S || true
}

controller_map_request_hits() {
  "${RG_BIN}" -n '@RequestBody\s+Map<String,\s*Object>' modules/*/src/main/java -g '*Controller.java' -S || true
}

count_lines() {
  local input="$1"
  if [[ -z "${input}" ]]; then
    echo 0
  else
    printf '%s\n' "${input}" | wc -l | tr -d ' '
  fi
}

registry_map_response_count() {
  "${RG_BIN}" -n 'shape: "ApiResponse<Map<String, Object>>"' "${REGISTRY_FILE}" | wc -l | tr -d ' '
}

registry_map_request_count() {
  "${RG_BIN}" -n 'shape: "Map<String, Object>"' "${REGISTRY_FILE}" | wc -l | tr -d ' '
}

inventory_rows() {
  find model/request/src/main/java model/response/src/main/java -type f -name '*.java' | sort | while read -r file; do
    local scope current_package class_name target_package target_path status
    if [[ "${file}" == model/request/* ]]; then
      scope="request"
    else
      scope="response"
    fi
    current_package="$(sed -n 's/^package \(.*\);$/\1/p' "${file}" | head -n 1)"
    class_name="$(basename "${file}")"
    target_package="$(printf '%s' "${current_package}" | sed "s/\\.dto\\([.;]\\|$\\)/.${scope}\\1/g" | sed 's/;$//')"
    if [[ "${current_package}" == "${target_package}" ]]; then
      status="already_non_dto_package"
    else
      status="pending_package_migration"
    fi
    target_path="model/${scope}/src/main/java/$(printf '%s' "${target_package}" | tr '.' '/')/${class_name}"
    printf '%s\t%s\t%s\t%s\t%s\t%s\n' \
      "${scope}" \
      "${current_package}" \
      "${file}" \
      "${target_package}" \
      "${target_path}" \
      "${status}"
  done
}

write_inventory_file() {
  mkdir -p "$(dirname "${INVENTORY_FILE}")"
  {
    printf 'scope\tcurrent_package\tcurrent_path\ttarget_package\ttarget_path\tstatus\n'
    inventory_rows
  } > "${INVENTORY_FILE}"
  echo "[backend-check] wrote inventory: ${INVENTORY_FILE}"
}

main() {
  while [[ $# -gt 0 ]]; do
    case "$1" in
      --write-inventory)
        WRITE_INVENTORY=1
        shift
        ;;
      -h|--help)
        usage
        exit 0
        ;;
      *)
        echo "[backend-check][error] unknown argument: $1"
        usage
        exit 1
        ;;
    esac
  done

  if [[ ! -f "${REGISTRY_FILE}" ]]; then
    print_error "registry file not found: ${REGISTRY_FILE}"
    exit 1
  fi

  local legacy_files response_hits request_hits actual_response_count actual_request_count expected_response_count expected_request_count
  legacy_files="$(legacy_suffix_files)"
  response_hits="$(controller_map_response_hits)"
  request_hits="$(controller_map_request_hits)"
  actual_response_count="$(count_lines "${response_hits}")"
  actual_request_count="$(count_lines "${request_hits}")"
  expected_response_count="$(registry_map_response_count)"
  expected_request_count="$(registry_map_request_count)"

  echo "[backend-check] controller map responses: ${actual_response_count}"
  echo "[backend-check] controller map requests: ${actual_request_count}"
  echo "[backend-check] registry response exceptions: ${expected_response_count}"
  echo "[backend-check] registry request exceptions: ${expected_request_count}"

  if [[ -n "${legacy_files}" ]]; then
    print_error "legacy suffix files remain under model/request|response"
    printf '%s\n' "${legacy_files}"
  fi

  if [[ "${actual_response_count}" != "${expected_response_count}" ]]; then
    print_error "controller ApiResponse<Map<...>> count (${actual_response_count}) does not match registry (${expected_response_count})"
    printf '%s\n' "${response_hits}"
  fi

  if [[ "${actual_request_count}" != "${expected_request_count}" ]]; then
    print_error "@RequestBody Map<String, Object> count (${actual_request_count}) does not match registry (${expected_request_count})"
    printf '%s\n' "${request_hits}"
  fi

  if [[ "${WRITE_INVENTORY}" -eq 1 ]]; then
    write_inventory_file
  fi

  if [[ "${ERRORS}" -gt 0 ]]; then
    echo "[backend-check] failed with ${ERRORS} issue(s)"
    exit 1
  fi

  echo "[backend-check] passed"
}

main "$@"
