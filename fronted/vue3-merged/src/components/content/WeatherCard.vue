<template>
  <section class="site-widget-card weather-card" :data-motion-mode="effectiveMode" :aria-labelledby="titleId">
    <header class="widget-heading">
      <div>
        <span class="eyebrow">WEATHER</span>
        <h2 :id="titleId">{{ scope === 'nearby' ? '我的天气' : '站点天气' }}</h2>
      </div>
      <span v-if="weather?.available" class="freshness" :class="weather.freshness">
        {{ freshnessLabel }}
      </span>
    </header>

    <div v-if="loading && !weather" class="widget-state" role="status">
      <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
      <span>正在读取天气……</span>
    </div>

    <div v-else-if="weather?.available" class="weather-reading">
      <div class="weather-primary">
        <i :class="weatherIcon" aria-hidden="true"></i>
        <div>
          <strong>{{ formatTemperature(weather.temperature) }}</strong>
          <span>{{ weather.locationLabel || (scope === 'nearby' ? '附近位置' : '站点位置') }}</span>
        </div>
      </div>
      <dl class="weather-quick-facts">
        <div v-if="weather.apparentTemperature != null">
          <dt>体感</dt><dd>{{ formatTemperature(weather.apparentTemperature) }}</dd>
        </div>
        <div v-if="weather.relativeHumidity != null">
          <dt>湿度</dt><dd>{{ Math.round(weather.relativeHumidity) }}%</dd>
        </div>
        <div v-if="weather.windSpeed != null">
          <dt>风速</dt><dd>{{ formatNumber(weather.windSpeed) }} km/h</dd>
        </div>
      </dl>
    </div>

    <div v-else class="widget-state unavailable" role="status">
      <i class="fas fa-cloud" aria-hidden="true"></i>
      <strong>{{ error ? '天气读取失败' : '天气源尚未配置' }}</strong>
      <span>{{ error ? '这次没有连接到天气服务，可以稍后重新读取。' : '站点还没有可展示的观测，配置完成后会自动出现。' }}</span>
    </div>

    <div v-if="weather?.available" class="widget-actions">
      <button type="button" :aria-expanded="detailsOpen" :aria-controls="detailsId" @click="toggleDetails">
        <span>{{ detailsOpen ? '收起详情' : '查看详情' }}</span>
        <i class="fas fa-chevron-down" :class="{ rotated: detailsOpen }" aria-hidden="true"></i>
      </button>
      <button v-if="scope === 'site'" type="button" :disabled="locating" @click="requestMyWeather">
        <i class="fas fa-location-crosshairs" aria-hidden="true"></i>
        {{ locating ? '正在定位…' : '我的天气' }}
      </button>
      <button v-else type="button" @click="returnToSiteWeather">
        <i class="fas fa-building" aria-hidden="true"></i>
        返回站点天气
      </button>
    </div>

    <p v-if="feedback" class="widget-feedback" role="status">{{ feedback }}</p>

    <div v-if="detailsOpen" :id="detailsId" class="widget-details">
      <template v-if="weather?.available">
        <dl class="freshness-details">
          <div><dt>范围</dt><dd>{{ scope === 'nearby' ? '访客明确授权的附近位置' : '站长配置的站点位置' }}</dd></div>
          <div><dt>观测时间</dt><dd>{{ formatDateTime(weather.observedAt) }}</dd></div>
          <div><dt>抓取时间</dt><dd>{{ formatDateTime(weather.fetchedAt) }}</dd></div>
        </dl>
        <div v-if="weather.forecast.length" class="forecast-list" aria-label="短期天气预报">
          <article v-for="day in weather.forecast" :key="day.date">
            <time :datetime="day.date">{{ formatForecastDate(day.date) }}</time>
            <strong>{{ Math.round(day.minimumTemperature) }}° / {{ Math.round(day.maximumTemperature) }}°</strong>
            <span>降水 {{ Math.round(day.precipitationProbability) }}%</span>
          </article>
        </div>
      </template>
      <p v-else>没有当前观测，也没有仍在有效时限内的历史快照。可以稍后重试，或返回站点天气。</p>
    </div>

    <footer class="widget-provenance">
      <a
        v-if="weather?.attribution"
        :href="weather.attribution.destination"
        target="_blank"
        rel="noopener noreferrer"
      >
        Weather data by {{ weather.attribution.name }}
      </a>
      <button v-if="error && !loading" type="button" @click="retryCurrent">重新读取</button>
    </footer>
  </section>
