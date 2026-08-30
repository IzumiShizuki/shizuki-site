<template>
  <section class="quote-studio" data-studio-workspace="daily-quotes">
    <header class="quote-studio__hero">
      <div>
        <p>CONTENT STUDIO · DAILY QUOTES</p>
        <h2>今日一言工作台</h2>
        <span>维护可审核的本地语录，同时守住每天唯一且不可变的快照。</span>
      </div>
      <div class="hero-actions">
        <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="loadWorkspace">
          <i class="fas fa-rotate" aria-hidden="true"></i> 重新读取
        </button>
        <button class="studio-button" type="button" @click="startNewQuote">
          <i class="fas fa-plus" aria-hidden="true"></i> 新增语录
        </button>
      </div>
    </header>

    <p v-if="errorMessage" class="studio-alert studio-alert--error" role="alert">{{ errorMessage }}</p>
    <p v-if="notice" class="studio-alert" role="status">{{ notice }}</p>

    <div class="quote-studio__grid">
      <aside class="snapshot-rail glass-panel" aria-label="今日快照状态">
        <div class="panel-heading">
          <div><small>CANONICAL</small><h3>今日快照</h3></div>
          <span class="state-dot" :data-tone="snapshotPresentation.tone">{{ snapshotPresentation.label }}</span>
        </div>

        <article class="source-card">
          <span class="source-card__icon"><i :class="sourceIcon" aria-hidden="true"></i></span>
          <div>
            <small>当前解析来源</small>
            <strong>{{ sourceLabel }}</strong>
            <p>{{ sourceDescription }}</p>
          </div>
        </article>

        <article class="snapshot-card" :data-state="todayQuote?.state || 'unavailable'">
          <blockquote v-if="todayQuote?.available">“{{ todayQuote.text }}”</blockquote>
          <blockquote v-else>当前没有可展示的快照。</blockquote>
          <p v-if="todayQuote?.available" class="snapshot-card__credit">
            <span>{{ todayQuote.author || '作者未署名' }}</span>
            <span v-if="todayQuote.sourceTitle">《{{ todayQuote.sourceTitle }}》</span>
          </p>
          <dl>
            <div><dt>有效日期</dt><dd>{{ todayQuote?.effectiveDate || '—' }}</dd></div>
            <div><dt>实际来源</dt><dd>{{ providerLabel(todayQuote?.providerCode) }}</dd></div>
            <div><dt>抓取时间</dt><dd>{{ todayQuote?.fetchedAt || '—' }}</dd></div>
          </dl>
          <a v-if="todayQuote?.sourceUrl" class="source-link" :href="todayQuote.sourceUrl" target="_blank" rel="noopener noreferrer">
            查看来源 <i class="fas fa-arrow-up-right-from-square" aria-hidden="true"></i>
          </a>
        </article>

        <p class="status-explanation" :data-tone="snapshotPresentation.tone">
          <i class="fas fa-circle-info" aria-hidden="true"></i>
          <span><strong>{{ snapshotPresentation.label }}</strong>{{ snapshotPresentation.detail }}</span>
        </p>

        <button class="studio-button refresh-button" type="button" :disabled="busy" @click="refreshSnapshot">
          <i class="fas fa-wand-magic-sparkles" aria-hidden="true"></i>
          仅补齐缺失的今日快照
        </button>
        <small class="immutable-note">若当天快照已存在，刷新会返回原快照，不会重新抽取或覆盖。</small>
      </aside>

      <main class="quote-library glass-panel">
        <div class="panel-heading">
          <div><small>CURATION LIBRARY</small><h3>本地语录库</h3></div>
          <span>{{ filteredQuotes.length }} / {{ quotes.length }}</span>
        </div>

        <div class="filter-tabs" role="tablist" aria-label="筛选语录">
          <button
            v-for="item in filters"
            :key="item.value"
            type="button"
            role="tab"
            :aria-selected="filter === item.value"
            :class="{ 'filter-tab--active': filter === item.value }"
            @click="filter = item.value"
          >{{ item.label }} <span>{{ filterCount(item.value) }}</span></button>
        </div>

        <div class="quote-list">
          <button
            v-for="quote in filteredQuotes"
            :key="quote.id"
            class="quote-list__item"
            :class="{ 'quote-list__item--active': editor.id === quote.id }"
            type="button"
            @click="selectQuote(quote)"
          >
            <span class="quote-list__meta">
              <em :data-status="quote.approvalStatus">{{ approvalLabel(quote.approvalStatus) }}</em>
              <i v-if="quote.enabled" class="fas fa-star" title="本地精选" aria-label="本地精选"></i>
              <small>{{ providerLabel(quote.providerCode) }}</small>
            </span>
            <strong>“{{ quote.text }}”</strong>
            <span class="quote-list__byline">{{ quote.author || '作者未署名' }}<template v-if="quote.sourceTitle"> · {{ quote.sourceTitle }}</template></span>
          </button>
          <p v-if="!loading && !filteredQuotes.length" class="empty-copy">此筛选下暂无真实语录。</p>
        </div>
      </main>

      <aside class="quote-editor glass-panel" aria-label="语录编辑与审核">
        <div class="panel-heading">
          <div><small>{{ editor.id ? `QUOTE #${editor.id}` : 'NEW QUOTE' }}</small><h3>{{ editor.id ? '编辑与审核' : '新增语录' }}</h3></div>
          <span v-if="editor.id">v{{ editor.version }}</span>
        </div>

        <form class="editor-form" @submit.prevent="saveQuote">
          <label class="field field--wide">语录正文
            <textarea v-model.trim="editor.text" rows="6" maxlength="1000" required placeholder="输入真实语录内容…"></textarea>
            <span>{{ editor.text.length }} / 1000</span>
          </label>
          <div class="field-row">
            <label class="field">作者 / 说话者<input v-model.trim="editor.author" maxlength="256" placeholder="可留空" /></label>
            <label class="field">作品 / 来源<input v-model.trim="editor.sourceTitle" maxlength="256" placeholder="可留空" /></label>
          </div>
          <div class="field-row">
            <label class="field">分类<input v-model.trim="editor.categoryCode" maxlength="64" placeholder="life / literature…" /></label>
            <label class="field">Provider code<input v-model.trim="editor.providerCode" maxlength="32" placeholder="LOCAL" @blur="normalizeProvider" /></label>
          </div>
          <div v-if="externalProvenanceRequired" class="external-source">
            <p><i class="fas fa-link" aria-hidden="true"></i> 外部语录必须保留可验证的来源身份。</p>
            <label class="field">Provider UUID<input v-model.trim="editor.providerUuid" maxlength="128" required /></label>
            <label class="field">HTTPS 来源链接<input v-model.trim="editor.sourceUrl" type="url" maxlength="1024" required placeholder="https://…" /></label>
          </div>
          <label v-else class="field">HTTPS 来源链接（可选）<input v-model.trim="editor.sourceUrl" type="url" maxlength="1024" placeholder="https://…" /></label>

          <div class="editor-actions">
            <button class="studio-button" type="submit" :disabled="busy || !canSave">
              <i class="fas fa-floppy-disk" aria-hidden="true"></i> {{ editor.id ? '保存修改' : '创建草稿' }}
            </button>
            <button v-if="editor.id" class="text-button text-button--danger" type="button" :disabled="busy" @click="removeQuote">移入删除状态</button>
          </div>
          <p v-if="editor.id" class="edit-warning"><i class="fas fa-shield-halved" aria-hidden="true"></i> 修改正文或来源后会自动回到“待审核”，并退出本地精选。</p>
        </form>

        <section v-if="editor.id" class="review-panel">
          <div class="section-heading"><div><small>REVIEW GATE</small><h4>审核状态</h4></div><em :data-status="editor.approvalStatus">{{ approvalLabel(editor.approvalStatus) }}</em></div>
          <p>先明确审核结论，再单独决定是否进入本地精选池；历史每日快照不会随库内容变化。</p>
          <div class="review-actions">
            <button class="review-button" type="button" :disabled="busy" @click="reviewQuote('APPROVED')"><i class="fas fa-check"></i> 批准</button>
            <button class="review-button" type="button" :disabled="busy" @click="reviewQuote('DRAFT')"><i class="fas fa-clock"></i> 待审</button>
            <button class="review-button review-button--reject" type="button" :disabled="busy" @click="reviewQuote('REJECTED')"><i class="fas fa-xmark"></i> 拒绝</button>
          </div>
          <label class="featured-switch" :class="{ 'featured-switch--disabled': editor.approvalStatus !== 'APPROVED' }">
            <span><i class="fas fa-star" aria-hidden="true"></i><strong>本地精选</strong><small>仅批准内容可参与每日本地回退与“换一句”</small></span>
            <input :checked="editor.enabled" type="checkbox" role="switch" :disabled="busy || editor.approvalStatus !== 'APPROVED'" @change="toggleFeatured" />
          </label>
        </section>
      </aside>
    </div>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import {
  createAdminQuote,
  deleteAdminQuote,
  getAdminTodayQuote,
  getAdminWidgetConfiguration,
  listAdminQuotes,
  refreshAdminDailyQuote,
  reviewAdminQuote,
  updateAdminQuote
} from '../../services/adminSiteWidgetsApi';
import { createQuoteEditor, filterAdminQuotes, quoteStatusPresentation } from './adminDailyQuoteState';

