<template>
  <div class="l2d-shell" :class="{ failed: failed }">
    <canvas v-if="!failed" ref="canvasRef" class="l2d-canvas"></canvas>
    <img v-else class="l2d-fallback" :src="fallbackSrc" alt="l2d-fallback" />
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';

const props = defineProps({
  modelUrl: {
    type: String,
    default: ''
  },
  modelEntry: {
    type: String,
    default: ''
  },
  fallbackSrc: {
    type: String,
    default: ''
  }
});

const emit = defineEmits(['error']);

const canvasRef = ref(null);
const failed = ref(false);

let app = null;
let model = null;
let mounted = false;
const objectUrls = new Set();

function isHttpUrl(input) {
  return /^https?:\/\//i.test(String(input || ''));
}

async function loadScriptOnce(src) {
  if (!isHttpUrl(src)) return;
  const key = `__shizuki_script_loaded__:${src}`;
  if (window[key]) return;

  await new Promise((resolve, reject) => {
    const existed = document.querySelector(`script[data-loader="${src}"]`);
    if (existed) {
      existed.addEventListener('load', () => resolve(), { once: true });
      existed.addEventListener('error', () => reject(new Error(`load script failed: ${src}`)), { once: true });
      return;
    }

    const script = document.createElement('script');
    script.src = src;
    script.async = true;
    script.dataset.loader = src;
    script.onload = () => {
      window[key] = true;
      resolve();
    };
    script.onerror = () => reject(new Error(`load script failed: ${src}`));
    document.head.appendChild(script);
  });
}

async function ensureRuntime() {
  await loadScriptOnce('https://unpkg.com/pixi.js@7.4.2/dist/pixi.min.js');
  await loadScriptOnce('https://unpkg.com/pixi-live2d-display/dist/index.min.js');
  await loadScriptOnce('https://unpkg.com/jszip@3.10.1/dist/jszip.min.js');
  if (!window.PIXI || !window.PIXI.live2d || !window.PIXI.live2d.Live2DModel || !window.JSZip) {
    throw new Error('live2d runtime unavailable');
  }
}

function revokeObjectUrls() {
  objectUrls.forEach((url) => {
    try {
      URL.revokeObjectURL(url);
    } catch {
      // ignore
    }
  });
  objectUrls.clear();
}

function registerObjectUrl(blob) {
  const url = URL.createObjectURL(blob);
  objectUrls.add(url);
  return url;
}

function buildMimeByPath(path) {
  const suffix = String(path || '').toLowerCase().split('.').pop() || '';
  if (suffix === 'json') return 'application/json';
  if (suffix === 'moc3') return 'application/octet-stream';
  if (suffix === 'png') return 'image/png';
  if (suffix === 'jpg' || suffix === 'jpeg') return 'image/jpeg';
  if (suffix === 'wav') return 'audio/wav';
  if (suffix === 'mp3') return 'audio/mpeg';
  return 'application/octet-stream';
}

