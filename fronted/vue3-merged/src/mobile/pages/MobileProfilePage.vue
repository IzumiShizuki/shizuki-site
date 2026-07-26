<template>
  <div class="m-profile-page">
    <header class="profile-hero m-card">
      <div class="hero-avatar">
        <img v-if="avatarUrl" :src="avatarUrl" alt="" />
        <i v-else class="fa-solid fa-circle-user" aria-hidden="true"></i>
      </div>
      <div class="hero-main">
        <h1 class="hero-name">{{ user?.nickname || '旅人' }}</h1>
        <p class="hero-sub">{{ accountEmail || `UID ${user?.userId || '—'}` }}</p>
        <div v-if="groupList.length" class="hero-groups">
          <span v-for="group in groupList" :key="group" class="group-chip">{{ group }}</span>
        </div>
      </div>
    </header>

    <section class="profile-section m-card">
      <h2 class="section-label">外观</h2>
      <div class="setting-row">
        <div class="row-main">
          <p class="row-title">夜间 / 日间模式</p>
          <p class="row-sub">{{ isDayMode ? '当前：日间' : '当前：夜间' }}</p>
        </div>
        <button
          type="button"
          class="mode-switch"
          :class="{ day: isDayMode }"
          role="switch"
          :aria-checked="isDayMode"
          aria-label="切换日夜模式"
          @click="ui.toggleThemeMode()"
        >
          <span class="switch-knob">
            <i :class="isDayMode ? 'fa-solid fa-sun' : 'fa-solid fa-moon'" aria-hidden="true"></i>
          </span>
        </button>
      </div>
    </section>

    <section v-if="isNative" class="profile-section m-card">
      <h2 class="section-label">服务器</h2>
      <div class="m-input-group">
        <label class="m-input-label" for="m-server-url">API 地址（高级设置）</label>
        <div class="m-input-row">
          <input
            id="m-server-url"
            v-model.trim="serverInput"
            class="m-input"
            type="url"
            inputmode="url"
            autocapitalize="off"
            autocomplete="off"
            spellcheck="false"
            :placeholder="defaultServer"
          />
          <button type="button" class="m-input-side m-press" @click="applyServer">保存</button>
        </div>
        <p class="row-sub server-hint">默认 {{ defaultServer }}，修改后新请求立即生效</p>
      </div>
    </section>

    <section class="profile-section m-card">
      <h2 class="section-label">更多</h2>
      <button v-if="!isNative" type="button" class="link-row m-press" @click="switchToDesktop">
        <i class="fa-solid fa-desktop" aria-hidden="true"></i>
        <span>切换到桌面版网页</span>
        <i class="fa-solid fa-chevron-right row-arrow" aria-hidden="true"></i>
      </button>
      <button type="button" class="link-row m-press" @click="openFullSite">
        <i class="fa-solid fa-globe" aria-hidden="true"></i>
        <span>打开完整网页版（博客 / 轻应用 / AI）</span>
        <i class="fa-solid fa-arrow-up-right-from-square row-arrow" aria-hidden="true"></i>
      </button>
    </section>

    <button type="button" class="logout-btn m-press" :disabled="loggingOut" @click="doLogout">
      <i class="fa-solid fa-arrow-right-from-bracket" aria-hidden="true"></i>
      {{ loggingOut ? '退出中…' : '退出登录' }}
    </button>

    <p class="version-line">Shizuki Mobile · v1</p>
  </div>
</template>

<script setup>
import { computed, onMounted, ref } from 'vue';
import { useRouter } from 'vue-router';
import { useUiPreferences } from '../../composables/useUiPreferences';
import { getApiBaseUrl, getDefaultApiBaseUrl, setApiBaseUrl } from '../../services/apiBase';
import { writeMobileShellPreference } from '../mobileMode';
import { useMobileShell } from '../mobileShellContext';

const router = useRouter();
const shell = useMobileShell();
const { auth, isNative, showToast } = shell;
const ui = useUiPreferences();

const loggingOut = ref(false);
const accountEmail = ref('');
const serverInput = ref('');

const user = computed(() => auth.user.value);
const avatarUrl = computed(() => String(user.value?.avatarUrl || '').trim());
const isDayMode = computed(() => ui.state.themeMode === 'day');
const defaultServer = computed(() => getDefaultApiBaseUrl() || 'https://site.shizuki.online');

const GROUP_LABELS = {
  ADMIN: '管理员',
  FRIEND: '挚友',
  MEMBER: '成员',
  GUEST: '访客'
};

const groupList = computed(() => {
  const groups = Array.isArray(user.value?.groups) ? user.value.groups : [];
  return groups.map((code) => GROUP_LABELS[String(code || '').toUpperCase()] || String(code || '')).filter(Boolean);
});

function applyServer() {
  const next = setApiBaseUrl(serverInput.value);
  serverInput.value = next;
  showToast(`已切换服务器：${next || '默认'}`);
}

function switchToDesktop() {
  writeMobileShellPreference('desktop');
  window.location.hash = '#/profile';
  window.location.reload();
}

