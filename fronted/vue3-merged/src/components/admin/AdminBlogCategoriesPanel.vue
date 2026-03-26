<template>
  <section class="panel-shell">
    <header class="panel-head">
      <div>
        <h2>博客分类视觉</h2>
        <p>维护分类展示名、封面图、排序与启用状态。</p>
      </div>
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading" @click="$emit('refresh')">
        {{ loading ? '刷新中...' : '刷新' }}
      </button>
    </header>

    <section v-if="allowCreate" class="create-card liquid-material">
      <h3>新增分类</h3>
      <div class="field-grid">
        <label class="field">
          <span>分类编码</span>
          <input
            v-model.trim="createDraft.categoryCode"
            class="field-input"
            type="text"
            maxlength="64"
            placeholder="例如：notes / design / ai"
          />
        </label>
        <label class="field">
          <span>展示名称</span>
          <input v-model.trim="createDraft.displayName" class="field-input" type="text" maxlength="128" placeholder="例如：学习笔记" />
        </label>
      </div>
      <label class="field field-wide">
        <span>图片 URL</span>
        <input v-model.trim="createDraft.coverImageUrl" class="field-input" type="text" maxlength="512" placeholder="https://..." />
      </label>
      <div class="inline-fields">
        <label class="field">
          <span>排序</span>
          <input v-model.number="createDraft.sortNum" class="field-input" type="number" min="0" step="1" />
        </label>
        <label class="field checkbox-field">
          <span>启用</span>
          <input v-model="createDraft.enabled" type="checkbox" />
        </label>
      </div>
      <div class="actions">
        <label class="ghost-btn ripple-trigger upload-btn" :class="{ disabled: uploadingCode === normalizedCreateCode || !normalizedCreateCode }">
          <input
            type="file"
            accept="image/png,image/jpeg,image/webp,image/gif"
            :disabled="uploadingCode === normalizedCreateCode || !normalizedCreateCode"
            @change="handleCoverFileChange(normalizedCreateCode, $event)"
          />
          {{ uploadingCode === normalizedCreateCode ? '上传中...' : '上传图片' }}
        </label>
        <button class="ghost-btn ripple-trigger" type="button" @click="resetCreateDraft">清空</button>
        <button class="primary-btn ripple-trigger" type="button" :disabled="saving || !normalizedCreateCode" @click="createCategory">
          {{ saving ? '保存中...' : '新增分类' }}
        </button>
      </div>
    </section>

    <p v-if="error" class="error-text">{{ error }}</p>
    <p v-else-if="loading && !items.length" class="state-tip">正在加载分类配置...</p>
    <p v-else-if="!items.length" class="state-tip">暂无分类元数据。</p>

    <div v-else class="category-grid">
      <article v-for="item in items" :key="item.categoryCode" class="category-card liquid-material">
        <div class="cover-col">
          <img v-if="item.coverImageUrl" :src="item.coverImageUrl" :alt="item.displayName || item.categoryCode" loading="lazy" />
          <div v-else class="cover-empty">无分类图</div>
        </div>

        <div class="form-col">
          <label class="field">
            <span>分类编码</span>
            <input :value="item.categoryCode" class="field-input" type="text" readonly />
          </label>

          <label class="field">
            <span>展示名称</span>
            <input v-model.trim="drafts[item.categoryCode].displayName" class="field-input" type="text" maxlength="128" />
          </label>

          <label class="field field-wide">
            <span>图片 URL</span>
            <input
              v-model.trim="drafts[item.categoryCode].coverImageUrl"
              class="field-input"
              type="text"
              maxlength="512"
              placeholder="https://..."
            />
          </label>

          <div class="inline-fields">
            <label class="field">
              <span>排序</span>
              <input v-model.number="drafts[item.categoryCode].sortNum" class="field-input" type="number" min="0" step="1" />
            </label>
            <label class="field checkbox-field">
              <span>启用</span>
              <input v-model="drafts[item.categoryCode].enabled" type="checkbox" />
            </label>
          </div>

          <div class="actions">
            <label class="ghost-btn ripple-trigger upload-btn" :class="{ disabled: uploadingCode === item.categoryCode }">
              <input
                type="file"
                accept="image/png,image/jpeg,image/webp,image/gif"
                :disabled="uploadingCode === item.categoryCode"
                @change="handleCoverFileChange(item.categoryCode, $event)"
              />
              {{ uploadingCode === item.categoryCode ? '上传中...' : '上传图片' }}
            </label>
            <button
              class="primary-btn ripple-trigger"
              type="button"
              :disabled="saving || uploadingCode === item.categoryCode"
              @click="saveCategory(item.categoryCode)"
            >
              {{ saving ? '保存中...' : '保存' }}
            </button>
            <button
              class="ghost-btn ripple-trigger"
              type="button"
              :disabled="saving || uploadingCode === item.categoryCode"
              @click="toggleCategoryEnabled(item.categoryCode)"
            >
              {{ drafts[item.categoryCode].enabled ? '禁用' : '启用' }}
            </button>
            <button
              class="danger-btn ripple-trigger"
              type="button"
              :disabled="saving || uploadingCode === item.categoryCode"
              @click="deleteCategory(item.categoryCode)"
            >
              删除
            </button>
          </div>
        </div>
      </article>
    </div>
  </section>
