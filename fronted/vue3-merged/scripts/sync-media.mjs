import fs from 'node:fs/promises';
import path from 'node:path';

const projectRoot = path.resolve(path.dirname(new URL(import.meta.url).pathname), '..');
const publicRoot = path.join(projectRoot, 'public', 'media');

function toPosix(p) {
  return p.split(path.sep).join('/');
}

async function ensureDir(dir) {
  await fs.mkdir(dir, { recursive: true });
}

async function exists(filePath) {
  try {
    await fs.access(filePath);
    return true;
  } catch {
    return false;
  }
}

async function listFiles(dir, exts) {
  const entries = await fs.readdir(dir, { withFileTypes: true });
  return entries
    .filter((e) => e.isFile())
    .map((e) => path.join(dir, e.name))
    .filter((f) => exts.includes(path.extname(f).toLowerCase()));
}

function defaultSources() {
  return {
    bgmDir: process.env.BGM_SRC_DIR || 'D:/G/Katanegai/Extracted_Final/BGM_MP3',
    imageDir: process.env.BG_IMAGE_DIR || 'D:/G/Katanegai/Extracted_Final/Images',
    webpAnimDir: process.env.BG_WEBP_ANIM_DIR || 'D:/G/Katanegai/Extracted_Final/WebP_Animations',
    videoDir: process.env.BG_VIDEO_DIR || 'D:/G/Katanegai/Extracted_Final/Videos'
  };
}

async function copyFileTo(src, targetDir) {
  const fileName = path.basename(src);
  const dest = path.join(targetDir, fileName);
  await fs.copyFile(src, dest);
  return dest;
}

async function main() {
  const sources = defaultSources();

  const bgmDir = sources.bgmDir;
  const imageDir = sources.imageDir;
  const webpAnimDir = sources.webpAnimDir;
  const videoDir = sources.videoDir;

  const bgmExists = await exists(bgmDir);
  if (!bgmExists) {
    throw new Error(`BGM source missing: ${bgmDir}`);
  }

  await ensureDir(publicRoot);
  const outBgmDir = path.join(publicRoot, 'bgm');
  const outBgDir = path.join(publicRoot, 'background');
  await ensureDir(outBgmDir);
  await ensureDir(outBgDir);

  const trackFiles = await listFiles(bgmDir, ['.mp3']);
  trackFiles.sort((a, b) => a.localeCompare(b, undefined, { numeric: true }));

  const tracks = [];
  let lyricCount = 0;

  for (const trackPath of trackFiles) {
    const copiedAudio = await copyFileTo(trackPath, outBgmDir);
    const id = path.basename(trackPath, path.extname(trackPath));
    const lrcPath = path.join(bgmDir, `${id}.lrc`);
    let lyricRel = null;
    if (await exists(lrcPath)) {
      const copiedLrc = await copyFileTo(lrcPath, outBgmDir);
      lyricRel = toPosix(path.relative(path.join(projectRoot, 'public'), copiedLrc));
      lyricCount += 1;
    }

    tracks.push({
      id,
      title: id,
      audio: toPosix(path.relative(path.join(projectRoot, 'public'), copiedAudio)),
      lyric: lyricRel,
      cover: 'images/katanegai.jpg'
    });
  }

  const backgrounds = [];

  if (await exists(videoDir)) {
    const videos = await listFiles(videoDir, ['.webm', '.mp4', '.mov']);
    videos.sort((a, b) => a.localeCompare(b, undefined, { numeric: true }));
    for (const src of videos) {
      const copied = await copyFileTo(src, outBgDir);
      const rel = toPosix(path.relative(path.join(projectRoot, 'public'), copied));
      const id = path.basename(src, path.extname(src));
      backgrounds.push({
        id: `video-${id}`,
        name: id,
        type: 'dynamic',
        src: rel,
        preview: rel,
        available: true
      });
    }
  }

  if (await exists(webpAnimDir)) {
    const anims = await listFiles(webpAnimDir, ['.webp', '.gif']);
    anims.sort((a, b) => a.localeCompare(b, undefined, { numeric: true }));
    for (const src of anims) {
      const copied = await copyFileTo(src, outBgDir);
      const rel = toPosix(path.relative(path.join(projectRoot, 'public'), copied));
      const id = path.basename(src, path.extname(src));
      backgrounds.push({
        id: `anim-${id}`,
        name: id,
        type: 'dynamic',
        src: rel,
        preview: rel,
        available: true
      });
    }
  }

  if (await exists(imageDir)) {
    const images = await listFiles(imageDir, ['.png', '.jpg', '.jpeg', '.webp', '.avif']);
    images.sort((a, b) => a.localeCompare(b, undefined, { numeric: true }));
    for (const src of images) {
      const copied = await copyFileTo(src, outBgDir);
      const rel = toPosix(path.relative(path.join(projectRoot, 'public'), copied));
      const id = path.basename(src, path.extname(src));
      backgrounds.push({
        id: `image-${id}`,
        name: id,
        type: 'static',
        src: rel,
        preview: rel,
        available: true
      });
    }
  }

  backgrounds.push({
    id: 'l2d-placeholder',
    name: 'L2D 占位',
    type: 'l2d',
    src: '',
    preview: 'images/katanegai.jpg',
    available: false
  });

  const manifest = {
    version: 1,
    generatedAt: new Date().toISOString(),
    tracks,
    backgrounds
  };

  await fs.writeFile(path.join(publicRoot, 'manifest.json'), `${JSON.stringify(manifest, null, 2)}\n`, 'utf8');

  console.log(`tracks=${tracks.length} withLyrics=${lyricCount} backgrounds=${backgrounds.length}`);
}

main().catch((err) => {
  console.error(err.message || err);
  process.exit(1);
});