function openFullSite() {
  const base = getApiBaseUrl() || defaultServer.value;
  const target = isNative ? `${base}/#/` : `${window.location.origin}/#/`;
  if (isNative) {
    window.open(target, '_blank');
  } else {
    writeMobileShellPreference('desktop');
    window.location.hash = '#/';
    window.location.reload();
  }
}

async function doLogout() {
  if (loggingOut.value) return;
  loggingOut.value = true;
  try {
    await auth.logout();
    showToast('已退出登录');
    router.replace('/m/auth');
  } catch {
    showToast('退出失败，请重试');
  } finally {
    loggingOut.value = false;
  }
}

onMounted(async () => {
  serverInput.value = getApiBaseUrl();
  try {
    const account = await auth.getAccountProfile();
    accountEmail.value = String(account?.email || '').trim();
  } catch {
    accountEmail.value = '';
  }
});
</script>

<style scoped>
.m-profile-page {
  display: flex;
  flex-direction: column;
  gap: 14px;
  max-width: 560px;
  margin: 0 auto;
  width: 100%;
}

.profile-hero {
  display: flex;
  align-items: center;
  gap: 16px;
  padding: 20px;
  background:
    linear-gradient(130deg, rgba(var(--m-grad-a), 0.16), rgba(var(--m-grad-b), 0.1)),
    var(--m-surface);
}

.hero-avatar {
  width: 68px;
  height: 68px;
  flex-shrink: 0;
  display: grid;
  place-items: center;
  border-radius: 999px;
  overflow: hidden;
  border: 2px solid rgba(var(--m-accent-rgb), 0.5);
  background: var(--m-surface-soft);
  color: var(--m-text-sub);
  font-size: 34px;
  box-shadow: 0 8px 22px rgba(var(--m-accent-rgb), 0.26);
}

.hero-avatar img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.hero-main {
  flex: 1;
  min-width: 0;
}

.hero-name {
  margin: 0;
  font-size: 20px;
  font-weight: 800;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.hero-sub {
  margin: 4px 0 0;
  font-size: 12.5px;
  color: var(--m-text-sub);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.hero-groups {
  margin-top: 8px;
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.group-chip {
  padding: 3px 10px;
  border-radius: 999px;
  border: 1px solid rgba(var(--m-accent-rgb), 0.4);
  background: rgba(var(--m-accent-rgb), 0.12);
  color: rgba(var(--m-accent-rgb), 1);
  font-size: 11px;
  font-weight: 600;
}

.profile-section {
  padding: 16px 18px;
  display: grid;
  gap: 12px;
}

.section-label {
  margin: 0;
  font-size: 11.5px;
  letter-spacing: 0.18em;
  text-transform: uppercase;
  color: var(--m-text-faint);
}

.setting-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 14px;
}

.row-main {
  flex: 1;
  min-width: 0;
}

.row-title {
  margin: 0;
  font-size: 14.5px;
  font-weight: 650;
}

.row-sub {
  margin: 3px 0 0;
  font-size: 12px;
  color: var(--m-text-faint);
}

.server-hint {
  padding-left: 4px;
}

.mode-switch {
  flex-shrink: 0;
  width: 62px;
  height: 34px;
  padding: 3px;
  border-radius: 999px;
  border: 1px solid var(--m-border-strong);
  background: var(--m-surface-soft);
  cursor: pointer;
  display: flex;
  align-items: center;
  transition: background 240ms ease;
}

.mode-switch.day {
  background: var(--m-accent-gradient);
  border-color: transparent;
}

.switch-knob {
  width: 26px;
  height: 26px;
  display: grid;
  place-items: center;
  border-radius: 999px;
  background: #fff;
  color: #8a6a5c;
  font-size: 12px;
  box-shadow: 0 2px 8px rgba(4, 8, 18, 0.3);
  transition: transform 240ms cubic-bezier(0.34, 1.4, 0.6, 1);
}

.mode-switch.day .switch-knob {
  transform: translateX(28px);
  color: #d08a3e;
}

.link-row {
  display: flex;
  align-items: center;
  gap: 13px;
  width: 100%;
  padding: 12px 6px;
  border: none;
  background: transparent;
  color: var(--m-text);
  font-size: 14px;
  text-align: left;
  cursor: pointer;
  border-radius: 12px;
}

.link-row > i:first-child {
  width: 22px;
  text-align: center;
  color: rgba(var(--m-accent-rgb), 0.9);
}

.link-row span {
  flex: 1;
  min-width: 0;
}

.row-arrow {
  color: var(--m-text-faint);
  font-size: 12px;
}

.logout-btn {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
  width: 100%;
  padding: 14px;
  border-radius: 18px;
  border: 1px solid rgba(255, 138, 138, 0.4);
  background: rgba(255, 116, 116, 0.1);
  color: #ff9d9d;
  font-size: 14.5px;
  font-weight: 700;
  cursor: pointer;
}

:root[data-theme-mode='day'] .logout-btn {
  color: #c4443f;
  border-color: rgba(196, 68, 63, 0.35);
  background: rgba(196, 68, 63, 0.07);
}

.version-line {
  margin: 4px 0 0;
  text-align: center;
  font-size: 11px;
  letter-spacing: 0.14em;
  color: var(--m-text-faint);
}
</style>
