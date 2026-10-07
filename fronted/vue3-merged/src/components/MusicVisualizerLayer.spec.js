import { mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { AUDIO_ANALYSER_BUS_KEY } from '../composables/audioAnalyserBus';
import { createVisualizerPainter } from '../utils/visualizerPainters';
import MusicVisualizerLayer from './MusicVisualizerLayer.vue';

vi.mock('../utils/visualizerPainters', async (importOriginal) => ({
  ...await importOriginal(),
  createVisualizerPainter: vi.fn()
}));

describe('MusicVisualizerLayer shared spectrum lifecycle', () => {
  let wrapper;
  let frames;
  let pending;
  let timestamp;
  let bytes;
  let paint;
  let reset;
  let analyser;
  let ensure;
  let disconnect;

  function tick(dt = 16.7) {
    timestamp += dt;
    const callbacks = [...pending.values()];
    pending.clear();
    callbacks.forEach((callback) => callback(timestamp));
  }

  function render(props = {}) {
    wrapper = mount(MusicVisualizerLayer, {
      props: { variant: 'bars', active: true, ...props },
      global: { provide: { [AUDIO_ANALYSER_BUS_KEY]: { ensure, getAnalyser: () => analyser } } }
    });
    return wrapper;
  }

  beforeEach(() => {
    frames = [];
    pending = new Map();
    timestamp = 100;
    bytes = 220;
    let sequence = 0;
    ensure = vi.fn();
    disconnect = vi.fn();
    reset = vi.fn();
    paint = vi.fn((ctx, frame, env) => frames.push({
      levels: [...frame.levels], peaks: [...frame.peaks], env
    }));
    createVisualizerPainter.mockImplementation(() => ({ paint, reset }));
    analyser = {
      fftSize: 512,
      frequencyBinCount: 256,
      context: { sampleRate: 48000 },
      getByteFrequencyData: vi.fn((target) => target.fill(bytes)),
      getByteTimeDomainData: vi.fn((target) => target.fill(128))
    };
    vi.spyOn(window, 'requestAnimationFrame').mockImplementation((callback) => {
      pending.set(++sequence, callback);
      return sequence;
    });
    vi.spyOn(window, 'cancelAnimationFrame').mockImplementation((id) => pending.delete(id));
    vi.spyOn(HTMLElement.prototype, 'getBoundingClientRect').mockReturnValue({ width: 1040, height: 140 });
    vi.spyOn(HTMLCanvasElement.prototype, 'getContext').mockReturnValue({ setTransform: vi.fn(), clearRect: vi.fn() });
    vi.spyOn(document, 'hidden', 'get').mockReturnValue(false);
    vi.stubGlobal('ResizeObserver', class {
      observe() {}
      disconnect() { disconnect(); }
    });
    vi.stubGlobal('matchMedia', vi.fn(() => ({ matches: false, addEventListener: vi.fn(), removeEventListener: vi.fn() })));
  });

  afterEach(() => {
    wrapper?.unmount();
    vi.restoreAllMocks();
    vi.unstubAllGlobals();
  });

  it('uses the named crystal painter and the provided analyser without waveform reads', () => {
    render({ variant: 'bars-crystal' });
    tick();
    expect(ensure).toHaveBeenCalledOnce();
    expect(createVisualizerPainter).toHaveBeenLastCalledWith('bars-crystal');
    expect(analyser.getByteFrequencyData).toHaveBeenCalledOnce();
    expect(analyser.getByteTimeDomainData).not.toHaveBeenCalled();
    expect(Math.max(...frames[0].levels)).toBeGreaterThan(0);
    expect(frames[0].env).toMatchObject({ width: 1040, height: 140 });
  });

  it('holds peak caps after a transient and then lets them fall above the live bars', () => {
    render({ styleKey: 'bars-aurora' });
    for (let step = 0; step < 30; step += 1) tick();
    const peak = frames.at(-1).peaks[32];
    bytes = 0;
    for (let step = 0; step < 6; step += 1) tick();
    expect(frames.at(-1).peaks[32]).toBeCloseTo(peak, 5);
    expect(frames.at(-1).levels[32]).toBeLessThan(peak);
    for (let step = 0; step < 30; step += 1) tick();
    expect(frames.at(-1).peaks[32]).toBeLessThan(peak);
    expect(frames.at(-1).peaks[32]).toBeGreaterThanOrEqual(frames.at(-1).levels[32]);
  });

  it('settles after pause without reading audio and stops scheduling frames', async () => {
    render();
    for (let step = 0; step < 30; step += 1) tick();
    const reads = analyser.getByteFrequencyData.mock.calls.length;
    await wrapper.setProps({ active: false });
    expect(pending.size).toBe(1);
    for (let step = 0; step < 300 && pending.size; step += 1) tick();
    expect(analyser.getByteFrequencyData).toHaveBeenCalledTimes(reads);
    expect(pending.size).toBe(0);
    await wrapper.setProps({ active: true });
    tick();
    expect(analyser.getByteFrequencyData).toHaveBeenCalledTimes(reads + 1);
  });

  it('honors explicit styles, samples ring waveform, and stops when hidden or unmounted', async () => {
    render({ variant: 'ring' });
    tick();
    expect(createVisualizerPainter).toHaveBeenLastCalledWith('ring-halo');
    expect(analyser.getByteTimeDomainData).toHaveBeenCalledOnce();
    await wrapper.setProps({ styleKey: 'ring-orbit' });
    tick();
    expect(createVisualizerPainter).toHaveBeenLastCalledWith('ring-orbit');
    expect(reset).toHaveBeenCalled();
    vi.spyOn(document, 'hidden', 'get').mockReturnValue(true);
    document.dispatchEvent(new Event('visibilitychange'));
    expect(pending.size).toBe(0);
    vi.spyOn(document, 'hidden', 'get').mockReturnValue(false);
    document.dispatchEvent(new Event('visibilitychange'));
    expect(pending.size).toBe(1);
    wrapper.unmount();
    wrapper = null;
    expect(pending.size).toBe(0);
    expect(disconnect).toHaveBeenCalledOnce();
  });
});
