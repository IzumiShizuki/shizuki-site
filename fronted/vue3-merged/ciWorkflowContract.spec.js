import { existsSync, readFileSync } from 'node:fs';
import { dirname, resolve } from 'node:path';
import { fileURLToPath } from 'node:url';
import { describe, expect, it } from 'vitest';

const frontendRoot = dirname(fileURLToPath(import.meta.url));
const repositoryRoot = resolve(frontendRoot, '..', '..');
const workflowPath = resolve(repositoryRoot, '.github', 'workflows', 'ci.yml');
const workflow = readFileSync(workflowPath, 'utf8');
const packageManifest = JSON.parse(
  readFileSync(resolve(frontendRoot, 'package.json'), 'utf8'),
);
const workspaceSettings = readFileSync(
  resolve(frontendRoot, 'pnpm-workspace.yaml'),
  'utf8',
);

describe('CI workflow contract', () => {
  it('does not invoke repository shell scripts that are absent', () => {
    const invokedScripts = [...workflow.matchAll(/\bbash[ \t]+([^\s|]+)/g)]
      .map((match) => match[1].replace(/["']/g, ''))
      .filter((scriptPath) => !scriptPath.startsWith('-'));
    const missingScripts = invokedScripts.filter(
      (scriptPath) => !existsSync(resolve(repositoryRoot, scriptPath)),
    );

    expect(missingScripts, 'workflow references missing shell scripts').toEqual([]);
  });

  it('uses supported hosted action majors', () => {
    expect(workflow).toContain('actions/checkout@v7');
    expect(workflow).toContain('actions/setup-java@v6');
    expect(workflow).toContain('actions/upload-artifact@v7');
    expect(workflow).not.toMatch(/actions\/(?:checkout|setup-java|upload-artifact)@v[1-5]\b/);
  });

  it('uses the declared pnpm toolchain and frozen lockfile', () => {
    expect(workflow).toContain('pnpm/setup@v1');
    expect(workflow).toContain('runtime: node@24');
    expect(workflow).toContain('package-json-file: fronted/vue3-merged/package.json');
    expect(workflow).toContain('cache-dependency-path: fronted/vue3-merged/pnpm-lock.yaml');
    expect(workflow).toContain('pnpm install --frozen-lockfile');
    expect(workflow).not.toContain('npm ci');
  });

  it('keeps pnpm 11 settings in the workspace configuration', () => {
    expect(packageManifest.packageManager).toBe('pnpm@11.8.0');
    expect(packageManifest.pnpm).toBeUndefined();
    expect(workspaceSettings).toContain('overrides:');
    expect(workspaceSettings).toContain('allowBuilds:');
  });

  it('runs frontend tests before the production build', () => {
    const testCommandIndex = workflow.indexOf('pnpm test:unit');
    const buildCommandIndex = workflow.indexOf('pnpm build');

    expect(testCommandIndex).toBeGreaterThan(-1);
    expect(buildCommandIndex).toBeGreaterThan(testCommandIndex);
  });
});
