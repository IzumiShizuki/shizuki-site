# Shizuki Site Publisher

这是 shizuki.site 的第一方 Obsidian 发布桥。它提供：

- 登录 shizuki.site（密码只参与当次请求，刷新令牌存放在 Obsidian SecretStorage）；
- 将当前 Markdown 笔记上传为草稿或确认后公开发布；
- 再次上传时根据 `shizuki_post_id` 更新同一文章；
- 上传本地 PNG/JPEG/WebP/GIF，发布 `.drawio.svg` 时自动转为 PNG；
- 与网站共用 `https://embed.diagrams.net/` 编辑器；
- 中性暗色界面以及本地背景图片选择器。

## 推荐 Frontmatter

```yaml
---
title: 文章标题
summary: 一句话摘要
shizuki_category: life
shizuki_slug: optional-slug
visibility: PUBLIC
tags:
  - Obsidian
  - 笔记
---
```

首次上传成功后，插件会补充 `shizuki_post_id`、`shizuki_sync_status` 与 `shizuki_synced_at`。请勿手动把 SecretStorage 中的登录令牌复制进笔记、配置文件或 Git。

## 命令

- `Shizuki: 登录网站`
- `Shizuki: 上传当前笔记为草稿`
- `Shizuki: 发布当前笔记`
- `Shizuki: 预览发布载荷`
- `Shizuki: 选择背景图片`
- `Shizuki: 清除背景图片`
- `Shizuki: 检查 Draw.io 连接`
- `Shizuki: 退出登录`

`00_Notion_Raw` 被视为只读迁移源，插件拒绝从该目录发布。

## 背景图片

把你喜欢的二次元 PNG/JPEG/WebP/GIF 放进 `90-Assets/images/Backgrounds`，然后从命令面板或插件设置中选择。清除背景只会恢复暗色渐变，不会删除图片。

## 本地验证

```powershell
node build.cjs
node --test test/*.test.cjs
```

在插件目录运行 `scripts/deploy.ps1`，再运行 `scripts/verify.ps1`；部署脚本只复制插件拥有的文件，并验证 `00_Notion_Raw` 未发生变化。
