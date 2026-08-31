import { flushPromises, mount } from '@vue/test-utils';
import { nextTick, ref } from 'vue';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { PLAYER_BRIDGE_KEY } from '../composables/playerBridge';
import BlogListPage from './BlogListPage.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  listPosts: vi.fn(),
  getPostSidebar: vi.fn(),
  submitPostWhisper: vi.fn(),
  getFeaturedAlbums: vi.fn(),
  getFeaturedMoments: vi.fn(),
  getSiteWeather: vi.fn(),
  getNearbyWeather: vi.fn(),
  getTodayQuote: vi.fn(),
  getQuoteAlternative: vi.fn(),
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

vi.mock('../services/lifeContentApi', () => ({
  getFeaturedAlbums: (...args) => mocked.getFeaturedAlbums(...args),
  getFeaturedMoments: (...args) => mocked.getFeaturedMoments(...args)
}));

vi.mock('../services/siteWidgetsApi', () => ({
  getSiteWeather: (...args) => mocked.getSiteWeather(...args),
  getNearbyWeather: (...args) => mocked.getNearbyWeather(...args),
  getTodayQuote: (...args) => mocked.getTodayQuote(...args),
  getQuoteAlternative: (...args) => mocked.getQuoteAlternative(...args)
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

async function mountPage(initialPath = '/blog', { playerBridge = null } = {}) {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/blog', name: 'blog', component: BlogListPage },
      { path: '/blog/editor/:postId?', name: 'blog-editor', component: { template: '<div />' } },
      { path: '/blog/:postId', name: 'blog-detail', component: { template: '<div />' } },
      { path: '/albums', name: 'albums', component: { template: '<div />' } },
      { path: '/albums/:publicSlug', name: 'album-detail', component: { template: '<div />' } },
      { path: '/moments', name: 'moments', component: { template: '<div />' } },
      { path: '/moments/:publicId', name: 'moment-detail', component: { template: '<div />' } }
    ]
  });

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(BlogListPage, {
    global: {
      plugins: [router],
      provide: playerBridge ? { [PLAYER_BRIDGE_KEY]: playerBridge } : {},
      stubs: {
        SubtleScrollArea: {
          props: ['tag', 'scrollable', 'appScrollOwner'],
          template: '<component :is="tag || \'div\'" :data-scrollable="scrollable" :data-app-scroll-owner="appScrollOwner"><slot /></component>'
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
    mocked.getFeaturedAlbums.mockReset().mockResolvedValue([]);
    mocked.getFeaturedMoments.mockReset().mockResolvedValue([]);
    mocked.getSiteWeather.mockReset().mockResolvedValue({ available: false, forecast: [] });
    mocked.getNearbyWeather.mockReset().mockResolvedValue({ available: false, forecast: [] });
    mocked.getTodayQuote.mockReset().mockResolvedValue({ available: false });
    mocked.getQuoteAlternative.mockReset().mockResolvedValue({ available: false });
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
    delete document.startViewTransition;
    delete document.documentElement.dataset.routeTransition;
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

  it('uses the shared responsive shell and injects only real featured life content', async () => {
    mocked.getFeaturedAlbums.mockResolvedValueOnce([{
      publicSlug: 'album-real-1',
      title: '真实相册',
      summary: '一组照片',
      photoCount: 3,
      cover: null
    }]);
    mocked.getFeaturedMoments.mockResolvedValueOnce([{
      publicId: 'moment-real-1',
      body: '真实动态',
      photos: [],
      cover: null
    }]);

    const { wrapper } = await mountPage('/blog');
    mountedWrappers.push(wrapper);

    expect(wrapper.get('[data-content-layout="responsive"]').exists()).toBe(true);
    expect(wrapper.get('.content-shell__left .left-switch').exists()).toBe(true);
    expect(wrapper.get('.content-shell__main .feed-column').exists()).toBe(true);
    expect(wrapper.get('.content-shell__right .sidebar-column').exists()).toBe(true);
    expect(wrapper.findAll('main')).toHaveLength(0);
    expect(wrapper.get('.main-column').attributes('data-scrollable')).toBe('true');
    expect(wrapper.get('.main-column').attributes('data-app-scroll-owner')).toBe('true');
    expect(wrapper.findAll('.life-preview-card').map((item) => item.text())).toEqual(
      expect.arrayContaining([expect.stringContaining('真实相册'), expect.stringContaining('真实动态')])
    );
    expect(wrapper.findAll('.feed-card')).toHaveLength(0);
    expect(wrapper.get('.feed-hero-title').text()).toBe('Dev Post');
  });

  it('uses the restrained content-flow transition when opening an article card', async () => {
    const finished = Promise.resolve();
    document.startViewTransition = vi.fn((update) => {
      void update();
      return { finished };
    });
    const { wrapper, router } = await mountPage('/blog');
    mountedWrappers.push(wrapper);

    await wrapper.get('.feed-hero').trigger('click');
    await settle();

    expect(document.startViewTransition).toHaveBeenCalledOnce();
    expect(router.currentRoute.value).toMatchObject({ name: 'blog-detail', params: { postId: '101' } });
  });

  it('keeps the blog, navigation and global player usable when every auxiliary source fails', async () => {
    mocked.getFeaturedAlbums.mockRejectedValueOnce(new Error('albums unavailable'));
    mocked.getFeaturedMoments.mockRejectedValueOnce(new Error('moments unavailable'));
    mocked.getSiteWeather.mockRejectedValueOnce(new Error('weather unavailable'));
    mocked.getTodayQuote.mockRejectedValueOnce(new Error('quote unavailable'));

    const playerBridge = {
      tracks: ref([{ id: 'track-still-ready', title: '仍可打开的曲目', artist: '全局播放器', cover: '' }]),
      playlistProfile: ref({ name: '站点推荐' }),
      playlistLoading: ref(false),
      playlistError: ref(''),
      currentTrack: ref(null),
      isPlaying: ref(false),
      setPlayerExpanded: vi.fn(),
      setListOpen: vi.fn()
    };
    const { wrapper } = await mountPage('/blog', { playerBridge });
    mountedWrappers.push(wrapper);

    expect(wrapper.get('.feed-hero-title').text()).toBe('Dev Post');
    expect(wrapper.get('.content-shell__left .left-switch').exists()).toBe(true);
    expect(wrapper.get('[data-testid="albums-rail-error"]').text()).toContain('相册暂时没有读到');
    expect(wrapper.get('[data-testid="moments-rail-error"]').text()).toContain('动态暂时没有读到');
    expect(wrapper.get('.weather-card').text()).toContain('天气读取失败');
    expect(wrapper.get('.quote-card').text()).toContain('今日一言读取失败');
    expect(wrapper.get('.music-projection').text()).toContain('仍可打开的曲目');

    await wrapper.get('.music-projection button').trigger('click');
    expect(playerBridge.setPlayerExpanded).toHaveBeenCalledWith(true);
    expect(playerBridge.setListOpen).toHaveBeenCalledWith(true);
  });

  it('preserves filtering, pagination and cover fallback behavior inside the new shell', async () => {
    mocked.listPosts.mockResolvedValue({
      items: [
        ...createListPayload().items,
        {
          postId: 102,
          title: 'Second Post',
          summary: 'second summary',
          categoryCode: 'dev',
          tags: [],
          wordCount: 800,
          readingMinutes: 3,
          publishedAt: '2026-03-19T08:00:00Z',
          coverImageUrl: ''
        }
      ],
      total: 25
    });

    const { wrapper } = await mountPage('/blog');
    mountedWrappers.push(wrapper);

    expect(wrapper.get('.feed-hero-cover').attributes('src')).toBe('/images/katanegai.jpg');
    const pageTwo = wrapper.findAll('.page-btn').find((button) => button.text().trim() === '2');
    await pageTwo.trigger('click');
    await settle();
    expect(mocked.listPosts.mock.calls.at(-1)[0]).toMatchObject({ pageNo: 2, pageSize: 10 });

    const devCategory = wrapper.findAll('.category-pill').find((button) => button.text().includes('开发'));
    await devCategory.trigger('click');
    await settle();
    expect(mocked.listPosts.mock.calls.at(-1)[0]).toMatchObject({ pageNo: 1, category: 'dev' });
    expect(wrapper.findAll('.feed-card')).toHaveLength(2);
    expect(wrapper.find('.author-life-rail').exists()).toBe(false);
  });

  it('moves blog filters and life widgets behind an explicit drawer on mobile', async () => {
    window.matchMedia.mockImplementation((query) => ({
      matches: query.includes('max-width: 899.98px'),
      media: query,
      addEventListener: vi.fn(),
      removeEventListener: vi.fn(),
      addListener: vi.fn(),
      removeListener: vi.fn()
    }));

    const { wrapper } = await mountPage('/blog');
    mountedWrappers.push(wrapper);

    expect(wrapper.find('.content-shell__right').exists()).toBe(false);
    await wrapper.get('.blog-auxiliary-trigger').trigger('click');
    await settle();

    const drawer = document.body.querySelector('[data-auxiliary-drawer]');
    expect(drawer).not.toBeNull();
    expect(drawer.textContent).toContain('分类筛选');
    expect(drawer.textContent).toContain('站点天气');
    expect(drawer.textContent).toContain('今日一言');
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
