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
  --liquid-bg: linear-gradient(144deg, rgba(10, 21, 35, 0.7), rgba(9, 18, 30, 0.62));
  --liquid-border: rgba(155, 188, 214, 0.24);
  --liquid-shadow: 0 18px 34px rgba(4, 8, 14, 0.24);
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
  border: 1px solid rgba(150, 185, 214, 0.32);
  background: transparent;
  padding: 3px;
  border-radius: 22px;
  box-shadow: 0 12px 22px rgba(4, 10, 16, 0.26);
}

.hero-avatar {
  width: 96px;
  height: 96px;
  border-radius: 20px;
  object-fit: cover;
  box-shadow:
    0 8px 18px rgba(5, 10, 18, 0.26),
    inset 0 0 0 1px rgba(173, 206, 230, 0.32);
}

.hero-avatar-action {
  border: 0;
  border-radius: 999px;
  min-height: 28px;
  padding: 0 10px;
  font-size: 11px;
  color: rgba(213, 233, 248, 0.95);
  background: rgba(133, 176, 205, 0.16);
  box-shadow: inset 0 0 0 1px rgba(132, 178, 210, 0.26);
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
  color: rgba(140, 221, 244, 0.95);
}

.hero-title {
  font-size: clamp(20px, 2.6vw, 29px);
  line-height: 1.2;
  color: rgba(242, 248, 255, 0.96);
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
}

.hero-subtitle {
  color: rgba(188, 210, 232, 0.88);
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
  color: rgba(220, 236, 250, 0.95);
  background: rgba(146, 183, 214, 0.14);
  box-shadow: inset 0 0 0 1px rgba(142, 182, 215, 0.24);
}

.meta-pill.groups {
  background: rgba(91, 200, 226, 0.16);
  box-shadow: inset 0 0 0 1px rgba(92, 204, 232, 0.34);
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
}

.chip.accent {
  background: rgba(72, 188, 223, 0.2);
  box-shadow: inset 0 0 0 1px rgba(84, 206, 236, 0.4);
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
