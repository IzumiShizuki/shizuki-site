import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { ref } from 'vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  getMeguriBootstrap: vi.fn(),
  createMeguriTurn: vi.fn(),
  cancelMeguriTurn: vi.fn(),
  fetchMeguriSpriteObjectUrl: vi.fn(),
  followMeguriTurn: vi.fn()
}));

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../services/meguriApi', async (importOriginal) => {
  const original = await importOriginal();
  return {
    ...original,
    getMeguriBootstrap: (...args) => mocked.getMeguriBootstrap(...args),
    createMeguriTurn: (...args) => mocked.createMeguriTurn(...args),
    cancelMeguriTurn: (...args) => mocked.cancelMeguriTurn(...args),
    fetchMeguriSpriteObjectUrl: (...args) => mocked.fetchMeguriSpriteObjectUrl(...args)
  };
});

vi.mock('../utils/meguriTurnStream', async (importOriginal) => {
  const original = await importOriginal();
  return {
    ...original,
    followMeguriTurn: (...args) => mocked.followMeguriTurn(...args)
  };
});

import MeguriPage from './MeguriPage.vue';

function createAuth() {
  return {
    ensureReady: vi.fn().mockResolvedValue(undefined),
    isAuthenticated: ref(true),
    user: ref({ userId: 1, groups: ['USER', 'ADMIN'] }),
    authorizedFetch: vi.fn(),
    authorizedRawFetch: vi.fn()
  };
}

