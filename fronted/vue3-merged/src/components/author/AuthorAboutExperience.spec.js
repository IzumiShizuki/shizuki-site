import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AuthorAboutExperience from './AuthorAboutExperience.vue';

function mountExperience(activeTab = 'about') {
  return mount(AuthorAboutExperience, {
    props: {
      activeTab,
      profile: {
        enabled: true,
        profileJson: {
          hero: { name: 'Shizuki' },
          identity: { activityStatus: '学习中' },
          skills: ['Vue3']
        }
      },
      portals: [{ key: 'blog', title: 'Blog', target: '/blog' }],
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
      journey: [
        { year: '2024', title: '第一次上线', summary: '把小站带到公开网络。' },
        { year: '2025', title: '重新设计', summary: '开始记录长期变化。' }
      ],
      albums: [],
      moments: []
    },
    global: {
      stubs: {
        AuthorAboutOverview: {
          props: ['hero', 'identity', 'skills', 'enabled', 'portals'],
          template: '<section class="about-overview-stub">{{ hero.name }} · {{ identity.activityStatus }} · {{ skills.join(",") }} · {{ portals.length }}</section>'
        },
        AuthorAboutStoryColumn: {
          props: ['showJourney'],
          template: '<main class="story-column-stub" :data-show-journey="String(showJourney)">介绍正文</main>'
        },
        AuthorLifeCardRail: {
          props: ['kind'],
          template: '<section class="life-card-rail-stub" :data-kind="kind" />'
        },
        AuthorPublicPostsColumn: { template: '<main class="public-posts-stub">站点文章</main>' }
      }
    }
  });
}

describe('AuthorAboutExperience shared-shell composition', () => {
  it('renders the complete public story in one ordered center column because the page owns the shared rails', () => {
    const wrapper = mountExperience();

    expect(wrapper.get('[data-author-about-layout="shared-shell"]').exists()).toBe(true);
    expect(wrapper.get('.about-overview-stub').text()).toContain('Shizuki · 学习中 · Vue3 · 1');
    expect(wrapper.get('.author-about-center .story-column-stub').text()).toBe('介绍正文');
    expect(wrapper.get('.story-column-stub').attributes('data-show-journey')).toBe('false');
    expect(wrapper.findAll('[data-author-section]').map((section) => section.attributes('data-author-section'))).toEqual([
      'about',
      'journey',
      'posts'
    ]);
    expect(wrapper.findAll('.about-journey-entry').map((item) => item.text())).toEqual([
      expect.stringContaining('第一次上线'),
      expect.stringContaining('重新设计')
    ]);
    expect(wrapper.get('.public-posts-stub').text()).toBe('站点文章');
    expect(wrapper.findAll('.life-card-rail-stub').map((rail) => rail.attributes('data-kind'))).toEqual(['albums', 'moments']);
    expect(wrapper.find('.content-shell__left').exists()).toBe(false);
    expect(wrapper.find('.content-shell__right').exists()).toBe(false);
    expect(wrapper.find('.auxiliary-drawer').exists()).toBe(false);
  });

  it('keeps legacy tab props on the same complete page instead of branching the composition', () => {
    const wrapper = mountExperience('posts');

    expect(wrapper.get('[data-author-about-layout="shared-shell"]').exists()).toBe(true);
    expect(wrapper.get('.public-posts-stub').text()).toBe('站点文章');
    expect(wrapper.get('.story-column-stub').exists()).toBe(true);
    expect(wrapper.findAll('[data-author-section]')).toHaveLength(3);
  });
});
