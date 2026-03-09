export const LIGHT_APPS_CATALOG = Object.freeze([
  {
    code: 'timeprism-todo',
    title: 'TimePrism Todo',
    summary: '统一入口：Todo + Task Board + Schedule + Projects，支持同窗切换与登录后云端同步。',
    iconClass: 'fas fa-list-check',
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
