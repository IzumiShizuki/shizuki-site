<template>
  <section class="account-sync-panel" aria-labelledby="netease-sync-title">
    <div class="ambient ambient-one" aria-hidden="true"></div>
    <div class="ambient ambient-two" aria-hidden="true"></div>

    <div class="sync-intro">
      <div class="brand-line">
        <span class="brand-mark" aria-hidden="true">
          <span class="brand-note">♪</span>
        </span>
        <div>
          <p class="eyebrow">NETEASE CLOUD LIBRARY</p>
          <p class="brand-name">网易云音乐</p>
        </div>
        <span class="connection-chip" :class="connectionChipClass">
          <span class="connection-dot" aria-hidden="true"></span>
          {{ connectionChipText }}
        </span>
      </div>

      <p class="section-kicker">账号歌单同步</p>
      <h2 id="netease-sync-title">把喜欢的歌单，带到网站电脑端</h2>
      <p class="section-description">
        登录并绑定网易云账号后，可将歌单与歌曲信息同步到本站音乐库，继续在电脑上整理、搜索和播放。
      </p>

      <div v-if="authenticated && isBound" class="bound-account" data-testid="bound-account">
        <span class="bound-icon" aria-hidden="true">✓</span>
        <div>
          <strong>网易云账号已连接</strong>
          <span>{{ boundAccountDescription }}</span>
        </div>
      </div>

      <div class="sync-actions">
        <button
          v-if="!authenticated"
          type="button"
          class="action-button primary-action"
          @click="emit('require-login')"
        >
          登录本站后开始绑定
        </button>
        <template v-else>
          <button
            type="button"
            class="action-button secondary-action"
            :disabled="bindBusy"
            data-testid="bind-button"
            @click="emit('bind', 'netease')"
          >
            <span v-if="bindBusy" class="button-spinner" aria-hidden="true"></span>
            {{ bindActionText }}
          </button>
          <button
            v-if="isBound"
            type="button"
            class="action-button primary-action"
            :disabled="syncBusy"
            data-testid="sync-button"
            @click="emit('sync', 'netease')"
          >
            <span v-if="syncBusy" class="button-spinner" aria-hidden="true"></span>
            {{ syncBusy ? '正在同步歌单…' : '同步歌单到本站' }}
          </button>
        </template>
        <button type="button" class="settings-action" @click="emit('open-settings')">
          音乐源设置
          <span aria-hidden="true">↗</span>
        </button>
      </div>
    </div>

    <aside class="sync-status-card" aria-label="同步状态">
      <div v-if="!authenticated" class="signed-out-state" data-testid="signed-out-state">
        <div class="state-orbit" aria-hidden="true">
          <span>♪</span>
        </div>
        <strong>登录后启用云歌单</strong>
        <p>本站账号用于保存同步后的歌单目录，并在多设备间保留你的音乐库。</p>
      </div>

      <template v-else>
        <div v-if="showBindSession" class="qr-session" data-testid="qr-session">
          <div class="qr-frame">
            <img
              v-if="normalizedSession.qrImage"
              :src="normalizedSession.qrImage"
              alt="网易云音乐账号绑定二维码"
            />
            <div v-else class="qr-placeholder" aria-hidden="true">
              <span>QR</span>
            </div>
            <span class="scan-corner corner-one" aria-hidden="true"></span>
            <span class="scan-corner corner-two" aria-hidden="true"></span>
            <span class="scan-corner corner-three" aria-hidden="true"></span>
            <span class="scan-corner corner-four" aria-hidden="true"></span>
          </div>
          <div class="qr-copy" aria-live="polite">
            <span class="mini-label">手机扫码绑定</span>
            <strong>{{ bindSessionStatusText }}</strong>
            <p>打开网易云音乐 App 扫码，并在手机上确认登录。</p>
            <a
              v-if="normalizedSession.loginUrl && !normalizedSession.qrImage"
              :href="normalizedSession.loginUrl"
              target="_blank"
              rel="noopener noreferrer"
            >
              打开授权页面
            </a>
          </div>
        </div>

        <div v-else class="library-state" :class="{ connected: isBound }">
          <div class="library-stack" aria-hidden="true">
            <span></span>
            <span></span>
            <span></span>
            <b>♫</b>
          </div>
          <div>
            <span class="mini-label">{{ isBound ? 'READY TO SYNC' : 'WAITING TO CONNECT' }}</span>
            <strong>{{ isBound ? '云端歌单已就绪' : '尚未绑定网易云账号' }}</strong>
            <p>
              {{ isBound
                ? '点击同步后，歌单会出现在本站音乐库中。'
                : '点击“扫码绑定”，生成二维码后用手机确认。' }}
            </p>
          </div>
        </div>

        <div v-if="hasSyncResult" class="sync-result" data-testid="sync-result" aria-live="polite">
          <div class="result-heading">
            <span class="result-check" aria-hidden="true">✓</span>
            <div>
              <strong>{{ syncResultTitle }}</strong>
              <span>本次同步结果</span>
            </div>
          </div>
          <dl class="result-grid">
            <div>
              <dt>歌单</dt>
              <dd>{{ resultStats.importedPlaylists }}</dd>
            </div>
            <div>
              <dt>歌曲</dt>
              <dd>{{ resultStats.importedTracks }}</dd>
            </div>
            <div>
              <dt>跳过</dt>
              <dd>{{ resultStats.skippedPlaylists }}</dd>
            </div>
            <div :class="{ warning: resultStats.failedPlaylists > 0 }">
              <dt>失败</dt>
              <dd>{{ resultStats.failedPlaylists }}</dd>
            </div>
          </dl>
        </div>

        <p v-if="errorText" class="sync-error" data-testid="sync-error" role="alert">
          <span aria-hidden="true">!</span>
          {{ errorText }}
        </p>
      </template>
    </aside>

    <footer class="sync-boundary-note">
      <span class="boundary-chip">仅网易云支持账号歌单导入</span>
      <p>
        同步仅保存歌单与歌曲元数据到本站电脑端音乐库；播放时按需获取音频流，
        <strong>不会把音频文件下载到电脑。</strong>
        QQ 音乐与酷狗目前仅用于搜索和按需播放。
      </p>
    </footer>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import {
  normalizeSourceAccountStatus
} from '../../utils/musicAuthorizationState';
import {
  describeMusicSourceQrBindSession,
  normalizeMusicSourceBindSession
} from '../../utils/musicSourceBindSession';

