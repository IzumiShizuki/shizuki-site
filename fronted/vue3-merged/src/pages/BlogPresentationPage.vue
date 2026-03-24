<template>
  <BlogPresentationWorkspace
    :post-id="postId"
    :scope="scope"
    show-back-button
    @back="goBack"
  />
</template>

<script setup>
import { computed } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import BlogPresentationWorkspace from '../components/blog/BlogPresentationWorkspace.vue';

const route = useRoute();
const router = useRouter();

const postId = computed(() => {
  const value = Number(route.params.postId);
  return Number.isFinite(value) && value > 0 ? Math.trunc(value) : 0;
});

const scope = computed(() => (String(route.query.scope || '').toLowerCase() === 'mine' ? 'mine' : 'public'));

function goBack() {
  if (postId.value > 0) {
    router.push({ name: 'blog-detail', params: { postId: postId.value } });
    return;
  }
  router.push({ name: 'blog' });
}
</script>
