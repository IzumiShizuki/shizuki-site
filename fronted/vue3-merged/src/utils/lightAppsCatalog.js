export const LIGHT_APPS_CATALOG = Object.freeze([
  {
    code: 'timeprism-todo',
    title: 'TimePrism Todo',
    summary: '统一入口：Todo + Task Board + Schedule + Projects，支持同窗切换与登录后云端同步。',
    iconClass: 'fas fa-list-check',
    source: 'TimePrism',
    floatingAble: true
  },
  {
    code: 'pomodoro-timer',
    title: 'Pomodoro Timer',
    summary: '番茄钟模板化专注计时，支持标题模板、内置/上传铃声与登录后云端同步。',
    iconClass: 'fas fa-clock',
    source: 'Shizuki',
    floatingAble: true
  },
  {
    code: 'balance-ledger',
    title: 'Balance Ledger',
    summary: '余额与负债总览、收支记录、定期扣费与多币种汇率换算。',
    iconClass: 'fas fa-wallet',
    source: 'Shizuki',
    floatingAble: true
  },
  {
    code: 'url-links',
    title: 'URL Links',
    summary: '自定义网址轻应用：自动抓取标题与图标，支持上传图标并拖入悬浮栏。',
    iconClass: 'fas fa-link',
    source: 'Shizuki',
    floatingAble: true
  },
  {
    code: 'board-canvas',
    title: 'Board Canvas',
    summary: '飞书画板风格白板：流程图/思维导图/便签绘制，支持 Mermaid 双向与 PNG 导出。',
    iconClass: 'fas fa-diagram-project',
    source: 'Shizuki',
    floatingAble: true
  },
  {
    code: 'blog-slidev',
    title: 'Blog Slidev',
    summary: '把博客演示稿做成轻应用：切换公开/我的文章，预览 slides，并直达文章或编辑页。',
    iconClass: 'fas fa-person-chalkboard',
    source: 'Blog x LightApp',
    floatingAble: true
  }
]);

const lightAppsMap = Object.freeze(
  LIGHT_APPS_CATALOG.reduce((acc, item) => {
    acc[item.code] = item;
    return acc;
  }, {})
);

export const LIGHT_APP_CODES = Object.freeze(LIGHT_APPS_CATALOG.map((item) => item.code));

export function getLightAppByCode(code) {
  return lightAppsMap[String(code || '').trim()] || null;
}

export function isKnownLightAppCode(code) {
  return Boolean(getLightAppByCode(code));
}
