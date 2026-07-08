<template>
  <section class="lightapp-window qr-tools-window">
    <LightAppTopToolbar :window-id="props.windowId">
      <div class="toolbar-switches with-divider" role="tablist" aria-label="QR tools tabs">
        <button
          v-for="item in QR_TOOL_TAB_ITEMS"
          :key="`qr_tab_${item.code}`"
          class="icon-action-btn toolbar-tab-btn ripple-trigger"
          :class="{ 'is-active': activeTab === item.code }"
          type="button"
          role="tab"
          :aria-selected="activeTab === item.code"
          :title="item.label"
          :aria-label="item.label"
          @click="activeTab = item.code"
        >
          <i :class="item.iconClass" aria-hidden="true"></i>
        </button>
      </div>

      <div class="toolbar-actions">
        <button class="chip-btn ripple-trigger" type="button" :disabled="!currentPayload" @click="copyCurrentPayload">
          复制内容
        </button>
        <button class="chip-btn ripple-trigger" type="button" :disabled="!previewPngUrl" @click="downloadPreview('png')">
          下载 PNG
        </button>
        <button class="chip-btn ripple-trigger" type="button" :disabled="!previewSvgMarkup" @click="downloadPreview('svg')">
          下载 SVG
        </button>
      </div>
    </LightAppTopToolbar>

    <p v-if="infoText" class="info-text">{{ infoText }}</p>
    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <div class="content-grid">
      <section class="control-panel liquid-material">
        <header class="panel-head">
          <h3>{{ activeTabTitle }}</h3>
          <p>{{ activeTabSummary }}</p>
        </header>

        <div v-if="activeTab === 'generate'" class="form-stack">
          <label class="field">
            <span>二维码内容</span>
            <textarea
              v-model="generateForm.text"
              rows="8"
              placeholder="输入文本、链接、支付口令或任何你想编码的内容"
            ></textarea>
          </label>

          <div class="field-grid">
            <label class="field">
              <span>纠错等级</span>
              <select v-model="qrOptions.errorCorrectionLevel">
                <option value="L">L</option>
                <option value="M">M</option>
                <option value="Q">Q</option>
                <option value="H">H</option>
              </select>
            </label>

            <label class="field">
              <span>留白</span>
              <input v-model.number="qrOptions.margin" type="number" min="0" max="8" />
            </label>

            <label class="field">
              <span>尺寸</span>
              <input v-model.number="qrOptions.width" type="number" min="160" max="960" step="20" />
            </label>
          </div>

          <div class="field-grid field-grid-colors">
            <label class="field">
              <span>前景色</span>
              <input v-model="qrOptions.darkColor" type="color" />
            </label>

            <label class="field">
              <span>背景色</span>
              <input v-model="qrOptions.lightColor" type="color" />
            </label>
          </div>
        </div>

        <div v-else-if="activeTab === 'scan'" class="form-stack">
          <div class="scan-actions">
            <button class="chip-btn ripple-trigger" type="button" @click="triggerScanFileInput">
              选择图片
            </button>
            <button class="chip-btn ripple-trigger" type="button" :disabled="readingClipboard" @click="readClipboardImage">
              {{ readingClipboard ? '读取中...' : '粘贴剪贴板图片' }}
            </button>
            <button class="chip-btn ripple-trigger" type="button" :disabled="!cameraAvailable" @click="toggleCameraScan">
              {{ cameraActive ? '停止扫码' : '摄像头扫码' }}
            </button>
            <input
              ref="scanFileInputRef"
              class="hidden-input"
              type="file"
              accept="image/png,image/jpeg,image/webp,image/gif"
              @change="onScanFileChange"
            />
          </div>

          <p class="scan-hint">
            支持本地图片识别，也支持调用当前浏览器摄像头实时扫码。所有识别都在前端本地完成。
          </p>

          <div v-if="cameraActive" class="camera-panel">
            <video ref="cameraVideoRef" class="camera-preview" autoplay playsinline muted></video>
            <canvas ref="cameraCanvasRef" class="hidden-canvas"></canvas>
          </div>

          <div v-if="scanPreviewUrl" class="scan-preview-card">
            <img :src="scanPreviewUrl" alt="QR preview" class="scan-preview-image" />
          </div>

          <div class="result-card result-card-scan">
            <div class="result-meta">
              <span class="result-kind">{{ scanResultKindLabel }}</span>
              <small>{{ scanStatus }}</small>
            </div>
            <textarea
              :value="scanResult"
              class="result-output"
              rows="7"
              readonly
              placeholder="识别结果会出现在这里"
            ></textarea>
            <div class="result-actions">
              <button class="chip-btn ripple-trigger" type="button" :disabled="!scanResult" @click="copyScanResult">
                复制结果
              </button>
              <button class="chip-btn ripple-trigger" type="button" :disabled="!scanIsUrl" @click="openScanResult">
                打开链接
              </button>
            </div>
          </div>
        </div>

        <div v-else class="form-stack">
          <div class="field-grid field-grid-wifi">
            <label class="field">
              <span>网络名称 (SSID)</span>
              <input v-model.trim="wifiForm.ssid" type="text" maxlength="64" placeholder="例如 Home-5G" />
            </label>

            <label class="field">
              <span>加密方式</span>
              <select v-model="wifiForm.encryption">
                <option value="WPA">WPA / WPA2</option>
                <option value="WEP">WEP</option>
                <option value="NOPASS">无密码</option>
              </select>
            </label>
          </div>

          <label class="field">
            <span>密码</span>
            <input
              v-model.trim="wifiForm.password"
              type="text"
              maxlength="120"
              :disabled="wifiForm.encryption === 'NOPASS'"
              placeholder="输入 WiFi 密码"
            />
          </label>

          <label class="check-field">
            <input v-model="wifiForm.hidden" type="checkbox" />
            <span>隐藏网络</span>
          </label>

          <div class="result-card wifi-payload-card">
            <div class="result-meta">
              <span class="result-kind">WiFi Payload</span>
              <small>可直接给手机摄像头或系统相机识别</small>
            </div>
            <textarea :value="currentPayload" class="result-output" rows="5" readonly></textarea>
          </div>
        </div>
      </section>

      <section class="preview-panel liquid-material">
        <div class="preview-stage">
          <div v-if="previewBusy" class="preview-placeholder">
            <i class="fas fa-spinner fa-spin" aria-hidden="true"></i>
            <span>正在生成预览...</span>
          </div>
          <div v-else-if="previewPngUrl" class="preview-card">
            <img :src="previewPngUrl" alt="QR code preview" class="preview-image" />
          </div>
          <div v-else class="preview-placeholder">
            <i class="fas fa-qrcode" aria-hidden="true"></i>
            <span>{{ previewPlaceholder }}</span>
          </div>
        </div>

        <div class="result-card">
          <div class="result-meta">
            <span class="result-kind">{{ currentPayloadKindLabel }}</span>
            <small>{{ previewMeta }}</small>
          </div>
          <textarea :value="currentPayload" class="result-output" rows="7" readonly :placeholder="payloadPlaceholder"></textarea>
        </div>

        <article v-if="activeTab === 'wifi'" class="wifi-card">
          <div class="wifi-card-head">
            <div>
              <p class="wifi-card-label">WiFi Card</p>
              <h4>{{ wifiForm.ssid || '未填写 SSID' }}</h4>
            </div>
            <span class="wifi-security">{{ wifiSecurityLabel }}</span>
          </div>
          <dl class="wifi-details">
            <div>
              <dt>密码</dt>
              <dd>{{ wifiPasswordLabel }}</dd>
            </div>
            <div>
              <dt>可见性</dt>
              <dd>{{ wifiForm.hidden ? '隐藏网络' : '公开广播' }}</dd>
            </div>
          </dl>
        </article>
      </section>
    </div>
  </section>
