<template>
  <div class="appearance-settings-content">
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
  </div>
</template>

<script setup>
import { computed, ref } from 'vue';
import { useUiPreferences } from '../../composables/useUiPreferences';

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
  solidColorPicker.value = result.normalized;
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
</script>

<style scoped>
.appearance-settings-content {
  display: grid;
  gap: 8px;
}

.section-block {
  margin-top: 2px;
  display: grid;
  gap: 6px;
}

.section-block.compact {
  margin-top: 4px;
}

.section-block h3 {
  font-size: 15px;
  color: rgba(233, 245, 255, 0.95);
}

.section-block p,
.helper-text {
  color: rgba(178, 203, 228, 0.88);
  line-height: 1.55;
  font-size: 12px;
}

.mode-switch {
  margin-top: 2px;
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 8px;
}

.mode-btn {
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 11px;
  height: 38px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(216, 234, 249, 0.9);
}

.mode-btn.active {
  border-color: var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.72));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.3));
  color: rgba(241, 249, 255, 0.98);
}

.preset-grid,
.gradient-grid {
  margin-top: 4px;
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.preset-btn,
.gradient-btn {
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 12px;
  min-height: 44px;
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 8px 10px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(225, 238, 250, 0.92);
}

.preset-btn.active,
.gradient-btn.active {
  border-color: var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.72));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
}

.swatch {
  width: 18px;
  height: 18px;
  border-radius: 50%;
  border: 1px solid rgba(214, 231, 246, 0.72);
}

.gradient-swatch {
  width: 26px;
  height: 16px;
  border-radius: 6px;
  border: 1px solid rgba(201, 224, 244, 0.74);
}

.custom-row {
  margin-top: 4px;
  display: grid;
  gap: 6px;
}

.picker-row {
  margin-top: 4px;
}

.picker-field {
  display: grid;
  gap: 4px;
  font-size: 12px;
  color: rgba(195, 219, 239, 0.9);
}

.picker-field input[type='color'] {
  width: 100%;
  height: 38px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  padding: 4px;
}

.custom-row label {
  font-size: 13px;
  color: rgba(195, 219, 239, 0.9);
}

.hex-wrap {
  display: grid;
  grid-template-columns: 1fr auto;
  gap: 8px;
}

.hex-wrap input,
.gradient-input-grid input {
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 10px;
  height: 38px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(227, 239, 250, 0.94);
}

.gradient-input-grid {
  margin-top: 4px;
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr auto;
  gap: 8px;
  align-items: end;
}

.gradient-input-grid label {
  display: grid;
  gap: 4px;
  font-size: 12px;
  color: rgba(195, 219, 239, 0.9);
}

.apply-btn {
  border: 1px solid var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.72));
  border-radius: 10px;
  min-width: 80px;
  height: 38px;
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.3));
  color: rgba(241, 249, 255, 0.98);
}

.mode-btn:focus-visible,
.preset-btn:focus-visible,
.gradient-btn:focus-visible,
.apply-btn:focus-visible,
.hex-wrap input:focus-visible,
.gradient-input-grid input:focus-visible,
.picker-field input[type='color']:focus-visible {
  outline: none;
  box-shadow: var(--accent-mode-focus-ring, 0 0 0 3px rgba(var(--accent-rgb), 0.22));
}

.error-text {
  margin-top: 2px;
  color: rgba(255, 171, 189, 0.93);
  font-size: 12px;
}

@media (max-width: 700px) {
  .preset-grid,
  .gradient-grid,
  .gradient-input-grid {
    grid-template-columns: 1fr;
  }
}
</style>
