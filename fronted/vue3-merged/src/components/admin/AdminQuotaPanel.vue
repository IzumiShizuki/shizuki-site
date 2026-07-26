<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2 class="adm-title">分组配额策略</h2>
      <p class="adm-desc">按「分组 × 配额项」编辑：打开「无限」开关即不限量，数值 0 表示禁用；容量类配额可直接按 MB/GB 输入。</p>
    </header>

    <div class="adm-toolbar">
      <select class="adm-select" aria-label="从目录添加配额项" @change="onAddCatalogQuota($event)">
        <option value="">从目录添加配额项...</option>
        <option v-for="option in availableCatalogOptions" :key="option.code" :value="option.code">
          {{ option.label }}（{{ option.code }}）
        </option>
      </select>
      <button class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger" type="button" @click="$emit('update:advanced', !advanced)">
        {{ advanced ? '收起高级模式' : '高级模式' }}
      </button>
      <span v-if="dirtyCellCount" class="adm-dirty">{{ dirtyCellCount }} 处未保存</span>
      <span class="adm-toolbar-spacer"></span>
      <button class="adm-btn adm-btn--ghost ripple-trigger" type="button" :disabled="loading || saving || !dirtyCellCount" @click="$emit('reset')">
        放弃更改
      </button>
      <button
        class="adm-btn adm-btn--ghost ripple-trigger"
        type="button"
        :disabled="loading || saving || !selectedGroupCode"
        @click="$emit('saveSelected')"
      >
        {{ saving ? '保存中...' : '保存当前分组' }}
      </button>
      <button class="adm-btn adm-btn--primary ripple-trigger" type="button" :disabled="loading || saving || !rows.length" @click="$emit('saveAll')">
        批量保存全部
      </button>
    </div>

    <div v-if="advanced" class="advanced-block">
      <label class="adm-label" for="custom-quota-code">自定义配额编码（供扩展模块使用）</label>
      <div class="adm-toolbar">
        <input
          id="custom-quota-code"
          :value="customQuotaCode"
          class="adm-input adm-input--sm adm-grow"
          type="text"
          placeholder="例如: ai_round_total"
          @input="$emit('update:customQuotaCode', $event.target.value)"
          @keyup.enter="$emit('appendCustomQuota')"
        />
        <button class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger" type="button" @click="$emit('appendCustomQuota')">添加列</button>
      </div>
    </div>

    <div class="adm-table-wrap">
      <table class="adm-table quota-table">
        <thead>
          <tr>
            <th class="quota-sticky-col">分组</th>
            <th v-for="option in columnOptions" :key="option.code" :title="option.description || option.code">
              <span class="quota-col-head">
                <span class="quota-col-label">{{ option.label }}</span>
                <span class="quota-col-meta">
                  <span class="adm-flag">{{ option.unit === 'bytes' ? '容量' : '次数' }}</span>
                  <span v-if="option.label !== option.code" class="adm-cell-secondary">{{ option.code }}</span>
                </span>
              </span>
            </th>
          </tr>
        </thead>
        <tbody>
          <tr
            v-for="row in rows"
            :key="row.groupCode"
            :class="{ 'is-active': selectedGroupCode === row.groupCode }"
            @click="$emit('selectGroup', row.groupCode)"
          >
            <td class="quota-sticky-col">
              <div class="quota-group-cell">
                <GroupBadge :group-code="row.groupCode" :label="row.displayName || row.groupCode" />
                <span
                  class="adm-flag"
                  :class="row.status === 'ACTIVE' ? 'adm-flag--on' : 'adm-flag--off'"
                >{{ row.status === 'ACTIVE' ? '启用' : '停用' }}</span>
              </div>
            </td>
            <td
              v-for="option in columnOptions"
              :key="`${row.groupCode}-${option.code}`"
              :class="{ 'quota-cell-dirty': isCellDirty(row, option.code) }"
              @click.stop
            >
              <div class="adm-quota-cell">
                <label class="adm-switch">
                  <input
                    type="checkbox"
                    :checked="isUnlimited(row, option.code)"
                    @change="onUnlimitedToggle(row, option.code, $event.target.checked)"
                  />
                  <span class="adm-switch-track"></span>
                  <span>无限</span>
                </label>

                <div v-if="!isUnlimited(row, option.code)" class="adm-quota-value">
                  <template v-if="option.unit === 'bytes'">
                    <input
                      class="adm-input adm-input--sm quota-num-input"
                      type="number"
                      min="0"
                      step="any"
                      :value="readBytesDisplayValue(row, option.code)"
                      @change="onBytesInput(row, option.code, $event.target.value)"
                    />
                    <select
                      class="adm-select adm-select--sm quota-unit-select"
                      :value="readCellUnit(row, option.code)"
                      @change="onUnitChange(row, option.code, $event.target.value)"
                    >
                      <option value="MB">MB</option>
                      <option value="GB">GB</option>
                    </select>
                  </template>
                  <template v-else>
                    <input
                      class="adm-input adm-input--sm quota-num-input"
                      type="number"
                      min="0"
                      step="1"
                      :value="readCellValue(row, option.code)"
                      @change="onCountInput(row, option.code, $event.target.value)"
                    />
                  </template>
                </div>

                <span
                  class="adm-quota-display"
                  :class="{
                    'is-unlimited': isUnlimited(row, option.code),
                    'is-zero': !isUnlimited(row, option.code) && readCellValue(row, option.code) === 0
                  }"
                >
                  {{ formatQuotaValue(row.values?.[option.code], option.unit) }}
                </span>
              </div>
            </td>
          </tr>
          <tr v-if="!rows.length">
            <td :colspan="columnOptions.length + 1"><div class="adm-empty">暂无配额数据</div></td>
          </tr>
        </tbody>
      </table>
    </div>

    <p v-if="error" class="adm-error">{{ error }}</p>
  </section>
