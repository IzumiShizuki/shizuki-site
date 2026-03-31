<template>
  <section class="lightapp-window board-canvas-window">
    <LightAppHeaderPortal :window-id="props.windowId">
      <div class="canvas-toolbar">
        <div class="toolbar-left">
          <label class="board-picker">
            <span>画板</span>
            <select v-model.number="activeBoardId">
              <option v-for="item in boards" :key="`board_${item.whiteboardId}`" :value="item.whiteboardId">
                {{ item.title }}
              </option>
            </select>
          </label>

          <div class="toolbar-actions">
            <button class="icon-btn ripple-trigger" type="button" title="新建画板" :disabled="saving || boardLoading" @click="createBoard">
              <i class="fas fa-plus" aria-hidden="true"></i>
            </button>
            <button
              class="icon-btn ripple-trigger"
              type="button"
              title="重命名画板"
              :disabled="!activeBoard || saving || boardLoading"
              @click="openRename"
            >
              <i class="fas fa-pen" aria-hidden="true"></i>
            </button>
            <button
              class="icon-btn ripple-trigger danger"
              type="button"
              title="删除画板"
              :disabled="!activeBoard || saving || boardLoading || boards.length <= 1"
              @click="removeBoard"
            >
              <i class="fas fa-trash" aria-hidden="true"></i>
            </button>
          </div>
        </div>

        <div class="toolbar-right">
          <label class="kind-picker">
            <span>类型</span>
            <select v-model="activeBoardKind" :disabled="!activeBoard || saving">
              <option value="DRAWING">自由画板</option>
              <option value="FLOWCHART">流程图</option>
              <option value="MINDMAP">思维导图</option>
            </select>
          </label>

          <label class="kind-picker compact">
            <span>背景</span>
            <select v-model="pngBackground">
              <option value="white">白底</option>
              <option value="transparent">透明</option>
            </select>
          </label>

          <div class="toolbar-actions">
            <button
              class="icon-btn ripple-trigger"
              type="button"
              title="导入 Mermaid 文本"
              :disabled="boardLoading"
              @click="openImportPanel"
            >
              <i class="fas fa-code-branch" aria-hidden="true"></i>
            </button>
            <button
              class="icon-btn ripple-trigger"
              type="button"
              title="导入 .mmd / .txt"
              :disabled="boardLoading"
              @click="triggerMermaidFile"
            >
              <i class="fas fa-file-import" aria-hidden="true"></i>
            </button>
            <button
              class="icon-btn ripple-trigger"
              type="button"
              title="导出 Mermaid 文本"
              :disabled="boardLoading"
              @click="openExportPanel"
            >
              <i class="fas fa-file-export" aria-hidden="true"></i>
            </button>
            <button class="icon-btn ripple-trigger" type="button" title="导出整板 PNG" :disabled="boardLoading" @click="exportPng('board')">
              <i class="fas fa-image" aria-hidden="true"></i>
            </button>
            <button class="icon-btn ripple-trigger" type="button" title="导出视口 PNG" :disabled="boardLoading" @click="exportPng('viewport')">
              <i class="fas fa-expand" aria-hidden="true"></i>
            </button>
            <button class="icon-btn ripple-trigger" type="button" title="导出选区 PNG" :disabled="boardLoading" @click="exportPng('selection')">
              <i class="fas fa-vector-square" aria-hidden="true"></i>
            </button>
            <button
              class="icon-btn ripple-trigger"
              type="button"
              title="立即保存"
              :disabled="!activeBoard || boardLoading || saving"
              @click="flushCurrentBoard(true)"
            >
              <i :class="saving ? 'fas fa-spinner fa-spin' : 'fas fa-floppy-disk'" aria-hidden="true"></i>
            </button>
          </div>
        </div>
      </div>
    </LightAppHeaderPortal>

    <Transition name="panel-collapse">
      <section v-if="renameState.open" class="rename-panel liquid-material">
        <label>
          画板名称
          <input
            v-model.trim="renameState.value"
            type="text"
            maxlength="120"
            placeholder="请输入画板名称"
            @keydown.enter.prevent="submitRename"
          />
        </label>
        <div class="rename-actions">
          <button class="icon-btn ripple-trigger" type="button" title="保存名称" @click="submitRename">
            <i class="fas fa-check" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="取消重命名" @click="cancelRename">
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
        </div>
      </section>
    </Transition>

    <Transition name="panel-collapse">
      <section v-if="mermaidPanel.visible" class="mermaid-panel liquid-material">
        <header class="mermaid-head">
          <strong>{{ mermaidPanel.mode === 'import' ? 'Mermaid 导入' : 'Mermaid 导出' }}</strong>
          <div class="mermaid-head-actions">
            <button class="icon-btn ripple-trigger" type="button" title="关闭 Mermaid 面板" @click="closeMermaidPanel">
              <i class="fas fa-xmark" aria-hidden="true"></i>
            </button>
          </div>
        </header>
        <textarea
          v-model="mermaidPanel.text"
          :readonly="mermaidPanel.mode === 'export'"
          :placeholder="mermaidPanel.mode === 'import' ? '粘贴 flowchart / mindmap Mermaid 文本' : '导出的 Mermaid 文本将在这里显示'"
        ></textarea>
        <div class="mermaid-actions">
          <button v-if="mermaidPanel.mode === 'import'" class="icon-btn ripple-trigger" type="button" title="执行导入" @click="importMermaidText">
            <i class="fas fa-arrow-down" aria-hidden="true"></i>
          </button>
          <button v-if="mermaidPanel.mode === 'export'" class="icon-btn ripple-trigger" type="button" title="复制 Mermaid 文本" @click="copyMermaidText">
            <i class="fas fa-copy" aria-hidden="true"></i>
          </button>
          <button v-if="mermaidPanel.mode === 'export'" class="icon-btn ripple-trigger" type="button" title="下载 .mmd" @click="downloadMermaidText">
            <i class="fas fa-download" aria-hidden="true"></i>
          </button>
        </div>
      </section>
    </Transition>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>
    <p v-else-if="infoText" class="info-text">{{ infoText }}</p>
    <p class="status-text">{{ statusText }}</p>

    <section class="canvas-shell liquid-material">
      <div ref="canvasMountRef" class="canvas-host"></div>
      <div v-if="boardLoading" class="canvas-mask">
        <i class="fas fa-spinner fa-spin" aria-hidden="true"></i>
        <span>画板加载中...</span>
      </div>
    </section>

    <input ref="mermaidFileInputRef" class="hidden-file" type="file" accept=".mmd,.txt,.mermaid,text/plain" @change="onMermaidFileChange" />
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import mermaid from 'mermaid';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppWhiteboard,
  deleteLightAppWhiteboard,
  getLightAppWhiteboard,
  listLightAppWhiteboards,
  updateLightAppWhiteboard
} from '../../../services/lightAppsApi';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';
import { notifyLightAppsChanged, readLightAppsState } from '../../../utils/lightAppsState';
import { mountBoardCanvas } from './boardCanvasBridge';
import { parseMermaidTextToGraph } from './boardMermaid';
import LightAppHeaderPortal from '../LightAppHeaderPortal.vue';

