import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AdminBlogCategoriesPanel from './AdminBlogCategoriesPanel.vue';

function createItem(categoryCode, overrides = {}) {
  return {
    categoryCode,
    displayName: categoryCode,
    coverImageUrl: '',
    sortNum: 1000,
    enabled: true,
    ...overrides
  };
}

function mountPanel(props = {}) {
  return mount(AdminBlogCategoriesPanel, {
    props: {
      items: [],
      ...props
    }
  });
}

describe('AdminBlogCategoriesPanel', () => {
  it('keeps the create form open when there are no categories yet', () => {
    const wrapper = mountPanel();

    expect(wrapper.find('input[placeholder="例如：notes / design / ai"]').exists()).toBe(true);
    expect(wrapper.find('.create-card-head button').text()).toBe('收起');
  });

  it('collapses the create form by default when categories already exist', () => {
    const wrapper = mountPanel({
      items: [createItem('dev')]
    });

    expect(wrapper.find('input[placeholder="例如：notes / design / ai"]').exists()).toBe(false);
    expect(wrapper.find('.create-card-head button').text()).toBe('展开');
  });

  it('expands the create form when the user toggles it open', async () => {
    const wrapper = mountPanel({
      items: [createItem('dev')]
    });

    await wrapper.find('.create-card-head button').trigger('click');

    expect(wrapper.find('input[placeholder="例如：notes / design / ai"]').exists()).toBe(true);
    expect(wrapper.find('.create-card-head button').text()).toBe('收起');
  });
});
