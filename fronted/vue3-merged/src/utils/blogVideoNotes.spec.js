import { describe, expect, it } from 'vitest';
import {
  buildVideoNoteMarkdown,
  formatVideoTimestamp,
  normalizeVideoSource,
  normalizeVideoSummary,
  normalizeVideoTranscript
} from './blogVideoNotes';

describe('blogVideoNotes', () => {
  it('normalizes snake_case video source responses', () => {
    const source = normalizeVideoSource({
      source_url: 'https://www.youtube.com/watch?v=abc',
      platform: 'youtube',
      title: 'Demo',
      duration_seconds: 90,
      thumbnail_url: 'https://example.com/thumb.jpg',
      available_subtitles: ['en'],
      available_auto_captions: ['zh-Hans'],
      needs_cookies: true
    });

    expect(source.sourceUrl).toBe('https://www.youtube.com/watch?v=abc');
    expect(source.durationSeconds).toBe(90);
    expect(source.availableSubtitles).toEqual(['en']);
    expect(source.needsCookies).toBe(true);
  });

  it('normalizes summary payloads with transcript and OCR', () => {
    const result = normalizeVideoSummary({
      markdown: '# Demo\n',
      summary: ['point'],
      timeline: [{ start: 0, end: 20, title: 'Intro' }],
      keyframes: [{ id: 'keyframe-0001', timestamp: 0 }],
      ocr: [{ frame_id: 'keyframe-0001', timestamp: 0, texts: ['Slide'] }],
      transcript: {
        transcript_source: 'platform_subtitle',
        segments: [{ start: 0, end: 2, text: 'hello' }],
        formats: { md: '- [00:00:00] hello' }
      }
    });

    expect(result.markdown).toBe('# Demo\n');
    expect(result.timeline[0].title).toBe('Intro');
    expect(result.ocr[0].frameId).toBe('keyframe-0001');
    expect(result.transcript.transcriptSource).toBe('platform_subtitle');
  });

  it('builds fallback markdown from transcript-only payloads', () => {
    const markdown = buildVideoNoteMarkdown(
      normalizeVideoTranscript({
        source: { title: 'Transcript Demo' },
        transcriptSource: 'asr',
        formats: { md: '- [00:00:00] hello' }
      })
    );

    expect(markdown).toContain('# Transcript Demo');
    expect(markdown).toContain('## 完整转写');
    expect(markdown).toContain('- [00:00:00] hello');
  });

  it('formats timestamps as hh mm ss', () => {
    expect(formatVideoTimestamp(3661)).toBe('01:01:01');
  });
});
