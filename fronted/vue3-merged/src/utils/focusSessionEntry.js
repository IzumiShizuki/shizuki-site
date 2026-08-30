export function applyFocusSessionEntryUiState({ menuExpanded, aiChatActive } = {}) {
  if (menuExpanded && typeof menuExpanded === 'object') {
    menuExpanded.value = false;
  }
  if (aiChatActive && typeof aiChatActive === 'object') {
    aiChatActive.value = false;
  }
}
