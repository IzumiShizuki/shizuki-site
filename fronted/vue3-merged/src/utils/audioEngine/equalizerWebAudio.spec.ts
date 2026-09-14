/**
 * @file equalizerWebAudio.spec.ts
 * Web Audio 均衡器执行端的纯函数与链拓扑单测（shizuki-site 新建）。
 * jsdom 无 AudioContext，用最小 fake 节点验证：
 * 拓扑、参数写入、总开关交叉淡化、dispose 断链，以及
 * 与 eqResponse.isBandActive 的旁路规则一致性。
 */
import assert from 'node:assert/strict'
import { describe, it } from 'vitest'
import {
  clampBandGainDb,
  clampFilterFrequency,
  clampFilterQ,
  clampPreampDb,
  computeFilterParams,
  createEqualizerChain,
  dbToLinearGain,
  mapFilterTypeToBiquadType
} from './equalizerWebAudio'
import type { EqualizerChain } from './equalizerWebAudio'
import { isBandActive } from './eqResponse'
import { defaultEqBands } from './equalizerPageLogic'
import type { EqualizerBand } from './equalizerTypes'

/* —— 最小 Web Audio fake（jsdom 无 AudioContext） —— */

class FakeAudioParam {
  value = 0
  setTargetAtTime(value: number): void {
    this.value = value
  }
}

class FakeAudioNode {
  connections: FakeAudioNode[] = []
  connect(target: FakeAudioNode): FakeAudioNode {
    this.connections.push(target)
    return target
  }
  disconnect(target?: FakeAudioNode): void {
    if (target) {
      this.connections = this.connections.filter((entry) => entry !== target)
    } else {
      this.connections = []
    }
  }
}

class FakeGainNode extends FakeAudioNode {
  gain = new FakeAudioParam()
}

class FakeBiquadFilterNode extends FakeAudioNode {
  type: BiquadFilterType = 'lowpass'
  frequency = new FakeAudioParam()
  detune = new FakeAudioParam()
  Q = new FakeAudioParam()
  gain = new FakeAudioParam()
}

class FakeAudioContext {
  sampleRate = 48000
  currentTime = 0
  nodes: FakeAudioNode[] = []
  createGain(): FakeGainNode {
    const node = new FakeGainNode()
    this.nodes.push(node)
    return node
  }
  createBiquadFilter(): FakeBiquadFilterNode {
    const node = new FakeBiquadFilterNode()
    this.nodes.push(node)
    return node
  }
}

interface FakeNodeInspection {
  chain: EqualizerChain
  input: FakeAudioNode
  preamp: FakeGainNode
  filters: FakeBiquadFilterNode[]
  chainPath: FakeGainNode
  bypassPath: FakeGainNode
  output: FakeGainNode
  context: FakeAudioContext
}

function buildChain(
  bands: EqualizerBand[],
  enabled = true,
  preampDb = 0,
  mode: 'graphic' | 'parametric' = 'graphic'
): FakeNodeInspection {
  const context = new FakeAudioContext()
  const input = new FakeAudioNode()
  const chain = createEqualizerChain(
    context as unknown as BaseAudioContext,
    input as unknown as AudioNode,
    { enabled, mode, preampDb, bands }
  )
  const nodeCount = bands.length
  // 创建顺序：preamp(0) → N×biquad(1..N) → chainPath(N+1) → bypassPath(N+2) → output(N+3)
  const preamp = context.nodes[0] as FakeGainNode
  const filters = context.nodes.slice(1, 1 + nodeCount) as FakeBiquadFilterNode[]
  const chainPath = context.nodes[1 + nodeCount] as FakeGainNode
  const bypassPath = context.nodes[2 + nodeCount] as FakeGainNode
  const output = context.nodes[3 + nodeCount] as FakeGainNode
  return { chain, input, preamp, filters, chainPath, bypassPath, output, context }
}

function makeBand(patch: Partial<EqualizerBand> = {}): EqualizerBand {
  return { frequency: 1000, gain: 0, q: 1, filterType: 'peak', ...patch }
}

describe('dbToLinearGain', () => {
  it('dB 转线性增益符合 20*log10 反变换', () => {
    assert.ok(Math.abs(dbToLinearGain(0) - 1) < 1e-12)
    assert.ok(Math.abs(dbToLinearGain(6) - 10 ** (6 / 20)) < 1e-12)
    assert.ok(Math.abs(dbToLinearGain(-24) - 10 ** (-24 / 20)) < 1e-12)
    assert.equal(dbToLinearGain(Number.NaN), 1)
  })
})

