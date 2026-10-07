<template>
  <section class="daily-panel" aria-label="每日一图与每日老婆">
    <header class="daily-header">
      <div><p class="daily-caption">把喜欢的画师，留在每天的日常里 · 仅全年龄作品</p><h3>每日一图</h3></div>
      <time :datetime="today?.date || currentDate">{{ today?.date || currentDate }} · 北京时间</time>
    </header>
    <div v-if="!auth.isAuthenticated.value" class="empty-state">
      <p>登录后关联 Pixiv、选择喜欢的画师，领取你的每日图片和每日老婆。</p>
      <button type="button" @click="$emit('login')">登录以开启每日推荐</button>
    </div>
    <template v-else>
      <p v-if="loading" class="status-text" role="status">正在寻找今天的图片…</p>
      <div v-if="loadError" class="status-text" role="alert">{{ loadError }} <button type="button" :disabled="loading" @click="load">重试加载</button></div>
      <div v-if="today" class="daily-layout">
        <div class="gallery-area">
          <DailyArtCarousel v-if="today.artworks.length" :artworks="today.artworks" />
          <div v-else class="empty-state gallery-empty">
            <i class="fas fa-palette" aria-hidden="true"></i>
            <p>{{ recommendationHint }}</p>
            <button v-if="today.recommendationState === 'empty'" type="button" @click="openSetup">添加画师或关联 Pixiv</button>
            <button v-else type="button" :disabled="loading" @click="loadToday">重试推荐</button>
          </div>
          <p v-if="today.artworks.length" class="status-text">每天推荐至多 6 张，今日结果已保留。画师偏好调整会在明天生效。</p>
          <p v-if="today.recommendationState === 'partial'" class="status-text">部分画师暂时无法访问，已展示可用作品。</p>
        </div>
        <aside class="wife-area" aria-label="每日老婆">
          <div class="wife-heading"><span>每日老婆</span><span class="small-label">妹系角色</span></div>
          <template v-if="today.wife">
            <h4 class="character-name">{{ today.wife.name }}</h4>
            <p class="character-series">{{ today.wife.series }}</p>
            <DailyArtwork v-if="today.wife.artwork" :artwork="today.wife.artwork" portrait />
            <div v-else class="empty-state">
              <p>今天的角色已选好，图片暂时无法获取。</p>
              <button type="button" :disabled="loading" @click="loadToday">重试角色图片</button>
            </div>
            <a :href="today.wife.searchUrl" target="_blank" rel="noopener noreferrer">在 Pixiv 搜索她 <i class="fas fa-arrow-up-right-from-square" aria-hidden="true"></i></a>
          </template>
          <p class="status-text">每天固定一位，次日自动更新。</p>
        </aside>
      </div>

      <details ref="setup" class="daily-settings">
        <summary>画师与 Pixiv 账号 <span>{{ artists.length ? `${artists.length} 位画师` : '尚未添加' }}</span></summary>
        <div class="settings-body">
          <p v-if="!settingsReady" class="status-text">画师设置未加载，请先重试加载。</p>
          <div v-if="settingsReady" class="settings-columns">
            <div>
              <h4>关联 Pixiv 账号</h4>
              <p v-if="settings.connected" class="status-text">已关联 {{ settings.accountName }}（{{ settings.accountId }}）</p>
              <form class="setup-form" @submit.prevent="connect">
                <label :for="`${idPrefix}-account`">账号 ID 或主页链接</label>
                <input :id="`${idPrefix}-account`" v-model.trim="accountInput" type="text" autocomplete="off" placeholder="https://www.pixiv.net/users/你的ID" required :disabled="busy" />
                <label :for="`${idPrefix}-session`">Pixiv 登录会话（PHPSESSID）</label>
                <input :id="`${idPrefix}-session`" v-model="sessionInput" type="password" autocomplete="new-password" placeholder="粘贴 PHPSESSID 的完整值" required :disabled="busy" />
                <button type="submit" :disabled="busy || !settingsReady">{{ settings.connected ? '更新登录会话' : '关联账号' }}</button>
              </form>
              <p class="status-text">登录会话只在服务器加密保存，不会自动续期。失效后请重新获取 PHPSESSID，再点击「更新登录会话」。</p>
              <details class="session-help"><summary>如何获取 PHPSESSID？</summary><p>在浏览器登录 pixiv.net，按 F12，打开「应用程序 → Cookie → https://www.pixiv.net」，复制 PHPSESSID 的值。这里关联的是网站读取会话；会话失效后可重新粘贴更新。</p><a href="https://www.pixiv.net/" target="_blank" rel="noopener noreferrer">打开 Pixiv 登录</a></details>
              <div v-if="settings.connected" class="sync-actions">
                <label class="checkbox-label"><input v-model="includePrivate" type="checkbox" :disabled="busy" />也同步私密关注</label>
                <div class="button-row"><button type="button" :disabled="busy" @click="sync">{{ busy ? '处理中…' : '同步关注画师' }}</button><button type="button" :disabled="busy" @click="disconnect">解除关联</button></div>
                <p v-if="settings.truncated" class="status-text">关注列表较长，本次导入前 240 位以内的画师；也可手动添加其他画师。</p>
              </div>
            </div>
            <div>
              <h4>喜欢的画师</h4>
              <form class="artist-form" @submit.prevent="addArtist">
                <label :for="`${idPrefix}-artist`">画师 ID 或主页链接</label>
                <div class="input-row"><input :id="`${idPrefix}-artist`" v-model.trim="artistInput" type="text" placeholder="画师 ID / Pixiv 主页链接" :disabled="busy" required /><button type="submit" :disabled="busy">添加</button></div>
              </form>
              <p class="status-text">手动添加最多 32 位。输入名字可用下方搜索入口查找画师；同步关注不会覆盖手动添加。</p>
              <ul v-if="artists.length" class="artist-list">
                <li v-for="artist in artists" :key="artist.id"><a :href="artist.sourceUrl" target="_blank" rel="noopener noreferrer">{{ artist.name }}</a><span class="small-label">{{ artist.manual ? '手动' : '关注' }}</span><button v-if="artist.manual" type="button" :aria-label="`移除画师 ${artist.name}`" :disabled="busy" @click="removeArtist(artist.id)">移除</button></li>
              </ul>
              <p v-else class="status-text">添加第一位画师，开启每日推荐。</p>
            </div>
          </div>
          <p v-if="actionError" class="status-text error" role="alert">{{ actionError }}</p>
          <p v-if="actionHint" class="status-text" role="status">{{ actionHint }}</p>
        </div>
      </details>

      <section class="search-area" aria-label="搜索 Pixiv 插画">
        <form class="search-form" @submit.prevent="search">
          <label :for="`${idPrefix}-search`">直接搜索插画或角色</label>
          <div class="input-row"><input :id="`${idPrefix}-search`" v-model.trim="query" type="search" maxlength="80" placeholder="角色名、作品名或标签" required /><button type="submit" :disabled="searching">{{ searching ? '搜索中…' : '搜索图片' }}</button></div>
        </form>
        <a v-if="query" class="external-search" :href="`https://www.pixiv.net/search_user.php?nick=${encodeURIComponent(query)}`" target="_blank" rel="noopener noreferrer">在 Pixiv 搜索画师「{{ query }}」</a>
        <p v-if="searchError" class="status-text error" role="alert">{{ searchError }}</p>
        <p v-if="searched && !searching && !searchResults.length && !searchError" class="status-text">没有找到全年龄作品，试试角色的日文名或其他标签。</p>
        <div v-if="searchResults.length" class="search-results artwork-grid"><DailyArtwork v-for="work in searchResults" :key="work.id" :artwork="work" /></div>
      </section>
    </template>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import { createDailyArtApi, normalizeDailySettings, parsePixivUserId, shanghaiDate } from '../../services/dailyArtApi';
