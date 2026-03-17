import { describe, expect, it } from 'vitest';
import {
  appendUniqueTags,
  buildEditFormFromProfile,
  buildProfileJsonFromEditForm,
  extractTagTokens
} from './authorEditFormState';

describe('authorEditFormState', () => {
  it('maps profile payload into editable form state', () => {
    const form = buildEditFormFromProfile({
      enabled: false,
      profileJson: {
        hero: {
          greeting: '你好',
          name: 'Shizuki',
          quote: 'Quote',
          avatar_url: 'https://example.com/a.png',
          cover_image_url: 'https://example.com/cover.png'
        },
        identity: {
          birth_year: '2006',
          school: 'CJLU',
          major: 'CS',
          role: 'Student',
          current_status: '学习中',
          labels: ['A', 'B']
        },
        skills: ['Vue3', 'Spring Boot'],
        journey: [
          {
            year: '2026',
            title: 'Milestone',
            description: 'Done',
            image_url: 'https://example.com/journey.png',
            stack: ['Vue3']
          }
        ],
        about: {
          intro: ['line-1', 'line-2'],
          mission: 'Mission',
          focus: ['Focus'],
          music: ['Miku'],
          intro_image_url: 'https://example.com/about-intro.png',
          mission_image_url: 'https://example.com/about-mission.png',
          links_image_url: 'https://example.com/about-links.png',
          links: [{ label: 'Blog', url: '/#/blog' }]
        },
        site: {
          browser_title: 'Shizuki Site',
          favicon_url: 'https://example.com/favicon.png'
        }
      }
    });

    expect(form.enabled).toBe(false);
    expect(form.hero.avatarUrl).toBe('https://example.com/a.png');
    expect(form.hero.coverImageUrl).toBe('https://example.com/cover.png');
    expect(form.identity.birthYear).toBe('2006');
    expect(form.identity.activityStatus).toBe('学习中');
    expect(form.skills).toEqual(['Vue3', 'Spring Boot']);
    expect(form.about.introText).toBe('line-1\nline-2');
    expect(form.journey[0].imageUrl).toBe('https://example.com/journey.png');
    expect(form.about.introImageUrl).toBe('https://example.com/about-intro.png');
    expect(form.about.links[0]).toEqual({ label: 'Blog', url: '/#/blog' });
    expect(form.site.browserTitle).toBe('Shizuki Site');
    expect(form.site.faviconUrl).toBe('https://example.com/favicon.png');
  });

  it('maps edit form to snake_case profile json', () => {
    const profileJson = buildProfileJsonFromEditForm({
      hero: {
        greeting: ' hi ',
        name: ' Shizuki ',
        quote: ' q ',
        avatarUrl: 'https://example.com/avatar.png',
        coverImageUrl: 'https://example.com/cover.png'
      },
      identity: {
        birthYear: ' 2006 ',
        school: ' CJLU ',
        major: ' CS ',
        role: ' Student ',
        activityStatus: ' 上班中 ',
        labels: ['Vue3', 'Vue3', 'Spring Boot', '']
      },
      skills: ['Java', 'Java', 'Vue3'],
      journey: [
        {
          year: '2026',
          title: ' Author ',
          description: ' Done ',
          imageUrl: ' https://example.com/journey.png ',
          stack: ['Vue3', 'Vue3']
        },
        {
          year: '',
          title: '',
          description: '',
          stack: []
        }
      ],
      about: {
        introText: 'line-a\n\n line-b ',
        mission: ' mission ',
        focus: ['A', 'A', 'B'],
        music: ['Miku'],
        introImageUrl: ' https://example.com/about-intro.png ',
        missionImageUrl: ' https://example.com/about-mission.png ',
        linksImageUrl: ' https://example.com/about-links.png ',
        links: [
          { label: ' Blog ', url: ' /#/blog ' },
          { label: '', url: '' }
        ]
      },
      site: {
        browserTitle: ' Shizuki Site ',
        faviconUrl: ' https://example.com/favicon.png '
      }
    });

    expect(profileJson.hero.avatar_url).toBe('https://example.com/avatar.png');
    expect(profileJson.hero.cover_image_url).toBe('https://example.com/cover.png');
    expect(profileJson.identity.birth_year).toBe('2006');
    expect(profileJson.identity.current_status).toBe('上班中');
    expect(profileJson.identity.labels).toEqual(['Vue3', 'Spring Boot']);
    expect(profileJson.skills).toEqual(['Java', 'Vue3']);
    expect(profileJson.journey[0].image_url).toBe('https://example.com/journey.png');
    expect(profileJson.about.intro).toEqual(['line-a', 'line-b']);
    expect(profileJson.about.intro_image_url).toBe('https://example.com/about-intro.png');
    expect(profileJson.about.mission_image_url).toBe('https://example.com/about-mission.png');
    expect(profileJson.about.links_image_url).toBe('https://example.com/about-links.png');
    expect(profileJson.about.links).toEqual([{ label: 'Blog', url: '/#/blog' }]);
    expect(profileJson.site.browser_title).toBe('Shizuki Site');
    expect(profileJson.site.favicon_url).toBe('https://example.com/favicon.png');
    expect(profileJson.journey).toHaveLength(1);
    expect(profileJson.journey[0].title).toBe('Author');
  });

  it('extracts and appends unique tags from input text', () => {
    expect(extractTagTokens('Vue3, Spring Boot；Vite')).toEqual(['Vue3', 'Spring Boot', 'Vite']);
    expect(appendUniqueTags(['Vue3'], 'Vue3,Spring Boot')).toEqual(['Vue3', 'Spring Boot']);
  });

  it('keeps journey and links order when serializing', () => {
    const profileJson = buildProfileJsonFromEditForm({
      hero: {},
      identity: {},
      skills: [],
      journey: [
        { year: '2024', title: 'A', description: '', stack: [] },
        { year: '2025', title: 'B', description: '', stack: [] }
      ],
      about: {
        introText: '',
        mission: '',
        focus: [],
        music: [],
        links: [
          { label: 'L1', url: '/1' },
          { label: 'L2', url: '/2' }
        ]
      }
    });

    expect(profileJson.journey.map((item) => item.title)).toEqual(['A', 'B']);
    expect(profileJson.about.links.map((item) => item.label)).toEqual(['L1', 'L2']);
  });

  it('strips signed storage query params before saving image fields', () => {
    const profileJson = buildProfileJsonFromEditForm({
      hero: {
        avatarUrl: 'https://cdn.example.com/assets/hero/avatar.webp?OSSAccessKeyId=test&Expires=1893456000&Signature=demo',
        coverImageUrl: 'https://cdn.example.com/assets/hero/cover.webp?x-oss-signature=test&x-oss-expires=900'
      },
      journey: [
        {
          year: '2026',
          title: 'Author page',
          description: 'Normalize image urls',
          imageUrl: 'https://cdn.example.com/assets/journey/scene.webp?OSSAccessKeyId=test&Expires=1893456000&Signature=demo',
          stack: ['Vue3']
        }
      ],
      about: {
        introText: 'intro',
        mission: 'mission',
        focus: ['focus'],
        music: ['music'],
        introImageUrl: 'https://cdn.example.com/assets/about/intro.webp?x-oss-signature=test&x-oss-expires=900',
        missionImageUrl: 'https://cdn.example.com/assets/about/mission.webp?width=960',
        linksImageUrl: 'https://cdn.example.com/assets/about/links.webp?x-amz-signature=test&x-amz-expires=900',
        links: [{ label: 'Blog', url: '/#/blog' }]
      },
      site: {
        browserTitle: 'Shizuki Site',
        faviconUrl: 'https://cdn.example.com/assets/site/favicon.webp?OSSAccessKeyId=test&Expires=1893456000&Signature=demo'
      }
    });

    expect(profileJson.hero.avatar_url).toBe('https://cdn.example.com/assets/hero/avatar.webp');
    expect(profileJson.hero.cover_image_url).toBe('https://cdn.example.com/assets/hero/cover.webp');
    expect(profileJson.journey[0].image_url).toBe('https://cdn.example.com/assets/journey/scene.webp');
    expect(profileJson.about.intro_image_url).toBe('https://cdn.example.com/assets/about/intro.webp');
    expect(profileJson.about.mission_image_url).toBe('https://cdn.example.com/assets/about/mission.webp?width=960');
    expect(profileJson.about.links_image_url).toBe('https://cdn.example.com/assets/about/links.webp');
    expect(profileJson.site.favicon_url).toBe('https://cdn.example.com/assets/site/favicon.webp');
  });
});