const props = defineProps({
  authenticated: {
    type: Boolean,
    default: false
  },
  account: {
    type: Object,
    default: () => ({})
  },
  session: {
    type: Object,
    default: () => ({})
  },
  bindBusy: {
    type: Boolean,
    default: false
  },
  syncBusy: {
    type: Boolean,
    default: false
  },
  syncResult: {
    type: Object,
    default: null
  },
  errorText: {
    type: String,
    default: ''
  }
});

const emit = defineEmits(['require-login', 'bind', 'sync', 'open-settings']);

const normalizedAccount = computed(() => normalizeSourceAccountStatus(props.account, 'netease'));
const normalizedSession = computed(() => normalizeMusicSourceBindSession(props.session, 'netease'));
const isBound = computed(() => Boolean(normalizedAccount.value.bound));

const showBindSession = computed(() => {
  const raw = props.session || {};
  return Boolean(
    raw.sessionId
    || raw.session_id
    || raw.qrImage
    || raw.qr_image
    || raw.qrStatus
    || raw.qr_status
    || raw.failureReason
    || raw.failure_reason
  );
});

const connectionChipText = computed(() => {
  if (!props.authenticated) return '登录后可用';
  if (isBound.value) return '已绑定';
  if (showBindSession.value) return '绑定中';
  return '未绑定';
});

const connectionChipClass = computed(() => ({
  connected: props.authenticated && isBound.value,
  pending: props.authenticated && !isBound.value && showBindSession.value
}));

