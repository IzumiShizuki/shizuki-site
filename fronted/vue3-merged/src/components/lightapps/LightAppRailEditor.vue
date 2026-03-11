<template>
  <aside class="rail-editor liquid-material" aria-label="轻应用右侧栏编辑器">
    <header class="rail-head">
      <h3>轻应用栏</h3>
      <span>{{ activeCount }}/{{ maxSlots }}</span>
    </header>

    <ul class="rail-slot-list">
      <li
        v-for="(slot, index) in normalizedSlots"
        :key="`rail_slot_${index}`"
        class="rail-slot"
        :class="{ enabled: slot.enabled }"
        @dragover.prevent
        @drop="onSlotDrop(index, $event)"
      >
        <button
          v-if="slot.enabled"
          class="rail-item ripple-trigger"
          type="button"
          draggable="true"
          :title="slotTitle(slot)"
          @click="emit('open-slot', slot)"
          @dragstart="onSlotDragStart(index, slot, $event)"
          @dragend="onSlotDragEnd(index, $event)"
        >
          <i :class="slotIcon(slot)" aria-hidden="true"></i>
          <span>{{ slotLabel(slot) }}</span>
        </button>
        <div v-else class="rail-empty">拖入</div>

        <button v-if="slot.enabled" class="slot-remove ripple-trigger" type="button" title="移除" @click="emit('clear-slot', index)">
          <i class="fas fa-xmark" aria-hidden="true"></i>
        </button>
      </li>
    </ul>

    <section class="collection-zone" @dragover.prevent @drop="onCollectionDrop">
      <button class="collection-toggle ripple-trigger" type="button" @click="collectionOpen = !collectionOpen">
        <i class="fas fa-layer-group" aria-hidden="true"></i>
        <span>{{ collectionTitle }}</span>
        <small>{{ collectionItems.length }}</small>
      </button>

      <Transition name="panel-collapse">
        <div v-if="collectionOpen" class="collection-panel">
          <button
            v-for="(item, index) in collectionItems"
            :key="`collection_${index}_${item.item_kind}_${item.item_ref}`"
            class="collection-item ripple-trigger"
            type="button"
            draggable="true"
            :title="collectionItemLabel(item)"
            @click="emit('open-collection-item', item)"
            @dragstart="onCollectionDragStart(index, item, $event)"
            @dragend="onCollectionDragEnd(index, $event)"
          >
            <i :class="collectionItemIcon(item)" aria-hidden="true"></i>
            <span>{{ collectionItemLabel(item) }}</span>
          </button>
          <p v-if="!collectionItems.length" class="collection-empty">拖入应用或网址</p>
        </div>
      </Transition>
    </section>
  </aside>
</template>

<script setup>
import { computed, ref } from 'vue';
import { getLightAppByCode } from '../../utils/lightAppsCatalog';

const DRAG_MIME = 'application/x-shizuki-lightapp-item';
const MAX_SLOTS = 8;

const props = defineProps({
  railSlots: {
    type: Array,
    default: () => []
  },
  collections: {
    type: Array,
    default: () => []
  },
  urlLinks: {
    type: Array,
    default: () => []
  }
});

const emit = defineEmits([
  'assign-slot',
  'clear-slot',
  'remove-slot',
  'add-to-collection',
  'remove-collection-item',
  'open-slot',
  'open-collection-item'
]);

const collectionOpen = ref(false);

const normalizedSlots = computed(() => {
  const source = Array.isArray(props.railSlots) ? props.railSlots : [];
  const next = [];
  for (let i = 0; i < MAX_SLOTS; i += 1) {
    const item = source[i] || {};
    next.push({
      enabled: Boolean(item.enabled),
      item_kind: String(item.item_kind || '').trim().toLowerCase() || 'app',
      item_ref: String(item.item_ref || '').trim()
    });
  }
  return next;
});

const maxSlots = MAX_SLOTS;

const activeCount = computed(() => normalizedSlots.value.filter((item) => item.enabled && item.item_ref).length);

const activeCollection = computed(() => {
  const list = Array.isArray(props.collections) ? props.collections : [];
  return list.find((item) => String(item?.collection_id || '').trim() === 'default') || { title: '集合', items: [] };
});

const collectionTitle = computed(() => String(activeCollection.value.title || '集合').trim() || '集合');

const collectionItems = computed(() => (Array.isArray(activeCollection.value.items) ? activeCollection.value.items : []));

function findUrlLink(ref) {
  const target = String(ref || '').trim();
  return (Array.isArray(props.urlLinks) ? props.urlLinks : []).find((item) => String(item?.urlLinkId || '').trim() === target) || null;
}

function slotIcon(slot) {
  if (slot.item_kind === 'picker') return 'fas fa-th-large';
  if (slot.item_kind === 'collection') return 'fas fa-layer-group';
  if (slot.item_kind === 'url') return 'fas fa-link';
  return getLightAppByCode(slot.item_ref)?.iconClass || 'fas fa-circle';
}

function slotLabel(slot) {
  if (slot.item_kind === 'picker') return '选择';
  if (slot.item_kind === 'collection') return collectionTitle.value;
  if (slot.item_kind === 'url') return findUrlLink(slot.item_ref)?.title || '网址';
  return getLightAppByCode(slot.item_ref)?.title || '应用';
}

function slotTitle(slot) {
  if (slot.item_kind === 'picker') return '应用选择器';
  if (slot.item_kind === 'collection') return '集合';
  if (slot.item_kind === 'url') return findUrlLink(slot.item_ref)?.url || '网址快捷项';
  return getLightAppByCode(slot.item_ref)?.title || '轻应用';
}

