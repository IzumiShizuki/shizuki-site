import { computed, ref } from 'vue';

// Merge server updates field by field so unrelated photo operations keep local text.
export function useStudioDraft(form) {
  const baseline = ref(JSON.stringify(form));
  const dirty = computed(() => JSON.stringify(form) !== baseline.value);

  function apply(next, preserve = false) {
    const previous = JSON.parse(baseline.value);
    const merged = { ...next };
    if (preserve) {
      for (const key of Object.keys(next)) {
        if (JSON.stringify(form[key]) !== JSON.stringify(previous[key])) merged[key] = form[key];
      }
    }
    baseline.value = JSON.stringify(next);
    Object.assign(form, merged);
  }

  return { dirty, apply };
}
