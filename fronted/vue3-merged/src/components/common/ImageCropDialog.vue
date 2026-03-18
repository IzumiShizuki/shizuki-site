<template>
  <transition name="image-crop-fade">
    <div v-if="visible" class="image-crop-overlay" role="dialog" aria-modal="true" @click.self="$emit('close')">
      <section class="image-crop-panel liquid-material" @click.stop>
        <header class="image-crop-head">
          <div>
            <p class="image-crop-title">{{ title }}</p>
            <p class="image-crop-desc">{{ description }}</p>
          </div>
          <button class="ghost-btn ripple-trigger" type="button" :disabled="submitting" @click="$emit('close')">关闭</button>
        </header>

        <div class="image-crop-layout">
          <div class="image-crop-main">
            <Cropper
              ref="cropperRef"
              class="image-cropper"
              :src="normalizedSource"
              :stencil-component="resolvedStencilComponent"
              :stencil-props="resolvedStencilProps"
              :resize-image="resizeImageOptions"
              :image-restriction="'stencil'"
              :auto-zoom="true"
              :debounce="32"
              @change="onCropChange"
            />
          </div>
          <aside class="image-crop-preview-panel">
            <p class="preview-title">预览</p>
            <div class="preview-rect" :class="{ round: resolvedPreviewShape === 'circle' }" :style="previewRectStyle">
              <img v-if="previewUrl" :src="previewUrl" alt="crop-preview" />
            </div>
            <p class="helper-text">{{ sourceName || 'image.png' }}</p>
          </aside>
        </div>

        <footer class="image-crop-actions">
          <button class="ghost-btn ripple-trigger" type="button" :disabled="submitting || confirming" @click="$emit('close')">取消</button>
          <button class="primary-btn ripple-trigger" type="button" :disabled="submitting || confirming" @click="confirmCrop">
            {{ submitting || confirming ? '处理中...' : '确认裁剪并上传' }}
          </button>
        </footer>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed, ref, watch } from 'vue';
import { CircleStencil, Cropper, RectangleStencil } from 'vue-advanced-cropper';
import 'vue-advanced-cropper/dist/style.css';

const props = defineProps({
  visible: {
    type: Boolean,
    default: false
  },
  sourceUrl: {
    type: String,
    default: ''
  },
  sourceName: {
    type: String,
    default: 'image.png'
  },
  title: {
    type: String,
    default: '裁剪图片'
  },
  description: {
    type: String,
    default: '拖动和缩放图片，框选要上传的范围。'
  },
  submitting: {
    type: Boolean,
    default: false
  },
  aspectRatio: {
    type: Number,
    default: 0
  },
  maxOutputWidth: {
    type: Number,
    default: 1920
  },
  maxOutputHeight: {
    type: Number,
    default: 1920
  },
  outputMimeType: {
    type: String,
    default: 'image/webp'
  },
  outputQuality: {
    type: Number,
    default: 0.9
  },
  stencilShape: {
    type: String,
    default: 'rect'
  },
  previewShape: {
    type: String,
    default: ''
  }
});

const emit = defineEmits(['close', 'confirm']);

const cropperRef = ref(null);
const previewUrl = ref('');
const confirming = ref(false);

const normalizedSource = computed(() => String(props.sourceUrl || '').trim());
const normalizedOutputMimeType = computed(() => {
  const source = String(props.outputMimeType || '').trim().toLowerCase();
  if (['image/png', 'image/jpeg', 'image/webp'].includes(source)) {
    return source;
  }
  return 'image/webp';
});
const normalizedOutputQuality = computed(() => {
  const quality = Number(props.outputQuality);
  if (!Number.isFinite(quality)) return 0.9;
  return Math.min(0.96, Math.max(0.4, quality));
});
const normalizedStencilShape = computed(() => (String(props.stencilShape || '').trim().toLowerCase() === 'circle' ? 'circle' : 'rect'));
const resolvedPreviewShape = computed(() => {
  const previewShape = String(props.previewShape || '').trim().toLowerCase();
  if (previewShape === 'circle') return 'circle';
  return normalizedStencilShape.value === 'circle' ? 'circle' : 'rect';
});
const resolvedStencilComponent = computed(() => (normalizedStencilShape.value === 'circle' ? CircleStencil : RectangleStencil));

