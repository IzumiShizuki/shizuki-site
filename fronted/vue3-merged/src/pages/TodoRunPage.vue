<template>
  <main class="todo-run-page">
    <RouterLink to="/">返回首页</RouterLink>
    <TodoDevelopmentPanel v-if="owner" :key="owner + ':' + todoId" :todo-id="todoId"
      :account-id="owner" :authorized-fetch="authorizedFetch" linked-view />
    <p v-else>请登录查看任务。</p>
  </main>
</template>
<script setup>
import { computed } from 'vue';
import { useAuthSession } from '../composables/useAuthSession';
import TodoDevelopmentPanel from '../components/lightapps/timeprism/TodoDevelopmentPanel.vue';
defineProps({ todoId: String });
const auth = useAuthSession();
const owner = computed(() => auth.isAuthenticated.value ? String(auth.user.value?.userId || '') : '');
const authorizedFetch = computed(() => {
  const expectedUserId = owner.value;
  return (path, options) => auth.authorizedFetch(path, options, { expectedUserId });
});
</script>
<style scoped>
.todo-run-page { width:min(860px,92%); margin:5rem auto 2rem; padding:clamp(16px,3vw,32px); border-radius:16px;
  background:var(--la-panel-bg,Canvas); color:var(--la-text,CanvasText); }
</style>
