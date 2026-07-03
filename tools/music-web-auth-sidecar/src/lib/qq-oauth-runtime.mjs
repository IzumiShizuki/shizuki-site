import { buildCookieBundle, isKugouCookieBundleValid, isQqMusicCookieBundleValid } from './cookie-bundle.mjs';
import { extractImageDataUrl, findVisibleLocator, readAttributeOfFirstVisible } from './page-helpers.mjs';
import { createPage, normalizeErrorMessage, safeClose } from './runtime.mjs';

const STATUS_PENDING = 'PENDING';
const STATUS_COMPLETED = 'COMPLETED';
const STATUS_EXPIRED = 'EXPIRED';
const STATUS_FAILED = 'FAILED';
const QR_STATUS_WAIT_SCAN = 'WAIT_SCAN';
const QR_STATUS_WAIT_CONFIRM = 'WAIT_CONFIRM';
const QR_STATUS_AUTHORIZED = 'AUTHORIZED';
const QR_STATUS_EXPIRED = 'EXPIRED';
const QR_STATUS_FAILED = 'FAILED';

const QQ_QR_IMAGE_SELECTORS = ['#qrlogin_img'];
const QQ_QR_EXPIRED_SELECTORS = ['#qr_invalid', '#qr_invalid_tips'];
const QQ_QR_CONFIRM_SELECTORS = ['#qlogin_tips_4', '#onekey_step2'];
const QQ_QR_SCAN_SELECTORS = ['#qlogin_tips_1', '#qlogin_tips_0', '#qrlogin_img'];

function nowIso() {
  return new Date().toISOString();
}

function isExpired(expiresAt) {
  const value = Date.parse(String(expiresAt || ''));
  return Number.isFinite(value) && value <= Date.now();
}

function toAllowedDomains(provider) {
  if (provider === 'qqmusic') {
    return ['qq.com', 'y.qq.com'];
  }
  return ['kugou.com'];
}

function isCookieBundleValid(provider, cookieBundle) {
  return provider === 'qqmusic'
    ? isQqMusicCookieBundleValid(cookieBundle)
    : isKugouCookieBundleValid(cookieBundle);
}

function waitScanMessage(providerName) {
  return `请使用 QQ 手机版扫码登录${providerName}`;
}

function waitConfirmMessage(providerName) {
  return `扫码成功，请在 QQ 手机版上确认登录${providerName}`;
}

function authorizedMessage(providerName) {
  return `${providerName}登录确认成功`;
}

export function inferQqQrStage({ expiredVisible = false, confirmVisible = false, qrVisible = false }) {
  if (expiredVisible) {
    return QR_STATUS_EXPIRED;
  }
  if (confirmVisible) {
    return QR_STATUS_WAIT_CONFIRM;
  }
  if (qrVisible) {
    return QR_STATUS_WAIT_SCAN;
  }
  return QR_STATUS_FAILED;
}

