import { spawn } from 'node:child_process';
import { promises as fs } from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { Buffer } from 'node:buffer';
import http from 'node:http';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const slidevBin = path.join(__dirname, 'node_modules', '.bin', process.platform === 'win32' ? 'slidev.cmd' : 'slidev');
const port = Number.parseInt(process.env.PORT || '3210', 10);
const exportTimeoutMs = Number.parseInt(process.env.SLIDEV_EXPORT_TIMEOUT_MS || '600000', 10);
const pageTimeoutMs = Number.parseInt(process.env.SLIDEV_PAGE_TIMEOUT_MS || '180000', 10);
const waitUntil = ['networkidle', 'load', 'domcontentloaded', 'none'].includes(process.env.SLIDEV_WAIT_UNTIL || '')
  ? process.env.SLIDEV_WAIT_UNTIL
  : 'load';

function sendJson(response, statusCode, payload) {
  response.writeHead(statusCode, {
    'Content-Type': 'application/json; charset=utf-8'
  });
  response.end(JSON.stringify(payload));
}

function readRequestBody(request) {
  return new Promise((resolve, reject) => {
    let body = '';
    request.setEncoding('utf8');
    request.on('data', (chunk) => {
      body += chunk;
      if (body.length > 5 * 1024 * 1024) {
        reject(new Error('request body too large'));
        request.destroy();
      }
    });
    request.on('end', () => resolve(body));
    request.on('error', reject);
  });
}

function sanitizeFileBaseName(fileName) {
  const normalized = String(fileName || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/-+/g, '-')
    .replace(/^-+|-+$/g, '');
  return normalized || `presentation-${Date.now()}`;
}

function countSlides(markdown) {
  const source = String(markdown || '').replace(/^---\n[\s\S]*?\n---\n?/, '').trim();
  if (!source) return 0;
  return source.split(/\n---\n/g).filter((item) => item.trim()).length;
}

function runSlidevExport(inputPath, outputPath) {
  return new Promise((resolve, reject) => {
    const args = [
      'export',
      inputPath,
      '--format',
      'pptx',
      '--output',
      outputPath,
      '--timeout',
      String(Number.isFinite(pageTimeoutMs) && pageTimeoutMs > 0 ? pageTimeoutMs : 180000),
      '--wait-until',
      waitUntil
    ];
    const child = spawn(slidevBin, args, {
      cwd: __dirname,
      env: {
        ...process.env,
        CI: '1'
      },
      stdio: ['ignore', 'pipe', 'pipe']
    });

    let stderr = '';
    let timeoutId = null;
    child.stderr.on('data', (chunk) => {
      stderr += String(chunk || '');
    });

    const timeout = Number.isFinite(exportTimeoutMs) && exportTimeoutMs > 0 ? exportTimeoutMs : 180000;
    timeoutId = setTimeout(() => {
      stderr += `\nslidev export timed out after ${timeout}ms`;
      child.kill('SIGKILL');
    }, timeout);

    child.on('error', (error) => {
      if (timeoutId) {
        clearTimeout(timeoutId);
      }
      reject(error);
    });
    child.on('close', (code) => {
      if (timeoutId) {
        clearTimeout(timeoutId);
      }
      if (code === 0) {
        resolve();
        return;
      }
      reject(new Error(stderr.trim() || `slidev export failed with code ${code}`));
    });
  });
}

async function handleRenderPptx(request, response) {
  try {
    const rawBody = await readRequestBody(request);
    const body = JSON.parse(rawBody || '{}');
    const markdown = String(body?.markdown || '');
    const fileBaseName = sanitizeFileBaseName(body?.fileName);
    if (!markdown.trim()) {
      sendJson(response, 400, { message: 'markdown is required' });
      return;
    }

    const workspaceRoot = path.join(__dirname, '.tmp');
    await fs.mkdir(workspaceRoot, { recursive: true });
    const workingDir = await fs.mkdtemp(path.join(workspaceRoot, 'slidev-export-'));
    const inputPath = path.join(workingDir, 'slides.md');
    const outputPath = path.join(workingDir, `${fileBaseName}.pptx`);

    try {
      await fs.writeFile(inputPath, markdown, 'utf8');
      await runSlidevExport(inputPath, outputPath);
      const pptBuffer = await fs.readFile(outputPath);
      sendJson(response, 200, {
        pptBase64: Buffer.from(pptBuffer).toString('base64'),
        slideCount: countSlides(markdown)
      });
    } finally {
      await fs.rm(workingDir, { recursive: true, force: true });
    }
  } catch (error) {
    sendJson(response, 500, {
      message: error instanceof Error ? error.message : 'presentation generation failed'
    });
  }
}

const server = http.createServer((request, response) => {
  const url = new URL(request.url || '/', `http://${request.headers.host || 'localhost'}`);
  if (request.method === 'GET' && url.pathname === '/health') {
    sendJson(response, 200, { ok: true });
    return;
  }
  if (request.method === 'POST' && url.pathname === '/render/pptx') {
    void handleRenderPptx(request, response);
    return;
  }
  sendJson(response, 404, { message: 'Not found' });
});

server.listen(port, () => {
  console.log(`presentation-generator listening on :${port}`);
});
