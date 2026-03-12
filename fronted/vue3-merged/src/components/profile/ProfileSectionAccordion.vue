<template>
  <div class="section-accordion">
    <ProfileSectionItem
      v-for="section in sections"
      :key="section.key"
      :title="section.title"
      :summary="section.summary"
      :icon="section.icon || ''"
      :status-text="section.statusText || ''"
      :avatar-url="section.avatarUrl || avatarUrl || ''"
      :avatar-action-label="avatarActionLabel"
      :open="isSectionOpen(section.key)"
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
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
  align-items: start;
}

@media (max-width: 1060px) {
  .section-accordion {
    grid-template-columns: 1fr;
    gap: 10px;
  }
}
</style>
