import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, describe, expect, it, vi } from 'vitest';
import QRCode from 'qrcode';
import QrPanel from './QrPanel.vue';
import { buildQrBitmap } from './qrToolsCore';

let wrapper;

afterEach(() => {
  wrapper?.unmount();
  wrapper = null;
  vi.restoreAllMocks();
  vi.unstubAllGlobals();
});

function mockImageDecode(payload = 'https://shizuki.example/pasted-qr', { deferLoad = false } = {}) {
  const bitmap = buildQrBitmap(QRCode.create(payload).modules, { scale: 6 });
  const images = [];
  const MockURL = class extends globalThis.URL {};
  MockURL.createObjectURL = vi.fn(() => 'blob:qr-input');
  MockURL.revokeObjectURL = vi.fn();
  vi.stubGlobal('URL', MockURL);
  vi.stubGlobal('Image', class {
    naturalWidth = bitmap.width;
    naturalHeight = bitmap.height;
    constructor() { images.push(this); }
    set src(value) {
      this._src = value;
      if (!deferLoad) queueMicrotask(() => this.onload?.());
    }
  });
  const context = { drawImage: vi.fn(), getImageData: vi.fn(() => bitmap) };
  vi.spyOn(HTMLCanvasElement.prototype, 'getContext').mockReturnValue(context);
  return { images, context, createObjectURL: MockURL.createObjectURL, revokeObjectURL: MockURL.revokeObjectURL };
}

function dispatchImageTransfer(element, type, transfer) {
  const event = new Event(type, { bubbles: true, cancelable: true });
  Object.defineProperty(event, type === 'paste' ? 'clipboardData' : 'dataTransfer', { value: transfer });
  element.dispatchEvent(event);
  return event;
}

