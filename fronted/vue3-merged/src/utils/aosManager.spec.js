import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { refreshAosManager } from './aosManager';

describe('aosManager', () => {
  beforeEach(() => {
    vi.useFakeTimers();
    window.AOS = {
      refreshHard: vi.fn()
    };
  });

  afterEach(() => {
    vi.runOnlyPendingTimers();
    vi.useRealTimers();
    vi.restoreAllMocks();
    document.body.innerHTML = '';
    delete window.AOS;
  });

  it('applies AOS attributes to top-level route cards', () => {
    document.body.innerHTML = `
      <div class="route-page-view">
        <section class="route-page">
          <article class="liquid-material card"></article>
        </section>
      </div>
    `;

    refreshAosManager();

    const card = document.querySelector('.card');
    expect(card?.getAttribute('data-aos')).toBe('fade-up');
    expect(card?.getAttribute('data-aos-duration')).toBe('520');
    vi.runAllTimers();
    expect(window.AOS.refreshHard).toHaveBeenCalledTimes(1);
  });

  it('removes AOS state from cards inside subtle scroll containers', () => {
    document.body.innerHTML = `
      <div class="route-page-view">
        <section class="route-page">
          <section class="subtle-scroll-area">
            <article
              class="liquid-material card aos-init aos-animate"
              data-aos="fade-up"
              data-aos-duration="520"
              data-aos-delay="42"
            ></article>
          </section>
        </section>
      </div>
    `;

    refreshAosManager();

    const card = document.querySelector('.card');
    expect(card?.hasAttribute('data-aos')).toBe(false);
    expect(card?.hasAttribute('data-aos-duration')).toBe(false);
    expect(card?.hasAttribute('data-aos-delay')).toBe(false);
    expect(card?.classList.contains('aos-init')).toBe(false);
    expect(card?.classList.contains('aos-animate')).toBe(false);
  });

  it('ignores descendants of explicit data-aos-ignore containers', () => {
    document.body.innerHTML = `
      <div class="route-page-view">
        <section class="route-page">
          <div data-aos-ignore="true">
            <article class="liquid-material card" data-aos="fade-up" data-aos-delay="84"></article>
          </div>
        </section>
      </div>
    `;

    refreshAosManager();

    const card = document.querySelector('.card');
    expect(card?.hasAttribute('data-aos')).toBe(false);
    expect(card?.hasAttribute('data-aos-delay')).toBe(false);
  });
});
