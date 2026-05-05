import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, describe, expect, it } from 'vitest';
import LightAppHeaderPortal from './LightAppHeaderPortal.vue';

function createTarget(id) {
  const node = document.createElement('div');
  node.id = id;
  document.body.appendChild(node);
  return node;
}

describe('LightAppHeaderPortal', () => {
  afterEach(() => {
    document.querySelectorAll('[id^="lightapp-header-portal-shell-"]').forEach((node) => node.remove());
  });

  it('teleports slot content to matched header anchor and keeps consistency when switching window id', async () => {
    const targetA = createTarget('lightapp-header-portal-shell-910001');
    const targetB = createTarget('lightapp-header-portal-shell-910002');

    const wrapper = mount(LightAppHeaderPortal, {
      props: {
        windowId: 910001
      },
      slots: {
        default: '<button data-portal-btn type="button">portal</button>'
      },
      attachTo: document.body
    });
    await flushPromises();

    expect(targetA.querySelector('button[data-portal-btn]')).not.toBeNull();
    expect(targetB.querySelector('button[data-portal-btn]')).toBeNull();

    await wrapper.setProps({ windowId: 910002 });
    await flushPromises();

    expect(targetA.querySelector('button[data-portal-btn]')).toBeNull();
    expect(targetB.querySelector('button[data-portal-btn]')).not.toBeNull();
    wrapper.unmount();
  });
});
