import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import UserAvatar from './UserAvatar.vue';
import defaultAvatar from '../assets/default-user-avatar.svg';

describe('UserAvatar', () => {
  it('uses the bundled SVG for blank avatars', () => {
    const wrapper = mount(UserAvatar, { props: { src: '  ' } });
    expect(wrapper.attributes('src')).toBe(defaultAvatar);
  });

  it('falls back on error and tries a changed custom avatar', async () => {
    const wrapper = mount(UserAvatar, { props: { src: 'https://example.test/broken.png' } });
    expect(wrapper.attributes('src')).toBe('https://example.test/broken.png');
    await wrapper.trigger('error');
    expect(wrapper.attributes('src')).toBe(defaultAvatar);
    await wrapper.trigger('error');
    expect(wrapper.attributes('src')).toBe(defaultAvatar);
    await wrapper.setProps({ src: 'https://example.test/new.png' });
    expect(wrapper.attributes('src')).toBe('https://example.test/new.png');
  });
});
