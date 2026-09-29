## Why

博客与“关于网站”页面的左栏目前几乎只有导航，不能帮助访客按时间探索公开文章，也没有提供简短、可信的作者入口。补充这些信息能让两个页面的三栏结构各司其职，同时不重复现有发现侧栏内容。

## What Changes

- 在博客左栏加入紧凑作者入口和按月展示的公开文章日历，支持月份切换、按日筛选和清除筛选。
- 提供只聚合公开文章发布日期与每日数量的月份接口，供日历可靠标记全部发文日。
- 在公开“关于网站”页左栏恢复紧凑作者身份摘要，并加入少量经过确认的公开路径，保留同页内容导航。
- 为窄桌面和辅助抽屉提供无横向溢出的布局、键盘操作和空错状态。

## Capabilities

### New Capabilities

- `public-content-left-rails`: Public blog and author rails provide compact author context and accessible paths for exploring published content.
- `public-post-calendar`: Public post dates can be aggregated by month and used to filter the blog list by a selected day.

### Modified Capabilities

<!-- None. -->

## Impact

- Frontend: blog list, author profile rail, public content API client, and focused unit tests.
- Backend: public post controller, content service, and a small response model for published-date aggregation.
- Documentation: the completed public-site benchmark is included with this change.
