<template>
  <section class="author-public-posts" aria-labelledby="author-posts-title">
    <header class="posts-intro author-posts-surface">
      <div>
        <span class="posts-kicker">WRITING ARCHIVE</span>
        <h2 id="author-posts-title">站点文章</h2>
        <p>从这座小站出发的公开写作，会持续沉淀在这里。</p>
      </div>
      <RouterLink class="posts-all-link ripple-trigger" :to="{ name: 'blog' }">
        浏览主博客
        <i class="fas fa-arrow-right" aria-hidden="true"></i>
      </RouterLink>
    </header>

    <section v-if="state.loading" class="posts-state author-posts-surface" role="status" aria-live="polite">
      <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
      <strong>正在读取公开文章</strong>
      <span>文章列表准备好后会显示在这里。</span>
    </section>

    <section v-else-if="state.error" class="posts-state posts-state--error author-posts-surface" role="alert">
      <i class="far fa-circle-xmark" aria-hidden="true"></i>
      <strong>文章暂时没有读到</strong>
      <span>{{ state.error }}</span>
      <button type="button" class="posts-retry ripple-trigger" @click="loadPosts">重新读取</button>
    </section>

    <section v-else-if="!state.items.length" class="posts-state author-posts-surface">
      <i class="far fa-pen-to-square" aria-hidden="true"></i>
      <strong>这里还没有公开文章</strong>
      <span>新的记录发布后，会以同样的阅读节奏出现在这里。</span>
      <RouterLink class="posts-retry ripple-trigger" :to="{ name: 'blog' }">前往主博客</RouterLink>
    </section>

    <div v-else class="posts-list" aria-label="公开文章列表">
      <RouterLink
        v-for="post in state.items"
        :key="post.postId"
        class="post-entry author-posts-surface ripple-trigger"
        :class="{ 'post-entry--with-cover': Boolean(post.coverImageUrl) }"
        :to="{ name: 'blog-detail', params: { postId: post.postId } }"
      >
        <div class="post-entry-copy">
          <div class="post-entry-context">
            <span class="post-entry-category">{{ post.categoryCode || '随笔' }}</span>
          </div>
          <h3 class="post-entry-title">{{ post.title }}</h3>
          <div class="post-entry-meta">
            <time :datetime="post.publishedAt || undefined">
              <i class="far fa-calendar" aria-hidden="true"></i>
              {{ formatDate(post.publishedAt) }}
            </time>
            <span>
              <i class="far fa-clock" aria-hidden="true"></i>
              {{ post.readingMinutes }} 分钟阅读
            </span>
          </div>
          <p class="post-entry-summary">{{ post.summary || '这篇文章暂未填写摘要。' }}</p>
          <div class="post-entry-foot">
            <span v-if="post.tags.length" class="post-tags" aria-label="文章标签">
              <span v-for="tag in post.tags.slice(0, 3)" :key="`${post.postId}-${tag}`" class="post-tag">#{{ tag }}</span>
            </span>
            <span class="post-read-more">
              阅读全文
              <i class="fas fa-arrow-right" aria-hidden="true"></i>
            </span>
          </div>
        </div>
        <img
          v-if="post.coverImageUrl"
          class="post-entry-cover"
          :src="post.coverImageUrl"
          :alt="`${post.title} 封面`"
          loading="lazy"
        />
      </RouterLink>
    </div>
  </section>
</template>

<script setup>
import { onMounted, reactive } from 'vue';
import { listPosts } from '../../services/blogApi';

const PAGE_SIZE = 12;

const state = reactive({
  loading: true,
  error: '',
  items: []
});

let requestSequence = 0;

function normalizeText(value, fallback = '') {
  const normalized = String(value ?? '').trim();
  return normalized || fallback;
}

function normalizePost(raw = {}) {
  return {
    postId: Number(raw.postId ?? raw.post_id) || 0,
    title: normalizeText(raw.title, '未命名文章'),
    summary: normalizeText(raw.summary),
    coverImageUrl: normalizeText(raw.coverImageUrl ?? raw.cover_image_url),
    categoryCode: normalizeText(raw.categoryCode ?? raw.category_code),
    tags: Array.isArray(raw.tags)
      ? raw.tags.map((item) => normalizeText(item)).filter(Boolean)
      : [],
    readingMinutes: Math.max(1, Number(raw.readingMinutes ?? raw.reading_minutes) || 1),
    publishedAt: raw.publishedAt ?? raw.published_at ?? ''
  };
}

function formatDate(value) {
  const date = new Date(value || '');
  if (Number.isNaN(date.getTime()) || date.getFullYear() <= 0) return '持续更新';
  return new Intl.DateTimeFormat('zh-CN', { year: 'numeric', month: 'short', day: 'numeric' }).format(date);
}

async function loadPosts() {
  const requestId = ++requestSequence;
  state.loading = true;
  state.error = '';
  try {
    const payload = await listPosts({ pageNo: 1, pageSize: PAGE_SIZE });
    if (requestId !== requestSequence) return;
    const items = Array.isArray(payload?.items) ? payload.items : [];
    state.items = items.map(normalizePost).filter((item) => item.postId > 0);
  } catch (error) {
    if (requestId !== requestSequence) return;
    state.items = [];
    state.error = normalizeText(error?.detail ?? error?.message, '请检查网络后重试。');
  } finally {
    if (requestId === requestSequence) state.loading = false;
  }
}

onMounted(() => {
  void loadPosts();
});
</script>

<style scoped>
.author-public-posts,
.posts-list {
  display: grid;
  gap: 14px;
  min-width: 0;
}

