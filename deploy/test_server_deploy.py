"""Offline safety checks for the guarded personal-site deployer."""

from __future__ import annotations

import sys
import unittest
from pathlib import Path
from unittest.mock import patch

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


if __name__ == "__main__":
    unittest.main()
