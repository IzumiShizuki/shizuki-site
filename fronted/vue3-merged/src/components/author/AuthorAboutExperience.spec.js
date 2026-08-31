import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AuthorAboutExperience from './AuthorAboutExperience.vue';

function mountExperience(activeTab = 'about') {
  return mount(AuthorAboutExperience, {
    props: {
      activeTab,
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
        AuthorAboutStoryColumn: { template: '<main class="story-column-stub">介绍正文</main>' },
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
  it('renders only center-column content because the page owns the shared rails', () => {
    const wrapper = mountExperience();

    expect(wrapper.get('[data-author-about-layout="shared-shell"]').exists()).toBe(true);
    expect(wrapper.get('.author-about-center .story-column-stub').text()).toBe('介绍正文');
    expect(wrapper.findAll('.life-card-rail-stub').map((rail) => rail.attributes('data-kind'))).toEqual(['albums', 'moments']);
    expect(wrapper.find('.content-shell__left').exists()).toBe(false);
    expect(wrapper.find('.content-shell__right').exists()).toBe(false);
    expect(wrapper.find('.auxiliary-drawer').exists()).toBe(false);
  });

  it('keeps the posts view inside the same center-only contract', () => {
    const wrapper = mountExperience('posts');

    expect(wrapper.get('[data-author-about-layout="shared-shell"]').exists()).toBe(true);
    expect(wrapper.get('.public-posts-stub').text()).toBe('站点文章');
    expect(wrapper.find('.story-column-stub').exists()).toBe(false);
  });
});
