#!/usr/bin/env bash
set -euo pipefail
umask 027

exec 9>/run/lock/shizuki-disk-maintenance.lock
if ! flock -n 9; then
    echo 'Another maintenance run is active; skipping.'
    exit 0
fi

printf '\nDisk before maintenance\n'
df -hT /
docker image prune --force --filter until=168h
docker buildx prune --all --force --filter until=24h --reserved-space=2GB --max-used-space=3GB
journalctl --rotate
journalctl --vacuum-time=14d --vacuum-size=512M

if [[ "${PRUNE_SNAPSHOTS:-0}" == 1 ]]; then
    python3 /usr/local/lib/shizuki-disk-maintenance/retain_snapshots.py --apply
else
    python3 /usr/local/lib/shizuki-disk-maintenance/retain_snapshots.py
fi

# Retention audit records contain paths and byte counts only.
find /var/log/shizuki-disk-maintenance -maxdepth 1 -type f \
    -name 'snapshot-retention-*.json' -mtime +90 -delete
printf '\nDisk after maintenance\n'
df -hT /
journalctl --disk-usage
docker ps --format 'table {{.Names}}\t{{.Status}}'
curl --fail --silent --show-error --max-time 20 -o /dev/null \
    -w 'frontend_http=%{http_code}\n' http://127.0.0.1:5173/
curl --fail --silent --show-error --max-time 20 http://127.0.0.1:8080/actuator/health
printf '\n'
