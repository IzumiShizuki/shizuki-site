<template>
  <div class="blog-layout blog-layout--reader" data-blog-workspace="reader" data-scroll-owner="center">
    <SubtleScrollArea tag="aside" class="left-panel liquid-material" aria-label="博客导航">
      <slot name="navigation" />
    </SubtleScrollArea>

    <section class="center-panel liquid-material">
      <slot />
    </section>

    <SubtleScrollArea tag="aside" class="right-panel liquid-material" aria-label="博客上下文">
      <slot name="auxiliary" />
    </SubtleScrollArea>
  </div>
</template>

<script setup>
import SubtleScrollArea from '../SubtleScrollArea.vue';

defineOptions({ name: 'BlogReaderWorkspace' });
</script>

<style scoped>
.blog-layout {
  min-width: 0;
}

.left-panel,
.center-panel,
.right-panel {
  height: 100%;
  min-height: 0;
  align-self: stretch;
}

.left-panel,
.right-panel {
  max-height: 100%;
}

.left-panel {
  padding: var(--blog-panel-padding);
  display: grid;
  grid-auto-rows: max-content;
  gap: 12px;
  align-content: start;
  min-width: 0;
}

.center-panel {
  min-width: 0;
  overflow: hidden;
  container: blog-center / inline-size;
}

.right-panel {
  min-width: 0;
  padding: var(--blog-panel-padding);
}

@media (max-width: 980px) {
  .left-panel,
  .right-panel {
    height: auto;
    max-height: none;
    overflow: visible !important;
  }
}
</style>
