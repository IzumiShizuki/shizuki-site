<template>
  <section class="moment-studio" data-studio-workspace="moments">
    <header class="moment-studio__hero">
      <div><p>Content Studio · Moments</p><h2>动态工作台</h2><span>正文、照片编排与访客交付保持同一版本边界</span></div>
      <div class="hero-actions">
        <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="loadWorkspace"><i class="fas fa-rotate"></i> 刷新</button>
        <button class="studio-button" type="button" @click="creating = !creating"><i class="fas fa-plus"></i> 新建动态</button>
      </div>
    </header>

    <p v-if="errorMessage" class="studio-alert studio-alert--error" role="alert">{{ errorMessage }}</p>
    <p v-if="notice" class="studio-alert" role="status">{{ notice }}</p>

    <form v-if="creating" class="create-moment glass-panel" @submit.prevent="createMoment">
      <label>正文<textarea v-model.trim="newMoment.body" rows="4" maxlength="20000" required placeholder="写下一段此刻的生活…"></textarea></label>
      <div class="create-moment__row">
        <label>可见性<select v-model="newMoment.visibility"><option value="PRIVATE">私密</option><option value="UNLISTED">不公开列出</option><option value="PUBLIC">公开</option></select></label>
        <button class="studio-button" type="submit" :disabled="busy || !newMoment.body">创建草稿</button>
      </div>
    </form>

    <div class="moment-studio__layout">
      <aside class="moment-index glass-panel" aria-label="动态列表">
        <div class="panel-heading"><div><small>STREAM</small><h3>动态</h3></div><span>{{ moments.length }}</span></div>
        <button v-for="moment in moments" :key="moment.id" type="button" class="moment-index__item" :class="{ 'moment-index__item--active': detail?.id === moment.id }" @click="selectMoment(moment.id)">
          <span class="moment-index__flags"><i v-if="moment.pinned" class="fas fa-thumbtack" title="置顶"></i><i v-if="moment.featured" class="fas fa-star" title="精选"></i>{{ lifecycleLabel(moment.lifecycle) }}</span>
          <strong>{{ moment.excerpt || '（无正文）' }}</strong>
          <small>{{ visibilityLabel(moment.visibility) }} · {{ moment.photoCount }} 张照片</small>
        </button>
        <p v-if="!loading && !moments.length" class="empty-copy">暂无动态。这里不会用虚构内容填充空白。</p>
      </aside>

      <main class="moment-editor glass-panel">
        <div v-if="!detail" class="moment-editor__empty">
          <i class="fas fa-camera-retro"></i>
          <h3>选择一条动态开始编辑</h3>
          <p>动态可以只包含正文，也可以复用受管照片库中的安全派生。</p>
          <button v-if="!moments.length" class="studio-button" type="button" @click="creating = true">
            <i class="fas fa-plus" aria-hidden="true"></i> 写下第一条动态草稿
          </button>
        </div>
        <template v-else>
          <header class="editor-heading">
            <div><p>{{ lifecycleLabel(detail.lifecycle) }} · {{ detail.etag }}</p><h3>{{ detail.body.slice(0, 42) }}{{ detail.body.length > 42 ? '…' : '' }}</h3></div>
            <div class="hero-actions">
              <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="openPreview">预览</button>
              <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="saveMoment">保存</button>
              <button v-if="detail.lifecycle === 'PUBLISHED'" class="studio-button studio-button--warn" type="button" :disabled="busy" @click="archiveMoment">撤回并归档</button>
              <button v-else class="studio-button" type="button" :disabled="busy || !publishReadiness.ready" @click="publishMoment">发布</button>
            </div>
          </header>

          <section class="editor-section moment-copy-editor">
            <label>正文<textarea v-model="momentForm.body" rows="8" maxlength="20000"></textarea><span>{{ momentForm.body.length }} / 20000</span></label>
            <div class="moment-options">
              <label>可见性<select v-model="momentForm.visibility"><option value="PRIVATE">私密</option><option value="UNLISTED">不公开列出</option><option value="PUBLIC">公开</option></select></label>
              <label class="field-check"><input v-model="momentForm.featured" type="checkbox" /> 作为精选动态</label>
              <label class="field-check"><input v-model="momentForm.pinned" type="checkbox" /> 在动态流置顶</label>
            </div>
          </section>

          <section v-if="!publishReadiness.ready" class="publish-gate"><strong><i class="fas fa-shield-halved"></i> 发布门槛</strong><span v-for="item in publishReadiness.blockers" :key="item">{{ item }}</span></section>

          <section class="editor-section">
            <div class="section-heading"><div><small>01 · REUSE</small><h4>复用照片库</h4></div><button class="text-button" type="button" @click="loadPhotoLibrary">刷新照片库</button></div>
            <div class="photo-library">
              <label v-for="photo in libraryPhotos" :key="photo.id" class="library-photo" :class="{ 'library-photo--selected': selectedIds.has(photo.id) }">
                <input type="checkbox" :checked="selectedIds.has(photo.id)" :disabled="attachedIds.has(photo.id)" @change="togglePhoto(photo.id)" />
                <span><strong>{{ photo.title || `照片 #${photo.id}` }}</strong><small>{{ photo.altText || '尚未填写替代文本' }}</small></span>
                <em :data-tone="processingTone(photo.processingStatus)">{{ photo.processingStatus }}</em>
              </label>
              <p v-if="!libraryPhotos.length" class="empty-copy">照片库为空，可先前往相册工作台上传并完成元数据审核。</p>
            </div>
            <button class="studio-button studio-button--ghost" type="button" :disabled="busy || !selectedIds.size" @click="attachSelected">复用所选照片</button>
          </section>

          <section class="editor-section">
            <div class="section-heading"><div><small>02 · ORDER</small><h4>照片顺序与处理状态</h4></div><span>{{ detail.photos.length }} / 24</span></div>
            <p class="section-copy">拖拽或使用上下移动按钮；服务端只接受包含完整当前照片集合的原子排序。</p>
            <div class="moment-photo-grid">
              <article v-for="(photo, index) in detail.photos" :key="photo.photoId" class="moment-photo" draggable="true" @dragstart="dragIndex = index" @dragover.prevent @drop="dropPhoto(index)">
                <div class="moment-photo__visual"><AdminProtectedMediaImage :route="previewPath(photo, 'THUMB_WEBP')" :alt="photo.altText" /></div>
                <div class="moment-photo__body">
                  <strong>{{ photo.title || `照片 #${photo.photoId}` }}</strong>
                  <small>{{ photo.altText || '尚未填写替代文本' }}</small>
                  <AdminMediaProcessingStatus :status="photo.processingStatus" :variants="photo.derivatives" @retry="retryVariant" />
                  <div class="photo-actions">
                    <button class="text-button" type="button" :disabled="index === 0 || busy" aria-label="上移动态照片" @click="movePhoto(index, -1)"><i class="fas fa-arrow-up"></i></button>
                    <button class="text-button" type="button" :disabled="index === detail.photos.length - 1 || busy" aria-label="下移动态照片" @click="movePhoto(index, 1)"><i class="fas fa-arrow-down"></i></button>
                    <button class="text-button text-button--danger" type="button" :disabled="busy" @click="detachPhoto(photo.photoId)">移除</button>
                  </div>
                </div>
              </article>
              <p v-if="!detail.photos.length" class="empty-copy">这条动态暂未附加照片。</p>
            </div>
          </section>
        </template>
      </main>
    </div>

    <div v-if="preview" class="preview-overlay" role="dialog" aria-modal="true" aria-label="动态预览" @click.self="preview = null">
      <article class="moment-preview glass-panel">
        <header><span><small>PROTECTED PREVIEW</small><strong>{{ visibilityLabel(preview.visibility) }}</strong></span><button class="text-button" type="button" @click="preview = null">关闭</button></header>
        <p>{{ preview.body }}</p>
        <div class="preview-photos"><figure v-for="photo in preview.photos" :key="photo.mediaRef"><AdminProtectedMediaImage :route="previewPath(photo)" :alt="photo.altText" /><figcaption>{{ photo.altText }}</figcaption></figure></div>
      </article>
    </div>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import {
  archiveAdminMoment, attachAdminMomentPhotos, createAdminMoment, detachAdminMomentPhotos,
  getAdminMoment, getAdminMomentPreview, listAdminManagedPhotos, listAdminMoments,
  publishAdminMoment, reorderAdminMomentPhotos, retryAdminMediaDerivative, updateAdminMoment
} from '../../services/adminLifeContentApi';
import AdminMediaProcessingStatus from './AdminMediaProcessingStatus.vue';
import AdminProtectedMediaImage from './AdminProtectedMediaImage.vue';
import { processingTone } from './adminAlbumStudioState';
import { momentEditorForm, momentPreviewPath, momentPublishReadiness, moveMomentPhoto } from './adminMomentStudioState';

