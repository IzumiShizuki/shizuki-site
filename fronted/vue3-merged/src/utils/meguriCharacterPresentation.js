const SAFE_SPRITE_FILE_PATTERN = /^ce\d{5}[lm]\.png$/i;
const OUTFIT_CODE_PATTERN = /^0[1-6]$/;
const INTENSITIES = new Set(['low', 'medium', 'high']);

const EXPRESSION_CODES = Object.freeze({
  neutral: { low: '001', medium: '001', high: '004' },
  happy: { low: '002', medium: '003', high: '202' },
  gentle_happy: { low: '002', medium: '003', high: '202' },
  affectionate: { low: '022', medium: '010', high: '102' },
  excited: { low: '003', medium: '202', high: '206' },
  angry: { low: '012', medium: '014', high: '006' },
  confused: { low: '104', medium: '015', high: '211' },
  embarrassed: { low: '010', medium: '102', high: '211' },
  sad: { low: '016', medium: '015', high: '013' },
  sleepy: { low: '023', medium: '013', high: '005' },
  surprised: { low: '022', medium: '011', high: '211' },
  teasing: { low: '020', medium: '021', high: '006' },
  worried: { low: '009', medium: '016', high: '015' }
});

export const DEFAULT_MEGURI_PRESENTATION = Object.freeze({
  expressionTag: 'neutral',
  expressionIntensity: 'low',
  outfitCode: '04',
  spriteFile: 'ce04001l.png',
  motionTag: ''
});

function readCueValue(cue, camelKey, snakeKey) {
  return cue?.[camelKey] ?? cue?.[snakeKey];
}

function normalizeCurrent(current = {}) {
  const expressionTag = EXPRESSION_CODES[current.expressionTag]
    ? current.expressionTag
    : DEFAULT_MEGURI_PRESENTATION.expressionTag;
  const expressionIntensity = INTENSITIES.has(current.expressionIntensity)
    ? current.expressionIntensity
    : DEFAULT_MEGURI_PRESENTATION.expressionIntensity;
  const outfitCode = OUTFIT_CODE_PATTERN.test(String(current.outfitCode || ''))
    ? String(current.outfitCode)
    : DEFAULT_MEGURI_PRESENTATION.outfitCode;
  const spriteFile = SAFE_SPRITE_FILE_PATTERN.test(String(current.spriteFile || ''))
    ? String(current.spriteFile)
    : deriveMeguriSpriteFile({ expressionTag, expressionIntensity, outfitCode });
  return {
    expressionTag,
    expressionIntensity,
    outfitCode,
    spriteFile,
    motionTag: String(current.motionTag || '').trim()
  };
}

export function deriveMeguriSpriteFile({ expressionTag = 'neutral', expressionIntensity = 'low', outfitCode = '04' } = {}) {
  const safeExpression = EXPRESSION_CODES[expressionTag] ? expressionTag : 'neutral';
  const safeIntensity = INTENSITIES.has(expressionIntensity) ? expressionIntensity : 'low';
  const safeOutfit = OUTFIT_CODE_PATTERN.test(String(outfitCode || '')) ? String(outfitCode) : '04';
  return `ce${safeOutfit}${EXPRESSION_CODES[safeExpression][safeIntensity]}l.png`;
}

export function resolveMeguriPresentation(current = DEFAULT_MEGURI_PRESENTATION, cue = {}) {
  const previous = normalizeCurrent(current);
  const cueExpression = String(readCueValue(cue, 'expressionTag', 'expression_tag') || '').trim();
  const cueIntensity = String(readCueValue(cue, 'expressionIntensity', 'expression_intensity') || '').trim();
  const cueOutfit = String(readCueValue(cue, 'outfitCode', 'outfit_code') || '').trim();
  const cueSprite = String(readCueValue(cue, 'spriteFile', 'sprite_file') || '').trim();
  const cueMotion = String(readCueValue(cue, 'motionTag', 'motion_tag') || '').trim();

  const expressionTag = EXPRESSION_CODES[cueExpression] ? cueExpression : previous.expressionTag;
  const expressionIntensity = INTENSITIES.has(cueIntensity) ? cueIntensity : previous.expressionIntensity;
  const outfitCode = OUTFIT_CODE_PATTERN.test(cueOutfit) ? cueOutfit : previous.outfitCode;
  const presentationChanged =
    expressionTag !== previous.expressionTag ||
    expressionIntensity !== previous.expressionIntensity ||
    outfitCode !== previous.outfitCode;
  const spriteFile = SAFE_SPRITE_FILE_PATTERN.test(cueSprite)
    ? cueSprite
    : presentationChanged
      ? deriveMeguriSpriteFile({ expressionTag, expressionIntensity, outfitCode })
      : previous.spriteFile;

  return {
    expressionTag,
    expressionIntensity,
    outfitCode,
    spriteFile,
    motionTag: cueMotion || previous.motionTag
  };
}

export function resolveMeguriMotionClass(motionTag, reducedMotion = false) {
  if (reducedMotion) return '';
  const normalized = String(motionTag || '').trim().toLowerCase();
  if (/bounce|jump|excited/.test(normalized)) return 'motion-bounce';
  if (/shake|angry/.test(normalized)) return 'motion-shake';
  if (/sway|idle|soft/.test(normalized)) return 'motion-sway';
  return 'motion-breathe';
}

export function isSafeMeguriSpriteFile(fileName) {
  return SAFE_SPRITE_FILE_PATTERN.test(String(fileName || ''));
}
