<template>
  <transition name="atmo-fade">
    <div v-if="visible" class="atmo-mask" @click.self="emit('close')">
      <section class="atmo-panel liquid-material" @click.stop>
        <header class="atmo-header">
          <div class="atmo-title">
            <span class="atmo-title-glyph"><i class="fas fa-spa" aria-hidden="true"></i></span>
            <div class="atmo-title-copy">
              <h2>氛围面板</h2>
              <p>场景 · 环境音 · 特效 · 音乐，一处调好整站氛围</p>
            </div>
          </div>
          <div class="atmo-header-side">
            <span v-if="enabledTracks.length" class="status-chip">
              <span class="tile-eq" aria-hidden="true"><i></i><i></i><i></i></span>
              {{ enabledTracks.length }} 个音源
            </span>
            <span v-if="effectSummaryChip" class="status-chip">
              <i class="fas fa-wand-magic-sparkles" aria-hidden="true"></i>
              {{ effectSummaryChip }}
            </span>
            <span v-if="sleepTimerMinutes" class="status-chip timer">
              <i class="fas fa-stopwatch" aria-hidden="true"></i>
              {{ sleepTimerLabel }}
            </span>
            <button class="icon-btn ripple-trigger" type="button" aria-label="关闭氛围面板" @click="emit('close')">
              <i class="fas fa-xmark" aria-hidden="true"></i>
            </button>
          </div>
        </header>

        <nav class="atmo-tabs" role="tablist">
          <button
            v-for="tab in tabs"
            :key="tab.key"
            class="atmo-tab ripple-trigger"
            :class="{ active: activeTab === tab.key }"
            type="button"
            role="tab"
            :aria-selected="activeTab === tab.key"
            @click="emit('set-tab', tab.key)"
          >
            <i :class="tab.icon" aria-hidden="true"></i>
            <span>{{ tab.label }}</span>
          </button>
        </nav>

        <div class="atmo-scroll">
          <!-- ======================= 场景 ======================= -->
          <section v-if="activeTab === 'scenes'" class="panel-body">
            <header class="block-head">
              <div>
                <p class="section-kicker">One-tap Scenes</p>
                <h3>一键氛围场景</h3>
                <p class="head-copy">每个场景会同时应用一组环境音和搭配的背景特效。</p>
              </div>
              <button class="soft-btn ripple-trigger" type="button" @click="stopEverything">
                <i class="fas fa-power-off" aria-hidden="true"></i>
                停止全部
              </button>
            </header>

            <div class="scene-grid">
              <button
                v-for="scene in scenes"
                :key="scene.id"
                class="scene-card ripple-trigger"
                :class="{ active: activeSceneId === scene.id }"
                type="button"
                :style="{ '--cover-bg': scene.cover }"
                @click="applyScene(scene)"
              >
                <span class="scene-glass"></span>
                <span class="scene-top">
                  <span class="scene-icon"><i :class="scene.icon" aria-hidden="true"></i></span>
                  <span v-if="activeSceneId === scene.id" class="scene-live">
                    <span class="tile-eq light" aria-hidden="true"><i></i><i></i><i></i></span>
                    进行中
                  </span>
                </span>
                <span class="scene-copy">
                  <strong>{{ scene.label }}</strong>
                  <small>{{ scene.description }}</small>
                </span>
                <span class="scene-tags">
                  <span v-for="name in sceneSoundLabels(scene)" :key="`${scene.id}-${name}`" class="scene-tag">
                    <i class="fas fa-volume-low" aria-hidden="true"></i>{{ name }}
                  </span>
                  <span class="scene-tag">
                    <i class="fas fa-wand-magic-sparkles" aria-hidden="true"></i>{{ sceneEffectLabel(scene) }}
                  </span>
                </span>
              </button>
            </div>

            <p class="inline-note">场景只是快捷入口——应用后仍可到「环境音」「特效」页里单独微调每一项。</p>
          </section>

          <!-- ======================= 音乐 ======================= -->
          <section v-else-if="activeTab === 'music'" class="panel-body music-body">
            <div class="music-layout">
              <section class="glass-card">
                <header class="block-head">
                  <div>
                    <p class="section-kicker">Mini Music Library</p>
                    <h3>歌单与歌曲列表</h3>
                  </div>
                  <div class="block-actions">
                    <button class="soft-btn ripple-trigger" type="button" @click="emit('music-refresh')">
                      <i class="fas fa-rotate" aria-hidden="true"></i>刷新
                    </button>
                    <button class="soft-btn primary ripple-trigger" type="button" @click="emit('open-music-library')">
                      完整音乐库
                    </button>
                  </div>
                </header>

                <p v-if="musicLibraryState?.errorText" class="inline-note warning">{{ musicLibraryState.errorText }}</p>
                <p v-else-if="!isAuthenticated" class="inline-note">未登录时只展示默认/精选歌单；登录后会补充红心、创建和收藏歌单。</p>

                <section v-for="group in musicGroups" :key="group.key" class="playlist-group">
                  <div class="group-head">
                    <div>
                      <p class="mini-label">{{ group.caption }}</p>
                      <h4>{{ group.label }}</h4>
                    </div>
                    <span class="count-pill">{{ group.items.length }}</span>
                  </div>

                  <div class="playlist-grid">
                    <button
                      v-for="playlist in group.items"
                      :key="playlist.playlistCode"
                      class="playlist-card ripple-trigger"
                      :class="{ active: playlist.playlistCode === currentPlaylist.playlistCode }"
                      type="button"
                      @click="emit('music-select-playlist', playlist.playlistCode)"
                    >
                      <div class="playlist-cover">
                        <img v-if="playlist.cover" :src="playlist.cover" :alt="playlist.name" />
                        <div v-else class="playlist-fallback">
                          <i class="fas fa-compact-disc" aria-hidden="true"></i>
                        </div>
                      </div>
                      <div class="playlist-copy">
                        <strong>{{ playlist.name }}</strong>
                        <small>{{ playlist.description || '点击查看这个歌单的曲目列表。' }}</small>
                      </div>
                    </button>
                  </div>
                </section>

                <section class="track-sheet">
                  <header class="track-head">
                    <div>
                      <p class="mini-label">Playlist Tracks</p>
                      <h4>{{ currentPlaylist.name || '歌单曲目' }}</h4>
                    </div>
                    <span class="count-pill">{{ currentTracks.length }}</span>
                  </header>

                  <p v-if="musicLibraryState?.playlistLoading" class="inline-note">歌单加载中...</p>
                  <p v-else-if="!currentTracks.length" class="empty-note">当前歌单没有可展示的曲目。</p>

                  <div v-else class="track-list">
                    <article
                      v-for="(track, index) in currentTracks"
                      :key="`${track.trackId}-${index}`"
                      class="track-row ripple-trigger"
                      role="button"
                      tabindex="0"
                      @click="emit('music-play-track', index)"
                      @keydown.enter.prevent="emit('music-play-track', index)"
                      @keydown.space.prevent="emit('music-play-track', index)"
                    >
                      <span class="track-index">{{ String(index + 1).padStart(2, '0') }}</span>
                      <div class="track-cover">
                        <img v-if="track.cover" :src="track.cover" :alt="track.title" />
                        <div v-else class="track-cover-fallback"><i class="fas fa-music"></i></div>
                      </div>
                      <div class="track-copy">
                        <strong>{{ track.title }}</strong>
                        <small>{{ track.artist || '未知歌手' }}</small>
                      </div>
                      <span class="track-duration">{{ track.durationLabel || '--:--' }}</span>
                      <button class="row-action ripple-trigger" type="button" @click.stop="emit('music-play-track', index)">
                        播放
                      </button>
                    </article>
                  </div>
                </section>
              </section>

              <aside class="glass-card music-now-card">
                <header class="block-head compact">
                  <div>
                    <p class="section-kicker">Now Playing</p>
                    <h3>正在播放</h3>
                  </div>
                </header>

                <button class="vinyl-button ripple-trigger" type="button" @click="emit('music-toggle-play')">
                  <span class="vinyl-disc" :class="{ spinning: musicPlaying }">
                    <span class="vinyl-rings"></span>
                    <span class="vinyl-cover">
                      <img v-if="musicTrack?.cover" :src="musicTrack.cover" alt="vinyl-cover" />
                      <span v-else class="playlist-fallback"><i class="fas fa-music"></i></span>
                    </span>
                    <span class="vinyl-hole"></span>
                  </span>
                </button>

                <div class="music-now-copy">
                  <strong>{{ musicTrack?.title || '当前未播放音乐' }}</strong>
                  <span>{{ musicTrack?.artist || '切换到歌单中的曲目即可播放。' }}</span>
                </div>

                <div class="summary-actions">
                  <button class="soft-btn round ripple-trigger" type="button" aria-label="上一首" @click="emit('music-prev')">
                    <i class="fas fa-backward-step"></i>
                  </button>
                  <button class="soft-btn round primary ripple-trigger" type="button" aria-label="播放/暂停" @click="emit('music-toggle-play')">
                    <i :class="musicPlaying ? 'fas fa-pause' : 'fas fa-play'"></i>
                  </button>
                  <button class="soft-btn round ripple-trigger" type="button" aria-label="下一首" @click="emit('music-next')">
                    <i class="fas fa-forward-step"></i>
                  </button>
                </div>

                <section class="lyrics-box">
                  <header class="lyrics-head">
                    <p class="mini-label">Live Lyrics</p>
                    <span>{{ musicPlaying ? '播放中' : '暂停中' }}</span>
                  </header>
                  <transition name="lyric-switch" mode="out-in">
                    <div class="lyrics-triplet" :key="lyricWindow.key">
                      <p class="lyric-line prev">{{ lyricWindow.prev }}</p>
                      <p class="lyric-line current">{{ lyricWindow.current }}</p>
                      <p class="lyric-line next">{{ lyricWindow.next }}</p>
                    </div>
                  </transition>
                </section>
              </aside>
            </div>
          </section>

          <!-- ======================= 环境音 ======================= -->
          <section v-else-if="activeTab === 'ambient'" class="panel-body">
            <div class="glass-card ambient-console">
              <div class="console-volume">
                <button
                  class="icon-btn ripple-trigger"
                  type="button"
                  :aria-label="masterVolume > 0 ? '全部静音' : '主音量'"
                  @click="emit('ambient-mute-all')"
                >
                  <i :class="masterVolume > 0 ? 'fas fa-volume-high' : 'fas fa-volume-xmark'" aria-hidden="true"></i>
                </button>
                <div class="console-volume-body">
                  <div class="console-volume-head">
                    <span>总音量</span>
                    <strong>{{ Math.round(masterVolume * 100) }}%</strong>
                  </div>
                  <input
                    class="atmo-range"
                    type="range"
                    min="0"
                    max="1"
                    step="0.01"
                    :value="masterVolume"
                    :style="rangeFillStyle(masterVolume)"
                    aria-label="环境音总音量"
                    @input="emit('ambient-set-master-volume', Number($event.target.value))"
                  />
                </div>
              </div>

              <div class="console-side">
                <div class="timer-group" role="group" aria-label="睡眠定时器">
                  <span class="timer-caption"><i class="fas fa-stopwatch" aria-hidden="true"></i>定时停止</span>
                  <button
                    v-for="minutes in sleepTimerChoices"
                    :key="`timer-${minutes}`"
                    class="chip ripple-trigger"
                    :class="{ active: sleepTimerMinutes === minutes }"
                    type="button"
                    @click="setSleepTimer(minutes)"
                  >
                    {{ minutes }}′
                  </button>
                  <span v-if="sleepTimerMinutes" class="timer-count">{{ sleepTimerLabel }}</span>
                </div>
                <div class="console-actions">
                  <button class="soft-btn ripple-trigger" type="button" @click="emit('ambient-mute-all')">
                    <i class="fas fa-volume-xmark" aria-hidden="true"></i>全部停止
                  </button>
                  <button class="soft-btn primary ripple-trigger" type="button" :disabled="uploading" @click="openUploadPicker">
                    <i class="fas fa-cloud-arrow-up" aria-hidden="true"></i>
                    {{ uploading ? '上传中...' : isAuthenticated ? '上传环境音' : '临时上传' }}
                  </button>
                  <input ref="uploadInputRef" class="hidden-input" type="file" accept="audio/*" @change="onUploadChange" />
                </div>
              </div>
            </div>

            <p v-if="mixerNeedsGesture" class="inline-note warning">
              浏览器需要一次用户手势来恢复环境音播放。
              <button class="inline-link ripple-trigger" type="button" @click="emit('resume-ambient')">恢复播放</button>
            </p>
            <p v-if="uploadHint" class="inline-note">{{ uploadHint }}</p>

            <section v-for="group in groupedLibrary" :key="group.key" class="playlist-group">
              <div class="group-head">
                <div>
                  <p class="mini-label">{{ group.caption }}</p>
                  <h4>{{ group.label }}</h4>
                </div>
                <span class="count-pill">{{ group.items.length }}</span>
              </div>

              <div class="sound-grid">
                <div
                  v-for="item in group.items"
                  :key="item.id"
                  class="sound-tile"
                  :class="{
                    active: tileStatus(item) !== 'idle',
                    loading: tileStatus(item) === 'loading'
                  }"
                >
                  <button
                    class="tile-face ripple-trigger"
                    type="button"
                    :title="item.description"
                    :aria-pressed="tileStatus(item) !== 'idle'"
                    @click="emit('ambient-toggle-track', item)"
                  >
                    <span class="tile-icon" :style="{ '--cover-bg': item.cover }">
                      <i :class="item.icon" aria-hidden="true"></i>
                    </span>
                    <span class="tile-copy">
                      <strong>{{ item.label }}</strong>
                      <small>{{ tileStatusText(item) }}</small>
                    </span>
                    <span class="tile-state" aria-hidden="true">
                      <span v-if="tileStatus(item) === 'loading'" class="tile-spinner"></span>
                      <span v-else-if="tileStatus(item) === 'playing'" class="tile-eq"><i></i><i></i><i></i></span>
                      <i v-else-if="tileStatus(item) === 'suspended'" class="fas fa-pause tile-paused"></i>
                      <i v-else class="fas fa-play tile-play-hint"></i>
                    </span>
                  </button>

                  <div v-if="activeTrackMap[item.id]?.enabled" class="tile-volume">
                    <input
                      class="atmo-range small"
                      type="range"
                      min="0"
                      max="1"
                      step="0.01"
                      :value="activeTrackMap[item.id].volume"
                      :style="rangeFillStyle(activeTrackMap[item.id].volume)"
                      :aria-label="`${item.label} 音量`"
                      @input="emit('ambient-set-track-volume', { trackId: item.id, volume: Number($event.target.value) })"
                    />
                    <span class="tile-volume-num">{{ Math.round(activeTrackMap[item.id].volume * 100) }}</span>
                  </div>

                  <button
                    v-if="item.source !== 'builtin'"
                    class="tile-remove ripple-trigger"
                    type="button"
                    :aria-label="`移除 ${item.label}`"
                    title="移除"
                    @click="emit('ambient-remove-track', item.id)"
                  >
                    <i class="fas fa-xmark" aria-hidden="true"></i>
                  </button>
                </div>
              </div>
            </section>

            <section class="glass-card preset-card">
              <div class="group-head">
                <div>
                  <p class="mini-label">My Mixes</p>
                  <h4>我的混音组合</h4>
                </div>
                <div class="preset-actions">
                  <input
                    v-model.trim="presetName"
                    class="preset-input"
                    type="text"
                    maxlength="24"
                    placeholder="给当前组合起个名字"
                    @keydown.enter.prevent="savePreset"
                  />
                  <button class="soft-btn primary ripple-trigger" type="button" :disabled="!enabledTracks.length" @click="savePreset">
                    <i class="fas fa-floppy-disk" aria-hidden="true"></i>保存
                  </button>
                </div>
              </div>

              <div v-if="ambientState?.ambient?.presets?.length" class="preset-list">
                <button
                  v-for="preset in ambientState.ambient.presets"
                  :key="preset.id"
                  class="preset-chip ripple-trigger"
                  type="button"
                  @click="emit('ambient-apply-preset', preset.id)"
                >
                  <i class="fas fa-wand-sparkles" aria-hidden="true"></i>
                  <span>{{ preset.name }}</span>
                  <i
                    class="fas fa-trash-can preset-remove"
                    aria-hidden="true"
                    title="删除组合"
                    @click.stop="emit('ambient-delete-preset', preset.id)"
                  ></i>
                </button>
              </div>
              <p v-else class="empty-note">开几个音源、调好音量，然后保存成随时可以一键还原的组合。</p>
            </section>
          </section>

          <!-- ===================== 在线音源库 ===================== -->
          <section v-else-if="activeTab === 'online'" class="panel-body">
            <header class="block-head">
              <div>
                <p class="section-kicker">Online Library · Freesound</p>
                <h3>在线音源库</h3>
                <p class="head-copy">直接搜 Freesound 的环境音，试听满意就加进混音，不用先下载再上传。</p>
              </div>
            </header>

            <div class="glass-card online-search-bar">
              <div class="search-input-wrap">
                <i class="fas fa-magnifying-glass" aria-hidden="true"></i>
                <input
                  v-model="onlineQuery"
                  class="search-input"
                  type="search"
                  placeholder="试试 rain / forest / cafe / fireplace…"
                  :disabled="!onlineEnabled"
                  @keydown.enter.prevent="runOnlineSearch(1)"
                />
                <button
                  v-if="onlineQuery"
                  class="search-clear"
                  type="button"
                  aria-label="清空关键词"
                  @click="onlineQuery = ''"
                >
                  <i class="fas fa-xmark" aria-hidden="true"></i>
                </button>
              </div>
              <div class="search-actions">
                <div class="license-toggle" role="group" aria-label="许可证范围">
                  <button
                    v-for="scope in licenseScopes"
                    :key="scope.key"
                    class="chip ripple-trigger"
                    :class="{ active: onlineLicense === scope.key }"
                    type="button"
                    :title="scope.hint"
                    @click="setOnlineLicense(scope.key)"
                  >
                    {{ scope.label }}
                  </button>
                </div>
                <button
                  class="soft-btn primary ripple-trigger"
                  type="button"
                  :disabled="!onlineEnabled || onlineLoading || !onlineQuery.trim()"
                  @click="runOnlineSearch(1)"
                >
                  <i class="fas fa-magnifying-glass" aria-hidden="true"></i>
                  {{ onlineLoading ? '搜索中...' : '搜索' }}
                </button>
              </div>
            </div>

            <p v-if="!onlineEnabled" class="inline-note warning">
              服务端还没有配置 Freesound Token，在线音源库暂时不可用。在 monolith-app 的环境变量里设置
              <code>MUSIC_FREESOUND_API_KEY</code> 后重启即可（Token 在 freesound.org 免费申请）。
            </p>
            <p v-else-if="onlineError" class="inline-note warning">{{ onlineError }}</p>
            <p v-else-if="onlineLicense === 'free'" class="inline-note">
              当前包含 CC-BY 音源，使用时需要在页面某处署名——已加入的音源可以在下方卡片里复制署名文本。
            </p>

            <div v-if="onlineLoading" class="online-grid">
              <div v-for="n in 6" :key="`sk-${n}`" class="online-card skeleton">
                <span class="sk-line wide"></span>
                <span class="sk-line"></span>
              </div>
            </div>

            <div v-else-if="onlineResults.length" class="online-grid">
              <article
                v-for="track in onlineResults"
                :key="track.trackId"
                class="online-card"
                :class="{ added: Boolean(activeTrackMap[track.trackId]) }"
              >
                <div class="online-card-head">
                  <div class="online-card-copy">
                    <strong :title="track.title">{{ track.title }}</strong>
                    <small>
                      <i class="fas fa-user" aria-hidden="true"></i>{{ track.author || '未知作者' }}
                      <span class="dot">·</span>{{ formatDuration(track.duration) }}
                    </small>
                  </div>
                  <span class="license-pill" :class="track.license === 'cc0' ? 'free' : 'attrib'">
                    {{ track.licenseName }}
                  </span>
                </div>

                <div class="online-card-actions">
                  <button
                    class="soft-btn round ripple-trigger"
                    type="button"
                    :aria-label="previewingId === track.trackId ? '停止试听' : '试听'"
                    @click="togglePreview(track)"
                  >
                    <i :class="previewingId === track.trackId ? 'fas fa-stop' : 'fas fa-play'" aria-hidden="true"></i>
                  </button>
                  <button
                    class="soft-btn ripple-trigger"
                    :class="{ primary: !activeTrackMap[track.trackId] }"
                    type="button"
                    @click="emit('import-remote-track', track)"
                  >
                    <i
                      :class="activeTrackMap[track.trackId] ? 'fas fa-check' : 'fas fa-plus'"
                      aria-hidden="true"
                    ></i>
                    {{ activeTrackMap[track.trackId] ? '已加入' : '加入混音' }}
                  </button>
                  <a
                    v-if="track.pageUrl"
                    class="soft-btn ripple-trigger"
                    :href="track.pageUrl"
                    target="_blank"
                    rel="noopener noreferrer"
                    title="在 Freesound 打开"
                  >
                    <i class="fas fa-arrow-up-right-from-square" aria-hidden="true"></i>
                  </a>
                </div>

                <button
                  v-if="track.attributionRequired"
                  class="attribution-row ripple-trigger"
                  type="button"
                  :title="buildAmbientAttribution(track)"
                  @click="copyAttribution(track)"
                >
                  <i class="fas fa-copy" aria-hidden="true"></i>
                  <span>{{ copiedId === track.trackId ? '署名已复制' : '复制署名文本' }}</span>
                </button>
              </article>
            </div>

            <p v-else-if="onlineSearched" class="empty-note">没搜到符合条件的音频，换个关键词，或把许可证范围放宽到「含署名」试试。</p>
            <p v-else class="empty-note">输入关键词开始搜索。英文关键词命中率更高，比如 rain、thunder、forest、cafe、fireplace、waves。</p>

            <div v-if="onlineTotalPages > 1" class="pager">
              <button
                class="soft-btn ripple-trigger"
                type="button"
                :disabled="onlinePageNo <= 1 || onlineLoading"
                @click="runOnlineSearch(onlinePageNo - 1)"
              >
                <i class="fas fa-chevron-left" aria-hidden="true"></i>上一页
              </button>
              <span class="pager-info">{{ onlinePageNo }} / {{ onlineTotalPages }}</span>
              <button
                class="soft-btn ripple-trigger"
                type="button"
                :disabled="onlinePageNo >= onlineTotalPages || onlineLoading"
                @click="runOnlineSearch(onlinePageNo + 1)"
              >
                下一页<i class="fas fa-chevron-right" aria-hidden="true"></i>
              </button>
            </div>
          </section>

          <!-- ======================= 特效 ======================= -->
          <section v-else class="panel-body">
            <div class="glass-card fx-console">
              <div class="fx-console-main">
                <button
                  class="fx-switch ripple-trigger"
                  :class="{ on: effectState.enabled }"
                  type="button"
                  role="switch"
                  :aria-checked="effectState.enabled ? 'true' : 'false'"
                  aria-label="开关背景特效"
                  @click="emit('effect-toggle-enabled', !effectState.enabled)"
                >
                  <span class="fx-switch-knob"></span>
                </button>
                <div class="fx-console-copy">
                  <strong>{{ effectState.enabled ? `背景特效 · ${activeEffectPreset.label}` : '背景特效已关闭' }}</strong>
                  <small>
                    {{
                      effectState.enabled
                        ? `${effectStrength.label} · 综合强度 ${effectStrength.percent}%`
                        : '打开后可以在下面挑一款粒子特效'
                    }}
                  </small>
                </div>
              </div>
              <button class="soft-btn ripple-trigger" type="button" @click="resetEffectTuning">
                <i class="fas fa-rotate-left" aria-hidden="true"></i>恢复默认
              </button>
            </div>

            <p v-if="reducedMotion" class="inline-note warning">系统启用了「减少动态」，特效会自动降级或暂停。</p>

            <div class="fx-stage-layout">
              <div class="effect-stage" :style="{ '--cover-bg': activeEffectPreset.cover }">
                <div class="cover-gloss"></div>
                <span
                  class="effect-preview effect-preview-stage"
                  :class="`effect-preview-${activeEffectPreset.id}`"
                  :style="activeEffectPreviewVars"
                >
                  <span
                    v-for="(token, index) in activeEffectPreviewTokens"
                    :key="`${activeEffectPreset.id}-preview-${index}`"
                    class="effect-particle"
                    :class="`effect-particle-${token.kind}`"
                    :style="token.style"
                  ></span>
                </span>
                <span class="card-tag effect-stage-tag">
                  {{ effectStrength.enabled ? '实时预览 · ' + activeEffectPreset.label : '当前关闭' }}
                </span>
              </div>

              <div class="glass-card fx-slider-card">
                <label v-for="slider in effectSliders" :key="slider.key" class="fx-slider-row">
                  <span class="fx-slider-head">
                    <span class="fx-slider-name"><i :class="slider.icon" aria-hidden="true"></i>{{ slider.label }}</span>
                    <strong>{{ slider.display }}</strong>
                  </span>
                  <input
                    class="atmo-range"
                    type="range"
                    :min="slider.min"
                    :max="slider.max"
                    :step="slider.step"
                    :value="slider.value"
                    :style="rangeFillStyle(slider.value, slider.min, slider.max)"
                    :aria-label="slider.label"
                    @input="emit(slider.event, Number($event.target.value))"
                  />
                </label>
              </div>
            </div>

            <div class="fx-grid">
              <button
                v-for="preset in effectPresets"
                :key="preset.id"
                class="fx-card ripple-trigger"
                :class="{ active: effectState.presetId === preset.id }"
                type="button"
                :title="preset.description"
                @click="emit('effect-select-preset', preset.id)"
              >
                <span class="fx-card-stage" :style="{ '--cover-bg': preset.cover }">
                  <span class="cover-gloss"></span>
                  <span
                    class="effect-preview effect-preview-stage"
                    :class="`effect-preview-${preset.id}`"
                    :style="resolvePreviewVarsForCard(preset.id)"
                  >
                    <span
                      v-for="(token, index) in resolvePreviewTokensForCard(preset.id)"
                      :key="`${preset.id}-card-${index}`"
                      class="effect-particle"
                      :class="`effect-particle-${token.kind}`"
                      :style="token.style"
                    ></span>
                  </span>
                  <span v-if="effectState.presetId === preset.id" class="fx-card-check">
                    <i class="fas fa-check" aria-hidden="true"></i>
                  </span>
                </span>
                <span class="fx-card-copy">
                  <strong>{{ preset.label }}</strong>
                  <small>{{ preset.description }}</small>
                </span>
              </button>
            </div>
          </section>
        </div>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { buildAmbientAttribution, searchAmbientLibrary } from '../services/ambientLibraryApi';
