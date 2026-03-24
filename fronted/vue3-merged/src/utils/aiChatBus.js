export const AI_CHAT_OPEN_EVENT = 'shizuki:ai-chat-open';

export function openAiChat(source = 'unknown') {
  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') return;

  window.dispatchEvent(
    new CustomEvent(AI_CHAT_OPEN_EVENT, {
      detail: {
        source: String(source || '').trim() || 'unknown'
      }
    })
  );
}
