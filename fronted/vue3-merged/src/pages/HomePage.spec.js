import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { describe, expect, it } from 'vitest';
import HomePage from './HomePage.vue';

async function mountPage(initialPath = '/') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/', name: 'home', component: HomePage },
      { path: '/author', name: 'author', component: { template: '<div />' } },
      { path: '/blog', name: 'blog', component: { template: '<div />' } },
      { path: '/music-library/music', name: 'music-library', component: { template: '<div />' } },
      { path: '/apps', name: 'apps', component: { template: '<div />' } },
      { path: '/ai-hub', name: 'ai-hub', component: { template: '<div />' } }
    ]
  });

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(HomePage, {
    global: {
      plugins: [router]
    }
  });

  return { wrapper, router };
}

describe('HomePage wallpaper home', () => {
  it('opens the site intro from the primary action', async () => {
    const { wrapper, router } = await mountPage('/');

    await wrapper.get('.primary-btn').trigger('click');
    await flushPromises();

    expect(router.currentRoute.value.path).toBe('/author');
    expect(router.currentRoute.value.name).toBe('author');
  });
});
