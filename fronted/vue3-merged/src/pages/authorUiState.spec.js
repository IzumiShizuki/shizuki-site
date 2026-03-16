import { describe, expect, it } from 'vitest';
import {
  AuthorTabKey,
  createDefaultAuthorProfilePayload,
  normalizeAuthorProfilePayload,
  normalizeAuthorTabKey
} from './authorUiState';

describe('authorUiState', () => {
  it('normalizes unknown tab to overview', () => {
    expect(normalizeAuthorTabKey('unknown')).toBe(AuthorTabKey.OVERVIEW);
    expect(normalizeAuthorTabKey(AuthorTabKey.ABOUT)).toBe(AuthorTabKey.ABOUT);
    expect(normalizeAuthorTabKey(AuthorTabKey.SITE_SETTINGS)).toBe(AuthorTabKey.SITE_SETTINGS);
  });

  it('provides stable default profile payload', () => {
    const fallback = createDefaultAuthorProfilePayload();
    expect(fallback.authorCode).toBe('shizuki');
    expect(fallback.profileJson.hero.name).toBe('Shizuki');
    expect(fallback.profileJson.site.browserTitle).toBe('Levitation + Menu');
    expect(Array.isArray(fallback.profileJson.skills)).toBe(true);
  });

  it('normalizes snake_case payload from backend', () => {
    const normalized = normalizeAuthorProfilePayload({
      author_code: 'SHIZUKI',
      enabled: true,
      profile_json: {
        hero: {
          name: 'Shizuki Updated',
          avatar_url: 'https://example.com/avatar.png',
          cover_image_url: 'https://example.com/cover.png'
        },
        identity: {
          current_status: '上班中'
        },
        skills: ['Vue3', 'Vue3', 'Spring Boot'],
        journey: [
          {
            year: '2026',
            title: 'Author module',
            description: 'completed',
            image_url: 'https://example.com/journey.png',
            stack: ['Vue3']
          }
        ],
        about: {
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

    expect(normalized.authorCode).toBe('shizuki');
    expect(normalized.profileJson.hero.name).toBe('Shizuki Updated');
    expect(normalized.profileJson.hero.avatarUrl).toBe('https://example.com/avatar.png');
    expect(normalized.profileJson.hero.coverImageUrl).toBe('https://example.com/cover.png');
    expect(normalized.profileJson.identity.activityStatus).toBe('上班中');
    expect(normalized.profileJson.skills).toEqual(['Vue3', 'Spring Boot']);
    expect(normalized.profileJson.journey[0].title).toBe('Author module');
    expect(normalized.profileJson.journey[0].imageUrl).toBe('https://example.com/journey.png');
    expect(normalized.profileJson.about.introImageUrl).toBe('https://example.com/about-intro.png');
    expect(normalized.profileJson.about.links[0].label).toBe('Blog');
    expect(normalized.profileJson.site.browserTitle).toBe('Shizuki Site');
    expect(normalized.profileJson.site.faviconUrl).toBe('https://example.com/favicon.png');
  });
});
