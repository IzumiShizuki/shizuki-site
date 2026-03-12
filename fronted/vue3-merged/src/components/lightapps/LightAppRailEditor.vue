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

    <section class="collection-zone">
      <header class="collection-zone-head">
        <h4>文件夹</h4>
        <span>{{ normalizedCollections.length }}</span>
      </header>

      <div
        v-for="collection in normalizedCollections"
        :key="`collection_folder_${collection.collection_id}`"
        class="collection-folder"
        @dragover.prevent
        @drop="onCollectionDrop(collection.collection_id, $event)"
      >
        <div class="collection-folder-head">
          <button
            class="collection-toggle ripple-trigger"
            type="button"
            draggable="true"
            :title="`拖拽 ${collection.title} 到右栏`"
            @click="toggleCollection(collection.collection_id)"
            @dragstart="onCollectionCardDragStart(collection.collection_id, $event)"
          >
            <i class="fas fa-folder" aria-hidden="true"></i>
            <span>{{ collection.title }}</span>
            <small>{{ collection.items.length }}</small>
          </button>
          <button class="collection-rename-btn ripple-trigger" type="button" title="重命名" @click="startRename(collection)">
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
        </div>

        <div v-if="renameTargetId === collection.collection_id" class="collection-rename-row">
          <input
            v-model.trim="renameDraft"
            type="text"
            maxlength="80"
            placeholder="集合名称"
            @keydown.enter.prevent="commitRename(collection.collection_id)"
            @keydown.esc.prevent="cancelRename"
            @blur="commitRename(collection.collection_id)"
          />
        </div>

        <Transition name="panel-collapse">
          <div v-if="isCollectionOpen(collection.collection_id)" class="collection-panel">
            <button
              v-for="(item, index) in collection.items"
              :key="`collection_item_${collection.collection_id}_${index}_${item.item_kind}_${item.item_ref}`"
              class="collection-item ripple-trigger"
              type="button"
              draggable="true"
              :title="collectionItemLabel(item)"
              @click="emit('open-collection-item', { collectionId: collection.collection_id, item })"
              @dragstart="onCollectionItemDragStart(collection.collection_id, index, item, $event)"
              @dragend="onCollectionItemDragEnd(collection.collection_id, index, $event)"
            >
              <i :class="collectionItemIcon(item)" aria-hidden="true"></i>
              <span>{{ collectionItemLabel(item) }}</span>
            </button>
            <p v-if="!collection.items.length" class="collection-empty">拖入应用或网址</p>
          </div>
        </Transition>
      </div>
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
  'open-collection-item',
  'rename-collection'
]);

const openCollectionIds = ref(new Set());
const renameTargetId = ref('');
const renameDraft = ref('');

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

const normalizedCollections = computed(() => {
  const source = Array.isArray(props.collections) ? props.collections : [];
  const mapped = source
    .map((raw) => ({
      collection_id: String(raw?.collection_id || '').trim(),
      title: String(raw?.title || '').trim() || '集合',
      items: Array.isArray(raw?.items) ? raw.items : []
    }))
    .filter((entry) => entry.collection_id);

  if (mapped.length) {
    return mapped;
  }

  return [{
    collection_id: 'default',
    title: '集合',
    items: []
  }];
});

const maxSlots = MAX_SLOTS;

const activeCount = computed(() => normalizedSlots.value.filter((item) => item.enabled && item.item_ref).length);

function findCollectionById(collectionId) {
  const targetId = String(collectionId || '').trim();
  if (!targetId) return null;
  return normalizedCollections.value.find((entry) => entry.collection_id === targetId) || null;
}

function findUrlLink(ref) {
  const target = String(ref || '').trim();
  return (Array.isArray(props.urlLinks) ? props.urlLinks : []).find((item) => String(item?.urlLinkId || '').trim() === target) || null;
}

function slotIcon(slot) {
  if (slot.item_kind === 'picker') return 'fas fa-th-large';
  if (slot.item_kind === 'collection') return 'fas fa-folder';
  if (slot.item_kind === 'url') return 'fas fa-link';
  return getLightAppByCode(slot.item_ref)?.iconClass || 'fas fa-circle';
}