import {
  ATMOSPHERE_SCENE_DEFINITIONS,
  DEFAULT_EFFECT_DENSITY,
  DEFAULT_EFFECT_FALL_SPEED,
  DEFAULT_EFFECT_OPACITY,
  DEFAULT_EFFECT_SPAWN_RATE,
  findBuiltinAmbientById,
  findEffectPresetById
} from '../utils/atmosphereCatalog';
import {
  resolveEffectPreviewTokens,
  resolveEffectPreviewVars,
  resolveEffectStrength
} from '../utils/atmosphereEffectPreview';

const props = defineProps({
  visible: { type: Boolean, default: false },
  activeTab: { type: String, default: 'scenes' },
  musicTrack: { type: Object, default: null },
  musicPlaying: { type: Boolean, default: false },
  lyricLine: { type: String, default: '' },
  lyricContext: {
    type: Object,
    default: () => ({ prev: '', current: '', next: '', key: 'empty' })
  },
  musicLibraryState: {
    type: Object,
    default: () => ({
      loading: false,
      playlistLoading: false,
      errorText: '',
      sections: [],
      selectedPlaylist: { playlistCode: 'default_public', name: '默认歌单' },
      selectedTracks: []
    })
  },
  ambientState: {
    type: Object,
    default: () => ({
      ambient: { masterVolume: 0.65, tracks: [], presets: [] }
    })
  },
  ambientLibrary: { type: Array, default: () => [] },
  effectState: {
    type: Object,
    default: () => ({ enabled: false, presetId: 'none', density: 1, opacity: 0.7, fallSpeed: 1, spawnRate: 1 })
  },
  effectPresets: { type: Array, default: () => [] },
  isAuthenticated: { type: Boolean, default: false },
  reducedMotion: { type: Boolean, default: false },
  uploading: { type: Boolean, default: false },
  uploadHint: { type: String, default: '' },
  mixerNeedsGesture: { type: Boolean, default: false },
  mixerActiveTrackIds: { type: Array, default: () => [] },
  onlineLibraryEnabled: { type: Boolean, default: false }
});

