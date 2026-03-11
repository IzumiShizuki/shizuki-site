<template>
  <section class="lightapp-window url-links-window">
    <div class="top-toolbar">
      <button
        class="icon-btn toolbar-btn ripple-trigger"
        type="button"
        :title="showForm ? '收起添加区' : '添加网址'"
        :aria-label="showForm ? '收起添加区' : '添加网址'"
        @click="toggleForm"
      >
        <i :class="showForm ? 'fas fa-chevron-up' : 'fas fa-plus'" aria-hidden="true"></i>
      </button>
      <span class="toolbar-hint">共 {{ links.length }} 个网址</span>
    </div>

    <Transition name="panel-collapse">
      <form v-if="showForm" class="url-form" @submit.prevent="submitLink">
        <input v-model.trim="draft.title" type="text" placeholder="标题，例如：力扣" />
        <input v-model.trim="draft.url" type="url" placeholder="https://leetcode.cn" @blur="resolveMetadata" />
        <input v-model.trim="draft.faviconUrl" type="url" placeholder="图标 URL（可选）" />

        <div class="form-actions">
          <button class="icon-btn ripple-trigger" type="button" title="解析标题与图标" :disabled="saving" @click="resolveMetadata">
            <i class="fas fa-wand-magic-sparkles" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="上传图标" :disabled="saving || uploading" @click="triggerUpload">
            <i :class="uploading ? 'fas fa-spinner fa-spin' : 'fas fa-upload'" aria-hidden="true"></i>
          </button>
          <button
            class="icon-btn ripple-trigger"
            type="submit"
            :title="saving ? '保存中' : editingId ? '更新网址' : '创建网址'"
            :aria-label="saving ? '保存中' : editingId ? '更新网址' : '创建网址'"
            :disabled="saving || !isValidUrl(draft.url)"
          >
            <i :class="saving ? 'fas fa-spinner fa-spin' : editingId ? 'fas fa-check' : 'fas fa-plus'" aria-hidden="true"></i>
          </button>
          <button
            v-if="editingId"
            class="icon-btn ripple-trigger"
            type="button"
            title="取消编辑"
            aria-label="取消编辑"
            :disabled="saving"
            @click="cancelEditing"
          >
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
          <input ref="uploadInputRef" type="file" accept="image/*" class="hidden-file" @change="onUploadChange" />
        </div>
      </form>
    </Transition>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>
    <p v-if="hintText" class="info-text">{{ hintText }}</p>

    <ul v-if="links.length" class="url-list">
      <li v-for="item in links" :key="item.urlLinkId" class="url-item">
        <button class="url-main" type="button" @click="openUrl(item.url)">
          <img v-if="item.faviconUrl" :src="item.faviconUrl" alt="" />
          <i v-else class="fas fa-link" aria-hidden="true"></i>
          <div>
            <p>{{ item.title }}</p>
            <small>{{ item.url }}</small>
          </div>
        </button>
        <div class="url-actions">
          <button class="icon-btn ripple-trigger" type="button" title="编辑" @click="startEditing(item)">
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="删除" @click="removeLink(item.urlLinkId)">
            <i class="fas fa-trash" aria-hidden="true"></i>
          </button>
        </div>
      </li>
    </ul>
    <p v-else class="empty-hint">暂无网址快捷项，添加后可拖入悬浮栏或集合。</p>
  </section>
</template>

<script setup>
import { onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppUrlLink,
  deleteLightAppUrlLink,
  listLightAppUrlLinks,
  resolveLightAppUrlLinkMetadata,
  updateLightAppUrlLink
} from '../../../services/lightAppsApi';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';
import { notifyLightAppsChanged, readLightAppsState } from '../../../utils/lightAppsState';
import { normalizeApiData } from '../../../services/httpClient';

const auth = useAuthSession();

const links = ref([]);
const errorText = ref('');
const hintText = ref('');
const saving = ref(false);
const uploading = ref(false);
const showForm = ref(false);
const editingId = ref(0);
const uploadInputRef = ref(null);

const draft = reactive({
  title: '',
  url: '',
  iconMode: 'AUTO',
  iconAssetId: null,
  faviconUrl: ''
});

function unwrapApi(response) {
  const normalized = normalizeApiData(response);
  return normalized === null || normalized === undefined ? response : normalized;
}

