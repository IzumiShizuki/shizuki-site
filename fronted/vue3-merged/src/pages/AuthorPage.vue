<template>
  <section class="route-page author-page motion-managed">
    <div class="dashboard-layout">
      <RouteDotRail
        class="sidebar-dot-rail"
        :items="tabs"
        :active-key="activeTab"
        distribution="mid-sixths"
        aria-label="作者页面导航"
        @select="openTab"
      />

      <SubtleScrollArea
        ref="contentPanelRef"
        tag="section"
        :contain-overscroll="false"
        class="content-panel liquid-material"
        :style="contentPanelStyle"
        @pointermove="handleContentPointerMove"
        @pointerleave="resetParallax"
        @scroll.passive="handleContentScroll"
      >
        <p v-if="loading" class="state-tip">正在同步作者主页资料...</p>
        <p v-else-if="loadError" class="error-text">{{ loadError }}</p>

        <template v-else>
          <p v-if="cacheNotice" class="state-tip">{{ cacheNotice }}</p>

          <div v-if="activeTab === 'overview'" class="content-block overview-motion-root overview-story-root">
            <section class="story-hero-stage author-card reveal-node" :style="staggerStyle(0)">
              <button
                v-if="canEditCurrentTab"
                class="inline-edit-fab ripple-trigger"
                type="button"
                title="编辑作者主页"
                @click="openSectionEditor(AuthorTabKey.OVERVIEW)"
              >
                <i class="fas fa-pen"></i>
              </button>
              <img class="story-hero-cover" :src="hero.coverImageUrl || hero.avatarUrl" :alt="`${hero.name} cover`" />
              <div class="story-hero-atmosphere" aria-hidden="true">
                <span class="story-orb story-orb-a"></span>
                <span class="story-orb story-orb-b"></span>
                <span class="story-orb story-orb-c"></span>
              </div>

              <div class="story-hero-main">
                <div class="story-hero-intro">
                  <div class="story-avatar-stack">
                    <span class="story-avatar-ring" aria-hidden="true"></span>
                    <img class="story-avatar" :src="hero.avatarUrl" :alt="hero.name" />
                    <span class="story-status-badge" :class="{ off: !authorProfile.enabled }">
                      {{ authorProfile.enabled ? '公开展示' : '已关闭' }}
                    </span>
                  </div>
                  <div class="story-hero-copy">
                    <p class="story-greeting reveal-line" :style="staggerStyle(1)">{{ hero.greeting }}</p>
                    <h2 class="reveal-line" :style="staggerStyle(2)">{{ hero.name }}</h2>
                    <p class="story-quote reveal-line" :style="staggerStyle(3)">{{ hero.quote }}</p>
                    <div class="chip-row reveal-line" :style="staggerStyle(4)">
                      <span v-for="label in identity.labels" :key="`identity-${label}`" class="chip">{{ label }}</span>
                    </div>
                  </div>
                </div>

                <div class="story-skill-ribbon reveal-line" :style="staggerStyle(5)">
                  <div class="skill-focus-frame" aria-label="学习内容展示栏">
                    <div class="skill-focus-list">
                      <article
                        v-for="(item, index) in skillNodes"
                        :key="`skill-focus-${item.label}-${index}`"
                        class="skill-focus-item"
                        :class="item.tone"
                      >
                        <span class="skill-node-icon" aria-hidden="true">
                          <i :class="item.icon"></i>
                        </span>
                        <span class="skill-node-label">{{ item.label }}</span>
                      </article>
                    </div>
                  </div>
                </div>
              </div>
            </section>

            <section class="story-free-layout">
              <article class="author-card story-identity-ribbon reveal-node" :style="staggerStyle(6)">
                <h3>身份坐标</h3>
                <div class="identity-track">
                  <div class="identity-unit">
                    <span class="identity-label">出生年份</span>
                    <strong>{{ identity.birthYear }}</strong>
                  </div>
                  <div class="identity-unit">
                    <span class="identity-label">学校</span>
                    <strong>{{ identity.school }}</strong>
                  </div>
                  <div class="identity-unit">
                    <span class="identity-label">专业</span>
                    <strong>{{ identity.major }}</strong>
                  </div>
                  <div class="identity-unit">
                    <span class="identity-label">当前角色</span>
                    <strong>{{ identity.role }}</strong>
                  </div>
                </div>
              </article>

              <article class="author-card story-notes reveal-node" :style="staggerStyle(7)">
                <h3>碎碎念频道</h3>
                <p v-for="(line, index) in about.intro" :key="`intro-${index}`" class="line-text">
                  {{ line }}
                </p>
              </article>

              <article class="author-card story-focus-panel reveal-node" :style="staggerStyle(8)">
                <h3>当前关注</h3>
                <p class="line-text"><strong>目标：</strong>{{ about.mission }}</p>
                <p class="mini-title">关注方向</p>
                <div class="chip-row focus-cloud">
                  <span v-for="focus in about.focus" :key="`focus-${focus}`" class="chip">{{ focus }}</span>
                </div>
                <p class="mini-title">音乐偏好</p>
                <div class="chip-row focus-cloud">
                  <span v-for="music in about.music" :key="`music-${music}`" class="chip">{{ music }}</span>
                </div>
              </article>
            </section>
          </div>

          <div v-else-if="activeTab === 'journey'" class="content-block journey-motion-root journey-story-root">
            <section class="journey-stage">
              <button
                v-if="canEditCurrentTab"
                class="inline-edit-fab ripple-trigger"
                type="button"
                title="编辑建站经历"
                @click="openSectionEditor(AuthorTabKey.JOURNEY)"
              >
                <i class="fas fa-pen"></i>
              </button>
              <aside class="journey-sticky-axis">
                <div class="journey-axis-head">
                  <span class="journey-axis-month">{{ activeJourneyItem?.monthLabel || '01月' }}</span>
                  <div class="journey-axis-date">
                    <span class="journey-axis-day">第 {{ activeJourneyItem?.dayLabel || '01' }} 日</span>
                    <span class="journey-axis-year">{{ activeJourneyItem?.yearLabel || 'Now' }}</span>
                  </div>
                </div>
                <div class="journey-axis-body">
                  <div class="journey-axis-rail-wrap" aria-hidden="true">
                    <span class="journey-axis-line"></span>
                    <span class="journey-axis-progress"></span>
                  </div>
                  <div class="journey-axis-month-list">
                    <span
                      v-for="tick in journeyMonthTicks"
                      :key="`journey-axis-${tick.monthNumber}`"
                      class="journey-axis-month-tick"
                      :class="{ 'is-active': tick.isActive, 'is-passed': tick.isPassed }"
                    >
                      {{ tick.label }}
                    </span>
                  </div>
                </div>
              </aside>

              <div ref="journeyTimelineRef" class="journey-storyline">
                <article
                  v-for="(item, index) in journeyTimelineItems"
                  :key="`journey-${index}-${item.title}`"
                  class="timeline-item journey-scene author-card reveal-node"
                  :class="{ 'is-active': motionState.activeJourneyIndex === index }"
                  :data-journey-index="index"
                  :style="staggerStyle(index)"
                >
                  <span class="timeline-node journey-scene-node" aria-hidden="true"></span>
                  <div class="journey-scene-marker">
                    <p class="journey-scene-month">{{ item.monthLabel }}</p>
                    <p class="journey-scene-day">{{ item.dayLabel }}日</p>
                    <p class="journey-scene-year">{{ item.yearLabel }}</p>
                  </div>
                  <div class="journey-scene-media">
                    <img v-if="item.imageUrl" class="journey-scene-image" :src="item.imageUrl" :alt="`${item.title} cover`" />
                  </div>
                  <div class="journey-scene-copy">
                    <p class="journey-scene-period">{{ item.dateLabel }}</p>
                    <h3>{{ item.title }}</h3>
                    <p class="line-text">{{ item.description }}</p>
                    <div class="chip-row">
                      <span v-for="stack in item.stack" :key="`stack-${item.year}-${stack}`" class="chip journey-chip">{{ stack }}</span>
                    </div>
                  </div>
                </article>
              </div>
            </section>
          </div>

          <div v-else-if="activeTab === 'posts'" class="content-block">
            <article class="author-card">
              <h2>作者文章</h2>
              <p class="line-text">作者文章列表继续复用博客模块接口，本页先提供统一入口。</p>
              <div class="inline-actions compact">
                <button class="mini-btn ripple-trigger" type="button" @click="openBlogList">前往博客列表</button>
              </div>
            </article>
          </div>

          <div v-else-if="activeTab === 'about'" class="content-block about-motion-root about-story-root">
            <article class="author-card about-manifesto reveal-node" :style="staggerStyle(0)">
              <button
                v-if="canEditCurrentTab"
                class="inline-edit-fab ripple-trigger"
                type="button"
                title="编辑关于本站"
                @click="openSectionEditor(AuthorTabKey.ABOUT)"
              >
                <i class="fas fa-pen"></i>
              </button>
              <img v-if="about.introImageUrl" class="about-hero-image" :src="about.introImageUrl" alt="about intro image" />
              <div class="about-manifesto-copy">
                <h2>关于本站</h2>
                <p
                  v-for="(line, index) in about.intro"
                  :key="`about-intro-${index}`"
                  class="line-text reveal-line"
                  :style="staggerStyle(index + 1)"
                >
                  {{ line }}
                </p>
              </div>
            </article>

            <section class="about-flow-grid">
              <article class="author-card about-goal-stage reveal-node" :style="staggerStyle(3)">
                <span class="about-goal-sweep" aria-hidden="true"></span>
                <img v-if="about.missionImageUrl" class="about-section-image" :src="about.missionImageUrl" alt="about mission image" />
                <h3>长期目标</h3>
                <p class="line-text">{{ about.mission }}</p>
              </article>

              <article class="author-card about-preference-stage reveal-node" :style="staggerStyle(4)">
                <h3>偏好与灵感</h3>
                <p class="mini-title">关注方向</p>
                <div class="chip-row pulse-cloud">
                  <span v-for="focus in about.focus" :key="`about-focus-${focus}`" class="chip">{{ focus }}</span>
                </div>
                <p class="mini-title">音乐偏好</p>
                <div class="chip-row pulse-cloud">
                  <span v-for="music in about.music" :key="`about-music-${music}`" class="chip">{{ music }}</span>
                </div>
              </article>

              <article class="author-card about-links-stage reveal-node" :style="staggerStyle(5)">
                <img v-if="about.linksImageUrl" class="about-section-image" :src="about.linksImageUrl" alt="about links image" />
                <h3>站点外链</h3>
                <div class="link-list">
                  <button
                    v-for="item in about.links"
                    :key="`link-${item.label}-${item.url}`"
                    type="button"
                    class="link-btn ripple-trigger shine-link"
                    @pointermove="handleMagneticPointerMove"
                    @pointerleave="resetMagneticPointer"
                    @click="openLink(item.url)"
                  >
                    {{ item.label }}
                  </button>
                </div>
              </article>
            </section>
          </div>
        </template>

        <input
          ref="sectionImageUploadInputRef"
          class="hidden-file-input"
          type="file"
          accept="image/png,image/jpeg,image/webp,image/gif"
          :disabled="editState.loading || editState.uploadingAvatar"
          @change="handleSectionImageFileChange"
        />
        <ImageCropDialog
          :visible="sectionImageCropVisible"
          :source-url="sectionImageCropSourceUrl"
          :source-name="sectionImageCropSourceName"
          :title="sectionImageCropTitle"
          :description="sectionImageCropDescription"
          :aspect-ratio="sectionImageCropAspectRatio"
          :max-output-width="sectionImageCropMaxOutputWidth"
          :max-output-height="sectionImageCropMaxOutputHeight"
          :output-mime-type="sectionImageOutputMimeType"
          :output-quality="sectionImageOutputQuality"
          :submitting="editState.uploadingAvatar"
          @close="closeSectionImageCropDialog"
          @confirm="handleSectionImageCropConfirm"
        />

        <transition name="editor-fade">
          <div v-if="sectionEditorOpen && isAdminUser" class="section-editor-mask" @click.self="closeSectionEditor">
            <section class="section-editor liquid-material">
              <header class="section-editor-header">
                <h2>{{ sectionEditorTitle }}</h2>
                <button class="icon-close-btn ripple-trigger" type="button" :disabled="editState.loading" @click="closeSectionEditor">
                  <i class="fas fa-xmark"></i>
                </button>
              </header>

              <p class="line-text">这里支持修改文字、标签和图片，保存后即时刷新当前页面。</p>

              <div v-if="sectionEditorSection === AuthorTabKey.OVERVIEW" class="editor-layout">
                <section class="form-section">
                  <h3>基础设置</h3>
                  <label class="editor-switch">
                    <input v-model="editForm.enabled" type="checkbox" :disabled="editState.loading" />
                    <span>启用作者主页公开展示</span>
                  </label>
                </section>

                <section class="form-section">
                  <h3>主视觉</h3>
                  <div class="field-grid two-col">
                    <label class="field-block">
                      <span>问候语</span>
                      <input v-model.trim="editForm.hero.greeting" type="text" :disabled="editState.loading" />
                    </label>
                    <label class="field-block">
                      <span>名字</span>
                      <input v-model.trim="editForm.hero.name" type="text" :disabled="editState.loading" />
                    </label>
                  </div>
                  <label class="field-block">
                    <span>签名</span>
                    <textarea v-model.trim="editForm.hero.quote" rows="2" :disabled="editState.loading"></textarea>
                  </label>
                  <label class="field-block">
                    <span>头像 URL</span>
                    <input v-model.trim="editForm.hero.avatarUrl" type="text" :disabled="editState.loading || editState.uploadingAvatar" />
                  </label>
                  <div class="inline-actions compact">
                    <button
                      class="mini-btn ripple-trigger"
                      type="button"
                      :disabled="editState.loading || editState.uploadingAvatar"
                      @click="triggerSectionImageUpload('hero.avatarUrl')"
                    >
                      {{ editState.uploadingAvatar ? '上传中...' : '上传头像并回填' }}
                    </button>
                  </div>
                  <img class="avatar-preview" :src="editForm.hero.avatarUrl || hero.avatarUrl" alt="avatar preview" />
                  <label class="field-block">
                    <span>主视觉背景图 URL</span>
                    <input v-model.trim="editForm.hero.coverImageUrl" type="text" :disabled="editState.loading || editState.uploadingAvatar" />
                  </label>
                  <div class="inline-actions compact">
                    <button
                      class="mini-btn ripple-trigger"
                      type="button"
                      :disabled="editState.loading || editState.uploadingAvatar"
                      @click="triggerSectionImageUpload('hero.coverImageUrl')"
                    >
                      {{ editState.uploadingAvatar ? '上传中...' : '上传背景图并回填' }}
                    </button>
                  </div>
                  <img class="section-image-preview" :src="editForm.hero.coverImageUrl || editForm.hero.avatarUrl || hero.avatarUrl" alt="hero cover preview" />
                </section>

                <section class="form-section">
                  <h3>身份信息</h3>
                  <div class="field-grid two-col">
                    <label class="field-block">
                      <span>出生年份</span>
                      <input v-model.trim="editForm.identity.birthYear" type="text" :disabled="editState.loading" />
                    </label>
                    <label class="field-block">
                      <span>学校</span>
                      <input v-model.trim="editForm.identity.school" type="text" :disabled="editState.loading" />
                    </label>
                    <label class="field-block">
                      <span>专业</span>
                      <input v-model.trim="editForm.identity.major" type="text" :disabled="editState.loading" />
                    </label>
                    <label class="field-block">
                      <span>当前角色</span>
                      <input v-model.trim="editForm.identity.role" type="text" :disabled="editState.loading" />
                    </label>
                  </div>
                  <div class="field-block">
                    <span>身份标签（回车添加）</span>
                    <div class="tag-editor">
                      <div class="chip-row">
                        <button
                          v-for="(item, index) in editForm.identity.labels"
                          :key="`identity-label-${item}-${index}`"
                          type="button"
                          class="chip removable-chip ripple-trigger"
                          :disabled="editState.loading"
                          @click="removeTag(editForm.identity.labels, index)"
                        >
                          {{ item }} ×
                        </button>
                      </div>
                      <input
                        v-model="tagInputs.identityLabels"
                        type="text"
                        :disabled="editState.loading"
                        placeholder="输入标签，回车添加"
                        @keydown.enter.prevent="commitTagInput('identityLabels', editForm.identity.labels)"
                      />
                    </div>
                  </div>
                </section>

                <section class="form-section">
                  <h3>技能</h3>
                  <div class="field-block">
                    <span>技能（回车添加）</span>
                    <div class="tag-editor">
                      <div class="chip-row">
                        <button
                          v-for="(item, index) in editForm.skills"
                          :key="`skill-${item}-${index}`"
                          type="button"
                          class="chip removable-chip ripple-trigger"
                          :disabled="editState.loading"
                          @click="removeTag(editForm.skills, index)"
                        >
                          {{ item }} ×
                        </button>
                      </div>
                      <input
                        v-model="tagInputs.skills"
                        type="text"
                        :disabled="editState.loading"
                        placeholder="输入技能，回车添加"
                        @keydown.enter.prevent="commitTagInput('skills', editForm.skills)"
                      />
                    </div>
                  </div>
                </section>
              </div>

              <div v-else-if="sectionEditorSection === AuthorTabKey.JOURNEY" class="editor-layout">
                <section class="form-section">
                  <h3>建站经历</h3>
                  <article v-for="(item, index) in editForm.journey" :key="`journey-row-${index}`" class="nested-card">
                    <div class="field-grid two-col">
                      <label class="field-block">
                        <span>时间（支持 YYYY-MM-DD）</span>
                        <input v-model.trim="item.year" type="text" :disabled="editState.loading" placeholder="例如 2026-03-12" />
                      </label>
                      <label class="field-block">
                        <span>标题</span>
                        <input v-model.trim="item.title" type="text" :disabled="editState.loading" />
                      </label>
                    </div>
                    <label class="field-block">
                      <span>描述</span>
                      <textarea v-model.trim="item.description" rows="3" :disabled="editState.loading"></textarea>
                    </label>
                    <label class="field-block">
                      <span>卡片图片 URL</span>
                      <input v-model.trim="item.imageUrl" type="text" :disabled="editState.loading || editState.uploadingAvatar" />
                    </label>
                    <div class="inline-actions compact">
                      <button
                        class="mini-btn ripple-trigger"
                        type="button"
                        :disabled="editState.loading || editState.uploadingAvatar"
                        @click="triggerSectionImageUpload(`journey.${index}.imageUrl`)"
                      >
                        {{ editState.uploadingAvatar ? '上传中...' : '上传图片并回填' }}
                      </button>
                    </div>
                    <img v-if="item.imageUrl" class="section-image-preview" :src="item.imageUrl" :alt="`${item.title || 'journey'} preview`" />
                    <div class="field-block">
                      <span>技术栈（回车添加）</span>
                      <div class="tag-editor">
                        <div class="chip-row">
                          <button
                            v-for="(stackItem, stackIndex) in item.stack"
                            :key="`journey-stack-${index}-${stackItem}-${stackIndex}`"
                            type="button"
                            class="chip removable-chip ripple-trigger"
                            :disabled="editState.loading"
                            @click="removeTag(item.stack, stackIndex)"
                          >
                            {{ stackItem }} ×
                          </button>
                        </div>
                        <input
                          v-model="item.stackInput"
                          type="text"
                          :disabled="editState.loading"
                          placeholder="输入技术栈，回车添加"
                          @keydown.enter.prevent="commitJourneyStackInput(item)"
                        />
                      </div>
                    </div>
                    <div class="inline-actions compact">
                      <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading || index === 0" @click="moveJourneyRow(index, -1)">
                        上移
                      </button>
                      <button
                        class="mini-btn ripple-trigger"
                        type="button"
                        :disabled="editState.loading || index === editForm.journey.length - 1"
                        @click="moveJourneyRow(index, 1)"
                      >
                        下移
                      </button>
                      <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading" @click="removeJourneyRow(index)">删除</button>
                    </div>
                  </article>
                  <div class="inline-actions compact">
                    <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading" @click="addJourneyRow">新增经历</button>
                  </div>
                </section>
              </div>

              <div v-else class="editor-layout">
                <section class="form-section">
                  <h3>关于本站内容</h3>
                  <div class="field-grid two-col">
                    <label class="field-block">
                      <span>简介卡片图片 URL</span>
                      <input v-model.trim="editForm.about.introImageUrl" type="text" :disabled="editState.loading || editState.uploadingAvatar" />
                    </label>
                    <label class="field-block">
                      <span>目标卡片图片 URL</span>
                      <input v-model.trim="editForm.about.missionImageUrl" type="text" :disabled="editState.loading || editState.uploadingAvatar" />
                    </label>
                    <label class="field-block">
                      <span>外链卡片图片 URL</span>
                      <input v-model.trim="editForm.about.linksImageUrl" type="text" :disabled="editState.loading || editState.uploadingAvatar" />
                    </label>
                  </div>
                  <div class="inline-actions compact">
                    <button
                      class="mini-btn ripple-trigger"
                      type="button"
                      :disabled="editState.loading || editState.uploadingAvatar"
                      @click="triggerSectionImageUpload('about.introImageUrl')"
                    >
                      {{ editState.uploadingAvatar ? '上传中...' : '上传简介图' }}
                    </button>
                    <button
                      class="mini-btn ripple-trigger"
                      type="button"
                      :disabled="editState.loading || editState.uploadingAvatar"
                      @click="triggerSectionImageUpload('about.missionImageUrl')"
                    >
                      {{ editState.uploadingAvatar ? '上传中...' : '上传目标图' }}
                    </button>
                    <button
                      class="mini-btn ripple-trigger"
                      type="button"
                      :disabled="editState.loading || editState.uploadingAvatar"
                      @click="triggerSectionImageUpload('about.linksImageUrl')"
                    >
                      {{ editState.uploadingAvatar ? '上传中...' : '上传外链图' }}
                    </button>
                  </div>
                  <div class="editor-preview-grid">
                    <img v-if="editForm.about.introImageUrl" class="section-image-preview" :src="editForm.about.introImageUrl" alt="about intro preview" />
                    <img v-if="editForm.about.missionImageUrl" class="section-image-preview" :src="editForm.about.missionImageUrl" alt="about mission preview" />
                    <img v-if="editForm.about.linksImageUrl" class="section-image-preview" :src="editForm.about.linksImageUrl" alt="about links preview" />
                  </div>
                  <div class="field-block">
                    <span>碎碎念（每行一条）</span>
                    <textarea v-model="editForm.about.introText" rows="4" :disabled="editState.loading"></textarea>
                  </div>
                  <label class="field-block">
                    <span>目标</span>
                    <textarea v-model.trim="editForm.about.mission" rows="2" :disabled="editState.loading"></textarea>
                  </label>
                  <div class="field-grid two-col">
                    <div class="field-block">
                      <span>关注方向（回车添加）</span>
                      <div class="tag-editor">
                        <div class="chip-row">
                          <button
                            v-for="(item, index) in editForm.about.focus"
                            :key="`focus-${item}-${index}`"
                            type="button"
                            class="chip removable-chip ripple-trigger"
                            :disabled="editState.loading"
                            @click="removeTag(editForm.about.focus, index)"
                          >
                            {{ item }} ×
                          </button>
                        </div>
                        <input
                          v-model="tagInputs.aboutFocus"
                          type="text"
                          :disabled="editState.loading"
                          placeholder="输入关注方向，回车添加"
                          @keydown.enter.prevent="commitTagInput('aboutFocus', editForm.about.focus)"
                        />
                      </div>
                    </div>
                    <div class="field-block">
                      <span>音乐偏好（回车添加）</span>
                      <div class="tag-editor">
                        <div class="chip-row">
                          <button
                            v-for="(item, index) in editForm.about.music"
                            :key="`music-${item}-${index}`"
                            type="button"
                            class="chip removable-chip ripple-trigger"
                            :disabled="editState.loading"
                            @click="removeTag(editForm.about.music, index)"
                          >
                            {{ item }} ×
                          </button>
                        </div>
                        <input
                          v-model="tagInputs.aboutMusic"
                          type="text"
                          :disabled="editState.loading"
                          placeholder="输入音乐偏好，回车添加"
                          @keydown.enter.prevent="commitTagInput('aboutMusic', editForm.about.music)"
                        />
                      </div>
                    </div>
                  </div>
                </section>

                <section class="form-section">
                  <h3>外链</h3>
                  <article v-for="(item, index) in editForm.about.links" :key="`link-row-${index}`" class="nested-card">
                    <div class="field-grid two-col">
                      <label class="field-block">
                        <span>名称</span>
                        <input v-model.trim="item.label" type="text" :disabled="editState.loading" />
                      </label>
                      <label class="field-block">
                        <span>URL</span>
                        <input v-model.trim="item.url" type="text" :disabled="editState.loading" />
                      </label>
                    </div>
                    <div class="inline-actions compact">
                      <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading || index === 0" @click="moveLinkRow(index, -1)">
                        上移
                      </button>
                      <button
                        class="mini-btn ripple-trigger"
                        type="button"
                        :disabled="editState.loading || index === editForm.about.links.length - 1"
                        @click="moveLinkRow(index, 1)"
                      >
                        下移
                      </button>
                      <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading" @click="removeLinkRow(index)">删除</button>
                    </div>
                  </article>
                  <div class="inline-actions compact">
                    <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading" @click="addLinkRow">新增外链</button>
                  </div>
                </section>
              </div>

              <footer class="section-editor-footer">
                <div class="inline-actions compact">
                  <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading" @click="refreshSectionEditor">
                    {{ editState.loading ? '同步中...' : '刷新后台值' }}
                  </button>
                  <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading" @click="resetEditProfile">
                    重置
                  </button>
                  <button class="mini-btn ripple-trigger primary" type="button" :disabled="editState.loading" @click="saveAdminProfile">
                    {{ editState.loading ? '保存中...' : '保存资料' }}
                  </button>
                </div>
                <p v-if="editState.dirty" class="state-tip">你有未保存的修改。</p>
                <p v-if="editState.error" class="error-text">{{ editState.error }}</p>
                <p v-if="editState.success" class="state-tip">{{ editState.success }}</p>
              </footer>
            </section>
          </div>
        </transition>
      </SubtleScrollArea>
    </div>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';
