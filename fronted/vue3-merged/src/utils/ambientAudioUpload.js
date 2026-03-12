const MAX_AMBIENT_AUDIO_SIZE = 50 * 1024 * 1024;
const ALLOWED_AUDIO_TYPES = new Set([
  'audio/mpeg',
  'audio/mp3',
  'audio/wav',
  'audio/x-wav',
  'audio/ogg',
  'audio/flac',
  'audio/aac',
  'audio/mp4'
]);

function unwrapApi(response) {
  if (response && typeof response === 'object' && 'data' in response) {
    return response.data;
  }
  return response;
}

function sanitizeAudioFileName(rawName, contentType) {
  const source = String(rawName || '').trim();
  const base = (source || 'ambient-track')
    .toLowerCase()
    .replace(/\.[a-z0-9]+$/i, '')
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');

  const ext =
    contentType === 'audio/wav' || contentType === 'audio/x-wav'
      ? '.wav'
      : contentType === 'audio/ogg'
        ? '.ogg'
        : contentType === 'audio/flac'
          ? '.flac'
          : contentType === 'audio/aac'
            ? '.aac'
            : contentType === 'audio/mp4'
              ? '.m4a'
              : '.mp3';

  return `${base || 'ambient-track'}${ext}`;
}

export function validateAmbientAudioFile(file) {
  if (!(file instanceof File)) {
    throw new Error('请选择音频文件');
  }
  const contentType = String(file.type || '').trim().toLowerCase();
  if (!ALLOWED_AUDIO_TYPES.has(contentType)) {
    throw new Error('仅支持 mp3/wav/ogg/flac/aac/m4a 音频');
  }
  if (Number(file.size || 0) > MAX_AMBIENT_AUDIO_SIZE) {
    throw new Error('环境音文件需 <= 50MB');
  }
  return contentType;
}

export function fileToDataUrl(file) {
  return new Promise((resolve, reject) => {
    const reader = new FileReader();
    reader.onload = () => resolve(String(reader.result || ''));
    reader.onerror = () => reject(new Error('读取音频文件失败'));
    reader.readAsDataURL(file);
  });
}

export async function uploadAmbientAudioAsset(file, authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required');
  }

  const contentType = validateAmbientAudioFile(file);
  const fileName = sanitizeAudioFileName(file.name || 'ambient-track.mp3', contentType);

  const policy = unwrapApi(
    await authorizedFetch('/api/v1/assets/upload-policies', {
      method: 'POST',
      body: {
        fileName,
        contentType,
        assetKind: 'AUDIO',
        visibility: 'PRIVATE'
      }
    })
  );

  let uploadUrl = String(policy?.uploadUrl || policy?.upload_url || '').trim();
  let bucket = String(policy?.bucket || '').trim();
  let key = String(policy?.key || '').trim();
  let normalizedContentType = contentType;

  if (!uploadUrl || !bucket || !key) {
    throw new Error('上传策略无效');
  }

  try {
    const direct = await fetch(uploadUrl, {
      method: 'PUT',
      headers: {
        'Content-Type': contentType
      },
      body: file
    });
    if (!direct.ok) {
      throw new Error(`direct upload failed (${direct.status})`);
    }
  } catch {
    const relayForm = new FormData();
    relayForm.append('file', file, file.name || fileName);
    relayForm.append('asset_kind', 'AUDIO');
    relayForm.append('visibility', 'PRIVATE');

    const relayPayload = unwrapApi(
      await authorizedFetch('/api/v1/assets/upload-relay', {
        method: 'POST',
        body: relayForm
      })
    );

    bucket = String(relayPayload?.bucket || '').trim();
    key = String(relayPayload?.key || '').trim();
    normalizedContentType =
      String(relayPayload?.contentType || relayPayload?.content_type || contentType).trim() || contentType;
    if (!bucket || !key) {
      throw new Error('上传失败，请重试');
    }
  }

  const created = unwrapApi(
    await authorizedFetch('/api/v1/assets', {
      method: 'POST',
      body: {
        bucket,
        key,
        assetType: 'audio',
        assetKind: 'AUDIO',
        contentType: normalizedContentType,
        visibility: 'PRIVATE',
        metadata: {
          usage: 'ambient_sound'
        }
      }
    })
  );

  const assetId = Number(created?.assetId ?? created?.asset_id);
  if (!Number.isInteger(assetId) || assetId <= 0) {
    throw new Error('环境音资产创建失败');
  }

  const downloadInfo = unwrapApi(
    await authorizedFetch(`/api/v1/assets/${encodeURIComponent(assetId)}/download-url`, {
      method: 'GET'
    })
  );

  return {
    assetId,
    title: String(file.name || 'Uploaded Ambient').trim() || 'Uploaded Ambient',
    downloadUrl:
      String(downloadInfo?.downloadUrl || downloadInfo?.download_url || downloadInfo?.publicUrl || downloadInfo?.public_url || '').trim(),
    contentType: normalizedContentType
  };
}
