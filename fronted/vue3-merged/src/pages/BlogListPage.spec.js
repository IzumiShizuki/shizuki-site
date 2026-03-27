import { flushPromises, mount } from '@vue/test-utils';
import { nextTick, ref } from 'vue';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import BlogListPage from './BlogListPage.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  listPosts: vi.fn(),
  getPostSidebar: vi.fn(),
  submitPostWhisper: vi.fn(),
  listBlogCategoryMetas: vi.fn(),
  updateBlogCategoryMeta: vi.fn(),
  uploadBlogCategoryCover: vi.fn(),
  deleteBlogCategoryMeta: vi.fn()
}));

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../services/blogApi', () => ({
  listPosts: (...args) => mocked.listPosts(...args),
  getPostSidebar: (...args) => mocked.getPostSidebar(...args),
  submitPostWhisper: (...args) => mocked.submitPostWhisper(...args)
}));

vi.mock('../services/adminApi', () => ({
  listBlogCategoryMetas: (...args) => mocked.listBlogCategoryMetas(...args),
  updateBlogCategoryMeta: (...args) => mocked.updateBlogCategoryMeta(...args),
  uploadBlogCategoryCover: (...args) => mocked.uploadBlogCategoryCover(...args),
  deleteBlogCategoryMeta: (...args) => mocked.deleteBlogCategoryMeta(...args)
}));

vi.mock('../composables/useBlogResponsiveLayout', () => ({
  useBlogResponsiveLayout: () => ({
    isNarrowDesktop: ref(false),
    isMobileLike: ref(false),
    recommendedRightCollapsed: ref(false)
  })
}));

function createAuthMock(overrides = {}) {
  return {
    user: ref({
      userId: 7,
      nickname: 'Izumi',
      groups: ['ADMIN'],
      permissions: ['blog.post.write']
    }),
    isAuthenticated: ref(true),
    ensureReady: vi.fn().mockResolvedValue(),
    authorizedFetch: vi.fn(),
    ...overrides
  };
}

function createDeferred() {
  let resolve;
  let reject;
  const promise = new Promise((res, rej) => {
    resolve = res;
    reject = rej;
  });
  return { promise, resolve, reject };
}

async function settle() {
  await flushPromises();
  await nextTick();
}

async function mountPage(initialPath = '/blog') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/blog', name: 'blog', component: BlogListPage },
      { path: '/blog/editor/:postId?', name: 'blog-editor', component: { template: '<div />' } },
      { path: '/blog/:postId', name: 'blog-detail', component: { template: '<div />' } }
    ]
  });

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(BlogListPage, {
    global: {
      plugins: [router],
      stubs: {
        SubtleScrollArea: {
          props: ['tag'],
          template: '<component :is="tag || \'div\'"><slot /></component>'
        },
        AdminBlogCategoriesPanel: {
          props: ['items'],
          template: `
            <div class="admin-category-panel-stub">
              <div
                v-for="item in items"
                :key="item.categoryCode"
                class="admin-category-panel-item"
              >
                {{ item.categoryCode }}
              </div>
            </div>
          `
        }
      }
    }
  });

  await settle();
  return { wrapper, router };
}

function createListPayload() {
  return {
    items: [
      {
        postId: 101,
        title: 'Dev Post',
        summary: 'summary',
        categoryCode: 'dev',
        tags: ['alpha'],
        wordCount: 1200,
        readingMinutes: 5,
        publishedAt: '2026-03-20T08:00:00Z'
      }
    ],
    total: 1
  };
}

function createSidebarPayload() {
  return {
    latestPosts: [
      {
        postId: 101,
        title: 'Dev Post',
        publishedAt: '2026-03-20T08:00:00Z',
        coverImageUrl: ''
      }
    ],
    categories: [{ categoryCode: 'dev', count: 4, displayName: '开发' }],
    tags: [{ tagCode: 'alpha', count: 3 }],
    archives: [{ month: '2026-03', count: 4 }]
  };
}

function createCategoryMetaPayload() {
  return [
    { categoryCode: 'dev', displayName: '开发', sortNum: 10, enabled: true },
    { categoryCode: 'design', displayName: '设计', sortNum: 20, enabled: true },
    { categoryCode: 'notes', displayName: '笔记', sortNum: 30, enabled: true }
  ];
}

