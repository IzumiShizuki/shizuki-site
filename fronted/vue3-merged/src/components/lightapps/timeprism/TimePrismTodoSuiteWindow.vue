<template>
  <section class="timeprism-suite">
    <header class="suite-tabs" role="tablist" aria-label="TimePrism modules">
      <button
        v-for="module in modules"
        :key="module.code"
        class="suite-tab ripple-trigger"
        :class="{ active: activeModule === module.code }"
        type="button"
        role="tab"
        :aria-selected="activeModule === module.code"
        @click="activeModule = module.code"
      >
        <i :class="module.iconClass" aria-hidden="true"></i>
        <span>{{ module.label }}</span>
      </button>
    </header>

    <section class="suite-content">
      <KeepAlive>
        <component :is="activeComponent" :window-id="windowId" />
      </KeepAlive>
    </section>
  </section>
</template>

<script setup>
import { computed, ref } from 'vue';
import ProjectsWindow from './ProjectsWindow.vue';
import ScheduleWindow from './ScheduleWindow.vue';
import TaskBoardWindow from './TaskBoardWindow.vue';
import TodoWindow from './TodoWindow.vue';

defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const modules = Object.freeze([
  { code: 'todo', label: 'Todo', iconClass: 'fas fa-list-check' },
  { code: 'board', label: 'Task Board', iconClass: 'fas fa-columns' },
  { code: 'schedule', label: 'Schedule', iconClass: 'fas fa-calendar-days' },
  { code: 'projects', label: 'Projects', iconClass: 'fas fa-folder-tree' }
]);

const moduleMap = Object.freeze({
  todo: TodoWindow,
  board: TaskBoardWindow,
  schedule: ScheduleWindow,
  projects: ProjectsWindow
});

const activeModule = ref('todo');

const activeComponent = computed(() => moduleMap[activeModule.value] || TodoWindow);
</script>

<style scoped>
.timeprism-suite {
  --suite-border: rgba(255, 255, 255, 0.44);
  --suite-btn-bg: rgba(var(--glass-rgb), 0.26);
  --suite-btn-active-bg: rgba(var(--accent-rgb), 0.2);
  --suite-text: rgba(34, 41, 56, 0.9);
  --suite-muted: rgba(55, 64, 84, 0.74);
  display: grid;
  gap: 10px;
  min-height: 0;
}

.suite-tabs {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.suite-tab {
  border: 1px solid var(--suite-border);
  background: var(--suite-btn-bg);
  color: var(--suite-muted);
  border-radius: 999px;
  min-height: 32px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 6px;
  font-size: 13px;
  transition:
    background-color 160ms ease,
    color 160ms ease,
    border-color 160ms ease;
}

.suite-tab.active {
  color: var(--suite-text);
  border-color: rgba(var(--accent-rgb), 0.46);
  background: var(--suite-btn-active-bg);
}

.suite-content {
  min-width: 0;
  min-height: 0;
}

@container lightapp-window-body (max-width: 760px) {
  .suite-tabs {
    display: grid;
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .suite-tab {
    border-radius: 10px;
  }
}

@container lightapp-window-body (max-width: 430px) {
  .suite-tabs {
    grid-template-columns: 1fr;
  }
}
</style>
