<template>
  <div class="blog-layout blog-layout--reader" data-blog-workspace="reader" data-scroll-owner="app">
    <SubtleScrollArea tag="aside" class="left-panel liquid-material" :scrollable="false">
      <slot name="navigation" />
    </SubtleScrollArea>

    <section class="center-panel liquid-material">
      <slot />
    </section>

    <aside class="right-panel liquid-material">
      <slot name="auxiliary" />
    </aside>
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
  height: auto;
  min-height: 0;
  align-self: start;
}

.left-panel,
.right-panel {
  position: sticky;
  top: 0;
  max-height: none;
  overflow: visible;
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
  overflow: visible;
  container: blog-center / inline-size;
}

.right-panel {
  min-width: 0;
  padding: var(--blog-panel-padding);
}

@media (max-width: 980px) {
  .left-panel,
  .right-panel {
    position: static;
    max-height: none;
  }

  .left-panel {
    max-height: 280px;
  }
}
</style>
