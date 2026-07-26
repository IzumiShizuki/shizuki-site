import { describe, expect, it } from 'vitest';
import {
  buildLogBandMap,
  createIdlePulse,
  createSpectrumProcessor,
  downsampleWaveform
} from './visualizerSpectrum';

function makeFreqBytes(binCount, fill) {
  const data = new Uint8Array(binCount);
  if (typeof fill === 'function') {
    for (let index = 0; index < binCount; index += 1) data[index] = fill(index);
  } else if (Number.isFinite(fill)) {
    data.fill(fill);
  }
  return data;
}

describe('buildLogBandMap', () => {
  it('生成指定数量的频带且跳过直流分量', () => {
    const bands = buildLogBandMap({ bandCount: 56, fftSize: 2048, sampleRate: 48000 });
    expect(bands).toHaveLength(56);
    expect(bands[0].startBin).toBeGreaterThanOrEqual(1);
  });

  it('频带单调递进且每带至少一个 bin', () => {
    const bands = buildLogBandMap({ bandCount: 64, fftSize: 2048, sampleRate: 48000 });
    for (let index = 0; index < bands.length; index += 1) {
      expect(bands[index].endBin).toBeGreaterThan(bands[index].startBin);
      if (index > 0) {
        expect(bands[index].startBin).toBeGreaterThanOrEqual(bands[index - 1].endBin - 1);
        expect(bands[index].centerFreq).toBeGreaterThanOrEqual(bands[index - 1].centerFreq);
      }
    }
  });

  it('低频区分配比线性映射更细:前半数频带应集中在低频 bin', () => {
    const bands = buildLogBandMap({ bandCount: 56, fftSize: 2048, sampleRate: 48000, maxFreq: 16000 });
    const half = bands[Math.floor(bands.length / 2)];
    // 线性映射下第 28 带会落在 ~8kHz;对数映射应远低于此。
    expect(half.centerFreq).toBeLessThan(2000);
  });

  it('频带数量超过可用 bin 时长度依然稳定', () => {
    const bands = buildLogBandMap({ bandCount: 48, fftSize: 128, sampleRate: 48000 });
    expect(bands).toHaveLength(48);
    const last = bands[bands.length - 1];
    expect(last.endBin).toBeLessThanOrEqual(64);
  });
});

