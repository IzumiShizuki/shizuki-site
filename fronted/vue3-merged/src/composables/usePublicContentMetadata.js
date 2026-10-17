import { onScopeDispose, toValue, watch } from 'vue';
import { applyPublicContentMetadata } from '../utils/publicContentMetadata';

export function usePublicContentMetadata(source) {
  let restore = () => {};
  const stop = watch(() => toValue(source), (content) => {
    restore();
    restore = content ? applyPublicContentMetadata(content) : () => {};
  }, { immediate: true, deep: true, flush: 'post' });
  onScopeDispose(() => { stop(); restore(); });
}
