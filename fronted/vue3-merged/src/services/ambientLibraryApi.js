import { httpRequest, normalizeApiData } from './httpClient';

const STATUS_PATH = '/api/v1/ambient-library/status';
const SEARCH_PATH = '/api/v1/ambient-library/search';
const IMPORT_PATH = '/api/v1/ambient-library/import';

function toBoolean(value) {
  if (typeof value === 'boolean') return value;
  const normalized = String(value ?? '').trim().toLowerCase();
  return normalized === 'true' || normalized === '1';
}

function normalizeTrack(raw) {
  if (!raw || typeof raw !== 'object') return null;
  const soundId = String(raw.soundId ?? raw.sound_id ?? '').trim();
  const previewUrl = String(raw.previewUrl ?? raw.preview_url ?? '').trim();
  if (!soundId || !previewUrl) return null;

  const license = String(raw.license || '').trim() || 'unknown';
  return {
    soundId,
    trackId: `freesound:${soundId}`,
    title: String(raw.title || '').trim() || `Freesound #${soundId}`,
    author: String(raw.author || '').trim(),
    previewUrl,
    license,
    licenseName: String(raw.licenseName ?? raw.license_name ?? '').trim() || license,
    attributionRequired: toBoolean(raw.attributionRequired ?? raw.attribution_required ?? license !== 'cc0'),
    pageUrl: String(raw.pageUrl ?? raw.page_url ?? '').trim(),
    duration: Math.max(0, Number(raw.duration) || 0)
  };
}

/**
 * 查询在线音源库是否可用（服务端是否配置了 Freesound Token）。
 */
export async function fetchAmbientLibraryStatus() {
  try {
    const payload = normalizeApiData(await httpRequest(STATUS_PATH, { method: 'GET', timeoutMs: 6000 }));
    return {
      enabled: toBoolean(payload?.enabled),
      provider: String(payload?.provider || 'freesound')
    };
  } catch {
    return {
      enabled: false,
      provider: 'freesound',
      error: '在线音源服务状态暂时无法获取'
    };
  }
}

/**
 * 搜索在线环境音。
 *
 * @param {string} query 关键词
 * @param {{ license?: 'cc0' | 'free', pageNo?: number, pageSize?: number, signal?: AbortSignal }} options
 */
export async function searchAmbientLibrary(query, options = {}) {
  const keyword = String(query || '').trim();
  if (!keyword) {
    return { items: [], total: 0, pageNo: 1, pageSize: 0 };
  }

  const payload = normalizeApiData(
    await httpRequest(SEARCH_PATH, {
      method: 'GET',
      timeoutMs: 12000,
      signal: options.signal,
      query: {
        query: keyword,
        license: options.license === 'free' ? 'free' : 'cc0',
        page_no: Math.max(1, Number(options.pageNo) || 1),
        page_size: Math.max(1, Math.min(48, Number(options.pageSize) || 24))
      }
    })
  );

  const rawItems = Array.isArray(payload?.items) ? payload.items : [];
  return {
    items: rawItems.map(normalizeTrack).filter(Boolean),
    total: Math.max(0, Number(payload?.total) || 0),
    pageNo: Math.max(1, Number(payload?.pageNo ?? payload?.page_no) || 1),
    pageSize: Math.max(0, Number(payload?.pageSize ?? payload?.page_size) || 0)
  };
}

/**
 * 将 Freesound 预览保存为登录用户的私有环境音资产。
 * 浏览器只提交 soundId；下载地址和许可由服务端重新读取、校验。
 */
export async function importAmbientLibraryTrack(track, authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('登录后才能保存在线环境音');
  }
  const soundId = String(track?.soundId ?? track?.sound_id ?? '').trim();
  if (!/^[1-9]\d{0,19}$/.test(soundId)) {
    throw new Error('Freesound 音源 ID 无效');
  }

  const payload = normalizeApiData(
    await authorizedFetch(IMPORT_PATH, {
      method: 'POST',
      body: { soundId }
    })
  );
  const assetId = Number(payload?.assetId ?? payload?.asset_id);
  if (!Number.isInteger(assetId) || assetId <= 0) {
    throw new Error('在线环境音保存失败');
  }

  return {
    provider: String(payload?.provider || 'freesound'),
    soundId: String(payload?.soundId ?? payload?.sound_id ?? soundId),
    assetId,
    title: String(payload?.title || track?.title || `Freesound #${soundId}`).trim(),
    author: String(payload?.author || track?.author || '').trim(),
    license: String(payload?.license || track?.license || '').trim(),
    licenseName: String(payload?.licenseName ?? payload?.license_name ?? track?.licenseName ?? '').trim(),
    attributionRequired: toBoolean(
      payload?.attributionRequired ?? payload?.attribution_required ?? track?.attributionRequired
    ),
    pageUrl: String(payload?.pageUrl ?? payload?.page_url ?? track?.pageUrl ?? '').trim(),
    duration: Math.max(0, Number(payload?.duration ?? track?.duration) || 0),
    downloadUrl: String(
      payload?.downloadUrl ?? payload?.download_url ?? payload?.publicUrl ?? payload?.public_url ?? ''
    ).trim(),
    expireSeconds: Math.max(0, Number(payload?.expireSeconds ?? payload?.expire_seconds) || 0),
    alreadyImported: toBoolean(payload?.alreadyImported ?? payload?.already_imported)
  };
}

/**
 * 生成署名文本，供 CC-BY 音源使用。
 */
export function buildAmbientAttribution(track) {
  if (!track || !track.attributionRequired) return '';
  const parts = [`"${track.title}"`];
  if (track.author) parts.push(`by ${track.author}`);
  if (track.pageUrl) parts.push(`(${track.pageUrl})`);
  if (track.licenseName) parts.push(`— ${track.licenseName}`);
  return parts.join(' ');
}
