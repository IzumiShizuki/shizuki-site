/**
 * slidev-assets
 *
 * 生成随 slides.md 一起写入临时目录的 Slidev 项目文件：
 * - style.css        全局样式（自动换行、防溢出、深色玻璃风版式）
 * - global-bottom.vue 页脚（页码 + deck 标题，封面页隐藏）
 *
 * Slidev 会从入口 markdown 所在目录加载这两个文件。
 */

export const STYLE_VERSION = 'shz-style-v1';

const DARK_THEME_CSS = `
:root {
  --shz-accent: #8b9cf9;
  --shz-accent-strong: #a78bfa;
  --shz-bg-deep: #0b1020;
  --shz-bg-soft: #161e33;
  --shz-text: rgba(238, 243, 255, 0.96);
  --shz-text-dim: rgba(206, 218, 244, 0.82);
  --shz-glass: rgba(255, 255, 255, 0.06);
  --shz-glass-border: rgba(255, 255, 255, 0.14);
}

.slidev-layout {
  background:
    radial-gradient(1100px 520px at 12% -10%, rgba(139, 156, 249, 0.16), transparent 60%),
    radial-gradient(900px 480px at 108% 112%, rgba(167, 139, 250, 0.14), transparent 55%),
    linear-gradient(155deg, var(--shz-bg-deep) 0%, var(--shz-bg-soft) 100%);
  color: var(--shz-text);
}

.slidev-layout h1,
.slidev-layout h2,
.slidev-layout h3,
.slidev-layout h4 {
  color: #ffffff;
  letter-spacing: 0.01em;
}
`;

const LIGHT_THEME_CSS = `
:root {
  --shz-accent: #4f5ed7;
  --shz-accent-strong: #7c5cd6;
  --shz-bg-deep: #f7f9ff;
  --shz-bg-soft: #ffffff;
  --shz-text: #1d2333;
  --shz-text-dim: #4d576f;
  --shz-glass: rgba(79, 94, 215, 0.05);
  --shz-glass-border: rgba(79, 94, 215, 0.16);
}

.slidev-layout {
  background:
    radial-gradient(1100px 520px at 12% -10%, rgba(79, 94, 215, 0.08), transparent 60%),
    linear-gradient(155deg, var(--shz-bg-deep) 0%, var(--shz-bg-soft) 100%);
  color: var(--shz-text);
}

.slidev-layout h1,
.slidev-layout h2,
.slidev-layout h3,
.slidev-layout h4 {
  color: #141a2c;
  letter-spacing: 0.01em;
}
`;

