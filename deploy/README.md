# Server Deployment Runtime

## Main entry point

- Double click `../build-push-deploy.bat`
  - Requires a clean local `master` that exactly matches fetched `origin/master`
  - Fast-forwards `master`, runs frontend tests and the production build
  - Requires `REMOTE_USER`, `REMOTE_KNOWN_HOSTS`, exactly one private authentication source (`REMOTE_SSH_KEY_PATH` recommended, or `REMOTE_PASS`), plus private database backup and restore commands
  - Requests confirmation, then pushes `master` and deploys only to `111.228.35.186:/opt/shizuki-site`
  - Keeps `deploy/.env.server`, private YAML configuration, `data/`, and generated desktop/release/prototype artifacts out of the upload and preserves the remote private files
  - Creates a restore point outside the synchronized app tree before any upload: application/private configuration, bind-mounted data, Compose named volumes, and a database dump
  - Rejects unknown SSH host keys and checks both `/actuator/health` for `status=UP` and the site entry after the remote rebuild; any failed update gate automatically restores and rechecks the snapshot

## Runtime

- `server_deploy.py` performs the Windows-native incremental upload and remote rebuild
- It does not depend on WSL, Git Bash, `sshpass`, or local `rsync`
- Required local runtime: `D:\environment\anaconda3\envs\py314\python.exe`

## Private deployment setup

Keep credentials outside this repository. Before publishing, load these values from the user's existing private secret source or shell profile:

```text
REMOTE_USER=<deployment-account>
REMOTE_KNOWN_HOSTS=<absolute-path-to-known_hosts>
REMOTE_SSH_KEY_PATH=<absolute-path-to-private-key>
```

`REMOTE_PASS` is supported only as an alternative to `REMOTE_SSH_KEY_PATH`; never define both. The deployment helper never accepts a repository-stored fallback credential and refuses an unknown server key.

The backup/rollback pair is also private deployment configuration. Both commands run on the server with `DEPLOY_DATABASE_BACKUP_PATH` set to the snapshot's database archive path; the helper neither prints the command nor its output. The backup command must create a non-empty archive at that path, and the restore command must restore from it.

```text
DEPLOY_DATABASE_BACKUP_COMMAND=<private database backup command>
DEPLOY_DATABASE_RESTORE_COMMAND=<private database restore command>
```

The Docker image `busybox:1.36` must already be available on the server; it is used offline to archive and restore Compose named volumes. The compatibility file `server_deploy_fast.py` no longer has a bypass path and delegates to the same guarded workflow.

To inspect the allowed upload payload without connecting to the server, generate a local manifest from a clean `master` checkout:

```powershell
& D:\environment\anaconda3\envs\py314\python.exe deploy/server_deploy.py update --dry-run-manifest deploy/deploy-manifest.local.json
```

The manifest is ignored by Git. Review it before a manual deployment when the payload changes.

## Manual fallback

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.server.yml --env-file .env.server up -d --build
docker compose -f docker-compose.server.yml --env-file .env.server ps
```

## Notion MCP sidecar

- Service name: `notion-mcp-sidecar`
- Default port: `39051`
- Default MCP endpoint: `/mcp/notion`
- Health endpoint: `/healthz`
- The sidecar reads Notion credentials from `resouces/yaml/common-config.yaml`
- It also requires `NOTION_MCP_SERVER_TOKEN` in `deploy/.env.server`
