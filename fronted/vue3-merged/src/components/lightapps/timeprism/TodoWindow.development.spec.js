import { ref } from 'vue';
import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import TodoWindow from './TodoWindow.vue';
import { writeGuestLightAppData } from '../../../utils/lightAppsDataStore';

const mocked = vi.hoisted(() => ({ auth: null }));
vi.mock('../../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));

const BASE = '/api/v1/light-apps';
const OVERVIEW = BASE + '/todos/dev/overview';
const planned = {
  todo_id: '31', project_id: '90', repository: 'owner/repo',
  version: 2, stage: 'DESIGN', status: 'IN_PROGRESS', next_step: '写迁移方案'
};
const todos = [
  {
    todo_id: 31, project_id: 90, title: '研发任务', timing_mode: 'RANGE',
    range_start_at: '2026-11-17T18:00:00', due_at: '2026-11-17T20:00:00',
    reminder_enabled: true, start_remind_value: 5, start_remind_unit: 'MINUTE',
    deadline_remind_value: 15, deadline_remind_unit: 'MINUTE'
  },
  { todo_id: 32, title: '普通任务' }
];
let wrapper;

function fetchTodos(path, options) {
  if (path === BASE + '/todos') return { data: todos };
  if (path === BASE + '/projects') return { data: [{ project_id: 90, name: '项目' }] };
  if (path === BASE + '/todo-recurring-rules') return { data: [] };
  if (path === BASE + '/todos/31' && options.method === 'PUT') return { data: { ...todos[0], done: true } };
  if (path === BASE + '/todos/dev/31') return { data: { ...planned, events: [] } };
  throw new Error(`Unexpected path: ${path}`);
}

function open() {
  wrapper = mount(TodoWindow, {
    global: { stubs: { LightAppTopToolbar: { template: '<div><slot /></div>' } } }
  });
  return flushPromises();
}

beforeEach(() => {
  localStorage.clear();
  mocked.auth = {
    isAuthenticated: ref(true), user: ref({ userId: 7 }), ensureReady: vi.fn(),
    authorizedFetch: vi.fn(async (path, options) => path === OVERVIEW ? { data: [planned] } : fetchTodos(path, options))
  };
});
afterEach(() => wrapper?.unmount());

describe('TimePrism Todo development integration', () => {
  it('adds summary only for opted-in tasks and keeps legacy completion/reminder semantics', async () => {
    await open();
    const [dev, ordinary] = wrapper.findAll('.todo-item');
    expect(dev.text()).toContain('方案设计 · 进行中');
    expect(dev.text()).toContain('下一步：写迁移方案');
    expect(ordinary.find('.todo-dev-summary').exists()).toBe(false);
    expect(mocked.auth.authorizedFetch.mock.calls.filter(([url]) => url.startsWith(BASE + '/todos/dev')))
      .toEqual([[OVERVIEW, { method: 'GET' }, { expectedUserId: '7' }]]);

    await dev.get('button[aria-label="研发详情"]').trigger('click');
    await flushPromises();
    expect(dev.get('[aria-label="研发详情"]').attributes('aria-expanded')).toBe('true');
    expect(dev.text()).toContain('owner/repo');
    await dev.get('button[aria-label="研发详情"]').trigger('click');
    expect(dev.find('.todo-dev-panel').exists()).toBe(false);

    await dev.get('input[type="checkbox"]').setValue(true);
    await flushPromises();
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(BASE + '/todos/31', expect.objectContaining({
      method: 'PUT',
      body: expect.objectContaining({
        done: true, timingMode: 'RANGE', reminderEnabled: true,
        startRemindValue: 5, startRemindUnit: 'MINUTE',
        deadlineRemindValue: 15, deadlineRemindUnit: 'MINUTE'
      })
    }));
  });

  it('makes no development requests for guest tasks', async () => {
    mocked.auth.isAuthenticated.value = false;
    writeGuestLightAppData({ todos: [{ todoId: 1, title: '本机待办', sortNum: 10 }] });
    await open();
    expect(wrapper.text()).toContain('本机待办');
    expect(mocked.auth.authorizedFetch).not.toHaveBeenCalled();
    expect(wrapper.find('[aria-label="设置研发模式"]').exists()).toBe(false);
  });

  it('keeps ordinary Todo usable if the backend does not expose development routes', async () => {
    mocked.auth.authorizedFetch.mockImplementation(async (path, options) => {
      if (path === OVERVIEW) throw Object.assign(new Error('not available'), { status: 404 });
      return fetchTodos(path, options);
    });
    await open();
    expect(wrapper.text()).toContain('普通任务');
    expect(wrapper.find('[aria-label="设置研发模式"]').exists()).toBe(false);
    expect(wrapper.find('.error-text').exists()).toBe(false);
  });

  it('does not restore the previous account’s summary after a late response', async () => {
    let release;
    const pending = new Promise(resolve => { release = resolve; });
    mocked.auth.authorizedFetch.mockImplementation(async (path, options, identity) => {
      if (path === OVERVIEW) return identity.expectedUserId === '7' ? pending : { data: [] };
      return fetchTodos(path, options);
    });
    await open();
    mocked.auth.user.value = { userId: 8 };
    await flushPromises();
    release({ data: [planned] });
    await flushPromises();
    expect(wrapper.find('.todo-dev-summary').exists()).toBe(false);
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(OVERVIEW, { method: 'GET' }, { expectedUserId: '8' });
  });
});