import SubtleScrollArea from '../components/SubtleScrollArea.vue';
import ImageCropDialog from '../components/common/ImageCropDialog.vue';
import RouteDotRail from '../components/common/RouteDotRail.vue';
import { getAdminAuthorProfile, getAuthorProfile, updateAdminAuthorProfile, uploadAuthorAvatar } from '../services/authorApi';
import {
  AuthorTabKey,
  createDefaultAuthorProfilePayload,
  normalizeAuthorProfilePayload,
  normalizeAuthorTabKey
} from './authorUiState';
import {
  appendUniqueTags,
  buildEditFormFromProfile,
  buildProfileJsonFromEditForm,
  createDefaultAuthorEditForm,
  createEmptyJourneyRow,
  createEmptyLinkRow
} from './authorEditFormState';
import { createAuthorMotionState, mapPointerToParallax, setupRevealObserver } from './authorMotionState';
import { readAuthorProfileCache, writeAuthorProfileCache } from './authorProfileCache';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();

const baseTabs = [
  { key: AuthorTabKey.OVERVIEW, label: '作者主页', icon: 'fas fa-user-astronaut' },
  { key: AuthorTabKey.JOURNEY, label: '建站经历', icon: 'fas fa-route' },
  { key: AuthorTabKey.POSTS, label: '作者文章', icon: 'fas fa-feather-pointed' },
  { key: AuthorTabKey.ABOUT, label: '关于本站', icon: 'fas fa-compass-drafting' }
];

