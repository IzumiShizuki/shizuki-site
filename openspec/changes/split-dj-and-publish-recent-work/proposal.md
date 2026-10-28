## Why

DJ 读经共读目前依附主站的工作树和版本信息，通知配置失败也缺少可靠回归保护。用户要求独立维护两个项目并将近期成果保存到 GitHub。

## What Changes

- 将 DJ 最新源码提取为 D:/program/dj 独立 Git 仓库、独立构建入口与 GitHub 项目，保留共享账号 API 的兼容性。
- 主站记录新项目边界；检查并提交现有账号注销、SVG 头像和工具改动。
- 在 DJ 新仓库记录并实施通知配置修复、0.x 版本和组内打卡提醒需求。

## Capabilities

### New Capabilities
- `project-delivery-boundaries`: 两个独立项目、构建入口和可追踪的 GitHub 交付。

### Modified Capabilities

无。

## Impact

主站文档和已有未提交修改；独立 DJ 仓库及其本地构建。不迁移用户数据库，不改变生产域名或向其他服务器部署。