export function createQqOauthRuntime(options = {}) {
  const sessions = new Map();
  const provider = String(options.provider || '').trim().toLowerCase();
  const providerName = String(options.providerName || provider || '目标平台').trim();

  async function closeSessionRuntime(sessionId) {
    const runtime = sessions.get(sessionId);
    sessions.delete(sessionId);
    if (!runtime) {
      return;
    }
    await safeClose(runtime.page);
    await safeClose(runtime.context);
  }

  async function createBindSession(sessionId, expiresAt) {
    const { context, page } = await createPage();
    const loginUrl = await options.openLogin(page);
    const loginFrame = await options.resolveLoginFrame(page);
    const qrUrl = await readAttributeOfFirstVisible(loginFrame, QQ_QR_IMAGE_SELECTORS, 'src');
    const qrImage = await extractImageDataUrl(loginFrame, QQ_QR_IMAGE_SELECTORS);
    if (!qrImage) {
      await safeClose(page);
      await safeClose(context);
      throw new Error(`${providerName} QR image is unavailable`);
    }
    const snapshot = {
      provider,
      sessionId,
      status: STATUS_PENDING,
      loginUrl,
      qrUrl,
      qrImage,
      qrStatus: QR_STATUS_WAIT_SCAN,
      qrMessage: waitScanMessage(providerName),
      pollIntervalMs: Number(process.env.MUSIC_WEB_AUTH_POLL_INTERVAL_MS || 1800) || 1800,
      expiresAt,
      completedAt: '',
      failureReason: '',
      cookieBundle: ''
    };
    sessions.set(sessionId, { context, page, snapshot });
    return snapshot;
  }

  async function getBindSessionSnapshot(session) {
    const runtime = sessions.get(session.sessionId);
    if (!runtime) {
      return session;
    }
    const { context, page } = runtime;

    if (isExpired(session.expiresAt)) {
      const expiredSnapshot = {
        ...runtime.snapshot,
        status: STATUS_EXPIRED,
        qrStatus: QR_STATUS_EXPIRED,
        qrMessage: '二维码已过期，请重新生成',
        failureReason: 'Bind session expired'
      };
      await closeSessionRuntime(session.sessionId);
      return expiredSnapshot;
    }

    const cookies = await context.cookies().catch(() => []);
    const cookieBundle = buildCookieBundle(cookies, toAllowedDomains(provider));
    if (cookieBundle && isCookieBundleValid(provider, cookieBundle)) {
      const completedSnapshot = {
        ...runtime.snapshot,
        status: STATUS_COMPLETED,
        qrStatus: QR_STATUS_AUTHORIZED,
        qrMessage: authorizedMessage(providerName),
        completedAt: nowIso(),
        failureReason: '',
        cookieBundle
      };
      await closeSessionRuntime(session.sessionId);
      return completedSnapshot;
    }

    if (page.isClosed()) {
      const failedSnapshot = {
        ...runtime.snapshot,
        status: STATUS_FAILED,
        qrStatus: QR_STATUS_FAILED,
        qrMessage: `${providerName} 登录窗口已关闭，请重新发起扫码绑定`,
        failureReason: `${providerName} login window closed before cookies were captured`,
        cookieBundle: ''
      };
      await closeSessionRuntime(session.sessionId);
      return failedSnapshot;
    }

    const loginFrame = await options.resolveLoginFrame(page, 2000).catch(() => null);
    if (!loginFrame) {
      return {
        ...runtime.snapshot,
        qrStatus: QR_STATUS_WAIT_CONFIRM,
        qrMessage: waitConfirmMessage(providerName),
        failureReason: ''
      };
    }

    const expiredVisible = Boolean(await findVisibleLocator(loginFrame, QQ_QR_EXPIRED_SELECTORS));
    const confirmVisible = Boolean(await findVisibleLocator(loginFrame, QQ_QR_CONFIRM_SELECTORS));
    const qrVisible = Boolean(await findVisibleLocator(loginFrame, QQ_QR_SCAN_SELECTORS));
    const qrStatus = inferQqQrStage({ expiredVisible, confirmVisible, qrVisible });

    if (qrStatus === QR_STATUS_EXPIRED) {
      const expiredSnapshot = {
        ...runtime.snapshot,
        status: STATUS_EXPIRED,
        qrStatus: QR_STATUS_EXPIRED,
        qrMessage: '二维码已过期，请重新生成',
        failureReason: 'QR code expired'
      };
      await closeSessionRuntime(session.sessionId);
      return expiredSnapshot;
    }

    if (qrStatus === QR_STATUS_FAILED) {
      const failedSnapshot = {
        ...runtime.snapshot,
        status: STATUS_FAILED,
        qrStatus: QR_STATUS_FAILED,
        qrMessage: `${providerName} 二维码状态异常，请重新发起绑定`,
        failureReason: `${providerName} QR state is unavailable`,
        cookieBundle: ''
      };
      await closeSessionRuntime(session.sessionId);
      return failedSnapshot;
    }

    const nextSnapshot = {
      ...runtime.snapshot,
      status: STATUS_PENDING,
      qrUrl: await readAttributeOfFirstVisible(loginFrame, QQ_QR_IMAGE_SELECTORS, 'src') || runtime.snapshot.qrUrl,
      qrImage: await extractImageDataUrl(loginFrame, QQ_QR_IMAGE_SELECTORS) || runtime.snapshot.qrImage,
      qrStatus,
      qrMessage: qrStatus === QR_STATUS_WAIT_CONFIRM
        ? waitConfirmMessage(providerName)
        : waitScanMessage(providerName),
      failureReason: '',
      cookieBundle: ''
    };
    runtime.snapshot = nextSnapshot;
    return nextSnapshot;
  }

  return {
    createBindSession,
    getBindSessionSnapshot
  };
}
