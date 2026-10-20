import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import ContactBindingsPanel from './ContactBindingsPanel.vue';

const mocked = vi.hoisted(() => ({ auth: null, response: null }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));
const wrappers = [];
const render = () => {
  const wrapper = mount(ContactBindingsPanel);
  wrappers.push(wrapper);
  return wrapper;
};

beforeEach(() => {
  mocked.response = { available: true, bindings: [] };
  mocked.auth = {
    user: ref({ userId: 7 }),
    isAuthenticated: ref(true),
    authorizedFetch: vi.fn(async path => {
      if (path.endsWith('/challenge')) return { data: { command: '/shizuki_bind code', expires_at: '2026-10-20T13:00:00Z' } };
      return { data: mocked.response };
    })
  };
});

afterEach(() => wrappers.splice(0).forEach(wrapper => wrapper.unmount()));

describe('ContactBindingsPanel', () => {
  it('shows an unavailable bridge without offering a bind action', async () => {
    mocked.response.available = false;
    const wrapper = render();
    await flushPromises();
    expect(wrapper.text()).toContain('消息桥接尚未配置');
    expect(wrapper.find('.add-row').exists()).toBe(false);
  });

  it('generates a platform-specific challenge and scopes API calls to the account', async () => {
    const wrapper = render();
    await flushPromises();
    await wrapper.get('select').setValue('WECHAT');
    await wrapper.findAll('button').find(button => button.text().includes('生成绑定指令')).trigger('click');
    await flushPromises();
    expect(wrapper.get('.command-row input').element.value).toBe('/shizuki_bind code');
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith('/api/v1/me/contact-bindings/challenge',
      expect.objectContaining({ method: 'POST', body: { platform: 'WECHAT' } }), { expectedUserId: 7 });
    expect(wrapper.text()).toContain('有效至');
  });

  it('shows separate Todo permissions for each masked identity', async () => {
    mocked.response.bindings = [{
      id: 'binding-1', platform: 'QQ', masked_identity: 'QQ ···5678',
      todo_edit_enabled: true, todo_notify_enabled: false, bound_at: '2026-10-20T12:00:00Z'
    }];
    const wrapper = render();
    await flushPromises();
    expect(wrapper.text()).toContain('QQ ···5678');
    expect(wrapper.findAll('input[type=checkbox]')).toHaveLength(2);
    expect(wrapper.findAll('input[type=checkbox]')[0].element.checked).toBe(true);
    expect(wrapper.findAll('input[type=checkbox]')[1].element.checked).toBe(false);
  });
});