.author-posts-surface {
  border: 1px solid var(--theme-border);
  border-radius: 14px;
  color: var(--theme-text-primary);
  background: var(--theme-panel-surface);
  box-shadow: var(--theme-shadow-soft);
}

.posts-intro {
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 18px;
  padding: clamp(18px, 2.4vw, 26px);
}

.posts-intro > div {
  display: grid;
  gap: 6px;
}

.posts-kicker {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 750;
  letter-spacing: 0.13em;
}

.posts-intro h2,
.posts-intro p,
.post-entry h3,
.post-entry p {
  margin: 0;
}

.posts-intro h2 {
  font-size: clamp(23px, 2.5vw, 32px);
  letter-spacing: -0.02em;
}

.posts-intro p,
.post-entry p {
  color: var(--theme-text-secondary);
  line-height: 1.62;
}

.posts-all-link,
.posts-retry {
  min-height: 42px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
  padding: 0 14px;
  border: 1px solid var(--theme-border-strong);
  border-radius: 999px;
  color: var(--theme-text-primary);
  background: var(--theme-panel-surface-elevated);
  font: inherit;
  font-size: 13px;
  text-decoration: none;
  cursor: pointer;
  transition: transform 180ms ease, border-color 180ms ease, background-color 180ms ease;
}

.posts-all-link:hover,
.posts-retry:hover,
.post-entry:hover {
  border-color: rgba(var(--accent-rgb), 0.52);
}

.posts-all-link:hover,
.posts-retry:hover {
  transform: translateY(-1px);
  background: var(--theme-floating-surface-hover);
}

.posts-state {
  min-height: 220px;
  display: grid;
  place-items: center;
  align-content: center;
  gap: 9px;
  padding: 24px;
  text-align: center;
}

.posts-state > i {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 1.6rem;
}

.posts-state strong {
  font-size: 15px;
}

.posts-state span {
  max-width: 34rem;
  color: var(--theme-text-secondary);
  font-size: 13px;
  line-height: 1.55;
}

.posts-state--error > i,
.posts-state--error strong {
  color: var(--theme-danger, rgb(var(--accent-strong-rgb)));
}

.post-entry {
  min-width: 0;
  display: grid;
  grid-template-columns: minmax(0, 1fr);
  grid-template-areas: 'content';
  min-height: 176px;
  overflow: hidden;
  color: inherit;
  text-decoration: none;
  transition: transform 220ms cubic-bezier(0.22, 1, 0.36, 1), border-color 180ms ease, box-shadow 220ms ease;
}

.post-entry--with-cover {
  grid-template-columns: minmax(0, 1fr) minmax(164px, 32%);
  grid-template-areas: 'content cover';
}

.post-entry:hover {
  transform: translateY(-2px);
  box-shadow: var(--shadow-md);
}

.post-entry-cover {
  grid-area: cover;
  width: 100%;
  height: 100%;
  min-height: 176px;
  display: block;
  object-fit: cover;
  transition: transform 260ms cubic-bezier(0.22, 1, 0.36, 1);
}

.post-entry:hover .post-entry-cover {
  transform: scale(1.02);
}

.post-entry-copy {
  grid-area: content;
  min-width: 0;
  display: grid;
  align-content: start;
  gap: 8px;
  padding: clamp(18px, 2vw, 23px);
}

.post-entry-context,
.post-entry-meta {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 7px 14px;
  color: var(--theme-text-secondary);
  font-size: 11.5px;
}

.post-entry-category {
  display: inline-flex;
  align-items: center;
  min-height: 24px;
  padding: 2px 9px;
  border: 1px solid rgba(var(--accent-rgb), 0.26);
  border-radius: 999px;
  background: rgba(var(--accent-rgb), 0.1);
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-weight: 700;
  letter-spacing: 0.08em;
}

.post-entry-title {
  overflow: hidden;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
  font-size: clamp(18px, 1.8vw, 22px);
  line-height: 1.3;
  letter-spacing: -0.015em;
}

.post-entry-meta i {
  margin-right: 4px;
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
}

.post-entry-summary {
  overflow: hidden;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
  max-width: 72ch;
  font-size: 13.5px;
}

.post-entry-foot {
  min-width: 0;
  margin-top: 5px;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px 14px;
}

.post-tags {
  min-width: 0;
  display: flex;
  flex: 1 1 240px;
  flex-wrap: wrap;
  gap: 6px;
}

.post-tag {
  padding: 3px 8px;
  border-radius: 999px;
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  font-size: 11px;
  line-height: 1.35;
}

.post-read-more {
  margin-left: auto;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 12px;
  font-weight: 700;
  white-space: nowrap;
}

.post-read-more i {
  font-size: 10.5px;
  transition: transform 180ms ease;
}

.post-entry:hover .post-read-more i {
  transform: translateX(2px);
}

.posts-all-link:focus-visible,
.posts-retry:focus-visible,
.post-entry:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 3px;
}

@media (max-width: 640px) {
  .posts-intro {
    align-items: start;
    flex-direction: column;
  }

  .post-entry--with-cover {
    grid-template-columns: 1fr;
    grid-template-areas:
      'content'
      'cover';
  }

  .post-entry-cover {
    height: auto;
    aspect-ratio: 16 / 8;
    min-height: 0;
  }
}

@media (prefers-reduced-motion: reduce) {
  .posts-all-link,
  .posts-retry,
  .post-entry,
  .post-entry-cover,
  .post-read-more i,
  .posts-all-link:hover,
  .posts-retry:hover,
  .post-entry:hover,
  .post-entry:hover .post-entry-cover,
  .post-entry:hover .post-read-more i {
    transform: none;
    transition: opacity 120ms linear, border-color 120ms linear;
  }
}
</style>
