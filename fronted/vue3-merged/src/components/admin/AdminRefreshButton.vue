<template>
  <button
    class="ghost-btn ripple-trigger admin-refresh-btn"
    :class="{ 'is-busy': busy }"
    type="button"
    :disabled="busy || disabled"
    :aria-busy="busy ? 'true' : 'false'"
    @click="$emit('click')"
  >
    <i class="fas fa-arrows-rotate" aria-hidden="true"></i>
    <span><slot>刷新</slot></span>
  </button>
</template>

<script setup>
// 统一的刷新按钮：加载中仅旋转图标、禁用点击，文案保持不变，
// 避免旧版「刷新 → 刷新中...」的文字跳动。样式见 styles/admin-console.css。
defineProps({
  busy: {
    type: Boolean,
    default: false
  },
  disabled: {
    type: Boolean,
    default: false
  }
});

defineEmits(['click']);
</script>