</template>

<script setup>
import QRCode from 'qrcode';
import jsQR from 'jsqr';
import { computed, onBeforeUnmount, reactive, ref, watch } from 'vue';
import LightAppTopToolbar from '../LightAppTopToolbar.vue';
import {
  buildWifiQrPayload,
  inferQrContentKind,
  isUrlLike,
  normalizeQrDownloadFileName,
  QR_CONTENT_KIND_LABELS,
  QR_TOOL_TAB_ITEMS
} from './qrToolsUtils';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const activeTab = ref('generate');
const infoText = ref('');
const errorText = ref('');
const previewBusy = ref(false);
const previewPngUrl = ref('');
const previewSvgMarkup = ref('');
const scanStatus = ref('等待导入二维码图片');
const scanResult = ref('');
const scanPreviewUrl = ref('');
const readingClipboard = ref(false);
const cameraActive = ref(false);

const scanFileInputRef = ref(null);
const cameraVideoRef = ref(null);
const cameraCanvasRef = ref(null);

const generateForm = reactive({
  text: ''
});

const wifiForm = reactive({
  ssid: '',
  password: '',
  encryption: 'WPA',
  hidden: false
});

const qrOptions = reactive({
  width: 320,
  margin: 2,
  errorCorrectionLevel: 'M',
  darkColor: '#142033',
  lightColor: '#ffffff'
});

