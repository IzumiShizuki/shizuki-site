<template>
  <component
    :is="tag"
    ref="rootRef"
    class="subtle-scroll-area"
    :class="[axisClass, { 'overscroll-contained': containOverscroll, 'scroll-disabled': !scrollable }]"
  >
    <slot></slot>
  </component>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useAppScrollRoot } from '../composables/useAppScrollRoot';

const props = defineProps({
  tag: {
    type: String,
    default: 'div'
  },
  axis: {
    type: String,
    default: 'y',
    validator: (value) => ['y', 'x', 'both'].includes(value)
  },
  containOverscroll: {
    type: Boolean,
    default: true
  },
  scrollable: {
    type: Boolean,
    default: true
  },
  appScrollOwner: {
    type: Boolean,
    default: false
  },
  appScrollOwnerMedia: {
    type: String,
    default: '(min-width: 901px) and (orientation: landscape)'
  }
});

const rootRef = ref(null);
const appScrollRoot = useAppScrollRoot();
const mediaMatches = ref(false);
let ownerMediaQuery = null;
let releaseScrollOwner = null;

const axisClass = computed(() => {
  if (props.axis === 'x') return 'axis-x';
  if (props.axis === 'both') return 'axis-both';
  return 'axis-y';
});

function getElement() {
  return rootRef.value;
}

function releaseOwner() {
  releaseScrollOwner?.();
  releaseScrollOwner = null;
}

function syncOwner() {
  releaseOwner();
  if (!props.appScrollOwner || !props.scrollable || !mediaMatches.value || !rootRef.value) return;
  releaseScrollOwner = appScrollRoot.claimScrollOwner(rootRef.value);
}

function updateMediaMatch(event) {
  mediaMatches.value = Boolean(event?.matches ?? ownerMediaQuery?.matches);
}

onMounted(() => {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') {
    mediaMatches.value = true;
  } else {
    ownerMediaQuery = window.matchMedia(props.appScrollOwnerMedia);
    mediaMatches.value = ownerMediaQuery.matches;
    ownerMediaQuery.addEventListener?.('change', updateMediaMatch);
  }
  syncOwner();
});

watch(
  () => [props.appScrollOwner, props.scrollable, mediaMatches.value, rootRef.value],
  syncOwner,
  { flush: 'post' }
);

onBeforeUnmount(() => {
  ownerMediaQuery?.removeEventListener?.('change', updateMediaMatch);
  releaseOwner();
});

defineExpose({
  el: rootRef,
  getElement
});
</script>

<style scoped>
.subtle-scroll-area {
  min-height: 0;
  scrollbar-width: thin;
  scrollbar-color: rgba(104, 113, 130, 0.34) rgba(8, 12, 20, 0.02);
}

.axis-y {
  overflow-y: auto;
  overflow-x: hidden;
}

.axis-x {
  overflow-x: auto;
  overflow-y: hidden;
}

.axis-both {
  overflow: auto;
}

.overscroll-contained {
  overscroll-behavior: contain;
}

.subtle-scroll-area.scroll-disabled {
  overflow: visible;
  overscroll-behavior: auto;
}

.subtle-scroll-area::-webkit-scrollbar {
  width: 6px;
  height: 6px;
}

.subtle-scroll-area::-webkit-scrollbar-track {
  background: rgba(8, 12, 20, 0.03);
  border-radius: 999px;
}

.subtle-scroll-area::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(104, 113, 130, 0.3);
  border: 1px solid transparent;
  background-clip: content-box;
}

.subtle-scroll-area::-webkit-scrollbar-thumb:hover {
  background: rgba(124, 135, 157, 0.42);
  background-clip: content-box;
}

.subtle-scroll-area::-webkit-scrollbar-corner {
  background: transparent;
}
</style>
