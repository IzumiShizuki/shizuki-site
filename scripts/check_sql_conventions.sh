#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "${ROOT_DIR}"

ERRORS=0
AWK_BIN="${AWK_BIN:-awk}"
RG_BIN="${RG_BIN:-}"
if [[ -z "${RG_BIN}" ]]; then
  if command -v rg >/dev/null 2>&1; then
    RG_BIN="rg"
  else
    RG_BIN=""
  fi
fi

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
  local has_modified=1
  local has_change=1
  if [[ -n "${RG_BIN}" ]]; then
    "${RG_BIN}" -q '^-- modified_at:' "${file}" && has_modified=0 || true
    "${RG_BIN}" -q '^-- change:' "${file}" && has_change=0 || true
  else
    grep -Eq '^-- modified_at:' "${file}" && has_modified=0 || true
    grep -Eq '^-- change:' "${file}" && has_change=0 || true
  fi
  if [[ "${has_modified}" -ne 0 ]]; then
    print_error "${file}: missing header '-- modified_at:'"
  fi
  if [[ "${has_change}" -ne 0 ]]; then
    print_error "${file}: missing header '-- change:'"
  fi
}

check_no_select_star() {
  local file="$1"
  local hit
  if [[ -n "${RG_BIN}" ]]; then
    hit="$("${RG_BIN}" -n -i '\bselect\s+\*\b' "${file}" || true)"
  else
    hit="$(grep -Eni 'select[[:space:]]+\*' "${file}" || true)"
  fi
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
    "${AWK_BIN}" '
      BEGIN { in_create = 0 }
      {
        line_lower = tolower($0)
      }
      line_lower ~ /^[[:space:]]*create[[:space:]]+table/ {
        in_create = 1
        next
      }
      in_create == 1 {
        if (line_lower ~ /^[[:space:]]*\)[[:space:]]*[^;]*;?[[:space:]]*$/) {
          in_create = 0
          next
        }
        if (line_lower ~ /^[[:space:]]*(constraint|primary[[:space:]]+key|unique|key|index|foreign[[:space:]]+key)[[:space:]]/) {
          next
        }
        if ($0 ~ /^[[:space:]]*[`A-Za-z_][`A-Za-z0-9_]*[[:space:]]+/) {
          if (line_lower !~ /comment[[:space:]]+'\''/) {
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