import DailyArtwork from './DailyArtwork.vue';
import DailyArtCarousel from './DailyArtCarousel.vue';

defineEmits(['login']);
defineProps({ idPrefix: { type: String, default: 'daily-art' } });
const auth = useAuthSession();
const settings = ref(normalizeDailySettings({}));
const settingsReady = ref(false);
const today = ref(null);
const loading = ref(false);
const busy = ref(false);
const loadError = ref('');
const actionError = ref('');
const actionHint = ref('');
const setup = ref(null);
const accountInput = ref('');
const sessionInput = ref('');
const artistInput = ref('');
const includePrivate = ref(false);
const query = ref('');
const searchResults = ref([]);
const searching = ref(false);
const searched = ref(false);
const searchError = ref('');
const currentDate = ref(shanghaiDate());
let generation = 0;
let searchGeneration = 0;
let api;
const artists = computed(() => {
  const all = new Map(settings.value.followedArtists.map(artist => [artist.id, { ...artist, manual: false }]));
  settings.value.manualArtists.forEach(artist => all.set(artist.id, { ...artist, manual: true }));
  return [...all.values()];
});
const recommendationHint = computed(() => ({
  empty: '先选几位喜欢的画师，明天也有新的相遇。',
  unavailable: '暂时无法获取画师作品，请稍后重试。',
  no_works: '这些画师暂时没有可展示的全年龄作品，可以添加其他画师。'
})[today.value?.recommendationState] || '今天的图片还未加载。');
const message = (error) => String(error?.detail || error?.message || '请求失败，请稍后重试');

