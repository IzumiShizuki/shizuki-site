<template>
  <section class="widget-body">
    <form class="todo-create" @submit.prevent="createTodo">
      <input v-model.trim="draftTitle" type="text" placeholder="添加待办，例如：整理算法笔记" />
      <select v-model="draftPriority">
        <option value="LOW">低</option>
        <option value="MEDIUM">中</option>
        <option value="HIGH">高</option>
      </select>
      <button class="action-btn ripple-trigger" type="submit">添加</button>
    </form>

    <div class="todo-toolbar">
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === 'ALL' }" @click="viewFilter = 'ALL'">全部</button>
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === 'OPEN' }" @click="viewFilter = 'OPEN'">未完成</button>
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === 'DONE' }" @click="viewFilter = 'DONE'">已完成</button>
      <span class="toolbar-hint">{{ openCount }} 未完成 / {{ items.length }} 总计</span>
    </div>

    <ul v-if="filteredItems.length" class="todo-list">
      <li v-for="item in filteredItems" :key="item.id" class="todo-item" :class="{ done: item.done }">
        <label class="todo-check">
          <input :checked="item.done" type="checkbox" @change="toggleDone(item.id)" />
          <span></span>
        </label>
        <div class="todo-main">
          <p>{{ item.title }}</p>
          <small>{{ priorityLabel(item.priority) }}</small>
        </div>
        <button class="icon-btn ripple-trigger" type="button" @click="removeTodo(item.id)">
          <i class="fas fa-trash"></i>
        </button>
      </li>
    </ul>
    <p v-else class="empty-hint">暂无待办，先添加一条开始。</p>
  </section>
</template>

<script setup>
import { computed, ref, watch } from 'vue';

const props = defineProps({
  modelValue: {
    type: Object,
    default: () => ({})
  }
});

const emit = defineEmits(['update:modelValue']);

const draftTitle = ref('');
const draftPriority = ref('MEDIUM');
const viewFilter = ref('ALL');
const items = ref([]);

function normalizePriority(raw) {
  const normalized = String(raw || '').trim().toUpperCase();
  if (normalized === 'LOW' || normalized === 'HIGH') return normalized;
  return 'MEDIUM';
}

function normalizeItems(raw) {
  if (!Array.isArray(raw)) return [];
  return raw
    .map((item, index) => {
      if (!item || typeof item !== 'object') return null;
      const title = String(item.title || '').trim();
      if (!title) return null;
      return {
        id: Number.isFinite(Number(item.id)) ? Number(item.id) : Date.now() + index,
        title,
        done: Boolean(item.done),
        priority: normalizePriority(item.priority)
      };
    })
    .filter(Boolean)
    .slice(0, 200);
}

function syncFromProps() {
  const payload = props.modelValue && typeof props.modelValue === 'object' ? props.modelValue : {};
  items.value = normalizeItems(payload.items);
}

watch(
  () => props.modelValue,
  () => {
    syncFromProps();
  },
  { deep: true, immediate: true }
);

const filteredItems = computed(() => {
  if (viewFilter.value === 'OPEN') return items.value.filter((item) => !item.done);
  if (viewFilter.value === 'DONE') return items.value.filter((item) => item.done);
  return items.value;
});

const openCount = computed(() => items.value.filter((item) => !item.done).length);

function commit(nextItems) {
  const normalizedItems = normalizeItems(nextItems);
  items.value = normalizedItems;
  emit('update:modelValue', {
    ...props.modelValue,
    items: normalizedItems
  });
}

function createTodo() {
  const title = draftTitle.value.trim();
  if (!title) return;
  commit([
    {
      id: Date.now() + Math.floor(Math.random() * 1000),
      title,
      done: false,
      priority: draftPriority.value
    },
    ...items.value
  ]);
  draftTitle.value = '';
  draftPriority.value = 'MEDIUM';
}

function toggleDone(id) {
  commit(
    items.value.map((item) => {
      if (item.id !== id) return item;
      return {
        ...item,
        done: !item.done
      };
    })
  );
}

function removeTodo(id) {
  commit(items.value.filter((item) => item.id !== id));
}

function priorityLabel(priority) {
  if (priority === 'HIGH') return '高优先级';
  if (priority === 'LOW') return '低优先级';
  return '中优先级';
}
</script>

<style scoped>
.widget-body {
  display: grid;
  gap: 10px;
}

.todo-create {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 80px 72px;
  gap: 8px;
}

.todo-create input,
.todo-create select {
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(15, 20, 33, 0.5);
  color: rgba(239, 244, 255, 0.94);
  border-radius: 10px;
  padding: 8px 10px;
}

.todo-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.toolbar-hint {
  margin-left: auto;
  color: rgba(223, 230, 249, 0.72);
  font-size: 12px;
}

.chip-btn,
.action-btn,
.icon-btn {
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(17, 23, 38, 0.64);
  color: rgba(239, 244, 255, 0.95);
  border-radius: 10px;
  padding: 6px 10px;
}

.chip-btn.active {
  border-color: rgba(var(--accent-rgb), 0.8);
  background: rgba(var(--accent-rgb), 0.2);
}

.todo-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.todo-item {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  align-items: center;
  gap: 10px;
  padding: 10px 12px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(12, 17, 30, 0.42);
}

.todo-item.done {
  opacity: 0.72;
}

.todo-main p {
  margin: 0;
  line-height: 1.45;
}

.todo-item.done .todo-main p {
  text-decoration: line-through;
}

.todo-main small {
  color: rgba(223, 230, 249, 0.72);
}

.todo-check input {
  display: none;
}

.todo-check span {
  display: inline-flex;
  width: 18px;
  height: 18px;
  border-radius: 50%;
  border: 2px solid rgba(255, 255, 255, 0.58);
}

.todo-check input:checked + span {
  border-color: rgba(var(--accent-rgb), 0.92);
  background: rgba(var(--accent-rgb), 0.3);
}

.icon-btn {
  width: 34px;
  height: 34px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.empty-hint {
  margin: 0;
  text-align: center;
  color: rgba(223, 230, 249, 0.72);
  padding: 18px 0;
}

@media (max-width: 760px) {
  .todo-create {
    grid-template-columns: 1fr;
  }

  .toolbar-hint {
    margin-left: 0;
    width: 100%;
  }
}
</style>
