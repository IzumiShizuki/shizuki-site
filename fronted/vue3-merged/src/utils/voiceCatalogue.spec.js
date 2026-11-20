import { describe, expect, it } from 'vitest';
import {
  normalizeVoiceTags, readVoiceCatalogueQuery, resolveVoiceCover, writeVoiceCatalogueQuery
} from './voiceCatalogue';

describe('voice catalogue display and query', () => {
  it('retains distinct source IDs and picks a non-empty label for repeated entries', () => {
    expect(normalizeVoiceTags([
      { tagId: 11 }, { tag_id: 11, name: '  Rain   sound  ' },
      { tagId: 12, name: 'Rain sound' }, { name: 'metadata only' },
      { tagId: -1 }, null
    ], { requireId: true })).toEqual([
      { tagId: 11, name: 'Rain sound' }, { tagId: 12, name: 'Rain sound' }
    ]);
  });

  it('does not let linked URLs read or persist expanded age modes', () => {
    const query = readVoiceCatalogueQuery({
      q: ' rain ', voiceTags: '13,13,-1,error', voiceAge: 'adult', voiceSort: 'asc'
    });
    expect(query).toEqual({ keyword: 'rain', order: 'release', sort: 'asc', ageFilter: 'safe', tagIds: [13] });
    expect(writeVoiceCatalogueQuery({ ...query, ageFilter: 'all' })).toEqual({
      q: 'rain', voiceTags: '13', voiceSort: 'asc'
    });
  });

  it('prefers the source-provided Chinese label without changing search identity or losing the original name', () => {
    expect(normalizeVoiceTags([
      { tagId: 11, name: '雨音' }, { tagId: 11, name: '雨音', display_name: '雨声' }
    ])).toEqual([{ tagId: 11, name: '雨声', sourceName: '雨音' }]);
  });

  it('keeps supported cover URLs without double escaping them', () => {
    expect(resolveVoiceCover('/api/v1/media/covers/rain%20blue.webp')).toBe('/api/v1/media/covers/rain%20blue.webp');
    expect(resolveVoiceCover('//example.invalid/cover.webp')).toBe('https://example.invalid/cover.webp');
    expect(resolveVoiceCover('javascript:alert(1)')).toBe('');
  });
});