const emit = defineEmits([
  'close',
  'set-tab',
  'music-toggle-play',
  'music-prev',
  'music-next',
  'music-refresh',
  'music-select-playlist',
  'music-play-track',
  'open-music-library',
  'ambient-toggle-track',
  'ambient-set-master-volume',
  'ambient-set-track-volume',
  'ambient-save-preset',
  'ambient-apply-preset',
  'ambient-delete-preset',
  'ambient-mute-all',
  'ambient-remove-track',
  'ambient-upload',
  'resume-ambient',
  'apply-scene',
  'import-remote-track',
  'effect-toggle-enabled',
  'effect-select-preset',
  'effect-set-density',
  'effect-set-opacity',
  'effect-set-fall-speed',
  'effect-set-spawn-rate'
]);

const uploadInputRef = ref(null);
const presetName = ref('');
const scenes = ATMOSPHERE_SCENE_DEFINITIONS;
const tabs = computed(() => {
  const base = [
    { key: 'scenes', label: '场景', icon: 'fas fa-mountain-sun' },
    { key: 'ambient', label: '环境音', icon: 'fas fa-sliders-h' },
    { key: 'effects', label: '特效', icon: 'fas fa-wand-magic-sparkles' },
    { key: 'music', label: '音乐', icon: 'fas fa-music' }
  ];
  if (props.onlineLibraryEnabled) {
    base.splice(2, 0, { key: 'online', label: '在线音源', icon: 'fas fa-cloud-arrow-down' });
  }
  return base;
});

/* ------------------------------- 睡眠定时器 ------------------------------- */

const sleepTimerChoices = [15, 30, 60, 90];
const sleepTimerMinutes = ref(0);
const sleepTimerRemainingSec = ref(0);
let sleepTimerHandle = 0;

function clearSleepTimer() {
  if (sleepTimerHandle) {
    window.clearInterval(sleepTimerHandle);
    sleepTimerHandle = 0;
  }
  sleepTimerMinutes.value = 0;
  sleepTimerRemainingSec.value = 0;
}

function setSleepTimer(minutes) {
  if (sleepTimerMinutes.value === minutes) {
    clearSleepTimer();
    return;
  }
  if (sleepTimerHandle) {
    window.clearInterval(sleepTimerHandle);
  }
  sleepTimerMinutes.value = minutes;
  sleepTimerRemainingSec.value = minutes * 60;
  sleepTimerHandle = window.setInterval(() => {
    sleepTimerRemainingSec.value -= 1;
    if (sleepTimerRemainingSec.value <= 0) {
      emit('ambient-mute-all');
      clearSleepTimer();
    }
  }, 1000);
}

const sleepTimerLabel = computed(() => {
  const total = Math.max(0, sleepTimerRemainingSec.value);
  const mm = Math.floor(total / 60);
  const ss = total % 60;
  return `${String(mm).padStart(2, '0')}:${String(ss).padStart(2, '0')}`;
});

onBeforeUnmount(clearSleepTimer);

/* --------------------------------- 环境音 --------------------------------- */

const activeTrackMap = computed(() => {
  const map = {};
  (props.ambientState?.ambient?.tracks || []).forEach((track) => {
    map[track.trackId] = track;
  });
  return map;
});

const enabledTracks = computed(() =>
  (props.ambientState?.ambient?.tracks || []).filter((track) => Boolean(track.enabled))
);

const masterVolume = computed(() => {
  const numeric = Number(props.ambientState?.ambient?.masterVolume);
  return Number.isFinite(numeric) ? Math.max(0, Math.min(1, numeric)) : 0;
});

const mixerActiveSet = computed(() => new Set((props.mixerActiveTrackIds || []).map((item) => String(item))));

const groupedLibrary = computed(() => {
  const groups = [
    { key: 'noise', label: '白噪音底', caption: 'Noise Base', items: [] },
    { key: 'scene', label: '自然与场景声', caption: 'Nature & Scenes', items: [] },
    { key: 'upload', label: '我的上传', caption: 'Custom Uploads', items: [] }
  ];

  (props.ambientLibrary || []).forEach((item) => {
    const target =
      item.source === 'builtin' && item.category === 'noise'
        ? groups[0]
        : item.source === 'builtin'
          ? groups[1]
          : groups[2];
    target.items.push(item);
  });

  return groups.filter((group) => group.items.length);
});

function tileStatus(item) {
  const track = activeTrackMap.value[item.id];
  if (!track?.enabled) return 'idle';
  if (item.category === 'noise') return 'playing';
  if (props.mixerNeedsGesture) return 'suspended';
  return mixerActiveSet.value.has(String(item.id)) ? 'playing' : 'loading';
}

