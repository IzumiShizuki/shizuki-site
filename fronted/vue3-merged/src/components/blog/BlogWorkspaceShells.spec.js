import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import BlogEditorWorkspace from './BlogEditorWorkspace.vue';
import BlogReaderWorkspace from './BlogReaderWorkspace.vue';

describe('Blog workspace shells', () => {
  it('keeps the reader rails stationary around a center-owned reading area', () => {
    const wrapper = mount(BlogReaderWorkspace, {
      slots: { default: '<article data-reader-content>正文</article>' }
    });

    expect(wrapper.attributes('data-blog-workspace')).toBe('reader');
    expect(wrapper.attributes('data-scroll-owner')).toBe('center');
    expect(wrapper.find('[data-reader-content]').text()).toBe('正文');
    expect(wrapper.find('.left-panel').exists()).toBe(true);
    expect(wrapper.find('.center-panel').exists()).toBe(true);
    expect(wrapper.find('.right-panel').exists()).toBe(true);
    expect(wrapper.findAllComponents({ name: 'SubtleScrollArea' })).toHaveLength(2);
    expect(wrapper.findAllComponents({ name: 'SubtleScrollArea' }).every((area) => area.props('scrollable'))).toBe(true);
  });

  it('keeps the editor inside its fixed workspace scroll contract', () => {
    const wrapper = mount(BlogEditorWorkspace, {
      slots: { default: '<section data-editor-content>编辑器</section>' }
    });

    expect(wrapper.attributes('data-blog-workspace')).toBe('editor');
    expect(wrapper.attributes('data-scroll-owner')).toBe('workspace');
    expect(wrapper.find('[data-editor-content]').text()).toBe('编辑器');
    expect(wrapper.findComponent({ name: 'SubtleScrollArea' }).props('scrollable')).toBe(true);
  });
});
