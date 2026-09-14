/**
 * @file EqualizerPanelHost.spec.ts
 * 站点均衡器面板接入点骨架的挂载冒烟测试（shizuki-site 新建）。
 * EqualizerPanelHost 暂未挂进页面，vite build 不会编译它；
 * 用 @vue/test-utils 挂载验证 SFC 编译通过且
 * GraphicEqPanel(dB 域) ↔ musicLibraryUiState.eqBands10(0..1 电平域) 桥接成立。
 */
import { describe, expect, it, vi } from 'vitest'
import { mount } from '@vue/test-utils'

async function mountHost() {
  vi.resetModules()
  const [{ useMusicLibraryUiState }, { default: EqualizerPanelHost }] = await Promise.all([
    import('../../pages/musicLibraryUiState'),
    import('./EqualizerPanelHost.vue')
  ])
  const ui = useMusicLibraryUiState()
  const wrapper = mount(EqualizerPanelHost)
  return { ui, wrapper }
}

describe('EqualizerPanelHost', () => {
  it('渲染 GraphicEqPanel 的 master + 10 段推子', async () => {
    const { wrapper } = await mountHost()
    expect(wrapper.find('.sliders-board').exists()).toBe(true)
    expect(wrapper.findAll('input[type="range"]')).toHaveLength(11)
    expect(wrapper.text()).toContain('PREAMP')
  })

  it('面板 preview-band(dB) 写回 ui.eqBands10（0..1 电平）', async () => {
    const { ui, wrapper } = await mountHost()
    const ranges = wrapper.findAll('input[type="range"]')

    await ranges[1].setValue('6')
    expect(ui.eqBands10.value[0]).toBeCloseTo(0.75)

    await ranges[4].setValue('-12')
    expect(ui.eqBands10.value[3]).toBeCloseTo(0)

    // 旧 3 段状态不受 10 段推子影响（各自独立，旧 UI 仍向后兼容）
    expect(ui.eqLevels.value).toEqual([0.66, 0.52, 0.74])
  })

  it('preamp 拖拽为占位 no-op：不改动任何状态、不抛错', async () => {
    const { ui, wrapper } = await mountHost()
    const ranges = wrapper.findAll('input[type="range"]')

    await ranges[0].setValue('8')
    expect(wrapper.emitted('preview-preamp')).toBeUndefined()
    expect(ui.eqBands10.value[0]).toBeCloseTo(0.66)
  })
})
