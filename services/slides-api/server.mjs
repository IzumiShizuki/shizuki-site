import { spawn } from 'node:child_process';
import crypto from 'node:crypto';
import { promises as fs } from 'node:fs';
import http from 'node:http';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const SLIDEV_BIN = path.join(__dirname, 'node_modules', '.bin', process.platform === 'win32' ? 'slidev.cmd' : 'slidev');
const SUPPORTED_EXPORT_FORMATS = new Set(['pptx', 'pdf']);
const URL_KIND_FILE = 'file';
const URL_KIND_PREVIEW = 'preview';

function normalizeInt(raw, fallback, min = 1) {
  const parsed = Number.parseInt(String(raw ?? ''), 10);
  if (!Number.isFinite(parsed) || parsed < min) {
    return fallback;
  }
  return parsed;
}

function normalizeFileName(raw, fallback = 'slides') {
  const normalized = String(raw ?? '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/-+/g, '-')
    .replace(/^-+|-+$/g, '');
  return normalized || fallback;
}

function normalizeMarkdown(raw) {
  return String(raw ?? '').replace(/\r\n?/g, '\n').trim();
}

function sha256Hex(content) {
  return crypto.createHash('sha256').update(content).digest('hex');
}

function toIsoDate(valueMs) {
  return new Date(valueMs).toISOString();
}

function inferContentType(filePath) {
  const ext = path.extname(filePath).toLowerCase();
  switch (ext) {
    case '.pptx':
      return 'application/vnd.openxmlformats-officedocument.presentationml.presentation';
    case '.pdf':
      return 'application/pdf';
    case '.html':
      return 'text/html; charset=utf-8';
    case '.css':
      return 'text/css; charset=utf-8';
    case '.js':
      return 'text/javascript; charset=utf-8';
    case '.json':
      return 'application/json; charset=utf-8';
    case '.svg':
      return 'image/svg+xml';
    case '.png':
      return 'image/png';
    case '.jpg':
    case '.jpeg':
      return 'image/jpeg';
    case '.webp':
      return 'image/webp';
    default:
      return 'application/octet-stream';
  }
}

function hmacHex(secret, payload) {
  return crypto.createHmac('sha256', secret).update(payload).digest('hex');
}

function isSafePath(rootDir, targetPath) {
  const normalizedRoot = path.resolve(rootDir).toLowerCase();
  const normalizedTarget = path.resolve(targetPath).toLowerCase();
  return normalizedTarget === normalizedRoot || normalizedTarget.startsWith(`${normalizedRoot}${path.sep}`);
}

async function ensureDirectory(dirPath) {
  await fs.mkdir(dirPath, { recursive: true });
}

async function readRequestBody(request, maxBytes = 5 * 1024 * 1024) {
  return new Promise((resolve, reject) => {
    let total = 0;
    const chunks = [];
    request.on('data', (chunk) => {
      total += chunk.length;
      if (total > maxBytes) {
        reject(new Error('request body too large'));
        request.destroy();
        return;
      }
      chunks.push(chunk);
    });
    request.on('end', () => resolve(Buffer.concat(chunks).toString('utf8')));
    request.on('error', reject);
  });
}

function sendJson(response, statusCode, payload) {
  response.writeHead(statusCode, {
    'Content-Type': 'application/json; charset=utf-8',
    'Cache-Control': 'no-store'
  });
  response.end(JSON.stringify(payload));
}

function sendText(response, statusCode, text) {
  response.writeHead(statusCode, {
    'Content-Type': 'text/plain; charset=utf-8',
    'Cache-Control': 'no-store'
  });
  response.end(text);
}

function parseJsonOrEmpty(input) {
  if (!String(input ?? '').trim()) {
    return {};
  }
  return JSON.parse(String(input));
}

function sleep(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

class SlidesApiService {
  constructor(config = {}) {
    this.config = {
      workRoot: path.resolve(config.workRoot || path.join(__dirname, '.tmp')),
      storageRoot: path.resolve(config.storageRoot || path.join(__dirname, '.storage')),
      bearerToken: String(config.bearerToken || '').trim(),
      signSecret: String(config.signSecret || '').trim(),
      publicBaseUrl: String(config.publicBaseUrl || '').trim(),
      artifactUrlTtlSeconds: normalizeInt(config.artifactUrlTtlSeconds, 900),
      previewCacheTtlSeconds: normalizeInt(config.previewCacheTtlSeconds, 86400),
      exportTimeoutMs: normalizeInt(config.exportTimeoutMs, 600000),
      pageTimeoutMs: normalizeInt(config.pageTimeoutMs, 180000),
      waitUntil: ['networkidle', 'load', 'domcontentloaded', 'none'].includes(String(config.waitUntil || ''))
        ? String(config.waitUntil)
        : 'load',
      mockExecutor: String(config.mockExecutor || '') === '1'
    };

    this.exportJobs = new Map();
    this.previewJobs = new Map();
    this.previewCache = new Map();
    this.queue = [];
    this.workerRunning = false;
  }

  async init() {
    await ensureDirectory(this.config.workRoot);
    await ensureDirectory(this.config.storageRoot);
  }

  requireAuthorized(request) {
    if (!this.config.bearerToken) {
      return true;
    }
    const authHeader = String(request.headers.authorization || '').trim();
    return authHeader === `Bearer ${this.config.bearerToken}`;
  }

  cleanupPreviewCache() {
    const now = Date.now();
    for (const [sourceHash, entry] of this.previewCache.entries()) {
      if (entry.expiresAtMs <= now) {
        this.previewCache.delete(sourceHash);
      }
    }
  }

  submitExport(markdown, formats, fileName) {
    const source = normalizeMarkdown(markdown);
    if (!source) {
      throw new Error('markdown is required');
    }

    const normalizedFormats = Array.from(new Set((Array.isArray(formats) ? formats : [])
      .map((item) => String(item || '').trim().toLowerCase())
      .filter((item) => SUPPORTED_EXPORT_FORMATS.has(item))));

    if (!normalizedFormats.length) {
      throw new Error('formats must contain at least one of: pptx, pdf');
    }

    const sourceHash = sha256Hex(source);
    const jobId = this.createJobId('exp');
    const job = {
      jobId,
      kind: 'export',
      status: 'queued',
      sourceHash,
      createdAt: Date.now(),
      updatedAt: Date.now(),
      payload: {
        markdown: source,
        formats: normalizedFormats,
        fileBaseName: normalizeFileName(fileName || 'slides', 'slides')
      },
      artifacts: [],
      error: null
    };
    this.exportJobs.set(jobId, job);
    this.queue.push(job);
    void this.runQueue();
    return {
      jobId,
      status: job.status,
      statusUrl: `/v1/exports/${jobId}`
    };
  }

  getExportJob(jobId) {
    const job = this.exportJobs.get(jobId);
    if (!job) {
      return null;
    }

    const response = {
      jobId: job.jobId,
      status: job.status,
      sourceHash: job.sourceHash,
      artifacts: job.artifacts.map((artifact) => {
        const expiresAtMs = Date.now() + this.config.artifactUrlTtlSeconds * 1000;
        return {
          format: artifact.format,
          url: this.createSignedUrl(URL_KIND_FILE, artifact.relativePath, expiresAtMs),
          expiresAt: toIsoDate(expiresAtMs),
          sizeBytes: artifact.sizeBytes,
          sha256: artifact.sha256
        };
      })
    };

    if (job.error) {
      response.error = job.error;
    }
    return response;
  }

  submitPreview(markdown, ttlSeconds) {
    const source = normalizeMarkdown(markdown);
    if (!source) {
      throw new Error('markdown is required');
    }

    this.cleanupPreviewCache();

    const sourceHash = sha256Hex(source);
    const effectiveTtlSeconds = normalizeInt(ttlSeconds, this.config.previewCacheTtlSeconds);
    const cached = this.previewCache.get(sourceHash);

    if (cached && cached.expiresAtMs > Date.now()) {
      return {
        status: 'ready',
        sourceHash,
        previewUrl: this.createSignedUrl(URL_KIND_PREVIEW, cached.indexRelativePath, cached.expiresAtMs),
        expiresAt: toIsoDate(cached.expiresAtMs),
        cacheHit: true
      };
    }

    const jobId = this.createJobId('prv');
    const job = {
      jobId,
      kind: 'preview',
      status: 'queued',
      sourceHash,
      createdAt: Date.now(),
      updatedAt: Date.now(),
      payload: {
        markdown: source,
        ttlSeconds: effectiveTtlSeconds
      },
      previewRelativePath: '',
      previewExpiresAtMs: 0,
      error: null
    };
    this.previewJobs.set(jobId, job);
    this.queue.push(job);
    void this.runQueue();

    return {
      jobId,
      status: job.status,
      statusUrl: `/v1/previews/${jobId}`,
      sourceHash,
      cacheHit: false
    };
  }

  getPreviewJob(jobId) {
    const job = this.previewJobs.get(jobId);
    if (!job) {
      return null;
    }

    const response = {
      jobId: job.jobId,
      status: job.status,
      sourceHash: job.sourceHash
    };

    if (job.previewRelativePath && job.previewExpiresAtMs > Date.now()) {
      response.previewUrl = this.createSignedUrl(URL_KIND_PREVIEW, job.previewRelativePath, job.previewExpiresAtMs);
      response.expiresAt = toIsoDate(job.previewExpiresAtMs);
    }

    if (job.error) {
      response.error = job.error;
    }

    return response;
  }

  createSignedUrl(kind, relativePath, expiresAtMs) {
    const baseUrl = this.config.publicBaseUrl || '';
    const normalizedBase = baseUrl.endsWith('/') ? baseUrl.slice(0, -1) : baseUrl;
    const encodedPath = relativePath.split('/').map((segment) => encodeURIComponent(segment)).join('/');
    const prefix = kind === URL_KIND_PREVIEW ? 'previews' : 'files';
    const exp = Math.floor(expiresAtMs / 1000);
    const urlPath = `${prefix}/${encodedPath}`;

    if (!this.config.signSecret) {
      return normalizedBase ? `${normalizedBase}/${urlPath}` : `/${urlPath}`;
    }

    const payload = `${kind}:${relativePath}:${exp}`;
    const sig = hmacHex(this.config.signSecret, payload);
    const query = `exp=${exp}&sig=${sig}`;
    return normalizedBase ? `${normalizedBase}/${urlPath}?${query}` : `/${urlPath}?${query}`;
  }

  validateSignedAccess(kind, relativePath, url) {
    if (!this.config.signSecret) {
      return true;
    }

    const exp = Number.parseInt(String(url.searchParams.get('exp') || ''), 10);
    const sig = String(url.searchParams.get('sig') || '').trim();
    if (!Number.isFinite(exp) || !sig) {
      return false;
    }

    if (Date.now() > exp * 1000) {
      return false;
    }

    const expected = hmacHex(this.config.signSecret, `${kind}:${relativePath}:${exp}`);
    const left = Buffer.from(sig, 'utf8');
    const right = Buffer.from(expected, 'utf8');
    if (left.length !== right.length) {
      return false;
    }
    return crypto.timingSafeEqual(left, right);
  }

  async runQueue() {
    if (this.workerRunning) {
      return;
    }
    this.workerRunning = true;

    while (this.queue.length) {
      const job = this.queue.shift();
      if (!job) {
        continue;
      }

      if (job.kind === 'export') {
        await this.executeExportJob(job);
      } else {
        await this.executePreviewJob(job);
      }
    }

    this.workerRunning = false;
  }

  async executeExportJob(job) {
    job.status = 'running';
    job.updatedAt = Date.now();

    try {
      const tempRoot = await fs.mkdtemp(path.join(this.config.workRoot, `export-${job.jobId}-`));
      const inputPath = path.join(tempRoot, 'slides.md');
      await fs.writeFile(inputPath, job.payload.markdown, 'utf8');

      const artifacts = [];
      for (const format of job.payload.formats) {
        const outputPath = path.join(tempRoot, `${job.payload.fileBaseName}.${format}`);
        await this.runSlidevExport(inputPath, outputPath, format);

        const relativePath = `exports/${job.jobId}/${path.basename(outputPath)}`;
        const targetPath = path.resolve(this.config.storageRoot, relativePath);
        if (!isSafePath(this.config.storageRoot, targetPath)) {
          throw new Error('unsafe artifact path');
        }

        await ensureDirectory(path.dirname(targetPath));
        await fs.copyFile(outputPath, targetPath);

        const buffer = await fs.readFile(targetPath);
        artifacts.push({
          format,
          relativePath,
          sizeBytes: buffer.length,
          sha256: sha256Hex(buffer)
        });
      }

      await fs.rm(tempRoot, { recursive: true, force: true });
      job.artifacts = artifacts;
      job.status = 'succeeded';
      job.updatedAt = Date.now();
      job.error = null;
    } catch (error) {
      job.status = 'failed';
      job.updatedAt = Date.now();
      job.error = {
        code: 'EXPORT_FAILED',
        message: error instanceof Error ? error.message : 'export failed'
      };
    }
  }

  async executePreviewJob(job) {
    job.status = 'running';
    job.updatedAt = Date.now();

    try {
      const tempRoot = await fs.mkdtemp(path.join(this.config.workRoot, `preview-${job.jobId}-`));
      const inputPath = path.join(tempRoot, 'slides.md');
      const outputDir = path.join(tempRoot, 'dist');
      await fs.writeFile(inputPath, job.payload.markdown, 'utf8');

      await this.runSlidevBuild(inputPath, outputDir);

      const previewRelativeDir = `previews/${job.sourceHash}`;
      const previewTargetDir = path.resolve(this.config.storageRoot, previewRelativeDir);
      if (!isSafePath(this.config.storageRoot, previewTargetDir)) {
        throw new Error('unsafe preview path');
      }

      await fs.rm(previewTargetDir, { recursive: true, force: true });
      await ensureDirectory(path.dirname(previewTargetDir));
      await fs.cp(outputDir, previewTargetDir, { recursive: true });
      await fs.rm(tempRoot, { recursive: true, force: true });

      const previewExpiresAtMs = Date.now() + job.payload.ttlSeconds * 1000;
      const indexRelativePath = `${previewRelativeDir}/index.html`;
      this.previewCache.set(job.sourceHash, {
        indexRelativePath,
        expiresAtMs: previewExpiresAtMs
      });

      job.previewRelativePath = indexRelativePath;
      job.previewExpiresAtMs = previewExpiresAtMs;
      job.status = 'ready';
      job.updatedAt = Date.now();
      job.error = null;
    } catch (error) {
      job.status = 'failed';
      job.updatedAt = Date.now();
      job.error = {
        code: 'PREVIEW_FAILED',
        message: error instanceof Error ? error.message : 'preview failed'
      };
    }
  }

  async runSlidevExport(inputPath, outputPath, format) {
    if (this.config.mockExecutor) {
      await ensureDirectory(path.dirname(outputPath));
      await fs.writeFile(outputPath, `mock-${format}-${path.basename(outputPath)}`, 'utf8');
      return;
    }

    await this.runCommand([
      'export',
      inputPath,
      '--format',
      format,
      '--output',
      outputPath,
      '--timeout',
      String(this.config.pageTimeoutMs),
      '--wait-until',
      this.config.waitUntil
    ]);
  }

  async runSlidevBuild(inputPath, outputDir) {
    if (this.config.mockExecutor) {
      await ensureDirectory(outputDir);
      const html = `<!doctype html><html><body><h1>mock preview</h1><p>${path.basename(inputPath)}</p></body></html>`;
      await fs.writeFile(path.join(outputDir, 'index.html'), html, 'utf8');
      return;
    }

    await this.runCommand([
      'build',
      inputPath,
      '--out',
      outputDir
    ]);
  }

  async runCommand(args) {
    return new Promise((resolve, reject) => {
      const child = spawn(SLIDEV_BIN, args, {
        cwd: __dirname,
        env: {
          ...process.env,
          CI: '1'
        },
        stdio: ['ignore', 'pipe', 'pipe']
      });

      let stderr = '';
      const timeout = setTimeout(() => {
        stderr += `\nslidev command timed out after ${this.config.exportTimeoutMs}ms`;
        child.kill('SIGKILL');
      }, this.config.exportTimeoutMs);

      child.stderr.on('data', (chunk) => {
        stderr += String(chunk || '');
      });

      child.on('error', (error) => {
        clearTimeout(timeout);
        reject(error);
      });

      child.on('close', (code) => {
        clearTimeout(timeout);
        if (code === 0) {
          resolve();
          return;
        }
        reject(new Error(stderr.trim() || `slidev command failed with code ${code}`));
      });
    });
  }

  createJobId(prefix) {
    return `${prefix}_${Date.now()}_${crypto.randomUUID().replace(/-/g, '')}`;
  }
}

function createConfig(env = process.env) {
  return {
    port: normalizeInt(env.PORT, 3211),
    workRoot: env.SLIDES_API_WORK_ROOT || path.join(__dirname, '.tmp'),
    storageRoot: env.SLIDES_API_STORAGE_ROOT || path.join(__dirname, '.storage'),
    bearerToken: env.SLIDES_API_BEARER_TOKEN || '',
    signSecret: env.SLIDES_API_SIGN_SECRET || '',
    publicBaseUrl: env.SLIDES_API_PUBLIC_BASE_URL || '',
    artifactUrlTtlSeconds: normalizeInt(env.SLIDES_API_ARTIFACT_URL_TTL_SECONDS, 900),
    previewCacheTtlSeconds: normalizeInt(env.SLIDES_API_PREVIEW_CACHE_TTL_SECONDS, 86400),
    exportTimeoutMs: normalizeInt(env.SLIDES_API_EXPORT_TIMEOUT_MS, 600000),
    pageTimeoutMs: normalizeInt(env.SLIDES_API_PAGE_TIMEOUT_MS, 180000),
    waitUntil: env.SLIDES_API_WAIT_UNTIL || 'load',
    mockExecutor: env.SLIDES_API_MOCK_EXECUTOR || ''
  };
}

function createServer(service) {
  return http.createServer(async (request, response) => {
    const url = new URL(request.url || '/', `http://${request.headers.host || 'localhost'}`);

    if (request.method === 'GET' && url.pathname === '/health') {
      sendJson(response, 200, { ok: true });
      return;
    }

    if (url.pathname.startsWith('/v1/')) {
      if (!service.requireAuthorized(request)) {
        sendJson(response, 401, { message: 'unauthorized' });
        return;
      }

      try {
        if (request.method === 'POST' && url.pathname === '/v1/exports') {
          const body = parseJsonOrEmpty(await readRequestBody(request));
          const submitted = service.submitExport(body.markdown, body.formats, body.fileName);
          sendJson(response, 202, submitted);
          return;
        }

        if (request.method === 'GET' && url.pathname.startsWith('/v1/exports/')) {
          const jobId = url.pathname.slice('/v1/exports/'.length);
          const job = service.getExportJob(jobId);
          if (!job) {
            sendJson(response, 404, { message: 'job not found' });
            return;
          }
          sendJson(response, 200, job);
          return;
        }

        if (request.method === 'POST' && url.pathname === '/v1/previews') {
          const body = parseJsonOrEmpty(await readRequestBody(request));
          const submitted = service.submitPreview(body.markdown, body.ttlSeconds);
          sendJson(response, submitted.cacheHit ? 200 : 202, submitted);
          return;
        }

        if (request.method === 'GET' && url.pathname.startsWith('/v1/previews/')) {
          const jobId = url.pathname.slice('/v1/previews/'.length);
          const job = service.getPreviewJob(jobId);
          if (!job) {
            sendJson(response, 404, { message: 'job not found' });
            return;
          }
          sendJson(response, 200, job);
          return;
        }

        sendJson(response, 404, { message: 'not found' });
      } catch (error) {
        const message = error instanceof Error ? error.message : 'request failed';
        if (message.includes('required') || message.includes('formats')) {
          sendJson(response, 400, { message });
          return;
        }
        sendJson(response, 500, { message });
      }
      return;
    }

    const isFileRequest = url.pathname.startsWith('/files/');
    const isPreviewRequest = url.pathname.startsWith('/previews/');

    if (isFileRequest || isPreviewRequest) {
      const prefix = isFileRequest ? '/files/' : '/previews/';
      const kind = isFileRequest ? URL_KIND_FILE : URL_KIND_PREVIEW;
      const rawRelativePath = url.pathname.slice(prefix.length);
      const relativePath = rawRelativePath.split('/').map((segment) => decodeURIComponent(segment)).join('/');

      if (!service.validateSignedAccess(kind, relativePath, url)) {
        sendJson(response, 403, { message: 'forbidden' });
        return;
      }

      const absolutePath = path.resolve(service.config.storageRoot, relativePath);
      if (!isSafePath(service.config.storageRoot, absolutePath)) {
        sendJson(response, 400, { message: 'invalid path' });
        return;
      }

      try {
        const stat = await fs.stat(absolutePath);
        if (stat.isDirectory()) {
          sendJson(response, 404, { message: 'not found' });
          return;
        }

        const fileBuffer = await fs.readFile(absolutePath);
        response.writeHead(200, {
          'Content-Type': inferContentType(absolutePath),
          'Content-Length': String(fileBuffer.length),
          'Cache-Control': 'private, max-age=60'
        });
        response.end(fileBuffer);
      } catch {
        sendJson(response, 404, { message: 'not found' });
      }
      return;
    }

    sendText(response, 404, 'Not found');
  });
}

export async function createSlidesApiServer(config = createConfig()) {
  const service = new SlidesApiService(config);
  await service.init();
  const server = createServer(service);
  return { server, service, config };
}

if (import.meta.url === `file://${process.argv[1]}`) {
  const config = createConfig();
  const { server } = await createSlidesApiServer(config);
  server.listen(config.port, () => {
    console.log(`slides-api listening on :${config.port}`);
  });
}
