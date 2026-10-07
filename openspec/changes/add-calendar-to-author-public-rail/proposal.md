## Why

作者个人界面的“公开内容”导航左栏留白较多，访客也无法从这里按发布日期发现文章。复用博客页的文章日历，可以在填充左栏的同时提供一致的文章发现入口。

## What Changes

- 在作者个人界面的公开内容左栏和对应的辅助导航抽屉中显示博客页使用的文章日历。
- 继续使用公开文章日期统计接口；点选有文章的日期后，打开博客列表并筛选该日期。
- 让博客列表从日期路由参数恢复筛选状态，并在日历中显示对应月份和选中日期。

## Capabilities

### New Capabilities

- `author-public-post-calendar`: 作者公开内容导航提供可操作的文章日期日历，并可跳转到对应日期的博客列表。

### Modified Capabilities

<!-- No existing main specs are present under openspec/specs. -->

## Impact

- Frontend components: `AuthorProfileRail.vue`, `AuthorPage.vue`, `PublicPostCalendar.vue`, and `BlogListPage.vue`.
- No backend API, database, dependency, or deployment changes.
