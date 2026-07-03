# Server Deployment (Frontend + Backend + Sidecars)

## 1) Prepare env

```bash
cd /path/to/shizuki-site/deploy
cp .env.server.example .env.server
# edit .env.server with real DB/Redis/JWT values
# required: SHIZUKI_MUSIC_SECURITY_KEY_ENCRYPTION_MASTER_KEY must be base64 of 32 bytes
# required for balance bill sync: BALANCE_STORAGE_STATE_ENCRYPTION_KEY must be base64 of 32 bytes
# example generation: openssl rand -base64 32
# music sidecar URL: shizuki.music.meting.base-url
# （部署方在容器网络内提供 meting-api 服务，无需用户级 API Key）
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
docker logs -f shizuki-site-bill-sync-agent
# quick check yaml mount is visible in backend container
docker exec shizuki-site-backend sh -lc 'ls -l /app/resouces/yaml && sed -n "1,140p" /app/resouces/yaml/common-config.yaml'
docker exec shizuki-site-bill-sync-agent sh -lc 'node -e "fetch(\"http://127.0.0.1:39031/healthz\").then(r => r.text()).then(console.log)"'
```

## 4) Access

- Frontend: `http://<server-ip>:5173`
- Backend API: `http://<server-ip>:8080`
- Health: `http://<server-ip>:8080/actuator/health`
- Bill sync sidecar health (container-internal): `http://bill-sync-agent:39031/healthz`
- Music search verify:
  - `curl "http://<server-ip>:8080/api/v1/music/search?q=%E6%A8%B1%E8%8A%B1&type=track&providers=netease,kuwo,qq&page=1&limit=10"`

Bill sync notes:

- Alipay QR binding runs inside `shizuki-site-bill-sync-agent`.
- WeChat currently ingests exported CSV/XLSX/ZIP bills from `${BILL_SYNC_AGENT_DATA_DIR}/wechat-bills` on the server.
- Bank-card sync currently ingests exported CSV/XLS/XLSX/ZIP statements from `${BILL_SYNC_AGENT_DATA_DIR}/bankcard-bills` on the server.
- Raw imported bill archives are stored under `${BILL_SYNC_AGENT_DATA_DIR}/lightapp-balance-sync`.

## 5) Domain (recommended)

After DNS points to the server, merge `deploy/Caddyfile.snippet` into your Caddy config:

- `https://shizuki.online/` -> redirect to `https://site.shizuki.online`
- `https://site.shizuki.online` -> frontend
- `https://api.shizuki.online` -> backend / new-api
- `https://panel.shizuki.online` -> 1Panel
- `https://ops.shizuki.online` -> 1Panel alias

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

## 9) MySQL -> PostgreSQL cutover

- See `deploy/POSTGRES_CUTOVER_RUNBOOK.md` for the full migration/cutover checklist.
- Use:
  - `scripts/migrate_mysql_to_postgres.sh`
  - `scripts/verify_mysql_postgres_consistency.sh`
