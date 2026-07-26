<template>
  <section class="panel-shell">
    <header class="panel-head">
      <div>
        <h2>博客悄悄话</h2>
        <p>集中查看访客给作者留下的匿名留言与站点留言。</p>
      </div>
      <AdminRefreshButton :busy="loading" @click="$emit('refresh')">刷新</AdminRefreshButton>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>
    <p v-else-if="loading && !items.length" class="state-tip">正在加载悄悄话...</p>
    <p v-else-if="!items.length" class="state-tip">暂无悄悄话记录。</p>

    <div v-else class="whisper-list">
      <article v-for="item in items" :key="item.whisperId" class="whisper-card admin-card">
        <header class="whisper-head">
          <div class="whisper-head-main">
            <strong>{{ item.postTitle || '站点留言' }}</strong>
            <span v-if="item.postId > 0" class="meta-chip">Post #{{ item.postId }}</span>
            <span class="meta-chip">{{ item.status || 'CREATED' }}</span>
          </div>
          <time class="whisper-time">{{ formatDateTime(item.createdAt) }}</time>
        </header>

        <p class="whisper-content">{{ item.content || '无内容' }}</p>

        <dl class="whisper-meta">
          <div>
            <dt>昵称</dt>
            <dd>{{ item.nickname || '匿名访客' }}</dd>
          </div>
          <div>
            <dt>备注</dt>
            <dd>{{ item.remark || '无' }}</dd>
          </div>
          <div>
            <dt>ID</dt>
            <dd>#{{ item.whisperId }}</dd>
          </div>
        </dl>

        <div class="whisper-actions">
          <button
            class="mini-btn ripple-trigger primary"
            type="button"
            :disabled="loading || submittingId === item.whisperId || item.status === 'PUBLISHED'"
            @click="$emit('set-status', { whisperId: item.whisperId, status: 'PUBLISHED' })"
          >
            {{ submittingId === item.whisperId && item.status !== 'PUBLISHED' ? '提交中...' : '公开展示' }}
          </button>
          <button
            class="ghost-btn ripple-trigger"
            type="button"
            :disabled="loading || submittingId === item.whisperId || item.status === 'HIDDEN'"
            @click="$emit('set-status', { whisperId: item.whisperId, status: 'HIDDEN' })"
          >
            {{ submittingId === item.whisperId && item.status !== 'HIDDEN' ? '提交中...' : '隐藏' }}
          </button>
        </div>
      </article>
    </div>

    <footer v-if="totalPages > 1" class="pagination-wrap">
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading || page <= 1" @click="$emit('page', page - 1)">
        上一页
      </button>
      <span class="page-indicator">第 {{ page }} / {{ totalPages }} 页 · 共 {{ total }} 条</span>
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading || page >= totalPages" @click="$emit('page', page + 1)">
        下一页
      </button>
    </footer>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import AdminRefreshButton from './AdminRefreshButton.vue';

const props = defineProps({
  loading: {
    type: Boolean,
    default: false
  },
  error: {
    type: String,
    default: ''
  },
  items: {
    type: Array,
    default: () => []
  },
  submittingId: {
    type: Number,
    default: 0
  },
  page: {
    type: Number,
    default: 1
  },
  pageSize: {
    type: Number,
    default: 20
  },
  total: {
    type: Number,
    default: 0
  }
});

defineEmits(['refresh', 'page', 'set-status']);

const totalPages = computed(() => {
  if (!props.pageSize || props.pageSize <= 0) return 1;
  return Math.max(1, Math.ceil((Number(props.total) || 0) / props.pageSize));
});

function formatDateTime(value) {
  const text = String(value || '').trim();
  if (!text) return '-';
  const date = new Date(text);
  if (Number.isNaN(date.getTime())) return text;
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')} ${String(date.getHours()).padStart(2, '0')}:${String(date.getMinutes()).padStart(2, '0')}`;
}
</script>

<style scoped>
.panel-shell {
  display: grid;
  gap: 14px;
}

.panel-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 16px;
}

.panel-head h2 {
  margin: 0;
  color: var(--admin-text);
}

.panel-head p {
  margin: 6px 0 0;
  color: var(--admin-text-soft);
}

.whisper-list {
  display: grid;
  gap: 12px;
}

.whisper-card {
  display: grid;
  gap: 10px;
  padding: 14px 16px;
}

.whisper-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 12px;
}

.whisper-head-main {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px;
}

.whisper-head-main strong {
  color: var(--admin-text);
}

.meta-chip {
  display: inline-flex;
  align-items: center;
  min-height: 26px;
  padding: 0 10px;
  border-radius: 999px;
  background: var(--admin-surface-soft);
  color: var(--admin-text-soft);
  font-size: 12px;
}

.whisper-time {
  color: var(--admin-text-faint);
  font-size: 12px;
  white-space: nowrap;
}

.whisper-content {
  margin: 0;
  color: var(--admin-text);
  line-height: 1.7;
  white-space: pre-wrap;
  word-break: break-word;
}

.whisper-meta {
  display: grid;
  gap: 10px;
  grid-template-columns: repeat(auto-fit, minmax(160px, 1fr));
  margin: 0;
}

.whisper-meta div {
  padding: 10px 12px;
  border-radius: 12px;
  background: var(--admin-surface-soft);
}

.whisper-meta dt {
  color: var(--admin-text-faint);
  font-size: 12px;
}

.whisper-meta dd {
  margin: 6px 0 0;
  color: var(--admin-text);
}

.whisper-actions {
  display: flex;
  align-items: center;
  gap: 10px;
  flex-wrap: wrap;
}

.pagination-wrap {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  flex-wrap: wrap;
}

.page-indicator {
  color: var(--admin-text-soft);
}

@media (max-width: 760px) {
  .whisper-head {
    grid-template-columns: 1fr;
    display: grid;
  }

  .whisper-time {
    white-space: normal;
  }
}
</style>
