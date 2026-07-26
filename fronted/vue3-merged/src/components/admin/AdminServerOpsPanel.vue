<template>
  <section class="ops-panel">
    <header class="ops-head">
      <div>
        <h2>Server Ops</h2>
        <p>Review Meguri Pet, middleware health and core containers here, then jump into 1Panel for deeper server management.</p>
      </div>
      <div class="ops-head-actions">
        <AdminRefreshButton :busy="loadingOverview" @click="$emit('refreshOverview')">Refresh overview</AdminRefreshButton>
        <AdminRefreshButton :busy="loadingContainers" @click="$emit('refreshContainers')">Refresh containers</AdminRefreshButton>
        <a
          v-if="portalUrl"
          class="primary-btn ripple-trigger portal-link"
          :href="portalUrl"
          target="_blank"
          rel="noopener noreferrer"
        >
          Open 1Panel
        </a>
        <button v-else class="primary-btn ripple-trigger" type="button" disabled>
          1Panel URL unavailable
        </button>
      </div>
    </header>

    <p v-if="error" class="error-text">{{ error }}</p>
    <p v-if="actionReceipt" class="state-tip">{{ actionReceipt }}</p>
    <p v-if="actionError" class="error-text">{{ actionError }}</p>

    <section class="kpi-grid">
      <article class="kpi-card admin-card">
        <span>Meting</span>
        <strong :class="{ ok: metingAvailable, bad: !metingAvailable }">{{ metingAvailable ? 'Ready' : 'Offline' }}</strong>
        <small>providers: {{ metingProviders.length ? metingProviders.join(', ') : '-' }}</small>
      </article>
      <article class="kpi-card admin-card">
        <span>Container API</span>
        <strong :class="{ ok: portainerReachable, bad: !portainerReachable }">{{ portainerReachable ? 'Reachable' : 'Fallback' }}</strong>
        <small>{{ portainerMessage || '-' }}</small>
      </article>
      <article class="kpi-card admin-card">
        <span>Containers</span>
        <strong>{{ containerTotal }}</strong>
        <small>running: {{ containerRunning }} / stopped: {{ containerStopped }}</small>
      </article>
    </section>

    <section class="meguri-card admin-card" data-testid="meguri-card">
      <header class="meguri-head">
        <div>
          <h3>Meguri Pet</h3>
          <p class="cell-sub">{{ meguriContainerName || 'meguri-pet' }}</p>
        </div>
        <div class="meguri-head-actions">
          <AdminRefreshButton :busy="meguriLoading" @click="$emit('refreshMeguri')">Refresh Meguri</AdminRefreshButton>
        </div>
      </header>
      <div class="meguri-grid">
        <article class="meguri-cell">
          <span>Container</span>
          <template v-if="meguriContainerFound">
            <strong>
              <span class="state-pill" :class="meguriRunning ? 'state-pill--running' : 'state-pill--stopped'">
                {{ meguri?.state || '-' }}
              </span>
            </strong>
            <small>{{ meguri?.status || '-' }}</small>
          </template>
          <template v-else>
            <strong class="bad-text">Not found</strong>
            <small>No container named {{ meguriContainerName || 'meguri-pet' }} on this host</small>
          </template>
        </article>
        <article class="meguri-cell">
          <span>Telemetry</span>
          <template v-if="meguriMetricsPresent">
            <strong :class="meguriMetricsStale ? 'bad-text' : 'ok-text'">
              {{ meguriMetricsStale ? 'Stale' : 'Fresh' }}
            </strong>
            <small>prompt-cache snapshot {{ formatAge(meguriMetricsAgeSeconds) }} ago</small>
          </template>
          <template v-else>
            <strong class="bad-text">None</strong>
            <small>No prompt-cache snapshot received yet</small>
          </template>
        </article>
        <article class="meguri-cell">
          <span>Health</span>
          <template v-if="meguriHealth">
            <strong :class="meguriHealth.healthy ? 'ok-text' : 'bad-text'">
              {{ meguriHealth.healthy ? 'Healthy' : 'Unhealthy' }}
            </strong>
            <small>{{ meguriHealth.message || '-' }} ({{ meguriHealth.latencyMs }}ms)</small>
          </template>
          <template v-else>
            <strong>-</strong>
            <small>No health URL configured (MEGURI_PET_HEALTH_URL)</small>
          </template>
        </article>
        <article class="meguri-cell meguri-cell--actions">
          <span>Actions</span>
          <div class="inline-actions">
            <button
              class="mini-btn ripple-trigger"
              type="button"
              data-action="meguri-start"
              :disabled="!meguriActionable || isActionBusy(meguri?.containerId)"
              @click="emitMeguriAction('start')"
            >
              Start
            </button>
            <button
              class="mini-btn ripple-trigger"
              type="button"
              data-action="meguri-stop"
              :disabled="!meguriActionable || isActionBusy(meguri?.containerId)"
              @click="emitMeguriAction('stop')"
            >
              Stop
            </button>
            <button
              class="mini-btn ripple-trigger"
              type="button"
              data-action="meguri-restart"
              :disabled="!meguriActionable || isActionBusy(meguri?.containerId)"
              @click="emitMeguriAction('restart')"
            >
              Restart
            </button>
            <button
              class="mini-btn ripple-trigger"
              type="button"
              data-action="meguri-logs"
              :disabled="!meguriContainerFound"
              @click="emitMeguriLogs()"
            >
              Logs
            </button>
          </div>
          <p v-if="meguriContainerFound && !meguriManageable" class="cell-sub">Read-only here</p>
        </article>
      </div>
    </section>

    <section class="services-block">
      <header class="services-head">
        <h3>Service Health</h3>
        <AdminRefreshButton :busy="servicesLoading" @click="$emit('refreshServices')">Probe services</AdminRefreshButton>
      </header>
      <div v-if="!services.length && !servicesLoading" class="state-tip">
        No service health targets are configured.
      </div>
      <div v-else class="services-grid">
        <article
          v-for="item in services"
          :key="item.name"
          class="service-card admin-card"
          :data-testid="`service-${item.name}`"
        >
          <span>{{ item.name }}</span>
          <strong :class="item.healthy ? 'ok-text' : 'bad-text'">{{ item.healthy ? 'Healthy' : 'Down' }}</strong>
          <small>{{ item.message || '-' }} · {{ item.latencyMs }}ms</small>
        </article>
      </div>
    </section>

    <div v-if="!containers.length && !loadingContainers" class="state-tip">
      No containers are available right now, or the container API is offline.
    </div>

    <div class="table-wrap">
      <table class="admin-table">
        <thead>
          <tr>
            <th>Container</th>
            <th>Image</th>
            <th>State</th>
            <th>Ports</th>
            <th>Actions</th>
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
                  :disabled="item.manageable !== true || isActionBusy(item.containerId)"
                  @click="emitAction(item, 'start')"
                >
                  {{ busyLabel(item.containerId, 'start') }}
                </button>
                <button
                  class="mini-btn ripple-trigger"
                  type="button"
                  data-action="stop"
                  :disabled="item.manageable !== true || isActionBusy(item.containerId)"
                  @click="emitAction(item, 'stop')"
                >
                  {{ busyLabel(item.containerId, 'stop') }}
                </button>
                <button
                  class="mini-btn ripple-trigger"
                  type="button"
                  data-action="restart"
                  :disabled="item.manageable !== true || isActionBusy(item.containerId)"
                  @click="emitAction(item, 'restart')"
                >
                  {{ busyLabel(item.containerId, 'restart') }}
                </button>
                <button
                  class="mini-btn ripple-trigger"
                  type="button"
                  data-action="logs"
                  @click="emitLogs(item)"
                >
                  Logs
                </button>
              </div>
              <p v-if="item.manageable !== true" class="cell-sub">Read-only here</p>
            </td>
          </tr>
        </tbody>
      </table>
    </div>

    <div v-if="logsOpen" class="logs-overlay admin-dialog-mask" data-testid="logs-overlay" @click.self="$emit('closeLogs')">
      <div class="logs-dialog admin-dialog">
        <header class="logs-head">
          <div>
            <h3>Container logs</h3>
            <p class="cell-sub">{{ logsTarget?.containerName || logsTarget?.containerId || '-' }}</p>
          </div>
          <div class="logs-head-actions">
            <select
              class="logs-tail-select"
              :value="String(logsTail || 200)"
              @change="onLogsTailChange($event)"
            >
              <option value="100">tail 100</option>
              <option value="200">tail 200</option>
              <option value="500">tail 500</option>
              <option value="1000">tail 1000</option>
            </select>
            <AdminRefreshButton :busy="logsLoading" @click="$emit('refreshLogs', logsTail)">Refresh</AdminRefreshButton>
            <button class="ghost-btn ripple-trigger" type="button" data-action="close-logs" @click="$emit('closeLogs')">
              Close
            </button>
          </div>
        </header>
        <p v-if="logsError" class="error-text">{{ logsError }}</p>
        <div v-if="logsLoading && !logsLines.length" class="state-tip">Loading logs...</div>
        <div v-else-if="!logsLines.length" class="state-tip">No log output.</div>
        <pre v-else class="logs-body" data-testid="logs-body">{{ logsLines.join('\n') }}</pre>
      </div>
    </div>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import AdminRefreshButton from './AdminRefreshButton.vue';

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
  },
  meguri: {
    type: Object,
    default: () => ({})
  },
  meguriLoading: {
    type: Boolean,
    default: false
  },
  services: {
    type: Array,
    default: () => []
  },
  servicesLoading: {
    type: Boolean,
    default: false
  },
  logsOpen: {
    type: Boolean,
    default: false
  },
  logsLoading: {
    type: Boolean,
    default: false
  },
  logsError: {
    type: String,
    default: ''
  },
  logsTarget: {
    type: Object,
    default: () => ({})
  },
  logsLines: {
    type: Array,
    default: () => []
  },
  logsTail: {
    type: Number,
    default: 200
  }
});