const bindActionText = computed(() => {
  if (props.bindBusy) return '正在生成二维码…';
  return isBound.value ? '重新扫码绑定' : '扫码绑定网易云';
});

const boundAccountDescription = computed(() => {
  const mask = String(normalizedAccount.value.mask || '').trim();
  if (mask) return `账号标识 ${mask}`;
  return '可随时重新扫码更新授权';
});

const bindSessionStatusText = computed(() => {
  const status = String(normalizedSession.value.status || '').trim().toUpperCase();
  if (status === 'COMPLETED') return '绑定完成，账号信息正在刷新';
  if (status === 'EXPIRED') return '二维码已过期，请重新扫码绑定';
  if (status === 'FAILED' && !normalizedSession.value.failureReason) return '绑定失败，请重新发起';
  return describeMusicSourceQrBindSession(normalizedSession.value, 'netease');
});

function readCount(source, camelKey, snakeKey) {
  const value = Number(source?.[camelKey] ?? source?.[snakeKey]);
  return Number.isFinite(value) && value > 0 ? Math.floor(value) : 0;
}

const hasSyncResult = computed(() => Boolean(props.syncResult && typeof props.syncResult === 'object'));
const resultStats = computed(() => ({
  importedPlaylists: readCount(props.syncResult, 'importedPlaylists', 'imported_playlists'),
  importedTracks: readCount(props.syncResult, 'importedTracks', 'imported_tracks'),
  skippedPlaylists: readCount(props.syncResult, 'skippedPlaylists', 'skipped_playlists'),
  failedPlaylists: readCount(props.syncResult, 'failedPlaylists', 'failed_playlists')
}));
const syncResultTitle = computed(() => {
  if (resultStats.value.importedPlaylists === 0 && resultStats.value.failedPlaylists > 0) {
    return '同步失败，没有导入歌单';
  }
  if (
    resultStats.value.importedPlaylists === 0
    && resultStats.value.importedTracks === 0
    && resultStats.value.skippedPlaylists === 0
  ) {
    return '没有找到可同步歌单';
  }
  return resultStats.value.failedPlaylists > 0 ? '同步完成，部分歌单需重试' : '歌单同步完成';
});
</script>

<style scoped>
.account-sync-panel {
  --netease-red: #ec4141;
  --netease-deep: #c62f2f;
  position: relative;
  display: grid;
  grid-template-columns: minmax(0, 1.22fr) minmax(280px, 0.78fr);
  gap: 28px;
  overflow: hidden;
  padding: clamp(24px, 3vw, 38px);
  border: 1px solid rgba(131, 68, 68, 0.16);
  border-radius: 28px;
  background:
    linear-gradient(135deg, rgba(255, 255, 255, 0.94), rgba(255, 247, 246, 0.9)),
    #fff;
  box-shadow: 0 24px 70px rgba(66, 27, 27, 0.12);
  color: #2b2727;
  isolation: isolate;
}

.ambient {
  position: absolute;
  z-index: -1;
  border-radius: 999px;
  filter: blur(4px);
  pointer-events: none;
}

.ambient-one {
  width: 340px;
  height: 340px;
  top: -210px;
  left: 28%;
  background: radial-gradient(circle, rgba(236, 65, 65, 0.2), transparent 68%);
}

.ambient-two {
  width: 250px;
  height: 250px;
  right: -120px;
  bottom: -120px;
  background: radial-gradient(circle, rgba(240, 153, 132, 0.22), transparent 68%);
}

.sync-intro,
.sync-status-card,
.sync-boundary-note {
  position: relative;
  z-index: 1;
}

.brand-line {
  display: flex;
  align-items: center;
  gap: 12px;
  margin-bottom: 36px;
}

