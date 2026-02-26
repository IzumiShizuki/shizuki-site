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
          @keydown.enter.prevent="emit('submit')"
        />
      </label>
      <button class="refresh-btn ripple-trigger" type="button" :disabled="loading" @click="emit('refresh')">
        <i class="fas fa-rotate-right"></i>
        {{ loading ? '刷新中...' : '刷新' }}
      </button>
    </div>

    <div class="filters-row">
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
import { computed } from 'vue';

const props = defineProps({
  keyword: { type: String, default: '' },
  type: { type: String, default: 'all' },
  loading: { type: Boolean, default: false },
  errorText: { type: String, default: '' },
  typeOptions: { type: Array, default: () => [] },
  providerOptions: { type: Array, default: () => [] },
  selectedProviders: { type: Array, default: () => [] }
});

const emit = defineEmits(['update:keyword', 'set-type', 'toggle-provider', 'submit', 'refresh']);

const selectedProviderSet = computed(() => {
  const list = Array.isArray(props.selectedProviders) ? props.selectedProviders : [];
  return new Set(list.map((item) => String(item || '').trim().toLowerCase()));
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
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
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

.refresh-btn {
  min-height: var(--music-toolbar-height, 36px);
  height: var(--music-toolbar-height, 36px);
  border-radius: 12px;
  border: 1px solid rgba(var(--accent-rgb), 0.56);
  background: rgba(var(--accent-rgb), 0.22);
  color: rgba(var(--accent-soft-rgb), 0.98);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

:global(:root[data-accent-mode='gradient']) .refresh-btn {
  background: var(--accent-gradient, rgba(var(--accent-rgb), 0.24));
  color: rgba(255, 255, 255, 0.96);
}

.filters-row {
  display: grid;
  gap: 8px;
}

.filter-group,
.provider-group {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
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
  border-color: rgba(var(--accent-rgb), 0.72);
  background: rgba(var(--accent-rgb), 0.24);
  color: rgba(245, 250, 255, 0.98);
  box-shadow: 0 8px 16px rgba(var(--accent-rgb), 0.2);
}

:global(:root[data-accent-mode='gradient']) .chip-btn.active {
  background: var(--accent-gradient, rgba(var(--accent-rgb), 0.24));
  color: rgba(255, 255, 255, 0.96);
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

  .refresh-btn {
    justify-content: center;
  }
}
</style>
