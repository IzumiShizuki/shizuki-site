import { effectScope, ref } from 'vue';
import { afterEach, describe, expect, it, vi } from 'vitest';
import { usePlatformMusicLikes } from './usePlatformMusicLikes';

const scopes = [];
afterEach(() => scopes.splice(0).forEach((scope) => scope.stop()));
function fixture() {
  const account = ref('user-a');
  const authenticated = ref(true);
  const api = { getMusicSourceLikes: vi.fn().mockResolvedValue(['42']), setMusicSourceTrackLiked: vi.fn(async (_p, _id, liked) => ({ liked })),
    getMusicSourceProgramLikeState: vi.fn().mockResolvedValue({ liked: true }), setMusicSourceProgramLiked: vi.fn(async (_p, _id, liked) => ({ liked })) };
  const onError = vi.fn();
  const onLogin = vi.fn();
  const onSynced = vi.fn();
  const scope = effectScope();
  scopes.push(scope);
  const engine = scope.run(() => usePlatformMusicLikes({ api, isAuthenticated: () => authenticated.value, getAccountId: () => account.value, getAuthorizedFetch: (id) => id, onError, onLogin, onSynced }));
  return { engine, account, authenticated, api, onError, onLogin, onSynced };
}
const track = { provider: 'netease', trackId: '42' };

describe('account-backed music likes', () => {
  it('keeps program favourites separate from song likes and reads the current account state for an unknown queued program', async () => {
    const { engine, api, account } = fixture();
    const program = { provider: 'netease', trackId: '42', metadata: { programId: '777', liked: true } };
    await engine.refresh();
    engine.seedPrograms([program]);
    expect(engine.isLiked(program)).toBe(true);
    await engine.toggle(program);
    expect(api.setMusicSourceProgramLiked).toHaveBeenCalledWith('netease', '777', false, 'user-a');
    expect(api.setMusicSourceTrackLiked).not.toHaveBeenCalled();
    expect(engine.isLiked(track)).toBe(true);
    account.value = 'user-b';
    expect(engine.isLiked(program)).toBe(false);
    await engine.toggle(program);
    expect(api.getMusicSourceProgramLikeState).toHaveBeenCalledWith('netease', '777', 'user-b');
    expect(api.setMusicSourceProgramLiked).toHaveBeenLastCalledWith('netease', '777', false, 'user-b');
  });

  it('does not write a program or seed an old queued state after changing accounts during its state read', async () => {
    const { engine, api, account } = fixture();
    let resolve;
    api.getMusicSourceProgramLikeState.mockImplementation(() => new Promise((done) => { resolve = done; }));
    const program = { provider: 'netease', trackId: '42', metadata: { programId: '777' } };
    const operation = engine.toggle(program);
    account.value = 'user-b';
    resolve({ liked: true });
    expect(await operation).toBe(false);
    expect(api.setMusicSourceProgramLiked).not.toHaveBeenCalled();
    expect(engine.isLiked(program)).toBe(false);
  });
  it('reads cloud likes with provider identity and sends explicit unlike then like', async () => {
    const { engine, api, onSynced } = fixture();
    await engine.refresh();
    expect(engine.isLiked(track)).toBe(true);
    expect(engine.isLiked({ provider: 'qq', trackId: '42' })).toBe(false);
    await engine.toggle(track);
    expect(api.setMusicSourceTrackLiked).toHaveBeenLastCalledWith('netease', '42', false, 'user-a');
    expect(engine.isLiked(track)).toBe(false);
    await engine.toggle(track);
    expect(api.setMusicSourceTrackLiked).toHaveBeenLastCalledWith('netease', '42', true, 'user-a');
    expect(onSynced).toHaveBeenCalledTimes(2);
  });

  it('retains the acknowledged state on failure and prevents duplicate pending writes', async () => {
    const { engine, api, onError } = fixture();
    await engine.refresh();
    let reject;
    api.setMusicSourceTrackLiked.mockImplementation(() => new Promise((_resolve, fail) => { reject = fail; }));
    const operation = engine.toggle(track);
    expect(engine.isLiked(track)).toBe(true);
    expect(engine.isPending(track)).toBe(true);
    expect(await engine.toggle(track)).toBe(false);
    reject(new Error('网易云登录已失效'));
    await operation;
    expect(api.setMusicSourceTrackLiked).toHaveBeenCalledTimes(1);
    expect(engine.isLiked(track)).toBe(true);
    expect(engine.isPending(track)).toBe(false);
    expect(onError).toHaveBeenCalledWith('网易云登录已失效');
  });

  it('ignores old account mutation and read responses', async () => {
    const { engine, api, account, onSynced } = fixture();
    let resolveRead;
    let resolveWrite;
    api.getMusicSourceLikes.mockImplementation(() => new Promise((resolve) => { resolveRead = resolve; }));
    api.setMusicSourceTrackLiked.mockImplementation(() => new Promise((resolve) => { resolveWrite = resolve; }));
    const refresh = engine.refresh();
    const operation = engine.toggle(track);
    account.value = 'user-b';
    resolveRead(['42']);
    resolveWrite({ liked: true });
    await Promise.all([refresh, operation]);
    expect(engine.isLiked(track)).toBe(false);
    expect(onSynced).not.toHaveBeenCalled();
  });

  it('does not let an older read overwrite a completed like', async () => {
    const { engine, api } = fixture();
    let resolveRead;
    api.getMusicSourceLikes.mockImplementation(() => new Promise((resolve) => { resolveRead = resolve; }));
    const refresh = engine.refresh();
    await engine.toggle(track);
    resolveRead([]);
    await refresh;
    expect(engine.isLiked(track)).toBe(true);
  });

  it('requires login, rejects unsupported providers and missing acknowledgement without local substitutes', async () => {
    const { engine, api, authenticated, onLogin, onError } = fixture();
    authenticated.value = false;
    await engine.toggle(track);
    expect(onLogin).toHaveBeenCalledOnce();
    authenticated.value = true;
    await engine.toggle({ provider: 'qq', trackId: '42' });
    expect(api.setMusicSourceTrackLiked).not.toHaveBeenCalled();
    api.setMusicSourceTrackLiked.mockResolvedValue({});
    await engine.toggle(track);
    expect(engine.isLiked(track)).toBe(false);
    expect(onError).toHaveBeenCalledTimes(2);
  });

  it('retains known cloud likes when refresh fails', async () => {
    const { engine, api } = fixture();
    await engine.refresh();
    api.getMusicSourceLikes.mockRejectedValue(new Error('upstream unavailable'));
    expect(await engine.refresh()).toBe(false);
    expect(engine.isLiked(track)).toBe(true);
    expect(engine.error.value).toBe('upstream unavailable');
  });
});
