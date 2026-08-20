<template>
  <Transition name="pairing-toast">
    <aside
      v-if="panelVisible"
      class="desktop-pairing-prompt"
      data-desktop-interactive
      role="dialog"
      aria-live="polite"
      aria-labelledby="desktop-pairing-title"
    >
      <div class="pairing-heading">
        <span class="pairing-mark"><i class="fas fa-link" /></span>
        <div>
          <small>{{ activeRequest ? '设备配对' : '设备授权' }}</small>
          <h2 id="desktop-pairing-title">{{ activeRequest?.clientName || '已配对的客户端' }}</h2>
        </div>
        <button v-if="!activeRequest" class="pairing-close" type="button" aria-label="关闭" @click="managerVisible = false">
          <i class="fas fa-xmark" />
        </button>
      </div>

      <p v-if="activeRequest">正在请求控制 Shizuki。只开启你愿意交给它的能力。</p>
      <div v-if="activeRequest" class="pairing-capabilities">
        <label v-for="capability in activeRequest.requestedCapabilities" :key="capability">
          <input
            type="checkbox"
            :checked="selectedCapabilities.includes(capability)"
            :disabled="busy"
            @change="toggleCapability(capability)"
          />
          <span>{{ capabilityLabel(capability) }}</span>
          <code>{{ capability }}</code>
        </label>
      </div>

      <p v-if="errorMessage" class="pairing-error">{{ errorMessage }}</p>
      <div v-if="activeRequest" class="pairing-actions">
        <button type="button" class="secondary" :disabled="busy" @click="reject">拒绝</button>
        <button type="button" :disabled="busy || !selectedCapabilities.length" @click="approve">
          {{ busy ? '处理中…' : '允许配对' }}
        </button>
      </div>

      <div v-else class="pairing-manager">
        <p v-if="!activeClients.length" class="pairing-empty">目前没有有效的配对客户端。</p>
        <article v-for="client in activeClients" :key="client.clientId" class="paired-client">
          <div>
            <strong>{{ client.clientName }}</strong>
            <small>{{ client.capabilities.join(' · ') }}</small>
            <small>最近使用：{{ formatTimestamp(client.lastAuthenticatedAt || client.createdAt) }}</small>
          </div>
          <button type="button" :disabled="busy" @click="revoke(client.clientId)">撤销</button>
        </article>
        <details v-if="audit.length" class="pairing-audit">
          <summary>最近活动（{{ audit.length }}）</summary>
          <ol>
            <li v-for="entry in audit.slice(0, 8)" :key="entry.id">
              <span>{{ auditLabel(entry.type) }}</span>
              <time>{{ formatTimestamp(entry.at) }}</time>
            </li>
          </ol>
        </details>
      </div>
    </aside>
  </Transition>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';

const capabilityLabels = Object.freeze({
  'app.navigation': '打开应用与页面',
  'window.control': '控制窗口',
  'music.control': '控制音乐播放',
  'desktop.read': '读取桌面状态',
  'desktop.layout': '调整桌面布局',
  'desktop.appearance': '修改桌面外观'
});

const pending = ref([]);
const clients = ref([]);
const audit = ref([]);
const selectedCapabilities = ref([]);
const activeRequestId = ref('');
const busy = ref(false);
const errorMessage = ref('');
const managerVisible = ref(false);
let pollTimer = 0;
let polling = false;

const activeRequest = computed(() => pending.value[0] || null);
const activeClients = computed(() => clients.value.filter(client => !client.revokedAt));
const panelVisible = computed(() => Boolean(activeRequest.value || managerVisible.value));

function capabilityLabel(capability) {
  return capabilityLabels[capability] || capability;
}

function syncSelection() {
  const request = activeRequest.value;
  if (!request) {
    activeRequestId.value = '';
    selectedCapabilities.value = [];
    return;
  }
  if (request.requestId !== activeRequestId.value) {
    activeRequestId.value = request.requestId;
    selectedCapabilities.value = [...request.requestedCapabilities];
    errorMessage.value = '';
  }
}

