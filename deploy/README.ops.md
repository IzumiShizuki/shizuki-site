# Ops Deployment (Portainer CE)

## 1) 启动 Portainer

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.ops.yml up -d
docker compose -f docker-compose.ops.yml ps
```

默认仅监听本机 `127.0.0.1:9443`，通过 Caddy 子域名对外暴露。

## 2) Caddy 路由

将 `deploy/Caddyfile.snippet` 中 `ops.shizuki.online` 段加入线上 Caddyfile，并 reload Caddy：

```bash
caddy reload --config /etc/caddy/Caddyfile
```

## 3) 首次初始化

1. 访问 `https://ops.shizuki.online`，创建 Portainer 初始管理员账户。
2. 进入 `Environments`，确认本机 Docker endpoint 可用。
3. 在 Portainer 中创建 API Key（建议独立账号或最小权限账号）。
4. 将 key 注入 `deploy/.env.server`（或你的密钥管理）：

```bash
ADMIN_OPS_PORTAL_URL=https://ops.shizuki.online
PORTAINER_BASE_URL=https://ops.shizuki.online
PORTAINER_API_KEY=ptk_xxx
PORTAINER_ENDPOINT_ID=1
ADMIN_OPS_ENABLE_MUTATIONS=true
ADMIN_OPS_ALLOWED_CONTAINER_1=shizuki-site-backend
ADMIN_OPS_ALLOWED_CONTAINER_2=shizuki-site-frontend
ADMIN_OPS_ALLOWED_CONTAINER_3=shizuki-site-meting-api
```

5. 重启后端容器使配置生效：

```bash
docker compose -f docker-compose.server.yml --env-file .env.server up -d backend
```

## 4) OAuth SSO（Portainer 侧）

在 Portainer `Settings -> Authentication -> OAuth` 中配置 SSO（GitHub / OIDC 等）：

- 启用 OAuth
- 绑定管理员/运维组策略
- 开启首次登录自动创建用户（按需）

v1 建议保留 Portainer 自身登录页，不做站内免二次登录代理。

## 5) 升级

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.ops.yml pull
docker compose -f docker-compose.ops.yml up -d
```

## 6) 备份与恢复

### 备份

```bash
cd /opt/shizuki-site
docker run --rm \
  -v shizuki-ops_portainer_data:/data \
  -v "$PWD/deploy:/backup" \
  alpine sh -c "tar czf /backup/portainer_data_$(date +%F_%H%M%S).tgz -C /data ."
```

### 恢复

```bash
cd /opt/shizuki-site
docker compose -f deploy/docker-compose.ops.yml down
docker run --rm \
  -v shizuki-ops_portainer_data:/data \
  -v "$PWD/deploy:/backup" \
  alpine sh -c "rm -rf /data/* && tar xzf /backup/portainer_data_xxx.tgz -C /data"
docker compose -f deploy/docker-compose.ops.yml up -d
```

## 7) API Token 轮换

1. 在 Portainer 创建新 API Key。
2. 更新后端环境变量 `PORTAINER_API_KEY`。
3. 重启后端容器。
4. 验证 `GET /api/v1/admin/ops/overview` 正常。
5. 删除旧 API Key。

## 8) 故障排查

- `ops.shizuki.online` 打不开：先检查 Caddy 证书和反代目标 `127.0.0.1:9443`。
- 站内 `Server Ops` 显示 Portainer 降级：检查 `PORTAINER_BASE_URL / PORTAINER_API_KEY / PORTAINER_ENDPOINT_ID`。
- 容器按钮不可用：确认 `ADMIN_OPS_ENABLE_MUTATIONS=true` 且管理员权限已解锁。
