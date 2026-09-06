import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const hubSource = readFileSync(resolve(process.cwd(), 'src/pages/AiHubPage.vue'), 'utf8');
const dialogSource = readFileSync(resolve(process.cwd(), 'src/components/AiDialog.vue'), 'utf8');
const sessionRailSource = readFileSync(resolve(process.cwd(), 'src/components/AiSessionRail.vue'), 'utf8');
const globalSource = readFileSync(resolve(process.cwd(), 'src/styles/global.css'), 'utf8');

describe('AI Hub setting-derived surface contract', () => {
  it('maps AI-scoped surfaces to the same semantic panel family used by Apps', () => {
    const tokenBlock = hubSource.match(/\.ai-hub-page \{([\s\S]*?)\n\}/)?.[1] ?? '';

    expect(tokenBlock).toContain('--ai-hub-surface: var(--theme-panel-surface);');
    expect(tokenBlock).toContain('--ai-hub-surface-elevated: var(--theme-panel-surface-elevated);');
    expect(tokenBlock).toContain('--ai-hub-surface-soft: var(--theme-surface-soft);');
    expect(tokenBlock).toContain('--ai-hub-surface-hover: var(--theme-floating-surface-hover);');
    expect(tokenBlock).toContain('--ai-hub-input-surface: var(--theme-surface-soft);');
    expect(tokenBlock).toContain('--ai-hub-shadow: var(--theme-shadow-soft);');
    expect(tokenBlock).not.toContain('rgba(var(--accent-rgb)');
    expect(hubSource).toContain('--ai-hub-ink: var(--theme-text-primary);');
    expect(hubSource).toContain('--ai-hub-border: var(--theme-border);');
  });

  it('uses the inherited aliases for the hub workspace and conversation rail', () => {
    expect(hubSource).toMatch(/\.ai-hub-page \.workspace-shell[\s\S]*background: var\(--ai-hub-surface\) !important;/);
    expect(hubSource).toMatch(/\.conversation-rail[\s\S]*background: var\(--ai-hub-surface-elevated\);/);
  });

  it('keeps the town map theme-derived instead of introducing a navy or gray island', () => {
    const mapBlock = hubSource.match(/\.town-map-board \{([\s\S]*?)\n\}/)?.[1] ?? '';
    const dayMapBlock = globalSource.match(/:root\[data-theme-mode='day'\] \.ai-hub-page \.town-map-board \{([\s\S]*?)\n\}/)?.[1] ?? '';

    expect(mapBlock).toContain('var(--ai-hub-surface)');
    expect(mapBlock).toContain('rgba(var(--accent-rgb)');
    expect(mapBlock).not.toContain('rgba(16, 22, 36');
    expect(mapBlock).not.toContain('rgba(8, 12, 22');
    expect(dayMapBlock).toContain('var(--theme-panel-surface');
    expect(dayMapBlock).not.toContain('rgba(255, 251, 247');
    expect(dayMapBlock).not.toContain('rgba(244, 236, 230');
  });

  it('uses semantic muted ink for supporting town copy', () => {
    expect(hubSource).toMatch(/\.stage-copy p,[\s\S]*color: var\(--ai-hub-ink-muted\);/);
    expect(hubSource).toMatch(/\.map-node small \{[\s\S]*color: var\(--ai-hub-ink-muted\);/);
    expect(hubSource).toMatch(/\.scene-chip span \{[\s\S]*color: var\(--ai-hub-ink-muted\);/);
  });

  it('lets the shared dialog and session rail inherit the AI surface family', () => {
    expect(dialogSource).toContain('--ai-chat-surface: var(--ai-hub-surface,');
    expect(dialogSource).toContain('--ai-chat-input-surface: var(--ai-hub-input-surface,');
    expect(dialogSource).toMatch(/\.ai-dialog[\s\S]*background: var\(--ai-chat-surface\);/);
    expect(dialogSource).toMatch(/\.chat-input-wrap[\s\S]*background: var\(--ai-chat-input-surface\);/);

    expect(sessionRailSource).toContain('--ai-rail-surface: var(--ai-hub-surface-elevated,');
    expect(sessionRailSource).toContain('--ai-rail-soft: var(--ai-hub-surface-soft,');
    expect(sessionRailSource).toMatch(/\.ai-session-rail[\s\S]*background: var\(--ai-rail-surface\);/);
  });
});