</template>

<script setup>
import { computed, nextTick, ref, useId } from 'vue';
import { useMotionPreference } from '../../composables/useMotionPreference';
import { useSiteWeatherResource } from '../../composables/useSiteWidgets';

const props = defineProps({
  loadSite: {
    type: Function,
    default: undefined
  },
  loadNearby: {
    type: Function,
    default: undefined
  },
  geolocation: {
    type: Object,
    default: null
  }
});

const { effectiveMode } = useMotionPreference();
const componentId = useId();
const titleId = `weather-card-title-${componentId}`;
const detailsId = `weather-card-details-${componentId}`;
const resource = useSiteWeatherResource({
  loadSite: props.loadSite,
  loadNearby: props.loadNearby
});
const { data: weather, loading, error, showSiteWeather, requestNearbyWeather } = resource;
const detailsOpen = ref(false);
const scope = ref('site');
const locating = ref(false);
const feedback = ref('');
const freshnessLabel = computed(() => weather.value?.freshness === 'stale' ? '历史观测' : '最新观测');
const weatherIcon = computed(() => {
  const code = Number(weather.value?.weatherCode);
  if (code === 0) return 'fas fa-sun';
  if (code >= 1 && code <= 3) return 'fas fa-cloud-sun';
  if (code >= 51 && code <= 67) return 'fas fa-cloud-rain';
  if (code >= 71 && code <= 77) return 'fas fa-snowflake';
  if (code >= 95) return 'fas fa-cloud-bolt';
  return 'fas fa-cloud';
});

function formatNumber(value) {
  return new Intl.NumberFormat('zh-CN', { maximumFractionDigits: 1 }).format(Number(value));
}

function formatTemperature(value) {
  return `${formatNumber(value)}°`;
}

function formatDateTime(value) {
  const parsed = new Date(value || '');
  if (Number.isNaN(parsed.getTime())) return '未记录';
  return new Intl.DateTimeFormat('zh-CN', {
    month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit'
  }).format(parsed);
}

function formatForecastDate(value) {
  const parsed = new Date(`${value}T00:00:00`);
  if (Number.isNaN(parsed.getTime())) return value;
  return new Intl.DateTimeFormat('zh-CN', { weekday: 'short', month: 'numeric', day: 'numeric' }).format(parsed);
}

async function toggleDetails() {
  const scrollRoot = document.querySelector('.route-content.route-content-app-scroll')
    || document.querySelector('.route-content');
  const scrollTop = Number(scrollRoot?.scrollTop) || 0;
  detailsOpen.value = !detailsOpen.value;
  await nextTick();
  if (scrollRoot) scrollRoot.scrollTop = scrollTop;
}

function browserGeolocation() {
  return props.geolocation || globalThis.navigator?.geolocation || null;
}

async function requestMyWeather() {
  if (locating.value) return;
  feedback.value = '';
  const geolocation = browserGeolocation();
  if (typeof geolocation?.getCurrentPosition !== 'function') {
    feedback.value = '当前浏览器不支持定位，继续显示站点天气。';
    return;
  }
  locating.value = true;
  try {
    const position = await new Promise((resolve, reject) => {
      geolocation.getCurrentPosition(resolve, reject, {
        enableHighAccuracy: false,
        timeout: 8000,
        maximumAge: 300000
      });
    });
    await requestNearbyWeather({
      latitude: position.coords.latitude,
      longitude: position.coords.longitude,
      consent: true
    });
    if (resource.error.value || !resource.data.value?.available) {
      feedback.value = '附近天气暂时不可用，继续显示站点天气。';
      await showSiteWeather();
      scope.value = 'site';
      return;
    }
    scope.value = 'nearby';
    feedback.value = '已切换到你明确授权的附近天气。';
  } catch {
    feedback.value = '没有获得定位授权，继续显示站点天气。';
    scope.value = 'site';
  } finally {
    locating.value = false;
  }
}

async function returnToSiteWeather() {
  feedback.value = '';
  scope.value = 'site';
  await showSiteWeather();
}

function retryCurrent() {
  return scope.value === 'nearby'
    ? returnToSiteWeather()
    : showSiteWeather();
}
</script>

