<template>
  <section class="recycle-bin" data-studio-workspace="recycle-bin">
    <header class="recycle-bin__hero">
      <div>
        <p>Content Safety · Recycle Bin</p>
        <h2>统一回收站</h2>
        <span>恢复只回到非发布状态；这里没有自动永久清理。</span>
      </div>
      <button class="recycle-button recycle-button--ghost" type="button" :disabled="busy || loading" @click="refreshWorkspace">
        <i class="fas fa-rotate"></i> 显式刷新
      </button>
    </header>

    <p v-if="errorMessage" class="recycle-alert recycle-alert--error" role="alert">{{ errorMessage }}</p>
    <p v-if="notice" class="recycle-alert" role="status">{{ notice }}</p>

    <div class="recycle-bin__layout">
      <aside class="recycle-panel recycle-index" aria-label="已回收内容">
        <header><div><small>RECYCLED</small><h3>待人工处理</h3></div><strong>{{ entries.length }}</strong></header>
        <button
          v-for="entry in entries"
          :key="`${entry.kind}-${entry.id}`"
          class="recycle-index__item"
          :class="{ 'recycle-index__item--active': selected?.kind === entry.kind && selected?.id === entry.id }"
          type="button"
          :disabled="busy"
          @click="selectEntry(entry)"
        >
          <i :class="recycleKindMeta(entry.kind).icon"></i>
          <span><small>{{ recycleKindMeta(entry.kind).label }} · #{{ entry.id }}</small><strong>{{ entry.title }}</strong><em>{{ recycleBinStatus(entry) }}</em></span>
        </button>
        <p v-if="!loading && !entries.length" class="empty-copy">回收站目前为空。系统不会在此自动删除任何内容。</p>
      </aside>

      <main class="recycle-panel recycle-inspector">
        <div v-if="!selected" class="recycle-inspector__empty">
          <i class="fas fa-recycle"></i><h3>选择一个回收项</h3><p>先审阅状态与保留期，再决定安全恢复或请求永久清理预检。</p>
        </div>
        <template v-else>
          <header class="recycle-inspector__heading">
            <div><small>{{ recycleKindMeta(selected.kind).label.toUpperCase() }} · RECYCLED</small><h3>{{ selected.title }}</h3><p>{{ recycleBinStatus(activeRecord) }}</p></div>
            <button class="recycle-button recycle-button--restore" type="button" :disabled="busy || !activeRecord.etag" @click="restoreSelected">
              <i class="fas fa-arrow-rotate-left"></i> 安全恢复
            </button>
          </header>
          <section class="recycle-inspector__detail">
            <div><small>回收时间</small><strong>{{ displayTime(activeRecord.recycledAt) }}</strong></div>
            <div><small>服务端到期</small><strong>{{ displayTime(activeRecord.purgeAfter) }}</strong></div>
            <div><small>并发版本</small><strong>v{{ activeRecord.version }} · {{ activeRecord.etag || '照片使用版本请求体' }}</strong></div>
          </section>
          <p class="restore-note"><i class="fas fa-shield-heart"></i> 恢复绝不自动发布。相册和动态恢复后仍需要你在各自工作台手动审核、保存并发布。</p>
          <section class="recycle-summary">
            <small>内容摘要</small>
            <p v-if="selected.kind === RecycleBinKind.MOMENT">{{ activeRecord.body || selected.title }}</p>
            <p v-else-if="selected.kind === RecycleBinKind.ALBUM">{{ activeRecord.summary || '该相册未填写摘要。' }}</p>
            <p v-else>{{ activeRecord.altText || activeRecord.title || '该照片未填写替代文本。' }}</p>
          </section>
        </template>
      </main>

      <aside class="recycle-panel purge-panel">
        <header><div><small>IRREVERSIBLE</small><h3>永久清理</h3></div><i class="fas fa-triangle-exclamation"></i></header>
        <p class="purge-panel__intro">每次都必须先在服务端进行 dry-run。它不会执行删除，只会检查阻断项并按条件签发一次性 capability。</p>
        <button class="recycle-button recycle-button--danger" type="button" :disabled="busy || !selected" @click="runDryRun">
          <i class="fas fa-list-check"></i> 执行 dry-run
        </button>

        <template v-if="dryRun">
          <div class="purge-result" :class="{ 'purge-result--blocked': !dryRun.eligible || dryRun.blockers?.length }">
            <strong>{{ dryRun.eligible ? '服务端预检通过' : '服务端预检阻断' }}</strong>
            <small v-if="dryRun.purgeAfter">可清理时间：{{ displayTime(dryRun.purgeAfter) }}</small>
            <small v-if="dryRun.derivativeCount">关联派生资源：{{ dryRun.derivativeCount }}</small>
          </div>
          <ul v-if="dryRun.blockers?.length" class="purge-blockers" aria-label="永久清理阻断项">
            <li v-for="blocker in dryRun.blockers" :key="`${blocker.code}-${blocker.count}`"><strong>{{ blocker.code }}</strong><span>{{ blocker.message || '服务端阻断' }}{{ blocker.count ? ` · ${blocker.count}` : '' }}</span></li>
          </ul>
          <template v-if="dryRun.eligible">
            <p class="capability-status" :class="{ 'capability-status--expired': !capabilityActive }">
              <i class="fas fa-key"></i>{{ capabilityActive ? `一次性 capability 有效至 ${displayTime(dryRun.capabilityExpiresAt)}` : '一次性 capability 已过期；请重新执行 dry-run。' }}
            </p>
            <label>输入服务端确认短语
              <code>{{ dryRun.confirmationPhrase }}</code>
              <input v-model="confirmation" autocomplete="off" :disabled="busy || !capabilityActive" :placeholder="dryRun.confirmationPhrase" />
            </label>
            <button class="recycle-button recycle-button--danger" type="button" :disabled="busy || !purgeAllowed" @click="purgeSelected">
              <i class="fas fa-trash-can"></i> 永久清理（不可恢复）
            </button>
          </template>
        </template>
        <p v-else class="purge-panel__quiet">不会自动执行清理，也不会保留 capability 到刷新或切换其他项目之后。</p>
      </aside>
    </div>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import {
  dryRunAdminAlbumPurge, dryRunAdminManagedPhotoPurge, dryRunAdminMomentPurge,
  getAdminAlbum, getAdminManagedPhoto, getAdminMoment, listAdminAlbums, listAdminManagedPhotos, listAdminMoments,
  purgeAdminAlbum, purgeAdminManagedPhoto, purgeAdminMoment,
  restoreAdminAlbum, restoreAdminManagedPhoto, restoreAdminMoment
} from '../../services/adminLifeContentApi';
import { buildRecycleBinEntries, canConfirmPurge, hydrateRecycleBinEntry, isCapabilityActive, recycleBinStatus, recycleKindMeta, RecycleBinKind } from './adminRecycleBinState';

