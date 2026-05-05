#!/usr/bin/env bash
set -euo pipefail

usage() {
  cat <<'USAGE'
Usage:
  MYSQL_HOST=127.0.0.1 MYSQL_PORT=3306 MYSQL_DB=shizuki_app MYSQL_USER=root MYSQL_PASSWORD=*** \
  PG_HOST=127.0.0.1 PG_PORT=5432 PG_DB=shizuki_app PG_USER=postgres PG_PASSWORD=*** \
  ./scripts/migrate_mysql_to_postgres.sh

Environment variables:
  MYSQL_HOST / MYSQL_PORT / MYSQL_DB / MYSQL_USER / MYSQL_PASSWORD
  PG_HOST / PG_PORT / PG_DB / PG_USER / PG_PASSWORD
  BACKUP_DIR (default: ./backups/mysql)
  PGLOADER_LOAD_FILE (optional custom pgloader file path)
USAGE
}

require_cmd() {
  local name="$1"
  if ! command -v "$name" >/dev/null 2>&1; then
    echo "[migrate][error] missing command: $name" >&2
    exit 1
  fi
}

urlencode() {
  python3 - <<'PY' "$1"
import sys
from urllib.parse import quote
print(quote(sys.argv[1], safe=''))
PY
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

BACKUP_DIR="${BACKUP_DIR:-./backups/mysql}"
PGLOADER_LOAD_FILE="${PGLOADER_LOAD_FILE:-}"

if [[ -z "$MYSQL_HOST" || -z "$MYSQL_USER" || -z "$MYSQL_PASSWORD" || -z "$PG_HOST" || -z "$PG_USER" || -z "$PG_PASSWORD" ]]; then
  usage
  exit 1
fi

require_cmd mysqldump
require_cmd mysql
require_cmd psql
require_cmd pgloader
require_cmd python3

mkdir -p "$BACKUP_DIR"
TS="$(date +%Y%m%d_%H%M%S)"
BACKUP_FILE="$BACKUP_DIR/${MYSQL_DB}_${TS}.sql"

MYSQL_PW_URI="$(urlencode "$MYSQL_PASSWORD")"
PG_PW_URI="$(urlencode "$PG_PASSWORD")"
MYSQL_URI="mysql://${MYSQL_USER}:${MYSQL_PW_URI}@${MYSQL_HOST}:${MYSQL_PORT}/${MYSQL_DB}"
PG_URI="postgresql://${PG_USER}:${PG_PW_URI}@${PG_HOST}:${PG_PORT}/${PG_DB}"

echo "[migrate] 1/5 backup mysql => $BACKUP_FILE"
mysqldump \
  --single-transaction \
  --routines \
  --triggers \
  --events \
  --set-gtid-purged=OFF \
  --default-character-set=utf8mb4 \
  --hex-blob \
  -h "$MYSQL_HOST" \
  -P "$MYSQL_PORT" \
  -u "$MYSQL_USER" \
  -p"$MYSQL_PASSWORD" \
  "$MYSQL_DB" > "$BACKUP_FILE"

echo "[migrate] 2/5 verify mysql connectivity"
mysql -h "$MYSQL_HOST" -P "$MYSQL_PORT" -u "$MYSQL_USER" -p"$MYSQL_PASSWORD" -e "SELECT 1" "$MYSQL_DB" >/dev/null

echo "[migrate] 3/5 verify postgres connectivity"
PGPASSWORD="$PG_PASSWORD" psql -h "$PG_HOST" -p "$PG_PORT" -U "$PG_USER" -d "$PG_DB" -v ON_ERROR_STOP=1 -c "SELECT 1" >/dev/null

LOAD_FILE="${PGLOADER_LOAD_FILE:-$(mktemp /tmp/pgloader-mysql2pg.XXXXXX.load)}"
cat > "$LOAD_FILE" <<LOADCFG
LOAD DATABASE
     FROM ${MYSQL_URI}
     INTO ${PG_URI}
 WITH include drop,
      create tables,
      create indexes,
      reset sequences,
      foreign keys,
      batch rows = 5000,
      prefetch rows = 50000
 CAST
      type datetime to timestamp,
      type tinyint to smallint drop typemod,
      type json to jsonb
 SET work_mem to '64MB',
     maintenance_work_mem to '256MB';
LOADCFG

echo "[migrate] 4/5 run pgloader"
pgloader "$LOAD_FILE"

echo "[migrate] 5/5 done"
echo "[migrate] mysql backup: $BACKUP_FILE"
if [[ -z "${PGLOADER_LOAD_FILE:-}" ]]; then
  rm -f "$LOAD_FILE"
fi
