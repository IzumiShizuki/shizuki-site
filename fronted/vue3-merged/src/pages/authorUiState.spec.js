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

  it('normalizes signed image urls to permanent public urls', () => {
    const payload = normalizeAuthorProfilePayload({
      profileJson: {
        hero: {
          avatar_url: 'https://cdn.example.com/assets/hero/avatar.webp?OSSAccessKeyId=test&Expires=1893456000&Signature=demo',
          cover_image_url: 'https://cdn.example.com/assets/hero/cover.webp?x-oss-signature=test&x-oss-expires=900'
        },
        journey: [
          {
            year: '2026',
            title: 'Author page',
            description: 'Normalize image urls',
            image_url: 'https://cdn.example.com/assets/journey/scene.webp?OSSAccessKeyId=test&Expires=1893456000&Signature=demo'
          }
        ],
        about: {
          intro_image_url: 'https://cdn.example.com/assets/about/intro.webp?x-oss-signature=test&x-oss-expires=900',
          mission_image_url: 'https://cdn.example.com/assets/about/mission.webp?width=960',
          links_image_url: 'https://cdn.example.com/assets/about/links.webp?x-amz-signature=test&x-amz-expires=900'
        },
        site: {
          favicon_url: 'https://cdn.example.com/assets/site/favicon.webp?OSSAccessKeyId=test&Expires=1893456000&Signature=demo'
        }
      }
    });

    expect(payload.profileJson.hero.avatarUrl).toBe('https://cdn.example.com/assets/hero/avatar.webp');
    expect(payload.profileJson.hero.coverImageUrl).toBe('https://cdn.example.com/assets/hero/cover.webp');
    expect(payload.profileJson.journey[0].imageUrl).toBe('https://cdn.example.com/assets/journey/scene.webp');
    expect(payload.profileJson.about.introImageUrl).toBe('https://cdn.example.com/assets/about/intro.webp');
    expect(payload.profileJson.about.missionImageUrl).toBe('https://cdn.example.com/assets/about/mission.webp?width=960');
    expect(payload.profileJson.about.linksImageUrl).toBe('https://cdn.example.com/assets/about/links.webp');
    expect(payload.profileJson.site.faviconUrl).toBe('https://cdn.example.com/assets/site/favicon.webp');
  });
});
