import { mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { describe, expect, it } from 'vitest';
import TopMenu from './TopMenu.vue';

async function mountTopMenu(props = {}, initialPath = '/') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/', name: 'home', component: { template: '<div />' } },
      { path: '/author', name: 'author', component: { template: '<div />' } },
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
  it('keeps the site shortcut active on /author without marking Home active', async () => {
    const { wrapper } = await mountTopMenu(
      {
        isAuthenticated: true,
        displayName: 'Izumi'
      },
      '/author'
    );

    expect(wrapper.findAll('.left-main-btn.active')).toHaveLength(0);
    expect(wrapper.get('.author-info-item').classes()).toContain('route-active');

    await wrapper.get('.author-info-item').trigger('click');

    expect(wrapper.emitted('open-author')).toHaveLength(1);
  });

  it('marks Home active on /', async () => {
    const { wrapper } = await mountTopMenu({}, '/');

    expect(wrapper.get('.left-main-btn.active .item-label').text()).toBe('Home');
    expect(wrapper.get('.author-info-item').classes()).not.toContain('route-active');
  });

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

  it('opens route-aware appearance controls and emits explicit theme and Home preference changes', async () => {
    const { wrapper } = await mountTopMenu({
      themeMode: 'day',
      isHomeRoute: true,
      homeClockBehavior: 'auto',
      homeClockVisible: true,
      homeMotionLevel: 'vivid',
      homeColorMode: 'auto',
      homeAccentHex: '#F2B39D'
    });

    expect(wrapper.get('.theme-toggle-item .item-label').text()).toBe('主题');
    expect(wrapper.get('.theme-toggle-box').classes()).toContain('day');
    expect(wrapper.get('.theme-toggle-box .fa-sun').exists()).toBe(true);

    await wrapper.get('.theme-toggle-item').trigger('click');
    expect(wrapper.get('[data-testid="appearance-popover"]').text()).toContain('主页时钟');

    const buttons = wrapper.findAll('.appearance-popover button');
    await buttons.find((button) => button.text().includes('夜间')).trigger('click');
    await buttons.find((button) => button.text() === '隐藏').trigger('click');
    await buttons.find((button) => button.text() === '克制').trigger('click');
    await buttons.find((button) => button.text() === '手动覆盖').trigger('click');

    expect(wrapper.emitted('set-theme-mode')?.[0]).toEqual(['night']);
    expect(wrapper.emitted('set-home-clock-behavior')?.[0]).toEqual(['hide']);
    expect(wrapper.emitted('set-home-motion-level')?.[0]).toEqual(['calm']);
    expect(wrapper.emitted('set-home-color-mode')?.[0]).toEqual(['manual']);
  });

  it('keeps Home-only options out of the appearance panel on content routes', async () => {
    const { wrapper } = await mountTopMenu({ isHomeRoute: false }, '/author');

    await wrapper.get('.theme-toggle-item').trigger('click');

    expect(wrapper.get('[data-testid="appearance-popover"]').text()).toContain('昼夜主题');
    expect(wrapper.get('[data-testid="appearance-popover"]').text()).not.toContain('主页时钟');
    expect(wrapper.get('[data-testid="appearance-popover"]').text()).not.toContain('Material 动效');
  });
});
