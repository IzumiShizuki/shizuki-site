<template>
  <section class="timeprism-suite">
    <section class="suite-content">
      <KeepAlive>
        <component :is="activeComponent" :window-id="windowId" />
      </KeepAlive>
    </section>
  </section>
</template>

<script setup>
import { computed, provide } from 'vue';
import ProjectsWindow from './ProjectsWindow.vue';
import ScheduleWindow from './ScheduleWindow.vue';
import TaskBoardWindow from './TaskBoardWindow.vue';
import TimePrismCalendarWindow from './TimePrismCalendarWindow.vue';
import TodoWindow from './TodoWindow.vue';
import {
  bumpSuiteProjectVersion,
  TIMEPRISM_MODULE_BOARD,
  TIMEPRISM_MODULE_CALENDAR,
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
</style>
