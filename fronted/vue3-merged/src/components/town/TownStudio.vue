<!--
THESIS: Explore an existing artist-authored town and edit the very place you visit.
OWN-WORLD: Inherit AIHub panels; the default canvas retains LPC Victorian Town's
original 32 px streets and buildings. Kenney's earlier scene remains selectable.
STORY: Choose a credited scene, walk its streets, meet four landmarks, then edit.
FIRST VIEWPORT: A compact town toolbar, a large playable canvas and an optional
tile palette alongside it. Instructions and touch controls sit below the map.
FORM: A local extension of AIHub, with a canvas workspace and an inspector.
-->
<template>
  <section class="town-studio" aria-label="小镇游玩与地图编辑器">
    <header class="town-toolbar">
      <div class="town-title"><i class="fas fa-tree" aria-hidden="true"></i><div><h2>{{ map.name }}</h2><span>{{ editing ? '地图编辑器 · 仅保存在当前浏览器' : importedScene ? '原作者完整街区 · 128 × 128 格' : '生活小镇 · 欢迎新邻居' }}</span></div></div>
      <div class="town-actions">
        <span class="save-state" :class="{ dirty }">{{ dirty ? '有未保存修改' : '地图已就绪' }}</span>
        <button type="button" :aria-pressed="editing" @click="toggleEditing">{{ editing ? '▶ 试玩地图' : '编辑小镇' }}</button>
        <button v-if="editing" type="button" class="primary" @click="save">保存地图</button>
      </div>
    </header>

    <div class="scene-picker">
      <label>游玩场景<select :value="currentScene" aria-label="游玩场景" @change="requestScene"><option v-for="scene in TOWN_SCENES" :key="scene.id" :value="scene.id">{{ scene.label }}</option></select></label>
      <span>{{ importedScene ? '下载自 OpenGameArt · 保留原作者布局' : 'Kenney 素材 · 本站编排地图' }}</span>
    </div>
    <div v-if="pendingScene" class="scene-confirm" role="status"><span>当前地图有未保存修改。先保存，或明确放弃草稿后再切换。</span><button type="button" @click="saveAndSwitch">保存并切换</button><button type="button" @click="switchScene(pendingScene)">放弃草稿并切换</button><button type="button" @click="pendingScene = ''">取消</button></div>

    <p v-if="error" class="town-feedback error" role="alert">{{ error }}</p>
    <p v-else-if="feedback" class="town-feedback" role="status">{{ feedback }}</p>

    <div v-if="editing" class="edit-toolbar" role="group" aria-label="地图工具">
      <button v-for="item in tools" :key="item.id" type="button" :class="{ selected: tool === item.id }" :aria-pressed="tool === item.id" @click="tool = item.id">{{ item.label }}</button>
      <span class="tool-divider"></span>
      <button type="button" :disabled="!undoStack.length" title="Ctrl / ⌘ Z" @click="undo">撤销</button>
      <button type="button" :disabled="!redoStack.length" title="Ctrl / ⌘ Shift Z" @click="redo">重做</button>
      <label class="compact-check"><input v-model="showGrid" type="checkbox" />网格</label>
      <label class="compact-check"><input v-model="showCollision" type="checkbox" />碰撞</label>
    </div>

    <div class="town-workspace" :class="{ editing }">
      <div class="map-column">
        <div ref="viewport" class="town-viewport" :class="{ 'is-editing': editing, 'is-panning': tool === 'pan' && editing }">
          <canvas ref="canvas" class="town-canvas" tabindex="0" role="application"
              :aria-label="editing ? '地图画布，选择工具后点击或拖动编辑；平移工具拖动地图' : `${map.name}地图，方向键或 WASD 移动，E 或空格交互，点击地面寻路`"
            :data-player-x="player.x" :data-player-y="player.y" :data-map-width="map.width"
            @keydown="onKey" @pointerdown="onPointerDown" @pointermove="onPointerMove" @pointerup="finishStroke" @pointercancel="finishStroke" @lostpointercapture="finishStroke" @pointerleave="hover = null" @contextmenu.prevent></canvas>
          <div class="map-hud"><span><i class="fas fa-location-dot" aria-hidden="true"></i> {{ editing ? `${map.width} × ${map.height} 格` : map.name }}</span><span v-if="!editing">散步 {{ visitedCount }} / {{ questEvents.length }}</span><span v-else>{{ hover ? `${hover.x}, ${hover.y}` : '点击画布编辑' }}</span></div>
          <div class="map-view-controls">
            <label><span class="sr-only">地图缩放</span><select v-model="zoom" aria-label="地图缩放"><option value="fit">全景</option><option :value="1">1×</option><option :value="2">2×</option><option :value="3">3×</option></select></label>
            <button type="button" @click="recenter">{{ editing ? '居中' : '回到出生点' }}</button>
            <button type="button" :aria-label="fullscreen ? '退出全屏地图' : '全屏地图'" @click="toggleFullscreen">{{ fullscreen ? '退出全屏' : '全屏' }}</button>
          </div>
          <div v-if="!editing && dialogue" class="town-dialogue" aria-live="polite">
            <div><strong>{{ dialogue.title }}</strong><button type="button" aria-label="关闭对话" @click="closeDialogue">×</button></div>
            <p>{{ dialogue.text }}</p>
            <button v-if="dialogue.destination" type="button" class="primary" @click="openDestination">打开{{ destinationLabel(dialogue.destination) }}</button>
            <button v-else type="button" @click="closeDialogue">继续散步</button>
          </div>
          <button v-else-if="!editing && near" type="button" class="interact-hint" @click="interact()">E · {{ near.title }}</button>
          <span v-if="assetFailed" class="asset-warning">素材加载失败，正在使用简化画面。请刷新重试。</span>
        </div>

        <div v-if="!editing" class="play-footer">
          <div class="play-guide"><strong>{{ completed ? '这座街区，已经像家了。' : '一张新邻居的散步清单' }}</strong><p>{{ completed ? '今天的四处散步已经完成。随时可以继续探索，或打开编辑器改造街区。' : importedScene ? '沿街拜访旧礼拜堂、图书馆、集市和喷泉公园，认识这座生活街区。' : '拜访面包店、教堂、花园和池塘，认识这座小镇。' }}</p><div class="quest-list"><button v-for="event in questEvents" :key="event.id" type="button" :aria-label="`前往${event.title}`" :class="{ done: visited.has(event.id) }" :disabled="Boolean(dialogue)" @click="walkTo(event)">{{ visited.has(event.id) ? '✓' : '○' }} {{ event.title }}</button></div><small>金色标记的是你 · 点击地图后用方向键 / WASD 移动 · E / 空格交互 · 点击地面或散步清单自动寻路</small></div>
          <div class="touch-controls" role="group" aria-label="移动控制"><button type="button" class="up" aria-label="向上移动" @click="move(0, -1)">↑</button><button type="button" class="left" aria-label="向左移动" @click="move(-1, 0)">←</button><button type="button" class="down" aria-label="向下移动" @click="move(0, 1)">↓</button><button type="button" class="right" aria-label="向右移动" @click="move(1, 0)">→</button><button type="button" class="action" :disabled="!near" @click="interact()">交互</button></div>
        </div>
        <div v-else class="editor-footer"><span>拖动连续绘制 · 平移工具拖动地图 · Ctrl / ⌘ Z 撤销</span><div><button type="button" @click="exportMap">导出 JSON</button><label class="import-button">导入 JSON<input ref="importInput" type="file" accept=".json,application/json" aria-label="导入地图 JSON" @change="importMap" /></label><button type="button" @click="resetPending = !resetPending">恢复初始地图</button></div><div v-if="resetPending" class="reset-confirm"><span>将用初始小镇替换当前草稿，保存前可以撤销。</span><button type="button" @click="restoreStarter">确认恢复</button><button type="button" @click="resetPending = false">取消</button></div></div>
      </div>

      <aside v-if="editing" class="tile-inspector" aria-label="地图素材与属性">
        <label class="field-label">地图名称<input :value="map.name" maxlength="60" @change="renameMap" /></label>
        <template v-if="tool === 'ground' || tool === 'objects' || tool === 'erase'">
          <h3>{{ tool === 'ground' ? '地面瓦片' : tool === 'erase' ? '擦除物件' : '物件瓦片' }}</h3>
          <template v-if="tool === 'ground'"><div class="tile-palette"><button v-for="id in visibleGroundTiles" :key="id" type="button" :title="tileName(id, '地面')" :aria-label="tileName(id, '地面')" :aria-pressed="groundBrush === id" :class="{ selected: groundBrush === id }" @click="groundBrush = id"><span :style="tileStyle(id)"></span><small>{{ tileName(id, '地面') }}</small></button></div></template>
          <template v-else-if="tool === 'objects'"><label class="field-label">素材分类<select v-model="paletteIndex" @change="palettePage = 0"><option v-for="(palette, index) in tileset.palettes" :key="palette.name" :value="index">{{ palette.name }}</option></select></label><div class="tile-palette objects"><button v-for="id in visibleObjectTiles" :key="id" type="button" :title="tileName(id, '物件')" :aria-label="tileName(id, '物件')" :aria-pressed="objectBrush === id" :class="{ selected: objectBrush === id }" @click="objectBrush = id"><span :style="tileStyle(id)">{{ !importedScene && id >= 132 ? specialGlyph(id) : '' }}</span></button></div><div v-if="palettePages > 1" class="palette-pagination"><button type="button" aria-label="上一页素材" :disabled="palettePage === 0" @click="palettePage--">←</button><span>{{ palettePage + 1 }} / {{ palettePages }}</span><button type="button" aria-label="下一页素材" :disabled="palettePage >= palettePages - 1" @click="palettePage++">→</button></div><small>当前瓦片 #{{ objectBrush }}。建筑由多格拼成；用「吸管」可直接取用地图上的瓦片。</small></template>
          <p v-else>点击或拖动擦除物件和该格的碰撞覆盖；地面与交互点保留。</p>
        </template>
        <template v-else-if="tool === 'collision'"><h3>通行设置</h3><label class="field-label">笔刷<select v-model.number="collisionBrush"><option :value="1">禁止通行</option><option :value="0">允许通行</option><option :value="-1">按地形自动判断</option></select></label><p>红色为阻挡，绿色为可走。建筑、树木与障碍默认阻挡，可在这里调整。</p></template>
        <template v-else-if="tool === 'spawn'"><h3>玩家出生点</h3><p>点击可通行的空地设置。当前坐标：{{ map.spawn.x }}, {{ map.spawn.y }}。</p></template>
        <template v-else-if="tool === 'event'"><h3>交互点</h3><p>点击地图选中或新增交互点。靠近后按 E 显示对话。</p><template v-if="eventDraft"><span class="event-coordinate">位置 {{ eventDraft.x }}, {{ eventDraft.y }}</span><label class="field-label">名称<input v-model="eventDraft.title" maxlength="60" /></label><label class="field-label">类型<select v-model="eventDraft.kind"><option value="npc">居民</option><option value="sign">路牌</option><option value="door">建筑入口</option></select></label><label class="field-label">对话内容<textarea v-model="eventDraft.text" maxlength="1200" rows="5"></textarea></label><label class="field-label">打开场景<select v-model="eventDraft.destination"><option v-for="code in DESTINATIONS" :key="code" :value="code">{{ destinationLabel(code) }}</option></select></label><label class="field-label">居民服装<select v-model="eventDraft.color"><option value="blue">湖蓝</option><option value="rose">莓红</option><option value="gold">麦黄</option><option value="green">松绿</option></select></label><label class="compact-check"><input v-model="eventDraft.quest" type="checkbox" />加入散步清单</label><button type="button" class="primary" @click="applyEvent">应用交互点</button><button type="button" :disabled="!map.events.some(e => e.id === eventDraft.id)" @click="deleteEvent">删除交互点</button></template></template>
        <template v-else-if="tool === 'pick'"><h3>取用地图瓦片</h3><p>点击现有地面或景物，自动选中对应的绘制笔刷。不会修改地图。</p></template>
        <template v-else><h3>平移视野</h3><p>在地图上拖动，或选择「全景」一次查看整座小镇。</p></template>
        <details class="editor-help"><summary>地图与保存说明</summary><p>本地保存只对当前浏览器有效。导出 JSON 可备份或换设备导入。这里编辑的是小镇原生地图；RPGMaker 项目资源的解析入口由管理员单独管理。</p></details>
      </aside>
    </div>
    <footer class="town-credit"><span><a :href="tileset.creditUrl" target="_blank" rel="noopener noreferrer">{{ tileset.creditName }}</a> · <a :href="tileset.detailsUrl" target="_blank" rel="noopener noreferrer">{{ importedScene ? '完整作者与许可' : '素材说明' }}</a></span><span v-if="importedScene"><a :href="tileset.sourceDownload" target="_blank" rel="noopener noreferrer">原始资源包</a> · <a href="/town/victorian/source/victorian-preview.tmx" download>原始 Tiled 地图</a> · 地图原作，通行与对话为本站补充</span><span v-else>初始场景与居民对话为内置内容</span></footer>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { onBeforeRouteLeave } from 'vue-router';
