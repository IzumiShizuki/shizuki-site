import { ref } from 'vue';
import { expect, it, vi } from 'vitest';
import { listMusicProviders } from '../services/musicApi';
import { resolveVoiceRouteVisible } from './voiceRouteAccess';

vi.mock('../services/musicApi', () => ({ listMusicProviders: vi.fn() }));
const makeAuth = (userId) => ({ isAuthenticated: ref(true), user: ref({ userId }), authorizedFetch: vi.fn() });

it('does not reuse a cached visible result for a different account', async () => {
  listMusicProviders.mockResolvedValueOnce([{ provider: 'asmr', enabled: true, visible: true }]);
  expect(await resolveVoiceRouteVisible(makeAuth('allowed'))).toBe(true);
  listMusicProviders.mockResolvedValueOnce([{ provider: 'asmr', enabled: true, visible: false }]);
  expect(await resolveVoiceRouteVisible(makeAuth('not-allowed'))).toBe(false);
});

it('does not expose a late response after the active account changes', async () => {
  const auth = makeAuth('old');
  let finish;
  listMusicProviders.mockImplementationOnce(() => new Promise((resolve) => { finish = resolve; }));
  const pending = resolveVoiceRouteVisible(auth);
  auth.user.value = { userId: 'new' };
  finish([{ provider: 'asmr', enabled: true, visible: true }]);
  expect(await pending).toBe(false);
});
