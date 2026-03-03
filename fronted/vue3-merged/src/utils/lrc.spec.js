import { describe, expect, it } from 'vitest';
import { parseLrc } from './lrc';

describe('parseLrc', () => {
  it('parses bracket and angle time tags', () => {
    const entries = parseLrc('[00:01.00]line1\n<00:03.20>line2');
    expect(entries).toHaveLength(2);
    expect(entries[0].text).toBe('line1');
    expect(entries[0].time).toBeCloseTo(1, 3);
    expect(entries[1].text).toBe('line2');
    expect(entries[1].time).toBeCloseTo(3.2, 3);
  });

  it('extracts lyric text from JSON payload', () => {
    const json = JSON.stringify({
      lrc: {
        lyric: '[00:05.00]hello\\n[00:07.00]world'
      }
    });
    const entries = parseLrc(json);
    expect(entries).toHaveLength(2);
    expect(entries[0].text).toBe('hello');
    expect(entries[1].text).toBe('world');
  });

  it('normalizes escaped text input', () => {
    const entries = parseLrc('"[00:01.00]a\\\\n[00:02.00]b"');
    expect(entries).toHaveLength(2);
    expect(entries[0].text).toBe('a');
    expect(entries[1].text).toBe('b');
  });
});