import { DESTINATIONS, TILE_NAMES, cloneMap, findPath, inBounds, isWalkable, nearbyEvent, parseMapJson, tileIndex, townTileset, validateMap } from './townMap';
import { TOWN_SCENES, TOWN_SCENE_KEY, createSceneMap, preferredScene, sceneIdForMap, sceneSaveKey } from './townScenes';
import { drawTown } from './townRenderer';

const emit = defineEmits(['destination']);
const props = defineProps({ active: { type: Boolean, default: true }, initialScene: { type: String, default: 'victorian' } });
const map = ref(createSceneMap(props.initialScene));
const savedSnapshot = ref(JSON.stringify(map.value));
const dirty = computed(() => JSON.stringify(map.value) !== savedSnapshot.value);
const editing = ref(false), tool = ref('ground'), groundBrush = ref(43), objectBrush = ref(4), collisionBrush = ref(1), paletteIndex = ref(0);
const zoom = ref(2), showGrid = ref(true), showCollision = ref(false), resetPending = ref(false);
const fullscreen = ref(false);
const pendingScene = ref(''), palettePage = ref(0);
const error = ref(''), feedback = ref(''), dialogue = ref(null), eventDraft = ref(null), hover = ref(null), assetFailed = ref(false);
const viewport = ref(null), canvas = ref(null), importInput = ref(null);
const player = reactive({ ...map.value.spawn, direction: 'down', step: 0 });
const visited = ref(new Set()), route = ref([]), undoStack = ref([]), redoStack = ref([]);
const dimensions = reactive({ width: 800, height: 520 });
const camera = reactive({ x: 0, y: 0 });
const currentScene = computed(() => sceneIdForMap(map.value));
const importedScene = computed(() => currentScene.value === 'victorian');
const tileset = computed(() => townTileset(map.value));
const visibleGroundTiles = computed(() => tileset.value.groundIds.includes(groundBrush.value) ? tileset.value.groundIds : [...tileset.value.groundIds, groundBrush.value]);
const palettePages = computed(() => Math.ceil((tileset.value.palettes[paletteIndex.value]?.tiles.length || 0) / 48));
const visibleObjectTiles = computed(() => (tileset.value.palettes[paletteIndex.value]?.tiles || []).slice(palettePage.value * 48, (palettePage.value + 1) * 48));
const scale = computed(() => zoom.value === 'fit' ? Math.min(dimensions.width / (map.value.width * 16), dimensions.height / (map.value.height * 16)) : Number(zoom.value));
const near = computed(() => nearbyEvent(map.value, player));
const questEvents = computed(() => map.value.events.filter(e => e.quest));
const visitedCount = computed(() => questEvents.value.filter(e => visited.value.has(e.id)).length);
const completed = computed(() => questEvents.value.length > 0 && visitedCount.value === questEvents.value.length);
const tools = [{ id: 'ground', label: '地面' }, { id: 'objects', label: '物件' }, { id: 'pick', label: '吸管' }, { id: 'erase', label: '橡皮' }, { id: 'collision', label: '碰撞' }, { id: 'spawn', label: '出生点' }, { id: 'event', label: '交互点' }, { id: 'pan', label: '平移' }];
let atlas, ctx, observer, frame, lastFrame = 0, lastMove = 0, stroke = null, strokeChanged = false, lastPaint = null, panStart = null, pointerId = null, pendingInteraction = null;

