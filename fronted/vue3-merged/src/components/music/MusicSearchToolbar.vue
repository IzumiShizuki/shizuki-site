<template>
  <section ref="toolbarRoot" class="music-search-toolbar liquid-material">
    <div class="search-row">
      <label class="search-input-wrap">
        <i class="fas fa-search"></i>
        <input
          ref="keywordInputRef"
          :value="keyword"
          type="search"
          placeholder="搜索歌单 / 歌曲 / 歌手"
          @focus="openHistoryPanel"
          @input="handleKeywordInput"
          @keydown.enter.prevent="handleSearch()"
        />
      </label>
      <button class="search-btn ripple-trigger" type="button" :disabled="loading" @click="handleSearch()">
        <i class="fas fa-magnifying-glass"></i>
        {{ loading ? '搜索中...' : '搜索' }}
      </button>
      <button class="refresh-btn ripple-trigger" type="button" :disabled="loading" @click="emit('refresh')">
        <i class="fas fa-rotate-right"></i>
        {{ loading ? '刷新中...' : '刷新' }}
      </button>
    </div>

    <div v-if="showHistoryPanel" class="history-panel liquid-material">
      <div class="history-panel-head">
        <span class="history-title">最近搜索</span>
        <button type="button" class="history-clear-btn ripple-trigger" @click="clearHistory">清空</button>
      </div>
      <div class="history-panel-list">
        <button
          v-for="item in searchHistory"
          :key="`music-search-history-${item}`"
          type="button"
          class="history-chip ripple-trigger"
          @click="applyHistory(item)"
        >
          {{ item }}
        </button>
      </div>
    </div>

    <div v-if="showFilters" class="filters-row">
      <div class="filter-group">
        <button
          v-for="item in typeOptions"
          :key="item.value"
          class="chip-btn ripple-trigger"
          :class="{ active: type === item.value }"
          type="button"
          @click="emit('set-type', item.value)"
        >
          {{ item.label }}
        </button>
      </div>
      <div class="provider-group">
        <button
          v-for="item in providerOptions"
          :key="item.value"
          class="chip-btn provider ripple-trigger"
          :class="{ active: selectedProviderSet.has(item.value) }"
          type="button"
          @click="emit('toggle-provider', item.value)"
        >
          {{ item.label }}
        </button>
      </div>
    </div>

    <p v-if="errorText" class="toolbar-error">{{ errorText }}</p>
  </section>
</template>

<script setup>
import { computed, ref } from 'vue';
import { useDismissiblePopover } from '../../composables/useDismissiblePopover';

const props = defineProps({
  keyword: { type: String, default: '' },
  type: { type: String, default: 'all' },
  loading: { type: Boolean, default: false },
  errorText: { type: String, default: '' },
  showFilters: { type: Boolean, default: true },
  searchHistory: { type: Array, default: () => [] },
  typeOptions: { type: Array, default: () => [] },
  providerOptions: { type: Array, default: () => [] },
  selectedProviders: { type: Array, default: () => [] }
});

const emit = defineEmits([
  'update:keyword',
  'set-type',
  'toggle-provider',
  'search',
  'refresh',
  'apply-history',
  'clear-history'
]);
const toolbarRoot = ref(null);
const keywordInputRef = ref(null);
const historyPanelVisible = ref(false);

const selectedProviderSet = computed(() => {
  const list = Array.isArray(props.selectedProviders) ? props.selectedProviders : [];
  return new Set(list.map((item) => String(item || '').trim().toLowerCase()));
});

const showHistoryPanel = computed(
  () => historyPanelVisible.value && Array.isArray(props.searchHistory) && props.searchHistory.length > 0
);

function handleKeywordInput(event) {
  emit('update:keyword', event?.target?.value || '');
}

function openHistoryPanel() {
  historyPanelVisible.value = true;
}

function handleSearch() {
  historyPanelVisible.value = false;
  emit('search');
}

function applyHistory(keyword) {
  const normalized = String(keyword || '').trim();
  if (!normalized) return;
  emit('update:keyword', normalized);
  emit('apply-history', normalized);
  historyPanelVisible.value = false;
  keywordInputRef.value?.focus?.();
}

function clearHistory() {
  emit('clear-history');
}

useDismissiblePopover({
  rootRef: toolbarRoot,
  enabled: () => showHistoryPanel.value,
  onDismiss: () => {
    historyPanelVisible.value = false;
  }
});
</script>

<style scoped>
.music-search-toolbar {
  --liquid-bg: var(--theme-panel-surface);
  --liquid-border: var(--theme-border-strong);
  --liquid-shadow: var(--theme-shadow-soft, 0 14px 26px rgba(6, 10, 18, 0.15));
  position: sticky;
  top: 0;
  z-index: 20;
  border-radius: 14px;
  padding: 8px;
  display: grid;
  gap: 8px;
}

.search-row {
  position: relative;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto auto;
  gap: 8px;
}