function tileStatusText(item) {
  const status = tileStatus(item);
  if (status === 'loading') return '载入中...';
  if (status === 'playing') return '播放中';
  if (status === 'suspended') return '待恢复';
  return item.categoryLabel || '点击播放';
}

function openUploadPicker() {
  if (props.uploading) return;
  uploadInputRef.value?.click();
}

function onUploadChange(event) {
  const file = event?.target?.files?.[0];
  if (event?.target) {
    event.target.value = '';
  }
  if (!file) return;
  emit('ambient-upload', file);
}

function savePreset() {
  const value = String(presetName.value || '').trim();
  if (!value) return;
  emit('ambient-save-preset', value);
  presetName.value = '';
}

/* ------------------------------ 在线音源库 ------------------------------ */

const licenseScopes = [
  { key: 'cc0', label: 'CC0 免署名', hint: '公有领域，直接用，无需任何署名' },
  { key: 'free', label: '含署名', hint: '加入 CC-BY 音源，使用时需要标注作者' }
];

const onlineQuery = ref('');
const onlineLicense = ref('cc0');
const onlineResults = ref([]);
const onlineLoading = ref(false);
const onlineError = ref('');
const onlineSearched = ref(false);
const onlinePageNo = ref(1);
const onlineTotal = ref(0);
const onlinePageSize = ref(24);
const previewingId = ref('');
const copiedId = ref('');

let searchAbortController = null;
let previewAudio = null;
let copiedTimer = 0;

const onlineEnabled = computed(() => props.onlineLibraryEnabled);
const onlineTotalPages = computed(() => {
  const size = onlinePageSize.value || 24;
  // Freesound 免费档最多翻到 150 条，再往后翻会直接报错。
  return Math.max(1, Math.min(Math.ceil(onlineTotal.value / size), Math.floor(150 / size)));
});

function stopPreview() {
  if (previewAudio) {
    previewAudio.pause();
    previewAudio.src = '';
    previewAudio = null;
  }
  previewingId.value = '';
}

function togglePreview(track) {
  if (previewingId.value === track.trackId) {
    stopPreview();
    return;
  }
  stopPreview();
  try {
    previewAudio = new Audio(track.previewUrl);
    previewAudio.volume = 0.7;
    previewAudio.loop = true;
    previewAudio.addEventListener('ended', stopPreview, { once: true });
    previewAudio.addEventListener('error', () => {
      onlineError.value = '这个音频试听失败，可能是上游临时不可用。';
      stopPreview();
    }, { once: true });
    previewingId.value = track.trackId;
    previewAudio.play().catch(() => {
      onlineError.value = '浏览器拦截了自动播放，请再点一次试听。';
      stopPreview();
    });
  } catch {
    stopPreview();
  }
}

async function runOnlineSearch(pageNo = 1) {
  const keyword = onlineQuery.value.trim();
  if (!keyword || !onlineEnabled.value) return;

  if (searchAbortController) {
    searchAbortController.abort();
  }
  searchAbortController = new AbortController();

  onlineLoading.value = true;
  onlineError.value = '';
  stopPreview();

  try {
    const result = await searchAmbientLibrary(keyword, {
      license: onlineLicense.value,
      pageNo,
      pageSize: onlinePageSize.value,
      signal: searchAbortController.signal
    });
    onlineResults.value = result.items;
    onlineTotal.value = result.total;
    onlinePageNo.value = result.pageNo;
    if (result.pageSize) onlinePageSize.value = result.pageSize;
    onlineSearched.value = true;
  } catch (error) {
    if (error?.name === 'AbortError' || error?.problemCode === 'ABORTED') return;
    onlineResults.value = [];
    onlineError.value =
      error?.status === 429
        ? '搜索太频繁了，等一会儿再试。'
        : error?.detail || error?.message || '搜索失败，请稍后再试。';
    onlineSearched.value = true;
  } finally {
    onlineLoading.value = false;
  }
}

function setOnlineLicense(scope) {
  if (onlineLicense.value === scope) return;
  onlineLicense.value = scope;
  if (onlineSearched.value && onlineQuery.value.trim()) {
    runOnlineSearch(1);
  }
}

async function copyAttribution(track) {
  const text = buildAmbientAttribution(track);
  if (!text) return;
  try {
    await navigator.clipboard.writeText(text);
    copiedId.value = track.trackId;
    if (copiedTimer) window.clearTimeout(copiedTimer);
    copiedTimer = window.setTimeout(() => {
      copiedId.value = '';
      copiedTimer = 0;
    }, 2000);
  } catch {
    onlineError.value = '复制失败，可以手动选中卡片提示里的署名文本。';
  }
}

function formatDuration(seconds) {
  const total = Math.max(0, Math.round(Number(seconds) || 0));
  const mm = Math.floor(total / 60);
  const ss = total % 60;
  return `${mm}:${String(ss).padStart(2, '0')}`;
}

watch(
  () => props.activeTab,
  (tab) => {
    if (tab !== 'online') stopPreview();
  }
);

watch(
  () => props.visible,
  (open) => {
    if (!open) stopPreview();
  }
);

onBeforeUnmount(() => {
  stopPreview();
  if (searchAbortController) searchAbortController.abort();
  if (copiedTimer) window.clearTimeout(copiedTimer);
});

/* --------------------------------- 场景 --------------------------------- */

const activeSceneId = computed(() => {
  const enabledIds = new Set(enabledTracks.value.map((track) => track.trackId));
  const effect = props.effectState || {};
  const matched = scenes.find((scene) => {
    const sceneTrackIds = (scene.tracks || []).map((track) => track.trackId);
    if (sceneTrackIds.length !== enabledIds.size) return false;
    if (!sceneTrackIds.every((trackId) => enabledIds.has(trackId))) return false;
    const presetId = scene.effect?.presetId || 'none';
    if (presetId === 'none') return effect.presetId === 'none' || !effect.enabled;
    return effect.presetId === presetId && Boolean(effect.enabled);
  });
  return matched?.id || '';
});

function applyScene(scene) {
  emit('apply-scene', scene);
}

function stopEverything() {
  emit('ambient-mute-all');
  emit('effect-toggle-enabled', false);
}

function sceneSoundLabels(scene) {
  return (scene.tracks || []).map((track) => findBuiltinAmbientById(track.trackId)?.label || track.trackId);
}

function sceneEffectLabel(scene) {
  const presetId = scene.effect?.presetId || 'none';
  if (presetId === 'none') return '无特效';
  return findEffectPresetById(presetId)?.label || presetId;
}

/* --------------------------------- 音乐 --------------------------------- */

const musicGroups = computed(() => (Array.isArray(props.musicLibraryState?.sections) ? props.musicLibraryState.sections : []));
const currentPlaylist = computed(() => props.musicLibraryState?.selectedPlaylist || { playlistCode: 'default_public', name: '默认歌单' });
const currentTracks = computed(() => (Array.isArray(props.musicLibraryState?.selectedTracks) ? props.musicLibraryState.selectedTracks : []));
const lyricWindow = computed(() => {
  const context = props.lyricContext && typeof props.lyricContext === 'object' ? props.lyricContext : {};
  const current = String(context.current || props.lyricLine || '纯音乐，无歌词').trim() || '纯音乐，无歌词';
  const prev = String(context.prev || '').trim();
  const next = String(context.next || '').trim();
  return {
    prev: prev || ' ',
    current,
    next: next || ' ',
    key: String(context.key || `${prev}__${current}__${next}`)
  };
});

/* --------------------------------- 特效 --------------------------------- */

const activeEffectPreset = computed(() => findEffectPresetById(props.effectState?.presetId));
const effectStrength = computed(() => resolveEffectStrength(props.effectState));
const activeEffectPreviewTokens = computed(() => resolveEffectPreviewTokens(activeEffectPreset.value.id, props.effectState));
const activeEffectPreviewVars = computed(() => resolveEffectPreviewVars(props.effectState, { active: true }));

const effectSummaryChip = computed(() => {
  if (!props.effectState?.enabled || props.effectState?.presetId === 'none') return '';
  return activeEffectPreset.value.label;
});

const effectSliders = computed(() => {
  const effect = props.effectState || {};
  const opacity = Number.isFinite(Number(effect.opacity)) ? Number(effect.opacity) : DEFAULT_EFFECT_OPACITY;
  return [
    {
      key: 'density',
      icon: 'fas fa-layer-group',
      label: '强度',
      min: 0.4,
      max: 1.8,
      step: 0.01,
      value: Number(effect.density) || DEFAULT_EFFECT_DENSITY,
      display: `${effectStrength.value.densityPercent}%`,
      event: 'effect-set-density'
    },
    {
      key: 'opacity',
      icon: 'fas fa-circle-half-stroke',
      label: '透明度',
      min: 0,
      max: 1,
      step: 0.01,
      value: opacity,
      display: `${Math.round(opacity * 100)}%`,
      event: 'effect-set-opacity'
    },
    {
      key: 'fallSpeed',
      icon: 'fas fa-gauge-high',
      label: '运动速度',
      min: 0.4,
      max: 1.8,
      step: 0.01,
      value: Number(effect.fallSpeed) || DEFAULT_EFFECT_FALL_SPEED,
      display: `${effectStrength.value.fallSpeedPercent}%`,
      event: 'effect-set-fall-speed'
    },
    {
      key: 'spawnRate',
      icon: 'fas fa-rotate',
      label: '生成密度',
      min: 0.4,
      max: 1.8,
      step: 0.01,
      value: Number(effect.spawnRate) || DEFAULT_EFFECT_SPAWN_RATE,
      display: `${effectStrength.value.spawnRatePercent}%`,
      event: 'effect-set-spawn-rate'
    }
  ];
});

function resetEffectTuning() {
  emit('effect-set-density', DEFAULT_EFFECT_DENSITY);
  emit('effect-set-opacity', DEFAULT_EFFECT_OPACITY);
  emit('effect-set-fall-speed', DEFAULT_EFFECT_FALL_SPEED);
  emit('effect-set-spawn-rate', DEFAULT_EFFECT_SPAWN_RATE);
}

function resolvePreviewTokensForCard(presetId) {
  return resolveEffectPreviewTokens(
    presetId,
    props.effectState?.presetId === presetId ? props.effectState : null
  );
}

function resolvePreviewVarsForCard(presetId) {
  const isActive = props.effectState?.presetId === presetId;
  return resolveEffectPreviewVars(
    isActive
      ? {
          ...props.effectState,
          presetId
        }
      : {
          presetId,
          density: 1,
          opacity: 0.7,
          fallSpeed: 1,
          spawnRate: 1
        },
    {
      active: isActive
    }
  );
}

/* --------------------------------- 通用 --------------------------------- */

function rangeFillStyle(value, min = 0, max = 1) {
  const numeric = Number(value);
  const safe = Number.isFinite(numeric) ? Math.min(max, Math.max(min, numeric)) : min;
  const percent = max > min ? ((safe - min) / (max - min)) * 100 : 0;
  return { '--fill': `${percent}%` };
}
</script>

<style scoped>
/* ================================ 布局骨架 ================================ */

