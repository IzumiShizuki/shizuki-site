#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "${ROOT_DIR}"

CHECK_SCRIPT="scripts/check_backend_contracts.sh"
INVENTORY_FILE="resouces/md/standards/registry/backend-package-migration-inventory.tsv"
APPLY=0
SCOPE_FILTER="all"
PACKAGE_PREFIX=""
REFRESH_INVENTORY=1

usage() {
  cat <<'EOF'
Usage:
  ./scripts/migrate_backend_packages.sh [--scope request|response|all] [--package-prefix <package>]
  ./scripts/migrate_backend_packages.sh --scope request --package-prefix io.github.shizuki.site.user.dto.auth --apply

Behavior:
  - default mode is dry-run, only prints matched migration rows
  - apply mode only performs mechanical package migration:
    - move file to target path from inventory
    - update package declaration
    - rewrite Java imports / fully qualified type references

Options:
  --scope <value>            request | response | all, default: all
  --package-prefix <value>   only migrate rows whose current_package starts with this prefix
  --apply                    execute migration
  --no-refresh               use existing inventory file, skip inventory refresh
  -h, --help                 show this help

Examples:
  ./scripts/migrate_backend_packages.sh --scope request
  ./scripts/migrate_backend_packages.sh --scope response --package-prefix io.github.shizuki.site.content.dto
  ./scripts/migrate_backend_packages.sh --scope request --package-prefix io.github.shizuki.site.user.dto.auth --apply
EOF
}

ensure_inventory() {
  if [[ "${REFRESH_INVENTORY}" -eq 1 ]] || [[ ! -f "${INVENTORY_FILE}" ]]; then
    bash "${CHECK_SCRIPT}" --write-inventory >/dev/null
  fi
  if [[ ! -f "${INVENTORY_FILE}" ]]; then
    echo "[backend-migrate][error] inventory file not found: ${INVENTORY_FILE}"
    exit 1
  fi
}

row_matches() {
  local scope="$1"
  local current_package="$2"
  local status="$3"

  if [[ "${status}" != "pending_package_migration" ]]; then
    return 1
  fi
  if [[ "${SCOPE_FILTER}" != "all" ]] && [[ "${scope}" != "${SCOPE_FILTER}" ]]; then
    return 1
  fi
  if [[ -n "${PACKAGE_PREFIX}" ]] && [[ "${current_package}" != "${PACKAGE_PREFIX}"* ]]; then
    return 1
  fi
  return 0
}

collect_matches() {
  tail -n +2 "${INVENTORY_FILE}" | while IFS=$'\t' read -r scope current_package current_path target_package target_path status; do
    if row_matches "${scope}" "${current_package}" "${status}"; then
      printf '%s\t%s\t%s\t%s\t%s\t%s\n' \
        "${scope}" \
        "${current_package}" \
        "${current_path}" \
        "${target_package}" \
        "${target_path}" \
        "${status}"
    fi
  done
}

update_java_references() {
  local current_fqn="$1"
  local target_fqn="$2"
  mapfile -t java_hits < <(rg -l -F "${current_fqn}" model modules apps -g '*.java' || true)
  if [[ "${#java_hits[@]}" -eq 0 ]]; then
    return 0
  fi
  CURRENT_FQN="${current_fqn}" TARGET_FQN="${target_fqn}" \
    perl -0pi -e 's/\Q$ENV{CURRENT_FQN}\E/$ENV{TARGET_FQN}/g' "${java_hits[@]}"
}

apply_row() {
  local scope="$1"
  local current_package="$2"
  local current_path="$3"
  local target_package="$4"
  local target_path="$5"
  local status="$6"
  local class_name current_fqn target_fqn

  if ! row_matches "${scope}" "${current_package}" "${status}"; then
    return 0
  fi

  class_name="$(basename "${current_path}")"
  current_fqn="${current_package}.${class_name%.java}"
  target_fqn="${target_package}.${class_name%.java}"

  if [[ ! -f "${current_path}" ]]; then
    echo "[backend-migrate][error] source file not found: ${current_path}"
    exit 1
  fi
  if [[ -f "${target_path}" ]]; then
    echo "[backend-migrate][error] target file already exists: ${target_path}"
    exit 1
  fi

  mkdir -p "$(dirname "${target_path}")"
  mv "${current_path}" "${target_path}"
  CURRENT_PACKAGE="${current_package}" TARGET_PACKAGE="${target_package}" \
    perl -0pi -e 's/^\Qpackage $ENV{CURRENT_PACKAGE};\E/package $ENV{TARGET_PACKAGE};/m' "${target_path}"
  update_java_references "${current_fqn}" "${target_fqn}"
  echo "[backend-migrate] migrated ${current_path} -> ${target_path}"
}

main() {
  while [[ $# -gt 0 ]]; do
    case "$1" in
      --scope)
        SCOPE_FILTER="${2:-}"
        shift 2
        ;;
      --package-prefix)
        PACKAGE_PREFIX="${2:-}"
        shift 2
        ;;
      --apply)
        APPLY=1
        shift
        ;;
      --no-refresh)
        REFRESH_INVENTORY=0
        shift
        ;;
      -h|--help)
        usage
        exit 0
        ;;
      *)
        echo "[backend-migrate][error] unknown argument: $1"
        usage
        exit 1
        ;;
    esac
  done

  case "${SCOPE_FILTER}" in
    request|response|all)
      ;;
    *)
      echo "[backend-migrate][error] invalid --scope: ${SCOPE_FILTER}"
      usage
      exit 1
      ;;
  esac

  ensure_inventory

  mapfile -t matched_rows < <(collect_matches)
  echo "[backend-migrate] matched rows: ${#matched_rows[@]}"
  if [[ "${#matched_rows[@]}" -eq 0 ]]; then
    exit 0
  fi

  printf '%s\n' "${matched_rows[@]}"

  if [[ "${APPLY}" -ne 1 ]]; then
    echo "[backend-migrate] dry-run only; re-run with --apply to execute"
    exit 0
  fi

  for row in "${matched_rows[@]}"; do
    IFS=$'\t' read -r scope current_package current_path target_package target_path status <<< "${row}"
    apply_row "${scope}" "${current_package}" "${current_path}" "${target_package}" "${target_path}" "${status}"
  done

  bash "${CHECK_SCRIPT}" --write-inventory >/dev/null
  echo "[backend-migrate] apply completed"
}

main "$@"