function sortLinks(items) {
  return (Array.isArray(items) ? items : [])
    .slice()
    .sort((left, right) => Number(left.sortNum || 0) - Number(right.sortNum || 0) || Number(left.urlLinkId || 0) - Number(right.urlLinkId || 0));
}

function normalizeUrl(value) {
  const text = String(value || '').trim();
  if (!text) return '';
  return text;
}

function isValidUrl(value) {
  try {
    const url = new URL(normalizeUrl(value));
    return ['http:', 'https:'].includes(url.protocol);
  } catch {
    return false;
  }
}

function inferHostMeta(rawUrl) {
  try {
    const url = new URL(rawUrl);
    const host = url.hostname || rawUrl;
    return {
      title: host,
      faviconUrl: `https://www.google.com/s2/favicons?domain=${encodeURIComponent(host)}&sz=64`
    };
  } catch {
    return {
      title: rawUrl,
      faviconUrl: ''
    };
  }
}

function resetDraft() {
  draft.title = '';
  draft.url = '';
  draft.iconMode = 'AUTO';
  draft.iconAssetId = null;
  draft.faviconUrl = '';
  editingId.value = 0;
}

function toggleForm() {
  if (showForm.value && editingId.value) {
    resetDraft();
  }
  showForm.value = !showForm.value;
}

function cancelEditing() {
  resetDraft();
  showForm.value = false;
}

function syncLightAppsRuntime() {
  notifyLightAppsChanged(readLightAppsState());
}

function persistGuest(nextLinks) {
  const normalized = sortLinks(nextLinks);
  links.value = normalized;
  updateGuestLightAppData((current) => ({
    ...current,
    urlLinks: normalized
  }));
  syncLightAppsRuntime();
}

async function hydrate() {
  errorText.value = '';
  hintText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    links.value = sortLinks(guest.urlLinks || []);
    return;
  }

  try {
    const list = await listLightAppUrlLinks(auth.authorizedFetch);
    links.value = sortLinks(list);
    writeRemoteLightAppCache({ urlLinks: links.value });
    syncLightAppsRuntime();
  } catch (error) {
    const cache = readRemoteLightAppCache();
    links.value = sortLinks(cache.urlLinks || []);
    errorText.value = error?.message || '网址加载失败，已回退缓存。';
  }
}

function startEditing(item) {
  const id = Number(item?.urlLinkId || 0);
  if (!id) return;
  showForm.value = true;
  editingId.value = id;
  draft.title = String(item.title || '');
  draft.url = String(item.url || '');
  draft.iconMode = String(item.iconMode || 'AUTO').toUpperCase();
  draft.iconAssetId = item.iconAssetId || null;
  draft.faviconUrl = String(item.faviconUrl || '');
}

function buildPayload() {
  const title = String(draft.title || '').trim() || inferHostMeta(draft.url).title;
  return {
    title,
    url: normalizeUrl(draft.url),
    iconMode: draft.iconMode,
    iconAssetId: draft.iconAssetId,
    faviconUrl: String(draft.faviconUrl || '').trim() || null
  };
}

async function resolveMetadata() {
  hintText.value = '';
  errorText.value = '';
  const targetUrl = normalizeUrl(draft.url);
  if (!isValidUrl(targetUrl)) return;

  try {
    await auth.ensureReady();
    if (!auth.isAuthenticated.value) {
      const fallback = inferHostMeta(targetUrl);
      if (!draft.title.trim()) {
        draft.title = fallback.title;
      }
      if (!draft.faviconUrl.trim()) {
        draft.faviconUrl = fallback.faviconUrl;
      }
      return;
    }

    const metadata = await resolveLightAppUrlLinkMetadata(targetUrl, auth.authorizedFetch);
    if (!draft.title.trim() && metadata?.title) {
      draft.title = metadata.title;
    }
    if (!draft.faviconUrl.trim() && metadata?.faviconUrl) {
      draft.faviconUrl = metadata.faviconUrl;
    }
  } catch {
    const fallback = inferHostMeta(targetUrl);
    if (!draft.title.trim()) {
      draft.title = fallback.title;
    }
    if (!draft.faviconUrl.trim()) {
      draft.faviconUrl = fallback.faviconUrl;
    }
  }
}

