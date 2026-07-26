# 壁纸在线拉取：内嵌浏览 + SteamCMD 真实下载

「获取壁纸」弹窗现在内置了 **在线壁纸浏览** 面板（创意工坊 / Wallhaven 双来源），
不再打开新窗口。列表由后端代理抓取并原生渲染，选中即可一键拉取。

拉取链路分三层，从上到下依次尝试：

| 来源 | 链路 | 是否需要配置 |
| --- | --- | --- |
| Wallhaven | 服务端直接下载原图 → 复用本地包导入管线 | 无需配置，开箱可用 |
| 创意工坊（有公开直链的条目） | Steam `file_url` 直接下载 | 无需配置 |
| 创意工坊（普通 Wallpaper Engine 条目） | SteamCMD 半直连下载 | **需要按本文配置** |

> 大多数 Wallpaper Engine 壁纸没有公开直链，所以要想「工坊随便点随便拉」，必须配好 SteamCMD。

---

## 1. 前置条件

- 一个 **拥有 Wallpaper Engine（appid 431960）** 的 Steam 账号。
  未拥有该游戏的账号（包括匿名登录）无法下载其创意工坊内容。
- 建议为下载单独准备一个小号并关闭不必要的安全设置干扰（仍需过一次 Steam Guard）。
- 服务器需要能访问 Steam CDN（`steamcdn-a.akamaihd.net`、`*.steamcontent.com`）。

## 2. 镜像内安装 SteamCMD

`docker/Dockerfile.backend` 已内置 SteamCMD 安装步骤（默认开启）：

- 安装位置：`/opt/steamcmd/steamcmd.sh`
- 关闭安装：构建时传 `--build-arg INSTALL_STEAMCMD=false`
- 下载源替换（网络不通时）：`--build-arg STEAMCMD_TARBALL_URL=<镜像地址>`

重新构建部署（本地双击 `deploy/update-code-and-deploy.bat`，或服务器上手动）：

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.server.yml --env-file .env.server up -d --build backend
```

## 3. 配置环境变量

编辑 `deploy/.env.server`（参考 `deploy/.env.server.example`）：

```ini
# 开启 SteamCMD 下载通道
WALLPAPER_WORKSHOP_ENABLED=true
WALLPAPER_STEAMCMD_PATH=/opt/steamcmd/steamcmd.sh
WALLPAPER_STEAM_USERNAME=你的Steam账号
WALLPAPER_STEAM_PASSWORD=你的Steam密码
WALLPAPER_WORKSHOP_DOWNLOAD_ROOT=/data/steam-workshop
WALLPAPER_WORKSHOP_TIMEOUT_SECONDS=600

# 可选：Steam Web API Key（https://steamcommunity.com/dev/apikey 申请）
# 配置后工坊搜索走官方 QueryFiles 接口，比页面抓取更稳
WALLPAPER_STEAM_API_KEY=
```

说明：

- `docker-compose.server.yml` 已为 backend 挂载两个持久卷：
  - `backend-steam-home:/home/app`（SteamCMD 自更新与 **登录凭据缓存**）
  - `steam-workshop-data:/data/steam-workshop`（下载目录）
- 凭据缓存在卷里，容器重建后 **不需要** 重复过 Steam Guard。

## 4. 首次登录：过一次 Steam Guard（关键步骤）

后台任务里的 SteamCMD 无法交互输入验证码，所以要先在容器里手动登录一次，
把凭据缓存到 `/home/app` 卷中：

```bash
docker exec -it -u app shizuki-site-backend /opt/steamcmd/steamcmd.sh
# 进入 Steam> 提示符后：
login 你的Steam账号 你的Steam密码
# 按提示输入邮箱/手机上的 Steam Guard 验证码
# 看到 "Logged in OK / Waiting for user info...OK" 后：
quit
```

验证是否可以免验证码自动登录：

```bash
docker exec -u app shizuki-site-backend /opt/steamcmd/steamcmd.sh \
  +login 你的Steam账号 你的Steam密码 +quit
```

不再要验证码即为成功。之后网页里点「导入选中壁纸」，后台就会用
`+workshop_download_item 431960 <条目ID>` 真实下载。

## 5. 验证整条链路

1. 网页登录后打开「背景设置 → 获取壁纸」。
2. 在「在线壁纸浏览」里切到 **Wallhaven**，任选一张点「拉取选中壁纸」——
   应当几秒内提示成功并出现在壁纸库（验证导入管线本身没问题）。
3. 切回 **创意工坊**，选一个条目：
   - 显示「✅ 有公开直链」→ 直接导入即可；
   - 显示「⚠️ 需 SteamCMD」→ 导入后观察状态自动轮询，成功即配置生效。
4. 失败时看提示信息与后端日志：
   ```bash
   docker logs -f shizuki-site-backend | grep -i -E "steamcmd|workshop"
   ```

## 6. 常见问题

- **任务提示 `FALLBACK_REQUIRED` / “请配置 SteamCMD 账号”**：
  `WALLPAPER_WORKSHOP_ENABLED` 未设为 true，或账号密码为空/错误，或需要重过 Steam Guard（重做第 4 步）。
- **`SteamCMD download failed`**：
  账号未拥有 Wallpaper Engine；或超时（大文件把 `WALLPAPER_WORKSHOP_TIMEOUT_SECONDS` 调大）；
  或服务器到 Steam CDN 网络不通。
- **工坊搜索为空但 Wallhaven 正常**：
  服务器访问 `steamcommunity.com` 受阻。可申请 API Key（走 `api.steampowered.com`），
  或给 `WALLPAPER_WORKSHOP_BROWSE_BASE_URL` 配置可用的反代/镜像地址。
- **文件超限**：导入沿用媒体上传上限（默认 50MB，`shizuki.media.storage.max-upload-size`）。
  特大 Workshop 包请调大该配置后再试。
