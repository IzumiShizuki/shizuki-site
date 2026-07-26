<template>
  <section class="cache-panel">
    <header class="cache-head">
      <div>
        <h2>Meguri Prompt Cache</h2>
        <p>只展示数值、哈希与运行状态，不保存人物提示词、用户消息、记忆或模型回复。</p>
      </div>
      <AdminRefreshButton :busy="loading" @click="$emit('refresh')">刷新指标</AdminRefreshButton>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>
    <div v-else-if="!available && !loading" class="state-tip">
      暂无上报数据。请配置 Meguri 的导出地址和 Token 文件，并确认本机运行时已产生真实模型调用。
    </div>

    <template v-if="available">
      <div class="status-row">
        <span class="state-pill" :class="stale ? 'state-pill--bad' : 'state-pill--ok'">
          {{ stale ? '数据已过期' : '数据新鲜' }}
        </span>
        <span>接收于 {{ formatDate(receivedAt) }}</span>
        <span>来源 {{ text(metrics.sourceId) }}</span>
        <span>{{ text(metrics.provider) }} / {{ text(metrics.model) }}</span>
      </div>

      <section class="kpi-grid">
        <article class="kpi-card admin-card">
          <span>缓存命中率</span>
          <strong>{{ formatPercent(cacheHitRate) }}</strong>
          <small>命中 {{ formatNumber(metrics.cacheHitTokens) }} / 已上报缓存 Token {{ formatNumber(knownCacheTokens) }}</small>
        </article>
        <article class="kpi-card admin-card">
          <span>缓存命中 Token</span>
          <strong>{{ formatNumber(metrics.cacheHitTokens) }}</strong>
          <small>未命中 {{ formatNumber(metrics.cacheMissTokens) }}</small>
        </article>
        <article class="kpi-card admin-card">
          <span>Prompt Token</span>
          <strong>{{ formatNumber(metrics.promptTokens) }}</strong>
          <small>输出 {{ formatNumber(metrics.outputTokens) }}</small>
        </article>
        <article class="kpi-card admin-card">
          <span>模型调用</span>
          <strong>{{ formatNumber(metrics.totalRequests) }}</strong>
          <small>成功 {{ formatNumber(metrics.successfulRequests) }} / 失败 {{ formatNumber(metrics.failedRequests) }}</small>
        </article>
        <article class="kpi-card admin-card">
          <span>Usage 覆盖率</span>
          <strong>{{ formatPercent(usageCoverageRate) }}</strong>
          <small>{{ formatNumber(metrics.usageReportedRequests) }} 次返回 Token Usage</small>
        </article>
        <article class="kpi-card admin-card">
          <span>人物提示词版本</span>
          <strong class="hash-value">{{ shortHash(metrics.promptSha256) }}</strong>
          <small>{{ formatNumber(metrics.promptCharacters) }} 字符 · {{ text(metrics.cacheMode) }}</small>
        </article>
      </section>

      <section class="detail-grid">
        <article class="detail-card admin-card">
          <header>
            <h3>每日趋势</h3>
            <span>最近 {{ daily.length }} 天</span>
          </header>
          <div v-if="!daily.length" class="state-tip">暂无每日数据</div>
          <div v-for="item in daily" :key="item.date" class="day-row">
            <span>{{ item.date }}</span>
            <div class="bar-track" :title="`hit ${formatNumber(item.cacheHitTokens)} / miss ${formatNumber(item.cacheMissTokens)}`">
              <i class="bar-hit" :style="{ width: `${dayWidth(item.cacheHitTokens)}%` }"></i>
              <i class="bar-miss" :style="{ width: `${dayWidth(item.cacheMissTokens)}%` }"></i>
            </div>
            <strong>{{ formatPercent(dayRate(item)) }}</strong>
          </div>
        </article>

        <article class="detail-card admin-card">
          <header>
            <h3>运行状态</h3>
            <span>{{ formatDate(metrics.collectingSince) }} 起</span>
          </header>
          <dl class="status-list">
            <div><dt>本地持久化</dt><dd>{{ text(metrics.persistenceStatus) }}</dd></div>
            <div><dt>远端导出</dt><dd>{{ text(metrics.exportStatus) }}</dd></div>
            <div><dt>缓存字段上报</dt><dd>{{ formatNumber(metrics.cacheReportedRequests) }} 次</dd></div>
            <div><dt>总 Token</dt><dd>{{ formatNumber(metrics.totalTokens) }}</dd></div>
          </dl>
          <p v-if="metrics.lastPersistenceError" class="error-text">持久化：{{ metrics.lastPersistenceError }}</p>
          <p v-if="metrics.lastExportError" class="error-text">导出：{{ metrics.lastExportError }}</p>
        </article>
      </section>

      <section class="recent-card admin-card">
        <header>
          <h3>最近模型调用</h3>
          <span>仅保留数值，不包含对话内容</span>
        </header>
        <div class="table-wrap">
          <table class="admin-table">
            <thead>
              <tr>
                <th>时间</th>
                <th>用途</th>
                <th>状态</th>
                <th>Prompt</th>
                <th>Hit</th>
                <th>Miss</th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="item in recent" :key="`${item.observedAt}-${item.operation}`">
                <td>{{ formatDate(item.observedAt) }}</td>
                <td>{{ text(item.operation) }}</td>
                <td>{{ item.successful ? (item.cacheReported ? '已上报缓存' : '仅 Usage') : '失败' }}</td>
                <td>{{ formatNumber(item.promptTokens) }}</td>
                <td>{{ formatNumber(item.cacheHitTokens) }}</td>
                <td>{{ formatNumber(item.cacheMissTokens) }}</td>
              </tr>
              <tr v-if="!recent.length">
                <td colspan="6">暂无调用样本</td>
              </tr>
            </tbody>
          </table>
        </div>
      </section>
    </template>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import AdminRefreshButton from './AdminRefreshButton.vue';

