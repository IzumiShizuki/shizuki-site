<template>
  <transition name="settings-fade">
    <div v-if="visible" class="settings-mask" @click.self="emit('close')">
      <section class="settings-panel liquid-material">
        <header class="panel-header">
          <h2>外观设置</h2>
          <button class="close-btn ripple-trigger" type="button" @click="emit('close')">关闭</button>
        </header>

        <div class="section-block">
          <h3>交互主色模式</h3>
          <p>可在纯色和渐变之间切换，应用到按钮高亮、点击反馈与交互强调。</p>
        </div>

        <div class="mode-switch">
          <button
            class="mode-btn ripple-trigger"
            :class="{ active: currentAccentMode === 'solid' }"
            type="button"
            @click="applyAccentMode('solid')"
          >
            纯色
          </button>
          <button
            class="mode-btn ripple-trigger"
            :class="{ active: currentAccentMode === 'gradient' }"
            type="button"
            @click="applyAccentMode('gradient')"
          >
            渐变
          </button>
        </div>

        <template v-if="currentAccentMode === 'solid'">
          <div class="section-block compact">
            <h3>纯色预设</h3>
            <p>默认是淡紫色。</p>
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

          <div class="picker-row">
            <label class="picker-field">
              <span>可视化取色</span>
              <input v-model="solidColorPicker" type="color" @input="applySolidColorPicker" />
            </label>
          </div>

          <div class="custom-row">
            <label for="hex-input">自定义 HEX</label>
            <div class="hex-wrap">
              <input id="hex-input" v-model.trim="hexInput" type="text" placeholder="#C8B4FF" spellcheck="false" />
              <button class="apply-btn ripple-trigger" type="button" @click="applyCustomHex">应用</button>
            </div>
          </div>
        </template>

        <template v-else>
          <div class="section-block compact">
            <h3>渐变预设</h3>
            <p>可选择预设，也可手动输入起止颜色。</p>
          </div>

          <div class="gradient-grid">
            <button
              v-for="preset in ui.GRADIENT_PRESETS"
              :key="preset.id"
              class="gradient-btn ripple-trigger"
              :class="{ active: currentGradientPresetId === preset.id }"
              type="button"
              @click="applyGradientPreset(preset.id)"
            >
              <span class="gradient-swatch" :style="{ background: gradientPreviewStyle(preset.startHex, preset.endHex) }"></span>
              <span>{{ preset.name }}</span>
            </button>
          </div>

          <div class="gradient-input-grid">
            <label class="picker-field">
              <span>起始取色</span>
              <input v-model="gradientStartPicker" type="color" @input="applyGradientPicker" />
            </label>
            <label class="picker-field">
              <span>结束取色</span>
              <input v-model="gradientEndPicker" type="color" @input="applyGradientPicker" />
            </label>
            <label>
              <span>起始色</span>
              <input v-model.trim="gradientStartInput" type="text" placeholder="#E94BC5" spellcheck="false" />
            </label>
            <label>
              <span>结束色</span>
              <input v-model.trim="gradientEndInput" type="text" placeholder="#9D6BFF" spellcheck="false" />
            </label>
            <button class="apply-btn ripple-trigger" type="button" @click="applyCustomGradient">应用渐变</button>
          </div>

          <p v-if="isGradientCustom" class="helper-text">当前使用：自定义渐变</p>
        </template>

        <p v-if="errorMessage" class="error-text">{{ errorMessage }}</p>

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
const gradientStartInput = ref(ui.state.accentGradientStartHex);
const gradientEndInput = ref(ui.state.accentGradientEndHex);
const solidColorPicker = ref(ui.state.accentHex);
const gradientStartPicker = ref(ui.state.accentGradientStartHex);
const gradientEndPicker = ref(ui.state.accentGradientEndHex);
const errorMessage = ref('');

const currentHex = computed(() => ui.state.accentHex);
const currentAccentMode = computed(() => (ui.state.accentMode === 'gradient' ? 'gradient' : 'solid'));
const currentGradientPresetId = computed(() => String(ui.state.accentGradientId || ''));
const isGradientCustom = computed(() => currentGradientPresetId.value === 'custom');

watch(
  () => props.visible,
  (nextVisible) => {
    if (!nextVisible) return;
    syncInputs();
    errorMessage.value = '';
  }
);

function syncInputs() {
  hexInput.value = ui.state.accentHex;
  gradientStartInput.value = ui.state.accentGradientStartHex;
  gradientEndInput.value = ui.state.accentGradientEndHex;
  solidColorPicker.value = ui.state.accentHex;
  gradientStartPicker.value = ui.state.accentGradientStartHex;
  gradientEndPicker.value = ui.state.accentGradientEndHex;
}

function applyAccentMode(mode) {
  ui.setAccentMode(mode);
  errorMessage.value = '';
}

function applyPreset(hex) {
  const result = ui.setAccentHex(hex);
  if (!result.ok) {
    errorMessage.value = result.error;
    return;
  }
  ui.setAccentMode('solid');
  hexInput.value = result.normalized;
  errorMessage.value = '';
}