describe('QrPanel direct image input', () => {
  it('decodes the same QR pixels through the existing file input', async () => {
    mockImageDecode();
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const input = wrapper.get('input[type="file"]').element;
    Object.defineProperty(input, 'files', { value: [new File(['qr pixels'], 'qr.png', { type: 'image/png' })] });
    input.dispatchEvent(new Event('change'));
    await flushPromises();
    expect(wrapper.get('.qr-result-output').element.value).toBe('https://shizuki.example/pasted-qr');
  });

  it('decodes an image pasted in the recognition frame without clipboard-read permission', async () => {
    mockImageDecode();
    const read = vi.fn().mockRejectedValue(new Error('permission denied'));
    vi.stubGlobal('navigator', { clipboard: { read } });
    const file = new File(['qr pixels'], 'screenshot.png', { type: 'image/png' });
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const event = dispatchImageTransfer(wrapper.get('.qr-preview-stage').element, 'paste', {
      items: [{ kind: 'file', type: file.type, getAsFile: () => file }], files: []
    });
    await flushPromises();

    expect(wrapper.get('.qr-result-output').element.value).toBe('https://shizuki.example/pasted-qr');
    expect(event.defaultPrevented).toBe(true);
    expect(read).not.toHaveBeenCalled();
  });

  it('decodes a dropped QR image and prevents browser file navigation', async () => {
    mockImageDecode('dropped QR payload');
    const file = new File(['qr pixels'], 'screenshot.png', { type: 'image/png' });
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const event = dispatchImageTransfer(wrapper.get('.qr-preview-stage').element, 'drop', { files: [file] });
    await flushPromises();

    expect(wrapper.get('.qr-result-output').element.value).toBe('dropped QR payload');
    expect(event.defaultPrevented).toBe(true);
  });

  it('accepts a dropped PNG with empty MIME metadata and ignores preceding non-images', async () => {
    mockImageDecode();
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    dispatchImageTransfer(wrapper.element, 'drop', {
      files: [new File(['text'], 'note.txt'), new File(['qr'], 'QR.PNG')]
    });
    await flushPromises();
    expect(wrapper.get('.qr-result-output').element.value).toBe('https://shizuki.example/pasted-qr');
  });

  it.each(['paste', 'drop'])('rejects non-image %s without decoding or default navigation', async (type) => {
    const { createObjectURL } = mockImageDecode();
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const event = dispatchImageTransfer(wrapper.get('.qr-preview-stage').element, type, {
      items: type === 'paste' ? [{ kind: 'string', type: 'text/plain' }] : [],
      files: type === 'drop' ? [new File(['text'], 'note.txt', { type: 'text/plain' })] : []
    });
    await flushPromises();
    expect(event.defaultPrevented).toBe(true);
    expect(createObjectURL).not.toHaveBeenCalled();
    expect(wrapper.emitted('feedback').at(-1)[0]).toMatchObject({ type: 'error', message: expect.stringContaining('图片') });
  });

  it('supports keyboard focus and keeps drag feedback stable across nested elements', async () => {
    wrapper = mount(QrPanel, { props: { mode: 'scan' }, attachTo: document.body });
    const frame = wrapper.get('.qr-scan-input');
    await frame.trigger('click');
    expect(document.activeElement).toBe(frame.element);
    expect(frame.attributes('tabindex')).toBe('0');
    await frame.trigger('dragenter');
    await frame.get('strong').trigger('dragenter');
    await frame.trigger('dragleave');
    expect(frame.classes()).toContain('is-dragging');
    await frame.get('strong').trigger('dragleave');
    expect(frame.classes()).not.toContain('is-dragging');
    const transfer = { dropEffect: 'none' };
    const event = dispatchImageTransfer(frame.element, 'dragover', transfer);
    expect(event.defaultPrevented).toBe(true);
    expect(transfer.dropEffect).toBe('copy');
  });

  it('reports no QR detection and clears the preceding successful result', async () => {
    const { context } = mockImageDecode();
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const transfer = { files: [new File(['qr'], 'qr.png', { type: 'image/png' })] };
    dispatchImageTransfer(wrapper.element, 'paste', transfer);
    await flushPromises();
    expect(wrapper.get('.qr-result-output').element.value).not.toBe('');
    context.getImageData.mockReturnValue({ width: 64, height: 64, data: new Uint8ClampedArray(64 * 64 * 4).fill(255) });
    dispatchImageTransfer(wrapper.element, 'drop', transfer);
    await flushPromises();
    expect(wrapper.get('.qr-result-output').element.value).toBe('');
    expect(wrapper.text()).toContain('未识别到二维码');
    expect(wrapper.emitted('feedback').at(-1)[0]).toMatchObject({ type: 'error', message: expect.stringContaining('更清晰') });
  });

  it('catches preview allocation failures and leaves the frame ready for another image', async () => {
    const { createObjectURL } = mockImageDecode();
    createObjectURL.mockImplementationOnce(() => { throw new Error('图片预览创建失败'); });
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    dispatchImageTransfer(wrapper.element, 'drop', { files: [new File(['qr'], 'qr.png', { type: 'image/png' })] });
    await flushPromises();
    expect(wrapper.get('.qr-scan-input').attributes('aria-busy')).toBe('false');
    expect(wrapper.emitted('feedback').at(-1)[0]).toEqual({ type: 'error', message: '图片预览创建失败' });
  });

  it('shows retry guidance when the clipboard-read button is denied', async () => {
    vi.stubGlobal('navigator', { clipboard: { read: vi.fn().mockRejectedValue(new Error('NotAllowedError')) } });
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    await wrapper.findAll('button').find((button) => button.text().includes('粘贴剪贴板图片')).trigger('click');
    await flushPromises();
    expect(wrapper.emitted('feedback').at(-1)[0]).toMatchObject({ type: 'error', message: expect.stringContaining('Ctrl+V') });
  });
});

