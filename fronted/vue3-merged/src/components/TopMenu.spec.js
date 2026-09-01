import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, describe, expect, it, vi } from 'vitest';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import TopMenu from './TopMenu.vue';

const mountedWrappers = [];

async function mountTopMenu(props = {}, initialPath = '/') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/', name: 'home', component: { template: '<div />' } },
      { path: '/author', name: 'author', component: { template: '<div />' } },
      { path: '/albums', name: 'albums', component: { template: '<div />' } },
      { path: '/albums/:publicSlug', name: 'album-detail', component: { template: '<div />' } },
      { path: '/moments', name: 'moments', component: { template: '<div />' } },
      { path: '/moments/:publicId', name: 'moment-detail', component: { template: '<div />' } },
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
    },
    attachTo: document.body
  });

  mountedWrappers.push(wrapper);

  return { wrapper, router };
}

afterEach(() => {
  mountedWrappers.splice(0).forEach((wrapper) => wrapper.unmount());
  document.querySelectorAll('[data-test-external-route]').forEach((element) => element.remove());
  vi.unstubAllGlobals();
});

describe('TopMenu profile entry', () => {
  it('keeps Site active on personal routes and opens the three-level hierarchy', async () => {
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
    await flushPromises();

    expect(wrapper.get('.author-info-item').attributes('aria-expanded')).toBe('true');
    expect(wrapper.findAll('.site-destination').map((item) => item.text())).toEqual([
      expect.stringContaining('About'),
      expect.stringContaining('Albums'),
      expect.stringContaining('Moments')
    ]);
    await wrapper.findAll('.site-destination')[0].trigger('click');
    expect(wrapper.emitted('select-site-route')?.[0]).toEqual([{ destination: 'about' }]);
  });

  it('marks Home active on /', async () => {
    const { wrapper } = await mountTopMenu({}, '/');

    expect(wrapper.get('.left-main-btn.active .item-label').text()).toBe('Home');
    expect(wrapper.get('.author-info-item').classes()).not.toContain('route-active');
  });

  it('keeps the same visible menu entries and order on Home and content routes', async () => {
    const { wrapper: homeMenu } = await mountTopMenu({ isHomeRoute: true }, '/');
    const homeEntries = homeMenu.findAll('.top-bar .menu-item-stack').map((entry) => entry.text().trim());

    const { wrapper: authorMenu } = await mountTopMenu({ isHomeRoute: false }, '/author');
    const authorEntries = authorMenu.findAll('.top-bar .menu-item-stack').map((entry) => entry.text().trim());

    expect(homeEntries).toEqual(authorEntries);
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

  it('switches from day to night immediately without opening a popover', async () => {
    const { wrapper } = await mountTopMenu({
      themeMode: 'day',
      isHomeRoute: true
    });

    const themeToggle = wrapper.get('.theme-toggle-item');
    expect(themeToggle.attributes('aria-label')).toBe('切换到夜间模式');
    expect(wrapper.get('.theme-toggle-box').classes()).toContain('day');
    expect(wrapper.get('.theme-toggle-box .fa-sun').exists()).toBe(true);

    await themeToggle.trigger('click');

    expect(wrapper.emitted('set-theme-mode')?.[0]).toEqual(['night']);
    expect(wrapper.find('[data-testid="appearance-popover"]').exists()).toBe(false);
  });

  it('switches from night to day immediately without opening a popover', async () => {
    const { wrapper } = await mountTopMenu({ themeMode: 'night' });
    const themeToggle = wrapper.get('.theme-toggle-item');

    expect(themeToggle.attributes('aria-label')).toBe('切换到白天模式');
    await themeToggle.trigger('click');

    expect(wrapper.emitted('set-theme-mode')?.[0]).toEqual(['day']);
    expect(wrapper.find('[data-testid="appearance-popover"]').exists()).toBe(false);
  });

  it('opens Home appearance controls from the active Home entry without a separate menu item', async () => {
    const { wrapper } = await mountTopMenu({
      themeMode: 'day',
      isHomeRoute: true,
      homeClockBehavior: 'auto',
      homeClockVisible: true,
      homeMotionLevel: 'immersive',
      homeColorMode: 'auto',
      homeAccentHex: '#F2B39D'
    });

    expect(wrapper.find('.appearance-settings-trigger').exists()).toBe(false);
    const homeEntry = wrapper.get('.left-main-btn.active');
    expect(homeEntry.attributes('aria-label')).toBe('打开主页外观设置');
    expect(homeEntry.attributes('aria-expanded')).toBe('false');

    await homeEntry.trigger('click');
    const appearancePanel = wrapper.get('[data-testid="appearance-popover"]');
    expect(homeEntry.attributes('aria-expanded')).toBe('true');
    expect(wrapper.emitted('select-main-route')).toBeUndefined();
    expect(appearancePanel.text()).toContain('主页时钟');
    expect(appearancePanel.text()).toContain('只调整首页时钟、壁纸与动效表现');
    expect(appearancePanel.text()).not.toContain('昼夜主题');
    expect(appearancePanel.text()).not.toContain('白天');
    expect(appearancePanel.text()).not.toContain('夜间');

    const buttons = wrapper.findAll('.appearance-popover button');
    expect(buttons.find((button) => button.text() === '自动').attributes('aria-pressed')).toBe('true');
    expect(buttons.find((button) => button.text() === '沉浸').attributes('aria-pressed')).toBe('true');
    await buttons.find((button) => button.text() === '隐藏').trigger('click');
    await buttons.find((button) => button.text() === '舒缓').trigger('click');
    await buttons.find((button) => button.text() === '手动覆盖').trigger('click');

    expect(wrapper.emitted('set-theme-mode')).toBeUndefined();
    expect(wrapper.emitted('set-home-clock-behavior')?.[0]).toEqual(['hide']);
    expect(wrapper.emitted('set-home-motion-level')?.[0]).toEqual(['soothing']);
    expect(wrapper.emitted('set-home-color-mode')?.[0]).toEqual(['manual']);
  });

  it('navigates through Home normally before the Home entry becomes an appearance trigger', async () => {
    const { wrapper } = await mountTopMenu({ isHomeRoute: false }, '/author');

    await wrapper.findAll('.left-main-btn').find((entry) => entry.text().includes('Home')).trigger('click');

    expect(wrapper.emitted('select-main-route')?.[0]).toEqual(['home']);
    expect(wrapper.find('[data-testid="appearance-popover"]').exists()).toBe(false);
  });

  it('keeps the Home appearance popover outside the liquid navigation clip', () => {
    const source = readFileSync(resolve(process.cwd(), 'src/components/TopMenu.vue'), 'utf8');

    expect(source).toMatch(/\.top-bar\s*\{[\s\S]*?overflow:\s*visible;/);
  });

  it('keeps the Home appearance trigger out of content routes', async () => {
    const { wrapper } = await mountTopMenu({ isHomeRoute: false }, '/author');

    await wrapper.get('.theme-toggle-item').trigger('click');

    expect(wrapper.emitted('set-theme-mode')?.[0]).toEqual(['day']);
    expect(wrapper.find('.appearance-settings-trigger').exists()).toBe(false);
    expect(wrapper.find('[data-testid="appearance-popover"]').exists()).toBe(false);
  });

  it('consumes App-owned route scroll state without installing its own scroll source', async () => {
    const { wrapper } = await mountTopMenu({ routeScrollTop: 0, menuExpanded: false }, '/author');

    expect(wrapper.get('.top-menu-root').attributes('data-route-scroll-top')).toBe('0');
    expect(wrapper.get('.top-menu-root').classes()).not.toContain('route-scrolled');
    expect(wrapper.find('[data-testid="compact-navigation"]').exists()).toBe(false);
    expect(wrapper.findAll('.left-main-btn')).toHaveLength(5);

    await wrapper.setProps({ routeScrollTop: 128.4 });

    expect(wrapper.get('.top-menu-root').attributes('data-route-scroll-top')).toBe('128');
    expect(wrapper.get('.top-menu-root').classes()).toContain('route-scrolled');
    expect(wrapper.get('.top-menu-root').classes()).toContain('compact');
    expect(wrapper.find('.top-bar').exists()).toBe(false);
    expect(wrapper.find('.compact-dock').exists()).toBe(false);
    expect(wrapper.findAll('.toggle-tab')).toHaveLength(1);
    expect(wrapper.get('.toggle-tab').attributes('aria-label')).toBe('展开完整导航');
    expect(wrapper.get('.toggle-tab').attributes('aria-expanded')).toBe('false');

    await wrapper.get('.toggle-tab').trigger('click');
    expect(wrapper.emitted('toggle-menu')).toHaveLength(1);

    const source = readFileSync(resolve(process.cwd(), 'src/components/TopMenu.vue'), 'utf8');
    expect(source).not.toMatch(/(?:window|document)\.addEventListener\(['"]scroll['"]/);
  });

  it('keeps the desktop collapse control available at the top of the page', async () => {
    const { wrapper } = await mountTopMenu({
      routeScrollTop: 0,
      menuExpanded: false,
      menuCollapsed: false
    }, '/author');

    const toggle = wrapper.get('.toggle-tab');
    expect(toggle.attributes('aria-label')).toBe('收起导航，仅保留 Menu 按钮');
    expect(toggle.attributes('aria-expanded')).toBe('true');

    await toggle.trigger('click');
    expect(wrapper.emitted('toggle-menu')).toHaveLength(1);

    await wrapper.setProps({ menuCollapsed: true });
    expect(wrapper.get('.top-menu-root').classes()).toContain('compact');
    expect(wrapper.get('.toggle-tab').attributes('aria-label')).toBe('展开完整导航');
    expect(wrapper.get('.toggle-tab').attributes('aria-expanded')).toBe('false');
  });

  it('closes Site with Escape, returns focus, and also dismisses on outside pointer input', async () => {
    const { wrapper } = await mountTopMenu({}, '/albums');
    const trigger = wrapper.get('.author-info-item');

    await trigger.trigger('click');
    await flushPromises();
    expect(document.activeElement?.textContent).toContain('About');

    await wrapper.get('.top-menu-root').trigger('keydown', { key: 'Escape' });
    await flushPromises();
    expect(trigger.attributes('aria-expanded')).toBe('false');
    expect(document.activeElement).toBe(trigger.element);

    await trigger.trigger('click');
    await flushPromises();
    document.body.dispatchEvent(new Event('pointerdown', { bubbles: true }));
    await flushPromises();
    expect(trigger.attributes('aria-expanded')).toBe('false');
  });

  it('closes on route change and keeps preview state mounted across ordinary toggles', async () => {
    const fetchMock = vi.fn().mockResolvedValue(new Response(JSON.stringify({ code: 'SUCCESS', data: [] }), {
      status: 200,
      headers: { 'content-type': 'application/json' }
    }));
    vi.stubGlobal('fetch', fetchMock);
    const { wrapper, router } = await mountTopMenu({}, '/moments');
    const trigger = wrapper.get('.author-info-item');

    await trigger.trigger('click');
    await flushPromises();
    expect(fetchMock).toHaveBeenCalledTimes(2);
    await trigger.trigger('click');
    await trigger.trigger('click');
    await flushPromises();
    expect(fetchMock).toHaveBeenCalledTimes(2);

    await router.push('/albums');
    await flushPromises();
    expect(trigger.attributes('aria-expanded')).toBe('false');
    expect(wrapper.get('.author-info-item').classes()).toContain('route-active');
  });

  it('keeps Site selected and returns focus to its trigger across Moment detail history', async () => {
    vi.stubGlobal('fetch', vi.fn().mockResolvedValue(new Response(JSON.stringify({ code: 'SUCCESS', data: [] }), {
      status: 200,
      headers: { 'content-type': 'application/json' }
    })));
    const { wrapper, router } = await mountTopMenu({}, '/moments');
    const trigger = wrapper.get('.author-info-item');
    await trigger.trigger('click');
    await flushPromises();
    expect(document.activeElement).not.toBe(trigger.element);

    await router.push('/moments/moment_ABCDEFGHIJKLMNOPQRSTUVWXYZ');
    await flushPromises();
    expect(wrapper.get('.author-info-item').classes()).toContain('route-active');
    expect(trigger.attributes('aria-expanded')).toBe('false');
    expect(document.activeElement).toBe(trigger.element);

    router.back();
    await flushPromises();
    expect(router.currentRoute.value.name).toBe('moments');
    expect(wrapper.get('.author-info-item').classes()).toContain('route-active');
    expect(document.activeElement).toBe(trigger.element);
  });

  it('opens the mobile Life entry as a focus-trapped drawer and restores scroll state', async () => {
    const mediaListeners = new Set();
    vi.stubGlobal('matchMedia', vi.fn((query) => ({
      matches: query.includes('max-width: 899.98px'),
      media: query,
      addEventListener: (_event, listener) => mediaListeners.add(listener),
      removeEventListener: (_event, listener) => mediaListeners.delete(listener)
    })));
    vi.stubGlobal('fetch', vi.fn().mockResolvedValue(new Response(JSON.stringify({ code: 'SUCCESS', data: [] }), {
      status: 200,
      headers: { 'content-type': 'application/json' }
    })));

    const routeContent = document.createElement('main');
    routeContent.className = 'route-content route-content-app-scroll';
    routeContent.dataset.testExternalRoute = 'true';
    routeContent.style.overflow = 'auto';
    routeContent.scrollTop = 237;
    document.body.appendChild(routeContent);

    const { wrapper } = await mountTopMenu({}, '/moments');
    await flushPromises();
    const trigger = wrapper.get('.mobile-site-item');
    await trigger.trigger('click');
    await flushPromises();

    const drawer = document.body.querySelector('.site-menu-popover.mobile-drawer.open');
    expect(drawer).not.toBeNull();
    expect(document.body.style.overflow).toBe('hidden');
    expect(routeContent.style.overflow).toBe('hidden');
    expect(document.activeElement?.textContent).toContain('About');

    drawer.dispatchEvent(new KeyboardEvent('keydown', { key: 'Escape', bubbles: true }));
    await flushPromises();
    expect(document.body.style.overflow).toBe('');
    expect(routeContent.style.overflow).toBe('auto');
    expect(routeContent.scrollTop).toBe(237);
    expect(document.activeElement).toBe(trigger.element);

    const source = readFileSync(resolve(process.cwd(), 'src/components/TopMenu.vue'), 'utf8');
    expect(source).toMatch(/\.mobile-top-nav-item\s*\{[\s\S]*?min-height:\s*44px/);

    routeContent.scrollTop = 319;
    await trigger.trigger('click');
    await flushPromises();
    expect(routeContent.style.overflow).toBe('hidden');
    wrapper.unmount();
    expect(routeContent.style.overflow).toBe('auto');
    expect(routeContent.scrollTop).toBe(319);
  });
});
