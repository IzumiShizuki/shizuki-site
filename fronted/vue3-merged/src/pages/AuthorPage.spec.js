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

  it('renders homepage portal cards and floating seed whispers on overview', async () => {
    const { wrapper } = await mountPage('/author?tab=overview', ['USER']);

    expect(mocked.getAuthorProfile).toHaveBeenCalledTimes(1);
    expect(mocked.listPublicPostWhispers).toHaveBeenCalledTimes(1);
    expect(wrapper.findAll('.home-portal-card')).toHaveLength(6);
    expect(wrapper.find('.whisper-float-layer').exists()).toBe(true);
    expect(wrapper.findAll('.whisper-float-card').length).toBeGreaterThan(0);
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
    expect(rail.props('distribution')).toBe('stack');
    expect(rail.props('items').map((item) => item.key)).toContain('admin:quota');

    const adminPage = wrapper.getComponent(AdminPageStub);
    expect(adminPage.props('embedded')).toBe(true);
    expect(adminPage.props('forcedTab')).toBe('quota');
  });
});
