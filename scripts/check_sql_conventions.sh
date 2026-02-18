#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "${ROOT_DIR}"

ERRORS=0

print_error() {
  local msg="$1"
  echo "[sql-check][error] ${msg}"
  ERRORS=$((ERRORS + 1))
}

collect_sql_files() {
  find resouces/sql apps/monolith-app/src/main/resources/monolith/db/migration \
    -type f -name '*.sql' -not -path '*/target/*' | sort
}

check_required_headers_in_resource_sql() {
  local file="$1"
  if [[ "${file}" != resouces/sql/* ]]; then
    return 0
  fi
  if ! rg -q '^-- modified_at:' "${file}"; then
    print_error "${file}: missing header '-- modified_at:'"
  fi
  if ! rg -q '^-- change:' "${file}"; then
    print_error "${file}: missing header '-- change:'"
  fi
}

check_no_select_star() {
  local file="$1"
  local hit
  hit="$(rg -n -i '\bselect\s+\*\b' "${file}" || true)"
  if [[ -n "${hit}" ]]; then
    print_error "${file}: found SELECT * usage"
    echo "${hit}"
  fi
}

check_flyway_naming() {
  local file="$1"
  if [[ "${file}" != apps/monolith-app/src/main/resources/monolith/db/migration/* ]]; then
    return 0
  fi
  local base
  base="$(basename "${file}")"
  if [[ ! "${base}" =~ ^V[0-9]+__.+\.sql$ ]]; then
    print_error "${file}: invalid flyway name, expected V{number}__{description}.sql"
  fi
}

check_column_comment_for_create_table() {
  local file="$1"
  local violations
  violations="$(
    awk '
      BEGIN { in_create = 0 }
      /^[[:space:]]*CREATE[[:space:]]+TABLE/i { in_create = 1; next }
      in_create == 1 {
        if ($0 ~ /^[[:space:]]*\)[[:space:]]*([^;]*;)?[[:space:]]*$/) { in_create = 0; next }
        if ($0 ~ /^[[:space:]]*(CONSTRAINT|PRIMARY[[:space:]]+KEY|UNIQUE|KEY|INDEX|FOREIGN[[:space:]]+KEY)\b/i) { next }
        if ($0 ~ /^[[:space:]]*[`A-Za-z_][`A-Za-z0-9_]*[[:space:]]+/) {
          if ($0 !~ /COMMENT[[:space:]]+'\''/i) {
            printf "%s:%d:%s\n", FILENAME, NR, $0
          }
        }
      }
    ' "${file}"
  )"
  if [[ -n "${violations}" ]]; then
    print_error "${file}: found table columns without COMMENT clause"
    echo "${violations}"
  fi
}

main() {
  if [[ ! -d "resouces/sql" ]] || [[ ! -d "apps/monolith-app/src/main/resources/monolith/db/migration" ]]; then
    print_error "required SQL directories not found"
    exit 1
  fi

  mapfile -t sql_files < <(collect_sql_files)
  if [[ "${#sql_files[@]}" -eq 0 ]]; then
    print_error "no SQL files found"
    exit 1
  fi

  echo "[sql-check] scanning ${#sql_files[@]} SQL files"

  for file in "${sql_files[@]}"; do
    check_required_headers_in_resource_sql "${file}"
    check_no_select_star "${file}"
    check_flyway_naming "${file}"
    check_column_comment_for_create_table "${file}"
  done

  if [[ "${ERRORS}" -gt 0 ]]; then
    echo "[sql-check] failed with ${ERRORS} issue(s)"
    exit 1
  fi

  echo "[sql-check] passed"
}

main "$@"
