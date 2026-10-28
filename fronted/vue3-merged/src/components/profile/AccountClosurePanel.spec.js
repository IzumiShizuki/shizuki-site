import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import AccountClosurePanel from './AccountClosurePanel.vue';

const mocks = vi.hoisted(() => ({ closeAccount: vi.fn() }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocks }));
let wrapper;
beforeEach(() => { mocks.closeAccount.mockReset(); });
afterEach(() => { wrapper?.unmount(); });

async function openPanel() {
  wrapper = mount(AccountClosurePanel, { attachTo: document.body });
  await wrapper.get('button').trigger('click');
  return wrapper;
}

describe('AccountClosurePanel', () => {
  it('requires the exact confirmation and cancel resets the form', async () => {
    await openPanel();
    expect(document.activeElement).toBe(wrapper.get('input').element);
    expect(wrapper.text()).toContain('已发布的内容和历史记录仍会保留');
    expect(wrapper.get('[type="submit"]').element.disabled).toBe(true);
    await wrapper.get('input').setValue('注销');
    await wrapper.get('form').trigger('submit');
    expect(mocks.closeAccount).not.toHaveBeenCalled();
    await wrapper.get('input').setValue('注销账号');
    expect(wrapper.get('[type="submit"]').element.disabled).toBe(false);
    await wrapper.get('[type="button"]').trigger('click');
    await wrapper.get('button').trigger('click');
    expect(wrapper.get('input').element.value).toBe('');
  });

  it('prevents duplicate submissions and emits only after success', async () => {
    let complete;
    mocks.closeAccount.mockReturnValue(new Promise(resolve => { complete = resolve; }));
    await openPanel();
    await wrapper.get('input').setValue('注销账号');
    await wrapper.get('form').trigger('submit');
    await wrapper.get('form').trigger('submit');
    expect(mocks.closeAccount).toHaveBeenCalledTimes(1);
    expect(mocks.closeAccount).toHaveBeenCalledWith('注销账号');
    expect(wrapper.get('[type="submit"]').element.disabled).toBe(true);
    expect(wrapper.emitted('closed')).toBeUndefined();
    complete();
    await flushPromises();
    expect(wrapper.emitted('closed')).toHaveLength(1);
  });

  it('preserves input and displays the server failure for retry', async () => {
    mocks.closeAccount.mockRejectedValue({ detail: '无法注销最后一个管理员' });
    await openPanel();
    await wrapper.get('input').setValue('注销账号');
    await wrapper.get('form').trigger('submit');
    await flushPromises();
    expect(wrapper.get('[role="alert"]').text()).toContain('最后一个管理员');
    expect(wrapper.get('input').element.value).toBe('注销账号');
    expect(wrapper.emitted('closed')).toBeUndefined();
    expect(wrapper.get('[type="submit"]').element.disabled).toBe(false);
  });
});
