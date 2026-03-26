import { describe, expect, it } from 'vitest';
import { buildAiCapabilityState, hasAdminGroup } from './aiAuthorizationState';

describe('aiAuthorizationState', () => {
  it('recognizes ADMIN group regardless of case', () => {
    expect(hasAdminGroup(['user', 'Admin'])).toBe(true);
    expect(hasAdminGroup(['USER'])).toBe(false);
  });

  it('disables guests from sending any AI message', () => {
    const state = buildAiCapabilityState({ authenticated: false, groups: [], mode: 'quick_chat' });

    expect(state.canSendMessage).toBe(false);
    expect(state.disabledReason).toContain('游客配额为 0');
  });

  it('restricts town npc and companion to admin users', () => {
    const userTown = buildAiCapabilityState({ authenticated: true, groups: ['USER'], mode: 'town_npc' });
    const adminCompanion = buildAiCapabilityState({ authenticated: true, groups: ['ADMIN'], mode: 'companion' });

    expect(userTown.canSendMessage).toBe(false);
    expect(userTown.disabledReason).toContain('特殊 NPC');
    expect(adminCompanion.canSendMessage).toBe(true);
    expect(adminCompanion.canManageMemory).toBe(true);
  });
});
