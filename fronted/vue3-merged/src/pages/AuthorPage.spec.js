import { flushPromises, mount } from '@vue/test-utils';
import { defineComponent, h, ref } from 'vue';
import { createMemoryHistory, createRouter } from 'vue-router';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import AuthorPage from './AuthorPage.vue';
import RouteDotRail from '../components/common/RouteDotRail.vue';
import { createDefaultAuthorProfilePayload } from './authorUiState';

const mocked = vi.hoisted(() => ({
  auth: null,
  getAuthorProfile: vi.fn(),
  getAdminAuthorProfile: vi.fn(),
  updateAdminAuthorProfile: vi.fn(),
  uploadAuthorAvatar: vi.fn(),
  listPublicPostWhispers: vi.fn(),
  readAuthorProfileCache: vi.fn(),
  writeAuthorProfileCache: vi.fn()
}));

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../services/authorApi', () => ({
  getAuthorProfile: (...args) => mocked.getAuthorProfile(...args),
  getAdminAuthorProfile: (...args) => mocked.getAdminAuthorProfile(...args),
  updateAdminAuthorProfile: (...args) => mocked.updateAdminAuthorProfile(...args),
  uploadAuthorAvatar: (...args) => mocked.uploadAuthorAvatar(...args)
}));

vi.mock('../services/blogApi', () => ({
  listPublicPostWhispers: (...args) => mocked.listPublicPostWhispers(...args)
}));

vi.mock('./authorProfileCache', () => ({
  readAuthorProfileCache: (...args) => mocked.readAuthorProfileCache(...args),
  writeAuthorProfileCache: (...args) => mocked.writeAuthorProfileCache(...args)
}));

const SubtleScrollAreaStub = defineComponent({
  name: 'SubtleScrollArea',
  inheritAttrs: false,
  setup(_, { slots, attrs }) {
    return () =>
      h(
        'section',
        {
          class: attrs.class,
          'data-scroll-key': attrs.key
        },
        slots.default ? slots.default() : []
      );
  }
});

const AdminPageStub = defineComponent({
  name: 'AdminPage',
  props: {
    embedded: {
      type: Boolean,
      default: false
    },
    forcedTab: {
      type: String,
      default: ''
    }
  },
  template: '<div class="admin-page-stub" :data-embedded="String(embedded)" :data-forced-tab="forcedTab">{{ forcedTab }}</div>'
});

function createAuth(groups = ['USER']) {
  return {
    isAuthenticated: ref(true),
    user: ref({
      userId: 7,
      groups
    }),
    ensureReady: vi.fn().mockResolvedValue(),
    authorizedFetch: vi.fn()
  };
}

async function mountPage(initialPath, groups = ['USER']) {
  mocked.auth = createAuth(groups);
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/author', name: 'author', component: { template: '<div />' } },
      { path: '/blog', name: 'blog', component: { template: '<div />' } },
      { path: '/:pathMatch(.*)*', component: { template: '<div />' } }
    ]
  });

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(AuthorPage, {
    global: {
      plugins: [router],
      stubs: {
        AdminPage: AdminPageStub,
        SubtleScrollArea: SubtleScrollAreaStub,
        ImageCropDialog: true,
        RailScaffold: {
          template: '<div class="rail-scaffold-stub"><slot name="rail" /><slot /></div>'
        }
      },
      components: {
        RouteDotRail
      }
    }
  });

  await flushPromises();
  return { wrapper, router };
}