const activeTabMeta = computed(() => QR_TOOL_TAB_ITEMS.find((item) => item.code === activeTab.value) || QR_TOOL_TAB_ITEMS[0]);
const activeTabTitle = computed(() => {
  if (activeTab.value === 'generate') return '二维码生成';
  if (activeTab.value === 'scan') return '二维码识别';
  return 'WiFi 二维码卡片';
});
const activeTabSummary = computed(() => {
  if (activeTab.value === 'generate') return '把任意文本、网址或口令快速编码成二维码，并导出为 PNG / SVG。';
  if (activeTab.value === 'scan') return '识别本地图片、剪贴板图片或摄像头画面中的二维码内容。';
  return '把 WiFi 配置封装成可打印、可分享的二维码卡片。';
});

const currentPayload = computed(() => {
  if (activeTab.value === 'wifi') {
    return wifiForm.ssid ? buildWifiQrPayload(wifiForm) : '';
  }
  if (activeTab.value === 'generate') {
    return String(generateForm.text || '').trim();
  }
  return scanResult.value;
});

const currentPayloadKind = computed(() => inferQrContentKind(currentPayload.value));
const currentPayloadKindLabel = computed(() => QR_CONTENT_KIND_LABELS[currentPayloadKind.value] || '文本');
const scanResultKindLabel = computed(() => QR_CONTENT_KIND_LABELS[inferQrContentKind(scanResult.value)] || '文本');
const scanIsUrl = computed(() => isUrlLike(scanResult.value));
const cameraAvailable = computed(() => Boolean(globalThis.navigator?.mediaDevices?.getUserMedia));
const wifiSecurityLabel = computed(() => (wifiForm.encryption === 'NOPASS' ? 'Open' : wifiForm.encryption));
const wifiPasswordLabel = computed(() => (wifiForm.encryption === 'NOPASS' ? '无需密码' : wifiForm.password || '未填写'));
const previewPlaceholder = computed(() => {
  if (activeTab.value === 'scan') return '导入图片后即可看到识别结果';
  if (activeTab.value === 'wifi') return '填写 WiFi 信息后自动生成预览';
  return '输入任意内容后自动生成二维码';
});
const payloadPlaceholder = computed(() => {
  if (activeTab.value === 'scan') return '识别结果会出现在这里';
  return '当前二维码载荷会显示在这里';
});
const previewMeta = computed(() => {
  if (!currentPayload.value) return '等待输入内容';
  return `${activeTabMeta.value.label} · ${currentPayload.value.length} chars`;
});

let previewTaskId = 0;
let cameraStream = null;
let cameraRafId = 0;
let lastCameraScanAt = 0;
let scanPreviewObjectUrl = '';