const auth = useAuthSession();
const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const boards = ref([]);
const activeBoardId = ref(0);
const activeBoardKind = ref('DRAWING');
const boardLoading = ref(false);
const saving = ref(false);
const dirty = ref(false);
const errorText = ref('');
const infoText = ref('');
const pngBackground = ref('white');

const canvasMountRef = ref(null);
const mermaidFileInputRef = ref(null);

const renameState = reactive({
  open: false,
  value: ''
});

const mermaidPanel = reactive({
  visible: false,
  mode: 'import',
  text: ''
});

let boardBridge = null;
let snapshotPollTimer = 0;
let persistTimer = 0;
let infoTimer = 0;
let loadingBoardToken = 0;
let switchingBoard = false;

const activeBoard = computed(() =>
  boards.value.find((item) => Number(item.whiteboardId) === Number(activeBoardId.value)) || null
);

const statusText = computed(() => {
  if (saving.value) return '同步中...';
  if (dirty.value) return '存在未同步变更';
  if (boardLoading.value) return '加载中...';
  if (auth.isAuthenticated.value) return '已登录：白板数据云端同步';
  return '游客模式：白板数据仅保存在本地';
});

function clearInfoLater() {
  if (infoTimer) {
    window.clearTimeout(infoTimer);
  }
  infoTimer = window.setTimeout(() => {
    infoText.value = '';
  }, 2600);
}

function setInfo(message) {
  infoText.value = String(message || '').trim();
  errorText.value = '';
  if (infoText.value) {
    clearInfoLater();
  }
}

function setError(message) {
  errorText.value = String(message || '').trim() || '操作失败';
  infoText.value = '';
}

function sortBoards(items) {
  return (Array.isArray(items) ? items : [])
    .slice()
    .sort((left, right) => Number(left.sortNum || 0) - Number(right.sortNum || 0) || Number(left.whiteboardId || 0) - Number(right.whiteboardId || 0));
}

function normalizeBoardKind(raw) {
  const value = String(raw || 'DRAWING')
    .trim()
    .toUpperCase();
  if (value === 'FLOWCHART' || value === 'MINDMAP' || value === 'DRAWING') {
    return value;
  }
  return 'DRAWING';
}

function createBoardDocument(snapshot, graphKind) {
  return JSON.stringify({
    version: 1,
    graph_kind: normalizeBoardKind(graphKind),
    snapshot: snapshot && typeof snapshot === 'object' ? snapshot : null
  });
}

function parseBoardDocument(rawDocument) {
  const raw = String(rawDocument || '').trim();
  if (!raw) {
    return {
      graphKind: 'DRAWING',
      snapshot: null
    };
  }
  try {
    const parsed = JSON.parse(raw);
    if (parsed && typeof parsed === 'object' && parsed.snapshot && typeof parsed.snapshot === 'object') {
      return {
        graphKind: normalizeBoardKind(parsed.graph_kind || parsed.graphKind),
        snapshot: parsed.snapshot
      };
    }
    if (parsed && typeof parsed === 'object') {
      return {
        graphKind: 'DRAWING',
        snapshot: parsed
      };
    }
    return {
      graphKind: 'DRAWING',
      snapshot: null
    };
  } catch {
    return {
      graphKind: 'DRAWING',
      snapshot: null
    };
  }
}

function buildBoardPayload(board) {
  return {
    title: String(board.title || '').trim() || 'Board Canvas',
    board_kind: normalizeBoardKind(board.boardKind),
    document_json: String(board.documentJson || createBoardDocument(null, board.boardKind)),
    thumbnail_asset_id: board.thumbnailAssetId || null,
    sort_num: Number(board.sortNum || 0)
  };
}

function mapBoardRecord(record) {
  return {
    whiteboardId: Number(record.whiteboardId || record.whiteboard_id || 0),
    title: String(record.title || '').trim() || 'Board Canvas',
    boardKind: normalizeBoardKind(record.boardKind || record.board_kind),
    documentJson: String(record.documentJson || record.document_json || createBoardDocument(null, 'DRAWING')),
    thumbnailAssetId: Number(record.thumbnailAssetId || record.thumbnail_asset_id || 0) || null,
    sortNum: Number(record.sortNum || record.sort_num || 0),
    updatedAt: record.updatedAt || record.updated_at || ''
  };
}

function createDefaultLocalBoard(index = 1) {
  const boardKind = normalizeBoardKind(activeBoardKind.value);
  return {
    whiteboardId: createLocalEntityId(),
    title: `Board Canvas ${index}`,
    boardKind,
    documentJson: createBoardDocument(null, boardKind),
    thumbnailAssetId: null,
    sortNum: index * 10,
    updatedAt: ''
  };
}

