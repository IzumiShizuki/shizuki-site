import { describe, expect, it } from 'vitest';
import {
  beginAdminProfileRequest,
  beginPublicProfileRequest,
  createAuthorProfileSyncState,
  invalidateAdminProfileRequests,
  invalidatePublicProfileRequests,
  shouldApplyAdminProfileResponse,
  shouldApplyPublicProfileResponse
} from './authorProfileSyncState';

describe('authorProfileSyncState', () => {
  it('only applies the latest public profile response', () => {
    const state = createAuthorProfileSyncState();

    const first = beginPublicProfileRequest(state);
    const second = beginPublicProfileRequest(state);

    expect(shouldApplyPublicProfileResponse(state, first)).toBe(false);
    expect(shouldApplyPublicProfileResponse(state, second)).toBe(true);
  });

  it('drops outdated public responses after invalidation', () => {
    const state = createAuthorProfileSyncState();

    const revision = beginPublicProfileRequest(state);
    invalidatePublicProfileRequests(state);

    expect(shouldApplyPublicProfileResponse(state, revision)).toBe(false);
  });

  it('drops outdated admin responses after invalidation', () => {
    const state = createAuthorProfileSyncState();

    const revision = beginAdminProfileRequest(state);
    invalidateAdminProfileRequests(state);

    expect(shouldApplyAdminProfileResponse(state, revision)).toBe(false);
  });

  it('tracks public and admin revisions independently', () => {
    const state = createAuthorProfileSyncState();

    const publicRevision = beginPublicProfileRequest(state);
    const adminRevision = beginAdminProfileRequest(state);

    expect(shouldApplyPublicProfileResponse(state, publicRevision)).toBe(true);
    expect(shouldApplyAdminProfileResponse(state, adminRevision)).toBe(true);
  });
});