</template>

<script setup>
import { computed, reactive, watch } from 'vue';

const props = defineProps({
  loading: {
    type: Boolean,
    default: false
  },
  saving: {
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
  uploadingCode: {
    type: String,
    default: ''
  },
  allowCreate: {
    type: Boolean,
    default: true
  },
  createUploadCategoryCode: {
    type: String,
    default: ''
  },
  createUploadedCoverUrl: {
    type: String,
    default: ''
  }
});

const emit = defineEmits(['refresh', 'save', 'upload', 'delete']);

const drafts = reactive({});
const createDraft = reactive(createEmptyDraft());

const normalizedCreateCode = computed(() => normalizeCategoryCode(createDraft.categoryCode));

function syncDrafts(list) {
  const nextMap = {};
  (Array.isArray(list) ? list : []).forEach((item) => {
    const categoryCode = String(item?.categoryCode || '').toLowerCase();
    if (!categoryCode) return;
    nextMap[categoryCode] = {
      displayName: String(item?.displayName || ''),
      coverImageUrl: String(item?.coverImageUrl || ''),
      sortNum: Number.isFinite(Number(item?.sortNum)) ? Math.max(0, Math.trunc(Number(item.sortNum))) : 1000,
      enabled: item?.enabled !== false
    };
  });

  Object.keys(drafts).forEach((code) => {
    if (!nextMap[code]) {
      delete drafts[code];
    }
  });
  Object.entries(nextMap).forEach(([code, value]) => {
    drafts[code] = value;
  });
}

watch(
  () => props.items,
  (list) => {
    syncDrafts(list);
  },
  {
    immediate: true,
    deep: true
  }
);

watch(
  () => [props.createUploadCategoryCode, props.createUploadedCoverUrl],
  ([categoryCode, coverUrl]) => {
    const normalizedCode = normalizeCategoryCode(categoryCode);
    if (!normalizedCode || normalizedCode !== normalizedCreateCode.value) return;
    if (!String(coverUrl || '').trim()) return;
    createDraft.coverImageUrl = String(coverUrl || '').trim();
  },
  { immediate: true }
);

function saveCategory(categoryCode) {
  const normalizedCode = normalizeCategoryCode(categoryCode);
  const draft = drafts[normalizedCode];
  if (!normalizedCode || !draft) return;
  emit('save', {
    categoryCode: normalizedCode,
    ...draft
  });
}

function toggleCategoryEnabled(categoryCode) {
  const normalizedCode = normalizeCategoryCode(categoryCode);
  const draft = drafts[normalizedCode];
  if (!normalizedCode || !draft) return;
  emit('save', {
    categoryCode: normalizedCode,
    ...draft,
    enabled: !draft.enabled
  });
}

function deleteCategory(categoryCode) {
  const normalizedCode = normalizeCategoryCode(categoryCode);
  if (!normalizedCode) return;
  if (typeof window !== 'undefined' && !window.confirm(`确认删除分类 ${normalizedCode} 吗？如果仍有文章使用该分类，后端会拒绝删除。`)) {
    return;
  }
  emit('delete', normalizedCode);
}

function handleCoverFileChange(categoryCode, event) {
  const file = event?.target?.files?.[0];
  if (!(file instanceof File)) return;
  const normalizedCode = normalizeCategoryCode(categoryCode);
  if (!normalizedCode) return;
  emit('upload', {
    categoryCode: normalizedCode,
    file
  });
  event.target.value = '';
}

function createCategory() {
  const categoryCode = normalizedCreateCode.value;
  if (!categoryCode) return;
  emit('save', {
    categoryCode,
    displayName: String(createDraft.displayName || '').trim() || categoryCode,
    coverImageUrl: String(createDraft.coverImageUrl || '').trim(),
    sortNum: Number.isFinite(Number(createDraft.sortNum)) ? Math.max(0, Math.trunc(Number(createDraft.sortNum))) : 1000,
    enabled: createDraft.enabled !== false
  });
}

function resetCreateDraft() {
  const empty = createEmptyDraft();
  createDraft.categoryCode = empty.categoryCode;
  createDraft.displayName = empty.displayName;
  createDraft.coverImageUrl = empty.coverImageUrl;
  createDraft.sortNum = empty.sortNum;
  createDraft.enabled = empty.enabled;
}

function createEmptyDraft() {
  return {
    categoryCode: '',
    displayName: '',
    coverImageUrl: '',
    sortNum: 1000,
    enabled: true
  };
}

function normalizeCategoryCode(value) {
  return String(value || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
}
</script>

<style scoped>
.panel-shell {
  min-height: 0;
  display: grid;
  gap: 12px;
}

.create-card {
  --liquid-bg: rgba(11, 17, 29, 0.52);
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 14px 24px rgba(6, 9, 16, 0.2);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  gap: 8px;
}

.create-card h3 {
  font-size: 14px;
}

.field-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.panel-head {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 12px;
}

.panel-head h2 {
  font-size: 20px;
}

.panel-head p {
  margin-top: 6px;
  color: rgba(214, 224, 246, 0.88);
}

.state-tip {
  color: rgba(208, 220, 246, 0.88);
}

.error-text {
  color: #ffadb2;
}

.category-grid {
  display: grid;
  gap: 10px;
}

.category-card {
  --liquid-bg: rgba(13, 19, 30, 0.48);
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 14px 26px rgba(5, 9, 17, 0.2);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  grid-template-columns: 120px minmax(0, 1fr);
  gap: 12px;
}

.cover-col {
  width: 120px;
  height: 90px;
  border-radius: 12px;
  overflow: hidden;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(8, 12, 20, 0.5);
}

.cover-col img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.cover-empty {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  font-size: 12px;
  color: rgba(193, 206, 236, 0.82);
}

.form-col {
  display: grid;
  gap: 8px;
}

.field {
  display: grid;
  gap: 4px;
}

.field span {
  font-size: 12px;
  color: rgba(216, 227, 249, 0.9);
}

.field-input {
  width: 100%;
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(8, 12, 20, 0.42);
  color: rgba(236, 243, 255, 0.95);
  padding: 0 10px;
}

.field-wide {
  grid-column: 1 / -1;
}

.inline-fields {
  display: grid;
  grid-template-columns: 1fr 120px;
  gap: 10px;
}

.checkbox-field {
  align-content: end;
}

.checkbox-field input {
  width: 18px;
  height: 18px;
}

.actions {
  display: flex;
  gap: 8px;
  align-items: center;
}

.ghost-btn,
.primary-btn {
  min-height: 34px;
  padding: 0 12px;
  border-radius: 10px;
  font-size: 13px;
}

.ghost-btn {
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(233, 241, 255, 0.94);
}

.primary-btn {
  border: 1px solid rgba(var(--accent-rgb), 0.62);
  background: rgba(var(--accent-rgb), 0.3);
  color: rgba(246, 250, 255, 0.98);
}

.danger-btn {
  min-height: 34px;
  padding: 0 12px;
  border-radius: 10px;
  font-size: 13px;
  border: 1px solid rgba(255, 112, 125, 0.55);
  background: rgba(255, 112, 125, 0.14);
  color: rgba(255, 213, 218, 0.98);
}

.upload-btn {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  position: relative;
  overflow: hidden;
  cursor: pointer;
}

.upload-btn input {
  position: absolute;
  inset: 0;
  opacity: 0;
  cursor: pointer;
}

.upload-btn.disabled {
  opacity: 0.6;
  pointer-events: none;
}

@media (max-width: 980px) {
  .field-grid {
    grid-template-columns: 1fr;
  }

  .category-card {
    grid-template-columns: 1fr;
  }

  .cover-col {
    width: 100%;
    height: 140px;
  }

  .inline-fields {
    grid-template-columns: 1fr;
  }
}
</style>