function syncLightAppsRuntime() {
  notifyLightAppsChanged(readLightAppsState());
}

function persistGuestBoards() {
  const next = boards.value.map((item) => ({ ...item }));
  updateGuestLightAppData((current) => ({
    ...current,
    whiteboards: next
  }));
  syncLightAppsRuntime();
}

function persistRemoteCacheBoards() {
  writeRemoteLightAppCache({
    whiteboards: boards.value.map((item) => ({ ...item }))
  });
  syncLightAppsRuntime();
}

async function ensureRemoteBoardLoaded(board) {
  if (!board || !auth.isAuthenticated.value) return board;
  if (board.documentJson && board.documentJson !== '{}') return board;
  const detail = await getLightAppWhiteboard(board.whiteboardId, auth.authorizedFetch);
  const mapped = mapBoardRecord(detail);
  const targetIndex = boards.value.findIndex((item) => Number(item.whiteboardId) === Number(board.whiteboardId));
  if (targetIndex >= 0) {
    boards.value[targetIndex] = {
      ...boards.value[targetIndex],
      ...mapped
    };
    persistRemoteCacheBoards();
    return boards.value[targetIndex];
  }
  return board;
}

async function hydrateBoards() {
  boardLoading.value = true;
  errorText.value = '';
  infoText.value = '';

  await auth.ensureReady();

  try {
    if (!auth.isAuthenticated.value) {
      const guest = readGuestLightAppData();
      const normalized = sortBoards((guest.whiteboards || []).map((item) => mapBoardRecord(item)));
      boards.value = normalized.length ? normalized : [createDefaultLocalBoard(1)];
      if (!normalized.length) {
        persistGuestBoards();
      }
    } else {
      const remoteList = await listLightAppWhiteboards(auth.authorizedFetch);
      const cache = readRemoteLightAppCache();
      const cacheMap = new Map(
        (Array.isArray(cache.whiteboards) ? cache.whiteboards : []).map((item) => [Number(item.whiteboardId || item.whiteboard_id || 0), item])
      );
      const merged = remoteList.map((item) => {
        const summary = mapBoardRecord(item);
        const cached = cacheMap.get(summary.whiteboardId);
        if (!cached) return summary;
        return {
          ...summary,
          documentJson: String(cached.documentJson || cached.document_json || summary.documentJson || '')
        };
      });
      boards.value = sortBoards(merged);

      if (!boards.value.length) {
        const created = await createLightAppWhiteboard(
          {
            title: 'Board Canvas',
            board_kind: 'DRAWING',
            document_json: createBoardDocument(null, 'DRAWING'),
            sort_num: 10
          },
          auth.authorizedFetch
        );
        boards.value = [mapBoardRecord(created)];
      }
      persistRemoteCacheBoards();
    }

    activeBoardId.value = Number(boards.value[0]?.whiteboardId || 0);
  } catch (error) {
    if (auth.isAuthenticated.value) {
      const cache = readRemoteLightAppCache();
      const fallback = sortBoards((cache.whiteboards || []).map((item) => mapBoardRecord(item)));
      boards.value = fallback.length ? fallback : [createDefaultLocalBoard(1)];
      activeBoardId.value = Number(boards.value[0]?.whiteboardId || 0);
      setError(error?.message || '画板列表加载失败，已回退本地缓存。');
      return;
    }
    setError(error?.message || '画板列表加载失败。');
  } finally {
    boardLoading.value = false;
  }
}

async function loadBoardIntoCanvas(boardId) {
  if (!boardBridge?.api?.isReady()) return;
  const token = Date.now();
  loadingBoardToken = token;

  const target = boards.value.find((item) => Number(item.whiteboardId) === Number(boardId));
  if (!target) return;

  boardLoading.value = true;
  try {
    const resolvedBoard = auth.isAuthenticated.value ? await ensureRemoteBoardLoaded(target) : target;
    if (!resolvedBoard || loadingBoardToken !== token) return;

    const parsed = parseBoardDocument(resolvedBoard.documentJson);
    activeBoardKind.value = normalizeBoardKind(parsed.graphKind || resolvedBoard.boardKind);
    resolvedBoard.boardKind = activeBoardKind.value;

    if (parsed.snapshot) {
      boardBridge.api.loadSnapshot(parsed.snapshot);
    } else {
      boardBridge.api.clear();
    }
    dirty.value = false;
  } catch (error) {
    setError(error?.message || '画板内容加载失败。');
  } finally {
    if (loadingBoardToken === token) {
      boardLoading.value = false;
    }
  }
}

async function switchBoard(nextBoardId, options = {}) {
  const targetBoardId = Number(nextBoardId || 0);
  if (!targetBoardId) return;
  const previousBoardId = Number(activeBoardId.value || 0);
  const shouldFlushPrev = options.flushPrev !== false;
  const shouldClearBeforeLoad = options.clearBeforeLoad !== false;

  switchingBoard = true;
  try {
    if (shouldFlushPrev && previousBoardId > 0 && previousBoardId !== targetBoardId) {
      await flushBoardById(previousBoardId, true);
    }
    activeBoardId.value = targetBoardId;
    await nextTick();
    if (shouldClearBeforeLoad && boardBridge?.api?.isReady()) {
      boardBridge.api.clear();
    }
    await loadBoardIntoCanvas(targetBoardId);
  } finally {
    switchingBoard = false;
  }
}

function schedulePersist(boardId) {
  if (persistTimer) {
    window.clearTimeout(persistTimer);
  }
  const targetBoardId = Number(boardId || activeBoardId.value || 0);
  if (!targetBoardId) return;
  persistTimer = window.setTimeout(() => {
    flushBoardById(targetBoardId, false);
  }, 1700);
}

