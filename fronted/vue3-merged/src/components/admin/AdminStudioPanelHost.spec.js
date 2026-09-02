import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { flushPromises, mount } from '@vue/test-utils';
import { describe, expect, it, vi } from 'vitest';
import { AdminTabKey } from '../../pages/adminUiState';
import AdminStudioPanelHost from './AdminStudioPanelHost.vue';

describe('AdminStudioPanelHost', () => {
  it('loads and renders only the selected secondary workspace', async () => {
    const wrapper = mount(AdminStudioPanelHost, {
      props: { activeTab: AdminTabKey.ALBUMS }
    });
    await vi.dynamicImportSettled();
    await flushPromises();

    expect(wrapper.get('[data-studio-workspace="albums"]').exists()).toBe(true);
    expect(wrapper.find('[data-studio-workspace="moments"]').exists()).toBe(false);

    await wrapper.setProps({ activeTab: AdminTabKey.MOMENTS });
    await vi.dynamicImportSettled();
    await flushPromises();

    expect(wrapper.get('[data-studio-workspace="moments"]').exists()).toBe(true);
    expect(wrapper.find('[data-studio-workspace="albums"]').exists()).toBe(false);

    await wrapper.setProps({ activeTab: AdminTabKey.RECYCLE_BIN });
    await vi.dynamicImportSettled();
    await flushPromises();

    expect(wrapper.get('[data-studio-workspace="recycle-bin"]').exists()).toBe(true);
    expect(wrapper.find('[data-studio-workspace="moments"]').exists()).toBe(false);
  });

  it('keeps every studio panel behind an explicit dynamic import boundary', () => {
    const source = readFileSync(resolve(process.cwd(), 'src/components/admin/AdminStudioPanelHost.vue'), 'utf8');

    expect(source).toContain("defineAsyncComponent(() => import('./AdminAlbumsWorkspace.vue'))");
    expect(source).toContain("defineAsyncComponent(() => import('./AdminMomentsWorkspace.vue'))");
    expect(source).toContain("defineAsyncComponent(() => import('./AdminRecycleBinWorkspace.vue'))");
    expect(source).toContain("defineAsyncComponent(() => import('./AdminDailyQuotesPanel.vue'))");
    expect(source).toContain("defineAsyncComponent(() => import('./AdminSiteWidgetsPanel.vue'))");
    expect(source).not.toMatch(/import Admin(?:AlbumsWorkspace|MomentsWorkspace|DailyQuotesPanel|SiteWidgetsPanel) from/u);
  });

  it('keeps studio workspaces independent from the legacy admin bootstrap gate', () => {
    const source = readFileSync(resolve(process.cwd(), 'src/pages/AdminPage.vue'), 'utf8');

    expect(source).toContain("const isActiveStudioTab = computed(() => studioTabKeys.has(activeTab.value));");
    expect(source).toContain('v-if="!adminAccessReady || (booting && !isActiveStudioTab)"');
    expect(source).toContain('<section v-if="!isActiveStudioTab" class="kpi-grid">');
    expect(source).toMatch(/<AdminStudioPanelHost\s+v-if="isActiveStudioTab"/u);
  });
});
