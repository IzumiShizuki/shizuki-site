const VISUALIZER_MODES = new Set(['bars', 'ring']);

function resolvePageUrl(pageUrl) {
  const explicitUrl = String(pageUrl || '').trim();
  if (explicitUrl) return explicitUrl;
  if (typeof window !== 'undefined') return String(window.location?.href || '').trim();
  return '';
}

export function canAttachMediaElementAudioGraph(audioElement, pageUrl) {
  const sources = [audioElement?.currentSrc, audioElement?.src]
    .map((source) => String(source || '').trim())
    .filter((source, index, list) => source && list.indexOf(source) === index);
  if (!sources.length) return false;

  const baseUrl = resolvePageUrl(pageUrl);
  return sources.every((source) => {
    try {
      const mediaUrl = new URL(source, baseUrl || undefined);
      if (mediaUrl.protocol === 'blob:' || mediaUrl.protocol === 'data:') return true;
      if (!baseUrl || (mediaUrl.protocol !== 'http:' && mediaUrl.protocol !== 'https:')) return false;
      return mediaUrl.origin === new URL(baseUrl).origin;
    } catch {
      return false;
    }
  });
}

export function shouldPrepareVisualizerAudioGraph({
  audioElement,
  isHomeRoute = false,
  isPlaying = false,
  pageUrl,
  visualizerMode
} = {}) {
  if (!VISUALIZER_MODES.has(String(visualizerMode || '').trim())) return false;
  if (!isHomeRoute && !isPlaying) return false;
  return canAttachMediaElementAudioGraph(audioElement, pageUrl);
}
