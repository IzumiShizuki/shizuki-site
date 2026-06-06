function toNumber(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

function toString(value, fallback = '') {
  return typeof value === 'string' ? value : fallback;
}

function toStringList(value) {
  if (!Array.isArray(value)) return [];
  return value.map((item) => String(item || '').trim()).filter(Boolean);
}

function pick(raw, camelKey, snakeKey, fallback = undefined) {
  if (!raw || typeof raw !== 'object') return fallback;
  if (Object.prototype.hasOwnProperty.call(raw, camelKey)) return raw[camelKey];
  if (Object.prototype.hasOwnProperty.call(raw, snakeKey)) return raw[snakeKey];
  return fallback;
}

export function formatVideoTimestamp(seconds) {
  const total = Math.max(0, Math.floor(toNumber(seconds, 0)));
  const hour = Math.floor(total / 3600);
  const minute = Math.floor((total % 3600) / 60);
  const second = total % 60;
  return [hour, minute, second].map((part) => String(part).padStart(2, '0')).join(':');
}

export function normalizeVideoSource(raw = {}) {
  const chapters = Array.isArray(raw?.chapters)
    ? raw.chapters.map((item) => ({
        title: toString(item?.title, 'Chapter'),
        start: toNumber(item?.start, 0),
        end: toNumber(item?.end, 0)
      }))
    : [];
  return {
    sourceUrl: toString(pick(raw, 'sourceUrl', 'source_url')),
    platform: toString(raw?.platform),
    title: toString(raw?.title),
    author: toString(raw?.author),
    durationSeconds: Math.max(0, toNumber(pick(raw, 'durationSeconds', 'duration_seconds'), 0)),
    thumbnailUrl: toString(pick(raw, 'thumbnailUrl', 'thumbnail_url')),
    chapters,
    availableSubtitles: toStringList(pick(raw, 'availableSubtitles', 'available_subtitles', [])),
    availableAutoCaptions: toStringList(pick(raw, 'availableAutoCaptions', 'available_auto_captions', [])),
    needsCookies: Boolean(pick(raw, 'needsCookies', 'needs_cookies', false)),
    metadata: raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {}
  };
}

export function normalizeVideoTranscript(raw = {}) {
  const segments = Array.isArray(raw?.segments)
    ? raw.segments.map((item) => ({
        start: toNumber(item?.start, 0),
        end: toNumber(item?.end, 0),
        text: toString(item?.text)
      }))
    : [];
  const rawFormats = raw?.formats && typeof raw.formats === 'object' ? raw.formats : {};
  return {
    source: normalizeVideoSource(raw?.source),
    transcriptSource: toString(pick(raw, 'transcriptSource', 'transcript_source')),
    segments,
    formats: {
      txt: toString(rawFormats.txt),
      md: toString(rawFormats.md),
      srt: toString(rawFormats.srt),
      vtt: toString(rawFormats.vtt),
      json: Array.isArray(rawFormats.json) ? rawFormats.json : segments
    },
    toolStatus: normalizeToolStatus(pick(raw, 'toolStatus', 'tool_status', []))
  };
}

export function normalizeToolStatus(raw = []) {
  if (!Array.isArray(raw)) return [];
  return raw.map((item) => ({
    name: toString(item?.name),
    available: Boolean(item?.available),
    detail: toString(item?.detail)
  }));
}

export function normalizeVideoSummary(raw = {}) {
  return {
    source: normalizeVideoSource(raw?.source),
    markdown: toString(raw?.markdown),
    summary: toStringList(raw?.summary),
    timeline: normalizeTimeline(raw?.timeline),
    keyframes: normalizeKeyframes(raw?.keyframes),
    ocr: normalizeOcr(raw?.ocr),
    transcript: normalizeVideoTranscript(raw?.transcript),
    toolStatus: normalizeToolStatus(pick(raw, 'toolStatus', 'tool_status', []))
  };
}

function normalizeTimeline(raw = []) {
  if (!Array.isArray(raw)) return [];
  return raw.map((item) => ({
    start: toNumber(item?.start, 0),
    end: toNumber(item?.end, 0),
    title: toString(item?.title),
    summary: toString(item?.summary)
  }));
}

function normalizeKeyframes(raw = []) {
  if (!Array.isArray(raw)) return [];
  return raw.map((item) => ({
    id: toString(item?.id),
    timestamp: toNumber(item?.timestamp, 0),
    description: toString(item?.description)
  }));
}

function normalizeOcr(raw = []) {
  if (!Array.isArray(raw)) return [];
  return raw.map((item) => ({
    frameId: toString(pick(item, 'frameId', 'frame_id')),
    timestamp: toNumber(item?.timestamp, 0),
    texts: toStringList(item?.texts)
  }));
}

export function buildVideoNoteMarkdown(result) {
  const normalized = result?.markdown ? normalizeVideoSummary(result) : null;
  if (normalized?.markdown) {
    return normalized.markdown.trim();
  }
  const transcript = result?.transcriptSource || result?.formats ? normalizeVideoTranscript(result) : normalizeVideoTranscript(result?.transcript);
  const title = transcript.source.title || '视频转写笔记';
  const transcriptMarkdown = transcript.formats.md || transcript.formats.txt || '暂无转写。';
  return [`# ${title}`, '', '## 完整转写', '', transcriptMarkdown].join('\n').trim();
}
