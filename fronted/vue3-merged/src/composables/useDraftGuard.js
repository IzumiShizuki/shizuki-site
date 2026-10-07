import { onBeforeUnmount, onMounted } from 'vue';
import { onBeforeRouteLeave, onBeforeRouteUpdate } from 'vue-router';

// Each editor owns its draft; the guard only coordinates replacing or leaving it.
export function useDraftGuard({ isDirty, isBusy = () => false, shouldGuardUpdate = () => true, message = '有未保存的修改，确定放弃这些修改吗？' }) {
  function confirmDiscard() {
    if (isBusy()) return false;
    return !isDirty() || window.confirm(message);
  }

  function beforeUnload(event) {
    if (!isDirty() && !isBusy()) return;
    event.preventDefault();
    event.returnValue = '';
  }

  onBeforeRouteLeave(confirmDiscard);
  onBeforeRouteUpdate((to, from) => to.fullPath === from.fullPath || !shouldGuardUpdate(to, from) || confirmDiscard());
  onMounted(() => window.addEventListener('beforeunload', beforeUnload));
  onBeforeUnmount(() => window.removeEventListener('beforeunload', beforeUnload));
  return { confirmDiscard };
}