async function flushBoardById(boardId, force) {
  const target = boards.value.find((item) => Number(item.whiteboardId) === Number(boardId));
  if (!target) return;
  if (!force && !dirty.value) return;

  if (!auth.isAuthenticated.value) {
    persistGuestBoards();
    if (Number(activeBoardId.value) === Number(boardId)) {
      dirty.value = false;
    }
    return;
  }

  saving.value = true;
  try {
    const updated = await updateLightAppWhiteboard(target.whiteboardId, buildBoardPayload(target), auth.authorizedFetch);
    const mapped = mapBoardRecord(updated);
    const index = boards.value.findIndex((item) => Number(item.whiteboardId) === Number(boardId));
    if (index >= 0) {
      boards.value[index] = {
        ...boards.value[index],
        ...mapped
      };
    }
    persistRemoteCacheBoards();
    if (Number(activeBoardId.value) === Number(boardId)) {
      dirty.value = false;
    }
  } catch (error) {
    setError(error?.message || '画板保存失败。');
  } finally {
    saving.value = false;
  }
}

async function flushCurrentBoard(force) {
  const board = activeBoard.value;
  if (!board) return;
  if (persistTimer) {
    window.clearTimeout(persistTimer);
    persistTimer = 0;
  }
  await flushBoardById(board.whiteboardId, force);
}

function syncSnapshotFromCanvas() {
  if (!boardBridge?.api?.isReady()) return;
  if (boardLoading.value || switchingBoard || saving.value) return;
  const board = activeBoard.value;
  if (!board) return;
  let snapshot = null;
  try {
    snapshot = boardBridge.api.getSnapshot();
  } catch {
    return;
  }
  if (!snapshot || typeof snapshot !== 'object') return;

  const nextDocumentJson = createBoardDocument(snapshot, activeBoardKind.value);
  if (String(board.documentJson || '') === nextDocumentJson) return;
  board.documentJson = nextDocumentJson;
  board.boardKind = normalizeBoardKind(activeBoardKind.value);
  dirty.value = true;
  schedulePersist(board.whiteboardId);
}

function openRename() {
  if (!activeBoard.value) return;
  renameState.value = activeBoard.value.title || '';
  renameState.open = true;
}

function cancelRename() {
  renameState.open = false;
  renameState.value = '';
}

async function submitRename() {
  const board = activeBoard.value;
  if (!board) return;
  const nextTitle = String(renameState.value || '').trim();
  if (!nextTitle) {
    setError('画板名称不能为空');
    return;
  }
  board.title = nextTitle;
  renameState.open = false;
  renameState.value = '';
  dirty.value = true;
  schedulePersist(board.whiteboardId);
}

async function createBoard() {
  errorText.value = '';
  infoText.value = '';
  if (!auth.isAuthenticated.value) {
    const local = createDefaultLocalBoard(boards.value.length + 1);
    boards.value = sortBoards([...boards.value, local]);
    persistGuestBoards();
    await switchBoard(local.whiteboardId);
    setInfo('已创建本地画板');
    return;
  }

  saving.value = true;
  try {
    const created = await createLightAppWhiteboard(
      {
        title: `Board Canvas ${boards.value.length + 1}`,
        board_kind: activeBoardKind.value,
        document_json: createBoardDocument(null, activeBoardKind.value),
        sort_num: (boards.value.length + 1) * 10
      },
      auth.authorizedFetch
    );
    const mapped = mapBoardRecord(created);
    boards.value = sortBoards([...boards.value, mapped]);
    persistRemoteCacheBoards();
    await switchBoard(mapped.whiteboardId);
    setInfo('画板创建成功');
  } catch (error) {
    setError(error?.message || '画板创建失败');
  } finally {
    saving.value = false;
  }
}

async function removeBoard() {
  const board = activeBoard.value;
  if (!board || boards.value.length <= 1) return;
  const ok = window.confirm(`确定删除画板「${board.title}」吗？`);
  if (!ok) return;

  try {
    await flushCurrentBoard(true);
    if (auth.isAuthenticated.value) {
      await deleteLightAppWhiteboard(board.whiteboardId, auth.authorizedFetch);
    }
    const next = boards.value.filter((item) => Number(item.whiteboardId) !== Number(board.whiteboardId));
    boards.value = sortBoards(next);
    if (!boards.value.length) {
      const fallback = createDefaultLocalBoard(1);
      boards.value = [fallback];
    }
    if (auth.isAuthenticated.value) {
      persistRemoteCacheBoards();
    } else {
      persistGuestBoards();
    }
    await switchBoard(Number(boards.value[0].whiteboardId), {
      flushPrev: false
    });
    setInfo('画板已删除');
  } catch (error) {
    setError(error?.message || '删除画板失败');
  }
}

function closeMermaidPanel() {
  mermaidPanel.visible = false;
}

function openImportPanel() {
  mermaidPanel.visible = true;
  mermaidPanel.mode = 'import';
  if (!mermaidPanel.text) {
    mermaidPanel.text = '';
  }
}

function openExportPanel() {
  if (!boardBridge?.api?.isReady()) return;
  const preferredKind = activeBoardKind.value === 'MINDMAP' ? 'MINDMAP' : 'FLOWCHART';
  const result = boardBridge.api.exportMermaid(preferredKind);
  mermaidPanel.mode = 'export';
  mermaidPanel.visible = true;
  mermaidPanel.text = result.text || '';
  const ignoredCount = Number(result.ignored?.ignoredEdgeCount || 0);
  if (ignoredCount > 0) {
    setInfo(`导出完成，忽略 ${ignoredCount} 条不可映射连线。`);
  } else {
    setInfo('Mermaid 导出完成');
  }
}

async function copyMermaidText() {
  const text = String(mermaidPanel.text || '').trim();
  if (!text) return;
  try {
    await navigator.clipboard.writeText(text);
    setInfo('Mermaid 文本已复制');
  } catch {
    setError('复制失败，请手动复制文本');
  }
}

function downloadMermaidText() {
  const text = String(mermaidPanel.text || '').trim();
  if (!text) return;
  const board = activeBoard.value;
  const name = `${String(board?.title || 'board-canvas').trim() || 'board-canvas'}.mmd`;
  const blob = new Blob([text], { type: 'text/plain;charset=utf-8' });
  const url = URL.createObjectURL(blob);
  const link = document.createElement('a');
  link.href = url;
  link.download = name;
  link.click();
  URL.revokeObjectURL(url);
}

