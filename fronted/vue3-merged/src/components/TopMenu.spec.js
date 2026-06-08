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
  it('opens profile directly for authenticated users', async () => {
    const { wrapper } = await mountTopMenu({
      isAuthenticated: true,
      displayName: 'Izumi'
    });

    await wrapper.get('.user-profile-item').trigger('click');

    expect(wrapper.emitted('open-profile')).toHaveLength(1);
    expect(wrapper.emitted('open-auth')).toBeUndefined();
    expect(wrapper.find('.profile-popover').exists()).toBe(false);
    expect(wrapper.text()).not.toContain('进入个人页面');
    expect(wrapper.text()).not.toContain('登出');
  });

  it('keeps login entry behavior for guests', async () => {
    const { wrapper } = await mountTopMenu({
      isAuthenticated: false
    });

    await wrapper.get('.user-profile-item.login-entry').trigger('click');

    expect(wrapper.emitted('open-auth')).toHaveLength(1);
    expect(wrapper.emitted('open-profile')).toBeUndefined();
  });

  it('emits theme toggle events and reflects the current mode label', async () => {
    const { wrapper } = await mountTopMenu({
      themeMode: 'day'
    });

    expect(wrapper.get('.theme-toggle-item .item-label').text()).toBe('白天模式');
    expect(wrapper.get('.theme-toggle-box').classes()).toContain('day');
    expect(wrapper.get('.theme-toggle-box .fa-sun').exists()).toBe(true);

    await wrapper.get('.theme-toggle-item').trigger('click');

    expect(wrapper.emitted('toggle-theme-mode')).toHaveLength(1);
  });
});
