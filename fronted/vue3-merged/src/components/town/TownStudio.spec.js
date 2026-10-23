import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import TownStudio from './TownStudio.vue';
import { TOWN_SAVE_KEY, createStarterMap, tileIndex } from './townMap';
import { sceneSaveKey } from './townScenes';

let wrappers = [];
async function openStudio(initialScene = 'kenney') {
  const router = createRouter({ history: createMemoryHistory(), routes: [{ path: '/', component: { components: { TownStudio }, template: `<TownStudio initial-scene="${initialScene}" />` } }, { path: '/other', component: { template: '<div />' } }] });
  await router.push('/'); await router.isReady();
  const root = mount({ template: '<router-view />' }, { global: { plugins: [router] } });
  wrappers.push(root); await flushPromises(); const wrapper = root.findComponent(TownStudio); wrapper.testRouter = router; return wrapper;
}
function button(wrapper, text) { return wrapper.findAll('button').find(b => b.text() === text); }
function pointer(wrapper, type, x, y, extra = {}) { return wrapper.get('canvas').trigger(type, { clientX: x, clientY: y, button: 0, pointerId: 1, ...extra }); }
beforeEach(() => {
  localStorage.clear();
  vi.spyOn(HTMLCanvasElement.prototype, 'getContext').mockReturnValue(null);
  vi.stubGlobal('requestAnimationFrame', vi.fn().mockReturnValue(1));
  vi.stubGlobal('cancelAnimationFrame', vi.fn());
});
afterEach(() => { for (const wrapper of wrappers) wrapper.unmount(); wrappers = []; delete document.fullscreenElement; delete document.exitFullscreen; vi.restoreAllMocks(); vi.unstubAllGlobals(); });