const emit = defineEmits([
  'refreshOverview',
  'refreshContainers',
  'action',
  'refreshMeguri',
  'refreshServices',
  'showLogs',
  'closeLogs',
  'refreshLogs'
]);

const portalUrl = computed(() => String(props.overview?.portalUrl || '').trim());
const metingAvailable = computed(() => props.overview?.meting?.available === true);
const metingProviders = computed(() => (Array.isArray(props.overview?.meting?.providers) ? props.overview.meting.providers : []));
const portainerReachable = computed(() => props.overview?.portainerReachable === true);
const portainerMessage = computed(() => String(props.overview?.portainerMessage || '').trim());
const containerTotal = computed(() => Number(props.overview?.containerTotal || 0));
const containerRunning = computed(() => Number(props.overview?.containerRunning || 0));
const containerStopped = computed(() => Number(props.overview?.containerStopped || 0));

const meguriContainerFound = computed(() => props.meguri?.containerFound === true);
const meguriContainerName = computed(() => String(props.meguri?.containerName || '').trim());
const meguriRunning = computed(() => props.meguri?.running === true);
const meguriManageable = computed(() => props.meguri?.manageable === true);
const meguriActionable = computed(() => meguriContainerFound.value && meguriManageable.value);
const meguriMetricsPresent = computed(() => props.meguri?.metricsPresent === true);
const meguriMetricsStale = computed(() => props.meguri?.metricsStale === true);
const meguriMetricsAgeSeconds = computed(() => Number(props.meguri?.metricsAgeSeconds || 0));
const meguriHealth = computed(() => {
  const health = props.meguri?.health;
  return health && typeof health === 'object' && String(health.url || '').trim() ? health : null;
});