function destinationLabel(code) { return { '': '仅显示对话', library: '图书馆', classroom: '教室', home_gate: '自宅外部', finance_vault: '账房库' }[code] || code; }
function specialGlyph(id) { return { 132: '✝', 133: '≈', 134: '═', 135: '⛲', 136: '♜' }[id] || ''; }
function tileName(id, layer) { return importedScene.value ? `${layer} #${id}` : TILE_NAMES[id] || `${layer} ${id}`; }
function tileStyle(id) { const ts = tileset.value; return !importedScene.value && id >= 132 ? { background: id === 133 ? '#568f9c' : '#adbd90', color: '#35493e' } : { backgroundImage: `url(${ts.atlasUrl})`, backgroundSize: `${ts.columns * 32}px ${ts.rows * 32}px`, backgroundPosition: `-${(id % ts.columns) * 32}px -${Math.floor(id / ts.columns) * 32}px` }; }
function message(text) { error.value = ''; feedback.value = text; }
function fail(cause) { error.value = cause instanceof Error ? cause.message : String(cause); feedback.value = ''; }
function remember(before) { if (before === JSON.stringify(map.value)) return; undoStack.value.push(before); if (undoStack.value.length > 40) undoStack.value.shift(); redoStack.value = []; }
function mutate(action) { const before = JSON.stringify(map.value); action(); remember(before); }
function renameMap(event) { mutate(() => { map.value.name = event.target.value; }); }
function clearInteraction() { dialogue.value = null; route.value = []; pendingInteraction = null; }
function resetPlayer() { Object.assign(player, map.value.spawn, { direction: 'down' }); clearInteraction(); centerCamera(); }
function resetBrushes() { paletteIndex.value = 0; palettePage.value = 0; groundBrush.value = tileset.value.groundIds[0]; objectBrush.value = tileset.value.palettes[0].tiles[0]; }
function loadAtlas() { assetFailed.value = false; atlas = new Image(); atlas.onerror = () => { assetFailed.value = true; }; atlas.src = tileset.value.atlasUrl; }
function requestScene(event) {
  const id = event.target.value; event.target.value = currentScene.value;
  finishStroke();
  if (id === currentScene.value) return;
  if (dirty.value) { pendingScene.value = id; return; }
  switchScene(id);
}
function switchScene(id, rememberChoice = true) {
  try {
    if (!TOWN_SCENES.some(scene => scene.id === id)) throw new Error('未找到这个内置场景。');
    const saved = localStorage.getItem(sceneSaveKey(id));
    const next = saved ? parseMapJson(saved) : createSceneMap(id);
    if (sceneIdForMap(next) !== id) throw new Error('存档的场景图集不匹配，请通过 JSON 备份恢复。');
    if (rememberChoice) localStorage.setItem(TOWN_SCENE_KEY, id);
    map.value = next; savedSnapshot.value = JSON.stringify(next);
    undoStack.value = []; redoStack.value = []; eventDraft.value = null; visited.value = new Set(); pendingScene.value = ''; resetPending.value = false;
    resetBrushes(); resetPlayer(); error.value = ''; feedback.value = '';
    return true;
  } catch (cause) { fail(cause); return false; }
}
function saveAndSwitch() { const id = pendingScene.value; if (save()) switchScene(id); }
function undo() { finishStroke(); if (!undoStack.value.length) return; redoStack.value.push(JSON.stringify(map.value)); map.value = JSON.parse(undoStack.value.pop()); eventDraft.value = null; clearInteraction(); }
function redo() { finishStroke(); if (!redoStack.value.length) return; undoStack.value.push(JSON.stringify(map.value)); map.value = JSON.parse(redoStack.value.pop()); eventDraft.value = null; clearInteraction(); }
function toggleEditing() {
  finishStroke();
  if (editing.value) { try { validateMap(map.value); } catch (cause) { fail(cause); return; } }
  editing.value = !editing.value; resetPlayer(); error.value = ''; feedback.value = '';
  void nextTick(() => { resize(); canvas.value?.focus({ preventScroll: true }); });
}
function save() {
  finishStroke();
  try { const value = JSON.stringify(validateMap(map.value)); localStorage.setItem(sceneSaveKey(currentScene.value), value); localStorage.setItem(TOWN_SCENE_KEY, currentScene.value); savedSnapshot.value = value; message('地图已保存到当前浏览器。建议同时导出 JSON 备份。'); return true; }
  catch (cause) { fail(cause?.name === 'QuotaExceededError' || cause?.name === 'SecurityError' ? new Error('浏览器无法保存，请允许本地存储或导出 JSON 备份。') : cause); return false; }
}
function exportMap() {
  finishStroke();
  try {
    const value = validateMap(map.value);
    const url = URL.createObjectURL(new Blob([JSON.stringify(value, null, 2)], { type: 'application/json' }));
    const anchor = document.createElement('a');
    anchor.href = url; anchor.download = importedScene.value ? 'victorian-town.json' : 'qingchuan-town.json'; anchor.hidden = true;
    document.body.appendChild(anchor); anchor.click(); anchor.remove();
    setTimeout(() => URL.revokeObjectURL(url), 30_000);
    message('已请求下载地图 JSON，请在浏览器下载列表中确认。');
  }
  catch (cause) { fail(cause); }
}
async function importMap(event) {
  const file = event.target.files?.[0]; if (!file) return;
  try { if (file.size > 1_000_000) throw new Error('地图文件不能超过 1 MB。'); const imported = parseMapJson(await file.text()); mutate(() => { map.value = imported; }); visited.value = new Set(); eventDraft.value = null; resetPlayer(); message('地图已导入草稿，确认后点击「保存地图」。可撤销本次导入。'); }
  catch (cause) { fail(cause); }
  finally { event.target.value = ''; }
}
function restoreStarter() { const id = currentScene.value; mutate(() => { map.value = createSceneMap(id); }); resetPending.value = false; eventDraft.value = null; visited.value = new Set(); resetPlayer(); message('已恢复当前场景的初始地图草稿。保存前可以撤销。'); }
function applyEvent() {
  if (!eventDraft.value) return;
  try {
    const candidate = cloneMap(map.value), e = { ...eventDraft.value }, index = candidate.events.findIndex(item => item.id === e.id);
    if (index >= 0) candidate.events[index] = e; else candidate.events.push(e);
    validateMap(candidate); mutate(() => { map.value = candidate; }); message('交互点已应用。切换试玩，靠近后即可对话。');
  } catch (cause) { fail(cause); }
}
function deleteEvent() { mutate(() => { map.value.events = map.value.events.filter(e => e.id !== eventDraft.value.id); }); eventDraft.value = null; }
function centerCamera() {
  const size = scale.value * 16, worldW = map.value.width * size, worldH = map.value.height * size;
  camera.x = Math.round(worldW < dimensions.width ? (worldW - dimensions.width) / 2 : Math.max(0, Math.min(worldW - dimensions.width, (player.x + .5) * size - dimensions.width / 2)));
  camera.y = Math.round(worldH < dimensions.height ? (worldH - dimensions.height) / 2 : Math.max(0, Math.min(worldH - dimensions.height, (player.y + .5) * size - dimensions.height / 2)));
}
function recenter() { if (editing.value) centerCamera(); else resetPlayer(); canvas.value?.focus({ preventScroll: true }); }
async function toggleFullscreen() {
  try { if (document.fullscreenElement) await document.exitFullscreen(); else if (viewport.value?.requestFullscreen) await viewport.value.requestFullscreen(); else message('当前浏览器不支持全屏，可以使用缩放切换地图视野。'); }
  catch { fail('无法进入全屏，请允许浏览器全屏或使用地图缩放。'); }
}
function fullscreenChanged() { fullscreen.value = document.fullscreenElement === viewport.value; resize(); }
function resize() {
  if (!viewport.value || !canvas.value) return;
  dimensions.width = viewport.value.clientWidth || 800; dimensions.height = viewport.value.clientHeight || 520;
  const ratio = Math.min(window.devicePixelRatio || 1, 2);
  canvas.value.width = dimensions.width * ratio; canvas.value.height = dimensions.height * ratio;
  ctx = canvas.value.getContext('2d'); ctx?.setTransform(ratio, 0, 0, ratio, 0, 0); centerCamera();
}
function move(dx, dy, fromRoute = false) {
  if (editing.value || dialogue.value || !props.active) return false;
  if (!fromRoute) { route.value = []; pendingInteraction = null; }
  player.direction = dx < 0 ? 'left' : dx > 0 ? 'right' : dy < 0 ? 'up' : 'down';
  if (!isWalkable(map.value, player.x + dx, player.y + dy)) return false;
  player.x += dx; player.y += dy; player.step = (player.step + 1) % 2; centerCamera(); return true;
}
function interact(event = near.value) {
  if (!event || editing.value) return;
  clearInteraction(); dialogue.value = { ...event }; visited.value = new Set([...visited.value, event.id]);
}
function closeDialogue() { dialogue.value = null; canvas.value?.focus({ preventScroll: true }); }
async function openDestination() {
  if (document.fullscreenElement === viewport.value) {
    try { await document.exitFullscreen(); } catch { fail('请先退出全屏，再打开场景入口。'); return; }
  }
  if (dialogue.value?.destination) emit('destination', dialogue.value.destination);
  closeDialogue();
}
function onKey(event) {
  if (event.ctrlKey || event.metaKey) { if (editing.value && event.key.toLowerCase() === 'z') { event.preventDefault(); event.shiftKey ? redo() : undo(); } return; }
  const key = event.key.toLowerCase(), directions = { arrowup: [0, -1], w: [0, -1], arrowdown: [0, 1], s: [0, 1], arrowleft: [-1, 0], a: [-1, 0], arrowright: [1, 0], d: [1, 0] };
  if (key === 'escape') { closeDialogue(); route.value = []; return; }
  if (editing.value) return;
  if (directions[key]) { event.preventDefault(); if (!event.repeat || performance.now() - lastMove > 110) { move(...directions[key]); lastMove = performance.now(); } }
  if (key === 'e' || key === ' ' || key === 'enter') { event.preventDefault(); if (!event.repeat) dialogue.value ? closeDialogue() : interact(); }
}
function point(event) { const bounds = canvas.value.getBoundingClientRect(); return { x: Math.floor((event.clientX - bounds.left + camera.x) / (16 * scale.value)), y: Math.floor((event.clientY - bounds.top + camera.y) / (16 * scale.value)) }; }
function walkTo(p) {
  if (dialogue.value) return;
  const event = map.value.events.find(e => e.x === p.x && e.y === p.y);
  let target = p;
  if (event) {
    if (Math.abs(player.x - p.x) + Math.abs(player.y - p.y) <= 1) { interact(event); return; }
    const candidates = [[0, 1], [1, 0], [0, -1], [-1, 0]].map(([dx, dy]) => ({ x: p.x + dx, y: p.y + dy })).filter(t => isWalkable(map.value, t.x, t.y)).map(t => ({ target: t, path: findPath(map.value, player, t) })).filter(t => t.path.length).sort((a, b) => a.path.length - b.path.length);
    if (!candidates.length) { message('这里暂时走不到，试试另一条路。'); return; }
    target = candidates[0].target;
  }
  const path = findPath(map.value, player, target);
  if (!path.length) { if (player.x !== target.x || player.y !== target.y) message('这里无法通行，点击空地或道路试试。'); return; }
  pendingInteraction = event || null; route.value = path;
}
function paint(p) {
  if (!inBounds(map.value, p.x, p.y)) return;
  const i = tileIndex(map.value, p.x, p.y);
  if (tool.value === 'pick') {
    const object = map.value.objects[i];
    if (object >= 0) {
      paletteIndex.value = Math.max(0, tileset.value.palettes.findIndex(palette => palette.tiles.includes(object)));
      palettePage.value = Math.floor(tileset.value.palettes[paletteIndex.value].tiles.indexOf(object) / 48);
      objectBrush.value = object; tool.value = 'objects';
    } else { groundBrush.value = map.value.ground[i]; tool.value = 'ground'; }
    message(`已取用${object >= 0 ? '物件' : '地面'}瓦片 #${object >= 0 ? object : groundBrush.value}。`);
    stroke = null; strokeChanged = false;
    return;
  }
  if (tool.value === 'event') { const existing = map.value.events.find(e => e.x === p.x && e.y === p.y); eventDraft.value = existing ? { ...existing } : { id: `event-${Date.now()}-${p.x}-${p.y}`, ...p, kind: 'sign', title: '新的交互点', text: '欢迎来到这里。', destination: '', color: 'blue', quest: false }; return; }
  if (tool.value === 'spawn') { if (!isWalkable(map.value, p.x, p.y)) { fail('这里不可通行，请把出生点放在空地上。'); return; } map.value.spawn = { ...p }; }
  else if (tool.value === 'ground') map.value.ground[i] = groundBrush.value;
  else if (tool.value === 'objects') map.value.objects[i] = objectBrush.value;
  else if (tool.value === 'erase') { map.value.objects[i] = -1; map.value.collision[i] = -1; }
  else if (tool.value === 'collision') map.value.collision[i] = collisionBrush.value;
  strokeChanged = true;
}
function onPointerDown(event) {
  if (event.button !== 0 && event.button !== 1 && event.button !== 2) return;
  canvas.value.focus({ preventScroll: true }); const p = point(event); hover.value = p;
  if (!editing.value) { if (event.button === 0) walkTo(p); return; }
  event.preventDefault(); pointerId = event.pointerId; canvas.value.setPointerCapture?.(pointerId);
  if (tool.value === 'pan' || event.button !== 0) { panStart = { x: event.clientX, y: event.clientY, cameraX: camera.x, cameraY: camera.y }; return; }
  stroke = JSON.stringify(map.value); strokeChanged = false; paint(p); lastPaint = p;
}
function onPointerMove(event) {
  if (pointerId !== null && event.pointerId !== pointerId) return;
  hover.value = point(event);
  if (panStart) { camera.x = Math.round(panStart.cameraX - event.clientX + panStart.x); camera.y = Math.round(panStart.cameraY - event.clientY + panStart.y); }
  else if (stroke && editing.value && !['event', 'spawn'].includes(tool.value)) {
    const start = lastPaint || hover.value, end = hover.value;
    const steps = Math.min(128, Math.max(Math.abs(end.x - start.x), Math.abs(end.y - start.y)));
    for (let i = 1; i <= steps; i++) paint({ x: Math.round(start.x + (end.x - start.x) * i / steps), y: Math.round(start.y + (end.y - start.y) * i / steps) });
    lastPaint = end;
  }
}
function finishStroke() { if (stroke && strokeChanged) remember(stroke); stroke = null; strokeChanged = false; lastPaint = null; panStart = null; const captured = pointerId; pointerId = null; if (captured !== null && canvas.value?.hasPointerCapture?.(captured)) canvas.value.releasePointerCapture(captured); }
function beforeUnload(event) { if (dirty.value) { event.preventDefault(); event.returnValue = ''; } }
onBeforeRouteLeave(() => !dirty.value || window.confirm('小镇地图有未保存修改，确定离开？请先保存或导出以免丢失。'));
watch([zoom, () => map.value.width, () => map.value.height], centerCamera);
watch(currentScene, () => { resetBrushes(); loadAtlas(); centerCamera(); });
watch(() => props.active, (active) => { clearInteraction(); if (active) void nextTick(resize); });

