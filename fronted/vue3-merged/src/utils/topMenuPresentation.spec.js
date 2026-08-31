import { describe, expect, it } from 'vitest';
import {
  TOP_MENU_COMPACT_SCROLL_THRESHOLD,
  resolveTopMenuPresentation
} from './topMenuPresentation';

describe('top menu presentation', () => {
  it('shows the full navigation at the page top', () => {
    expect(resolveTopMenuPresentation({ scrollTop: 0, manualExpanded: false })).toMatchObject({
      compact: false,
      full: true,
      pastThreshold: false
    });
  });

  it('condenses only after crossing the App-owned threshold', () => {
    expect(resolveTopMenuPresentation({
      scrollTop: TOP_MENU_COMPACT_SCROLL_THRESHOLD - 1,
      manualExpanded: false
    }).compact).toBe(false);
    expect(resolveTopMenuPresentation({
      scrollTop: TOP_MENU_COMPACT_SCROLL_THRESHOLD,
      manualExpanded: false
    }).compact).toBe(true);
  });

  it('allows a temporary full navigation while the page remains scrolled', () => {
    expect(resolveTopMenuPresentation({ scrollTop: 480, manualExpanded: true })).toMatchObject({
      compact: false,
      full: true,
      pastThreshold: true
    });
  });

  it('allows the full navigation to collapse before the page scrolls', () => {
    expect(resolveTopMenuPresentation({
      scrollTop: 0,
      manualCollapsed: true
    })).toMatchObject({
      compact: true,
      full: false,
      pastThreshold: false
    });
  });

  it('gives an explicit collapsed choice precedence over expand state', () => {
    expect(resolveTopMenuPresentation({
      scrollTop: 480,
      manualExpanded: true,
      manualCollapsed: true
    }).compact).toBe(true);
  });
});
