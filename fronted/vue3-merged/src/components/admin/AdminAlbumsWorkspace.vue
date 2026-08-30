<template>
  <section class="album-studio" data-studio-workspace="albums">
    <header class="album-studio__hero">
      <div>
        <p>Content Studio · Albums</p>
        <h2>相册工作台</h2>
        <span>私有原图、受保护预览与发布素材分层处理</span>
      </div>
      <div class="album-studio__hero-actions">
        <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="loadWorkspace"><i class="fas fa-rotate" aria-hidden="true"></i> 刷新</button>
        <button class="studio-button" type="button" @click="creating = !creating"><i class="fas fa-plus" aria-hidden="true"></i> 新建草稿</button>
      </div>
    </header>

    <p v-if="errorMessage" class="studio-alert studio-alert--error" role="alert">{{ errorMessage }}</p>
    <p v-if="notice" class="studio-alert" role="status">{{ notice }}</p>

    <section v-if="conflict" class="conflict-panel glass-panel" role="alert" aria-live="assertive">
      <div class="conflict-panel__icon"><i class="fas fa-code-compare" aria-hidden="true"></i></div>
      <div class="conflict-panel__body">
        <small>ETAG CONFLICT · 需要人工决定</small>
        <h3>{{ conflict.label }}</h3>
        <p>你的操作基于 <strong>{{ conflict.baseEtag || '未知版本' }}</strong>，服务器当前为 <strong>{{ conflict.serverEtag || '未知版本' }}</strong>。系统没有自动覆盖另一会话的修改。</p>
        <dl v-if="conflict.server">
          <div><dt>服务器标题</dt><dd>{{ conflict.server.title }}</dd></div>
          <div><dt>服务器状态</dt><dd>{{ lifecycleLabel(conflict.server.lifecycle) }}</dd></div>
          <div><dt>服务器照片</dt><dd>{{ conflict.server.photos?.length || 0 }} 张</dd></div>
        </dl>
        <p v-if="conflict.summary" class="conflict-panel__intent">待重新应用：{{ conflict.summary }}</p>
        <p v-if="!conflict.reapplyAllowed" class="conflict-panel__warning">{{ conflict.blockReason || '该操作需要先采用服务器版本，再重新编辑。' }}</p>
      </div>
      <div class="conflict-panel__actions">
        <button class="studio-button studio-button--ghost" type="button" :disabled="busy || !conflict.server" @click="acceptServerVersion">采用服务器版本</button>
        <button class="studio-button" type="button" :disabled="busy || !conflict.reapplyAllowed" @click="reapplyConflict">在最新版本上重新应用</button>
      </div>
    </section>

    <form v-if="creating" class="new-album glass-panel" @submit.prevent="createAlbum">
      <label>标题<input v-model.trim="newAlbum.title" maxlength="256" required /></label>
      <label>可见性
        <select v-model="newAlbum.visibility"><option value="PRIVATE">私密</option><option value="UNLISTED">不公开列出</option><option value="PUBLIC">公开</option></select>
      </label>
      <label class="new-album__summary">简介<textarea v-model.trim="newAlbum.summary" maxlength="8000" rows="2"></textarea></label>
      <button class="studio-button" type="submit" :disabled="busy || !newAlbum.title">创建并进入编辑</button>
    </form>

    <div class="album-studio__layout">
      <aside class="album-index glass-panel" aria-label="相册草稿列表">
        <div class="panel-heading"><div><small>LIBRARY</small><h3>相册</h3></div><span>{{ albums.length }}</span></div>
        <p v-if="loadingAlbums" class="empty-copy">正在读取相册…</p>
        <button v-for="album in albums" :key="album.id" type="button" class="album-index__item" :class="{ 'album-index__item--active': detail?.id === album.id }" @click="selectAlbum(album.id)">
          <span><strong>{{ album.title }}</strong><small>{{ lifecycleLabel(album.lifecycle) }} · {{ visibilityLabel(album.visibility) }}</small></span>
          <span class="count-pill">{{ album.photoCount }}</span>
        </button>
        <p v-if="!loadingAlbums && !albums.length" class="empty-copy">还没有相册，从一份私密草稿开始。</p>
      </aside>

      <main class="album-editor glass-panel">
        <div v-if="!detail" class="album-editor__empty">
          <i class="far fa-images" aria-hidden="true"></i>
          <h3>选择一个相册开始编排</h3>
          <p>上传原图时逐项显示进度；失败项目可以单独重试，成功项目不会回滚。</p>
        </div>

        <template v-else>
          <header class="editor-heading">
            <div><p>{{ lifecycleLabel(detail.lifecycle) }} · ETag {{ detail.audit?.etag || '—' }}</p><h3>{{ detail.title }}</h3></div>
            <div class="editor-heading__actions">
              <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="openPreview">预览</button>
              <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="saveAlbum">保存</button>
              <button v-if="detail.lifecycle === 'PUBLISHED'" class="studio-button studio-button--warn" type="button" :disabled="busy" @click="archiveAlbum">归档</button>
              <button v-else class="studio-button" type="button" :disabled="busy || !publishReadiness.ready" @click="publishAlbum">发布</button>
            </div>
          </header>

          <section class="editor-section editor-section--fields">
            <label>标题<input v-model.trim="albumForm.title" maxlength="256" /></label>
            <label>可见性
              <select v-model="albumForm.visibility"><option value="PRIVATE">私密</option><option value="UNLISTED">不公开列出</option><option value="PUBLIC">公开</option></select>
            </label>
            <label>排序<input v-model.number="albumForm.sortNum" type="number" /></label>
            <label class="field-check"><input v-model="albumForm.featured" type="checkbox" /> 精选相册</label>
            <label class="editor-section__wide">简介<textarea v-model.trim="albumForm.summary" maxlength="8000" rows="3"></textarea></label>
          </section>

          <section v-if="!publishReadiness.ready" class="publish-gate" aria-label="发布前检查">
            <strong><i class="fas fa-shield-halved" aria-hidden="true"></i> 发布门槛</strong>
            <span v-for="blocker in publishReadiness.blockers" :key="blocker">{{ blocker }}</span>
          </section>

          <section class="editor-section">
            <div class="section-heading"><div><small>01 · INGEST</small><h4>批量上传</h4></div><label class="file-picker"><input type="file" accept="image/png,image/jpeg,image/webp,image/gif" multiple @change="queueFiles" /><i class="fas fa-cloud-arrow-up"></i> 选择照片</label></div>
            <p class="section-copy">原图固定为私有资产；公开访问只使用净化派生。位置标签默认不保存，只有明确审核后才会登记。</p>
            <div v-if="uploadQueue.length" class="upload-queue">
              <article v-for="item in uploadQueue" :key="item.id" class="upload-item" :class="`upload-item--${item.status}`">
                <div class="upload-item__top"><strong>{{ item.file.name }}</strong><span>{{ progressLabel(item.status) }}</span></div>
                <div class="upload-item__fields">
                  <label>照片标题<input v-model.trim="item.title" maxlength="256" /></label>
                  <label>替代文本<input v-model.trim="item.altText" maxlength="512" placeholder="用于无障碍阅读" /></label>
                  <label>位置标签<input v-model.trim="item.location" maxlength="256" placeholder="可留空" /></label>
                  <label class="field-check"><input v-model="item.locationReviewed" type="checkbox" :disabled="!item.location" /> 已确认该位置可公开</label>
                </div>
                <p v-if="item.error" class="upload-item__error">{{ item.error }}</p>
                <button v-if="item.status === 'failed'" class="text-button" type="button" @click="uploadOne(item)">重试此项</button>
              </article>
              <button class="studio-button" type="button" :disabled="uploading || !retryableUploadItems(uploadQueue).length" @click="uploadBatch">{{ uploading ? '正在逐项处理…' : '开始上传并加入当前相册' }}</button>
            </div>
          </section>

          <section class="editor-section">
            <div class="section-heading"><div><small>02 · REUSE</small><h4>照片库复用</h4></div><button class="text-button" type="button" @click="loadPhotoLibrary">刷新照片库</button></div>
            <div class="photo-library">
              <article v-for="photo in libraryPhotos" :key="photo.id" class="library-photo" :class="{ 'library-photo--selected': selectedLibraryIds.has(photo.id) }">
                <label class="library-photo__select"><input type="checkbox" :checked="selectedLibraryIds.has(photo.id)" :disabled="attachedPhotoIds.has(photo.id)" @change="toggleLibraryPhoto(photo.id)" /> #{{ photo.id }}</label>
                <span :class="['status-dot', `status-dot--${statusTone(photo.processingStatus)}`]">{{ photo.processingStatus }}</span>
                <label>标题<input v-model.trim="libraryEdits[photo.id].title" maxlength="256" /></label>
                <label>替代文本<input v-model.trim="libraryEdits[photo.id].altText" maxlength="512" /></label>
                <label>位置标签<input v-model.trim="libraryEdits[photo.id].location" maxlength="256" placeholder="默认不公开" /></label>
                <label class="field-check"><input v-model="libraryEdits[photo.id].locationReviewed" type="checkbox" :disabled="!libraryEdits[photo.id].location" /> 已审核可公开位置</label>
                <button class="text-button" type="button" :disabled="busy" @click="saveLibraryPhoto(photo)">保存元数据</button>
              </article>
              <p v-if="!libraryPhotos.length" class="empty-copy">照片库为空，先上传一张照片。</p>
            </div>
            <button class="studio-button studio-button--ghost" type="button" :disabled="busy || !selectedLibraryIds.size" @click="attachSelectedPhotos">复用所选照片</button>
          </section>

          <section class="editor-section">
            <div class="section-heading"><div><small>03 · COMPOSE</small><h4>封面与顺序</h4></div><span>{{ detail.photos.length }} 张</span></div>
            <p class="section-copy">可拖拽排序，也可用上下移动按钮完成键盘操作。每次变更都携带当前相册 ETag。</p>
            <div class="album-photo-grid">
              <article v-for="(photo, index) in detail.photos" :key="photo.photoId" class="album-photo" :class="{ 'album-photo--cover': detail.coverPhotoId === photo.photoId }" draggable="true" @dragstart="dragIndex = index" @dragover.prevent @drop="dropPhoto(index)">
                <div class="album-photo__visual">
                  <AdminProtectedMediaImage :route="previewRoute(photo, 'THUMB_WEBP')" :alt="photo.altText" />
                  <span v-if="detail.coverPhotoId === photo.photoId" class="cover-badge">封面</span>
                </div>
                <div class="album-photo__body">
                  <div class="album-photo__title"><strong>{{ photo.title || `照片 #${photo.photoId}` }}</strong><span :class="['status-dot', `status-dot--${statusTone(photo.processing?.status)}`]">{{ photo.processing?.status }}</span></div>
                  <label>说明<textarea v-model.trim="photo.caption" rows="2" maxlength="4000"></textarea></label>
                  <div class="photo-policy">
                    <label>下载策略
                      <select v-model="downloadDrafts[photo.photoId].mode"><option value="NONE">不提供下载</option><option value="SANITIZED">净化版本</option><option value="ORIGINAL">原图</option></select>
                    </label>
                    <label v-if="downloadDrafts[photo.photoId].mode === 'ORIGINAL'" class="field-check"><input v-model="downloadDrafts[photo.photoId].acknowledged" type="checkbox" /> 已确认原图隐私风险</label>
                  </div>
                  <AdminMediaProcessingStatus :status="photo.processing?.status" :ready-for-publication="photo.processing?.readyForPublication" :variants="photo.processing?.variants || []" @retry="retryVariant" />
                  <div class="album-photo__actions">
                    <button class="text-button" type="button" :disabled="index === 0 || busy" aria-label="上移照片" @click="movePhoto(index, -1)"><i class="fas fa-arrow-up"></i></button>
                    <button class="text-button" type="button" :disabled="index === detail.photos.length - 1 || busy" aria-label="下移照片" @click="movePhoto(index, 1)"><i class="fas fa-arrow-down"></i></button>
                    <button class="text-button" type="button" :disabled="busy" @click="selectCover(photo.photoId)">设为封面</button>
                    <button class="text-button" type="button" :disabled="busy" @click="saveCaption(photo)">保存说明</button>
                    <button class="text-button" type="button" :disabled="busy || (downloadDrafts[photo.photoId].mode === 'ORIGINAL' && !downloadDrafts[photo.photoId].acknowledged)" @click="saveDownloadPolicy(photo)">保存下载策略</button>
                    <button class="text-button text-button--danger" type="button" :disabled="busy" @click="detachPhoto(photo.photoId)">移除</button>
                  </div>
                </div>
              </article>
              <p v-if="!detail.photos.length" class="empty-copy">上传或从照片库复用素材后，即可在这里编排。</p>
            </div>
          </section>
        </template>
      </main>
    </div>

    <div v-if="preview" class="preview-overlay" role="dialog" aria-modal="true" aria-label="相册发布预览" @click.self="preview = null">
      <section class="preview-sheet glass-panel">
        <header><div><small>PROTECTED PREVIEW</small><h3>{{ preview.title }}</h3><p>{{ preview.summary }}</p></div><button class="text-button" type="button" @click="preview = null">关闭</button></header>
        <div class="preview-grid">
          <figure v-for="photo in preview.photos" :key="photo.mediaRef"><AdminProtectedMediaImage :route="previewRoute(photo)" :alt="photo.altText" /><figcaption><strong>{{ photo.caption || photo.altText }}</strong><span v-if="photo.publishedLocationLabel"><i class="fas fa-location-dot"></i> {{ photo.publishedLocationLabel }}</span></figcaption></figure>
        </div>
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import {
  archiveAdminAlbum, attachAdminAlbumPhotos, createAdminAlbum, detachAdminAlbumPhotos,
  getAdminAlbum, getAdminAlbumPreview, listAdminAlbums, listAdminManagedPhotos,
  publishAdminAlbum, reorderAdminAlbumPhotos, retryAdminMediaDerivative,
  selectAdminAlbumCover, updateAdminAlbum, updateAdminManagedPhoto,
  updateAdminPhotoDownloadPolicy, uploadAdminManagedPhoto
} from '../../services/adminLifeContentApi';
import AdminProtectedMediaImage from './AdminProtectedMediaImage.vue';
import AdminMediaProcessingStatus from './AdminMediaProcessingStatus.vue';
import {
  albumEditorForm, albumPublishReadiness, canReapplyPhotoOrder, moveAlbumPhoto, preferredAdminPreviewRoute,
  createUploadQueueItems, processingTone, retryableUploadItems, updateUploadQueueItem,
  uploadBatchCompletionMessage, uploadProgressLabel
} from './adminAlbumStudioState';

