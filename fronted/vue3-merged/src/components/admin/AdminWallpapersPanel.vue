<template>
  <div class="wallpaper-panel">
    <header class="toolbar">
      <h3>壁纸审核</h3>
      <button class="primary-btn ripple-trigger" type="button" :disabled="loading || submitting" @click="$emit('refresh')">
        {{ loading ? '加载中...' : '刷新待审' }}
      </button>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>

    <div v-if="!loading && !items.length" class="empty-tip">暂无待审核壁纸</div>

    <div class="wallpaper-grid">
      <article v-for="item in items" :key="item.wallpaperId" class="wallpaper-card liquid-material">
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

.toolbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.toolbar h3 {
  margin: 0;
  color: rgba(233, 242, 255, 0.95);
}

.wallpaper-grid {
  display: grid;
  gap: 12px;
  grid-template-columns: repeat(auto-fill, minmax(240px, 1fr));
}

.wallpaper-card {
  --liquid-bg: rgba(10, 18, 30, 0.5);
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 12px 26px rgba(5, 10, 20, 0.24);
  border-radius: 12px;
  overflow: hidden;
  display: grid;
  gap: 8px;
  padding: 8px;
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
  color: rgba(220, 232, 248, 0.9);
  font-size: 12px;
}

.meta h4 {
  margin: 0;
  color: rgba(236, 246, 255, 0.96);
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
  border: 0;
  border-radius: 10px;
  min-height: 34px;
  color: rgba(240, 248, 255, 0.95);
}

.primary-btn {
  background: rgba(var(--accent-rgb), 0.34);
}

.ghost-btn {
  background: rgba(255, 255, 255, 0.16);
}

.danger-btn {
  background: rgba(236, 84, 112, 0.34);
}

.empty-tip {
  color: rgba(208, 226, 248, 0.88);
}

.error-text {
  color: rgba(255, 168, 184, 0.94);
}
</style>
