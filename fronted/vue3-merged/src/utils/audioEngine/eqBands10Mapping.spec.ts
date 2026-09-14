/**
 * @file eqBands10Mapping.spec.ts
 * 站点旧 3 段均衡 → 10 段图形 EQ 迁移映射的纯函数单测（shizuki-site 新建）。
 */
import assert from 'node:assert/strict'
import { describe, it } from 'vitest'
import { DEFAULT_BAND_FREQUENCIES } from './equalizerPageLogic'
import {
  bands10LevelsToEqualizerBands,
  bands10LevelsToGainDb,
  gainDbToLevel,
  levelToGainDb,
  mapLegacyLevelsToBands10,
  nearestLegacyBandIndex,
  normalizeLevel
} from './eqBands10Mapping'

describe('电平 ↔ 增益换算（与旧 App.vue eqLevelToDb 公式一致）', () => {
  it('0.5 平坦为 0 dB，两端钳制到 ±12 dB', () => {
    assert.equal(levelToGainDb(0.5), 0)
    assert.equal(levelToGainDb(0), -12)
    assert.equal(levelToGainDb(1), 12)
    assert.equal(levelToGainDb(-2), -12)
    assert.equal(levelToGainDb(3), 12)
  })

  it('旧默认电平换算：0.66→+3.84、0.52→+0.48、0.74→+5.76 dB', () => {
    assert.ok(Math.abs(levelToGainDb(0.66) - 3.84) < 1e-9)
    assert.ok(Math.abs(levelToGainDb(0.52) - 0.48) < 1e-9)
    assert.ok(Math.abs(levelToGainDb(0.74) - 5.76) < 1e-9)
  })

  it('dB → 电平为逆映射且钳制 0..1', () => {
    assert.ok(Math.abs(gainDbToLevel(3.84) - 0.66) < 1e-9)
    assert.equal(gainDbToLevel(-12), 0)
    assert.equal(gainDbToLevel(12), 1)
    assert.equal(gainDbToLevel(99), 1)
    assert.equal(gainDbToLevel(-99), 0)
    assert.equal(gainDbToLevel(0), 0.5)
  })

  it('normalizeLevel 对非有限值退化到 fallback', () => {
    assert.equal(normalizeLevel(Number.NaN, 0.66), 0.66)
    assert.equal(normalizeLevel(Number.NaN), 0.5)
    assert.equal(normalizeLevel(2), 1)
    assert.equal(normalizeLevel(-1), 0)
  })
})

describe('对数频率就近归属（旧 3 段中心 180 / 1200 / 5200 Hz）', () => {
  it('10 段图形频率按几何中点切分：31–250→low、500–2k→mid、4k–16k→high', () => {
    const expected = [0, 0, 0, 0, 1, 1, 1, 2, 2, 2]
    DEFAULT_BAND_FREQUENCIES.forEach((frequency, index) => {
      assert.equal(nearestLegacyBandIndex(frequency), expected[index], `${frequency} Hz`)
    })
  })

  it('边界与非法频率安全处理', () => {
    assert.equal(nearestLegacyBandIndex(460), 0) // 180–1200 几何中点 464.8 之下
    assert.equal(nearestLegacyBandIndex(470), 1) // 中点之上
    assert.equal(nearestLegacyBandIndex(2490), 1) // 1200–5200 几何中点 2498 之下
    assert.equal(nearestLegacyBandIndex(2500), 2)
    assert.equal(nearestLegacyBandIndex(0), 0)
    assert.equal(nearestLegacyBandIndex(Number.NaN), 0)
  })
})

describe('mapLegacyLevelsToBands10：旧设置迁移', () => {
  it('默认 [0.66, 0.52, 0.74] → 10 段按频段继承：low×4 / mid×3 / high×3', () => {
    assert.deepEqual(mapLegacyLevelsToBands10([0.66, 0.52, 0.74]), [
      0.66, 0.66, 0.66, 0.66,
      0.52, 0.52, 0.52,
      0.74, 0.74, 0.74
    ])
  })

  it('空数组按旧逐项 fallback 补齐（与旧 applyEqLevels 行为一致）', () => {
    assert.deepEqual(mapLegacyLevelsToBands10([]), mapLegacyLevelsToBands10([0.66, 0.52, 0.74]))
    assert.deepEqual(mapLegacyLevelsToBands10([1]), [
      1, 1, 1, 1,
      0.52, 0.52, 0.52,
      0.74, 0.74, 0.74
    ])
  })

  it('越界与非法电平钳制', () => {
    assert.deepEqual(mapLegacyLevelsToBands10([2, -1, Number.NaN]), [
      1, 1, 1, 1,
      0, 0, 0,
      0.74, 0.74, 0.74
    ])
  })

  it('平坦 [0.5, 0.5, 0.5] → 10 段全平坦', () => {
    assert.deepEqual(mapLegacyLevelsToBands10([0.5, 0.5, 0.5]), new Array(10).fill(0.5))
  })
})

describe('10 段电平 → 执行链数据', () => {
  const levels = [0.75, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.25]

  it('bands10LevelsToGainDb 换算 ±12 dB 且缺项平坦', () => {
    const gains = bands10LevelsToGainDb(levels)
    assert.equal(gains.length, 10)
    assert.equal(gains[0], 6)
    assert.equal(gains[9], -6)
    assert.equal(gains[1], 0)
    assert.deepEqual(bands10LevelsToGainDb([]), new Array(10).fill(0))
  })

  it('bands10LevelsToEqualizerBands 输出图形模式 band（peak / Q=1 / 引擎频率组）', () => {
    const bands = bands10LevelsToEqualizerBands(levels)
    assert.equal(bands.length, 10)
    bands.forEach((band, index) => {
      assert.equal(band.frequency, DEFAULT_BAND_FREQUENCIES[index])
      assert.equal(band.q, 1)
      assert.equal(band.filterType, 'peak')
    })
    assert.equal(bands[0].gain, 6)
    assert.equal(bands[9].gain, -6)
    assert.equal(bands[4].gain, 0)
  })
})