function normalizePath(path) {
  return String(path || '').replace(/\\/g, '/').replace(/^\.\//, '').trim();
}

function resolvePath(baseDir, target) {
  const cleanBase = normalizePath(baseDir);
  const cleanTarget = normalizePath(target);
  if (!cleanTarget) return '';
  if (cleanTarget.startsWith('/')) {
    return cleanTarget.slice(1);
  }
  const prefix = cleanBase ? `${cleanBase}/` : '';
  const merged = `${prefix}${cleanTarget}`;
  const stack = [];
  merged.split('/').forEach((segment) => {
    if (!segment || segment === '.') return;
    if (segment === '..') {
      stack.pop();
      return;
    }
    stack.push(segment);
  });
  return stack.join('/');
}

function collectModelReferences(modelJson) {
  const refs = [];
  const fileRefs = modelJson?.FileReferences || {};
  if (typeof fileRefs.Moc === 'string') refs.push(fileRefs.Moc);
  if (typeof fileRefs.Physics === 'string') refs.push(fileRefs.Physics);
  if (typeof fileRefs.Pose === 'string') refs.push(fileRefs.Pose);
  if (Array.isArray(fileRefs.Textures)) {
    fileRefs.Textures.forEach((item) => {
      if (typeof item === 'string') refs.push(item);
    });
  }
  if (fileRefs.Expressions && typeof fileRefs.Expressions === 'object') {
    Object.values(fileRefs.Expressions).forEach((group) => {
      if (!Array.isArray(group)) return;
      group.forEach((entry) => {
        if (entry && typeof entry.File === 'string') refs.push(entry.File);
      });
    });
  }
  if (fileRefs.Motions && typeof fileRefs.Motions === 'object') {
    Object.values(fileRefs.Motions).forEach((group) => {
      if (!Array.isArray(group)) return;
      group.forEach((entry) => {
        if (entry && typeof entry.File === 'string') refs.push(entry.File);
        if (entry && typeof entry.Sound === 'string') refs.push(entry.Sound);
      });
    });
  }
  return refs;
}

function rewriteModelJsonWithBlobUrls(modelJson, modelDir, blobUrlMap) {
  const copied = JSON.parse(JSON.stringify(modelJson || {}));
  const fileRefs = copied.FileReferences || {};
  const rewrite = (value) => {
    if (typeof value !== 'string') return value;
    const target = resolvePath(modelDir, value);
    return blobUrlMap.get(target) || value;
  };

  fileRefs.Moc = rewrite(fileRefs.Moc);
  fileRefs.Physics = rewrite(fileRefs.Physics);
  fileRefs.Pose = rewrite(fileRefs.Pose);

  if (Array.isArray(fileRefs.Textures)) {
    fileRefs.Textures = fileRefs.Textures.map((item) => rewrite(item));
  }

  if (fileRefs.Expressions && typeof fileRefs.Expressions === 'object') {
    Object.keys(fileRefs.Expressions).forEach((group) => {
      const list = fileRefs.Expressions[group];
      if (!Array.isArray(list)) return;
      fileRefs.Expressions[group] = list.map((entry) => ({
        ...entry,
        File: rewrite(entry?.File)
      }));
    });
  }

  if (fileRefs.Motions && typeof fileRefs.Motions === 'object') {
    Object.keys(fileRefs.Motions).forEach((group) => {
      const list = fileRefs.Motions[group];
      if (!Array.isArray(list)) return;
      fileRefs.Motions[group] = list.map((entry) => ({
        ...entry,
        File: rewrite(entry?.File),
        Sound: rewrite(entry?.Sound)
      }));
    });
  }

  copied.FileReferences = fileRefs;
  return copied;
}

async function buildModelUrlFromZip() {
  const rawUrl = String(props.modelUrl || '').trim();
  const modelEntryRaw = normalizePath(props.modelEntry);
  if (!rawUrl || !modelEntryRaw) {
    throw new Error('l2d model url/entry missing');
  }

  const response = await fetch(rawUrl, { cache: 'no-store' });
  if (!response.ok) {
    throw new Error(`fetch l2d package failed (${response.status})`);
  }
  const buffer = await response.arrayBuffer();
  const zip = await window.JSZip.loadAsync(buffer);
  const modelFile = zip.file(modelEntryRaw);
  if (!modelFile) {
    throw new Error('model3.json not found in zip package');
  }

  const modelText = await modelFile.async('text');
  const modelJson = JSON.parse(modelText || '{}');
  const modelDir = modelEntryRaw.includes('/') ? modelEntryRaw.slice(0, modelEntryRaw.lastIndexOf('/')) : '';

  const refs = collectModelReferences(modelJson);
  const blobUrlMap = new Map();
  for (const rawRef of refs) {
    const resolved = resolvePath(modelDir, rawRef);
    if (!resolved || blobUrlMap.has(resolved)) continue;
    const refFile = zip.file(resolved);
    if (!refFile) continue;
    const blob = await refFile.async('blob');
    const fileBlob = new Blob([blob], { type: buildMimeByPath(resolved) });
    blobUrlMap.set(resolved, registerObjectUrl(fileBlob));
  }

  const rewrittenModel = rewriteModelJsonWithBlobUrls(modelJson, modelDir, blobUrlMap);
  return registerObjectUrl(new Blob([JSON.stringify(rewrittenModel)], { type: 'application/json' }));
}

function resetRenderer() {
  if (model) {
    try {
      model.destroy();
    } catch {
      // ignore
    }
    model = null;
  }
  if (app) {
    try {
      app.destroy(true, { children: true, texture: true, baseTexture: true });
    } catch {
      // ignore
    }
    app = null;
  }
  revokeObjectUrls();
}

function resizeModel() {
  if (!app || !model || !canvasRef.value) return;
  const canvas = canvasRef.value;
  const width = Math.max(220, canvas.clientWidth || 320);
  const height = Math.max(220, canvas.clientHeight || 320);
  app.renderer.resize(width, height);

  const xScale = width / model.width;
  const yScale = height / model.height;
  const scale = Math.min(xScale, yScale) * 0.88;
  model.scale.set(scale);
  model.anchor.set(0.5, 1);
  model.x = width * 0.5;
  model.y = height * 0.98;
}

async function renderModel() {
  const rawUrl = String(props.modelUrl || '').trim();
  if (!rawUrl || !canvasRef.value) {
    failed.value = true;
    return;
  }

  resetRenderer();
  await ensureRuntime();

  let targetModelUrl = rawUrl;
  if (rawUrl.toLowerCase().endsWith('.zip')) {
    targetModelUrl = await buildModelUrlFromZip();
  }

  const PIXI = window.PIXI;
  app = new PIXI.Application({
    view: canvasRef.value,
    autoStart: true,
    backgroundAlpha: 0,
    antialias: true,
    resizeTo: canvasRef.value
  });

  model = await window.PIXI.live2d.Live2DModel.from(targetModelUrl, {
    autoInteract: true
  });

  app.stage.addChild(model);
  resizeModel();
  failed.value = false;
}

async function boot() {
  if (!mounted) return;
  try {
    await renderModel();
  } catch (error) {
    failed.value = true;
    emit('error', error instanceof Error ? error.message : 'l2d render failed');
    resetRenderer();
  }
}

const fallbackSrc = computed(() => String(props.fallbackSrc || '').trim());

onMounted(() => {
  mounted = true;
  if (typeof window !== 'undefined') {
    window.addEventListener('resize', onResize);
  }
  boot();
});

watch(
  () => [props.modelUrl, props.modelEntry],
  () => {
    boot();
  }
);

const onResize = () => {
  resizeModel();
};

onBeforeUnmount(() => {
  mounted = false;
  if (typeof window !== 'undefined') {
    window.removeEventListener('resize', onResize);
  }
  resetRenderer();
});
</script>

<style scoped>
.l2d-shell {
  position: absolute;
  inset: 0;
  pointer-events: none;
}

.l2d-canvas,
.l2d-fallback {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.l2d-fallback {
  filter: saturate(0.92) contrast(1.04) brightness(0.82);
}
</style>