const auth = useAuthSession();
const moments = ref([]);
const libraryPhotos = ref([]);
const detail = ref(null);
const preview = ref(null);
const selectedIds = ref(new Set());
const loading = ref(false);
const busy = ref(false);
const creating = ref(false);
const notice = ref('');
const errorMessage = ref('');
const momentForm = reactive(momentEditorForm());
const newMoment = reactive({ body: '', visibility: 'PRIVATE' });
let dragIndex = -1;

const attachedIds = computed(() => new Set((detail.value?.photos || []).map((photo) => photo.photoId)));
const publishReadiness = computed(() => momentPublishReadiness({ ...detail.value, ...momentForm }));

function messageOf(error) { return String(error?.detail || error?.message || '操作失败，请稍后重试'); }
function feedback(message = '', error = '') { notice.value = message; errorMessage.value = error; }
function lifecycleLabel(value) { return ({ DRAFT: '草稿', PUBLISHED: '已发布', ARCHIVED: '已归档', RECYCLED: '回收站' })[value] || value; }
function visibilityLabel(value) { return ({ PRIVATE: '私密', UNLISTED: '不公开列出', PUBLIC: '公开' })[value] || value; }
function previewPath(photo, preferred) { return momentPreviewPath(photo, preferred); }

function applyDetail(value) { detail.value = value; Object.assign(momentForm, momentEditorForm(value)); }
async function loadMomentList() { moments.value = await listAdminMoments({}, auth.authorizedFetch); }
async function loadPhotoLibrary() { libraryPhotos.value = await listAdminManagedPhotos({}, auth.authorizedFetch); }