const SKILL_ICON_RULES = [
  { pattern: /(c\+\+|cpp|c\/c\+\+|clang|gcc)/i, icon: 'fas fa-code', tone: 'tone-cyan' },
  { pattern: /(unreal|ue5|ue4)/i, icon: 'fas fa-gamepad', tone: 'tone-blue' },
  { pattern: /(unity|c#)/i, icon: 'fas fa-cubes', tone: 'tone-violet' },
  { pattern: /(python)/i, icon: 'fab fa-python', tone: 'tone-gold' },
  { pattern: /(java|spring)/i, icon: 'fab fa-java', tone: 'tone-rose' },
  { pattern: /(css|scss|sass|tailwind)/i, icon: 'fab fa-css3-alt', tone: 'tone-blue' },
  { pattern: /(javascript|typescript|js|ts)/i, icon: 'fab fa-js', tone: 'tone-gold' },
  { pattern: /(html)/i, icon: 'fab fa-html5', tone: 'tone-rose' },
  { pattern: /(git|github|gitlab)/i, icon: 'fab fa-git-alt', tone: 'tone-cyan' },
  { pattern: /(vue|react|frontend|web)/i, icon: 'fab fa-vuejs', tone: 'tone-mint' },
  { pattern: /(mysql|postgres|database|sql)/i, icon: 'fas fa-database', tone: 'tone-blue' },
  { pattern: /(redis|cache)/i, icon: 'fas fa-memory', tone: 'tone-rose' },
  { pattern: /(openai|ai|llm|ml|deep)/i, icon: 'fas fa-brain', tone: 'tone-violet' },
  { pattern: /(open ?gl|vulkan|shader|render)/i, icon: 'fas fa-cube', tone: 'tone-cyan' },
  { pattern: /(blender|3d|model)/i, icon: 'fas fa-shapes', tone: 'tone-mint' }
];

const SKILL_FALLBACK_ICONS = ['fas fa-code', 'fas fa-cubes', 'fas fa-bolt', 'fas fa-layer-group', 'fas fa-compass-drafting', 'fas fa-brain'];
const SKILL_FALLBACK_TONES = ['tone-cyan', 'tone-blue', 'tone-violet', 'tone-gold', 'tone-rose', 'tone-mint'];
const JOURNEY_MONTH_LABELS = Object.freeze(Array.from({ length: 12 }, (_, index) => `${String(index + 1).padStart(2, '0')}月`));
const AUTHOR_IMAGE_MAX_BYTES = 50 * 1024 * 1024;

const loading = ref(false);
const loadError = ref('');
const cacheNotice = ref('');
const authorProfile = ref(createDefaultAuthorProfilePayload());
const editForm = ref(createDefaultAuthorEditForm());
const sectionImageUploadInputRef = ref(null);
const contentPanelRef = ref(null);
const journeyTimelineRef = ref(null);
const sectionEditorOpen = ref(false);
const sectionEditorSection = ref(AuthorTabKey.OVERVIEW);
const pendingSectionImagePath = ref('');
const sectionImageCropVisible = ref(false);
const sectionImageCropSourceUrl = ref('');
const sectionImageCropSourceName = ref('section-image.png');
const sectionImageCropTargetPath = ref('');
const motionState = reactive(createAuthorMotionState({ reducedMotion: readReducedMotionPreference() }));

const editState = reactive({
  loading: false,
  error: '',
  success: '',
  uploadingAvatar: false,
  dirty: false
});

const tagInputs = reactive({
  identityLabels: '',
  skills: '',
  aboutFocus: '',
  aboutMusic: ''
});

let suppressDirtyTracking = false;
let revealController = null;
let journeyObserver = null;
let motionMediaCleanup = null;
const journeyRatioMap = new Map();

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').toUpperCase() === 'ADMIN');
});

const tabs = computed(() => {
  return [...baseTabs];
});

const activeTab = computed(() => {
  const raw = typeof route.query.tab === 'string' ? route.query.tab : '';
  return normalizeTab(raw);
});

const hero = computed(() => authorProfile.value.profileJson.hero);
const identity = computed(() => authorProfile.value.profileJson.identity);
const skills = computed(() => authorProfile.value.profileJson.skills);
const journey = computed(() => authorProfile.value.profileJson.journey);
const about = computed(() => authorProfile.value.profileJson.about);
const skillNodes = computed(() => {
  const rawList = Array.isArray(skills.value) ? skills.value : [];
  const deduped = [];
  const seen = new Set();

  rawList.forEach((item) => {
    const label = String(item || '').trim();
    if (!label) return;
    const key = label.toLowerCase();
    if (seen.has(key)) return;
    seen.add(key);
    deduped.push(label);
  });

  const source = deduped.length ? deduped : ['Java', 'Vue3', 'Spring Boot', 'MySQL', 'Redis', 'OpenAI'];
  return source.slice(0, 14).map((label, index) => resolveSkillNode(label, index));
});
const journeyTimelineItems = computed(() => {
  const source = Array.isArray(journey.value) ? journey.value : [];
  return source.map((item, index) => ({
    ...item,
    ...resolveJourneyPeriod(item?.year, index, source.length)
  }));
});
const activeJourneyItem = computed(() => {
  const source = journeyTimelineItems.value;
  if (!source.length) return null;
  const safeIndex = clampNumber(motionState.activeJourneyIndex, 0, source.length - 1);
  return source[safeIndex] || source[0];
});
const journeyMonthTicks = computed(() => {
  const activeMonth = activeJourneyItem.value?.monthNumber || 1;
  return JOURNEY_MONTH_LABELS.map((label, index) => ({
    label,
    monthNumber: index + 1,
    isActive: index + 1 === activeMonth,
    isPassed: index + 1 < activeMonth
  }));
});

const sectionImageCropAspectRatio = computed(() => {
  const targetPath = sectionImageCropTargetPath.value;
  if (targetPath === 'hero.avatarUrl') return 1;
  if (targetPath === 'hero.coverImageUrl') return 16 / 9;
  return 0;
});
const sectionImageCropMaxOutputWidth = computed(() => {
  const targetPath = sectionImageCropTargetPath.value;
  if (targetPath === 'hero.avatarUrl') return 1024;
  if (targetPath === 'hero.coverImageUrl') return 1920;
  return 1600;
});
const sectionImageCropMaxOutputHeight = computed(() => {
  const targetPath = sectionImageCropTargetPath.value;
  if (targetPath === 'hero.avatarUrl') return 1024;
  if (targetPath === 'hero.coverImageUrl') return 1080;
  return 1600;
});
const sectionImageOutputMimeType = computed(() => 'image/webp');
const sectionImageOutputQuality = computed(() => {
  if (sectionImageCropTargetPath.value === 'hero.avatarUrl') return 0.9;
  return 0.88;
});

const sectionImageCropTitle = computed(() => {
  return sectionImageCropTargetPath.value === 'hero.avatarUrl' ? '裁剪头像' : '裁剪图片';
});

const sectionImageCropDescription = computed(() => {
  if (sectionImageCropTargetPath.value === 'hero.coverImageUrl') {
    return '建议选择横向区域，确认后会自动上传并回填封面 URL。';
  }
  if (sectionImageCropTargetPath.value === 'hero.avatarUrl') {
    return '拖动和缩放头像范围，确认后会自动上传并回填头像 URL。';
  }
  return '拖动和缩放图片，选择要保留的范围后上传并回填。';
});

const contentPanelStyle = computed(() => {
  return {
    '--parallax-x': `${motionState.pointer.x.toFixed(2)}px`,
    '--parallax-y': `${motionState.pointer.y.toFixed(2)}px`,
    '--journey-progress': `${Math.round(Math.max(0, Math.min(1, motionState.journeyProgress || 0)) * 100)}%`
  };
});

const canEditCurrentTab = computed(() => {
  if (!isAdminUser.value) return false;
  return activeTab.value === AuthorTabKey.OVERVIEW || activeTab.value === AuthorTabKey.JOURNEY || activeTab.value === AuthorTabKey.ABOUT;
});

const sectionEditorTitle = computed(() => {
  if (sectionEditorSection.value === AuthorTabKey.JOURNEY) return '编辑建站经历';
  if (sectionEditorSection.value === AuthorTabKey.ABOUT) return '编辑关于本站';
  return '编辑作者主页';
});

function normalizeTab(raw) {
  const normalized = normalizeAuthorTabKey(String(raw || '').trim().toLowerCase());
  if (normalized === AuthorTabKey.EDIT) {
    return AuthorTabKey.OVERVIEW;
  }
  return normalized;
}

function openTab(tabKey) {
  const normalized = normalizeTab(tabKey);
  if (activeTab.value === normalized) return;
  router.replace({ path: '/author', query: { tab: normalized } });
}

function createSafeSectionKey(sectionKey) {
  if (sectionKey === AuthorTabKey.JOURNEY) return AuthorTabKey.JOURNEY;
  if (sectionKey === AuthorTabKey.ABOUT) return AuthorTabKey.ABOUT;
  return AuthorTabKey.OVERVIEW;
}

async function refreshSectionEditor() {
  if (!isAdminUser.value) return;
  editState.loading = true;
  editState.error = '';
  editState.success = '';
  try {
    const payload = await getAdminAuthorProfile(auth.authorizedFetch);
    authorProfile.value = normalizeAuthorProfilePayload(payload);
    applyEditFormFromProfile(authorProfile.value);
    writeAuthorProfileCache(authorProfile.value);
    refreshActiveTabMotion();
  } catch (error) {
    editState.error = readErrorMessage(error, '读取管理员作者资料失败');
  } finally {
    editState.loading = false;
  }
}

async function openSectionEditor(sectionKey) {
  if (!isAdminUser.value) return;
  sectionEditorSection.value = createSafeSectionKey(sectionKey);
  sectionEditorOpen.value = true;
  await refreshSectionEditor();
}

function closeSectionEditor() {
  sectionEditorOpen.value = false;
  closeSectionImageCropDialog();
  pendingSectionImagePath.value = '';
  editState.error = '';
  editState.success = '';
}

