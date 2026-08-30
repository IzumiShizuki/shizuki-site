function normalizeText(value) {
  return String(value ?? '');
}
function normalizeCodes(value) {
  if (Array.isArray(value)) {
    return value.map(normalizeText).map((item) => item.trim()).filter(Boolean);
  }
  return normalizeText(value)
    .split(',')
    .map((item) => item.trim())
    .filter(Boolean);
}

export function createBlogEditorSnapshot(editor = {}) {
  return JSON.stringify({
    title: normalizeText(editor.title).trim(),
    summary: normalizeText(editor.summary).trim(),
    categoryCode: normalizeText(editor.categoryCode).trim().toLowerCase(),
    slugCode: normalizeText(editor.slugCode).trim(),
    coverImageUrl: normalizeText(editor.coverImageUrl).trim(),
    visibility: normalizeText(editor.visibility || 'PUBLIC').trim().toUpperCase(),
    tags: normalizeCodes(editor.tagsText).map((item) => item.replace(/^#+/, '').toLowerCase()),
    allowedGroupCodes: normalizeCodes(editor.allowedGroupCodesText).map((item) => item.toUpperCase()),
    markdown: normalizeText(editor.markdown).replace(/\r\n?/g, '\n')
  });
}

export function hasBlogEditorUnsavedChanges(editor, baselineSnapshot) {
  if (typeof baselineSnapshot !== 'string') return false;
  return createBlogEditorSnapshot(editor) !== baselineSnapshot;
}
