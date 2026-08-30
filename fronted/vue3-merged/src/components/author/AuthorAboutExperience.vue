<template>
  <div class="author-about-experience" data-author-about-layout="responsive">
    <ThreeColumnContentShell>
      <template v-if="!mobileLayout" #left>
        <StickyCardStack>
          <AuthorProfileRail
            :items="tabs"
            :active-key="activeTab"
            :admin-user="adminUser"
            :profile="profile"
            public-mode
            show-profile
            @select="$emit('select-tab', $event)"
          />
        </StickyCardStack>
      </template>

      <div class="author-about-center">
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
      </div>

      <template v-if="!mobileLayout" #right>
        <AuthorLifeWidgetRail />
      </template>

      <template #auxiliary-trigger>
        <button
          v-if="mobileLayout"
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

    <AuxiliaryDrawer v-if="mobileLayout" v-model="drawerOpen" title="生活侧栏">
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
import AuxiliaryDrawer from '../content/AuxiliaryDrawer.vue';
import StickyCardStack from '../content/StickyCardStack.vue';
import ThreeColumnContentShell from '../content/ThreeColumnContentShell.vue';
import AuthorAboutStoryColumn from './AuthorAboutStoryColumn.vue';
import AuthorLifeCardRail from './AuthorLifeCardRail.vue';
import AuthorLifeWidgetRail from './AuthorLifeWidgetRail.vue';
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

function createMobileQuery() {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') return null;
  return window.matchMedia('(max-width: 899.98px)');
}

const mobileQuery = createMobileQuery();
const mobileLayout = ref(Boolean(mobileQuery?.matches));
const drawerOpen = ref(false);

function syncMobileLayout(event) {
  mobileLayout.value = Boolean(event.matches);
  if (!mobileLayout.value) drawerOpen.value = false;
}

function selectFromDrawer(tabKey) {
  drawerOpen.value = false;
  emit('select-tab', tabKey);
}

if (mobileQuery?.addEventListener) mobileQuery.addEventListener('change', syncMobileLayout);
else mobileQuery?.addListener?.(syncMobileLayout);

onBeforeUnmount(() => {
  if (mobileQuery?.removeEventListener) mobileQuery.removeEventListener('change', syncMobileLayout);
  else mobileQuery?.removeListener?.(syncMobileLayout);
});
</script>

<style scoped>
.author-about-experience,
.author-about-center {
  min-width: 0;
}

.author-about-center {
  display: grid;
  gap: 18px;
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
</style>
