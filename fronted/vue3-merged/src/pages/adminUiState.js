export const AdminTabKey = Object.freeze({
  USERS: 'users',
  GROUPS: 'groups',
  PERMISSIONS: 'permissions',
  QUOTA: 'quota',
  BLOG_CATEGORIES: 'blog-categories',
  WALLPAPERS: 'wallpapers'
});

export function normalizeCodeList(input, upperCase = false) {
  let rawItems = [];
  if (Array.isArray(input)) {
    rawItems = input;
  } else {
    rawItems = String(input || '').split(/[\s,，;；]+/);
  }
  const normalized = rawItems
    .map((item) => String(item || '').trim())
    .filter(Boolean)
    .map((item) => (upperCase ? item.toUpperCase() : item));
  return Array.from(new Set(normalized));
}

export function toggleCodeSelection(selectedCodes, code, upperCase = false) {
  const normalizedCode = String(code || '').trim();
  if (!normalizedCode) return normalizeCodeList(selectedCodes, upperCase);
  const normalizedSelected = normalizeCodeList(selectedCodes, upperCase);
  const target = upperCase ? normalizedCode.toUpperCase() : normalizedCode;
  if (normalizedSelected.includes(target)) {
    return normalizedSelected.filter((item) => item !== target);
  }
  return [...normalizedSelected, target];
}

export function mergeCatalogCodes(baseCodes, extraCodes, upperCase = false) {
  return normalizeCodeList([...(baseCodes || []), ...(extraCodes || [])], upperCase);
}

export function buildQuotaMatrix(groupOptions, quotaCodes, policies) {
  const groupList = Array.isArray(groupOptions) ? groupOptions : [];
  const quotaList = normalizeCodeList(quotaCodes, false);
  const policyList = Array.isArray(policies) ? policies : [];

  const rows = groupList.map((group) => ({
    groupCode: String(group.groupCode || '').toUpperCase(),
    displayName: String(group.displayName || group.groupCode || '').trim(),
    status: String(group.status || '').toUpperCase(),
    builtIn: Number(group.builtIn || 0) > 0,
    values: {},
    policyIds: {}
  }));

  const rowMap = new Map(rows.map((row) => [row.groupCode, row]));
  policyList.forEach((policy) => {
    const groupCode = String(policy.groupCode || '').toUpperCase();
    const quotaCode = String(policy.quotaCode || '').trim();
    if (!groupCode || !quotaCode) return;
    const row = rowMap.get(groupCode);
    if (!row) return;
    row.values[quotaCode] = Number(policy.value ?? 0);
    row.policyIds[quotaCode] = String(policy.policyId || '');
    if (!quotaList.includes(quotaCode)) {
      quotaList.push(quotaCode);
    }
  });

  return {
    quotaCodes: quotaList,
    rows
  };
}

export function upsertQuotaCell(rows, groupCode, quotaCode, rawValue) {
  const normalizedGroupCode = String(groupCode || '').toUpperCase();
  const normalizedQuotaCode = String(quotaCode || '').trim();
  const numeric = Number(rawValue);
  const safeValue = Number.isFinite(numeric) && numeric >= 0 ? Math.floor(numeric) : 0;
  return rows.map((row) => {
    if (row.groupCode !== normalizedGroupCode) return row;
    return {
      ...row,
      values: {
        ...row.values,
        [normalizedQuotaCode]: safeValue
      }
    };
  });
}

export function buildQuotaPayloadForGroup(row, quotaCodes) {
  const groupCode = String(row?.groupCode || '').toUpperCase();
  if (!groupCode) return [];
  return normalizeCodeList(quotaCodes, false).map((quotaCode) => {
    const existingPolicyId = String(row.policyIds?.[quotaCode] || '').trim();
    const valueRaw = row.values?.[quotaCode];
    const value = Number.isFinite(Number(valueRaw)) ? Math.floor(Number(valueRaw)) : 0;
    return {
      policyId: existingPolicyId || `policy-${groupCode.toLowerCase()}-${quotaCode}`,
      groupCode,
      quotaCode,
      value
    };
  });
}

export function createAdminUiState() {
  return {
    permissionsAdvanced: false,
    quotaAdvanced: false
  };
}
