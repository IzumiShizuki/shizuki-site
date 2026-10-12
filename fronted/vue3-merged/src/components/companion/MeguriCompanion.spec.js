import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { defineComponent, onBeforeUnmount, onMounted, ref } from 'vue';
import { openMeguriCompanion } from '../../utils/meguriCompanionBus';
import MeguriCompanion from './MeguriCompanion.vue';

const mocked = vi.hoisted(() => ({ auth: null, mounts: 0, unmounts: 0 }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));

const StageStub = defineComponent({
  name: 'MeguriPage',
  emits: ['sprite-change'],
  setup(_, { emit }) {
    const draft = ref('');
    onMounted(() => { mocked.mounts++; emit('sprite-change', 'blob:owner-sprite'); });
    onBeforeUnmount(() => mocked.unmounts++);
    return { draft };
  },
  template: '<div class="stage-stub"><input v-model="draft" aria-label="测试对话" /></div>'
});

async function mountHost() {
  const router = createRouter({ history: createMemoryHistory(), routes: [
    { path: '/', name: 'home', component: { template: '<div />' } },
    { path: '/blog', name: 'blog', component: { template: '<div />' } },
    { path: '/ai-hub', name: 'ai-hub', component: { template: '<div />' } }
  ] });
  await router.push('/');
  await router.isReady();
  const wrapper = mount(MeguriCompanion, {
    attachTo: document.body,
    global: { plugins: [router], stubs: { MeguriPage: StageStub } }
  });
  return { wrapper, router };
}

describe('MeguriCompanion', () => {
  beforeEach(() => {
    mocked.auth = { isAuthenticated: ref(true), user: ref({ userId: 1, groups: ['ADMIN'] }) };
    mocked.mounts = 0;
    mocked.unmounts = 0;
  });

  it('never mounts for visitors or non-ADMIN users', async () => {
    mocked.auth.user.value.groups = ['USER'];
    const { wrapper } = await mountHost();
    openMeguriCompanion();
    await flushPromises();
    expect(wrapper.find('.companion-launcher').exists()).toBe(false);
    expect(mocked.mounts).toBe(0);
    mocked.auth.isAuthenticated.value = false;
    mocked.auth.user.value = { userId: 1, groups: ['ADMIN'] };
    await flushPromises();
    expect(wrapper.find('.companion-launcher').exists()).toBe(false);
    wrapper.unmount();
  });

  it('loads on demand and preserves the stage and draft when minimized', async () => {
    const { wrapper } = await mountHost();
    expect(mocked.mounts).toBe(0);
    await wrapper.get('.companion-launcher').trigger('click');
    await flushPromises();
    await wrapper.get('.stage-stub input').setValue('还没说完');
    await wrapper.get('[aria-label="最小化陪伴窗口"]').trigger('click');
    expect(wrapper.get('.companion-panel').isVisible()).toBe(false);
    expect(wrapper.get('.companion-launcher img').attributes('src')).toBe('blob:owner-sprite');
    expect(document.activeElement).toBe(wrapper.get('.companion-launcher').element);
    await wrapper.get('.companion-launcher').trigger('click');
    expect(mocked.mounts).toBe(1);
    expect(wrapper.get('.stage-stub input').element.value).toBe('还没说完');
    wrapper.unmount();
  });

  it('retains the runtime during navigation and focus suspension', async () => {
    const { wrapper, router } = await mountHost();
    openMeguriCompanion();
    await flushPromises();
    await router.push('/blog');
    await wrapper.setProps({ suspended: true });
    expect(wrapper.get('.site-companion').isVisible()).toBe(false);
    expect(mocked.unmounts).toBe(0);
    await wrapper.setProps({ suspended: false });
    expect(wrapper.get('.companion-panel').isVisible()).toBe(true);
    expect(mocked.mounts).toBe(1);
    wrapper.unmount();
  });

  it('hands off to AI Hub without leaving a duplicate stage', async () => {
    const { wrapper, router } = await mountHost();
    openMeguriCompanion();
    await flushPromises();
    await wrapper.get('[aria-label="在 AI Hub 中打开"]').trigger('click');
    await flushPromises();
    expect(router.currentRoute.value.query.mode).toBe('meguri');
    expect(wrapper.find('.stage-stub').exists()).toBe(false);
    expect(mocked.unmounts).toBe(1);
    await router.push('/blog');
    await flushPromises();
    expect(wrapper.find('.companion-launcher img').exists()).toBe(false);
    wrapper.unmount();
  });

  it('clears the runtime and sprite when switching accounts or logging out', async () => {
    const { wrapper } = await mountHost();
    openMeguriCompanion();
    await flushPromises();
    mocked.auth.user.value = { userId: 2, groups: ['ADMIN'] };
    await flushPromises();
    expect(wrapper.find('.stage-stub').exists()).toBe(false);
    expect(wrapper.find('.companion-launcher img').exists()).toBe(false);
    openMeguriCompanion();
    await flushPromises();
    mocked.auth.isAuthenticated.value = false;
    await flushPromises();
    expect(mocked.unmounts).toBe(2);
    expect(wrapper.find('.companion-launcher').exists()).toBe(false);
    wrapper.unmount();
  });

  it('unmounts on close and removes the open-event listener', async () => {
    const { wrapper } = await mountHost();
    openMeguriCompanion();
    await flushPromises();
    await wrapper.get('[aria-label="关闭陪伴窗口"]').trigger('click');
    expect(mocked.unmounts).toBe(1);
    wrapper.unmount();
    openMeguriCompanion();
    await flushPromises();
    expect(mocked.mounts).toBe(1);
  });
});