function slotLabel(slot) {
  if (slot.item_kind === 'picker') return '选择';
  if (slot.item_kind === 'collection') return findCollectionById(slot.item_ref)?.title || '集合';
  if (slot.item_kind === 'url') return findUrlLink(slot.item_ref)?.title || '网址';
  return getLightAppByCode(slot.item_ref)?.title || '应用';
}

function slotTitle(slot) {
  if (slot.item_kind === 'picker') return '应用选择器';
  if (slot.item_kind === 'collection') return findCollectionById(slot.item_ref)?.title || '集合';
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

function onCollectionDrop(collectionId, event) {
  const payload = parseDropData(event);
  if (!payload) return;
  emit('add-to-collection', {
    targetCollectionId: collectionId,
    payload
  });
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

function onCollectionCardDragStart(collectionId, event) {
  setDragData(
    event,
    toDragPayload('collection', collectionId, {
      type: 'collection-card',
      collectionId
    })
  );
}

function onCollectionItemDragStart(collectionId, index, item, event) {
  setDragData(
    event,
    toDragPayload(item.item_kind, item.item_ref, {
      type: 'collection-item',
      collectionId,
      index
    })
  );
}

function onCollectionItemDragEnd(collectionId, index, event) {
  if (event?.dataTransfer?.dropEffect === 'none') {
    emit('remove-collection-item', { collectionId, index });
  }
}

function isCollectionOpen(collectionId) {
  return openCollectionIds.value.has(collectionId);
}

function toggleCollection(collectionId) {
  const next = new Set(openCollectionIds.value);
  if (next.has(collectionId)) {
    next.delete(collectionId);
  } else {
    next.add(collectionId);
  }
  openCollectionIds.value = next;
}

function startRename(collection) {
  renameTargetId.value = collection.collection_id;
  renameDraft.value = collection.title;
}

function cancelRename() {
  renameTargetId.value = '';
  renameDraft.value = '';
}

function commitRename(collectionId) {
  if (renameTargetId.value !== collectionId) return;
  const title = String(renameDraft.value || '').trim();
  if (title) {
    emit('rename-collection', {
      collectionId,
      title
    });
  }
  cancelRename();
}

defineExpose({
  focusCollection(collectionId, forceOpen = true) {
    const targetId = String(collectionId || '').trim();
    if (!targetId) return;
    const exists = normalizedCollections.value.some((entry) => entry.collection_id === targetId);
    if (!exists) return;
    if (forceOpen) {
      const next = new Set(openCollectionIds.value);
      next.add(targetId);
      openCollectionIds.value = next;
      return;
    }
    toggleCollection(targetId);
  }
});
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

.collection-zone-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.collection-zone-head h4 {
  margin: 0;
  font-size: 12px;
  color: rgba(232, 241, 255, 0.95);
}

.collection-zone-head span {
  font-size: 11px;
  color: rgba(204, 216, 239, 0.76);
}

.collection-folder {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.1);
  padding: 6px;
  display: grid;
  gap: 6px;
}

.collection-folder-head {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 26px;
  gap: 6px;
  align-items: center;
}

.collection-toggle {
  width: 100%;
  border: 0;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.18);
  color: rgba(239, 245, 255, 0.95);
  min-height: 30px;
  display: grid;
  grid-template-columns: 14px minmax(0, 1fr) auto;
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

.collection-rename-btn {
  width: 26px;
  height: 26px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.16);
  color: rgba(232, 242, 255, 0.9);
}

.collection-rename-row input {
  width: 100%;
  min-height: 30px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  border-radius: 9px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(236, 244, 255, 0.94);
  padding: 0 8px;
  outline: none;
}

.collection-rename-row input:focus {
  border-color: rgba(var(--accent-rgb), 0.58);
  box-shadow: 0 0 0 1px rgba(var(--accent-rgb), 0.2);
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
  min-height: 32px;
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
