import { describe, expect, it } from 'vitest';
import {
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
  });

  it('normalizes profile tab key with fallback', () => {
    expect(normalizeProfileTabKey('ACCOUNT')).toBe(ProfileTabKey.ACCOUNT);
    expect(normalizeProfileTabKey('unknown')).toBe(ProfileTabKey.PROFILE);
    expect(normalizeProfileTabKey('', ProfileTabKey.SETTINGS)).toBe(ProfileTabKey.SETTINGS);
  });
});