function updateFormFieldByPath(path, value) {
  const source = String(path || '').trim();
  if (!source) return false;
  const segments = source.split('.');
  let cursor = editForm.value;

  for (let index = 0; index < segments.length - 1; index += 1) {
    const segment = segments[index];
    if (Array.isArray(cursor)) {
      const rowIndex = Number(segment);
      if (!Number.isInteger(rowIndex) || rowIndex < 0 || rowIndex >= cursor.length) return false;
      cursor = cursor[rowIndex];
      continue;
    }
    if (!cursor || typeof cursor !== 'object') return false;
    cursor = cursor[segment];
  }

  const leaf = segments[segments.length - 1];
  if (!cursor || typeof cursor !== 'object') return false;
  cursor[leaf] = value;
  return true;
}

function triggerSectionImageUpload(path) {
  if (editState.loading || editState.uploadingAvatar) return;
  const normalizedPath = String(path || '').trim();
  if (!normalizedPath) return;
  pendingSectionImagePath.value = normalizedPath;
  sectionImageUploadInputRef.value?.click();
}

async function handleSectionImageFileChange(event) {
  const inputEl = event?.target;
  const file = inputEl?.files?.[0];
  const targetPath = pendingSectionImagePath.value;
  if (!file || !targetPath) {
    if (inputEl && typeof inputEl.value === 'string') inputEl.value = '';
    return;
  }
  if (inputEl && typeof inputEl.value === 'string') {
    inputEl.value = '';
  }

  const allowedTypes = new Set(['image/png', 'image/jpeg', 'image/webp', 'image/gif']);
  const contentType = String(file.type || '').toLowerCase();
  if (!allowedTypes.has(contentType)) {
    editState.error = '图片文件仅支持 png/jpeg/webp/gif';
    return;
  }
  if (Number(file.size || 0) > AUTHOR_IMAGE_MAX_BYTES) {
    editState.error = '原始图片不能超过 50MB';
    return;
  }

  resetSectionImageCropSource();
  sectionImageCropSourceUrl.value = URL.createObjectURL(file);
  sectionImageCropSourceName.value = String(file.name || 'section-image.png');
  sectionImageCropTargetPath.value = targetPath;
  sectionImageCropVisible.value = true;
}

function resetSectionImageCropSource() {
  if (sectionImageCropSourceUrl.value && sectionImageCropSourceUrl.value.startsWith('blob:')) {
    URL.revokeObjectURL(sectionImageCropSourceUrl.value);
  }
  sectionImageCropSourceUrl.value = '';
  sectionImageCropSourceName.value = 'section-image.png';
}

function closeSectionImageCropDialog() {
  sectionImageCropVisible.value = false;
  sectionImageCropTargetPath.value = '';
  pendingSectionImagePath.value = '';
  resetSectionImageCropSource();
}

async function handleSectionImageCropConfirm(payload) {
  const targetPath = sectionImageCropTargetPath.value || pendingSectionImagePath.value;
  const blob = payload?.blob;
  const mimeType = String(payload?.mimeType || blob?.type || 'image/webp').trim().toLowerCase() || 'image/webp';
  if (!blob || !targetPath) {
    closeSectionImageCropDialog();
    return;
  }

  const file = new File([blob], buildSectionImageFileName(sectionImageCropSourceName.value, targetPath, mimeType), {
    type: mimeType
  });
  if (Number(file.size || 0) > AUTHOR_IMAGE_MAX_BYTES) {
    editState.error = '裁剪后图片超过 50MB，请缩小截取范围后重试';
    return;
  }

  editState.uploadingAvatar = true;
  editState.error = '';
  editState.success = '';
  try {
    const uploadPayload = await uploadAuthorAvatar(file, auth.authorizedFetch);
    const url = String(uploadPayload?.url || '').trim();
    if (!url) {
      throw new Error('图片 URL 为空');
    }
    const applied = updateFormFieldByPath(targetPath, url);
    if (!applied) {
      throw new Error('图片字段写入失败');
    }
    editState.success = '图片裁剪上传成功，已自动回填 URL';
    closeSectionImageCropDialog();
  } catch (error) {
    const message = readErrorMessage(error, '图片上传失败');
    editState.error =
      Number(error?.status || 0) === 413 || message.includes('413')
        ? '图片过大，超过上传限制。已改为压缩上传，但这张图仍然过大，请缩小分辨率后重试'
        : message;
  } finally {
    editState.uploadingAvatar = false;
  }
}

function buildSectionImageFileName(sourceName, targetPath, mimeType = '') {
  const rawSource = String(sourceName || '').trim() || 'section-image';
  const sourceBase = rawSource.replace(/\.[^.]+$/u, '');
  const pathLeaf = String(targetPath || '')
    .split('.')
    .pop()
    .toLowerCase();
  const rawBase = pathLeaf || sourceBase;
  const safeBase = rawBase.replace(/[^a-z0-9_-]+/giu, '-').replace(/^-+|-+$/g, '');
  const extension = resolveSectionImageExtension(mimeType, rawSource);
  return `${safeBase || 'section-image'}-${Date.now()}${extension}`;
}

function resolveSectionImageExtension(mimeType, sourceName = '') {
  const normalizedMimeType = String(mimeType || '').trim().toLowerCase();
  if (normalizedMimeType === 'image/webp') return '.webp';
  if (normalizedMimeType === 'image/jpeg') return '.jpg';
  if (normalizedMimeType === 'image/png') return '.png';
  const originalExt = String(sourceName || '').trim().match(/(\.[^.]+)$/u)?.[1]?.toLowerCase();
  if (['.webp', '.jpg', '.jpeg', '.png', '.gif'].includes(originalExt)) {
    return originalExt === '.jpeg' ? '.jpg' : originalExt;
  }
  return '.webp';
}

function readReducedMotionPreference() {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') return false;
  return window.matchMedia('(prefers-reduced-motion: reduce)').matches;
}

function isDisplayTab(tabKey = activeTab.value) {
  return tabKey === AuthorTabKey.OVERVIEW || tabKey === AuthorTabKey.JOURNEY || tabKey === AuthorTabKey.ABOUT;
}

function isDesktopPointerEnabled() {
  if (!motionState.motionEnabled) return false;
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') return false;
  return window.matchMedia('(min-width: 901px)').matches;
}

function clampNumber(value, min, max) {
  return Math.min(max, Math.max(min, value));
}

function staggerStyle(index) {
  return {
    '--reveal-delay': `${Math.max(0, Number(index) || 0) * 60}ms`
  };
}

function resolveSkillNode(label, index) {
  const normalized = String(label || '').trim();
  const matched = SKILL_ICON_RULES.find((rule) => rule.pattern.test(normalized));
  if (matched) {
    return {
      label: normalized,
      icon: matched.icon,
      tone: matched.tone
    };
  }
  return {
    label: normalized,
    icon: SKILL_FALLBACK_ICONS[index % SKILL_FALLBACK_ICONS.length],
    tone: SKILL_FALLBACK_TONES[index % SKILL_FALLBACK_TONES.length]
  };
}

function resolveJourneyPeriod(rawValue, index, totalCount) {
  const source = String(rawValue || '').trim();
  const fallbackMonth = resolveJourneyFallbackMonth(index, totalCount);
  const periodMatch = source.match(/(\d{4})\s*[-/.年]\s*(\d{1,2})(?:\s*[-/.月]\s*(\d{1,2}))?\s*日?/u);
  const yearMatch = source.match(/(\d{4})/u);
  const yearLabel = periodMatch?.[1] || yearMatch?.[1] || source || 'Now';
  const yearNumber = Number(yearMatch?.[1] || periodMatch?.[1] || new Date().getFullYear());
  const parsedMonth = Number(periodMatch?.[2] || NaN);
  const monthNumber = clampNumber(Number.isFinite(parsedMonth) ? parsedMonth : fallbackMonth, 1, 12);
  const maxDay = getJourneyMonthDayCount(yearNumber, monthNumber);
  const parsedDay = Number(periodMatch?.[3] || NaN);
  const dayNumber = clampNumber(Number.isFinite(parsedDay) ? parsedDay : resolveJourneyFallbackDay(index, totalCount, maxDay), 1, maxDay);
  const monthLabel = JOURNEY_MONTH_LABELS[monthNumber - 1];
  const dayLabel = String(dayNumber).padStart(2, '0');
  return {
    yearNumber,
    yearLabel,
    monthNumber,
    monthLabel,
    dayNumber,
    dayLabel,
    dateLabel: `${yearLabel}-${String(monthNumber).padStart(2, '0')}-${dayLabel}`,
    periodLabel: `${monthLabel} ${dayLabel} · ${yearLabel}`
  };
}

function resolveJourneyFallbackMonth(index, totalCount) {
  const safeTotal = Math.max(1, Number(totalCount) || 0);
  if (safeTotal === 1) return 1;
  const ratio = index / Math.max(1, safeTotal - 1);
  return clampNumber(Math.round(ratio * 11) + 1, 1, 12);
}

function resolveJourneyFallbackDay(index, totalCount, maxDay) {
  const safeTotal = Math.max(1, Number(totalCount) || 0);
  if (safeTotal === 1) return 1;
  const ratio = index / Math.max(1, safeTotal - 1);
  return clampNumber(Math.round(ratio * (Math.max(1, maxDay) - 1)) + 1, 1, Math.max(1, maxDay));
}

function getJourneyMonthDayCount(yearNumber, monthNumber) {
  const safeYear = Number.isFinite(yearNumber) ? yearNumber : new Date().getFullYear();
  const safeMonth = clampNumber(Number(monthNumber) || 1, 1, 12);
  return new Date(safeYear, safeMonth, 0).getDate();
}

function resolveContentPanelElement() {
  const target = contentPanelRef.value;
  if (target instanceof HTMLElement) return target;
  if (target && typeof target.getElement === 'function') {
    const element = target.getElement();
    if (element instanceof HTMLElement) return element;
  }
  if (target?.el instanceof HTMLElement) return target.el;
  if (target?.el?.value instanceof HTMLElement) return target.el.value;
  if (target?.$el instanceof HTMLElement) return target.$el;
  return null;
}

function handleContentPointerMove(event) {
  if (!isDisplayTab() || !isDesktopPointerEnabled()) return;
  const panel = resolveContentPanelElement();
  if (!(panel instanceof HTMLElement)) return;
  const mapped = mapPointerToParallax(event.clientX, event.clientY, panel.getBoundingClientRect(), 8);
  motionState.pointer.x = mapped.x;
  motionState.pointer.y = mapped.y;
  motionState.pointer.active = true;
}

function resetParallax() {
  motionState.pointer.active = false;
  motionState.pointer.x = 0;
  motionState.pointer.y = 0;
}

function handleMagneticPointerMove(event) {
  if (!isDesktopPointerEnabled()) return;
  const target = event.currentTarget;
  if (!(target instanceof HTMLElement)) return;
  const mapped = mapPointerToParallax(event.clientX, event.clientY, target.getBoundingClientRect(), 4);
  target.style.setProperty('--mx', `${mapped.x.toFixed(2)}px`);
  target.style.setProperty('--my', `${mapped.y.toFixed(2)}px`);
}

function resetMagneticPointer(event) {
  const target = event.currentTarget;
  if (!(target instanceof HTMLElement)) return;
  target.style.setProperty('--mx', '0px');
  target.style.setProperty('--my', '0px');
}

function disconnectRevealController() {
  if (revealController) {
    revealController.disconnect();
  }
  revealController = null;
}

function disconnectJourneyObserver() {
  if (journeyObserver) {
    journeyObserver.disconnect();
  }
  journeyObserver = null;
  journeyRatioMap.clear();
  motionState.activeJourneyIndex = -1;
  motionState.journeyProgress = 0;
}

function getRevealSelectorByTab(tabKey = activeTab.value) {
  if (tabKey === AuthorTabKey.OVERVIEW) return '.overview-motion-root .reveal-node, .overview-motion-root .reveal-line';
  if (tabKey === AuthorTabKey.JOURNEY) return '.journey-motion-root .reveal-node';
  if (tabKey === AuthorTabKey.ABOUT) return '.about-motion-root .reveal-node, .about-motion-root .reveal-line';
  return '';
}

function setupActiveRevealObserver() {
  disconnectRevealController();
  const panel = resolveContentPanelElement();
  if (!(panel instanceof HTMLElement)) return;

  const selector = getRevealSelectorByTab(activeTab.value);
  if (!selector) return;
  revealController = setupRevealObserver(panel, selector, {
    root: panel,
    threshold: 0.16,
    once: true,
    baseDelay: 0,
    stepDelay: 60,
    disabled: !motionState.motionEnabled
  });
}

