import { createKugouAdapter } from './kugou.mjs';
import { createQqMusicAdapter } from './qqmusic.mjs';

const adapters = new Map();

export function resolveProviderAdapter(provider) {
  const normalizedProvider = String(provider || '').trim().toLowerCase();
  if (adapters.has(normalizedProvider)) {
    return adapters.get(normalizedProvider);
  }
  let adapter;
  switch (normalizedProvider) {
    case 'qqmusic':
      adapter = createQqMusicAdapter();
      break;
    case 'kugou':
      adapter = createKugouAdapter();
      break;
    default:
      throw new Error(`Unsupported provider: ${provider}`);
  }
  adapters.set(normalizedProvider, adapter);
  return adapter;
}