describe('MeguriPage', () => {
  beforeEach(() => {
    mocked.auth = createAuth();
    mocked.getMeguriBootstrap.mockReset();
    mocked.createMeguriTurn.mockReset();
    mocked.cancelMeguriTurn.mockReset();
    mocked.fetchMeguriSpriteObjectUrl.mockReset();
    mocked.followMeguriTurn.mockReset();
    if (typeof window !== 'undefined') {
      window.localStorage.clear();
    }
  });

  it('shows the disabled notice when the gateway is off', async () => {
    mocked.getMeguriBootstrap.mockResolvedValue({
      enabled: false,
      coreOnline: false,
      buildId: '',
      ragChunks: 0,
      defaultSprite: '',
      spriteAvailable: false
    });

    const wrapper = mount(MeguriPage);
    await flushPromises();

    expect(wrapper.text()).toContain('Meguri 网关尚未启用');
    expect(wrapper.find('.dialog-composer').exists()).toBe(false);
  });

  it('sends one message and renders the streamed reply', async () => {
    mocked.getMeguriBootstrap.mockResolvedValue({
      enabled: true,
      coreOnline: true,
      buildId: 'build-1',
      ragChunks: 174,
      defaultSprite: 'ce04001l.png',
      spriteAvailable: false
    });
    mocked.createMeguriTurn.mockResolvedValue({
      turnId: 'turn-1',
      sessionId: 'web_session01',
      buildId: 'build-1',
      status: 'accepted'
    });
    mocked.followMeguriTurn.mockImplementation(async ({ onEvent }) => {
      const state = {
        turnId: 'turn-1',
        text: '今天也一起加油吧',
        status: 'completed',
        expression: null,
        toolHint: '',
        error: ''
      };
      await onEvent(
        { type: 'text.delta', turnId: 'turn-1', sessionId: 'web_session01', sequence: 1, data: {} },
        state
      );
      return state;
    });

    const wrapper = mount(MeguriPage);
    await flushPromises();

    await wrapper.find('.composer-input').setValue('爱莉，早上好');
    await wrapper.find('.dialog-composer').trigger('submit');
    await flushPromises();

    expect(mocked.createMeguriTurn).toHaveBeenCalledTimes(1);
    const [payload] = mocked.createMeguriTurn.mock.calls[0];
    expect(payload.message).toBe('爱莉，早上好');
    expect(payload.sessionId).toMatch(/^web_/);

    const rows = wrapper.findAll('.chat-row');
    expect(rows).toHaveLength(2);
    expect(rows[0].text()).toContain('爱莉，早上好');
    expect(rows[1].text()).toContain('今天也一起加油吧');
    expect(wrapper.find('.error-banner').exists()).toBe(false);
  });

  it('marks the reply as failed when the turn cannot be created', async () => {
    mocked.getMeguriBootstrap.mockResolvedValue({
      enabled: true,
      coreOnline: true,
      buildId: 'build-1',
      ragChunks: 174,
      defaultSprite: '',
      spriteAvailable: false
    });
    mocked.createMeguriTurn.mockRejectedValue(new Error('Meguri Core 暂不可用，请稍后再试'));

    const wrapper = mount(MeguriPage);
    await flushPromises();

    await wrapper.find('.composer-input').setValue('在吗');
    await wrapper.find('.dialog-composer').trigger('submit');
    await flushPromises();

    expect(wrapper.find('.error-banner').text()).toContain('Meguri Core 暂不可用');
    const assistantRow = wrapper.findAll('.chat-row')[1];
    expect(assistantRow.classes()).toContain('failed');
  });

  it('retries the last failed message without duplicating the user row', async () => {
    mocked.getMeguriBootstrap.mockResolvedValue({
      enabled: true,
      coreOnline: true,
      buildId: 'build-1',
      ragChunks: 174,
      defaultSprite: '',
      spriteAvailable: false
    });
    mocked.createMeguriTurn
      .mockRejectedValueOnce(new Error('临时不可用'))
      .mockResolvedValueOnce({
        turnId: 'turn-2',
        sessionId: 'web_session01',
        buildId: 'build-1',
        status: 'accepted'
      });
    mocked.followMeguriTurn.mockImplementation(async ({ onEvent }) => {
      const state = {
        turnId: 'turn-2',
        text: '这次收到啦',
        status: 'completed',
        expression: null,
        toolHint: '',
        error: ''
      };
      await onEvent(
        { type: 'text.delta', turnId: 'turn-2', sessionId: 'web_session01', sequence: 1, data: {} },
        state
      );
      return state;
    });

    const wrapper = mount(MeguriPage);
    await flushPromises();
    await wrapper.find('.composer-input').setValue('再试一次');
    await wrapper.find('.dialog-composer').trigger('submit');
    await flushPromises();

    await wrapper.get('.conversation-error button').trigger('click');
    await flushPromises();

    expect(mocked.createMeguriTurn).toHaveBeenCalledTimes(2);
    expect(wrapper.findAll('.chat-row.user')).toHaveLength(1);
    expect(wrapper.text()).toContain('这次收到啦');
    expect(wrapper.find('.conversation-error').exists()).toBe(false);
  });

  it('starts a fresh session id when the reset button is used', async () => {
    mocked.getMeguriBootstrap.mockResolvedValue({
      enabled: true,
      coreOnline: true,
      buildId: 'build-1',
      ragChunks: 174,
      defaultSprite: '',
      spriteAvailable: false
    });
    mocked.createMeguriTurn.mockResolvedValue({
      turnId: 'turn-1',
      sessionId: 'web_session01',
      buildId: 'build-1',
      status: 'accepted'
    });
    mocked.followMeguriTurn.mockResolvedValue({
      turnId: 'turn-1',
      text: '好',
      status: 'completed',
      expression: null,
      toolHint: '',
      error: ''
    });

    const wrapper = mount(MeguriPage);
    await flushPromises();

    await wrapper.find('.composer-input').setValue('hi');
    await wrapper.find('.dialog-composer').trigger('submit');
    await flushPromises();
    const firstSession = mocked.createMeguriTurn.mock.calls[0][0].sessionId;

    await wrapper.find('.chat-actions button').trigger('click');
    expect(wrapper.findAll('.chat-row')).toHaveLength(0);

    await wrapper.find('.composer-input').setValue('again');
    await wrapper.find('.dialog-composer').trigger('submit');
    await flushPromises();
    const secondSession = mocked.createMeguriTurn.mock.calls[1][0].sessionId;

    expect(secondSession).not.toBe(firstSession);
  });

  it('switches outfits through authenticated sprite requests', async () => {
    mocked.getMeguriBootstrap.mockResolvedValue({
      enabled: true,
      coreOnline: true,
      buildId: 'build-1',
      ragChunks: 174,
      defaultSprite: 'ce04001l.png',
      spriteAvailable: true
    });
    mocked.fetchMeguriSpriteObjectUrl.mockImplementation(async (fileName) => `blob:${fileName}`);

    const wrapper = mount(MeguriPage);
    await flushPromises();

    await wrapper.findAll('.controls-rail .control-button')[1].trigger('click');
    await flushPromises();
    const outfit02 = wrapper.findAll('.outfit-picker button').find((button) => button.text() === '02');
    expect(outfit02).toBeTruthy();
    await outfit02.trigger('click');
    await flushPromises();

    expect(mocked.fetchMeguriSpriteObjectUrl).toHaveBeenCalledWith('ce02001l.png', mocked.auth.authorizedRawFetch);
    expect(wrapper.get('.presentation-badge').text()).toContain('outfit 02');
  });

  it('keeps chat controls available without exposing desktop-only actions', async () => {
    mocked.getMeguriBootstrap.mockResolvedValue({
      enabled: true,
      coreOnline: true,
      buildId: 'build-1',
      ragChunks: 174,
      defaultSprite: '',
      spriteAvailable: false
    });

    const wrapper = mount(MeguriPage);
    await flushPromises();

    expect(wrapper.find('.chat-dock').exists()).toBe(true);
    await wrapper.find('.controls-rail .control-button').trigger('click');
    expect(wrapper.find('.chat-dock').exists()).toBe(false);
    window.dispatchEvent(new KeyboardEvent('keydown', { key: 'm', ctrlKey: true, shiftKey: true }));
    await flushPromises();
    expect(wrapper.find('.chat-dock').exists()).toBe(true);

    const text = wrapper.text();
    expect(text).not.toContain('窗口置顶');
    expect(text).not.toContain('鼠标穿透');
    expect(text).not.toContain('退出 Meguri');
  });
});
