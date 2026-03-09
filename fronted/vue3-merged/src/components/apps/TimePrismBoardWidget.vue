<template>
  <section class="widget-body">
    <form class="card-create" @submit.prevent="createCard">
      <input v-model.trim="draftTitle" type="text" placeholder="新增看板任务，例如：完成接口联调" />
      <button class="action-btn ripple-trigger" type="submit">新增</button>
    </form>

    <div class="board-grid">
      <article v-for="column in columns" :key="column.code" class="column-card liquid-material">
        <header>
          <h4>{{ column.title }}</h4>
          <span>{{ cardsByColumn[column.code].length }}</span>
        </header>
        <ul v-if="cardsByColumn[column.code].length" class="card-list">
          <li v-for="item in cardsByColumn[column.code]" :key="item.id" class="task-card">
            <p>{{ item.title }}</p>
            <div class="card-actions">
              <button class="icon-btn ripple-trigger" :disabled="column.code === 'todo'" @click="moveCard(item.id, 'left')">
                <i class="fas fa-arrow-left"></i>
              </button>
              <button class="icon-btn ripple-trigger" :disabled="column.code === 'done'" @click="moveCard(item.id, 'right')">
                <i class="fas fa-arrow-right"></i>
              </button>
              <button class="icon-btn ripple-trigger" @click="removeCard(item.id)">
                <i class="fas fa-trash"></i>
              </button>
            </div>
          </li>
        </ul>
        <p v-else class="empty-hint">暂无任务</p>
      </article>
    </div>
  </section>
</template>

<script setup>
import { reactive, ref, watch } from 'vue';

const props = defineProps({
  modelValue: {
    type: Object,
    default: () => ({})
  }
});

const emit = defineEmits(['update:modelValue']);

const columns = [
  { code: 'todo', title: '待处理' },
  { code: 'doing', title: '进行中' },
  { code: 'done', title: '已完成' }
];

const cardsByColumn = reactive({
  todo: [],
  doing: [],
  done: []
});

const draftTitle = ref('');

function normalizeCards(raw) {
  if (!Array.isArray(raw)) return [];
  return raw
    .map((item, index) => {
      if (!item || typeof item !== 'object') return null;
      const title = String(item.title || '').trim();
      if (!title) return null;
      const status = ['todo', 'doing', 'done'].includes(item.status) ? item.status : 'todo';
      return {
        id: Number.isFinite(Number(item.id)) ? Number(item.id) : Date.now() + index,
        title,
        status
      };
    })
    .filter(Boolean)
    .slice(0, 300);
}

function flattenCards() {
  return [...cardsByColumn.todo, ...cardsByColumn.doing, ...cardsByColumn.done];
}

function applyCards(rawCards) {
  const normalized = normalizeCards(rawCards);
  cardsByColumn.todo = normalized.filter((item) => item.status === 'todo');
  cardsByColumn.doing = normalized.filter((item) => item.status === 'doing');
  cardsByColumn.done = normalized.filter((item) => item.status === 'done');
}

watch(
  () => props.modelValue,
  () => {
    const payload = props.modelValue && typeof props.modelValue === 'object' ? props.modelValue : {};
    applyCards(payload.cards);
  },
  { deep: true, immediate: true }
);

function commit(cards) {
  const normalizedCards = normalizeCards(cards);
  applyCards(normalizedCards);
  emit('update:modelValue', {
    ...props.modelValue,
    cards: normalizedCards
  });
}

function createCard() {
  const title = draftTitle.value.trim();
  if (!title) return;
  commit([
    {
      id: Date.now() + Math.floor(Math.random() * 1000),
      title,
      status: 'todo'
    },
    ...flattenCards()
  ]);
  draftTitle.value = '';
}

function moveCard(id, direction) {
  const order = ['todo', 'doing', 'done'];
  const nextCards = flattenCards().map((item) => {
    if (item.id !== id) return item;
    const index = order.indexOf(item.status);
    if (direction === 'left' && index > 0) {
      return { ...item, status: order[index - 1] };
    }
    if (direction === 'right' && index < order.length - 1) {
      return { ...item, status: order[index + 1] };
    }
    return item;
  });
  commit(nextCards);
}

function removeCard(id) {
  commit(flattenCards().filter((item) => item.id !== id));
}
</script>

<style scoped>
.widget-body {
  display: grid;
  gap: 10px;
}

.card-create {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 84px;
  gap: 8px;
}

.card-create input {
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(15, 20, 33, 0.5);
  color: rgba(239, 244, 255, 0.94);
  border-radius: 10px;
  padding: 8px 10px;
}

.action-btn,
.icon-btn {
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(17, 23, 38, 0.64);
  color: rgba(239, 244, 255, 0.95);
  border-radius: 10px;
}

.board-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.column-card {
  --liquid-bg: rgba(18, 24, 40, 0.42);
  border-radius: 12px;
  padding: 10px;
}

.column-card header {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.column-card header h4 {
  margin: 0;
  font-size: 14px;
}

.column-card header span {
  font-size: 12px;
  color: rgba(223, 230, 249, 0.7);
}

.card-list {
  list-style: none;
  margin: 8px 0 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.task-card {
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background: rgba(10, 14, 24, 0.46);
  padding: 8px;
  display: grid;
  gap: 8px;
}

.task-card p {
  margin: 0;
  line-height: 1.45;
}

.card-actions {
  display: flex;
  gap: 6px;
}

.icon-btn {
  width: 30px;
  height: 30px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.icon-btn:disabled {
  opacity: 0.4;
  cursor: not-allowed;
}

.empty-hint {
  margin: 10px 0 0;
  color: rgba(223, 230, 249, 0.62);
  font-size: 12px;
}

@media (max-width: 980px) {
  .board-grid {
    grid-template-columns: 1fr;
  }
}

@media (max-width: 760px) {
  .card-create {
    grid-template-columns: 1fr;
  }
}
</style>