<style scoped>
.site-widget-card {
  border: 1px solid var(--theme-border-subtle);
  border-radius: 22px;
  padding: 20px;
  color: var(--theme-text-primary);
  background: var(--theme-panel-surface);
  box-shadow: var(--theme-shadow-soft);
}

.widget-heading,
.weather-primary,
.widget-actions,
.widget-provenance {
  display: flex;
  align-items: center;
}

.widget-heading { justify-content: space-between; gap: 12px; }
.eyebrow { color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); font-size: 10px; font-weight: 760; letter-spacing: .16em; }
.widget-heading h2 { margin: 5px 0 0; font-family: var(--font-display, sans-serif); font-size: 19px; }
.freshness { border-radius: 999px; padding: 4px 9px; color: var(--theme-text-secondary); background: rgba(var(--accent-rgb), .1); font-size: 10px; }
.freshness.stale { color: #d29b52; background: rgba(210, 155, 82, .12); }
.weather-reading { margin-top: 18px; }
.weather-primary { gap: 15px; }
.weather-primary > i { width: 48px; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); font-size: 34px; text-align: center; }
.weather-primary strong { display: block; font-family: var(--font-display, sans-serif); font-size: 38px; line-height: 1; }
.weather-primary span { color: var(--theme-text-secondary); font-size: 12px; }
.weather-quick-facts { margin: 18px 0 0; display: grid; grid-template-columns: repeat(3, minmax(0, 1fr)); gap: 7px; }
.weather-quick-facts div { min-width: 0; border-radius: 12px; padding: 9px; background: rgba(var(--accent-rgb), .07); }
.weather-quick-facts dt, .weather-quick-facts dd { margin: 0; font-size: 10px; }
.weather-quick-facts dt { color: var(--theme-text-tertiary); }
.weather-quick-facts dd { margin-top: 3px; color: var(--theme-text-primary); }
.widget-state { min-height: 130px; display: flex; flex-direction: column; align-items: center; justify-content: center; gap: 8px; color: var(--theme-text-tertiary); text-align: center; font-size: 12px; }
.widget-state > i { font-size: 26px; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); }
.widget-state strong { color: var(--theme-text-primary); }
.widget-actions { margin-top: 18px; flex-wrap: wrap; gap: 8px; }
.widget-actions button, .widget-provenance button { min-height: 44px; border: 1px solid var(--theme-border-subtle); border-radius: 999px; padding: 0 12px; display: inline-flex; align-items: center; gap: 7px; color: var(--theme-text-secondary); background: rgba(var(--accent-rgb), .08); font: inherit; font-size: 11px; cursor: pointer; }
.widget-actions button:focus-visible, .widget-provenance button:focus-visible, .widget-provenance a:focus-visible { outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), .72)); outline-offset: 3px; }
.widget-actions i { transition: transform 180ms ease; }
.widget-actions i.rotated { transform: rotate(180deg); }
[data-motion-mode='soothing'] .widget-actions i { transition-duration: 100ms; }
.widget-feedback { margin: 10px 0 0; color: var(--theme-text-tertiary); font-size: 11px; }
.widget-details { margin-top: 14px; border-top: 1px solid var(--theme-border-subtle); padding-top: 14px; color: var(--theme-text-secondary); font-size: 11px; }
.freshness-details { margin: 0; display: grid; gap: 7px; }
.freshness-details div { display: grid; grid-template-columns: 70px 1fr; gap: 8px; }
.freshness-details dt, .freshness-details dd { margin: 0; }
.freshness-details dt { color: var(--theme-text-tertiary); }
.forecast-list { margin-top: 13px; display: grid; grid-template-columns: repeat(3, minmax(0, 1fr)); gap: 7px; }
.forecast-list article { border-radius: 12px; padding: 9px; display: flex; flex-direction: column; gap: 4px; background: rgba(var(--accent-rgb), .07); }
.forecast-list time, .forecast-list span { color: var(--theme-text-tertiary); font-size: 9px; }
.widget-provenance { min-height: 28px; margin-top: 12px; justify-content: space-between; gap: 10px; }
.widget-provenance a { color: var(--theme-text-tertiary); font-size: 10px; }
.widget-provenance button { min-height: 36px; }
@media (max-width: 520px) { .forecast-list { grid-template-columns: 1fr; } }
</style>
