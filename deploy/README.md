# Server Deployment (Frontend + Backend)

## 1) Prepare env

```bash
cd /path/to/shizuki-site/deploy
cp .env.server.example .env.server
# edit .env.server with real DB/Redis/JWT values
# required: SHIZUKI_MUSIC_SECURITY_KEY_ENCRYPTION_MASTER_KEY must be base64 of 32 bytes
# example generation: openssl rand -base64 32
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
```

## 4) Access

- Frontend: `http://<server-ip>:5173`
- Backend API: `http://<server-ip>:8080`
- Health: `http://<server-ip>:8080/actuator/health`

## 5) Domain (recommended)

After DNS points to the server, add `deploy/Caddyfile.snippet` to your Caddy config:

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

## 8) One-click redeploy

- Windows (double click): `deploy/redeploy-server.bat`
- Linux/WSL: `bash deploy/redeploy-server.sh`
- Behavior: sync local project to `/opt/shizuki-site` first, then run `docker compose up -d --build`