function applySettings(value) {
  settings.value = value;
  settingsReady.value = true;
  accountInput.value = value.accountId;
  includePrivate.value = value.includePrivate;
}

async function load() {
  if (!api || !auth.isAuthenticated.value || loading.value) return;
  const version = generation;
  loading.value = true;
  loadError.value = '';
  const results = await Promise.allSettled([api.settings(), api.today()]);
  if (version !== generation) return;
  if (results[0].status === 'fulfilled') applySettings(results[0].value);
  if (results[1].status === 'fulfilled') today.value = results[1].value;
  loadError.value = results.filter(result => result.status === 'rejected').map(result => message(result.reason)).join('；');
  loading.value = false;
}

async function loadToday() {
  if (!api || loading.value) return;
  const version = generation;
  loading.value = true;
  loadError.value = '';
  try { const data = await api.today(); if (version === generation) today.value = data; }
  catch (error) { if (version === generation) loadError.value = message(error); }
  finally { if (version === generation) loading.value = false; }
}

async function action(run, hint) {
  if (!api || busy.value || !settingsReady.value) return;
  const version = generation;
  busy.value = true;
  actionError.value = '';
  actionHint.value = '';
  try {
    const value = await run(api);
    if (version !== generation) return;
    applySettings(value);
    actionHint.value = hint;
    await loadToday();
  } catch (error) { if (version === generation) actionError.value = message(error); }
  finally { if (version === generation) { busy.value = false; sessionInput.value = ''; } }
}

