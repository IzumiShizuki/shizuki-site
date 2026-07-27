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
  font-size: 16px;
  color: var(--theme-text-primary, rgba(255, 244, 238, 0.96));
}

/* 顶部说明：柔和的信息卡 */
.hint-card {
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
  background: var(--theme-surface-soft, rgba(255, 240, 235, 0.12));
  border-radius: 12px;
  padding: 10px 12px;
  display: grid;
  gap: 6px;
  font-size: 12px;
  color: var(--theme-text-secondary, rgba(226, 206, 198, 0.9));
}

.hint-card p {
  margin: 0;
}

.hint-card strong {
  color: var(--theme-text-primary, rgba(255, 244, 238, 0.96));
}

.hint-card code {
  padding: 1px 6px;
  border-radius: 6px;
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.2));
  background: rgba(var(--accent-rgb, 242, 179, 157), 0.14);
  color: var(--theme-text-primary, rgba(255, 244, 238, 0.96));
}

.asmr-hint {
  color: var(--adm-warn-text, rgba(250, 213, 145, 0.96));
}

/* 三个音乐源：清晰的独立小卡片 */
.provider-list {
  display: grid;
  gap: 12px;
  grid-template-columns: repeat(auto-fill, minmax(280px, 1fr));
}

.provider-card {
  position: relative;
  overflow: hidden;
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.05));
  border-radius: 14px;
  box-shadow: 0 10px 24px rgba(6, 10, 18, 0.1);
  padding: 14px 16px 14px 19px;
  display: grid;
  gap: 12px;
  align-content: space-between;
  transition: transform 0.16s ease, border-color 0.16s ease, box-shadow 0.16s ease;
}

/* 左侧主题色竖条，与后台 KPI 卡片视觉语言一致 */
.provider-card::before {
  content: '';
  position: absolute;
  inset: 12px auto 12px 0;
  width: 3px;
  border-radius: 3px;
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb, 242, 179, 157), 0.8));
  opacity: 0.9;
}

.provider-card:hover {
  transform: translateY(-2px);
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb, 242, 179, 157), 0.45));
  box-shadow: 0 14px 30px rgba(6, 10, 18, 0.16);
}

.provider-card--voice {
  border-color: rgba(255, 190, 120, 0.42);
}

.provider-card--voice::before {
  background: linear-gradient(180deg, rgba(255, 198, 128, 0.92), rgba(255, 152, 112, 0.78));
}

.meta {
  display: grid;
  gap: 7px;
}

.meta h4 {
  margin: 0;
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
  color: var(--theme-text-primary, rgba(255, 244, 238, 0.96));
  font-size: 14px;
}

.code-chip {
  padding: 1px 8px;
  border-radius: 999px;
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
  background: var(--adm-chip-bg, rgba(255, 255, 255, 0.08));
  font-size: 11px;
  font-weight: 500;
  color: var(--theme-text-tertiary, rgba(205, 183, 168, 0.78));
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
  border: 1px solid transparent;
  font-size: 11px;
  font-weight: 600;
}

.state-chip.on {
  background: rgba(var(--adm-success-rgb, 61, 176, 130), 0.12);
  border-color: rgba(var(--adm-success-rgb, 61, 176, 130), 0.5);
  color: var(--adm-success-text, rgba(150, 230, 194, 0.96));
}

.state-chip.off {
  background: rgba(var(--adm-danger-rgb, 225, 83, 97), 0.1);
  border-color: rgba(var(--adm-danger-rgb, 225, 83, 97), 0.42);
  color: var(--adm-danger-text, rgba(255, 179, 192, 0.96));
}

.sort-chip {
  padding: 1px 8px;
  border-radius: 999px;
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.2));
  background: var(--theme-surface-soft, rgba(255, 240, 235, 0.12));
  font-size: 11px;
  color: var(--theme-text-tertiary, rgba(205, 183, 168, 0.78));
}

.voice-note {
  margin: 0;
  font-size: 12px;
  line-height: 1.5;
  color: var(--adm-warn-text, rgba(250, 213, 145, 0.96));
}

/* 操作区：分隔线让按钮区与信息区界限清晰 */
.actions {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 8px;
  padding-top: 10px;
  border-top: 1px solid var(--theme-divider-soft, rgba(255, 224, 208, 0.14));
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
