import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const hubSource = readFileSync(resolve(process.cwd(), 'src/pages/AiHubPage.vue'), 'utf8');
const dialogSource = readFileSync(resolve(process.cwd(), 'src/components/AiDialog.vue'), 'utf8');
const sessionRailSource = readFileSync(resolve(process.cwd(), 'src/components/AiSessionRail.vue'), 'utf8');

describe('AI Hub setting-derived surface contract', () => {
  it('defines AI-scoped surfaces from live accent and semantic theme tokens', () => {
    expect(hubSource).toContain('--ai-hub-surface:');
    expect(hubSource).toContain('--ai-hub-surface-elevated:');
    expect(hubSource).toContain('--ai-hub-surface-soft:');
    expect(hubSource).toContain('--ai-hub-input-surface:');
    expect(hubSource).toContain('rgba(var(--accent-rgb)');
    expect(hubSource).toContain('--ai-hub-ink: var(--theme-text-primary);');
    expect(hubSource).toContain('--ai-hub-border: var(--theme-border);');
  });

  it('uses the inherited aliases for the hub workspace and conversation rail', () => {
    expect(hubSource).toMatch(/\.ai-hub-page \.workspace-shell[\s\S]*background: var\(--ai-hub-surface\) !important;/);
    expect(hubSource).toMatch(/\.conversation-rail[\s\S]*background: var\(--ai-hub-surface-elevated\);/);
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
