import { describe, expect, it } from 'vitest';
import { resolveOAuthCallbackRedirect } from './oauthCallbackGuard';

describe('resolveOAuthCallbackRedirect', () => {
  it('redirects to /auth/callback when search contains code and state', () => {
    const result = resolveOAuthCallbackRedirect('/', '?code=abc123&state=state123');
    expect(result).toEqual({ path: '/auth/callback' });
  });

  it('does not redirect when already on callback route', () => {
    const result = resolveOAuthCallbackRedirect('/auth/callback', '?code=abc123&state=state123');
    expect(result).toBeNull();
  });

  it('does not redirect when code or state is missing', () => {
    expect(resolveOAuthCallbackRedirect('/', '?code=abc123')).toBeNull();
    expect(resolveOAuthCallbackRedirect('/', '?state=state123')).toBeNull();
    expect(resolveOAuthCallbackRedirect('/', '')).toBeNull();
  });
});

