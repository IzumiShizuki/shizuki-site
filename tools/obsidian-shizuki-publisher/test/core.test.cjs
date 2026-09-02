'use strict';

const test = require('node:test');
const assert = require('node:assert/strict');
const {
  stripYamlFrontmatter,
  buildPostPayload,
  discoverVisualEmbeds,
  applyEmbedReplacements,
  rewriteVisualEmbeds,
  normalizeApiData,
  normalizeTokenPayload,
  buildDrawioEditorUrl,
  patchDrawioBundle
} = require('../core');

test('strips only leading YAML frontmatter', () => {
  const markdown = '---\ntitle: Demo\ntags: [one]\n---\n# Body\n\n---\n';
  assert.equal(stripYamlFrontmatter(markdown), '# Body\n\n---\n');
  assert.equal(stripYamlFrontmatter('# No YAML\n---'), '# No YAML\n---');
});

test('maps frontmatter to the existing author post contract', () => {
  const mapped = buildPostPayload({
    fileBasename: 'Fallback title',
    markdown: '---\ntitle: ignored here\n---\nBody',
    defaults: { categoryCode: 'life', visibility: 'PRIVATE' },
    frontmatter: {
      title: 'Mapped title',
      summary: 'Summary',
      category: 'notes',
      slug: 'mapped-title',
      visibility: 'unlisted',
      tags: ['obsidian', 'obsidian', ' blog '],
      groups: 'friends, author',
      shizuki_post_id: 42
    }
  });
  assert.equal(mapped.postId, 42);
  assert.deepEqual(mapped.payload, {
    title: 'Mapped title',
    summary: 'Summary',
    categoryCode: 'notes',
    slugCode: 'mapped-title',
    coverImageUrl: undefined,
    visibility: 'UNLISTED',
    allowedGroupCodes: ['friends', 'author'],
    tags: ['obsidian', 'blog'],
    markdown: 'Body'
  });
});

test('discovers local wiki and Markdown visual embeds but skips remote images', () => {
  const markdown = [
    '![[90-Assets/images/a.png|A image]]',
    '![diagram](<90-Assets/project/Drawio/flow.drawio.svg> "Flow")',
    '![remote](https://example.com/image.png)',
    '![[notes/not-an-image.md]]'
  ].join('\n');
  const embeds = discoverVisualEmbeds(markdown);
  assert.equal(embeds.length, 2);
  assert.deepEqual(embeds.map((entry) => [entry.syntax, entry.target, entry.alt]), [
    ['wiki', '90-Assets/images/a.png', 'A image'],
    ['markdown', '90-Assets/project/Drawio/flow.drawio.svg', 'diagram']
  ]);
  const replaced = applyEmbedReplacements(markdown, embeds.map((entry, index) => ({
    ...entry,
    url: `https://cdn.example/${index}.png`
  })));
  assert.match(replaced, /!\[A image\]\(https:\/\/cdn\.example\/0\.png\)/);
  assert.match(replaced, /!\[diagram\]\(https:\/\/cdn\.example\/1\.png\)/);
  assert.match(replaced, /https:\/\/example\.com\/image\.png/);
});

test('rewrites visual embeds through a deterministic conversion and upload seam', async () => {
  const calls = [];
  const progress = [];
  const markdown = '![[diagram.drawio.svg]]\n![[photo.png]]';
  const rewritten = await rewriteVisualEmbeds(markdown, async (embed) => {
    calls.push(embed.target);
    return `https://cdn.example/${embed.target.endsWith('.drawio.svg') ? 'diagram.png' : 'photo.png'}`;
  }, (current, total) => progress.push([current, total]));
  assert.deepEqual(calls, ['diagram.drawio.svg', 'photo.png']);
  assert.deepEqual(progress, [[1, 2], [2, 2]]);
  assert.equal(rewritten, [
    '![diagram.drawio.svg](https://cdn.example/diagram.png)',
    '![photo.png](https://cdn.example/photo.png)'
  ].join('\n'));
});

test('normalizes API and token response casing', () => {
  assert.deepEqual(normalizeApiData({ code: 0, data: { postId: 7 } }), { postId: 7 });
  assert.deepEqual(normalizeTokenPayload({
    code: 0,
    data: {
      result_type: 'TOKEN_ISSUED',
      access_token: 'access',
      refresh_token: 'refresh',
      user_id: 9
    }
  }), {
    resultType: 'TOKEN_ISSUED',
    accessToken: 'access',
    refreshToken: 'refresh',
    userId: 9,
    expiresIn: 0
  });
});

test('builds the shared draw.io JSON embed URL with dark UI', () => {
  const url = new URL(buildDrawioEditorUrl('https://embed.diagrams.net/', 'dark'));
  assert.equal(url.origin, 'https://embed.diagrams.net');
  assert.equal(url.searchParams.get('embed'), '1');
  assert.equal(url.searchParams.get('proto'), 'json');
  assert.equal(url.searchParams.get('ui'), 'dark');
});

test('patches the draw.io bundle deterministically and idempotently', () => {
  const fixture = [
    'var DEFAULT_SETTINGS = {',
    '  port: "4444",',
    '};',
    '    const baseUrl = `http://localhost:${this.plugin.settings.port}`;',
    '  startServer() {',
    '    if (this.plugin.server) return;',
    '  }'
  ].join('\n');
  const first = patchDrawioBundle(fixture);
  assert.equal(first.changes, 3);
  assert.match(first.source, /SHIZUKI_SHARED_DRAWIO_URL/);
  assert.match(first.source, /SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER/);
  const second = patchDrawioBundle(first.source);
  assert.equal(second.changes, 0);
  assert.equal(second.source, first.source);
});
