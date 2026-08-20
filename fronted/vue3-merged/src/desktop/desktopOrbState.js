export const ORB_LEVELS = Object.freeze(['collapsed', 'controls', 'routes']);

export const ORB_CONTROL_ITEMS = Object.freeze([
  { key: 'music', label: '音乐', icon: 'fas fa-music' },
  { key: 'todo', label: '待办', icon: 'fas fa-list-check' },
  { key: 'focus', label: '专注', icon: 'fas fa-bullseye' },
  { key: 'edit', label: '编辑', icon: 'fas fa-table-cells-large' }
]);

export const ORB_ROUTE_ITEMS = Object.freeze([
  { destination: 'home', label: '主页', icon: 'fas fa-house' },
  { destination: 'blog', label: 'Blog', icon: 'fas fa-feather' },
  { destination: 'music', label: 'Music', icon: 'fas fa-compact-disc' },
  { destination: 'apps', label: 'Apps', icon: 'fas fa-shapes' },
  { destination: 'aiHub', label: 'AI', icon: 'fas fa-wand-magic-sparkles' },
  { destination: 'profile', label: '我的', icon: 'fas fa-user' }
]);

export function activateOrbBody(level) {
  if (level === 'collapsed') return 'controls';
  if (level === 'controls') return 'routes';
  return 'collapsed';
}

export function normalizeOrbLevel(level) {
  return ORB_LEVELS.includes(level) ? level : 'collapsed';
}
