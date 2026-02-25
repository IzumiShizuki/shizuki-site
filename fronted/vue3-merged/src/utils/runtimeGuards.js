const TRUE_SET = new Set(['', '1', 'true', 'yes', 'on']);
const FALSE_SET = new Set(['0', 'false', 'no', 'off']);

function parseBooleanFlag(raw) {
  if (raw === null || raw === undefined) return null;
  const normalized = String(raw).trim().toLowerCase();
  if (TRUE_SET.has(normalized)) return true;
  if (FALSE_SET.has(normalized)) return false;
  return null;
}

function queryFlag(search, key) {
  if (!search || !key) return null;
  try {
    const params = new URLSearchParams(search);
    if (!params.has(key)) return null;
    return parseBooleanFlag(params.get(key));
  } catch {
    return null;
  }
}

function resolveFlag({ search, queryKey, storageKeys, storageReader }) {
  const queryValue = queryFlag(search, queryKey);
  if (queryValue !== null) return queryValue;

  for (const storageKey of storageKeys) {
    const storageRaw = storageReader(storageKey);
    const storageValue = parseBooleanFlag(storageRaw);
    if (storageValue !== null) return storageValue;
  }
  return false;
}

export function resolveRuntimeGuards(options = {}) {
  const search =
    typeof options.search === 'string'
      ? options.search
      : typeof window !== 'undefined'
        ? window.location.search
        : '';
  const storageReader =
    typeof options.storageReader === 'function'
      ? options.storageReader
      : typeof window !== 'undefined'
        ? (key) => {
            try {
              return window.localStorage.getItem(key);
            } catch {
              return null;
            }
          }
        : () => null;

  return Object.freeze({
    diagWindow: resolveFlag({
      search,
      queryKey: 'diag_window',
      storageKeys: ['shizuki.diag.window'],
      storageReader
    }),
    disableLevitationBall: resolveFlag({
      search,
      queryKey: 'guard_no_ball',
      // Keep levitation available by default; only explicit URL flags can disable it.
      storageKeys: [],
      storageReader
    }),
    disableGlobalPointerHooks: resolveFlag({
      search,
      queryKey: 'guard_no_pointer',
      storageKeys: ['shizuki.guard.disableGlobalPointerHooks', 'shizuki.guard.no_pointer'],
      storageReader
    }),
    disableVisualizerLoop: resolveFlag({
      search,
      queryKey: 'guard_no_visualizer',
      storageKeys: ['shizuki.guard.disableVisualizerLoop', 'shizuki.guard.no_visualizer'],
      storageReader
    })
  });
}

export const runtimeGuards = resolveRuntimeGuards();
