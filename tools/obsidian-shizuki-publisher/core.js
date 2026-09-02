'use strict';

const SUPPORTED_IMAGE_EXTENSIONS = new Set(['png', 'jpg', 'jpeg', 'webp', 'gif']);

function stripYamlFrontmatter(markdown) {
  const source = String(markdown || '');
  return source.replace(/^\uFEFF?---[ \t]*\r?\n[\s\S]*?\r?\n---[ \t]*\r?\n?/, '');
}

function normalizeString(value) {
  return value == null ? '' : String(value).trim();
}

function normalizeStringArray(value) {
  const values = Array.isArray(value)
    ? value
    : typeof value === 'string'
      ? value.split(',')
      : value == null
        ? []
        : [value];
  return [...new Set(values.map(normalizeString).filter(Boolean))];
}

function firstNonEmpty(...values) {
  for (const value of values) {
    const normalized = normalizeString(value);
    if (normalized) return normalized;
  }
  return '';
}

function normalizeVisibility(value, fallback = 'PUBLIC') {
  const normalized = firstNonEmpty(value, fallback).toUpperCase();
  return ['PUBLIC', 'PRIVATE', 'UNLISTED'].includes(normalized) ? normalized : String(fallback).toUpperCase();
}

function buildPostPayload({ fileBasename, frontmatter = {}, markdown, defaults = {} }) {
  const title = firstNonEmpty(frontmatter.title, fileBasename, 'Untitled');
  const categoryCode = firstNonEmpty(
    frontmatter.shizuki_category,
    frontmatter.categoryCode,
    frontmatter.category,
    defaults.categoryCode,
    'life'
  );
  const slugCode = firstNonEmpty(frontmatter.shizuki_slug, frontmatter.slugCode, frontmatter.slug);
  const coverImageUrl = firstNonEmpty(
    frontmatter.shizuki_cover,
    frontmatter.coverImageUrl,
    frontmatter.cover
  );
  const postId = Number(frontmatter.shizuki_post_id ?? frontmatter.shizukiPostId);

  return {
    postId: Number.isInteger(postId) && postId > 0 ? postId : null,
    payload: {
      title,
      summary: firstNonEmpty(frontmatter.summary, frontmatter.description),
      categoryCode,
      slugCode: slugCode || undefined,
      coverImageUrl: coverImageUrl || undefined,
      visibility: normalizeVisibility(frontmatter.visibility, defaults.visibility || 'PUBLIC'),
      allowedGroupCodes: normalizeStringArray(
        frontmatter.allowedGroupCodes ?? frontmatter.allowed_groups ?? frontmatter.groups
      ),
      tags: normalizeStringArray(frontmatter.tags),
      markdown: stripYamlFrontmatter(markdown)
    }
  };
}

function stripTargetDecorations(target) {
  const normalized = normalizeString(target).replace(/^<|>$/g, '');
  return normalized.split('#')[0].split('?')[0];
}

function extensionForTarget(target) {
  const cleaned = stripTargetDecorations(target).toLowerCase();
  if (cleaned.endsWith('.drawio.svg')) return 'drawio.svg';
  const match = cleaned.match(/\.([a-z0-9]+)$/i);
  return match ? match[1].toLowerCase() : '';
}

function isRemoteTarget(target) {
  return /^(?:[a-z][a-z0-9+.-]*:|\/\/)/i.test(normalizeString(target));
}

function isSupportedVisualTarget(target) {
  if (!target || isRemoteTarget(target)) return false;
  const extension = extensionForTarget(target);
  return extension === 'drawio.svg' || SUPPORTED_IMAGE_EXTENSIONS.has(extension);
}

function discoverVisualEmbeds(markdown) {
  const source = String(markdown || '');
  const embeds = [];
  const wikiPattern = /!\[\[([^\]|]+?)(?:\|([^\]]*))?\]\]/g;
  const markdownPattern = /!\[([^\]]*)\]\((<[^>]+>|[^\s)]+)(?:\s+(?:"[^"]*"|'[^']*'|\([^)]*\)))?\)/g;

  for (const match of source.matchAll(wikiPattern)) {
    const target = normalizeString(match[1]);
    if (!isSupportedVisualTarget(target)) continue;
    embeds.push({
      syntax: 'wiki',
      raw: match[0],
      target,
      alt: normalizeString(match[2]) || target.split(/[\\/]/).pop() || 'image',
      start: match.index,
      end: match.index + match[0].length
    });
  }

  for (const match of source.matchAll(markdownPattern)) {
    const target = normalizeString(match[2]).replace(/^<|>$/g, '');
    if (!isSupportedVisualTarget(target)) continue;
    embeds.push({
      syntax: 'markdown',
      raw: match[0],
      target,
      alt: normalizeString(match[1]) || target.split(/[\\/]/).pop() || 'image',
      start: match.index,
      end: match.index + match[0].length
    });
  }

  return embeds.sort((left, right) => left.start - right.start);
}

function escapeMarkdownAlt(value) {
  return normalizeString(value).replace(/([\[\]\\])/g, '\\$1');
}

