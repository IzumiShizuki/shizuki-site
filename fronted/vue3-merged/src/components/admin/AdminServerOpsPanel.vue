<template>
  <section class="ops-panel">
    <header class="ops-head">
      <div>
        <h2>Server Ops</h2>
        <p>统一查看 meting 与核心容器状态，并在后台执行常用运维动作。</p>
      </div>
      <div class="ops-head-actions">
        <button class="ghost-btn ripple-trigger" type="button" :disabled="loadingOverview" @click="$emit('refreshOverview')">
          {{ loadingOverview ? '加载概览中...' : '刷新概览' }}
        </button>
        <button class="ghost-btn ripple-trigger" type="button" :disabled="loadingContainers" @click="$emit('refreshContainers')">
          {{ loadingContainers ? '加载容器中...' : '刷新容器' }}
        </button>
        <a
          v-if="portalUrl"
          class="primary-btn ripple-trigger portal-link"
          :href="portalUrl"
          target="_blank"
          rel="noopener noreferrer"
        >
          打开 Portainer 控制台
        </a>
        <button v-else class="primary-btn ripple-trigger" type="button" disabled>
          Portainer 地址未配置
        </button>
      </div>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>
    <p v-if="actionReceipt" class="state-tip">{{ actionReceipt }}</p>
    <p v-if="actionError" class="error-text">{{ actionError }}</p>

    <section class="kpi-grid">
      <article class="kpi-card liquid-material">
        <span>Meting</span>
        <strong :class="{ ok: metingAvailable, bad: !metingAvailable }">{{ metingAvailable ? '可用' : '不可用' }}</strong>
        <small>providers: {{ metingProviders.length ? metingProviders.join(', ') : '-' }}</small>
      </article>
      <article class="kpi-card liquid-material">
        <span>Portainer</span>
        <strong :class="{ ok: portainerReachable, bad: !portainerReachable }">{{ portainerReachable ? '可达' : '降级' }}</strong>
        <small>{{ portainerMessage || '-' }}</small>
      </article>
      <article class="kpi-card liquid-material">
        <span>容器总数</span>
        <strong>{{ containerTotal }}</strong>
        <small>running: {{ containerRunning }} / stopped: {{ containerStopped }}</small>
      </article>
    </section>

    <div v-if="!containers.length && !loadingContainers" class="state-tip">
      暂无可管理容器，或当前 Portainer 不可达。
    </div>

    <div class="table-wrap">
      <table class="admin-table">
        <thead>
          <tr>
            <th>容器</th>
            <th>镜像</th>
            <th>状态</th>
            <th>端口</th>
            <th>操作</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="item in containers" :key="item.containerId">
            <td>
              <strong>{{ item.containerName || item.containerId }}</strong>
              <p class="cell-sub">{{ item.containerId }}</p>
            </td>
            <td>
              <span>{{ item.image || '-' }}</span>
            </td>
            <td>
              <span class="state-pill" :class="item.running ? 'state-pill--running' : 'state-pill--stopped'">
                {{ item.state || '-' }}
              </span>
              <p class="cell-sub">{{ item.status || '-' }}</p>
            </td>
            <td>{{ formatPorts(item.ports) }}</td>
            <td>
              <div class="inline-actions">
                <button
                  class="mini-btn ripple-trigger"
                  type="button"
                  data-action="start"
                  :disabled="isActionBusy(item.containerId)"
                  @click="emitAction(item, 'start')"
                >
                  {{ busyLabel(item.containerId, 'start') }}
                </button>
                <button
                  class="mini-btn ripple-trigger"
                  type="button"
                  data-action="stop"
                  :disabled="isActionBusy(item.containerId)"
                  @click="emitAction(item, 'stop')"
                >
                  {{ busyLabel(item.containerId, 'stop') }}
                </button>
                <button
                  class="mini-btn ripple-trigger"
                  type="button"
                  data-action="restart"
                  :disabled="isActionBusy(item.containerId)"
                  @click="emitAction(item, 'restart')"
                >
                  {{ busyLabel(item.containerId, 'restart') }}
                </button>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </section>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  loadingOverview: {
    type: Boolean,
    default: false
  },
  loadingContainers: {
    type: Boolean,
    default: false
  },
  mutating: {
    type: Boolean,
    default: false
  },
  activeContainerId: {
    type: String,
    default: ''
  },
  activeAction: {
    type: String,
    default: ''
  },
  actionReceipt: {
    type: String,
    default: ''
  },
  actionError: {
    type: String,
    default: ''
  },
  error: {
    type: String,
    default: ''
  },
  overview: {
    type: Object,
    default: () => ({})
  },
  containers: {
    type: Array,
    default: () => []
  }
});

