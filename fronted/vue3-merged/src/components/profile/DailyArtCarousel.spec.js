import { mount } from '@vue/test-utils';
import { afterEach, describe, expect, it } from 'vitest';
import DailyArtCarousel from './DailyArtCarousel.vue';

const artworks = ['第一幅', '第二幅', '第三幅'].map((title, index) => ({
  id: String(index + 1), title, artistId: '42', artistName: `画师 ${index + 1}`,
  imageUrl: `/preview/${index + 1}`, sourceUrl: `https://www.pixiv.net/artworks/${index + 1}`
}));
const wrappers = [];
function render(works = artworks) {
  const wrapper = mount(DailyArtCarousel, { props: { artworks: works } });
  wrappers.push(wrapper);
  return wrapper;
}
const title = wrapper => wrapper.get('.work-title').text();
const next = wrapper => wrapper.get('[aria-label="下一张每日推荐"]').trigger('click');
async function swipe(wrapper, start, end) {
  await wrapper.trigger('touchstart', { touches: [start] });
  await wrapper.trigger('touchend', { touches: [], changedTouches: [end] });
}
afterEach(() => { wrappers.forEach(wrapper => wrapper.unmount()); wrappers.length = 0; });

describe('daily art carousel', () => {
  it('displays one full artwork with attribution and wraps in both directions', async () => {
    const wrapper = render();
    expect(wrapper.findAll('figure')).toHaveLength(1);
    expect(wrapper.get('.work-artist').text()).toContain('画师 1');
    expect(wrapper.get('.image-link').attributes('href')).toBe(artworks[0].sourceUrl);
    await wrapper.get('[aria-label="上一张每日推荐"]').trigger('click');
    expect(title(wrapper)).toBe('第三幅');
    await next(wrapper);
    expect(title(wrapper)).toBe('第一幅');
    expect(artworks.map(work => work.id)).toEqual(['1', '2', '3']);
  });

  it('selects an image directly and announces its position', async () => {
    const wrapper = render();
    await wrapper.get('[aria-label="查看第 2 张：第二幅"]').trigger('click');
    expect(title(wrapper)).toBe('第二幅');
    expect(wrapper.get('[aria-current="true"]').text()).toBe('2');
    expect(wrapper.get('[role="status"]').text()).toContain('第 2 张，共 3 张：第二幅');
  });

  it('supports arrow and first/last keyboard navigation while preserving modified shortcuts', async () => {
    const wrapper = render();
    await wrapper.trigger('keydown', { key: 'End' });
    expect(title(wrapper)).toBe('第三幅');
    await wrapper.trigger('keydown', { key: 'ArrowLeft' });
    expect(title(wrapper)).toBe('第二幅');
    await wrapper.trigger('keydown', { key: 'ArrowRight', altKey: true });
    expect(title(wrapper)).toBe('第二幅');
    await wrapper.trigger('keydown', { key: 'Home' });
    expect(title(wrapper)).toBe('第一幅');
    await wrapper.trigger('keydown', { key: 'ArrowRight' });
    expect(title(wrapper)).toBe('第二幅');
  });

  it('advances only clear horizontal single-touch gestures', async () => {
    const wrapper = render();
    await swipe(wrapper, { clientX: 160, clientY: 40 }, { clientX: 70, clientY: 45 });
    expect(title(wrapper)).toBe('第二幅');
    await swipe(wrapper, { clientX: 70, clientY: 45 }, { clientX: 160, clientY: 50 });
    expect(title(wrapper)).toBe('第一幅');
    await swipe(wrapper, { clientX: 160, clientY: 40 }, { clientX: 145, clientY: 160 });
    expect(title(wrapper)).toBe('第一幅');
    await wrapper.trigger('touchstart', { touches: [{ clientX: 160, clientY: 40 }, { clientX: 140, clientY: 40 }] });
    await wrapper.trigger('touchend', { touches: [], changedTouches: [{ clientX: 30, clientY: 40 }] });
    expect(title(wrapper)).toBe('第一幅');
    await wrapper.trigger('touchstart', { touches: [{ clientX: 160, clientY: 40 }] });
    await wrapper.trigger('touchcancel');
    await wrapper.trigger('touchend', { touches: [], changedTouches: [{ clientX: 30, clientY: 40 }] });
    expect(title(wrapper)).toBe('第一幅');
  });

  it('resets for a replacement set and removes old artwork when cleared', async () => {
    const wrapper = render();
    await next(wrapper);
    await wrapper.setProps({ artworks: [{ ...artworks[2], id: '77', title: '新用户作品' }] });
    expect(title(wrapper)).toBe('新用户作品');
    expect(wrapper.text()).not.toContain('第二幅');
    expect(wrapper.find('.carousel-navigation').exists()).toBe(false);
    await wrapper.setProps({ artworks: [] });
    expect(wrapper.find('figure').exists()).toBe(false);
  });

  it('preserves an image-failure link and allows moving to another artwork', async () => {
    const wrapper = render();
    await wrapper.get('img').trigger('error');
    expect(wrapper.text()).toContain('图片暂时无法显示');
    expect(wrapper.get('.image-link').attributes('href')).toBe(artworks[0].sourceUrl);
    await next(wrapper);
    expect(title(wrapper)).toBe('第二幅');
    expect(wrapper.find('img').exists()).toBe(true);
  });
});
