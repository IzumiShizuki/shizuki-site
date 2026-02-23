<template>
  <section class="hero-card liquid-material">
    <button
      class="hero-avatar-btn ripple-trigger"
      type="button"
      @click="$emit('avatar-click')"
      :aria-label="avatarActionLabel"
    >
      <img class="hero-avatar" :src="avatarUrl" alt="avatar" />
    </button>

    <div class="hero-main">
      <p class="hero-eyebrow">{{ eyebrow }}</p>
      <h2 class="hero-title">{{ title }}</h2>
      <p class="hero-subtitle">{{ subtitle }}</p>

      <div class="hero-chips">
        <span class="chip">{{ `ID ${userIdText}` }}</span>
        <span v-if="groupsText" class="chip">{{ groupsText }}</span>
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
  --liquid-bg: linear-gradient(145deg, rgba(18, 30, 46, 0.52), rgba(9, 15, 26, 0.45));
  --liquid-border: rgba(214, 229, 247, 0.2);
  --liquid-shadow: 0 22px 36px rgba(4, 7, 13, 0.2);
  border-radius: 18px;
  padding: 18px;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 16px;
  align-items: center;
}

.hero-avatar-btn {
  border: 0;
  background: transparent;
  padding: 0;
  border-radius: 18px;
}

.hero-avatar {
  width: 92px;
  height: 92px;
  border-radius: 18px;
  object-fit: cover;
  box-shadow:
    0 10px 22px rgba(5, 8, 15, 0.3),
    inset 0 0 0 1px rgba(218, 231, 248, 0.38);
}

.hero-main {
  display: grid;
  gap: 6px;
  min-width: 0;
}

.hero-eyebrow {
  font-size: 11px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.94);
}

.hero-title {
  font-size: clamp(19px, 2.4vw, 27px);
  line-height: 1.2;
  color: rgba(242, 248, 255, 0.96);
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
}

.hero-subtitle {
  color: rgba(212, 224, 242, 0.86);
  font-size: 13px;
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
  color: rgba(230, 239, 251, 0.95);
  background: rgba(255, 255, 255, 0.13);
  box-shadow: inset 0 0 0 1px rgba(215, 229, 247, 0.2);
}

.chip.accent {
  background: rgba(var(--accent-rgb), 0.22);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.42);
}

@media (max-width: 860px) {
  .hero-card {
    padding: 14px;
    gap: 12px;
  }

  .hero-avatar {
    width: 78px;
    height: 78px;
  }
}
</style>