const resolvedStencilProps = computed(() => {
  const base = {
    movable: true,
    resizable: true
  };
  if (normalizedStencilShape.value === 'circle') {
    return base;
  }
  const ratio = Number(props.aspectRatio);
  if (Number.isFinite(ratio) && ratio > 0) {
    return {
      ...base,
      aspectRatio: ratio,
    };
  }
  return base;
});

const previewRectStyle = computed(() => {
  if (resolvedPreviewShape.value === 'circle') {
    return {
      aspectRatio: '1 / 1'
    };
  }
  const ratio = Number(props.aspectRatio);
  if (Number.isFinite(ratio) && ratio > 0) {
    return {
      aspectRatio: String(ratio)
    };
  }
  return {
    aspectRatio: '16 / 10'
  };
});

const resizeImageOptions = Object.freeze({
  adjustStencil: false
});

watch(
  () => [props.visible, normalizedSource.value],
  () => {
    if (!props.visible) {
      previewUrl.value = '';
      confirming.value = false;
      return;
    }
    previewUrl.value = normalizedSource.value;
  },
  { immediate: true }
);

function onCropChange() {
  const canvas = cropperRef.value?.getResult()?.canvas;
  if (!canvas) {
    previewUrl.value = normalizedSource.value;
    return;
  }
  const normalizedCanvas = normalizeCanvasSize(canvas);
  previewUrl.value = normalizedCanvas.toDataURL(normalizedOutputMimeType.value, normalizedOutputQuality.value);
}

async function confirmCrop() {
  confirming.value = true;
  try {
    const result = cropperRef.value?.getResult();
    const canvas = result?.canvas;
    if (!canvas) {
      throw new Error('裁剪结果不可用');
    }
    const normalizedCanvas = normalizeCanvasSize(canvas);
    const blob = await canvasToBlob(normalizedCanvas, normalizedOutputMimeType.value, normalizedOutputQuality.value);
    if (!blob) {
      throw new Error('裁剪结果不可用');
    }
    emit('confirm', {
      blob,
      mimeType: normalizedOutputMimeType.value,
      previewUrl: normalizedCanvas.toDataURL(normalizedOutputMimeType.value, normalizedOutputQuality.value)
    });
  } finally {
    confirming.value = false;
  }
}

function normalizeCanvasSize(canvas) {
  const maxWidth = Math.max(256, Number(props.maxOutputWidth) || 1920);
  const maxHeight = Math.max(256, Number(props.maxOutputHeight) || 1920);
  const width = Number(canvas.width || 0);
  const height = Number(canvas.height || 0);
  if (!width || !height) return canvas;

  const scale = Math.min(1, maxWidth / width, maxHeight / height);
  if (scale >= 0.999) return canvas;

  const targetWidth = Math.max(1, Math.round(width * scale));
  const targetHeight = Math.max(1, Math.round(height * scale));
  const normalized = document.createElement('canvas');
  normalized.width = targetWidth;
  normalized.height = targetHeight;
  const context = normalized.getContext('2d');
  if (!context) return canvas;
  context.drawImage(canvas, 0, 0, targetWidth, targetHeight);
  return normalized;
}

function canvasToBlob(canvas, mimeType, quality) {
  return new Promise((resolve) => {
    canvas.toBlob(
      (blob) => {
        resolve(blob || null);
      },
      mimeType,
      quality
    );
  });
}
</script>

<style scoped>
.image-crop-overlay {
  position: fixed;
  inset: 0;
  z-index: 960;
  display: grid;
  place-items: center;
  background: rgba(3, 8, 14, 0.68);
  backdrop-filter: blur(6px);
  padding: 10px;
}

