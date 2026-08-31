import { flushPromises, mount } from '@vue/test-utils';
import { nextTick, ref } from 'vue';
import { createMemoryHistory, createRouter, RouterView } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { useViewTransitionNavigation } from '../composables/useViewTransitionNavigation';
import BlogPage from './BlogPage.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  api: {
    createPostNotionSyncJob: vi.fn(),
    createMyPost: vi.fn(),
    deleteMyPost: vi.fn(),
    generateMyPostPresentation: vi.fn(),
    getMyPostPresentation: vi.fn(),
    getMyPostPresentationPptDownloadUrl: vi.fn(),
    getMyPostDetail: vi.fn(),
    getPostNotionSyncJob: vi.fn(),
    getPostDetail: vi.fn(),
    getPostPresentation: vi.fn(),
    getPostPresentationPptDownloadUrl: vi.fn(),
    getPostSidebar: vi.fn(),
    getPostMarkdown: vi.fn(),
    listMyPosts: vi.fn(),
    listPosts: vi.fn(),
    publishMyPost: vi.fn(),
    uploadBlogCoverImage: vi.fn(),
    uploadBlogInlineImage: vi.fn(),
    unpublishMyPost: vi.fn(),
    updateMyPost: vi.fn()
  }
}));
const mountedWrappers = [];

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../services/blogApi', () =>
  Object.fromEntries(
    Object.keys(mocked.api).map((key) => [key, (...args) => mocked.api[key](...args)])
  )
);

vi.mock('../utils/blogMermaid', () => ({
  renderMermaidBlocks: vi.fn().mockResolvedValue()
}));

vi.mock('../utils/blogWhiteboardBridge', () => ({
  onBlogWhiteboardExport: () => () => {}
}));

vi.mock('../utils/blogWhiteboardEmbed', () => ({
  createWhiteboardEmbedMarkdown: () => ':::whiteboard\n{}\n:::',
  hydrateWhiteboardEmbeds: () => () => {}
}));

vi.mock('../utils/lightAppWindowBus', () => ({
  openLightAppWindow: vi.fn()
}));

function postDetail(postId, overrides = {}) {
  return {
    postId,
    title: `文章 ${postId}`,
    summary: `摘要 ${postId}`,
    categoryCode: 'life',
    visibility: 'PUBLIC',
    statusCode: 'DRAFT',
    tags: ['daily'],
    markdown: `# 文章 ${postId}\n\n正文`,
    wordCount: 6,
    readingMinutes: 1,
    editable: true,
    allowedGroupCodes: ['USER'],
    ...overrides
  };
}

function presentation(postId, overrides = {}) {
  return {
    postId,
    status: 'READY',
    slideCount: 2,
    slidevMarkdown: '# 演示',
    pptReady: true,
    ...overrides
  };
}

async function settle() {
  await flushPromises();
  await nextTick();
  await flushPromises();
}

async function mountRoute(initialPath) {
  const EmptyPage = { template: '<div data-empty-route />' };
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/blog', name: 'blog', component: EmptyPage },
      { path: '/blog/editor/:postId?', name: 'blog-editor', component: BlogPage },
      { path: '/blog/:postId/presentation', name: 'blog-presentation', component: EmptyPage },
      { path: '/blog/:postId', name: 'blog-detail', component: BlogPage }
    ]
  });
  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(RouterView, {
    attachTo: document.body,
    global: {
      plugins: [router],
      stubs: {
        SubtleScrollArea: {
          name: 'SubtleScrollArea',
          props: ['tag', 'scrollable', 'appScrollOwner'],
          template: '<component :is="tag || \'div\'" :data-scrollable="scrollable" :data-app-scroll-owner="appScrollOwner"><slot /></component>'
        },
        AsyncBlogRichEditor: {
          name: 'AsyncBlogRichEditor',
          props: ['modelValue'],
          emits: ['update:modelValue', 'ready'],
          template: '<textarea data-rich-editor :value="modelValue" @input="$emit(\'update:modelValue\', $event.target.value)" />'
        }
      }
    }
  });
  mountedWrappers.push(wrapper);
  await settle();
  return { wrapper, router };
}

