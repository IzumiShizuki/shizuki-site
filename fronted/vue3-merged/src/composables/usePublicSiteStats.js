import { onMounted, onScopeDispose, reactive, ref } from 'vue';
import { getPostSidebar, listPosts } from '../services/blogApi';

function readCount(value) {
  if ((typeof value !== 'number' && typeof value !== 'string') || String(value).trim() === '') return null;
  const number = Number(value);
  return Number.isSafeInteger(number) && number >= 0 ? number : null;
}

function countCatalog(items, camelKey, snakeKey) {
  if (!Array.isArray(items)) return null;
  const codes = items.map((item) => String(item?.[camelKey] ?? item?.[snakeKey] ?? '').trim());
  if (codes.some((code) => !code)) return null;
  return new Set(codes).size;
}

export function usePublicSiteStats() {
  const stats = reactive({ posts: null, categories: null, tags: null });
  const loading = ref(false);
  const error = ref('');
  let disposed = false;
  onScopeDispose(() => { disposed = true; });

  async function refresh() {
    if (loading.value || disposed) return;
    loading.value = true;
    error.value = '';
    const failures = new Set();
    function assign(key, value) {
      if (disposed) return;
      if (value === null) failures.add(key);
      else stats[key] = value;
    }
    // Anonymous requests keep the overview independent of the viewer's privileges.
    await Promise.all([
      (async () => {
        try {
          const payload = await listPosts({ pageNo: 1, pageSize: 1 });
          assign('posts', readCount(payload?.total));
        } catch {
          failures.add('posts');
        }
      })(),
      (async () => {
        try {
          const payload = await getPostSidebar();
          assign('categories', countCatalog(payload?.categories, 'categoryCode', 'category_code'));
          assign('tags', countCatalog(payload?.tags, 'tagCode', 'tag_code'));
        } catch {
          failures.add('categories');
          failures.add('tags');
        }
      })()
    ]);
    if (disposed) return;
    error.value = failures.size ? '部分统计暂时无法加载，已保留可用数据。' : '';
    loading.value = false;
  }

  onMounted(refresh);
  return { stats, loading, error, refresh };
}
