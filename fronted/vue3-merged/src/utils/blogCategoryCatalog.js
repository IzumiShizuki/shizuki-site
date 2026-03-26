function normalizeString(value, fallback = '') {
  return typeof value === 'string' ? value : fallback;
}

function normalizeCategoryCode(value) {
  return normalizeString(value).trim().toLowerCase();
}

function normalizeSortNum(value, fallback = 1000) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? Math.max(0, Math.trunc(normalized)) : fallback;
}

export function normalizeBlogCategoryCatalogItem(raw, source = 'sidebar') {
  const categoryCode = normalizeCategoryCode(raw?.categoryCode ?? raw?.category_code);
  if (!categoryCode) return null;
  return {
    categoryCode,
    displayName: normalizeString(raw?.displayName ?? raw?.display_name).trim() || categoryCode,
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url).trim(),
    count: Math.max(0, Number(raw?.count) || 0),
    sortNum: normalizeSortNum(raw?.sortNum ?? raw?.sort_num, source === 'meta' ? 1000 : Number.MAX_SAFE_INTEGER),
    enabled: source === 'meta' ? raw?.enabled !== false : true
  };
}

export function mergeBlogCategoryCatalog(sidebarCategories = [], metaCategories = []) {
  const itemMap = new Map();

  const appendItem = (item, source) => {
    const normalized = normalizeBlogCategoryCatalogItem(item, source);
    if (!normalized) return;
    const current = itemMap.get(normalized.categoryCode) || {
      categoryCode: normalized.categoryCode,
      displayName: normalized.categoryCode,
      coverImageUrl: '',
      count: 0,
      sortNum: source === 'meta' ? 1000 : Number.MAX_SAFE_INTEGER,
      enabled: true
    };
    itemMap.set(normalized.categoryCode, {
      ...current,
      categoryCode: normalized.categoryCode,
      displayName: normalized.displayName || current.displayName || normalized.categoryCode,
      coverImageUrl: normalized.coverImageUrl || current.coverImageUrl || '',
      count: Math.max(current.count || 0, normalized.count || 0),
      sortNum: source === 'meta' ? normalized.sortNum : current.sortNum,
      enabled: source === 'meta' ? normalized.enabled : current.enabled
    });
  };

  (Array.isArray(sidebarCategories) ? sidebarCategories : []).forEach((item) => appendItem(item, 'sidebar'));
  (Array.isArray(metaCategories) ? metaCategories : []).forEach((item) => appendItem(item, 'meta'));

  return Array.from(itemMap.values()).sort((left, right) => {
    const sortCompare = normalizeSortNum(left.sortNum, 1000) - normalizeSortNum(right.sortNum, 1000);
    if (sortCompare !== 0) return sortCompare;
    const leftName = normalizeString(left.displayName || left.categoryCode);
    const rightName = normalizeString(right.displayName || right.categoryCode);
    return leftName.localeCompare(rightName);
  });
}

export function filterEnabledBlogCategories(items = []) {
  return (Array.isArray(items) ? items : []).filter((item) => item && item.enabled !== false);
}

export function resolveDefaultBlogCategoryCode(items = []) {
  const first = filterEnabledBlogCategories(items)[0];
  return normalizeCategoryCode(first?.categoryCode);
}

export function buildEditorCategoryOptions(enabledItems = [], currentCategoryCode = '') {
  const normalizedCurrentCode = normalizeCategoryCode(currentCategoryCode);
  const options = filterEnabledBlogCategories(enabledItems).map((item) => ({
    code: normalizeCategoryCode(item.categoryCode),
    label: normalizeString(item.displayName || item.categoryCode).trim() || normalizeCategoryCode(item.categoryCode),
    disabled: false
  }));

  if (normalizedCurrentCode && !options.some((item) => item.code === normalizedCurrentCode)) {
    options.unshift({
      code: normalizedCurrentCode,
      label: `${normalizedCurrentCode}（已禁用）`,
      disabled: true
    });
  }

  return options;
}
