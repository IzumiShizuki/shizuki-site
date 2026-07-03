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
  throw new Error('QQ Music login frame did not appear in time');
}

export function createQqMusicAdapter() {
  return createQqOauthRuntime({
    provider: 'qqmusic',
    providerName: 'QQ 音乐',
    async openLogin(page) {
      await page.goto('https://y.qq.com/', { waitUntil: 'domcontentloaded' });
      await page.waitForTimeout(2500);
      const trigger = page.locator('.top_login__link').first();
      await trigger.waitFor({ state: 'visible', timeout: 10000 });
      await trigger.click();
      await page.waitForTimeout(3000);
      const graphFrame = await waitForFrame(page, (frame) => frame.url().includes('graph.qq.com/oauth2.0/show'));
      return graphFrame.url() || page.url();
    },
    async resolveLoginFrame(page, timeoutMs = 12000) {
      return waitForFrame(page, (frame) => frame.url().includes('xui.ptlogin2.qq.com'), timeoutMs);
    }
  });
}
