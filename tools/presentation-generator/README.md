# Presentation Generator

`presentation-generator` 是博客 Slidev/PPT 模块的 sidecar 服务。

它只做一件事：接收生成好的 Slidev Markdown，调用 `@slidev/cli export` 导出 `pptx`，再把结果以 Base64 返回给后端。

## 运行时要求

- 推荐 Node 版本：`20.x`
- 项目内已提供 `.nvmrc`
- Node 24 本地也可运行，但当前组合下冷启动明显偏慢，联调与部署仍建议使用 `20.x`

## 本地运行

```bash
cd tools/presentation-generator
npm install
npm run install:browsers
npm run start
```

默认监听 `3210` 端口。

可选环境变量：

- `PORT`：HTTP 端口，默认 `3210`
- `SLIDEV_EXPORT_TIMEOUT_MS`：整个导出进程超时时间，默认 `600000`
- `SLIDEV_PAGE_TIMEOUT_MS`：Slidev 内部页面渲染超时时间，默认 `180000`
- `SLIDEV_WAIT_UNTIL`：Slidev 导出等待事件，默认 `load`

## 接口

### `GET /health`

健康检查接口，返回：

```json
{ "ok": true }
```

### `POST /render/pptx`

请求体：

```json
{
  "markdown": "---\ntheme: default\n---\n# Demo\n",
  "fileName": "demo"
}
```

成功响应：

```json
{
  "pptBase64": "...",
  "slideCount": 1
}
```

失败响应：

```json
{
  "message": "slidev export failed"
}
```

## 部署

生产部署默认通过 [docker-compose.server.yml](/mnt/d/xuexi/10.program/shizuki-site/shizuki-site/deploy/docker-compose.server.yml) 启动：

- `presentation-generator`
- `backend`
- `site`

后端需要以下配置：

- `BLOG_PRESENTATION_GENERATOR_BASE_URL`
- `BLOG_PRESENTATION_CONNECT_TIMEOUT_MS`
- `BLOG_PRESENTATION_READ_TIMEOUT_MS`

如果 sidecar 未启动或不可达：

- 作者点击生成会失败
- 后端会把文章 presentation 状态标记为 `FAILED`
- 前端会显示明确错误文案，而不是停留在 `GENERATING`

如果 sidecar 已启动但导出仍失败，优先检查：

- Node 版本是否为 `20.x`
- 浏览器依赖是否已执行 `npm run install:browsers`
- `SLIDEV_PAGE_TIMEOUT_MS` 是否过低
- 是否把输入文件放在 sidecar 工作目录内的 `.tmp` 下，避免主题解析失效

## 当前限制

- 只支持 `pptx`
- 只支持从博客 Markdown 模板化生成
- 在线预览是站内轻量预览，不是原生 Slidev 静态站点
