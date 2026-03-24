<template>
  <section class="lightapp-window blog-slidev-window">
    <BlogPresentationWorkspace
      v-model:post-id="activePostId"
      v-model:scope="activeScope"
      embedded
      show-post-library
      allow-generate
    />
  </section>
</template>

<script setup>
import { computed } from 'vue';
import BlogPresentationWorkspace from '../../blog/BlogPresentationWorkspace.vue';
import {
  normalizeBlogPresentationPostId,
  normalizeBlogPresentationScope,
  resolveBlogPresentationWindowState
} from './blogPresentationWindowState';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const presentationState = resolveBlogPresentationWindowState(props.windowId);

const activePostId = computed({
  get() {
    return normalizeBlogPresentationPostId(presentationState.postId);
  },
  set(value) {
    presentationState.postId = normalizeBlogPresentationPostId(value);
  }
});

const activeScope = computed({
  get() {
    return normalizeBlogPresentationScope(presentationState.scope, true);
  },
  set(value) {
    presentationState.scope = normalizeBlogPresentationScope(value, true);
  }
});
</script>

<style scoped>
.blog-slidev-window {
  height: 100%;
  min-height: 0;
}
</style>
