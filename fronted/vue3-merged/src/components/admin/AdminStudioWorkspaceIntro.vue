<template>
  <section class="studio-workspace" :data-studio-workspace="workspaceKey">
    <header class="studio-workspace__header">
      <span class="studio-workspace__icon" aria-hidden="true"><i :class="icon"></i></span>
      <div>
        <p>{{ eyebrow }}</p>
        <h2>{{ title }}</h2>
      </div>
      <span class="studio-workspace__guard"><i class="fas fa-shield-halved" aria-hidden="true"></i> 服务端权限保护</span>
    </header>

    <p class="studio-workspace__description">{{ description }}</p>

    <div class="studio-workspace__capabilities" aria-label="工作区能力边界">
      <article v-for="item in capabilities" :key="item.title">
        <i :class="item.icon" aria-hidden="true"></i>
        <strong>{{ item.title }}</strong>
        <span>{{ item.description }}</span>
      </article>
    </div>

    <p class="studio-workspace__status">
      <i class="fas fa-circle-info" aria-hidden="true"></i>
      工作区入口与权限边界已接入；数据编辑能力会在本工作区内按领域逐步启用。
    </p>
  </section>
</template>

<script setup>
defineProps({
  workspaceKey: { type: String, required: true },
  eyebrow: { type: String, default: 'Content Studio' },
  title: { type: String, required: true },
  description: { type: String, required: true },
  icon: { type: String, default: 'fas fa-layer-group' },
  capabilities: { type: Array, default: () => [] }
});
</script>

<style scoped>
.studio-workspace {
  display: grid;
  gap: 20px;
  min-height: 360px;
  padding: clamp(18px, 3vw, 30px);
}

.studio-workspace__header {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  align-items: center;
  gap: 14px;
}

.studio-workspace__icon {
  width: 48px;
  height: 48px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  border: 1px solid var(--accent-mode-border, rgba(var(--accent-rgb), 0.3));
  border-radius: 16px;
  color: var(--theme-text-primary);
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.14));
}

.studio-workspace__header p,
.studio-workspace__header h2,
.studio-workspace__description,
.studio-workspace__status {
  margin: 0;
}

.studio-workspace__header p {
  color: var(--theme-text-tertiary, var(--theme-text-secondary));
  font-size: 10px;
  font-weight: 760;
  letter-spacing: 0.14em;
  text-transform: uppercase;
}

.studio-workspace__header h2 {
  color: var(--theme-text-primary);
  font-size: clamp(22px, 3vw, 30px);
}

.studio-workspace__guard {
  display: inline-flex;
  align-items: center;
  gap: 7px;
  padding: 7px 10px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.12));
  border-radius: 999px;
  color: var(--theme-text-secondary);
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.06));
  font-size: 11px;
}

.studio-workspace__description {
  max-width: 760px;
  color: var(--theme-text-secondary);
  line-height: 1.75;
}

.studio-workspace__capabilities {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 12px;
}

.studio-workspace__capabilities article {
  min-width: 0;
  display: grid;
  gap: 8px;
  padding: 16px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.12));
  border-radius: 16px;
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.05));
}

.studio-workspace__capabilities i {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
}

.studio-workspace__capabilities strong {
  color: var(--theme-text-primary);
}

.studio-workspace__capabilities span {
  color: var(--theme-text-secondary);
  font-size: 12px;
  line-height: 1.55;
}

.studio-workspace__status {
  align-self: end;
  display: flex;
  align-items: flex-start;
  gap: 8px;
  padding: 12px 14px;
  border-radius: 13px;
  color: var(--theme-text-secondary);
  background: rgba(var(--accent-rgb), 0.08);
  font-size: 12px;
  line-height: 1.55;
}

@media (max-width: 760px) {
  .studio-workspace__header {
    grid-template-columns: auto minmax(0, 1fr);
  }

  .studio-workspace__guard {
    grid-column: 1 / -1;
    justify-self: start;
  }

  .studio-workspace__capabilities {
    grid-template-columns: 1fr;
  }
}
</style>
