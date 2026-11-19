const RANKING_FIELDS = ['release', 'dl_count', 'rate_average_2dp', 'review_count'];
const SHAREABLE_AGE_FILTERS = ['safe', 'general', 'r15'];

export function voiceTagId(value) {
  const id = Number(value);
  return Number.isSafeInteger(id) && id > 0 ? id : 0;
}

export function voiceTagLabel(tag) {
  return tag?.name || `标签 #${tag?.tagId}`;
}

export function normalizeVoiceTags(raw, { requireId = false } = {}) {
  const tags = new Map();
  for (const item of Array.isArray(raw) ? raw : []) {
    const tagId = voiceTagId(item?.tagId ?? item?.tag_id ?? item?.id);
    const sourceName = (typeof item === 'string' ? item : String(item?.sourceName ?? item?.name ?? ''))
      .trim().replace(/\s+/gu, ' ');
    const displayName = String(item?.displayName ?? item?.display_name ?? '').trim().replace(/\s+/gu, ' ');
    const name = displayName || String(item?.name ?? '').trim().replace(/\s+/gu, ' ') || sourceName;
    if (requireId ? !tagId : !tagId && !name) continue;
    const key = tagId || name.normalize('NFKC').toLocaleLowerCase();
    const current = tags.get(key);
    if (!current || (!current.name && name) || (displayName && !current.sourceName)) {
      tags.set(key, { tagId, name, ...(sourceName && sourceName !== name ? { sourceName } : {}) });
    }
  }
  return [...tags.values()];
}

export function readVoiceCatalogueQuery(query = {}) {
  const field = (key) => typeof query[key] === 'string' ? query[key] : '';
  const order = field('voiceOrder');
  const ageFilter = field('voiceAge');
  return {
    keyword: field('q').trim().slice(0, 200),
    order: RANKING_FIELDS.includes(order) ? order : 'release',
    sort: field('voiceSort') === 'asc' ? 'asc' : 'desc',
    ageFilter: SHAREABLE_AGE_FILTERS.includes(ageFilter) ? ageFilter : 'safe',
    tagIds: [...new Set(field('voiceTags').split(',').map(voiceTagId).filter(Boolean))].slice(0, 20)
  };
}

export function writeVoiceCatalogueQuery(options) {
  const query = {};
  if (options.keyword) query.q = options.keyword;
  if (RANKING_FIELDS.includes(options.order) && options.order !== 'release') query.voiceOrder = options.order;
  if (options.sort === 'asc') query.voiceSort = 'asc';
  if (SHAREABLE_AGE_FILTERS.includes(options.ageFilter) && options.ageFilter !== 'safe') query.voiceAge = options.ageFilter;
  if (options.tagIds.length) query.voiceTags = options.tagIds.join(',');
  return query;
}

export function resolveVoiceCover(raw) {
  const value = String(raw || '').trim();
  if (/^https?:\/\//i.test(value) || /^\/(?![/\\])/u.test(value)) return value;
  return value.startsWith('//') && !value.startsWith('///') ? `https:${value}` : '';
}