onMounted(() => {
  if (window.innerWidth <= 680) zoom.value = 1;
  try { switchScene(preferredScene(localStorage, props.initialScene), false); }
  catch { fail('未能读取本地存档，已载入初始地图。原存档未被覆盖，可重新导入 JSON 或保存修复。'); }
  resetBrushes(); loadAtlas();
  observer = typeof ResizeObserver !== 'undefined' ? new ResizeObserver(resize) : null; observer?.observe(viewport.value); resize(); window.addEventListener('resize', resize); window.addEventListener('beforeunload', beforeUnload); document.addEventListener('fullscreenchange', fullscreenChanged);
  const render = (now) => {
    if (props.active && now - lastFrame > 40) {
      lastFrame = now;
      if (route.value.length && now - lastMove > 140 && !editing.value && !dialogue.value) { const next = route.value.shift(); if (!move(next.x - player.x, next.y - player.y, true)) { route.value = []; pendingInteraction = null; } lastMove = now; if (!route.value.length && pendingInteraction) interact(pendingInteraction); }
      if (ctx) drawTown(ctx, { map: map.value, atlas, ...dimensions, scale: scale.value, camera, player, editing: editing.value, grid: showGrid.value, collision: showCollision.value || tool.value === 'collision', hover: hover.value, selectedEvent: eventDraft.value?.id, route: route.value, tick: Math.floor(now / 500) });
    }
    frame = requestAnimationFrame(render);
  }; frame = requestAnimationFrame(render);
});
onBeforeUnmount(() => { cancelAnimationFrame(frame); observer?.disconnect(); window.removeEventListener('resize', resize); window.removeEventListener('beforeunload', beforeUnload); document.removeEventListener('fullscreenchange', fullscreenChanged); });
</script>