describe('钳制规则（与引擎 C++ 一致）', () => {
  it('频率 clamp 到 [10, Nyquist×0.98]', () => {
    assert.equal(clampFilterFrequency(1, 48000), 10)
    assert.equal(clampFilterFrequency(30000, 48000), 48000 * 0.49)
    assert.equal(clampFilterFrequency(1000, 48000), 1000)
  })

  it('Q clamp 到 [0.1, 20]', () => {
    assert.equal(clampFilterQ(0.01), 0.1)
    assert.equal(clampFilterQ(99), 20)
    assert.equal(clampFilterQ(1), 1)
  })

  it('增益按模式 clamp：graphic ±12、parametric ±24；preamp ±24', () => {
    assert.equal(clampBandGainDb(20, 'graphic'), 12)
    assert.equal(clampBandGainDb(-20, 'graphic'), -12)
    assert.equal(clampBandGainDb(20, 'parametric'), 20)
    assert.equal(clampPreampDb(30), 24)
    assert.equal(clampPreampDb(-30), -24)
  })
})

describe('滤波器类型映射', () => {
  it('Twilight 8 种 RBJ 类型映射到 Web Audio BiquadFilterType', () => {
    assert.equal(mapFilterTypeToBiquadType('peak'), 'peaking')
    assert.equal(mapFilterTypeToBiquadType('lowShelf'), 'lowshelf')
    assert.equal(mapFilterTypeToBiquadType('highShelf'), 'highshelf')
    assert.equal(mapFilterTypeToBiquadType('lowPass'), 'lowpass')
    assert.equal(mapFilterTypeToBiquadType('highPass'), 'highpass')
    assert.equal(mapFilterTypeToBiquadType('bandPass'), 'bandpass')
    assert.equal(mapFilterTypeToBiquadType('allPass'), 'allpass')
    assert.equal(mapFilterTypeToBiquadType('notch'), 'notch')
  })
})

describe('computeFilterParams 与 eqResponse.isBandActive 规则一致', () => {
  const sampleRate = 48000

  it('图形模式强制每段 peaking，即使 band.filterType 是 lowPass', () => {
    const params = computeFilterParams(
      makeBand({ frequency: 1000, gain: 6, filterType: 'lowPass' }),
      'graphic',
      sampleRate
    )
    assert.equal(params.type, 'peaking')
    assert.equal(params.gainDb, 6)
    assert.equal(params.active, true)
  })

  it('参数模式保留 band 类型与参数', () => {
    const params = computeFilterParams(
      makeBand({ frequency: 2000, gain: -4, q: 2.5, filterType: 'highShelf' }),
      'parametric',
      sampleRate
    )
    assert.equal(params.type, 'highshelf')
    assert.equal(params.frequency, 2000)
    assert.equal(params.q, 2.5)
    assert.equal(params.gainDb, -4)
  })

  it('enabled=false 的频段旁路：active=false 且 gainDb 写 0', () => {
    const band = makeBand({ gain: 9, enabled: false })
    const params = computeFilterParams(band, 'graphic', sampleRate)
    assert.equal(params.active, false)
    assert.equal(params.gainDb, 0)
    assert.equal(isBandActive(band, 'graphic'), false)
  })

  it('graphic 模式下零增益频段旁路（peaking gain=0 恒等），与预览一致', () => {
    const band = makeBand({ gain: 0 })
    const params = computeFilterParams(band, 'graphic', sampleRate)
    assert.equal(params.active, false)
    assert.equal(params.gainDb, 0)
    assert.equal(params.type, 'peaking')
  })

  it('LP/HP 零增益仍处理（active=true），带通零增益旁路', () => {
    const lowPass = computeFilterParams(
      makeBand({ filterType: 'lowPass', gain: 0 }),
      'parametric',
      sampleRate
    )
    assert.equal(lowPass.active, true)
    assert.equal(lowPass.type, 'lowpass')
    const bandPass = computeFilterParams(
      makeBand({ filterType: 'bandPass', gain: 0 }),
      'parametric',
      sampleRate
    )
    assert.equal(bandPass.active, false)
    assert.equal(bandPass.gainDb, 0)
  })
})

