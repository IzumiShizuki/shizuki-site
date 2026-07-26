# Shizuki 移动端 / 安卓 App

网页版之外新增的一套**移动端界面**（竖屏优先）与**安卓 App 打包**。核心原则：一套 Vue 代码，同时服务手机浏览器和安卓 App，数据全部走线上服务器（默认 `https://site.shizuki.online`）。

## 1. 这次加了什么

### 移动端界面（`src/mobile/`）
- `MobileShell.vue` — 移动外壳：底部胶囊标签栏 + 迷你播放条 + 全屏播放器 + 全局 Toast。
- `pages/MobileMusicHomePage.vue` — 音乐首页：问候语、搜索入口、正在播放卡、歌单横滑/网格。
- `pages/MobilePlaylistPage.vue` — 歌单详情：封面 Hero、播放全部、曲目列表、收藏到歌单。
- `pages/MobileSearchPage.vue` — 跨源搜索：歌曲 / 歌单 / 歌手，搜索历史。
- `pages/MobileAuthPage.vue` — 登录 / 注册 / 重置密码（图形验证码 + 邮箱验证码，与网页端同一套后端接口）。
- `pages/MobileProfilePage.vue` — 个人中心：资料、日夜模式开关、服务器地址切换（仅 App）、退出登录。
- `components/` — `MobileFullPlayer`（歌词/进度/切歌/队列）、`MobileMiniPlayer`、`MobileTabBar`、`MobileTrackRow`、`MobileSheet`。
- `styles/mobile.css` — 「晚霞玻璃 Dusk Glass」设计系统：延续站点暖桃色 + 玻璃拟态，含日/夜两套变量、安全区适配、横屏断点。

### 数据层复用（零重复实现）
移动端**没有**重写任何业务逻辑，全部复用现有：
- `usePlayerEngine` / `playerBridge` — 播放器引擎（歌单加载、切歌、歌词对齐、随机/循环）。
- `useMiniMusicLibrary` — 歌单概览与曲目。
- `useAuthSession` — 登录态、Bearer Token、`authorizedFetch`。
- `services/musicApi` `services/authApi` — 原样调用。

### 竖屏 / 端适配（`src/mobile/mobileMode.js`）
- 手机浏览器（窄屏 + 触摸，含横屏矮屏）**自动进入**移动版；桌面浏览器保持原网页版。
- 桌面路由 ↔ 移动路由双向映射：手机打开 `/music-library` 自动跳 `/m/music`；桌面误入 `/m/*` 自动回跳。
- 个人中心「切换到桌面版网页」可手动覆盖（记在 `localStorage`）。
- App 内（Capacitor）始终强制移动版。

### App 适配层
- `services/apiBase.js` — 统一网关地址解析。网页端跟随部署环境；App 端默认 `https://site.shizuki.online`，设置页可改，相对 `/api/*` 资源（音频流/歌词/封面）在 App 内自动补全域名。
- `mobile/nativeBootstrap.js` — 仅 App 生效：状态栏样式 + 安卓返回键（非根页面返回上一页，根页面退出）。

## 2. 如何重新打包 APK

已生成的成品（本次交付）：
- `Shizuki-1.0-release.apk` — 已用自签名证书签名，可直接安装（约 7.8 MB）。
- `Shizuki-1.0-debug.apk` — 调试版。

### 环境要求
- Node 18+、JDK 17+、Android SDK（platform-android-34、build-tools 34.0.0）。
- 首次需配置 `android/local.properties`：`sdk.dir=<你的 Android SDK 路径>`。

### 最省事：双击 BAT（推荐）
根目录 `fronted/build_apk.bat` 是一键打包脚本，后续改完代码直接双击即可：

```bat
fronted\build_apk.bat                        :: 发布包，默认连 site.shizuki.online
fronted\build_apk.bat debug                  :: 调试包
fronted\build_apk.bat release https://你的域名 :: 指定服务器地址
```

它会自动完成：装依赖(缺才装) → `vite build`(把服务器地址烤进包) → `cap copy android` → `gradlew assemble` → 把成品 APK 复制到 `fronted/vue3-merged/apk-out/Shizuki-<类型>-<时间戳>.apk` 并打开该文件夹。首次运行前确保装好 JDK 17+ 和 Android SDK（脚本会自动从 `ANDROID_HOME` 或 `%LOCALAPPDATA%\Android\Sdk` 写 `local.properties`）。

### 或者手动三条命令
```bash
cd fronted/vue3-merged

# 1. 构建前端（把服务器地址烤进包里）
#    Windows PowerShell: $env:VITE_GATEWAY_BASE_URL="https://site.shizuki.online"; npx vite build
VITE_GATEWAY_BASE_URL=https://site.shizuki.online npx vite build

# 2. 同步到安卓工程
npx cap copy android

# 3. 打包（二选一）
cd android
./gradlew :app:assembleDebug     # 调试包 → app/build/outputs/apk/debug/app-debug.apk
./gradlew :app:assembleRelease   # 签名发布包 → app/build/outputs/apk/release/app-release.apk
```

> 想用 Android Studio 图形界面：`npx cap open android`，然后 Build → Build APK(s)。

### 签名说明
- 发布包签名配置在 `android/app/build.gradle` 的 `signingConfigs.release`。
- 默认读取仓库根目录的 `shizuki-release.keystore`（别名 `shizuki`，口令 `shizuki2026`）。
  **这是自动生成的自用证书，正式分发请自己重新生成并妥善保管：**
  ```bash
  keytool -genkeypair -v -keystore shizuki-release.keystore -alias shizuki \
    -keyalg RSA -keysize 2048 -validity 10000
  ```
- 也可用环境变量覆盖：`SHIZUKI_KEYSTORE` / `SHIZUKI_KS_PASS` / `SHIZUKI_KEY_ALIAS` / `SHIZUKI_KEY_PASS`。

## 3. 关键设计决策

- **为什么 Capacitor 而不是原生 Kotlin**：一套代码同时覆盖网页移动版和 App，复用全部现有 API/播放器逻辑，维护成本最低。
- **跨域怎么解决**：`capacitor.config.json` 里 `CapacitorHttp.enabled = true`，App 内 `fetch()` 走原生 HTTP，绕过 WebView 的 CORS 限制，直连 `site.shizuki.online`。
- **认证**：全程 Bearer Token（存 localStorage），不依赖 Cookie，跨域天然可用。
- **网页端零影响**：所有移动壳组件在 `App.vue` 里用 `isMobileShellRoute` 守卫，桌面路由完全不加载移动代码；Capacitor 插件用动态 import，不进网页包。

## 4. v1 范围与后续

**已包含**：音乐库、歌单、全屏播放器（歌词/进度/切歌/队列）、搜索、登录/注册/重置密码、个人中心、日夜模式、竖屏+横屏适配。

**后续可迭代**（网页端已有、移动端暂未做）：博客阅读、轻应用、AI 对话、音声（ASMR）区、歌单编辑、头像上传。个人中心里「打开完整网页版」可临时跳转到桌面版使用这些功能。