function setInfo(message) {
  infoText.value = String(message || '').trim();
}

function setError(message) {
  errorText.value = String(message || '').trim();
}

function clearFeedback() {
  infoText.value = '';
  errorText.value = '';
}

function triggerScanFileInput() {
  scanFileInputRef.value?.click();
}

function revokeScanPreviewUrl() {
  if (scanPreviewObjectUrl) {
    URL.revokeObjectURL(scanPreviewObjectUrl);
    scanPreviewObjectUrl = '';
  }
}

function resetPreviewAssets() {
  previewPngUrl.value = '';
  previewSvgMarkup.value = '';
}

async function renderPreview() {
  if (!['generate', 'wifi'].includes(activeTab.value)) {
    resetPreviewAssets();
    previewBusy.value = false;
    return;
  }

  const payload = currentPayload.value;
  if (!payload) {
    resetPreviewAssets();
    previewBusy.value = false;
    return;
  }

  const taskId = ++previewTaskId;
  previewBusy.value = true;
  setError('');

  try {
    const options = {
      width: Number(qrOptions.width) || 320,
      margin: Number(qrOptions.margin) || 2,
      errorCorrectionLevel: qrOptions.errorCorrectionLevel,
      color: {
        dark: qrOptions.darkColor,
        light: qrOptions.lightColor
      }
    };

    const [pngUrl, svgMarkup] = await Promise.all([
      QRCode.toDataURL(payload, options),
      QRCode.toString(payload, { ...options, type: 'svg' })
    ]);

    if (taskId !== previewTaskId) return;
    previewPngUrl.value = pngUrl;
    previewSvgMarkup.value = svgMarkup;
  } catch (error) {
    if (taskId !== previewTaskId) return;
    resetPreviewAssets();
    setError(error?.message || '二维码生成失败');
  } finally {
    if (taskId === previewTaskId) {
      previewBusy.value = false;
    }
  }
}

function decodeFromImageData(imageData) {
  if (!imageData) return '';
  const result = jsQR(imageData.data, imageData.width, imageData.height, {
    inversionAttempts: 'attemptBoth'
  });
  return String(result?.data || '').trim();
}

function applyScanResult(value, sourceLabel) {
  const text = String(value || '').trim();
  scanResult.value = text;
  if (text) {
    scanStatus.value = `${sourceLabel}识别成功`;
    setInfo('二维码识别成功');
    setError('');
  } else {
    scanStatus.value = `${sourceLabel}未识别到二维码`;
    setError('没有检测到可识别的二维码，请尝试更清晰的图片');
  }
}

async function loadImageElement(url) {
  return new Promise((resolve, reject) => {
    const image = new Image();
    image.onload = () => resolve(image);
    image.onerror = () => reject(new Error('图片读取失败'));
    image.src = url;
  });
}

async function decodeImageBlob(blob, sourceLabel) {
  clearFeedback();
  stopCameraScan(false);

  const objectUrl = URL.createObjectURL(blob);
  revokeScanPreviewUrl();
  scanPreviewObjectUrl = objectUrl;
  scanPreviewUrl.value = objectUrl;

  try {
    const image = await loadImageElement(objectUrl);
    const canvas = document.createElement('canvas');
    const context = canvas.getContext('2d', { willReadFrequently: true });
    if (!context) {
      throw new Error('浏览器当前不支持二维码解码所需的 Canvas 能力');
    }

    const ratio = image.naturalWidth > 1600 ? 1600 / image.naturalWidth : 1;
    canvas.width = Math.max(1, Math.round(image.naturalWidth * ratio));
    canvas.height = Math.max(1, Math.round(image.naturalHeight * ratio));
    context.drawImage(image, 0, 0, canvas.width, canvas.height);
    const imageData = context.getImageData(0, 0, canvas.width, canvas.height);
    applyScanResult(decodeFromImageData(imageData), sourceLabel);
  } catch (error) {
    scanStatus.value = `${sourceLabel}识别失败`;
    setError(error?.message || '二维码识别失败');
  }
}