.history-panel {
  --liquid-bg: var(--theme-panel-surface-elevated);
  --liquid-border: var(--theme-border-strong);
  --liquid-shadow: var(--theme-shadow-soft, 0 18px 34px rgba(5, 10, 20, 0.2));
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.history-panel-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.history-title {
  font-size: 12px;
  color: var(--music-soft-text-muted, rgba(233, 225, 216, 0.84));
}

.history-clear-btn {
  min-height: 24px;
  border-radius: 8px;
  border: 1px solid var(--music-soft-border, rgba(255, 255, 255, 0.16));
  background: var(--music-soft-fill, linear-gradient(145deg, rgba(255, 255, 255, 0.11), rgba(255, 255, 255, 0.04)));
  color: var(--music-soft-text, rgba(248, 244, 239, 0.96));
  padding: 0 8px;
  font-size: 12px;
}

.history-panel-list {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.history-chip {
  min-height: 28px;
  border-radius: 999px;
  border: 1px solid var(--music-soft-border, rgba(255, 255, 255, 0.16));
  background: var(--music-soft-fill, linear-gradient(145deg, rgba(255, 255, 255, 0.11), rgba(255, 255, 255, 0.04)));
  color: var(--music-soft-text, rgba(248, 244, 239, 0.96));
  padding: 0 10px;
  font-size: 12px;
}

.search-input-wrap {
  min-height: var(--music-toolbar-height, 36px);
  height: var(--music-toolbar-height, 36px);
  background: transparent;
  border: none;
  box-shadow: none;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  align-items: center;
  gap: 8px;
  padding: 0 10px;
  color: var(--music-soft-text-muted, rgba(233, 225, 216, 0.84));
}

.search-input-wrap i {
  font-size: 12px;
}

.search-input-wrap input {
  width: 100%;
  border: 0;
  outline: none;
  background: transparent;
  box-shadow: none;
  color: var(--music-soft-text, rgba(248, 244, 239, 0.96));
  font-size: 13px;
}

.search-input-wrap input::placeholder {
  color: var(--music-soft-text-dim, rgba(214, 203, 192, 0.74));
}

.search-btn,
.refresh-btn {
  min-height: var(--music-toolbar-height, 36px);
  height: var(--music-toolbar-height, 36px);
  border-radius: 12px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  transition: all 0.24s cubic-bezier(0.22, 1, 0.36, 1);
  box-shadow: 0 4px 12px rgba(6, 10, 18, 0.1);
}

.search-btn {
  border: 1px solid var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.72));
  background: var(--accent-mode-fill-strong, linear-gradient(145deg, rgba(var(--accent-strong-rgb), 0.94), rgba(var(--accent-rgb), 0.84)));
  color: var(--music-accent-text, var(--accent-mode-text));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
}

.search-btn:hover {
  transform: translateY(-2px);
  background: var(--accent-mode-fill-hover, var(--accent-mode-fill-strong));
  box-shadow:
    var(--accent-mode-shadow, 0 10px 24px rgba(var(--accent-rgb), 0.32)),
    0 0 22px rgba(var(--accent-rgb), 0.18);
}

.search-btn:active {
  transform: translateY(0) scale(0.96);
}

.refresh-btn {
  border: 1px solid var(--music-soft-border-strong, rgba(255, 255, 255, 0.26));
  background: var(--music-soft-fill, linear-gradient(145deg, rgba(255, 255, 255, 0.11), rgba(255, 255, 255, 0.04)));
  color: var(--music-soft-text, rgba(248, 244, 239, 0.96));
}

.refresh-btn:hover {
  transform: scale(1.05);
  background: var(--music-soft-fill-hover, linear-gradient(145deg, rgba(255, 255, 255, 0.18), rgba(255, 255, 255, 0.08)));
  border-color: var(--music-soft-border-strong, rgba(255, 255, 255, 0.26));
}

.refresh-btn:active {
  transform: scale(0.96);
}

.filters-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
  align-items: center;
}

.filter-group,
.provider-group {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.provider-group {
  justify-content: flex-end;
}

.chip-btn {
  min-height: 30px;
  border-radius: 999px;
  border: 1px solid var(--music-soft-border, rgba(255, 255, 255, 0.16));
  background: var(--music-soft-fill, linear-gradient(145deg, rgba(255, 255, 255, 0.11), rgba(255, 255, 255, 0.04)));
  color: var(--music-soft-text, rgba(248, 244, 239, 0.96));
  padding: 0 12px;
  font-size: 12px;
  transition: all 0.2s ease;
}

.chip-btn:hover {
  background: var(--music-soft-fill-hover, linear-gradient(145deg, rgba(255, 255, 255, 0.18), rgba(255, 255, 255, 0.08)));
  border-color: var(--music-soft-border-strong, rgba(255, 255, 255, 0.26));
}

.chip-btn:active {
  transform: scale(0.95);
}

.chip-btn.active {
  border-color: var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.72));
  background: var(--music-active-fill, linear-gradient(145deg, rgba(var(--accent-soft-rgb), 0.42), rgba(var(--accent-rgb), 0.32)));
  color: var(--music-accent-text, var(--accent-mode-text));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
}

.toolbar-error {
  margin: 0;
  font-size: 12px;
  color: rgba(255, 136, 166, 0.98);
}

@media (max-width: 900px) {
  .search-row {
    grid-template-columns: 1fr;
  }

  .history-panel-head {
    flex-wrap: wrap;
  }

  .filters-row {
    grid-template-columns: 1fr;
  }

  .provider-group {
    justify-content: flex-start;
  }

  .refresh-btn {
    justify-content: center;
  }
}
</style>
