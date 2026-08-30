import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import SubtleScrollArea from './SubtleScrollArea.vue';

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
});
