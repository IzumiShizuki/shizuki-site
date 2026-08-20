import { describe, expect, it } from 'vitest';
import { getLightAppByCode, isKnownLightAppCode, LIGHT_APP_CODES } from './lightAppsCatalog';
import { createWindowRuntimeState, LIGHT_APP_SHARED_WINDOW_IDS, openOrFocusWindow } from './lightAppWindowRuntime';

describe('KJ tool source light-app registration', () => {
  it('registers catalog metadata and a stable shared window id', () => {
    const app = getLightAppByCode('kj-tool-source');
    expect(app).toMatchObject({
      code: 'kj-tool-source',
      title: 'KJ Tool Source',
      floatingAble: true
    });
    expect(LIGHT_APP_CODES).toContain('kj-tool-source');
    expect(isKnownLightAppCode('kj-tool-source')).toBe(true);
    expect(LIGHT_APP_SHARED_WINDOW_IDS['kj-tool-source']).toBe(910009);

    const state = openOrFocusWindow(createWindowRuntimeState(), app, { width: 1440, height: 900 });
    expect(state.windows[0]).toMatchObject({ id: 910009, code: 'kj-tool-source' });
    expect(state.windows[0].width).toBeGreaterThanOrEqual(900);
  });
});
