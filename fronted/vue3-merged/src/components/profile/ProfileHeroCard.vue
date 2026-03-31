<template>
  <section class="hero-card liquid-material">
    <div class="hero-avatar-col">
      <button
        class="hero-avatar-btn ripple-trigger"
        type="button"
        @click="$emit('avatar-click')"
        :aria-label="avatarActionLabel"
      >
        <img class="hero-avatar" :src="avatarUrl" alt="avatar" />
      </button>
      <button class="hero-avatar-action ripple-trigger" type="button" @click="$emit('avatar-click')">
        {{ avatarActionLabel }}
      </button>
    </div>

    <div class="hero-main">
      <p class="hero-eyebrow">{{ eyebrow }}</p>
      <h2 class="hero-title">{{ title }}</h2>
      <p class="hero-subtitle">{{ subtitle }}</p>

      <div class="hero-meta">
        <span class="meta-pill">{{ `ID ${userIdText}` }}</span>
        <span v-if="groupsText" class="meta-pill groups">{{ groupsText }}</span>
      </div>

      <div class="hero-chips" v-if="chips.length">
        <span v-for="chip in chips" :key="chip" class="chip accent">{{ chip }}</span>
      </div>
    </div>
  </section>
</template>

<script setup>
defineProps({
  avatarUrl: {
    type: String,
    required: true
  },
  avatarActionLabel: {
    type: String,
    default: '头像操作'
  },
  eyebrow: {
    type: String,
    default: 'User Center'
  },
  title: {
    type: String,
    required: true
  },
  subtitle: {
    type: String,
    default: ''
  },
  userIdText: {
    type: String,
    default: '-'
  },
  groupsText: {
    type: String,
    default: ''
  },
  chips: {
    type: Array,
    default: () => []
  }
});

defineEmits(['avatar-click']);
</script>

<style scoped>
.hero-card {
  --liquid-bg: var(--theme-surface, linear-gradient(144deg, rgba(35, 20, 17, 0.74), rgba(18, 12, 10, 0.66)));
  --liquid-border: var(--theme-border, rgba(255, 224, 208, 0.24));
  --liquid-shadow: 0 18px 34px rgba(18, 9, 8, 0.24);
  border-radius: 20px;
  padding: 18px 18px 16px;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 18px;
  align-items: center;
}

.hero-avatar-col {
  display: grid;
  gap: 8px;
  justify-items: center;
}

.hero-avatar-btn {
  border: 1px solid var(--theme-border-strong, rgba(255, 214, 194, 0.34));
  background: transparent;
  padding: 3px;
  border-radius: 22px;
  box-shadow: 0 12px 22px rgba(18, 9, 8, 0.24);
}

.hero-avatar {
  width: 96px;
  height: 96px;
  border-radius: 20px;
  object-fit: cover;
  box-shadow:
    0 8px 18px rgba(18, 9, 8, 0.24),
    inset 0 0 0 1px var(--theme-border-strong, rgba(255, 214, 194, 0.34));
}

.hero-avatar-action {
  border: 0;
  border-radius: 999px;
  min-height: 28px;
  padding: 0 10px;
  font-size: 11px;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
  box-shadow: inset 0 0 0 1px var(--theme-border, rgba(255, 224, 208, 0.24));
}

.hero-main {
  display: grid;
  gap: 8px;
  min-width: 0;
}

.hero-eyebrow {
  font-size: 11px;
  letter-spacing: 0.14em;
  text-transform: uppercase;
  color: rgba(var(--accent-rgb), 0.96);
}

.hero-title {
  font-size: clamp(20px, 2.6vw, 29px);
  line-height: 1.2;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
}

.hero-subtitle {
  color: var(--theme-text-secondary, rgba(231, 211, 196, 0.88));
  font-size: 13px;
}

.hero-meta {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
}

.meta-pill {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
  box-shadow: inset 0 0 0 1px var(--theme-border, rgba(255, 224, 208, 0.24));
}

.meta-pill.groups {
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.16));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.hero-chips {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
}

.chip {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
}

.chip.accent {
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.16));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

:root[data-theme-mode='day'] .hero-card {
  --liquid-bg: var(--theme-panel-surface-elevated, var(--theme-surface-elevated));
  --liquid-shadow: 0 18px 34px rgba(88, 60, 50, 0.08);
}

:root[data-theme-mode='day'] .hero-avatar-btn {
  box-shadow: 0 10px 22px rgba(88, 60, 50, 0.08);
}

:root[data-theme-mode='day'] .hero-avatar {
  box-shadow:
    0 8px 18px rgba(88, 60, 50, 0.08),
    inset 0 0 0 1px var(--theme-border-strong, rgba(255, 214, 194, 0.34));
}

@media (max-width: 860px) {
  .hero-card {
    grid-template-columns: 1fr;
    justify-items: center;
    text-align: center;
    padding: 14px;
    gap: 10px;
  }

  .hero-main {
    justify-items: center;
  }

  .hero-avatar {
    width: 86px;
    height: 86px;
  }
}
</style>
