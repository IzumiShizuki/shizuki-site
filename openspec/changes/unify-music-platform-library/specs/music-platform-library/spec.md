## Purpose

让普通音乐模式使用已绑定平台账号的真实资源、歌单与喜欢状态，消除与 Folia 模式的内容差异和重复的默认收藏体系，并明确呈现平台请求失败。

## ADDED Requirements

### Requirement: Platform audio discovery in normal mode
The music workspace SHALL expose NetEase podcast recommendations, podcast programs, and personal FM through the shared player without requiring Folia mode.

#### Scenario: Open a podcast
- **WHEN** a user opens a recommended NetEase podcast
- **THEN** its actual programs are listed and selecting a program plays its main song through the shared queue

#### Scenario: Guest podcast discovery
- **WHEN** a visitor without a website login requests podcast recommendations
- **THEN** the gateway permits that public discovery request while account playlists, likes, mutations, and personal FM remain authenticated

#### Scenario: Personal FM needs an account
- **WHEN** an unbound user requests personal FM
- **THEN** the interface requests account binding and does not present placeholder tracks

#### Scenario: Upstream failure
- **WHEN** NetEase fails to return valid podcast data
- **THEN** the interface shows a retryable error instead of reporting an empty successful result

### Requirement: Unified account playlists
The music workspace and mini library SHALL show platform account playlists with current contents, preserve genuine user-created playlists, and omit the site default playlist and duplicate imported copies.

#### Scenario: Bound account library
- **WHEN** the library loads for a user with a bound NetEase account
- **THEN** it lists that account's created, subscribed, and liked playlists and opens their current platform tracks

#### Scenario: No available playlists
- **WHEN** no account playlists or public recommendations are available
- **THEN** the library shows an empty or binding state without injecting a default playlist

### Requirement: Account-backed likes
Likes and unlikes of supported platform tracks MUST update the bound account using an explicit desired state, and visible state MUST reflect successful platform responses. Unsupported platforms and missing or expired credentials MUST report the problem without silently saving a local substitute.

#### Scenario: Like and unlike
- **WHEN** the user likes or unlikes a NetEase track
- **THEN** that operation is applied to the bound NetEase account and the heart reflects the acknowledged result

#### Scenario: Failed or duplicate operation
- **WHEN** an operation fails or the user repeats a click while it is pending
- **THEN** failure preserves the prior state and concurrent duplicate writes are prevented

### Requirement: Shared identity and account isolation
The library MUST identify likes by platform plus track ID and isolate all asynchronous account results from other website accounts. Folia status broadcasts SHALL refresh the platform state without generating a duplicate write.

#### Scenario: Same ID on two platforms
- **WHEN** NetEase and another platform expose the same track ID
- **THEN** liking the NetEase track does not mark the other platform track as liked

#### Scenario: Account changes during a request
- **WHEN** the website user changes while a likes, playlist, or podcast request is pending
- **THEN** the previous account's result does not replace the new account's data

#### Scenario: Folia reports a completed like
- **WHEN** Folia reports a changed acknowledged like state
- **THEN** ordinary mode refreshes its state without calling the platform like mutation again
