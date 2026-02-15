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

check_column_comments_and_required_columns() {
  local file="$1"
  if ! awk '
    BEGIN {
      in_create = 0;
      bad = 0;
      table = "";
      has_id = 0;
      has_create = 0;
      has_update = 0;
    }

    function finish_table() {
      if (in_create == 1) {
        if (!has_id || !has_create || !has_update) {
          printf("[sql-check][error] table missing required columns (id/create_time/update_time): %s -> %s\n", FILENAME, table);
          bad = 1;
        }
      }
    }

    /^[[:space:]]*CREATE TABLE/ {
      finish_table();
      in_create = 1;
      table = $0;
      gsub(/^.*CREATE TABLE IF NOT EXISTS[[:space:]]+/, "", table);
      gsub(/\(.*/, "", table);
      gsub(/`/, "", table);
      gsub(/[[:space:]]+/, "", table);
      has_id = 0;
      has_create = 0;
      has_update = 0;
      if (table !~ /^[A-Z]{2,3}_[A-Z0-9_]+$/) {
        printf("[sql-check][error] invalid table name: %s -> %s\n", FILENAME, table);
        bad = 1;
      }
      next;
    }

    /^[[:space:]]*CREATE( OR REPLACE)? VIEW/ {
      view = $0;
      gsub(/^.*VIEW[[:space:]]+/, "", view);
      gsub(/[[:space:]]+AS.*/, "", view);
      gsub(/`/, "", view);
      gsub(/[[:space:]]+/, "", view);
      if (view !~ /^VW_[A-Z0-9_]+$/) {
        printf("[sql-check][error] invalid view name: %s -> %s\n", FILENAME, view);
        bad = 1;
      }
      next;
    }

    in_create && /^[[:space:]]*\)/ {
      finish_table();
      in_create = 0;
      table = "";
      next;
    }

    in_create {
      line = $0;
      gsub(/^[[:space:]]+/, "", line);
      gsub(/[[:space:]]+$/, "", line);

      if (line == "" || line ~ /^--/) next;

      if (line ~ /^CONSTRAINT[[:space:]]+/) {
        split(line, arr, /[[:space:]]+/);
        cname = arr[2];
        gsub(/`/, "", cname);

        if (line ~ /PRIMARY KEY/ && cname !~ /^PK_[A-Z0-9_]+$/) {
          printf("[sql-check][error] invalid PK name: %s:%d -> %s\n", FILENAME, NR, line);
          bad = 1;
        }
        if (line ~ /UNIQUE/ && cname !~ /^AK_[A-Z0-9_]+_[0-9]+$/) {
          printf("[sql-check][error] invalid AK name: %s:%d -> %s\n", FILENAME, NR, line);
          bad = 1;
        }
        if (line ~ /FOREIGN KEY/ && cname !~ /^FK_[A-Z0-9_]+_[0-9]+$/) {
          printf("[sql-check][error] invalid FK name: %s:%d -> %s\n", FILENAME, NR, line);
          bad = 1;
        }
        next;
      }

      if (line ~ /^KEY[[:space:]]+/ || line ~ /^INDEX[[:space:]]+/) {
        split(line, arr, /[[:space:]]+/);
        iname = arr[2];
        gsub(/`/, "", iname);
        if (iname !~ /^IX_[A-Z0-9_]+_[0-9]+$/) {
          printf("[sql-check][error] invalid IX name: %s:%d -> %s\n", FILENAME, NR, line);
          bad = 1;
        }
        next;
      }

      if (line ~ / COMMENT /) {
        split(line, arr, /[[:space:]]+/);
        col = arr[1];
        gsub(/`/, "", col);
        if (col == "id") has_id = 1;
        if (col == "create_time") has_create = 1;
        if (col == "update_time") has_update = 1;
      } else {
        printf("[sql-check][error] missing column COMMENT: %s:%d -> %s\n", FILENAME, NR, line);
        bad = 1;
      }
    }

    END {
      finish_table();
      exit bad;
    }
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

check_sensitive_plaintext() {
  local file="$1"
  local pattern="admin123|replace_me|password[[:space:]]*=[[:space:]]*'[^']+'"
  if command -v rg >/dev/null 2>&1; then
    if rg -n "${pattern}" "$file" >/dev/null 2>&1; then
      echo "[sql-check][error] possible plaintext sensitive data: ${file}"
      FAILED=1
    fi
  else
    if grep -En "${pattern}" "$file" >/dev/null 2>&1; then
      echo "[sql-check][error] possible plaintext sensitive data: ${file}"
      FAILED=1
    fi
  fi
}

for sql_file in "${PROJECT_ROOT}"/resouces/sql/*.sql; do
  [[ -f "$sql_file" ]] || continue
  check_sql_block_headers "$sql_file"
  check_column_comments_and_required_columns "$sql_file"
  check_sensitive_plaintext "$sql_file"
done

for migration_file in "${PROJECT_ROOT}"/services/*/src/main/resources/db/migration/*.sql; do
  [[ -f "$migration_file" ]] || continue
  check_flyway_file_name "$migration_file"
  base="$(basename "$migration_file")"
  if [[ "$base" =~ ^V([5-9]|[1-9][0-9]+)__ ]]; then
    check_sensitive_plaintext "$migration_file"
  fi
done

if [[ "$FAILED" -ne 0 ]]; then
  echo "[sql-check] FAILED"
  exit 1
fi

echo "[sql-check] PASSED"