const auth = useAuthSession();
const entries = ref([]);
const selected = ref(null);
const selectedDetail = ref(null);
const dryRun = ref(null);
const confirmation = ref('');
const loading = ref(false);
const busy = ref(false);
const notice = ref('');
const errorMessage = ref('');
const clock = ref(Date.now());
let clockTimer;

const activeRecord = computed(() => ({ ...(selected.value || {}), ...(selectedDetail.value || {}) }));
const capabilityActive = computed(() => isCapabilityActive(dryRun.value, clock.value));
const purgeAllowed = computed(() => canConfirmPurge(dryRun.value, confirmation.value, clock.value));

function messageOf(error) { return String(error?.detail || error?.message || '操作失败，请稍后重试'); }
function feedback(message = '', error = '') { notice.value = message; errorMessage.value = error; }
function displayTime(value) { return value ? String(value).replace('T', ' ') : '服务端未提供'; }
function discardPurgeAuthorization() { dryRun.value = null; confirmation.value = ''; }

async function refreshWorkspace() {
  loading.value = true; feedback(); discardPurgeAuthorization(); selected.value = null; selectedDetail.value = null;
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) { errorMessage.value = '需要管理员登录后才能读取统一回收站。'; loading.value = false; return; }
  try {
    const [albums, moments, photos] = await Promise.all([
      listAdminAlbums({ includeRecycled: true, limit: 100 }, auth.authorizedFetch),
      listAdminMoments({ includeRecycled: true, limit: 100 }, auth.authorizedFetch),
      listAdminManagedPhotos({ includeRecycled: true, limit: 200 }, auth.authorizedFetch)
    ]);
    entries.value = buildRecycleBinEntries({ albums, moments, photos });
  } catch (error) { errorMessage.value = messageOf(error); } finally { loading.value = false; }
}

async function selectEntry(entry) {
  if (selected.value?.kind === entry.kind && selected.value?.id === entry.id) return;
  busy.value = true; feedback(); discardPurgeAuthorization(); selected.value = entry; selectedDetail.value = null;
  try {
    let detail;
    if (entry.kind === RecycleBinKind.ALBUM) detail = await getAdminAlbum(entry.id, auth.authorizedFetch);
    else if (entry.kind === RecycleBinKind.MOMENT) detail = await getAdminMoment(entry.id, auth.authorizedFetch);
    else detail = await getAdminManagedPhoto(entry.id, auth.authorizedFetch);
    if (!detail) throw new Error('所选回收项已不存在或不再可读取');
    selectedDetail.value = hydrateRecycleBinEntry(entry, detail);
  } catch (error) { errorMessage.value = messageOf(error); } finally { busy.value = false; }
}

