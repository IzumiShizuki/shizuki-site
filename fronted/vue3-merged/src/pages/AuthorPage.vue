<template>
  <section class="route-page author-page motion-managed">
    <header class="page-header">
      <p class="eyebrow">Author Space</p>
      <h1>作者介绍</h1>
      <p>这里展示建站者信息、建站经历与关于站点的长期目标。</p>
      <p class="updated-tip">最近更新：{{ updatedAtText }}</p>
    </header>

    <div class="dashboard-layout">
      <aside class="sidebar liquid-material">
        <button
          v-for="tab in tabs"
          :key="tab.key"
          class="side-item ripple-trigger"
          :class="{ active: activeTab === tab.key }"
          type="button"
          @click="openTab(tab.key)"
        >
          {{ tab.label }}
        </button>
      </aside>

      <section
        ref="contentPanelRef"
        class="content-panel liquid-material"
        :style="contentPanelStyle"
        @pointermove="handleContentPointerMove"
        @pointerleave="resetParallax"
        @scroll.passive="handleContentScroll"
      >
        <p v-if="loading" class="state-tip">正在同步作者主页资料...</p>
        <p v-else-if="loadError" class="error-text">{{ loadError }}</p>

        <template v-else>
          <div v-if="canEditCurrentTab" class="section-edit-launch">
            <button class="section-edit-btn ripple-trigger" type="button" @click="openSectionEditor(activeTab)">
              <i class="fas fa-pen"></i>
            </button>
          </div>

          <div v-if="activeTab === 'overview'" class="content-block overview-motion-root">
            <section class="hero-stage hero-card author-card reveal-node" :style="staggerStyle(0)">
              <div class="hero-bg-glow" aria-hidden="true">
                <span class="orb orb-a"></span>
                <span class="orb orb-b"></span>
                <span class="orb orb-c"></span>
              </div>
              <img class="hero-cover-image" :src="hero.coverImageUrl || hero.avatarUrl" :alt="`${hero.name} cover`" />

              <div class="hero-avatar-wrap hero-avatar-ring">
                <span class="avatar-aurora-ring" aria-hidden="true"></span>
                <img class="hero-avatar" :src="hero.avatarUrl" :alt="hero.name" />
                <span class="hero-badge" :class="{ off: !authorProfile.enabled }">
                  {{ authorProfile.enabled ? '公开展示' : '已关闭' }}
                </span>
              </div>
              <div class="hero-content hero-content-stack">
                <p class="hero-greeting reveal-line" :style="staggerStyle(1)">{{ hero.greeting }}</p>
                <h2 class="reveal-line" :style="staggerStyle(2)">{{ hero.name }}</h2>
                <p class="hero-quote reveal-line" :style="staggerStyle(3)">{{ hero.quote }}</p>
                <div class="chip-row reveal-line" :style="staggerStyle(4)">
                  <span v-for="label in identity.labels" :key="`identity-${label}`" class="chip">{{ label }}</span>
                </div>
              </div>
            </section>

            <div class="overview-grid">
              <article class="author-card overview-card reveal-node" :style="staggerStyle(5)">
                <h3>身份信息</h3>
                <dl class="kv-grid">
                  <div class="kv-row">
                    <dt>出生年份</dt>
                    <dd>{{ identity.birthYear }}</dd>
                  </div>
                  <div class="kv-row">
                    <dt>学校</dt>
                    <dd>{{ identity.school }}</dd>
                  </div>
                  <div class="kv-row">
                    <dt>专业</dt>
                    <dd>{{ identity.major }}</dd>
                  </div>
                  <div class="kv-row">
                    <dt>当前角色</dt>
                    <dd>{{ identity.role }}</dd>
                  </div>
                </dl>
              </article>

              <article class="author-card overview-card reveal-node" :style="staggerStyle(6)">
                <h3>技能栈</h3>
                <div class="chip-row skills-grid">
                  <span v-for="skill in skills" :key="`skill-${skill}`" class="chip skill-chip">{{ skill }}</span>
                </div>
              </article>

              <article class="author-card overview-card reveal-node" :style="staggerStyle(7)">
                <h3>碎碎念</h3>
                <p v-for="(line, index) in about.intro" :key="`intro-${index}`" class="line-text">
                  {{ line }}
                </p>
              </article>

              <article class="author-card overview-card reveal-node" :style="staggerStyle(8)">
                <h3>偏好与关注</h3>
                <p class="line-text"><strong>目标：</strong>{{ about.mission }}</p>
                <p class="mini-title">关注方向</p>
                <div class="chip-row">
                  <span v-for="focus in about.focus" :key="`focus-${focus}`" class="chip">{{ focus }}</span>
                </div>
                <p class="mini-title">音乐偏好</p>
                <div class="chip-row">
                  <span v-for="music in about.music" :key="`music-${music}`" class="chip">{{ music }}</span>
                </div>
              </article>
            </div>
          </div>

          <div v-else-if="activeTab === 'journey'" class="content-block timeline-wrap journey-motion-root">
            <div ref="journeyTimelineRef" class="timeline-rail">
              <article
                v-for="(item, index) in journey"
                :key="`journey-${index}-${item.title}`"
                class="timeline-item author-card reveal-node"
                :class="{ 'is-active': motionState.activeJourneyIndex === index }"
                :data-journey-index="index"
                :style="staggerStyle(index)"
              >
                <span class="timeline-node" aria-hidden="true"></span>
                <img v-if="item.imageUrl" class="timeline-cover" :src="item.imageUrl" :alt="`${item.title} cover`" />
                <p class="timeline-year">{{ item.year }}</p>
                <h3>{{ item.title }}</h3>
                <p class="line-text">{{ item.description }}</p>
                <div class="chip-row">
                  <span v-for="stack in item.stack" :key="`stack-${item.year}-${stack}`" class="chip timeline-chip">{{ stack }}</span>
                </div>
              </article>
            </div>
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

          <div v-else-if="activeTab === 'about'" class="content-block about-motion-root">
            <div class="about-grid about-grid-asymmetric">
              <article class="author-card about-intro-card reveal-node" :style="staggerStyle(0)">
                <img v-if="about.introImageUrl" class="about-section-image" :src="about.introImageUrl" alt="about intro image" />
                <h2>关于本站</h2>
                <p v-for="(line, index) in about.intro" :key="`about-intro-${index}`" class="line-text reveal-line" :style="staggerStyle(index + 1)">
                  {{ line }}
                </p>
              </article>

              <article class="author-card about-mission-card reveal-node" :style="staggerStyle(3)">
                <span class="mission-sweep" aria-hidden="true"></span>
                <img v-if="about.missionImageUrl" class="about-section-image" :src="about.missionImageUrl" alt="about mission image" />
                <h3>长期目标</h3>
                <p class="line-text">{{ about.mission }}</p>
              </article>

              <article class="author-card about-links-card reveal-node" :style="staggerStyle(4)">
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
            </div>
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
                        <span>年份</span>
                        <input v-model.trim="item.year" type="text" :disabled="editState.loading" />
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
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';
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

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();

