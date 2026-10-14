import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { defineComponent, onBeforeUnmount, onMounted, ref } from 'vue';
import { resetCompanionMode } from '../../composables/useCompanionMode';
import { openMeguriCompanion } from '../../utils/meguriCompanionBus';
import MeguriCompanion from './MeguriCompanion.vue';

const mocked = vi.hoisted(() => ({ auth: null, mounts: 0, unmounts: 0 }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));
const wrappers = [];
const StageStub = defineComponent({
  name: 'MeguriPage', emits: ['sprite-change'],
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
  const wrapper = mount(MeguriCompanion, { attachTo: document.body,
    global: { plugins: [router], stubs: { MeguriPage: StageStub } } });
  wrappers.push(wrapper);
  return { wrapper, router };
}
async function hiddenGesture(wrapper, count = 5) {
  for (let i = 0; i < count; i++) await wrapper.get('.companion-launcher').trigger('click');
  await flushPromises();
}
describe('companion isolation', () => {
  beforeEach(() => {
    resetCompanionMode();
    mocked.auth = { isAuthenticated: ref(true), user: ref({ userId: 1, groups: ['ADMIN'] }) };
    mocked.mounts = 0; mocked.unmounts = 0;
  });
  afterEach(() => { wrappers.splice(0).forEach((wrapper) => wrapper.unmount()); vi.restoreAllMocks(); });
  it('defaults even ADMIN to an ordinary cat without character names or assets', async () => {
    const { wrapper } = await mountHost();
    openMeguriCompanion();
    await flushPromises();
    expect(wrapper.text()).toContain('小猫陪伴');
    expect(wrapper.text()).not.toMatch(/爱莉|ADMIN|未开放/);
    expect(wrapper.find('img').exists()).toBe(false);
    expect(mocked.mounts).toBe(0);
  });
  it.each([['USER'], ['FRIEND']])('never unlocks the role for %s', async (group) => {
    mocked.auth.user.value.groups = [group];
    const { wrapper } = await mountHost();
    await hiddenGesture(wrapper, 8);
    expect(wrapper.find('.ordinary-companion-panel').exists()).toBe(true);
    expect(mocked.mounts).toBe(0);
  });
  it('keeps the guest companion usable and blocks an unauthenticated ADMIN snapshot', async () => {
    mocked.auth.isAuthenticated.value = false;
    const { wrapper, router } = await mountHost();
    await hiddenGesture(wrapper);
    expect(mocked.mounts).toBe(0);
    await wrapper.findAll('.ordinary-companion-panel nav button')[1].trigger('click');
    await flushPromises();
    expect(router.currentRoute.value.path).toBe('/music-library/music');
  });
  it('requires five rapid activations and preserves the role draft while minimized', async () => {
    const { wrapper } = await mountHost();
    await hiddenGesture(wrapper, 4);
    expect(mocked.mounts).toBe(0);
    await hiddenGesture(wrapper, 1);
    expect(mocked.mounts).toBe(1);
    await wrapper.get('.stage-stub input').setValue('还没说完');
    await wrapper.get('[aria-label="最小化陪伴窗口"]').trigger('click');
    expect(wrapper.get('.companion-panel').isVisible()).toBe(false);
    await wrapper.get('.companion-launcher').trigger('click');
    expect(wrapper.get('.stage-stub input').element.value).toBe('还没说完');
    expect(mocked.mounts).toBe(1);
    await wrapper.get('[aria-label="返回普通模式"]').trigger('click');
    expect(wrapper.find('.stage-stub').exists()).toBe(false);
    expect(wrapper.find('img').exists()).toBe(false);
    expect(wrapper.text()).toContain('小猫陪伴');
  });
  it('does not unlock after the gesture time window expires', async () => {
    const now = vi.spyOn(Date, 'now').mockReturnValue(1000);
    const { wrapper } = await mountHost();
    await hiddenGesture(wrapper, 4);
    now.mockReturnValue(5001);
    await hiddenGesture(wrapper, 1);
    expect(mocked.mounts).toBe(0);
  });
  it('clears mode, stage and sprites on account changes and logout', async () => {
    const { wrapper } = await mountHost();
    await hiddenGesture(wrapper);
    mocked.auth.user.value = { userId: 2, groups: ['ADMIN'] };
    await flushPromises();
    expect(wrapper.find('.stage-stub').exists()).toBe(false);
    expect(wrapper.text()).not.toContain('爱莉');
    await hiddenGesture(wrapper);
    mocked.auth.isAuthenticated.value = false;
    await flushPromises();
    expect(mocked.unmounts).toBe(2);
    expect(wrapper.find('img').exists()).toBe(false);
  });
  it('retains the role during navigation/suspension and hands off without duplication', async () => {
    const { wrapper, router } = await mountHost();
    await hiddenGesture(wrapper);
    await router.push('/blog');
    await wrapper.setProps({ suspended: true });
    expect(wrapper.get('.site-companion').isVisible()).toBe(false);
    expect(mocked.unmounts).toBe(0);
    await wrapper.setProps({ suspended: false });
    await wrapper.get('[aria-label="在 AI Hub 中打开"]').trigger('click');
    await flushPromises();
    expect(router.currentRoute.value.query.mode).toBe('meguri');
    expect(wrapper.find('.stage-stub').exists()).toBe(false);
    expect(mocked.unmounts).toBe(1);
  });
});
