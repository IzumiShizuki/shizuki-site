<template>
  <div class="track-collect" @click.stop>
    <button class="track-action-btn collect-trigger ripple-trigger" type="button" :title="buttonTitle" @click.stop="handleClick">
      <i class="fas fa-folder-plus"></i>
    </button>
  </div>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  track: { type: Object, default: null },
  canCollect: { type: Boolean, default: false }
});

const emit = defineEmits(['open', 'require-login']);

const buttonTitle = computed(() => {
  if (!props.canCollect) return '登录后可收藏';
  return '收藏到歌单';
});

function handleClick() {
  if (!props.canCollect) {
    emit('require-login', props.track || null);
    return;
  }
  emit('open', props.track || null);
}
</script>

<style scoped>
.track-collect {
  position: relative;
}

.track-action-btn {
  width: 30px;
  height: 30px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(231, 238, 252, 0.9);
}

</style>
