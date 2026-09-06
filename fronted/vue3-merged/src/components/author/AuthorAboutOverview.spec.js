import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import AuthorAboutOverview from './AuthorAboutOverview.vue';

function mountOverview() {
  return mount(AuthorAboutOverview, {
    props: {
      hero: {
        greeting: '你好，很高兴认识你',
        name: 'Shizuki',
        quote: '愿你终将与热爱相逢',
        avatarUrl: '/images/katanegai.jpg',
        coverImageUrl: '/images/katanegai.jpg'
      },
      identity: {
        school: '中国计量大学',
        major: '计算机科学与技术',
        role: '独立开发者',
        activityStatus: '学习中',
        labels: ['学习陪伴', '内容沉淀']
      },
      skills: ['Java', 'Vue3', 'Spring Boot'],
      enabled: true,
      portals: [
        { key: 'blog', title: 'Blog', description: '文章入口', icon: 'far fa-file-alt', target: '/blog' },
        { key: 'journey', title: 'Journey', description: '建站经历', icon: 'fas fa-route', target: 'journey', mode: 'tab' }
      ]
    }
  });
}

describe('AuthorAboutOverview', () => {
  it('moves the useful homepage identity, status, skill, and portal content into About', async () => {
    const wrapper = mountOverview();

    expect(wrapper.get('.about-overview-heading').text()).toContain('Shizuki');
    expect(wrapper.get('.about-overview-status').text()).toContain('学习中');
    expect(wrapper.findAll('.about-overview-fact').map((item) => item.text())).toEqual([
      expect.stringContaining('中国计量大学'),
      expect.stringContaining('计算机科学与技术'),
      expect.stringContaining('独立开发者')
    ]);
    expect(wrapper.findAll('.about-skill-chip').map((item) => item.text())).toEqual(['Java', 'Vue3', 'Spring Boot']);
    expect(wrapper.findAll('.about-portal-link').map((item) => item.text())).toEqual([
      expect.stringContaining('Blog'),
      expect.stringContaining('Journey')
    ]);

    await wrapper.findAll('.about-portal-link')[1].trigger('click');
    expect(wrapper.emitted('select-portal')?.[0]).toEqual([expect.objectContaining({ key: 'journey' })]);
  });

  it('uses semantic theme and accent tokens for neutral colors', () => {
    const source = readFileSync(resolve(process.cwd(), 'src/components/author/AuthorAboutOverview.vue'), 'utf8');
    const style = source.slice(source.indexOf('<style scoped>'));

    expect(style).toContain('var(--theme-panel-surface)');
    expect(style).toContain('var(--theme-text-primary)');
    expect(style).toContain('var(--theme-text-secondary)');
    expect(style).toContain('var(--theme-border)');
    expect(style).toContain('var(--accent-readable-rgb');
    expect(style).not.toMatch(/color:\s*rgba?\(\s*\d+/);
    expect(style).not.toMatch(/background:\s*rgba?\(\s*\d+/);
  });

  it('renders a clear cover photograph with a wave transition instead of a glass wash', () => {
    const wrapper = mountOverview();
    const source = readFileSync(resolve(process.cwd(), 'src/components/author/AuthorAboutOverview.vue'), 'utf8');

    expect(wrapper.get('.about-overview-photo').attributes()).toMatchObject({
      src: '/images/katanegai.jpg',
      alt: 'Shizuki 的网站封面'
    });
    expect(wrapper.get('.about-overview-wave').attributes('aria-hidden')).toBe('true');
    expect(wrapper.find('.about-overview-media-wash').exists()).toBe(false);
    expect(source).toContain('filter: none');
    expect(source).not.toContain('backdrop-filter');
  });
});