</template>

<script setup>
import { computed, reactive } from 'vue';
import GroupBadge from './GroupBadge.vue';
import {
  formatQuotaValue,
  normalizeQuotaOptions,
  normalizeQuotaValue,
  UNLIMITED_QUOTA_VALUE
} from '../../pages/adminUiState';

const MB = 1024 * 1024;
const GB = 1024 * 1024 * 1024;

const props = defineProps({
  loading: { type: Boolean, default: false },
  rows: { type: Array, default: () => [] },
  quotaCodes: { type: Array, default: () => [] },
  quotaCatalog: { type: Array, default: () => [] },
  quotaOptions: { type: Array, default: () => [] },
  baseline: { type: Object, default: () => ({}) },
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
  'reset',
  'addCatalogQuota',
  'update:advanced',
  'update:customQuotaCode',
  'appendCustomQuota'
]);

// 记住每个容量单元格的显示单位（MB/GB），仅影响展示不影响存储值。
const cellUnitChoice = reactive({});

const allOptions = computed(() => normalizeQuotaOptions(props.quotaOptions, props.quotaCatalog));

const optionByCode = computed(() => {
  const map = new Map();
  allOptions.value.forEach((option) => map.set(option.code, option));
  return map;
});

const columnOptions = computed(() =>
  (props.quotaCodes || []).map((code) => optionByCode.value.get(code) || {
    code,
    label: code,
    description: '',
    unit: String(code || '').toLowerCase().includes('bytes') ? 'bytes' : 'count',
    builtIn: false
  })
);

const availableCatalogOptions = computed(() => {
  const existing = new Set((props.quotaCodes || []).map((item) => String(item || '').trim()));
  return allOptions.value.filter((option) => option.code && !existing.has(option.code));
});

const dirtyCellCount = computed(() => {
  let count = 0;
  (props.rows || []).forEach((row) => {
    (props.quotaCodes || []).forEach((code) => {
      if (isCellDirty(row, code)) count += 1;
    });
  });
  return count;
});

function baselineValue(groupCode, quotaCode) {
  const groupBaseline = props.baseline?.[groupCode];
  if (!groupBaseline || groupBaseline[quotaCode] === undefined) return 0;
  return normalizeQuotaValue(groupBaseline[quotaCode]);
}

