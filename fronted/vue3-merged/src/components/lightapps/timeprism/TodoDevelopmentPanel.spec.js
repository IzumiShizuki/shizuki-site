import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, describe, expect, it, vi } from 'vitest';
import TodoDevelopmentPanel from './TodoDevelopmentPanel.vue';

const ROOT = '/api/v1/light-apps/todos/dev';
const todoId = '9007199254740999';
const context = {
  todo_id: todoId,
  repository: 'IzumiShizuki/shizuki-site',
  stage: 'DESIGN',
  status: 'AWAITING_APPROVAL',
  next_step: '核对迁移范围',
  version: 3,
  events: [{
    event_type: 'SUBMIT', stage: 'DESIGN', summary: '已整理回滚步骤',
    artifacts: [
      { kind: 'DESIGN', url: 'https://github.com/example/repo/pull/1' },
      { kind: 'UNSAFE', url: 'javascript:alert(1)' }
    ]
  }]
};
const statusError = (status) => Object.assign(new Error('http failure'), { status });
const root = `${ROOT}/${todoId}`;
let wrapper;

function open(fetch, projectId = '8') {
  wrapper = mount(TodoDevelopmentPanel, { props: { todoId, projectId, authorizedFetch: fetch } });
  return wrapper;
}

afterEach(() => wrapper?.unmount());

describe('Todo development detail', () => {
  it('enables only a valid configured task through the dedicated API', async () => {
    const fetch = vi.fn().mockRejectedValueOnce(statusError(404))
      .mockResolvedValueOnce({ data: { ...context, status: 'READY', version: 1 } });
    open(fetch);
    await flushPromises();
    expect(wrapper.get('button[type="submit"]').element.disabled).toBe(true);
    await wrapper.get('input[required]').setValue('https://github.com/o/r');
    expect(wrapper.get('button[type="submit"]').element.disabled).toBe(true);
    await wrapper.get('input[required]').setValue('IzumiShizuki/shizuki-site');
    await wrapper.get('input[type=checkbox]').setValue(true);
    await wrapper.get('form').trigger('submit');
    await flushPromises();
    expect(fetch.mock.calls).toEqual([
      [root, { method: 'GET' }],
      [root + '/enable', {
        method: 'POST', body: { repository: 'IzumiShizuki/shizuki-site', skip_research: true }
      }]
    ]);
    expect(wrapper.text()).toContain('方案设计 · 待开始');
    expect(wrapper.emitted('updated').at(-1)).toEqual([todoId, { ...context, status: 'READY', version: 1 }]);
  });

  it('does not allow an unassigned Todo to enable', async () => {
    open(vi.fn().mockRejectedValue(statusError(404)), null);
    await flushPromises();
    expect(wrapper.text()).toContain('分配到一个项目');
    expect(wrapper.find('button[type="submit"]').exists()).toBe(false);
  });

  it('renders results safely and approves only the visible workflow revision', async () => {
    const fetch = vi.fn().mockResolvedValueOnce(context).mockResolvedValueOnce({
      ...context, stage: 'IMPLEMENTATION', status: 'READY', version: 4
    });
    open(fetch);
    await flushPromises();
    expect(wrapper.text()).toContain('待确认');
    expect(wrapper.text()).toContain('提交成果');
    expect(wrapper.text()).toContain('已整理回滚步骤');
    expect(wrapper.findAll('a').map(link => link.attributes('href'))).toEqual(['https://github.com/example/repo/pull/1']);
    await wrapper.get('.todo-dev-review button').trigger('click');
    await flushPromises();
    expect(fetch).toHaveBeenCalledWith(root + '/approve', {
      method: 'POST',
      body: { expected_version: 3, request_id: expect.stringMatching(/^[0-9a-f-]{36}$/) }
    });
    expect(wrapper.find('.todo-dev-review').exists()).toBe(false);
    expect(wrapper.text()).toContain('代码编写 · 待开始');
  });

  it('reloads conflicts without approving the newer revision silently', async () => {
    const fetch = vi.fn().mockResolvedValueOnce(context)
      .mockRejectedValueOnce(statusError(409))
      .mockResolvedValueOnce({ ...context, version: 4, next_step: '重新审核' });
    open(fetch);
    await flushPromises();
    await wrapper.get('.todo-dev-review button').trigger('click');
    await flushPromises();
    expect(wrapper.text()).toContain('重新审核');
    expect(wrapper.text()).toContain('请检查最新成果');
    expect(fetch.mock.calls.map(([url]) => url)).toEqual([root, root + '/approve', root]);
  });

  it('distinguishes a network error from unconfigured state', async () => {
    open(vi.fn().mockRejectedValue(new Error('network')));
    await flushPromises();
    expect(wrapper.get('[role=alert]').text()).toContain('无法读取研发进度');
    expect(wrapper.find('form').exists()).toBe(false);
  });
});