async function connect() {
  const id = parsePixivUserId(accountInput.value);
  if (!id) { actionError.value = '请输入正确的 Pixiv 账号 ID 或主页链接'; return; }
  const session = sessionInput.value;
  sessionInput.value = '';
  await action(client => client.connect(id, session), 'Pixiv 已关联，可点击「同步关注画师」导入更多画师。');
}
async function sync() { await action(client => client.sync(includePrivate.value), '关注画师已同步。已领取的今日推荐会保留，新偏好明天生效。'); }
async function disconnect() { await action(client => client.disconnect(), 'Pixiv 已解除关联，手动添加的画师仍保留。'); }
async function addArtist() {
  const id = parsePixivUserId(artistInput.value);
  if (!id) { actionError.value = '请输入画师 ID 或 Pixiv 主页链接；可用下方入口搜索画师名字'; return; }
  if (artists.value.some(artist => artist.id === id)) { actionError.value = '这位画师已经在列表中'; return; }
  if (settings.value.manualArtists.length >= 32) { actionError.value = '最多手动添加 32 位画师'; return; }
  await action(client => client.saveArtists([...settings.value.manualArtists.map(artist => artist.id), id]), '画师已添加。已领取的今日推荐会保留。');
  if (!actionError.value) artistInput.value = '';
}
async function removeArtist(id) { await action(client => client.saveArtists(settings.value.manualArtists.filter(artist => artist.id !== id).map(artist => artist.id)), '手动画师已移除。'); }
function openSetup() { if (setup.value) { setup.value.open = true; setup.value.scrollIntoView?.({ block: 'nearest' }); } }
async function search() {
  if (!api || !query.value.trim()) return;
  const version = generation;
  const request = ++searchGeneration;
  searching.value = true;
  searched.value = true;
  searchError.value = '';
  searchResults.value = [];
  try { const results = await api.search(query.value.trim()); if (version === generation && request === searchGeneration) searchResults.value = results; }
  catch (error) { if (version === generation && request === searchGeneration) searchError.value = message(error); }
  finally { if (version === generation && request === searchGeneration) searching.value = false; }
}

watch(() => [auth.isAuthenticated.value, auth.user.value?.userId], async ([authenticated, userId]) => {
  generation++;
  searchGeneration++;
  settings.value = normalizeDailySettings({});
  settingsReady.value = false;
  today.value = null;
  sessionInput.value = '';
  accountInput.value = '';
  artistInput.value = '';
  query.value = '';
  searchResults.value = [];
  searched.value = false;
  loadError.value = actionError.value = actionHint.value = searchError.value = '';
  loading.value = busy.value = searching.value = false;
  api = authenticated && userId ? createDailyArtApi(auth.authorizedFetch, userId) : null;
  if (api) await load();
}, { immediate: true });

function checkDate() {
  const next = shanghaiDate();
  if (next !== currentDate.value || (today.value && today.value.date !== next)) {
    currentDate.value = next;
    today.value = null;
    void loadToday();
  }
}
const dateTimer = setInterval(checkDate, 30000);
if (typeof document !== 'undefined') document.addEventListener('visibilitychange', checkDate);
onBeforeUnmount(() => {
  generation++;
  clearInterval(dateTimer);
  if (typeof document !== 'undefined') document.removeEventListener('visibilitychange', checkDate);
});
</script>

