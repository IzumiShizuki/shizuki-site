<template>
  <section class="author-about-experience" data-author-about-layout="shared-shell" aria-label="作者公开内容">
    <div class="author-about-center">
      <template v-if="activeTab === 'about'">
        <AuthorAboutStoryColumn
          :about="about"
          :journey="journey"
          :can-edit="canEdit"
          @edit="$emit('edit')"
          @open-journey="$emit('select-tab', 'journey')"
        />
        <AuthorLifeCardRail
          kind="albums"
          :items="albums"
          :can-manage="canEdit"
          :loading="albumsLoading"
          :error="albumsError"
          @retry="$emit('retry-albums')"
        />
        <AuthorLifeCardRail
          kind="moments"
          :items="moments"
          :can-manage="canEdit"
          :loading="momentsLoading"
          :error="momentsError"
          @retry="$emit('retry-moments')"
        />
      </template>
      <AuthorPublicPostsColumn v-else-if="activeTab === 'posts'" />
    </div>
  </section>
</template>

<script setup>
import AuthorAboutStoryColumn from './AuthorAboutStoryColumn.vue';
import AuthorLifeCardRail from './AuthorLifeCardRail.vue';
import AuthorPublicPostsColumn from './AuthorPublicPostsColumn.vue';

defineProps({
  activeTab: {
    type: String,
    default: 'about'
  },
  about: {
    type: Object,
    required: true
  },
  journey: {
    type: Array,
    default: () => []
  },
  canEdit: {
    type: Boolean,
    default: false
  },
  albums: {
    type: Array,
    default: () => []
  },
  albumsLoading: {
    type: Boolean,
    default: false
  },
  albumsError: {
    type: [Error, Object, Boolean],
    default: null
  },
  moments: {
    type: Array,
    default: () => []
  },
  momentsLoading: {
    type: Boolean,
    default: false
  },
  momentsError: {
    type: [Error, Object, Boolean],
    default: null
  }
});

defineEmits(['select-tab', 'edit', 'retry-albums', 'retry-moments']);
</script>

<style scoped>
.author-about-experience,
.author-about-center {
  min-width: 0;
  min-height: 0;
}

.author-about-center {
  display: grid;
  gap: 18px;
  padding: 2px 4px max(96px, env(safe-area-inset-bottom));
}
</style>