function fileToDataUrl(file) {
  return new Promise((resolve, reject) => {
    const reader = new FileReader();
    reader.onload = () => resolve(String(reader.result || ''));
    reader.onerror = () => reject(new Error('读取图片失败'));
    reader.readAsDataURL(file);
  });
}

async function uploadImageAsset(file) {
  const contentType = String(file?.type || '').trim().toLowerCase();
  if (!contentType.startsWith('image/')) {
    throw new Error('仅支持图片文件');
  }
  const maxSize = 3 * 1024 * 1024;
  if (Number(file?.size || 0) > maxSize) {
    throw new Error('图标大小需 <= 3MB');
  }

  const policy = unwrapApi(
    await auth.authorizedFetch('/api/v1/assets/upload-policies', {
      method: 'POST',
      body: {
        fileName: file.name || 'url-link-icon.png',
        contentType,
        assetKind: 'STATIC_IMAGE',
        visibility: 'PRIVATE'
      }
    })
  );

  let bucket = String(policy?.bucket || '').trim();
  let key = String(policy?.key || '').trim();
  const uploadUrl = String(policy?.uploadUrl || policy?.upload_url || '').trim();
  let uploadContentType = contentType;
  if (!uploadUrl || !bucket || !key) {
    throw new Error('上传策略无效');
  }

  try {
    const directResult = await fetch(uploadUrl, {
      method: 'PUT',
      headers: {
        'Content-Type': contentType
      },
      body: file
    });
    if (!directResult.ok) {
      throw new Error(`direct upload failed (${directResult.status})`);
    }
  } catch {
    const relayForm = new FormData();
    relayForm.append('file', file, file.name || 'url-link-icon.png');
    relayForm.append('asset_kind', 'STATIC_IMAGE');
    relayForm.append('visibility', 'PRIVATE');

    const relayPayload = unwrapApi(
      await auth.authorizedFetch('/api/v1/assets/upload-relay', {
        method: 'POST',
        body: relayForm
      })
    );

    bucket = String(relayPayload?.bucket || '').trim();
    key = String(relayPayload?.key || '').trim();
    uploadContentType = String(relayPayload?.contentType || relayPayload?.content_type || contentType).trim() || contentType;
    if (!bucket || !key) {
      throw new Error('图标上传失败');
    }
  }

  const created = unwrapApi(
    await auth.authorizedFetch('/api/v1/assets', {
      method: 'POST',
      body: {
        bucket,
        key,
        assetType: 'image',
        assetKind: 'STATIC_IMAGE',
        contentType: uploadContentType,
        visibility: 'PRIVATE',
        metadata: {
          usage: 'url_link_icon'
        }
      }
    })
  );

  const assetId = Number(created?.assetId ?? created?.asset_id);
  if (!Number.isInteger(assetId) || assetId <= 0) {
    throw new Error('图标资产创建失败');
  }

  const downloadInfo = unwrapApi(
    await auth.authorizedFetch(`/api/v1/assets/${encodeURIComponent(assetId)}/download-url`, {
      method: 'GET'
    })
  );
  const downloadUrl = String(downloadInfo?.downloadUrl || downloadInfo?.download_url || downloadInfo?.publicUrl || downloadInfo?.public_url || '').trim();
  return {
    assetId,
    downloadUrl
  };
}

function triggerUpload() {
  uploadInputRef.value?.click();
}

async function onUploadChange(event) {
  const file = event?.target?.files?.[0];
  if (event?.target) {
    event.target.value = '';
  }
  if (!file) return;

  errorText.value = '';
  hintText.value = '';
  uploading.value = true;

  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      const uploaded = await uploadImageAsset(file);
      draft.iconMode = 'UPLOAD';
      draft.iconAssetId = uploaded.assetId;
      if (uploaded.downloadUrl) {
        draft.faviconUrl = uploaded.downloadUrl;
      }
      hintText.value = '图标上传成功。';
      return;
    }

    const dataUrl = await fileToDataUrl(file);
    draft.iconMode = 'UPLOAD';
    draft.iconAssetId = null;
    draft.faviconUrl = dataUrl;
    hintText.value = '已使用会话临时图标。';
  } catch (error) {
    errorText.value = error?.message || '图标上传失败';
  } finally {
    uploading.value = false;
  }
}

