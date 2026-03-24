import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import BlogSlidevWindow from './BlogSlidevWindow.vue';
import {
  BLOG_PRESENTATION_SCOPE_PUBLIC,
  releaseBlogPresentationWindowState,
  resolveBlogPresentationWindowState
} from './blogPresentationWindowState';

const mocked = vi.hoisted(() => ({
  auth: null,
  generateMyPostPresentation: vi.fn(),
  getMyPostPresentation: vi.fn(),
  getMyPostPresentationPptDownloadUrl: vi.fn(),
  getPostPresentation: vi.fn(),
  getPostPresentationPptDownloadUrl: vi.fn(),
  listMyPosts: vi.fn(),
  listPosts: vi.fn()
}));

vi.mock('../../../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../../../services/blogApi', () => ({
  generateMyPostPresentation: (...args) => mocked.generateMyPostPresentation(...args),
  getMyPostPresentation: (...args) => mocked.getMyPostPresentation(...args),
  getMyPostPresentationPptDownloadUrl: (...args) => mocked.getMyPostPresentationPptDownloadUrl(...args),
  getPostPresentation: (...args) => mocked.getPostPresentation(...args),
  getPostPresentationPptDownloadUrl: (...args) => mocked.getPostPresentationPptDownloadUrl(...args),
  listMyPosts: (...args) => mocked.listMyPosts(...args),
  listPosts: (...args) => mocked.listPosts(...args)
}));

function createPresentationPayload(postId, title) {
  return {
    postId,
    status: 'READY',
    slideCount: 2,
    slidevMarkdown: [
      '---',
      'theme: default',
      '---',
      `# ${title}`,
      '',
      '---',
      '## 第二页',
      '',
      '内容'
    ].join('\n'),
    pptReady: true
  };
}

async function mountWindow(windowId = 910006) {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/blog/:postId', name: 'blog-detail', component: { template: '<div />' } },
      { path: '/blog/editor/:postId?', name: 'blog-editor', component: { template: '<div />' } }
    ]
  });

  await router.push('/blog/18');
  await router.isReady();

  const wrapper = mount(BlogSlidevWindow, {
    props: { windowId },
    global: {
      plugins: [router]
    }
  });

  await flushPromises();
  return wrapper;
}

describe('BlogSlidevWindow', () => {
  beforeEach(() => {
    mocked.auth = {
      isAuthenticated: ref(true),
      authorizedFetch: vi.fn(),
      ensureReady: vi.fn().mockResolvedValue()
    };
    mocked.generateMyPostPresentation.mockReset();
    mocked.getMyPostPresentation.mockReset();
    mocked.getMyPostPresentationPptDownloadUrl.mockReset();
    mocked.getPostPresentation.mockReset();
    mocked.getPostPresentationPptDownloadUrl.mockReset();
    mocked.listMyPosts.mockReset();
    mocked.listPosts.mockReset();

    const state = resolveBlogPresentationWindowState(910006);
    state.postId = 18;
    state.scope = BLOG_PRESENTATION_SCOPE_PUBLIC;
  });

  afterEach(() => {
    releaseBlogPresentationWindowState(910006);
  });

  it('loads public posts into the light app and switches selected article', async () => {
    mocked.listPosts.mockResolvedValue({
      items: [
        { postId: 18, title: '公共演示 A', summary: 'A summary', categoryCode: 'dev', publishedAt: '2026-03-01T10:00:00Z' },
        { postId: 21, title: '公共演示 B', summary: 'B summary', categoryCode: 'life', publishedAt: '2026-03-02T10:00:00Z' }
      ]
    });
    mocked.getPostPresentation.mockImplementation(async (postId) => {
      if (postId === 21) {
        return createPresentationPayload(21, '公共演示 B');
      }
      return createPresentationPayload(18, '公共演示 A');
    });

    const wrapper = await mountWindow();

    expect(mocked.auth.ensureReady).toHaveBeenCalled();
    expect(mocked.listPosts).toHaveBeenCalled();
    expect(mocked.getPostPresentation).toHaveBeenCalledWith(18, mocked.auth.authorizedFetch);
    expect(wrapper.text()).toContain('公共演示 A');

    const targetButton = wrapper.findAll('.library-item').find((node) => node.text().includes('公共演示 B'));
    expect(targetButton).toBeTruthy();

    await targetButton.trigger('click');
    await flushPromises();

    expect(mocked.getPostPresentation).toHaveBeenCalledWith(21, mocked.auth.authorizedFetch);
    expect(wrapper.text()).toContain('公共演示 B');
  });
});