async function refresh() {
  if (polling || !window.shizukiDesktop?.getPairingSnapshot) return;
  polling = true;
  try {
    const snapshot = await window.shizukiDesktop.getPairingSnapshot();
    pending.value = Array.isArray(snapshot?.pending) ? snapshot.pending : [];
    clients.value = Array.isArray(snapshot?.clients) ? snapshot.clients : [];
    audit.value = Array.isArray(snapshot?.audit) ? snapshot.audit : [];
    syncSelection();
  } catch (error) {
    errorMessage.value = error?.message || '无法读取配对请求。';
  } finally {
    polling = false;
  }
}

function toggleCapability(capability) {
  selectedCapabilities.value = selectedCapabilities.value.includes(capability)
    ? selectedCapabilities.value.filter(item => item !== capability)
    : [...selectedCapabilities.value, capability];
}

async function approve() {
  if (!activeRequest.value || busy.value || !selectedCapabilities.value.length) return;
  busy.value = true;
  errorMessage.value = '';
  try {
    await window.shizukiDesktop.approvePairing(activeRequest.value.requestId, selectedCapabilities.value);
    await refresh();
  } catch (error) {
    errorMessage.value = error?.message || '配对批准失败。';
  } finally {
    busy.value = false;
  }
}

async function reject() {
  if (!activeRequest.value || busy.value) return;
  busy.value = true;
  errorMessage.value = '';
  try {
    await window.shizukiDesktop.rejectPairing(activeRequest.value.requestId);
    await refresh();
  } catch (error) {
    errorMessage.value = error?.message || '拒绝配对失败。';
  } finally {
    busy.value = false;
  }
}

async function revoke(clientId) {
  if (busy.value) return;
  busy.value = true;
  errorMessage.value = '';
  try {
    await window.shizukiDesktop.revokePairedClient(clientId);
    await refresh();
  } catch (error) {
    errorMessage.value = error?.message || '撤销客户端失败。';
  } finally {
    busy.value = false;
  }
}

function formatTimestamp(value) {
  if (!value) return '从未';
  const date = new Date(value);
  return Number.isNaN(date.getTime()) ? '未知' : date.toLocaleString('zh-CN', { hour12: false });
}

function auditLabel(type) {
  return ({
    'pairing.requested': '请求配对',
    'pairing.approved': '批准配对',
    'pairing.rejected': '拒绝配对',
    'pairing.expired': '请求过期',
    'pairing.revoked': '撤销客户端',
    'capability.denied': '拒绝越权操作'
  })[type] || type;
}

function openManager() {
  managerVisible.value = true;
  void refresh();
}

onMounted(() => {
  void refresh();
  pollTimer = window.setInterval(() => void refresh(), 2000);
  window.addEventListener('shizuki-desktop-open-pairing-manager', openManager);
});

onBeforeUnmount(() => {
  window.clearInterval(pollTimer);
  window.removeEventListener('shizuki-desktop-open-pairing-manager', openManager);
});
</script>

<style scoped>
.desktop-pairing-prompt {
  position: fixed;
  right: 22px;
  bottom: 22px;
  z-index: 4200;
  width: min(360px, calc(100vw - 32px));
  padding: 18px;
  border: 1px solid rgba(255, 255, 255, 0.32);
  border-radius: 22px;
  color: rgba(255, 255, 255, 0.94);
  background: linear-gradient(145deg, rgba(29, 25, 47, 0.92), rgba(19, 24, 42, 0.86));
  box-shadow: 0 20px 60px rgba(8, 8, 18, 0.36);
  backdrop-filter: blur(24px) saturate(145%);
  -webkit-backdrop-filter: blur(24px) saturate(145%);
  pointer-events: auto;
}

.pairing-heading {
  display: flex;
  align-items: center;
  gap: 12px;
}