const auth = useAuthSession();
const quotes = ref([]);
const configuration = ref(null);
const todayQuote = ref(null);
const filter = ref('ALL');
const loading = ref(false);
const busy = ref(false);
const notice = ref('');
const errorMessage = ref('');
const editor = reactive(createQuoteEditor());

const filters = Object.freeze([
  { value: 'ALL', label: '全部' },
  { value: 'DRAFT', label: '待审' },
  { value: 'APPROVED', label: '已批准' },
  { value: 'REJECTED', label: '已拒绝' },
  { value: 'FEATURED', label: '本地精选' }
]);

const filteredQuotes = computed(() => filterAdminQuotes(quotes.value, filter.value));
const snapshotPresentation = computed(() => quoteStatusPresentation(todayQuote.value));
const externalProvenanceRequired = computed(() => String(editor.providerCode || 'LOCAL').toUpperCase() !== 'LOCAL');
const canSave = computed(() => {
  if (!editor.text.trim()) return false;
  if (!externalProvenanceRequired.value) return true;
  return Boolean(editor.providerUuid.trim() && /^https:\/\//iu.test(editor.sourceUrl.trim()));
});
const sourceLabel = computed(() => configuration.value?.quoteSourceMode === 'HITOKOTO' ? 'Hitokoto 主源' : '本地精选');
const sourceIcon = computed(() => configuration.value?.quoteSourceMode === 'HITOKOTO' ? 'fas fa-cloud-arrow-down' : 'fas fa-bookmark');
const sourceDescription = computed(() => {
  if (!configuration.value) return '正在读取来源配置…';
  if (configuration.value.quoteSourceMode === 'LOCAL') return '每日解析只遍历已批准且已精选的本地语录。';
  return configuration.value.hitokotoEnabled
    ? '缺失当天快照时允许联系 Hitokoto；失败后按本地与 last-good 链路回退。'
    : '来源模式为 Hitokoto，但 provider 当前已停用，不会联系上游。';
});

function messageOf(error) { return String(error?.detail || error?.message || '操作失败，请稍后重试'); }
function feedback(message = '', error = '') { notice.value = message; errorMessage.value = error; }
function approvalLabel(value) { return ({ DRAFT: '待审核', APPROVED: '已批准', REJECTED: '已拒绝' })[value] || value; }
function providerLabel(value) { return String(value || '').toUpperCase() === 'HITOKOTO' ? 'Hitokoto' : String(value || 'LOCAL').toUpperCase() === 'LOCAL' ? '本地' : String(value || '未知'); }
function filterCount(value) { return filterAdminQuotes(quotes.value, value).length; }
function normalizeProvider() { editor.providerCode = String(editor.providerCode || 'LOCAL').trim().toUpperCase() || 'LOCAL'; }
function applyEditor(value) { Object.assign(editor, createQuoteEditor(value)); }
function startNewQuote() { applyEditor(); feedback(); }
function selectQuote(value) { applyEditor(value); feedback(); }

async function loadQuotes(preferredId = editor.id) {
  quotes.value = await listAdminQuotes({}, auth.authorizedFetch);
  const selected = quotes.value.find((quote) => quote.id === preferredId);
  if (selected) applyEditor(selected);
}

async function loadWorkspace() {
  loading.value = true; feedback();
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) {
    errorMessage.value = '需要管理员登录后才能读取今日一言工作台。';
    loading.value = false;
    return;
  }
  const results = await Promise.allSettled([
    listAdminQuotes({}, auth.authorizedFetch),
    getAdminWidgetConfiguration(auth.authorizedFetch),
    getAdminTodayQuote(auth.authorizedFetch)
  ]);
  if (results[0].status === 'fulfilled') quotes.value = results[0].value;
  if (results[1].status === 'fulfilled') configuration.value = results[1].value;
  if (results[2].status === 'fulfilled') todayQuote.value = results[2].value;
  const failures = results.filter((result) => result.status === 'rejected');
  if (failures.length) errorMessage.value = failures.map((result) => messageOf(result.reason)).join('；');
  loading.value = false;
}

