<template>
  <section class="timeprism-suite">
    <header class="suite-tabs" role="tablist" aria-label="TimePrism modules">
      <button
        v-for="module in modules"
        :key="module.code"
        class="suite-tab ripple-trigger"
        :class="{ active: session.activeModule === module.code }"
        type="button"
        role="tab"
        :title="module.label"
        :aria-label="module.label"
        :aria-selected="session.activeModule === module.code"
        @click="setActiveModule(module.code)"
      >
        <i :class="module.iconClass" aria-hidden="true"></i>
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
import { computed, provide, reactive } from 'vue';
import ProjectsWindow from './ProjectsWindow.vue';
import ScheduleWindow from './ScheduleWindow.vue';
import TaskBoardWindow from './TaskBoardWindow.vue';
import TodoWindow from './TodoWindow.vue';
import {
  TIMEPRISM_MODULE_BOARD,
  TIMEPRISM_MODULE_PROJECTS,
  TIMEPRISM_MODULE_SCHEDULE,
  TIMEPRISM_MODULE_TODO,
  TIMEPRISM_SUITE_CONTEXT_KEY,
  createTimePrismSuiteSessionState,
  openTodoWithProjectFilter,
  setSuiteActiveModule,
  setSuiteProjectFilters
} from './timePrismSuiteState';

defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const modules = Object.freeze([
  { code: TIMEPRISM_MODULE_TODO, label: 'Todo', iconClass: 'fas fa-list-check' },
  { code: TIMEPRISM_MODULE_BOARD, label: 'Task Board', iconClass: 'fas fa-columns' },
  { code: TIMEPRISM_MODULE_SCHEDULE, label: 'Schedule', iconClass: 'fas fa-calendar-days' },
  { code: TIMEPRISM_MODULE_PROJECTS, label: 'Projects', iconClass: 'fas fa-folder-tree' }
]);

const moduleMap = Object.freeze({
  [TIMEPRISM_MODULE_TODO]: TodoWindow,
  [TIMEPRISM_MODULE_BOARD]: TaskBoardWindow,
  [TIMEPRISM_MODULE_SCHEDULE]: ScheduleWindow,
  [TIMEPRISM_MODULE_PROJECTS]: ProjectsWindow
});

const session = reactive(createTimePrismSuiteSessionState());

function setActiveModule(code) {
  setSuiteActiveModule(session, code);
}

function setProjectFilters(ids) {
  setSuiteProjectFilters(session, ids);
}

function openTodoWithProject(projectId) {
  openTodoWithProjectFilter(session, projectId);
}

provide(TIMEPRISM_SUITE_CONTEXT_KEY, {
  activeModule: computed(() => session.activeModule),
  selectedProjectIds: computed(() => session.selectedProjectIds),
  setActiveModule,
  setProjectFilters,
  openTodoWithProject
});

const activeComponent = computed(() => moduleMap[session.activeModule] || TodoWindow);
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
  flex-wrap: nowrap;
  gap: 6px;
  overflow-x: auto;
  overflow-y: hidden;
  padding-bottom: 2px;
  scrollbar-width: thin;
  scrollbar-color: rgba(122, 136, 166, 0.46) transparent;
}

.suite-tab {
  border: 1px solid var(--suite-border);
  background: var(--suite-btn-bg);
  color: var(--suite-muted);
  border-radius: 10px;
  width: 32px;
  height: 32px;
  padding: 0;
  flex: 0 0 auto;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  font-size: 14px;
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

.suite-tabs::-webkit-scrollbar {
  height: 4px;
}

.suite-tabs::-webkit-scrollbar-track {
  background: transparent;
}

.suite-tabs::-webkit-scrollbar-thumb {
  background: rgba(122, 136, 166, 0.42);
  border-radius: 999px;
}

.suite-content {
  min-width: 0;
  min-height: 0;
}

@container lightapp-window-body (max-width: 760px) {
  .suite-tab {
    width: 30px;
    height: 30px;
  }
}

@container lightapp-window-body (max-width: 430px) {
  .suite-tabs::-webkit-scrollbar {
    height: 3px;
  }
}
</style>
