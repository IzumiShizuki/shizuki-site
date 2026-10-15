#!/usr/bin/env python3
"""Preview or apply conservative retention to personal-site deployment snapshots."""

import argparse
from dataclasses import dataclass
from datetime import datetime, timezone
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
import time

BACKUP_ROOT = Path('/opt/shizuki-site-backups')
AUDIT_ROOT = Path('/var/log/shizuki-disk-maintenance')
SNAPSHOT_NAME = re.compile(r'snapshot-\d{8}-\d{6}-[0-9a-f]{12}')
VOLUME_NAME = re.compile(r'[a-zA-Z0-9][a-zA-Z0-9_.-]*')
REQUIRED = ('READY', 'app.tar.gz', 'database.dump', 'volumes.list')
KEEP_DAYS = 14
KEEP_COUNT = 3


@dataclass(frozen=True)
class Snapshot:
    path: Path
    completed_at: float
    size: int
    identity: tuple[int, int]


def check_root(root):
    if root.is_symlink() or root.resolve(strict=True) != root.absolute():
        raise ValueError('Backup root must be a canonical directory without symlinks')
    if not root.is_dir() or root == Path(root.anchor):
        raise ValueError('Invalid backup root')


def inspect_snapshot(path):
    if path.is_symlink() or not path.is_dir():
        raise ValueError(f'Unsafe snapshot directory: {path}')
    size = 0
    for base, dirs, files in os.walk(path, followlinks=False):
        for name in dirs + files:
            entry = Path(base) / name
            if entry.is_symlink() or entry.is_mount():
                raise ValueError(f'Symlink or mount inside snapshot: {entry}')
        size += sum((Path(base) / name).stat().st_size for name in files)
    if not all((path / name).is_file() for name in REQUIRED):
        return None
    if not (path / 'app.tar.gz').stat().st_size or not (path / 'database.dump').stat().st_size:
        return None
    if not (path / 'volumes.list').stat().st_size:
        return None
    for volume in (path / 'volumes.list').read_text().splitlines():
        if not VOLUME_NAME.fullmatch(volume):
            raise ValueError(f'Invalid volume name in {path}')
        archive = path / 'volumes' / f'{volume}.tar.gz'
        if not archive.is_file() or not archive.stat().st_size:
            return None
    status = path.stat()
    return Snapshot(path, (path / 'READY').stat().st_mtime, size, (status.st_dev, status.st_ino))


def plan_retention(root, now=None):
    check_root(root)
    snapshots = []
    for path in root.iterdir():
        if SNAPSHOT_NAME.fullmatch(path.name):
            snapshot = inspect_snapshot(path)
            if snapshot:
                snapshots.append(snapshot)
    snapshots.sort(key=lambda item: (item.completed_at, item.path.name), reverse=True)
    protected = snapshots[:KEEP_COUNT]
    if len(protected) < KEEP_COUNT:
        return protected, []
    cutoff = (time.time() if now is None else now) - KEEP_DAYS * 86400
    candidates = [item for item in snapshots[KEEP_COUNT:] if item.completed_at < cutoff]
    return protected, candidates


def verify_snapshot(snapshot):
    for archive in sorted(snapshot.path.rglob('*.tar.gz')):
        subprocess.run(['gzip', '--test', str(archive)], check=True, timeout=900)
    with (snapshot.path / 'database.dump').open('rb') as database:
        subprocess.run(['docker', 'exec', '-i', 'infra-postgres', 'pg_restore', '--list'],
                       stdin=database, stdout=subprocess.DEVNULL, check=True, timeout=120)


def apply_retention(root, protected, candidates, audit_root=AUDIT_ROOT):
    if not candidates:
        return
    if len(protected) < KEEP_COUNT:
        raise ValueError('At least three protected snapshots are required')
    for snapshot in protected:
        verify_snapshot(snapshot)
    # Re-plan after verification so a concurrent deploy or changed marker aborts deletion.
    if (protected, candidates) != plan_retention(root):
        raise ValueError('Backup inventory changed during verification; retry later')
    audit_root.mkdir(parents=True, exist_ok=True)
    stamp = datetime.now(timezone.utc).strftime('%Y%m%dT%H%M%S%fZ')
    inventory = {'protected': [str(item.path) for item in protected],
                 'candidates': [{'path': str(item.path), 'bytes': item.size} for item in candidates]}
    audit_path = audit_root / f'snapshot-retention-{stamp}.json'
    with audit_path.open('x', encoding='utf-8') as audit:
        json.dump(inventory, audit, indent=2)
        audit.flush()
        os.fsync(audit.fileno())
    for snapshot in candidates:
        check_root(root)
        if snapshot.path.parent != root or inspect_snapshot(snapshot.path) != snapshot:
            raise ValueError(f'Snapshot changed before deletion: {snapshot.path}')
        shutil.rmtree(snapshot.path)
        print(f'DELETED {snapshot.path}', flush=True)
    print(f'Audit inventory: {audit_path}', flush=True)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--apply', action='store_true', help='Delete eligible snapshots after verification')
    args = parser.parse_args()
    protected, candidates = plan_retention(BACKUP_ROOT)
    print(json.dumps({'mode': 'apply' if args.apply else 'preview',
                      'keep_days': KEEP_DAYS, 'minimum_complete_snapshots': KEEP_COUNT,
                      'protected': [str(item.path) for item in protected],
                      'candidate_count': len(candidates),
                      'candidate_bytes': sum(item.size for item in candidates),
                      'candidates': [str(item.path) for item in candidates]}, indent=2), flush=True)
    if args.apply:
        apply_retention(BACKUP_ROOT, protected, candidates)


if __name__ == '__main__':
    main()
