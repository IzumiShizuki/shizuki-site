<template>
  <section
    class="qr-panel"
    :class="`is-${mode}`"
    @paste="onScanPaste"
    @dragenter="onScanDragEnter"
    @dragover="onScanDragOver"
    @dragleave="onScanDragLeave"
    @drop="onScanDrop"
  >
    <div class="qr-panel-body">
      <div class="qr-controls">
        <template v-if="mode === 'generate'">
          <label class="stack-field">
            <span>二维码内容</span>
            <textarea
              v-model="generateState.text"
              class="tool-textarea qr-content-input"
              rows="9"
              placeholder="输入文本、链接、支付口令或任何你想编码的内容"
            ></textarea>
          </label>

          <div class="qr-option-grid">
            <label class="stack-field">
              <span>纠错等级</span>
              <select v-model="renderOptions.errorCorrectionLevel">
                <option v-for="level in QR_ERROR_CORRECTION_LEVELS" :key="level" :value="level">{{ level }}</option>
              </select>
            </label>
            <label class="stack-field">
              <span>留白</span>
              <input v-model.number="renderOptions.margin" type="number" min="0" max="8" />
            </label>
            <label class="stack-field">
              <span>尺寸</span>
              <input v-model.number="renderOptions.width" type="number" min="160" max="960" step="20" />
            </label>
            <label class="stack-field">
              <span>前景色</span>
              <input v-model="renderOptions.darkColor" type="color" />
            </label>
            <label class="stack-field">
              <span>背景色</span>
              <input v-model="renderOptions.lightColor" type="color" />
            </label>
          </div>
        </template>

        <template v-else-if="mode === 'scan'">
          <div class="qr-scan-actions">
            <button class="chip-btn ripple-trigger" type="button" @click="triggerScanFileInput">
              <i class="fas fa-image" aria-hidden="true"></i> 选择图片
            </button>
            <button
              class="chip-btn ripple-trigger"
              type="button"
              :disabled="readingClipboard"
              @click="readClipboardImage"
            >
              <i class="fas fa-paste" aria-hidden="true"></i>
              {{ readingClipboard ? '读取中…' : '粘贴剪贴板图片' }}
            </button>
            <button
              class="chip-btn ripple-trigger"
              type="button"
              :disabled="!cameraAvailable"
              @click="toggleCameraScan"
            >
              <i class="fas fa-camera" aria-hidden="true"></i>
              {{ cameraActive ? '停止扫码' : '摄像头扫码' }}
            </button>
            <input
              ref="scanFileInputRef"
              class="qr-hidden-input"
              type="file"
              accept="image/*"
              @change="onScanFileChange"
            />
          </div>

          <p class="pane-hint">
            点击识别框后按 Ctrl+V / Cmd+V 粘贴截图，或直接拖入图片；识别在本地完成，图片不会上传。
          </p>

          <!--
            The video and canvas stay mounted so their refs resolve before
            getUserMedia assigns the stream. A `v-if` here would leave the refs
            null at the moment the stream arrives, which aborts the camera.
          -->
          <div v-show="cameraActive" class="qr-camera">
            <video ref="cameraVideoRef" class="qr-camera-video" autoplay playsinline muted></video>
            <canvas ref="cameraCanvasRef" class="qr-hidden-input"></canvas>
          </div>

          <div class="qr-result" :class="{ 'has-value': scanResult }">
            <div class="qr-result-head">
              <span class="qr-kind">{{ scanResultKindLabel }}</span>
              <small role="status" aria-live="polite">{{ scanStatus }}</small>
            </div>
            <textarea
              :value="scanResult"
              class="tool-textarea qr-result-output"
              rows="6"
              readonly
              placeholder="识别结果会出现在这里"
            ></textarea>
            <div class="qr-result-actions">
              <button class="chip-btn ripple-trigger" type="button" :disabled="!scanResult" @click="copyScanResult">
                复制结果
              </button>
              <button class="chip-btn ripple-trigger" type="button" :disabled="!scanIsUrl" @click="openScanResult">
                打开链接
              </button>
            </div>
          </div>
        </template>

        <template v-else>
          <div class="qr-option-grid qr-option-grid-wifi">
            <label class="stack-field">
              <span>网络名称 (SSID)</span>
              <input v-model.trim="wifiState.ssid" type="text" maxlength="64" placeholder="例如 Home-5G" />
            </label>
            <label class="stack-field">
              <span>加密方式</span>
              <select v-model="wifiState.encryption">
                <option value="WPA">WPA / WPA2</option>
                <option value="WEP">WEP</option>
                <option value="NOPASS">无密码</option>
              </select>
            </label>
          </div>

          <label class="stack-field">
            <span>密码</span>
            <input
              v-model.trim="wifiState.password"
              type="text"
              maxlength="120"
              :disabled="wifiState.encryption === 'NOPASS'"
              placeholder="输入 WiFi 密码"
            />
          </label>

          <label class="check-control">
            <input v-model="wifiState.hidden" type="checkbox" />
            <span>隐藏网络</span>
          </label>

          <div class="qr-result">
            <div class="qr-result-head">
              <span class="qr-kind">WiFi Payload</span>
              <small>可直接给手机摄像头或系统相机识别</small>
            </div>
            <textarea
              :value="wifiPayload"
              class="tool-textarea qr-result-output"
              rows="4"
              readonly
              placeholder="填写 SSID 后自动生成 WiFi 二维码载荷"
            ></textarea>
          </div>
        </template>
      </div>

      <div class="qr-preview">
        <div
          v-if="mode === 'scan'"
          ref="scanInputRef"
          class="qr-preview-stage qr-scan-input"
          :class="{ 'is-dragging': scanDragActive }"
          tabindex="0"
          role="region"
          aria-label="二维码图片识别框，点击后粘贴或拖入图片"
          :aria-busy="scanBusy"
          @click="focusScanInput"
        >
          <img v-if="scanPreviewUrl" :src="scanPreviewUrl" alt="待识别的二维码图片" class="qr-preview-image" draggable="false" />
          <i v-else class="fas fa-paste" aria-hidden="true"></i>
          <strong>{{ scanDragActive ? '松开即可识别图片' : scanBusy ? '正在识别二维码…' : '粘贴或拖入二维码图片' }}</strong>
          <span>点击此框后按 Ctrl+V / Cmd+V，也可拖入本地图片</span>
        </div>
        <div v-else-if="previewBusy" class="qr-preview-stage">
          <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
          <span>正在生成二维码…</span>
        </div>
        <div v-else-if="previewPngUrl" class="qr-preview-stage qr-preview-image-wrap">
          <img :src="previewPngUrl" alt="二维码预览" class="qr-preview-image" />
        </div>
        <div v-else class="qr-preview-stage">
          <i class="fas fa-qrcode" aria-hidden="true"></i>
          <span>{{ previewPlaceholder }}</span>
        </div>

        <div v-if="mode !== 'scan'" class="qr-preview-actions">
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

        <p v-if="mode === 'wifi' && wifiState.ssid" class="qr-wifi-summary">
          <span class="qr-kind">{{ wifiSecurityLabel }}</span>
          <span>{{ wifiState.ssid }}</span>
          <span>{{ wifiPasswordLabel }}</span>
          <span>{{ wifiState.hidden ? '隐藏网络' : '公开广播' }}</span>
        </p>
      </div>
    </div>
  </section>