describe('TownStudio interactions', () => {
  it('allows offline guest play, keyboard and touch movement, dialogue and scene actions', async () => {
    const w = await openStudio();
    expect(w.text()).toContain('晴川镇');
    expect(w.text()).toContain('晨钟教堂');
    const canvas = w.get('canvas');
    expect(canvas.attributes('data-player-y')).toBe('16');
    await w.get('.interact-hint').trigger('click'); expect(w.find('.town-dialogue').text()).toContain('晴川镇公告栏');
    await button(w, '继续散步').trigger('click');
    await w.get('.touch-controls .action').trigger('click'); expect(w.find('.town-dialogue p').text()).toContain('欢迎搬来晴川镇');
    await button(w, '继续散步').trigger('click');
    await canvas.trigger('keydown', { key: 'e' }); expect(w.find('.town-dialogue').text()).toContain('晴川镇公告栏');
    await button(w, '继续散步').trigger('click');
    await canvas.trigger('keydown', { key: 'ArrowUp' });
    expect(canvas.attributes('data-player-y')).toBe('15');
    await w.get('[aria-label="向上移动"]').trigger('click');
    expect(canvas.attributes('data-player-y')).toBe('14');
    await button(w, '回到出生点').trigger('click');
    expect(canvas.attributes('data-player-y')).toBe('16');
  });

  it('edits a stroke, supports undo/redo, saves, reloads and protects dirty changes', async () => {
    const w = await openStudio();
    await button(w, '编辑小镇').trigger('click');
    await w.get('[aria-label="地图缩放"]').setValue('fit');
    await w.get('[aria-label="池水"]').trigger('click');
    // Fit scale = min(800 / 608, 520 / 448); tile (8, 15) is left of spawn.
    const size = 520 / 28, offset = (800 - 38 * size) / 2;
    await pointer(w, 'pointerdown', offset + 8.5 * size, 15.5 * size);
    await pointer(w, 'pointerup', offset + 8.5 * size, 15.5 * size);
    expect(w.text()).toContain('有未保存修改');
    expect(button(w, '撤销').attributes('disabled')).toBeUndefined();
    await button(w, '撤销').trigger('click'); expect(w.text()).not.toContain('有未保存修改');
    await button(w, '重做').trigger('click');
    const unload = new Event('beforeunload', { cancelable: true }); window.dispatchEvent(unload); expect(unload.defaultPrevented).toBe(true);
    await button(w, '保存地图').trigger('click');
    const saved = JSON.parse(localStorage.getItem(TOWN_SAVE_KEY)); expect(saved.ground[tileIndex(saved, 8, 15)]).toBe(133);
    expect(w.text()).not.toContain('有未保存修改');
    const fresh = await openStudio(); await button(fresh, '编辑小镇').trigger('click');
    await button(fresh, '保存地图').trigger('click'); expect(JSON.parse(localStorage.getItem(TOWN_SAVE_KEY)).ground[tileIndex(saved, 8, 15)]).toBe(133);
  });

  it('refuses a blocked spawn during play/save and preserves the map after invalid import', async () => {
    const w = await openStudio(); await button(w, '编辑小镇').trigger('click');
    await w.get('[aria-label="池水"]').trigger('click');
    // Spawn is centered in default 2x camera.
    await pointer(w, 'pointerdown', 400, 260); await pointer(w, 'pointerup', 400, 260);
    await button(w, '▶ 试玩地图').trigger('click'); expect(w.get('[role="alert"]').text()).toContain('出生点被阻挡');
    await button(w, '保存地图').trigger('click'); expect(localStorage.getItem(TOWN_SAVE_KEY)).toBeNull();
    const input = w.get('input[type="file"]');
    Object.defineProperty(input.element, 'files', { value: [{ size: 2, text: async () => '{}' }], configurable: true });
    await input.trigger('change'); await flushPromises(); expect(w.get('[role="alert"]').text()).toContain('地图版本');
    expect(w.text()).toContain('晴川镇');
    await button(w, '撤销').trigger('click'); await button(w, '▶ 试玩地图').trigger('click'); expect(button(w, '编辑小镇')).toBeTruthy();
  });

  it('edits event dialogue, keeps it text-only, and emits existing destinations', async () => {
    const saved = createStarterMap(); saved.events.find(e => e.id === 'welcome').destination = 'library'; localStorage.setItem(TOWN_SAVE_KEY, JSON.stringify(saved));
    const w = await openStudio(); await w.get('canvas').trigger('keydown', { key: 'e' });
    await button(w, '打开图书馆').trigger('click'); expect(w.emitted('destination')).toEqual([['library']]);
    await button(w, '编辑小镇').trigger('click'); await button(w, '交互点').trigger('click');
    await pointer(w, 'pointerdown', 400, 292); await pointer(w, 'pointerup', 400, 292);
    const text = '<script>alert(1)</script>'; await w.get('textarea').setValue(text);
    await button(w, '应用交互点').trigger('click'); await button(w, '▶ 试玩地图').trigger('click'); await w.get('canvas').trigger('keydown', { key: 'e' });
    expect(w.find('.town-dialogue p').text()).toBe(text); expect(w.find('.town-dialogue script').exists()).toBe(false);
  });

  it('reports storage failures and requires a concrete reset confirmation', async () => {
    const w = await openStudio(); await button(w, '编辑小镇').trigger('click');
    await w.get('.field-label input').setValue('我的小镇');
    vi.spyOn(Storage.prototype, 'setItem').mockImplementation(() => { throw new DOMException('denied', 'QuotaExceededError'); });
    await button(w, '保存地图').trigger('click'); expect(w.get('[role="alert"]').text()).toContain('导出 JSON'); expect(w.text()).toContain('有未保存修改');
    await button(w, '恢复初始地图').trigger('click'); expect(w.text()).toContain('我的小镇');
    await button(w, '确认恢复').trigger('click'); expect(w.get('.town-title h2').text()).toBe('晴川镇');
    await button(w, '撤销').trigger('click'); expect(w.get('.town-title h2').text()).toBe('我的小镇');
  });

  it('keeps drafts when hidden and guards route navigation with unsaved edits', async () => {
    const w = await openStudio(); await button(w, '编辑小镇').trigger('click');
    await w.get('.field-label input').setValue('尚未保存');
    const confirm = vi.spyOn(window, 'confirm').mockReturnValue(false);
    await w.testRouter.push('/other'); expect(w.testRouter.currentRoute.value.path).toBe('/'); expect(confirm).toHaveBeenCalled();
    await button(w, '保存地图').trigger('click'); await w.testRouter.push('/other'); expect(w.testRouter.currentRoute.value.path).toBe('/other');
  });

  it('exits fullscreen before opening an existing scene destination', async () => {
    const saved = createStarterMap(); saved.events.find(e => e.id === 'welcome').destination = 'library'; localStorage.setItem(TOWN_SAVE_KEY, JSON.stringify(saved));
    const w = await openStudio(); const calls = [];
    Object.defineProperty(document, 'fullscreenElement', { configurable: true, value: w.get('.town-viewport').element });
    Object.defineProperty(document, 'exitFullscreen', { configurable: true, value: vi.fn(async () => { calls.push('exit'); expect(w.emitted('destination')).toBeUndefined(); }) });
    await w.get('.interact-hint').trigger('click'); await button(w, '打开图书馆').trigger('click'); await flushPromises();
    expect(calls).toEqual(['exit']); expect(w.emitted('destination')).toEqual([['library']]);
  });

  it('fills skipped pointer samples as one reversible stroke', async () => {
    const w = await openStudio(); await button(w, '编辑小镇').trigger('click');
    await w.get('[aria-label="地图缩放"]').setValue('fit'); await w.get('[aria-label="池水"]').trigger('click');
    const size = 520 / 28, offset = (800 - 38 * size) / 2;
    await pointer(w, 'pointerdown', offset + 4.5 * size, 15.5 * size);
    await pointer(w, 'pointermove', offset + 8.5 * size, 15.5 * size);
    await pointer(w, 'pointerup', offset + 8.5 * size, 15.5 * size);
    await button(w, '保存地图').trigger('click'); const saved = JSON.parse(localStorage.getItem(TOWN_SAVE_KEY));
    for (let x = 4; x <= 8; x++) expect(saved.ground[tileIndex(saved, x, 15)]).toBe(133);
    await button(w, '撤销').trigger('click'); await button(w, '保存地图').trigger('click');
    expect(JSON.parse(localStorage.getItem(TOWN_SAVE_KEY))).toEqual(createStarterMap());
  });

  it('exports a valid portable map through a connected download anchor', async () => {
    const w = await openStudio(); await button(w, '编辑小镇').trigger('click');
    let payload;
    const OriginalURL = globalThis.URL;
    vi.stubGlobal('URL', class extends OriginalURL {
      static createObjectURL(blob) { payload = blob; return 'blob:town-export'; }
      static revokeObjectURL() {}
    });
    const click = vi.spyOn(HTMLAnchorElement.prototype, 'click').mockImplementation(function () { expect(this.isConnected).toBe(true); expect(this.download).toBe('qingchuan-town.json'); });
    vi.useFakeTimers();
    try {
      await button(w, '导出 JSON').trigger('click');
      expect(click).toHaveBeenCalledOnce(); expect(payload.type).toBe('application/json');
      vi.runAllTimers(); vi.useRealTimers();
      const contents = await new Promise((resolve, reject) => { const reader = new FileReader(); reader.onload = () => resolve(reader.result); reader.onerror = reject; reader.readAsText(payload); });
      expect(JSON.parse(contents)).toEqual(createStarterMap());
      expect(w.text()).toContain('请在浏览器下载列表中确认');
    } finally { vi.useRealTimers(); }
  });

  it('opens the downloaded full scene with source attribution and a bounded palette', async () => {
    const w = await openStudio('victorian');
    expect(w.get('.town-title h2').text()).toBe('维多利亚生活街区');
    expect(w.get('canvas').attributes('data-map-width')).toBe('128');
    expect(w.get('.town-credit').text()).toContain('bluecarrot16');
    expect(w.get('.town-credit').text()).toContain('完整作者与许可');
    await button(w, '编辑小镇').trigger('click'); await button(w, '物件').trigger('click');
    expect(w.findAll('.tile-palette.objects button')).toHaveLength(48);
    await w.get('[aria-label="下一页素材"]').trigger('click');
    expect(w.get('.palette-pagination span').text()).toMatch(/^2 \/ /);
  });

  it('requires a concrete unsaved switch choice and keeps the two scene saves separate', async () => {
    const w = await openStudio(); await button(w, '编辑小镇').trigger('click');
    await w.get('.field-label input').setValue('我的旧村庄');
    await w.get('[aria-label="游玩场景"]').setValue('victorian');
    expect(w.get('.town-title h2').text()).toBe('我的旧村庄'); expect(w.find('.scene-confirm').exists()).toBe(true);
    await button(w, '取消').trigger('click'); expect(w.find('.scene-confirm').exists()).toBe(false);
    await w.get('[aria-label="游玩场景"]').setValue('victorian'); await button(w, '保存并切换').trigger('click');
    expect(w.get('.town-title h2').text()).toBe('维多利亚生活街区');
    expect(JSON.parse(localStorage.getItem(TOWN_SAVE_KEY)).name).toBe('我的旧村庄');
    await w.get('.field-label input').setValue('我的完整街区'); await button(w, '保存地图').trigger('click');
    expect(JSON.parse(localStorage.getItem(sceneSaveKey('victorian'))).name).toBe('我的完整街区');
    await w.get('[aria-label="游玩场景"]').setValue('kenney'); expect(w.get('.town-title h2').text()).toBe('我的旧村庄');
    await w.get('[aria-label="游玩场景"]').setValue('victorian'); expect(w.get('.town-title h2').text()).toBe('我的完整街区');
  });

  it('samples an existing map object without changing the draft or painting on drag', async () => {
    const w = await openStudio(); await button(w, '编辑小镇').trigger('click'); await button(w, '吸管').trigger('click');
    // Source camera is centered on (18,16); fountain is at (18,13).
    await pointer(w, 'pointerdown', 400, 164); await pointer(w, 'pointermove', 432, 164); await pointer(w, 'pointerup', 432, 164);
    expect(w.text()).toContain('已取用物件瓦片 #135'); expect(w.text()).not.toContain('有未保存修改');
    expect(w.get('.tile-palette.objects button[aria-pressed="true"]').attributes('aria-label')).toBe('喷泉');
  });
});