describe('createSpectrumProcessor', () => {
  it('倾斜补偿让同等原始能量下高频带获得不低于低频带的电平', () => {
    const processor = createSpectrumProcessor({ bandCount: 32, fftSize: 2048, sampleRate: 48000 });
    const flat = makeFreqBytes(1024, 140);
    let frame = null;
    for (let step = 0; step < 30; step += 1) frame = processor.update(flat, 16.7);
    expect(frame.levels[28]).toBeGreaterThanOrEqual(frame.levels[2]);
    expect(frame.levels[28]).toBeGreaterThan(0.1);
  });

  it('起音快于释放:上冲一帧即显著,回落需要更久', () => {
    const processor = createSpectrumProcessor({ bandCount: 16, fftSize: 2048, attackMs: 50, releaseMs: 300 });
    const loud = makeFreqBytes(1024, 220);
    const quietBytes = makeFreqBytes(1024, 0);

    const afterAttack = processor.update(loud, 50).levels[0];
    expect(afterAttack).toBeGreaterThan(0.3);

    const settled = (() => {
      let frame = null;
      for (let step = 0; step < 40; step += 1) frame = processor.update(loud, 16.7);
      return frame.levels[0];
    })();

    const afterRelease = processor.update(quietBytes, 50).levels[0];
    // 同样 50ms,释放只应下降一小部分。
    expect(afterRelease).toBeGreaterThan(settled * 0.6);
  });

  it('峰值帽在保持期内停留,超时后下落但不低于当前电平', () => {
    const processor = createSpectrumProcessor({ bandCount: 8, fftSize: 2048, peakHoldMs: 200 });
    const loud = makeFreqBytes(1024, 230);
    const quietBytes = makeFreqBytes(1024, 0);

    for (let step = 0; step < 30; step += 1) processor.update(loud, 16.7);
    const peakAtTop = processor.frame.peaks[0];

    processor.update(quietBytes, 100);
    expect(processor.frame.peaks[0]).toBeCloseTo(peakAtTop, 5);

    for (let step = 0; step < 60; step += 1) processor.update(quietBytes, 33);
    expect(processor.frame.peaks[0]).toBeLessThan(peakAtTop);
    expect(processor.frame.peaks[0]).toBeGreaterThanOrEqual(processor.frame.levels[0]);
  });

  it('低音突增触发节拍,冷却期内不重复触发', () => {
    const processor = createSpectrumProcessor({ bandCount: 32, fftSize: 2048, sampleRate: 48000 });
    const quietBytes = makeFreqBytes(1024, (index) => (index < 12 ? 30 : 10));
    const kick = makeFreqBytes(1024, (index) => (index < 12 ? 245 : 20));

    for (let step = 0; step < 30; step += 1) processor.update(quietBytes, 16.7);
    let hits = 0;
    for (let step = 0; step < 6; step += 1) {
      if (processor.update(kick, 16.7).beat.hit) hits += 1;
    }
    expect(hits).toBe(1);
  });

  it('全零输入标记静音并累计时长', () => {
    const processor = createSpectrumProcessor({ bandCount: 16, fftSize: 2048 });
    const quietBytes = makeFreqBytes(1024, 0);
    processor.update(quietBytes, 400);
    const frame = processor.update(quietBytes, 400);
    expect(frame.silent).toBe(true);
    expect(frame.silentMs).toBeGreaterThanOrEqual(800);
  });

  it('decay 让电平平滑归零并最终报告不可见', () => {
    const processor = createSpectrumProcessor({ bandCount: 16, fftSize: 2048 });
    const loud = makeFreqBytes(1024, 220);
    for (let step = 0; step < 30; step += 1) processor.update(loud, 16.7);

    let visible = true;
    let guard = 0;
    while (visible && guard < 600) {
      visible = processor.decay(33);
      guard += 1;
    }
    expect(visible).toBe(false);
    expect(processor.frame.levels[0]).toBeLessThanOrEqual(0.004);
  });
});

describe('createIdlePulse', () => {
  it('输出限制在振幅范围内且随时间变化', () => {
    const pulse = createIdlePulse(32, { amplitude: 0.25 });
    const a = pulse.sample(new Float32Array(32), 0);
    const b = pulse.sample(new Float32Array(32), 700);
    let changed = false;
    for (let index = 0; index < 32; index += 1) {
      expect(a[index]).toBeGreaterThanOrEqual(0);
      expect(a[index]).toBeLessThanOrEqual(0.25);
      if (Math.abs(a[index] - b[index]) > 0.001) changed = true;
    }
    expect(changed).toBe(true);
  });
});

describe('downsampleWaveform', () => {
  it('把 128 中心的字节波形归一到 [-1,1]', () => {
    const bytes = new Uint8Array(2048);
    for (let index = 0; index < bytes.length; index += 1) {
      bytes[index] = 128 + Math.round(96 * Math.sin((index / bytes.length) * Math.PI * 8));
    }
    const wave = downsampleWaveform(bytes, 160);
    expect(wave).toHaveLength(160);
    const max = Math.max(...wave);
    const min = Math.min(...wave);
    expect(max).toBeGreaterThan(0.5);
    expect(max).toBeLessThanOrEqual(1);
    expect(min).toBeLessThan(-0.5);
    expect(min).toBeGreaterThanOrEqual(-1);
  });

  it('空输入返回全零', () => {
    const wave = downsampleWaveform(null, 64);
    expect(wave.every((value) => value === 0)).toBe(true);
  });
});
