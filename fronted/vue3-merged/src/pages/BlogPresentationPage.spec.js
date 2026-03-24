import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import BlogPresentationPage from './BlogPresentationPage.vue';

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

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../services/blogApi', () => ({
  generateMyPostPresentation: (...args) => mocked.generateMyPostPresentation(...args),
  getMyPostPresentation: (...args) => mocked.getMyPostPresentation(...args),
  getMyPostPresentationPptDownloadUrl: (...args) => mocked.getMyPostPresentationPptDownloadUrl(...args),
  getPostPresentation: (...args) => mocked.getPostPresentation(...args),
  getPostPresentationPptDownloadUrl: (...args) => mocked.getPostPresentationPptDownloadUrl(...args),
  listMyPosts: (...args) => mocked.listMyPosts(...args),
  listPosts: (...args) => mocked.listPosts(...args)
}));

async function mountPage(path) {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/blog/:postId/presentation', component: BlogPresentationPage },
      { path: '/blog/:postId', name: 'blog-detail', component: { template: '<div />' } },
      { path: '/blog', name: 'blog', component: { template: '<div />' } }
    ]
  });

  await router.push(path);
  await router.isReady();

  const wrapper = mount(BlogPresentationPage, {
    global: {
      plugins: [router]
    }
  });

  await flushPromises();
  return wrapper;
}

function createPresentationPayload(overrides = {}) {
  return {
    postId: 12,
    status: 'READY',
    slideCount: 2,
    generatedAt: '2026-03-24T10:00:00',
    templateVersion: 'v1',
    slidevMarkdown: [
      '---',
      'theme: default',
      '---',
      '# 封面',
      '',
      '---',
      '## 第二页',
      '',
      '内容'
    ].join('\n'),
    pptReady: true,
    errorText: '',
    ...overrides
  };
}

describe('BlogPresentationPage', () => {
  let openSpy;

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
    openSpy = vi.spyOn(window, 'open').mockImplementation(() => null);
  });

  afterEach(() => {
    openSpy.mockRestore();
  });

  it('loads author scope presentation and downloads ppt', async () => {
    mocked.getMyPostPresentation.mockResolvedValue(createPresentationPayload());
    mocked.getMyPostPresentationPptDownloadUrl.mockResolvedValue({
      downloadUrl: 'https://example.com/deck.pptx',
      fileName: 'deck.pptx'
    });

    const wrapper = await mountPage('/blog/12/presentation?scope=mine');

    expect(mocked.auth.ensureReady).toHaveBeenCalled();
    expect(mocked.getMyPostPresentation).toHaveBeenCalledWith(12, mocked.auth.authorizedFetch);
    expect(wrapper.text()).toContain('共 2 页');
    expect(wrapper.text()).toContain('封面');

    const downloadButton = wrapper.findAll('button').find((node) => node.text().includes('下载 PPT'));
    expect(downloadButton).toBeTruthy();
    await downloadButton.trigger('click');
    await flushPromises();

    expect(mocked.getMyPostPresentationPptDownloadUrl).toHaveBeenCalledWith(12, mocked.auth.authorizedFetch);
    expect(openSpy).toHaveBeenCalledWith('https://example.com/deck.pptx', '_blank', 'noopener');
  });

  it('loads public scope presentation through public api', async () => {
    mocked.getPostPresentation.mockResolvedValue(createPresentationPayload({ pptReady: false }));

    const wrapper = await mountPage('/blog/18/presentation');

    expect(mocked.getPostPresentation).toHaveBeenCalledWith(18, mocked.auth.authorizedFetch);
    expect(mocked.getMyPostPresentation).not.toHaveBeenCalled();
    expect(wrapper.text()).toContain('封面');
    expect(wrapper.text()).toContain('第二页');

    const downloadButton = wrapper.findAll('button').find((node) => node.text().includes('下载 PPT'));
    expect(downloadButton.attributes('disabled')).toBeDefined();
  });
});
