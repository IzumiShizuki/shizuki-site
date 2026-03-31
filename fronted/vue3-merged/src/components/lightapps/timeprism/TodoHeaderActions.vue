<template>
  <div class="todo-header-actions" @pointerdown.stop>
    <button
      class="header-icon ripple-trigger"
      :class="{ active: headerState.showCreateForm }"
      type="button"
      :title="headerState.showCreateForm ? '收起添加区' : '添加待办'"
      :aria-label="headerState.showCreateForm ? '收起添加区' : '添加待办'"
      @click.stop="toggleCreateForm"
    >
      <i :class="headerState.showCreateForm ? 'fas fa-chevron-up' : 'fas fa-plus'" aria-hidden="true"></i>
    </button>
    <button
      class="header-icon ripple-trigger"
      :class="{ active: headerState.showRecurringPanel }"
      type="button"
      :title="headerState.showRecurringPanel ? '收起周期规则' : '周期规则'"
      :aria-label="headerState.showRecurringPanel ? '收起周期规则' : '周期规则'"
      @click.stop="toggleRecurringPanel"
    >
      <i :class="headerState.showRecurringPanel ? 'fas fa-repeat' : 'fas fa-calendar-plus'" aria-hidden="true"></i>
    </button>
  </div>
</template>

<script setup>
import {
  resolveTodoWindowHeaderState,
  toggleTodoWindowCreateForm,
  toggleTodoWindowRecurringPanel
} from './todoWindowHeaderState';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const headerState = resolveTodoWindowHeaderState(props.windowId);

function toggleCreateForm() {
  toggleTodoWindowCreateForm(props.windowId);
}

function toggleRecurringPanel() {
  toggleTodoWindowRecurringPanel(props.windowId);
}
</script>

<style scoped>
.todo-header-actions {
  flex: 0 0 auto;
  display: inline-flex;
  align-items: center;
  gap: 4px;
  padding-left: 6px;
}

.header-icon {
  width: 28px;
  height: 28px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.42);
  background: rgba(255, 255, 255, 0.32);
  color: rgba(34, 41, 56, 0.9);
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease,
    box-shadow 180ms ease;
}

.header-icon:hover {
  transform: translateY(-1px);
  border-color: rgba(255, 255, 255, 0.58);
  background: rgba(255, 255, 255, 0.42);
  box-shadow: 0 5px 14px rgba(14, 20, 34, 0.14);
}

.header-icon.active {
  border-color: rgba(var(--accent-rgb), 0.56);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(34, 41, 56, 0.96);
}
</style>