const auth = useAuthSession();
const albums = ref([]);
const libraryPhotos = ref([]);
const detail = ref(null);
const preview = ref(null);
const conflict = ref(null);
const loadingAlbums = ref(false);
const busy = ref(false);
const uploading = ref(false);
const creating = ref(false);
const errorMessage = ref('');
const notice = ref('');
const uploadQueue = ref([]);
const selectedLibraryIds = ref(new Set());
const libraryEdits = reactive({});
const downloadDrafts = reactive({});
const albumForm = reactive(albumEditorForm());
const newAlbum = reactive({ title: '', summary: '', visibility: 'PRIVATE' });
let dragIndex = -1;

const attachedPhotoIds = computed(() => new Set((detail.value?.photos || []).map((photo) => photo.photoId)));
const publishReadiness = computed(() => albumPublishReadiness(detail.value || {}));

function messageOf(error) { return String(error?.detail || error?.message || '操作失败，请稍后重试'); }
function isVersionConflict(error) { return Number(error?.status) === 409 || String(error?.problemCode || '').toUpperCase() === 'CONFLICT'; }
function setFeedback(message = '', error = '') { notice.value = message; errorMessage.value = error; }
function lifecycleLabel(value) { return ({ DRAFT: '草稿', PUBLISHED: '已发布', ARCHIVED: '已归档', RECYCLED: '回收站' })[value] || value; }
function visibilityLabel(value) { return ({ PRIVATE: '私密', UNLISTED: '不公开列出', PUBLIC: '公开' })[value] || value; }
function statusTone(value) { return processingTone(value); }
function progressLabel(value) { return uploadProgressLabel(value); }
function previewRoute(photo, preferred) { return preferredAdminPreviewRoute(photo, preferred); }

