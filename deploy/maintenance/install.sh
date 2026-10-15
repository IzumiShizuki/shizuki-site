#!/usr/bin/env bash
set -euo pipefail

if [[ $EUID != 0 || ! -d /opt/shizuki-site ]]; then
    echo 'Run as root on the personal website server (111.228.35.186).' >&2
    exit 1
fi
source_dir=$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)
install -d -m 0755 /usr/local/lib/shizuki-disk-maintenance /etc/systemd/journald.conf.d
install -d -m 0750 /var/log/shizuki-disk-maintenance
install -m 0755 "$source_dir/shizuki-disk-maintenance.sh" /usr/local/sbin/shizuki-disk-maintenance
install -m 0644 "$source_dir/retain_snapshots.py" /usr/local/lib/shizuki-disk-maintenance/retain_snapshots.py
install -m 0644 "$source_dir/shizuki-disk-maintenance.service" /etc/systemd/system/
install -m 0644 "$source_dir/shizuki-disk-maintenance.timer" /etc/systemd/system/
install -m 0644 "$source_dir/90-shizuki-disk-limits.conf" /etc/systemd/journald.conf.d/
if [[ ! -e /etc/default/shizuki-disk-maintenance ]]; then
    printf 'PRUNE_SNAPSHOTS=0\n' > /etc/default/shizuki-disk-maintenance
fi
bash -n /usr/local/sbin/shizuki-disk-maintenance
systemd-analyze verify /etc/systemd/system/shizuki-disk-maintenance.service /etc/systemd/system/shizuki-disk-maintenance.timer
systemctl daemon-reload
systemctl restart systemd-journald.service
systemctl enable --now shizuki-disk-maintenance.timer
