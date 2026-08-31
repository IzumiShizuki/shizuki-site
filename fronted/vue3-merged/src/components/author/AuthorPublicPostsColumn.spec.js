import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import AuthorPublicPostsColumn from './AuthorPublicPostsColumn.vue';

const mocked = vi.hoisted(() => ({
  listPosts: vi.fn()
}));

vi.mock('../../services/blogApi', () => ({
  listPosts: (...args) => mocked.listPosts(...args)
}));

async function mountColumn() {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/author', name: 'author', component: { template: '<div />' } },
      { path: '/blog', name: 'blog', component: { template: '<div />' } },
      { path: '/blog/:postId', name: 'blog-detail', component: { template: '<div />' } }
    ]
  });
  await router.push('/author');
  await router.isReady();
  const wrapper = mount(AuthorPublicPostsColumn, { global: { plugins: [router] } });
  await flushPromises();
  return { wrapper, router };
}

function createDeferred() {
  let resolve;
  const promise = new Promise((resolvePromise) => {
    resolve = resolvePromise;
  });
  return { promise, resolve };
}

describe('AuthorPublicPostsColumn', () => {
  beforeEach(() => {
    mocked.listPosts.mockReset();
  });

  it('renders normalized public posts and links to the existing reader route', async () => {
    mocked.listPosts.mockResolvedValue({
      items: [{
        post_id: 14,
        title: '来自公开接口的文章',
        summary: '文章摘要',
        category_code: 'dev',
        reading_minutes: 6,
        tags: ['vue'],
        published_at: '2026-08-28T12:00:00Z'
      }]
    });
    const { wrapper } = await mountColumn();

    expect(mocked.listPosts).toHaveBeenCalledWith({ pageNo: 1, pageSize: 12 });
    const post = wrapper.get('.post-entry');
    expect(post.text()).toContain('来自公开接口的文章');
    expect(post.attributes('href')).toBe('/blog/14');
  });

  it('keeps an honest loading state until the public query resolves', async () => {
    const deferred = createDeferred();
    mocked.listPosts.mockReturnValue(deferred.promise);
    const { wrapper } = await mountColumn();

    expect(wrapper.get('[role="status"]').text()).toContain('正在读取公开文章');
    deferred.resolve({ items: [], total: 0 });
    await flushPromises();
    expect(wrapper.get('.posts-state').text()).toContain('这里还没有公开文章');
  });

  it('offers a deliberate empty state with a main-blog route', async () => {
    mocked.listPosts.mockResolvedValue({ items: [], total: 0 });
    const { wrapper } = await mountColumn();

    expect(wrapper.get('.posts-state').text()).toContain('这里还没有公开文章');
    expect(wrapper.get('.posts-state a').attributes('href')).toBe('/blog');
  });

  it('keeps a recoverable error state and retries the public request', async () => {
    mocked.listPosts.mockRejectedValueOnce(new Error('网络暂时不可用')).mockResolvedValueOnce({ items: [], total: 0 });
    const { wrapper } = await mountColumn();

    expect(wrapper.get('.posts-state--error').text()).toContain('网络暂时不可用');
    await wrapper.get('.posts-retry').trigger('click');
    await flushPromises();
    expect(mocked.listPosts).toHaveBeenCalledTimes(2);
    expect(wrapper.get('.posts-state').text()).toContain('这里还没有公开文章');
  });
});
