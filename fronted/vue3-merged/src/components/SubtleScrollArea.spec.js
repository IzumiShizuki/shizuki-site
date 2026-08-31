import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import { ref } from 'vue';
import SubtleScrollArea from './SubtleScrollArea.vue';
import { APP_SCROLL_ROOT_KEY } from '../composables/useAppScrollRoot';

describe('SubtleScrollArea', () => {
  it('can yield vertical scroll ownership to the App route root', () => {
    const wrapper = mount(SubtleScrollArea, {
      props: { scrollable: false },
      slots: { default: '<p>public content</p>' }
    });

    expect(wrapper.classes()).toContain('scroll-disabled');
    expect(wrapper.classes()).toContain('axis-y');
  });

  it('preserves internal scrolling for fixed workspaces by default', () => {
    const wrapper = mount(SubtleScrollArea);

    expect(wrapper.classes()).not.toContain('scroll-disabled');
    expect(wrapper.classes()).toContain('overscroll-contained');
  });

  it('claims and releases App scroll ownership on desktop', () => {
    const claims = [];
    const wrapper = mount(SubtleScrollArea, {
      props: { appScrollOwner: true },
      global: {
        provide: {
          [APP_SCROLL_ROOT_KEY]: {
            element: ref(null),
            isActive: ref(true),
            scrollTop: ref(0),
            claimScrollOwner: (element) => {
              claims.push(element);
              return () => claims.push(null);
            }
          }
        }
      }
    });

    expect(claims[0]).toBe(wrapper.element);
    wrapper.unmount();
    expect(claims.at(-1)).toBeNull();
  });
});