const COMMON_CSS = `
/* ---- 字体与自动换行（核心）---- */
.slidev-layout {
  font-family: 'PingFang SC', 'Microsoft YaHei', 'Noto Sans SC', 'Source Han Sans SC',
    'Segoe UI', system-ui, -apple-system, sans-serif;
  font-size: 20px;
  line-height: 1.65;
  padding: 3rem 3.4rem 3.2rem;
}

.slidev-layout p,
.slidev-layout li,
.slidev-layout td,
.slidev-layout th,
.slidev-layout blockquote,
.slidev-layout a,
.slidev-layout h1,
.slidev-layout h2,
.slidev-layout h3 {
  overflow-wrap: anywhere;
  word-break: break-word;
  white-space: normal;
}

/* 代码块：长行自动换行，不再溢出裁切 */
.slidev-layout pre,
.slidev-layout pre code,
.slidev-layout .slidev-code {
  white-space: pre-wrap !important;
  word-break: break-all;
  overflow-wrap: anywhere;
}

.slidev-layout pre {
  border-radius: 12px;
  border: 1px solid var(--shz-glass-border);
  background: rgba(8, 12, 24, 0.62) !important;
  padding: 0.85rem 1rem;
  font-size: 0.72em;
  line-height: 1.55;
  max-width: 100%;
}

.slidev-layout :not(pre) > code {
  border-radius: 6px;
  padding: 0.1em 0.4em;
  background: var(--shz-glass);
  border: 1px solid var(--shz-glass-border);
  color: var(--shz-accent);
  font-size: 0.82em;
  overflow-wrap: anywhere;
}

/* ---- 标题层级 ---- */
.slidev-layout h1 {
  font-size: 2.1em;
  font-weight: 700;
  line-height: 1.28;
}

.slidev-layout h2 {
  font-size: 1.5em;
  font-weight: 700;
  line-height: 1.3;
  padding-bottom: 0.35em;
  margin-bottom: 0.7em;
  position: relative;
}

.slidev-layout h2::after {
  content: '';
  position: absolute;
  left: 0;
  bottom: 0;
  width: 3.2em;
  height: 4px;
  border-radius: 999px;
  background: linear-gradient(90deg, var(--shz-accent), var(--shz-accent-strong));
}

.slidev-layout h3 {
  font-size: 1.24em;
  font-weight: 650;
  margin-bottom: 0.6em;
  color: var(--shz-accent);
}

/* ---- 正文元素 ---- */
.slidev-layout p {
  color: var(--shz-text-dim);
  margin: 0.45em 0;
}

.slidev-layout ul,
.slidev-layout ol {
  margin: 0.4em 0;
  padding-left: 1.35em;
}

.slidev-layout li {
  color: var(--shz-text-dim);
  margin: 0.34em 0;
}

.slidev-layout li::marker {
  color: var(--shz-accent);
}

.slidev-layout blockquote {
  border-left: 4px solid var(--shz-accent);
  border-radius: 0 12px 12px 0;
  background: var(--shz-glass);
  padding: 0.55em 1em;
  font-style: normal;
  color: var(--shz-text-dim);
}

.slidev-layout img {
  max-height: 320px;
  max-width: 100%;
  margin: 0.6em auto;
  border-radius: 12px;
  box-shadow: 0 16px 36px rgba(4, 8, 18, 0.32);
}

.slidev-layout table {
  width: 100%;
  border-collapse: collapse;
  font-size: 0.82em;
}

.slidev-layout th {
  background: var(--shz-glass);
  color: var(--shz-text);
  border-bottom: 2px solid var(--shz-accent);
  padding: 0.45em 0.7em;
  text-align: left;
}

.slidev-layout td {
  border-bottom: 1px solid var(--shz-glass-border);
  padding: 0.42em 0.7em;
  color: var(--shz-text-dim);
}

.slidev-layout a {
  color: var(--shz-accent);
  border-bottom: 1px dashed var(--shz-accent);
  text-decoration: none;
}

/* ---- 封面 / 章节 / 结尾 ---- */
.slidev-layout.shz-cover h1,
.slidev-layout[layout='cover'] h1 {
  font-size: 2.6em;
  background: linear-gradient(120deg, #ffffff 30%, var(--shz-accent) 100%);
  -webkit-background-clip: text;
  background-clip: text;
  -webkit-text-fill-color: transparent;
}

.slidev-layout.shz-cover p {
  font-size: 1.05em;
  max-width: 34em;
}

.slidev-layout[layout='section'] h1 {
  font-size: 2em;
  border-left: 10px solid var(--shz-accent);
  border-radius: 4px;
  padding-left: 0.55em;
}

.slidev-layout.shz-end h1 {
  font-size: 2.4em;
}

.slidev-layout.shz-end p {
  color: var(--shz-accent);
  letter-spacing: 0.12em;
}

/* ---- 页脚 ---- */
.shz-footer {
  position: fixed;
  left: 0;
  right: 0;
  bottom: 0;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0.5rem 1.6rem;
  font-size: 12px;
  color: var(--shz-text-dim);
  opacity: 0.85;
  pointer-events: none;
  z-index: 30;
}

.shz-footer .shz-footer-line {
  flex: 1;
  height: 1px;
  margin: 0 1rem;
  background: linear-gradient(90deg, transparent, var(--shz-glass-border), transparent);
}
`;

export function buildSlidevStyleCss(theme = 'dark') {
  const themeCss = theme === 'light' ? LIGHT_THEME_CSS : DARK_THEME_CSS;
  return `/* generated by slides-api (${STYLE_VERSION}, theme: ${theme}) */\n${themeCss}\n${COMMON_CSS}`;
}

export function buildGlobalBottomVue(title = '') {
  const safeTitle = String(title || '')
    .replace(/[<>&]/g, '')
    .trim();
  return `<template>
  <footer v-if="$slidev.nav.currentPage > 1" class="shz-footer">
    <span>${safeTitle}</span>
    <span class="shz-footer-line"></span>
    <span>{{ $slidev.nav.currentPage }} / {{ $slidev.nav.total }}</span>
  </footer>
</template>
`;
}
