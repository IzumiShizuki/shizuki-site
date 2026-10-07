import { defineComponent, ref } from 'vue';
import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { useTimePrismCalendar } from './useTimePrismCalendar';
import { readLightAppCalendarCache, writeGuestLightAppData, writeLightAppCalendarCache, writeRemoteLightAppCache } from '../utils/lightAppsDataStore';

const mocked = vi.hoisted(() => ({ auth: null, projects: vi.fn(), todos: vi.fn(), tasks: vi.fn(), schedules: vi.fn() }));
vi.mock('./useAuthSession', () => ({ useAuthSession: () => mocked.auth }));
vi.mock('../services/lightAppsApi', () => ({
  listLightAppProjects: (...args) => mocked.projects(...args), listLightAppTodos: (...args) => mocked.todos(...args),
  listLightAppTasks: (...args) => mocked.tasks(...args), listLightAppSchedules: (...args) => mocked.schedules(...args)
}));
const todo = (title, id = 1) => ({ todoId: id, title, dueAt: '2026-10-08T18:00:00' });
function deferred() { let resolve; const promise = new Promise(done => { resolve = done; }); return { promise, resolve }; }
let wrapper;
function harness() {
  let calendar;
  wrapper = mount(defineComponent({ setup() { calendar = useTimePrismCalendar(); return {}; }, template: '<div />' }));
  return calendar;
}
beforeEach(() => {
  localStorage.clear();
  mocked.auth = { ensureReady: vi.fn().mockResolvedValue(), user: ref({ userId: 7 }), isAuthenticated: ref(true), authorizedFetch: vi.fn() };
  [mocked.projects, mocked.todos, mocked.tasks, mocked.schedules].forEach(mock => mock.mockReset().mockResolvedValue([]));
});
afterEach(() => wrapper?.unmount());

describe('private calendar source', () => {
  it('clears on account changes and ignores late responses and their cache writes', async () => {
    const oldRequest = deferred();
    mocked.todos.mockReturnValueOnce(oldRequest.promise).mockResolvedValueOnce([todo('新账号', 2)]);
    const calendar = harness();
    await flushPromises();
    mocked.auth.user.value = { userId: 8 };
    expect(calendar.entries.value).toEqual([]);
    await flushPromises();
    oldRequest.resolve([todo('旧账号')]);
    await flushPromises();
    expect(calendar.entries.value.map(item => item.title)).toEqual(['新账号']);
    expect(readLightAppCalendarCache(7).todos).toEqual([]);
    expect(readLightAppCalendarCache(8).todos[0].title).toBe('新账号');
    const authorized = mocked.todos.mock.calls.at(-1)[0];
    await authorized('/example', {});
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith('/example', {}, { expectedUserId: '8' });
  });

  it('reads only guest records on logout and refreshes immediately on local guest persistence', async () => {
    mocked.todos.mockResolvedValue([todo('私有待办')]);
    writeGuestLightAppData({ todos: [todo('本机待办', 3)] });
    const calendar = harness();
    await flushPromises();
    expect(calendar.entries.value[0].title).toBe('私有待办');
    mocked.auth.isAuthenticated.value = false;
    expect(calendar.entries.value[0].title).toBe('本机待办');
    writeGuestLightAppData({ todos: [{ ...todo('本机更新', 3), done: true }] });
    expect(calendar.entries.value[0]).toMatchObject({ title: '本机更新', done: true });
  });

  it('falls back only to the active account cache, never the legacy global cache', async () => {
    writeRemoteLightAppCache({ todos: [todo('别人的全局缓存')] });
    writeLightAppCalendarCache(7, { todos: [todo('当前账号缓存')] });
    mocked.todos.mockRejectedValue(new Error('offline'));
    const calendar = harness();
    await flushPromises();
    expect(calendar.entries.value[0].title).toBe('当前账号缓存');
    expect(calendar.error.value).toContain('暂时无法同步');
    mocked.auth.user.value = { userId: 8 };
    await flushPromises();
    expect(calendar.entries.value).toEqual([]);
  });

  it('refreshes private records after editor persistence and ignores an older in-flight read', async () => {
    const stale = deferred();
    mocked.todos.mockReturnValueOnce(stale.promise).mockResolvedValueOnce([todo('更新后的截止任务')]);
    const calendar = harness();
    await flushPromises();
    writeRemoteLightAppCache({ todos: [todo('编辑器快照')] });
    await flushPromises();
    stale.resolve([todo('过时快照')]);
    await flushPromises();
    expect(calendar.entries.value[0].title).toBe('更新后的截止任务');
  });
});
