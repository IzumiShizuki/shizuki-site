import { createQqOauthRuntime } from '../lib/qq-oauth-runtime.mjs';

async function waitForFrame(page, predicate, timeoutMs = 12000) {
  const deadline = Date.now() + timeoutMs;
  while (Date.now() < deadline) {
    const frame = page.frames().find(predicate);
    if (frame) {
      return frame;
    }
    await page.waitForTimeout(250);
  }
  throw new Error('Kugou login frame did not appear in time');
}

async function resolveKugouQqLoginUrl(page) {
  await page.goto('https://www.kugou.com/', { waitUntil: 'domcontentloaded' });
  await page.waitForTimeout(3500);
  const loginUrl = await page.evaluate(() => {
    if (!window.KgUser || typeof window.KgUser.ThirdLogin !== 'function') {
      return '';
    }
    const originalOpen = window.open;
    let capturedUrl = '';
    window.open = (...args) => {
      capturedUrl = String(args[0] || '').trim();
      return null;
    };
    try {
      window.__shizukiMusicAuthCallback = function noop() {};
      window.KgUser.ThirdLogin({ appid: 1014, partner: 'qzone' }, '__shizukiMusicAuthCallback');
    } finally {
      window.open = originalOpen;
    }
    return capturedUrl;
  });
  if (!loginUrl) {
    throw new Error('Failed to resolve Kugou QQ login URL');
  }
  return loginUrl;
}

export function createKugouAdapter() {
  return createQqOauthRuntime({
    provider: 'kugou',
    providerName: '酷狗',
    async openLogin(page) {
      const loginUrl = await resolveKugouQqLoginUrl(page);
      await page.goto(loginUrl, { waitUntil: 'domcontentloaded' });
      await page.waitForTimeout(3000);
      const graphFrame = await waitForFrame(page, (frame) => frame.url().includes('graph.qq.com/oauth2.0/show'));
      return graphFrame.url() || page.url();
    },
    async resolveLoginFrame(page, timeoutMs = 12000) {
      return waitForFrame(page, (frame) => frame.url().includes('xui.ptlogin2.qq.com'), timeoutMs);
    }
  });
}
