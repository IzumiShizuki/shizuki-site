import { describe, expect, it } from 'vitest';
import {
  ensureProfileTabHasOpenSection,
  ProfileSectionKey,
  ProfileTabKey,
  buildSectionSummary,
  createProfileAccordionState,
  getTabOpenSections,
  normalizeProfileTabKey,
  toggleProfileAccordion
} from './profileUiState';

describe('profileUiState', () => {
  it('toggles accordion section in multi-open mode', () => {
    const state = createProfileAccordionState();
    const next = toggleProfileAccordion(state, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.AVATAR);

    expect(next.account).toEqual([ProfileSectionKey.ACCOUNT.AVATAR]);

    const expanded = toggleProfileAccordion(next, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.EMAIL_BIND);
    expect(expanded.account).toEqual([ProfileSectionKey.ACCOUNT.AVATAR, ProfileSectionKey.ACCOUNT.EMAIL_BIND]);
  });

  it('collapses section when toggled again', () => {
    const state = createProfileAccordionState({
      [ProfileTabKey.ACCOUNT]: [ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD]
    });
    const next = toggleProfileAccordion(state, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD);
    expect(next.account).toEqual([]);
  });

  it('keeps state isolated across tabs', () => {
    const state = createProfileAccordionState({
      [ProfileTabKey.PROFILE]: [ProfileSectionKey.PROFILE.OVERVIEW],
      [ProfileTabKey.ARTICLES]: [ProfileSectionKey.ARTICLES.WORKSPACE]
    });
    const next = toggleProfileAccordion(state, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.OAUTH_BIND);

    expect(getTabOpenSections(next, ProfileTabKey.PROFILE)).toEqual([ProfileSectionKey.PROFILE.OVERVIEW]);
    expect(getTabOpenSections(next, ProfileTabKey.ARTICLES)).toEqual([ProfileSectionKey.ARTICLES.WORKSPACE]);
    expect(getTabOpenSections(next, ProfileTabKey.ACCOUNT)).toEqual([ProfileSectionKey.ACCOUNT.OAUTH_BIND]);
  });

  it('restores a fallback section when the target tab is empty', () => {
    const state = createProfileAccordionState({
      [ProfileTabKey.PROFILE]: [],
      [ProfileTabKey.ACCOUNT]: [ProfileSectionKey.ACCOUNT.AVATAR]
    });

    const next = ensureProfileTabHasOpenSection(state, ProfileTabKey.PROFILE, ProfileSectionKey.PROFILE.QUICK_ACTIONS);

    expect(getTabOpenSections(next, ProfileTabKey.PROFILE)).toEqual([ProfileSectionKey.PROFILE.QUICK_ACTIONS]);
    expect(getTabOpenSections(next, ProfileTabKey.ACCOUNT)).toEqual([ProfileSectionKey.ACCOUNT.AVATAR]);
  });

  it('keeps multi-open state when the target tab already has visible sections', () => {
    const state = createProfileAccordionState({
      [ProfileTabKey.ACCOUNT]: [ProfileSectionKey.ACCOUNT.AVATAR, ProfileSectionKey.ACCOUNT.EMAIL_BIND]
    });

    const next = ensureProfileTabHasOpenSection(state, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.ACCOUNT_INFO);

    expect(getTabOpenSections(next, ProfileTabKey.ACCOUNT)).toEqual([
      ProfileSectionKey.ACCOUNT.AVATAR,
      ProfileSectionKey.ACCOUNT.EMAIL_BIND
    ]);
  });

  it('builds section summaries from payload', () => {
    expect(
      buildSectionSummary(ProfileSectionKey.ACCOUNT.OAUTH_BIND, {
        oauthBindingCount: 2
      })
    ).toBe('已绑定 2 个平台');

    expect(
      buildSectionSummary(ProfileSectionKey.ACCOUNT.ACCOUNT_INFO, {
        email: 'demo@example.com'
      })
    ).toBe('邮箱：demo@example.com');

    expect(
      buildSectionSummary(ProfileSectionKey.PROFILE.OVERVIEW, {
        nickname: 'Izumi'
      })
    ).toBe('当前昵称：Izumi');

    expect(
      buildSectionSummary(ProfileSectionKey.ACCOUNT.MUSIC_AUTH, {
        configuredCount: 3
      })
    ).toBe('已接入 3 项音乐授权能力');
  });

  it('normalizes profile tab key with fallback', () => {
    expect(normalizeProfileTabKey('ACCOUNT')).toBe(ProfileTabKey.ACCOUNT);
    expect(normalizeProfileTabKey('unknown')).toBe(ProfileTabKey.PROFILE);
    expect(normalizeProfileTabKey('', ProfileTabKey.SETTINGS)).toBe(ProfileTabKey.SETTINGS);
  });
});
