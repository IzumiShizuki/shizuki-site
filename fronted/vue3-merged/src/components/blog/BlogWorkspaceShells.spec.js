import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import BlogEditorWorkspace from './BlogEditorWorkspace.vue';
import BlogReaderWorkspace from './BlogReaderWorkspace.vue';

describe('Blog workspace shells', () => {
  it('lets the reader yield vertical scrolling to the public app root', () => {
    const wrapper = mount(BlogReaderWorkspace, {
      slots: { default: '<article data-reader-content>正文</article>' }
    });

    expect(wrapper.attributes('data-blog-workspace')).toBe('reader');
    expect(wrapper.attributes('data-scroll-owner')).toBe('app');
    expect(wrapper.find('[data-reader-content]').text()).toBe('正文');
    expect(wrapper.find('.left-panel').exists()).toBe(true);
    expect(wrapper.find('.center-panel').exists()).toBe(true);
    expect(wrapper.find('.right-panel').exists()).toBe(true);
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
