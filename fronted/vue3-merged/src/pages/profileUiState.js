export const ProfileTabKey = Object.freeze({
  PROFILE: 'profile',
  ACCOUNT: 'account',
  ARTICLES: 'articles',
  SETTINGS: 'settings'
});

export const ProfileGroupKey = ProfileTabKey;

const TAB_VALUES = Object.freeze([
  ProfileTabKey.PROFILE,
  ProfileTabKey.ACCOUNT,
  ProfileTabKey.ARTICLES,
  ProfileTabKey.SETTINGS
]);

export const ProfileSectionKey = Object.freeze({
  PROFILE: Object.freeze({
    OVERVIEW: 'overview',
    QUICK_ACTIONS: 'quick-actions',
    RECENT: 'recent'
  }),
  ACCOUNT: Object.freeze({
    AVATAR: 'avatar',
    ACCOUNT_INFO: 'account-info',
    EMAIL_BIND: 'email-bind',
    OAUTH_BIND: 'oauth-bind',
    CHANGE_PASSWORD: 'change-password',
    MUSIC_AUTH: 'music-auth'
  }),
  ARTICLES: Object.freeze({
    WORKSPACE: 'workspace',
    ARCHIVE: 'archive'
  }),
  SETTINGS: Object.freeze({
    APPEARANCE: 'appearance',
    ADVANCED: 'advanced'
  })
});

const TAB_SECTION_MAP = Object.freeze({
  [ProfileTabKey.PROFILE]: new Set(Object.values(ProfileSectionKey.PROFILE)),
  [ProfileTabKey.ACCOUNT]: new Set(Object.values(ProfileSectionKey.ACCOUNT)),
  [ProfileTabKey.ARTICLES]: new Set(Object.values(ProfileSectionKey.ARTICLES)),
  [ProfileTabKey.SETTINGS]: new Set(Object.values(ProfileSectionKey.SETTINGS))
});

export function isProfileTabKey(tabKey) {
  return TAB_VALUES.includes(tabKey);
}

export function normalizeProfileTabKey(raw, fallback = ProfileTabKey.PROFILE) {
  const normalized = String(raw || '').trim().toLowerCase();
  return isProfileTabKey(normalized) ? normalized : fallback;
}

export function createProfileAccordionState(initial = {}) {
  return {
    [ProfileTabKey.PROFILE]: normalizeOpenSectionList(ProfileTabKey.PROFILE, initial[ProfileTabKey.PROFILE]),
    [ProfileTabKey.ACCOUNT]: normalizeOpenSectionList(ProfileTabKey.ACCOUNT, initial[ProfileTabKey.ACCOUNT]),
    [ProfileTabKey.ARTICLES]: normalizeOpenSectionList(ProfileTabKey.ARTICLES, initial[ProfileTabKey.ARTICLES]),
    [ProfileTabKey.SETTINGS]: normalizeOpenSectionList(ProfileTabKey.SETTINGS, initial[ProfileTabKey.SETTINGS])
  };
}

export function getTabOpenSections(state, tabKey) {
  if (!isProfileTabKey(tabKey)) return null;
  return normalizeOpenSectionList(tabKey, state?.[tabKey]);
}

export function getTabOpenSection(state, tabKey) {
  const sections = getTabOpenSections(state, tabKey);
  return Array.isArray(sections) && sections.length ? sections[0] : null;
}

export function toggleProfileAccordion(state, tabKey, sectionKey) {
  if (!isProfileTabKey(tabKey)) {
    return { ...state };
  }
  if (!isValidSection(tabKey, sectionKey)) {
    return { ...state };
  }
  const current = getTabOpenSections(state, tabKey) || [];
  const currentSet = new Set(current);
  if (currentSet.has(sectionKey)) {
    currentSet.delete(sectionKey);
  } else {
    currentSet.add(sectionKey);
  }
  return {
    ...createProfileAccordionState(state),
    [tabKey]: normalizeOpenSectionList(tabKey, Array.from(currentSet))
  };
}

export function buildSectionSummary(sectionKey, payload = {}) {
  switch (sectionKey) {
    case ProfileSectionKey.PROFILE.OVERVIEW: {
      const nickname = String(payload.nickname || '').trim();
      return nickname ? `当前昵称：${nickname}` : '查看概览与账号状态';
    }
    case ProfileSectionKey.PROFILE.QUICK_ACTIONS:
      return '快速跳转到常用账号操作';
    case ProfileSectionKey.PROFILE.RECENT:
      return '最近状态与会话操作';
    case ProfileSectionKey.ACCOUNT.AVATAR:
      return payload.avatarUrl ? '查看或更换头像' : '尚未设置头像';
    case ProfileSectionKey.ACCOUNT.ACCOUNT_INFO:
      return payload.email ? `邮箱：${payload.email}` : '查看用户名、邮箱与密码状态';
    case ProfileSectionKey.ACCOUNT.EMAIL_BIND:
      return payload.emailVerified ? '邮箱已验证，可更新绑定' : '绑定邮箱后可启用改密流程';
    case ProfileSectionKey.ACCOUNT.OAUTH_BIND:
      return payload.oauthBindingCount > 0 ? `已绑定 ${payload.oauthBindingCount} 个平台` : '绑定 GitHub / LinuxDo';
    case ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD:
      return payload.hasPassword ? '通过邮箱验证码修改密码' : '先设置邮箱后再设置密码';
    case ProfileSectionKey.ACCOUNT.MUSIC_AUTH:
      return payload.tunehubBound ? 'TuneHub Key 已绑定，可拖拽推荐顺序' : '配置 TuneHub Key 并设置推荐顺序';
    case ProfileSectionKey.ARTICLES.WORKSPACE:
      return '草稿、发布与统计入口';
    case ProfileSectionKey.ARTICLES.ARCHIVE:
      return '收藏、归档与历史记录';
    case ProfileSectionKey.SETTINGS.APPEARANCE:
      return '主题、背景与外观设置';
    case ProfileSectionKey.SETTINGS.ADVANCED:
      return '实验功能与偏好选项';
    default:
      return '点击展开';
  }
}

function isValidSection(tabKey, sectionKey) {
  if (!isProfileTabKey(tabKey)) return false;
  if (typeof sectionKey !== 'string' || !sectionKey) return false;
  return TAB_SECTION_MAP[tabKey].has(sectionKey);
}

function normalizeOpenSectionList(tabKey, rawValue) {
  if (!isProfileTabKey(tabKey)) return [];
  const source = Array.isArray(rawValue) ? rawValue : [rawValue];
  const seen = new Set();
  const normalized = [];
  source.forEach((item) => {
    const key = String(item || '').trim();
    if (!isValidSection(tabKey, key) || seen.has(key)) return;
    seen.add(key);
    normalized.push(key);
  });
  return normalized;
}