.image-crop-panel {
  --liquid-bg: rgba(16, 24, 36, 0.78);
  --liquid-border: rgba(225, 234, 247, 0.28);
  --liquid-shadow: 0 26px 50px rgba(4, 7, 12, 0.42);
  width: min(900px, 100%);
  height: min(86vh, 700px);
  max-height: min(86vh, 700px);
  border-radius: 18px;
  padding: 14px;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr) auto;
  gap: 10px;
  overflow: hidden;
}

.image-crop-head {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 12px;
}

.image-crop-title {
  font-size: 17px;
  font-weight: 650;
}

.image-crop-desc {
  margin-top: 4px;
  color: rgba(204, 220, 240, 0.86);
  font-size: 12px;
}

.image-crop-layout {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 200px;
  gap: 12px;
  min-height: 0;
  align-items: stretch;
}

.image-crop-main {
  border-radius: 14px;
  overflow: hidden;
  background: rgba(6, 11, 18, 0.58);
  box-shadow: inset 0 0 0 1px rgba(185, 205, 230, 0.24);
  min-height: 0;
  height: 100%;
}

.image-cropper {
  height: 100%;
}

.image-crop-preview-panel {
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.08);
  box-shadow: inset 0 0 0 1px rgba(190, 213, 239, 0.2);
  padding: 10px;
  display: grid;
  gap: 8px;
  align-content: start;
  min-height: 0;
  overflow: hidden;
}

.preview-title {
  font-size: 12px;
  color: rgba(219, 233, 250, 0.92);
}

.preview-rect {
  width: 100%;
  border-radius: 10px;
  overflow: hidden;
  background: rgba(8, 14, 24, 0.5);
}

.preview-rect.round {
  border-radius: 999px;
}

.preview-rect img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.helper-text {
  color: rgba(206, 220, 239, 0.86);
  font-size: 12px;
  text-align: center;
  word-break: break-all;
  margin: 0;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 3;
  overflow: hidden;
}

.image-crop-actions {
  display: flex;
  justify-content: flex-end;
  gap: 8px;
}

.primary-btn,
.ghost-btn {
  border: 0;
  border-radius: 10px;
  padding: 8px 14px;
  color: #f4f8ff;
  background: rgba(255, 255, 255, 0.14);
  transition: transform 140ms ease, background 140ms ease;
}

.ghost-btn:hover,
.primary-btn:hover {
  transform: translateY(-1px);
  background: rgba(157, 201, 255, 0.22);
}

.primary-btn {
  background: linear-gradient(135deg, rgba(84, 160, 255, 0.7), rgba(136, 113, 255, 0.66));
}

.ghost-btn:disabled,
.primary-btn:disabled {
  opacity: 0.55;
  cursor: not-allowed;
  transform: none;
}

.image-crop-fade-enter-active,
.image-crop-fade-leave-active {
  transition: opacity 180ms ease;
}

.image-crop-fade-enter-active .image-crop-panel,
.image-crop-fade-leave-active .image-crop-panel {
  transition: transform 220ms ease, opacity 220ms ease;
}

.image-crop-fade-enter-from,
.image-crop-fade-leave-to {
  opacity: 0;
}

.image-crop-fade-enter-from .image-crop-panel,
.image-crop-fade-leave-to .image-crop-panel {
  transform: translateY(8px) scale(0.98);
  opacity: 0;
}

@media (max-width: 860px) {
  .image-crop-panel {
    width: min(760px, 100%);
    height: min(88vh, 620px);
    max-height: min(88vh, 620px);
    padding: 12px;
    border-radius: 14px;
  }

  .image-crop-layout {
    grid-template-columns: 1fr;
    gap: 8px;
  }

  .image-crop-main {
    min-height: 0;
    height: min(45vh, 320px);
  }

  .image-crop-preview-panel {
    grid-template-columns: auto minmax(0, 1fr);
    grid-template-areas:
      'title title'
      'preview helper';
    align-items: center;
    gap: 6px 10px;
  }

  .preview-title {
    grid-area: title;
  }

  .preview-rect {
    grid-area: preview;
    width: min(120px, 30vw);
  }

  .helper-text {
    grid-area: helper;
    text-align: left;
    -webkit-line-clamp: 2;
  }
}
</style>