async function importMermaidText() {
  const source = String(mermaidPanel.text || '').trim();
  if (!source) {
    setError('请输入 Mermaid 文本');
    return;
  }
  if (!boardBridge?.api?.isReady()) {
    setError('画板尚未准备好');
    return;
  }

  try {
    await mermaid.parse(source);
  } catch (error) {
    setError(error?.str || error?.message || 'Mermaid 语法解析失败');
    return;
  }

  try {
    const graph = parseMermaidTextToGraph(source);
    const result = boardBridge.api.importGraph(graph);
    activeBoardKind.value = graph.kind === 'mindmap' ? 'MINDMAP' : 'FLOWCHART';
    if (activeBoard.value) {
      activeBoard.value.boardKind = activeBoardKind.value;
    }
    dirty.value = true;
    schedulePersist(activeBoardId.value);
    setInfo(`已导入 Mermaid：${result.createdNodeCount} 个节点，${result.createdEdgeCount} 条连线`);
    return;
  } catch {
    // try static svg fallback
  }

  try {
    const renderId = `board_canvas_${Date.now()}`;
    const rendered = await mermaid.render(renderId, source);
    await boardBridge.api.insertSvg(rendered?.svg || '');
    dirty.value = true;
    schedulePersist(activeBoardId.value);
    setInfo('此 Mermaid 语法无法完全结构化，已作为静态 SVG 插入。');
  } catch (error) {
    setError(error?.message || 'Mermaid 导入失败');
  }
}

function triggerMermaidFile() {
  mermaidFileInputRef.value?.click?.();
}

function readTextFile(file) {
  return new Promise((resolve, reject) => {
    const reader = new FileReader();
    reader.onload = () => resolve(String(reader.result || ''));
    reader.onerror = () => reject(new Error('读取文件失败'));
    reader.readAsText(file, 'utf-8');
  });
}

async function onMermaidFileChange(event) {
  const files = Array.from(event?.target?.files || []);
  if (!files.length) return;
  const file = files[0];
  try {
    const text = await readTextFile(file);
    mermaidPanel.visible = true;
    mermaidPanel.mode = 'import';
    mermaidPanel.text = text;
    setInfo('Mermaid 文件已载入，请确认后执行导入');
  } catch (error) {
    setError(error?.message || '文件读取失败');
  } finally {
    if (event?.target) {
      event.target.value = '';
    }
  }
}

async function exportPng(scope) {
  if (!boardBridge?.api?.isReady()) {
    setError('画板尚未准备好');
    return;
  }
  try {
    const board = activeBoard.value;
    const name = `${board?.title || 'board-canvas'}-${scope}`;
    const result = await boardBridge.api.exportPng(scope, pngBackground.value, name);
    if (!result?.exported) {
      setError('当前范围没有可导出的图形');
      return;
    }
    setInfo(`PNG 导出成功（${result.shapeCount} 个图形）`);
  } catch (error) {
    setError(error?.message || 'PNG 导出失败');
  }
}

watch(
  () => activeBoardKind.value,
  (next) => {
    const board = activeBoard.value;
    if (!board) return;
    const normalized = normalizeBoardKind(next);
    if (board.boardKind === normalized) return;
    board.boardKind = normalized;
    dirty.value = true;
    schedulePersist(board.whiteboardId);
  }
);

watch(
  () => activeBoardId.value,
  async (next, prev) => {
    if (!next || Number(next) <= 0) return;
    if (switchingBoard) return;
    if (Number(prev) > 0 && Number(prev) !== Number(next)) {
      switchingBoard = true;
      await flushBoardById(prev, true);
      switchingBoard = false;
    }
    await loadBoardIntoCanvas(next);
  },
  {
    flush: 'sync'
  }
);

onMounted(async () => {
  mermaid.initialize({
    startOnLoad: false,
    securityLevel: 'loose',
    theme: 'default'
  });

  await hydrateBoards();

  if (canvasMountRef.value) {
    boardBridge = mountBoardCanvas(canvasMountRef.value, {
      onReady: () => {
        if (activeBoardId.value) {
          loadBoardIntoCanvas(activeBoardId.value);
        }
      }
    });
  }

  snapshotPollTimer = window.setInterval(() => {
    syncSnapshotFromCanvas();
  }, 1800);
});

onBeforeUnmount(() => {
  if (snapshotPollTimer) {
    window.clearInterval(snapshotPollTimer);
    snapshotPollTimer = 0;
  }
  if (persistTimer) {
    window.clearTimeout(persistTimer);
    persistTimer = 0;
  }
  if (infoTimer) {
    window.clearTimeout(infoTimer);
    infoTimer = 0;
  }
  flushCurrentBoard(true);
  if (boardBridge) {
    boardBridge.destroy();
    boardBridge = null;
  }
});
</script>

<style scoped>
.lightapp-window {
  display: flex;
  flex-direction: column;
  gap: 12px;
  min-height: 100%;
}

.canvas-toolbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
  flex-wrap: wrap;
  padding: 10px 12px;
  border: 1px solid rgba(255, 255, 255, 0.26);
  border-radius: 14px;
  background: linear-gradient(128deg, rgba(var(--glass-rgb, 214, 226, 255), 0.23), rgba(var(--glass-rgb, 214, 226, 255), 0.12));
  backdrop-filter: blur(8px);
}

.toolbar-left,
.toolbar-right {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.toolbar-actions {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.board-picker,
.kind-picker {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  padding: 4px 8px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.14);
}

.kind-picker.compact {
  min-width: 124px;
}

.board-picker span,
.kind-picker span {
  font-size: 12px;
  color: rgba(229, 235, 248, 0.9);
}

.board-picker select,
.kind-picker select {
  border: none;
  outline: none;
  background: transparent;
  color: rgba(240, 245, 255, 0.96);
  font-size: 13px;
  min-width: 132px;
}

.board-picker select option,
.kind-picker select option {
  color: #141b2c;
}

.rename-panel,
.mermaid-panel {
  display: flex;
  flex-direction: column;
  gap: 8px;
  padding: 10px 12px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.26);
  background: rgba(255, 255, 255, 0.13);
}

