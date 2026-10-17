import { describe, it, expect } from 'vitest';
import { mount } from '@vue/test-utils';
import ContentStatusBadge from './ContentStatusBadge.vue';

describe('ContentStatusBadge', () => {
  it('renders the label', () => {
    const wrapper = mount(ContentStatusBadge, {
      props: {
        variant: 'published',
        label: 'Published'
      }
    });
    expect(wrapper.text()).toContain('Published');
  });

  it('applies the correct variant class', () => {
    const wrapper = mount(ContentStatusBadge, {
      props: {
        variant: 'draft',
        label: 'Draft'
      }
    });
    expect(wrapper.classes()).toContain('status-draft');
  });

  it('renders icon when provided', () => {
    const wrapper = mount(ContentStatusBadge, {
      props: {
        variant: 'saved',
        label: 'Saved',
        icon: 'fas fa-check'
      }
    });
    expect(wrapper.find('i').classes()).toContain('fas');
    expect(wrapper.find('i').classes()).toContain('fa-check');
  });

  it('applies elevated class when elevated prop is true', () => {
    const wrapper = mount(ContentStatusBadge, {
      props: {
        variant: 'published',
        label: 'Published',
        elevated: true
      }
    });
    expect(wrapper.classes()).toContain('status-elevated');
  });

  it('sets aria-label attribute', () => {
    const wrapper = mount(ContentStatusBadge, {
      props: {
        variant: 'error',
        label: 'Error occurred'
      }
    });
    expect(wrapper.attributes('aria-label')).toBe('Error occurred');
  });

  it('validates variant prop', () => {
    const validVariants = ['draft', 'published', 'private', 'public', 'unlisted', 'saving', 'saved', 'error'];
    const component = ContentStatusBadge;
    const validator = component.props.variant.validator;

    validVariants.forEach(variant => {
      expect(validator(variant)).toBe(true);
    });

    expect(validator('invalid')).toBe(false);
  });
});
