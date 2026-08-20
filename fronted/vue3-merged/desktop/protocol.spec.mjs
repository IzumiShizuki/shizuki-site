import { describe, expect, it } from 'vitest';
import {
  CONTROL_PROTOCOL_VERSION,
  capabilitiesDocument,
  requiredCapabilityForCommand,
  validateControlCommand
} from './protocol.mjs';

describe('desktop control protocol', () => {
  it('advertises a stable protocol and only semantic commands', () => {
    const document = capabilitiesDocument();
    expect(document.protocolVersion).toBe(CONTROL_PROTOCOL_VERSION);
    expect(document.commands.map(item => item.name)).toContain('app.navigate');
    expect(document.commands.map(item => item.name)).toContain('music.toggle');
    expect(requiredCapabilityForCommand('music.toggle')).toBe('music.control');
    expect(JSON.stringify(document)).not.toMatch(/javascript|shell|filesystem/i);
  });

  it('filters advertised commands to the paired client grants', () => {
    const document = capabilitiesDocument({ grants: ['app.navigation'] });
    expect(document.commands.map(item => item.name)).toEqual(['app.navigate']);
  });

  it('accepts safe command identifiers and allowlisted destinations', () => {
    const result = validateControlCommand({
      id: 'meguri:1',
      command: 'app.navigate',
      payload: { destination: 'aiHub' }
    });
    expect(result.ok).toBe(true);
    expect(result.value.target).toBe('renderer');
    expect(result.value.requiredCapability).toBe('app.navigation');
  });

  it('rejects unknown commands and unexpected payload fields', () => {
    expect(validateControlCommand({ id: '1', command: 'app.eval', payload: {} })).toMatchObject({
      ok: false,
      error: { code: 'UNSUPPORTED_COMMAND' }
    });
    expect(validateControlCommand({ id: '2', command: 'window.show', payload: { url: 'https://example.com' } })).toMatchObject({
      ok: false,
      error: { code: 'INVALID_PAYLOAD' }
    });
  });
});
