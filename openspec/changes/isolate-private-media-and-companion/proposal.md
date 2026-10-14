## Why

普通访客（包括查考圣经的读者）不应发现音声、敏感外部壁纸或 Galgame 角色入口。目前 FRIEND 自动获得音声权限、播放解析缺少权限检查、外部壁纸发现公开，角色入口还会向访客透露未开放功能。

## What Changes

- 音声仅由管理员明确授权；撤销历史 FRIEND 默认授权，拦截播放解析和公共歌单中的音声泄露，权限查询异常时关闭入口。
- **BREAKING** 外部壁纸发现、详情、预览和拉取改为需要 `media.wallpaper.discovery` 权限；普通用户仍可浏览经管理员审核的公开壁纸。
- 普通模式显示通用小猫桌宠和实用快捷操作。ADMIN 通过桌宠上的隐藏操作切换二次元模式，才加载现有 meguri-pet 网关与角色。
- 切换账号、退出登录、返回普通模式时卸载角色并清除模式；AI Hub 的角色入口也遵守同一模式。
- 记录代码审计结果、后台授权步骤及公开媒体的审核边界。

## Capabilities

### New Capabilities

- `private-media-boundary`: 管理员显式授权的音声与外部壁纸访问隔离。
- `companion-mode-isolation`: 普通桌宠与 ADMIN 隐藏角色模式的隔离。

### Modified Capabilities

无。主规格目录尚未有对应已同步能力。

## Impact

Vue 路由、主页、AI Hub、壁纸面板、桌宠组件；媒体服务与发现控制器；用户权限目录及向前数据库迁移。复用现有 `D:\program\meguri-pet` 的网站接入，不修改其独立仓库，不自动部署。已有被标为 PUBLIC 的文件需要管理员逐项审核，隐藏入口不代替后端授权。
