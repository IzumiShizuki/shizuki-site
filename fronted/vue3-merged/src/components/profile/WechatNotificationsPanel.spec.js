import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import WechatNotificationsPanel from './WechatNotificationsPanel.vue';

const mocked = vi.hoisted(() => ({ auth: null }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));
const wrappers = [];
const initial = () => ({ available: true, bound: false, paused: false, groups: [{ code: 'FRIEND', name: '朋友' }],
  subscriptions: [], history: [], quiet_start: null, quiet_end: null });
let state;
const button = (w, text) => w.findAll('button').find(b => b.text() === text);
function render() { const w = mount(WechatNotificationsPanel); wrappers.push(w); return w; }
beforeEach(() => {
  state = initial();
  mocked.auth = { user: ref({ userId: 7 }), isAuthenticated: ref(true),
    authorizedFetch: vi.fn(async (path) => ({ data: state })) };
});
afterEach(() => { wrappers.splice(0).forEach(w => w.unmount()); vi.useRealTimers(); });

describe('WeChat notifications panel', () => {
  it('explains unavailable integration and does not offer fake binding', async () => {
    state.available = false;
    const w = render(); await flushPromises();
    expect(w.text()).toContain('站长尚未启用微信提醒');
    expect(w.findAll('button').some(b => b.text() === '生成绑定指令')).toBe(false);
  });
  it('shows retry after a request failure', async () => {
    mocked.auth.authorizedFetch.mockRejectedValueOnce(new Error('暂时无法连接'));
    const w = render(); await flushPromises();
    expect(w.get('[role=alert]').text()).toContain('暂时无法连接');
    await button(w, '刷新状态').trigger('click'); await flushPromises();
    expect(w.find('[role=alert]').exists()).toBe(false);
    expect(w.text()).toContain('尚未绑定微信');
  });
  it('allows unbinding even after the operator disables the integration', async () => {
    state.available = false; state.bound = true;
    const w = render(); await flushPromises();
    await button(w, '解绑微信').trigger('click');
    state.bound = false;
    await button(w, '确认解绑').trigger('click'); await flushPromises();
    expect(w.text()).toContain('微信已解绑，订阅已清空');
  });
  it('generates a private command without storing it and observes binding', async () => {
    vi.useFakeTimers();
    mocked.auth.authorizedFetch.mockImplementation(async path => ({ data: path.endsWith('/binding-code')
      ? { command: '/shizuki_bind private-token', expires_at: new Date(Date.now() + 600000).toISOString() } : state }));
    const storage = vi.spyOn(Storage.prototype, 'setItem');
    const w = render(); await flushPromises();
    await button(w, '生成绑定指令').trigger('click'); await flushPromises();
    expect(w.get('.command-row input').element.value).toBe('/shizuki_bind private-token');
    expect(storage).not.toHaveBeenCalled();
    state = { ...state, bound: true, masked_identity: '微信 ···1234', bound_at: new Date().toISOString() };
    await vi.advanceTimersByTimeAsync(5000); await flushPromises();
    expect(w.find('.command-row').exists()).toBe(false);
    expect(w.text()).toContain('微信绑定成功');
    expect(w.findAll('input[type=checkbox]').every(i => !i.element.checked)).toBe(true);
    storage.mockRestore();
  });
  it('saves explicit group and type subscriptions with account ownership', async () => {
    state.bound = true; state.masked_identity = '微信 ···1234';
    const w = render(); await flushPromises();
    await w.get('input[aria-label="朋友：文章"]').setValue(true);
    await w.get('form').trigger('submit'); await flushPromises();
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith('/api/v1/me/wechat-notifications/preferences',
      expect.objectContaining({ method: 'PUT', body: { paused: false, quietStart: null, quietEnd: null,
        subscriptions: [{ groupCode: 'FRIEND', kind: 'POST' }] } }), { expectedUserId: 7 });
    expect(w.text()).toContain('订阅已保存');
  });
  it('preserves unsaved selections during refresh and rejects equal quiet hours', async () => {
    state.bound = true;
    const w = render(); await flushPromises();
    await w.get('input[aria-label="朋友：动态"]').setValue(true);
    await button(w, '刷新状态').trigger('click'); await flushPromises();
    expect(w.get('input[aria-label="朋友：动态"]').element.checked).toBe(true);
    const quiet = w.findAll('label').find(l => l.text().includes('开启免打扰时段'));
    await quiet.get('input').setValue(true);
    const selects = w.findAll('select');
    await selects[0].setValue('8'); await selects[1].setValue('8');
    await w.get('form').trigger('submit'); await flushPromises();
    expect(w.get('[role=alert]').text()).toContain('开始和结束时间需要不同');
  });
  it('requires inline confirmation before unbinding and clears queued command', async () => {
    state.bound = true;
    const w = render(); await flushPromises();
    await button(w, '解绑微信').trigger('click');
    expect(mocked.auth.authorizedFetch.mock.calls.some(([p]) => p.endsWith('/binding'))).toBe(false);
    state = { ...state, bound: false };
    await button(w, '确认解绑').trigger('click'); await flushPromises();
    expect(w.text()).toContain('微信已解绑，订阅已清空');
    expect(w.find('form').exists()).toBe(false);
  });
  it('discards the previous account response and clears sensitive pending commands', async () => {
    let resolveOld;
    mocked.auth.authorizedFetch.mockImplementationOnce(() => new Promise(resolve => { resolveOld = resolve; }));
    const w = render();
    mocked.auth.user.value = { userId: 9 };
    await flushPromises();
    resolveOld({ data: { ...initial(), bound: true, masked_identity: 'previous-user' } });
    await flushPromises();
    expect(w.text()).not.toContain('previous-user');
    expect(mocked.auth.authorizedFetch).toHaveBeenLastCalledWith('/api/v1/me/wechat-notifications', {}, { expectedUserId: 9 });
    mocked.auth.isAuthenticated.value = false; await flushPromises();
    expect(w.find('input[readonly]').exists()).toBe(false);
  });
  it('expires a pending code and stops polling after unmount', async () => {
    vi.useFakeTimers();
    mocked.auth.authorizedFetch.mockImplementation(async path => ({ data: path.endsWith('/binding-code')
      ? { command: '/shizuki_bind code', expires_at: new Date(Date.now() + 1000).toISOString() } : state }));
    const w = render(); await flushPromises();
    await button(w, '生成绑定指令').trigger('click'); await flushPromises();
    await vi.advanceTimersByTimeAsync(5000);
    expect(w.text()).toContain('绑定指令已过期');
    const count = mocked.auth.authorizedFetch.mock.calls.length;
    w.unmount();
    await vi.advanceTimersByTimeAsync(10000);
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledTimes(count);
  });
});
