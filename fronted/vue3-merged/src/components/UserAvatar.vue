<template>
  <img :src="resolvedSource" :alt="alt" @error="failed = true" />
</template>

<script setup>
import { computed, ref, watch } from 'vue';
import defaultAvatar from '../assets/default-user-avatar.svg';

const props = defineProps({
  src: { type: String, default: '' },
  alt: { type: String, default: '用户头像' }
});
const failed = ref(false);
const resolvedSource = computed(() => (!failed.value && String(props.src || '').trim()) || defaultAvatar);
watch(() => props.src, () => { failed.value = false; });
</script>
