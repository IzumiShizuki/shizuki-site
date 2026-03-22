<template>
  <div class="section-accordion">
    <ProfileSectionItem
      v-for="section in sections"
      :key="section.key"
      :section-key="section.key"
      :title="section.title"
      :summary="section.summary"
      :icon="section.icon || ''"
      :status-text="section.statusText || ''"
      :avatar-url="section.avatarUrl || avatarUrl || ''"
      :avatar-action-label="avatarActionLabel"
      :open="collapsible ? isSectionOpen(section.key) : true"
      :collapsible="collapsible"
      :focused="section.key === focusKey"
      @toggle="$emit('toggle', section.key)"
      @avatar-click="$emit('avatar-click', section.key)"
    >
      <slot :name="`section-${section.key}`" :section="section" />
    </ProfileSectionItem>
  </div>
</template>

<script setup>
import ProfileSectionItem from './ProfileSectionItem.vue';

const props = defineProps({
  sections: {
    type: Array,
    default: () => []
  },
  openKeys: {
    type: Array,
    default: () => []
  },
  collapsible: {
    type: Boolean,
    default: true
  },
  focusKey: {
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
  }
});

defineEmits(['toggle', 'avatar-click']);

function isSectionOpen(sectionKey) {
  return Array.isArray(props.openKeys) && props.openKeys.includes(sectionKey);
}
</script>

<style scoped>
.section-accordion {
  display: grid;
  grid-template-columns: repeat(12, minmax(0, 1fr));
  grid-auto-flow: dense;
  gap: 14px;
  align-items: start;
}

.section-accordion :deep(.section-item) {
  grid-column: span 6;
  align-self: start;
}

.section-accordion :deep(.section-item[data-section-key='overview']),
.section-accordion :deep(.section-item[data-section-key='recent']),
.section-accordion :deep(.section-item[data-section-key='avatar']),
.section-accordion :deep(.section-item[data-section-key='account-info']),
.section-accordion :deep(.section-item[data-section-key='oauth-bind']),
.section-accordion :deep(.section-item[data-section-key='advanced']) {
  grid-column: span 4;
}

.section-accordion :deep(.section-item[data-section-key='quick-actions']),
.section-accordion :deep(.section-item[data-section-key='workspace']),
.section-accordion :deep(.section-item[data-section-key='archive']),
.section-accordion :deep(.section-item[data-section-key='appearance']) {
  grid-column: span 8;
}

.section-accordion :deep(.section-item[data-section-key='music-auth']),
.section-accordion :deep(.section-item[data-section-key='email-bind']),
.section-accordion :deep(.section-item[data-section-key='change-password']) {
  grid-column: span 12;
}

@media (max-width: 1060px) {
  .section-accordion {
    grid-template-columns: repeat(2, minmax(0, 1fr));
    gap: 10px;
  }

  .section-accordion :deep(.section-item),
  .section-accordion :deep(.section-item[data-section-key='overview']),
  .section-accordion :deep(.section-item[data-section-key='recent']),
  .section-accordion :deep(.section-item[data-section-key='avatar']),
  .section-accordion :deep(.section-item[data-section-key='account-info']),
  .section-accordion :deep(.section-item[data-section-key='oauth-bind']),
  .section-accordion :deep(.section-item[data-section-key='advanced']),
  .section-accordion :deep(.section-item[data-section-key='quick-actions']),
  .section-accordion :deep(.section-item[data-section-key='workspace']),
  .section-accordion :deep(.section-item[data-section-key='archive']),
  .section-accordion :deep(.section-item[data-section-key='appearance']) {
    grid-column: span 1;
  }

  .section-accordion :deep(.section-item[data-section-key='music-auth']),
  .section-accordion :deep(.section-item[data-section-key='email-bind']),
  .section-accordion :deep(.section-item[data-section-key='change-password']) {
    grid-column: 1 / -1;
  }
}

@media (max-width: 760px) {
  .section-accordion {
    grid-template-columns: 1fr;
  }

  .section-accordion :deep(.section-item),
  .section-accordion :deep(.section-item[data-section-key='overview']),
  .section-accordion :deep(.section-item[data-section-key='recent']),
  .section-accordion :deep(.section-item[data-section-key='avatar']),
  .section-accordion :deep(.section-item[data-section-key='account-info']),
  .section-accordion :deep(.section-item[data-section-key='oauth-bind']),
  .section-accordion :deep(.section-item[data-section-key='advanced']),
  .section-accordion :deep(.section-item[data-section-key='quick-actions']),
  .section-accordion :deep(.section-item[data-section-key='workspace']),
  .section-accordion :deep(.section-item[data-section-key='archive']),
  .section-accordion :deep(.section-item[data-section-key='music-auth']),
  .section-accordion :deep(.section-item[data-section-key='appearance']),
  .section-accordion :deep(.section-item[data-section-key='email-bind']),
  .section-accordion :deep(.section-item[data-section-key='change-password']) {
    grid-column: auto;
  }
}
</style>
