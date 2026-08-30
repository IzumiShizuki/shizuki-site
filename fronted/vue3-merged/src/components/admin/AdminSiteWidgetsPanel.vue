<template>
  <section class="widget-studio" data-studio-workspace="site-widgets">
    <header class="widget-studio__hero">
      <div><p>SITE APPEARANCE · WIDGETS</p><h2>站点组件控制台</h2><span>地点、天气来源和推荐音乐共享一套可审计的站点配置边界。</span></div>
      <button class="studio-button studio-button--ghost" type="button" :disabled="busy" @click="loadWorkspace">
        <i class="fas fa-rotate" aria-hidden="true"></i> 重新读取
      </button>
    </header>

    <p v-if="errorMessage" class="studio-alert studio-alert--error" role="alert">{{ errorMessage }}</p>
    <p v-if="notice" class="studio-alert" role="status">{{ notice }}</p>

    <div class="widget-studio__grid">
      <form class="config-panel glass-panel" @submit.prevent="saveConfiguration">
        <div class="panel-heading"><div><small>01 · LOCATION</small><h3>站点地点与时区</h3></div><span>v{{ siteForm.version }}</span></div>
        <p class="panel-copy">这是站点自己的公开地点，不是访客定位。坐标只用于获取该地点的天气。</p>

        <label class="field">公开显示名<input v-model.trim="siteForm.displayName" maxlength="128" required placeholder="例如：上海" /></label>
        <div class="field-row">
          <label class="field">纬度<input v-model="siteForm.latitude" type="number" min="-90" max="90" step="0.000001" required /></label>
          <label class="field">经度<input v-model="siteForm.longitude" type="number" min="-180" max="180" step="0.000001" required /></label>
        </div>
        <label class="field">IANA 时区
          <input v-model.trim="siteForm.timezone" list="timezone-options" maxlength="64" required placeholder="Asia/Shanghai" />
          <datalist id="timezone-options"><option v-for="timezone in timezoneOptions" :key="timezone" :value="timezone" /></datalist>
        </label>

        <section class="config-section">
          <div class="section-heading"><div><small>WEATHER POLICY</small><h4>天气策略</h4></div></div>
          <label class="switch-row"><span><strong>启用站点天气</strong><small>关闭后访客端明确显示不可用</small></span><input v-model="siteForm.weatherEnabled" type="checkbox" role="switch" /></label>
          <label class="field">last-good 最长可用时间（分钟）<input v-model.number="siteForm.weatherMaxStaleMinutes" type="number" min="15" max="10080" step="15" required /></label>
        </section>

        <section class="config-section">
          <div class="section-heading"><div><small>QUOTE SOURCE</small><h4>今日一言来源</h4></div></div>
          <label class="field">主来源
            <select v-model="siteForm.quoteSourceMode" @change="syncQuoteProvider">
              <option value="LOCAL">本地精选</option>
              <option value="HITOKOTO">Hitokoto</option>
            </select>
          </label>
          <label class="switch-row"><span><strong>允许 Hitokoto provider</strong><small>本地模式下可保持关闭，访客读取不会触发上游</small></span><input v-model="siteForm.hitokotoEnabled" type="checkbox" role="switch" :disabled="siteForm.quoteSourceMode === 'HITOKOTO'" /></label>
        </section>

        <ul v-if="configValidation.errors.length" class="validation-list" aria-label="配置校验结果">
          <li v-for="item in configValidation.errors" :key="item">{{ item }}</li>
        </ul>
        <button class="studio-button save-button" type="submit" :disabled="busy || !configValidation.valid"><i class="fas fa-floppy-disk"></i> 保存站点配置</button>
      </form>

      <section class="weather-panel glass-panel" aria-label="天气刷新状态">
        <div class="panel-heading">
          <div><small>02 · LAST-GOOD</small><h3>天气刷新状态</h3></div>
          <span class="freshness-pill" :data-freshness="weather?.freshness || 'unavailable'">{{ weatherFreshnessLabel }}</span>
        </div>
        <p class="panel-copy">这里只显示归一化后的公开天气事实；provider 内部异常与访客位置不会进入界面。</p>

        <article class="weather-orb" :data-freshness="weather?.freshness || 'unavailable'">
          <span class="weather-orb__icon"><i :class="weatherIcon" aria-hidden="true"></i></span>
          <div><small>{{ weather?.locationLabel || siteForm.displayName || '站点地点' }}</small><strong>{{ weather?.available ? `${weather.temperature}°` : '—' }}</strong><p>{{ weatherSummary }}</p></div>
        </article>

        <dl class="weather-facts">
          <div><dt>观测时间</dt><dd>{{ weather?.observedAt || '—' }}</dd></div>
          <div><dt>抓取时间</dt><dd>{{ weather?.fetchedAt || '—' }}</dd></div>
          <div><dt>体感 / 湿度</dt><dd>{{ weather?.available ? `${weather.apparentTemperature ?? '—'}° / ${weather.relativeHumidity ?? '—'}%` : '—' }}</dd></div>
          <div><dt>最长 stale</dt><dd>{{ staleAgeLabel }}</dd></div>
          <div><dt>数据归属</dt><dd><a v-if="weather?.attribution?.destination" :href="weather.attribution.destination" target="_blank" rel="noopener noreferrer">{{ weather.attribution.name }}</a><span v-else>—</span></dd></div>
        </dl>

        <div v-if="weather?.forecast?.length" class="forecast-strip" aria-label="天气预报">
          <article v-for="day in weather.forecast.slice(0, 4)" :key="day.date"><small>{{ day.date }}</small><strong>{{ day.minimumTemperature }}° / {{ day.maximumTemperature }}°</strong><span>降水 {{ day.precipitationProbability }}%</span></article>
        </div>
        <p v-else class="weather-empty">{{ weather?.freshness === 'stale' ? '当前使用 last-good 快照，预报以该快照内容为准。' : '当前没有可用的真实天气预报。' }}</p>

        <button class="studio-button weather-refresh" type="button" :disabled="busy || !siteForm.weatherEnabled" @click="refreshWeather">
          <i class="fas fa-cloud-arrow-down" aria-hidden="true"></i> 检查并按策略刷新
        </button>
        <small class="privacy-note"><i class="fas fa-shield-halved"></i> 不提交、不保存、不显示任何访客定位坐标。</small>
      </section>

      <form class="music-panel glass-panel" @submit.prevent="saveMusicProfile">
        <div class="panel-heading"><div><small>03 · GLOBAL PLAYER</small><h3>推荐音乐资料</h3></div><span>{{ musicTracks.length }} 首</span></div>
        <p class="panel-copy">只修改全局默认推荐歌单的展示资料，不替换、不清空现有曲目，也不会触发自动播放。</p>

        <div class="music-preview">
          <span class="music-cover"><img v-if="musicCoverPreview" :src="musicCoverPreview" alt="推荐歌单封面预览" @error="coverFailed = true" /><i v-else class="fas fa-music"></i></span>
          <div><small>DEFAULT_PUBLIC</small><strong>{{ musicForm.name || '默认歌单' }}</strong><p>{{ musicForm.description || '尚未填写歌单简介' }}</p></div>
        </div>

        <label class="field">歌单名称<input v-model.trim="musicForm.name" maxlength="256" required /></label>
        <label class="field">歌单简介<textarea v-model.trim="musicForm.description" rows="4" maxlength="1024"></textarea></label>
        <label class="field">HTTPS 封面地址<input v-model.trim="musicForm.cover" type="url" maxlength="1024" placeholder="https://…" @input="coverFailed = false" /></label>
        <p v-if="!musicProfileValid" class="inline-error">封面地址必须为空或使用 HTTPS。</p>

        <div class="track-peek">
          <div class="section-heading"><div><small>UNCHANGED TRACKS</small><h4>现有曲目保持不变</h4></div></div>
          <article v-for="track in musicTracks.slice(0, 4)" :key="`${track.provider}:${track.trackId}`"><span><strong>{{ track.title || track.trackId }}</strong><small>{{ track.artist || track.provider }}</small></span><em>{{ track.enabled ? '启用' : '停用' }}</em></article>
          <p v-if="!musicTracks.length">默认推荐歌单当前没有曲目；这里不会生成示例音乐。</p>
        </div>

        <button class="studio-button save-button" type="submit" :disabled="busy || !musicProfileValid"><i class="fas fa-compact-disc"></i> 保存推荐歌单资料</button>
      </form>
    </div>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import { getAdminDefaultPlaylistBundle, updateAdminDefaultPlaylistProfile } from '../../services/musicApi';