.rename-panel label {
  display: flex;
  flex-direction: column;
  gap: 6px;
  font-size: 12px;
  color: rgba(225, 232, 248, 0.92);
}

.rename-panel input {
  border: 1px solid rgba(255, 255, 255, 0.22);
  border-radius: 10px;
  padding: 8px 10px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(245, 249, 255, 0.96);
}

.rename-actions {
  display: inline-flex;
  gap: 6px;
}

.mermaid-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.mermaid-head strong {
  font-size: 13px;
  font-weight: 700;
  color: rgba(241, 246, 255, 0.95);
}

.mermaid-panel textarea {
  width: 100%;
  min-height: 168px;
  resize: vertical;
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 12px;
  padding: 10px 12px;
  background: rgba(12, 20, 36, 0.18);
  color: rgba(239, 245, 255, 0.98);
  font-family: 'JetBrains Mono', 'Fira Code', monospace;
  font-size: 12px;
  line-height: 1.5;
}

.mermaid-actions {
  display: inline-flex;
  gap: 6px;
}

.status-text,
.error-text,
.info-text {
  margin: 0;
  font-size: 12px;
  line-height: 1.4;
}

.status-text {
  color: rgba(222, 230, 246, 0.84);
}

.info-text {
  color: rgba(166, 220, 255, 0.95);
}

.error-text {
  color: rgba(255, 136, 152, 0.96);
}

.canvas-shell {
  position: relative;
  min-height: 380px;
  height: clamp(420px, 62vh, 740px);
  border-radius: 18px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  overflow: hidden;
  background:
    linear-gradient(180deg, rgba(255, 255, 255, 0.28), rgba(220, 232, 255, 0.18)),
    rgba(233, 240, 255, 0.72);
}

.canvas-host {
  width: 100%;
  height: 100%;
}

.canvas-host {
  position: relative;
}

:deep(.board-canvas-react-host) {
  position: relative;
  width: 100%;
  height: 100%;
  min-height: 100%;
  isolation: isolate;
  overflow: hidden;
  background:
    linear-gradient(180deg, rgba(255, 255, 255, 0.84), rgba(235, 242, 255, 0.74)),
    linear-gradient(90deg, rgba(166, 185, 220, 0.12) 1px, transparent 1px),
    linear-gradient(rgba(166, 185, 220, 0.12) 1px, transparent 1px);
  background-size: auto, 24px 24px, 24px 24px;
  background-position: 0 0, 0 0, 0 0;
}

:deep(.board-canvas-react-host__surface) {
  position: absolute;
  inset: 0;
}

:deep(.board-canvas-react-host .tl-container),
:deep(.board-canvas-react-host .tl-canvas),
:deep(.board-canvas-react-host .tl-background),
:deep(.board-canvas-react-host .tl-background__wrapper) {
  background: transparent !important;
}

:deep(.board-canvas-react-host .board-snap-indicator .tl-snap-indicator) {
  stroke: rgba(122, 154, 228, 0.9) !important;
  stroke-dasharray: 7 5;
  stroke-linecap: round;
  stroke-width: calc(1.15px * var(--tl-scale));
}

:deep(.board-canvas-react-host .board-snap-indicator--gaps .tl-snap-indicator) {
  stroke: rgba(168, 190, 238, 0.88) !important;
}

:deep(.board-canvas-react-host .board-snap-indicator .tl-snap-point) {
  stroke: rgba(122, 154, 228, 0.56) !important;
  opacity: 0.42;
}

:deep(.board-canvas-react-host .board-connect-overlay) {
  position: absolute;
  inset: 0;
  overflow: visible;
  pointer-events: none;
  z-index: 26;
}

:deep(.board-canvas-react-host .board-connect-preview) {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  overflow: visible;
  pointer-events: none;
  z-index: 25;
}

:deep(.board-canvas-react-host .board-connect-preview__path) {
  fill: none;
  stroke: rgba(105, 152, 255, 0.96);
  stroke-width: 2.2px;
  stroke-dasharray: 8 6;
  stroke-linecap: round;
  stroke-linejoin: round;
  filter: drop-shadow(0 2px 6px rgba(80, 123, 216, 0.22));
}

:deep(.board-canvas-react-host .board-connect-preview__target) {
  fill: rgba(120, 166, 255, 0.08);
  stroke: rgba(102, 150, 255, 0.92);
  stroke-width: 1.8px;
  stroke-dasharray: 7 5;
  filter: drop-shadow(0 4px 10px rgba(79, 116, 204, 0.16));
}

:deep(.board-canvas-react-host .board-connect-overlay__button) {
  position: absolute;
  width: 22px;
  height: 22px;
  margin: 0;
  padding: 0;
  border: none;
  outline: none;
  border-radius: 999px;
  background: transparent;
  transform: translate(-50%, -50%);
  pointer-events: auto;
  cursor: crosshair;
}

:deep(.board-canvas-react-host .board-connect-overlay__button:hover) {
  transform: translate(-50%, -50%) scale(1.08);
}

:deep(.board-canvas-react-host .board-connect-overlay__button:active) {
  transform: translate(-50%, -50%) scale(0.98);
}

:deep(.board-canvas-react-host .board-connect-overlay__ring),
:deep(.board-canvas-react-host .board-connect-overlay__core) {
  position: absolute;
  inset: 50% auto auto 50%;
  border-radius: 999px;
  pointer-events: none;
  transform: translate(-50%, -50%);
}