const emit = defineEmits(['refreshOverview', 'refreshContainers', 'action']);

const portalUrl = computed(() => String(props.overview?.portalUrl || '').trim());
const metingAvailable = computed(() => props.overview?.meting?.available === true);
const metingProviders = computed(() => (Array.isArray(props.overview?.meting?.providers) ? props.overview.meting.providers : []));
const portainerReachable = computed(() => props.overview?.portainerReachable === true);
const portainerMessage = computed(() => String(props.overview?.portainerMessage || '').trim());
const containerTotal = computed(() => Number(props.overview?.containerTotal || 0));
const containerRunning = computed(() => Number(props.overview?.containerRunning || 0));
const containerStopped = computed(() => Number(props.overview?.containerStopped || 0));

function emitAction(item, action) {
  emit('action', {
    containerId: String(item?.containerId || ''),
    containerName: String(item?.containerName || ''),
    action
  });
}

function isActionBusy(containerId) {
  if (!props.mutating) return false;
  return String(containerId || '') === String(props.activeContainerId || '');
}

function busyLabel(containerId, action) {
  if (!isActionBusy(containerId)) {
    if (action === 'start') return '启动';
    if (action === 'stop') return '停止';
    return '重启';
  }
  return String(props.activeAction || '').toLowerCase() === action ? '执行中...' : '等待中...';
}

function formatPorts(ports) {
  if (!Array.isArray(ports) || !ports.length) return '-';
  return ports.join(', ');
}
</script>

<style scoped>
.ops-panel {
  display: grid;
  gap: 12px;
}

.ops-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 12px;
  flex-wrap: wrap;
}

.ops-head h2 {
  margin: 0;
  color: rgba(236, 245, 255, 0.96);
}

.ops-head p {
  margin: 6px 0 0;
  color: rgba(205, 222, 243, 0.82);
}

.ops-head-actions {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.portal-link {
  text-decoration: none;
}

.kpi-grid {
  display: grid;
  gap: 10px;
  grid-template-columns: repeat(3, minmax(0, 1fr));
}

.kpi-card {
  --liquid-bg: rgba(20, 27, 42, 0.36);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 12px;
  padding: 12px;
  display: grid;
  gap: 6px;
}

.kpi-card span {
  color: rgba(205, 222, 243, 0.82);
  font-size: 12px;
}

.kpi-card strong {
  font-size: 20px;
  color: rgba(236, 245, 255, 0.96);
}

.kpi-card strong.ok {
  color: rgba(128, 245, 191, 0.94);
}

.kpi-card strong.bad {
  color: rgba(255, 178, 192, 0.94);
}

.kpi-card small {
  color: rgba(190, 209, 232, 0.8);
}

.table-wrap {
  border-radius: 12px;
  overflow: auto;
  box-shadow: inset 0 0 0 1px rgba(175, 198, 228, 0.18);
}

.admin-table {
  width: 100%;
  border-collapse: collapse;
  min-width: 920px;
}

.admin-table th,
.admin-table td {
  text-align: left;
  padding: 10px 8px;
  border-bottom: 1px solid rgba(180, 203, 232, 0.14);
  color: rgba(232, 241, 253, 0.92);
  vertical-align: top;
}

.admin-table th {
  color: rgba(194, 218, 245, 0.92);
  background: rgba(11, 18, 29, 0.36);
}

.cell-sub {
  margin: 4px 0 0;
  color: rgba(184, 204, 230, 0.78);
  font-size: 12px;
}

.state-pill {
  display: inline-flex;
  align-items: center;
  padding: 0 8px;
  min-height: 24px;
  border-radius: 999px;
  font-size: 12px;
}

.state-pill--running {
  background: rgba(102, 226, 173, 0.22);
  color: rgba(173, 252, 214, 0.95);
}

.state-pill--stopped {
  background: rgba(255, 132, 164, 0.2);
  color: rgba(255, 191, 208, 0.95);
}

.inline-actions {
  display: flex;
  gap: 6px;
  flex-wrap: wrap;
}

.primary-btn,
.ghost-btn,
.mini-btn {
  border: 0;
  border-radius: 10px;
  min-height: 34px;
  padding: 0 12px;
  color: rgba(242, 247, 255, 0.94);
}

.primary-btn {
  background: rgba(var(--accent-rgb), 0.34);
}

.ghost-btn,
.mini-btn {
  background: rgba(255, 255, 255, 0.18);
}

.state-tip {
  color: rgba(208, 226, 248, 0.88);
}

.error-text {
  color: rgba(255, 168, 184, 0.94);
}

@media (max-width: 1080px) {
  .kpi-grid {
    grid-template-columns: 1fr;
  }
}
</style>
