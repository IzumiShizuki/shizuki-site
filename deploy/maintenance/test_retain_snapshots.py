import os
from pathlib import Path
import shutil
import tempfile
import time
import unittest
from unittest.mock import patch

import retain_snapshots as retention


class RetentionSafetyTests(unittest.TestCase):
    def setUp(self):
        self.temp = tempfile.TemporaryDirectory()
        self.addCleanup(self.temp.cleanup)
        self.base = Path(self.temp.name).resolve()
        self.root = self.base / 'backups'
        self.root.mkdir()
        self.now = time.time()

    def snapshot(self, number, age_days, complete=True):
        path = self.root / f'snapshot-20260901-120000-{number:012x}'
        path.mkdir()
        for name in retention.REQUIRED:
            if name == 'READY' and not complete:
                continue
            (path / name).write_bytes(b'backup')
        (path / 'volumes.list').write_text('site-data\n')
        (path / 'volumes').mkdir()
        (path / 'volumes/site-data.tar.gz').write_bytes(b'archive')
        if complete:
            completed = self.now - age_days * 86400
            os.utime(path / 'READY', (completed, completed))
        return path

    def seed(self):
        return [self.snapshot(n, age) for n, age in enumerate((1, 2, 3, 13, 20), 1)]

    def test_preview_keeps_recent_and_does_not_change_files(self):
        paths = self.seed()
        incomplete = self.snapshot(6, 90, complete=False)
        custom = self.root / 'manual-backup'
        custom.mkdir()
        protected, candidates = retention.plan_retention(self.root, self.now)
        self.assertEqual([item.path for item in protected], paths[:3])
        self.assertEqual([item.path for item in candidates], paths[-1:])
        self.assertTrue(all(path.exists() for path in paths + [incomplete, custom]))

    def test_always_keeps_three_newest_even_when_all_are_old(self):
        paths = [self.snapshot(n, 30 + n) for n in range(1, 6)]
        protected, candidates = retention.plan_retention(self.root, self.now)
        self.assertEqual([item.path for item in protected], paths[:3])
        self.assertEqual([item.path for item in candidates], paths[3:])

    def test_fewer_than_three_complete_snapshots_never_deletes(self):
        self.snapshot(1, 90)
        self.snapshot(2, 80)
        self.assertEqual(retention.plan_retention(self.root, self.now)[1], [])

    def test_missing_volume_archive_preserves_incomplete_snapshot(self):
        paths = self.seed()
        (paths[-1] / 'volumes/site-data.tar.gz').unlink()
        self.assertEqual(retention.plan_retention(self.root, self.now)[1], [])

    def test_rejects_volume_path_traversal(self):
        paths = self.seed()
        (paths[-1] / 'volumes.list').write_text('../../outside\n')
        with self.assertRaises(ValueError):
            retention.plan_retention(self.root, self.now)

    def test_rejects_symlink_inside_snapshot(self):
        paths = self.seed()
        outside = self.base / 'outside'
        outside.write_text('keep')
        try:
            (paths[-1] / 'linked-file').symlink_to(outside)
        except OSError:
            self.skipTest('Host cannot create symlinks; covered on the Linux server')
        with self.assertRaises(ValueError):
            retention.plan_retention(self.root, self.now)
        self.assertEqual(outside.read_text(), 'keep')

    def test_rejects_symlink_backup_root(self):
        linked = self.base / 'linked-root'
        try:
            linked.symlink_to(self.root, target_is_directory=True)
        except OSError:
            self.skipTest('Host cannot create symlinks; covered on the Linux server')
        with self.assertRaises(ValueError):
            retention.plan_retention(linked, self.now)

    def test_rejects_snapshot_symlink_pointing_outside_backup_root(self):
        self.seed()
        outside = self.base / 'outside-directory'
        outside.mkdir()
        linked = self.root / 'snapshot-20260901-120000-000000000009'
        try:
            linked.symlink_to(outside, target_is_directory=True)
        except OSError:
            self.skipTest('Host cannot create symlinks; covered on the Linux server')
        with self.assertRaises(ValueError):
            retention.plan_retention(self.root, self.now)
        self.assertTrue(outside.exists())

    def test_failed_verification_deletes_nothing(self):
        paths = self.seed()
        protected, candidates = retention.plan_retention(self.root)
        with patch.object(retention, 'verify_snapshot', side_effect=ValueError('bad gzip')):
            with self.assertRaises(ValueError):
                retention.apply_retention(self.root, protected, candidates, self.base / 'audit')
        self.assertTrue(all(path.exists() for path in paths))

    def test_changed_inventory_aborts_before_deletion(self):
        paths = self.seed()
        protected, candidates = retention.plan_retention(self.root)
        with patch.object(retention, 'verify_snapshot'):
            (paths[-1] / 'database.dump').write_bytes(b'changed size')
            with self.assertRaises(ValueError):
                retention.apply_retention(self.root, protected, candidates, self.base / 'audit')
        self.assertTrue(paths[-1].exists())

    def test_apply_records_inventory_then_deletes_only_candidates(self):
        paths = self.seed()
        protected, candidates = retention.plan_retention(self.root)
        audit = self.base / 'audit'
        actual_delete = shutil.rmtree

        def checked_delete(path):
            self.assertEqual(path, paths[-1])
            self.assertEqual(len(list(audit.glob('snapshot-retention-*.json'))), 1)
            actual_delete(path)

        with patch.object(retention, 'verify_snapshot') as verify:
            with patch.object(retention.shutil, 'rmtree', side_effect=checked_delete):
                retention.apply_retention(self.root, protected, candidates, audit)
        self.assertEqual(verify.call_count, 3)
        self.assertTrue(all(path.exists() for path in paths[:-1]))
        self.assertFalse(paths[-1].exists())
        self.assertEqual(retention.plan_retention(self.root)[1], [])


if __name__ == '__main__':
    unittest.main()
