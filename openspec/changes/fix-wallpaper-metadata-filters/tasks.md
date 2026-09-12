## 1. Regression Coverage

- [x] 1.1 Add a current Steam Workshop card fixture that reproduces blank titles and previews
- [x] 1.2 Add backend tests for Workshop tag normalization and Wallhaven purity/order normalization
- [x] 1.3 Add frontend tests for complete filter transmission and enriched metadata rendering
- [x] 1.4 Add frontend regression tests for age-rating checkboxes, expanded-option contrast, accent-aware menu glass, and import progress states

## 2. Backend Catalog Repair

- [x] 2.1 Parse current and legacy Workshop title/preview markup with deterministic fallback titles
- [x] 2.2 Add allowlisted Workshop tag filters to controller, service, Steam API, and scrape paths
- [x] 2.3 Preserve Wallhaven sketchy purity for guest requests, add order support, and return richer metadata
- [x] 2.4 Keep Workshop detail fallback metadata usable with the current upstream markup

## 3. Frontend Discovery Controls

- [x] 3.1 Add compact Workshop type, genre, and resolution controls while preserving current styling
- [x] 3.2 Add Wallhaven purity, ratio, and order controls and reset behavior
- [x] 3.3 Replace unnamed result presentation with source-aware fallback labels and concise metadata
- [x] 3.4 Replace the Wallhaven purity select with labeled safe/sketchy checkboxes and keep at least one safe rating selected
- [x] 3.5 Give native wallpaper select options an explicit theme surface and make the top menu glass accent-aware
- [x] 3.6 Surface discovery-import progress, automatically poll non-terminal jobs, and stop polling at terminal states

## 4. Verification

- [x] 4.1 Run focused backend and frontend regression tests
- [x] 4.2 Run the media-module test suite and production frontend/backend builds
- [x] 4.3 Start the local application and verify filters, titles, previews, pagination, and import events
- [x] 4.4 Validate OpenSpec, review for secrets/unrelated files, deploy, and verify production discovery responses

## 5. Production Connectivity Fix（运维：在线发现恢复）

- [x] 5.1 诊断：wallhaven/steamcommunity 出站被墙 + 旧机场节点服务器 503 → 在线发现/下载不可用
- [x] 5.2 换新机场 mojie.app 订阅（反爬 JS 解析出直连 IP 订阅源 `https://47.242.128.61:8000/api/v1/client/subscribe?token=...`），合并旧配置的 external-controller/secret/QQ Bot 规则，重启 clash-core
- [x] 5.3 backend 容器经 `WALLPAPER_DISCOVERY_PROXY_URL=http://cpa:***@host.docker.internal:7890`（`docker compose --env-file deploy/.env.server` 重启）走 clash 代理
- [x] 5.4 生产验证：wallhaven 搜索 200（返回真实壁纸）、预览图下载 200（image/jpeg）、workshop 搜索 200（返回真实创意工坊壁纸）；导入需登录（401 guest 为预期）

## 6. Import Bug Fix（运维：导入入库修复）

- [x] 6.1 诊断：登录态导入 wallhaven 500 `Package import failed`；加异常日志后定位根因 = `enabled_flag` 列类型 smallint 与实体 Boolean 不匹配（`PSQLException: column "enabled_flag" is of type smallint but expression is of type boolean`）
- [x] 6.2 修复：`MediaWallpaperProfileEntity.enabledFlag` Boolean → Integer；全部 7 处使用点改为 `setEnabledFlag(1)` / `eq(..., 1)` / `Integer.valueOf(1).equals(...)`（WallpaperServiceImpl ×4、WallpaperBootstrapInitializer ×3）；`importPackage` catch 加 `LOGGER.error` 记录真实异常
- [x] 6.3 生产验证：登录 `29301481@qq.com` 导入 wallhaven mly2vm 成功（`status: SUCCEEDED`，wallpaper_id=4，OSS `zhuowang-files` 9.5MB PNG 入库，我的壁纸库 API 返回可访问签名 URL）
