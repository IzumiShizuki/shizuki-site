<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2>分组配额策略</h2>
      <p class="helper-text">以分组 x 配额项矩阵管理，直接编辑数值并保存。</p>
    </header>

    <div class="inline-actions">
      <select class="field-select" @change="onAddCatalogQuota($event)">
        <option value="">从目录添加配额项...</option>
        <option v-for="code in availableCatalogQuotaCodes" :key="code" :value="code">{{ code }}</option>
      </select>
      <button class="ghost-btn ripple-trigger" type="button" @click="$emit('update:advanced', !advanced)">
        {{ advanced ? '收起高级模式' : '高级模式' }}
      </button>
      <button class="primary-btn ripple-trigger" type="button" :disabled="loading || saving || !selectedGroupCode" @click="$emit('saveSelected')">
        {{ saving ? '保存中...' : '保存当前分组' }}
      </button>
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading || saving || !rows.length" @click="$emit('saveAll')">批量保存全部</button>
    </div>

    <div v-if="advanced" class="advanced-block">
      <label class="field-label" for="custom-quota-code">自定义配额编码</label>
      <div class="inline-actions">
        <input
          id="custom-quota-code"
          :value="customQuotaCode"
          class="field-input grow"
          type="text"
          placeholder="例如: ai_round_total"
          @input="$emit('update:customQuotaCode', $event.target.value)"
        />
        <button class="ghost-btn ripple-trigger" type="button" @click="$emit('appendCustomQuota')">添加列</button>
      </div>
    </div>

    <div class="table-wrap">
      <table class="admin-table">
        <thead>
          <tr>
            <th>组编码</th>
            <th>组名</th>
            <th>状态</th>
            <th v-for="code in quotaCodes" :key="code">{{ code }}</th>
          </tr>
        </thead>
        <tbody>
          <tr
            v-for="row in rows"
            :key="row.groupCode"
            :class="{ active: selectedGroupCode === row.groupCode }"
            @click="$emit('selectGroup', row.groupCode)"
          >
            <td><GroupBadge :group-code="row.groupCode" /></td>
            <td>{{ row.displayName || row.groupCode }}</td>
            <td>{{ row.status || '-' }}</td>
            <td v-for="code in quotaCodes" :key="`${row.groupCode}-${code}`" @click.stop>
              <input
                class="field-input quota-input"
                type="number"
                min="0"
                :value="readCellValue(row, code)"
                @change="$emit('updateCell', { groupCode: row.groupCode, quotaCode: code, value: $event.target.value })"
              />
            </td>
          </tr>
          <tr v-if="!rows.length">
            <td :colspan="Math.max(3, quotaCodes.length + 3)">暂无配额数据</td>
          </tr>
        </tbody>
      </table>
    </div>

    <p v-if="error" class="error-text">{{ error }}</p>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import GroupBadge from './GroupBadge.vue';

const props = defineProps({
  loading: { type: Boolean, default: false },
  rows: { type: Array, default: () => [] },
  quotaCodes: { type: Array, default: () => [] },
  quotaCatalog: { type: Array, default: () => [] },
  selectedGroupCode: { type: String, default: '' },
  saving: { type: Boolean, default: false },
  error: { type: String, default: '' },
  advanced: { type: Boolean, default: false },
  customQuotaCode: { type: String, default: '' }
});

const emit = defineEmits([
  'selectGroup',
  'updateCell',
  'saveSelected',
  'saveAll',
  'addCatalogQuota',
  'update:advanced',
  'update:customQuotaCode',
  'appendCustomQuota'
]);

const availableCatalogQuotaCodes = computed(() => {
  const existing = new Set((props.quotaCodes || []).map((item) => String(item || '').trim()));
  return (props.quotaCatalog || [])
    .map((item) => String(item || '').trim())
    .filter((item) => item && !existing.has(item));
});

function onAddCatalogQuota(event) {
  const target = event?.target;
  const code = String(target?.value || '').trim();
  if (!code) return;
  target.value = '';
  // 目录选择器优先，不要求手工输入。
  emit('addCatalogQuota', code);
}

function readCellValue(row, quotaCode) {
  const raw = row?.values?.[quotaCode];
  return Number.isFinite(Number(raw)) ? Number(raw) : 0;
}
</script>

<style scoped>
.panel-grid {
  display: grid;
  gap: 10px;
}

.panel-head h2 {
  font-size: 20px;
}

.helper-text {
  color: rgba(223, 230, 249, 0.88);
}

.inline-actions {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
  align-items: center;
}

.field-label {
  font-size: 12px;
  color: rgba(218, 229, 247, 0.88);
}

.field-input,
.field-select {
  border: 0;
  border-radius: 10px;
  min-height: 38px;
  padding: 0 12px;
  background: rgba(8, 14, 24, 0.56);
  color: rgba(237, 245, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(165, 186, 223, 0.22);
}

.field-select {
  min-width: 220px;
}

.grow {
  flex: 1;
}

.advanced-block {
  border-radius: 10px;
  padding: 10px;
  background: rgba(11, 18, 29, 0.28);
  display: grid;
  gap: 8px;
}

.table-wrap {
  border-radius: 12px;
  overflow: auto;
  box-shadow: inset 0 0 0 1px rgba(175, 198, 228, 0.18);
}

.admin-table {
  width: 100%;
  border-collapse: collapse;
  min-width: 860px;
  font-size: 13px;
}

.admin-table th,
.admin-table td {
  text-align: left;
  padding: 10px 8px;
  border-bottom: 1px solid rgba(180, 203, 232, 0.14);
  color: rgba(232, 241, 253, 0.92);
  vertical-align: middle;
}

.admin-table th {
  color: rgba(194, 218, 245, 0.92);
  font-weight: 600;
  background: rgba(11, 18, 29, 0.36);
}

.admin-table tbody tr {
  cursor: pointer;
}

.admin-table tbody tr.active {
  background: rgba(var(--accent-rgb), 0.18);
}

.quota-input {
  min-height: 32px;
  padding: 0 8px;
  width: 100%;
  min-width: 96px;
}

.primary-btn,
.ghost-btn {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 14px;
  color: rgba(242, 247, 255, 0.94);
}

.primary-btn {
  background: rgba(var(--accent-rgb), 0.34);
}

.ghost-btn {
  background: rgba(255, 255, 255, 0.18);
}

.error-text {
  color: rgba(255, 188, 206, 0.96);
}
</style>