function collectionItemIcon(item) {
  const kind = String(item?.item_kind || '').trim().toLowerCase();
  const itemRef = String(item?.item_ref || '').trim();
  if (kind === 'url') return 'fas fa-link';
  return getLightAppByCode(itemRef)?.iconClass || 'fas fa-circle';
}

function collectionItemLabel(item) {
  const kind = String(item?.item_kind || '').trim().toLowerCase();
  const itemRef = String(item?.item_ref || '').trim();
  if (kind === 'url') return findUrlLink(itemRef)?.title || '网址快捷项';
  return getLightAppByCode(itemRef)?.title || '轻应用';
}

function toDragPayload(itemKind, itemRef, source) {
  return {
    item_kind: String(itemKind || '').trim().toLowerCase() || 'app',
    item_ref: String(itemRef || '').trim(),
    source: source || null
  };
}

function setDragData(event, payload) {
  if (!event?.dataTransfer) return;
  event.dataTransfer.setData(DRAG_MIME, JSON.stringify(payload));
  event.dataTransfer.effectAllowed = 'copyMove';
}

function parseDropData(event) {
  const raw = String(event?.dataTransfer?.getData(DRAG_MIME) || '').trim();
  if (!raw) return null;
  try {
    const parsed = JSON.parse(raw);
    const itemKind = String(parsed?.item_kind || '').trim().toLowerCase();
    const itemRef = String(parsed?.item_ref || '').trim();
    if (!itemRef) return null;
    if (!['app', 'url', 'collection', 'picker'].includes(itemKind)) return null;
    return {
      item_kind: itemKind,
      item_ref: itemRef,
      source: parsed?.source || null
    };
  } catch {
    return null;
  }
}

function onSlotDrop(index, event) {
  const payload = parseDropData(event);
  if (!payload) return;
  emit('assign-slot', {
    slotIndex: index,
    payload
  });
}

function onCollectionDrop(event) {
  const payload = parseDropData(event);
  if (!payload) return;
  emit('add-to-collection', payload);
}

function onSlotDragStart(index, slot, event) {
  setDragData(
    event,
    toDragPayload(slot.item_kind, slot.item_ref, {
      type: 'slot',
      index
    })
  );
}

function onSlotDragEnd(index, event) {
  if (event?.dataTransfer?.dropEffect === 'none') {
    emit('remove-slot', index);
  }
}

function onCollectionDragStart(index, item, event) {
  setDragData(
    event,
    toDragPayload(item.item_kind, item.item_ref, {
      type: 'collection',
      index
    })
  );
}

function onCollectionDragEnd(index, event) {
  if (event?.dataTransfer?.dropEffect === 'none') {
    emit('remove-collection-item', index);
  }
}
</script>

<style scoped>
.rail-editor {
  --liquid-bg: rgba(13, 20, 33, 0.64);
  --liquid-border: rgba(255, 255, 255, 0.24);
  position: sticky;
  top: 10px;
  align-self: start;
  width: 190px;
  max-height: calc(100vh - 120px);
  border-radius: 16px;
  padding: 10px;
  display: grid;
  gap: 10px;
  overflow: auto;
}

.rail-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.rail-head h3 {
  margin: 0;
  font-size: 14px;
  color: rgba(236, 244, 255, 0.94);
}

.rail-head span {
  color: rgba(214, 228, 252, 0.74);
  font-size: 12px;
}

.rail-slot-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.rail-slot {
  position: relative;
  min-height: 42px;
  border-radius: 12px;
  border: 1px dashed rgba(255, 255, 255, 0.22);
  background: rgba(255, 255, 255, 0.08);
  display: grid;
  align-items: center;
}

.rail-slot.enabled {
  border-style: solid;
  border-color: rgba(var(--accent-rgb), 0.42);
  background: rgba(255, 255, 255, 0.16);
}

.rail-item {
  width: 100%;
  border: 0;
  background: transparent;
  color: rgba(244, 248, 255, 0.96);
  display: inline-grid;
  grid-template-columns: 20px minmax(0, 1fr);
  gap: 8px;
  align-items: center;
  padding: 8px 10px;
  text-align: left;
}

.rail-item span {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  font-size: 12px;
}

.slot-remove {
  position: absolute;
  right: 5px;
  top: 5px;
  width: 20px;
  height: 20px;
  border-radius: 6px;
  border: 0;
  background: rgba(0, 0, 0, 0.2);
  color: rgba(255, 255, 255, 0.8);
}

.rail-empty {
  color: rgba(206, 218, 240, 0.58);
  font-size: 12px;
  padding: 0 10px;
}

.collection-zone {
  border: 1px solid rgba(255, 255, 255, 0.22);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.12);
  padding: 8px;
  display: grid;
  gap: 8px;
}

.collection-toggle {
  width: 100%;
  border: 0;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.18);
  color: rgba(239, 245, 255, 0.95);
  min-height: 34px;
  display: grid;
  grid-template-columns: 16px minmax(0, 1fr) auto;
  align-items: center;
  gap: 8px;
  padding: 0 10px;
  text-align: left;
}

.collection-toggle span {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.collection-toggle small {
  opacity: 0.74;
}

.collection-panel {
  display: grid;
  gap: 6px;
}

.collection-item {
  border: 0;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.18);
  color: rgba(237, 245, 255, 0.95);
  min-height: 34px;
  padding: 0 10px;
  display: grid;
  grid-template-columns: 16px minmax(0, 1fr);
  gap: 8px;
  align-items: center;
  text-align: left;
}

.collection-item span {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  font-size: 12px;
}

.collection-empty {
  margin: 0;
  color: rgba(206, 218, 240, 0.64);
  font-size: 12px;
  text-align: center;
}

@media (max-width: 980px) {
  .rail-editor {
    width: 100%;
    max-height: none;
    position: static;
  }
}
</style>
