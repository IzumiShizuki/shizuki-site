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

      <section class="content-panel liquid-material">
        <p v-if="loading" class="state-tip">正在同步作者主页资料...</p>
        <p v-else-if="loadError" class="error-text">{{ loadError }}</p>

        <template v-else>
          <div v-if="activeTab === 'overview'" class="content-block">
            <section class="hero-card author-card">
              <div class="hero-avatar-wrap">
                <img class="hero-avatar" :src="hero.avatarUrl" :alt="hero.name" />
                <span class="hero-badge" :class="{ off: !authorProfile.enabled }">
                  {{ authorProfile.enabled ? '公开展示' : '已关闭' }}
                </span>
              </div>
              <div class="hero-content">
                <p class="hero-greeting">{{ hero.greeting }}</p>
                <h2>{{ hero.name }}</h2>
                <p class="hero-quote">{{ hero.quote }}</p>
                <div class="chip-row">
                  <span v-for="label in identity.labels" :key="`identity-${label}`" class="chip">{{ label }}</span>
                </div>
              </div>
            </section>

            <div class="overview-grid">
              <article class="author-card">
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

              <article class="author-card">
                <h3>技能栈</h3>
                <div class="chip-row skills-grid">
                  <span v-for="skill in skills" :key="`skill-${skill}`" class="chip skill-chip">{{ skill }}</span>
                </div>
              </article>

              <article class="author-card">
                <h3>碎碎念</h3>
                <p v-for="(line, index) in about.intro" :key="`intro-${index}`" class="line-text">
                  {{ line }}
                </p>
              </article>

              <article class="author-card">
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

          <div v-else-if="activeTab === 'journey'" class="content-block timeline-wrap">
            <article v-for="(item, index) in journey" :key="`journey-${index}-${item.title}`" class="timeline-item author-card">
              <p class="timeline-year">{{ item.year }}</p>
              <h3>{{ item.title }}</h3>
              <p class="line-text">{{ item.description }}</p>
              <div class="chip-row">
                <span v-for="stack in item.stack" :key="`stack-${item.year}-${stack}`" class="chip">{{ stack }}</span>
              </div>
            </article>
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

          <div v-else-if="activeTab === 'edit'" class="content-block">
            <article v-if="!isAdminUser" class="author-card">
              <h2>编辑作者简介</h2>
              <p class="line-text">该入口仅管理员可用。</p>
            </article>

            <article v-else class="author-card editor-card">
              <h2>编辑作者主页</h2>
              <p class="line-text">通过表单维护展示字段，保存后会同步刷新当前页面展示。</p>

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
                  <input
                    ref="avatarUploadInputRef"
                    class="hidden-file-input"
                    type="file"
                    accept="image/png,image/jpeg,image/webp,image/gif"
                    :disabled="editState.loading || editState.uploadingAvatar"
                    @change="handleAvatarFileChange"
                  />
                  <button
                    class="mini-btn ripple-trigger"
                    type="button"
                    :disabled="editState.loading || editState.uploadingAvatar"
                    @click="triggerAvatarUpload"
                  >
                    {{ editState.uploadingAvatar ? '上传中...' : '上传头像并回填' }}
                  </button>
                </div>
                <img class="avatar-preview" :src="editForm.hero.avatarUrl || hero.avatarUrl" alt="avatar preview" />
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
                <h3>技能与偏好</h3>
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

              <div class="inline-actions compact">
                <button class="mini-btn ripple-trigger" type="button" :disabled="editState.loading" @click="loadAdminProfile">
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
            </article>
          </div>

          <div v-else class="content-block">
            <div class="about-grid">
              <article class="author-card">
                <h2>关于本站</h2>
                <p v-for="(line, index) in about.intro" :key="`about-intro-${index}`" class="line-text">{{ line }}</p>
              </article>

              <article class="author-card">
                <h3>长期目标</h3>
                <p class="line-text">{{ about.mission }}</p>
              </article>

              <article class="author-card">
                <h3>站点外链</h3>
                <div class="link-list">
                  <button
                    v-for="item in about.links"
                    :key="`link-${item.label}-${item.url}`"
                    type="button"
                    class="link-btn ripple-trigger"
                    @click="openLink(item.url)"
                  >
                    {{ item.label }}
                  </button>
                </div>
              </article>
            </div>
          </div>
        </template>
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref, watch } from 'vue';
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
const avatarUploadInputRef = ref(null);

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

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').toUpperCase() === 'ADMIN');
});

