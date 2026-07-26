import { describe, expect, it } from 'vitest';
import { __TEST__, getBoardCanvasAvailability } from './boardCanvasBridge';

describe('boardCanvasBridge (self engine)', () => {
  it('always reports available without a license key', () => {
    const availability = getBoardCanvasAvailability();
    expect(availability.supported).toBe(true);
    expect(availability.requiresLicenseKey).toBe(false);
  });

  it('sanitizes export file names', () => {
    expect(__TEST__.sanitizeFileName('我的 画板/流程:图')).toBe('我的-画板-流程-图');
    expect(__TEST__.sanitizeFileName('   ')).toBe('board-canvas');
  });

  it('resolves svg dimensions from width/height or viewBox', () => {
    expect(__TEST__.resolveSvgSize('<svg width="320" height="240"></svg>')).toEqual({ width: 320, height: 240 });
    expect(__TEST__.resolveSvgSize('<svg viewBox="0 0 640 480"></svg>')).toEqual({ width: 640, height: 480 });
    expect(__TEST__.resolveSvgSize('<svg></svg>')).toEqual({ width: 640, height: 480 });
  });

  it('wraps svg text into a data url and injects namespace', () => {
    const url = __TEST__.svgTextToDataUrl('<svg><rect/></svg>');
    expect(url.startsWith('data:image/svg+xml;charset=utf-8,')).toBe(true);
    expect(decodeURIComponent(url)).toContain('xmlns="http://www.w3.org/2000/svg"');
    expect(__TEST__.svgTextToDataUrl('')).toBe('');
  });
});
