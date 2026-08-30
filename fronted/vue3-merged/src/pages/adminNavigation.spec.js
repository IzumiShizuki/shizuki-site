import { describe, expect, it } from 'vitest';
import { AdminTabKey } from './adminUiState';
import {
  AdminNavigationGroup,
  AdminScopedPermission,
  buildAdminNavigationItems,
  hasAdminScopedPermission,
  isAdminPrincipal
} from './adminNavigation';

function admin(permissions = []) {
  return { groups: ['ADMIN'], permissions };
}

describe('adminNavigation', () => {
  it('requires the ADMIN baseline before exposing any studio entry', () => {
    const user = { groups: ['USER'], permissions: [AdminScopedPermission.LIFE_CONTENT, AdminScopedPermission.SITE_WIDGETS] };

    expect(isAdminPrincipal(user)).toBe(false);
    expect(hasAdminScopedPermission(user, AdminScopedPermission.LIFE_CONTENT)).toBe(false);
    expect(buildAdminNavigationItems(user)).toEqual([]);
  });

  it('keeps existing ADMIN tools while hiding scoped personal-content entries', () => {
    const keys = buildAdminNavigationItems(admin()).map((item) => item.key);

    expect(keys).toContain(AdminTabKey.USERS);
    expect(keys).toContain(AdminTabKey.BLOG_CATEGORIES);
    expect(keys).toContain(AdminTabKey.WALLPAPERS);
    expect(keys).not.toContain(AdminTabKey.ALBUMS);
    expect(keys).not.toContain(AdminTabKey.MOMENTS);
    expect(keys).not.toContain(AdminTabKey.RECYCLE_BIN);
    expect(keys).not.toContain(AdminTabKey.DAILY_QUOTES);
    expect(keys).not.toContain(AdminTabKey.SITE_WIDGETS);
  });

  it('combines ADMIN with the matching scoped permission and preserves group order', () => {
    const items = buildAdminNavigationItems(admin([
      AdminScopedPermission.LIFE_CONTENT,
      AdminScopedPermission.SITE_WIDGETS
    ]));
    const keys = items.map((item) => item.key);
    const groups = Array.from(new Set(items.map((item) => item.group)));

    expect(keys).toEqual(expect.arrayContaining([
      AdminTabKey.ALBUMS,
      AdminTabKey.MOMENTS,
      AdminTabKey.RECYCLE_BIN,
      AdminTabKey.DAILY_QUOTES,
      AdminTabKey.SITE_WIDGETS
    ]));
    expect(groups).toEqual([
      AdminNavigationGroup.SYSTEM,
      AdminNavigationGroup.CONTENT,
      AdminNavigationGroup.SITE_APPEARANCE,
      AdminNavigationGroup.FEEDBACK
    ]);
    expect(items.find((item) => item.key === AdminTabKey.ALBUMS)?.groupLabel).toBe('Content · 内容');
    expect(items.find((item) => item.key === AdminTabKey.RECYCLE_BIN)?.group).toBe(AdminNavigationGroup.CONTENT);
  });
});
