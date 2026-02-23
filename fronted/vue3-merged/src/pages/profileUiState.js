export const ProfileTabKey = Object.freeze({
  PROFILE: 'profile',
  ACCOUNT: 'account',
  ARTICLES: 'articles',
  SETTINGS: 'settings'
});

const TAB_VALUES = Object.freeze([
  ProfileTabKey.PROFILE,
  ProfileTabKey.ACCOUNT,
  ProfileTabKey.ARTICLES,
  ProfileTabKey.SETTINGS
]);

export const ProfileSectionKey = Object.freeze({
  PROFILE: Object.freeze({
    NICKNAME: 'nickname',
    SESSION: 'session'
  }),
  ACCOUNT: Object.freeze({
    AVATAR: 'avatar',
    ACCOUNT_INFO: 'account-info',
    EMAIL_BIND: 'email-bind',
    OAUTH_BIND: 'oauth-bind',
    CHANGE_PASSWORD: 'change-password'
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

export function createProfileAccordionState(initial = {}) {
  return {
    [ProfileTabKey.PROFILE]:
      isValidSection(ProfileTabKey.PROFILE, initial[ProfileTabKey.PROFILE]) ? initial[ProfileTabKey.PROFILE] : null,
    [ProfileTabKey.ACCOUNT]:
      isValidSection(ProfileTabKey.ACCOUNT, initial[ProfileTabKey.ACCOUNT]) ? initial[ProfileTabKey.ACCOUNT] : null,
    [ProfileTabKey.ARTICLES]:
      isValidSection(ProfileTabKey.ARTICLES, initial[ProfileTabKey.ARTICLES]) ? initial[ProfileTabKey.ARTICLES] : null,
    [ProfileTabKey.SETTINGS]:
      isValidSection(ProfileTabKey.SETTINGS, initial[ProfileTabKey.SETTINGS]) ? initial[ProfileTabKey.SETTINGS] : null
  };
}

export function getTabOpenSection(state, tabKey) {
  if (!isProfileTabKey(tabKey)) return null;
  const value = state?.[tabKey];
  return isValidSection(tabKey, value) ? value : null;
}

export function toggleProfileAccordion(state, tabKey, sectionKey) {
  if (!isProfileTabKey(tabKey)) {
    return { ...state };
  }
  if (!isValidSection(tabKey, sectionKey)) {
    return { ...state };
  }
  const current = getTabOpenSection(state, tabKey);
  return {
    ...createProfileAccordionState(state),
    [tabKey]: current === sectionKey ? null : sectionKey
  };
}

export function buildSectionSummary(sectionKey, payload = {}) {
  switch (sectionKey) {
    case ProfileSectionKey.PROFILE.NICKNAME: {
      const nickname = String(payload.nickname || '').trim();
      return nickname ? `当前昵称：${nickname}` : '点击展开修改昵称';
    }
    case ProfileSectionKey.PROFILE.SESSION:
      return '管理当前会话与安全退出';
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
