export const AuthorTabKey = Object.freeze({
  OVERVIEW: 'overview',
  JOURNEY: 'journey',
  POSTS: 'posts',
  ABOUT: 'about',
  SITE_SETTINGS: 'site-settings',
  EDIT: 'edit'
});

const TAB_VALUES = Object.freeze(Object.values(AuthorTabKey));

export function isAuthorTabKey(tabKey) {
  return TAB_VALUES.includes(tabKey);
}

export function normalizeAuthorTabKey(tabKey) {
  return isAuthorTabKey(tabKey) ? tabKey : AuthorTabKey.OVERVIEW;
}

export function createDefaultAuthorProfileJson() {
  return {
    hero: {
      greeting: '你好，很高兴认识你',
      name: 'Shizuki',
      quote: '愿你终将与热爱相逢',
      avatarUrl: '/images/katanegai.jpg',
      coverImageUrl: '/images/katanegai.jpg'
    },
    identity: {
      birthYear: '2006',
      school: '中国计量大学',
      major: '计算机科学与技术',
      role: '大一学生 / 独立开发者',
      activityStatus: '学习中',
      labels: ['学习陪伴', '内容沉淀', '图形渲染']
    },
    skills: ['Java', 'Vue3', 'Spring Boot', 'MySQL', 'OpenGL', 'Vulkan', 'Markdown'],
    journey: [
      {
        year: '2024',
        title: '确定 Shizuki Site 长期方向',
        description: '明确学习陪伴、内容沉淀、作品展示三条主线，搭建基础技术架构。',
        imageUrl: '/images/katanegai.jpg',
        stack: ['Spring Boot', 'Vue3', 'MySQL']
      },
      {
        year: '2025',
        title: '完成博客与音乐模块一期',
        description: '打通博客阅读/编辑流程与音乐播放器链路，开始文档化沉淀。',
        imageUrl: '/images/katanegai.jpg',
        stack: ['Markdown', 'Flyway', 'Vite']
      },
      {
        year: '2026',
        title: '完善作者主页与展示能力',
        description: '升级作者介绍、建站经历和关于模块，提升站点表达与可维护性。',
        imageUrl: '/images/katanegai.jpg',
        stack: ['Vue3', 'Spring Boot', 'Beads']
      }
    ],
    about: {
      intro: ['Shizuki Site 是一个长期学习与创作系统。', '这里记录技术实践、项目迭代与个人成长。'],
      mission: '持续构建一个可陪伴、可沉淀、可展示的个人站点。',
      focus: ['博客写作', '工程化实践', '图形与交互体验'],
      music: ['初音未来', '日语流行', '游戏原声'],
      introImageUrl: '/images/katanegai.jpg',
      missionImageUrl: '/images/katanegai.jpg',
      linksImageUrl: '/images/katanegai.jpg',
      links: [
        { label: '博客列表', url: '/#/blog' },
        { label: '项目首页', url: '/#/' }
      ]
    },
    site: {
      browserTitle: 'Levitation + Menu',
      faviconUrl: '/images/katanegai.jpg'
    }
  };
}

export function createDefaultAuthorProfilePayload() {
  return {
    authorCode: 'shizuki',
    enabled: true,
    profileJson: createDefaultAuthorProfileJson(),
    updatedAt: ''
  };
}

export function normalizeAuthorProfilePayload(raw) {
  const source = isPlainObject(raw) ? raw : {};
  const fallback = createDefaultAuthorProfilePayload();
  const profileRaw = toPlainObject(source.profileJson ?? source.profile_json);

  return {
    authorCode: normalizeString(source.authorCode ?? source.author_code, fallback.authorCode).toLowerCase(),
    enabled: (source.enabled ?? source.enabled_flag ?? true) !== false,
    profileJson: normalizeAuthorProfileJson(profileRaw, fallback.profileJson),
    updatedAt: normalizeString(source.updatedAt ?? source.updated_at)
  };
}