async function loadWorkspace() {
  loading.value = true; feedback();
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) { errorMessage.value = '需要管理员登录后才能读取动态工作台。'; loading.value = false; return; }
  try {
    await Promise.all([loadMomentList(), loadPhotoLibrary()]);
    if (detail.value?.id) applyDetail(await getAdminMoment(detail.value.id, auth.authorizedFetch));
  } catch (error) { errorMessage.value = messageOf(error); } finally { loading.value = false; }
}

async function selectMoment(id) {
  busy.value = true; feedback();
  try { applyDetail(await getAdminMoment(id, auth.authorizedFetch)); }
  catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

async function createMoment() {
  busy.value = true; feedback();
  try {
    const created = await createAdminMoment(newMoment, auth.authorizedFetch);
    applyDetail(await getAdminMoment(created.id, auth.authorizedFetch));
    Object.assign(newMoment, { body: '', visibility: 'PRIVATE' }); creating.value = false;
    await loadMomentList(); notice.value = '动态草稿已创建。';
  } catch (error) { errorMessage.value = messageOf(error); } finally { busy.value = false; }
}

async function mutate(request, success) {
  if (!detail.value) return;
  busy.value = true; feedback();
  try {
    await request(detail.value.etag);
    applyDetail(await getAdminMoment(detail.value.id, auth.authorizedFetch));
    await loadMomentList(); notice.value = success;
  } catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

function saveMoment() { const payload = { ...momentForm }; return mutate((etag) => updateAdminMoment(detail.value.id, payload, etag, auth.authorizedFetch), '动态内容已保存。'); }
function publishMoment() { return mutate((etag) => publishAdminMoment(detail.value.id, etag, auth.authorizedFetch), '动态已发布。'); }
function archiveMoment() { return mutate((etag) => archiveAdminMoment(detail.value.id, etag, auth.authorizedFetch), '动态已撤回并归档。'); }

async function openPreview() {
  busy.value = true; feedback();
  try { preview.value = await getAdminMomentPreview(detail.value.id, auth.authorizedFetch); }
  catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

function togglePhoto(photoId) {
  const next = new Set(selectedIds.value);
  if (next.has(photoId)) next.delete(photoId); else next.add(photoId);
  selectedIds.value = next;
}

async function attachSelected() {
  const ids = [...selectedIds.value].filter((id) => !attachedIds.value.has(id));
  if (!ids.length) return;
  await mutate((etag) => attachAdminMomentPhotos(detail.value.id, ids, etag, auth.authorizedFetch), `已复用 ${ids.length} 张照片。`);
  selectedIds.value = new Set();
}

function detachPhoto(photoId) { return mutate((etag) => detachAdminMomentPhotos(detail.value.id, [photoId], etag, auth.authorizedFetch), '照片已从动态移除，照片库原件仍保留。'); }

function persistOrder(next) {
  return mutate((etag) => reorderAdminMomentPhotos(detail.value.id, next.map((photo) => photo.photoId), etag, auth.authorizedFetch), '动态照片顺序已保存。');
}
function movePhoto(index, delta) { return persistOrder(moveMomentPhoto(detail.value.photos, index, index + delta)); }
function dropPhoto(index) { if (dragIndex < 0 || dragIndex === index) return; const next = moveMomentPhoto(detail.value.photos, dragIndex, index); dragIndex = -1; persistOrder(next); }

async function retryVariant(variant) {
  if (!variant?.retryRoute || !variant?.etag) return;
  busy.value = true; feedback();
  try { await retryAdminMediaDerivative(variant.retryRoute, variant.etag, auth.authorizedFetch); applyDetail(await getAdminMoment(detail.value.id, auth.authorizedFetch)); notice.value = `${variant.variant} 已重新进入处理队列。`; }
  catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

onMounted(loadWorkspace);
</script>

<style scoped>
.moment-studio { --radius: 18px; display: grid; gap: 18px; min-height: 620px; padding: clamp(16px,2.5vw,28px); color: var(--theme-text-primary); }
.glass-panel { border: 1px solid var(--theme-border, rgba(255,255,255,.14)); border-radius: var(--radius); background: linear-gradient(145deg,rgba(var(--accent-rgb),.07),transparent 45%),var(--theme-panel-surface,rgba(12,18,28,.78)); box-shadow: 0 18px 46px rgba(0,0,0,.12); backdrop-filter: blur(18px) saturate(135%); }
.moment-studio__hero,.editor-heading,.section-heading,.panel-heading,.moment-preview header,.hero-actions,.photo-actions { display: flex; align-items: center; justify-content: space-between; gap: 12px; }
.moment-studio__hero p,.editor-heading p,.section-heading small,.panel-heading small,.moment-preview small { margin: 0 0 4px; color: var(--theme-text-tertiary,var(--theme-text-secondary)); font-size: 10px; font-weight: 800; letter-spacing: .14em; }
.moment-studio__hero h2,.editor-heading h3,.section-heading h4,.panel-heading h3 { margin: 0; }
.moment-studio__hero span,.editor-heading p,.empty-copy,.section-copy { color: var(--theme-text-secondary); font-size: 12px; }
.hero-actions,.photo-actions { justify-content: flex-start; flex-wrap: wrap; }
.studio-button,.text-button { border: 0; cursor: pointer; font: inherit; }
.studio-button { display: inline-flex; align-items: center; justify-content: center; gap: 7px; min-height: 36px; padding: 8px 13px; border: 1px solid rgba(var(--accent-rgb),.32); border-radius: 12px; color: var(--theme-text-primary); background: rgba(var(--accent-rgb),.18); }
.studio-button--ghost { border-color: var(--theme-border,rgba(255,255,255,.14)); background: var(--theme-panel-surface-elevated,rgba(255,255,255,.05)); }
.studio-button--warn { border-color: color-mix(in srgb, var(--theme-warning) 44%, transparent); background: color-mix(in srgb, var(--theme-warning) 14%, transparent); }
.studio-button:disabled,.text-button:disabled { cursor: not-allowed; opacity: .45; }
.text-button { padding: 3px; color: rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); background: transparent; font-size: 12px; }
.text-button--danger { color: var(--theme-danger); }
.studio-alert { margin: 0; padding: 11px 14px; border: 1px solid color-mix(in srgb, var(--theme-positive) 36%, transparent); border-radius: 12px; background: color-mix(in srgb, var(--theme-positive) 12%, transparent); font-size: 12px; }
.studio-alert--error { border-color: color-mix(in srgb, var(--theme-danger) 42%, transparent); background: color-mix(in srgb, var(--theme-danger) 12%, transparent); }
.create-moment { display: grid; gap: 12px; padding: 16px; }
.create-moment__row { display: grid; grid-template-columns: minmax(180px,260px) auto; align-items: end; gap: 10px; }
.create-moment__row .studio-button { justify-self: start; }
.moment-studio__layout { display: grid; grid-template-columns: minmax(210px,270px) minmax(0,1fr); gap: 16px; align-items: start; }
.moment-index { position: sticky; top: 16px; display: grid; gap: 7px; max-height: calc(100vh - 140px); padding: 14px; overflow: auto; }
.panel-heading > span { padding: 4px 8px; border-radius: 999px; background: rgba(var(--accent-rgb),.1); font-size: 10px; }
.moment-index__item { display: grid; gap: 5px; padding: 11px; border: 1px solid transparent; border-radius: 13px; color: var(--theme-text-primary); background: transparent; text-align: left; cursor: pointer; }
.moment-index__item:hover,.moment-index__item--active { border-color: rgba(var(--accent-rgb),.3); background: rgba(var(--accent-rgb),.1); transform: translateY(-1px); }
.moment-index__item strong { display: -webkit-box; overflow: hidden; -webkit-box-orient: vertical; -webkit-line-clamp: 3; line-height: 1.45; }
.moment-index__item small,.moment-index__flags { color: var(--theme-text-secondary); font-size: 10px; }
.moment-index__flags { display: flex; gap: 5px; }
.moment-editor { min-width: 0; padding: clamp(14px,2vw,22px); }
.moment-editor__empty { min-height: 420px; display: grid; place-content: center; justify-items: center; text-align: center; }
.moment-editor__empty i { color: rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); font-size: 42px; }
.editor-heading { padding-bottom: 18px; }
.editor-section { display: grid; gap: 13px; padding: 20px 0; border-top: 1px solid var(--theme-border,rgba(255,255,255,.1)); }
.moment-copy-editor { grid-template-columns: minmax(0,1fr) 210px; }
.moment-options { display: grid; align-content: start; gap: 12px; }
label { display: grid; gap: 6px; color: var(--theme-text-secondary); font-size: 11px; }
input,textarea,select { width: 100%; box-sizing: border-box; border: 1px solid var(--theme-border,rgba(255,255,255,.14)); border-radius: 10px; padding: 9px 10px; color: var(--theme-text-primary); background: var(--theme-input-surface,rgba(0,0,0,.13)); font: inherit; }
textarea { resize: vertical; line-height: 1.65; }
.field-check { display: flex; align-items: center; gap: 7px; }
.field-check input,.library-photo input { width: auto; }
.publish-gate { display: flex; flex-wrap: wrap; gap: 7px; padding: 12px; border: 1px solid color-mix(in srgb, var(--theme-warning) 34%, transparent); border-radius: 12px; background: color-mix(in srgb, var(--theme-warning) 10%, transparent); font-size: 11px; }
.publish-gate strong { width: 100%; }
.publish-gate span { padding: 4px 7px; border-radius: 999px; background: color-mix(in srgb, var(--theme-warning) 12%, transparent); }
.photo-library { display: grid; grid-template-columns: repeat(auto-fill,minmax(210px,1fr)); gap: 8px; max-height: 310px; overflow: auto; }
.library-photo { grid-template-columns: auto minmax(0,1fr) auto; align-items: center; gap: 8px; padding: 10px; border: 1px solid var(--theme-border,rgba(255,255,255,.12)); border-radius: 12px; background: var(--theme-panel-surface-elevated,rgba(255,255,255,.04)); cursor: pointer; }
.library-photo--selected { border-color: rgba(var(--accent-rgb),.42); }
.library-photo span { display: grid; gap: 3px; min-width: 0; }
.library-photo small { overflow: hidden; color: var(--theme-text-secondary); text-overflow: ellipsis; white-space: nowrap; }
.library-photo em { padding: 3px 5px; border-radius: 999px; color: var(--theme-text-secondary); background: rgba(148,163,184,.12); font-size: 8px; font-style: normal; }
.library-photo em[data-tone="ready"] { color: var(--theme-positive); background: color-mix(in srgb, var(--theme-positive) 12%, transparent); }
.library-photo em[data-tone="failed"] { color: var(--theme-danger); background: color-mix(in srgb, var(--theme-danger) 12%, transparent); }
.moment-photo-grid { display: grid; grid-template-columns: repeat(auto-fill,minmax(240px,1fr)); gap: 10px; }
.moment-photo { display: grid; grid-template-rows: 180px auto; overflow: hidden; border: 1px solid var(--theme-border,rgba(255,255,255,.12)); border-radius: 15px; background: var(--theme-panel-surface-elevated,rgba(255,255,255,.04)); transition: transform .2s ease,border-color .2s ease; }
.moment-photo:hover { border-color: rgba(var(--accent-rgb),.3); transform: translateY(-1px); }
.moment-photo__visual { min-height: 180px; }
.moment-photo__body { display: grid; gap: 8px; padding: 11px; }
.moment-photo__body > small { color: var(--theme-text-secondary); }
.preview-overlay { position: fixed; z-index: 10020; inset: 0; display: grid; place-items: center; padding: 24px; background: rgba(4,8,14,.73); backdrop-filter: blur(12px); }
.moment-preview { width: min(780px,100%); max-height: calc(100vh - 48px); padding: clamp(18px,3vw,30px); overflow: auto; }
.moment-preview header span { display: grid; }
.moment-preview > p { white-space: pre-wrap; color: var(--theme-text-primary); font-size: 16px; line-height: 1.85; }
.preview-photos { display: grid; grid-template-columns: repeat(auto-fill,minmax(190px,1fr)); gap: 10px; }
.preview-photos figure { display: grid; grid-template-rows: 180px auto; margin: 0; overflow: hidden; border-radius: 13px; background: rgba(255,255,255,.04); }
.preview-photos figcaption { padding: 8px; color: var(--theme-text-secondary); font-size: 10px; }
@media (prefers-reduced-motion: reduce) { .moment-index__item,.moment-photo { transition: none; } }
@media (max-width: 900px) { .moment-studio__layout { grid-template-columns: 1fr; } .moment-index { position: static; max-height: 260px; } }
@media (max-width: 640px) { .moment-studio__hero,.editor-heading,.section-heading { align-items: flex-start; flex-direction: column; } .moment-copy-editor,.create-moment__row { grid-template-columns: 1fr; } .preview-overlay { padding: 8px; } }
</style>