describe('createEqualizerChain 拓扑与参数写入', () => {
  it('构建 input → preamp → 10×biquad → chainPath → output 链与旁路支路', () => {
    const inspection = buildChain(defaultEqBands)
    assert.equal(inspection.filters.length, 10)
    assert.equal(inspection.chain.bandCount, 10)

    // input 分出两条支路：主链 preamp 与旁路 bypassPath
    assert.deepEqual(inspection.input.connections, [inspection.preamp, inspection.bypassPath])

    // 主链串联：preamp → f0 → … → f9 → chainPath → output
    assert.deepEqual(inspection.preamp.connections, [inspection.filters[0]])
    for (let index = 0; index < 9; index += 1) {
      assert.deepEqual(inspection.filters[index].connections, [inspection.filters[index + 1]])
    }
    assert.deepEqual(inspection.filters[9].connections, [inspection.chainPath])

    // output 上游 = chainPath + bypassPath
    assert.ok(inspection.chainPath.connections.includes(inspection.output))
    assert.ok(inspection.bypassPath.connections.includes(inspection.output))
  })

  it('apply 写入 preamp 线性增益与 10 段 peaking 参数（含旁路规则）', () => {
    const bands = defaultEqBands.map((band, index) =>
      index === 0 ? { ...band, gain: 6 } : band
    )
    const inspection = buildChain(bands, true, -3.5)

    assert.ok(Math.abs(inspection.preamp.gain.value - dbToLinearGain(-3.5)) < 1e-12)
    assert.equal(inspection.filters.length, 10)
    for (let index = 0; index < 10; index += 1) {
      assert.equal(inspection.filters[index].type, 'peaking')
      assert.equal(inspection.filters[index].frequency.value, defaultEqBands[index].frequency)
      assert.equal(inspection.filters[index].Q.value, 1)
    }
    assert.ok(Math.abs(inspection.filters[0].gain.value - dbToLinearGain(6)) < 1e-12)
    // 其余零增益段旁路：gain 写 0（线性 1）
    assert.equal(inspection.filters[1].gain.value, 1)
    assert.equal(inspection.filters[9].gain.value, 1)
  })

  it('apply 频率超过 Nyquist 时按 0.98×Nyquist 钳制', () => {
    const band = makeBand({ frequency: 30000, gain: 3 })
    const inspection = buildChain([band])
    assert.equal(inspection.filters[0].frequency.value, 48000 * 0.49)
  })

  it('总开关通过 chainPath/bypassPath 增益交叉淡化，关闭时旁路直通', () => {
    const inspection = buildChain(defaultEqBands, true)
    assert.equal(inspection.chainPath.gain.value, 1)
    assert.equal(inspection.bypassPath.gain.value, 0)

    inspection.chain.setEnabled(false)
    assert.equal(inspection.chainPath.gain.value, 0)
    assert.equal(inspection.bypassPath.gain.value, 1)

    inspection.chain.setEnabled(true)
    assert.equal(inspection.chainPath.gain.value, 1)
    assert.equal(inspection.bypassPath.gain.value, 0)
  })

  it('参数模式写入 8 种 BiquadFilterType 映射', () => {
    const band = makeBand({ filterType: 'lowPass', gain: 0, frequency: 800 })
    const context = new FakeAudioContext()
    const input = new FakeAudioNode()
    const chain = createEqualizerChain(
      context as unknown as BaseAudioContext,
      input as unknown as AudioNode,
      { enabled: true, mode: 'parametric', preampDb: 0, bands: [band] }
    )
    const filter = context.nodes[1] as FakeBiquadFilterNode
    assert.equal(filter.type, 'lowpass')
    assert.equal(chain.filters.length, 1)
  })

  it('dispose 断开全部内部连接', () => {
    const inspection = buildChain(defaultEqBands)
    inspection.chain.dispose()
    assert.equal(inspection.input.connections.length, 0)
    assert.equal(inspection.preamp.connections.length, 0)
    assert.equal(inspection.filters[9].connections.length, 0)
    assert.equal(inspection.chainPath.connections.length, 0)
    assert.equal(inspection.bypassPath.connections.length, 0)
  })
})

describe('10 段图形 EQ 与 eqResponse 预览的对齐', () => {
  it('graphic 默认 10 段全零增益时所有滤波器恒等（gain=1）', () => {
    const inspection = buildChain(defaultEqBands)
    for (const filter of inspection.filters) {
      assert.equal(filter.gain.value, 1)
      assert.equal(filter.type, 'peaking')
    }
  })

  it('预置 Warm 曲线逐段写入与旁路规则一致', () => {
    const bands = defaultEqBands.map((band, index) => ({
      ...band,
      gain: [2.4, 1.8, 1.1, 0.4, 0, -0.4, -0.5, 0.2, 0.8, 1][index]
    }))
    const inspection = buildChain(bands, true, -1)
    assert.equal(inspection.preamp.gain.value, dbToLinearGain(-1))
    assert.equal(inspection.filters[0].gain.value, dbToLinearGain(2.4))
    assert.equal(inspection.filters[4].gain.value, 1) // 0 dB 段旁路
    assert.equal(inspection.filters[9].gain.value, dbToLinearGain(1))
  })

  it('增益 clamp 随模式切换：graphic ±12、parametric ±24', () => {
    const band = makeBand({ gain: 15 })
    assert.equal(computeFilterParams(band, 'graphic', 48000).gainDb, 12)
    assert.equal(computeFilterParams(band, 'parametric', 48000).gainDb, 15)
  })
})
