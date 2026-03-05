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
        }
      }
    });

    expect(form.enabled).toBe(false);
    expect(form.hero.avatarUrl).toBe('https://example.com/a.png');
    expect(form.hero.coverImageUrl).toBe('https://example.com/cover.png');
    expect(form.identity.birthYear).toBe('2006');
    expect(form.skills).toEqual(['Vue3', 'Spring Boot']);
    expect(form.about.introText).toBe('line-1\nline-2');
    expect(form.journey[0].imageUrl).toBe('https://example.com/journey.png');
    expect(form.about.introImageUrl).toBe('https://example.com/about-intro.png');
    expect(form.about.links[0]).toEqual({ label: 'Blog', url: '/#/blog' });
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
      }
    });

    expect(profileJson.hero.avatar_url).toBe('https://example.com/avatar.png');
    expect(profileJson.hero.cover_image_url).toBe('https://example.com/cover.png');
    expect(profileJson.identity.birth_year).toBe('2006');
    expect(profileJson.identity.labels).toEqual(['Vue3', 'Spring Boot']);
    expect(profileJson.skills).toEqual(['Java', 'Vue3']);
    expect(profileJson.journey[0].image_url).toBe('https://example.com/journey.png');
    expect(profileJson.about.intro).toEqual(['line-a', 'line-b']);
    expect(profileJson.about.intro_image_url).toBe('https://example.com/about-intro.png');
    expect(profileJson.about.mission_image_url).toBe('https://example.com/about-mission.png');
    expect(profileJson.about.links_image_url).toBe('https://example.com/about-links.png');
    expect(profileJson.about.links).toEqual([{ label: 'Blog', url: '/#/blog' }]);
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
});
