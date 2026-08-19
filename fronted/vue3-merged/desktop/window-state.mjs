import { readFileSync, writeFileSync } from 'node:fs';

export const DEFAULT_WINDOW_BOUNDS = Object.freeze({ width: 1440, height: 900 });

function finiteInteger(value) {
  return Number.isFinite(Number(value)) ? Math.round(Number(value)) : null;
}

function intersects(bounds, area) {
  return bounds.x < area.x + area.width
    && bounds.x + bounds.width > area.x
    && bounds.y < area.y + area.height
    && bounds.y + bounds.height > area.y;
}

export function normalizeWindowState(rawState, displayAreas, defaults = DEFAULT_WINDOW_BOUNDS) {
  const width = finiteInteger(rawState?.width);
  const height = finiteInteger(rawState?.height);
  const x = finiteInteger(rawState?.x);
  const y = finiteInteger(rawState?.y);
  const usableSize = width !== null && height !== null && width >= 720 && height >= 520;
  const positioned = usableSize && x !== null && y !== null
    ? { x, y, width: Math.min(width, 7680), height: Math.min(height, 4320) }
    : null;
  const areas = Array.isArray(displayAreas) ? displayAreas.filter(Boolean) : [];

  if (positioned && areas.some(area => intersects(positioned, area))) {
    return { ...positioned, maximized: rawState?.maximized === true };
  }

  const primary = areas[0] || { x: 0, y: 0, width: defaults.width, height: defaults.height };
  const fallbackWidth = Math.min(defaults.width, primary.width);
  const fallbackHeight = Math.min(defaults.height, primary.height);
  return {
    x: primary.x + Math.max(0, Math.round((primary.width - fallbackWidth) / 2)),
    y: primary.y + Math.max(0, Math.round((primary.height - fallbackHeight) / 2)),
    width: fallbackWidth,
    height: fallbackHeight,
    maximized: false
  };
}

export function readWindowState(filePath, displayAreas) {
  try {
    return normalizeWindowState(JSON.parse(readFileSync(filePath, 'utf8')), displayAreas);
  } catch {
    return normalizeWindowState(null, displayAreas);
  }
}

export function writeWindowState(filePath, state) {
  writeFileSync(filePath, `${JSON.stringify(state, null, 2)}\n`, { encoding: 'utf8', mode: 0o600 });
}