describe('BlogPage reader/editor regression', () => {
  let confirmSpy;
  let originalMatchMedia;
  let originalScrollTo;
  let originalScrollIntoView;

  beforeEach(() => {
    originalMatchMedia = window.matchMedia;
    originalScrollTo = HTMLElement.prototype.scrollTo;
    originalScrollIntoView = HTMLElement.prototype.scrollIntoView;
    Object.defineProperty(window, 'matchMedia', {
      configurable: true,
      value: vi.fn(() => ({
        matches: false,
        addEventListener: vi.fn(),
        removeEventListener: vi.fn()
      }))
    });
    HTMLElement.prototype.scrollTo = vi.fn();
    HTMLElement.prototype.scrollIntoView = vi.fn();
    confirmSpy = vi.spyOn(window, 'confirm').mockReturnValue(true);

    mocked.auth = {
      user: ref({ groups: ['ADMIN'], permissions: ['blog.post.write', 'blog.post.publish'] }),
      isAuthenticated: ref(true),
      ensureReady: vi.fn().mockResolvedValue(),
      authorizedFetch: vi.fn()
    };
    Object.values(mocked.api).forEach((fn) => fn.mockReset());
    mocked.api.getPostDetail.mockImplementation(async (postId) => postDetail(postId));
    mocked.api.getMyPostDetail.mockImplementation(async (postId) => postDetail(postId));
    mocked.api.getPostSidebar.mockResolvedValue({
      latestPosts: [postDetail(42), postDetail(43)],
      categories: [{ categoryCode: 'life', displayName: '生活', count: 2 }]
    });
    mocked.api.listPosts.mockResolvedValue({ items: [postDetail(42), postDetail(43)], total: 2 });
    mocked.api.listMyPosts.mockResolvedValue({ items: [postDetail(12)], total: 1 });
    mocked.api.getPostPresentation.mockImplementation(async (postId) => presentation(postId));
    mocked.api.getMyPostPresentation.mockImplementation(async (postId) => presentation(postId));
  });

  afterEach(() => {
    mountedWrappers.splice(0).forEach((wrapper) => wrapper.unmount());
    confirmSpy.mockRestore();
    Object.defineProperty(window, 'matchMedia', { configurable: true, value: originalMatchMedia });
    HTMLElement.prototype.scrollTo = originalScrollTo;
    HTMLElement.prototype.scrollIntoView = originalScrollIntoView;
  });

  it('loads reader deep links through the center-owned scroll workspace and keeps related navigation canonical', async () => {
    const { wrapper, router } = await mountRoute('/blog/42');
    const page = wrapper.findComponent(BlogPage);

    expect(mocked.api.getPostDetail).toHaveBeenCalledWith(42, mocked.auth.authorizedFetch);
    expect(page.find('[data-blog-workspace="reader"]').attributes('data-scroll-owner')).toBe('center');
    expect(page.find('.detail-scroll').attributes('data-app-scroll-owner')).toBe('true');
    expect(page.find('.detail-scroll').attributes('data-scrollable')).toBe('true');
    expect(page.text()).toContain('文章 42');

    const related = page.findAll('.detail-nav-list button').find((button) => button.text().includes('文章 43'));
    await related.trigger('click');
    await settle();

    expect(router.currentRoute.value.fullPath).toBe('/blog/43');
    expect(mocked.api.getPostDetail).toHaveBeenCalledWith(43, mocked.auth.authorizedFetch);
  });

  it('moves focus to the reader title after the card-navigation fallback finishes loading', async () => {
    const navigation = useViewTransitionNavigation({
      router: { push: vi.fn().mockResolvedValue(undefined) }
    });
    await navigation.navigate('/blog/42', {
      transitionKind: 'content-flow',
      focusTarget: 'blog-reader-title-42'
    });

    const { wrapper } = await mountRoute('/blog/42');
    const title = wrapper.findComponent(BlogPage).find('.detail-title-row h2');

    expect(document.activeElement).toBe(title.element);
  });

  it('keeps editor preview in author scope and marks the fixed workspace explicitly', async () => {
    const { wrapper, router } = await mountRoute('/blog/editor/12');
    const page = wrapper.findComponent(BlogPage);

    expect(mocked.api.getMyPostDetail).toHaveBeenCalledWith(12, mocked.auth.authorizedFetch);
    expect(page.find('[data-blog-workspace="editor"]').attributes('data-scroll-owner')).toBe('workspace');

    await page.findAll('button').find((button) => button.text().includes('文章信息')).trigger('click');
    await settle();
    await page.findAll('button').find((button) => button.text().includes('在线预览')).trigger('click');
    await settle();

    expect(router.currentRoute.value.name).toBe('blog-presentation');
    expect(router.currentRoute.value.query.scope).toBe('mine');
  });

  it('blocks route leave when the current draft is dirty and continues after explicit discard', async () => {
    const { wrapper, router } = await mountRoute('/blog/editor/12');
    const page = wrapper.findComponent(BlogPage);

    await page.find('[data-rich-editor]').setValue('# 已修改但未保存');
    await nextTick();
    expect(page.text()).toContain('有未保存更改');

    confirmSpy.mockReturnValueOnce(false);
    await router.push({ name: 'blog' });
    expect(router.currentRoute.value.name).toBe('blog-editor');

    confirmSpy.mockReturnValueOnce(true);
    await router.push({ name: 'blog' });
    await settle();
    expect(router.currentRoute.value.name).toBe('blog');
  });
});
