export const AI_CHAT_OPEN_EVENT = 'shizuki:ai-chat-open';

function normalizePreferredMode(raw) {
  const normalized = String(raw || '').trim().toLowerCase();
  if (normalized === 'normal' || normalized === 'tavern') return normalized;
  return 'quick_chat';
}

export function openAiChat(input = 'unknown') {
  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') return;

  const detail =
    input && typeof input === 'object'
      ? {
          source: String(input.source || '').trim() || 'unknown',
          preferredMode: normalizePreferredMode(input.preferredMode || input.mode)
        }
      : {
          source: String(input || '').trim() || 'unknown',
          preferredMode: 'quick_chat'
        };

  window.dispatchEvent(
    new CustomEvent(AI_CHAT_OPEN_EVENT, {
      detail
    })
  );
}
