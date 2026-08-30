import { mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { describe, expect, it } from 'vitest';
import AuthorLifeCardRail from './AuthorLifeCardRail.vue';

async function mountRail(props) {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/albums', name: 'albums', component: { template: '<div />' } },
      { path: '/albums/:publicSlug', name: 'album-detail', component: { template: '<div />' } },
      { path: '/moments', name: 'moments', component: { template: '<div />' } },
      { path: '/moments/:publicId', name: 'moment-detail', component: { template: '<div />' } }
    ]
  });
  await router.push('/albums');
  await router.isReady();
  return mount(AuthorLifeCardRail, { props, global: { plugins: [router] } });
}

describe('AuthorLifeCardRail', () => {
  it('uses an honest empty state and still exposes the full albums route', async () => {
    const wrapper = await mountRail({ kind: 'albums', items: [] });

    expect(wrapper.get('[data-testid="albums-rail-empty"]').text()).toContain('不会用头像或壁纸代替');
    expect(wrapper.find('img').exists()).toBe(false);
    expect(wrapper.get('.life-rail-heading > a').attributes('href')).toBe('/albums');
  });

  it('isolates an error and renders authorized preview media for real moments', async () => {
    const failed = await mountRail({ kind: 'moments', items: [], error: new Error('upstream') });
    await failed.get('[data-testid="moments-rail-error"] button').trigger('click');
    expect(failed.emitted('retry')).toHaveLength(1);

    const wrapper = await mountRail({
      kind: 'moments',
      items: [{
        publicId: 'mom_public_2',
        body: '一条真实动态',
        publishedAt: '2026-08-29T10:00:00Z',
        photos: [{}],
        cover: {
          mediaRef: 'med_public_2',
          altText: '晚霞',
          preview: { url: '/api/v1/media/med_abcdefghijklmnopqrstuvwxyz1/variants/THUMB_WEBP', width: 640, height: 480 }
        }
      }]
    });

    expect(wrapper.get('.life-preview-card').attributes('href')).toBe('/moments/mom_public_2');
    expect(wrapper.get('.life-preview-card img').attributes('src')).toContain('/variants/THUMB_WEBP');
    expect(wrapper.text()).toContain('一条真实动态');
  });
});
