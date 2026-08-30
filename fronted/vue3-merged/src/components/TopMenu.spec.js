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
      homeMotionLevel: 'immersive',
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
    await buttons.find((button) => button.text() === '舒缓').trigger('click');
    await buttons.find((button) => button.text() === '手动覆盖').trigger('click');

    expect(wrapper.emitted('set-theme-mode')?.[0]).toEqual(['night']);
    expect(wrapper.emitted('set-home-clock-behavior')?.[0]).toEqual(['hide']);
    expect(wrapper.emitted('set-home-motion-level')?.[0]).toEqual(['soothing']);
    expect(wrapper.emitted('set-home-color-mode')?.[0]).toEqual(['manual']);
  });

  it('keeps Home-only controls hidden while exposing the same two global motion choices on content routes', async () => {
    const { wrapper } = await mountTopMenu({ isHomeRoute: false }, '/author');

    await wrapper.get('.theme-toggle-item').trigger('click');

    const popover = wrapper.get('[data-testid="appearance-popover"]');
    const motionButtons = wrapper.get('[data-testid="motion-preference-options"]').findAll('button');
    expect(popover.text()).toContain('昼夜主题');
    expect(popover.text()).not.toContain('主页时钟');
    expect(motionButtons.map((button) => button.text().trim())).toEqual(['沉浸', '舒缓']);
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
    expect(wrapper.findAll('.compact-dock .compact-nav-item')).toHaveLength(6);
    expect(wrapper.findAll('.compact-dock .compact-nav-item').slice(0, 5).map((item) => item.text())).toEqual([
      'Home',
      'Blog',
      'Music',
      'Apps',
      'AI Hub'
    ]);

    await wrapper.get('.toggle-tab').trigger('click');
    expect(wrapper.emitted('toggle-menu')).toHaveLength(1);

    const source = readFileSync(resolve(process.cwd(), 'src/components/TopMenu.vue'), 'utf8');
    expect(source).not.toMatch(/(?:window|document)\.addEventListener\(['"]scroll['"]/);
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
