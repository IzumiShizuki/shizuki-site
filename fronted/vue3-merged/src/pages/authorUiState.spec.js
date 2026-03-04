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
  });

  it('provides stable default profile payload', () => {
    const fallback = createDefaultAuthorProfilePayload();
    expect(fallback.authorCode).toBe('shizuki');
    expect(fallback.profileJson.hero.name).toBe('Shizuki');
    expect(Array.isArray(fallback.profileJson.skills)).toBe(true);
  });

  it('normalizes snake_case payload from backend', () => {
    const normalized = normalizeAuthorProfilePayload({
      author_code: 'SHIZUKI',
      enabled: true,
      profile_json: {
        hero: {
          name: 'Shizuki Updated',
          avatar_url: 'https://example.com/avatar.png'
        },
        skills: ['Vue3', 'Vue3', 'Spring Boot'],
        journey: [
          {
            year: '2026',
            title: 'Author module',
            description: 'completed',
            stack: ['Vue3']
          }
        ],
        about: {
          links: [{ label: 'Blog', url: '/#/blog' }]
        }
      }
    });

    expect(normalized.authorCode).toBe('shizuki');
    expect(normalized.profileJson.hero.name).toBe('Shizuki Updated');
    expect(normalized.profileJson.hero.avatarUrl).toBe('https://example.com/avatar.png');
    expect(normalized.profileJson.skills).toEqual(['Vue3', 'Spring Boot']);
    expect(normalized.profileJson.journey[0].title).toBe('Author module');
    expect(normalized.profileJson.about.links[0].label).toBe('Blog');
  });
});
