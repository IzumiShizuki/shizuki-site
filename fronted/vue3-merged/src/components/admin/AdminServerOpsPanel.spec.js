import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AdminServerOpsPanel from './AdminServerOpsPanel.vue';

function mountPanel(props = {}) {
  return mount(AdminServerOpsPanel, {
    props: {
      overview: {
        portalUrl: 'https://ops.shizuki.online',
        meting: {
          available: true,
          providers: ['netease', 'kuwo']
        },
        portainerReachable: true,
        portainerMessage: 'OK',
        containerTotal: 2,
        containerRunning: 1,
        containerStopped: 1
      },
      containers: [
        {
          containerId: 'id-backend',
          containerName: 'shizuki-site-backend',
          image: 'backend:latest',
          state: 'running',
          status: 'Up 1 minute',
          ports: ['0.0.0.0:18080->8080/tcp'],
          running: true
        }
      ],
      ...props
    }
  });
}

describe('AdminServerOpsPanel', () => {
  it('renders meting providers and container row', () => {
    const wrapper = mountPanel();

    expect(wrapper.text()).toContain('netease, kuwo');
    expect(wrapper.text()).toContain('shizuki-site-backend');
    expect(wrapper.text()).toContain('0.0.0.0:18080->8080/tcp');
  });

  it('emits container action event', async () => {
    const wrapper = mountPanel();

    await wrapper.find('button[data-action="restart"]').trigger('click');
    const events = wrapper.emitted('action');
    expect(events).toBeTruthy();
    expect(events[0][0]).toEqual({
      containerId: 'id-backend',
      containerName: 'shizuki-site-backend',
      action: 'restart'
    });
  });

  it('shows fallback message when container list is empty', () => {
    const wrapper = mountPanel({
      containers: []
    });

    expect(wrapper.text()).toContain('暂无可管理容器');
  });
});