function emitMeguriAction(action) {
  if (!meguriActionable.value) return;
  emit('action', {
    containerId: String(props.meguri?.containerId || ''),
    containerName: String(props.meguri?.containerName || ''),
    action
  });
}

function emitMeguriLogs() {
  if (!meguriContainerFound.value) return;
  emit('showLogs', {
    containerId: String(props.meguri?.containerId || ''),
    containerName: String(props.meguri?.containerName || '')
  });
}

function emitLogs(item) {
  emit('showLogs', {
    containerId: String(item?.containerId || ''),
    containerName: String(item?.containerName || '')
  });
}

function onLogsTailChange(event) {
  const tail = Number(event?.target?.value || 200);
  emit('refreshLogs', Number.isFinite(tail) && tail > 0 ? tail : 200);
}

function formatAge(rawSeconds) {
  const seconds = Math.max(0, Number(rawSeconds) || 0);
  if (seconds < 60) return `${seconds}s`;
  if (seconds < 3600) return `${Math.floor(seconds / 60)}m ${seconds % 60}s`;
  return `${Math.floor(seconds / 3600)}h ${Math.floor((seconds % 3600) / 60)}m`;
}

function emitAction(item, action) {
  if (item?.manageable !== true) return;
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
    if (action === 'start') return 'Start';
    if (action === 'stop') return 'Stop';
    return 'Restart';
  }
  return String(props.activeAction || '').toLowerCase() === action ? 'Running...' : 'Pending...';
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
  color: var(--admin-text);
}

