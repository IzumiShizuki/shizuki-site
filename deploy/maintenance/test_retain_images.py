from datetime import datetime, timezone
import json
from pathlib import Path
import tempfile
import time
import unittest
from unittest.mock import patch

import retain_images as retention


class ImageRetentionTests(unittest.TestCase):
    def setUp(self):
        self.now = time.time()

    def image(self, number, age, repository='shizuki-site/backend'):
        return {'Id': f'sha256:{number:064x}', 'RepoTags': [f'{repository}:version-{number}'],
                'Created': datetime.fromtimestamp(self.now - age * 86400, timezone.utc).isoformat()}

    def test_keeps_container_backup_and_newest_three_references(self):
        images = [self.image(n, n + 10) for n in range(1, 8)]
        selected = retention.select_images(images, {images[3]['Id']}, {images[4]['Id']}, self.now)
        self.assertEqual([row['Id'] for row in selected], [row['Id'] for row in images[5:]])

    def test_keeps_recent_images_and_repositories_outside_allowlist(self):
        images = [self.image(n, n) for n in range(1, 7)]
        images.append(self.image(8, 60, 'meguri-core-java'))
        self.assertEqual(retention.select_images(images, set(), set(), self.now), [])

    def test_keeps_image_with_alias_outside_managed_repositories(self):
        images = [self.image(n, n + 10) for n in range(1, 5)]
        images[-1]['RepoTags'].append('manual-keep:rollback')
        self.assertEqual(retention.select_images(images, set(), set(), self.now), [])

    def test_keeps_three_versions_independently_for_each_repository(self):
        images = [self.image(n, n + 10, repo) for repo in retention.REPOSITORIES for n in range(1, 4)]
        self.assertEqual(retention.select_images(images, set(), set(), self.now), [])

    def test_backup_record_hashes_are_protected_and_invalid_json_aborts(self):
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp).resolve()
            (root / 'backup').mkdir()
            record = root / 'backup' / 'release.json'
            record.write_text(json.dumps({'previous': f'sha256:{42:064x}'}))
            self.assertEqual(retention.backup_references(root), {f'sha256:{42:064x}'})
            record.write_text('incomplete record')
            with self.assertRaises(ValueError):
                retention.backup_references(root)

    def test_rechecks_new_container_reference_before_deletion(self):
        candidate = {'Id': f'sha256:{42:064x}', 'tags': ['shizuki-site/backend:old']}
        with tempfile.TemporaryDirectory() as temp:
            with patch.object(retention, 'container_images', return_value={candidate['Id']}):
                with patch.object(retention, 'backup_references', return_value=set()):
                    with patch.object(retention.subprocess, 'run') as remove:
                        retention.apply_images([candidate], Path(temp))
            remove.assert_not_called()
            self.assertEqual(len(list(Path(temp).glob('image-retention-*.json'))), 1)

    def test_tag_changes_abort_without_removal(self):
        candidate = {'Id': f'sha256:{42:064x}', 'tags': ['shizuki-site/backend:old']}
        with tempfile.TemporaryDirectory() as temp:
            with patch.object(retention, 'container_images', return_value=set()):
                with patch.object(retention, 'backup_references', return_value=set()):
                    with patch.object(retention, 'docker_json', return_value=[{'RepoTags': ['changed:tag']}]):
                        with patch.object(retention.subprocess, 'run') as remove:
                            with self.assertRaises(ValueError):
                                retention.apply_images([candidate], Path(temp))
            remove.assert_not_called()

    def test_successful_removal_records_inventory_and_never_forces(self):
        candidate = {'Id': f'sha256:{42:064x}', 'tags': ['shizuki-site/backend:old']}
        with tempfile.TemporaryDirectory() as temp:
            def check_remove(command, **kwargs):
                self.assertEqual(command, ['docker', 'image', 'rm', 'shizuki-site/backend:old'])
                self.assertTrue(list(Path(temp).glob('image-retention-*.json')))

            with patch.object(retention, 'container_images', return_value=set()):
                with patch.object(retention, 'backup_references', return_value=set()):
                    with patch.object(retention, 'docker_json', return_value=[{'RepoTags': candidate['tags']}]):
                        with patch.object(retention.subprocess, 'run', side_effect=check_remove) as remove:
                            retention.apply_images([candidate], Path(temp))
            remove.assert_called_once()


if __name__ == '__main__':
    unittest.main()