describe('QrPanel scan resource lifecycle', () => {
  it('discards a replaced image decode and releases both previews', async () => {
    const { images, context, createObjectURL, revokeObjectURL } = mockImageDecode('newest image', { deferLoad: true });
    createObjectURL.mockReturnValueOnce('blob:first').mockReturnValueOnce('blob:second');
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const transfer = { files: [new File(['qr'], 'qr.png', { type: 'image/png' })] };
    dispatchImageTransfer(wrapper.element, 'paste', transfer);
    dispatchImageTransfer(wrapper.element, 'drop', transfer);
    await flushPromises();
    expect(wrapper.get('.qr-scan-input').attributes('aria-busy')).toBe('true');
    expect(revokeObjectURL).toHaveBeenCalledWith('blob:first');
    images[1].onload();
    await flushPromises();
    images[0].onerror();
    await flushPromises();
    expect(context.getImageData).toHaveBeenCalledOnce();
    expect(wrapper.get('.qr-result-output').element.value).toBe('newest image');
    expect(wrapper.emitted('feedback')).toHaveLength(1);
    wrapper.vm.resetPanel();
    await flushPromises();
    expect(revokeObjectURL).toHaveBeenCalledWith('blob:second');
    expect(wrapper.get('.qr-result-output').element.value).toBe('');
  });

  it('clears a previous result while loading a corrupt replacement image', async () => {
    const { images } = mockImageDecode('first result', { deferLoad: true });
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    const transfer = { files: [new File(['qr'], 'qr.png', { type: 'image/png' })] };
    dispatchImageTransfer(wrapper.element, 'paste', transfer);
    images[0].onload();
    await flushPromises();
    expect(wrapper.get('.qr-result-output').element.value).toBe('first result');
    dispatchImageTransfer(wrapper.element, 'drop', transfer);
    await flushPromises();
    expect(wrapper.get('.qr-result-output').element.value).toBe('');
    expect(wrapper.text()).toContain('识别中');
    images[1].onerror();
    await flushPromises();
    expect(wrapper.text()).toContain('识别失败');
    expect(wrapper.get('.qr-scan-input').attributes('aria-busy')).toBe('false');
  });

  it.each(['clear', 'mode exit', 'unmount', 'replacement'])('ignores clipboard data arriving after %s', async (action) => {
    const { createObjectURL } = mockImageDecode();
    let resolveRead;
    const read = vi.fn(() => new Promise((resolve) => { resolveRead = resolve; }));
    vi.stubGlobal('navigator', { clipboard: { read } });
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    await wrapper.findAll('button').find((button) => button.text().includes('粘贴剪贴板图片')).trigger('click');
    if (action === 'clear') wrapper.vm.resetPanel();
    if (action === 'mode exit') {
      await wrapper.setProps({ mode: 'generate' });
      await wrapper.setProps({ mode: 'scan' });
    }
    if (action === 'unmount') wrapper.unmount();
    if (action === 'replacement') {
      dispatchImageTransfer(wrapper.element, 'paste', { files: [new File(['qr'], 'qr.png', { type: 'image/png' })] });
      await flushPromises();
    }
    const getType = vi.fn().mockResolvedValue(new Blob(['qr'], { type: 'image/png' }));
    resolveRead([{ types: ['image/png'], getType }]);
    await flushPromises();
    expect(getType).not.toHaveBeenCalled();
    expect(createObjectURL).toHaveBeenCalledTimes(action === 'replacement' ? 1 : 0);
  });

  it('ignores a clipboard blob that finishes loading after clear', async () => {
    const { createObjectURL } = mockImageDecode();
    let resolveBlob;
    const getType = vi.fn(() => new Promise((resolve) => { resolveBlob = resolve; }));
    vi.stubGlobal('navigator', { clipboard: { read: vi.fn().mockResolvedValue([{ types: ['image/png'], getType }]) } });
    wrapper = mount(QrPanel, { props: { mode: 'scan' } });
    await wrapper.findAll('button').find((button) => button.text().includes('粘贴剪贴板图片')).trigger('click');
    await flushPromises();
    expect(getType).toHaveBeenCalledOnce();
    wrapper.vm.resetPanel();
    resolveBlob(new Blob(['qr'], { type: 'image/png' }));
    await flushPromises();
    expect(createObjectURL).not.toHaveBeenCalled();
  });

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