function applyEmbedReplacements(markdown, replacements) {
  let result = String(markdown || '');
  const sorted = [...replacements].sort((left, right) => right.start - left.start);
  for (const replacement of sorted) {
    if (!Number.isInteger(replacement.start) || !Number.isInteger(replacement.end)) {
      throw new TypeError('Embed replacement requires integer start and end offsets.');
    }
    const rendered = `![${escapeMarkdownAlt(replacement.alt)}](${normalizeString(replacement.url)})`;
    result = result.slice(0, replacement.start) + rendered + result.slice(replacement.end);
  }
  return result;
}

async function rewriteVisualEmbeds(markdown, resolvePublicUrl, onProgress) {
  if (typeof resolvePublicUrl !== 'function') {
    throw new TypeError('resolvePublicUrl must be a function.');
  }
  const embeds = discoverVisualEmbeds(markdown);
  const replacements = [];
  for (let index = 0; index < embeds.length; index += 1) {
    const embed = embeds[index];
    const url = await resolvePublicUrl(embed, index);
    if (!normalizeString(url)) throw new Error(`No public URL returned for ${embed.target}`);
    replacements.push({ ...embed, url });
    onProgress?.(index + 1, embeds.length);
  }
  return applyEmbedReplacements(markdown, replacements);
}

function normalizeApiData(payload) {
  if (payload == null) return payload;
  if (typeof payload !== 'object') return payload;
  if (Object.prototype.hasOwnProperty.call(payload, 'data') && (
    Object.prototype.hasOwnProperty.call(payload, 'code')
    || Object.prototype.hasOwnProperty.call(payload, 'success')
    || Object.prototype.hasOwnProperty.call(payload, 'message')
  )) {
    return payload.data;
  }
  return payload;
}

function normalizeTokenPayload(payload) {
  const value = normalizeApiData(payload) || {};
  return {
    resultType: firstNonEmpty(value.resultType, value.result_type),
    accessToken: firstNonEmpty(value.accessToken, value.access_token),
    refreshToken: firstNonEmpty(value.refreshToken, value.refresh_token),
    userId: Number(value.userId ?? value.user_id) || 0,
    expiresIn: Number(value.expiresIn ?? value.expires_in) || 0
  };
}

function normalizeEditorOrigin(editorUrl) {
  const raw = firstNonEmpty(editorUrl, 'https://embed.diagrams.net/');
  return raw.replace(/\/+$/, '');
}

function buildDrawioEditorUrl(editorUrl, theme = 'dark') {
  const baseUrl = normalizeEditorOrigin(editorUrl);
  const params = new URLSearchParams({ embed: '1', proto: 'json', libraries: '1', spin: '1' });
  if (theme === 'dark') params.set('ui', 'dark');
  if (theme === 'light') params.set('ui', 'white');
  return `${baseUrl}/?${params.toString()}`;
}

function patchDrawioBundle(source) {
  let result = String(source || '');
  let changes = 0;

  if (!result.includes('editorUrl: "https://embed.diagrams.net/"')) {
    const next = result.replace(
      '  port: "4444",\n',
      '  port: "4444",\n  editorUrl: "https://embed.diagrams.net/",\n'
    );
    if (next !== result) {
      result = next;
      changes += 1;
    }
  }

  if (!result.includes('SHIZUKI_SHARED_DRAWIO_URL')) {
    const next = result.replace(
      '    const baseUrl = `http://localhost:${this.plugin.settings.port}`;',
      '    const configuredEditorUrl = String(this.plugin.settings.editorUrl || "").trim();\n    const baseUrl = (configuredEditorUrl || `http://localhost:${this.plugin.settings.port}`).replace(/\\/+$/, ""); // SHIZUKI_SHARED_DRAWIO_URL'
    );
    if (next !== result) {
      result = next;
      changes += 1;
    }
  }

  if (!result.includes('SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER')) {
    const next = result.replace(
      '  startServer() {\n    if (this.plugin.server) return;',
      '  startServer() {\n    const configuredEditorUrl = String(this.plugin.settings.editorUrl || "").trim();\n    if (configuredEditorUrl && !/^http:\\/\\/localhost(?::|\\/|$)/i.test(configuredEditorUrl)) return; // SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER\n    if (this.plugin.server) return;'
    );
    if (next !== result) {
      result = next;
      changes += 1;
    }
  }

  const patched = result.includes('SHIZUKI_SHARED_DRAWIO_URL')
    && result.includes('SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER')
    && result.includes('editorUrl: "https://embed.diagrams.net/"');
  if (!patched) {
    throw new Error('Draw.io bundle did not match the expected 3.1.x patch seams.');
  }
  return { source: result, changes };
}

module.exports = {
  SUPPORTED_IMAGE_EXTENSIONS,
  stripYamlFrontmatter,
  normalizeStringArray,
  buildPostPayload,
  extensionForTarget,
  isSupportedVisualTarget,
  discoverVisualEmbeds,
  applyEmbedReplacements,
  rewriteVisualEmbeds,
  normalizeApiData,
  normalizeTokenPayload,
  normalizeEditorOrigin,
  buildDrawioEditorUrl,
  patchDrawioBundle
};
