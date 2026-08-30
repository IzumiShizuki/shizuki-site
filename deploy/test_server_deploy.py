"""Offline safety checks for the guarded personal-site deployer."""

from __future__ import annotations

import io
import sys
import tempfile
import unittest
from pathlib import Path
from unittest.mock import Mock, patch

sys.path.insert(0, str(Path(__file__).resolve().parent))
import server_deploy as deploy


def config() -> deploy.DeployConfig:
    return deploy.DeployConfig(
        host=deploy.PERSONAL_SITE_HOST,
        user="deploy-user",
        password=None,
        remote_app_dir="/opt/shizuki-site",
        remote_deploy_dir="/opt/shizuki-site/deploy",
        upload_retries=1,
        deploy_timeout_seconds=60,
        deploy_poll_interval_seconds=1,
        ssh_key_path="C:/private/key",
        known_hosts_path="C:/private/known_hosts",
        remote_backup_dir="/opt/shizuki-site-backups",
        database_backup_command="private database backup command",
        database_restore_command="private database restore command",
    )


class ServerDeploySafetyTest(unittest.TestCase):
    def test_git_name_status_parser_handles_file_and_tree_changes(self) -> None:
        raw = (
            b"A\0apps/new.java\0"
            b"M\0deploy/server_deploy.py\0"
            b"D\0docs/old.md\0"
            b"R100\0fronted/old.vue\0fronted/new.vue\0"
            b"C100\0docs/source.md\0docs/copy.md\0"
        )

        uploads, deletions = deploy.parse_git_name_status(raw)

        self.assertEqual(
            uploads,
            {
                "apps/new.java",
                "deploy/server_deploy.py",
                "fronted/new.vue",
                "docs/copy.md",
            },
        )
        self.assertEqual(deletions, {"docs/old.md", "fronted/old.vue"})

    def test_incremental_plan_filters_excluded_and_protected_paths(self) -> None:
        raw = (
            b"M\0deploy/server_deploy.py\0"
            b"M\0resouces/yaml/common-config.yaml\0"
            b"D\0data/private.bin\0"
            b"R100\0deploy/.env.server\0deploy/public.env.example\0"
        )

        plan = deploy.incremental_plan_from_git_status("a" * 40, "b" * 40, raw)

        self.assertEqual(
            plan.upload_paths,
            ("deploy/public.env.example", "deploy/server_deploy.py"),
        )
        self.assertEqual(plan.delete_paths, ())

    def test_valid_ancestor_marker_selects_incremental_plan(self) -> None:
        base = "a" * 40
        target = "b" * 40
        with (
            patch.object(deploy, "read_command", return_value=(0, base + "\n", "")),
            patch.object(deploy, "run_git", return_value="") as run_git,
            patch.object(
                deploy,
                "run_git_bytes",
                return_value=b"M\0deploy/server_deploy.py\0",
            ),
        ):
            plan = deploy.prepare_incremental_sync_plan(object(), config(), target)

        self.assertIsNotNone(plan)
        assert plan is not None
        self.assertEqual(plan.base_commit, base)
        self.assertEqual(plan.target_commit, target)
        self.assertEqual(plan.upload_paths, ("deploy/server_deploy.py",))
        self.assertEqual(run_git.call_count, 2)

    def test_untrusted_markers_fall_back_to_full_reconciliation(self) -> None:
        target = "b" * 40
        cases = [
            (1, "", "missing"),
            (0, "not-a-commit\n", ""),
        ]
        for code, out, err in cases:
            with self.subTest(out=out, code=code), patch.object(
                deploy, "read_command", return_value=(code, out, err)
            ):
                self.assertIsNone(
                    deploy.prepare_incremental_sync_plan(object(), config(), target)
                )

        with (
            patch.object(deploy, "read_command", return_value=(0, "a" * 40, "")),
            patch.object(deploy, "run_git", side_effect=RuntimeError("unknown commit")),
        ):
            self.assertIsNone(
                deploy.prepare_incremental_sync_plan(object(), config(), target)
            )

        with patch.object(deploy, "read_command", side_effect=OSError("read failed")):
            self.assertIsNone(
                deploy.prepare_incremental_sync_plan(object(), config(), target)
            )

    def test_incremental_sync_routes_to_fast_path_or_full_fallback(self) -> None:
        plan = deploy.IncrementalSyncPlan(
            base_commit="a" * 40,
            target_commit="b" * 40,
            upload_paths=("deploy/server_deploy.py",),
            delete_paths=(),
        )
        with (
            patch.object(deploy, "prepare_incremental_sync_plan", return_value=plan),
            patch.object(deploy, "apply_incremental_sync") as apply_incremental,
            patch.object(deploy, "full_sync_project") as full_sync,
        ):
            deploy.sync_project(object(), config(), "b" * 40)
        apply_incremental.assert_called_once()
        full_sync.assert_not_called()

        with (
            patch.object(deploy, "prepare_incremental_sync_plan", return_value=None),
            patch.object(deploy, "apply_incremental_sync") as apply_incremental,
            patch.object(deploy, "full_sync_project") as full_sync,
        ):
            deploy.sync_project(object(), config(), "b" * 40)
        apply_incremental.assert_not_called()
        full_sync.assert_called_once()

    def test_incremental_upload_hash_must_match_remote_content(self) -> None:
        with tempfile.TemporaryDirectory() as temporary_dir:
            local_path = Path(temporary_dir) / "payload.txt"
            local_path.write_bytes(b"verified payload")
            sftp = Mock()
            sftp.open.return_value = io.BytesIO(b"verified payload")

            deploy.verify_remote_upload(sftp, local_path, "/remote/payload.txt")

            sftp.open.return_value = io.BytesIO(b"corrupted payload")
            with self.assertRaisesRegex(RuntimeError, "verification failed"):
                deploy.verify_remote_upload(sftp, local_path, "/remote/payload.txt")

    def test_incremental_deletion_targets_only_the_exact_approved_path(self) -> None:
        plan = deploy.IncrementalSyncPlan(
            base_commit="a" * 40,
            target_commit="b" * 40,
            upload_paths=(),
            delete_paths=("docs/obsolete.md",),
        )
        sftp = Mock()
        ssh = Mock()
        ssh.open_sftp.return_value = sftp
        with (
            patch.object(deploy, "ensure_remote_dir"),
            patch.object(deploy, "remove_remote_tree") as remove_remote_tree,
        ):
            deploy.apply_incremental_sync(ssh, config(), plan)

        remove_remote_tree.assert_called_once_with(
            sftp, "/opt/shizuki-site/docs/obsolete.md"
        )
        sftp.close.assert_called_once()

    def test_phase_timing_output_contains_no_private_command(self) -> None:
        messages: list[str] = []
        with (
            patch.object(deploy.time, "perf_counter", return_value=15.25),
            patch.object(deploy, "log", side_effect=messages.append),
        ):
            deploy.log_phase_timing("synchronization", 10.0)

        self.assertEqual(messages, ["[timing] synchronization: 5.2s"])
        self.assertNotIn("database", messages[0].lower())

    def test_remote_runner_records_terminal_status_even_with_errexit(self) -> None:
        runner = Path(__file__).resolve().parent / "scripts" / "remote-compose-build.sh"
        source = runner.read_text(encoding="utf-8")

        self.assertIn("trap finalize_deploy EXIT", source)
        self.assertIn('echo "FAILED ${rc}', source)
        self.assertNotIn("run_deploy >> \"${LOG_FILE}\" 2>&1\nrc=$?", source)

    def test_frontend_image_uses_declared_pnpm_lockfile(self) -> None:
        dockerfile = Path(__file__).resolve().parent.parent / "docker" / "Dockerfile.frontend"
        source = dockerfile.read_text(encoding="utf-8")

        self.assertIn("library/node:24-alpine", source)
        self.assertIn("pnpm-lock.yaml", source)
        self.assertIn("pnpm install --frozen-lockfile", source)
        self.assertIn("RUN pnpm build", source)
        self.assertNotIn("RUN npm ci", source)

    def test_backend_image_reuses_maven_repository_cache(self) -> None:
        dockerfile = Path(__file__).resolve().parent.parent / "docker" / "Dockerfile.backend"
        source = dockerfile.read_text(encoding="utf-8")

        self.assertIn("# syntax=docker/dockerfile:", source)
        self.assertIn("--mount=type=cache", source)
        self.assertIn("target=/root/.m2/repository", source)
        self.assertIn("sharing=locked", source)
        self.assertNotIn("clean package", source)

    def test_remote_runner_does_not_force_recreate_unchanged_services(self) -> None:
        runner = Path(__file__).resolve().parent / "scripts" / "remote-compose-build.sh"
        source = runner.read_text(encoding="utf-8")

        self.assertIn("up -d --no-build", source)
        self.assertNotIn("--force-recreate", source)

    def test_snapshot_id_rejects_non_git_commit(self) -> None:
        self.assertRegex(
            deploy.make_snapshot_id("a" * 40),
            r"^snapshot-\d{8}-\d{6}-a{12}$",
        )
        with self.assertRaisesRegex(RuntimeError, "valid Git object"):
            deploy.make_snapshot_id("not-a-commit")

    def test_backup_directory_must_be_external_to_synced_app(self) -> None:
        unsafe = deploy.DeployConfig(
            **{**config().__dict__, "remote_backup_dir": "/opt/shizuki-site/backups"}
        )
        with self.assertRaisesRegex(RuntimeError, "outside REMOTE_APP_DIR"):
            deploy.validate_backup_path(unsafe)

    def test_remote_app_and_deploy_paths_cannot_be_broadened(self) -> None:
        unsafe = deploy.DeployConfig(
            **{
                **config().__dict__,
                "remote_app_dir": "/",
                "remote_deploy_dir": "/deploy",
            }
        )
        with self.assertRaisesRegex(RuntimeError, "locked to /opt/shizuki-site"):
            deploy.validate_remote_app_paths(unsafe)

    def test_backup_and_restore_commands_are_both_required(self) -> None:
        missing_restore = deploy.DeployConfig(
            **{**config().__dict__, "database_restore_command": None}
        )
        with self.assertRaisesRegex(RuntimeError, "BACKUP_COMMAND.*RESTORE_COMMAND"):
            deploy.require_backup_configuration(missing_restore)

    def test_only_local_unauthenticated_health_urls_are_accepted(self) -> None:
        deploy.validate_loopback_url("http://127.0.0.1:5173/", "DEPLOY_SITE_URL")
        with self.assertRaisesRegex(RuntimeError, "DEPLOY_SITE_URL"):
            deploy.validate_loopback_url("https://example.com/", "DEPLOY_SITE_URL")

    def test_create_backup_uses_silent_commands_and_marks_snapshot_ready(self) -> None:
        commands: list[tuple[str, str]] = []
        messages: list[str] = []

        def record(_ssh, command: str, operation: str, timeout=None) -> None:
            commands.append((operation, command))

        with (
            patch.object(deploy, "require_success_silently", side_effect=record),
            patch.object(deploy, "log", side_effect=messages.append),
        ):
            backup = deploy.create_remote_backup(object(), config(), "b" * 40)

        self.assertTrue(backup.snapshot_dir.startswith("/opt/shizuki-site-backups/snapshot-"))
        self.assertEqual(
            [operation for operation, _ in commands],
            [
                "Application/configuration backup",
                "Docker volume backup",
                "Database backup",
                "Backup finalization",
            ],
        )
        self.assertIn("docker compose", commands[1][1])
        self.assertIn("READY", commands[-1][1])
        self.assertNotIn("private database backup command", "\n".join(messages))

    def test_restore_rebuilds_from_ready_snapshot_before_health_checks(self) -> None:
        commands: list[tuple[str, str]] = []

        def record(_ssh, command: str, operation: str, timeout=None) -> None:
            commands.append((operation, command))

        backup = deploy.RemoteBackup(
            snapshot_dir="/opt/shizuki-site-backups/snapshot-20260830-010101-cccccccccccc",
            app_archive="/opt/shizuki-site-backups/snapshot-20260830-010101-cccccccccccc/app.tar.gz",
            database_archive="/opt/shizuki-site-backups/snapshot-20260830-010101-cccccccccccc/database.dump",
            volume_list="/opt/shizuki-site-backups/snapshot-20260830-010101-cccccccccccc/volumes.list",
            snapshot_id="snapshot-20260830-010101-cccccccccccc",
        )
        with (
            patch.object(deploy, "require_success_silently", side_effect=record),
            patch.object(deploy, "log"),
        ):
            deploy.restore_remote_backup(object(), config(), backup)

        self.assertEqual(
            [operation for operation, _ in commands],
            [
                "Application/configuration rollback",
                "Database rollback",
                "Docker volume rollback",
                "Rollback service rebuild",
            ],
        )
        self.assertIn("READY", commands[0][1])
        self.assertIn("docker compose", commands[-1][1])

    def test_successful_deploy_records_exact_commit_atomically(self) -> None:
        commands: list[tuple[str, str]] = []

        def record(_ssh, command: str, operation: str, timeout=None) -> None:
            commands.append((operation, command))

        commit = "d" * 40
        with patch.object(deploy, "require_success_silently", side_effect=record):
            deploy.record_remote_deployed_commit(object(), config(), commit)

        self.assertEqual([operation for operation, _ in commands], ["Deployed commit recording"])
        command = commands[0][1]
        self.assertIn(commit, command)
        self.assertIn(".deployed-commit.tmp", command)
        self.assertIn(".deployed-commit", command)
        self.assertIn("mv", command)


if __name__ == "__main__":
    unittest.main()
