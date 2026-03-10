export const LEGACY_POMODORO_STORAGE_KEY = 'shizuki.lightapps.pomodoro.v1';
export const TEMP_RINGTONES_SESSION_KEY = 'shizuki.lightapps.pomodoro.temp-ringtones.v1';

export const BUILTIN_RINGTONES = Object.freeze([
  { code: 'soft-bell', name: 'Soft Bell', url: '/lightapps/pomodoro/ringtones/soft-bell.wav' },
  { code: 'crystal-drop', name: 'Crystal Drop', url: '/lightapps/pomodoro/ringtones/crystal-drop.wav' },
  { code: 'focus-chime', name: 'Focus Chime', url: '/lightapps/pomodoro/ringtones/focus-chime.wav' }
]);

export const RINGTONE_SOURCE_LINKS = Object.freeze([
  {
    name: 'Pixabay Sound Effects',
    url: 'https://pixabay.com/sound-effects/',
    note: '可商用音效资源库，下载后可上传到本应用。'
  },
  {
    name: 'Pixabay License Summary',
    url: 'https://pixabay.com/service/license-summary/',
    note: '查看 Pixabay 当前许可条款。'
  },
  {
    name: 'Mixkit Free Sound Effects',
    url: 'https://mixkit.co/free-sound-effects/',
    note: '可商用免署名音效（以素材页说明为准）。'
  }
]);

const DEFAULT_BUILTIN_CODE = BUILTIN_RINGTONES[0]?.code || 'soft-bell';
const DEFAULT_TITLE = '默认番茄钟';

function clampNumber(value, min, max, fallback) {
  const normalized = Number(value);
  if (!Number.isFinite(normalized)) return fallback;
  if (normalized < min) return min;
  if (normalized > max) return max;
  return Math.round(normalized);
}

function normalizeTitle(raw, fallback = DEFAULT_TITLE) {
  const text = String(raw || '').trim();
  return text || fallback;
}

function normalizeRingtoneType(raw) {
  const normalized = String(raw || '').trim().toUpperCase();
  return normalized === 'UPLOAD' ? 'UPLOAD' : 'BUILTIN';
}

function normalizeTemplateId(rawId, fallbackId) {
  const id = Number(rawId);
  if (Number.isInteger(id) && id > 0) return id;
  return Number.isInteger(fallbackId) && fallbackId > 0 ? fallbackId : 0;
}

export function findBuiltinRingtone(code) {
  const normalized = String(code || '').trim();
  return BUILTIN_RINGTONES.find((item) => item.code === normalized) || BUILTIN_RINGTONES[0] || null;
}

export function createDefaultPomodoroTemplate(id = 1) {
  return {
    pomodoroId: normalizeTemplateId(id, 1),
    title: DEFAULT_TITLE,
    focusMinutes: 25,
    shortBreakMinutes: 5,
    longBreakMinutes: 15,
    longBreakEvery: 4,
    autoStartNext: false,
    ringtoneType: 'BUILTIN',
    ringtoneName: findBuiltinRingtone(DEFAULT_BUILTIN_CODE)?.name || 'Default Bell',
    ringtoneCode: DEFAULT_BUILTIN_CODE,
    ringtoneAssetId: null,
    sortNum: 10,
    updatedAt: new Date().toISOString()
  };
}