.pairing-mark {
  display: grid;
  width: 42px;
  height: 42px;
  place-items: center;
  border-radius: 14px;
  color: #2c203b;
  background: linear-gradient(135deg, #ffc2ae, #bbaaff);
}

.pairing-heading small,
.pairing-heading h2,
.desktop-pairing-prompt p {
  margin: 0;
}

.pairing-heading small {
  color: rgba(255, 255, 255, 0.6);
}

.pairing-heading h2 {
  margin-top: 2px;
  font-size: 1.05rem;
}

.pairing-close {
  width: 34px;
  height: 34px;
  margin-left: auto;
  border: 0;
  border-radius: 11px;
  color: rgba(255, 255, 255, 0.75);
  background: rgba(255, 255, 255, 0.08);
  cursor: pointer;
}

.desktop-pairing-prompt > p {
  margin-top: 14px;
  color: rgba(255, 255, 255, 0.72);
  font-size: 0.88rem;
  line-height: 1.55;
}

.pairing-capabilities {
  display: grid;
  gap: 8px;
  margin-top: 14px;
}

.pairing-capabilities label {
  display: grid;
  grid-template-columns: 18px 1fr;
  gap: 2px 9px;
  align-items: center;
  padding: 9px 10px;
  border-radius: 13px;
  background: rgba(255, 255, 255, 0.07);
  cursor: pointer;
}

.pairing-capabilities input {
  accent-color: #c0aaff;
}

.pairing-capabilities code {
  grid-column: 2;
  color: rgba(255, 255, 255, 0.46);
  font-size: 0.68rem;
}

.pairing-error {
  color: #ffb6b6 !important;
}

.pairing-actions {
  display: flex;
  justify-content: flex-end;
  gap: 9px;
  margin-top: 16px;
}

.pairing-actions button {
  padding: 9px 14px;
  border: 0;
  border-radius: 12px;
  color: #281e37;
  background: linear-gradient(135deg, #ffc3b0, #c1adff);
  font-weight: 700;
  cursor: pointer;
}

.pairing-actions button.secondary {
  color: rgba(255, 255, 255, 0.82);
  background: rgba(255, 255, 255, 0.1);
}

.pairing-actions button:disabled {
  cursor: default;
  opacity: 0.48;
}

.pairing-manager {
  display: grid;
  gap: 10px;
  margin-top: 14px;
}

.pairing-empty {
  padding: 12px;
  border-radius: 13px;
  background: rgba(255, 255, 255, 0.06);
}

.paired-client {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 11px;
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.07);
}

.paired-client > div {
  display: grid;
  min-width: 0;
  flex: 1;
  gap: 3px;
}

.paired-client small {
  overflow: hidden;
  color: rgba(255, 255, 255, 0.52);
  font-size: 0.68rem;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.paired-client button {
  border: 0;
  border-radius: 10px;
  padding: 7px 10px;
  color: #ffc2c2;
  background: rgba(255, 117, 117, 0.12);
  cursor: pointer;
}

.pairing-audit summary {
  padding: 8px 0;
  color: rgba(255, 255, 255, 0.66);
  cursor: pointer;
}

.pairing-audit ol {
  display: grid;
  gap: 5px;
  max-height: 150px;
  margin: 0;
  padding: 8px 0 0;
  overflow: auto;
  list-style: none;
}

.pairing-audit li {
  display: flex;
  justify-content: space-between;
  gap: 10px;
  color: rgba(255, 255, 255, 0.64);
  font-size: 0.72rem;
}

.pairing-audit time {
  color: rgba(255, 255, 255, 0.4);
}

.pairing-toast-enter-active,
.pairing-toast-leave-active {
  transition: opacity 180ms ease, transform 220ms ease;
}

.pairing-toast-enter-from,
.pairing-toast-leave-to {
  opacity: 0;
  transform: translateY(14px) scale(0.97);
}
</style>