function updateJourneyProgressFromRatios(totalCount) {
  if (totalCount <= 0) {
    motionState.activeJourneyIndex = -1;
    motionState.journeyProgress = 0;
    return;
  }

  let bestIndex = -1;
  let bestRatio = -1;
  for (let index = 0; index < totalCount; index += 1) {
    const ratio = Number(journeyRatioMap.get(index) || 0);
    if (ratio > bestRatio) {
      bestRatio = ratio;
      bestIndex = index;
    }
  }

  if (bestIndex < 0 || bestRatio <= 0) {
    motionState.activeJourneyIndex = 0;
    motionState.journeyProgress = 0;
    return;
  }

  motionState.activeJourneyIndex = bestIndex;
  motionState.journeyProgress = clampNumber((bestIndex + bestRatio) / totalCount, 0, 1);
}

function syncJourneyProgressByScroll() {
  if (activeTab.value !== AuthorTabKey.JOURNEY) return;
  const panel = resolveContentPanelElement();
  const total = journeyTimelineItems.value.length;
  if (!(panel instanceof HTMLElement) || total <= 0) {
    motionState.activeJourneyIndex = -1;
    motionState.journeyProgress = 0;
    return;
  }
  const maxScroll = Math.max(1, panel.scrollHeight - panel.clientHeight);
  const ratio = clampNumber(panel.scrollTop / maxScroll, 0, 1);
  motionState.journeyProgress = ratio;
  motionState.activeJourneyIndex = Math.min(total - 1, Math.floor(ratio * total));
}

function setupJourneyProgressObserver() {
  disconnectJourneyObserver();
  if (activeTab.value !== AuthorTabKey.JOURNEY) return;

  const panel = resolveContentPanelElement();
  const timelineEl = journeyTimelineRef.value;
  if (!(panel instanceof HTMLElement) || !(timelineEl instanceof HTMLElement)) return;
  const items = Array.from(timelineEl.querySelectorAll('.timeline-item')).filter((node) => node instanceof HTMLElement);
  if (!items.length) {
    motionState.activeJourneyIndex = -1;
    motionState.journeyProgress = 0;
    return;
  }

  if (!motionState.motionEnabled || typeof IntersectionObserver !== 'function') {
    motionState.activeJourneyIndex = 0;
    motionState.journeyProgress = 1;
    return;
  }

  journeyObserver = new IntersectionObserver(
    (entries) => {
      entries.forEach((entry) => {
        const index = Number(entry.target?.dataset?.journeyIndex ?? -1);
        if (!Number.isInteger(index) || index < 0) return;
        journeyRatioMap.set(index, entry.isIntersecting ? entry.intersectionRatio : 0);
      });
      updateJourneyProgressFromRatios(items.length);
    },
    {
      root: panel,
      threshold: [0, 0.15, 0.35, 0.55, 0.75, 1]
    }
  );

  items.forEach((item, index) => {
    item.dataset.journeyIndex = String(index);
    journeyObserver?.observe(item);
  });
}

function handleContentScroll() {
  if (activeTab.value !== AuthorTabKey.JOURNEY) return;
  if (!journeyObserver) {
    syncJourneyProgressByScroll();
  }
}

function refreshActiveTabMotion() {
  nextTick(() => {
    setupActiveRevealObserver();
    setupJourneyProgressObserver();
    if (!isDisplayTab()) {
      resetParallax();
    } else if (activeTab.value === AuthorTabKey.JOURNEY && !journeyObserver) {
      syncJourneyProgressByScroll();
    }
  });
}

function bindReducedMotionWatcher() {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') return;
  const mediaQuery = window.matchMedia('(prefers-reduced-motion: reduce)');
  const applyMotionPreference = () => {
    motionState.motionEnabled = !mediaQuery.matches;
    if (!motionState.motionEnabled) {
      resetParallax();
    }
    refreshActiveTabMotion();
  };

  applyMotionPreference();

  if (typeof mediaQuery.addEventListener === 'function') {
    mediaQuery.addEventListener('change', applyMotionPreference);
    motionMediaCleanup = () => mediaQuery.removeEventListener('change', applyMotionPreference);
    return;
  }
  if (typeof mediaQuery.addListener === 'function') {
    mediaQuery.addListener(applyMotionPreference);
    motionMediaCleanup = () => mediaQuery.removeListener(applyMotionPreference);
    return;
  }
  motionMediaCleanup = null;
}

function resetTagInputs() {
  tagInputs.identityLabels = '';
  tagInputs.skills = '';
  tagInputs.aboutFocus = '';
  tagInputs.aboutMusic = '';
}

function normalizeJourneyRow(row = {}) {
  return {
    year: String(row.year || '').trim(),
    title: String(row.title || '').trim(),
    description: String(row.description || '').trim(),
    imageUrl: String(row.imageUrl || row.image_url || '').trim(),
    stack: Array.isArray(row.stack)
      ? row.stack
          .map((item) => String(item || '').trim())
          .filter(Boolean)
          .filter((item, index, list) => list.indexOf(item) === index)
      : [],
    stackInput: ''
  };
}

function normalizeLinkRow(row = {}) {
  return {
    label: String(row.label || '').trim(),
    url: String(row.url || '').trim()
  };
}

function createJourneyRow() {
  return normalizeJourneyRow(createEmptyJourneyRow());
}

function createLinkRow() {
  return normalizeLinkRow(createEmptyLinkRow());
}

function buildEditFormState(profilePayload) {
  const source = buildEditFormFromProfile(profilePayload);
  return {
    enabled: source.enabled !== false,
    hero: {
      greeting: String(source.hero?.greeting || '').trim(),
      name: String(source.hero?.name || '').trim(),
      quote: String(source.hero?.quote || '').trim(),
      avatarUrl: String(source.hero?.avatarUrl || '').trim(),
      coverImageUrl: String(source.hero?.coverImageUrl || '').trim()
    },
    identity: {
      birthYear: String(source.identity?.birthYear || '').trim(),
      school: String(source.identity?.school || '').trim(),
      major: String(source.identity?.major || '').trim(),
      role: String(source.identity?.role || '').trim(),
      labels: Array.isArray(source.identity?.labels) ? [...source.identity.labels] : []
    },
    skills: Array.isArray(source.skills) ? [...source.skills] : [],
    journey: Array.isArray(source.journey) && source.journey.length ? source.journey.map(normalizeJourneyRow) : [createJourneyRow()],
    about: {
      introText: String(source.about?.introText || ''),
      mission: String(source.about?.mission || '').trim(),
      focus: Array.isArray(source.about?.focus) ? [...source.about.focus] : [],
      music: Array.isArray(source.about?.music) ? [...source.about.music] : [],
      introImageUrl: String(source.about?.introImageUrl || '').trim(),
      missionImageUrl: String(source.about?.missionImageUrl || '').trim(),
      linksImageUrl: String(source.about?.linksImageUrl || '').trim(),
      links:
        Array.isArray(source.about?.links) && source.about.links.length
          ? source.about.links.map(normalizeLinkRow)
          : [createLinkRow()]
    }
  };
}

function applyEditFormFromProfile(profilePayload) {
  suppressDirtyTracking = true;
  editForm.value = buildEditFormState(profilePayload);
  resetTagInputs();
  editState.error = '';
  editState.success = '';
  editState.dirty = false;
  Promise.resolve().then(() => {
    suppressDirtyTracking = false;
  });
}

function syncEditStateFromProfile() {
  applyEditFormFromProfile(authorProfile.value);
}

function resetEditProfile() {
  syncEditStateFromProfile();
}

function applyCachedPublicProfile() {
  const cached = readAuthorProfileCache();
  if (!cached) return false;
  authorProfile.value = normalizeAuthorProfilePayload(cached);
  applyEditFormFromProfile(authorProfile.value);
  cacheNotice.value = '已显示本地缓存，正在后台刷新最新内容...';
  refreshActiveTabMotion();
  return true;
}

async function loadPublicProfile() {
  loading.value = true;
  loadError.value = '';
  cacheNotice.value = '';
  const hadCache = applyCachedPublicProfile();
  if (hadCache) {
    loading.value = false;
  }
  try {
    await auth.ensureReady();
    const payload = await getAuthorProfile(auth.isAuthenticated.value ? auth.authorizedFetch : undefined);
    authorProfile.value = normalizeAuthorProfilePayload(payload);
    applyEditFormFromProfile(authorProfile.value);
    writeAuthorProfileCache(authorProfile.value);
    cacheNotice.value = '';
    refreshActiveTabMotion();
  } catch (error) {
    if (hadCache) {
      loadError.value = '';
      cacheNotice.value = `已显示缓存，后台刷新失败：${readErrorMessage(error, '加载作者资料失败')}`;
    } else {
      loadError.value = readErrorMessage(error, '加载作者资料失败');
    }
  } finally {
    loading.value = false;
  }
}

function validateEditForm(form) {
  const heroName = String(form?.hero?.name || '').trim();
  if (!heroName) {
    return '请填写作者名字';
  }

  const journeyRows = Array.isArray(form?.journey) ? form.journey : [];
  for (let index = 0; index < journeyRows.length; index += 1) {
    const row = journeyRows[index] || {};
    const hasContent = [row.year, row.title, row.description].some((item) => String(item || '').trim()) || (Array.isArray(row.stack) && row.stack.length > 0);
    if (!hasContent) continue;
    if (!String(row.title || '').trim()) {
      return `建站经历第 ${index + 1} 项缺少标题`;
    }
  }

  const links = Array.isArray(form?.about?.links) ? form.about.links : [];
  for (let index = 0; index < links.length; index += 1) {
    const row = links[index] || {};
    const label = String(row.label || '').trim();
    const url = String(row.url || '').trim();
    if (label && !url) return `外链第 ${index + 1} 项缺少 URL`;
    if (!label && url) return `外链第 ${index + 1} 项缺少名称`;
  }

  return '';
}

async function saveAdminProfile() {
  if (!isAdminUser.value) return;

  const validationError = validateEditForm(editForm.value);
  if (validationError) {
    editState.error = validationError;
    editState.success = '';
    return;
  }

  editState.loading = true;
  editState.error = '';
  editState.success = '';
  try {
    const profileJson = buildProfileJsonFromEditForm(editForm.value);
    const payload = await updateAdminAuthorProfile(
      {
        enabled: editForm.value.enabled !== false,
        profileJson
      },
      auth.authorizedFetch
    );

    authorProfile.value = normalizeAuthorProfilePayload(payload);
    applyEditFormFromProfile(authorProfile.value);
    writeAuthorProfileCache(authorProfile.value);
    editState.success = '作者资料已保存';
    cacheNotice.value = '';
    refreshActiveTabMotion();
  } catch (error) {
    editState.error = readErrorMessage(error, '保存作者资料失败');
  } finally {
    editState.loading = false;
  }
}

function removeTag(target, index) {
  if (!Array.isArray(target)) return;
  if (index < 0 || index >= target.length) return;
  target.splice(index, 1);
}

function commitTagInput(key, target) {
  if (!Array.isArray(target)) return;
  const input = tagInputs[key] || '';
  const next = appendUniqueTags(target, input);
  target.splice(0, target.length, ...next);
  tagInputs[key] = '';
}

function commitJourneyStackInput(item) {
  if (!item || !Array.isArray(item.stack)) return;
  const next = appendUniqueTags(item.stack, item.stackInput || '');
  item.stack.splice(0, item.stack.length, ...next);
  item.stackInput = '';
}

function addJourneyRow() {
  editForm.value.journey.push(createJourneyRow());
}

function removeJourneyRow(index) {
  const list = editForm.value.journey;
  if (index < 0 || index >= list.length) return;
  list.splice(index, 1);
  if (!list.length) {
    list.push(createJourneyRow());
  }
}

function moveJourneyRow(index, direction) {
  const list = editForm.value.journey;
  const nextIndex = index + direction;
  if (index < 0 || index >= list.length) return;
  if (nextIndex < 0 || nextIndex >= list.length) return;
  const [row] = list.splice(index, 1);
  list.splice(nextIndex, 0, row);
}

function addLinkRow() {
  editForm.value.about.links.push(createLinkRow());
}

function removeLinkRow(index) {
  const list = editForm.value.about.links;
  if (index < 0 || index >= list.length) return;
  list.splice(index, 1);
  if (!list.length) {
    list.push(createLinkRow());
  }
}

function moveLinkRow(index, direction) {
  const list = editForm.value.about.links;
  const nextIndex = index + direction;
  if (index < 0 || index >= list.length) return;
  if (nextIndex < 0 || nextIndex >= list.length) return;
  const [row] = list.splice(index, 1);
  list.splice(nextIndex, 0, row);
}

function openBlogList() {
  router.push({ name: 'blog' });
}