async function presentConflict(error, intent = null) {
  const baseEtag = detail.value?.audit?.etag || '';
  let server = null;
  try { server = await getAdminAlbum(detail.value.id, auth.authorizedFetch); } catch { /* retain error metadata */ }
  const errorDetails = error?.body?.details || error?.body?.data?.details || error?.body?.data || {};
  const serverEtag = String(server?.audit?.etag || errorDetails.currentEtag || errorDetails.current_etag || '');
  const validationPassed = server && (!intent?.validate || intent.validate(server));
  conflict.value = {
    label: intent?.label || '相册操作与服务器版本冲突',
    summary: intent?.summary || '',
    baseEtag,
    serverEtag,
    server,
    intent,
    reapplyAllowed: Boolean(intent?.reapply && validationPassed),
    blockReason: validationPassed ? '' : intent?.blockReason || ''
  };
  errorMessage.value = '';
}

function acceptServerVersion() {
  if (!conflict.value?.server) return;
  applyDetail(conflict.value.server);
  conflict.value = null;
  setFeedback('已采用服务器当前版本；未自动重新提交本地操作。');
}

async function reapplyConflict() {
  const current = conflict.value;
  if (!current?.reapplyAllowed || !current.intent?.reapply) return;
  busy.value = true;
  setFeedback();
  try {
    const result = await current.intent.reapply(current.serverEtag, current.server);
    applyDetail(result);
    conflict.value = null;
    await loadAlbumList();
    notice.value = '本地操作已由你确认并重新应用到服务器最新版本。';
  } catch (error) {
    if (isVersionConflict(error)) await presentConflict(error, current.intent);
    else errorMessage.value = messageOf(error);
  } finally {
    busy.value = false;
  }
}