describe('BlogListPage category panel', () => {
  let originalMatchMedia;
  let originalPointerCapture;
  let originalReleasePointerCapture;
  const mountedWrappers = [];

  beforeEach(() => {
    originalMatchMedia = window.matchMedia;
    originalPointerCapture = Element.prototype.setPointerCapture;
    originalReleasePointerCapture = Element.prototype.releasePointerCapture;

    Object.defineProperty(window, 'matchMedia', {
      configurable: true,
      value: vi.fn().mockImplementation(() => ({
        matches: false,
        media: '',
        addEventListener: vi.fn(),
        removeEventListener: vi.fn(),
        addListener: vi.fn(),
        removeListener: vi.fn()
      }))
    });

    Object.defineProperty(Element.prototype, 'setPointerCapture', {
      configurable: true,
      value: vi.fn()
    });
    Object.defineProperty(Element.prototype, 'releasePointerCapture', {
      configurable: true,
      value: vi.fn()
    });

    mocked.auth = createAuthMock();
    mocked.listPosts.mockReset().mockResolvedValue(createListPayload());
    mocked.getPostSidebar.mockReset().mockResolvedValue(createSidebarPayload());
    mocked.submitPostWhisper.mockReset().mockResolvedValue({});
    mocked.listBlogCategoryMetas.mockReset().mockResolvedValue(createCategoryMetaPayload());
    mocked.updateBlogCategoryMeta.mockReset().mockResolvedValue({});
    mocked.uploadBlogCategoryCover.mockReset().mockResolvedValue({});
    mocked.deleteBlogCategoryMeta.mockReset().mockResolvedValue({});
  });

  afterEach(() => {
    while (mountedWrappers.length) {
      mountedWrappers.pop()?.unmount();
    }
    if (originalMatchMedia) {
      Object.defineProperty(window, 'matchMedia', {
        configurable: true,
        value: originalMatchMedia
      });
    }
    if (originalPointerCapture) {
      Object.defineProperty(Element.prototype, 'setPointerCapture', {
        configurable: true,
        value: originalPointerCapture
      });
    }
    if (originalReleasePointerCapture) {
      Object.defineProperty(Element.prototype, 'releasePointerCapture', {
        configurable: true,
        value: originalReleasePointerCapture
      });
    }
    document.body.innerHTML = '';
  });

  it('preloads admin category metadata on the read panel', async () => {
    const { wrapper } = await mountPage('/blog');
    mountedWrappers.push(wrapper);

    const categoryCodes = wrapper
      .findAll('.category-pill')
      .map((node) => node.text().trim())
      .join(' ');

    expect(mocked.auth.ensureReady).toHaveBeenCalled();
    expect(mocked.getPostSidebar).toHaveBeenCalledTimes(1);
    expect(mocked.listBlogCategoryMetas).toHaveBeenCalledTimes(1);
    expect(categoryCodes).toContain('设计');
    expect(categoryCodes).toContain('笔记');
  });

  it('shows a loading state until admin auth is ready on direct categories entry', async () => {
    const authReady = createDeferred();
    mocked.auth = createAuthMock({
      ensureReady: vi.fn().mockReturnValue(authReady.promise)
    });

    const { wrapper } = await mountPage('/blog?panel=categories');
    mountedWrappers.push(wrapper);

    expect(wrapper.text()).toContain('正在同步分类目录');
    expect(wrapper.text()).not.toContain('分类总览');
    expect(wrapper.text()).not.toContain('分类管理');

    authReady.resolve();
    await settle();

    const categoryCodes = wrapper
      .findAll('.admin-category-panel-item')
      .map((node) => node.text().trim());

    expect(wrapper.text()).toContain('分类管理');
    expect(categoryCodes).toEqual(['dev', 'design', 'notes']);
  });

  it('renders every category when opening categories panel directly', async () => {
    const { wrapper } = await mountPage('/blog?panel=categories');
    mountedWrappers.push(wrapper);

    const categoryCodes = wrapper
      .findAll('.admin-category-panel-item')
      .map((node) => node.text().trim());

    expect(categoryCodes).toEqual(['dev', 'design', 'notes']);
  });

  it('reuses preloaded category context when switching from read panel to categories', async () => {
    const { wrapper, router } = await mountPage('/blog');
    mountedWrappers.push(wrapper);

    expect(mocked.getPostSidebar).toHaveBeenCalledTimes(1);
    expect(mocked.listBlogCategoryMetas).toHaveBeenCalledTimes(1);

    await router.push({ name: 'blog', query: { panel: 'categories' } });
    await settle();

    expect(mocked.getPostSidebar).toHaveBeenCalledTimes(1);
    expect(mocked.listBlogCategoryMetas).toHaveBeenCalledTimes(1);
    expect(wrapper.text()).toContain('分类管理');
  });

  it('keeps all categories after sidebar data resolves later than category meta', async () => {
    const sidebarDeferred = createDeferred();
    mocked.getPostSidebar.mockReset().mockReturnValue(sidebarDeferred.promise);

    const { wrapper } = await mountPage('/blog?panel=categories');
    mountedWrappers.push(wrapper);

    expect(wrapper.text()).toContain('正在同步分类目录');

    sidebarDeferred.resolve(createSidebarPayload());
    await flushPromises();
    await nextTick();

    const categoryCodes = wrapper
      .findAll('.admin-category-panel-item')
      .map((node) => node.text().trim());

    expect(categoryCodes).toEqual(['dev', 'design', 'notes']);
  });

  it('keeps public users on the category overview', async () => {
    mocked.auth = createAuthMock({
      user: ref({
        userId: 8,
        nickname: 'Guest',
        groups: [],
        permissions: []
      })
    });

    const { wrapper } = await mountPage('/blog?panel=categories');
    mountedWrappers.push(wrapper);

    expect(wrapper.text()).toContain('分类总览');
    expect(wrapper.text()).not.toContain('分类管理');
    expect(mocked.listBlogCategoryMetas).not.toHaveBeenCalled();
    expect(wrapper.findAll('.category-panel-card')).toHaveLength(1);
  });
});
