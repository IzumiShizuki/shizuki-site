export const LIGHT_APPS_CATALOG = Object.freeze([
  {
    code: 'timeprism-todo',
    title: 'TimePrism Todo',
    summary: '管理待办与优先级，支持重排与登录后云端同步。',
    iconClass: 'fas fa-list-check',
    source: 'TimePrism',
    floatingAble: true
  },
  {
    code: 'timeprism-board',
    title: 'TimePrism Task Board',
    summary: '多列任务看板，支持任务移动、列配置与排序。',
    iconClass: 'fas fa-columns',
    source: 'TimePrism',
    floatingAble: true
  },
  {
    code: 'timeprism-schedule',
    title: 'TimePrism Schedule',
    summary: '日程事件管理与近期安排预览，支持项目关联。',
    iconClass: 'fas fa-calendar-days',
    source: 'TimePrism',
    floatingAble: true
  },
  {
    code: 'timeprism-projects',
    title: 'TimePrism Projects',
    summary: '项目分组与归档管理，为 Todo/Task/Schedule 提供归属。',
    iconClass: 'fas fa-folder-tree',
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
