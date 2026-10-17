import { describe, expect, it } from 'vitest';
import { mount } from '@vue/test-utils';
import SearchResultExcerpt from './SearchResultExcerpt.vue';

describe('SearchResultExcerpt', () => {
  it('highlights multiple literal terms while keeping hostile markup inert', () => {
    const wrapper = mount(SearchResultExcerpt, { props: { text: '<script>星空</script> with C++ and stars', query: '星空 C++' } });
    expect(wrapper.findAll('mark').map(mark => mark.text())).toEqual(['星空', 'C++']);
    expect(wrapper.find('script').exists()).toBe(false);
    expect(wrapper.text()).toContain('<script>星空</script>');
    wrapper.unmount();
  });
});
