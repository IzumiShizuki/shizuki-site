<template>
  <section class="timeprism-suite">
    <LightAppTopToolbar :window-id="windowId">
      <div class="toolbar-switches with-divider" role="tablist" aria-label="TimePrism modules">
        <button
          v-for="module in TIMEPRISM_MODULE_ITEMS"
          :key="`timeprism_${windowId}_${module.code}`"
          class="icon-btn toolbar-tab-btn ripple-trigger"
          :class="{ 'is-active': activeModule === module.code }"
          type="button"
          role="tab"
          :aria-selected="activeModule === module.code"
          :title="module.label"
          :aria-label="module.label"
          @click="setActiveModule(module.code)"
        >
          <i :class="module.iconClass" aria-hidden="true"></i>
        </button>
      </div>
    </LightAppTopToolbar>

    <section class="suite-content">
      <KeepAlive>
        <component :is="activeComponent" :window-id="windowId" />
      </KeepAlive>
    </section>
  </section>
</template>

<script setup>
import { computed, provide } from 'vue';
import LightAppTopToolbar from '../LightAppTopToolbar.vue';
import ProjectsWindow from './ProjectsWindow.vue';
import ScheduleWindow from './ScheduleWindow.vue';
import TaskBoardWindow from './TaskBoardWindow.vue';
import TimePrismCalendarWindow from './TimePrismCalendarWindow.vue';
import TodoWindow from './TodoWindow.vue';
import {
  bumpSuiteProjectVersion,
  TIMEPRISM_MODULE_BOARD,
  TIMEPRISM_MODULE_CALENDAR,
  TIMEPRISM_MODULE_ITEMS,
  TIMEPRISM_MODULE_PROJECTS,
  TIMEPRISM_MODULE_SCHEDULE,
  TIMEPRISM_MODULE_TODO,
  TIMEPRISM_SUITE_CONTEXT_KEY,
  openTodoWithProjectFilter,
  resolveTimePrismSuiteSession,
  setSuiteActiveModule,
  setSuiteProjectFilters
} from './timePrismSuiteState';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const moduleMap = Object.freeze({
  [TIMEPRISM_MODULE_TODO]: TodoWindow,
  [TIMEPRISM_MODULE_BOARD]: TaskBoardWindow,
  [TIMEPRISM_MODULE_SCHEDULE]: ScheduleWindow,
  [TIMEPRISM_MODULE_PROJECTS]: ProjectsWindow,
  [TIMEPRISM_MODULE_CALENDAR]: TimePrismCalendarWindow
});

const session = resolveTimePrismSuiteSession(props.windowId);

function setActiveModule(code) {
  setSuiteActiveModule(session, code);
}

function setProjectFilters(ids) {
  setSuiteProjectFilters(session, ids);
}

function openTodoWithProject(projectId) {
  openTodoWithProjectFilter(session, projectId);
}

function notifyProjectsChanged() {
  bumpSuiteProjectVersion(session);
}

provide(TIMEPRISM_SUITE_CONTEXT_KEY, {
  activeModule: computed(() => session.activeModule),
  selectedProjectIds: computed(() => session.selectedProjectIds),
  projectVersion: computed(() => session.projectVersion),
  setActiveModule,
  setProjectFilters,
  openTodoWithProject,
  notifyProjectsChanged
});

const activeModule = computed(() => session.activeModule);
const activeComponent = computed(() => moduleMap[session.activeModule] || TodoWindow);
</script>

<style scoped>
.timeprism-suite {
  display: block;
  min-height: 0;
}

.suite-content {
  min-width: 0;
  min-height: 0;
}

.toolbar-tab-btn {
  width: 28px;
  height: 28px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.42);
  background: rgba(255, 255, 255, 0.32);
  color: rgba(34, 41, 56, 0.84);
}
</style>