function openLink(url) {
  const target = String(url || '').trim();
  if (!target) return;

  if (target.startsWith('/#/')) {
    router.push(target.slice(2));
    return;
  }
  if (target.startsWith('#/')) {
    router.push(target.slice(1));
    return;
  }
  if (target.startsWith('/')) {
    router.push(target);
    return;
  }
  window.open(target, '_blank', 'noopener,noreferrer');
}

function readErrorMessage(error, fallback) {
  const detail = String(error?.detail || '').trim();
  if (detail) return detail;
  const message = String(error?.message || '').trim();
  return message || fallback;
}

watch(
  () => route.query.tab,
  (nextTab) => {
    const raw = typeof nextTab === 'string' ? nextTab : '';
    const normalized = normalizeTab(raw);
    if (raw === normalized) return;
    router.replace({ path: '/author', query: { tab: normalized } });
  },
  { immediate: true }
);

watch(
  activeTab,
  () => {
    if (!canEditCurrentTab.value && sectionEditorOpen.value) {
      closeSectionEditor();
    }
    refreshActiveTabMotion();
  }
);

watch(
  () => editForm.value,
  () => {
    if (suppressDirtyTracking) return;
    if (!sectionEditorOpen.value) return;
    editState.dirty = true;
    if (editState.success) {
      editState.success = '';
    }
  },
  { deep: true }
);

onMounted(() => {
  bindReducedMotionWatcher();
  loadPublicProfile();
  refreshActiveTabMotion();
});

onBeforeUnmount(() => {
  disconnectRevealController();
  disconnectJourneyObserver();
  if (typeof motionMediaCleanup === 'function') {
    motionMediaCleanup();
  }
});
</script>

<style scoped>
.author-page {
  min-height: 100%;
  height: 100%;
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: minmax(0, 1fr);
}

.dashboard-layout {
  position: relative;
  min-height: 0;
  height: 100%;
  display: grid;
  grid-template-columns: minmax(0, 1fr);
  padding-left: 132px;
  overflow: hidden;
}

.sidebar-dot-rail {
  position: absolute;
  left: 0;
  top: 0;
  bottom: 0;
  z-index: 6;
  width: 116px;
  height: auto;
  min-height: 0;
  padding-block: 6px;
}

.content-panel {
  --liquid-bg: rgba(20, 27, 42, 0.32);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.2);
  --parallax-x: 0px;
  --parallax-y: 0px;
  --journey-progress: 0%;
  border-radius: 14px;
  min-height: 0;
  height: 100%;
  padding: 14px 16px;
  overflow: auto;
  overscroll-behavior: auto;
  perspective: 1200px;
  position: relative;
}

.content-block {
  display: grid;
  gap: 12px;
}

.inline-edit-fab {
  position: absolute;
  top: 10px;
  right: 10px;
  z-index: 6;
  width: 36px;
  height: 36px;
  border: 1px solid rgba(255, 255, 255, 0.28);
  border-radius: 999px;
  background: rgba(9, 14, 24, 0.66);
  color: rgba(234, 241, 255, 0.98);
  box-shadow: 0 10px 20px rgba(6, 10, 18, 0.25);
  transition: transform 220ms ease, border-color 220ms ease, box-shadow 220ms ease;
}

.inline-edit-fab:hover {
  transform: translateY(-2px);
  border-color: rgba(var(--accent-rgb), 0.62);
  box-shadow: 0 14px 24px rgba(8, 14, 24, 0.36);
}

.state-tip {
  color: rgba(201, 216, 241, 0.94);
}

.error-text {
  color: rgba(255, 190, 197, 0.96);
}

.author-card {
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(9, 14, 24, 0.46);
  box-shadow: 0 10px 24px rgba(6, 10, 18, 0.18);
  padding: 14px;
  transition: transform 240ms cubic-bezier(0.22, 1, 0.36, 1), box-shadow 240ms ease, border-color 240ms ease;
  will-change: transform;
}

.hero-card {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 16px;
  align-items: center;
  transform: translate3d(calc(var(--parallax-x) * 0.28), calc(var(--parallax-y) * 0.22), 0);
}

.hero-stage {
  position: relative;
  overflow: hidden;
  isolation: isolate;
}

.hero-cover-image {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
  opacity: 0.36;
  z-index: 0;
  filter: saturate(1.05) contrast(1.06);
}

.hero-bg-glow {
  pointer-events: none;
  position: absolute;
  inset: -24% -8%;
  z-index: 0;
}

.orb {
  position: absolute;
  border-radius: 50%;
  filter: blur(2px);
  opacity: 0.65;
}

.orb-a {
  width: 180px;
  height: 180px;
  left: -18px;
  top: -26px;
  background: radial-gradient(circle, rgba(92, 173, 255, 0.58), rgba(92, 173, 255, 0.08) 70%, rgba(92, 173, 255, 0));
  animation: float-orb-1 8.4s ease-in-out infinite;
}

.orb-b {
  width: 200px;
  height: 200px;
  right: -12px;
  bottom: -64px;
  background: radial-gradient(circle, rgba(182, 132, 255, 0.52), rgba(182, 132, 255, 0.1) 70%, rgba(182, 132, 255, 0));
  animation: float-orb-2 9.6s ease-in-out infinite;
}

.orb-c {
  width: 136px;
  height: 136px;
  right: 28%;
  top: -22px;
  background: radial-gradient(circle, rgba(118, 255, 226, 0.5), rgba(118, 255, 226, 0.08) 68%, rgba(118, 255, 226, 0));
  animation: float-orb-3 7.5s ease-in-out infinite;
}

.hero-avatar-wrap {
  display: grid;
  gap: 8px;
  justify-items: center;
  position: relative;
  z-index: 1;
}

.hero-avatar-ring {
  padding: 4px;
}

.avatar-aurora-ring {
  position: absolute;
  inset: -8px;
  border-radius: 999px;
  border: 1px solid rgba(145, 218, 255, 0.56);
  background: conic-gradient(
    from 0deg,
    rgba(120, 230, 255, 0.12),
    rgba(190, 143, 255, 0.24),
    rgba(120, 230, 255, 0.12)
  );
  filter: blur(0.5px);
  animation: spin-slow 10s linear infinite;
  transition: border-color 220ms ease;
}

.hero-avatar {
  width: 116px;
  height: 116px;
  border-radius: 50%;
  object-fit: cover;
  border: 2px solid rgba(255, 255, 255, 0.58);
  box-shadow: 0 10px 22px rgba(6, 10, 18, 0.34);
  position: relative;
  z-index: 1;
  transition: transform 240ms ease, box-shadow 240ms ease;
}

.hero-badge {
  font-size: 11px;
  padding: 2px 8px;
  border-radius: 999px;
  background: rgba(138, 236, 179, 0.2);
  color: rgba(203, 255, 226, 0.95);
}

.hero-badge.off {
  background: rgba(249, 153, 153, 0.2);
  color: rgba(255, 210, 210, 0.95);
}

.hero-stage:hover {
  box-shadow: 0 18px 36px rgba(5, 10, 18, 0.36);
}

.hero-stage:hover .hero-avatar {
  transform: scale(1.04);
  box-shadow: 0 16px 36px rgba(82, 168, 255, 0.35);
}

.hero-stage:hover .avatar-aurora-ring {
  border-color: rgba(163, 225, 255, 0.78);
}

.hero-greeting {
  margin: 0;
  color: rgba(203, 217, 242, 0.9);
}

.hero-content {
  position: relative;
  z-index: 1;
}

.hero-content-stack {
  display: grid;
  gap: 4px;
}

.hero-content h2 {
  font-size: 28px;
  margin: 4px 0 6px;
}

.hero-quote {
  color: rgba(223, 230, 249, 0.88);
  line-height: 1.6;
}

.overview-grid,
.about-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.overview-card {
  transform: translate3d(calc(var(--parallax-x) * 0.16), calc(var(--parallax-y) * 0.12), 0);
}

.overview-card:hover {
  transform: translate3d(calc(var(--parallax-x) * 0.16), calc(var(--parallax-y) * 0.12 - 4px), 0);
  border-color: rgba(var(--accent-rgb), 0.45);
  box-shadow: 0 16px 30px rgba(14, 25, 44, 0.42);
}

.timeline-wrap {
  gap: 10px;
}

.timeline-rail {
  position: relative;
  display: grid;
  gap: 12px;
  padding-left: 22px;
}

.timeline-rail::before,
.timeline-rail::after {
  content: '';
  position: absolute;
  left: 8px;
  top: 4px;
  width: 3px;
  border-radius: 999px;
}

.timeline-rail::before {
  bottom: 4px;
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.08));
}

.timeline-rail::after {
  height: var(--journey-progress);
  background: linear-gradient(180deg, rgba(var(--accent-soft-rgb), 0.95), rgba(var(--accent-rgb), 0.62));
  box-shadow: 0 0 14px rgba(var(--accent-rgb), 0.42);
  transition: height 220ms ease;
}

.timeline-item {
  position: relative;
  overflow: hidden;
  transform: translate3d(0, 0, 0);
}

.timeline-cover {
  width: 100%;
  height: 132px;
  object-fit: cover;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  margin-bottom: 8px;
  opacity: 0.9;
}

.timeline-item:hover {
  transform: translate3d(0, -4px, 0);
  box-shadow: 0 16px 30px rgba(6, 10, 18, 0.3);
}

.timeline-node {
  position: absolute;
  left: -20px;
  top: 17px;
  width: 11px;
  height: 11px;
  border-radius: 50%;
  background: rgba(214, 238, 255, 0.9);
  border: 2px solid rgba(var(--accent-rgb), 0.6);
  box-shadow: 0 0 0 0 rgba(var(--accent-rgb), 0.34);
  transition: box-shadow 220ms ease, transform 220ms ease;
}

.timeline-item::before {
  content: '';
  position: absolute;
  left: 0;
  top: 0;
  bottom: 0;
  width: 3px;
  background: linear-gradient(180deg, rgba(var(--accent-rgb), 0.76), rgba(var(--accent-rgb), 0.16));
}

.timeline-item.is-active {
  border-color: rgba(var(--accent-rgb), 0.45);
  box-shadow: 0 18px 34px rgba(7, 14, 24, 0.38);
}

.timeline-item.is-active .timeline-node {
  transform: scale(1.08);
  box-shadow: 0 0 0 8px rgba(var(--accent-rgb), 0.2);
  animation: pulse-node 1.9s ease-in-out infinite;
}

.timeline-year {
  padding-left: 12px;
  font-size: 12px;
  letter-spacing: 0.1em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.92);
}

.timeline-item h3,
.author-card h3,
.author-card h2 {
  margin-top: 6px;
}

.kv-grid {
  display: grid;
  gap: 8px;
}

.kv-row {
  display: grid;
  grid-template-columns: 90px minmax(0, 1fr);
  gap: 10px;
}

.kv-row dt {
  color: rgba(178, 194, 223, 0.92);
  font-size: 13px;
}

.kv-row dd {
  color: rgba(233, 241, 255, 0.95);
}

.chip-row {
  margin-top: 8px;
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.skills-grid {
  margin-top: 2px;
}

.chip {
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.14);
  color: rgba(238, 245, 255, 0.95);
  padding: 4px 10px;
  font-size: 12px;
}

.skill-chip {
  background: rgba(var(--accent-rgb), 0.22);
  border-color: rgba(var(--accent-rgb), 0.34);
}

.timeline-chip {
  transition: transform 200ms ease, filter 200ms ease, border-color 200ms ease;
}

.timeline-chip:hover {
  transform: translateY(-2px);
  filter: saturate(1.2);
  border-color: rgba(var(--accent-rgb), 0.58);
}

.line-text {
  color: rgba(223, 230, 249, 0.88);
  line-height: 1.68;
  margin-top: 8px;
}

.mini-title {
  margin-top: 12px;
  font-size: 12px;
  color: rgba(184, 201, 230, 0.9);
}

.about-grid-asymmetric {
  grid-template-columns: 1.2fr 1fr;
  grid-template-areas:
    'intro mission'
    'intro links';
}

.about-intro-card {
  grid-area: intro;
}

.about-mission-card {
  grid-area: mission;
  position: relative;
  overflow: hidden;
}

.about-links-card {
  grid-area: links;
}

.about-section-image {
  width: 100%;
  height: 138px;
  object-fit: cover;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.15);
  margin-bottom: 8px;
}

.mission-sweep {
  pointer-events: none;
  position: absolute;
  inset: -25%;
  background: conic-gradient(
    from 180deg,
    rgba(126, 217, 255, 0),
    rgba(126, 217, 255, 0.2),
    rgba(126, 217, 255, 0)
  );
  animation: sweep-border 6s linear infinite;
}

.inline-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  margin-top: 12px;
}

.inline-actions.compact {
  margin-top: 10px;
}

