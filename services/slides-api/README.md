# slides-api

基于 Slidev 的演示文稿服务（导出 + 预览），内置「自动增强」层：

- 传入**纯博客 markdown** 时自动生成完整 deck：封面 / 目录 / 章节页 / 结尾页；
- 传入**已有 Slidev markdown** 时做保守增强：补全 headmatter、拆分溢出页、为列表加动画；
- 按内容预算**自动分页防溢出**（超长段落按句拆、代码块按行拆、表格按行拆、列表按条拆）；
- 列表自动包 `<v-clicks>` 逐条出现，全局 `transition: slide-left` 翻页过渡；
- 随 deck 写入深色玻璃风 `style.css`（CJK 字体栈、长行/长代码**自动换行**）与 `global-bottom.vue` 页脚（页码）；
- pptx 导出默认 `--with-clicks`：每个点击步骤导出为一页，翻页即"动画"。

增强逻辑位于 `slidev-composer.mjs`（与前端 `fronted/vue3-merged/src/utils/slidevComposer.js` 为同一份逻辑的双拷贝，修改需同步）。样式产物位于 `slidev-assets.mjs`。

## API

- `POST /v1/exports`
  - `markdown` (必填)、`formats` (必填, `["pptx","pdf"]` 子集)、`fileName`
  - `enhance` 默认 `true`；设为 `false` 完全跳过增强（旧行为）
  - `title` / `subtitle` 封面标题与副标题（未传时从正文推断）
  - `theme` `dark`(默认) | `light`
  - `animate` 默认 `true`，是否注入 `<v-clicks>` 动画
  - `withClicks` 默认 `true`，pptx 是否把点击步骤拆成多页（pdf 不受影响）
  - `assetBaseUrl` 相对路径图片（`/xxx`）补全用的基地址，默认取环境变量
  - 响应含 `slideCount`、`composeMode`（`convert` | `enhance` | `raw`）
- `GET /v1/exports/{jobId}`
- `POST /v1/previews` — 同样支持上述增强参数（缓存键包含增强结果与版式版本）
- `GET /v1/previews/{jobId}`

## Auth

所有 `/v1/*` 接口要求 `Authorization: Bearer <token>`。

## Env

- `PORT` 默认 `3211`
- `SLIDES_API_BEARER_TOKEN` 访问授权 token
- `SLIDES_API_PUBLIC_BASE_URL` 对外访问基地址
- `SLIDES_API_SIGN_SECRET` 文件 URL 签名密钥
- `SLIDES_API_ASSET_BASE_URL` 相对图片路径补全基地址（如 `https://your.site`）
- `SLIDES_API_WORK_ROOT` 工作目录（默认 `.tmp`）
- `SLIDES_API_STORAGE_ROOT` 存储目录（默认 `.storage`）
- `SLIDES_API_EXPORT_TIMEOUT_MS` 默认 `600000`
- `SLIDES_API_PAGE_TIMEOUT_MS` 默认 `180000`
- `SLIDES_API_WAIT_UNTIL` 默认 `networkidle`（`load` 在冷启动时会赶在应用水合完成前打印，导出空白页）
- `SLIDES_API_EXPORT_WAIT_MS` 导出前额外等待毫秒数，默认 `3000`，设 `0` 关闭
- `SLIDES_API_ARTIFACT_URL_TTL_SECONDS` 默认 `900`
- `SLIDES_API_PREVIEW_CACHE_TTL_SECONDS` 默认 `86400`
- `SLIDEV_EXECUTABLE_PATH` / `PLAYWRIGHT_EXECUTABLE_PATH` 指定浏览器可执行文件
- `SLIDES_API_MOCK_EXECUTOR=1` 测试用模拟执行器

## Run

```bash
cd services/slides-api
npm install
npm run install:browsers
npm run start
```

## Test

```bash
node --test
```