<style scoped>
.daily-panel { color: var(--theme-text-primary, #403843); min-width: 0; }
.daily-header { display: flex; justify-content: space-between; align-items: center; gap: 16px; margin-bottom: 18px; }
.daily-header h3 { margin: 4px 0 0; font-size: 22px; }
.daily-caption, time, .status-text, .character-series { color: var(--theme-text-secondary, #8b7885); font-size: 12px; line-height: 1.7; }
.daily-caption { margin: 0; }
time { font-variant-numeric: tabular-nums; white-space: nowrap; }
.daily-layout { display: grid; grid-template-columns: minmax(0, 2.5fr) minmax(200px, 1fr); align-items: start; gap: 22px; }
.gallery-area { min-width: 0; }
.artwork-grid { display: grid; grid-template-columns: repeat(3, minmax(0, 1fr)); align-items: start; gap: 12px; }
.wife-area { padding: 16px; border-radius: 16px; background: var(--accent-mode-fill-soft, rgba(242,179,157,.12)); border: 1px solid var(--theme-border, rgba(239,160,168,.25)); }
.wife-heading { display: flex; align-items: center; justify-content: space-between; gap: 8px; font-weight: 600; font-size: 13px; }
.small-label { font-size: 11px; font-weight: 400; color: var(--theme-text-secondary, #8b7885); }
.character-name { margin: 16px 0 3px; font-family: 'Noto Serif SC', 'Songti SC', SimSun, serif; font-size: 25px; }
.character-series { margin: 0 0 14px; }
.wife-area > a { display: inline-block; margin-top: 8px; font-size: 12px; }
.empty-state { display: grid; justify-items: start; align-content: center; gap: 8px; padding: 20px 0; font-size: 13px; line-height: 1.7; }
.empty-state p { margin: 0; }
.gallery-empty { min-height: 210px; padding: 20px; border-radius: 14px; background: var(--theme-surface-soft, rgba(255,248,245,.12)); }
.gallery-empty > i { font-size: 28px; color: var(--accent-hex, #f2b39d); margin-bottom: 4px; }
button, input { font: inherit; }
button { border: 1px solid var(--theme-border, rgba(239,160,168,.3)); border-radius: 9px; background: var(--accent-mode-fill-soft, rgba(242,179,157,.18)); color: inherit; padding: 8px 12px; cursor: pointer; font-size: 12px; }
button:disabled { opacity: .55; cursor: wait; }
button:hover:not(:disabled) { background: var(--accent-mode-fill-soft-hover, rgba(242,179,157,.3)); }
a { color: inherit; text-underline-offset: 3px; }
button:focus-visible, input:focus-visible, summary:focus-visible, a:focus-visible { outline: 2px solid var(--accent-hex, #f2b39d); outline-offset: 3px; }
input:not([type=checkbox]) { width: 100%; min-width: 0; box-sizing: border-box; color: inherit; padding: 10px 12px; border: 1px solid var(--theme-border, rgba(239,160,168,.3)); border-radius: 9px; background: var(--theme-surface-soft, rgba(255,248,245,.1)); font-size: 13px; }
.daily-settings { margin-top: 18px; border-top: 1px solid var(--theme-border, rgba(239,160,168,.25)); }
.daily-settings > summary { cursor: pointer; padding: 16px 0; font-size: 13px; font-weight: 600; }
.daily-settings > summary > span { margin-left: 12px; font-size: 11px; font-weight: 400; color: var(--theme-text-secondary, #8b7885); }
.settings-columns { display: grid; grid-template-columns: 1fr 1fr; gap: 24px; }
.settings-columns h4 { margin: 0 0 12px; font-size: 14px; }
.setup-form, .artist-form, .search-form { display: grid; gap: 8px; }
.setup-form > button { justify-self: start; }
label { font-size: 12px; }
.input-row { display: flex; gap: 8px; }
.input-row button { flex-shrink: 0; }
.session-help { font-size: 12px; line-height: 1.7; margin: 12px 0; }
.session-help summary { cursor: pointer; }
.sync-actions { display: grid; gap: 10px; margin: 14px 0; }
.checkbox-label { display: flex; align-items: center; gap: 8px; }
.button-row { display: flex; gap: 8px; flex-wrap: wrap; }
.artist-list { list-style: none; padding: 0; margin: 12px 0; max-height: 235px; overflow: auto; }
.artist-list li { display: flex; align-items: center; gap: 8px; padding: 7px 0; font-size: 12px; }
.artist-list a { flex: 1; min-width: 0; overflow-wrap: anywhere; }
.artist-list button { padding: 4px 8px; }
.search-area { border-top: 1px solid var(--theme-border, rgba(239,160,168,.25)); padding-top: 18px; margin-top: 12px; }
.search-form { max-width: 580px; }
.external-search { display: inline-block; font-size: 12px; margin-top: 12px; }
.search-results { margin-top: 18px; grid-template-columns: repeat(4, minmax(0, 1fr)); }
.error { color: var(--theme-danger, #c35469); }
@media (max-width: 900px) { .artwork-grid { grid-template-columns: repeat(2, minmax(0, 1fr)); } .search-results { grid-template-columns: repeat(3, minmax(0, 1fr)); } }
@media (max-width: 620px) { .daily-header { flex-direction: column; align-items: start; gap: 6px; } .daily-layout, .settings-columns { grid-template-columns: 1fr; } .wife-area { display: block; } .search-results { grid-template-columns: repeat(2, minmax(0, 1fr)); } }
</style>
