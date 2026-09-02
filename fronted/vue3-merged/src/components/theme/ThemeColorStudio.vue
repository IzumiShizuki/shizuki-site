<template>
  <section class="theme-color-studio" :class="`is-${mode}`" :aria-labelledby="titleId">
    <header class="studio-head">
      <div>
        <span>Material 3 Expressive</span>
        <h3 :id="titleId">色彩氛围</h3>
        <p>用现有背景色生成协调、可读的页面与交互色。</p>
      </div>
      <b>{{ activeStyle.label }}</b>
    </header>

    <div class="semantic-preview" aria-label="当前语义色预览">
      <i class="orb primary"></i><i class="orb secondary"></i><i class="orb tertiary"></i>
      <div><strong>让故事染上此刻的颜色</strong><small>{{ modeLabel }} · {{ themeLabel }}</small></div>
      <span class="preview-action"><i class="fas fa-arrow-right"></i></span>
    </div>

    <fieldset>
      <legend>明暗模式</legend>
      <div class="segments">
        <button v-for="item in themeOptions" :key="item.value" type="button" class="ripple-trigger"
          :class="{ active: ui.state.themeMode === item.value }" :aria-pressed="ui.state.themeMode === item.value"
          @click="ui.setThemeMode(item.value)"><i :class="item.icon"></i>{{ item.label }}</button>
      </div>
    </fieldset>

    <fieldset>
      <legend>主色方式</legend>
      <div class="segments">
        <button v-for="item in accentOptions" :key="item.value" type="button" class="ripple-trigger"
          :class="{ active: ui.state.accentMode === item.value }" :aria-pressed="ui.state.accentMode === item.value"
          @click="ui.setAccentMode(item.value)"><i :class="item.icon"></i>{{ item.label }}</button>
      </div>
    </fieldset>

    <fieldset>
      <legend>色板性格</legend>
      <div class="style-grid">
        <button v-for="item in ui.PALETTE_STYLES" :key="item.id" type="button" class="style-card ripple-trigger"
          :class="{ active: ui.state.paletteStyle === item.id }" :aria-pressed="ui.state.paletteStyle === item.id"
          @click="ui.setPaletteStyle(item.id)">
          <span class="style-orbs" :data-style="item.id"><i></i><i></i><i></i></span>
          <span><strong>{{ item.label }}</strong><small v-if="!compact">{{ item.description }}</small></span>
          <i v-if="ui.state.paletteStyle === item.id" class="fas fa-check check"></i>
        </button>
      </div>
    </fieldset>

    <fieldset>
      <legend>{{ ui.state.accentMode === 'gradient' ? '渐变预设' : '纯色预设' }}</legend>
      <div class="seed-grid">
        <template v-if="ui.state.accentMode === 'solid'">
          <button v-for="item in ui.ACCENT_PRESETS" :key="item.hex" type="button" class="seed-btn ripple-trigger"
            :class="{ active: ui.state.accentHex === item.hex }" :aria-pressed="ui.state.accentHex === item.hex"
            @click="applySolid(item.hex)"><i class="color-dot" :style="{ background: item.hex }"></i>{{ item.name }}</button>
        </template>
        <template v-else>
          <button v-for="item in ui.GRADIENT_PRESETS" :key="item.id" type="button" class="seed-btn ripple-trigger"
            :class="{ active: ui.state.accentGradientId === item.id }" :aria-pressed="ui.state.accentGradientId === item.id"
            @click="applyGradient(item.id)"><i class="gradient-dot" :style="{ background: gradientCss(item.startHex, item.endHex) }"></i>{{ item.name }}</button>
        </template>
      </div>
    </fieldset>

    <section v-if="!compact" class="custom-editor" aria-label="自定义颜色">
      <template v-if="ui.state.accentMode === 'solid'">
        <label><span>可视化取色</span><input v-model="solidPicker" type="color" @input="applyPickerSolid" /></label>
        <label><span>自定义 HEX</span><span class="input-action"><input v-model.trim="hexInput" type="text" placeholder="#F2B39D" /><button type="button" @click="applyCustomSolid">应用</button></span></label>
      </template>
      <template v-else>
        <div class="gradient-custom">
          <label><span>起始取色</span><input v-model="startPicker" type="color" @input="applyPickerGradient" /></label>
          <label><span>结束取色</span><input v-model="endPicker" type="color" @input="applyPickerGradient" /></label>
          <label><span>起始色</span><input v-model.trim="startInput" type="text" placeholder="#F6C2A1" /></label>
          <label><span>结束色</span><input v-model.trim="endInput" type="text" placeholder="#EFA0A8" /></label>
        </div>
        <button type="button" class="wide-apply" @click="applyCustomGradient">应用自定义渐变</button>
      </template>
    </section>
    <p v-if="errorMessage" class="error" role="alert">{{ errorMessage }}</p>
  </section>