:deep(.board-canvas-react-host .board-connect-overlay__ring) {
  width: 11px;
  height: 11px;
  background: rgba(255, 255, 255, 0.94);
  border: 1.4px solid rgba(125, 160, 235, 0.92);
  box-shadow: 0 1px 4px rgba(73, 98, 145, 0.24);
}

:deep(.board-canvas-react-host .board-connect-overlay__core) {
  width: 6px;
  height: 6px;
  background: rgba(116, 149, 235, 0.98);
  border: 1px solid rgba(255, 255, 255, 0.9);
}

:deep(.board-canvas-react-host .board-connect-overlay__button:active .board-connect-overlay__ring) {
  background: rgba(245, 248, 255, 0.98);
  border-color: rgba(91, 128, 224, 0.98);
}

:deep(.board-canvas-react-host .board-connect-overlay__button:active .board-connect-overlay__core) {
  background: rgba(88, 124, 224, 1);
}

:deep(.board-left-palette-host),
:deep(.board-right-style-host),
:deep(.board-zoom-host) {
  position: absolute;
  inset: 0;
  z-index: 24;
  pointer-events: none;
}

:deep(.board-left-palette-host) {
  display: flex;
  align-items: flex-start;
  justify-content: flex-start;
  padding: 60px 14px 14px;
}

:deep(.board-canvas-react-host .tlui-menu-zone) {
  position: absolute;
  top: 12px;
  left: 14px;
  z-index: 28;
}

:deep(.board-canvas-react-host .tlui-menu-zone .tlui-toolbar) {
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background:
    linear-gradient(180deg, rgba(122, 130, 148, 0.98), rgba(98, 107, 126, 0.98));
  backdrop-filter: blur(4px);
  box-shadow:
    0 14px 30px rgba(18, 24, 36, 0.22),
    inset 0 1px 0 rgba(255, 255, 255, 0.1);
}

:deep(.board-canvas-react-host .tlui-menu-zone .tlui-button) {
  color: rgba(250, 252, 255, 0.98);
}

:deep(.board-canvas-react-host .tlui-menu-zone .tlui-button:hover) {
  background: rgba(255, 255, 255, 0.14);
}

:deep(.board-canvas-react-host .tlui-menu-zone .tlui-button__label),
:deep(.board-canvas-react-host .tlui-menu-zone [data-testid='main-menu.button']) {
  color: rgba(250, 252, 255, 0.98);
}

:deep(.board-left-palette) {
  position: relative;
  display: flex;
  flex-direction: column;
  gap: 8px;
  width: 164px;
  max-width: 164px;
  padding: 8px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background:
    linear-gradient(180deg, rgba(123, 131, 149, 0.98), rgba(97, 107, 126, 0.98));
  backdrop-filter: blur(4px);
  box-shadow:
    0 14px 30px rgba(18, 24, 36, 0.22),
    inset 0 1px 0 rgba(255, 255, 255, 0.08);
  pointer-events: auto;
}

:deep(.board-left-palette__group) {
  display: flex;
  flex-direction: column;
  gap: 6px;
}

:deep(.board-left-palette__group--extra) {
  padding-top: 6px;
  border-top: 1px solid rgba(255, 255, 255, 0.16);
}

:deep(.board-left-palette__tool),
:deep(.board-left-palette__toggle) {
  width: 100%;
  appearance: none;
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.1);
  color: rgba(252, 253, 255, 0.98);
  font-size: 12px;
  line-height: 1;
  display: inline-flex;
  align-items: center;
  justify-content: flex-start;
  gap: 8px;
  padding: 8px 10px;
  cursor: pointer;
  user-select: none;
  transition: transform 0.14s ease, background-color 0.16s ease, border-color 0.16s ease;
}

:deep(.board-left-palette__tool:hover),
:deep(.board-left-palette__toggle:hover) {
  transform: translateY(-1px);
  background: rgba(255, 255, 255, 0.16);
  border-color: rgba(190, 225, 255, 0.62);
}

:deep(.board-left-palette__tool.is-selected) {
  background:
    linear-gradient(180deg, rgba(151, 183, 235, 0.62), rgba(126, 160, 218, 0.72));
  border-color: rgba(181, 217, 255, 0.82);
  box-shadow:
    inset 0 0 0 1px rgba(255, 255, 255, 0.22),
    0 8px 18px rgba(89, 119, 173, 0.18);
}

:deep(.board-left-palette__tool:active),
:deep(.board-left-palette__toggle:active) {
  transform: translateY(0);
}

:deep(.board-left-palette__tool i),
:deep(.board-left-palette__toggle i) {
  width: 14px;
  text-align: center;
  font-size: 12px;
  opacity: 0.95;
}

:deep(.board-left-palette__tool span),
:deep(.board-left-palette__toggle span) {
  white-space: nowrap;
}

:deep(.board-left-palette__guide) {
  position: absolute;
  top: 6px;
  left: calc(100% + 10px);
  width: 236px;
  padding: 10px 12px;
  border-radius: 12px;
  border: 1px solid rgba(166, 216, 255, 0.52);
  background:
    linear-gradient(180deg, rgba(115, 124, 143, 0.98), rgba(91, 101, 120, 0.98));
  box-shadow: 0 14px 28px rgba(10, 16, 26, 0.26);
}

:deep(.board-left-palette__guide p) {
  margin: 0;
  font-size: 12px;
  line-height: 1.45;
  color: rgba(243, 248, 255, 0.96);
}

:deep(.board-left-palette__guide button) {
  margin-top: 8px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  border-radius: 8px;
  padding: 5px 8px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(240, 246, 255, 0.95);
  font-size: 11px;
  cursor: pointer;
}

:deep(.board-left-palette__guide button:hover) {
  background: rgba(255, 255, 255, 0.18);
}

:deep(.board-right-style-host) {
  display: flex;
  align-items: flex-start;
  justify-content: flex-end;
  padding: 14px;
}