function applyDetail(payload) {
  detail.value = payload;
  Object.assign(albumForm, albumEditorForm(payload));
  (payload?.photos || []).forEach((photo) => { downloadDrafts[photo.photoId] = { mode: photo.downloadMode || 'NONE', acknowledged: false }; });
}

function applyPhotoLibrary(payload) {
  libraryPhotos.value = payload;
  payload.forEach((photo) => {
    libraryEdits[photo.id] = {
      title: photo.title || '', altText: photo.altText || '', location: photo.publishedLocationLabel || '',
      locationReviewed: Boolean(photo.publishedLocationLabel), capturedAtDraft: photo.capturedAtDraft || null
    };
  });
}

async function loadAlbumList() {
  loadingAlbums.value = true;
  try { albums.value = await listAdminAlbums({}, auth.authorizedFetch); } finally { loadingAlbums.value = false; }
}
async function loadPhotoLibrary() { applyPhotoLibrary(await listAdminManagedPhotos({}, auth.authorizedFetch)); }

async function loadWorkspace() {
  setFeedback();
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) { errorMessage.value = '需要管理员登录后才能读取相册工作台。'; return; }
  busy.value = true;
  try {
    await Promise.all([loadAlbumList(), loadPhotoLibrary()]);
    if (detail.value?.id) applyDetail(await getAdminAlbum(detail.value.id, auth.authorizedFetch));
  } catch (error) { errorMessage.value = messageOf(error); } finally { busy.value = false; }
}

