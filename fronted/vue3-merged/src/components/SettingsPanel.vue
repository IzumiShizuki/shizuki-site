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
          <button class="reset-btn ripple-trigger" type="button" @click="resetDefault">恢复默认奶杏桃粉</button>
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
  ui.setAccentGradientPreset('apricot-blush');
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
    radial-gradient(circle at 10% 8%, var(--theme-spot-a, rgba(var(--accent-rgb), 0.2)), transparent 48%),
    radial-gradient(circle at 88% 94%, var(--theme-spot-b, rgba(var(--accent-rgb), 0.16)), transparent 42%),
    var(--theme-scrim, rgba(24, 14, 12, 0.64));
  backdrop-filter: blur(8px) saturate(120%);
  -webkit-backdrop-filter: blur(8px) saturate(120%);
}

.settings-panel {
  --liquid-bg: var(--theme-surface, linear-gradient(155deg, rgba(33, 18, 15, 0.82), rgba(22, 12, 10, 0.8)));
  --liquid-border: var(--theme-border-strong, rgba(255, 214, 194, 0.34));
  --liquid-shadow: 0 26px 54px rgba(18, 9, 8, 0.46);
  width: min(92vw, 640px);
  border-radius: 22px;
  padding: 16px;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  max-height: calc(100dvh - 20px);
  overflow: auto;
}

.settings-panel::-webkit-scrollbar {
  width: 8px;
}

.settings-panel::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.18));
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
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
}

.close-btn {
  border: 1px solid var(--theme-border-strong, rgba(255, 214, 194, 0.34));
  border-radius: 11px;
  min-width: 64px;
  height: 34px;
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
}

.close-btn:focus-visible,
.reset-btn:focus-visible {
  outline: none;
  box-shadow: var(--accent-mode-focus-ring, 0 0 0 3px rgba(var(--accent-rgb), 0.22));
}

.panel-footer {
  margin-top: 14px;
}

.reset-btn {
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
  border-radius: 10px;
  min-width: 138px;
  height: 36px;
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
  color: var(--theme-text-secondary, rgba(231, 211, 196, 0.88));
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
