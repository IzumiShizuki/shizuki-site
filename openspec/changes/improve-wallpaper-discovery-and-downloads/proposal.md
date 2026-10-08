## Why

用户近期导入工坊视频耗时约 10.5 分钟，发现列表仍有 Wallhaven ID 占位名称、缺少工坊分辨率且每页 24 张无法充分利用宽屏。需要减少可避免的下载等待，并在导入前提供足够信息。

## What Changes

- 对 SteamCMD 已报告指定条目下载成功且内容验证通过的进程及时完成处理；保持错误分类、校验和重试上限。
- 工坊列表和详情显示作者标注分辨率；明确动态分辨率和未提供状态，不使用预览图尺寸冒充原文件尺寸。
- Wallhaven 缺少标题时补取详情标签，优先使用来源名称；采用缓存和受控请求，不再把 ID 当作作品名称。
- 默认每次读取 72 张，通过连续上游分页正确聚合 Wallhaven 结果及页码。

## Capabilities

### New Capabilities

- `wallpaper-discovery-quality`: 发现列表的分辨率、名称、批量分页和受控元数据读取。
- `workshop-download-completion`: 工坊下载完成后的及时校验和进程清理。

### Modified Capabilities

无。

## Impact

media-module 下载器和发现服务，response 模型，Vue 壁纸发现界面，部署配置默认值及对应测试。无数据库迁移；用户在实现完成后授权部署到个人网站服务器，同时更新前后端与现有分页配置并验证线上生效。
