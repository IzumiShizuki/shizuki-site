const AOS_TARGET_SELECTOR = [
  '.route-page-view .route-page.liquid-material',
  '.route-page-view .liquid-material',
  '.route-page-view .feed-card',
  '.route-page-view .post-card',
  '.route-page-view .latest-item',
  '.route-page-view .list-row',
  '.route-page-view .mine-item',
  '.route-page-view .comment-panel'
].join(', ');

const DEFAULT_DURATION = '520';
const DEFAULT_EASING = 'ease-out-cubic';
const DEFAULT_OFFSET = '18';
const AOS_ATTRIBUTE_NAMES = ['data-aos', 'data-aos-duration', 'data-aos-easing', 'data-aos-offset', 'data-aos-once', 'data-aos-delay'];
const AOS_CLASS_NAMES = ['aos-init', 'aos-animate'];

let observer = null;
let initialized = false;
let refreshTimer = 0;

function hasWindow() {
  return typeof window !== 'undefined';
}

function getAosInstance() {
  if (!hasWindow()) return null;
  return window.AOS || null;
}

function prefersReducedMotion() {
  if (!hasWindow() || typeof window.matchMedia !== 'function') return false;
  return window.matchMedia('(prefers-reduced-motion: reduce)').matches;
}

function clearAosState(node) {
  if (!(node instanceof HTMLElement)) return;
  AOS_ATTRIBUTE_NAMES.forEach((name) => node.removeAttribute(name));
  AOS_CLASS_NAMES.forEach((name) => node.classList.remove(name));
}

function shouldIgnoreNode(node) {
  if (!(node instanceof HTMLElement)) return true;
  if (node.closest('[data-aos-ignore="true"]')) return true;
  const scrollContainer = node.closest('.subtle-scroll-area');
  if (scrollContainer && scrollContainer !== node) return true;
  if (node.closest('.click-ripple-layer')) return true;
  if (node.closest('.bg-picker-mask')) return true;
  if (node.closest('.dialog-mask')) return true;
  if (node.classList.contains('global-lyric-bar')) return true;
  return false;
}

function applyAosFadeUp(root = document) {
  if (!(root instanceof Document || root instanceof HTMLElement)) return;
  const nodes = root.querySelectorAll(AOS_TARGET_SELECTOR);
  let visibleOrder = 0;

  nodes.forEach((node) => {
    if (shouldIgnoreNode(node)) {
      clearAosState(node);
      return;
    }

    if (!node.hasAttribute('data-aos')) {
      node.setAttribute('data-aos', 'fade-up');
    }
    if (!node.hasAttribute('data-aos-duration')) {
      node.setAttribute('data-aos-duration', DEFAULT_DURATION);
    }
    if (!node.hasAttribute('data-aos-easing')) {
      node.setAttribute('data-aos-easing', DEFAULT_EASING);
    }
    if (!node.hasAttribute('data-aos-offset')) {
      node.setAttribute('data-aos-offset', DEFAULT_OFFSET);
    }
    if (!node.hasAttribute('data-aos-once')) {
      node.setAttribute('data-aos-once', 'true');
    }
    if (!node.hasAttribute('data-aos-delay')) {
      node.setAttribute('data-aos-delay', String((visibleOrder % 8) * 42));
    }

    visibleOrder += 1;
  });
}

function queueAosRefresh() {
  const aos = getAosInstance();
  if (!aos) return;
  if (refreshTimer) {
    window.clearTimeout(refreshTimer);
  }
  refreshTimer = window.setTimeout(() => {
    refreshTimer = 0;
    aos.refreshHard();
  }, 40);
}

function observeRouteContent() {
  if (!hasWindow()) return;
  const root = document.querySelector('.route-content') || document.body;
  if (!root) return;

  if (observer) {
    observer.disconnect();
  }

  observer = new MutationObserver((mutations) => {
    const hasElementAdded = mutations.some((mutation) =>
      Array.from(mutation.addedNodes || []).some((node) => node instanceof HTMLElement)
    );
    if (!hasElementAdded) return;
    applyAosFadeUp(root);
    queueAosRefresh();
  });

  observer.observe(root, { childList: true, subtree: true });
}

export function initAosManager() {
  if (!hasWindow() || initialized) return;
  const aos = getAosInstance();
  if (!aos) return;

  applyAosFadeUp(document);
  aos.init({
    once: true,
    duration: Number(DEFAULT_DURATION),
    easing: DEFAULT_EASING,
    offset: Number(DEFAULT_OFFSET),
    disable: () => prefersReducedMotion(),
    startEvent: 'DOMContentLoaded'
  });

  observeRouteContent();
  queueAosRefresh();
  initialized = true;
}

export function refreshAosManager() {
  if (!hasWindow()) return;
  const root = document.querySelector('.route-page-view') || document;
  applyAosFadeUp(root);
  queueAosRefresh();
}