describe('AuthorPage admin tab handling', () => {
  beforeEach(() => {
    const payload = createDefaultAuthorProfilePayload();
    mocked.getAuthorProfile.mockReset().mockResolvedValue(payload);
    mocked.getAdminAuthorProfile.mockReset().mockResolvedValue(payload);
    mocked.updateAdminAuthorProfile.mockReset().mockResolvedValue(payload);
    mocked.uploadAuthorAvatar.mockReset().mockResolvedValue({ assetId: 1, url: 'https://example.com/avatar.png' });
    mocked.listPublicPostWhispers.mockReset().mockResolvedValue([]);
    mocked.readAuthorProfileCache.mockReset().mockReturnValue(null);
    mocked.writeAuthorProfileCache.mockReset();
  });

  it('renders homepage portal cards without homepage whispers on overview', async () => {
    const { wrapper, router } = await mountPage('/author?tab=overview', ['USER']);

    expect(mocked.getAuthorProfile).toHaveBeenCalledTimes(1);
    expect(mocked.listPublicPostWhispers).not.toHaveBeenCalled();
    expect(wrapper.findAll('.home-portal-card')).toHaveLength(6);
    expect(wrapper.find('.whisper-float-layer').exists()).toBe(false);

    const rail = wrapper.getComponent(RouteDotRail);
    expect(rail.props('variant')).toBe('menu');
    expect(rail.props('items').map((item) => item.group)).toEqual(['site', 'site', 'site', 'site']);
    expect(wrapper.findAll('.route-rail-label')).toHaveLength(4);
    expect(wrapper.findAll('.route-rail-group-label').map((item) => item.text())).toEqual(['公开内容']);

    await wrapper.get('button[aria-label="关于网站"]').trigger('click');
    await flushPromises();
    expect(router.currentRoute.value.query.tab).toBe('about');
    expect(wrapper.get('.about-manifesto-copy h2').text()).toBe('关于这座小站');
  });

  it('omits repeated default placeholder artwork in the about composition', async () => {
    const { wrapper } = await mountPage('/author?tab=about', ['USER']);

    expect(wrapper.get('.about-manifesto-copy h2').text()).toBe('关于这座小站');
    expect(wrapper.findAll('.about-hero-image')).toHaveLength(1);
    expect(wrapper.findAll('.about-section-image')).toHaveLength(0);
    expect(wrapper.findAll('.about-card-index').map((item) => item.text())).toEqual(['01', '02', '03']);
    expect(wrapper.findAll('a.link-btn').map((item) => item.attributes('href'))).toEqual(['/#/blog', '/#/']);
  });

  it('preserves intentionally repeated custom artwork in the about composition', async () => {
    const payload = createDefaultAuthorProfilePayload();
    payload.profileJson.about.introImageUrl = 'https://example.com/shared-about.png';
    payload.profileJson.about.missionImageUrl = 'https://example.com/shared-about.png';
    payload.profileJson.about.linksImageUrl = 'https://example.com/shared-about.png';
    mocked.getAuthorProfile.mockResolvedValueOnce(payload);

    const { wrapper } = await mountPage('/author?tab=about', ['USER']);

    expect(wrapper.findAll('.about-hero-image')).toHaveLength(1);
    expect(wrapper.findAll('.about-section-image')).toHaveLength(2);
    expect(wrapper.findAll('.about-section-image').map((item) => item.attributes('src'))).toEqual([
      'https://example.com/shared-about.png',
      'https://example.com/shared-about.png'
    ]);
  });

  it('allows only safe internal and external protocols for configured about links', async () => {
    const payload = createDefaultAuthorProfilePayload();
    payload.profileJson.about.links = [
      { label: '危险脚本', url: 'javascript:alert(1)' },
      { label: '协议相对', url: '//example.com/docs' },
      { label: '邮件联系', url: 'mailto:hello@example.com' },
      { label: '安全外链', url: 'https://example.com' }
    ];
    mocked.getAuthorProfile.mockResolvedValueOnce(payload);

    const { wrapper } = await mountPage('/author?tab=about', ['USER']);
    const links = wrapper.findAll('a.link-btn');

    expect(links[0].attributes()).toMatchObject({ href: '#', 'aria-disabled': 'true' });
    expect(links[0].attributes('target')).toBeUndefined();
    expect(links[1].attributes()).toMatchObject({ href: '//example.com/docs', target: '_blank', rel: 'noopener noreferrer' });
    expect(links[2].attributes('href')).toBe('mailto:hello@example.com');
    expect(links[2].attributes('target')).toBeUndefined();
    expect(links[3].attributes()).toMatchObject({ href: 'https://example.com', target: '_blank', rel: 'noopener noreferrer' });
  });

  it('normalizes admin tabs back to overview for non-admin users', async () => {
    const { wrapper, router } = await mountPage('/author?tab=admin:quota', ['USER']);

    expect(router.currentRoute.value.query.tab).toBe('overview');
    expect(wrapper.findComponent(AdminPageStub).exists()).toBe(false);
    expect(mocked.getAuthorProfile).toHaveBeenCalledTimes(1);
  });

  it('renders embedded admin console for admin tabs and exposes stacked rail distribution', async () => {
    const { wrapper, router } = await mountPage('/author?tab=admin:quota', ['ADMIN']);

    expect(router.currentRoute.value.query.tab).toBe('admin:quota');

    const rail = wrapper.getComponent(RouteDotRail);
    expect(rail.props('activeKey')).toBe('admin:quota');
    expect(rail.props('variant')).toBe('menu');
    expect(rail.props('distribution')).toBe('stack');
    expect(rail.props('items').map((item) => item.key)).toContain('admin:quota');
    expect(rail.props('items').filter((item) => item.group === 'site')).toHaveLength(4);
    expect(rail.props('items').filter((item) => item.group === 'manage').length).toBeGreaterThanOrEqual(7);
    expect(rail.props('items').filter((item) => item.group === 'manage').map((item) => item.key)).toContain('site-settings');

    const adminPage = wrapper.getComponent(AdminPageStub);
    expect(adminPage.props('embedded')).toBe(true);
    expect(adminPage.props('forcedTab')).toBe('quota');
  });
});
