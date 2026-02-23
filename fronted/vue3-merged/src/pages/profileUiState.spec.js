import { describe, expect, it } from 'vitest';
import {
  ProfileSectionKey,
  ProfileTabKey,
  buildSectionSummary,
  createProfileAccordionState,
  getTabOpenSection,
  toggleProfileAccordion
} from './profileUiState';

describe('profileUiState', () => {
  it('toggles accordion section in single-open mode', () => {
    const state = createProfileAccordionState();
    const next = toggleProfileAccordion(state, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.AVATAR);

    expect(next.account).toBe(ProfileSectionKey.ACCOUNT.AVATAR);

    const replaced = toggleProfileAccordion(next, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.EMAIL_BIND);
    expect(replaced.account).toBe(ProfileSectionKey.ACCOUNT.EMAIL_BIND);
  });

  it('collapses section when toggled again', () => {
    const state = createProfileAccordionState({
      [ProfileTabKey.ACCOUNT]: ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD
    });
    const next = toggleProfileAccordion(state, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD);
    expect(next.account).toBeNull();
  });

  it('keeps state isolated across tabs', () => {
    const state = createProfileAccordionState({
      [ProfileTabKey.PROFILE]: ProfileSectionKey.PROFILE.NICKNAME,
      [ProfileTabKey.ARTICLES]: ProfileSectionKey.ARTICLES.WORKSPACE
    });
    const next = toggleProfileAccordion(state, ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.OAUTH_BIND);

    expect(getTabOpenSection(next, ProfileTabKey.PROFILE)).toBe(ProfileSectionKey.PROFILE.NICKNAME);
    expect(getTabOpenSection(next, ProfileTabKey.ARTICLES)).toBe(ProfileSectionKey.ARTICLES.WORKSPACE);
    expect(getTabOpenSection(next, ProfileTabKey.ACCOUNT)).toBe(ProfileSectionKey.ACCOUNT.OAUTH_BIND);
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
      buildSectionSummary(ProfileSectionKey.PROFILE.NICKNAME, {
        nickname: 'Izumi'
      })
    ).toBe('当前昵称：Izumi');
  });
});
