#!/usr/bin/env node
'use strict';

const fs = require('node:fs');
const path = require('node:path');

const pluginRoot = __dirname;
const repoRoot = path.resolve(pluginRoot, '..', '..');
const pnpmRoot = path.join(repoRoot, 'fronted', 'vue3-merged', 'node_modules', '.pnpm');
const esbuildPackage = fs.readdirSync(pnpmRoot)
  .filter((name) => /^esbuild@/.test(name))
  .sort()
  .at(-1);
if (!esbuildPackage) {
  throw new Error(`No existing esbuild package was found under ${pnpmRoot}`);
}
const esbuild = require(path.join(pnpmRoot, esbuildPackage, 'node_modules', 'esbuild', 'lib', 'main.js'));
const outputDirectory = path.join(pluginRoot, 'dist');
fs.mkdirSync(outputDirectory, { recursive: true });
esbuild.buildSync({
  entryPoints: [path.join(pluginRoot, 'main.js')],
  outfile: path.join(outputDirectory, 'main.js'),
  bundle: true,
  platform: 'node',
  format: 'cjs',
  target: ['node18'],
  external: ['obsidian'],
  logLevel: 'warning',
  legalComments: 'none'
});
process.stdout.write(`Built ${path.join(outputDirectory, 'main.js')}\n`);
