import { existsSync, readFileSync } from 'node:fs';
import { dirname, resolve } from 'node:path';
import { fileURLToPath } from 'node:url';
import { describe, expect, it } from 'vitest';

const frontendRoot = dirname(fileURLToPath(import.meta.url));
const repositoryRoot = resolve(frontendRoot, '..', '..');
const workflowPath = resolve(repositoryRoot, '.github', 'workflows', 'ci.yml');
const workflow = readFileSync(workflowPath, 'utf8').replace(/\r\n/g, '\n');
const packageManifest = JSON.parse(
  readFileSync(resolve(frontendRoot, 'package.json'), 'utf8'),
);
const workspaceSettings = readFileSync(
  resolve(frontendRoot, 'pnpm-workspace.yaml'),
  'utf8',
);
const frontendWorkflow = workflow.slice(workflow.indexOf('  frontend-build:'));

function frontendStep(name) {
  return frontendWorkflow.split(/(?=^      - name: )/m)
    .find((step) => step.startsWith(`      - name: ${name}\n`));
}

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

  it('records the native watcher build decision without bypassing dependency policies', () => {
    const buildPolicy = workspaceSettings.split(/^allowBuilds:\s*$/m)[1]?.split(/^\S/m)[0];

    expect(buildPolicy).toMatch(/^  ['"]?@parcel\/watcher['"]?: true\s*$/m);
    expect(workspaceSettings).not.toMatch(/dangerouslyAllowAllBuilds:\s*true|strictDepBuilds:\s*false/);
    expect(frontendStep('Install Dependencies')).not.toMatch(/--(?:ignore-scripts|no-frozen-lockfile)|\|\|\s*true/);
  });

  it('retains frontend failure evidence without masking command failures', () => {
    for (const [name, log] of [
      ['Install Dependencies', 'frontend-install.log'],
      ['Run Unit Tests', 'frontend-unit-tests.log'],
      ['Build Frontend', 'frontend-build.log'],
    ]) {
      const step = frontendStep(name);
      expect(step).toContain(`2>&1 | tee ${log}`);
      expect(step).not.toContain('continue-on-error: true');
      expect(step).not.toMatch(/\|\|\s*true/);
    }

    expect(frontendWorkflow).toContain('shell: bash');
    expect(frontendStep('Run Unit Tests')).toContain('--outputFile.junit=test-results/unit.xml');
    const reportStep = frontendStep('Upload Frontend Test Reports');
    expect(reportStep).toContain('if: always()');
    expect(reportStep).toContain('fronted/vue3-merged/frontend-*.log');
    expect(reportStep).toContain('fronted/vue3-merged/test-results/**');
    expect(frontendStep('Upload Frontend Dist')).toContain('if: success()');
  });

  it('publishes stage outcomes even when verification fails', () => {
    const summary = frontendStep('Frontend Stage Summary');
    expect(summary).toContain('if: always()');
    for (const stage of ['frontend_install', 'frontend_tests', 'frontend_build']) {
      expect(summary).toContain(`steps.${stage}.outcome`);
    }
    expect(summary).toContain('GITHUB_STEP_SUMMARY');
    expect(workflow.slice(0, workflow.indexOf('  frontend-build:'))).toContain('GITHUB_STEP_SUMMARY');
  });
});