import { getAdminSiteWeather, getAdminWidgetConfiguration, saveAdminWidgetConfiguration } from '../../services/adminSiteWidgetsApi';
import { createSiteWidgetForm, normalizeMusicBundle, validateSiteWidgetForm } from './adminSiteWidgetState';

const auth = useAuthSession();
const siteForm = reactive(createSiteWidgetForm());
const musicForm = reactive({ playlistCode: 'default_public', name: '', description: '', cover: '' });
const weather = ref(null);
const musicTracks = ref([]);
const busy = ref(false);
const notice = ref('');
const errorMessage = ref('');
const coverFailed = ref(false);
const timezoneOptions = Object.freeze(['Asia/Shanghai', 'Asia/Tokyo', 'Asia/Hong_Kong', 'Asia/Singapore', 'UTC', 'Europe/London', 'America/New_York']);

const configValidation = computed(() => validateSiteWidgetForm(siteForm));
const musicProfileValid = computed(() => Boolean(musicForm.name.trim()) && (!musicForm.cover.trim() || /^https:\/\//iu.test(musicForm.cover.trim())));
const musicCoverPreview = computed(() => musicProfileValid.value && musicForm.cover.trim() && !coverFailed.value ? musicForm.cover.trim() : '');
const weatherFreshnessLabel = computed(() => ({ fresh: '新鲜', stale: 'last-good', unavailable: '不可用' })[weather.value?.freshness] || '不可用');
const staleAgeLabel = computed(() => {
  const minutes = Number(siteForm.weatherMaxStaleMinutes) || 0;
  return minutes >= 1440 && minutes % 1440 === 0 ? `${minutes / 1440} 天` : minutes >= 60 && minutes % 60 === 0 ? `${minutes / 60} 小时` : `${minutes} 分钟`;
});
const weatherSummary = computed(() => {
  if (!weather.value?.available) return '没有可用快照，访客端会显示真实空态。';
  if (weather.value.freshness === 'stale') return '上游或缓存链路未刷新成功，当前显示仍在允许时效内的 last-good。';
  return `风速 ${weather.value.windSpeed ?? '—'} km/h · 天气代码 ${weather.value.weatherCode}`;
});
const weatherIcon = computed(() => weather.value?.available ? (weather.value.freshness === 'stale' ? 'fas fa-cloud-moon' : 'fas fa-cloud-sun') : 'fas fa-cloud-circle-exclamation');

function messageOf(error) { return String(error?.detail || error?.message || '操作失败，请稍后重试'); }
function feedback(message = '', error = '') { notice.value = message; errorMessage.value = error; }
function applyConfiguration(value) { Object.assign(siteForm, createSiteWidgetForm(value || {})); }
function applyMusic(value) {
  const bundle = normalizeMusicBundle(value);
  Object.assign(musicForm, bundle.profile);
  musicTracks.value = bundle.tracks;
  coverFailed.value = false;
}
function syncQuoteProvider() { if (siteForm.quoteSourceMode === 'HITOKOTO') siteForm.hitokotoEnabled = true; }

async function loadWorkspace() {
  busy.value = true; feedback();
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) { errorMessage.value = '需要管理员登录后才能读取站点组件配置。'; busy.value = false; return; }
  const results = await Promise.allSettled([
    getAdminWidgetConfiguration(auth.authorizedFetch),
    getAdminSiteWeather(auth.authorizedFetch),
    getAdminDefaultPlaylistBundle(auth.authorizedFetch)
  ]);
  if (results[0].status === 'fulfilled') applyConfiguration(results[0].value);
  if (results[1].status === 'fulfilled') weather.value = results[1].value;
  if (results[2].status === 'fulfilled') applyMusic(results[2].value);
  const failures = [];
  if (results[0].status === 'rejected') failures.push(messageOf(results[0].reason));
  if (results[1].status === 'rejected') failures.push('天气状态读取失败，请稍后重试。');
  if (results[2].status === 'rejected') failures.push('推荐音乐资料读取失败，请稍后重试。');
  if (failures.length) errorMessage.value = failures.join('；');
  busy.value = false;
}

async function saveConfiguration() {
  if (!configValidation.value.valid) return;
  busy.value = true; feedback();
  try {
    const saved = await saveAdminWidgetConfiguration(siteForm, auth.authorizedFetch);
    applyConfiguration(saved);
    weather.value = await getAdminSiteWeather(auth.authorizedFetch).catch(() => weather.value);
    notice.value = '站点地点、时区与 provider 策略已保存，相关缓存已按服务端规则失效。';
  } catch (error) {
    errorMessage.value = Number(error?.status) === 409 ? '配置已被另一会话修改，已重新读取服务器版本，请核对后再保存。' : messageOf(error);
    if (Number(error?.status) === 409) {
      const latest = await getAdminWidgetConfiguration(auth.authorizedFetch).catch(() => null);
      if (latest) applyConfiguration(latest);
    }
  } finally { busy.value = false; }
}

async function refreshWeather() {
  busy.value = true; feedback();
  try {
    weather.value = await getAdminSiteWeather(auth.authorizedFetch);
    notice.value = weather.value.freshness === 'fresh'
      ? '天气状态已读取，当前快照新鲜。'
      : weather.value.freshness === 'stale'
        ? '刷新未得到新快照，系统仍在安全时效内使用 last-good。'
        : '刷新完成，但没有可用天气事实；访客端会显示真实空态。';
  } catch { errorMessage.value = '天气刷新失败，请稍后重试；provider 内部错误未向界面暴露。'; }
  finally { busy.value = false; }
}

async function saveMusicProfile() {
  if (!musicProfileValid.value) return;
  busy.value = true; feedback();
  try {
    const saved = await updateAdminDefaultPlaylistProfile({ ...musicForm, playlistCode: 'default_public' }, auth.authorizedFetch);
    Object.assign(musicForm, normalizeMusicBundle({ profile: saved }).profile);
    notice.value = `推荐歌单资料已保存，${musicTracks.value.length} 首现有曲目保持不变。`;
  } catch { errorMessage.value = '推荐歌单资料保存失败，请核对名称和 HTTPS 封面地址后重试。'; }
  finally { busy.value = false; }
}

onMounted(loadWorkspace);
</script>

<style scoped>
.widget-studio { display: grid; gap: 18px; min-height: 640px; padding: clamp(16px,2.5vw,28px); color: var(--theme-text-primary); }
.glass-panel { border: 1px solid var(--theme-border,rgba(255,255,255,.14)); border-radius: 20px; background: linear-gradient(145deg,rgba(var(--accent-rgb),.075),transparent 44%),var(--theme-panel-surface,rgba(12,18,28,.78)); box-shadow: 0 18px 48px rgba(0,0,0,.13); backdrop-filter: blur(20px) saturate(138%); }
.widget-studio__hero,.panel-heading,.section-heading,.switch-row { display:flex; align-items:center; justify-content:space-between; gap:12px; }
.widget-studio__hero p,.panel-heading small,.section-heading small { margin:0 0 4px; color:var(--theme-text-tertiary,var(--theme-text-secondary)); font-size:10px; font-weight:800; letter-spacing:.14em; }
.widget-studio__hero h2,.panel-heading h3,.section-heading h4 { margin:0; }
.widget-studio__hero span,.panel-copy { color:var(--theme-text-secondary); font-size:12px; }
.studio-button { display:inline-flex; align-items:center; justify-content:center; gap:7px; min-height:38px; padding:8px 13px; border:1px solid rgba(var(--accent-rgb),.34); border-radius:12px; color:inherit; background:rgba(var(--accent-rgb),.18); cursor:pointer; font:inherit; }
.studio-button--ghost { border-color:var(--theme-border,rgba(255,255,255,.14)); background:var(--theme-panel-surface-elevated,rgba(255,255,255,.05)); }
.studio-button:disabled { cursor:not-allowed; opacity:.45; }
.studio-alert { margin:0; padding:11px 14px; border:1px solid rgba(52,211,153,.25); border-radius:12px; background:rgba(52,211,153,.1); font-size:12px; }
.studio-alert--error { border-color:rgba(248,113,113,.3); background:rgba(248,113,113,.1); }
.widget-studio__grid { display:grid; grid-template-columns:minmax(270px,1fr) minmax(260px,.9fr) minmax(280px,1fr); gap:15px; align-items:start; }
.config-panel,.weather-panel,.music-panel { display:grid; gap:13px; min-width:0; padding:17px; }
.panel-heading > span,.freshness-pill { padding:4px 8px; border-radius:999px; color:var(--theme-text-secondary); background:rgba(var(--accent-rgb),.1); font-size:10px; }
.panel-copy { margin:0; line-height:1.55; }
.field-row { display:grid; grid-template-columns:1fr 1fr; gap:9px; }
.field { display:grid; gap:6px; color:var(--theme-text-secondary); font-size:10px; }
.field input,.field select,.field textarea { width:100%; box-sizing:border-box; border:1px solid var(--theme-border,rgba(255,255,255,.14)); border-radius:11px; outline:none; color:var(--theme-text-primary); background:var(--theme-field-surface,rgba(255,255,255,.045)); font:inherit; font-size:12px; }
.field input,.field select { min-height:38px; padding:8px 10px; }
.field textarea { padding:10px; resize:vertical; line-height:1.55; }
.field input:focus,.field select:focus,.field textarea:focus { border-color:rgba(var(--accent-rgb),.5); box-shadow:0 0 0 3px rgba(var(--accent-rgb),.08); }
.config-section { display:grid; gap:10px; padding-top:13px; border-top:1px solid var(--theme-border,rgba(255,255,255,.1)); }
.switch-row { padding:10px; border-radius:13px; background:rgba(var(--accent-rgb),.055); }
.switch-row span { display:grid; gap:2px; }
.switch-row small { color:var(--theme-text-secondary); font-size:9px; }
.switch-row input { width:35px; height:19px; accent-color:rgb(var(--accent-rgb)); }
.validation-list { display:grid; gap:4px; margin:0; padding:9px 9px 9px 27px; border-radius:11px; color:#fca5a5; background:rgba(248,113,113,.08); font-size:10px; }
.save-button,.weather-refresh { width:100%; }
.freshness-pill[data-freshness="fresh"] { color:#6ee7b7; background:rgba(52,211,153,.1); }
.freshness-pill[data-freshness="stale"] { color:#fcd34d; background:rgba(251,191,36,.1); }
.weather-orb { display:grid; grid-template-columns:60px 1fr; align-items:center; gap:13px; min-height:112px; padding:15px; border:1px solid rgba(var(--accent-rgb),.16); border-radius:18px; background:radial-gradient(circle at 16% 20%,rgba(var(--accent-rgb),.18),transparent 45%),rgba(var(--accent-rgb),.05); }
.weather-orb__icon { display:grid; width:60px; aspect-ratio:1; place-items:center; border-radius:18px; color:rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); background:rgba(var(--accent-rgb),.12); font-size:24px; }
.weather-orb small { color:var(--theme-text-secondary); font-size:10px; }
.weather-orb strong { display:block; font-size:34px; line-height:1.2; }
.weather-orb p { margin:2px 0 0; color:var(--theme-text-secondary); font-size:10px; line-height:1.45; }
.weather-facts { display:grid; gap:7px; margin:0; padding:12px; border-radius:14px; background:rgba(255,255,255,.025); }
.weather-facts div { display:flex; justify-content:space-between; gap:10px; font-size:10px; }
.weather-facts dt { color:var(--theme-text-secondary); }
.weather-facts dd { margin:0; text-align:right; overflow-wrap:anywhere; }
.weather-facts a { color:rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); }
.forecast-strip { display:grid; grid-template-columns:repeat(2,1fr); gap:7px; }
.forecast-strip article { display:grid; gap:3px; padding:9px; border-radius:11px; background:rgba(var(--accent-rgb),.055); }
.forecast-strip small,.forecast-strip span,.weather-empty,.privacy-note { color:var(--theme-text-secondary); font-size:9px; }
.weather-empty { margin:0; padding:12px; text-align:center; }
.privacy-note { display:flex; gap:6px; line-height:1.5; }
.music-preview { display:grid; grid-template-columns:72px 1fr; align-items:center; gap:13px; padding:13px; border:1px solid rgba(var(--accent-rgb),.16); border-radius:17px; background:linear-gradient(135deg,rgba(var(--accent-rgb),.12),transparent); }
.music-cover { display:grid; width:72px; aspect-ratio:1; overflow:hidden; place-items:center; border-radius:19px; color:rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); background:rgba(var(--accent-rgb),.12); font-size:22px; }
.music-cover img { width:100%; height:100%; object-fit:cover; }
.music-preview small { color:rgb(var(--accent-readable-rgb,var(--accent-strong-rgb))); font-size:9px; letter-spacing:.1em; }
.music-preview strong { display:block; margin:3px 0; }
.music-preview p { display:-webkit-box; margin:0; overflow:hidden; color:var(--theme-text-secondary); font-size:10px; -webkit-box-orient:vertical; -webkit-line-clamp:2; }
.inline-error { margin:-5px 0 0; color:#fca5a5; font-size:10px; }
.track-peek { display:grid; gap:7px; padding-top:13px; border-top:1px solid var(--theme-border,rgba(255,255,255,.1)); }
.track-peek article { display:flex; justify-content:space-between; gap:8px; padding:8px 9px; border-radius:10px; background:rgba(255,255,255,.025); }
.track-peek article span { display:grid; min-width:0; }
.track-peek article strong,.track-peek article small { overflow:hidden; text-overflow:ellipsis; white-space:nowrap; }
.track-peek article strong { font-size:11px; }.track-peek article small,.track-peek em,.track-peek > p { color:var(--theme-text-secondary); font-size:9px; font-style:normal; }
@media (max-width:1180px) { .widget-studio__grid { grid-template-columns:1fr 1fr; }.music-panel { grid-column:1/-1; } }
@media (max-width:760px) { .widget-studio__hero { align-items:flex-start; flex-direction:column; }.widget-studio__grid { grid-template-columns:1fr; }.music-panel { grid-column:auto; } }
@media (max-width:500px) { .field-row { grid-template-columns:1fr; }.widget-studio__hero .studio-button { width:100%; } }
@media (prefers-reduced-motion:reduce) { * { scroll-behavior:auto!important; transition:none!important; } }
</style>
