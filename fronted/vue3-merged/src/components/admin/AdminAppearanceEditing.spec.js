import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { createMemoryHistory, createRouter, RouterView } from 'vue-router';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import Quotes from './AdminDailyQuotesPanel.vue';
import Widgets from './AdminSiteWidgetsPanel.vue';
import * as api from '../../services/adminSiteWidgetsApi';
import * as loginApi from '../../services/siteLoginAppearanceApi';
import { createSiteWidgetForm } from './adminSiteWidgetState';

vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => ({ ensureReady: vi.fn().mockResolvedValue(), isAuthenticated: ref(true), authorizedFetch: vi.fn() }) }));
vi.mock('../../services/adminSiteWidgetsApi', async (original) => Object.fromEntries(Object.keys(await original()).map((key) => [key, vi.fn()])));
vi.mock('../../services/musicApi', () => ({ getAdminDefaultPlaylistBundle: vi.fn().mockResolvedValue({ profile: { name: 'Music' }, tracks: [] }), updateAdminDefaultPlaylistProfile: vi.fn() }));
vi.mock('../../services/siteLoginAppearanceApi', () => ({ fetchAdminLoginAppearance: vi.fn().mockResolvedValue({ version: 1, themePreset: 'milkshake' }), saveAdminLoginAppearance: vi.fn() }));

const quote = { id: 1, text: 'Server quote', providerCode: 'LOCAL', approvalStatus: 'DRAFT', version: 1 };
async function open(component) {
  const router = createRouter({ history: createMemoryHistory(), routes: [{ path: '/author', component }] });
  await router.push('/author');
  const wrapper = mount(RouterView, { global: { plugins: [router] } });
  await flushPromises();
  return wrapper;
}
describe('appearance editor conflict preservation', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    api.listAdminQuotes.mockResolvedValue([quote]);
    api.getAdminWidgetConfiguration.mockResolvedValue(createSiteWidgetForm({ displayName: 'Shanghai', latitude: 31, longitude: 121, timezone: 'Asia/Shanghai', version: 1 }));
    api.getAdminTodayQuote.mockResolvedValue({ available: false });
    api.getAdminSiteWeather.mockResolvedValue({ available: false });
  });
  it('keeps a quote draft after a version conflict', async () => {
    api.updateAdminQuote.mockRejectedValueOnce({ status: 409, message: 'Conflict' });
    const wrapper = await open(Quotes);
    await wrapper.get('.quote-list button').trigger('click');
    await wrapper.get('.quote-editor textarea').setValue('Unsaved quote');
    await wrapper.get('.quote-editor form').trigger('submit');
    await flushPromises();
    expect(wrapper.get('.quote-editor textarea').element.value).toBe('Unsaved quote');
    wrapper.unmount();
  });
  it('keeps location settings after a version conflict', async () => {
    api.saveAdminWidgetConfiguration.mockRejectedValueOnce({ status: 409, message: 'Conflict' });
    const wrapper = await open(Widgets);
    await wrapper.get('.config-panel input').setValue('Edited location');
    await wrapper.get('.config-panel').trigger('submit');
    await flushPromises();
    expect(api.saveAdminWidgetConfiguration).toHaveBeenCalledTimes(1);
    expect(wrapper.get('.config-panel input').element.value).toBe('Edited location');
    wrapper.unmount();
  });
  it('keeps login appearance URLs after a version conflict', async () => {
    loginApi.saveAdminLoginAppearance.mockRejectedValueOnce({ status: 409, message: 'Conflict' });
    const wrapper = await open(Widgets);
    await wrapper.get('.login-panel input').setValue('/images/new-background.webp');
    await wrapper.get('.login-panel').trigger('submit');
    await flushPromises();
    expect(loginApi.saveAdminLoginAppearance).toHaveBeenCalledTimes(1);
    expect(wrapper.get('.login-panel input').element.value).toBe('/images/new-background.webp');
    wrapper.unmount();
  });
  it('blocks saving a failed configuration read while loaded music remains usable', async () => {
    api.getAdminWidgetConfiguration.mockRejectedValueOnce(new Error('Unavailable'));
    const wrapper = await open(Widgets);
    expect(wrapper.get('.config-panel button[type="submit"]').attributes('disabled')).toBeDefined();
    expect(wrapper.get('.music-panel button[type="submit"]').attributes('disabled')).toBeUndefined();
    wrapper.unmount();
  });
  it('retains quote text when starting a new quote is declined', async () => {
    const wrapper = await open(Quotes);
    await wrapper.get('.quote-list button').trigger('click');
    await wrapper.get('.quote-editor textarea').setValue('Unsaved quote');
    const confirm = vi.spyOn(window, 'confirm').mockReturnValue(false);
    await wrapper.findAll('button').find((node) => node.text().includes('新增语录')).trigger('click');
    expect(confirm).toHaveBeenCalled();
    expect(wrapper.get('.quote-editor textarea').element.value).toBe('Unsaved quote');
    confirm.mockRestore();
    wrapper.unmount();
  });
});