function isCellDirty(row, quotaCode) {
  return normalizeQuotaValue(row?.values?.[quotaCode] ?? 0) !== baselineValue(row?.groupCode, quotaCode);
}

function readCellValue(row, quotaCode) {
  const value = normalizeQuotaValue(row?.values?.[quotaCode] ?? 0);
  return value === UNLIMITED_QUOTA_VALUE ? 0 : value;
}

function isUnlimited(row, quotaCode) {
  return normalizeQuotaValue(row?.values?.[quotaCode] ?? 0) === UNLIMITED_QUOTA_VALUE;
}

function cellKey(row, quotaCode) {
  return `${row?.groupCode || ''}::${quotaCode}`;
}

function readCellUnit(row, quotaCode) {
  const chosen = cellUnitChoice[cellKey(row, quotaCode)];
  if (chosen) return chosen;
  return readCellValue(row, quotaCode) >= GB ? 'GB' : 'MB';
}

function readBytesDisplayValue(row, quotaCode) {
  const bytes = readCellValue(row, quotaCode);
  const divisor = readCellUnit(row, quotaCode) === 'GB' ? GB : MB;
  const value = bytes / divisor;
  return Math.round(value * 100) / 100;
}

function onUnlimitedToggle(row, quotaCode, checked) {
  if (checked) {
    emit('updateCell', { groupCode: row.groupCode, quotaCode, value: UNLIMITED_QUOTA_VALUE });
    return;
  }
  // 关闭无限后回退到基线值（若基线也是无限则回退为 0）。
  const fallback = baselineValue(row.groupCode, quotaCode);
  emit('updateCell', {
    groupCode: row.groupCode,
    quotaCode,
    value: fallback === UNLIMITED_QUOTA_VALUE ? 0 : fallback
  });
}

function onCountInput(row, quotaCode, rawValue) {
  const numeric = Number(rawValue);
  const value = Number.isFinite(numeric) && numeric > 0 ? Math.floor(numeric) : 0;
  emit('updateCell', { groupCode: row.groupCode, quotaCode, value });
}

function onBytesInput(row, quotaCode, rawValue) {
  const numeric = Number(rawValue);
  const divisor = readCellUnit(row, quotaCode) === 'GB' ? GB : MB;
  const bytes = Number.isFinite(numeric) && numeric > 0 ? Math.round(numeric * divisor) : 0;
  emit('updateCell', { groupCode: row.groupCode, quotaCode, value: bytes });
}

function onUnitChange(row, quotaCode, unit) {
  cellUnitChoice[cellKey(row, quotaCode)] = unit === 'GB' ? 'GB' : 'MB';
}

function onAddCatalogQuota(event) {
  const target = event?.target;
  const code = String(target?.value || '').trim();
  if (!code) return;
  target.value = '';
  emit('addCatalogQuota', code);
}
</script>

<style scoped>
.panel-grid {
  display: grid;
  gap: 12px;
}

.adm-toolbar-spacer {
  flex: 1;
}

.advanced-block {
  border-radius: 10px;
  padding: 10px;
  border: 1px dashed var(--theme-border-strong);
  display: grid;
  gap: 8px;
}

.quota-table {
  min-width: 720px;
}

.quota-sticky-col {
  position: sticky;
  left: 0;
  z-index: 1;
  background: var(--adm-thead-bg);
  backdrop-filter: blur(10px);
  -webkit-backdrop-filter: blur(10px);
  min-width: 150px;
}

.quota-table thead .quota-sticky-col {
  z-index: 3;
}

.quota-group-cell {
  display: grid;
  gap: 6px;
  justify-items: start;
}

.quota-col-head {
  display: grid;
  gap: 4px;
}

.quota-col-label {
  font-size: 13px;
  color: var(--theme-text-primary);
}

.quota-col-meta {
  display: flex;
  gap: 6px;
  align-items: center;
  flex-wrap: wrap;
  font-weight: 400;
}

.quota-num-input {
  width: 96px;
}

.quota-unit-select {
  min-width: 64px;
}

.quota-cell-dirty {
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.55);
  border-radius: 8px;
}
</style>
