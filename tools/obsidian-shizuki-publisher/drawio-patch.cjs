#!/usr/bin/env node
'use strict';

const fs = require('node:fs');
const path = require('node:path');
const { patchDrawioBundle } = require('./core');

const fileFlag = process.argv.indexOf('--file');
const sourcePath = fileFlag >= 0 ? process.argv[fileFlag + 1] : '';
if (!sourcePath) {
  throw new Error('Usage: node drawio-patch.cjs --file <drawio-main.js>');
}

const absolutePath = path.resolve(sourcePath);
const original = fs.readFileSync(absolutePath, 'utf8');
const patched = patchDrawioBundle(original);
if (patched.source !== original) {
  fs.writeFileSync(absolutePath, patched.source, 'utf8');
}
process.stdout.write(`Draw.io adapter ready (${patched.changes} changes applied).\n`);