const baseTabs = [
  { key: AuthorTabKey.OVERVIEW, label: '作者主页' },
  { key: AuthorTabKey.JOURNEY, label: '建站经历' },
  { key: AuthorTabKey.POSTS, label: '作者文章' },
  { key: AuthorTabKey.ABOUT, label: '关于本站' }
];

const loading = ref(false);
const loadError = ref('');
const authorProfile = ref(createDefaultAuthorProfilePayload());
const editForm = ref(createDefaultAuthorEditForm());
const sectionImageUploadInputRef = ref(null);
const contentPanelRef = ref(null);
const journeyTimelineRef = ref(null);
const sectionEditorOpen = ref(false);
const sectionEditorSection = ref(AuthorTabKey.OVERVIEW);
const pendingSectionImagePath = ref('');
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

const updatedAtText = computed(() => {
  return formatDateTime(authorProfile.value.updatedAt || '') || '未记录';
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

  editState.uploadingAvatar = true;
  editState.error = '';
  editState.success = '';
  try {
    const payload = await uploadAuthorAvatar(file, auth.authorizedFetch);
    const url = String(payload?.url || '').trim();
    if (!url) {
      throw new Error('图片 URL 为空');
    }
    const applied = updateFormFieldByPath(targetPath, url);
    if (!applied) {
      throw new Error('图片字段写入失败');
    }
    editState.success = '图片上传成功，已自动回填 URL';
  } catch (error) {
    editState.error = readErrorMessage(error, '图片上传失败');
  } finally {
    pendingSectionImagePath.value = '';
    editState.uploadingAvatar = false;
    if (inputEl && typeof inputEl.value === 'string') {
      inputEl.value = '';
    }
  }
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

function handleContentPointerMove(event) {
  if (!isDisplayTab() || !isDesktopPointerEnabled()) return;
  const panel = contentPanelRef.value;
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
  const panel = contentPanelRef.value;
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
  const panel = contentPanelRef.value;
  const total = journey.value.length;
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

  const panel = contentPanelRef.value;
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

async function loadPublicProfile() {
  loading.value = true;
  loadError.value = '';
  try {
    await auth.ensureReady();
    const payload = await getAuthorProfile(auth.isAuthenticated.value ? auth.authorizedFetch : undefined);
    authorProfile.value = normalizeAuthorProfilePayload(payload);
    applyEditFormFromProfile(authorProfile.value);
    refreshActiveTabMotion();
  } catch (error) {
    loadError.value = readErrorMessage(error, '加载作者资料失败');
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
    editState.success = '作者资料已保存';
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

function formatDateTime(value) {
  if (!value) return '';
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) return String(value);
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')} ${String(
    date.getHours()
  ).padStart(2, '0')}:${String(date.getMinutes()).padStart(2, '0')}`;
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
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 12px;
}

.page-header {
  padding: 8px 4px 4px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 4px;
  font-size: clamp(24px, 3.6vw, 36px);
}

.page-header p {
  margin-top: 10px;
  max-width: 760px;
  color: rgba(223, 230, 249, 0.86);
}

.updated-tip {
  font-size: 12px;
  color: rgba(188, 200, 228, 0.9);
}

.dashboard-layout {
  min-height: 0;
  display: grid;
  grid-template-columns: 220px minmax(0, 1fr);
  gap: 12px;
}

.sidebar {
  --liquid-bg: rgba(20, 27, 42, 0.36);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 8px;
  align-content: start;
}

.side-item {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 12px;
  text-align: left;
  background: rgba(255, 255, 255, 0.2);
  color: rgba(233, 241, 255, 0.92);
}

.side-item.active {
  background: rgba(var(--accent-rgb), 0.26);
  color: rgb(var(--accent-strong-rgb));
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.58);
}

.content-panel {
  --liquid-bg: rgba(20, 27, 42, 0.32);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.2);
  --parallax-x: 0px;
  --parallax-y: 0px;
  --journey-progress: 0%;
  border-radius: 14px;
  padding: 14px 16px;
  overflow: auto;
  perspective: 1200px;
  position: relative;
}

.content-block {
  display: grid;
  gap: 12px;
}

.section-edit-launch {
  position: sticky;
  top: 8px;
  z-index: 8;
  display: flex;
  justify-content: flex-end;
  pointer-events: none;
}

.section-edit-btn {
  pointer-events: auto;
  width: 36px;
  height: 36px;
  border: 1px solid rgba(255, 255, 255, 0.28);
  border-radius: 999px;
  background: rgba(9, 14, 24, 0.66);
  color: rgba(234, 241, 255, 0.98);
  box-shadow: 0 10px 20px rgba(6, 10, 18, 0.25);
  transition: transform 220ms ease, border-color 220ms ease, box-shadow 220ms ease;
}

.section-edit-btn:hover {
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
  .avatar-aurora-ring,
  .mission-sweep,
  .timeline-item.is-active .timeline-node,
  .is-reveal-ready.is-revealed {
    animation: none !important;
  }

  .hero-stage,
  .overview-card,
  .shine-link,
  .timeline-item,
  .author-card,
  .is-reveal-ready,
  .section-edit-btn {
    transform: none !important;
    transition: opacity 120ms linear !important;
  }

  .is-reveal-ready {
    opacity: 1 !important;
  }

  .timeline-rail::after {
    transition: none !important;
  }
}

@media (max-width: 900px) {
  .dashboard-layout {
    grid-template-columns: 1fr;
  }

  .sidebar {
    grid-template-columns: repeat(4, minmax(0, 1fr));
  }

  .side-item {
    min-height: 34px;
    padding: 0 8px;
    text-align: center;
    font-size: 12px;
  }

  .hero-card {
    grid-template-columns: 1fr;
    justify-items: center;
    text-align: center;
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
