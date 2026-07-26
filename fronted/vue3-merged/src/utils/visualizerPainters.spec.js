import { describe, expect, it } from 'vitest';
import { createVisualizerPainter, resampleLevels, VISUALIZER_PAINTER_KEYS } from './visualizerPainters';

describe('resampleLevels', () => {
  it('线性插值重采样到目标长度', () => {
    const source = new Float32Array([0, 0.5, 1]);
    const out = resampleLevels(source, 5);
    expect(out).toHaveLength(5);
    expect(out[0]).toBeCloseTo(0, 5);
    expect(out[2]).toBeCloseTo(0.5, 5);
    expect(out[4]).toBeCloseTo(1, 5);
  });

  it('mirror 模式产生左右对称输出', () => {
    const source = new Float32Array([0.1, 0.4, 0.9, 0.2]);
    const out = resampleLevels(source, 10, true);
    for (let index = 0; index < 5; index += 1) {
      expect(out[index]).toBeCloseTo(out[9 - index], 6);
    }
  });

  it('空输入返回全零', () => {
    const out = resampleLevels(new Float32Array(0), 8);
    expect([...out].every((value) => value === 0)).toBe(true);
  });

  it('复用传入的目标数组避免分配', () => {
    const target = new Float32Array(6);
    const out = resampleLevels(new Float32Array([1, 0]), 6, false, target);
    expect(out).toBe(target);
  });
});

describe('createVisualizerPainter', () => {
  it('已注册的每种风格都能创建画笔', () => {
    expect(VISUALIZER_PAINTER_KEYS).toEqual(
      expect.arrayContaining(['bars-neon', 'bars-crystal', 'bars-firefly', 'ring-halo', 'ring-orbit', 'ring-pulse', 'vinyl'])
    );
    for (const key of VISUALIZER_PAINTER_KEYS) {
      const painter = createVisualizerPainter(key);
      expect(typeof painter.paint).toBe('function');
      expect(typeof painter.reset).toBe('function');
    }
  });

  it('未知风格回退到 bars-neon 而不是抛错', () => {
    const painter = createVisualizerPainter('does-not-exist');
    expect(typeof painter.paint).toBe('function');
  });
});
