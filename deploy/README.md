# Server Deploy

## Main entry points

- Double click `deploy/update-code-and-deploy.bat`
  - Upload the current project to `111.228.35.186:/opt/shizuki-site`
  - Keep `deploy/.env.server` and `data/` on the server
  - Trigger the remote rebuild runner and wait for the final result
- Double click `deploy/restart-only.bat`
  - Restart the existing containers on the server
  - Do not upload code
  - Do not rebuild images

## Runtime

- Both BAT files now call `deploy/server_deploy.py`
- They no longer depend on WSL, Git Bash, `sshpass`, or local `rsync`
- Required local runtime: `D:\environment\anaconda3\envs\py314\python.exe`

## Manual fallback

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.server.yml --env-file .env.server up -d --build
docker compose -f docker-compose.server.yml --env-file .env.server ps
```
