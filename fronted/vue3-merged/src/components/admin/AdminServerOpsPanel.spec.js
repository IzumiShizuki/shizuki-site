import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AdminServerOpsPanel from './AdminServerOpsPanel.vue';

function mountPanel(props = {}) {
  return mount(AdminServerOpsPanel, {
    props: {
      overview: {
        portalUrl: 'https://panel.shizuki.online',
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
          running: true,
          manageable: true
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

    expect(wrapper.text()).toContain('No containers are available right now');
  });

  it('disables action buttons for read-only containers', () => {
    const wrapper = mountPanel({
      containers: [
        {
          containerId: 'id-random',
          containerName: 'infra-postgres',
          image: 'postgres:17',
          state: 'running',
          status: 'Up 1 hour',
          ports: ['5432/tcp'],
          running: true,
          manageable: false
        }
      ]
    });

    expect(wrapper.find('button[data-action="restart"]').attributes('disabled')).toBeDefined();
    expect(wrapper.text()).toContain('Read-only here');
  });
});
