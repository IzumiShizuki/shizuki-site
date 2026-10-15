#!/usr/bin/env python3
"""Preview or prune unused generated website images with rollback protection."""

import argparse
from datetime import datetime, timezone
import json
import os
from pathlib import Path
import re
import subprocess
import time

REPOSITORIES = {'shizuki-site/backend', 'shizuki-site/site'}
BACKUP_ROOT = Path('/opt/shizuki-site-backups')
AUDIT_ROOT = Path('/var/log/shizuki-disk-maintenance')
KEEP_DAYS = 7
KEEP_COUNT = 3


def docker_json(*args):
    return json.loads(subprocess.check_output(['docker', *args], text=True, timeout=120))


def container_images():
    ids = subprocess.check_output(['docker', 'ps', '-aq'], text=True, timeout=30).split()
    return {row['Image'] for row in docker_json('inspect', *ids)} if ids else set()


def backup_references(root=BACKUP_ROOT):
    if root.is_symlink() or root.resolve(strict=True) != root.absolute():
        raise ValueError('Backup root must be canonical')
    references = set()
    for path in root.glob('*/*.json'):
        if path.is_symlink() or path.parent.is_symlink():
            raise ValueError(f'Unsafe backup record: {path}')
        # Validate records before extracting hashes; malformed records abort pruning.
        content = path.read_text()
        json.loads(content)
        references.update(re.findall(r'sha256:[0-9a-f]{64}', content))
    return references


def created_at(image):
    return datetime.fromisoformat(image['Created'].replace('Z', '+00:00')).timestamp()


def select_images(images, used, backup_refs, now=None):
    protected = used | backup_refs
    for repository in REPOSITORIES:
        versions = [image for image in images if any(
            tag.rsplit(':', 1)[0] == repository for tag in image.get('RepoTags') or [])]
        versions.sort(key=created_at, reverse=True)
        protected.update(image['Id'] for image in versions[:KEEP_COUNT])
    cutoff = (time.time() if now is None else now) - KEEP_DAYS * 86400
    candidates = []
    for image in images:
        tags = image.get('RepoTags') or []
        if (tags and all(tag.rsplit(':', 1)[0] in REPOSITORIES for tag in tags)
                and image['Id'] not in protected and created_at(image) < cutoff):
            candidates.append(image)
    return sorted(candidates, key=created_at, reverse=True)


def apply_images(candidates, audit_root=AUDIT_ROOT):
    if not candidates:
        return
    audit_root.mkdir(parents=True, exist_ok=True)
    stamp = datetime.now(timezone.utc).strftime('%Y%m%dT%H%M%S%fZ')
    audit_path = audit_root / f'image-retention-{stamp}.json'
    with audit_path.open('x', encoding='utf-8') as audit:
        json.dump(candidates, audit, indent=2)
        audit.flush()
        os.fsync(audit.fileno())
    for candidate in candidates:
        if candidate['Id'] in container_images() | backup_references():
            print('SKIP newly protected image ' + candidate['Id'], flush=True)
            continue
        current = docker_json('image', 'inspect', candidate['Id'])[0]
        if set(current.get('RepoTags') or []) != set(candidate['tags']):
            raise ValueError('Image tags changed; re-run preview before cleanup')
        # Docker rejects removal of an image in use. Never use --force.
        subprocess.run(['docker', 'image', 'rm', *candidate['tags']], check=True, timeout=120)
        print('REMOVED image references ' + candidate['Id'], flush=True)
    print('Audit inventory: ' + str(audit_path), flush=True)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--apply', action='store_true')
    args = parser.parse_args()
    ids = set(subprocess.check_output(['docker', 'image', 'ls', '-aq'], text=True, timeout=30).split())
    images = docker_json('image', 'inspect', *sorted(ids)) if ids else []
    selected = select_images(images, container_images(), backup_references())
    candidates = [{'Id': image['Id'], 'tags': image['RepoTags'],
                   'digests': image.get('RepoDigests') or [], 'created': image['Created']}
                  for image in selected]
    print(json.dumps({'mode': 'apply' if args.apply else 'preview',
                      'candidate_count': len(candidates), 'candidates': candidates}, indent=2), flush=True)
    if args.apply:
        apply_images(candidates)


if __name__ == '__main__':
    main()
