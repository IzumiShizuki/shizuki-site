export const AdminTabKey = Object.freeze({
  USERS: 'users',
  GROUPS: 'groups',
  PERMISSIONS: 'permissions',
  QUOTA: 'quota',
  SERVER_OPS: 'server-ops',
  PROMPT_CACHE: 'prompt-cache',
  MUSIC_PROVIDERS: 'music-providers',
  BLOG_WHISPERS: 'blog-whispers',
  BLOG_CATEGORIES: 'blog-categories',
  WALLPAPERS: 'wallpapers',
  ALBUMS: 'albums',
  MOMENTS: 'moments',
  RECYCLE_BIN: 'recycle-bin',
  DAILY_QUOTES: 'daily-quotes',
  SITE_WIDGETS: 'site-widgets'
});

// 配额“无限”的统一表示（与后端一致）。
export const UNLIMITED_QUOTA_VALUE = -1;
// 超过 JS 安全整数范围的历史值（如 Long.MAX_VALUE）一律视为无限，避免精度丢失与保存溢出。
export const MAX_SAFE_QUOTA_VALUE = Number.MAX_SAFE_INTEGER;

// 内置目录兜底（后端 /admin/options 未返回带标签目录时使用，保证界面依然友好）。
export const FALLBACK_PERMISSION_OPTIONS = Object.freeze([
  { code: 'basic.read', label: '基础浏览', description: '访问站点公开内容的基础读取权限', category: '基础', builtIn: true },
  { code: 'music.asmr.access', label: '音声内容访问', description: '允许收听 ASMR / 音声分区内容', category: '音乐', builtIn: true },
  { code: 'user.group.read', label: '用户分组查看', description: '查看用户与分组归属关系', category: '后台·用户', builtIn: true },
  { code: 'user.group.write', label: '用户分组管理', description: '调整用户所属分组（写操作需二次验证）', category: '后台·用户', builtIn: true },
  { code: 'group.permission.read', label: '分组权限查看', description: '查看各分组的权限配置', category: '后台·权限', builtIn: true },
  { code: 'group.permission.write', label: '分组权限管理', description: '修改分组权限映射（写操作需二次验证）', category: '后台·权限', builtIn: true },
  { code: 'quota.policy.read', label: '配额策略查看', description: '查看分组配额策略', category: '后台·配额', builtIn: true },
  { code: 'quota.policy.write', label: '配额策略管理', description: '修改分组配额策略（写操作需二次验证）', category: '后台·配额', builtIn: true },
  { code: 'life.content.manage', label: '个人内容管理', description: '管理相册、动态及其媒体工作流', category: '后台·内容', builtIn: true },
  { code: 'site.widgets.manage', label: '站点组件管理', description: '管理天气地点、每日语录与站点组件', category: '后台·站点', builtIn: true },
  { code: 'media.derivative.manage', label: '媒体派生管理', description: '管理个人内容媒体的处理与派生版本', category: '后台·媒体', builtIn: true }
]);

export const FALLBACK_QUOTA_OPTIONS = Object.freeze([
  { code: 'ai_round_total', label: 'AI 对话轮次', description: '每位用户可用的 AI 对话总轮数', unit: 'count', builtIn: true },
  { code: 'music_song_pick_total', label: '音乐点歌次数', description: '音乐台点歌/搜索播放的总次数', unit: 'count', builtIn: true },
  { code: 'music_upload_bytes_total', label: '音乐上传容量', description: '用户可上传音频文件的总容量', unit: 'bytes', builtIn: true }
]);

export function normalizeCodeList(input, upperCase = false) {
  let rawItems = [];
  if (Array.isArray(input)) {
    rawItems = input;
  } else {
    rawItems = String(input || '').split(/[\s,，;；]+/);
  }
  const normalized = rawItems
    .map((item) => String(item || '').trim())
    .filter(Boolean)
    .map((item) => (upperCase ? item.toUpperCase() : item));
  return Array.from(new Set(normalized));
}

export function toggleCodeSelection(selectedCodes, code, upperCase = false) {
  const normalizedCode = String(code || '').trim();
  if (!normalizedCode) return normalizeCodeList(selectedCodes, upperCase);
  const normalizedSelected = normalizeCodeList(selectedCodes, upperCase);
  const target = upperCase ? normalizedCode.toUpperCase() : normalizedCode;
  if (normalizedSelected.includes(target)) {
    return normalizedSelected.filter((item) => item !== target);
  }
  return [...normalizedSelected, target];
}

