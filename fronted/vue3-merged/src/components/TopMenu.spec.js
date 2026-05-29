import { mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { describe, expect, it } from 'vitest';
import TopMenu from './TopMenu.vue';

async function mountTopMenu(props = {}, initialPath = '/') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/', name: 'home', component: { template: '<div />' } },
      { path: '/profile', name: 'profile', component: { template: '<div />' } },
      { path: '/auth', name: 'auth', component: { template: '<div />' } }
    ]
  });

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(TopMenu, {
    props: {
      menuExpanded: true,
      themeMode: 'night',
      aiChatActive: false,
      aiChatDisabled: false,
      isAuthenticated: false,
      isAdmin: false,
      displayName: '',
      avatarUrl: '',
      authorAvatarUrl: '',
      musicActive: false,
      ambientActive: false,
      effectActive: false,
      ...props
    },
    global: {
      plugins: [router]
    }
  });

  return { wrapper, router };
}

describe('TopMenu profile entry', () => {
  it('opens profile popover for authenticated users and supports profile action', async () => {
    const { wrapper } = await mountTopMenu({
      isAuthenticated: true,
      displayName: 'Izumi'
    });

    await wrapper.get('.user-profile-item').trigger('click');

    expect(wrapper.find('.profile-popover').exists()).toBe(true);
    expect(wrapper.emitted('open-auth')).toBeUndefined();

    await wrapper.get('.profile-popover .popover-item').trigger('click');

    expect(wrapper.emitted('open-profile')).toHaveLength(1);
  });

  it('keeps login entry behavior for guests', async () => {
    const { wrapper } = await mountTopMenu({
      isAuthenticated: false
    });

    await wrapper.get('.user-profile-item.login-entry').trigger('click');

    expect(wrapper.emitted('open-auth')).toHaveLength(1);
    expect(wrapper.emitted('open-profile')).toBeUndefined();
  });

  it('keeps icon-first menu semantics with accessibility labels', async () => {
    const { wrapper } = await mountTopMenu();

    expect(wrapper.findAll('.item-label')).toHaveLength(0);
    expect(wrapper.text()).not.toContain('MENU');
    expect(wrapper.find('[aria-label="Menu Hub"]').exists()).toBe(true);

    await wrapper.get('.toggle-tab').trigger('click');

    expect(wrapper.emitted('toggle-menu')).toHaveLength(1);
  });
});
