<template>
  <TopMenu
    v-bind="props"
    @toggle-menu="$emit('toggle-menu')"
    @toggle-ai-chat="$emit('toggle-ai-chat')"
    @select-main-route="$emit('select-main-route', $event)"
    @open-atmosphere-panel="$emit('open-atmosphere-panel')"
    @open-background-picker="$emit('open-background-picker')"
    @open-profile="$emit('open-profile')"
    @open-admin="$emit('open-admin')"
    @open-author="$emit('open-author')"
    @open-auth="$emit('open-auth')"
    @logout="$emit('logout')"
  />
</template>

<script setup>
import TopMenu from '../TopMenu.vue';

const props = defineProps({
  menuExpanded: { type: Boolean, default: false },
  aiChatActive: { type: Boolean, default: false },
  isAuthenticated: { type: Boolean, default: false },
  isAdmin: { type: Boolean, default: false },
  displayName: { type: String, default: '' },
  avatarUrl: { type: String, default: '' },
  authorAvatarUrl: { type: String, default: '' },
  musicActive: { type: Boolean, default: false },
  ambientActive: { type: Boolean, default: false },
  effectActive: { type: Boolean, default: false }
});

defineEmits([
  'toggle-menu',
  'toggle-ai-chat',
  'select-main-route',
  'open-atmosphere-panel',
  'open-background-picker',
  'open-profile',
  'open-admin',
  'open-author',
  'open-auth',
  'logout'
]);
</script>
