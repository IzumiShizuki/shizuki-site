<template>
  <transition name="settings-fade">
    <div v-if="visible" class="settings-mask" @click.self="emit('close')">
      <section class="settings-panel liquid-material">
        <header class="panel-header">
          <h2>外观设置</h2>
          <button class="close-btn ripple-trigger" type="button" @click="emit('close')">关闭</button>
        </header>

        <div class="section-block">
          <h3>交互主色</h3>
          <p>默认是淡紫色。会影响点击加深、涟漪、Hover/Active 高亮等非纯色交互。</p>
        </div>

        <div class="preset-grid">
          <button
            v-for="preset in ui.ACCENT_PRESETS"
            :key="preset.hex"
            class="preset-btn ripple-trigger"
            :class="{ active: currentHex === preset.hex }"
            type="button"
            @click="applyPreset(preset.hex)"
          >
            <span class="swatch" :style="{ background: preset.hex }"></span>
            <span>{{ preset.name }}</span>
          </button>
        </div>

        <div class="custom-row">
          <label for="hex-input">自定义 HEX</label>
          <div class="hex-wrap">
            <input id="hex-input" v-model.trim="hexInput" type="text" placeholder="#C8B4FF" spellcheck="false" />
            <button class="apply-btn ripple-trigger" type="button" @click="applyCustomHex">应用</button>
          </div>
          <p v-if="errorMessage" class="error-text">{{ errorMessage }}</p>
        </div>

        <footer class="panel-footer">
          <button class="reset-btn ripple-trigger" type="button" @click="resetDefault">恢复默认淡紫</button>
        </footer>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed, ref, watch } from 'vue';
import { useUiPreferences } from '../composables/useUiPreferences';

const props = defineProps({
  visible: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['close']);
const ui = useUiPreferences();
const hexInput = ref(ui.state.accentHex);
const errorMessage = ref('');

const currentHex = computed(() => ui.state.accentHex);

watch(
  () => props.visible,
  (nextVisible) => {
    if (!nextVisible) return;
    hexInput.value = ui.state.accentHex;
    errorMessage.value = '';
  }
);

function applyPreset(hex) {
  const result = ui.setAccentHex(hex);
  if (!result.ok) {
    errorMessage.value = result.error;
    return;
  }
  hexInput.value = result.normalized;
  errorMessage.value = '';
}

function applyCustomHex() {
  const result = ui.setAccentHex(hexInput.value);
  if (!result.ok) {
    errorMessage.value = result.error;
    return;
  }
  hexInput.value = result.normalized;
  errorMessage.value = '';
}

function resetDefault() {
  ui.resetAccent();
  hexInput.value = ui.state.accentHex;
  errorMessage.value = '';
}
</script>

<style scoped>
.settings-mask {
  position: fixed;
  inset: 0;
  z-index: 1900;
  display: grid;
  place-items: center;
  background: rgba(8, 11, 18, 0.44);
  backdrop-filter: blur(6px) saturate(120%);
  -webkit-backdrop-filter: blur(6px) saturate(120%);
}

.settings-panel {
  --liquid-bg: rgba(var(--glass-rgb), 0.42);
  --liquid-border: rgba(255, 255, 255, 0.5);
  --liquid-shadow: 0 18px 46px rgba(8, 12, 20, 0.38);
  width: min(92vw, 560px);
  border-radius: 20px;
  padding: 14px;
  color: rgba(20, 24, 34, 0.9);
}

.panel-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.panel-header h2 {
  font-size: 20px;
}

.close-btn {
  border: 0;
  border-radius: 10px;
  min-width: 64px;
  height: 32px;
  background: rgba(255, 255, 255, 0.36);
  color: rgba(25, 29, 38, 0.8);
}

.section-block {
  margin-top: 14px;
  display: grid;
  gap: 6px;
}

.section-block h3 {
  font-size: 16px;
}

.section-block p {
  color: rgba(37, 42, 53, 0.78);
  line-height: 1.6;
}

.preset-grid {
  margin-top: 12px;
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.preset-btn {
  border: 0;
  border-radius: 12px;
  min-height: 42px;
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 8px 10px;
  background: rgba(255, 255, 255, 0.3);
  color: rgba(28, 32, 40, 0.88);
}

.preset-btn.active {
  box-shadow: inset 0 0 0 2px rgba(var(--accent-rgb), 0.6);
  background: rgba(var(--accent-rgb), 0.18);
}

.swatch {
  width: 18px;
  height: 18px;
  border-radius: 50%;
  border: 1px solid rgba(255, 255, 255, 0.7);
}

.custom-row {
  margin-top: 14px;
  display: grid;
  gap: 6px;
}

.custom-row label {
  font-size: 13px;
  color: rgba(25, 29, 38, 0.86);
}

.hex-wrap {
  display: grid;
  grid-template-columns: 1fr auto;
  gap: 8px;
}

.hex-wrap input {
  border: 1px solid rgba(255, 255, 255, 0.58);
  border-radius: 10px;
  height: 38px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.38);
  color: rgba(27, 31, 40, 0.92);
}

.apply-btn {
  border: 0;
  border-radius: 10px;
  min-width: 72px;
  height: 38px;
  background: rgba(var(--accent-rgb), 0.28);
  color: rgba(245, 241, 255, 0.95);
}

.error-text {
  color: rgba(210, 50, 80, 0.88);
  font-size: 12px;
}

.panel-footer {
  margin-top: 14px;
}

.reset-btn {
  border: 0;
  border-radius: 10px;
  min-width: 138px;
  height: 34px;
  background: rgba(255, 255, 255, 0.34);
  color: rgba(25, 29, 38, 0.84);
}

.settings-fade-enter-active,
.settings-fade-leave-active {
  transition: opacity 180ms ease;
}

.settings-fade-enter-from,
.settings-fade-leave-to {
  opacity: 0;
}

@media (max-width: 640px) {
  .settings-panel {
    width: calc(100vw - 16px);
    padding: 12px;
    border-radius: 16px;
  }

  .preset-grid {
    grid-template-columns: 1fr;
  }
}
</style>
