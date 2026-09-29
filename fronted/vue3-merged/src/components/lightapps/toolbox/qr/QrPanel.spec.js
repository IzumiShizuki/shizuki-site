import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, describe, expect, it, vi } from 'vitest';
import QrPanel from './QrPanel.vue';

let wrapper;

afterEach(() => {
  wrapper?.unmount();
  wrapper = null;
  vi.restoreAllMocks();
  vi.unstubAllGlobals();
});

describe('QrPanel scan resource lifecycle', () => {
  it('releases an imported image preview when leaving scan mode', async () => {
    const revokeObjectURL = vi.fn();
    const MockURL = class extends globalThis.URL {};
    MockURL.createObjectURL = vi.fn(() => 'blob:qr-scan-preview');
    MockURL.revokeObjectURL = revokeObjectURL;
    vi.stubGlobal('URL', MockURL);
    vi.spyOn(HTMLCanvasElement.prototype, 'getContext').mockReturnValue(null);
    vi.stubGlobal('Image', class {
      set src(value) {
        this._src = value;
        queueMicrotask(() => this.onload?.());
      }
    });

    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const input = wrapper.get('input[type="file"]').element;
    Object.defineProperty(input, 'files', {
      configurable: true,
      value: [new Blob(['qr image'], { type: 'image/png' })]
    });
    input.dispatchEvent(new Event('change'));
    await flushPromises();

    await wrapper.setProps({ mode: 'generate' });

    expect(revokeObjectURL).toHaveBeenCalledWith('blob:qr-scan-preview');
  });

  it('stops a camera stream returned after scan mode was left', async () => {
    let resolveCamera;
    const getUserMedia = vi.fn(() => new Promise((resolve) => {
      resolveCamera = resolve;
    }));
    const play = vi.fn().mockResolvedValue(undefined);
    vi.stubGlobal('navigator', { mediaDevices: { getUserMedia } });
    vi.spyOn(HTMLMediaElement.prototype, 'play').mockImplementation(play);

    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const cameraButton = wrapper.findAll('button').find((button) => button.text().includes('摄像头扫码'));
    await cameraButton.trigger('click');
    expect(getUserMedia).toHaveBeenCalledOnce();

    await wrapper.setProps({ mode: 'generate' });
    await wrapper.setProps({ mode: 'scan' });

    const track = { stop: vi.fn() };
    resolveCamera({ getTracks: () => [track] });
    await flushPromises();

    expect(track.stop).toHaveBeenCalledOnce();
    expect(play).not.toHaveBeenCalled();
  });
});