async function saveQuote() {
  if (!canSave.value) return;
  busy.value = true; feedback(); normalizeProvider();
  try {
    const wasExisting = Boolean(editor.id);
    const saved = wasExisting
      ? await updateAdminQuote(editor.id, editor.version, editor, auth.authorizedFetch)
      : await createAdminQuote(editor, auth.authorizedFetch);
    await loadQuotes(saved.id);
    notice.value = wasExisting ? '语录已保存，并回到待审核状态。' : '语录草稿已创建。';
  } catch (error) {
    errorMessage.value = messageOf(error);
    if (Number(error?.status) === 409 && editor.id) await loadQuotes(editor.id).catch(() => {});
  } finally { busy.value = false; }
}

async function reviewQuote(status) {
  if (!editor.id) return;
  busy.value = true; feedback();
  try {
    const reviewed = await reviewAdminQuote(editor.id, editor.version, status, false, auth.authorizedFetch);
    await loadQuotes(reviewed.id);
    notice.value = `审核状态已更新为“${approvalLabel(status)}”。`;
  } catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

async function toggleFeatured(event) {
  if (!editor.id || editor.approvalStatus !== 'APPROVED') return;
  const enabled = Boolean(event.target?.checked);
  busy.value = true; feedback();
  try {
    const reviewed = await reviewAdminQuote(editor.id, editor.version, 'APPROVED', enabled, auth.authorizedFetch);
    await loadQuotes(reviewed.id);
    notice.value = enabled ? '已加入本地精选池。' : '已退出本地精选池，历史快照不受影响。';
  } catch (error) {
    event.target.checked = !enabled;
    errorMessage.value = messageOf(error);
  } finally { busy.value = false; }
}

async function removeQuote() {
  if (!editor.id || (typeof window !== 'undefined' && !window.confirm('确认删除这条语录？历史每日快照不会被删除。'))) return;
  busy.value = true; feedback();
  try {
    await deleteAdminQuote(editor.id, editor.version, auth.authorizedFetch);
    applyEditor(); await loadQuotes(null); notice.value = '语录已删除，历史快照仍保持原始内容与来源。';
  } catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

async function refreshSnapshot() {
  busy.value = true; feedback();
  const beforeId = todayQuote.value?.snapshotId;
  try {
    await refreshAdminDailyQuote(auth.authorizedFetch);
    todayQuote.value = await getAdminTodayQuote(auth.authorizedFetch);
    notice.value = beforeId && beforeId === todayQuote.value?.snapshotId
      ? '当天快照已存在，系统保留了原有不可变快照。'
      : todayQuote.value?.state === 'current'
        ? '缺失的今日快照已补齐。'
        : '刷新完成，但仍没有今日快照；当前状态已如实保留。';
  } catch (error) { errorMessage.value = messageOf(error); }
  finally { busy.value = false; }
}

onMounted(loadWorkspace);
</script>

<style scoped>
.quote-studio { display: grid; gap: 18px; min-height: 640px; padding: clamp(16px, 2.5vw, 28px); color: var(--theme-text-primary); }
.glass-panel { border: 1px solid var(--theme-border, rgba(255,255,255,.14)); border-radius: 20px; background: linear-gradient(145deg, rgba(var(--accent-rgb),.075), transparent 42%), var(--theme-panel-surface, rgba(12,18,28,.78)); box-shadow: 0 18px 48px rgba(0,0,0,.13); backdrop-filter: blur(20px) saturate(138%); }
.quote-studio__hero, .panel-heading, .section-heading, .hero-actions, .editor-actions, .review-actions { display: flex; align-items: center; justify-content: space-between; gap: 12px; }
.quote-studio__hero p, .panel-heading small, .section-heading small { margin: 0 0 4px; color: var(--theme-text-tertiary, var(--theme-text-secondary)); font-size: 10px; font-weight: 800; letter-spacing: .14em; }
.quote-studio__hero h2, .panel-heading h3, .section-heading h4 { margin: 0; }
.quote-studio__hero > div > span { color: var(--theme-text-secondary); font-size: 12px; }
.hero-actions, .editor-actions, .review-actions { justify-content: flex-start; flex-wrap: wrap; }
.studio-button, .text-button, .filter-tab, .quote-list__item, .review-button { border: 0; color: inherit; cursor: pointer; font: inherit; }
.studio-button { display: inline-flex; align-items: center; justify-content: center; gap: 7px; min-height: 38px; padding: 8px 13px; border: 1px solid rgba(var(--accent-rgb),.34); border-radius: 12px; background: rgba(var(--accent-rgb),.18); }
.studio-button--ghost { border-color: var(--theme-border, rgba(255,255,255,.14)); background: var(--theme-panel-surface-elevated, rgba(255,255,255,.05)); }
.studio-button:disabled, .text-button:disabled, .review-button:disabled { cursor: not-allowed; opacity: .45; }
.text-button { padding: 4px; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); background: transparent; font-size: 12px; }
.text-button--danger { color: #ed8a93; }
.studio-alert { margin: 0; padding: 11px 14px; border: 1px solid rgba(52,211,153,.25); border-radius: 12px; background: rgba(52,211,153,.1); font-size: 12px; }
.studio-alert--error { border-color: rgba(248,113,113,.3); background: rgba(248,113,113,.1); }
.quote-studio__grid { display: grid; grid-template-columns: minmax(220px, .78fr) minmax(300px, 1.2fr) minmax(300px, 1.08fr); gap: 15px; align-items: start; }
.snapshot-rail, .quote-library, .quote-editor { min-width: 0; padding: 16px; }
.snapshot-rail { position: sticky; top: 16px; display: grid; gap: 13px; }
.panel-heading > span { padding: 4px 8px; border-radius: 999px; background: rgba(var(--accent-rgb),.1); color: var(--theme-text-secondary); font-size: 10px; }
.state-dot::before { display: inline-block; width: 7px; height: 7px; margin-right: 6px; border-radius: 50%; background: #94a3b8; content: ''; box-shadow: 0 0 0 4px rgba(148,163,184,.1); }
.state-dot[data-tone="fresh"]::before { background: #34d399; box-shadow: 0 0 0 4px rgba(52,211,153,.12); }
.state-dot[data-tone="stale"]::before { background: #fbbf24; box-shadow: 0 0 0 4px rgba(251,191,36,.12); }
.source-card { display: grid; grid-template-columns: 38px 1fr; gap: 10px; padding: 12px; border: 1px solid rgba(var(--accent-rgb),.16); border-radius: 15px; background: rgba(var(--accent-rgb),.065); }
.source-card__icon { display: grid; width: 38px; height: 38px; place-items: center; border-radius: 12px; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); background: rgba(var(--accent-rgb),.13); }
.source-card small { color: var(--theme-text-tertiary, var(--theme-text-secondary)); font-size: 9px; text-transform: uppercase; letter-spacing: .1em; }
.source-card strong { display: block; margin-top: 2px; }
.source-card p, .status-explanation, .immutable-note, .review-panel > p, .edit-warning { margin: 4px 0 0; color: var(--theme-text-secondary); font-size: 11px; line-height: 1.55; }
.snapshot-card { position: relative; overflow: hidden; padding: 16px; border: 1px solid var(--theme-border, rgba(255,255,255,.11)); border-radius: 17px; background: linear-gradient(135deg, rgba(var(--accent-rgb),.11), transparent 58%); }
.snapshot-card::after { position: absolute; right: -14px; top: -28px; color: rgba(var(--accent-rgb),.09); font: 900 92px/1 serif; content: '”'; pointer-events: none; }
.snapshot-card blockquote { position: relative; z-index: 1; margin: 0 0 12px; font-family: Georgia, 'Noto Serif SC', serif; font-size: clamp(16px, 1.35vw, 21px); line-height: 1.65; }
.snapshot-card__credit { display: flex; flex-wrap: wrap; gap: 6px; margin: 0 0 13px; color: var(--theme-text-secondary); font-size: 11px; }
.snapshot-card dl { display: grid; gap: 6px; margin: 0; padding-top: 11px; border-top: 1px solid var(--theme-border, rgba(255,255,255,.1)); }
.snapshot-card dl div { display: flex; justify-content: space-between; gap: 10px; font-size: 10px; }
.snapshot-card dt { color: var(--theme-text-tertiary, var(--theme-text-secondary)); }
.snapshot-card dd { margin: 0; text-align: right; overflow-wrap: anywhere; }
.source-link { display: inline-flex; gap: 5px; margin-top: 11px; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); font-size: 11px; text-decoration: none; }
.status-explanation { display: grid; grid-template-columns: 16px 1fr; gap: 7px; padding: 10px; border-radius: 12px; background: rgba(148,163,184,.08); }
.status-explanation strong { display: block; color: var(--theme-text-primary); }
.status-explanation[data-tone="stale"] { background: rgba(251,191,36,.08); }
.refresh-button { width: 100%; }
.immutable-note { display: block; margin: -5px 2px 0; }
.quote-library { display: grid; gap: 13px; max-height: calc(100vh - 138px); }
.filter-tabs { display: flex; gap: 5px; overflow-x: auto; padding-bottom: 3px; }
.filter-tab { flex: 0 0 auto; padding: 7px 9px; border-radius: 10px; color: var(--theme-text-secondary); background: transparent; font-size: 11px; }
.filter-tab span { margin-left: 3px; opacity: .7; }
.filter-tab--active { color: var(--theme-text-primary); background: rgba(var(--accent-rgb),.15); }
.quote-list { display: grid; gap: 7px; overflow: auto; padding-right: 2px; }
.quote-list__item { display: grid; gap: 7px; padding: 12px; border: 1px solid transparent; border-radius: 14px; background: transparent; text-align: left; transition: border-color .2s ease, background .2s ease, transform .2s ease; }
.quote-list__item:hover, .quote-list__item--active { border-color: rgba(var(--accent-rgb),.3); background: rgba(var(--accent-rgb),.09); transform: translateY(-1px); }
.quote-list__item strong { display: -webkit-box; overflow: hidden; -webkit-box-orient: vertical; -webkit-line-clamp: 3; line-height: 1.5; }
.quote-list__meta { display: flex; align-items: center; gap: 6px; }
.quote-list__meta em, .review-panel em { padding: 3px 6px; border-radius: 999px; color: #94a3b8; background: rgba(148,163,184,.12); font-size: 9px; font-style: normal; }
.quote-list__meta em[data-status="APPROVED"], .review-panel em[data-status="APPROVED"] { color: #6ee7b7; background: rgba(52,211,153,.1); }
.quote-list__meta em[data-status="REJECTED"], .review-panel em[data-status="REJECTED"] { color: #fda4af; background: rgba(244,63,94,.09); }
.quote-list__meta i { color: #fbbf24; font-size: 10px; }
.quote-list__meta small, .quote-list__byline { color: var(--theme-text-secondary); font-size: 10px; }
.empty-copy { color: var(--theme-text-secondary); font-size: 12px; text-align: center; }
.quote-editor { display: grid; gap: 16px; }
.editor-form, .review-panel { display: grid; gap: 12px; }
.field-row { display: grid; grid-template-columns: 1fr 1fr; gap: 9px; }
.field { display: grid; gap: 6px; color: var(--theme-text-secondary); font-size: 10px; }
.field > span { justify-self: end; margin-top: -4px; color: var(--theme-text-tertiary, var(--theme-text-secondary)); }
.field input, .field textarea { width: 100%; box-sizing: border-box; border: 1px solid var(--theme-border, rgba(255,255,255,.14)); border-radius: 11px; outline: none; color: var(--theme-text-primary); background: var(--theme-field-surface, rgba(255,255,255,.045)); font: inherit; font-size: 12px; }
.field input { min-height: 38px; padding: 8px 10px; }
.field textarea { min-height: 122px; padding: 10px; resize: vertical; line-height: 1.6; }
.field input:focus, .field textarea:focus { border-color: rgba(var(--accent-rgb),.5); box-shadow: 0 0 0 3px rgba(var(--accent-rgb),.08); }
.external-source { display: grid; gap: 9px; padding: 11px; border: 1px solid rgba(251,191,36,.18); border-radius: 13px; background: rgba(251,191,36,.055); }
.external-source p { margin: 0; color: var(--theme-text-secondary); font-size: 10px; }
.edit-warning { display: grid; grid-template-columns: 15px 1fr; gap: 5px; }
.review-panel { padding-top: 15px; border-top: 1px solid var(--theme-border, rgba(255,255,255,.1)); }
.review-button { display: inline-flex; align-items: center; gap: 5px; padding: 7px 9px; border: 1px solid var(--theme-border, rgba(255,255,255,.12)); border-radius: 10px; background: rgba(255,255,255,.045); font-size: 11px; }
.review-button:hover { border-color: rgba(52,211,153,.3); background: rgba(52,211,153,.08); }
.review-button--reject:hover { border-color: rgba(244,63,94,.3); background: rgba(244,63,94,.08); }
.featured-switch { display: flex; align-items: center; justify-content: space-between; gap: 12px; padding: 12px; border: 1px solid rgba(251,191,36,.18); border-radius: 13px; background: rgba(251,191,36,.055); }
.featured-switch > span { display: grid; grid-template-columns: 16px 1fr; align-items: center; }
.featured-switch i { grid-row: 1 / 3; color: #fbbf24; }
.featured-switch small { color: var(--theme-text-secondary); font-size: 9px; }
.featured-switch input { width: 34px; height: 19px; accent-color: rgb(var(--accent-rgb)); }
.featured-switch--disabled { opacity: .58; }
@media (max-width: 1180px) { .quote-studio__grid { grid-template-columns: minmax(220px,.8fr) minmax(0,1.2fr); } .quote-editor { grid-column: 1 / -1; } }
@media (max-width: 760px) { .quote-studio__hero { align-items: flex-start; flex-direction: column; } .quote-studio__grid { grid-template-columns: 1fr; } .snapshot-rail { position: static; } .quote-library { max-height: none; } .quote-editor { grid-column: auto; } }
@media (max-width: 520px) { .field-row { grid-template-columns: 1fr; } .hero-actions, .hero-actions .studio-button { width: 100%; } }
@media (prefers-reduced-motion: reduce) { .quote-list__item { transition: none; } .quote-list__item:hover { transform: none; } }
</style>
