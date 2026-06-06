function readField(raw, ...keys) {
  if (!raw || typeof raw !== 'object') return '';
  for (const key of keys) {
    if (Object.prototype.hasOwnProperty.call(raw, key)) {
      return raw[key];
    }
  }
  return '';
}

export function normalizeCompanionL2dAsset(raw = {}, index = 0) {
  const assetId = Number(readField(raw, 'assetId', 'asset_id', 'visualAssetId', 'visual_asset_id', 'wallpaperId', 'wallpaper_id'));
  const assetKind = String(readField(raw, 'assetKind', 'asset_kind', 'sceneType', 'scene_type', '') || '').trim().toUpperCase();
  const title = String(readField(raw, 'title', 'name', '') || '').trim();
  const modelUrl = String(readField(raw, 'downloadUrl', 'download_url', 'visualUrl', 'visual_url', 'src', '') || '').trim();
  const modelEntry = String(readField(raw, 'l2dEntryModelJson', 'l2d_entry_model_json', 'modelEntry', 'model_entry', '') || '').trim();
  const fallbackSrc = String(readField(raw, 'coverUrl', 'cover_url', 'previewUrl', 'preview_url', 'preview', 'visualUrl', 'visual_url', '') || '').trim();
  const isL2d =
    assetKind === 'LIVE2D_PACKAGE' ||
    assetKind === 'L2D' ||
    assetKind === 'LIVE2D' ||
    String(readField(raw, 'type', '') || '').trim().toLowerCase() === 'l2d';

  return {
    key: Number.isFinite(assetId) && assetId > 0 ? `l2d-${assetId}` : `l2d-temp-${index}`,
    assetId: Number.isFinite(assetId) && assetId > 0 ? assetId : 0,
    title: title || 'L2D companion',
    assetKind,
    modelUrl,
    modelEntry,
    fallbackSrc,
    ready: Boolean(isL2d && modelUrl && modelEntry)
  };
}

export function selectCompanionL2dAsset(items = [], preferredAssetId = 0) {
  const normalized = Array.isArray(items)
    ? items.map((item, index) => normalizeCompanionL2dAsset(item, index)).filter((item) => item.ready)
    : [];
  if (!normalized.length) return null;

  const preferredId = Number(preferredAssetId);
  if (Number.isFinite(preferredId) && preferredId > 0) {
    const preferred = normalized.find((item) => item.assetId === preferredId);
    if (preferred) return preferred;
  }

  return normalized[0];
}

export function resolveCompanionStageStatus(event = {}, fallback = 'idle') {
  const rawStatus = String(event?.status || event?.state || '').trim().toLowerCase();
  if (rawStatus === 'thinking' || rawStatus === 'speaking' || rawStatus === 'idle') {
    return rawStatus;
  }
  if (event?.pending === true || event?.phase === 'send-start') {
    return 'thinking';
  }
  if (String(event?.assistantMessage || event?.assistant_message || '').trim()) {
    return 'speaking';
  }
  return fallback === 'thinking' || fallback === 'speaking' ? fallback : 'idle';
}
