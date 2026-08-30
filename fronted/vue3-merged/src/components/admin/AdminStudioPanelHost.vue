<template>
  <section class="admin-studio-panel-host" :data-active-studio-tab="activeTab">
    <Suspense>
      <component :is="activeComponent" v-if="activeComponent" />
      <template #fallback>
        <p class="admin-studio-panel-host__loading" role="status">正在按需加载工作区...</p>
      </template>
    </Suspense>
  </section>
</template>

<script setup>
import { computed, defineAsyncComponent } from 'vue';
import { AdminTabKey } from '../../pages/adminUiState';

const props = defineProps({
  activeTab: { type: String, required: true }
});

const components = Object.freeze({
  [AdminTabKey.ALBUMS]: defineAsyncComponent(() => import('./AdminAlbumsWorkspace.vue')),
  [AdminTabKey.MOMENTS]: defineAsyncComponent(() => import('./AdminMomentsWorkspace.vue')),
  [AdminTabKey.RECYCLE_BIN]: defineAsyncComponent(() => import('./AdminRecycleBinWorkspace.vue')),
  [AdminTabKey.DAILY_QUOTES]: defineAsyncComponent(() => import('./AdminDailyQuotesPanel.vue')),
  [AdminTabKey.SITE_WIDGETS]: defineAsyncComponent(() => import('./AdminSiteWidgetsPanel.vue'))
});

const activeComponent = computed(() => components[props.activeTab] || null);
</script>

<style scoped>
.admin-studio-panel-host {
  min-height: 100%;
}

.admin-studio-panel-host__loading {
  margin: 0;
  padding: 24px;
  color: var(--theme-text-secondary);
}
</style>
