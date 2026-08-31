<template>
  <div class="author-about-experience" data-author-about-layout="responsive">
    <ThreeColumnContentShell class="author-public-content-shell" main-tag="div">
      <template v-if="!compactLayout" #left>
        <StickyCardStack>
          <AuthorProfileRail
            :items="tabs"
            :active-key="activeTab"
            :admin-user="adminUser"
            :profile="profile"
            public-mode
            workspace
            show-profile
            @select="$emit('select-tab', $event)"
          />
        </StickyCardStack>
      </template>

      <SubtleScrollArea
        tag="section"
        class="author-about-center"
        :scrollable="!compactLayout"
        :app-scroll-owner="!compactLayout"
        aria-label="作者公开内容"
      >
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
          :loading="albumsLoading"
          :error="albumsError"
          @retry="$emit('retry-albums')"
          />
          <AuthorLifeCardRail
          kind="moments"
          :items="moments"
          :loading="momentsLoading"
          :error="momentsError"
          @retry="$emit('retry-moments')"
          />
        </template>
        <AuthorPublicPostsColumn v-else-if="activeTab === 'posts'" />
      </SubtleScrollArea>

      <template v-if="!compactLayout" #right>
        <AuthorLifeWidgetRail />
      </template>

      <template #auxiliary-trigger>
        <button
          v-if="compactLayout"
          type="button"
          class="life-drawer-trigger"
          aria-haspopup="dialog"
          :aria-expanded="drawerOpen"
          @click="drawerOpen = true"
        >
          <i class="fas fa-sparkles" aria-hidden="true"></i>
          导航、天气与一言
        </button>
      </template>
    </ThreeColumnContentShell>

    <AuxiliaryDrawer v-if="compactLayout" v-model="drawerOpen" title="生活侧栏">
      <AuthorProfileRail
        :items="tabs"
        :active-key="activeTab"
        :admin-user="adminUser"
        :profile="profile"
        public-mode
        show-profile
        @select="selectFromDrawer"
      />
      <AuthorLifeWidgetRail sticky-top="0px" />
    </AuxiliaryDrawer>
  </div>
</template>

<script setup>
import { onBeforeUnmount, ref } from 'vue';
import SubtleScrollArea from '../SubtleScrollArea.vue';
import AuxiliaryDrawer from '../content/AuxiliaryDrawer.vue';
import StickyCardStack from '../content/StickyCardStack.vue';
import ThreeColumnContentShell from '../content/ThreeColumnContentShell.vue';
import AuthorAboutStoryColumn from './AuthorAboutStoryColumn.vue';
import AuthorLifeCardRail from './AuthorLifeCardRail.vue';
import AuthorLifeWidgetRail from './AuthorLifeWidgetRail.vue';
import AuthorPublicPostsColumn from './AuthorPublicPostsColumn.vue';
import AuthorProfileRail from './AuthorProfileRail.vue';

defineProps({
  tabs: {
    type: Array,
    default: () => []
  },
  activeTab: {
    type: String,
    default: 'about'
  },
  adminUser: {
    type: Boolean,
    default: false
  },
  about: {
    type: Object,
    required: true
  },
  profile: {
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

const emit = defineEmits(['select-tab', 'edit', 'retry-albums', 'retry-moments']);

function createCompactQuery() {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') return null;
  return window.matchMedia('(max-width: 1199.98px)');
}

const compactQuery = createCompactQuery();
const compactLayout = ref(Boolean(compactQuery?.matches));
const drawerOpen = ref(false);

function syncCompactLayout(event) {
  compactLayout.value = Boolean(event.matches);
  if (!compactLayout.value) drawerOpen.value = false;
}

function selectFromDrawer(tabKey) {
  drawerOpen.value = false;
  emit('select-tab', tabKey);
}

if (compactQuery?.addEventListener) compactQuery.addEventListener('change', syncCompactLayout);
else compactQuery?.addListener?.(syncCompactLayout);

onBeforeUnmount(() => {
  if (compactQuery?.removeEventListener) compactQuery.removeEventListener('change', syncCompactLayout);
  else compactQuery?.removeListener?.(syncCompactLayout);
});
</script>

<style scoped>
.author-about-experience,
.author-about-center {
  min-width: 0;
}

.author-about-experience,
.author-public-content-shell,
.author-about-center {
  min-height: 0;
}

.author-about-experience,
.author-public-content-shell {
  height: 100%;
}

.author-public-content-shell {
  grid-template-rows: minmax(0, 1fr);
}

:deep(.author-public-content-shell .content-shell__left),
:deep(.author-public-content-shell .content-shell__main),
:deep(.author-public-content-shell .content-shell__right) {
  min-height: 0;
  height: 100%;
}

:deep(.author-public-content-shell .content-shell__left),
:deep(.author-public-content-shell .content-shell__right) {
  align-self: stretch;
  overflow-y: auto;
  overscroll-behavior: contain;
}

.author-about-center {
  display: grid;
  gap: 18px;
  height: 100%;
  padding: 2px 4px 8px;
  overscroll-behavior: contain;
}

.life-drawer-trigger {
  min-height: 46px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 9px;
  padding: 0 18px;
  border: 1px solid var(--theme-border-strong, rgba(255, 255, 255, 0.25));
  border-radius: 999px;
  color: var(--theme-text-primary);
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 92%, transparent);
  box-shadow: 0 14px 30px rgba(8, 10, 20, 0.2);
  backdrop-filter: blur(18px) saturate(1.18);
  cursor: pointer;
}

.life-drawer-trigger:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

@media (max-width: 1199.98px) {
  .author-about-experience,
  .author-public-content-shell,
  .author-about-center {
    height: auto;
  }

  .author-about-center {
    padding: 0;
    overflow: visible;
  }
}
</style>