const props = defineProps({
  loading: { type: Boolean, default: false },
  error: { type: String, default: '' },
  snapshot: { type: Object, default: () => ({}) }
});

defineEmits(['refresh']);

const available = computed(() => props.snapshot?.available === true);
const stale = computed(() => props.snapshot?.stale !== false);
const receivedAt = computed(() => String(props.snapshot?.receivedAt || ''));
const metrics = computed(() => (props.snapshot?.metrics && typeof props.snapshot.metrics === 'object' ? props.snapshot.metrics : {}));
const daily = computed(() => (Array.isArray(metrics.value.daily) ? metrics.value.daily.slice(-14) : []));
const recent = computed(() => (Array.isArray(metrics.value.recent) ? metrics.value.recent.slice().reverse().slice(0, 30) : []));
const knownCacheTokens = computed(() => number(metrics.value.cacheHitTokens) + number(metrics.value.cacheMissTokens));
const cacheHitRate = computed(() => {
  const explicit = Number(metrics.value.cacheHitRate);
  if (Number.isFinite(explicit)) return explicit;
  return knownCacheTokens.value > 0 ? number(metrics.value.cacheHitTokens) / knownCacheTokens.value : null;
});
const usageCoverageRate = computed(() => {
  const explicit = Number(metrics.value.usageCoverageRate);
  if (Number.isFinite(explicit)) return explicit;
  const total = number(metrics.value.totalRequests);
  return total > 0 ? number(metrics.value.usageReportedRequests) / total : null;
});
const maxDailyCacheTokens = computed(() => Math.max(1, ...daily.value.map((item) => number(item.cacheHitTokens) + number(item.cacheMissTokens))));

function number(value) {
  const parsed = Number(value);
  return Number.isFinite(parsed) ? Math.max(0, parsed) : 0;
}

function text(value) {
  return String(value || '').trim() || '-';
}

function formatNumber(value) {
  return new Intl.NumberFormat('zh-CN').format(number(value));
}

function formatPercent(value) {
  const parsed = Number(value);
  if (!Number.isFinite(parsed)) return '-';
  return `${(Math.max(0, Math.min(1, parsed)) * 100).toFixed(1)}%`;
}

function formatDate(value) {
  const parsed = new Date(String(value || ''));
  return Number.isNaN(parsed.getTime()) ? '-' : parsed.toLocaleString('zh-CN', { hour12: false });
}

function shortHash(value) {
  const hash = String(value || '').trim();
  return hash ? `${hash.slice(0, 10)}…${hash.slice(-6)}` : '-';
}

function dayRate(item) {
  const total = number(item.cacheHitTokens) + number(item.cacheMissTokens);
  return total > 0 ? number(item.cacheHitTokens) / total : null;
}

function dayWidth(value) {
  return Math.max(0, Math.min(100, number(value) / maxDailyCacheTokens.value * 100));
}
</script>

<style scoped>
.cache-panel,
.detail-card,
.recent-card {
  display: grid;
  gap: 12px;
}

.cache-head,
.detail-card > header,
.recent-card > header {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 12px;
  flex-wrap: wrap;
}

h2,
h3,
p {
  margin: 0;
}

.cache-head p,
.detail-card header span,
.recent-card header span,
.status-row {
  color: var(--admin-text-soft);
}

.cache-head p {
  margin-top: 6px;
}

.status-row {
  display: flex;
  gap: 10px;
  align-items: center;
  flex-wrap: wrap;
  font-size: 13px;
}

.kpi-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.kpi-card,
.detail-card,
.recent-card {
  padding: 12px 14px;
}

.kpi-card {
  display: grid;
  gap: 6px;
}

.kpi-card span,
.kpi-card small {
  color: var(--admin-text-soft);
}

.kpi-card strong {
  color: var(--admin-text);
  font-size: 22px;
}

.hash-value {
  font-family: ui-monospace, SFMono-Regular, Menlo, Consolas, monospace;
  font-size: 15px !important;
}

.detail-grid {
  display: grid;
  grid-template-columns: minmax(0, 1.4fr) minmax(260px, 0.6fr);
  gap: 10px;
}

.day-row {
  display: grid;
  grid-template-columns: 92px minmax(100px, 1fr) 58px;
  align-items: center;
  gap: 8px;
  font-size: 12px;
}

.bar-track {
  display: flex;
  height: 8px;
  overflow: hidden;
  border-radius: 999px;
  background: var(--admin-surface-soft);
}

.bar-track i {
  display: block;
  height: 100%;
}

.bar-hit {
  background: rgba(132, 199, 155, 0.9);
}

.bar-miss {
  background: rgba(240, 176, 112, 0.78);
}

.status-list {
  display: grid;
  gap: 8px;
  margin: 0;
}

.status-list div {
  display: flex;
  justify-content: space-between;
  gap: 12px;
}

.status-list dt {
  color: var(--admin-text-soft);
}

.status-list dd {
  margin: 0;
}

.table-wrap {
  overflow: auto;
}

.admin-table {
  width: 100%;
  min-width: 680px;
  border-collapse: collapse;
}

.admin-table th,
.admin-table td {
  padding: 9px 10px;
  text-align: left;
}

@media (max-width: 900px) {
  .kpi-grid,
  .detail-grid {
    grid-template-columns: 1fr;
  }
}
</style>
