<script setup lang="ts">
import { onMounted, onUnmounted } from 'vue';
import { ScrollReveal } from '../utils/enhanced-interactions';

let scrollReveal: ScrollReveal | null = null;

onMounted(() => {
  // 初始化滚动显示动画
  scrollReveal = new ScrollReveal({
    threshold: 0.1,
    rootMargin: '0px 0px -100px 0px'
  });

  // 为所有带有.scroll-reveal类的元素添加动画
  scrollReveal.observeAll('.scroll-reveal');

  // 监听动态添加的元素
  const observer = new MutationObserver(() => {
    if (scrollReveal) {
      scrollReveal.observeAll('.scroll-reveal');
    }
  });

  observer.observe(document.body, {
    childList: true,
    subtree: true
  });
});

onUnmounted(() => {
  if (scrollReveal) {
    scrollReveal.destroy();
  }
});
</script>

<template>
  <!-- 这是一个无渲染组件，只负责管理滚动动画 -->
</template>
