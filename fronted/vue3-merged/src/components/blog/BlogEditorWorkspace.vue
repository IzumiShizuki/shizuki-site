<template>
  <div class="blog-layout blog-layout--editor" data-blog-workspace="editor" data-scroll-owner="workspace">
    <SubtleScrollArea tag="aside" class="left-panel liquid-material" :scrollable="true">
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

defineOptions({ name: 'BlogEditorWorkspace' });
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
  overflow: hidden;
}

@media (max-width: 980px) {
  .left-panel {
    max-height: 280px;
  }
}
</style>
