<template>
  <transition name="cropper-fade">
    <div v-if="visible" class="cropper-overlay" role="dialog" aria-modal="true" @click.self="$emit('close')">
      <section class="cropper-panel liquid-material" @click.stop>
        <header class="cropper-head">
          <div>
            <p class="cropper-title">裁剪头像</p>
            <p class="cropper-desc">拖动和缩放图片，预览为圆形，最终保存为 {{ outputSize }}x{{ outputSize }} 正方形。</p>
          </div>
          <button class="ghost-btn ripple-trigger" type="button" :disabled="submitting" @click="$emit('close')">关闭</button>
        </header>

        <div class="cropper-layout">
          <div class="cropper-main">
            <Cropper
              ref="cropperRef"
              class="avatar-cropper"
              :src="sourceUrl"
              :stencil-component="CircleStencil"
              :stencil-props="stencilProps"
              :resize-image="resizeImageOptions"
              :image-restriction="'stencil'"
              :auto-zoom="true"
              :debounce="32"
              @change="onCropChange"
            />
          </div>
          <aside class="cropper-preview-panel">
            <p class="preview-title">预览</p>
            <div class="preview-circle">
              <img v-if="previewUrl" :src="previewUrl" alt="avatar-preview" />
            </div>
            <p class="helper-text">{{ sourceName || 'avatar.png' }}</p>
          </aside>
        </div>

        <footer class="cropper-actions">
          <button class="ghost-btn ripple-trigger" type="button" :disabled="submitting" @click="$emit('close')">取消</button>
          <button class="primary-btn ripple-trigger" type="button" :disabled="submitting || confirming" @click="confirmCrop">
            {{ submitting || confirming ? '处理中...' : '确认裁剪' }}
          </button>
        </footer>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed, ref, watch } from 'vue';
import { CircleStencil, Cropper } from 'vue-advanced-cropper';
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
    default: 'avatar.png'
  },
  outputSize: {
    type: Number,
    default: 512
  },
  submitting: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['close', 'confirm']);

const cropperRef = ref(null);
const previewUrl = ref('');
const confirming = ref(false);

const stencilProps = Object.freeze({
  aspectRatio: 1,
  movable: true,
  resizable: true
});

const resizeImageOptions = Object.freeze({
  adjustStencil: false
});

const normalizedSource = computed(() => String(props.sourceUrl || '').trim());

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
  if (canvas) {
    previewUrl.value = canvas.toDataURL('image/png');
    return;
  }
  previewUrl.value = normalizedSource.value;
}

async function confirmCrop() {
  confirming.value = true;
  try {
    const result = cropperRef.value?.getResult({
      size: {
        width: props.outputSize,
        height: props.outputSize
      }
    });
    const canvas = result?.canvas;
    if (!canvas) {
      throw new Error('裁剪结果不可用');
    }
    const blob = await canvasToBlob(canvas);
    if (!blob) {
      throw new Error('裁剪结果不可用');
    }
    emit('confirm', {
      blob,
      previewUrl: canvas.toDataURL('image/png')
    });
  } finally {
    confirming.value = false;
  }
}

function canvasToBlob(canvas) {
  return new Promise((resolve) => {
    canvas.toBlob(
      (blob) => {
        resolve(blob || null);
      },
      'image/png',
      0.96
    );
  });
}
</script>

<style scoped>
.cropper-overlay {
  position: fixed;
  inset: 0;
  z-index: 940;
  display: grid;
  place-items: center;
  background: rgba(3, 8, 14, 0.68);
  backdrop-filter: blur(6px);
  padding: 14px;
}

.cropper-panel {
  --liquid-bg: rgba(16, 24, 36, 0.75);
  --liquid-border: rgba(225, 234, 247, 0.28);
  --liquid-shadow: 0 26px 50px rgba(4, 7, 12, 0.42);
  width: min(960px, 100%);
  border-radius: 18px;
  padding: 16px;
  display: grid;
  gap: 12px;
}

.cropper-head {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 12px;
}

.cropper-title {
  font-size: 17px;
  font-weight: 650;
}

.cropper-desc {
  margin-top: 4px;
  color: rgba(204, 220, 240, 0.86);
  font-size: 12px;
}

.cropper-layout {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 200px;
  gap: 12px;
}

.cropper-main {
  border-radius: 14px;
  overflow: hidden;
  background: rgba(6, 11, 18, 0.58);
  box-shadow: inset 0 0 0 1px rgba(185, 205, 230, 0.24);
  min-height: 360px;
}

.avatar-cropper {
  height: 100%;
}

.cropper-preview-panel {
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.08);
  box-shadow: inset 0 0 0 1px rgba(190, 213, 239, 0.2);
  padding: 10px;
  display: grid;
  gap: 8px;
  align-content: start;
}

.preview-title {
  font-size: 12px;
  color: rgba(219, 233, 250, 0.92);
}

.preview-circle {
  width: 144px;
  height: 144px;
  border-radius: 50%;
  overflow: hidden;
  background: rgba(8, 14, 24, 0.5);
  justify-self: center;
}

.preview-circle img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.helper-text {
  color: rgba(206, 220, 239, 0.86);
  font-size: 12px;
  text-align: center;
  word-break: break-all;
}

.cropper-actions {
  display: flex;
  justify-content: flex-end;
  gap: 8px;
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
  background: rgba(255, 255, 255, 0.16);
}

.cropper-fade-enter-active,
.cropper-fade-leave-active {
  transition: opacity 0.24s ease;
}

.cropper-fade-enter-active .cropper-panel,
.cropper-fade-leave-active .cropper-panel {
  transition: transform 0.24s ease, opacity 0.24s ease;
}

.cropper-fade-enter-from,
.cropper-fade-leave-to {
  opacity: 0;
}

.cropper-fade-enter-from .cropper-panel,
.cropper-fade-leave-to .cropper-panel {
  opacity: 0;
  transform: translateY(10px) scale(0.985);
}

@media (max-width: 900px) {
  .cropper-layout {
    grid-template-columns: 1fr;
  }

  .cropper-main {
    min-height: 300px;
  }
}
</style>