async function onScanFileChange(event) {
  const file = event?.target?.files?.[0];
  if (event?.target) {
    event.target.value = '';
  }
  if (!file) return;
  await decodeImageBlob(file, '图片');
}

async function readClipboardImage() {
  if (!globalThis.navigator?.clipboard?.read) {
    setError('当前浏览器不支持剪贴板图片读取，请改用本地图片导入');
    return;
  }

  readingClipboard.value = true;
  clearFeedback();

  try {
    const items = await navigator.clipboard.read();
    for (const item of items) {
      const imageType = item.types.find((type) => type.startsWith('image/'));
      if (!imageType) continue;
      const blob = await item.getType(imageType);
      await decodeImageBlob(blob, '剪贴板');
      readingClipboard.value = false;
      return;
    }
    setError('剪贴板中没有可识别的图片');
  } catch (error) {
    setError(error?.message || '剪贴板读取失败');
  } finally {
    readingClipboard.value = false;
  }
}

async function processCameraFrame() {
  const video = cameraVideoRef.value;
  const canvas = cameraCanvasRef.value;
  if (!video || !canvas || video.readyState < 2) return false;

  const width = Math.min(Number(video.videoWidth) || 0, 960);
  const height = width > 0 ? Math.round(((Number(video.videoHeight) || 0) / (Number(video.videoWidth) || 1)) * width) : 0;
  if (!width || !height) return false;

  canvas.width = width;
  canvas.height = height;
  const context = canvas.getContext('2d', { willReadFrequently: true });
  if (!context) return false;

  context.drawImage(video, 0, 0, width, height);
  const imageData = context.getImageData(0, 0, width, height);
  const value = decodeFromImageData(imageData);
  if (!value) return false;

  applyScanResult(value, '摄像头');
  stopCameraScan(false);
  return true;
}

function runCameraLoop(timestamp = 0) {
  if (!cameraActive.value) return;
  if (timestamp - lastCameraScanAt >= 180) {
    lastCameraScanAt = timestamp;
    processCameraFrame().catch(() => {});
  }
  cameraRafId = window.requestAnimationFrame(runCameraLoop);
}

async function startCameraScan() {
  if (!cameraAvailable.value) {
    setError('当前设备或浏览器不支持摄像头扫码');
    return;
  }

  clearFeedback();
  scanStatus.value = '正在请求摄像头权限...';

  try {
    cameraStream = await navigator.mediaDevices.getUserMedia({
      audio: false,
      video: {
        facingMode: { ideal: 'environment' }
      }
    });
    const video = cameraVideoRef.value;
    if (!video) {
      throw new Error('摄像头预览初始化失败');
    }
    video.srcObject = cameraStream;
    await video.play();
    cameraActive.value = true;
    scanStatus.value = '摄像头已启动，请将二维码放入画面中央';
    lastCameraScanAt = 0;
    cameraRafId = window.requestAnimationFrame(runCameraLoop);
  } catch (error) {
    stopCameraScan(false);
    scanStatus.value = '摄像头未启动';
    setError(error?.message || '摄像头启动失败');
  }
}

function stopCameraScan(resetStatus = true) {
  if (cameraRafId) {
    window.cancelAnimationFrame(cameraRafId);
    cameraRafId = 0;
  }
  if (cameraStream) {
    cameraStream.getTracks().forEach((track) => track.stop());
    cameraStream = null;
  }
  if (cameraVideoRef.value) {
    cameraVideoRef.value.srcObject = null;
  }
  cameraActive.value = false;
  if (resetStatus) {
    scanStatus.value = '摄像头扫码已停止';
  }
}

function toggleCameraScan() {
  if (cameraActive.value) {
    stopCameraScan();
    return;
  }
  startCameraScan();
}