export function mergeCatalogCodes(baseCodes, extraCodes, upperCase = false) {
  return normalizeCodeList([...(baseCodes || []), ...(extraCodes || [])], upperCase);
}

/**
 * 配额值归一：
 * - 负值统一为 -1（无限）；
 * - 超过 JS 安全整数（历史 Long.MAX 写法）视为 -1；
 * - 非法输入回退为 0；其余向下取整。
 */
export function normalizeQuotaValue(rawValue) {
  const numeric = Number(rawValue);
  if (!Number.isFinite(numeric)) return 0;
  if (numeric < 0) return UNLIMITED_QUOTA_VALUE;
  if (numeric >= MAX_SAFE_QUOTA_VALUE) return UNLIMITED_QUOTA_VALUE;
  return Math.floor(numeric);
}

export function isUnlimitedQuotaValue(rawValue) {
  return normalizeQuotaValue(rawValue) === UNLIMITED_QUOTA_VALUE;
}

export function buildQuotaMatrix(groupOptions, quotaCodes, policies) {
  const groupList = Array.isArray(groupOptions) ? groupOptions : [];
  const quotaList = normalizeCodeList(quotaCodes, false);
  const policyList = Array.isArray(policies) ? policies : [];

  const rows = groupList.map((group) => ({
    groupCode: String(group.groupCode || '').toUpperCase(),
    displayName: String(group.displayName || group.groupCode || '').trim(),
    status: String(group.status || '').toUpperCase(),
    builtIn: Number(group.builtIn || 0) > 0,
    values: {},
    policyIds: {}
  }));

  const rowMap = new Map(rows.map((row) => [row.groupCode, row]));
  policyList.forEach((policy) => {
    const groupCode = String(policy.groupCode || '').toUpperCase();
    const quotaCode = String(policy.quotaCode || '').trim();
    if (!groupCode || !quotaCode) return;
    const row = rowMap.get(groupCode);
    if (!row) return;
    row.values[quotaCode] = normalizeQuotaValue(policy.value ?? 0);
    row.policyIds[quotaCode] = String(policy.policyId || '');
    if (!quotaList.includes(quotaCode)) {
      quotaList.push(quotaCode);
    }
  });

  return {
    quotaCodes: quotaList,
    rows
  };
}

export function upsertQuotaCell(rows, groupCode, quotaCode, rawValue) {
  const normalizedGroupCode = String(groupCode || '').toUpperCase();
  const normalizedQuotaCode = String(quotaCode || '').trim();
  const safeValue = normalizeQuotaValue(rawValue);
  return rows.map((row) => {
    if (row.groupCode !== normalizedGroupCode) return row;
    return {
      ...row,
      values: {
        ...row.values,
        [normalizedQuotaCode]: safeValue
      }
    };
  });
}

export function buildQuotaPayloadForGroup(row, quotaCodes) {
  const groupCode = String(row?.groupCode || '').toUpperCase();
  if (!groupCode) return [];
  return normalizeCodeList(quotaCodes, false).map((quotaCode) => {
    const existingPolicyId = String(row.policyIds?.[quotaCode] || '').trim();
    const value = normalizeQuotaValue(row.values?.[quotaCode]);
    return {
      policyId: existingPolicyId || `policy-${groupCode.toLowerCase()}-${quotaCode}`,
      groupCode,
      quotaCode,
      value
    };
  });
}

function readOptionField(raw, camel, snake, fallback = '') {
  if (!raw || typeof raw !== 'object') return fallback;
  if (raw[camel] !== undefined && raw[camel] !== null) return raw[camel];
  if (raw[snake] !== undefined && raw[snake] !== null) return raw[snake];
  return fallback;
}

/**
 * 归一权限目录：后端 permission_options 优先，缺失时用内置兜底；
 * catalogCodes 中出现但目录没有的编码补成“自定义”项。
 */
