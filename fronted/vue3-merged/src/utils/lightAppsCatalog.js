export const LIGHT_APPS_CATALOG = Object.freeze([
  {
    code: 'timeprism-todo',
    title: 'TimePrism Todo',
    summary: '创建与管理待办事项，支持完成状态与优先级筛选。',
    iconClass: 'fas fa-list-check',
    source: 'TimePrism',
    floatingAble: true
  },
  {
    code: 'timeprism-board',
    title: 'TimePrism Task Board',
    summary: '轻量看板视图，适合按列推进学习任务。',
    iconClass: 'fas fa-columns',
    source: 'TimePrism',
    floatingAble: true
  },
  {
    code: 'timeprism-schedule',
    title: 'TimePrism Schedule',
    summary: '维护学习日程事件，快速查看最近安排。',
    iconClass: 'fas fa-calendar-days',
    source: 'TimePrism',
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
