<template>
  <section class="panel-shell">
    <header class="panel-head">
      <div>
        <h2>博客悄悄话</h2>
        <p>集中查看访客给作者留下的匿名留言与站点留言。</p>
      </div>
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading" @click="$emit('refresh')">
        {{ loading ? '刷新中...' : '刷新' }}
      </button>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>
    <p v-else-if="loading && !items.length" class="state-tip">正在加载悄悄话...</p>
    <p v-else-if="!items.length" class="state-tip">暂无悄悄话记录。</p>

    <div v-else class="whisper-list">
      <article v-for="item in items" :key="item.whisperId" class="whisper-card liquid-material">
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

defineEmits(['refresh', 'page']);

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
  color: rgba(236, 245, 255, 0.96);
}

.panel-head p {
  margin: 6px 0 0;
  color: rgba(205, 222, 243, 0.8);
}

.whisper-list {
  display: grid;
  gap: 12px;
}

.whisper-card {
  --liquid-bg: rgba(10, 18, 30, 0.5);
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 12px 26px rgba(5, 10, 20, 0.24);
  display: grid;
  gap: 10px;
  padding: 14px 16px;
  border-radius: 16px;
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
  color: rgba(239, 247, 255, 0.98);
}

.meta-chip {
  display: inline-flex;
  align-items: center;
  min-height: 26px;
  padding: 0 10px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(212, 227, 246, 0.86);
  font-size: 12px;
}

.whisper-time {
  color: rgba(190, 209, 232, 0.74);
  font-size: 12px;
  white-space: nowrap;
}

.whisper-content {
  margin: 0;
  color: rgba(229, 238, 250, 0.92);
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
  background: rgba(255, 255, 255, 0.08);
}

.whisper-meta dt {
  color: rgba(174, 197, 224, 0.74);
  font-size: 12px;
}

.whisper-meta dd {
  margin: 6px 0 0;
  color: rgba(234, 243, 255, 0.94);
}

.pagination-wrap {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  flex-wrap: wrap;
}

.page-indicator,
.state-tip {
  color: rgba(208, 226, 248, 0.88);
}

.error-text {
  color: rgba(255, 168, 184, 0.94);
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