export function normalizePomodoroTemplate(input, fallbackId = 0) {
  const source = input && typeof input === 'object' ? input : {};
  const next = {
    pomodoroId: normalizeTemplateId(source.pomodoroId ?? source.pomodoro_id, fallbackId),
    title: normalizeTitle(source.title),
    focusMinutes: clampNumber(source.focusMinutes ?? source.focus_minutes, 5, 120, 25),
    shortBreakMinutes: clampNumber(source.shortBreakMinutes ?? source.short_break_minutes, 1, 60, 5),
    longBreakMinutes: clampNumber(source.longBreakMinutes ?? source.long_break_minutes, 5, 90, 15),
    longBreakEvery: clampNumber(source.longBreakEvery ?? source.long_break_every, 2, 12, 4),
    autoStartNext: Boolean(source.autoStartNext ?? source.auto_start_next),
    ringtoneType: normalizeRingtoneType(source.ringtoneType ?? source.ringtone_type),
    ringtoneName: String(source.ringtoneName ?? source.ringtone_name ?? '').trim(),
    ringtoneCode: String(source.ringtoneCode ?? source.ringtone_code ?? '').trim(),
    ringtoneAssetId: null,
    sortNum: clampNumber(source.sortNum ?? source.sort_num, -999999, 999999, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };

  const ringtoneAssetId = Number(source.ringtoneAssetId ?? source.ringtone_asset_id);
  if (Number.isInteger(ringtoneAssetId) && ringtoneAssetId > 0) {
    next.ringtoneAssetId = ringtoneAssetId;
  }

  if (next.ringtoneType === 'UPLOAD') {
    const hasUpload = next.ringtoneAssetId || next.ringtoneCode;
    if (!hasUpload) {
      next.ringtoneType = 'BUILTIN';
    } else if (!next.ringtoneName) {
      next.ringtoneName = 'Uploaded Ringtone';
    }
  }

  if (next.ringtoneType === 'BUILTIN') {
    const builtin = findBuiltinRingtone(next.ringtoneCode || DEFAULT_BUILTIN_CODE);
    next.ringtoneCode = builtin?.code || DEFAULT_BUILTIN_CODE;
    next.ringtoneAssetId = null;
    if (!next.ringtoneName) {
      next.ringtoneName = builtin?.name || 'Built-in Bell';
    }
  }

  return next;
}

export function normalizePomodoroTemplates(list) {
  const source = Array.isArray(list) ? list : [];
  const seen = new Set();
  const next = source
    .map((item, index) => normalizePomodoroTemplate(item, index + 1))
    .filter((item) => {
      if (!item.pomodoroId || seen.has(item.pomodoroId)) return false;
      seen.add(item.pomodoroId);
      return true;
    })
    .sort((left, right) => left.sortNum - right.sortNum || left.pomodoroId - right.pomodoroId);

  return next.length ? next : [createDefaultPomodoroTemplate(1)];
}

export function nextLocalTemplateId(list) {
  return normalizePomodoroTemplates(list).reduce((max, item) => Math.max(max, item.pomodoroId || 0), 0) + 1;
}

export function migrateLegacyPomodoroState(rawLegacy, fallbackId = 1) {
  const source = rawLegacy && typeof rawLegacy === 'object' ? rawLegacy : null;
  if (!source) return null;
  const settings = source.settings && typeof source.settings === 'object' ? source.settings : null;
  if (!settings) return null;
  return normalizePomodoroTemplate(
    {
      pomodoroId: fallbackId,
      title: '迁移番茄钟',
      focusMinutes: settings.focusMinutes,
      shortBreakMinutes: settings.shortBreakMinutes,
      longBreakMinutes: settings.longBreakMinutes,
      longBreakEvery: settings.longBreakEvery,
      autoStartNext: settings.autoStartNext,
      ringtoneType: 'BUILTIN',
      ringtoneCode: DEFAULT_BUILTIN_CODE,
      sortNum: 10
    },
    fallbackId
  );
}

export function normalizeTempRingtoneMap(input) {
  const source = input && typeof input === 'object' ? input : {};
  const next = {};
  Object.entries(source).forEach(([key, value]) => {
    const code = String(key || '').trim();
    const item = value && typeof value === 'object' ? value : null;
    if (!code || !item) return;
    const name = String(item.name || '').trim();
    const dataUrl = String(item.dataUrl || item.data_url || '').trim();
    const contentType = String(item.contentType || item.content_type || '').trim() || 'audio/mpeg';
    const size = Number(item.size);
    if (!name || !dataUrl.startsWith('data:audio/')) return;
    next[code] = {
      name,
      dataUrl,
      contentType,
      size: Number.isFinite(size) && size >= 0 ? Math.round(size) : 0
    };
  });
  return next;
}

export function parseJsonObject(raw) {
  if (!raw) return null;
  try {
    const parsed = JSON.parse(raw);
    return parsed && typeof parsed === 'object' ? parsed : null;
  } catch {
    return null;
  }
}
