<template>
  <div class="music-providers-panel">
    <header class="panel-toolbar">
      <h3>音乐源管理</h3>
      <AdminRefreshButton :busy="loading" @click="$emit('refresh')">刷新列表</AdminRefreshButton>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>

    <section class="hint-card admin-card admin-card--soft">
      <p><strong>启用</strong>：后端是否允许调用该音乐源；停用后相关接口直接拒绝。</p>
      <p><strong>前台显示</strong>：是否在音乐馆向用户展示该源的入口。</p>
      <p class="asmr-hint">
        <i class="fas fa-wave-square"></i>
        音声（asmr）入口即使打开「前台显示」，也仅对拥有
        <code>music.asmr.access</code>
        权限的登录用户可见（默认 FRIEND / ADMIN 分组），游客始终不可见。
      </p>
    </section>

    <div v-if="!loading && !items.length" class="empty-tip">暂无音乐源配置</div>

    <div class="provider-list">
      <article
        v-for="item in items"
        :key="`music-provider-${item.provider}`"
        class="provider-card admin-card"
        :class="{ 'provider-card--voice': item.provider === 'asmr' }"
      >
        <div class="meta">
          <h4>
            {{ providerLabel(item.provider) }}
            <span class="code-chip">{{ item.provider }}</span>
          </h4>
          <p class="state-line">
            <span class="state-chip" :class="item.enabled ? 'on' : 'off'">
              {{ item.enabled ? '已启用' : '已停用' }}
            </span>
            <span class="state-chip" :class="item.visible ? 'on' : 'off'">
              {{ item.visible ? '前台显示' : '前台隐藏' }}
            </span>
            <span class="sort-chip">排序 {{ item.sort }}</span>
          </p>
          <p v-if="item.provider === 'asmr'" class="voice-note">
            音声模块入口开关：打开「前台显示」后，音乐馆将出现「音声」标签页（仍受权限限制）。
          </p>
        </div>
        <div class="actions">
          <button
            class="ghost-btn ripple-trigger"
            type="button"
            data-action="toggle-enabled"
            :data-provider="item.provider"
            :disabled="savingProvider === item.provider"
            @click="emitPatch(item, 'enabled')"
          >
            {{ savingProvider === item.provider ? '保存中...' : (item.enabled ? '停用' : '启用') }}
          </button>
          <button
            class="primary-btn ripple-trigger"
            type="button"
            data-action="toggle-visible"
            :data-provider="item.provider"
            :disabled="savingProvider === item.provider || !item.enabled"
            @click="emitPatch(item, 'visible')"
          >
            {{ savingProvider === item.provider ? '保存中...' : (item.visible ? '隐藏入口' : '显示入口') }}
          </button>
        </div>
      </article>
    </div>
  </div>
</template>

<script setup>
import AdminRefreshButton from './AdminRefreshButton.vue';

const props = defineProps({
  loading: {
    type: Boolean,
    default: false
  },
  savingProvider: {
    type: String,
    default: ''
  },
  error: {
    type: String,
    default: ''
  },
  items: {
    type: Array,
    default: () => []
  }
});

const emit = defineEmits(['refresh', 'update']);

const PROVIDER_LABELS = {
  meting: 'Meting 聚合（网易云 / 酷我 / QQ）',
  spotify: 'Spotify',
  asmr: '音声 · ASMR（kikoeru 系 / asmr.one）'
};

function providerLabel(code) {
  const normalized = String(code || '').trim().toLowerCase();
  return PROVIDER_LABELS[normalized] || normalized.toUpperCase() || '未知音乐源';
}

function emitPatch(item, field) {
  const provider = String(item?.provider || '').trim().toLowerCase();
  if (!provider) return;
  if (field === 'enabled') {
    emit('update', {
      provider,
      patch: {
        enabled: !item.enabled
      }
    });
    return;
  }
  emit('update', {
    provider,
    patch: {
      visible: !item.visible
    }
  });
}
</script>

<style scoped>
.music-providers-panel {
  display: grid;
  gap: 12px;
}

.panel-toolbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.panel-toolbar h3 {
  margin: 0;
  color: var(--admin-text);
}

.hint-card {
  padding: 10px 12px;
  display: grid;
  gap: 6px;
  font-size: 12px;
  color: var(--admin-text-soft);
}

.hint-card p {
  margin: 0;
}

.hint-card code {
  padding: 1px 6px;
  border-radius: 6px;
  background: var(--admin-surface-soft);
  color: var(--admin-text);
}

.asmr-hint {
  color: var(--admin-warn);
}

.provider-list {
  display: grid;
  gap: 12px;
  grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
}

.provider-card {
  padding: 12px 14px;
  display: grid;
  gap: 10px;
  align-content: space-between;
}

.provider-card--voice {
  border-color: rgba(255, 190, 120, 0.42);
}

.meta {
  display: grid;
  gap: 6px;
}

.meta h4 {
  margin: 0;
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
  color: var(--admin-text);
  font-size: 14px;
}

.code-chip {
  padding: 1px 8px;
  border-radius: 999px;
  border: 1px solid var(--admin-border);
  font-size: 11px;
  color: var(--admin-text-soft);
}

.state-line {
  margin: 0;
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
  font-size: 12px;
}

.state-chip {
  padding: 1px 8px;
  border-radius: 999px;
  font-size: 11px;
}

.state-chip.on {
  background: var(--admin-ok-bg);
  color: var(--admin-ok);
}

.state-chip.off {
  background: var(--admin-bad-bg);
  color: var(--admin-bad);
}

.sort-chip {
  padding: 1px 8px;
  border-radius: 999px;
  background: var(--admin-surface-soft);
  font-size: 11px;
  color: var(--admin-text-soft);
}

.voice-note {
  margin: 0;
  font-size: 12px;
  color: var(--admin-warn);
}

.actions {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 8px;
}

.primary-btn,
.ghost-btn {
  min-height: 34px;
  border-radius: 10px;
}

.primary-btn:disabled,
.ghost-btn:disabled {
  opacity: 0.55;
  cursor: not-allowed;
}
</style>
