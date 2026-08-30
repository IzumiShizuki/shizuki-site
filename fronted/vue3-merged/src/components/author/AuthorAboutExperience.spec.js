import { mount } from '@vue/test-utils';
import { afterEach, describe, expect, it, vi } from 'vitest';
import AuthorAboutExperience from './AuthorAboutExperience.vue';

const originalMatchMedia = window.matchMedia;

function installViewportMatch(matches) {
  window.matchMedia = vi.fn().mockReturnValue({
    matches,
    media: '(max-width: 899.98px)',
    addEventListener: vi.fn(),
    removeEventListener: vi.fn()
  });
}

function mountExperience() {
  return mount(AuthorAboutExperience, {
    props: {
      tabs: [{ key: 'about', label: '关于网站' }],
      activeTab: 'about',
      profile: {
        enabled: true,
        profileJson: {
          hero: { name: 'Shizuki', avatarUrl: '/avatar.png' },
          identity: { role: '独立开发者', labels: [] },
          journey: [],
          skills: []
        }
      },
      about: {
        intro: ['一段真实介绍。'],
        introImageUrl: '',
        mission: '持续记录。',
        missionImageUrl: '',
        linksImageUrl: '',
        focus: [],
        music: [],
        links: []
      },
      albums: [],
      moments: []
    },
    global: {
      stubs: {
        AuthorProfileRail: { template: '<aside class="profile-rail-stub" />' },
        AuthorAboutStoryColumn: { template: '<main class="story-column-stub">介绍正文</main>' },
        AuthorLifeCardRail: {
          props: ['kind'],
          template: '<section class="life-card-rail-stub" :data-kind="kind" />'
        },
        AuthorLifeWidgetRail: { template: '<aside class="life-widget-rail-stub" />' },
        AuxiliaryDrawer: {
          props: ['modelValue'],
          template: '<div v-if="modelValue" class="auxiliary-drawer-stub"><slot /></div>'
        }
      }
    }
  });
}

afterEach(() => {
  window.matchMedia = originalMatchMedia;
});

describe('AuthorAboutExperience responsive composition', () => {
  it('composes left, center and right regions on desktop', () => {
    installViewportMatch(false);
    const wrapper = mountExperience();

    expect(wrapper.get('[data-author-about-layout="responsive"]').exists()).toBe(true);
    expect(wrapper.get('.content-shell__left .profile-rail-stub').exists()).toBe(true);
    expect(wrapper.get('.content-shell__main .story-column-stub').text()).toBe('介绍正文');
    expect(wrapper.findAll('.life-card-rail-stub').map((rail) => rail.attributes('data-kind'))).toEqual(['albums', 'moments']);
    expect(wrapper.get('.content-shell__right .life-widget-rail-stub').exists()).toBe(true);
    expect(wrapper.find('.life-drawer-trigger').exists()).toBe(false);
    expect(wrapper.findAll('.life-widget-rail-stub')).toHaveLength(1);
  });

  it('keeps one widget instance and opens it explicitly in the mobile drawer', async () => {
    installViewportMatch(true);
    const wrapper = mountExperience();

    expect(wrapper.find('.content-shell__left').exists()).toBe(false);
    expect(wrapper.find('.content-shell__right').exists()).toBe(false);
    expect(wrapper.findAll('.life-widget-rail-stub')).toHaveLength(0);

    await wrapper.get('.life-drawer-trigger').trigger('click');

    expect(wrapper.get('.auxiliary-drawer-stub .life-widget-rail-stub').exists()).toBe(true);
    expect(wrapper.get('.auxiliary-drawer-stub .profile-rail-stub').exists()).toBe(true);
    expect(wrapper.findAll('.life-widget-rail-stub')).toHaveLength(1);
  });
});
