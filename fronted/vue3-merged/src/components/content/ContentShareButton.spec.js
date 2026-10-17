import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, describe, expect, it, vi } from 'vitest';
import ContentShareButton from './ContentShareButton.vue';

vi.mock('../../utils/contentShare', async (importOriginal) => {
  const actual = await importOriginal();
  return {
    ...actual,
    buildContentShareUrl: (kind, id) => actual.buildContentShareUrl(kind, id, {
      locationTarget: 'file:///D:/app/index.html#/blog/42?token=local'
    })
  };
});

let wrapper;
const originalCopy = document.execCommand;
afterEach(() => {
  wrapper?.unmount();
  vi.unstubAllGlobals();
  if (originalCopy === undefined) delete document.execCommand;
  else document.execCommand = originalCopy;
});

function mountShare(navigatorTarget) {
  vi.stubGlobal('navigator', navigatorTarget);
  document.execCommand = vi.fn(() => false);
  wrapper = mount(ContentShareButton, {
    props: { kind: 'post', publicId: '42', title: '公开文章' }, attachTo: document.body
  });
  return wrapper;
}

describe('ContentShareButton recovery', () => {
  it.each(['unavailable', 'denied', 'copy-exception'])('offers a selected stable desktop URL when copying is %s', async (mode) => {
    const unavailable = mode !== 'denied' ? {} : {
      share: vi.fn().mockRejectedValue(new Error('unsupported')),
      clipboard: { writeText: vi.fn().mockRejectedValue(new Error('denied')) }
    };
    mountShare(unavailable);
    if (mode === 'copy-exception') document.execCommand = vi.fn(() => { throw new DOMException('blocked', 'SecurityError'); });
    await wrapper.get('button').trigger('click');
    await flushPromises();
    const input = wrapper.get('input');
    expect(input.element.value).toBe('https://site.shizuki.online/read/posts/42');
    expect(input.attributes('readonly')).toBeDefined();
    expect(document.activeElement).toBe(input.element);
    expect(input.element.selectionEnd - input.element.selectionStart).toBe(input.element.value.length);
    expect(wrapper.text()).toContain('请复制下方链接');
    expect(wrapper.text()).not.toContain('地址栏');
  });

  it('clears the previous fallback when the content changes', async () => {
    mountShare({});
    await wrapper.get('button').trigger('click');
    await flushPromises();
    await wrapper.setProps({ publicId: '43', title: '下一篇' });
    expect(wrapper.find('input').exists()).toBe(false);
    expect(wrapper.get('button').text()).toBe('分享');
    await wrapper.get('button').trigger('click');
    await flushPromises();
    expect(wrapper.get('input').element.value).toBe('https://site.shizuki.online/read/posts/43');
  });

  it('does not show a stale completion or re-enable a newer pending share', async () => {
    let finishOld;
    let finishNew;
    mountShare({ share: vi.fn()
      .mockImplementationOnce(() => new Promise(resolve => { finishOld = resolve; }))
      .mockImplementationOnce(() => new Promise(resolve => { finishNew = resolve; })) });
    await wrapper.get('button').trigger('click');
    await wrapper.setProps({ publicId: '43' });
    await wrapper.get('button').trigger('click');
    finishOld();
    await flushPromises();
    expect(wrapper.get('button').text()).toBe('分享');
    expect(wrapper.get('button').attributes('disabled')).toBeDefined();
    finishNew();
    await flushPromises();
    expect(wrapper.get('button').text()).toBe('已分享');
    expect(wrapper.get('button').attributes('disabled')).toBeUndefined();
  });

  it('treats cancelling native sharing as a quiet return to the share action', async () => {
    mountShare({ share: vi.fn().mockRejectedValue(new DOMException('cancelled', 'AbortError')) });
    await wrapper.get('button').trigger('click');
    await flushPromises();
    expect(wrapper.find('input').exists()).toBe(false);
    expect(wrapper.get('button').text()).toBe('分享');
    expect(wrapper.get('.content-share-status').text()).toBe('');
  });
});