const tabs = computed(() => {
  const list = [...baseTabs];
  if (isAdminUser.value) {
    list.push({ key: AuthorTabKey.EDIT, label: '编辑简介' });
  }
  return list;
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

function normalizeTab(raw) {
  const normalized = normalizeAuthorTabKey(String(raw || '').trim().toLowerCase());
  if (normalized === AuthorTabKey.EDIT && !isAdminUser.value) {
    return AuthorTabKey.OVERVIEW;
  }
  return normalized;
}

function openTab(tabKey) {
  const normalized = normalizeTab(tabKey);
  if (activeTab.value === normalized) return;
  router.replace({ path: '/author', query: { tab: normalized } });
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
      avatarUrl: String(source.hero?.avatarUrl || '').trim()
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
  } catch (error) {
    loadError.value = readErrorMessage(error, '加载作者资料失败');
  } finally {
    loading.value = false;
  }
}

async function loadAdminProfile() {
  if (!isAdminUser.value) return;
  editState.loading = true;
  editState.error = '';
  editState.success = '';
  try {
    const payload = await getAdminAuthorProfile(auth.authorizedFetch);
    authorProfile.value = normalizeAuthorProfilePayload(payload);
    applyEditFormFromProfile(authorProfile.value);
  } catch (error) {
    editState.error = readErrorMessage(error, '读取管理员作者资料失败');
  } finally {
    editState.loading = false;
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

function triggerAvatarUpload() {
  if (editState.loading || editState.uploadingAvatar) return;
  avatarUploadInputRef.value?.click();
}

async function handleAvatarFileChange(event) {
  const inputEl = event?.target;
  const file = inputEl?.files?.[0];
  if (!file) return;

  editState.uploadingAvatar = true;
  editState.error = '';
  editState.success = '';
  try {
    const payload = await uploadAuthorAvatar(file, auth.authorizedFetch);
    const avatarUrl = String(payload?.url || '').trim();
    if (!avatarUrl) {
      throw new Error('头像 URL 为空');
    }
    editForm.value.hero.avatarUrl = avatarUrl;
    editState.success = '头像上传成功，已自动回填 URL';
  } catch (error) {
    editState.error = readErrorMessage(error, '头像上传失败');
  } finally {
    editState.uploadingAvatar = false;
    if (inputEl && typeof inputEl.value === 'string') {
      inputEl.value = '';
    }
  }
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
  (nextTab) => {
    if (nextTab === AuthorTabKey.EDIT && isAdminUser.value && !editState.loading) {
      loadAdminProfile();
    }
  }
);

watch(
  () => editForm.value,
  () => {
    if (suppressDirtyTracking) return;
    if (activeTab.value !== AuthorTabKey.EDIT) return;
    editState.dirty = true;
    if (editState.success) {
      editState.success = '';
    }
  },
  { deep: true }
);

onMounted(() => {
  loadPublicProfile();
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
  border-radius: 14px;
  padding: 14px 16px;
  overflow: auto;
}

.content-block {
  display: grid;
  gap: 12px;
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
}

.hero-card {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 16px;
  align-items: center;
}

.hero-avatar-wrap {
  display: grid;
  gap: 8px;
  justify-items: center;
}

.hero-avatar {
  width: 116px;
  height: 116px;
  border-radius: 50%;
  object-fit: cover;
  border: 2px solid rgba(255, 255, 255, 0.58);
  box-shadow: 0 10px 22px rgba(6, 10, 18, 0.34);
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

.hero-greeting {
  margin: 0;
  color: rgba(203, 217, 242, 0.9);
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

.timeline-wrap {
  gap: 10px;
}

.timeline-item {
  position: relative;
  overflow: hidden;
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

  .kv-row {
    grid-template-columns: 86px minmax(0, 1fr);
  }

  .field-grid.two-col {
    grid-template-columns: 1fr;
  }
}
</style>