:deep(.board-right-style) {
  width: 288px;
  max-width: min(288px, calc(100vw - 48px));
  max-height: calc(100% - 28px);
  display: flex;
  flex-direction: column;
  gap: 10px;
  padding: 10px;
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background:
    linear-gradient(180deg, rgba(122, 130, 148, 0.98), rgba(98, 107, 126, 0.98));
  backdrop-filter: blur(4px);
  box-shadow:
    0 14px 32px rgba(18, 24, 36, 0.22),
    inset 0 1px 0 rgba(255, 255, 255, 0.08);
  pointer-events: auto;
  overflow: hidden;
}

:deep(.board-right-style__head) {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
  color: rgba(244, 248, 255, 0.96);
  font-size: 13px;
}

:deep(.board-right-style__head strong) {
  font-size: 13px;
  letter-spacing: 0.02em;
}

:deep(.board-right-style__toggle) {
  appearance: none;
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.1);
  color: rgba(250, 252, 255, 0.98);
  display: inline-flex;
  align-items: center;
  gap: 6px;
  padding: 5px 10px;
  font-size: 11px;
  cursor: pointer;
}

:deep(.board-right-style__body) {
  flex: 1;
  min-height: 0;
  overflow-y: auto;
  padding-right: 2px;
}

:deep(.board-right-style__placeholder) {
  margin: 0;
  padding: 12px 10px;
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.1);
  color: rgba(240, 245, 255, 0.92);
  font-size: 12px;
  line-height: 1.5;
}

:deep(.board-right-style .tlui-style-panel__wrapper) {
  margin: 0;
  max-height: none;
  background: transparent;
  box-shadow: none;
  border-radius: 0;
}

:deep(.board-right-style .tlui-style-panel) {
  width: 100%;
  max-width: none;
}

:deep(.board-right-style .tlui-style-panel__section) {
  border-radius: 10px;
  overflow: visible;
}

:deep(.board-zoom-host) {
  display: flex;
  align-items: flex-end;
  justify-content: flex-end;
  padding: 14px;
}

:deep(.board-zoom-panel) {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  padding: 8px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background:
    linear-gradient(180deg, rgba(122, 130, 148, 0.98), rgba(98, 107, 126, 0.98));
  backdrop-filter: blur(4px);
  box-shadow:
    0 12px 28px rgba(18, 24, 36, 0.22),
    inset 0 1px 0 rgba(255, 255, 255, 0.08);
  pointer-events: auto;
}

:deep(.board-zoom-panel__btn),
:deep(.board-zoom-panel__secondary) {
  appearance: none;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(252, 253, 255, 0.98);
  cursor: pointer;
  transition: background-color 0.16s ease, border-color 0.16s ease, transform 0.14s ease;
}

:deep(.board-zoom-panel__btn:hover),
:deep(.board-zoom-panel__secondary:hover) {
  background: rgba(255, 255, 255, 0.16);
  border-color: rgba(190, 225, 255, 0.62);
  transform: translateY(-1px);
}

:deep(.board-zoom-panel__btn:disabled),
:deep(.board-zoom-panel__secondary:disabled) {
  opacity: 0.5;
  cursor: not-allowed;
  transform: none;
}

:deep(.board-zoom-panel__btn) {
  width: 30px;
  height: 30px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  font-size: 12px;
}

:deep(.board-zoom-panel__secondary) {
  height: 30px;
  padding: 0 10px;
  border-radius: 999px;
  font-size: 11px;
}

:deep(.board-zoom-panel__value) {
  min-width: 52px;
  text-align: center;
  color: rgba(241, 246, 255, 0.94);
  font-size: 12px;
  font-weight: 600;
}

.canvas-mask {
  position: absolute;
  inset: 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 10px;
  background: rgba(10, 16, 28, 0.42);
  color: rgba(241, 246, 255, 0.95);
  font-size: 13px;
  z-index: 3;
}

.hidden-file {
  display: none;
}

@container lightapp-window-body (max-width: 980px) {
  .canvas-toolbar {
    flex-direction: column;
    align-items: stretch;
  }

  .toolbar-left,
  .toolbar-right {
    justify-content: space-between;
  }

  .board-picker,
  .kind-picker {
    flex: 1;
  }

  .board-picker select,
  .kind-picker select {
    min-width: 0;
    width: 100%;
  }

  :deep(.board-right-style-host) {
    padding: 14px 14px 72px;
    align-items: flex-end;
  }

  :deep(.board-right-style.is-compact) {
    width: min(320px, calc(100% - 28px));
    max-width: min(320px, calc(100% - 28px));
  }
}

@container lightapp-window-body (max-width: 620px) {
  .toolbar-actions {
    flex-wrap: wrap;
  }

  .canvas-shell {
    min-height: 340px;
    height: clamp(340px, 58vh, 640px);
  }

  :deep(.board-left-palette-host) {
    top: auto;
    padding: 0 10px 10px;
    align-items: flex-end;
  }

  :deep(.board-left-palette) {
    width: calc(100% - 20px);
    max-width: none;
    gap: 6px;
    flex-direction: row;
    align-items: center;
    overflow-x: auto;
    padding: 7px;
  }

  :deep(.board-left-palette__group),
  :deep(.board-left-palette__group--extra) {
    padding-top: 0;
    border-top: none;
    flex-direction: row;
  }

  :deep(.board-left-palette__guide) {
    top: auto;
    left: 0;
    right: 0;
    bottom: calc(100% + 8px);
    width: auto;
  }

  :deep(.board-left-palette__tool),
  :deep(.board-left-palette__toggle) {
    width: auto;
    min-width: 74px;
    justify-content: center;
    padding: 8px 9px;
  }

  :deep(.board-right-style-host) {
    padding: 10px 10px 70px;
  }

  :deep(.board-right-style) {
    width: calc(100% - 20px);
    max-width: none;
  }

  :deep(.board-zoom-host) {
    padding: 10px 10px 68px;
  }

  :deep(.board-zoom-panel) {
    gap: 4px;
    padding: 7px;
  }

  .mermaid-panel textarea {
    min-height: 132px;
  }
}
</style>
