#!/usr/bin/env bash
set -euo pipefail

usage() {
  cat <<'USAGE'
Usage:
  MYSQL_HOST=127.0.0.1 MYSQL_PORT=3306 MYSQL_DB=shizuki_app MYSQL_USER=root MYSQL_PASSWORD=*** \
  PG_HOST=127.0.0.1 PG_PORT=5432 PG_DB=shizuki_app PG_USER=postgres PG_PASSWORD=*** \
  ./scripts/verify_mysql_postgres_consistency.sh
USAGE
}

MYSQL_HOST="${MYSQL_HOST:-}"
MYSQL_PORT="${MYSQL_PORT:-3306}"
MYSQL_DB="${MYSQL_DB:-shizuki_app}"
MYSQL_USER="${MYSQL_USER:-}"
MYSQL_PASSWORD="${MYSQL_PASSWORD:-}"

PG_HOST="${PG_HOST:-}"
PG_PORT="${PG_PORT:-5432}"
PG_DB="${PG_DB:-shizuki_app}"
PG_USER="${PG_USER:-}"
PG_PASSWORD="${PG_PASSWORD:-}"

if [[ -z "$MYSQL_HOST" || -z "$MYSQL_USER" || -z "$MYSQL_PASSWORD" || -z "$PG_HOST" || -z "$PG_USER" || -z "$PG_PASSWORD" ]]; then
  usage
  exit 1
fi

if ! command -v mysql >/dev/null 2>&1; then
  echo "[verify][error] missing mysql command" >&2
  exit 1
fi
if ! command -v psql >/dev/null 2>&1; then
  echo "[verify][error] missing psql command" >&2
  exit 1
fi

mapfile -t TABLES < <(mysql -N -s -h "$MYSQL_HOST" -P "$MYSQL_PORT" -u "$MYSQL_USER" -p"$MYSQL_PASSWORD" \
  -e "SELECT table_name FROM information_schema.tables WHERE table_schema='${MYSQL_DB}' AND table_type='BASE TABLE' ORDER BY table_name;")

if [[ "${#TABLES[@]}" -eq 0 ]]; then
  echo "[verify][error] no MySQL tables found in ${MYSQL_DB}" >&2
  exit 1
fi

MISMATCH=0
printf "%-40s %-14s %-14s\n" "TABLE" "MYSQL_COUNT" "PG_COUNT"
printf "%-40s %-14s %-14s\n" "----------------------------------------" "--------------" "--------------"

for t in "${TABLES[@]}"; do
  mysql_count="$(mysql -N -s -h "$MYSQL_HOST" -P "$MYSQL_PORT" -u "$MYSQL_USER" -p"$MYSQL_PASSWORD" -e "SELECT COUNT(*) FROM ${t};" "$MYSQL_DB")"
  pg_count="$(PGPASSWORD="$PG_PASSWORD" psql -h "$PG_HOST" -p "$PG_PORT" -U "$PG_USER" -d "$PG_DB" -t -A -v ON_ERROR_STOP=1 -c "SELECT COUNT(*) FROM \"${t}\";" 2>/dev/null || true)"
  if [[ -z "$pg_count" ]]; then
    t_lower="$(printf '%s' "$t" | tr '[:upper:]' '[:lower:]')"
    pg_count="$(PGPASSWORD="$PG_PASSWORD" psql -h "$PG_HOST" -p "$PG_PORT" -U "$PG_USER" -d "$PG_DB" -t -A -v ON_ERROR_STOP=1 -c "SELECT COUNT(*) FROM \"${t_lower}\";" 2>/dev/null || true)"
  fi

  if [[ -z "$pg_count" ]]; then
    pg_count="TABLE_NOT_FOUND"
    MISMATCH=1
  elif [[ "$mysql_count" != "$pg_count" ]]; then
    MISMATCH=1
  fi

  printf "%-40s %-14s %-14s\n" "$t" "$mysql_count" "$pg_count"
done

if [[ "$MISMATCH" -ne 0 ]]; then
  echo "[verify][error] consistency check failed" >&2
  exit 2
fi

echo "[verify] consistency check passed"
