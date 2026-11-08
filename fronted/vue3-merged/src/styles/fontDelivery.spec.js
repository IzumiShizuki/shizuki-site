import { createHash } from 'node:crypto';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const root = process.cwd();
const directory = resolve(root, 'src/assets/fonts/subsets');
const hash = data => createHash('sha256').update(data).digest('hex');

function codepoints(ranges) {
  const result = new Set();
  for (const range of ranges.split(',')) {
    const [from, to = from] = range.replace('U+', '').split('-').map(value => Number.parseInt(value, 16));
    for (let point = from; point <= to; point += 1) result.add(point);
  }
  return result;
}

describe('sharded font delivery', () => {
  it('preserves every source cmap entry exactly once with intact generated assets', () => {
    const manifest = JSON.parse(readFileSync(resolve(directory, 'manifest.json'), 'utf8'));
    const css = readFileSync(resolve(root, 'src/styles/font-subsets.css'), 'utf8');
    const originalCounts = { 'Noto Sans SC': 7230, 'LXGW WenKai Screen': 7164 };
    for (const family of manifest.families) {
      expect(hash(readFileSync(resolve(root, 'public/fonts', family.source)))).toBe(family.sourceSha256);
      const covered = new Set();
      for (const shard of family.shards) {
        const bytes = readFileSync(resolve(directory, shard.file));
        expect(bytes.subarray(0, 4).toString()).toBe('wOF2');
        expect(hash(bytes)).toBe(shard.sha256);
        expect(css).toContain(shard.unicodeRange);
        for (const point of codepoints(shard.unicodeRange)) {
          expect(covered.has(point)).toBe(false);
          covered.add(point);
        }
      }
      expect(covered.size).toBe(originalCounts[family.family]);
      expect(covered).toEqual(codepoints(family.coverage));
    }
  });

  it('keeps common UI shards bounded and avoids monolithic CJK font URLs', () => {
    const manifest = JSON.parse(readFileSync(resolve(directory, 'manifest.json'), 'utf8'));
    expect(manifest.families.reduce((sum, family) => sum + family.shards[0].bytes, 0)).toBeLessThan(650 * 1024);
    const css = readFileSync(resolve(root, 'src/styles/fonts.css'), 'utf8');
    expect(css).not.toMatch(/src:\s*url\('\/fonts\/(?:NotoSansSC-subset|LXGWWenKai)\.woff2/);
  });
});