</template>

<script setup>
import { computed, ref, watch } from 'vue';
import { useUiPreferences } from '../../composables/useUiPreferences';

const props = defineProps({ mode: { type: String, default: 'full', validator: (v) => ['full', 'compact'].includes(v) } });
const ui = useUiPreferences();
const compact = computed(() => props.mode === 'compact');
const titleId = computed(() => `theme-color-title-${props.mode}`);
const activeStyle = computed(() => ui.PALETTE_STYLES.find((x) => x.id === ui.state.paletteStyle) || ui.PALETTE_STYLES[0]);
const modeLabel = computed(() => ui.state.accentMode === 'gradient' ? '双种子渐变' : '单色种子');
const themeLabel = computed(() => ui.state.themeMode === 'day' ? '日间' : '夜间');
const themeOptions = [{ value: 'night', label: '夜间', icon: 'fas fa-moon' }, { value: 'day', label: '日间', icon: 'fas fa-sun' }];
const accentOptions = [{ value: 'solid', label: '纯色', icon: 'fas fa-circle' }, { value: 'gradient', label: '渐变', icon: 'fas fa-circle-half-stroke' }];
const hexInput = ref(ui.state.accentHex);
const solidPicker = ref(ui.state.accentHex);
const startInput = ref(ui.state.accentGradientStartHex);
const endInput = ref(ui.state.accentGradientEndHex);
const startPicker = ref(ui.state.accentGradientStartHex);
const endPicker = ref(ui.state.accentGradientEndHex);
const errorMessage = ref('');

watch(() => [ui.state.accentHex, ui.state.accentGradientStartHex, ui.state.accentGradientEndHex], ([hex, start, end]) => {
  hexInput.value = solidPicker.value = hex;
  startInput.value = startPicker.value = start;
  endInput.value = endPicker.value = end;
});

function applySolid(hex) { const result = ui.setAccentHex(hex); if (result.ok) ui.setAccentMode('solid'); setResult(result); }
function applyGradient(id) { ui.setAccentGradientPreset(id); ui.setAccentMode('gradient'); errorMessage.value = ''; }
function applyCustomSolid() { applySolid(hexInput.value); }
function applyPickerSolid() { hexInput.value = solidPicker.value; applyCustomSolid(); }
function applyCustomGradient() { const result = ui.setAccentGradientCustom(startInput.value, endInput.value); if (result.ok) ui.setAccentMode('gradient'); setResult(result); }
function applyPickerGradient() { startInput.value = startPicker.value; endInput.value = endPicker.value; applyCustomGradient(); }
function setResult(result) { errorMessage.value = result.ok ? '' : result.error; }
function gradientCss(start, end) { return `linear-gradient(135deg, ${start}, ${end})`; }
</script>