.atmo-mask {
  position: fixed;
  inset: 0;
  z-index: 1200;
  display: grid;
  place-items: center;
  padding: 14px;
  background: rgba(8, 12, 18, 0.44);
  backdrop-filter: blur(6px) saturate(120%);
  -webkit-backdrop-filter: blur(6px) saturate(120%);
}

.atmo-panel {
  --liquid-bg: rgba(var(--glass-rgb), 0.44);
  --liquid-border: rgba(255, 255, 255, 0.5);
  --liquid-shadow: 0 24px 64px rgba(8, 12, 20, 0.34);
  width: min(1040px, calc(100vw - 20px));
  max-height: min(86vh, 800px);
  border-radius: 24px;
  padding: 16px 16px 0;
  display: flex;
  flex-direction: column;
  gap: 12px;
  overflow: hidden;
  color: rgba(28, 34, 42, 0.9);
}

.atmo-scroll {
  flex: 1;
  min-height: 0;
  overflow-y: auto;
  overscroll-behavior: contain;
  padding: 2px 2px 16px;
  scrollbar-width: thin;
  scrollbar-color: rgba(120, 130, 150, 0.4) transparent;
}

.atmo-scroll::-webkit-scrollbar {
  width: 6px;
}

.atmo-scroll::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(120, 130, 150, 0.36);
}

.panel-body {
  display: grid;
  gap: 14px;
}

/* ================================ 头部 ================================ */

.atmo-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.atmo-title {
  display: flex;
  align-items: center;
  gap: 12px;
  min-width: 0;
}

.atmo-title-glyph {
  width: 44px;
  height: 44px;
  flex: none;
  border-radius: 15px;
  display: grid;
  place-items: center;
  font-size: 18px;
  color: rgba(255, 252, 248, 0.96);
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.95), rgba(var(--accent-strong-rgb), 0.9));
  box-shadow: 0 10px 22px rgba(var(--accent-rgb), 0.34);
}

.atmo-title-copy h2 {
  margin: 0;
  font-size: 19px;
  letter-spacing: 0.02em;
}

.atmo-title-copy p {
  margin: 2px 0 0;
  font-size: 12px;
  color: rgba(80, 92, 110, 0.76);
}

.atmo-header-side {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
  justify-content: flex-end;
}

.status-chip {
  display: inline-flex;
  align-items: center;
  gap: 7px;
  min-height: 28px;
  padding: 0 11px;
  border-radius: 999px;
  font-size: 12px;
  color: rgba(54, 66, 84, 0.86);
  background: rgba(255, 255, 255, 0.44);
  border: 1px solid rgba(255, 255, 255, 0.5);
}

.status-chip.timer {
  color: rgba(var(--accent-strong-rgb), 1);
  font-variant-numeric: tabular-nums;
}

.icon-btn {
  width: 36px;
  height: 36px;
  flex: none;
  border: 1px solid rgba(255, 255, 255, 0.5);
  border-radius: 12px;
  display: inline-grid;
  place-items: center;
  background: rgba(255, 255, 255, 0.4);
  color: rgba(40, 50, 64, 0.82);
  transition: background-color 0.18s ease, transform 0.18s ease, box-shadow 0.18s ease;
}

.icon-btn:hover {
  transform: translateY(-1px);
  background: rgba(255, 255, 255, 0.62);
  box-shadow: 0 10px 20px rgba(8, 12, 20, 0.1);
}

/* ================================ 标签页 ================================ */

.atmo-tabs {
  display: flex;
  gap: 4px;
  padding: 4px;
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.3);
  border: 1px solid rgba(255, 255, 255, 0.42);
  width: fit-content;
  max-width: 100%;
  overflow-x: auto;
}

.atmo-tab {
  border: 0;
  min-height: 36px;
  padding: 0 16px;
  border-radius: 11px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  font-size: 13px;
  white-space: nowrap;
  background: transparent;
  color: rgba(62, 74, 92, 0.78);
  transition: background-color 0.2s ease, color 0.2s ease, box-shadow 0.2s ease;
}

.atmo-tab:hover {
  background: rgba(255, 255, 255, 0.42);
}

.atmo-tab.active {
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.96), rgba(var(--accent-strong-rgb), 0.92));
  color: rgba(255, 251, 247, 0.98);
  box-shadow: 0 8px 18px rgba(var(--accent-rgb), 0.32);
}

/* ================================ 通用元素 ================================ */

.glass-card {
  border-radius: 18px;
  border: 1px solid rgba(255, 255, 255, 0.46);
  background: rgba(255, 255, 255, 0.3);
  padding: 14px;
  display: grid;
  gap: 12px;
}

.block-head,
.group-head,
.track-head,
.lyrics-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 10px;
}

.block-head.compact {
  align-items: center;
}

.block-head h3,
.group-head h4,
.track-head h4 {
  margin: 0;
}

.section-kicker,
.mini-label {
  margin: 0 0 2px;
  font-size: 10.5px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(96, 110, 130, 0.68);
}

.head-copy,
.inline-note,
.empty-note {
  margin: 0;
  font-size: 13px;
  color: rgba(54, 66, 82, 0.74);
}

.head-copy {
  margin-top: 4px;
}

.inline-note.warning {
  color: rgba(158, 92, 42, 0.92);
}

.block-actions,
.preset-actions,
.preset-list {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px;
}

.soft-btn,
.row-action,
.preset-chip,
.inline-link,
.chip {
  border: 1px solid rgba(255, 255, 255, 0.48);
  border-radius: 11px;
  min-height: 34px;
  padding: 0 13px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  font-size: 13px;
  background: rgba(255, 255, 255, 0.38);
  color: rgba(34, 42, 56, 0.82);
  transition: background-color 0.18s ease, box-shadow 0.18s ease, transform 0.18s ease, border-color 0.18s ease;
}

.soft-btn:hover,
.row-action:hover,
.preset-chip:hover,
.chip:hover {
  transform: translateY(-1px);
  box-shadow: 0 10px 22px rgba(8, 12, 20, 0.1);
  background: rgba(255, 255, 255, 0.56);
}

.soft-btn.primary {
  border-color: transparent;
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.96), rgba(var(--accent-strong-rgb), 0.92));
  color: rgba(255, 251, 247, 0.98);
}

.soft-btn.primary:hover {
  box-shadow: 0 12px 24px rgba(var(--accent-rgb), 0.32);
}

.soft-btn:disabled {
  opacity: 0.55;
  pointer-events: none;
}

.soft-btn.round {
  width: 42px;
  min-height: 42px;
  padding: 0;
  justify-content: center;
  border-radius: 50%;
}

.chip.active {
  border-color: rgba(var(--accent-strong-rgb), 0.6);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(var(--accent-strong-rgb), 1);
  font-weight: 600;
}

.count-pill {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  background: rgba(255, 255, 255, 0.44);
  color: rgba(47, 58, 74, 0.7);
  font-size: 12px;
}

.playlist-group {
  display: grid;
  gap: 10px;
}

.hidden-input {
  display: none;
}

.inline-link {
  min-height: 26px;
  padding: 0 10px;
  margin-left: 6px;
  border-radius: 999px;
}

/* ------------------------------- 自定义滑杆 ------------------------------- */

.atmo-range {
  -webkit-appearance: none;
  appearance: none;
  width: 100%;
  height: 24px;
  margin: 0;
  background: transparent;
  cursor: pointer;
}

.atmo-range::-webkit-slider-runnable-track {
  height: 6px;
  border-radius: 999px;
  background:
    linear-gradient(
      90deg,
      rgba(var(--accent-strong-rgb), 0.92) 0%,
      rgba(var(--accent-rgb), 0.92) var(--fill, 50%),
      rgba(255, 255, 255, 0.46) var(--fill, 50%)
    );
}

.atmo-range::-webkit-slider-thumb {
  -webkit-appearance: none;
  width: 16px;
  height: 16px;
  margin-top: -5px;
  border-radius: 50%;
  border: 2px solid rgba(255, 255, 255, 0.96);
  background: rgb(var(--accent-strong-rgb));
  box-shadow: 0 3px 8px rgba(8, 12, 20, 0.22);
  transition: transform 0.15s ease;
}

.atmo-range:hover::-webkit-slider-thumb {
  transform: scale(1.12);
}

.atmo-range::-moz-range-track {
  height: 6px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.46);
}

.atmo-range::-moz-range-progress {
  height: 6px;
  border-radius: 999px;
  background: linear-gradient(90deg, rgba(var(--accent-strong-rgb), 0.92), rgba(var(--accent-rgb), 0.92));
}

.atmo-range::-moz-range-thumb {
  width: 12px;
  height: 12px;
  border-radius: 50%;
  border: 2px solid rgba(255, 255, 255, 0.96);
  background: rgb(var(--accent-strong-rgb));
  box-shadow: 0 3px 8px rgba(8, 12, 20, 0.22);
}

.atmo-range.small {
  height: 18px;
}

/* ================================ 场景页 ================================ */

.scene-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(226px, 1fr));
  gap: 12px;
}

.scene-card {
  position: relative;
  border: 1px solid rgba(255, 255, 255, 0.34);
  border-radius: 18px;
  min-height: 168px;
  padding: 13px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  gap: 10px;
  text-align: left;
  overflow: hidden;
  background: var(--cover-bg);
  color: rgba(252, 253, 255, 0.97);
  transition: transform 0.2s ease, box-shadow 0.2s ease, border-color 0.2s ease;
}

.scene-card:hover {
  transform: translateY(-3px);
  box-shadow: 0 18px 34px rgba(10, 14, 24, 0.26);
}

.scene-card.active {
  border-color: rgba(255, 255, 255, 0.85);
  box-shadow:
    0 0 0 2px rgba(var(--accent-rgb), 0.55),
    0 18px 34px rgba(10, 14, 24, 0.28);
}

.scene-glass {
  position: absolute;
  inset: 0;
  background:
    radial-gradient(circle at 18% 14%, rgba(255, 255, 255, 0.34), transparent 34%),
    linear-gradient(180deg, rgba(10, 14, 22, 0), rgba(10, 14, 22, 0.42));
  pointer-events: none;
}