</template>

<script setup>
import QRCode from 'qrcode';
import { computed, onBeforeUnmount, reactive, ref, watch } from 'vue';
import {
  buildWifiQrPayload,
  decodeQrImageData,
  describeQrContentKind,
  findQrImageFile,
  isQrImageFile,
  isUrlLike,
  normalizeQrDownloadFileName,
  normalizeQrRenderOptions,
  QR_RENDER_DEFAULTS,
  resolveDecodeScale
} from './qrToolsCore';

const QR_ERROR_CORRECTION_LEVELS = Object.freeze(['L', 'M', 'Q', 'H']);

const props = defineProps({
  mode: {
    type: String,
    default: 'generate'
  }
});

const emit = defineEmits(['feedback', 'payload']);

const previewBusy = ref(false);
const previewPngUrl = ref('');
const previewSvgMarkup = ref('');
const scanStatus = ref('等待导入二维码图片');
const scanResult = ref('');
const scanPreviewUrl = ref('');
const readingClipboard = ref(false);
const cameraActive = ref(false);
const scanBusy = ref(false);
const scanDragActive = ref(false);

const scanFileInputRef = ref(null);
const scanInputRef = ref(null);
const cameraVideoRef = ref(null);
const cameraCanvasRef = ref(null);

const generateState = reactive({ text: '' });
const wifiState = reactive({ ssid: '', password: '', encryption: 'WPA', hidden: false });
const renderOptions = reactive({ ...QR_RENDER_DEFAULTS });

