import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import MusicAccountSyncPanel from './MusicAccountSyncPanel.vue';

function mountPanel(props = {}) {
  return mount(MusicAccountSyncPanel, {
    props: {
      authenticated: false,
      account: {},
      session: {},
      ...props
    }
  });
}

describe('MusicAccountSyncPanel', () => {
  it('asks signed-out users to log in without exposing a sync action', async () => {
    const wrapper = mountPanel();

    expect(wrapper.get('[data-testid="signed-out-state"]').text()).toContain('登录后启用云歌单');
    expect(wrapper.text()).toContain('登录本站后开始绑定');
    expect(wrapper.find('[data-testid="sync-button"]').exists()).toBe(false);

    await wrapper.get('.primary-action').trigger('click');

    expect(wrapper.emitted('require-login')).toHaveLength(1);
  });

  it('shows the connected account and emits NetEase bind and playlist sync actions', async () => {
    const wrapper = mountPanel({
      authenticated: true,
      account: {
        provider: 'netease',
        bound: true,
        mask: 'MUSIC_U***88'
      }
    });

    expect(wrapper.get('[data-testid="bound-account"]').text()).toContain('MUSIC_U***88');
    expect(wrapper.text()).toContain('已绑定');
    expect(wrapper.text()).toContain('仅网易云支持账号歌单导入');
    expect(wrapper.text()).toContain('不会把音频文件下载到电脑');

    await wrapper.get('[data-testid="bind-button"]').trigger('click');
    await wrapper.get('[data-testid="sync-button"]').trigger('click');

    expect(wrapper.emitted('bind')).toEqual([['netease']]);
    expect(wrapper.emitted('sync')).toEqual([['netease']]);
  });

  it('renders QR progress, detailed import statistics, and a sync error', () => {
    const wrapper = mountPanel({
      authenticated: true,
      session: {
        provider: 'netease',
        sessionId: 'session-1',
        status: 'PENDING',
        qrStatus: 'WAIT_CONFIRM',
        qrImage: 'data:image/png;base64,AAAA'
      },
      syncResult: {
        importedPlaylists: 7,
        importedTracks: 126,
        skippedPlaylists: 2,
        failedPlaylists: 1
      },
      errorText: '有 1 个私密歌单未能同步'
    });

    expect(wrapper.get('[data-testid="qr-session"] img').attributes('src')).toContain('data:image/png');
    expect(wrapper.get('[data-testid="qr-session"]').text()).toContain('扫码成功，请在手机上确认登录');
    expect(wrapper.get('[data-testid="sync-result"]').text()).toContain('部分歌单需重试');
    expect(wrapper.get('[data-testid="sync-result"]').text()).toContain('126');
    expect(wrapper.get('[data-testid="sync-error"]').text()).toContain('私密歌单未能同步');
  });
});