function applyCustomHex() {
  const result = ui.setAccentHex(hexInput.value);
  if (!result.ok) {
    errorMessage.value = result.error;
    return;
  }
  ui.setAccentMode('solid');
  hexInput.value = result.normalized;
  solidColorPicker.value = result.normalized;
  errorMessage.value = '';
}

function applySolidColorPicker() {
  const result = ui.setAccentHex(solidColorPicker.value);
  if (!result.ok) {
    errorMessage.value = result.error;
    return;
  }
  ui.setAccentMode('solid');
  hexInput.value = result.normalized;
  solidColorPicker.value = result.normalized;
  errorMessage.value = '';
}

function applyGradientPreset(presetId) {
  const preset = ui.setAccentGradientPreset(presetId);
  ui.setAccentMode('gradient');
  gradientStartInput.value = preset.startHex;
  gradientEndInput.value = preset.endHex;
  gradientStartPicker.value = preset.startHex;
  gradientEndPicker.value = preset.endHex;
  errorMessage.value = '';
}

function applyCustomGradient() {
  const result = ui.setAccentGradientCustom(gradientStartInput.value, gradientEndInput.value);
  if (!result.ok) {
    errorMessage.value = result.error;
    return;
  }
  ui.setAccentMode('gradient');
  gradientStartInput.value = result.startHex;
  gradientEndInput.value = result.endHex;
  gradientStartPicker.value = result.startHex;
  gradientEndPicker.value = result.endHex;
  errorMessage.value = '';
}

function applyGradientPicker() {
  const result = ui.setAccentGradientCustom(gradientStartPicker.value, gradientEndPicker.value);
  if (!result.ok) {
    errorMessage.value = result.error;
    return;
  }
  ui.setAccentMode('gradient');
  gradientStartInput.value = result.startHex;
  gradientEndInput.value = result.endHex;
  gradientStartPicker.value = result.startHex;
  gradientEndPicker.value = result.endHex;
  errorMessage.value = '';
}

function gradientPreviewStyle(startHex, endHex) {
  return `linear-gradient(135deg, ${startHex}, ${endHex})`;
}

function resetDefault() {
  ui.resetAccent();
  ui.setAccentMode('solid');
  ui.setAccentGradientPreset('berry');
  syncInputs();
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
  width: min(92vw, 580px);
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

.section-block.compact {
  margin-top: 12px;
}

.section-block h3 {
  font-size: 16px;
}

.section-block p,
.helper-text {
  color: rgba(37, 42, 53, 0.78);
  line-height: 1.6;
}

.mode-switch {
  margin-top: 10px;
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 8px;
}

.mode-btn {
  border: 1px solid rgba(255, 255, 255, 0.42);
  border-radius: 11px;
  height: 36px;
  background: rgba(255, 255, 255, 0.34);
  color: rgba(24, 28, 37, 0.84);
}

.mode-btn.active {
  border-color: rgba(var(--accent-rgb), 0.64);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.2);
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  color: rgba(255, 255, 255, 0.95);
}

.preset-grid,
.gradient-grid {
  margin-top: 10px;
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.preset-btn,
.gradient-btn {
  border: 0;
  border-radius: 12px;
  min-height: 44px;
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 8px 10px;
  background: rgba(255, 255, 255, 0.3);
  color: rgba(28, 32, 40, 0.88);
}

.preset-btn.active,
.gradient-btn.active {
  box-shadow: inset 0 0 0 2px rgba(var(--accent-rgb), 0.6);
  background: rgba(var(--accent-rgb), 0.18);
}

.swatch {
  width: 18px;
  height: 18px;
  border-radius: 50%;
  border: 1px solid rgba(255, 255, 255, 0.7);
}

.gradient-swatch {
  width: 26px;
  height: 16px;
  border-radius: 6px;
  border: 1px solid rgba(255, 255, 255, 0.76);
}

.custom-row {
  margin-top: 12px;
  display: grid;
  gap: 6px;
}

.picker-row {
  margin-top: 12px;
}

.picker-field {
  display: grid;
  gap: 4px;
  font-size: 12px;
  color: rgba(25, 29, 38, 0.86);
}

.picker-field input[type='color'] {
  width: 100%;
  height: 38px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.58);
  background: rgba(255, 255, 255, 0.38);
  padding: 4px;
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

.hex-wrap input,
.gradient-input-grid input {
  border: 1px solid rgba(255, 255, 255, 0.58);
  border-radius: 10px;
  height: 38px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.38);
  color: rgba(27, 31, 40, 0.92);
}

.gradient-input-grid {
  margin-top: 12px;
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr auto;
  gap: 8px;
  align-items: end;
}

.gradient-input-grid label {
  display: grid;
  gap: 4px;
  font-size: 12px;
  color: rgba(25, 29, 38, 0.86);
}

.apply-btn {
  border: 0;
  border-radius: 10px;
  min-width: 80px;
  height: 38px;
  background: rgba(var(--accent-rgb), 0.28);
  color: rgba(245, 241, 255, 0.95);
}

.error-text {
  margin-top: 10px;
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

@media (max-width: 700px) {
  .settings-panel {
    width: calc(100vw - 16px);
    padding: 12px;
    border-radius: 16px;
  }

  .preset-grid,
  .gradient-grid,
  .gradient-input-grid {
    grid-template-columns: 1fr;
  }
}
</style>