.brand-mark {
  display: grid;
  place-items: center;
  width: 46px;
  height: 46px;
  border-radius: 50%;
  background: linear-gradient(145deg, #ff5a58, var(--netease-deep));
  box-shadow: 0 10px 24px rgba(198, 47, 47, 0.28);
  color: #fff;
}

.brand-note {
  font-size: 25px;
  font-weight: 800;
  transform: translateY(-1px);
}

.eyebrow,
.brand-name,
.section-kicker,
.section-description,
.sync-status-card p,
.sync-boundary-note p {
  margin: 0;
}

.eyebrow {
  color: #a99595;
  font-size: 10px;
  font-weight: 800;
  letter-spacing: 0.16em;
}

.brand-name {
  margin-top: 2px;
  font-size: 16px;
  font-weight: 750;
}

.connection-chip {
  display: inline-flex;
  align-items: center;
  gap: 7px;
  margin-left: auto;
  padding: 7px 11px;
  border: 1px solid rgba(119, 103, 103, 0.14);
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.66);
  color: #8b7c7c;
  font-size: 12px;
  font-weight: 700;
}

.connection-dot {
  width: 7px;
  height: 7px;
  border-radius: 50%;
  background: #aaa0a0;
}

.connection-chip.connected {
  border-color: rgba(45, 153, 103, 0.16);
  color: #25895c;
}

.connection-chip.connected .connection-dot {
  background: #34b778;
  box-shadow: 0 0 0 4px rgba(52, 183, 120, 0.11);
}

.connection-chip.pending {
  color: #b46b22;
}

.connection-chip.pending .connection-dot {
  background: #ec9d41;
  animation: pulse 1.5s ease-in-out infinite;
}

.section-kicker {
  color: var(--netease-red);
  font-size: 13px;
  font-weight: 800;
  letter-spacing: 0.08em;
}

h2 {
  max-width: 560px;
  margin: 9px 0 14px;
  font-size: clamp(28px, 3vw, 42px);
  line-height: 1.16;
  letter-spacing: -0.035em;
}

.section-description {
  max-width: 610px;
  color: #786c6c;
  font-size: 15px;
  line-height: 1.85;
}

.bound-account {
  display: flex;
  align-items: center;
  gap: 11px;
  width: fit-content;
  margin-top: 22px;
  padding: 10px 14px;
  border: 1px solid rgba(45, 153, 103, 0.13);
  border-radius: 14px;
  background: rgba(234, 250, 242, 0.72);
}

.bound-icon {
  display: grid;
  place-items: center;
  width: 26px;
  height: 26px;
  border-radius: 50%;
  background: #34ad74;
  color: #fff;
  font-size: 13px;
  font-weight: 900;
}

.bound-account div {
  display: grid;
  gap: 2px;
}

.bound-account strong {
  font-size: 13px;
}

.bound-account div span {
  color: #6c8c7c;
  font-size: 11px;
}

.sync-actions {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 10px;
  margin-top: 28px;
}

button {
  font: inherit;
}

.action-button,
.settings-action {
  cursor: pointer;
  transition: transform 160ms ease, box-shadow 160ms ease, opacity 160ms ease, background 160ms ease;
}

.action-button {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
  min-height: 44px;
  padding: 0 18px;
  border-radius: 13px;
  font-size: 13px;
  font-weight: 750;
}

