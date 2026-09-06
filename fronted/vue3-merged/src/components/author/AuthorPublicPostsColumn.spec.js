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

  it('reserves the cover layout only for posts with real cover media', async () => {
    mocked.listPosts.mockResolvedValue({
      items: [
        {
          post_id: 21,
          title: '没有封面的文章',
          summary: '应当使用完整内容宽度',
          category_code: 'dev',
          reading_minutes: 8,
          published_at: '2026-08-28T12:00:00Z'
        },
        {
          post_id: 22,
          title: '带封面的文章',
          summary: '应当启用图文分栏',
          cover_image_url: '/covers/post-22.webp',
          category_code: 'life',
          reading_minutes: 5,
          published_at: '2026-08-29T12:00:00Z'
        }
      ]
    });
    const { wrapper } = await mountColumn();
    const posts = wrapper.findAll('.post-entry');

    expect(posts).toHaveLength(2);
    expect(posts[0].classes()).not.toContain('post-entry--with-cover');
    expect(posts[0].find('.post-entry-cover').exists()).toBe(false);
    expect(posts[1].classes()).toContain('post-entry--with-cover');
    expect(posts[1].get('.post-entry-cover').attributes('src')).toBe('/covers/post-22.webp');
  });

  it('uses the Blog-aligned reading hierarchy and explicit reading action', async () => {
    mocked.listPosts.mockResolvedValue({
      items: [{
        post_id: 23,
        title: '一篇拥有较长标题并需要保持自然阅读节奏的公开文章',
        summary: '摘要位于阅读信息之后，并且不会和标签以及阅读入口互相挤压。',
        category_code: 'dev',
        reading_minutes: 12,
        tags: ['agent', 'ai', 'java'],
        published_at: '2026-08-30T12:00:00Z'
      }]
    });
    const { wrapper } = await mountColumn();
    const copy = wrapper.get('.post-entry-copy');

    expect(copy.element.children).toHaveLength(5);
    expect([...copy.element.children].map((element) => element.className)).toEqual([
      'post-entry-context',
      'post-entry-title',
      'post-entry-meta',
      'post-entry-summary',
      'post-entry-foot'
    ]);
    expect(copy.get('.post-entry-meta').text()).toContain('12 分钟阅读');
    expect(copy.get('.post-tags').text()).toContain('#agent');
    expect(copy.get('.post-read-more').text()).toContain('阅读全文');
    expect(copy.findAll('[aria-hidden="true"]')).toHaveLength(3);
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
