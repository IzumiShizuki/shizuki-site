import { describe, expect, it } from 'vitest';
import {
  DEFAULT_MEGURI_PRESENTATION,
  deriveMeguriSpriteFile,
  isSafeMeguriSpriteFile,
  resolveMeguriMotionClass,
  resolveMeguriPresentation
} from './meguriCharacterPresentation';

describe('meguriCharacterPresentation', () => {
  it('uses a canonical resolved sprite and motion cue', () => {
    const presentation = resolveMeguriPresentation(DEFAULT_MEGURI_PRESENTATION, {
      expression_tag: 'happy',
      expression_intensity: 'high',
      outfit_code: '02',
      sprite_file: 'ce02202l.png',
      motion_tag: 'bounce'
    });

    expect(presentation).toMatchObject({
      expressionTag: 'happy',
      expressionIntensity: 'high',
      outfitCode: '02',
      spriteFile: 'ce02202l.png',
      motionTag: 'bounce'
    });
    expect(resolveMeguriMotionClass(presentation.motionTag)).toBe('motion-bounce');
  });

  it('derives a safe outfit sprite while preserving expression state', () => {
    const current = resolveMeguriPresentation(DEFAULT_MEGURI_PRESENTATION, {
      expressionTag: 'worried',
      expressionIntensity: 'medium'
    });
    const changed = resolveMeguriPresentation(current, { outfitCode: '03' });

    expect(changed.spriteFile).toBe('ce03016l.png');
    expect(changed.expressionTag).toBe('worried');
    expect(deriveMeguriSpriteFile(changed)).toBe('ce03016l.png');
  });

  it('rejects unsafe and unknown cue values without losing the valid presentation', () => {
    const presentation = resolveMeguriPresentation(DEFAULT_MEGURI_PRESENTATION, {
      expression_tag: 'unknown',
      outfit_code: '../',
      sprite_file: '../unsafe.exe'
    });

    expect(presentation).toEqual(DEFAULT_MEGURI_PRESENTATION);
    expect(isSafeMeguriSpriteFile(presentation.spriteFile)).toBe(true);
    expect(isSafeMeguriSpriteFile('../unsafe.exe')).toBe(false);
  });

  it('removes motion classes when reduced motion is enabled', () => {
    expect(resolveMeguriMotionClass('shake', true)).toBe('');
    expect(resolveMeguriMotionClass('soft_idle')).toBe('motion-sway');
    expect(resolveMeguriMotionClass('')).toBe('motion-breathe');
  });
});
