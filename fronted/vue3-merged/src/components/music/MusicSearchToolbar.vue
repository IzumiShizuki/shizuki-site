<template>
  <section class="music-search-toolbar liquid-material">
    <div class="search-row">
      <label class="search-input-wrap">
        <i class="fas fa-search"></i>
        <input
          :value="keyword"
          type="search"
          placeholder="搜索歌单 / 歌曲 / 歌手"
          @input="emit('update:keyword', $event.target.value)"
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

    <div v-if="searchHistory.length" class="history-row">
      <div class="history-row-head">
        <span class="history-title">最近搜索</span>
        <button type="button" class="history-clear-btn ripple-trigger" @click="clearHistory">清空</button>
      </div>
      <div class="history-list">
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
import { computed, onMounted, ref } from 'vue';
import { clearSearchHistory, readSearchHistory, recordSearchHistory } from '../../utils/searchHistory';

const MUSIC_SEARCH_HISTORY_KEY = 'music_search_history_v1';
const MUSIC_SEARCH_HISTORY_LIMIT = 10;

const props = defineProps({
  keyword: { type: String, default: '' },
  type: { type: String, default: 'all' },
  loading: { type: Boolean, default: false },
  errorText: { type: String, default: '' },
  showFilters: { type: Boolean, default: true },
  typeOptions: { type: Array, default: () => [] },
  providerOptions: { type: Array, default: () => [] },
  selectedProviders: { type: Array, default: () => [] }
});

const emit = defineEmits(['update:keyword', 'set-type', 'toggle-provider', 'search', 'refresh']);
const searchHistory = ref([]);

const selectedProviderSet = computed(() => {
  const list = Array.isArray(props.selectedProviders) ? props.selectedProviders : [];
  return new Set(list.map((item) => String(item || '').trim().toLowerCase()));
});

function handleSearch(keywordOverride = props.keyword) {
  const keyword = String(keywordOverride || '').trim();
  if (keyword) {
    searchHistory.value = recordSearchHistory(MUSIC_SEARCH_HISTORY_KEY, keyword, undefined, MUSIC_SEARCH_HISTORY_LIMIT);
    if (keyword !== props.keyword) {
      emit('update:keyword', keyword);
    }
  }
  emit('search');
}

function applyHistory(keyword) {
  const normalized = String(keyword || '').trim();
  if (!normalized) return;
  emit('update:keyword', normalized);
  handleSearch(normalized);
}

function clearHistory() {
  clearSearchHistory(MUSIC_SEARCH_HISTORY_KEY);
  searchHistory.value = [];
}

onMounted(() => {
  searchHistory.value = readSearchHistory(MUSIC_SEARCH_HISTORY_KEY, undefined, MUSIC_SEARCH_HISTORY_LIMIT);
});
</script>

<style scoped>
.music-search-toolbar {
  --liquid-bg: linear-gradient(150deg, rgba(20, 24, 36, 0.9), rgba(15, 19, 29, 0.86));
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 26px rgba(6, 10, 18, 0.34);
  position: sticky;
  top: 0;
  z-index: 20;
  border-radius: 14px;
  padding: 8px;
  display: grid;
  gap: 8px;
}

.search-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto auto;
  gap: 8px;
}

.history-row {
  display: grid;
  gap: 8px;
}

.history-row-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.history-title {
  font-size: 12px;
  color: rgba(209, 221, 246, 0.9);
}

.history-clear-btn {
  min-height: 24px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(229, 237, 251, 0.93);
  padding: 0 8px;
  font-size: 12px;
}

.history-list {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.history-chip {
  min-height: 28px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(228, 236, 252, 0.9);
  padding: 0 10px;
  font-size: 12px;
}

.search-input-wrap {
  min-height: var(--music-toolbar-height, 36px);
  height: var(--music-toolbar-height, 36px);
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.09);
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  align-items: center;
  gap: 8px;
  padding: 0 10px;
  color: rgba(214, 226, 247, 0.9);
}

.search-input-wrap i {
  font-size: 12px;
}

.search-input-wrap input {
  width: 100%;
  border: 0;
  outline: none;
  background: transparent;
  color: rgba(236, 243, 255, 0.95);
  font-size: 13px;
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
}

.search-btn {
  border: 1px solid var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.3));
  color: var(--accent-mode-text, rgba(246, 250, 255, 0.98));
}

.refresh-btn {
  border: 1px solid var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  color: var(--accent-mode-text, rgba(255, 255, 255, 0.96));
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
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(228, 236, 252, 0.9);
  padding: 0 12px;
  font-size: 12px;
}

.chip-btn.active {
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  color: var(--accent-mode-text, rgba(255, 255, 255, 0.96));
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

  .history-row-head {
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
