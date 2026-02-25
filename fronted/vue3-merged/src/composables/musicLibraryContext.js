import { inject } from 'vue';

export const MUSIC_LIBRARY_CONTEXT_KEY = Symbol('shizuki.musicLibraryContext');

export function useMusicLibraryContext() {
  const context = inject(MUSIC_LIBRARY_CONTEXT_KEY, null);
  if (!context) {
    throw new Error('Music library context is not provided in current route.');
  }
  return context;
}
