<template>
  <div class="wallpaper-panel">
    <header class="panel-toolbar">
      <h3>壁纸审核</h3>
      <AdminRefreshButton :busy="loading" :disabled="submitting" @click="$emit('refresh')">刷新待审</AdminRefreshButton>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>

    <div v-if="!loading && !items.length" class="empty-tip">暂无待审核壁纸</div>

    <div class="wallpaper-grid">
      <article v-for="item in items" :key="item.wallpaperId" class="wallpaper-card admin-card">
        <img class="preview" :src="item.previewUrl || item.visualUrl" :alt="item.title || 'wallpaper'" />
        <div class="meta">
          <h4>{{ item.title || `壁纸 #${item.wallpaperId}` }}</h4>
          <p>ID: {{ item.wallpaperId }} | 场景: {{ item.sceneType }}</p>
          <p>Owner: {{ item.ownerUserId }} | 可见性: {{ item.visibility }}</p>
          <p v-if="item.workshopItemId">Workshop: {{ item.workshopItemId }}</p>
        </div>
        <div class="actions">
          <button
            class="primary-btn ripple-trigger"
            type="button"
            :disabled="submitting"
            @click="audit(item.wallpaperId, 'APPROVED', 'PUBLIC')"
          >
            通过并公开
          </button>
          <button
            class="ghost-btn ripple-trigger"
            type="button"
            :disabled="submitting"
            @click="audit(item.wallpaperId, 'APPROVED', 'PRIVATE')"
          >
            通过并私有
          </button>
          <button
            class="danger-btn ripple-trigger"
            type="button"
            :disabled="submitting"
            @click="audit(item.wallpaperId, 'REJECTED', item.visibility || 'PRIVATE')"
          >
            驳回
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
  submitting: {
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
  }
});

const emit = defineEmits(['refresh', 'audit']);

function audit(wallpaperId, auditStatus, visibility) {
  emit('audit', {
    wallpaperId,
    auditStatus,
    visibility
  });
}
</script>

<style scoped>
.wallpaper-panel {
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

.wallpaper-grid {
  display: grid;
  gap: 12px;
  grid-template-columns: repeat(auto-fill, minmax(240px, 1fr));
}

.wallpaper-card {
  overflow: hidden;
  display: grid;
  gap: 8px;
  padding: 10px;
}

.preview {
  width: 100%;
  height: 132px;
  border-radius: 8px;
  object-fit: cover;
}

.meta {
  display: grid;
  gap: 4px;
  color: var(--admin-text-soft);
  font-size: 12px;
}

.meta h4 {
  margin: 0;
  color: var(--admin-text);
  font-size: 14px;
}

.meta p {
  margin: 0;
}

.actions {
  display: grid;
  grid-template-columns: 1fr;
  gap: 8px;
}

.primary-btn,
.ghost-btn,
.danger-btn {
  min-height: 34px;
  border-radius: 10px;
}

.danger-btn {
  border: 1px solid rgba(226, 120, 104, 0.5);
  background: var(--admin-bad-bg);
  color: var(--admin-bad);
}
</style>