async function writeClipboardText(value, successText) {
  const text = String(value || '').trim();
  if (!text) return;
  if (!globalThis.navigator?.clipboard?.writeText) {
    setError('当前浏览器不支持剪贴板写入');
    return;
  }
  try {
    await navigator.clipboard.writeText(text);
    setInfo(successText);
    setError('');
  } catch (error) {
    setError(error?.message || '复制失败');
  }
}

function copyCurrentPayload() {
  writeClipboardText(currentPayload.value, '二维码内容已复制');
}

function copyScanResult() {
  writeClipboardText(scanResult.value, '识别结果已复制');
}

function openScanResult() {
  if (!scanIsUrl.value) return;
  window.open(scanResult.value, '_blank', 'noopener,noreferrer');
}

function triggerDownload(href, fileName) {
  const link = document.createElement('a');
  link.href = href;
  link.download = fileName;
  link.rel = 'noopener';
  document.body.appendChild(link);
  link.click();
  link.remove();
}

function downloadPreview(format) {
  if (!currentPayload.value) return;
  const fileName = normalizeQrDownloadFileName(
    activeTab.value === 'wifi' ? `${wifiForm.ssid || 'wifi'}-qr` : 'qr-tools-export',
    format
  );

  if (format === 'png' && previewPngUrl.value) {
    triggerDownload(previewPngUrl.value, fileName);
    return;
  }

  if (format === 'svg' && previewSvgMarkup.value) {
    const blob = new Blob([previewSvgMarkup.value], { type: 'image/svg+xml;charset=utf-8' });
    const objectUrl = URL.createObjectURL(blob);
    triggerDownload(objectUrl, fileName);
    window.setTimeout(() => URL.revokeObjectURL(objectUrl), 1000);
  }
}

watch(
  () => [
    activeTab.value,
    generateForm.text,
    wifiForm.ssid,
    wifiForm.password,
    wifiForm.encryption,
    wifiForm.hidden,
    qrOptions.width,
    qrOptions.margin,
    qrOptions.errorCorrectionLevel,
    qrOptions.darkColor,
    qrOptions.lightColor
  ],
  () => {
    renderPreview();
  },
  { immediate: true }
);

watch(
  () => activeTab.value,
  (value) => {
    clearFeedback();
    if (value !== 'scan') {
      stopCameraScan(false);
    }
  }
);

onBeforeUnmount(() => {
  stopCameraScan(false);
  revokeScanPreviewUrl();
});
</script>

<style scoped>
.lightapp-window {
  --la-border: rgba(255, 255, 255, 0.44);
  --la-input-bg: rgba(var(--glass-rgb), 0.28);
  --la-btn-bg: rgba(var(--glass-rgb), 0.26);
  --la-panel-bg: rgba(var(--glass-rgb), 0.22);
  --la-text: rgba(35, 42, 58, 0.92);
  --la-muted: rgba(58, 67, 87, 0.72);
  color: var(--la-text);
  display: grid;
  gap: 10px;
  min-width: 0;
}

.toolbar-actions {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.chip-btn,
.icon-action-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
  min-height: 32px;
}

.chip-btn {
  padding: 0 12px;
}

.icon-action-btn {
  width: 32px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.info-text,
.error-text {
  margin: 0;
  font-size: 13px;
}

.info-text {
  color: rgba(38, 116, 74, 0.92);
}

.error-text {
  color: rgba(190, 45, 80, 0.94);
}

.content-grid {
  display: grid;
  grid-template-columns: minmax(0, 1.08fr) minmax(320px, 0.92fr);
  gap: 12px;
  min-width: 0;
}

.control-panel,
.preview-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  gap: 12px;
  align-content: start;
  min-width: 0;
}

.panel-head {
  display: grid;
  gap: 4px;
}

.panel-head h3,
.panel-head p {
  margin: 0;
}

.panel-head p {
  color: var(--la-muted);
  font-size: 13px;
}

.form-stack {
  display: grid;
  gap: 10px;
}

.field-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.field-grid-colors {
  grid-template-columns: repeat(2, minmax(0, 1fr));
}

.field-grid-wifi {
  grid-template-columns: repeat(2, minmax(0, 1fr));
}

