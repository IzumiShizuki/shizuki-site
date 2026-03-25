const HELPER_CHANNEL = 'shizuki.music.source.helper';
const DEFAULT_TIMEOUT_MS = 1200;
const SOURCE_PROVIDER_SET = new Set(['netease', 'qqmusic', 'kugou']);
const pendingRequests = new Map();

let listenerReady = false;

function ensureWindowListener() {
  if (listenerReady || typeof window === 'undefined') {
    return;
  }
  window.addEventListener('message', (event) => {
    if (event.source !== window) return;
    const data = event.data;
    if (!data || data.channel !== HELPER_CHANNEL || data.direction !== 'helper->page') {
      return;
    }
    const requestId = String(data.requestId || '').trim();
    if (!requestId) {
      return;
    }
    const pending = pendingRequests.get(requestId);
    if (!pending) {
      return;
    }
    pendingRequests.delete(requestId);
    window.clearTimeout(pending.timerId);
    if (data.ok === false) {
      pending.reject(new Error(String(data.error || '音乐助手请求失败')));
      return;
    }
    pending.resolve(data.payload || {});
  });
  listenerReady = true;
}

function createRequestId() {
  if (typeof crypto !== 'undefined' && typeof crypto.randomUUID === 'function') {
    return crypto.randomUUID();
  }
  return `${Date.now()}-${Math.random().toString(16).slice(2)}`;
}

function postHelperMessage(type, payload = {}, timeoutMs = DEFAULT_TIMEOUT_MS) {
  if (typeof window === 'undefined') {
    return Promise.reject(new Error('window is unavailable'));
  }
  ensureWindowListener();
  const requestId = createRequestId();
  return new Promise((resolve, reject) => {
    const timerId = window.setTimeout(() => {
      pendingRequests.delete(requestId);
      reject(new Error('音乐助手未响应'));
    }, Math.max(300, Number(timeoutMs) || DEFAULT_TIMEOUT_MS));
    pendingRequests.set(requestId, { resolve, reject, timerId });
    window.postMessage(
      {
        channel: HELPER_CHANNEL,
        direction: 'page->helper',
        requestId,
        type: String(type || '').trim().toUpperCase(),
        payload
      },
      window.location.origin
    );
  });
}

export async function detectMusicSourceHelper(timeoutMs = 900) {
  try {
    const payload = await postHelperMessage('PING', {}, timeoutMs);
    return Boolean(payload?.ready ?? true);
  } catch {
    return false;
  }
}

export async function requestMusicSourceCookies(provider, timeoutMs = 1500) {
  const normalizedProvider = String(provider || '').trim().toLowerCase();
  if (!SOURCE_PROVIDER_SET.has(normalizedProvider)) {
    throw new Error(`Unsupported source provider: ${provider}`);
  }
  const payload = await postHelperMessage('GET_COOKIES', { provider: normalizedProvider }, timeoutMs);
  return {
    provider: normalizedProvider,
    cookieBundle: String(payload?.cookieBundle || '').trim(),
    helperVersion: String(payload?.helperVersion || payload?.version || '').trim()
  };
}

export function waitForMusicSourceBind(ms) {
  return new Promise((resolve) => {
    window.setTimeout(resolve, Math.max(0, Number(ms) || 0));
  });
}

export function openMusicSourceHelperInstallGuide() {
  const helperPath = 'tools/music-source-helper';
  const lines = [
    '请先安装 Shizuki Music Source Helper 扩展：',
    '1. 打开 chrome://extensions',
    '2. 开启“开发者模式”',
    `3. 选择“加载已解压的扩展程序”，目录选仓库下的 ${helperPath}`,
    '4. 安装完成后返回页面，再点击一次“检测助手”或“连接账号”'
  ];
  try {
    window.open('chrome://extensions/', '_blank', 'noopener,noreferrer');
  } catch {
    // noop
  }
  window.alert(lines.join('\n'));
}
