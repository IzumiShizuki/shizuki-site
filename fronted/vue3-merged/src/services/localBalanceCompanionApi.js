const DEFAULT_LOCAL_BALANCE_COMPANION_BASE_URL = String(
  import.meta.env.VITE_LOCAL_BALANCE_COMPANION_URL || 'http://127.0.0.1:39093'
).trim().replace(/\/+$/, '');

function buildUrl(path) {
  const normalizedPath = String(path || '').startsWith('/') ? String(path) : `/${path || ''}`;
  return `${DEFAULT_LOCAL_BALANCE_COMPANION_BASE_URL}${normalizedPath}`;
}

async function request(path, options = {}) {
  const controller = new AbortController();
  const timeoutMs = Number(options.timeoutMs) > 0 ? Number(options.timeoutMs) : 12000;
  const timeoutId = window.setTimeout(() => controller.abort('timeout'), timeoutMs);
  try {
    const response = await fetch(buildUrl(path), {
      method: options.method || 'GET',
      headers: {
        'Content-Type': 'application/json',
        ...(options.headers || {})
      },
      body: options.body === undefined ? undefined : JSON.stringify(options.body),
      signal: controller.signal
    });
    const payload = await response.json().catch(() => null);
    if (!response.ok) {
      const message = String(payload?.message || payload?.detail || `Local companion request failed (${response.status})`).trim();
      throw new Error(message);
    }
    return payload && typeof payload === 'object' ? payload : {};
  } catch (error) {
    if (controller.signal.aborted) {
      throw new Error(`本地 companion 请求超时（${timeoutMs}ms）`);
    }
    throw error instanceof Error ? error : new Error('本地 companion 请求失败');
  } finally {
    window.clearTimeout(timeoutId);
  }
}

export async function getLocalBalanceCompanionHealth() {
  return request('/healthz', { method: 'GET', timeoutMs: 3000 });
}

export async function getLocalBalanceCompanionStatus(provider) {
  return request(`/providers/${encodeURIComponent(provider)}/status`, { method: 'GET', timeoutMs: 6000 });
}

export async function scanLocalBalanceCompanion(provider, payload = {}) {
  return request(`/providers/${encodeURIComponent(provider)}/scan`, {
    method: 'POST',
    body: payload,
    timeoutMs: 20000
  });
}
