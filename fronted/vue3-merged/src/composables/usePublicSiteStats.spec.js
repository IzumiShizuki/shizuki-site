import { defineComponent } from 'vue';
import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { getPostSidebar, listPosts } from '../services/blogApi';
import { usePublicSiteStats } from './usePublicSiteStats';

vi.mock('../services/blogApi', () => ({ listPosts: vi.fn(), getPostSidebar: vi.fn() }));
const Harness = defineComponent({ setup: usePublicSiteStats, template: '<div />' });

describe('public About statistics', () => {
  beforeEach(() => { vi.resetAllMocks(); });

  it('requests anonymous totals and distinct full catalogs, including empty categories', async () => {
    listPosts.mockResolvedValue({ total: 12, items: [{}] });
    getPostSidebar.mockResolvedValue({
      categories: [{ category_code: 'dev', count: 10 }, { categoryCode: 'empty', count: 0 }, { categoryCode: 'dev' }],
      tags: [{ tag_code: 'vue' }, { tagCode: 'vue' }, { tagCode: 'java' }]
    });
    const wrapper = mount(Harness);
    expect(wrapper.vm.loading).toBe(true);
    expect(wrapper.vm.stats.posts).toBe(null);
    await flushPromises();
    expect(listPosts).toHaveBeenCalledWith({ pageNo: 1, pageSize: 1 });
    expect(getPostSidebar).toHaveBeenCalledWith();
    expect({ ...wrapper.vm.stats }).toEqual({ posts: 12, categories: 2, tags: 2 });
    expect(wrapper.vm.loading).toBe(false);
    wrapper.unmount();
  });

  it('publishes a fast response while the other source is still pending, then retries failure', async () => {
    let rejectSidebar;
    listPosts.mockResolvedValue({ total: 12 });
    getPostSidebar.mockReturnValue(new Promise((resolve, reject) => { rejectSidebar = reject; }));
    const wrapper = mount(Harness);
    await flushPromises();
    expect(wrapper.vm.stats.posts).toBe(12);
    expect(wrapper.vm.loading).toBe(true);
    rejectSidebar(new Error('offline'));
    await flushPromises();
    expect(wrapper.vm.error).toBeTruthy();
    expect(wrapper.vm.stats.tags).toBe(null);
    listPosts.mockRejectedValue(new Error('offline'));
    getPostSidebar.mockResolvedValue({ categories: [], tags: [] });
    await wrapper.vm.refresh();
    expect({ ...wrapper.vm.stats }).toEqual({ posts: 12, categories: 0, tags: 0 });
    expect(wrapper.vm.error).toBeTruthy();
    listPosts.mockResolvedValue({ total: 0 });
    await wrapper.vm.refresh();
    expect({ ...wrapper.vm.stats }).toEqual({ posts: 0, categories: 0, tags: 0 });
    expect(wrapper.vm.error).toBe('');
    wrapper.unmount();
  });

  it.each([undefined, null, '', false, -1, 1.5, 'invalid'])('does not turn malformed total %s into zero', async (total) => {
    listPosts.mockResolvedValue({ total });
    getPostSidebar.mockResolvedValue({ categories: null, tags: [{}] });
    const wrapper = mount(Harness);
    await flushPromises();
    expect({ ...wrapper.vm.stats }).toEqual({ posts: null, categories: null, tags: null });
    expect(wrapper.vm.error).toBeTruthy();
    wrapper.unmount();
  });

  it('ignores responses after disposal', async () => {
    let resolvePosts;
    listPosts.mockReturnValue(new Promise((resolve) => { resolvePosts = resolve; }));
    getPostSidebar.mockResolvedValue({ categories: [], tags: [] });
    const wrapper = mount(Harness);
    const stats = wrapper.vm.stats;
    wrapper.unmount();
    resolvePosts({ total: 42 });
    await flushPromises();
    expect(stats.posts).toBe(null);
  });
});
