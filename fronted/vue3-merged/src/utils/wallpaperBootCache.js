// 壁纸启动缓存：
// 1. localStorage 记录「上次实际展示的壁纸」快照（URL + 稳定键），
//    供 index.html 引导页与 App.vue 在壁纸库 API 返回前立即铺底。
// 2. Cache Storage 缓存壁纸图片字节，签名 URL 轮换（query 变化）时
//    仍可凭稳定键（origin + pathname）秒出图片，无需重新下载。
//
// 注意：SNAPSHOT_STORAGE_KEY / IMAGE_CACHE_NAME 在 index.html 的内联引导脚本中
// 有同名字面量，两处必须保持一致。

export const SNAPSHOT_STORAGE_KEY = 'shizuki.wallpaperBoot.cache.v1';
export const IMAGE_CACHE_NAME = 'shizuki-wallpaper-images-v1';
const MAX_CACHED_IMAGES = 4;

function safeWindow() {
  return typeof window !== 'undefined' ? window : null;
}

function cacheStorageAvailable() {
  const win = safeWindow();
  try {
    return Boolean(win && 'caches' in win && win.caches && typeof win.caches.open === 'function');
  } catch {
    return false;
  }
}

// 稳定缓存键：去掉 query/hash（签名参数每次都会变），保留 origin + pathname。
// 相对路径按当前站点补全；data:/blob: 等非常规地址返回空串表示不可缓存。
export function stableWallpaperCacheKey(rawUrl) {
  const url = String(rawUrl || '').trim();
  if (!url) return '';
  if (/^(data|blob|javascript):/i.test(url)) return '';
  try {
    const win = safeWindow();
    const base = win?.location?.href || 'http://localhost/';
    const parsed = new URL(url, base);
    if (parsed.protocol !== 'http:' && parsed.protocol !== 'https:') return '';
    parsed.search = '';
    parsed.hash = '';
    return parsed.toString();
  } catch {
    return '';
  }
}

export function readBootWallpaperSnapshot() {
  const win = safeWindow();
  if (!win) return null;
  try {
    const raw = win.localStorage.getItem(SNAPSHOT_STORAGE_KEY);
    if (!raw) return null;
    const parsed = JSON.parse(raw);
    if (!parsed || typeof parsed !== 'object') return null;
    const url = String(parsed.url || '').trim();
    const key = String(parsed.key || '').trim();
    if (!url || !key) return null;
    return {
      url,
      key,
      wallpaperId: Number(parsed.wallpaperId) || 0,
      savedAt: Number(parsed.savedAt) || 0
    };
  } catch {
    return null;
  }
}

export function writeBootWallpaperSnapshot(snapshot) {
  const win = safeWindow();
  if (!win) return false;
  const url = String(snapshot?.url || '').trim();
  const key = stableWallpaperCacheKey(url);
  if (!url || !key) return false;
  try {
    win.localStorage.setItem(
      SNAPSHOT_STORAGE_KEY,
      JSON.stringify({
        url,
        key,
        wallpaperId: Number(snapshot?.wallpaperId) || 0,
        savedAt: Date.now()
      })
    );
    return true;
  } catch {
    return false;
  }
}

// 命中字节缓存则返回可直接给 <img> 用的 object URL，未命中返回 ''。
export async function loadCachedWallpaperObjectUrl(stableKey) {
  if (!cacheStorageAvailable()) return '';
  const key = String(stableKey || '').trim();
  if (!key) return '';
  try {
    const cache = await safeWindow().caches.open(IMAGE_CACHE_NAME);
    const hit = await cache.match(key);
    if (!hit) return '';
    const blob = await hit.blob();
    if (!blob || blob.size <= 0) return '';
    return URL.createObjectURL(blob);
  } catch {
    return '';
  }
}

async function pruneImageCache(cache, keepKey) {
  const requests = await cache.keys();
  if (requests.length <= MAX_CACHED_IMAGES) return;
  const removable = requests.filter((request) => request.url !== keepKey);
  const excess = requests.length - MAX_CACHED_IMAGES;
  for (let i = 0; i < excess && i < removable.length; i += 1) {
    await cache.delete(removable[i]);
  }
}

// 把壁纸图片字节写入 Cache Storage（同一资源路径已缓存则直接跳过）。
// 跨域存储无 CORS 头时 fetch 会失败——静默放弃，走浏览器 HTTP 缓存兜底。
export async function persistWallpaperImage(rawUrl) {
  if (!cacheStorageAvailable()) return false;
  const win = safeWindow();
  const url = String(rawUrl || '').trim();
  const key = stableWallpaperCacheKey(url);
  if (!key) return false;
  try {
    const cache = await win.caches.open(IMAGE_CACHE_NAME);
    const existing = await cache.match(key);
    if (existing) return true;

    const sameOrigin = new URL(key).origin === win.location.origin;
    const response = await fetch(url, {
      mode: sameOrigin ? 'same-origin' : 'cors',
      credentials: sameOrigin ? 'same-origin' : 'omit',
      cache: 'force-cache'
    });
    if (!response || !response.ok || response.type === 'opaque') return false;
    const contentType = String(response.headers?.get?.('content-type') || '').toLowerCase();
    if (/text\/html|application\/json|text\/plain/.test(contentType)) return false;

    await cache.put(key, response);
    await pruneImageCache(cache, key);
    return true;
  } catch {
    return false;
  }
}
