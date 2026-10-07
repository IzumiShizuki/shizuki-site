## Why

全局字幕在部分路由切换时会改变位置，破坏用户拖动后建立的布局。Home 的频谱使用独立的低幅度柱条，缺少音乐详情页已有的峰值停留和延迟下落效果。

## What Changes

- 统一全局字幕的视口定位规则，切换路由、暂时隐藏和重新显示时保留相同的拖动偏移。
- Home 的柱状频谱复用音乐详情页的 Canvas 渲染、音频分析总线与峰值延迟下落机制，并提高可见度。
- 保留现有频谱/圆环模式和风格选择，遵守播放、页面可见性与运行保护设置。
- 添加字幕位置回归验证，验证频谱峰值停留、下落及暂停后的收束。

## Capabilities

### New Capabilities

- `global-lyric-position`: 全局字幕在路由切换、隐藏恢复和拖动后保持稳定的视口位置。
- `home-audio-visualizer`: Home 复用详情页的音频可视化机制，包括峰值延迟下落和播放生命周期。

### Modified Capabilities

无。

## Impact

涉及 Vue 前端 App、应用页的全局字幕样式、共享 MusicVisualizerLayer 及相关回归检查；无后端、API 或新增依赖变更。
