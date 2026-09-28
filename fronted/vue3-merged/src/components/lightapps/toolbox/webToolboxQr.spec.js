import { describe, expect, it } from 'vitest';
import {
  DEFAULT_QR_TOOL_CODE,
  findWebTool,
  resolveQrToolMode,
  resolveStoredWebToolCode,
  resolveWebToolCode,
  WEB_TOOLBOX_GROUPS,
  WEB_TOOLBOX_TOOLS
} from './webToolboxCore';

const TOOL_CODES = WEB_TOOLBOX_TOOLS.map((tool) => tool.code);

describe('web toolbox QR tool registration', () => {
  it('registers runnable QR tools instead of the removed launcher', () => {
    expect(TOOL_CODES).toContain('qr-generate');
    expect(TOOL_CODES).toContain('qr-scan');
    expect(TOOL_CODES).toContain('qr-wifi');
    expect(TOOL_CODES).not.toContain('qr-tools');
  });

  it('finds each QR tool through the shared lookup', () => {
    expect(findWebTool('qr-generate')).toMatchObject({ title: '二维码生成' });
    expect(findWebTool('qr-scan')).toMatchObject({ title: '二维码识别' });
    expect(findWebTool('qr-wifi')).toMatchObject({ title: 'WiFi 二维码' });
    expect(findWebTool('qr-tools')).toBeNull();
  });

  it('groups the QR tools under Web 实用工具', () => {
    const group = WEB_TOOLBOX_GROUPS.find((item) => item.code === 'web');
    expect(group.tools.map((tool) => tool.code)).toEqual(
      expect.arrayContaining(['qr-generate', 'qr-scan', 'qr-wifi'])
    );
  });

  it('maps QR tool codes to panel modes', () => {
    expect(resolveQrToolMode('qr-generate')).toBe('generate');
    expect(resolveQrToolMode('qr-scan')).toBe('scan');
    expect(resolveQrToolMode('qr-wifi')).toBe('wifi');
    expect(resolveQrToolMode('json')).toBe('');
  });
});

describe('removed QR launcher tool code migration', () => {
  it('resolves the removed code to the QR generation tool', () => {
    expect(resolveWebToolCode('qr-tools')).toBe(DEFAULT_QR_TOOL_CODE);
    expect(resolveStoredWebToolCode('qr-tools')).toBe('qr-generate');
  });

  it('resolves the removed code to a panel-rendering mode', () => {
    expect(resolveQrToolMode('qr-tools')).toBe('generate');
  });

  it('keeps valid codes and rejects unknown ones', () => {
    expect(resolveWebToolCode('json')).toBe('json');
    expect(resolveStoredWebToolCode('json')).toBe('json');
    expect(resolveStoredWebToolCode('not-a-tool')).toBe('');
    expect(resolveStoredWebToolCode('')).toBe('');
  });
});
