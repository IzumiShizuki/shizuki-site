<template>
  <div class="section-accordion">
    <ProfileSectionItem
      v-for="section in sections"
      :key="section.key"
      :title="section.title"
      :summary="section.summary"
      :status-text="section.statusText || ''"
      :open="openKey === section.key"
      @toggle="$emit('toggle', section.key)"
    >
      <slot :name="`section-${section.key}`" :section="section" />
    </ProfileSectionItem>
  </div>
</template>

<script setup>
import ProfileSectionItem from './ProfileSectionItem.vue';

defineProps({
  sections: {
    type: Array,
    default: () => []
  },
  openKey: {
    type: String,
    default: null
  }
});

defineEmits(['toggle']);
</script>

<style scoped>
.section-accordion {
  display: grid;
  gap: 10px;
}
</style>
