import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import DailyArtPanel from './DailyArtPanel.vue';
import DailyArtwork from './DailyArtwork.vue';

const mocked = vi.hoisted(() => ({ auth: null }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));
const wrappers = [];
const today = { date: '2026-10-07', recommendation_state: 'empty', artworks: [], wife: { name: '五河琴里', tag: '五河琴里', series: '约会大作战' } };
const settings = { connected: false, manual_artists: [], followed_artists: [] };
function render() { const wrapper = mount(DailyArtPanel); wrappers.push(wrapper); return wrapper; }
function response(data) { return { data }; }
beforeEach(() => {
  mocked.auth = {
    user: ref({ userId: 7 }), isAuthenticated: ref(true),
    authorizedFetch: vi.fn(async (path) => response(path.endsWith('/today') ? today : settings))
  };
});
afterEach(() => { wrappers.forEach(wrapper => wrapper.unmount()); wrappers.length = 0; });

describe('personal daily art panel', () => {
  it('gives a login action without making private requests for a visitor', async () => {
    mocked.auth.isAuthenticated.value = false;
    const wrapper = render();
    await wrapper.get('button').trigger('click');
    expect(wrapper.emitted('login')).toHaveLength(1);
    expect(mocked.auth.authorizedFetch).not.toHaveBeenCalled();
  });

  it('shows setup and the stable character with a retry when its image is unavailable', async () => {
    const wrapper = render();
    await flushPromises();
    expect(wrapper.text()).toContain('五河琴里');
    expect(wrapper.text()).toContain('重试角色图片');
    await wrapper.findAll('button').find(button => button.text() === '添加画师或关联 Pixiv').trigger('click');
    expect(wrapper.get('details.daily-settings').element.open).toBe(true);
  });

  it('adds a profile URL as a manual artist and preserves existing choices', async () => {
    mocked.auth.authorizedFetch.mockImplementation(async (path, options) => {
      if (path.endsWith('/artists')) return response({ manual_artists: [{ id: '42', name: '画师' }] });
      return response(path.endsWith('/today') ? today : settings);
    });
    const wrapper = render();
    await flushPromises();
    await wrapper.get('#daily-art-artist').setValue('https://www.pixiv.net/users/42');
    await wrapper.get('.artist-form').trigger('submit');
    await flushPromises();
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith('/api/v1/me/daily-art/artists', expect.objectContaining({ body: { artistIds: ['42'] } }), { expectedUserId: 7 });
    expect(wrapper.text()).toContain('画师已添加');
    expect(wrapper.find('.artist-list').text()).toContain('画师');
  });

  it('clears the credential input after failed connection without writing browser storage', async () => {
    mocked.auth.authorizedFetch.mockImplementation(async (path) => {
      if (path.endsWith('/pixiv')) throw new Error('登录会话已失效');
      return response(path.endsWith('/today') ? today : settings);
    });
    const storage = vi.spyOn(Storage.prototype, 'setItem');
    const wrapper = render();
    await flushPromises();
    await wrapper.get('#daily-art-account').setValue('42');
    await wrapper.get('#daily-art-session').setValue('42_abcdefghijklmnop');
    await wrapper.get('.setup-form').trigger('submit');
    await flushPromises();
    expect(wrapper.get('#daily-art-session').element.value).toBe('');
    expect(wrapper.text()).toContain('登录会话已失效');
    expect(storage).not.toHaveBeenCalled();
    storage.mockRestore();
  });

  it('keeps loaded daily content when retry fails and offers search errors', async () => {
    const wrapper = render();
    await flushPromises();
    mocked.auth.authorizedFetch.mockRejectedValue(new Error('上游暂时不可用'));
    await wrapper.findAll('button').find(button => button.text() === '重试角色图片').trigger('click');
    await flushPromises();
    expect(wrapper.text()).toContain('五河琴里');
    await wrapper.get('#daily-art-search').setValue('五河琴里');
    await wrapper.get('.search-form').trigger('submit');
    await flushPromises();
    expect(wrapper.text()).toContain('上游暂时不可用');
    expect(wrapper.get('.external-search').attributes('href')).toContain(encodeURIComponent('五河琴里'));
  });

  it('ignores requests from the old user after switching accounts', async () => {
    let resolve;
    mocked.auth.authorizedFetch.mockImplementation(() => new Promise(done => { resolve = done; }));
    const wrapper = render();
    mocked.auth.isAuthenticated.value = false;
    mocked.auth.user.value = null;
    await flushPromises();
    resolve(response(today));
    await flushPromises();
    expect(wrapper.text()).not.toContain('五河琴里');
    expect(wrapper.text()).toContain('登录以开启每日推荐');
  });

  it('offers an original-work fallback when an image fails', async () => {
    const wrapper = mount(DailyArtwork, { props: { artwork: { id: '1', imageUrl: '/preview/1', sourceUrl: 'https://www.pixiv.net/artworks/1', title: '图片', artistId: '42', artistName: '画师' } } });
    wrappers.push(wrapper);
    await wrapper.get('img').trigger('error');
    expect(wrapper.text()).toContain('图片暂时无法显示');
    expect(wrapper.get('.image-link').attributes('href')).toBe('https://www.pixiv.net/artworks/1');
  });
});