.scene-top {
  position: relative;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.scene-icon {
  width: 38px;
  height: 38px;
  border-radius: 12px;
  display: grid;
  place-items: center;
  font-size: 16px;
  background: rgba(255, 255, 255, 0.22);
  border: 1px solid rgba(255, 255, 255, 0.36);
  backdrop-filter: blur(4px);
}

.scene-live {
  display: inline-flex;
  align-items: center;
  gap: 7px;
  min-height: 26px;
  padding: 0 10px;
  border-radius: 999px;
  font-size: 11.5px;
  background: rgba(12, 16, 24, 0.36);
  border: 1px solid rgba(255, 255, 255, 0.3);
}

.scene-copy {
  position: relative;
  display: grid;
  gap: 4px;
}

.scene-copy strong {
  font-size: 16px;
  letter-spacing: 0.02em;
  text-shadow: 0 1px 6px rgba(8, 10, 16, 0.35);
}

.scene-copy small {
  font-size: 12px;
  line-height: 1.5;
  color: rgba(240, 244, 250, 0.85);
  text-shadow: 0 1px 4px rgba(8, 10, 16, 0.3);
}

.scene-tags {
  position: relative;
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.scene-tag {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  min-height: 23px;
  padding: 0 9px;
  border-radius: 999px;
  font-size: 11px;
  background: rgba(12, 16, 24, 0.32);
  border: 1px solid rgba(255, 255, 255, 0.24);
}

/* ================================ 环境音页 ================================ */

.ambient-console {
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
}

.console-volume {
  display: flex;
  align-items: center;
  gap: 12px;
  min-width: 0;
}

.console-volume-body {
  flex: 1;
  min-width: 160px;
  display: grid;
  gap: 4px;
}

.console-volume-head {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
  font-size: 12.5px;
  color: rgba(66, 78, 96, 0.78);
}

.console-volume-head strong {
  font-variant-numeric: tabular-nums;
  color: rgba(30, 38, 50, 0.92);
}

.console-side {
  display: grid;
  gap: 8px;
  justify-items: end;
}

.timer-group {
  display: flex;
  align-items: center;
  flex-wrap: wrap;
  gap: 6px;
}

.timer-caption {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  font-size: 12px;
  color: rgba(80, 92, 110, 0.76);
  margin-right: 2px;
}

.timer-group .chip {
  min-height: 28px;
  padding: 0 10px;
  border-radius: 999px;
  font-size: 12px;
}

.timer-count {
  font-size: 12.5px;
  font-variant-numeric: tabular-nums;
  color: rgba(var(--accent-strong-rgb), 1);
  font-weight: 600;
}

.console-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  justify-content: flex-end;
}

/* --------------------------------- 音源瓦片 -------------------------------- */

.sound-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(196px, 1fr));
  gap: 10px;
}

.sound-tile {
  position: relative;
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.44);
  background: rgba(255, 255, 255, 0.32);
  transition: transform 0.18s ease, border-color 0.18s ease, box-shadow 0.18s ease, background-color 0.18s ease;
}

.sound-tile:hover {
  transform: translateY(-2px);
  box-shadow: 0 12px 24px rgba(8, 12, 20, 0.1);
}

.sound-tile.active {
  border-color: rgba(var(--accent-strong-rgb), 0.66);
  background: rgba(var(--accent-rgb), 0.14);
  box-shadow: 0 14px 26px rgba(var(--accent-rgb), 0.16);
}

.tile-face {
  width: 100%;
  border: 0;
  background: transparent;
  padding: 11px;
  display: grid;
  grid-template-columns: 42px minmax(0, 1fr) 26px;
  align-items: center;
  gap: 10px;
  text-align: left;
  color: inherit;
  border-radius: 16px;
}

.tile-icon {
  width: 42px;
  height: 42px;
  border-radius: 13px;
  display: grid;
  place-items: center;
  font-size: 16px;
  color: rgba(252, 253, 255, 0.96);
  background: var(--cover-bg, linear-gradient(140deg, rgba(150, 160, 180, 0.9), rgba(80, 90, 110, 0.9)));
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.22);
}

.tile-copy {
  display: grid;
  gap: 2px;
  min-width: 0;
}

.tile-copy strong {
  font-size: 13.5px;
  color: rgba(24, 30, 40, 0.92);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.tile-copy small {
  font-size: 11.5px;
  color: rgba(90, 102, 120, 0.72);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.sound-tile.active .tile-copy small {
  color: rgba(var(--accent-strong-rgb), 0.96);
}

.tile-state {
  display: grid;
  place-items: center;
  width: 26px;
  height: 26px;
}

.tile-play-hint {
  font-size: 11px;
  color: rgba(120, 132, 150, 0.5);
  opacity: 0;
  transition: opacity 0.16s ease;
}

.sound-tile:hover .tile-play-hint {
  opacity: 1;
}

.tile-paused {
  font-size: 12px;
  color: rgba(158, 92, 42, 0.9);
}

.tile-spinner {
  width: 16px;
  height: 16px;
  border-radius: 50%;
  border: 2px solid rgba(var(--accent-rgb), 0.3);
  border-top-color: rgb(var(--accent-strong-rgb));
  animation: atmo-spin 0.8s linear infinite;
}

.tile-eq {
  display: inline-flex;
  align-items: flex-end;
  gap: 2px;
  height: 14px;
}

.tile-eq i {
  width: 3px;
  border-radius: 999px;
  background: rgb(var(--accent-strong-rgb));
  animation: atmo-eq 1s ease-in-out infinite;
}

.tile-eq.light i {
  background: rgba(255, 255, 255, 0.92);
}

.tile-eq i:nth-child(1) {
  height: 60%;
  animation-delay: -0.2s;
}

.tile-eq i:nth-child(2) {
  height: 100%;
  animation-delay: -0.5s;
}

.tile-eq i:nth-child(3) {
  height: 75%;
  animation-delay: -0.05s;
}

.tile-volume {
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 0 12px 10px;
}

.tile-volume-num {
  flex: none;
  width: 26px;
  text-align: right;
  font-size: 11.5px;
  font-variant-numeric: tabular-nums;
  color: rgba(66, 78, 96, 0.78);
}

.tile-remove {
  position: absolute;
  top: -7px;
  right: -7px;
  width: 22px;
  height: 22px;
  border-radius: 50%;
  border: 1px solid rgba(255, 255, 255, 0.6);
  background: rgba(240, 244, 250, 0.94);
  color: rgba(90, 100, 118, 0.9);
  font-size: 10px;
  display: none;
  place-items: center;
  box-shadow: 0 4px 10px rgba(8, 12, 20, 0.18);
}

.sound-tile:hover .tile-remove {
  display: grid;
}

/* --------------------------------- 混音组合 -------------------------------- */

.preset-input {
  min-width: 190px;
  min-height: 36px;
  border-radius: 11px;
  border: 1px solid rgba(255, 255, 255, 0.48);
  background: rgba(255, 255, 255, 0.4);
  color: rgba(24, 30, 40, 0.86);
  padding: 0 12px;
  font-size: 13px;
}

.preset-input:focus-visible {
  outline: none;
  border-color: rgba(var(--accent-strong-rgb), 0.6);
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.2);
}

.preset-chip {
  border-radius: 999px;
}

.preset-chip .preset-remove {
  color: rgba(140, 100, 90, 0.6);
  transition: color 0.15s ease;
}

.preset-chip .preset-remove:hover {
  color: rgba(190, 84, 62, 0.95);
}

/* ============================== 在线音源库 ============================== */

.online-search-bar {
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
}

.search-input-wrap {
  position: relative;
  display: flex;
  align-items: center;
  min-width: 0;
}

.search-input-wrap > i {
  position: absolute;
  left: 13px;
  font-size: 12.5px;
  color: rgba(110, 122, 140, 0.7);
  pointer-events: none;
}

.search-input {
  width: 100%;
  min-height: 40px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.5);
  background: rgba(255, 255, 255, 0.42);
  color: rgba(24, 30, 40, 0.88);
  padding: 0 36px 0 34px;
  font-size: 13.5px;
}

.search-input::-webkit-search-cancel-button {
  display: none;
}

.search-input:focus-visible {
  outline: none;
  border-color: rgba(var(--accent-strong-rgb), 0.6);
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.2);
}

.search-input:disabled {
  opacity: 0.55;
}

.search-clear {
  position: absolute;
  right: 9px;
  width: 22px;
  height: 22px;
  border: 0;
  border-radius: 50%;
  display: grid;
  place-items: center;
  font-size: 10px;
  background: rgba(140, 150, 168, 0.24);
  color: rgba(60, 70, 86, 0.82);
}

.search-actions {
  display: flex;
  align-items: center;
  flex-wrap: wrap;
  gap: 8px;
  justify-content: flex-end;
}

.license-toggle {
  display: inline-flex;
  gap: 4px;
  padding: 3px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.3);
  border: 1px solid rgba(255, 255, 255, 0.44);
}

.license-toggle .chip {
  min-height: 28px;
  padding: 0 12px;
  border: 0;
  border-radius: 999px;
  background: transparent;
  font-size: 12px;
}

.license-toggle .chip.active {
  background: rgba(var(--accent-rgb), 0.24);
}

.online-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(268px, 1fr));
  gap: 10px;
}

.online-card {
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.46);
  background: rgba(255, 255, 255, 0.32);
  padding: 12px;
  display: grid;
  gap: 10px;
  align-content: start;
  transition: transform 0.18s ease, border-color 0.18s ease, box-shadow 0.18s ease;
}

.online-card:hover {
  transform: translateY(-2px);
  box-shadow: 0 12px 24px rgba(8, 12, 20, 0.1);
}

.online-card.added {
  border-color: rgba(var(--accent-strong-rgb), 0.6);
  background: rgba(var(--accent-rgb), 0.12);
}

.online-card-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 8px;
}

.online-card-copy {
  display: grid;
  gap: 3px;
  min-width: 0;
}

.online-card-copy strong {
  font-size: 13.5px;
  color: rgba(24, 30, 40, 0.92);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.online-card-copy small {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 11.5px;
  color: rgba(90, 102, 120, 0.74);
}

.online-card-copy small .dot {
  opacity: 0.5;
}

.license-pill {
  flex: none;
  min-height: 22px;
  padding: 0 9px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 10.5px;
  white-space: nowrap;
}

.license-pill.free {
  background: rgba(126, 196, 148, 0.26);
  color: rgba(42, 104, 66, 0.96);
}

.license-pill.attrib {
  background: rgba(232, 178, 108, 0.28);
  color: rgba(140, 84, 26, 0.96);
}

.online-card-actions {
  display: flex;
  align-items: center;
  gap: 8px;
}

.online-card-actions .soft-btn.round {
  width: 36px;
  min-height: 36px;
}

.online-card-actions .soft-btn:not(.round) {
  flex: 1;
  justify-content: center;
}

.attribution-row {
  border: 1px dashed rgba(160, 140, 110, 0.5);
  border-radius: 10px;
  min-height: 30px;
  padding: 0 10px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  font-size: 11.5px;
  background: rgba(255, 250, 240, 0.42);
  color: rgba(130, 96, 46, 0.94);
  transition: background-color 0.16s ease;
}

.attribution-row:hover {
  background: rgba(255, 246, 228, 0.7);
}

.online-card.skeleton {
  gap: 8px;
  min-height: 104px;
}

.sk-line {
  height: 12px;
  border-radius: 999px;
  width: 58%;
  background: linear-gradient(
    90deg,
    rgba(190, 198, 212, 0.24) 25%,
    rgba(212, 220, 232, 0.44) 50%,
    rgba(190, 198, 212, 0.24) 75%
  );
  background-size: 200% 100%;
  animation: atmo-shimmer 1.3s linear infinite;
}

.sk-line.wide {
  width: 84%;
  height: 15px;
}

.pager {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 12px;
}

.pager-info {
  font-size: 12.5px;
  font-variant-numeric: tabular-nums;
  color: rgba(80, 92, 110, 0.8);
}

.inline-note code {
  padding: 1px 6px;
  border-radius: 5px;
  background: rgba(120, 132, 150, 0.18);
  font-size: 12px;
}

/* ================================ 特效页 ================================ */

.fx-console {
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
}

.fx-console-main {
  display: flex;
  align-items: center;
  gap: 12px;
  min-width: 0;
}

.fx-console-copy {
  display: grid;
  gap: 2px;
  min-width: 0;
}

.fx-console-copy strong {
  color: rgba(24, 30, 40, 0.92);
}

.fx-console-copy small {
  font-size: 12px;
  color: rgba(90, 102, 120, 0.74);
}

.fx-switch {
  flex: none;
  width: 52px;
  height: 30px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.55);
  background: rgba(148, 158, 174, 0.4);
  position: relative;
  transition: background-color 0.2s ease, border-color 0.2s ease;
}

