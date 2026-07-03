# Ops Deployment (1Panel + Legacy Portainer)

当前线上 `111.228.35.186` 默认使用 `1Panel` 作为图形化运维入口：

- `https://panel.shizuki.online`
- `https://ops.shizuki.online`（别名）

下面的 `docker-compose.ops.yml` 仍然保留为旧的 Portainer 方案，主要给站内 `Server Ops` 的 Portainer API 集成做兼容参考。

## 1) 启动 Portainer（旧方案）

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.ops.yml up -d
docker compose -f docker-compose.ops.yml ps
```

默认仅监听本机 `127.0.0.1:9443`，通过 Caddy 子域名对外暴露。

## 2) Caddy 路由

将 `deploy/Caddyfile.snippet` 中的 `panel.shizuki.online / ops.shizuki.online` 段加入线上 Caddyfile，并 reload Caddy：

```bash
caddy reload --config /etc/caddy/Caddyfile
```

## 3) 首次初始化

1. 如使用当前线上方案，访问 `https://panel.shizuki.online` 登录 1Panel。
2. 如使用旧的 Portainer 方案，访问 `https://ops.shizuki.online`，创建 Portainer 初始管理员账户。
3. 进入 `Environments`，确认本机 Docker endpoint 可用。
4. 在 Portainer 中创建 API Key（建议独立账号或最小权限账号）。
5. 将 key 注入 `deploy/.env.server`（或你的密钥管理）：

```bash
ADMIN_OPS_PORTAL_URL=https://panel.shizuki.online
PORTAINER_BASE_URL=https://ops.shizuki.online
PORTAINER_API_KEY=ptk_xxx
PORTAINER_ENDPOINT_ID=1
ADMIN_OPS_ENABLE_MUTATIONS=true
ADMIN_OPS_ALLOWED_CONTAINER_1=shizuki-site-backend
ADMIN_OPS_ALLOWED_CONTAINER_2=shizuki-site-frontend
ADMIN_OPS_ALLOWED_CONTAINER_3=shizuki-site-meting-api
```

6. 重启后端容器使配置生效：

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

- `panel.shizuki.online` / `ops.shizuki.online` 打不开：先检查 Caddy 证书，以及当前目标到底是 `http://127.0.0.1:10086`（1Panel）还是旧的 `127.0.0.1:9443`（Portainer）。
- 站内 `Server Ops` 显示 Portainer 降级：检查 `PORTAINER_BASE_URL / PORTAINER_API_KEY / PORTAINER_ENDPOINT_ID`。
- 容器按钮不可用：确认 `ADMIN_OPS_ENABLE_MUTATIONS=true` 且管理员权限已解锁。