async function restoreSelected() {
  if (!selected.value) return;
  busy.value = true; feedback();
  try {
    const record = activeRecord.value;
    if (selected.value.kind === RecycleBinKind.ALBUM) await restoreAdminAlbum(selected.value.id, record.etag, auth.authorizedFetch);
    else if (selected.value.kind === RecycleBinKind.MOMENT) await restoreAdminMoment(selected.value.id, record.etag, auth.authorizedFetch);
    else await restoreAdminManagedPhoto(selected.value.id, record.version, auth.authorizedFetch);
    await refreshWorkspace();
    notice.value = '已安全恢复并显式刷新回收站；内容没有被自动发布。';
  } catch (error) { errorMessage.value = messageOf(error); } finally { busy.value = false; }
}

async function runDryRun() {
  if (!selected.value) return;
  busy.value = true; feedback(); discardPurgeAuthorization();
  try {
    const record = activeRecord.value;
    if (selected.value.kind === RecycleBinKind.ALBUM) dryRun.value = await dryRunAdminAlbumPurge(selected.value.id, record.version, auth.authorizedFetch);
    else if (selected.value.kind === RecycleBinKind.MOMENT) dryRun.value = await dryRunAdminMomentPurge(selected.value.id, record.version, auth.authorizedFetch);
    else dryRun.value = await dryRunAdminManagedPhotoPurge(selected.value.id, record.version, auth.authorizedFetch);
  } catch (error) { errorMessage.value = messageOf(error); } finally { busy.value = false; }
}

async function purgeSelected() {
  if (!selected.value || !purgeAllowed.value) return;
  busy.value = true; feedback();
  try {
    const record = activeRecord.value;
    if (selected.value.kind === RecycleBinKind.ALBUM) await purgeAdminAlbum(selected.value.id, record.version, dryRun.value.capability, confirmation.value, auth.authorizedFetch);
    else if (selected.value.kind === RecycleBinKind.MOMENT) await purgeAdminMoment(selected.value.id, record.version, dryRun.value.capability, confirmation.value, auth.authorizedFetch);
    else await purgeAdminManagedPhoto(selected.value.id, record.version, dryRun.value.capability, confirmation.value, auth.authorizedFetch);
    await refreshWorkspace();
    notice.value = '永久清理已由服务端完成，并已显式刷新回收站。';
  } catch (error) { errorMessage.value = messageOf(error); discardPurgeAuthorization(); } finally { busy.value = false; }
}

onMounted(() => { refreshWorkspace(); clockTimer = window.setInterval(() => { clock.value = Date.now(); }, 1000); });
onBeforeUnmount(() => { window.clearInterval(clockTimer); });
</script>

