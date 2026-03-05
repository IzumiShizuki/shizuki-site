<template>
  <article class="section-item liquid-material" :class="{ open }">
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
        class="head-toggle ripple-trigger"
        type="button"
        :aria-expanded="open ? 'true' : 'false'"
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
    </div>

    <transition name="section-body">
      <div v-if="open" class="section-body">
        <slot />
      </div>
    </transition>
  </article>
</template>

<script setup>
defineProps({
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
  }
});

defineEmits(['toggle', 'avatar-click']);
</script>

<style scoped>
.section-item {
  --liquid-bg: linear-gradient(148deg, rgba(9, 17, 29, 0.58), rgba(8, 14, 24, 0.5));
  --liquid-border: rgba(165, 190, 214, 0.24);
  --liquid-shadow: 0 16px 30px rgba(4, 9, 16, 0.2);
  border-radius: 16px;
  overflow: hidden;
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
  color: rgba(236, 244, 255, 0.95);
  text-align: left;
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 10px;
}

.head-toggle:focus-visible,
.section-avatar-btn:focus-visible {
  outline: 2px solid rgba(93, 214, 243, 0.72);
  outline-offset: 2px;
  border-radius: 12px;
}

.section-avatar-btn {
  border: 1px solid rgba(167, 189, 212, 0.28);
  background: rgba(221, 239, 255, 0.08);
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
    0 8px 16px rgba(5, 9, 16, 0.24),
    inset 0 0 0 1px rgba(184, 206, 229, 0.3);
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
  background: rgba(78, 186, 222, 0.18);
  color: rgba(167, 235, 252, 0.95);
  box-shadow: inset 0 0 0 1px rgba(130, 214, 239, 0.34);
}

.section-icon i {
  font-size: 11px;
}

.section-title {
  font-size: 14px;
  font-weight: 640;
  letter-spacing: 0.01em;
  color: rgba(236, 244, 254, 0.96);
}

.section-summary {
  color: rgba(184, 208, 232, 0.86);
  font-size: 12px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.head-meta {
  display: flex;
  align-items: center;
  gap: 8px;
}

.status-chip {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  background: rgba(70, 187, 220, 0.16);
  color: rgba(198, 238, 250, 0.94);
  box-shadow: inset 0 0 0 1px rgba(95, 210, 240, 0.34);
}

.chevron {
  width: 26px;
  height: 26px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  font-size: 13px;
  color: rgba(188, 214, 238, 0.86);
  background: rgba(146, 183, 217, 0.14);
  box-shadow: inset 0 0 0 1px rgba(144, 183, 218, 0.2);
  transform: rotate(0deg);
  transition: transform 0.24s ease;
}

.chevron.open {
  transform: rotate(180deg);
}

.section-body {
  padding: 0 16px 16px;
  color: rgba(224, 237, 250, 0.96);
}

.section-body-enter-active,
.section-body-leave-active {
  transition: all 0.24s ease;
}

.section-body-enter-from,
.section-body-leave-to {
  opacity: 0;
  transform: translateY(-8px);
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
