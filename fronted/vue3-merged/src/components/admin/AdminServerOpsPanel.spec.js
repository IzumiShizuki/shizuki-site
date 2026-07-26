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

  it('renders meguri card and emits meguri restart action', async () => {
    const wrapper = mountPanel({
      meguri: {
        containerFound: true,
        containerId: 'id-meguri',
        containerName: 'meguri-pet',
        state: 'running',
        status: 'Up 2 hours',
        running: true,
        manageable: true,
        metricsPresent: true,
        metricsAgeSeconds: 42,
        metricsStale: false,
        health: null
      }
    });

    expect(wrapper.find('[data-testid="meguri-card"]').exists()).toBe(true);
    expect(wrapper.text()).toContain('meguri-pet');
    expect(wrapper.text()).toContain('Fresh');

    await wrapper.find('button[data-action="meguri-restart"]').trigger('click');
    const events = wrapper.emitted('action');
    expect(events).toBeTruthy();
    expect(events[0][0]).toEqual({
      containerId: 'id-meguri',
      containerName: 'meguri-pet',
      action: 'restart'
    });
  });

  it('disables meguri actions when the container is missing', () => {
    const wrapper = mountPanel({
      meguri: {
        containerFound: false,
        containerName: 'meguri-pet',
        manageable: true,
        metricsPresent: false,
        metricsStale: true
      }
    });

    expect(wrapper.text()).toContain('Not found');
    expect(wrapper.find('button[data-action="meguri-restart"]').attributes('disabled')).toBeDefined();
    expect(wrapper.find('button[data-action="meguri-logs"]').attributes('disabled')).toBeDefined();
  });

  it('renders service health cards', () => {
    const wrapper = mountPanel({
      services: [
        { name: 'memoryos', url: 'http://host.docker.internal:8788/health', healthy: true, statusCode: 200, latencyMs: 15, message: 'OK' },
        { name: 'meting-api', url: 'http://meting-api/health', healthy: false, statusCode: 0, latencyMs: 1200, message: 'Connection refused' }
      ]
    });

    expect(wrapper.find('[data-testid="service-memoryos"]').text()).toContain('Healthy');
    expect(wrapper.find('[data-testid="service-meting-api"]').text()).toContain('Down');
  });

  it('emits showLogs from the container row logs button', async () => {
    const wrapper = mountPanel();

    await wrapper.find('button[data-action="logs"]').trigger('click');
    const events = wrapper.emitted('showLogs');
    expect(events).toBeTruthy();
    expect(events[0][0]).toEqual({
      containerId: 'id-backend',
      containerName: 'shizuki-site-backend'
    });
  });

  it('renders the logs dialog and emits refresh with the selected tail', async () => {
    const wrapper = mountPanel({
      logsOpen: true,
      logsTarget: { containerId: 'id-backend', containerName: 'shizuki-site-backend' },
      logsLines: ['2026-07-26T02:00:00Z line one', '2026-07-26T02:00:01Z line two'],
      logsTail: 200
    });

    expect(wrapper.find('[data-testid="logs-overlay"]').exists()).toBe(true);
    expect(wrapper.find('[data-testid="logs-body"]').text()).toContain('line two');

    await wrapper.find('select.logs-tail-select').setValue('500');
    const events = wrapper.emitted('refreshLogs');
    expect(events).toBeTruthy();
    expect(events[0][0]).toBe(500);

    await wrapper.find('button[data-action="close-logs"]').trigger('click');
    expect(wrapper.emitted('closeLogs')).toBeTruthy();
  });
});