.mini-btn {
  min-height: 32px;
  border-radius: 9px;
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(255, 255, 255, 0.14);
  color: rgba(241, 246, 255, 0.96);
  padding: 0 10px;
}

.mini-btn.primary {
  border-color: rgba(var(--accent-rgb), 0.55);
  background: rgba(var(--accent-rgb), 0.28);
  box-shadow: 0 10px 20px rgba(var(--accent-rgb), 0.22);
}

.link-list {
  display: grid;
  gap: 8px;
  margin-top: 8px;
}

.link-btn {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 10px;
  min-height: 34px;
  padding: 0 12px;
  text-align: left;
  background: rgba(255, 255, 255, 0.14);
  color: rgba(236, 243, 255, 0.95);
  transition: transform 220ms ease, border-color 220ms ease, box-shadow 220ms ease;
}

.shine-link {
  --mx: 0px;
  --my: 0px;
  position: relative;
  overflow: hidden;
  transform: translate3d(var(--mx), var(--my), 0);
}

.shine-link::after {
  content: '';
  position: absolute;
  top: -120%;
  left: -30%;
  width: 32%;
  height: 300%;
  background: linear-gradient(120deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.42), rgba(255, 255, 255, 0));
  transform: translateX(-120%) rotate(18deg);
  transition: transform 560ms cubic-bezier(0.22, 1, 0.36, 1);
  pointer-events: none;
}

.shine-link:hover {
  border-color: rgba(var(--accent-rgb), 0.56);
  box-shadow: 0 12px 24px rgba(16, 32, 52, 0.32);
}

.shine-link:hover::after {
  transform: translateX(420%) rotate(18deg);
}

.overview-story-root,
.journey-story-root,
.about-story-root {
  gap: 14px;
}

.story-hero-stage {
  position: relative;
  overflow: hidden;
  min-height: 280px;
  padding: 20px;
  display: grid;
  gap: 14px;
  isolation: isolate;
  transform: translate3d(calc(var(--parallax-x) * 0.24), calc(var(--parallax-y) * 0.18), 0);
}

.story-hero-cover {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
  opacity: 0.35;
  filter: contrast(1.08) saturate(1.16);
  z-index: 0;
}

.story-hero-atmosphere {
  pointer-events: none;
  position: absolute;
  inset: -20% -8%;
  z-index: 0;
}

.story-orb {
  position: absolute;
  border-radius: 50%;
  filter: blur(1px);
  opacity: 0.66;
}

.story-orb-a {
  width: 220px;
  height: 220px;
  left: -30px;
  top: -34px;
  background: radial-gradient(circle, rgba(84, 170, 255, 0.54), rgba(84, 170, 255, 0.06) 72%, rgba(84, 170, 255, 0));
  animation: float-orb-1 9.2s ease-in-out infinite;
}

.story-orb-b {
  width: 240px;
  height: 240px;
  right: -24px;
  bottom: -80px;
  background: radial-gradient(circle, rgba(198, 138, 255, 0.44), rgba(198, 138, 255, 0.08) 74%, rgba(198, 138, 255, 0));
  animation: float-orb-2 10.6s ease-in-out infinite;
}

.story-orb-c {
  width: 160px;
  height: 160px;
  right: 34%;
  top: -24px;
  background: radial-gradient(circle, rgba(124, 255, 216, 0.42), rgba(124, 255, 216, 0.06) 70%, rgba(124, 255, 216, 0));
  animation: float-orb-3 8.2s ease-in-out infinite;
}

.story-hero-main {
  position: relative;
  z-index: 1;
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(280px, 38%);
  gap: 16px;
  align-items: stretch;
}

.story-hero-intro {
  min-width: 0;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 18px;
  align-items: center;
}

.story-avatar-stack {
  position: relative;
  display: grid;
  justify-items: center;
  gap: 8px;
}

.story-avatar-ring {
  position: absolute;
  inset: -8px;
  border-radius: 999px;
  border: 1px solid rgba(145, 218, 255, 0.52);
  background: conic-gradient(
    from 0deg,
    rgba(120, 230, 255, 0.12),
    rgba(190, 143, 255, 0.24),
    rgba(120, 230, 255, 0.12)
  );
  animation: spin-slow 11s linear infinite;
}

.story-avatar {
  width: 124px;
  height: 124px;
  border-radius: 50%;
  object-fit: cover;
  border: 2px solid rgba(255, 255, 255, 0.6);
  box-shadow: 0 14px 32px rgba(4, 8, 16, 0.42);
  transition: transform 240ms ease, box-shadow 240ms ease;
}

.story-status-badge {
  font-size: 11px;
  padding: 2px 9px;
  border-radius: 999px;
  background: rgba(138, 236, 179, 0.2);
  color: rgba(203, 255, 226, 0.95);
}

.story-status-badge.off {
  background: rgba(249, 153, 153, 0.2);
  color: rgba(255, 210, 210, 0.95);
}

.story-hero-copy {
  position: relative;
  z-index: 1;
  min-width: 0;
}

.story-hero-copy h2 {
  margin-top: 4px;
  font-size: clamp(28px, 4vw, 40px);
}

.story-greeting {
  margin: 0;
  color: rgba(208, 220, 246, 0.92);
}

.story-quote {
  margin-top: 6px;
}

.story-hero-stage:hover .story-avatar {
  transform: translateY(-2px) scale(1.03);
  box-shadow: 0 18px 36px rgba(72, 149, 255, 0.34);
}

.story-skill-ribbon {
  position: relative;
  z-index: 1;
  margin-top: 0;
  min-width: 0;
  display: flex;
  align-items: stretch;
}

.skill-focus-frame {
  position: relative;
  overflow: hidden;
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: transparent;
  width: 100%;
  min-height: 132px;
  height: 132px;
  max-height: 132px;
  padding: 10px;
  transition: border-color 220ms ease, box-shadow 220ms ease;
}

.skill-focus-frame:hover,
.skill-focus-frame:focus-within,
.skill-focus-frame:focus-visible {
  border-color: rgba(var(--accent-rgb), 0.5);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.2);
  outline: none;
}

.skill-focus-list {
  position: static;
  width: 100%;
  height: 100%;
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px 10px;
  align-content: start;
  overflow: auto;
  padding-right: 2px;
}

.skill-focus-item {
  min-height: 34px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  padding: 4px 6px;
  border-bottom: 1px dashed rgba(255, 255, 255, 0.14);
  background: rgba(9, 16, 28, 0.18);
  border-radius: 6px;
}

.skill-node-icon {
  width: 28px;
  height: 28px;
  border-radius: 50%;
  display: grid;
  place-items: center;
  border: 1px solid rgba(255, 255, 255, 0.24);
  font-size: 14px;
  color: rgba(238, 245, 255, 0.96);
  background: linear-gradient(145deg, rgba(115, 167, 255, 0.44), rgba(91, 104, 255, 0.32));
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.08);
}

.skill-node-label {
  font-size: 13px;
  color: rgba(236, 244, 255, 0.95);
  line-height: 1.2;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.skill-slide-pill.tone-cyan .skill-node-icon,
.skill-focus-item.tone-cyan .skill-node-icon {
  background: linear-gradient(145deg, rgba(89, 211, 255, 0.5), rgba(84, 151, 255, 0.34));
}

.skill-slide-pill.tone-blue .skill-node-icon,
.skill-focus-item.tone-blue .skill-node-icon {
  background: linear-gradient(145deg, rgba(98, 152, 255, 0.5), rgba(80, 104, 255, 0.36));
}

.skill-slide-pill.tone-violet .skill-node-icon,
.skill-focus-item.tone-violet .skill-node-icon {
  background: linear-gradient(145deg, rgba(152, 129, 255, 0.52), rgba(189, 125, 255, 0.34));
}

.skill-slide-pill.tone-gold .skill-node-icon,
.skill-focus-item.tone-gold .skill-node-icon {
  background: linear-gradient(145deg, rgba(255, 204, 92, 0.56), rgba(241, 158, 70, 0.34));
}

.skill-slide-pill.tone-rose .skill-node-icon,
.skill-focus-item.tone-rose .skill-node-icon {
  background: linear-gradient(145deg, rgba(255, 143, 187, 0.54), rgba(240, 109, 135, 0.34));
}

.skill-slide-pill.tone-mint .skill-node-icon,
.skill-focus-item.tone-mint .skill-node-icon {
  background: linear-gradient(145deg, rgba(103, 243, 214, 0.5), rgba(107, 195, 255, 0.34));
}

.story-free-layout {
  display: grid;
  grid-template-columns: 1.1fr 1fr;
  gap: 12px;
}

.story-identity-ribbon {
  grid-column: 1 / -1;
}

.identity-track {
  margin-top: 10px;
  display: grid;
  grid-template-columns: repeat(4, minmax(0, 1fr));
  gap: 10px;
}

.identity-unit {
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.08);
  padding: 10px;
  display: grid;
  gap: 6px;
}

.identity-label {
  font-size: 12px;
  color: rgba(185, 201, 226, 0.92);
}

.story-notes,
.story-focus-panel {
  transform: translate3d(calc(var(--parallax-x) * 0.12), calc(var(--parallax-y) * 0.08), 0);
}

.story-notes:hover,
.story-focus-panel:hover,
.story-identity-ribbon:hover {
  transform: translateY(-4px);
  border-color: rgba(var(--accent-rgb), 0.46);
  box-shadow: 0 18px 34px rgba(10, 20, 36, 0.4);
}

.focus-cloud .chip {
  animation: cloud-rise 7.4s ease-in-out infinite;
}

.focus-cloud .chip:nth-child(2n) {
  animation-delay: -2.2s;
}

.focus-cloud .chip:nth-child(3n) {
  animation-delay: -4.1s;
}

.journey-stage {
  position: relative;
  display: grid;
  grid-template-columns: 132px minmax(0, 1fr);
  gap: 16px;
}

.journey-sticky-axis {
  position: sticky;
  top: 10px;
  align-self: start;
  height: calc(100dvh - 240px);
  min-height: 220px;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  align-content: start;
  gap: 14px;
}

.journey-axis-head {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  align-items: end;
  gap: 10px;
}

.journey-axis-date {
  display: grid;
  gap: 2px;
}

.journey-axis-month {
  font-size: clamp(24px, 3.2vw, 34px);
  font-weight: 700;
  line-height: 1;
  letter-spacing: 0.04em;
  color: rgba(244, 248, 255, 0.96);
}

.journey-axis-day {
  font-size: 11px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(220, 229, 245, 0.76);
}

.journey-axis-body {
  min-height: 0;
  display: grid;
  grid-template-columns: 16px minmax(0, 1fr);
  align-items: stretch;
  gap: 10px;
}

.journey-axis-rail-wrap {
  position: relative;
  min-height: 0;
  display: grid;
  justify-items: center;
}

.journey-axis-line,
.journey-axis-progress {
  position: absolute;
  inset: 0 auto 0 50%;
  width: 4px;
  border-radius: 999px;
  transform: translateX(-50%);
}

.journey-axis-line {
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.22), rgba(255, 255, 255, 0.08));
}

.journey-axis-progress {
  top: 0;
  bottom: auto;
  height: var(--journey-progress);
  background: linear-gradient(180deg, rgba(var(--accent-soft-rgb), 0.95), rgba(var(--accent-rgb), 0.6));
  box-shadow: 0 0 18px rgba(var(--accent-rgb), 0.46);
  transition: height 220ms ease;
}

.journey-axis-year {
  font-size: 11px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.94);
}

.journey-axis-month-list {
  min-height: 0;
  display: grid;
  align-content: space-between;
  gap: 6px;
}

.journey-axis-month-tick {
  font-size: 11px;
  line-height: 1;
  letter-spacing: 0.08em;
  color: rgba(196, 208, 231, 0.42);
  transition: color 200ms ease, transform 200ms ease;
}

.journey-axis-month-tick.is-passed {
  color: rgba(215, 226, 247, 0.74);
}

.journey-axis-month-tick.is-active {
  color: rgba(var(--accent-soft-rgb), 0.98);
  transform: translateX(4px);
}

.journey-storyline {
  position: relative;
  display: grid;
  gap: 14px;
}

.journey-storyline::before {
  content: '';
  position: absolute;
  left: 48px;
  top: 0;
  bottom: 0;
  width: 2px;
  background: linear-gradient(180deg, rgba(var(--accent-rgb), 0.18), rgba(var(--accent-rgb), 0.72), rgba(var(--accent-rgb), 0.16));
  z-index: 1;
  pointer-events: none;
}

.journey-scene {
  position: relative;
  overflow: hidden;
  display: grid;
  grid-template-columns: 72px minmax(160px, 240px) minmax(0, 1fr);
  gap: 14px;
  align-items: start;
  z-index: 0;
}

