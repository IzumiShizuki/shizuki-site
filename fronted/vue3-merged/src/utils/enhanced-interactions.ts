/**
 * Magnetic Interaction Utility
 * 磁性交互效果 - 元素跟随鼠标倾斜
 */

export class MagneticEffect {
  private element: HTMLElement;
  private strength: number;
  private isActive: boolean = false;

  constructor(element: HTMLElement, strength: number = 20) {
    this.element = element;
    this.strength = strength;
    this.init();
  }

  private init() {
    this.element.addEventListener('mouseenter', this.handleMouseEnter);
    this.element.addEventListener('mousemove', this.handleMouseMove);
    this.element.addEventListener('mouseleave', this.handleMouseLeave);
  }

  private handleMouseEnter = () => {
    this.isActive = true;
    this.element.setAttribute('data-magnetic-active', 'true');
  };

  private handleMouseMove = (e: MouseEvent) => {
    if (!this.isActive) return;

    const rect = this.element.getBoundingClientRect();
    const centerX = rect.left + rect.width / 2;
    const centerY = rect.top + rect.height / 2;

    const deltaX = (e.clientX - centerX) / rect.width;
    const deltaY = (e.clientY - centerY) / rect.height;

    const moveX = deltaX * this.strength;
    const moveY = deltaY * this.strength;

    this.element.style.transform = `translate(${moveX}px, ${moveY}px)`;
  };

  private handleMouseLeave = () => {
    this.isActive = false;
    this.element.setAttribute('data-magnetic-active', 'false');
    this.element.style.transform = '';
  };

  public destroy() {
    this.element.removeEventListener('mouseenter', this.handleMouseEnter);
    this.element.removeEventListener('mousemove', this.handleMouseMove);
    this.element.removeEventListener('mouseleave', this.handleMouseLeave);
  }
}

/**
 * 3D Tilt Effect
 * 3D倾斜效果 - 根据鼠标位置倾斜元素
 */

export class TiltEffect {
  private element: HTMLElement;
  private maxTilt: number;

  constructor(element: HTMLElement, maxTilt: number = 15) {
    this.element = element;
    this.maxTilt = maxTilt;
    this.init();
  }

  private init() {
    this.element.addEventListener('mousemove', this.handleMouseMove);
    this.element.addEventListener('mouseleave', this.handleMouseLeave);
  }

  private handleMouseMove = (e: MouseEvent) => {
    const rect = this.element.getBoundingClientRect();
    const centerX = rect.left + rect.width / 2;
    const centerY = rect.top + rect.height / 2;

    const deltaX = (e.clientX - centerX) / (rect.width / 2);
    const deltaY = (e.clientY - centerY) / (rect.height / 2);

    const rotateY = deltaX * this.maxTilt;
    const rotateX = -deltaY * this.maxTilt;

    this.element.style.setProperty('--rotate-x', `${rotateX}deg`);
    this.element.style.setProperty('--rotate-y', `${rotateY}deg`);
  };

  private handleMouseLeave = () => {
    this.element.style.setProperty('--rotate-x', '0deg');
    this.element.style.setProperty('--rotate-y', '0deg');
  };

  public destroy() {
    this.element.removeEventListener('mousemove', this.handleMouseMove);
    this.element.removeEventListener('mouseleave', this.handleMouseLeave);
  }
}

/**
 * Scroll Reveal Animation
 * 滚动显示动画 - 元素进入视口时触发动画
 */

export class ScrollReveal {
  private observer: IntersectionObserver;
  private elements: Set<Element> = new Set();

  constructor(options?: IntersectionObserverInit) {
    const defaultOptions: IntersectionObserverInit = {
      threshold: 0.1,
      rootMargin: '0px 0px -100px 0px',
      ...options
    };

    this.observer = new IntersectionObserver(
      this.handleIntersection,
      defaultOptions
    );
  }

