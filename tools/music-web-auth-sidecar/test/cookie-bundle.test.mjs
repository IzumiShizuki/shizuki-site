import test from 'node:test';
import assert from 'node:assert/strict';
import {
  buildCookieBundle,
  isKugouCookieBundleValid,
  isQqMusicCookieBundleValid,
  parseCookieBundle
} from '../src/lib/cookie-bundle.mjs';
import { inferQqQrStage } from '../src/lib/qq-oauth-runtime.mjs';

test('buildCookieBundle filters cookies by allowed domain and preserves name=value pairs', () => {
  const bundle = buildCookieBundle(
    [
      { name: 'uin', value: '123', domain: '.qq.com' },
      { name: 'qm_keyst', value: 'abc', domain: 'y.qq.com' },
      { name: 'ignored', value: 'x', domain: 'example.com' }
    ],
    ['qq.com', 'y.qq.com']
  );
  const cookieMap = parseCookieBundle(bundle);
  assert.equal(cookieMap.get('uin'), '123');
  assert.equal(cookieMap.get('qm_keyst'), 'abc');
  assert.equal(cookieMap.has('ignored'), false);
});

test('cookie bundle validators recognize qqmusic and kugou login cookies', () => {
  assert.equal(isQqMusicCookieBundleValid('uin=123; qqmusic_key=abc'), true);
  assert.equal(isQqMusicCookieBundleValid('uin=123'), false);
  assert.equal(isKugouCookieBundleValid('kg_mid=abc; token=xyz'), true);
  assert.equal(isKugouCookieBundleValid('foo=bar'), false);
});

test('inferQqQrStage maps qr lifecycle states', () => {
  assert.equal(inferQqQrStage({ qrVisible: true }), 'WAIT_SCAN');
  assert.equal(inferQqQrStage({ confirmVisible: true }), 'WAIT_CONFIRM');
  assert.equal(inferQqQrStage({ expiredVisible: true, qrVisible: true }), 'EXPIRED');
  assert.equal(inferQqQrStage({}), 'FAILED');
});
