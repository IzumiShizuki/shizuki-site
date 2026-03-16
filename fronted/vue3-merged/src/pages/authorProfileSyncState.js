export function createAuthorProfileSyncState() {
  return {
    publicRevision: 0,
    adminRevision: 0
  };
}

export function beginPublicProfileRequest(state) {
  state.publicRevision += 1;
  return state.publicRevision;
}

export function invalidatePublicProfileRequests(state) {
  state.publicRevision += 1;
  return state.publicRevision;
}

export function shouldApplyPublicProfileResponse(state, revision) {
  return Number(revision) === Number(state?.publicRevision);
}

export function beginAdminProfileRequest(state) {
  state.adminRevision += 1;
  return state.adminRevision;
}

export function invalidateAdminProfileRequests(state) {
  state.adminRevision += 1;
  return state.adminRevision;
}

export function shouldApplyAdminProfileResponse(state, revision) {
  return Number(revision) === Number(state?.adminRevision);
}
