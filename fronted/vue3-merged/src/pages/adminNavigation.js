import { AdminTabKey } from './adminUiState';

export const AdminNavigationGroup = Object.freeze({
  SYSTEM: 'admin-system',
  CONTENT: 'admin-content',
  SITE_APPEARANCE: 'admin-site-appearance',
  FEEDBACK: 'admin-feedback'
});

export const AdminScopedPermission = Object.freeze({
  LIFE_CONTENT: 'life.content.manage',
  SITE_WIDGETS: 'site.widgets.manage'
});

const GROUP_LABELS = Object.freeze({
  [AdminNavigationGroup.SYSTEM]: 'System · 系统',
  [AdminNavigationGroup.CONTENT]: 'Content · 内容',
  [AdminNavigationGroup.SITE_APPEARANCE]: 'Site Appearance · 站点外观',
  [AdminNavigationGroup.FEEDBACK]: 'Feedback · 反馈'
});

export const ADMIN_NAVIGATION_CATALOG = Object.freeze([
  { key: AdminTabKey.USERS, label: '用户管理', shortLabel: 'Users', icon: 'fas fa-users', group: AdminNavigationGroup.SYSTEM },
  { key: AdminTabKey.GROUPS, label: '分组目录', shortLabel: 'Groups', icon: 'fas fa-layer-group', group: AdminNavigationGroup.SYSTEM },
  { key: AdminTabKey.PERMISSIONS, label: '分组权限', shortLabel: 'Permissions', icon: 'fas fa-key', group: AdminNavigationGroup.SYSTEM },
  { key: AdminTabKey.QUOTA, label: '配额策略', shortLabel: 'Quota', icon: 'fas fa-gauge-high', group: AdminNavigationGroup.SYSTEM },
  { key: AdminTabKey.SERVER_OPS, label: '服务运维', shortLabel: 'Server Ops', icon: 'fas fa-server', group: AdminNavigationGroup.SYSTEM },
  { key: AdminTabKey.PROMPT_CACHE, label: 'Prompt Cache', shortLabel: 'Prompt Cache', icon: 'fas fa-chart-line', group: AdminNavigationGroup.SYSTEM },
  { key: AdminTabKey.MUSIC_PROVIDERS, label: '音乐源', shortLabel: 'Music Sources', icon: 'fas fa-music', group: AdminNavigationGroup.SYSTEM },
  { key: AdminTabKey.BLOG_CATEGORIES, label: '博客分类', shortLabel: 'Blog Categories', icon: 'fas fa-folder-tree', group: AdminNavigationGroup.CONTENT },
  {
    key: AdminTabKey.ALBUMS,
    label: '相册工作台',
    shortLabel: 'Albums',
    icon: 'far fa-images',
    group: AdminNavigationGroup.CONTENT,
    requiredPermission: AdminScopedPermission.LIFE_CONTENT
  },
  {
    key: AdminTabKey.MOMENTS,
    label: '动态工作台',
    shortLabel: 'Moments',
    icon: 'fas fa-camera-retro',
    group: AdminNavigationGroup.CONTENT,
    requiredPermission: AdminScopedPermission.LIFE_CONTENT
  },
  {
    key: AdminTabKey.RECYCLE_BIN,
    label: '统一回收站',
    shortLabel: 'Recycle Bin',
    icon: 'fas fa-trash-can-arrow-up',
    group: AdminNavigationGroup.CONTENT,
    requiredPermission: AdminScopedPermission.LIFE_CONTENT
  },
  {
    key: AdminTabKey.DAILY_QUOTES,
    label: '今日一言',
    shortLabel: 'Daily Quotes',
    icon: 'fas fa-quote-left',
    group: AdminNavigationGroup.CONTENT,
    requiredPermission: AdminScopedPermission.SITE_WIDGETS
  },
  { key: AdminTabKey.WALLPAPERS, label: '壁纸审核', shortLabel: 'Wallpapers', icon: 'far fa-image', group: AdminNavigationGroup.SITE_APPEARANCE },
  {
    key: AdminTabKey.SITE_WIDGETS,
    label: '站点组件',
    shortLabel: 'Site Widgets',
    icon: 'fas fa-cloud-sun',
    group: AdminNavigationGroup.SITE_APPEARANCE,
    requiredPermission: AdminScopedPermission.SITE_WIDGETS
  },
  { key: AdminTabKey.BLOG_WHISPERS, label: '博客悄悄话', shortLabel: 'Whispers', icon: 'fas fa-user-secret', group: AdminNavigationGroup.FEEDBACK }
].map((item) => Object.freeze({ ...item, groupLabel: GROUP_LABELS[item.group] })));

export function isAdminPrincipal(user) {
  const groups = Array.isArray(user?.groups) ? user.groups : [];
  return groups.some((group) => String(group || '').trim().toUpperCase() === 'ADMIN');
}

export function hasAdminScopedPermission(user, permission) {
  if (!isAdminPrincipal(user)) return false;
  const required = String(permission || '').trim();
  if (!required) return true;
  const permissions = Array.isArray(user?.permissions) ? user.permissions : [];
  return permissions.some((item) => String(item || '').trim() === required);
}

export function buildAdminNavigationItems(user) {
  if (!isAdminPrincipal(user)) return [];
  return ADMIN_NAVIGATION_CATALOG
    .filter((item) => !item.requiredPermission || hasAdminScopedPermission(user, item.requiredPermission))
    .map((item) => ({ ...item }));
}
