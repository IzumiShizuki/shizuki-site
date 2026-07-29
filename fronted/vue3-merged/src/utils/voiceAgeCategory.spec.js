import { describe, expect, it } from 'vitest';
import {
  DEFAULT_VOICE_AGE_FILTER,
  normalizeVoiceAgeCategory,
  resolveVoiceAgeFilterCategories,
  voiceAgeCategoryLabel
} from './voiceAgeCategory';

describe('voiceAgeCategory', () => {
  it('normalizes common upstream age category variants', () => {
    expect(normalizeVoiceAgeCategory('全年齢')).toBe('general');
    expect(normalizeVoiceAgeCategory('R-15')).toBe('r15');
    expect(normalizeVoiceAgeCategory('adult')).toBe('adult');
    expect(normalizeVoiceAgeCategory('', true)).toBe('adult');
  });

  it('provides readable labels and safe defaults', () => {
    expect(voiceAgeCategoryLabel('general')).toBe('全年龄');
    expect(voiceAgeCategoryLabel('15+')).toBe('R15');
    expect(voiceAgeCategoryLabel('18+')).toBe('R18');
    expect(resolveVoiceAgeFilterCategories(DEFAULT_VOICE_AGE_FILTER)).toEqual(['general', 'r15']);
  });
});