function normalizeAuthorProfileJson(raw, fallback) {
  const source = isPlainObject(raw) ? raw : {};

  const heroRaw = toPlainObject(source.hero);
  const identityRaw = toPlainObject(source.identity);
  const aboutRaw = toPlainObject(source.about);
  const siteRaw = toPlainObject(source.site);

  return {
    hero: {
      greeting: normalizeString(heroRaw.greeting, fallback.hero.greeting),
      name: normalizeString(heroRaw.name, fallback.hero.name),
      quote: normalizeString(heroRaw.quote, fallback.hero.quote),
      avatarUrl: normalizeString(heroRaw.avatarUrl ?? heroRaw.avatar_url, fallback.hero.avatarUrl),
      coverImageUrl: normalizeString(heroRaw.coverImageUrl ?? heroRaw.cover_image_url, fallback.hero.coverImageUrl)
    },
    identity: {
      birthYear: normalizeString(identityRaw.birthYear ?? identityRaw.birth_year, fallback.identity.birthYear),
      school: normalizeString(identityRaw.school, fallback.identity.school),
      major: normalizeString(identityRaw.major, fallback.identity.major),
      role: normalizeString(identityRaw.role, fallback.identity.role),
      activityStatus: normalizeString(
        identityRaw.activityStatus ?? identityRaw.activity_status ?? identityRaw.currentStatus ?? identityRaw.current_status,
        fallback.identity.activityStatus
      ),
      labels: normalizeStringList(identityRaw.labels, fallback.identity.labels)
    },
    skills: normalizeStringList(source.skills, fallback.skills),
    journey: normalizeJourneyList(source.journey, fallback.journey),
    about: {
      intro: normalizeStringList(aboutRaw.intro, fallback.about.intro),
      mission: normalizeString(aboutRaw.mission, fallback.about.mission),
      focus: normalizeStringList(aboutRaw.focus, fallback.about.focus),
      music: normalizeStringList(aboutRaw.music, fallback.about.music),
      introImageUrl: normalizeString(aboutRaw.introImageUrl ?? aboutRaw.intro_image_url, fallback.about.introImageUrl),
      missionImageUrl: normalizeString(aboutRaw.missionImageUrl ?? aboutRaw.mission_image_url, fallback.about.missionImageUrl),
      linksImageUrl: normalizeString(aboutRaw.linksImageUrl ?? aboutRaw.links_image_url, fallback.about.linksImageUrl),
      links: normalizeLinkList(aboutRaw.links, fallback.about.links)
    },
    site: {
      browserTitle: normalizeString(siteRaw.browserTitle ?? siteRaw.browser_title, fallback.site.browserTitle),
      faviconUrl: normalizeString(siteRaw.faviconUrl ?? siteRaw.favicon_url, fallback.site.faviconUrl)
    }
  };
}

function normalizeJourneyList(raw, fallback) {
  if (!Array.isArray(raw) || !raw.length) return fallback;
  const normalized = raw
    .map((item, index) => {
      const row = toPlainObject(item);
      const fallbackRow = Array.isArray(fallback) && fallback[index] ? fallback[index] : {};
      const title = normalizeString(row.title);
      const description = normalizeString(row.description);
      if (!title && !description) return null;
      return {
        year: normalizeString(row.year, '未定'),
        title: title || '持续迭代',
        description: description || '继续完善作者主页与站点表达。',
        imageUrl: normalizeString(row.imageUrl ?? row.image_url, normalizeString(fallbackRow.imageUrl)),
        stack: normalizeStringList(row.stack, ['Shizuki Site'])
      };
    })
    .filter(Boolean);

  return normalized.length ? normalized : fallback;
}

function normalizeLinkList(raw, fallback) {
  if (!Array.isArray(raw) || !raw.length) return fallback;
  const normalized = raw
    .map((item) => {
      const row = toPlainObject(item);
      const label = normalizeString(row.label);
      const url = normalizeString(row.url);
      if (!label || !url) return null;
      return { label, url };
    })
    .filter(Boolean);

  return normalized.length ? normalized : fallback;
}

function normalizeStringList(raw, fallback = []) {
  if (!Array.isArray(raw) || !raw.length) return fallback;
  const normalized = raw
    .map((item) => normalizeString(item))
    .filter(Boolean)
    .filter((item, index, arr) => arr.indexOf(item) === index);

  return normalized.length ? normalized : fallback;
}

function normalizeString(value, fallback = '') {
  return typeof value === 'string' && value.trim() ? value.trim() : fallback;
}

function toPlainObject(value) {
  return isPlainObject(value) ? value : {};
}

function isPlainObject(value) {
  return Object.prototype.toString.call(value) === '[object Object]';
}
