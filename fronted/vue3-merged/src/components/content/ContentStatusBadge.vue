<template>
  <span
    class="content-status-badge"
    :class="[`status-${variant}`, { 'status-elevated': elevated }]"
    :aria-label="label"
  >
    <i v-if="icon" :class="icon" aria-hidden="true"></i>
    <span class="status-label">{{ label }}</span>
  </span>
</template>

<script setup>
defineProps({
  variant: {
    type: String,
    required: true,
    validator: (value) => ['draft', 'published', 'private', 'public', 'unlisted', 'saving', 'saved', 'error'].includes(value)
  },
  label: {
    type: String,
    required: true
  },
  icon: {
    type: String,
    default: ''
  },
  elevated: {
    type: Boolean,
    default: false
  }
});
</script>

<style scoped>
.content-status-badge {
  display: inline-flex;
  align-items: center;
  gap: var(--space-1);
  padding: var(--space-1) var(--space-3);
  border-radius: var(--radius-pill);
  font-size: 0.8125rem;
  font-weight: 500;
  line-height: 1.4;
  white-space: nowrap;
  transition: background-color var(--dur-fast) var(--ease-out);
}

.status-label {
  letter-spacing: 0.01em;
}

/* Variant styles */
.status-draft {
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  border: 1px solid var(--theme-border-subtle);
}

.status-published {
  background: rgba(143, 223, 178, 0.12);
  color: var(--theme-positive);
  border: 1px solid rgba(143, 223, 178, 0.24);
}

.status-private {
  background: rgba(244, 161, 170, 0.12);
  color: var(--theme-danger);
  border: 1px solid rgba(244, 161, 170, 0.24);
}

.status-public {
  background: var(--accent-mode-fill-soft);
  color: rgb(var(--accent-readable-rgb));
  border: 1px solid var(--accent-mode-border);
}

.status-unlisted {
  background: rgba(243, 201, 119, 0.12);
  color: var(--theme-warning);
  border: 1px solid rgba(243, 201, 119, 0.24);
}

.status-saving {
  background: var(--theme-surface-soft);
  color: var(--theme-text-tertiary);
  border: 1px solid var(--theme-border-subtle);
  animation: pulse 1.5s ease-in-out infinite;
}

.status-saved {
  background: rgba(143, 223, 178, 0.12);
  color: var(--theme-positive);
  border: 1px solid rgba(143, 223, 178, 0.24);
}

.status-error {
  background: rgba(244, 161, 170, 0.18);
  color: var(--theme-danger);
  border: 1px solid rgba(244, 161, 170, 0.32);
}

/* Elevated variant */
.status-elevated {
  background: var(--theme-surface-elevated);
  box-shadow: var(--shadow-sm);
}

.status-elevated.status-published {
  background: rgba(143, 223, 178, 0.18);
}

.status-elevated.status-public {
  background: var(--accent-mode-fill);
}

@keyframes pulse {
  0%, 100% {
    opacity: 1;
  }
  50% {
    opacity: 0.6;
  }
}

@media (prefers-reduced-motion: reduce) {
  .content-status-badge, .content-status-badge i {
    animation: none;
    transition: none;
  }
}

/* Icon sizing */
.content-status-badge i {
  font-size: 0.75rem;
}

/* Responsive adjustments */
@media (max-width: 640px) {
  .content-status-badge {
    font-size: 0.75rem;
    padding: var(--space-1) var(--space-2);
  }
}
</style>
