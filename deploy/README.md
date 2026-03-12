# Server Deployment (Frontend + Backend)

## 1) Prepare env

```bash
cd /path/to/shizuki-site/deploy
cp .env.server.example .env.server
# edit .env.server with real DB/Redis/JWT values
# required: SHIZUKI_MUSIC_SECURITY_KEY_ENCRYPTION_MASTER_KEY must be base64 of 32 bytes
# example generation: openssl rand -base64 32
# music search key now comes from: ../resouces/yaml/common-config.yaml
# field: shizuki.music.tunehub.default-api-key
# if OSS is not configured yet, keep OSS_VALIDATE_BUCKETS_ON_STARTUP=false
```

## 2) Build and start

```bash
docker compose -f docker-compose.server.yml --env-file .env.server up -d --build
```

## 3) Check status

```bash
docker compose -f docker-compose.server.yml --env-file .env.server ps
docker logs -f shizuki-site-backend
docker logs -f shizuki-site-frontend
# quick check yaml mount is visible in backend container
docker exec shizuki-site-backend sh -lc 'ls -l /app/resouces/yaml && sed -n "1,140p" /app/resouces/yaml/common-config.yaml'
```

## 4) Access

- Frontend: `http://<server-ip>:5173`
- Backend API: `http://<server-ip>:8080`
- Health: `http://<server-ip>:8080/actuator/health`
- Music search verify:
  - `curl "http://<server-ip>:8080/api/v1/music/search?q=%E6%A8%B1%E8%8A%B1&type=track&providers=netease,kuwo,qq&page=1&limit=10"`

## 5) Domain (recommended)

After DNS points to the server, add `deploy/Caddyfile.snippet` to your Caddy config:

- `https://shizuki.online` -> 301 redirect to `https://site.shizuki.online`
- `https://site.shizuki.online` -> frontend
- `https://api.shizuki.online` -> backend

## 6) Update

```bash
git pull
docker compose -f deploy/docker-compose.server.yml --env-file deploy/.env.server up -d --build
```

## 7) Stop

```bash
docker compose -f docker-compose.server.yml --env-file .env.server down
```

## 8) One-click scripts

- Update code + rebuild deploy
  - Windows (double click): `deploy/update-code-and-deploy.bat`
  - Linux/WSL: `bash deploy/update-code-and-deploy.sh`
  - Behavior: sync local project to `/opt/shizuki-site`, then run `docker compose up -d --build`
  - Built-in robustness: SSH keepalive + upload auto-retry (default 4 times, override with `UPLOAD_RETRIES`)
- Restart only (no upload, no rebuild)
  - Windows (double click): `deploy/restart-only.bat`
  - Linux/WSL: `bash deploy/restart-only.sh`
  - Behavior: run `docker compose up -d --no-build`
- Backward-compatible old entry
  - `deploy/redeploy-server.bat` / `deploy/redeploy-server.sh` now forward to "Update code + rebuild deploy"