export function normalizePermissionOptions(rawOptions, catalogCodes = []) {
  const map = new Map();
  const push = (option) => {
    const code = String(readOptionField(option, 'code', 'code', '') || '').trim();
    if (!code || map.has(code)) return;
    map.set(code, {
      code,
      label: String(readOptionField(option, 'label', 'label', '') || '').trim() || code,
      description: String(readOptionField(option, 'description', 'description', '') || '').trim(),
      category: String(readOptionField(option, 'category', 'category', '') || '').trim() || '其他',
      builtIn: Boolean(readOptionField(option, 'builtIn', 'built_in', false))
    });
  };

  (Array.isArray(rawOptions) ? rawOptions : []).forEach(push);
  FALLBACK_PERMISSION_OPTIONS.forEach(push);
  normalizeCodeList(catalogCodes, false).forEach((code) => {
    if (map.has(code)) return;
    map.set(code, {
      code,
      label: code,
      description: '自定义权限码',
      category: inferPermissionCategory(code),
      builtIn: false
    });
  });
  return Array.from(map.values());
}

export function inferPermissionCategory(code) {
  const prefix = String(code || '').split('.')[0].toLowerCase();
  switch (prefix) {
    case 'basic':
      return '基础';
    case 'music':
      return '音乐';
    case 'user':
      return '后台·用户';
    case 'group':
      return '后台·权限';
    case 'quota':
      return '后台·配额';
    case 'blog':
    case 'post':
      return '博客';
    case 'ai':
      return 'AI';
    default:
      return '其他';
  }
}

/**
 * 按分类聚合权限目录，供选择器分组渲染。
 */
export function groupPermissionOptions(options) {
  const grouped = new Map();
  (Array.isArray(options) ? options : []).forEach((option) => {
    const category = String(option?.category || '其他');
    if (!grouped.has(category)) {
      grouped.set(category, []);
    }
    grouped.get(category).push(option);
  });
  return Array.from(grouped.entries()).map(([category, items]) => ({ category, options: items }));
}

/**
 * 归一配额目录：同权限目录逻辑。
 */
export function normalizeQuotaOptions(rawOptions, catalogCodes = []) {
  const map = new Map();
  const push = (option) => {
    const code = String(readOptionField(option, 'code', 'code', '') || '').trim();
    if (!code || map.has(code)) return;
    const unitRaw = String(readOptionField(option, 'unit', 'unit', '') || '').trim().toLowerCase();
    map.set(code, {
      code,
      label: String(readOptionField(option, 'label', 'label', '') || '').trim() || code,
      description: String(readOptionField(option, 'description', 'description', '') || '').trim(),
      unit: unitRaw === 'bytes' ? 'bytes' : 'count',
      builtIn: Boolean(readOptionField(option, 'builtIn', 'built_in', false))
    });
  };

  (Array.isArray(rawOptions) ? rawOptions : []).forEach(push);
  FALLBACK_QUOTA_OPTIONS.forEach(push);
  normalizeCodeList(catalogCodes, false).forEach((code) => {
    if (map.has(code)) return;
    map.set(code, {
      code,
      label: code,
      description: '自定义配额项',
      unit: code.toLowerCase().includes('bytes') ? 'bytes' : 'count',
      builtIn: false
    });
  });
  return Array.from(map.values());
}

const BYTE_UNITS = ['B', 'KB', 'MB', 'GB', 'TB'];

export function formatBytes(rawValue) {
  const numeric = Number(rawValue);
  if (!Number.isFinite(numeric) || numeric < 0) return '-';
  if (numeric === 0) return '0 B';
  let value = numeric;
  let unitIndex = 0;
  while (value >= 1024 && unitIndex < BYTE_UNITS.length - 1) {
    value /= 1024;
    unitIndex += 1;
  }
  const rounded = value >= 100 || Number.isInteger(value) ? Math.round(value) : Math.round(value * 10) / 10;
  return `${rounded} ${BYTE_UNITS[unitIndex]}`;
}

/**
 * 配额值展示文案：-1 → 无限；0 → 禁用；字节类给出可读容量。
 */
export function formatQuotaValue(rawValue, unit = 'count') {
  const value = normalizeQuotaValue(rawValue);
  if (value === UNLIMITED_QUOTA_VALUE) return '无限';
  if (value === 0) return '禁用';
  if (unit === 'bytes') return formatBytes(value);
  return `${value} 次`;
}

export function createAdminUiState() {
  return {
    permissionsAdvanced: false,
    quotaAdvanced: false
  };
}
