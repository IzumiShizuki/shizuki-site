<template>
  <span class="protected-image" :class="{ 'protected-image--loading': loading }">
    <img v-if="objectUrl" :src="objectUrl" :alt="alt" />
    <i v-else class="far fa-image" aria-hidden="true"></i>
  </span>
</template>

<script setup>
import { onBeforeUnmount, ref, watch } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';

const props = defineProps({
  route: { type: String, default: '' },
  alt: { type: String, default: '' }
});

const auth = useAuthSession();
const objectUrl = ref('');
const loading = ref(false);
let generation = 0;

function revoke() {
  if (!objectUrl.value) return;
  URL.revokeObjectURL(objectUrl.value);
  objectUrl.value = '';
}

async function load(route) {
  const current = ++generation;
  revoke();
  if (!route) return;
  loading.value = true;
  try {
    const response = await auth.authorizedRawFetch(route, { headers: { Accept: 'image/*' } });
    if (!response?.ok) throw new Error(`preview failed (${response?.status || 0})`);
    const blob = await response.blob();
    if (current !== generation) return;
    objectUrl.value = URL.createObjectURL(blob);
  } catch {
    if (current === generation) objectUrl.value = '';
  } finally {
    if (current === generation) loading.value = false;
  }
}

watch(() => props.route, load, { immediate: true });
onBeforeUnmount(() => {
  generation += 1;
  revoke();
});
</script>

<style scoped>
.protected-image {
  position: relative;
  display: grid;
  place-items: center;
  width: 100%;
  height: 100%;
  min-height: 96px;
  overflow: hidden;
  color: var(--theme-text-tertiary, var(--theme-text-secondary));
  background: rgba(var(--accent-rgb), 0.08);
}

.protected-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.protected-image--loading::after {
  position: absolute;
  inset: 0;
  content: '';
  background: linear-gradient(100deg, transparent 20%, rgba(255, 255, 255, 0.16) 45%, transparent 70%);
  animation: protected-media-shimmer 1.25s infinite linear;
}

@keyframes protected-media-shimmer {
  from { transform: translateX(-100%); }
  to { transform: translateX(100%); }
}

@media (prefers-reduced-motion: reduce) {
  .protected-image--loading::after { animation: none; }
}
</style>