async function selectAlbum(id) {
  setFeedback(); busy.value = true;
  try { applyDetail(await getAdminAlbum(id, auth.authorizedFetch)); conflict.value = null; }
  catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

async function createAlbum() {
  busy.value = true; setFeedback();
  try {
    applyDetail(await createAdminAlbum(newAlbum, auth.authorizedFetch));
    Object.assign(newAlbum, { title: '', summary: '', visibility: 'PRIVATE' });
    creating.value = false; await loadAlbumList(); notice.value = '相册草稿已创建。';
  } catch (error) { errorMessage.value = messageOf(error); } finally { busy.value = false; }
}

async function runAlbumMutation(action, success, intent = null) {
  if (!detail.value) return;
  busy.value = true; setFeedback();
  try { applyDetail(await action(detail.value.audit?.etag)); conflict.value = null; await loadAlbumList(); notice.value = success; }
  catch (error) {
    if (isVersionConflict(error)) await presentConflict(error, intent);
    else errorMessage.value = messageOf(error);
  }
  finally { busy.value = false; }
}

function saveAlbum() {
  const payload = { ...albumForm };
  return runAlbumMutation(
    (etag) => updateAdminAlbum(detail.value.id, payload, etag, auth.authorizedFetch),
    '相册信息已保存。',
    {
      label: '相册编辑与服务器版本冲突',
      summary: `标题「${payload.title}」、${visibilityLabel(payload.visibility)}可见性与当前编辑字段`,
      reapply: (etag) => updateAdminAlbum(detail.value.id, payload, etag, auth.authorizedFetch)
    }
  );
}
function publishAlbum() { return runAlbumMutation((etag) => publishAdminAlbum(detail.value.id, etag, auth.authorizedFetch), '相册已发布。'); }
function archiveAlbum() { return runAlbumMutation((etag) => archiveAdminAlbum(detail.value.id, etag, auth.authorizedFetch), '相册已归档并撤回访客交付。'); }
function selectCover(photoId) { return runAlbumMutation((etag) => selectAdminAlbumCover(detail.value.id, photoId, etag, auth.authorizedFetch), '封面已更新。'); }

async function openPreview() {
  busy.value = true; setFeedback();
  try { preview.value = await getAdminAlbumPreview(detail.value.id, auth.authorizedFetch); }
  catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

function queueFiles(event) {
  uploadQueue.value.push(...createUploadQueueItems(event.target.files || []));
  event.target.value = '';
}

function patchUploadItem(itemId, patch) {
  uploadQueue.value = updateUploadQueueItem(uploadQueue.value, itemId, patch);
}

async function uploadOne(item) {
  patchUploadItem(item.id, { status: 'queued', error: '' });
  try {
    const photo = await uploadAdminManagedPhoto(item.file, {
      title: item.title, altText: item.altText,
      publishedLocationLabel: item.locationReviewed ? item.location : '',
      locationReviewAcknowledged: item.locationReviewed
    }, auth.authorizedFetch, (status) => { patchUploadItem(item.id, { status }); });
    if (detail.value) {
      applyDetail(await attachAdminAlbumPhotos(detail.value.id, [{ photoId: photo.id, caption: '', downloadMode: 'NONE' }], detail.value.audit?.etag, auth.authorizedFetch));
      patchUploadItem(item.id, { status: 'attached' });
    }
    await loadPhotoLibrary();
    return true;
  } catch (error) { patchUploadItem(item.id, { status: 'failed', error: messageOf(error) }); return false; }
}

async function uploadBatch() {
  const items = retryableUploadItems(uploadQueue.value);
  uploading.value = true; setFeedback(); let completed = 0;
  try {
    for (const item of items) if (await uploadOne(item)) completed += 1;
    await loadAlbumList(); notice.value = uploadBatchCompletionMessage(completed, items.length);
  } finally { uploading.value = false; }
}

function toggleLibraryPhoto(photoId) {
  const next = new Set(selectedLibraryIds.value);
  if (next.has(photoId)) next.delete(photoId); else next.add(photoId);
  selectedLibraryIds.value = next;
}

async function saveLibraryPhoto(photo) {
  const edit = libraryEdits[photo.id]; busy.value = true; setFeedback();
  try {
    await updateAdminManagedPhoto(photo.id, {
      title: edit.title, altText: edit.altText, capturedAtDraft: edit.capturedAtDraft,
      publishedLocationLabel: edit.locationReviewed ? edit.location : '',
      locationReviewAcknowledged: edit.locationReviewed
    }, photo.etag, auth.authorizedFetch);
    await loadPhotoLibrary();
    if (detail.value) applyDetail(await getAdminAlbum(detail.value.id, auth.authorizedFetch));
    notice.value = '照片元数据已保存。';
  } catch (error) { errorMessage.value = messageOf(error); } finally { busy.value = false; }
}

async function attachSelectedPhotos() {
  const photos = [...selectedLibraryIds.value].filter((id) => !attachedPhotoIds.value.has(id)).map((photoId) => ({ photoId, caption: '', downloadMode: 'NONE' }));
  if (!photos.length) return;
  await runAlbumMutation((etag) => attachAdminAlbumPhotos(detail.value.id, photos, etag, auth.authorizedFetch), `已复用 ${photos.length} 张照片。`);
  selectedLibraryIds.value = new Set();
}

function detachPhoto(photoId) { return runAlbumMutation((etag) => detachAdminAlbumPhotos(detail.value.id, [photoId], etag, auth.authorizedFetch), '照片已从相册移除，照片库原件仍然保留。'); }

async function persistOrder(nextPhotos) {
  const previous = detail.value.photos;
  const intendedPhotoIds = nextPhotos.map((photo) => photo.photoId);
  detail.value = { ...detail.value, photos: nextPhotos }; busy.value = true; setFeedback();
  try {
    applyDetail(await reorderAdminAlbumPhotos(detail.value.id, intendedPhotoIds, detail.value.audit?.etag, auth.authorizedFetch));
    conflict.value = null; notice.value = '照片顺序已保存。';
  } catch (error) {
    if (isVersionConflict(error)) {
      await presentConflict(error, {
        label: '照片顺序与服务器版本冲突',
        summary: `按照片 ID 保存顺序：${intendedPhotoIds.join(' → ')}`,
        validate: (server) => canReapplyPhotoOrder(server.photos, intendedPhotoIds),
        blockReason: '服务器上的照片集合已经变化，不能把旧顺序盲目套用到新集合。请先采用服务器版本后重新排序。',
        reapply: (etag) => reorderAdminAlbumPhotos(detail.value.id, intendedPhotoIds, etag, auth.authorizedFetch)
      });
    } else {
      detail.value = { ...detail.value, photos: previous };
      errorMessage.value = messageOf(error);
    }
  } finally { busy.value = false; }
}

function movePhoto(index, delta) { return persistOrder(moveAlbumPhoto(detail.value.photos, index, index + delta)); }
function dropPhoto(index) { if (dragIndex < 0 || dragIndex === index) return; const next = moveAlbumPhoto(detail.value.photos, dragIndex, index); dragIndex = -1; persistOrder(next); }
function saveCaption(photo) { return runAlbumMutation((etag) => attachAdminAlbumPhotos(detail.value.id, [{ photoId: photo.photoId, caption: photo.caption || '', downloadMode: photo.downloadMode || 'NONE' }], etag, auth.authorizedFetch), '照片说明已保存。'); }

async function saveDownloadPolicy(photo) {
  const draft = downloadDrafts[photo.photoId]; busy.value = true; setFeedback();
  try { await updateAdminPhotoDownloadPolicy(photo, draft.mode, draft.acknowledged, auth.authorizedFetch); applyDetail(await getAdminAlbum(detail.value.id, auth.authorizedFetch)); notice.value = '下载策略已保存。'; }
  catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

async function retryVariant(variant) {
  busy.value = true; setFeedback();
  try { await retryAdminMediaDerivative(variant.retryRoute, variant.etag, auth.authorizedFetch); applyDetail(await getAdminAlbum(detail.value.id, auth.authorizedFetch)); notice.value = `${variant.variant} 已重新进入处理队列。`; }
  catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

onMounted(loadWorkspace);
</script>

<style scoped>
.album-studio { --studio-radius: 18px; display: grid; gap: 18px; min-height: 640px; padding: clamp(16px, 2.5vw, 28px); color: var(--theme-text-primary); }
.glass-panel { border: 1px solid var(--theme-border, rgba(255,255,255,.14)); border-radius: var(--studio-radius); background: linear-gradient(145deg, rgba(var(--accent-rgb), .07), transparent 42%), var(--theme-panel-surface, rgba(12,18,28,.76)); box-shadow: 0 18px 46px rgba(0,0,0,.12); backdrop-filter: blur(18px) saturate(135%); }
.album-studio__hero, .editor-heading, .section-heading, .panel-heading, .preview-sheet header, .upload-item__top, .album-photo__title { display: flex; align-items: center; justify-content: space-between; gap: 14px; }
.album-studio__hero p, .editor-heading p, .section-heading small, .panel-heading small, .preview-sheet small { margin: 0 0 4px; color: var(--theme-text-tertiary, var(--theme-text-secondary)); font-size: 10px; font-weight: 800; letter-spacing: .14em; }
.album-studio__hero h2, .editor-heading h3, .panel-heading h3, .section-heading h4, .preview-sheet h3 { margin: 0; }
.album-studio__hero span, .editor-heading p, .section-copy, .empty-copy, .preview-sheet p { color: var(--theme-text-secondary); font-size: 12px; }
.album-studio__hero-actions, .editor-heading__actions, .album-photo__actions { display: flex; flex-wrap: wrap; gap: 8px; }
.studio-button, .text-button, .file-picker { border: 0; cursor: pointer; font: inherit; }
.studio-button, .file-picker { display: inline-flex; align-items: center; justify-content: center; gap: 7px; min-height: 36px; padding: 8px 13px; border: 1px solid rgba(var(--accent-rgb), .32); border-radius: 12px; color: var(--theme-text-primary); background: rgba(var(--accent-rgb), .18); }
.studio-button--ghost { border-color: var(--theme-border, rgba(255,255,255,.14)); background: var(--theme-panel-surface-elevated, rgba(255,255,255,.055)); }
.studio-button--warn { border-color: rgba(251,191,36,.35); background: rgba(251,191,36,.12); }
.studio-button:disabled, .text-button:disabled { cursor: not-allowed; opacity: .45; }
.text-button { padding: 3px; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); background: transparent; font-size: 12px; }
.text-button--danger { color: #ef8e95; }
.studio-alert { margin: 0; padding: 11px 14px; border: 1px solid rgba(52,211,153,.25); border-radius: 12px; color: var(--theme-text-primary); background: rgba(52,211,153,.1); font-size: 12px; }
.studio-alert--error { border-color: rgba(248,113,113,.3); background: rgba(248,113,113,.1); }
.conflict-panel { display: grid; grid-template-columns: auto minmax(0, 1fr) auto; align-items: start; gap: 14px; padding: 16px; border-color: rgba(251,191,36,.34); background: linear-gradient(135deg, rgba(251,191,36,.11), transparent 52%), var(--theme-panel-surface, rgba(12,18,28,.86)); }
.conflict-panel__icon { display: grid; place-items: center; width: 42px; height: 42px; border-radius: 13px; color: #fcd34d; background: rgba(251,191,36,.12); }
.conflict-panel__body { display: grid; gap: 7px; }
.conflict-panel__body small { color: #fcd34d; font-size: 9px; font-weight: 800; letter-spacing: .13em; }
.conflict-panel__body h3, .conflict-panel__body p, .conflict-panel__body dl { margin: 0; }
.conflict-panel__body p { color: var(--theme-text-secondary); font-size: 12px; line-height: 1.6; }
.conflict-panel__body dl { display: flex; flex-wrap: wrap; gap: 7px; }
.conflict-panel__body dl div { padding: 6px 8px; border-radius: 9px; background: rgba(255,255,255,.045); }
.conflict-panel__body dt { color: var(--theme-text-tertiary, var(--theme-text-secondary)); font-size: 9px; }
.conflict-panel__body dd { margin: 2px 0 0; font-size: 11px; }
.conflict-panel__intent { padding: 8px 10px; border-radius: 10px; background: rgba(var(--accent-rgb), .08); }
.conflict-panel__warning { color: #fca5a5 !important; }
.conflict-panel__actions { display: grid; gap: 8px; min-width: 180px; }
.new-album { display: grid; grid-template-columns: 1fr 180px; gap: 12px; padding: 16px; }
.new-album__summary { grid-column: 1 / -1; }
.new-album .studio-button { justify-self: start; }
.album-studio__layout { display: grid; grid-template-columns: minmax(190px, 240px) minmax(0, 1fr); gap: 16px; align-items: start; }
.album-index { position: sticky; top: 16px; display: grid; gap: 7px; max-height: calc(100vh - 140px); padding: 14px; overflow: auto; }
.panel-heading span, .count-pill { min-width: 24px; padding: 4px 7px; border-radius: 999px; color: var(--theme-text-secondary); background: rgba(var(--accent-rgb), .1); font-size: 10px; text-align: center; }
.album-index__item { display: flex; align-items: center; justify-content: space-between; gap: 8px; padding: 11px; border: 1px solid transparent; border-radius: 13px; color: var(--theme-text-primary); background: transparent; text-align: left; cursor: pointer; }
.album-index__item:hover, .album-index__item--active { border-color: rgba(var(--accent-rgb), .28); background: rgba(var(--accent-rgb), .11); transform: translateY(-1px); }
.album-index__item span:first-child { display: grid; gap: 3px; min-width: 0; }
.album-index__item strong { overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
.album-index__item small { color: var(--theme-text-secondary); }
.album-editor { min-width: 0; padding: clamp(14px, 2vw, 22px); }
.album-editor__empty { min-height: 440px; display: grid; place-content: center; justify-items: center; text-align: center; }
.album-editor__empty i { font-size: 42px; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); }
.editor-section { display: grid; gap: 13px; padding: 20px 0; border-top: 1px solid var(--theme-border, rgba(255,255,255,.1)); }
.editor-heading { padding-bottom: 18px; }
.editor-section--fields { grid-template-columns: minmax(220px, 1fr) 170px 110px auto; align-items: end; }
.editor-section__wide { grid-column: 1 / -1; }
label { display: grid; gap: 6px; color: var(--theme-text-secondary); font-size: 11px; }
input, textarea, select { width: 100%; box-sizing: border-box; border: 1px solid var(--theme-border, rgba(255,255,255,.14)); border-radius: 10px; padding: 9px 10px; color: var(--theme-text-primary); background: var(--theme-input-surface, rgba(0,0,0,.13)); font: inherit; }
textarea { resize: vertical; }
.field-check { display: flex; align-items: center; gap: 7px; }
.field-check input, .library-photo__select input { width: auto; }
.publish-gate { display: flex; flex-wrap: wrap; gap: 7px; padding: 12px; border: 1px solid rgba(251,191,36,.24); border-radius: 12px; background: rgba(251,191,36,.08); font-size: 11px; }
.publish-gate strong { width: 100%; }
.publish-gate span { padding: 4px 7px; border-radius: 999px; background: rgba(251,191,36,.1); }
.file-picker { position: relative; }
.file-picker input { position: absolute; width: 1px; height: 1px; opacity: 0; }
.upload-queue, .photo-library, .album-photo-grid { display: grid; gap: 10px; }
.upload-item, .library-photo, .album-photo { border: 1px solid var(--theme-border, rgba(255,255,255,.12)); border-radius: 15px; background: var(--theme-panel-surface-elevated, rgba(255,255,255,.04)); }
.upload-item { display: grid; gap: 10px; padding: 13px; }
.upload-item--failed { border-color: rgba(248,113,113,.34); }
.upload-item--attached { border-color: rgba(52,211,153,.3); }
.upload-item__top span { color: var(--theme-text-secondary); font-size: 11px; }
.upload-item__fields { display: grid; grid-template-columns: repeat(4, minmax(0, 1fr)); gap: 9px; }
.upload-item__error { margin: 0; color: #ef8e95; font-size: 11px; }
.photo-library { grid-template-columns: repeat(auto-fill, minmax(210px, 1fr)); max-height: 430px; overflow: auto; }
.library-photo { display: grid; gap: 8px; padding: 12px; }
.library-photo--selected { border-color: rgba(var(--accent-rgb), .38); box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), .12); }
.library-photo__select { display: flex; align-items: center; gap: 7px; color: var(--theme-text-primary); }
.status-dot { width: fit-content; padding: 3px 6px; border-radius: 999px; color: var(--theme-text-secondary); background: rgba(148,163,184,.13); font-size: 9px; }
.status-dot--ready { color: #6ee7b7; background: rgba(52,211,153,.12); }
.status-dot--failed { color: #fca5a5; background: rgba(248,113,113,.12); }
.album-photo { display: grid; grid-template-columns: 170px minmax(0, 1fr); overflow: hidden; transition: border-color .2s ease, transform .2s ease; }
.album-photo:hover { border-color: rgba(var(--accent-rgb), .32); transform: translateY(-1px); }
.album-photo--cover { border-color: rgba(var(--accent-rgb), .45); }
.album-photo__visual { position: relative; min-height: 170px; }
.cover-badge { position: absolute; top: 9px; left: 9px; padding: 5px 8px; border-radius: 999px; color: var(--theme-text-primary); background: rgba(0,0,0,.55); font-size: 10px; backdrop-filter: blur(10px); }
.album-photo__body { display: grid; gap: 10px; padding: 13px; }
.photo-policy { display: grid; grid-template-columns: minmax(180px, 260px) 1fr; align-items: end; gap: 10px; }
.preview-overlay { position: fixed; z-index: 10020; inset: 0; display: grid; place-items: center; padding: 24px; background: rgba(4,8,14,.72); backdrop-filter: blur(12px); }
.preview-sheet { width: min(1060px, 100%); max-height: calc(100vh - 48px); padding: 20px; overflow: auto; }
.preview-sheet header { align-items: flex-start; }
.preview-sheet p { max-width: 680px; }
.preview-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(230px, 1fr)); gap: 12px; margin-top: 18px; }
.preview-grid figure { min-height: 240px; display: grid; grid-template-rows: minmax(180px, 1fr) auto; margin: 0; overflow: hidden; border: 1px solid var(--theme-border, rgba(255,255,255,.12)); border-radius: 15px; background: var(--theme-panel-surface-elevated, rgba(255,255,255,.04)); }
.preview-grid figcaption { display: grid; gap: 4px; padding: 10px; }
.preview-grid figcaption span { color: var(--theme-text-secondary); font-size: 10px; }
@media (prefers-reduced-motion: reduce) { .album-index__item, .album-photo { transition: none; } }
@media (max-width: 980px) { .album-studio__layout { grid-template-columns: 1fr; } .album-index { position: static; max-height: 250px; } .editor-section--fields, .upload-item__fields { grid-template-columns: repeat(2, minmax(0,1fr)); } .conflict-panel { grid-template-columns: auto minmax(0,1fr); } .conflict-panel__actions { grid-column: 1 / -1; grid-template-columns: repeat(2, minmax(0,1fr)); } }
@media (max-width: 640px) { .album-studio__hero, .editor-heading, .section-heading { align-items: flex-start; flex-direction: column; } .new-album, .editor-section--fields, .upload-item__fields, .photo-policy { grid-template-columns: 1fr; } .new-album__summary, .editor-section__wide { grid-column: auto; } .album-photo { grid-template-columns: 1fr; } .album-photo__visual { min-height: 220px; } .preview-overlay { padding: 8px; } .conflict-panel { grid-template-columns: 1fr; } .conflict-panel__actions { grid-column: auto; grid-template-columns: 1fr; } }
</style>