let previewTaskId = 0;
let cameraStream = null;
let cameraRafId = 0;
let cameraRequestId = 0;
let lastCameraScanAt = 0;
let scanPreviewObjectUrl = '';
let scanDecodeTaskId = 0;
let scanInputSessionId = 0;
let scanDragDepth = 0;

const wifiPayload = computed(() => (wifiState.ssid ? buildWifiQrPayload(wifiState) : ''));

const currentPayload = computed(() => {
  if (props.mode === 'wifi') return wifiPayload.value;
  if (props.mode === 'generate') return String(generateState.text || '').trim();
  return scanResult.value;
});

const currentPayloadKindLabel = computed(() => describeQrContentKind(currentPayload.value));
const scanResultKindLabel = computed(() => describeQrContentKind(scanResult.value));
const scanIsUrl = computed(() => isUrlLike(scanResult.value));
const cameraAvailable = computed(() => Boolean(globalThis.navigator?.mediaDevices?.getUserMedia));
const wifiSecurityLabel = computed(() => (wifiState.encryption === 'NOPASS' ? 'Open' : wifiState.encryption));
const wifiPasswordLabel = computed(() => (wifiState.encryption === 'NOPASS' ? '无需密码' : wifiState.password || '未填写'));

const previewPlaceholder = computed(() => {
  if (props.mode === 'scan') return '导入图片后即可看到识别结果';
  if (props.mode === 'wifi') return '填写 SSID 后自动生成 WiFi 二维码';
  return '输入内容后自动生成二维码';
});

function setFeedback(message, type = 'info') {
  emit('feedback', { message: String(message || '').trim(), type });
}

function setError(message) {
  setFeedback(message, 'error');
}

function triggerScanFileInput() {
  scanFileInputRef.value?.click();
}

function focusScanInput() {
  scanInputRef.value?.focus();
}

function resetScanDrag() {
  scanDragDepth = 0;
  scanDragActive.value = false;
}

function invalidateScanInput() {
  scanInputSessionId += 1;
  readingClipboard.value = false;
  scanBusy.value = false;
  resetScanDrag();
}

function onScanDragEnter(event) {
  if (props.mode !== 'scan') return;
  event.preventDefault();
  event.stopPropagation();
  scanDragDepth += 1;
  scanDragActive.value = true;
}

function onScanDragOver(event) {
  if (props.mode !== 'scan') return;
  event.preventDefault();
  event.stopPropagation();
  if (event.dataTransfer) event.dataTransfer.dropEffect = 'copy';
  scanDragActive.value = true;
}

function onScanDragLeave(event) {
  if (props.mode !== 'scan') return;
  event.preventDefault();
  event.stopPropagation();
  scanDragDepth = Math.max(0, scanDragDepth - 1);
  if (!scanDragDepth) scanDragActive.value = false;
}

