#!/usr/bin/env bash
set -euo pipefail

PROJECT_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
FAILED=0

echo "[sql-check] project root: ${PROJECT_ROOT}"

if command -v rg >/dev/null 2>&1; then
  SEARCH_CMD="rg -q --"
else
  SEARCH_CMD="grep -q --"
fi

check_sql_block_headers() {
  local file="$1"
  if ! ${SEARCH_CMD} '-- modified_at:' "$file"; then
    echo "[sql-check][error] missing modified_at header: ${file}"
    FAILED=1
  fi
  if ! ${SEARCH_CMD} '-- change:' "$file"; then
    echo "[sql-check][error] missing change header: ${file}"
    FAILED=1
  fi
}

check_column_comments() {
  local file="$1"
  if ! awk '
    BEGIN { in_create = 0; bad = 0; }
    /^[[:space:]]*CREATE TABLE/ { in_create = 1; next; }
    in_create && /^[[:space:]]*\)/ { in_create = 0; next; }
    in_create {
      line = $0;
      gsub(/^[[:space:]]+/, "", line);
      gsub(/[[:space:]]+$/, "", line);
      if (line == "" || line ~ /^--/) next;
      if (line ~ /^(PRIMARY KEY|UNIQUE KEY|KEY|INDEX|CONSTRAINT|FOREIGN KEY)/) next;
      if (line !~ / COMMENT /) {
        printf("[sql-check][error] missing column COMMENT: %s:%d -> %s\n", FILENAME, NR, line);
        bad = 1;
      }
    }
    END { exit bad; }
  ' "$file"; then
    FAILED=1
  fi
}

check_flyway_file_name() {
  local file="$1"
  local base
  base="$(basename "$file")"
  if [[ ! "$base" =~ ^V[0-9]+(__[a-zA-Z0-9_]+)\.sql$ ]]; then
    echo "[sql-check][error] invalid flyway file name: ${file}"
    FAILED=1
  fi
}

for sql_file in "${PROJECT_ROOT}"/resouces/sql/*.sql; do
  [[ -f "$sql_file" ]] || continue
  check_sql_block_headers "$sql_file"
  check_column_comments "$sql_file"
done

for migration_file in "${PROJECT_ROOT}"/services/*/src/main/resources/db/migration/*.sql; do
  [[ -f "$migration_file" ]] || continue
  check_flyway_file_name "$migration_file"
done

if [[ "$FAILED" -ne 0 ]]; then
  echo "[sql-check] FAILED"
  exit 1
fi

echo "[sql-check] PASSED"