.primary-action {
  border: 1px solid var(--netease-red);
  background: linear-gradient(145deg, #f14f4c, #d93b3b);
  box-shadow: 0 10px 24px rgba(217, 59, 59, 0.22);
  color: #fff;
}

.secondary-action {
  border: 1px solid rgba(115, 89, 89, 0.16);
  background: rgba(255, 255, 255, 0.82);
  color: #554a4a;
}

.settings-action {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  min-height: 40px;
  padding: 0 8px;
  border: 0;
  background: transparent;
  color: #847676;
  font-size: 12px;
  font-weight: 700;
}

.action-button:not(:disabled):hover,
.settings-action:hover {
  transform: translateY(-2px);
}

.primary-action:not(:disabled):hover {
  box-shadow: 0 14px 28px rgba(217, 59, 59, 0.3);
}

.action-button:disabled {
  cursor: wait;
  opacity: 0.62;
}

.button-spinner {
  width: 13px;
  height: 13px;
  border: 2px solid currentColor;
  border-right-color: transparent;
  border-radius: 50%;
  animation: spin 0.7s linear infinite;
}

.sync-status-card {
  align-self: stretch;
  min-height: 260px;
  padding: 22px;
  border: 1px solid rgba(255, 255, 255, 0.7);
  border-radius: 22px;
  background:
    linear-gradient(152deg, rgba(40, 33, 33, 0.97), rgba(61, 40, 40, 0.94)),
    #302929;
  box-shadow: inset 0 1px rgba(255, 255, 255, 0.1), 0 18px 44px rgba(40, 23, 23, 0.16);
  color: #fff;
}

.signed-out-state,
.library-state {
  display: flex;
  height: 100%;
  min-height: 216px;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  text-align: center;
}

.state-orbit {
  display: grid;
  place-items: center;
  width: 82px;
  height: 82px;
  margin-bottom: 18px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 50%;
  background: radial-gradient(circle, rgba(236, 65, 65, 0.34), rgba(236, 65, 65, 0.06) 55%, transparent 56%);
  box-shadow: 0 0 0 12px rgba(255, 255, 255, 0.025);
}

.state-orbit span {
  display: grid;
  place-items: center;
  width: 42px;
  height: 42px;
  border-radius: 50%;
  background: var(--netease-red);
  font-size: 23px;
  font-weight: 900;
}

.signed-out-state strong,
.library-state strong,
.qr-copy strong {
  font-size: 15px;
}

.signed-out-state p,
.library-state p,
.qr-copy p {
  max-width: 280px;
  margin-top: 8px;
  color: rgba(255, 255, 255, 0.58);
  font-size: 12px;
  line-height: 1.7;
}

.qr-session {
  display: grid;
  grid-template-columns: 128px minmax(0, 1fr);
  align-items: center;
  gap: 18px;
}

.qr-frame {
  position: relative;
  padding: 10px;
  border-radius: 16px;
  background: #fff;
}

.qr-frame img,
.qr-placeholder {
  display: block;
  width: 108px;
  height: 108px;
  border-radius: 8px;
  object-fit: contain;
}

.qr-placeholder {
  display: grid;
  place-items: center;
  background: repeating-linear-gradient(45deg, #eee 0 7px, #fff 7px 14px);
  color: #2f2929;
  font-size: 17px;
  font-weight: 900;
  letter-spacing: 0.12em;
}

.scan-corner {
  position: absolute;
  width: 16px;
  height: 16px;
  border-color: var(--netease-red);
}

.corner-one { top: 4px; left: 4px; border-top: 2px solid; border-left: 2px solid; border-radius: 5px 0 0; }
.corner-two { top: 4px; right: 4px; border-top: 2px solid; border-right: 2px solid; border-radius: 0 5px 0 0; }
.corner-three { bottom: 4px; left: 4px; border-bottom: 2px solid; border-left: 2px solid; border-radius: 0 0 0 5px; }
.corner-four { right: 4px; bottom: 4px; border-right: 2px solid; border-bottom: 2px solid; border-radius: 0 0 5px; }

.qr-copy {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}

.mini-label {
  margin-bottom: 6px;
  color: rgba(255, 255, 255, 0.4);
  font-size: 9px;
  font-weight: 850;
  letter-spacing: 0.14em;
}

.qr-copy a {
  margin-top: 9px;
  color: #ff8987;
  font-size: 12px;
}

.library-state {
  min-height: 154px;
}

.library-stack {
  position: relative;
  width: 92px;
  height: 82px;
  margin-bottom: 14px;
}

.library-stack span {
  position: absolute;
  inset: 0;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 15px;
  background: linear-gradient(145deg, rgba(255, 255, 255, 0.08), rgba(255, 255, 255, 0.02));
}

.library-stack span:nth-child(1) { transform: translate(-10px, 7px) rotate(-8deg); }
.library-stack span:nth-child(2) { transform: translate(10px, 7px) rotate(8deg); }
.library-stack span:nth-child(3) { background: linear-gradient(145deg, rgba(236, 65, 65, 0.5), rgba(124, 42, 42, 0.38)); }

.library-stack b {
  position: absolute;
  inset: 0;
  display: grid;
  place-items: center;
  font-size: 30px;
}

.sync-result {
  margin-top: 18px;
  padding-top: 17px;
  border-top: 1px solid rgba(255, 255, 255, 0.09);
}

.result-heading {
  display: flex;
  align-items: center;
  gap: 9px;
}

.result-heading > div {
  display: grid;
  gap: 2px;
}

.result-heading strong {
  font-size: 12px;
}

.result-heading div span {
  color: rgba(255, 255, 255, 0.42);
  font-size: 10px;
}

.result-check {
  display: grid;
  place-items: center;
  width: 25px;
  height: 25px;
  border-radius: 50%;
  background: rgba(52, 183, 120, 0.18);
  color: #5bda9b;
  font-size: 12px;
  font-weight: 900;
}

.result-grid {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 7px;
  margin: 13px 0 0;
}

.result-grid div {
  display: grid;
  gap: 2px;
  padding: 9px 7px;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.055);
  text-align: center;
}

.result-grid dt {
  color: rgba(255, 255, 255, 0.42);
  font-size: 9px;
}

.result-grid dd {
  margin: 0;
  font-size: 15px;
  font-weight: 800;
}

.result-grid .warning dd {
  color: #ff9a87;
}

.sync-error {
  display: flex;
  gap: 8px;
  margin-top: 14px !important;
  padding: 9px 11px;
  border: 1px solid rgba(255, 126, 126, 0.18);
  border-radius: 10px;
  background: rgba(202, 49, 49, 0.16);
  color: #ffc0bd !important;
  font-size: 11px !important;
  line-height: 1.55 !important;
}

.sync-error span {
  display: grid;
  place-items: center;
  flex: 0 0 auto;
  width: 17px;
  height: 17px;
  border-radius: 50%;
  background: rgba(255, 255, 255, 0.12);
  font-weight: 900;
}

.sync-boundary-note {
  grid-column: 1 / -1;
  display: flex;
  align-items: center;
  gap: 13px;
  padding-top: 18px;
  border-top: 1px solid rgba(116, 87, 87, 0.1);
}

.boundary-chip {
  flex: 0 0 auto;
  padding: 6px 10px;
  border-radius: 999px;
  background: rgba(236, 65, 65, 0.08);
  color: #d44343;
  font-size: 10px;
  font-weight: 800;
}

.sync-boundary-note p {
  color: #968888;
  font-size: 11px;
  line-height: 1.7;
}

.sync-boundary-note strong {
  color: #756767;
}

@keyframes spin {
  to { transform: rotate(360deg); }
}

@keyframes pulse {
  50% { opacity: 0.45; transform: scale(0.8); }
}

@media (max-width: 900px) {
  .account-sync-panel {
    grid-template-columns: 1fr;
  }

  .brand-line {
    margin-bottom: 26px;
  }

  .sync-boundary-note {
    grid-column: 1;
  }
}

@media (max-width: 560px) {
  .account-sync-panel {
    gap: 20px;
    padding: 20px;
    border-radius: 22px;
  }

  .brand-line {
    flex-wrap: wrap;
  }

  .connection-chip {
    margin-left: 0;
  }

  .sync-actions,
  .action-button {
    width: 100%;
  }

  .settings-action {
    margin: 0 auto;
  }

  .qr-session {
    grid-template-columns: 1fr;
    justify-items: center;
    text-align: center;
  }

  .qr-copy {
    align-items: center;
  }

  .sync-boundary-note {
    align-items: flex-start;
    flex-direction: column;
  }
}
</style>