<style scoped>
.town-studio { min-width: 0; color: var(--ai-hub-ink, var(--theme-text-primary)); }
.town-studio button, .town-studio select, .town-studio input:not([type='checkbox']), .town-studio textarea, .import-button { font: inherit; color: inherit; border: 1px solid var(--ai-hub-border, var(--theme-border)); background: var(--ai-hub-input-surface, var(--theme-surface-soft)); border-radius: 8px; }
.town-studio button, .import-button { padding: 8px 12px; cursor: pointer; min-height: 36px; }
.town-studio button:hover, .import-button:hover { background: var(--ai-hub-surface-hover, var(--theme-floating-surface-hover)); }
.town-studio button:disabled { opacity: .45; cursor: default; }
.town-studio button:focus-visible, .town-studio input:focus-visible, .town-studio textarea:focus-visible, .town-studio select:focus-visible, .import-button:focus-within { outline: 2px solid var(--theme-accent, #bd9b5d) !important; outline-offset: 3px; }
.town-studio .primary, .town-studio .selected { background: var(--theme-accent, #7d6540); color: var(--theme-on-accent, #fff); border-color: transparent; }
.town-studio .primary:hover, .town-studio .selected:hover { background: var(--theme-accent, #7d6540); color: var(--theme-on-accent, #fff); filter: brightness(1.08); }
.town-toolbar, .town-actions, .edit-toolbar, .editor-footer > div, .town-credit { display: flex; align-items: center; gap: 8px; flex-wrap: wrap; }
.town-toolbar { justify-content: space-between; padding-bottom: 16px; gap: 12px; }
.town-title { display: flex; gap: 12px; align-items: center; }
.town-title > i { font-size: 26px; color: var(--theme-accent); }
.town-title h2 { margin: 0 0 4px; font-size: 22px; line-height: 1.25; }
.town-title span, .save-state, .play-guide p, .play-guide small, .editor-footer, .tile-inspector p, .tile-inspector small, .town-credit { color: var(--ai-hub-ink-muted, var(--theme-text-secondary)); font-size: 12px; }
.scene-picker { display: flex; flex-wrap: wrap; justify-content: space-between; gap: 8px 16px; align-items: center; padding-bottom: 14px; font-size: 12px; }
.scene-picker label { display: flex; flex-wrap: wrap; align-items: center; gap: 8px; min-width: 0; max-width: 100%; }
.scene-picker select { min-width: 0; max-width: 100%; padding: 7px; }
.scene-picker > span { color: var(--ai-hub-ink-muted, var(--theme-text-secondary)); }
.scene-confirm { display: flex; align-items: center; flex-wrap: wrap; gap: 8px; padding: 12px; margin-bottom: 12px; background: var(--ai-hub-surface-soft); border-radius: 8px; font-size: 12px; }
.scene-confirm > span { flex-basis: 100%; }
.palette-pagination { display: flex; align-items: center; justify-content: space-between; gap: 8px; font-size: 12px; }
.town-credit > span { min-width: 0; overflow-wrap: anywhere; }
.save-state.dirty { color: var(--theme-accent); }
.edit-toolbar { padding: 10px 0 14px; border-top: 1px solid var(--ai-hub-border); }
.edit-toolbar button { padding-inline: 10px; }
.tool-divider { width: 1px; height: 20px; background: var(--ai-hub-border); }
.compact-check { display: flex; align-items: center; gap: 5px; font-size: 12px; cursor: pointer; }
.town-workspace { min-width: 0; }
.town-workspace.editing { display: grid; grid-template-columns: minmax(0, 1fr) 220px; gap: 16px; }
.map-column { min-width: 0; }
.town-viewport { position: relative; height: clamp(390px, 57vh, 640px); overflow: hidden; border-radius: 12px; background: #344c42; isolation: isolate; }
.town-viewport:fullscreen { width: 100vw; height: 100vh; border-radius: 0; }
.town-canvas { display: block; width: 100%; height: 100%; image-rendering: pixelated; cursor: pointer; outline-offset: -4px; touch-action: none; }
.town-canvas:focus-visible { outline: 3px solid #fff2b0 !important; }
.is-editing .town-canvas { cursor: crosshair; }
.is-panning .town-canvas { cursor: grab; }
.map-hud { position: absolute; top: 12px; left: 12px; right: 12px; display: flex; justify-content: space-between; gap: 8px; pointer-events: none; color: #fff4d5; font-size: 12px; }
.map-hud span { padding: 7px 10px; background: #304339eb; border-radius: 6px; }
.map-view-controls { position: absolute; bottom: 12px; right: 12px; display: flex; gap: 6px; }
.map-view-controls button, .map-view-controls select { background: #304339; color: #fff4d5; border-color: #6b7e6c; padding: 7px 9px; }
.town-dialogue { position: absolute; left: 16px; right: 16px; bottom: 60px; padding: 18px 20px; color: #fff0cb; background: #343b33f5; border: 2px solid #ad9873; border-radius: 8px; box-shadow: 0 6px 20px #1c2c2540; max-height: 75%; overflow: auto; }
.town-dialogue > div { display: flex; justify-content: space-between; align-items: center; gap: 12px; }
.town-dialogue strong { color: #f2cf8c; font-size: 16px; }
.town-dialogue p { white-space: pre-line; line-height: 1.8; margin: 8px 0 14px; font-size: 14px; }
.town-dialogue button { background: #4c5848; color: #fff0cb; border-color: #899078; }
.town-dialogue > div button { min-height: 28px; padding: 0 8px; font-size: 23px; }
.town-studio .interact-hint { position: absolute; left: 50%; bottom: 16px; transform: translateX(-50%); background: #fff0cb; color: #374535; border-color: #ad9873; max-width: 65%; }
.asset-warning { position: absolute; left: 12px; top: 55px; background: #fff0cb; color: #63462f; padding: 8px; font-size: 12px; }
.play-footer { display: flex; justify-content: space-between; gap: 20px; padding: 18px 0 8px; }
.play-guide { min-width: 0; }
.play-guide > strong { font-size: 14px; }
.play-guide p { line-height: 1.7; margin: 6px 0; }
.play-guide small { display: block; line-height: 1.6; }
.quest-list { display: flex; flex-wrap: wrap; gap: 6px 16px; margin: 10px 0; font-size: 12px; color: var(--ai-hub-ink-muted); }
.quest-list button { min-height: 30px; font-size: 12px; padding: 4px 8px; }
.quest-list .done { color: var(--theme-accent); }
.touch-controls { flex-shrink: 0; display: grid; grid-template-columns: repeat(3, 38px) 50px; grid-template-rows: repeat(2, 38px); gap: 4px; align-self: center; }
.touch-controls button { padding: 0; font-size: 19px; }
.touch-controls .up { grid-column: 2; }.touch-controls .left { grid-column: 1; grid-row: 2; }.touch-controls .down { grid-column: 2; grid-row: 2; }.touch-controls .right { grid-column: 3; grid-row: 2; }.touch-controls .action { grid-column: 4; grid-row: 1 / 3; font-size: 13px; }
.tile-inspector { min-width: 0; display: flex; flex-direction: column; gap: 12px; max-height: 680px; overflow: auto; padding: 0 4px 8px 0; }
.tile-inspector h3 { font-size: 14px; margin: 8px 0 0; }.tile-inspector p { line-height: 1.7; margin: 0; }
.field-label { display: flex; flex-direction: column; gap: 6px; font-size: 12px; }
.field-label input, .field-label select, .field-label textarea { width: 100%; padding: 8px; box-sizing: border-box; min-width: 0; }.field-label textarea { resize: vertical; }
.tile-palette { display: grid; grid-template-columns: repeat(3, minmax(0, 1fr)); gap: 6px; }.tile-palette.objects { grid-template-columns: repeat(4, minmax(0, 1fr)); }
.tile-palette button { display: flex; flex-direction: column; align-items: center; gap: 4px; padding: 5px 2px; }.tile-palette span { display: block; width: 32px; height: 32px; image-rendering: pixelated; text-align: center; font-size: 26px; line-height: 32px; }.tile-palette small { font-size: 10px; color: inherit; }
.editor-help { font-size: 12px; border-top: 1px solid var(--ai-hub-border); padding-top: 12px; margin-top: 12px; }.editor-help summary { cursor: pointer; }.editor-help p { margin-top: 8px; }
.editor-footer { display: grid; gap: 10px; padding: 12px 0; line-height: 1.6; }.editor-footer button, .import-button { font-size: 12px; }.import-button { position: relative; display: inline-flex; align-items: center; box-sizing: border-box; }.import-button input { position: absolute; inset: 0; opacity: 0; width: 100%; cursor: pointer; }
.reset-confirm { padding: 12px; background: var(--ai-hub-surface-soft); border-radius: 8px; }.event-coordinate { font-size: 12px; }
.town-feedback { padding: 10px 12px; font-size: 13px; line-height: 1.6; background: var(--ai-hub-surface-soft); border-radius: 8px; }.town-feedback.error { color: var(--theme-danger, #bd4e55); }
.town-credit { justify-content: space-between; font-size: 10px; padding-top: 12px; gap: 6px; }.town-credit a { color: inherit; text-underline-offset: 3px; }.sr-only { position: absolute; width: 1px; height: 1px; padding: 0; overflow: hidden; clip: rect(0, 0, 0, 0); white-space: nowrap; }
@media (max-width: 1000px) { .town-workspace.editing { grid-template-columns: minmax(0, 1fr) 184px; }.tile-palette.objects { grid-template-columns: repeat(3, minmax(0, 1fr)); } }
@media (max-width: 680px) { .town-toolbar { align-items: flex-start; }.town-title h2 { font-size: 20px; }.save-state { display: none; }.town-workspace.editing { grid-template-columns: minmax(0, 1fr); }.tile-inspector { max-height: 380px; padding-top: 12px; border-top: 1px solid var(--ai-hub-border); }.tile-palette { grid-template-columns: repeat(4, minmax(0, 1fr)); }.tile-palette.objects { grid-template-columns: repeat(6, minmax(0, 1fr)); }.town-viewport { height: 430px; }.play-footer { flex-direction: column; gap: 10px; }.touch-controls { align-self: flex-end; }.town-dialogue { left: 8px; right: 8px; padding: 12px; }.map-hud { left: 8px; right: 8px; font-size: 10px; }.town-title span { font-size: 11px; }.town-credit { align-items: flex-start; }.town-actions button { font-size: 12px; padding-inline: 9px; } }
@media (max-width: 680px) { .town-studio .interact-hint { bottom: 60px; max-width: calc(100% - 16px); font-size: 12px; }.map-view-controls { left: 8px; right: 8px; bottom: 8px; justify-content: flex-end; }.map-view-controls button, .map-view-controls select { font-size: 11px; padding: 7px; }.town-title { gap: 6px; }.town-title > i { font-size: 21px; }.town-title h2 { font-size: 18px; } }
@media (prefers-reduced-motion: reduce) { .town-studio * { scroll-behavior: auto; } }
</style>
