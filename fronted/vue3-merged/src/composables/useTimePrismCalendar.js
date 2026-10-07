import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useAuthSession } from './useAuthSession';
import { listLightAppProjects, listLightAppSchedules, listLightAppTasks, listLightAppTodos } from '../services/lightAppsApi';
import {
  createEmptyLightAppDataStore, isLightAppDataStorageKey, LIGHT_APP_DATA_CHANGED_EVENT,
  readGuestLightAppData, readLightAppCalendarCache, writeLightAppCalendarCache
} from '../utils/lightAppsDataStore';
import { buildTimePrismCalendarEntries } from '../components/lightapps/timeprism/timePrismCalendarEntries';

export function useTimePrismCalendar() {
  const auth = useAuthSession();
  const ready = ref(false);
  const data = ref(createEmptyLightAppDataStore());
  const loading = ref(false);
  const error = ref('');
  const now = ref(new Date());
  const scope = computed(() => !ready.value ? '' : auth.isAuthenticated.value && auth.user?.value?.userId
    ? String(auth.user.value.userId) : 'guest');
  let sequence = 0;
  let disposed = false;
  let timer;

  async function refresh() {
    if (!ready.value && !disposed) {
      try {
        await auth.ensureReady();
        if (!disposed) ready.value = true;
      } catch {
        error.value = '个人日历暂时无法读取，请刷新重试。';
      }
      return;
    }
    const owner = scope.value;
    if (!owner || disposed) return;
    const request = ++sequence;
    now.value = new Date();
    error.value = '';
    if (owner === 'guest') {
      data.value = readGuestLightAppData();
      loading.value = false;
      return;
    }
    loading.value = true;
    const authorizedFetch = (path, options) => auth.authorizedFetch(path, options, { expectedUserId: owner });
    try {
      const [projects, todos, tasks, schedules] = await Promise.all([
        listLightAppProjects(authorizedFetch), listLightAppTodos(authorizedFetch),
        listLightAppTasks(authorizedFetch), listLightAppSchedules(authorizedFetch)
      ]);
      if (disposed || request !== sequence || scope.value !== owner) return;
      data.value = { projects, todos, tasks, schedules };
      writeLightAppCalendarCache(owner, data.value);
    } catch {
      if (disposed || request !== sequence || scope.value !== owner) return;
      data.value = readLightAppCalendarCache(owner);
      error.value = '个人日历暂时无法同步，正在显示此账号的缓存。';
    } finally {
      if (request === sequence) loading.value = false;
    }
  }

  watch(scope, () => {
    sequence += 1;
    data.value = createEmptyLightAppDataStore();
    error.value = '';
    loading.value = false;
    void refresh();
  }, { flush: 'sync' });

  function onDataChanged(event) {
    if (!isLightAppDataStorageKey(event?.detail?.key ?? event?.key ?? null)) return;
    void refresh();
  }
  function onVisible() {
    if (document.visibilityState === 'visible' && !loading.value) void refresh();
  }
  onMounted(async () => {
    window.addEventListener(LIGHT_APP_DATA_CHANGED_EVENT, onDataChanged);
    window.addEventListener('storage', onDataChanged);
    window.addEventListener('focus', onVisible);
    document.addEventListener('visibilitychange', onVisible);
    timer = window.setInterval(onVisible, 60000);
    try {
      await auth.ensureReady();
      if (!disposed) ready.value = true;
    } catch {
      if (!disposed) error.value = '个人日历暂时无法读取，请刷新重试。';
    }
  });
  onBeforeUnmount(() => {
    disposed = true;
    sequence += 1;
    window.clearInterval(timer);
    window.removeEventListener(LIGHT_APP_DATA_CHANGED_EVENT, onDataChanged);
    window.removeEventListener('storage', onDataChanged);
    window.removeEventListener('focus', onVisible);
    document.removeEventListener('visibilitychange', onVisible);
  });
  return { entries: computed(() => buildTimePrismCalendarEntries(data.value)), loading, error, now, refresh };
}
