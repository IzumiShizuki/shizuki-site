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
              <h2>编辑作者主页 JSON</h2>
              <p class="line-text">可直接维护 profile_json；保存后会同步刷新当前页面展示。</p>

              <label class="editor-switch">
                <input v-model="editState.enabled" type="checkbox" :disabled="editState.loading" />
                <span>启用作者主页公开展示</span>
              </label>

              <textarea
                v-model="editState.profileJsonText"
                class="json-editor"
                spellcheck="false"
                :disabled="editState.loading"
              ></textarea>

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
import { getAdminAuthorProfile, getAuthorProfile, updateAdminAuthorProfile } from '../services/authorApi';
import {
  AuthorTabKey,
  createDefaultAuthorProfilePayload,
  normalizeAuthorProfilePayload,
  normalizeAuthorTabKey
} from './authorUiState';

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

const editState = reactive({
  enabled: true,
  profileJsonText: '',
  loading: false,
  error: '',
  success: ''
});

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

function syncEditStateFromProfile() {
  editState.enabled = authorProfile.value.enabled;
  editState.profileJsonText = JSON.stringify(authorProfile.value.profileJson, null, 2);
  editState.error = '';
  editState.success = '';
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
    syncEditStateFromProfile();
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
    syncEditStateFromProfile();
  } catch (error) {
    editState.error = readErrorMessage(error, '读取管理员作者资料失败');
  } finally {
    editState.loading = false;
  }
}

async function saveAdminProfile() {
  if (!isAdminUser.value) return;

  editState.loading = true;
  editState.error = '';
  editState.success = '';
  try {
    const parsed = JSON.parse(editState.profileJsonText || '{}');
    if (!parsed || typeof parsed !== 'object' || Array.isArray(parsed)) {
      throw new Error('profile_json 必须是 JSON 对象');
    }

    const payload = await updateAdminAuthorProfile(
      {
        enabled: editState.enabled,
        profileJson: parsed
      },
      auth.authorizedFetch
    );

    authorProfile.value = normalizeAuthorProfilePayload(payload);
    syncEditStateFromProfile();
    editState.success = '作者资料已保存';
  } catch (error) {
    if (error instanceof SyntaxError) {
      editState.error = 'JSON 格式错误，请检查后再保存';
    } else {
      editState.error = readErrorMessage(error, '保存作者资料失败');
    }
  } finally {
    editState.loading = false;
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
  gap: 10px;
}

.editor-switch {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  margin-top: 10px;
  color: rgba(226, 235, 252, 0.9);
}

.json-editor {
  width: 100%;
  min-height: 320px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(6, 11, 19, 0.72);
  color: rgba(234, 242, 255, 0.95);
  padding: 12px;
  line-height: 1.5;
  font-family: 'Roboto', 'Noto Sans SC', monospace;
}

.json-editor:focus {
  outline: none;
  border-color: rgba(var(--accent-rgb), 0.55);
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.2);
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
}
</style>