.ops-head p {
  margin: 6px 0 0;
  color: var(--admin-text-soft);
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
  padding: 12px 14px;
  display: grid;
  gap: 6px;
}

.kpi-card span {
  color: var(--admin-text-soft);
  font-size: 12px;
}

.kpi-card strong {
  font-size: 20px;
  color: var(--admin-text);
}

.kpi-card strong.ok {
  color: var(--admin-ok);
}

.kpi-card strong.bad {
  color: var(--admin-bad);
}

.kpi-card small {
  color: var(--admin-text-faint);
}

.table-wrap {
  overflow: auto;
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
  vertical-align: top;
}

.cell-sub {
  margin: 4px 0 0;
  color: var(--admin-text-faint);
  font-size: 12px;
}

.inline-actions {
  display: flex;
  gap: 6px;
  flex-wrap: wrap;
}

.primary-btn,
.ghost-btn,
.mini-btn {
  min-height: 34px;
  padding: 0 12px;
  border-radius: 10px;
}

.meguri-card {
  padding: 12px 14px;
  display: grid;
  gap: 10px;
}

.meguri-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 10px;
  flex-wrap: wrap;
}

.meguri-head h3 {
  margin: 0;
  color: var(--admin-text);
}

.meguri-grid {
  display: grid;
  gap: 10px;
  grid-template-columns: repeat(4, minmax(0, 1fr));
}

.meguri-cell {
  display: grid;
  gap: 6px;
  align-content: start;
}

.meguri-cell > span {
  color: var(--admin-text-soft);
  font-size: 12px;
}

.meguri-cell strong {
  font-size: 16px;
  color: var(--admin-text);
}

.meguri-cell small {
  color: var(--admin-text-faint);
}

.services-block {
  display: grid;
  gap: 8px;
}

.services-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  flex-wrap: wrap;
}

.services-head h3 {
  margin: 0;
  color: var(--admin-text);
}

.services-grid {
  display: grid;
  gap: 10px;
  grid-template-columns: repeat(4, minmax(0, 1fr));
}

.service-card {
  padding: 10px 12px;
  display: grid;
  gap: 4px;
}

.service-card span {
  color: var(--admin-text-soft);
  font-size: 12px;
  word-break: break-all;
}

.service-card strong {
  font-size: 15px;
}

.service-card small {
  color: var(--admin-text-faint);
  word-break: break-word;
}

.logs-overlay {
  padding: 20px;
  z-index: 1200;
}

.logs-dialog {
  padding: 14px;
  width: min(960px, 100%);
  max-height: min(80vh, 720px);
  display: grid;
  grid-template-rows: auto auto 1fr;
  gap: 10px;
}

.logs-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 10px;
  flex-wrap: wrap;
}

.logs-head h3 {
  margin: 0;
  color: var(--admin-text);
}

.logs-head-actions {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.logs-tail-select {
  min-height: 34px;
  padding: 0 10px;
}

.logs-body {
  margin: 0;
  overflow: auto;
  border-radius: 10px;
  padding: 10px;
  background: var(--admin-surface-deep);
  box-shadow: inset 0 0 0 1px var(--admin-border);
  color: var(--admin-text);
  font-size: 12px;
  line-height: 1.55;
  white-space: pre-wrap;
  word-break: break-word;
}

@media (max-width: 1080px) {
  .kpi-grid {
    grid-template-columns: 1fr;
  }

  .meguri-grid,
  .services-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}

@media (max-width: 640px) {
  .meguri-grid,
  .services-grid {
    grid-template-columns: 1fr;
  }
}
</style>
