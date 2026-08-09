## Purpose

为播放器和站点其他模块提供一致的带时间轴字幕数据，使原文、翻译以及当前行前后的上下文都能在可用时被用户看到。

## ADDED Requirements

### Requirement: Lyrics SHALL preserve aligned language tracks

歌词解析结果 SHALL 保留原文、翻译和可选注音三条独立但按时间轴对齐的文本轨道；网易云账号源和 Meting 源都 SHALL 将可用的翻译歌词传递到前端。

#### Scenario: Netease account returns translated lyrics

- **WHEN** 网易云账号歌词接口同时返回 `lrc` 和 `tlyric`
- **THEN** 播放响应 SHALL 分别提供原文和翻译文本，前端 SHALL 能够按同一时间戳对齐它们

#### Scenario: Translation has no matching timestamp

- **WHEN** 翻译歌词缺少时间戳或无法与原文行匹配
- **THEN** 系统 SHALL 按行序或最近时间戳进行可确定的对齐，未匹配行留空，不得丢弃原文时间轴

### Requirement: Subtitle contexts SHALL show bilingual adjacent lines

在音乐页面以外显示的字幕上下文 SHALL 至少包含上一句、当前句和下一句；有翻译时，当前句和下一句 SHALL 同时显示对应翻译，且没有对应翻译时保留原文显示。

#### Scenario: Other module displays active subtitles

- **WHEN** 用户在非音乐模块查看全局字幕且当前曲目存在两行以上带时间轴歌词
- **THEN** 字幕 SHALL 显示当前原文、当前翻译（如有）以及下一句原文和翻译（如有）

#### Scenario: Active line is at the beginning or end

- **WHEN** 当前行是第一句或最后一句
- **THEN** 缺失的上一句或下一句位置 SHALL 保持为空，不得用错误的其他行替代，同时现有行仍正常显示

### Requirement: Bilingual mode SHALL be the default when available

当当前曲目存在翻译歌词时，播放器和其他模块的字幕显示模式 SHALL 默认选择原文加翻译；用户明确选择仅原文或其他可用模式后，系统 SHALL 保留该选择。

#### Scenario: Translation becomes available after playback resolve

- **WHEN** 播放解析响应补充了翻译歌词
- **THEN** 字幕控件 SHALL 暴露原文加翻译模式并默认使用该模式，且无需用户再次加载曲目
