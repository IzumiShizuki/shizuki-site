import { mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { describe, expect, it } from 'vitest';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import AuthorLifeCardRail from './AuthorLifeCardRail.vue';
import { HttpError } from '../../services/httpClient';

async function mountRail(props) {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/albums', name: 'albums', component: { template: '<div />' } },
      { path: '/albums/:publicSlug', name: 'album-detail', component: { template: '<div />' } },
      { path: '/moments', name: 'moments', component: { template: '<div />' } },
      { path: '/moments/:publicId', name: 'moment-detail', component: { template: '<div />' } },
      { path: '/author', name: 'author', component: { template: '<div />' } }
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

  it('does not offer dead navigation or retry when the capability is disabled', async () => {
    const wrapper = await mountRail({
      kind: 'albums',
      items: [],
      error: new HttpError('disabled', {
        status: 404,
        problemCode: 'FEATURE_DISABLED'
      })
    });

    expect(wrapper.get('[data-testid="albums-rail-disabled"]').text()).toContain('相册尚未开放');
    expect(wrapper.find('.life-rail-heading > a').exists()).toBe(false);
    expect(wrapper.find('[data-testid="albums-rail-disabled"] button').exists()).toBe(false);
  });

  it('offers the owner a direct next step from an empty life-content rail', async () => {
    const wrapper = await mountRail({ kind: 'albums', items: [], canManage: true });

    const action = wrapper.get('[data-testid="albums-rail-empty"] a');
    expect(action.text()).toContain('前往相册工作台');
    expect(action.attributes('href')).toContain('/author?tab=admin:albums');
  });

  it('uses a valid theme surface instead of mixing a gradient as a color', () => {
    const source = readFileSync(resolve(process.cwd(), 'src/components/author/AuthorLifeCardRail.vue'), 'utf8');
    expect(source).not.toContain('color-mix(in srgb, var(--theme-panel-surface)');
  });
});
