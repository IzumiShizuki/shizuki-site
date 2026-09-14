/**
 * @file equalizerComponents.spec.ts
 * 均衡器 UI 组件挂载冒烟测试（shizuki-site 新建）。
 * 这些组件暂未被 App 入口引用，vite build 不会编译它们；
 * 用 @vue/test-utils 挂载验证 SFC 模板/脚本编译通过且 props/emits 契约成立。
 */
import { describe, expect, it } from 'vitest'
import { mount } from '@vue/test-utils'
import GraphicEqPanel from './GraphicEqPanel.vue'
import FrequencyResponseToolbar from './FrequencyResponseToolbar.vue'
import FrequencyResponseChart from './FrequencyResponseChart.vue'
import ParametricEqWorkspace from './ParametricEqWorkspace.vue'
import { computeBandResponse, computeCompositeResponse } from '../../../utils/audioEngine/eqResponse'
import {
  defaultEqBands,
  filterTypes,
  responseToPath
} from '../../../utils/audioEngine/equalizerPageLogic'
import type { EqualizerBand } from '../../../utils/audioEngine/equalizerTypes'

function bandPaths(bands: EqualizerBand[], mode: 'graphic' | 'parametric') {
  return bands.map((band, index) => ({
    index,
    path: responseToPath(computeBandResponse(band, { mode, pointCount: 64 }))
  }))
}

function compositePaths(bands: EqualizerBand[], preampDb: number, mode: 'graphic' | 'parametric') {
  const response = computeCompositeResponse(bands, preampDb, { mode, pointCount: 64 })
  const path = responseToPath(response)
  return { path, fill: path + ' L100,100 L0,100 Z' }
}

const twoBands: EqualizerBand[] = [
  { frequency: 500, gain: 3, q: 1.2, filterType: 'peak' },
  { frequency: 2000, gain: -2, q: 1, filterType: 'peak' }
]

describe('GraphicEqPanel', () => {
  it('渲染 master + 10 段推子并转发 preview-band 事件', async () => {
    const wrapper = mount(GraphicEqPanel, {
      props: { preamp: 0, bands: defaultEqBands, autoPreampEnabled: false }
    })
    const ranges = wrapper.findAll('input[type="range"]')
    expect(ranges).toHaveLength(11)

    await ranges[1].setValue('5.5')
    const previews = wrapper.emitted('preview-band')
    expect(previews).toBeTruthy()
    expect(previews![0]).toEqual([0, { gain: 5.5 }])
  })

  it('autoPreampEnabled 时 master 推子禁用并显示 AUTO', () => {
    const wrapper = mount(GraphicEqPanel, {
      props: { preamp: 0, bands: defaultEqBands, autoPreampEnabled: true }
    })
    const masterInput = wrapper.findAll('input[type="range"]')[0]
    expect(masterInput.attributes('disabled')).toBeDefined()
    expect(wrapper.text()).toContain('PREAMP · AUTO')
  })
})

describe('FrequencyResponseToolbar', () => {
  it('渲染视图切换与导入按钮，未导入时耳机频响禁用', async () => {
    const wrapper = mount(FrequencyResponseToolbar, {
      props: { responseView: 'dsp', importedFrequencyResponse: null, importing: false, error: '' }
    })
    expect(wrapper.text()).toContain('DSP 响应')
    expect(wrapper.text()).toContain('耳机频响')

    const headphoneButton = wrapper
      .findAll('button')
      .find((button) => button.text() === '耳机频响')
    expect(headphoneButton?.attributes('disabled')).toBeDefined()

    const importButton = wrapper
      .findAll('button')
      .find((button) => button.text().includes('导入 AutoEq CSV'))
    await importButton?.trigger('click')
    expect(wrapper.emitted('import')).toHaveLength(1)
  })
})

