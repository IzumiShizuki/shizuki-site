import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';

const apiMocks = vi.hoisted(() => ({
  fetchCatalog: vi.fn(),
  fetchDetail: vi.fn()
}));

vi.mock('./kjToolSourceApi', async (importOriginal) => {
  const original = await importOriginal();
  return {
    ...original,
    fetchKjToolCatalog: (...args) => apiMocks.fetchCatalog(...args),
    fetchKjToolDetail: (...args) => apiMocks.fetchDetail(...args)
  };
});

import KjToolSourceWindow from './KjToolSourceWindow.vue';

describe('KjToolSourceWindow', () => {
  beforeEach(() => {
    apiMocks.fetchCatalog.mockReset();
    apiMocks.fetchDetail.mockReset();
    apiMocks.fetchCatalog.mockResolvedValue({
      enabled: true,
      sourceName: 'KJ 应用社区',
      sourceHomeUrl: 'https://kj.sgguo.com/',
      categories: [{ id: 'efficiency', name: '效率工具', icon: 'fa-bolt' }],
      tools: [{
        id: 'drawing-1',
        name: '社区画板',
        description: 'Canvas drawing tool',
        author: 'KJ author',
        category: 'efficiency',
        type: 'code',
        icon: 'fas fa-paint-brush',
        color: '#187aff',
        version: '1.0.0',
        downloads: 12,
        compatible: true,
        launchMode: 'document',
        incompatibleReason: ''
      }]
    });
    apiMocks.fetchDetail.mockResolvedValue({
      id: 'drawing-1',
      name: '社区画板',
      description: 'Canvas drawing tool',
      author: 'KJ author',
      category: 'efficiency',
      type: 'code',
      icon: 'fas fa-paint-brush',
      color: '#187aff',
      version: '1.0.0',
      downloads: 12,
      compatible: true,
      launchMode: 'document',
      incompatibleReason: '',
      html: '<main>drawing</main>',
      css: '',
      script: '',
      url: '',
      sourceHomeUrl: 'https://kj.sgguo.com/'
    });
  });

  it('loads the catalog and opens acquired code inside a sandbox without same-origin permission', async () => {
    const wrapper = mount(KjToolSourceWindow, {
      props: { windowId: 910009 },
      global: {
        stubs: {
          LightAppTopToolbar: { template: '<div class="toolbar-stub"><slot /></div>' }
        }
      }
    });
    await flushPromises();

    expect(wrapper.text()).toContain('社区画板');
    await wrapper.get('.acquire-btn').trigger('click');
    await flushPromises();

    const frame = wrapper.get('iframe.tool-frame');
    expect(frame.attributes('sandbox')).toContain('allow-scripts');
    expect(frame.attributes('sandbox')).not.toContain('allow-same-origin');
    expect(frame.attributes('srcdoc')).toContain('<main>drawing</main>');
    expect(wrapper.text()).toContain('第三方作者');
    wrapper.unmount();
  });

  it('filters catalog tools by search text', async () => {
    const wrapper = mount(KjToolSourceWindow, {
      global: {
        stubs: {
          LightAppTopToolbar: { template: '<div><slot /></div>' }
        }
      }
    });
    await flushPromises();
    await wrapper.get('input[type="search"]').setValue('does-not-exist');
    expect(wrapper.text()).toContain('没有匹配的工具');
    wrapper.unmount();
  });
});