.fx-switch-knob {
  position: absolute;
  top: 3px;
  left: 3px;
  width: 22px;
  height: 22px;
  border-radius: 50%;
  background: rgba(255, 255, 255, 0.98);
  box-shadow: 0 3px 8px rgba(8, 12, 20, 0.24);
  transition: transform 0.22s cubic-bezier(0.34, 1.4, 0.64, 1);
}

.fx-switch.on {
  border-color: transparent;
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.98), rgba(var(--accent-strong-rgb), 0.94));
}

.fx-switch.on .fx-switch-knob {
  transform: translateX(22px);
}

.fx-stage-layout {
  display: grid;
  grid-template-columns: minmax(0, 1.15fr) minmax(280px, 0.85fr);
  gap: 12px;
  align-items: stretch;
}

.effect-stage {
  position: relative;
  min-height: 210px;
  border-radius: 18px;
  border: 1px solid rgba(255, 255, 255, 0.4);
  background: var(--cover-bg);
  overflow: hidden;
}

.effect-stage-tag {
  bottom: auto;
  top: 10px;
}

.fx-slider-card {
  gap: 12px;
  align-content: center;
}

.fx-slider-row {
  display: grid;
  gap: 5px;
}

.fx-slider-head {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
  font-size: 12.5px;
  color: rgba(66, 78, 96, 0.78);
}

.fx-slider-name {
  display: inline-flex;
  align-items: center;
  gap: 7px;
}

.fx-slider-name i {
  width: 14px;
  text-align: center;
  color: rgba(var(--accent-strong-rgb), 0.9);
}

.fx-slider-head strong {
  font-variant-numeric: tabular-nums;
  color: rgba(30, 38, 50, 0.92);
}

/* --------------------------------- 特效卡片 -------------------------------- */

.fx-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(168px, 1fr));
  gap: 10px;
}

.fx-card {
  border: 1px solid rgba(255, 255, 255, 0.44);
  border-radius: 16px;
  background: rgba(255, 255, 255, 0.32);
  padding: 9px;
  display: grid;
  gap: 8px;
  text-align: left;
  color: inherit;
  transition: transform 0.18s ease, border-color 0.18s ease, box-shadow 0.18s ease;
}

.fx-card:hover {
  transform: translateY(-2px);
  box-shadow: 0 12px 24px rgba(8, 12, 20, 0.12);
}

.fx-card.active {
  border-color: rgba(var(--accent-strong-rgb), 0.66);
  box-shadow: 0 14px 26px rgba(var(--accent-rgb), 0.18);
  background: rgba(var(--accent-rgb), 0.12);
}

.fx-card-stage {
  position: relative;
  display: block;
  min-height: 96px;
  border-radius: 12px;
  background: var(--cover-bg);
  overflow: hidden;
}

.fx-card-check {
  position: absolute;
  top: 8px;
  right: 8px;
  z-index: 2;
  width: 24px;
  height: 24px;
  border-radius: 50%;
  display: grid;
  place-items: center;
  font-size: 11px;
  color: rgba(255, 251, 247, 0.98);
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.98), rgba(var(--accent-strong-rgb), 0.95));
  box-shadow: 0 6px 12px rgba(8, 12, 20, 0.24);
}

.fx-card-copy {
  display: grid;
  gap: 3px;
  padding: 0 2px 2px;
}

.fx-card-copy strong {
  font-size: 13.5px;
  color: rgba(24, 30, 40, 0.92);
}

.fx-card-copy small {
  font-size: 11.5px;
  line-height: 1.45;
  color: rgba(90, 102, 120, 0.72);
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

/* ------------------------------ CSS 粒子预览 ------------------------------ */

.cover-gloss {
  position: absolute;
  inset: 0;
  background:
    radial-gradient(circle at 20% 18%, rgba(255, 255, 255, 0.42), transparent 26%),
    linear-gradient(180deg, rgba(255, 255, 255, 0.16), rgba(255, 255, 255, 0));
}

.card-tag {
  position: absolute;
  left: 10px;
  bottom: 10px;
  z-index: 2;
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  background: rgba(15, 19, 28, 0.32);
  color: rgba(248, 250, 255, 0.95);
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  backdrop-filter: blur(3px);
}

.effect-preview {
  position: absolute;
  inset: 0;
  z-index: 1;
  pointer-events: none;
  overflow: hidden;
}

.effect-preview-stage::after {
  content: '';
  position: absolute;
  inset: auto 0 0 0;
  height: 42%;
  background: linear-gradient(180deg, rgba(255, 255, 255, 0), rgba(15, 18, 24, 0.1));
}

.effect-preview-none {
  background:
    radial-gradient(circle at 50% 50%, rgba(255, 255, 255, 0.18), transparent 34%),
    linear-gradient(180deg, rgba(255, 255, 255, 0.08), rgba(255, 255, 255, 0));
}

.effect-preview-sakura {
  background:
    radial-gradient(circle at 28% 30%, rgba(255, 255, 255, 0.5), transparent 18%),
    radial-gradient(circle at 64% 48%, rgba(255, 214, 228, 0.8), transparent 16%);
}

.effect-preview-snow {
  background: radial-gradient(circle at 24% 28%, rgba(255, 255, 255, 0.6), transparent 16%);
}

.effect-preview-soft-rain {
  background:
    linear-gradient(120deg, rgba(255, 255, 255, 0) 28%, rgba(222, 236, 255, 0.5) 30%, rgba(255, 255, 255, 0) 34%),
    linear-gradient(120deg, rgba(255, 255, 255, 0) 52%, rgba(216, 231, 255, 0.55) 54%, rgba(255, 255, 255, 0) 58%);
}

.effect-preview-fireflies {
  background: radial-gradient(circle at 30% 32%, rgba(255, 232, 129, 0.5), transparent 22%);
}

.effect-preview-leaves {
  background: radial-gradient(circle at 26% 24%, rgba(255, 240, 214, 0.5), transparent 26%);
}

.effect-preview-starfield {
  background:
    radial-gradient(circle at 22% 26%, rgba(255, 255, 255, 0.2), transparent 3%),
    radial-gradient(circle at 78% 18%, rgba(255, 255, 255, 0.22), transparent 3%),
    radial-gradient(circle at 56% 66%, rgba(255, 255, 255, 0.16), transparent 3%);
}

.effect-preview-meteor {
  background: radial-gradient(circle at 70% 20%, rgba(255, 255, 255, 0.18), transparent 22%);
}

.effect-preview-bubbles {
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.12), rgba(255, 255, 255, 0) 46%);
}

.effect-preview-dust {
  background: radial-gradient(circle at 34% 30%, rgba(255, 246, 222, 0.4), transparent 40%);
}

.effect-preview-aurora {
  background: linear-gradient(180deg, rgba(20, 26, 48, 0.22), rgba(20, 26, 48, 0) 58%);
}

.effect-particle {
  position: absolute;
  left: var(--preview-x);
  top: var(--preview-y);
  opacity: calc(var(--preview-opacity) * var(--effect-preview-opacity-scale, 1));
  animation-delay: var(--preview-delay);
  animation-duration: calc(var(--preview-duration) * var(--effect-preview-drift-scale, 1));
  animation-iteration-count: infinite;
  animation-timing-function: ease-in-out;
  animation-fill-mode: both;
  transform-origin: center;
}

.effect-particle-petal {
  width: calc(var(--preview-size) * 0.72 * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 72% 42% 66% 44%;
  background: linear-gradient(180deg, rgba(255, 247, 251, 0.92), rgba(255, 182, 211, 0.92));
  box-shadow: 0 6px 16px rgba(228, 125, 169, 0.26);
  transform: rotate(var(--preview-rotate));
  animation-name: effect-preview-petal;
}

.effect-particle-flake {
  width: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 50%;
  background: radial-gradient(circle at 35% 35%, rgba(255, 255, 255, 0.96), rgba(215, 234, 255, 0.82));
  box-shadow: 0 0 12px rgba(255, 255, 255, 0.22);
  animation-name: effect-preview-float;
}

.effect-particle-streak {
  width: 2px;
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 999px;
  background: linear-gradient(180deg, rgba(255, 255, 255, 0), rgba(226, 238, 255, 0.96), rgba(255, 255, 255, 0));
  transform: rotate(var(--preview-rotate));
  animation-name: effect-preview-rain;
}

.effect-particle-glow {
  width: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 50%;
  background: radial-gradient(circle, rgba(255, 239, 148, 0.98), rgba(255, 213, 104, 0.38) 58%, rgba(255, 213, 104, 0) 74%);
  filter: blur(var(--preview-blur));
  box-shadow: 0 0 18px rgba(255, 221, 115, 0.34);
  animation-name: effect-preview-glow;
}

.effect-particle-quiet {
  width: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 50%;
  background: radial-gradient(circle, rgba(255, 255, 255, 0.32), rgba(255, 255, 255, 0) 72%);
  filter: blur(var(--preview-blur));
  animation-name: effect-preview-quiet;
}

.effect-particle-leaf {
  width: calc(var(--preview-size) * 0.68 * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 78% 24% 74% 26%;
  background: linear-gradient(160deg, rgba(240, 192, 129, 0.95), rgba(178, 96, 54, 0.92));
  box-shadow: 0 6px 14px rgba(150, 84, 40, 0.28);
  transform: rotate(var(--preview-rotate));
  animation-name: effect-preview-petal;
}

.effect-particle-star {
  width: calc(var(--preview-size) * 0.6 * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * 0.6 * var(--effect-preview-density-scale, 1));
  border-radius: 50%;
  background: radial-gradient(circle, rgba(255, 255, 255, 0.98), rgba(214, 230, 255, 0.4) 60%, rgba(214, 230, 255, 0) 76%);
  box-shadow: 0 0 10px rgba(255, 255, 255, 0.6);
  animation-name: effect-preview-twinkle;
}

.effect-particle-meteorline {
  width: 2px;
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 999px;
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.98), rgba(198, 220, 255, 0.4), rgba(198, 220, 255, 0));
  transform: rotate(var(--preview-rotate));
  animation-name: effect-preview-meteor;
  animation-timing-function: ease-in;
}

.effect-particle-bubble {
  width: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 50%;
  border: 1px solid rgba(226, 246, 255, 0.85);
  background: radial-gradient(circle at 32% 30%, rgba(255, 255, 255, 0.5), rgba(255, 255, 255, 0.05) 62%);
  animation-name: effect-preview-bubble;
}

.effect-particle-mote {
  width: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * var(--effect-preview-density-scale, 1));
  border-radius: 50%;
  background: radial-gradient(circle, rgba(255, 244, 214, 0.9), rgba(255, 238, 200, 0) 72%);
  filter: blur(var(--preview-blur));
  animation-name: effect-preview-quiet;
}

