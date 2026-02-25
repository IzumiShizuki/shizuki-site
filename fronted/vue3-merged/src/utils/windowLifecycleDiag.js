import { runtimeGuards } from './runtimeGuards';

const ENTRY_LIMIT = 300;

const state = {
  enabled: Boolean(runtimeGuards.diagWindow),
  initialized: false,
  routerHooked: false,
  sequence: 0,
  entries: []
};

function pushEntry(event, payload = {}) {
  if (!state.enabled) return null;
  const entry = {
    seq: ++state.sequence,
    at: new Date().toISOString(),
    ts: typeof performance !== 'undefined' && typeof performance.now === 'function' ? Number(performance.now().toFixed(2)) : 0,
    event,
    payload
  };
  state.entries.push(entry);
  if (state.entries.length > ENTRY_LIMIT) {
    state.entries.splice(0, state.entries.length - ENTRY_LIMIT);
  }
  try {
    console.info(`[window-diag] ${event}`, payload);
  } catch {
    // ignore console errors
  }
  return entry;
}

function attachWindowListeners() {
  if (typeof window === 'undefined' || typeof document === 'undefined') return;

  document.addEventListener('visibilitychange', () => {
    pushEntry('window.visibilitychange', {
      hidden: document.hidden,
      visibilityState: document.visibilityState
    });
  });

  window.addEventListener('focus', () => {
    pushEntry('window.focus', { hasFocus: document.hasFocus() });
  });

  window.addEventListener('blur', () => {
    pushEntry('window.blur', { hasFocus: document.hasFocus() });
  });

  window.addEventListener('resize', () => {
    pushEntry('window.resize', {
      innerWidth: window.innerWidth,
      innerHeight: window.innerHeight
    });
  });

  window.addEventListener('pagehide', (event) => {
    pushEntry('window.pagehide', {
      persisted: Boolean(event?.persisted)
    });
  });

  window.addEventListener('pageshow', (event) => {
    pushEntry('window.pageshow', {
      persisted: Boolean(event?.persisted)
    });
  });

  document.addEventListener('freeze', () => {
    pushEntry('window.freeze');
  });

  document.addEventListener('resume', () => {
    pushEntry('window.resume');
  });
}

function attachGlobalDebugHandle() {
  if (typeof window === 'undefined') return;
  window.__shizukiDiag = {
    enabled: state.enabled,
    guards: runtimeGuards,
    dump() {
      return state.entries.slice();
    },
    clear() {
      state.entries.length = 0;
    },
    mark(event, payload = {}) {
      return pushEntry(event, payload);
    }
  };
}

export function recordWindowDiag(event, payload = {}) {
  return pushEntry(event, payload);
}

export function attachRouterDiag(router) {
  if (!state.enabled || !router || state.routerHooked) return;
  state.routerHooked = true;

  router.beforeEach((to, from) => {
    pushEntry('route.beforeEach', {
      from: from?.fullPath || '',
      to: to?.fullPath || ''
    });
    return true;
  });

  router.afterEach((to, from) => {
    pushEntry('route.afterEach', {
      from: from?.fullPath || '',
      to: to?.fullPath || ''
    });
  });

  router.onError((error) => {
    pushEntry('route.error', {
      message: error?.message || String(error || 'unknown')
    });
  });
}

export function initWindowLifecycleDiag({ router } = {}) {
  if (!state.enabled) return;
  if (!state.initialized) {
    state.initialized = true;
    attachWindowListeners();
    attachGlobalDebugHandle();
    pushEntry('diag.init', {
      href: typeof window !== 'undefined' ? window.location.href : '',
      guards: runtimeGuards
    });
  }
  attachRouterDiag(router);
}

