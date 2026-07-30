# Server Deployment Runtime

## Main entry point

- Double click `../build-push-deploy.bat`
  - Requires a clean, committed worktree
  - Pulls the current branch, runs frontend tests and the production build
  - Requests confirmation, then pushes to `origin` and deploys to `111.228.35.186:/opt/shizuki-site`
  - Keeps `deploy/.env.server` and `data/` on the server

## Runtime

- `server_deploy_fast.py` performs the Windows-native incremental upload and remote rebuild
- It does not depend on WSL, Git Bash, `sshpass`, or local `rsync`
- Required local runtime: `D:\environment\anaconda3\envs\py314\python.exe`

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
