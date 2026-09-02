const ATMOSPHERE_PANEL_TABS = new Set(['scenes', 'colors', 'music', 'ambient', 'online', 'effects']);

/**
 * 应用壳层接受的氛围面板标签。未知值维持历史回退到音乐页。
 */
export function normalizeAtmospherePanelTab(tabKey) {
  const requested = String(tabKey || '').trim();
  return ATMOSPHERE_PANEL_TABS.has(requested) ? requested : 'music';
}

/**
 * 将公开状态接口结果变成面板可直接使用的稳定状态。
 */
export function normalizeAmbientLibraryAvailability(status) {
  return {
    checked: true,
    enabled: Boolean(status?.enabled),
    provider: String(status?.provider || 'freesound'),
    error: String(status?.error || '').trim()
  };
}

/**
 * 按 provider sound id 索引已经写进环境音偏好的私有资产，供刷新后恢复“已保存”状态。
 */
export function indexImportedAmbientAssets(tracks) {
  const result = {};
  (Array.isArray(tracks) ? tracks : []).forEach((track) => {
    const soundId = String(track?.sourceSoundId || track?.source_sound_id || '').trim();
    const assetId = Number(track?.assetId ?? track?.asset_id);
    if (track?.source !== 'asset' || !soundId || !Number.isInteger(assetId) || assetId <= 0) return;
    result[soundId] = track;
  });
  return result;
}

/**
 * 将持久化导入结果转换为现有环境音状态能够消费的私有资产轨道。
 */
export function createImportedAmbientAssetTrack(imported) {
  const assetId = Number(imported?.assetId);
  if (!Number.isInteger(assetId) || assetId <= 0) return null;
  return {
    trackId: `asset:${assetId}`,
    source: 'asset',
    assetId,
    enabled: true,
    volume: 0.72,
    title: String(imported?.title || '在线环境音').trim() || '在线环境音',
    sourceProvider: String(imported?.provider || 'freesound').trim() || 'freesound',
    sourceSoundId: String(imported?.soundId || '').trim(),
    author: String(imported?.author || '').trim(),
    license: String(imported?.license || '').trim(),
    licenseName: String(imported?.licenseName || '').trim(),
    pageUrl: String(imported?.pageUrl || '').trim()
  };
}