.journey-scene-node {
  left: 42px;
  top: 22px;
  z-index: 2;
}

.journey-scene-marker {
  position: relative;
  z-index: 2;
  display: grid;
  justify-items: start;
  align-content: start;
  gap: 4px;
  padding-top: 8px;
  padding-right: 12px;
}

.journey-scene-day,
.journey-scene-month,
.journey-scene-year,
.journey-scene-period {
  margin: 0;
}

.journey-scene-month {
  font-size: 22px;
  line-height: 1;
  font-weight: 700;
  color: rgba(244, 248, 255, 0.96);
}

.journey-scene-day {
  font-size: 11px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(217, 228, 246, 0.76);
}

.journey-scene-media {
  min-height: 144px;
}

.journey-scene-image {
  width: 100%;
  height: 160px;
  object-fit: cover;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.18);
}

.journey-scene-copy {
  display: grid;
  gap: 4px;
  padding-top: 2px;
}

.journey-scene-year {
  font-size: 11px;
  letter-spacing: 0.1em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.92);
}

.journey-scene-period {
  font-size: 12px;
  letter-spacing: 0.08em;
  color: rgba(213, 224, 244, 0.7);
}

.journey-scene.is-active {
  border-color: rgba(var(--accent-rgb), 0.5);
  box-shadow: 0 20px 36px rgba(8, 16, 28, 0.45);
}

.journey-scene.is-active .journey-scene-node {
  animation: pulse-node 1.9s ease-in-out infinite;
}

.journey-chip {
  transition: transform 200ms ease, filter 200ms ease, border-color 200ms ease;
}

.journey-chip:hover {
  transform: translateY(-2px);
  filter: saturate(1.2);
  border-color: rgba(var(--accent-rgb), 0.58);
}

.about-manifesto {
  position: relative;
  overflow: hidden;
  min-height: 230px;
  display: grid;
  grid-template-columns: minmax(200px, 320px) minmax(0, 1fr);
  gap: 14px;
  align-items: center;
}

.about-hero-image {
  width: 100%;
  height: 100%;
  min-height: 190px;
  object-fit: cover;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.18);
}

.about-manifesto-copy {
  display: grid;
  gap: 6px;
}

.about-flow-grid {
  display: grid;
  grid-template-columns: 1.1fr 1fr;
  gap: 12px;
}

.about-goal-stage {
  position: relative;
  overflow: hidden;
}

.about-goal-sweep {
  pointer-events: none;
  position: absolute;
  inset: -25%;
  background: conic-gradient(from 180deg, rgba(126, 217, 255, 0), rgba(126, 217, 255, 0.2), rgba(126, 217, 255, 0));
  animation: sweep-border 6s linear infinite;
}

.about-preference-stage,
.about-links-stage {
  display: grid;
  gap: 4px;
}

.pulse-cloud .chip {
  animation: pulse-cloud 4.8s ease-in-out infinite;
}

.pulse-cloud .chip:nth-child(2n) {
  animation-delay: -1.4s;
}

.pulse-cloud .chip:nth-child(3n) {
  animation-delay: -2.7s;
}

.is-reveal-ready {
  opacity: 0;
  transform: translate3d(0, 18px, 0) scale(0.995);
  transition:
    opacity 560ms cubic-bezier(0.22, 1, 0.36, 1),
    transform 560ms cubic-bezier(0.22, 1, 0.36, 1);
  transition-delay: var(--reveal-delay, 0ms);
}

.is-reveal-ready.is-revealed {
  opacity: 1;
  transform: translate3d(0, 0, 0) scale(1);
  animation: journey-rise 380ms ease both;
}

.section-editor-mask {
  position: fixed;
  inset: 0;
  z-index: 120;
  background: rgba(7, 10, 18, 0.62);
  display: grid;
  place-items: center;
  padding: 24px 18px;
}

.section-editor {
  width: min(980px, 96vw);
  max-height: min(88vh, 980px);
  overflow: auto;
  border-radius: 16px;
  padding: 14px;
  display: grid;
  gap: 10px;
  --liquid-bg: rgba(16, 24, 38, 0.84);
  --liquid-border: rgba(255, 255, 255, 0.24);
  --liquid-shadow: 0 24px 46px rgba(6, 10, 18, 0.5);
}

.section-editor-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.section-editor-header h2 {
  margin: 0;
}

.icon-close-btn {
  width: 34px;
  height: 34px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.28);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(234, 241, 255, 0.98);
}

.editor-layout {
  display: grid;
  gap: 10px;
}

.section-editor-footer {
  position: sticky;
  bottom: 0;
  background: linear-gradient(180deg, rgba(14, 20, 32, 0), rgba(14, 20, 32, 0.92) 25%);
  padding-top: 10px;
}

.section-image-preview {
  width: 100%;
  max-height: 180px;
  object-fit: cover;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.07);
}

.editor-preview-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.editor-fade-enter-active,
.editor-fade-leave-active {
  transition: opacity 220ms ease;
}

.editor-fade-enter-from,
.editor-fade-leave-to {
  opacity: 0;
}

@keyframes float-orb-1 {
  0%,
  100% {
    transform: translate3d(0, 0, 0) scale(1);
  }
  50% {
    transform: translate3d(14px, -12px, 0) scale(1.05);
  }
}

@keyframes float-orb-2 {
  0%,
  100% {
    transform: translate3d(0, 0, 0) scale(1);
  }
  50% {
    transform: translate3d(-12px, 12px, 0) scale(1.08);
  }
}

@keyframes float-orb-3 {
  0%,
  100% {
    transform: translate3d(0, 0, 0) scale(1);
  }
  50% {
    transform: translate3d(8px, 16px, 0) scale(0.94);
  }
}

@keyframes spin-slow {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

@keyframes pulse-node {
  0%,
  100% {
    box-shadow: 0 0 0 6px rgba(var(--accent-rgb), 0.22);
  }
  50% {
    box-shadow: 0 0 0 11px rgba(var(--accent-rgb), 0.12);
  }
}

@keyframes sweep-border {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

@keyframes journey-rise {
  from {
    filter: saturate(0.8);
  }
  to {
    filter: saturate(1);
  }
}

@keyframes skill-slide-loop {
  0% {
    transform: translateX(0);
  }
  100% {
    transform: translateX(-100%);
  }
}

@keyframes cloud-rise {
  0%,
  100% {
    transform: translateY(0);
  }
  50% {
    transform: translateY(-4px);
  }
}

@keyframes pulse-cloud {
  0%,
  100% {
    filter: saturate(1);
    transform: translateY(0);
  }
  50% {
    filter: saturate(1.18);
    transform: translateY(-2px);
  }
}

.editor-card {
  display: grid;
  gap: 10px;
}

.editor-switch {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  margin-top: 10px;
  color: rgba(226, 235, 252, 0.9);
}

.form-section {
  display: grid;
  gap: 10px;
  border-top: 1px dashed rgba(255, 255, 255, 0.18);
  padding-top: 10px;
}

.form-section h3 {
  margin: 0;
}

.field-grid {
  display: grid;
  gap: 10px;
}

.field-grid.two-col {
  grid-template-columns: repeat(2, minmax(0, 1fr));
}

.field-block {
  display: grid;
  gap: 6px;
}

.field-block > span {
  font-size: 12px;
  color: rgba(184, 201, 230, 0.9);
}

.field-block input,
.field-block textarea {
  width: 100%;
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 10px;
  background: rgba(6, 11, 19, 0.62);
  color: rgba(236, 243, 255, 0.95);
  padding: 9px 10px;
  resize: vertical;
}

.field-block input:focus,
.field-block textarea:focus {
  outline: none;
  border-color: rgba(var(--accent-rgb), 0.55);
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.2);
}

.tag-editor {
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.06);
  padding: 8px;
  display: grid;
  gap: 8px;
}

.tag-editor .chip-row {
  margin-top: 0;
}

.removable-chip {
  cursor: pointer;
}

.removable-chip:disabled {
  cursor: not-allowed;
  opacity: 0.72;
}

.nested-card {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.15);
  background: rgba(7, 12, 22, 0.52);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.hidden-file-input {
  display: none;
}

.avatar-preview {
  width: 96px;
  height: 96px;
  border-radius: 12px;
  object-fit: cover;
  border: 1px solid rgba(255, 255, 255, 0.25);
  background: rgba(255, 255, 255, 0.08);
}

@media (prefers-reduced-motion: reduce) {
  .orb,
  .story-orb,
  .avatar-aurora-ring,
  .story-avatar-ring,
  .mission-sweep,
  .about-goal-sweep,
  .skill-slide-track,
  .focus-cloud .chip,
  .pulse-cloud .chip,
  .timeline-item.is-active .timeline-node,
  .is-reveal-ready.is-revealed {
    animation: none !important;
  }

  .hero-stage,
  .story-hero-stage,
  .overview-card,
  .story-notes,
  .story-focus-panel,
  .story-identity-ribbon,
  .shine-link,
  .timeline-item,
  .journey-scene,
  .author-card,
  .is-reveal-ready,
  .inline-edit-fab {
    transform: none !important;
    transition: opacity 120ms linear !important;
  }

  .is-reveal-ready {
    opacity: 1 !important;
  }

  .timeline-rail::after {
    transition: none !important;
  }

  .story-skill-ribbon {
    mask-image: none;
    -webkit-mask-image: none;
  }
}

@media (max-width: 900px) {
  .dashboard-layout {
    grid-template-columns: 1fr;
    gap: 10px;
    padding-left: 0;
    overflow: visible;
  }

  .sidebar-dot-rail {
    position: static;
    top: auto;
    bottom: auto;
    z-index: 1;
    width: auto;
    min-height: auto;
    height: auto;
    padding-block: 0;
  }

  .content-panel {
    height: auto;
    padding-top: 12px;
  }

  .hero-card {
    grid-template-columns: 1fr;
    justify-items: center;
    text-align: center;
  }

  .story-hero-stage {
    min-height: 0;
    padding: 14px;
  }

  .story-hero-main {
    grid-template-columns: 1fr;
    justify-items: center;
    text-align: center;
  }

  .story-hero-intro {
    grid-template-columns: 1fr;
    justify-items: center;
    text-align: center;
  }

  .story-free-layout {
    grid-template-columns: 1fr;
  }

  .skill-focus-frame {
    min-height: 124px;
    height: 124px;
    max-height: 124px;
    padding: 8px;
  }

  .skill-focus-list {
    grid-template-columns: repeat(2, minmax(0, 1fr));
    gap: 6px 8px;
    overflow: auto;
  }

  .skill-node-label {
    font-size: 12px;
  }

  .identity-track {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .overview-grid,
  .about-grid {
    grid-template-columns: 1fr;
  }

  .about-grid-asymmetric {
    grid-template-columns: 1fr;
    grid-template-areas:
      'intro'
      'mission'
      'links';
  }

  .journey-stage {
    grid-template-columns: 1fr;
  }

  .journey-sticky-axis {
    position: relative;
    top: auto;
    min-height: 0;
    height: auto;
    width: 100%;
    gap: 10px;
  }

  .journey-axis-head {
    grid-template-columns: auto auto;
    align-items: end;
    gap: 10px;
  }

  .journey-axis-month {
    font-size: 22px;
  }

  .journey-axis-day {
    font-size: 11px;
  }

  .journey-axis-body {
    grid-template-columns: 1fr;
    gap: 8px;
  }

  .journey-axis-rail-wrap {
    min-height: 3px;
    height: 3px;
  }

  .journey-axis-line,
  .journey-axis-progress {
    inset: 50% 0 auto 0;
    width: 100%;
    height: 3px !important;
    transform: translateY(-50%);
  }

  .journey-axis-month-list {
    grid-template-columns: repeat(6, minmax(0, 1fr));
    align-content: start;
    gap: 8px 10px;
  }

  .journey-axis-year {
    margin-top: 0;
  }

  .journey-scene {
    grid-template-columns: 1fr;
    gap: 10px;
  }

  .journey-storyline::before {
    left: 20px;
  }

  .journey-scene-node {
    left: 14px;
    top: 18px;
  }

  .journey-scene-marker {
    padding-top: 0;
    padding-left: 28px;
    gap: 2px;
  }

  .journey-scene-month {
    font-size: 18px;
  }

  .about-manifesto,
  .about-flow-grid {
    grid-template-columns: 1fr;
  }

  .kv-row {
    grid-template-columns: 86px minmax(0, 1fr);
  }

  .field-grid.two-col {
    grid-template-columns: 1fr;
  }

  .editor-preview-grid {
    grid-template-columns: 1fr;
  }

  .section-editor {
    width: min(98vw, 980px);
    max-height: 92vh;
  }
}
</style>
