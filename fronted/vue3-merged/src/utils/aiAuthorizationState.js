export function hasAdminGroup(groups) {
  const list = Array.isArray(groups) ? groups : [];
  return list.some((groupCode) => String(groupCode || '').trim().toUpperCase() === 'ADMIN');
}

export function buildAiCapabilityState({ authenticated, groups, mode }) {
  const isAuthenticated = Boolean(authenticated);
  const isAdmin = hasAdminGroup(groups);
  const normalizedMode = String(mode || 'quick_chat').trim().toLowerCase() || 'quick_chat';

  if (!isAuthenticated) {
    return {
      isAdmin,
      canSendMessage: false,
      canManageTownAssets: false,
      canManageMemory: false,
      disabledReason: '游客配额为 0，登录后才能发言。'
    };
  }

  if (normalizedMode === 'town_npc') {
    return {
      isAdmin,
      canSendMessage: isAdmin,
      canManageTownAssets: isAdmin,
      canManageMemory: isAdmin,
      disabledReason: isAdmin ? '' : 'AI 小镇特殊 NPC 仅对 ADMIN 开放。'
    };
  }

  if (normalizedMode === 'companion') {
    return {
      isAdmin,
      canSendMessage: isAdmin,
      canManageTownAssets: isAdmin,
      canManageMemory: isAdmin,
      disabledReason: isAdmin ? '' : '自宅 companion 仅对 ADMIN 开放。'
    };
  }

  return {
    isAdmin,
    canSendMessage: true,
    canManageTownAssets: isAdmin,
    canManageMemory: isAdmin,
    disabledReason: ''
  };
}