async function submitLink() {
  errorText.value = '';
  hintText.value = '';
  const targetUrl = normalizeUrl(draft.url);
  if (!isValidUrl(targetUrl)) {
    errorText.value = '请输入合法的 http/https URL';
    return;
  }

  saving.value = true;
  try {
    await auth.ensureReady();

    if (auth.isAuthenticated.value) {
      const payload = buildPayload();
      if (editingId.value) {
        await updateLightAppUrlLink(editingId.value, payload, auth.authorizedFetch);
      } else {
        await createLightAppUrlLink(payload, auth.authorizedFetch);
      }
      const list = await listLightAppUrlLinks(auth.authorizedFetch);
      links.value = sortLinks(list);
      writeRemoteLightAppCache({ urlLinks: links.value });
      syncLightAppsRuntime();
      showForm.value = false;
      resetDraft();
      return;
    }

    const current = links.value.slice();
    if (editingId.value) {
      persistGuest(
        current.map((item) => {
          if (item.urlLinkId !== editingId.value) return item;
          return {
            ...item,
            ...buildPayload(),
            iconMode: draft.iconMode || 'AUTO',
            iconAssetId: draft.iconAssetId,
            updatedAt: new Date().toISOString()
          };
        })
      );
      showForm.value = false;
      resetDraft();
      return;
    }

    const nextId = createLocalEntityId();
    const maxSort = current.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
    persistGuest([
      ...current,
      {
        urlLinkId: nextId,
        ...buildPayload(),
        iconMode: draft.iconMode || 'AUTO',
        iconAssetId: draft.iconAssetId,
        sortNum: maxSort + 10,
        updatedAt: new Date().toISOString()
      }
    ]);
    showForm.value = false;
    resetDraft();
  } catch (error) {
    errorText.value = error?.message || '网址保存失败';
  } finally {
    saving.value = false;
  }
}

async function removeLink(urlLinkId) {
  errorText.value = '';
  hintText.value = '';
  const normalizedId = Number(urlLinkId);
  if (!Number.isInteger(normalizedId) || normalizedId <= 0) return;

  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppUrlLink(normalizedId, auth.authorizedFetch);
      const list = await listLightAppUrlLinks(auth.authorizedFetch);
      links.value = sortLinks(list);
      writeRemoteLightAppCache({ urlLinks: links.value });
      syncLightAppsRuntime();
      if (editingId.value === normalizedId) {
        cancelEditing();
      }
      return;
    }

    persistGuest(links.value.filter((item) => item.urlLinkId !== normalizedId));
    if (editingId.value === normalizedId) {
      cancelEditing();
    }
  } catch (error) {
    errorText.value = error?.message || '删除失败';
  }
}

function openUrl(url) {
  const target = normalizeUrl(url);
  if (!isValidUrl(target)) return;
  window.open(target, '_blank', 'noopener,noreferrer');
}

onMounted(async () => {
  await hydrate();
});
</script>

<style scoped>
.url-links-window {
  display: grid;
  gap: 10px;
}

.top-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
}

.toolbar-hint {
  color: rgba(46, 56, 72, 0.82);
  font-size: 12px;
}

.url-form {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(0, 1fr) minmax(0, 1fr) auto;
  gap: 8px;
  align-items: center;
}

.form-actions {
  display: inline-flex;
  gap: 6px;
}

.hidden-file {
  display: none;
}

.info-text {
  margin: 0;
  color: rgba(28, 126, 90, 0.9);
  font-size: 12px;
}

.url-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.url-item {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
  align-items: center;
  padding: 8px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.34);
  background: rgba(255, 255, 255, 0.22);
}

.url-main {
  border: 0;
  background: transparent;
  text-align: left;
  display: grid;
  grid-template-columns: 24px minmax(0, 1fr);
  gap: 8px;
  align-items: center;
  color: inherit;
}

.url-main img,
.url-main i {
  width: 20px;
  height: 20px;
  border-radius: 6px;
  object-fit: cover;
}

.url-main p {
  margin: 0;
  color: rgba(36, 45, 62, 0.96);
}

.url-main small {
  color: rgba(60, 72, 94, 0.76);
}

.url-actions {
  display: inline-flex;
  gap: 6px;
}

@media (max-width: 980px) {
  .url-form {
    grid-template-columns: 1fr;
  }
}
</style>
