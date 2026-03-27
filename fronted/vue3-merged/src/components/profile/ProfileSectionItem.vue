<template>
  <article class="section-item liquid-material" :class="{ open, focused }" :data-section-key="sectionKey">
    <div class="section-head">
      <button
        v-if="avatarUrl"
        class="section-avatar-btn ripple-trigger"
        type="button"
        :aria-label="avatarActionLabel"
        @click.stop="$emit('avatar-click')"
      >
        <img class="section-avatar" :src="avatarUrl" alt="section-avatar" />
      </button>

      <button
        v-if="collapsible"
        class="head-toggle ripple-trigger"
        type="button"
        :aria-expanded="open ? 'true' : 'false'"
        :aria-pressed="focused ? 'true' : 'false'"
        @click="$emit('toggle')"
      >
        <div class="head-main">
          <div class="section-title-row">
            <span v-if="icon" class="section-icon" aria-hidden="true">
              <i :class="icon"></i>
            </span>
            <p class="section-title">{{ title }}</p>
          </div>
          <p class="section-summary">{{ summary }}</p>
        </div>
        <div class="head-meta">
          <span v-if="statusText" class="status-chip">{{ statusText }}</span>
          <span class="chevron" :class="{ open }"><i class="fas fa-angle-down"></i></span>
        </div>
      </button>

      <div v-else class="head-static">
        <div class="head-main">
          <div class="section-title-row">
            <span v-if="icon" class="section-icon" aria-hidden="true">
              <i :class="icon"></i>
            </span>
            <p class="section-title">{{ title }}</p>
          </div>
          <p class="section-summary">{{ summary }}</p>
        </div>
        <div class="head-meta">
          <span v-if="statusText" class="status-chip">{{ statusText }}</span>
        </div>
      </div>
    </div>

    <div v-show="open" class="section-body">
      <slot />
    </div>
  </article>
</template>

<script setup>
defineProps({
  sectionKey: {
    type: String,
    default: ''
  },
  title: {
    type: String,
    required: true
  },
  summary: {
    type: String,
    default: ''
  },
  icon: {
    type: String,
    default: ''
  },
  avatarUrl: {
    type: String,
    default: ''
  },
  avatarActionLabel: {
    type: String,
    default: '头像操作'
  },
  statusText: {
    type: String,
    default: ''
  },
  open: {
    type: Boolean,
    default: false
  },
  focused: {
    type: Boolean,
    default: false
  },
  collapsible: {
    type: Boolean,
    default: true
  }
});

defineEmits(['toggle', 'avatar-click']);
</script>

<style scoped>
.section-item {
  --liquid-bg: var(--theme-surface, linear-gradient(148deg, rgba(34, 19, 16, 0.72), rgba(18, 12, 10, 0.66)));
  --liquid-border: var(--theme-border, rgba(255, 224, 208, 0.24));
  --liquid-shadow: 0 16px 30px rgba(18, 9, 8, 0.2);
  border-radius: 16px;
  overflow: hidden;
  isolation: isolate;
  transform: translateZ(0);
}

.section-item.focused {
  box-shadow:
    0 0 0 1px var(--accent-mode-border-strong, rgba(var(--accent-rgb), 0.42)),
    0 20px 38px rgba(18, 9, 8, 0.24);
}

.section-head {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 14px 14px 13px;
}

.head-toggle {
  flex: 1;
  min-width: 0;
  border: 0;
  padding: 0;
  background: transparent;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  text-align: left;
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 10px;
  border-radius: 14px;
  transition:
    background-color 0.18s ease,
    box-shadow 0.18s ease;
}

.head-static {
  flex: 1;
  min-width: 0;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  display: flex;
  justify-content: space-between;
  align-items: start;
  gap: 10px;
  border-radius: 14px;
}

.section-item.focused .head-toggle {
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.16));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.section-item.focused .head-static {
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.16));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  padding: 10px 12px;
  margin: -10px -12px;
}

.head-toggle:focus-visible,
.section-avatar-btn:focus-visible {
  outline: 2px solid var(--accent-mode-border-strong, rgba(var(--accent-rgb), 0.72));
  outline-offset: 2px;
  border-radius: 12px;
}

.section-avatar-btn {
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
  padding: 2px;
  border-radius: 11px;
  flex-shrink: 0;
  display: inline-flex;
  cursor: pointer;
}

.section-avatar {
  width: 36px;
  height: 36px;
  border-radius: 11px;
  object-fit: cover;
  box-shadow:
    0 8px 16px rgba(18, 9, 8, 0.24),
    inset 0 0 0 1px var(--theme-border-strong, rgba(255, 214, 194, 0.34));
}

.head-main {
  min-width: 0;
  display: grid;
  gap: 5px;
}

.section-title-row {
  display: flex;
  align-items: center;
  gap: 8px;
}

.section-icon {
  width: 22px;
  height: 22px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.16));
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.section-icon i {
  font-size: 11px;
}

.section-title {
  font-size: 14px;
  font-weight: 640;
  letter-spacing: 0.01em;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
}

.section-summary {
  color: var(--theme-text-secondary, rgba(231, 211, 196, 0.88));
  font-size: 12px;
  line-height: 1.45;
}

.head-meta {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-shrink: 0;
}

.status-chip {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.16));
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.chevron {
  width: 26px;
  height: 26px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  font-size: 13px;
  color: var(--theme-text-secondary, rgba(231, 211, 196, 0.88));
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
  box-shadow: inset 0 0 0 1px var(--theme-border, rgba(255, 224, 208, 0.24));
  transform: rotate(0deg);
  transition: transform 0.24s ease;
}

.chevron.open {
  transform: rotate(180deg);
}

.section-body {
  padding: 2px 16px 16px;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  display: grid;
  gap: 8px;
}

@media (max-width: 860px) {
  .section-head {
    padding: 13px 14px;
  }

  .section-body {
    padding: 0 14px 14px;
  }
}
</style>