.field {
  display: grid;
  gap: 6px;
  min-width: 0;
}

.field span,
.check-field,
.scan-hint {
  font-size: 12px;
  color: var(--la-muted);
}

.field input,
.field select,
.field textarea,
.result-output {
  width: 100%;
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 10px 12px;
  font: inherit;
  box-sizing: border-box;
}

.field input[type='color'] {
  min-height: 42px;
  padding: 4px;
}

.field textarea,
.result-output {
  resize: vertical;
}

.check-field {
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.scan-actions,
.result-actions {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
}

.scan-hint {
  margin: 0;
}

.camera-panel,
.scan-preview-card,
.preview-card,
.preview-placeholder {
  border: 1px solid var(--la-border);
  border-radius: 16px;
  background:
    radial-gradient(circle at top, rgba(var(--accent-rgb), 0.2), transparent 42%),
    rgba(var(--glass-rgb), 0.18);
}

.camera-panel,
.preview-card,
.preview-placeholder {
  min-height: 280px;
}

.camera-panel {
  overflow: hidden;
}

.camera-preview,
.preview-image,
.scan-preview-image {
  width: 100%;
  height: 100%;
  display: block;
  object-fit: contain;
}

.scan-preview-card {
  overflow: hidden;
}

.preview-stage {
  min-height: 320px;
}

.preview-card,
.preview-placeholder {
  height: 100%;
}

.preview-placeholder {
  display: grid;
  place-items: center;
  gap: 8px;
  color: var(--la-muted);
  text-align: center;
  padding: 20px;
}

.preview-placeholder i {
  font-size: 28px;
  color: rgba(var(--accent-rgb), 0.88);
}

.result-card {
  border: 1px solid var(--la-border);
  border-radius: 14px;
  background: rgba(var(--glass-rgb), 0.18);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.result-card-scan {
  min-height: 0;
}

.result-meta {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  flex-wrap: wrap;
}

.result-kind,
.wifi-security {
  display: inline-flex;
  align-items: center;
  border-radius: 999px;
  padding: 4px 10px;
  font-size: 12px;
  border: 1px solid rgba(var(--accent-rgb), 0.28);
  background: rgba(var(--accent-rgb), 0.14);
}

.wifi-card {
  border-radius: 18px;
  padding: 16px;
  color: rgba(250, 252, 255, 0.96);
  background:
    linear-gradient(135deg, rgba(18, 32, 51, 0.96), rgba(46, 80, 120, 0.88)),
    radial-gradient(circle at top right, rgba(255, 255, 255, 0.18), transparent 38%);
  box-shadow: 0 20px 40px rgba(7, 13, 24, 0.18);
  display: grid;
  gap: 16px;
}

.wifi-card-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 12px;
}

.wifi-card-label,
.wifi-details dt {
  margin: 0;
  font-size: 12px;
  color: rgba(223, 231, 244, 0.76);
  text-transform: uppercase;
  letter-spacing: 0.08em;
}

.wifi-card h4,
.wifi-details dd {
  margin: 0;
}

.wifi-card h4 {
  font-size: clamp(20px, 3vw, 28px);
}

.wifi-details {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
  margin: 0;
}

.wifi-details div {
  display: grid;
  gap: 6px;
}

.hidden-input,
.hidden-canvas {
  display: none;
}

@container lightapp-window-body (max-width: 1080px) {
  .content-grid {
    grid-template-columns: 1fr;
  }
}

@container lightapp-window-body (max-width: 720px) {
  .field-grid,
  .field-grid-colors,
  .field-grid-wifi {
    grid-template-columns: 1fr;
  }

  .toolbar-actions,
  .scan-actions,
  .result-actions {
    width: 100%;
  }

  .toolbar-actions .chip-btn,
  .scan-actions .chip-btn,
  .result-actions .chip-btn {
    flex: 1 1 140px;
  }

  .wifi-details {
    grid-template-columns: 1fr;
  }
}
</style>
