function clamp(value, min, max) {
  return Math.min(max, Math.max(min, value));
}

function normalizeRect(rect) {
  const width = Number(rect?.width || 0);
  const height = Number(rect?.height || 0);
  const left = Number(rect?.left || 0);
  const top = Number(rect?.top || 0);
  if (width <= 0 || height <= 0) {
    return null;
  }
  return { width, height, left, top };
}

export function createAuthorMotionState(options = {}) {
  return {
    motionEnabled: options?.reducedMotion !== true,
    pointer: {
      x: 0,
      y: 0,
      active: false
    },
    journeyProgress: 0,
    activeJourneyIndex: -1
  };
}

export function mapPointerToParallax(x, y, rect, maxOffset = 8) {
  const safeRect = normalizeRect(rect);
  const cap = Number.isFinite(maxOffset) ? Math.max(0, Math.abs(maxOffset)) : 8;
  if (!safeRect || cap === 0) {
    return { x: 0, y: 0 };
  }

  const ratioX = ((Number(x) - safeRect.left) / safeRect.width) * 2 - 1;
  const ratioY = ((Number(y) - safeRect.top) / safeRect.height) * 2 - 1;
  return {
    x: clamp(ratioX * cap, -cap, cap),
    y: clamp(ratioY * cap, -cap, cap)
  };
}

function revealImmediately(targets, revealClass, readyClass) {
  targets.forEach((target) => {
    target.classList.add(readyClass);
    target.classList.add(revealClass);
  });
}

export function setupRevealObserver(rootEl, selector, options = {}) {
  if (!(rootEl instanceof HTMLElement) || !selector) {
    return {
      refresh() {},
      disconnect() {}
    };
  }

  const revealClass = String(options.revealClass || 'is-revealed');
  const readyClass = String(options.readyClass || 'is-reveal-ready');
  const baseDelay = Number.isFinite(options.baseDelay) ? Number(options.baseDelay) : 0;
  const stepDelay = Number.isFinite(options.stepDelay) ? Number(options.stepDelay) : 60;
  const once = options.once !== false;
  const disabled = options.disabled === true;

  let observer = null;

  const decorateTargets = () => {
    const targets = Array.from(rootEl.querySelectorAll(selector)).filter((node) => node instanceof HTMLElement);
    targets.forEach((target, index) => {
      target.classList.add(readyClass);
      target.style.setProperty('--reveal-delay', `${baseDelay + index * stepDelay}ms`);
    });
    return targets;
  };

  const observeTargets = () => {
    const targets = decorateTargets();
    if (!targets.length) return;

    if (disabled || typeof IntersectionObserver !== 'function') {
      revealImmediately(targets, revealClass, readyClass);
      return;
    }

    if (observer) observer.disconnect();
    observer = new IntersectionObserver(
      (entries) => {
        entries.forEach((entry) => {
          if (!entry.isIntersecting) return;
          const target = entry.target;
          target.classList.add(revealClass);
          if (once && observer) {
            observer.unobserve(target);
          }
        });
      },
      {
        root: options.root instanceof Element ? options.root : null,
        threshold: Number.isFinite(options.threshold) ? Number(options.threshold) : 0.18
      }
    );

    targets.forEach((target) => {
      if (target.classList.contains(revealClass)) return;
      observer.observe(target);
    });
  };

  observeTargets();
  return {
    refresh() {
      observeTargets();
    },
    disconnect() {
      if (observer) observer.disconnect();
      observer = null;
    }
  };
}
