<template>
  <Teleport v-if="teleportReady && isActive" :to="portalTarget">
    <div class="lightapp-header-portal" @pointerdown.stop>
      <slot />
    </div>
  </Teleport>
</template>

<script setup>
import { computed, nextTick, onMounted, onUpdated, ref, watch, onActivated, onDeactivated } from 'vue';
import { resolveLightAppHeaderPortalSelector } from './lightAppShellStore';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const portalTarget = computed(() => resolveLightAppHeaderPortalSelector(props.windowId));
const teleportReady = ref(false);
const isActive = ref(true);

onActivated(() => {
  isActive.value = true;
});

onDeactivated(() => {
  isActive.value = false;
});

function syncTeleportReady() {
  const selector = portalTarget.value;
  if (!selector || typeof document === 'undefined') {
    teleportReady.value = false;
    return;
  }
  teleportReady.value = Boolean(document.querySelector(selector));
}

watch(
  portalTarget,
  async () => {
    teleportReady.value = false;
    await nextTick();
    syncTeleportReady();
  },
  { immediate: true }
);

onMounted(() => {
  syncTeleportReady();
});

onUpdated(() => {
  if (!teleportReady.value) {
    syncTeleportReady();
  }
});
</script>

<style scoped>
.lightapp-header-portal {
  display: flex;
  align-items: center;
  justify-content: flex-start;
  gap: 6px;
  width: 100%;
  max-width: 100%;
  min-width: 0;
  overflow-x: auto;
  overflow-y: hidden;
  padding-left: 0;
  pointer-events: auto;
  position: relative;
  z-index: 1;
  scrollbar-width: thin;
}

.lightapp-header-portal::-webkit-scrollbar {
  height: 4px;
}

.lightapp-header-portal::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(118, 130, 156, 0.44);
}
</style>