<style scoped>
.theme-color-studio{display:grid;gap:16px;color:var(--m3-on-surface,var(--theme-text-primary))}.studio-head{display:flex;justify-content:space-between;align-items:flex-start;gap:14px}.studio-head span{color:var(--m3-primary);font-size:10px;font-weight:800;letter-spacing:.1em;text-transform:uppercase}.studio-head h3{margin:3px 0 0;font-size:18px}.studio-head p{margin:4px 0 0;color:var(--m3-on-surface-variant);font-size:12px}.studio-head b{padding:6px 10px;border-radius:999px;background:var(--m3-primary-container);color:var(--m3-on-primary-container);font-size:11px;white-space:nowrap}.semantic-preview{position:relative;isolation:isolate;min-height:104px;overflow:hidden;display:flex;align-items:flex-end;gap:12px;padding:17px;border:1px solid var(--m3-outline-variant);border-radius:var(--m3e-shape-xl,28px);background:var(--m3-surface-container-low);box-shadow:var(--m3e-elevation-1)}.semantic-preview>.orb{position:absolute;z-index:-1;border-radius:50%;opacity:.84}.orb.primary{width:132px;height:132px;left:-30px;top:-70px;background:var(--m3-primary-container)}.orb.secondary{width:90px;height:90px;right:25%;top:-50px;background:var(--m3-secondary-container)}.orb.tertiary{width:120px;height:120px;right:-35px;bottom:-64px;background:var(--m3-tertiary-container)}.semantic-preview div{display:grid;gap:3px}.semantic-preview small{color:var(--m3-on-surface-variant)}.preview-action{margin-left:auto;width:36px;height:36px;display:grid;place-items:center;border-radius:50%;background:var(--m3-primary);color:var(--m3-on-primary)}fieldset{min-width:0;margin:0;padding:0;border:0}legend{margin-bottom:8px;color:var(--m3-on-surface-variant);font-size:12px;font-weight:700}.segments{display:grid;grid-template-columns:1fr 1fr;gap:4px;padding:4px;border-radius:999px;background:var(--m3-surface-container-high)}button{border:0;font:inherit;cursor:pointer}.segments button{min-height:40px;border-radius:999px;background:transparent;color:var(--m3-on-surface-variant)}.segments button i{margin-right:7px}.segments button.active{background:var(--m3-secondary-container);color:var(--m3-on-secondary-container);font-weight:700}.style-grid,.seed-grid{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:8px}.style-card,.seed-btn{min-width:0;border:1px solid var(--m3-outline-variant);background:var(--m3-surface-container-low);color:var(--m3-on-surface)}.style-card{min-height:56px;display:grid;grid-template-columns:auto minmax(0,1fr) auto;align-items:center;gap:9px;padding:9px;border-radius:16px;text-align:left}.style-card strong,.style-card small{display:block}.style-card strong{font-size:12px}.style-card small{margin-top:2px;color:var(--m3-on-surface-variant);font-size:10px}.style-card.active,.seed-btn.active{border-color:var(--m3-primary);background:var(--m3-primary-container);color:var(--m3-on-primary-container)}.style-card.active small{color:currentColor;opacity:.75}.style-orbs{position:relative;width:32px;height:32px}.style-orbs i{position:absolute;border-radius:50%}.style-orbs i:nth-child(1){width:23px;height:23px;left:0;top:1px;background:var(--m3-primary)}.style-orbs i:nth-child(2){width:17px;height:17px;right:0;bottom:0;background:var(--m3-tertiary)}.style-orbs i:nth-child(3){width:10px;height:10px;right:1px;top:0;background:var(--m3-secondary)}.style-orbs[data-style=expressive] i:first-child{border-radius:38% 62% 68% 32%;transform:rotate(18deg)}.style-orbs[data-style=content] i:nth-child(2){border-radius:4px}.check{color:currentColor}.seed-btn{min-height:42px;display:flex;align-items:center;gap:8px;padding:8px 10px;border-radius:12px;text-align:left;font-size:12px}.color-dot{width:20px;height:20px;border-radius:50%}.gradient-dot{width:29px;height:19px;border-radius:6px}.custom-editor{display:grid;gap:10px;padding:13px;border-radius:16px;background:var(--m3-surface-container)}.custom-editor label{display:grid;gap:5px;color:var(--m3-on-surface-variant);font-size:11px}.custom-editor input{box-sizing:border-box;min-width:0;width:100%;height:40px;border:1px solid var(--m3-outline-variant);border-radius:12px;background:var(--m3-surface-container-lowest);color:var(--m3-on-surface);padding:0 10px}.custom-editor input[type=color]{padding:4px}.input-action{display:grid;grid-template-columns:minmax(0,1fr) auto;gap:8px}.custom-editor button{min-height:40px;padding:0 14px;border-radius:12px;background:var(--m3-primary);color:var(--m3-on-primary);font-weight:700}.gradient-custom{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:9px}.segments button:hover,.style-card:hover,.seed-btn:hover{box-shadow:inset 0 0 0 999px color-mix(in srgb,var(--m3-on-surface) 8%,transparent)}button:focus-visible,input:focus-visible{outline:3px solid color-mix(in srgb,var(--m3-primary) 32%,transparent);outline-offset:2px}.error{margin:0;color:var(--m3-error);font-size:12px}.is-compact{gap:13px}.is-compact .semantic-preview{min-height:90px}.is-compact .style-card{min-height:48px}@media(max-width:680px){.style-grid,.seed-grid,.gradient-custom{grid-template-columns:1fr}.studio-head b{display:none}}
</style>