describe('FrequencyResponseChart', () => {
  it('渲染 SVG 频响图、复合曲线与图例，并转发 toggle-manual', async () => {
    const composite = compositePaths(defaultEqBands, 0, 'graphic')
    const wrapper = mount(FrequencyResponseChart, {
      props: {
        bands: defaultEqBands,
        responseView: 'dsp',
        importedFrequencyResponse: null,
        importing: false,
        error: '',
        opraCompensationEnabled: false,
        manualResponsePath: composite.path,
        opraResponsePath: '',
        opraEstimatedDeviationPath: '',
        responsePath: composite.path,
        responseFillPath: composite.fill,
        measuredSourcePath: '',
        targetResponsePath: '',
        combinedFilterPath: '',
        correctedAcousticPath: '',
        bandResponsePaths: bandPaths(defaultEqBands, 'graphic'),
        showManualResponse: true,
        showOpraResponse: false,
        showOpraEstimatedDeviation: false,
        showMeasuredSource: true,
        showTargetResponse: true,
        showIndividualFilters: true,
        showCombinedFilter: true,
        showCorrectedResponse: true
      }
    })
    expect(wrapper.find('svg').exists()).toBe(true)
    expect(wrapper.find('.equalizer-spectrum-line').exists()).toBe(true)
    expect(wrapper.findAll('.equalizer-band-line')).toHaveLength(10)
    expect(wrapper.text()).toContain('总 DSP 合成')

    const manualLegend = wrapper
      .findAll('button')
      .find((button) => button.text().includes('手动 EQ'))
    await manualLegend?.trigger('click')
    expect(wrapper.emitted('toggle-manual')).toHaveLength(1)
  })
})

describe('ParametricEqWorkspace', () => {
  function mountWorkspace() {
    const composite = compositePaths(twoBands, 0, 'parametric')
    return mount(ParametricEqWorkspace, {
      props: {
        bands: twoBands,
        selectedIndex: 0,
        filterTypes,
        responseView: 'dsp',
        responsePath: composite.path,
        responseFillPath: composite.fill,
        spectrumPath: '',
        spectrumVisible: false,
        measuredSourcePath: '',
        targetResponsePath: '',
        combinedFilterPath: '',
        correctedAcousticPath: '',
        bandResponsePaths: bandPaths(twoBands, 'parametric'),
        showMeasuredSource: true,
        showTargetResponse: true,
        showIndividualFilters: true,
        showCombinedFilter: true,
        showCorrectedResponse: true,
        eqEnabled: true,
        meterPeakDb: -3,
        meterRmsDb: -12,
        status: 'Ready',
        statusState: 'idle',
        error: ''
      }
    })
  }

  it('渲染频响编辑面、band 手柄与检查器', () => {
    const wrapper = mountWorkspace()
    expect(wrapper.find('.parametric-graph-surface').exists()).toBe(true)
    expect(wrapper.findAll('.parametric-band-handle')).toHaveLength(2)
    expect(wrapper.find('.floating-band-inspector').exists()).toBe(true)
    expect(wrapper.findAll('.filter-strip button')).toHaveLength(8)
  })

  it('点击手柄转发 select 事件，点击滤波器条转发 filter 事件', async () => {
    const wrapper = mountWorkspace()
    await wrapper.findAll('.parametric-band-handle')[0].trigger('click')
    expect(wrapper.emitted('select')).toEqual([[0]])

    const notchButton = wrapper.findAll('.filter-strip button')[7]
    await notchButton.trigger('click')
    const filters = wrapper.emitted('filter')
    expect(filters).toBeTruthy()
    expect(filters![0]).toEqual([0, 'notch'])
  })

  it('ANALYZER 按钮渲染 FontAwesome 图标类（PrimeIcons 已替换）', () => {
    const wrapper = mountWorkspace()
    const analyzer = wrapper.find('.spectrum-toggle')
    expect(analyzer.exists()).toBe(true)
    expect(analyzer.find('i.fa-solid.fa-chart-line').exists()).toBe(true)
  })
})
