from io import BytesIO
from pathlib import Path
import tempfile
import unittest
from zipfile import ZipFile, ZIP_STORED, ZIP_DEFLATED

import overlay_backend as tool


class OverlayTests(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory()
        self.addCleanup(self.tmp.cleanup)
        self.root = Path(self.tmp.name)
        self.base = self.root / "active.jar"
        self.output = self.root / "candidate.jar"
        self.proof = self.root / "proof.json"
        self.candidate = self.root / "source"
        self.inner_content = tool.BOOT_LIB + "content-service-0.1.0-SNAPSHOT.jar"
        self.inner_model = tool.BOOT_LIB + "site-model-0.1.0-SNAPSHOT.jar"
        self.dj_class = tool.SITE + "content/bible/DjMembershipService.class"
        self.dj_migration = tool.BOOT_CLASSES + "monolith/db/migration-pg/V1106__dj_checkin_receipts.sql"
        self.filter = tool.BOOT_CLASSES + tool.FILTER + ".class"
        self.filter_aux = tool.BOOT_CLASSES + tool.FILTER + "$AuthContext.class"
        self.write_candidate(tool.MONO_CLASSES, [tool.FILTER + ".class", tool.FILTER + "$AuthContext.class", *tool.MIGRATIONS])
        self.write_candidate(tool.MODEL_CLASSES, tool.MODEL_NAMES)
        self.write_candidate(tool.CONTENT_CLASSES, [*tool.MAPPER_NAMES, *tool.CONTENT_REQUIRED])

    def write_candidate(self, root, paths):
        for name in paths:
            dest = self.candidate / root / name
            dest.parent.mkdir(parents=True, exist_ok=True)
            dest.write_bytes(("compiled:" + name).encode())

    @staticmethod
    def jar(entries):
        stream = BytesIO()
        with ZipFile(stream, "w") as archive:
            for name, data in entries:
                archive.writestr(name, data)
        return stream.getvalue()

    def make_base(self, nested_compression=ZIP_STORED, collision=False):
        content = [(tool.MAPPER_NAMES[0], b"live mapper"), (self.dj_class, b"live DJ class")]
        if collision:
            content.append((tool.CONTENT_REQUIRED[0], b"already exists; refuse unverified upgrade"))
        with ZipFile(self.base, "w") as archive:
            archive.writestr(self.inner_content, self.jar(content), compress_type=nested_compression)
            archive.writestr(self.inner_model, self.jar([("existing-model.class", b"unchanged")]), compress_type=ZIP_STORED)
            archive.writestr(self.filter, b"live DJ filter")
            archive.writestr(self.filter_aux, b"live DJ nested class")
            archive.writestr(self.dj_migration, b"live immutable DJ migration")
            archive.writestr("BOOT-INF/classpath.idx", b"live classpath index")

    def test_overlay_keeps_dj_and_nested_spring_boot_storage(self):
        self.make_base()
        observed = tool.overlay(self.base, tool.file_sha(self.base), self.candidate, self.output, self.proof)
        self.assertTrue(self.proof.exists())
        self.assertEqual(observed["content"]["replaced"], [tool.MAPPER_NAMES[0]])
        self.assertEqual(len(observed["outer"]["added"]), 2)
        self.assertEqual(observed["outer"]["preserved"], 2)
        with ZipFile(self.output) as output:
            self.assertEqual(output.getinfo(self.inner_content).compress_type, ZIP_STORED)
            self.assertEqual(output.getinfo(self.inner_model).compress_type, ZIP_STORED)
            self.assertEqual(output.read(self.dj_migration), b"live immutable DJ migration")
            with ZipFile(BytesIO(output.read(self.inner_content))) as content:
                self.assertEqual(content.read(self.dj_class), b"live DJ class")
                self.assertIn(tool.CONTENT_REQUIRED[0], content.namelist())

    def test_rejects_bad_pin_and_changed_boot_storage(self):
        self.make_base(nested_compression=ZIP_DEFLATED)
        with self.assertRaisesRegex(ValueError, "checksum mismatch"):
            tool.overlay(self.base, "0" * 64, self.candidate, self.output, self.proof)
        with self.assertRaisesRegex(ValueError, "ZIP_STORED"):
            tool.overlay(self.base, tool.file_sha(self.base), self.candidate, self.output, self.proof)
        self.assertFalse(self.output.exists())

    def test_rejects_unexpected_existing_feature_path(self):
        self.make_base(collision=True)
        with self.assertRaisesRegex(ValueError, "narrow overlay"):
            tool.overlay(self.base, tool.file_sha(self.base), self.candidate, self.output, self.proof)
        self.assertFalse(self.output.exists())