  private handleIntersection = (entries: IntersectionObserverEntry[]) => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.classList.add('revealed');
        // 一次性动画，观察后移除
        this.observer.unobserve(entry.target);
        this.elements.delete(entry.target);
      }
    });
  };

  public observe(element: Element) {
    this.elements.add(element);
    this.observer.observe(element);
  }

  public observeAll(selector: string) {
    const elements = document.querySelectorAll(selector);
    elements.forEach(el => this.observe(el));
  }

  public destroy() {
    this.elements.forEach(el => this.observer.unobserve(el));
    this.elements.clear();
    this.observer.disconnect();
  }
}

/**
 * Parallax Scroll Effect
 * 视差滚动效果
 */

export class ParallaxScroll {
  private elements: Map<HTMLElement, number> = new Map();
  private rafId: number | null = null;

  public add(element: HTMLElement, speed: number = 0.5) {
    this.elements.set(element, speed);
    if (this.elements.size === 1) {
      this.start();
    }
  }

  public remove(element: HTMLElement) {
    this.elements.delete(element);
    if (this.elements.size === 0) {
      this.stop();
    }
  }

  private update = () => {
    const scrollY = window.scrollY;

    this.elements.forEach((speed, element) => {
      const rect = element.getBoundingClientRect();
      const elementY = rect.top + scrollY;
      const offset = (scrollY - elementY) * speed;

      element.style.transform = `translateY(${offset}px)`;
    });

    this.rafId = requestAnimationFrame(this.update);
  };

  private start() {
    this.rafId = requestAnimationFrame(this.update);
  }

  private stop() {
    if (this.rafId !== null) {
      cancelAnimationFrame(this.rafId);
      this.rafId = null;
    }
  }

  public destroy() {
    this.stop();
    this.elements.clear();
  }
}

/**
 * Ripple Effect Enhanced
 * 增强水波纹效果 - 点击产生彩色涟漪
 */

export function createEnhancedRipple(
  event: MouseEvent,
  color?: string
): void {
  const button = event.currentTarget as HTMLElement;
  const rect = button.getBoundingClientRect();

  const x = event.clientX - rect.left;
  const y = event.clientY - rect.top;

  const ripple = document.createElement('span');
  ripple.className = 'enhanced-ripple';
  ripple.style.left = `${x}px`;
  ripple.style.top = `${y}px`;

  if (color) {
    ripple.style.background = color;
  }

  button.appendChild(ripple);

  setTimeout(() => {
    ripple.remove();
  }, 800);
}

/**
 * Performance Monitor
 * 性能监控 - 根据FPS自动降级动画
 */

export class PerformanceMonitor {
  private fps: number = 60;
  private lastTime: number = performance.now();
  private frames: number = 0;
  private isMonitoring: boolean = false;
  private rafId: number | null = null;
  private onFPSChange?: (fps: number) => void;

  constructor(onFPSChange?: (fps: number) => void) {
    this.onFPSChange = onFPSChange;
  }

  public start() {
    if (this.isMonitoring) return;
    this.isMonitoring = true;
    this.measure();
  }

  public stop() {
    this.isMonitoring = false;
    if (this.rafId !== null) {
      cancelAnimationFrame(this.rafId);
      this.rafId = null;
    }
  }

  private measure = () => {
    const now = performance.now();
    this.frames++;

    if (now >= this.lastTime + 1000) {
      this.fps = Math.round((this.frames * 1000) / (now - this.lastTime));
      this.frames = 0;
      this.lastTime = now;

      if (this.onFPSChange) {
        this.onFPSChange(this.fps);
      }

      // 自动降级
      if (this.fps < 30) {
        document.body.classList.add('low-performance');
      } else {
        document.body.classList.remove('low-performance');
      }
    }

    if (this.isMonitoring) {
      this.rafId = requestAnimationFrame(this.measure);
    }
  };

  public getFPS(): number {
    return this.fps;
  }
}
