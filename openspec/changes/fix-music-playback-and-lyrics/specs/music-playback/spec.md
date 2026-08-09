## Purpose

为音乐播放器提供一次点击即可完成的可靠播放体验，并让已绑定网易云账号的用户能够使用其账号权限播放需要会员授权的曲目。

## ADDED Requirements

### Requirement: Cached playback SHALL recover transparently

当曲目已有缓存播放地址但该地址在媒体加载或播放阶段失效时，系统 SHALL 在同一次用户操作内静默请求新的播放地址并重试一次；在重试完成前不得将可恢复的第一次失败作为用户可见的播放失败反馈。

#### Scenario: Cached URL is stale on first click

- **WHEN** 用户第一次点击一个带有缓存播放地址的网易云、酷我或 QQ 曲目，且浏览器拒绝加载该缓存地址
- **THEN** 播放器 SHALL 在同一次点击流程中请求绕过服务端播放缓存的新地址并自动重试播放，用户无需再次点击

#### Scenario: First resolve needs a fresh address

- **WHEN** 用户点击已有音频地址的可解析曲目
- **THEN** 播放请求 SHALL 明确表示需要刷新可过期的上游播放地址，而不是只返回可能已失效的通用缓存地址

#### Scenario: All playback recovery attempts fail

- **WHEN** 初始播放和一次静默刷新重试都失败
- **THEN** 播放器 SHALL 停止播放并允许页面显示最终失败提示，且不得重复发起无限重试

### Requirement: Bound Netease accounts SHALL authorize playback

当用户已绑定网易云账号且当前音乐源策略允许使用账号源时，系统 SHALL 使用该账号的 Cookie 请求网易云账号播放接口获取当前账号可用的流地址；账号源 SHALL 在通用 Meting/匿名缓存之前参与源选择，以避免复用不具备会员权限的旧地址。

#### Scenario: Member track is resolved with bound account

- **WHEN** 已登录并绑定网易云会员账号的用户请求需要会员权限的网易云曲目
- **THEN** 后端 SHALL 将绑定 Cookie 发送给网易云播放接口，返回账号可用的音频地址，并将来源标记为账号源

#### Scenario: Account stream is unavailable

- **WHEN** 绑定账号的上游播放接口没有返回可用音频地址
- **THEN** 系统 SHALL 按既有源策略执行可用的 Meting 回退或返回明确的最终不可播放结果，不得把会员账号状态伪装成已成功播放

#### Scenario: Account-bound source bypasses generic cache

- **WHEN** 用户绑定了网易云账号且缓存中已有同一曲目的匿名或旧账号播放地址
- **THEN** 账号优先或账号仅用模式 SHALL 先解析账号源，不得直接把通用缓存地址作为最终播放地址