<style scoped>
.recycle-bin { display:grid; gap:18px; min-height:620px; padding:clamp(16px,2.5vw,28px); color:var(--theme-text-primary); }
.recycle-bin__hero,.recycle-panel>header,.recycle-inspector__heading { display:flex; align-items:center; justify-content:space-between; gap:12px; }
.recycle-bin__hero p,.recycle-panel small,.recycle-inspector__heading p { margin:0 0 4px; color:var(--theme-text-tertiary,var(--theme-text-secondary)); font-size:10px; font-weight:800; letter-spacing:.14em; }
.recycle-bin__hero h2,.recycle-panel h3,.recycle-inspector__heading h3 { margin:0; }.recycle-bin__hero span,.purge-panel__intro,.purge-panel__quiet,.empty-copy,.restore-note,.recycle-summary p { color:var(--theme-text-secondary); font-size:12px; }.recycle-button { min-height:36px; padding:8px 13px; border:1px solid rgba(var(--accent-rgb),.32); border-radius:12px; color:var(--theme-text-primary); background:rgba(var(--accent-rgb),.16); font:inherit; cursor:pointer; }.recycle-button--ghost { background:var(--theme-panel-surface-elevated,rgba(255,255,255,.05)); border-color:var(--theme-border,rgba(255,255,255,.14)); }.recycle-button--restore { border-color:rgba(52,211,153,.3); background:rgba(52,211,153,.11); }.recycle-button--danger { border-color:rgba(248,113,113,.34); background:rgba(248,113,113,.12); }.recycle-button:disabled { cursor:not-allowed; opacity:.45; }
.recycle-alert { margin:0; padding:11px 14px; border:1px solid rgba(52,211,153,.25); border-radius:12px; background:rgba(52,211,153,.1); font-size:12px; }.recycle-alert--error { border-color:rgba(248,113,113,.3); background:rgba(248,113,113,.1); }.recycle-bin__layout { display:grid; grid-template-columns:minmax(210px,270px) minmax(0,1fr) minmax(240px,310px); gap:16px; align-items:start; }.recycle-panel { border:1px solid var(--theme-border,rgba(255,255,255,.14)); border-radius:18px; background:linear-gradient(145deg,rgba(var(--accent-rgb),.07),transparent 45%),var(--theme-panel-surface,rgba(12,18,28,.78)); box-shadow:0 18px 46px rgba(0,0,0,.12); backdrop-filter:blur(18px) saturate(135%); }.recycle-index,.purge-panel { display:grid; gap:9px; padding:14px; }.recycle-index { position:sticky; top:16px; max-height:calc(100vh - 140px); overflow:auto; }.recycle-index>header strong { padding:4px 8px; border-radius:999px; background:rgba(var(--accent-rgb),.1); font-size:10px; }.recycle-index__item { display:grid; grid-template-columns:auto minmax(0,1fr); gap:9px; padding:11px; border:1px solid transparent; border-radius:13px; color:var(--theme-text-primary); background:transparent; text-align:left; cursor:pointer; }.recycle-index__item:hover,.recycle-index__item--active { border-color:rgba(var(--accent-rgb),.3); background:rgba(var(--accent-rgb),.1); transform:translateY(-1px); }.recycle-index__item>i { padding-top:3px; color:rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); }.recycle-index__item span { display:grid; gap:4px; min-width:0; }.recycle-index__item strong { overflow:hidden; text-overflow:ellipsis; white-space:nowrap; }.recycle-index__item small,.recycle-index__item em { color:var(--theme-text-secondary); font-size:10px; font-style:normal; }.recycle-inspector { min-height:460px; padding:clamp(16px,2vw,24px); }.recycle-inspector__empty { min-height:410px; display:grid; place-content:center; justify-items:center; text-align:center; }.recycle-inspector__empty i { color:rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); font-size:42px; }.recycle-inspector__detail { display:grid; grid-template-columns:repeat(3,minmax(0,1fr)); gap:9px; padding:18px 0; }.recycle-inspector__detail div,.recycle-summary { display:grid; gap:6px; padding:12px; border:1px solid var(--theme-border,rgba(255,255,255,.1)); border-radius:12px; background:var(--theme-panel-surface-elevated,rgba(255,255,255,.04)); }.recycle-inspector__detail strong { overflow-wrap:anywhere; font-size:12px; }.restore-note { padding:12px; border:1px solid rgba(52,211,153,.25); border-radius:12px; background:rgba(52,211,153,.08); line-height:1.55; }.recycle-summary { margin-top:14px; }.recycle-summary p { margin:0; white-space:pre-wrap; line-height:1.65; }.purge-panel>header>i { color:#fbbf24; font-size:22px; }.purge-panel__intro,.purge-panel__quiet { margin:0; line-height:1.6; }.purge-result,.capability-status { display:grid; gap:4px; padding:11px; border:1px solid rgba(52,211,153,.25); border-radius:12px; background:rgba(52,211,153,.08); font-size:11px; }.purge-result--blocked,.capability-status--expired { border-color:rgba(248,113,113,.3); background:rgba(248,113,113,.09); }.purge-blockers { display:grid; gap:7px; margin:0; padding:0; list-style:none; }.purge-blockers li { display:grid; gap:3px; padding:9px; border-radius:10px; background:rgba(248,113,113,.08); font-size:11px; }.purge-blockers span { color:var(--theme-text-secondary); }.purge-panel label { display:grid; gap:7px; color:var(--theme-text-secondary); font-size:11px; }.purge-panel code { padding:7px; border-radius:8px; color:#fcd34d; background:rgba(0,0,0,.18); font-size:11px; overflow-wrap:anywhere; }.purge-panel input { width:100%; box-sizing:border-box; border:1px solid var(--theme-border,rgba(255,255,255,.14)); border-radius:10px; padding:9px 10px; color:var(--theme-text-primary); background:var(--theme-input-surface,rgba(0,0,0,.13)); font:inherit; }
@media (prefers-reduced-motion:reduce) { .recycle-index__item { transition:none; } } @media (max-width:1040px) { .recycle-bin__layout { grid-template-columns:minmax(200px,260px) minmax(0,1fr); }.purge-panel { grid-column:1 / -1; }.purge-panel>header { max-width:620px; } } @media (max-width:720px) { .recycle-bin__layout { grid-template-columns:1fr; }.recycle-index { position:static; max-height:260px; }.recycle-inspector__detail { grid-template-columns:1fr; }.recycle-bin__hero,.recycle-inspector__heading { align-items:flex-start; flex-direction:column; } }
</style>