function onScanPaste(event) {
  if (props.mode !== 'scan') return;
  event.preventDefault();
  event.stopPropagation();
  const file = findQrImageFile(event.clipboardData);
  if (!file) {
    setError('剪贴板中没有图片，请复制二维码图片或截图后再粘贴');
    return;
  }
  decodeImageBlob(file, '粘贴图片');
}

function onScanDrop(event) {
  if (props.mode !== 'scan') return;
  event.preventDefault();
  event.stopPropagation();
  resetScanDrag();
  focusScanInput();
  const file = findQrImageFile(event.dataTransfer);
  if (!file) {
    setError('请拖入本地图片文件，例如 PNG、JPG 或 WebP');
    return;
  }
  decodeImageBlob(file, '拖入图片');
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
  if (!['generate', 'wifi'].includes(props.mode)) {
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

  try {
    const options = normalizeQrRenderOptions(renderOptions);

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
    if (taskId === previewTaskId) previewBusy.value = false;
  }
}

function applyScanResult(value, sourceLabel) {
  const text = String(value || '').trim();
  scanResult.value = text;
  if (text) {
    scanStatus.value = `${sourceLabel}识别成功`;
    setFeedback('二维码识别成功');
  } else {
    scanStatus.value = `${sourceLabel}未识别到二维码`;
    setError('没有检测到可识别的二维码，请尝试更清晰的图片');
  }
}

function loadImageElement(url) {
  return new Promise((resolve, reject) => {
    const image = new Image();
    image.onload = () => resolve(image);
    image.onerror = () => reject(new Error('图片读取失败'));
    image.src = url;
  });
}

async function decodeImageBlob(blob, sourceLabel) {
  if (props.mode !== 'scan') return;
  invalidateScanInput();
  stopCameraScan(false);
  const taskId = ++scanDecodeTaskId;
  scanBusy.value = true;
  scanResult.value = '';
  scanStatus.value = `${sourceLabel}识别中…`;
  revokeScanPreviewUrl();
  scanPreviewUrl.value = '';

  try {
    const objectUrl = URL.createObjectURL(blob);
    scanPreviewObjectUrl = objectUrl;
    scanPreviewUrl.value = objectUrl;
    const image = await loadImageElement(objectUrl);
    if (taskId !== scanDecodeTaskId || props.mode !== 'scan') return;
    const canvas = document.createElement('canvas');
    const context = canvas.getContext('2d', { willReadFrequently: true });
    if (!context) throw new Error('浏览器当前不支持二维码解码所需的 Canvas 能力');

    const target = resolveDecodeScale(image.naturalWidth, image.naturalHeight);
    canvas.width = target.width;
    canvas.height = target.height;
    context.drawImage(image, 0, 0, canvas.width, canvas.height);
    const imageData = context.getImageData(0, 0, canvas.width, canvas.height);
    applyScanResult(decodeQrImageData(imageData), sourceLabel);
  } catch (error) {
    if (taskId !== scanDecodeTaskId || props.mode !== 'scan') return;
    scanStatus.value = `${sourceLabel}识别失败`;
    setError(error?.message || '二维码识别失败');
  } finally {
    if (taskId === scanDecodeTaskId) scanBusy.value = false;
  }
}

async function onScanFileChange(event) {
  const file = event?.target?.files?.[0];
  if (event?.target) event.target.value = '';
  if (!file) return;
  if (!isQrImageFile(file)) {
    setError('请选择图片文件，例如 PNG、JPG 或 WebP');
    return;
  }
  await decodeImageBlob(file, '图片');
}

async function readClipboardImage() {
  if (props.mode !== 'scan' || readingClipboard.value) return;
  if (!globalThis.navigator?.clipboard?.read) {
    setError('当前浏览器不支持直接读取剪贴板，请点击识别框后按 Ctrl+V / Cmd+V 粘贴图片');
    return;
  }

  const sessionId = ++scanInputSessionId;
  const isCurrent = () => sessionId === scanInputSessionId && props.mode === 'scan';
  readingClipboard.value = true;
  try {
    const items = await navigator.clipboard.read();
    if (!isCurrent()) return;
    for (const item of items) {
      const imageType = item.types.find((type) => type.startsWith('image/'));
      if (!imageType) continue;
      const blob = await item.getType(imageType);
      if (!isCurrent()) return;
      await decodeImageBlob(blob, '剪贴板');
      return;
    }
    setError('剪贴板中没有可识别的图片');
  } catch (error) {
    if (!isCurrent()) return;
    setError('剪贴板读取失败，请点击识别框后按 Ctrl+V / Cmd+V 粘贴图片');
  } finally {
    if (isCurrent()) readingClipboard.value = false;
  }
}

async function processCameraFrame() {
  const video = cameraVideoRef.value;
  const canvas = cameraCanvasRef.value;
  if (!video || !canvas || video.readyState < 2) return false;

  const width = Math.min(Number(video.videoWidth) || 0, 960);
  const videoHeight = Number(video.videoHeight) || 0;
  const videoWidth = Number(video.videoWidth) || 1;
  const height = width > 0 ? Math.round((videoHeight / videoWidth) * width) : 0;
  if (!width || !height) return false;

  canvas.width = width;
  canvas.height = height;
  const context = canvas.getContext('2d', { willReadFrequently: true });
  if (!context) return false;

  context.drawImage(video, 0, 0, width, height);
  const imageData = context.getImageData(0, 0, width, height);
  const value = decodeQrImageData(imageData);
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

  invalidateScanInput();
  scanDecodeTaskId += 1;
  const requestId = ++cameraRequestId;
  let requestedStream = null;
  scanStatus.value = '正在请求摄像头权限…';

  try {
    requestedStream = await navigator.mediaDevices.getUserMedia({
      audio: false,
      video: { facingMode: { ideal: 'environment' } }
    });
    if (requestId !== cameraRequestId || props.mode !== 'scan') {
      stopCameraStream(requestedStream);
      return;
    }

    cameraStream = requestedStream;
    const video = cameraVideoRef.value;
    if (!video) throw new Error('摄像头预览初始化失败');
    video.srcObject = requestedStream;
    await video.play();
    if (requestId !== cameraRequestId || props.mode !== 'scan') {
      stopCameraStream(requestedStream);
      return;
    }

    cameraActive.value = true;
    scanStatus.value = '摄像头已启动，请将二维码放入画面中央';
    lastCameraScanAt = 0;
    cameraRafId = window.requestAnimationFrame(runCameraLoop);
  } catch (error) {
    stopCameraStream(requestedStream);
    if (requestId !== cameraRequestId || props.mode !== 'scan') return;
    stopCameraScan(false);
    scanStatus.value = '摄像头未启动';
    setError(error?.message || '摄像头启动失败');
  }
}

function stopCameraStream(stream) {
  if (!stream) return;

  stream.getTracks().forEach((track) => track.stop());
  if (cameraStream === stream) {
    cameraStream = null;
    cameraActive.value = false;
  }
  if (cameraVideoRef.value?.srcObject === stream) cameraVideoRef.value.srcObject = null;
}

function stopCameraScan(resetStatus = true) {
  // Invalidate a pending getUserMedia() request as well as an active stream.
  cameraRequestId += 1;
  if (cameraRafId) {
    window.cancelAnimationFrame(cameraRafId);
    cameraRafId = 0;
  }
  stopCameraStream(cameraStream);
  cameraActive.value = false;
  if (resetStatus) scanStatus.value = '摄像头扫码已停止';
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
    setFeedback(successText);
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
  const base = props.mode === 'wifi' ? `${wifiState.ssid || 'wifi'}-qr` : 'qr-shizuki';
  const fileName = normalizeQrDownloadFileName(base, format);

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

/** Exposed for the toolbox shell: clear the panel's own inputs and results. */
function resetPanel() {
  if (props.mode === 'generate') {
    generateState.text = '';
    renderOptions.width = QR_RENDER_DEFAULTS.width;
    renderOptions.margin = QR_RENDER_DEFAULTS.margin;
    renderOptions.errorCorrectionLevel = QR_RENDER_DEFAULTS.errorCorrectionLevel;
    renderOptions.darkColor = QR_RENDER_DEFAULTS.darkColor;
    renderOptions.lightColor = QR_RENDER_DEFAULTS.lightColor;
    resetPreviewAssets();
    return;
  }
  if (props.mode === 'wifi') {
    wifiState.ssid = '';
    wifiState.password = '';
    wifiState.encryption = 'WPA';
    wifiState.hidden = false;
    resetPreviewAssets();
    return;
  }
  invalidateScanInput();
  scanDecodeTaskId += 1;
  stopCameraScan(false);
  revokeScanPreviewUrl();
  scanPreviewUrl.value = '';
  scanResult.value = '';
  scanStatus.value = '等待导入二维码图片';
}

defineExpose({ resetPanel });

watch(
  () => [
    props.mode,
    generateState.text,
    wifiState.ssid,
    wifiState.password,
    wifiState.encryption,
    wifiState.hidden,
    renderOptions.width,
    renderOptions.margin,
    renderOptions.errorCorrectionLevel,
    renderOptions.darkColor,
    renderOptions.lightColor
  ],
  () => {
    renderPreview();
  },
  { immediate: true }
);

watch(
  () => props.mode,
  (value, previous) => {
    if (previous === 'scan' && value !== 'scan') {
      invalidateScanInput();
      scanDecodeTaskId += 1;
      stopCameraScan(false);
      revokeScanPreviewUrl();
      scanPreviewUrl.value = '';
      if (!scanResult.value) scanStatus.value = '等待导入二维码图片';
    }
  }
);

watch(
  currentPayload,
  (value) => {
    emit('payload', { mode: props.mode, value });
  },
  { immediate: true }
);

onBeforeUnmount(() => {
  previewTaskId += 1;
  invalidateScanInput();
  scanDecodeTaskId += 1;
  stopCameraScan(false);
  revokeScanPreviewUrl();
});
</script>

<style scoped>
/*
 * The toolbox styles its form controls with scoped rules, which do not reach
 * this child component's internals. The shared custom properties
 * (--tool-border, --tool-panel, --tool-text, --tool-muted, --tool-panel-strong)
 * are inherited from the window shell, so only the class rules are restated.
 */
.qr-panel .tool-textarea,
.qr-panel .stack-field input,
.qr-panel .stack-field select {
  width: 100%;
  box-sizing: border-box;
  border: 1px solid var(--tool-border);
  border-radius: 10px;
  background: var(--tool-panel-strong);
  color: var(--tool-text);
  padding: 10px 12px;
  font: inherit;
}

.qr-panel .tool-textarea {
  resize: vertical;
  min-height: 120px;
  line-height: 1.55;
}

.qr-panel .stack-field {
  display: grid;
  gap: 8px;
  align-content: start;
  min-width: 0;
}

.qr-panel .stack-field span {
  color: var(--tool-muted);
  font-size: 12px;
}

.qr-panel .stack-field input,
.qr-panel .stack-field select {
  min-height: 38px;
}

.qr-panel .stack-field input[type='color'] {
  min-height: 42px;
  padding: 4px;
  cursor: pointer;
}

.qr-panel .check-control {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  color: var(--tool-muted);
  font-size: 12px;
}

.qr-panel .pane-hint {
  margin: 0;
  color: var(--tool-muted);
  font-size: 11px;
}

.qr-panel .chip-btn {
  border: 1px solid var(--tool-border);
  background: var(--tool-panel-strong);
  color: var(--tool-text);
  border-radius: 10px;
  min-height: 32px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  cursor: pointer;
  transition: border-color 160ms ease, background-color 160ms ease;
}

.qr-panel .chip-btn:hover:not(:disabled) {
  border-color: rgba(var(--accent-rgb), 0.38);
}

.qr-panel .chip-btn:disabled {
  opacity: 0.5;
  cursor: not-allowed;
}

.qr-panel {
  min-width: 0;
}

.qr-panel-body {
  display: grid;
  grid-template-columns: minmax(0, 1.15fr) minmax(260px, 0.85fr);
  gap: 12px;
  align-items: start;
}

.qr-controls,
.qr-preview {
  min-width: 0;
  padding: 12px;
  border: 1px solid var(--tool-border);
  border-radius: 14px;
  background: var(--tool-panel);
  display: grid;
  gap: 10px;
  align-content: start;
}

.qr-option-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.qr-option-grid-wifi {
  grid-template-columns: minmax(0, 1.2fr) minmax(0, 1fr);
}

.qr-content-input {
  min-height: 190px;
}

.qr-scan-actions,
.qr-result-actions,
.qr-preview-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.qr-hidden-input {
  display: none;
}

.qr-camera {
  border: 1px solid var(--tool-border);
  border-radius: 12px;
  overflow: hidden;
  background: rgba(var(--glass-rgb), 0.18);
}

.qr-camera-video {
  display: block;
  width: 100%;
  max-height: 280px;
  object-fit: contain;
}

.qr-result {
  border: 1px solid var(--tool-border);
  border-radius: 12px;
  background: rgba(var(--glass-rgb), 0.16);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.qr-result-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  flex-wrap: wrap;
  color: var(--tool-muted);
  font-size: 11.5px;
}

.qr-kind {
  display: inline-flex;
  align-items: center;
  border-radius: 999px;
  padding: 3px 9px;
  font-size: 11.5px;
  border: 1px solid rgba(var(--accent-rgb), 0.28);
  background: rgba(var(--accent-rgb), 0.14);
  color: rgb(var(--accent-strong-rgb));
}

.qr-result-output {
  min-height: 120px;
}

.qr-preview-stage {
  min-height: 300px;
  border: 1px solid var(--tool-border);
  border-radius: 14px;
  background:
    radial-gradient(circle at top, rgba(var(--accent-rgb), 0.16), transparent 44%),
    rgba(var(--glass-rgb), 0.18);
  display: grid;
  place-items: center;
  gap: 8px;
  padding: 16px;
  color: var(--tool-muted);
  text-align: center;
}

.qr-preview-stage > i {
  font-size: 26px;
  color: rgba(var(--accent-rgb), 0.88);
}

.qr-scan-input {
  border-style: dashed;
  cursor: text;
}

.qr-scan-input:focus-visible,
.qr-scan-input.is-dragging {
  outline: 2px solid rgba(var(--accent-rgb), 0.7);
  outline-offset: 2px;
  border-color: rgba(var(--accent-rgb), 0.7);
  background-color: rgba(var(--accent-rgb), 0.12);
}

.qr-scan-input strong {
  color: var(--tool-text);
  font-size: 14px;
}

.qr-scan-input > span {
  font-size: 12px;
  line-height: 1.6;
}

.qr-preview-image {
  width: 100%;
  height: 100%;
  max-height: 340px;
  object-fit: contain;
}

.qr-wifi-summary {
  margin: 0;
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: center;
  color: var(--tool-muted);
  font-size: 12px;
}

@container lightapp-window-body (max-width: 900px) {
  .qr-panel-body {
    grid-template-columns: 1fr;
  }
}

@container lightapp-window-body (max-width: 600px) {
  .qr-option-grid,
  .qr-option-grid-wifi {
    grid-template-columns: 1fr;
  }
}
</style>
