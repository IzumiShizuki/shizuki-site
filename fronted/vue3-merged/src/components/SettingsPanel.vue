<template>
  <transition name="settings-fade">
    <div v-if="visible" class="settings-mask" @click.self="emit('close')">
      <section class="settings-panel liquid-material">
        <header class="panel-header">
          <h2>外观设置</h2>
          <button class="close-btn ripple-trigger" type="button" @click="emit('close')">关闭</button>
        </header>
        <AppearanceSettingsContent />

        <footer class="panel-footer">
          <button class="reset-btn ripple-trigger" type="button" @click="resetDefault">恢复默认淡紫</button>
        </footer>
      </section>
    </div>
  </transition>
</template>

<script setup>
import AppearanceSettingsContent from './profile/AppearanceSettingsContent.vue';
import { useUiPreferences } from '../composables/useUiPreferences';

defineProps({
  visible: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['close']);
const ui = useUiPreferences();

function resetDefault() {
  ui.resetAccent();
  ui.setAccentMode('solid');
  ui.setAccentGradientPreset('berry');
}
</script>

<style scoped>
.settings-mask {
  position: fixed;
  inset: 0;
  z-index: 2000;
  display: grid;
  place-items: center;
  padding: 10px;
  background:
    radial-gradient(circle at 10% 8%, rgba(62, 176, 203, 0.2), transparent 48%),
    radial-gradient(circle at 88% 94%, rgba(46, 93, 155, 0.18), transparent 42%),
    rgba(5, 10, 16, 0.62);
  backdrop-filter: blur(8px) saturate(120%);
  -webkit-backdrop-filter: blur(8px) saturate(120%);
}

.settings-panel {
  --liquid-bg: linear-gradient(155deg, rgba(9, 19, 31, 0.85), rgba(7, 14, 24, 0.82));
  --liquid-border: rgba(156, 190, 216, 0.3);
  --liquid-shadow: 0 26px 54px rgba(3, 8, 15, 0.52);
  width: min(92vw, 640px);
  border-radius: 22px;
  padding: 16px;
  color: rgba(225, 238, 250, 0.95);
  max-height: calc(100dvh - 20px);
  overflow: auto;
}

.settings-panel::-webkit-scrollbar {
  width: 8px;
}

.settings-panel::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(118, 161, 198, 0.36);
}

.panel-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.panel-header h2 {
  font-size: 20px;
  letter-spacing: 0.02em;
  color: rgba(237, 246, 255, 0.97);
}

.close-btn {
  border: 1px solid rgba(162, 194, 218, 0.32);
  border-radius: 11px;
  min-width: 64px;
  height: 34px;
  background: rgba(161, 193, 218, 0.14);
  color: rgba(210, 231, 247, 0.92);
}

.close-btn:focus-visible,
.reset-btn:focus-visible {
  outline: 2px solid rgba(95, 214, 244, 0.7);
  outline-offset: 2px;
}

.panel-footer {
  margin-top: 14px;
}

.reset-btn {
  border: 1px solid rgba(148, 183, 208, 0.3);
  border-radius: 10px;
  min-width: 138px;
  height: 36px;
  background: rgba(149, 184, 210, 0.14);
  color: rgba(214, 233, 248, 0.92);
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
    width: calc(100vw - 14px);
    padding: 12px;
    border-radius: 18px;
  }
}
</style>