.effect-particle-ribbon {
  width: calc(var(--preview-size) * 0.8 * var(--effect-preview-density-scale, 1));
  height: calc(var(--preview-size) * 2.2 * var(--effect-preview-density-scale, 1));
  border-radius: 42%;
  background: linear-gradient(180deg, rgba(122, 244, 202, 0.6), rgba(140, 150, 255, 0.18), rgba(140, 150, 255, 0));
  filter: blur(var(--preview-blur));
  transform: rotate(var(--preview-rotate));
  animation-name: effect-preview-ribbon;
}

/* ================================ 音乐页 ================================ */

.music-layout {
  display: grid;
  grid-template-columns: minmax(0, 1.08fr) 300px;
  gap: 12px;
  align-items: start;
}

.playlist-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.playlist-card {
  border: 1px solid rgba(255, 255, 255, 0.44);
  border-radius: 15px;
  background: rgba(255, 255, 255, 0.34);
  padding: 10px;
  display: grid;
  grid-template-columns: 60px minmax(0, 1fr);
  gap: 10px;
  text-align: left;
  color: inherit;
  transition: transform 0.18s ease, border-color 0.18s ease, box-shadow 0.18s ease;
}

.playlist-card:hover {
  transform: translateY(-1px);
  box-shadow: 0 10px 20px rgba(8, 12, 20, 0.08);
}

.playlist-card.active {
  border-color: rgba(var(--accent-strong-rgb), 0.68);
  background: rgba(var(--accent-rgb), 0.12);
  box-shadow: 0 14px 24px rgba(var(--accent-rgb), 0.12);
}

.playlist-cover,
.track-cover {
  overflow: hidden;
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.4);
}

.playlist-cover {
  width: 60px;
  height: 60px;
}

.track-cover {
  width: 40px;
  height: 40px;
}

.playlist-cover img,
.track-cover img,
.playlist-fallback,
.track-cover-fallback {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  object-fit: cover;
}

.playlist-fallback,
.track-cover-fallback {
  background: linear-gradient(155deg, rgba(135, 191, 228, 0.38), rgba(255, 230, 197, 0.4));
  color: rgba(45, 60, 79, 0.72);
}

.playlist-copy,
.track-copy,
.music-now-copy {
  display: grid;
  gap: 4px;
}

.playlist-copy small,
.track-copy small,
.music-now-copy span {
  margin: 0;
  color: rgba(54, 66, 82, 0.72);
}

.playlist-copy strong,
.track-copy strong,
.music-now-copy strong {
  color: rgba(24, 30, 40, 0.9);
}

.track-sheet {
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.4);
  background: rgba(255, 255, 255, 0.24);
  padding: 12px;
  display: grid;
  gap: 10px;
}

.track-list {
  display: grid;
  gap: 8px;
}

.track-row {
  display: grid;
  grid-template-columns: 28px 40px minmax(0, 1fr) 52px auto;
  gap: 10px;
  align-items: center;
  border-radius: 13px;
  padding: 9px 10px;
  background: rgba(255, 255, 255, 0.34);
  outline: none;
  transition: background-color 0.16s ease;
}

.track-row:hover {
  background: rgba(255, 255, 255, 0.5);
}

.track-row:focus-visible {
  box-shadow: 0 0 0 2px rgba(var(--accent-strong-rgb), 0.42);
}

.track-index,
.track-duration {
  font-size: 12px;
  font-variant-numeric: tabular-nums;
  color: rgba(71, 82, 98, 0.68);
}

.music-now-card {
  align-content: start;
  justify-items: center;
}

.music-now-card .block-head {
  justify-self: stretch;
}

.vinyl-button {
  border: 0;
  padding: 0;
  background: transparent;
  display: grid;
  place-items: center;
}

.vinyl-disc {
  width: 196px;
  height: 196px;
  border-radius: 50%;
  position: relative;
  display: grid;
  place-items: center;
  background:
    radial-gradient(circle at 50% 50%, rgba(54, 58, 68, 0.1) 0 10%, transparent 10%),
    radial-gradient(circle at 50% 50%, rgba(22, 24, 31, 0.92) 0 42%, rgba(8, 10, 15, 0.98) 42% 100%);
  box-shadow:
    inset 0 0 0 1px rgba(255, 255, 255, 0.12),
    0 18px 28px rgba(12, 16, 22, 0.18);
}

.vinyl-disc.spinning {
  animation: atmosphere-vinyl-spin 9s linear infinite;
}

.vinyl-rings {
  position: absolute;
  inset: 14px;
  border-radius: 50%;
  background:
    repeating-radial-gradient(
      circle at center,
      rgba(255, 255, 255, 0.02) 0 2px,
      rgba(0, 0, 0, 0.06) 2px 5px
    );
  opacity: 0.55;
}

.vinyl-cover {
  width: 84px;
  height: 84px;
  border-radius: 50%;
  overflow: hidden;
  position: relative;
  z-index: 1;
  border: 3px solid rgba(255, 255, 255, 0.4);
  background: rgba(255, 255, 255, 0.36);
}

.vinyl-cover img,
.vinyl-cover .playlist-fallback {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  object-fit: cover;
}

.vinyl-hole {
  width: 14px;
  height: 14px;
  border-radius: 50%;
  background: rgba(12, 15, 22, 0.9);
  position: absolute;
  z-index: 2;
  box-shadow: 0 0 0 2px rgba(255, 255, 255, 0.38);
}

.summary-actions {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
}

.music-now-copy {
  text-align: center;
  justify-items: center;
}

.lyrics-box {
  justify-self: stretch;
  border-radius: 15px;
  border: 1px solid rgba(255, 255, 255, 0.4);
  background: rgba(255, 255, 255, 0.3);
  padding: 12px;
  display: grid;
  gap: 10px;
}

.lyrics-head span {
  font-size: 12px;
  color: rgba(77, 88, 104, 0.66);
}

.lyrics-triplet {
  display: grid;
  gap: 8px;
  min-height: 100px;
  align-content: center;
}

.lyric-line {
  margin: 0;
  line-height: 1.6;
  text-align: center;
  color: rgba(54, 66, 82, 0.72);
}

.lyric-line.current {
  color: rgba(31, 39, 52, 0.94);
  font-weight: 700;
}

.lyric-line.prev,
.lyric-line.next {
  opacity: 0.66;
  font-size: 13px;
}

.lyric-switch-enter-active,
.lyric-switch-leave-active {
  transition: opacity 180ms ease, transform 180ms ease;
}

.lyric-switch-enter-from,
.lyric-switch-leave-to {
  opacity: 0;
  transform: translateY(6px);
}

/* ================================ 动画 ================================ */

.atmo-fade-enter-active,
.atmo-fade-leave-active {
  transition: opacity 200ms ease;
}

.atmo-fade-enter-active .atmo-panel,
.atmo-fade-leave-active .atmo-panel {
  transition: transform 220ms cubic-bezier(0.32, 1.2, 0.6, 1), opacity 200ms ease;
}

.atmo-fade-enter-from,
.atmo-fade-leave-to {
  opacity: 0;
}

.atmo-fade-enter-from .atmo-panel,
.atmo-fade-leave-to .atmo-panel {
  transform: translateY(14px) scale(0.985);
}

@keyframes atmosphere-vinyl-spin {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

@keyframes atmo-spin {
  to {
    transform: rotate(360deg);
  }
}

@keyframes atmo-eq {
  0%,
  100% {
    transform: scaleY(0.4);
  }
  50% {
    transform: scaleY(1);
  }
}

@keyframes atmo-shimmer {
  0% {
    background-position: 200% 0;
  }
  100% {
    background-position: -200% 0;
  }
}

@keyframes effect-preview-petal {
  0%,
  100% {
    transform: translate3d(0, 0, 0) rotate(var(--preview-rotate));
  }
  50% {
    transform: translate3d(10px, 14px, 0) rotate(calc(var(--preview-rotate) + 10deg));
  }
}

@keyframes effect-preview-float {
  0%,
  100% {
    transform: translate3d(0, 0, 0);
  }
  50% {
    transform: translate3d(4px, 16px, 0);
  }
}

@keyframes effect-preview-rain {
  0% {
    transform: translate3d(0, -10px, 0) rotate(var(--preview-rotate));
  }
  100% {
    transform: translate3d(-8px, 26px, 0) rotate(var(--preview-rotate));
  }
}

@keyframes effect-preview-glow {
  0%,
  100% {
    transform: translate3d(0, 0, 0) scale(0.94);
  }
  50% {
    transform: translate3d(6px, -10px, 0) scale(1.08);
  }
}

@keyframes effect-preview-quiet {
  0%,
  100% {
    transform: scale(0.92);
    opacity: 0.36;
  }
  50% {
    transform: scale(1.08);
    opacity: 0.62;
  }
}

@keyframes effect-preview-twinkle {
  0%,
  100% {
    transform: scale(0.72);
    opacity: 0.4;
  }
  50% {
    transform: scale(1.12);
    opacity: 1;
  }
}

@keyframes effect-preview-meteor {
  0% {
    transform: translate3d(-14px, -18px, 0) rotate(var(--preview-rotate));
    opacity: 0;
  }
  18% {
    opacity: 1;
  }
  62%,
  100% {
    transform: translate3d(26px, 34px, 0) rotate(var(--preview-rotate));
    opacity: 0;
  }
}

@keyframes effect-preview-bubble {
  0% {
    transform: translate3d(0, 12px, 0);
    opacity: 0.2;
  }
  40% {
    opacity: 1;
  }
  100% {
    transform: translate3d(5px, -18px, 0);
    opacity: 0;
  }
}

@keyframes effect-preview-ribbon {
  0%,
  100% {
    transform: translate3d(0, 0, 0) rotate(var(--preview-rotate)) scaleY(0.96);
    opacity: 0.5;
  }
  50% {
    transform: translate3d(8px, 4px, 0) rotate(calc(var(--preview-rotate) + 4deg)) scaleY(1.06);
    opacity: 0.85;
  }
}

/* ================================ 响应式 ================================ */

@media (max-width: 960px) {
  .fx-stage-layout,
  .music-layout {
    grid-template-columns: 1fr;
  }

  .ambient-console,
  .fx-console,
  .online-search-bar {
    grid-template-columns: 1fr;
  }

  .search-actions {
    justify-content: flex-start;
  }

  .console-side {
    justify-items: start;
  }

  .console-actions {
    justify-content: flex-start;
  }
}

@media (max-width: 680px) {
  .atmo-panel {
    width: calc(100vw - 12px);
    max-height: calc(100dvh - 12px);
    border-radius: 18px;
    padding: 12px 12px 0;
  }

  .atmo-header-side .status-chip {
    display: none;
  }

  .atmo-header-side .status-chip.timer {
    display: inline-flex;
  }

  .atmo-tabs {
    width: 100%;
  }

  .atmo-tab {
    flex: 1;
    justify-content: center;
    padding: 0 8px;
  }

  .scene-grid {
    grid-template-columns: 1fr;
  }

  .sound-grid,
  .online-grid {
    grid-template-columns: 1fr;
  }

  .fx-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .playlist-grid {
    grid-template-columns: 1fr;
  }

  .track-row {
    grid-template-columns: 28px 40px minmax(0, 1fr);
  }

  .track-duration,
  .row-action {
    justify-self: start;
  }

  .block-head,
  .group-head {
    display: grid;
  }

  .vinyl-disc {
    width: 168px;
    height: 168px;
  }
}
</style>
