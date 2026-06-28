export const MUSIC_SOURCE_BIND_LOGIN_MODE_QR = 'qr';
export const MUSIC_SOURCE_BIND_LOGIN_MODE_HELPER = 'browser_cookie';

export const MUSIC_SOURCE_BIND_STATUS_PENDING = 'PENDING';
export const MUSIC_SOURCE_BIND_STATUS_COMPLETED = 'COMPLETED';
export const MUSIC_SOURCE_BIND_STATUS_EXPIRED = 'EXPIRED';
export const MUSIC_SOURCE_BIND_STATUS_FAILED = 'FAILED';

export const MUSIC_SOURCE_BIND_QR_STATUS_WAIT_SCAN = 'WAIT_SCAN';
export const MUSIC_SOURCE_BIND_QR_STATUS_WAIT_CONFIRM = 'WAIT_CONFIRM';
export const MUSIC_SOURCE_BIND_QR_STATUS_AUTHORIZED = 'AUTHORIZED';
export const MUSIC_SOURCE_BIND_QR_STATUS_EXPIRED = 'EXPIRED';
export const MUSIC_SOURCE_BIND_QR_STATUS_FAILED = 'FAILED';

export function normalizeMusicSourceBindSession(raw, fallbackProvider = '') {
  const provider = String(raw?.provider || fallbackProvider || '').trim().toLowerCase();
  return {
    provider,
    sessionId: String(raw?.sessionId || raw?.session_id || '').trim(),
    bindToken: String(raw?.bindToken || raw?.bind_token || '').trim(),
    status: String(raw?.status || '').trim().toUpperCase() || MUSIC_SOURCE_BIND_STATUS_PENDING,
    loginMode: String(raw?.loginMode || raw?.login_mode || '').trim().toLowerCase(),
    loginUrl: String(raw?.loginUrl || raw?.login_url || '').trim(),
    qrUrl: String(raw?.qrUrl || raw?.qr_url || '').trim(),
    qrImage: String(raw?.qrImage || raw?.qr_image || '').trim(),
    qrStatus: String(raw?.qrStatus || raw?.qr_status || '').trim().toUpperCase(),
    qrMessage: String(raw?.qrMessage || raw?.qr_message || '').trim(),
    failureReason: String(raw?.failureReason || raw?.failure_reason || '').trim(),
    helperVersion: String(raw?.helperVersion || raw?.helper_version || '').trim(),
    expiresAt: String(raw?.expiresAt || raw?.expires_at || '').trim(),
    completedAt: String(raw?.completedAt || raw?.completed_at || '').trim(),
    pollIntervalMs: Number.isFinite(Number(raw?.pollIntervalMs ?? raw?.poll_interval_ms))
      ? Number(raw?.pollIntervalMs ?? raw?.poll_interval_ms)
      : 0
  };
}

export function mergeMusicSourceBindSession(current, patch, fallbackProvider = '') {
  const prev = normalizeMusicSourceBindSession(current, fallbackProvider);
  const next = normalizeMusicSourceBindSession(patch, prev.provider || fallbackProvider);
  return {
    ...prev,
    ...next,
    provider: next.provider || prev.provider,
    sessionId: next.sessionId || prev.sessionId,
    bindToken: next.bindToken || prev.bindToken,
    loginMode: next.loginMode || prev.loginMode,
    loginUrl: next.loginUrl || prev.loginUrl,
    qrUrl: next.qrUrl || prev.qrUrl,
    qrImage: next.qrImage || prev.qrImage,
    qrStatus: next.qrStatus || prev.qrStatus,
    qrMessage: next.qrMessage || prev.qrMessage,
    helperVersion: next.helperVersion || prev.helperVersion,
    expiresAt: next.expiresAt || prev.expiresAt,
    completedAt: next.completedAt || prev.completedAt,
    pollIntervalMs: next.pollIntervalMs || prev.pollIntervalMs
  };
}

export function isQrMusicSourceBindSession(session) {
  return normalizeMusicSourceBindSession(session).loginMode === MUSIC_SOURCE_BIND_LOGIN_MODE_QR;
}

export function isTerminalMusicSourceBindSession(session) {
  const normalized = normalizeMusicSourceBindSession(session);
  return normalized.status === MUSIC_SOURCE_BIND_STATUS_COMPLETED
    || normalized.status === MUSIC_SOURCE_BIND_STATUS_EXPIRED
    || normalized.status === MUSIC_SOURCE_BIND_STATUS_FAILED;
}

export function resolveMusicSourceBindPollIntervalMs(session, fallbackMs = 1800) {
  const normalized = normalizeMusicSourceBindSession(session);
  const value = Number(normalized.pollIntervalMs);
  if (Number.isFinite(value) && value > 0) {
    return value;
  }
  return Math.max(300, Number(fallbackMs) || 1800);
}

export function describeNeteaseQrBindSession(session) {
  const normalized = normalizeMusicSourceBindSession(session, 'netease');
  if (normalized.failureReason) {
    return normalized.failureReason;
  }
  if (normalized.qrMessage) {
    return normalized.qrMessage;
  }
  if (normalized.qrStatus === MUSIC_SOURCE_BIND_QR_STATUS_WAIT_CONFIRM) {
    return '扫码成功，请在手机上确认登录';
  }
  if (normalized.qrStatus === MUSIC_SOURCE_BIND_QR_STATUS_AUTHORIZED) {
    return '网易云登录确认成功';
  }
  if (normalized.qrStatus === MUSIC_SOURCE_BIND_QR_STATUS_EXPIRED) {
    return '二维码已过期，请重新生成';
  }
  if (normalized.qrStatus === MUSIC_SOURCE_BIND_QR_STATUS_FAILED) {
    return '扫码绑定失败，请重新发起';
  }
  return '请使用手机网易云扫码登录';
}
