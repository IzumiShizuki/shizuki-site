<template>
  <section class="route-page auth-page" :class="pageThemeClass" :style="pageStyle">
    <div v-if="theme.bgImage" class="bg-image-layer" aria-hidden="true"></div>
    <div v-else class="bg-aurora" aria-hidden="true"></div>

    <div class="kawaii-decor" aria-hidden="true">
      <span class="deco-star s1">✦</span>
      <span class="deco-heart h1">♡</span>
      <span class="deco-star s2">✧</span>
      <span class="deco-heart h2">♥</span>
      <span class="deco-star s3">✧</span>
      <span class="deco-heart h3">♡</span>
      <span class="deco-cloud c1"></span>
      <span class="deco-cloud c2"></span>
      <span class="deco-star s4">✦</span>
      <span class="deco-heart h4">♥</span>
      <span class="deco-cloud c3"></span>
      <span class="deco-star s5">✧</span>
    </div>

    <div class="auth-center">
      <header class="hero" :class="{ 'hero-dark': activePreset.dark }">
        <div class="mascot-frame">
          <img v-if="theme.mascotImage" :src="theme.mascotImage" class="mascot-img" alt="看板娘" />
          <div v-else class="mascot-css" aria-hidden="true">
            <div class="blob-body">
              <span class="ear left"></span>
              <span class="ear right"></span>
              <span class="eye left"></span>
              <span class="eye right"></span>
              <span class="blush left"></span>
              <span class="blush right"></span>
              <span class="mouth"></span>
              <span class="whisker left"></span>
              <span class="whisker right"></span>
            </div>
          </div>
          <span class="sparkle t1">✦</span>
          <span class="sparkle t2">♡</span>
          <span class="sparkle t3">✧</span>
        </div>

        <p class="greeting">嗨，欢迎回来 ♡</p>
        <h1>Shizuki 账户入口</h1>
        <p class="hero-desc">
          登录、注册与找回密码都在这里，OAuth 也可以直接快捷登录。
        </p>
        <p v-if="reasonHint" class="reason-hint">{{ reasonHint }}</p>

        <button class="customize-btn ripple-trigger" type="button" aria-label="自定义登录页图片与主题" @click="themePanelOpen = !themePanelOpen">
          <span class="customize-icon">✦</span>
          {{ themePanelOpen ? '收起自定义' : '自定义图片' }}
        </button>
      </header>

      <section class="auth-shell">
        <div class="auth-tabs" role="tablist" aria-label="账户操作">
          <button class="tab-btn ripple-trigger" :class="{ active: activeMode === 'login' }" type="button" role="tab" @click="setMode('login')">
            登录
          </button>
          <button class="tab-btn ripple-trigger" :class="{ active: activeMode === 'register' }" type="button" role="tab" @click="setMode('register')">
            注册
          </button>
          <button class="tab-btn ripple-trigger" :class="{ active: activeMode === 'forgot' }" type="button" role="tab" @click="setMode('forgot')">
            忘记密码
          </button>
        </div>

        <div v-if="initializing" class="state-tip">正在恢复会话状态...</div>

        <form v-else-if="activeMode === 'login'" class="auth-form" @submit.prevent="submitLogin">
          <label class="field-label" for="login-email">邮箱</label>
          <input id="login-email" v-model.trim="loginForm.email" class="field-input" type="email" autocomplete="email" placeholder="you@example.com" required />

          <label class="field-label" for="login-password">密码</label>
          <input
            id="login-password"
            v-model="loginForm.password"
            class="field-input"
            type="password"
            autocomplete="current-password"
            placeholder="输入你的密码"
            required
          />

          <button class="primary-btn ripple-trigger" type="submit" :disabled="loginSubmitting">
            <span v-if="!loginSubmitting" class="btn-sparkle">♡</span>
            {{ loginSubmitting ? '登录中...' : '邮箱登录' }}
          </button>
          <p v-if="loginError" class="error-text">{{ loginError }}</p>

          <div class="oauth-block">
            <p class="oauth-title">或使用 OAuth 快捷登录</p>
            <div class="oauth-actions">
              <button class="oauth-btn ripple-trigger" type="button" :disabled="oauthSubmitting" @click="startOAuth('github')">
                GitHub
              </button>
              <button class="oauth-btn ripple-trigger" type="button" :disabled="oauthSubmitting" @click="startOAuth('linuxdo')">
                LinuxDo
              </button>
            </div>
            <p v-if="oauthError" class="error-text">{{ oauthError }}</p>
          </div>
        </form>

        <form v-else-if="activeMode === 'register'" class="auth-form" @submit.prevent="submitRegister">
          <label class="field-label" for="register-nickname">昵称</label>
          <input id="register-nickname" v-model.trim="registerForm.nickname" class="field-input" type="text" autocomplete="nickname" placeholder="怎么称呼你？" required />

          <label class="field-label" for="register-email">邮箱</label>
          <input id="register-email" v-model.trim="registerForm.email" class="field-input" type="email" autocomplete="email" placeholder="you@example.com" required />

          <label class="field-label" for="register-password">密码</label>
          <input
            id="register-password"
            v-model="registerForm.password"
            class="field-input"
            type="password"
            autocomplete="new-password"
            minlength="8"
            placeholder="至少 8 位"
            required
          />

          <label class="field-label" for="register-captcha-answer">图形验证码</label>
          <div class="captcha-row">
            <input
              id="register-captcha-answer"
              v-model.trim="registerForm.captchaAnswer"
              class="field-input grow"
              type="text"
              autocomplete="off"
              placeholder="算一算等于几？"
              required
            />
            <button class="captcha-preview ripple-trigger" type="button" :disabled="captchaLoading" aria-label="刷新图形验证码" @click="refreshCaptcha">
              <span v-if="captchaLoading" class="captcha-loading">刷新中...</span>
              <span v-else class="captcha-svg" v-html="captcha.svgContent || placeholderCaptcha"></span>
            </button>
          </div>

          <label class="field-label" for="register-email-code">邮箱验证码</label>
          <div class="inline-actions">
            <input id="register-email-code" v-model.trim="registerForm.emailCode" class="field-input grow" type="text" autocomplete="off" placeholder="6 位验证码" required />
            <button class="ghost-btn ripple-trigger" type="button" :disabled="registerCodeLocked" @click="sendRegisterCode">
              {{ registerCodeButtonText }}
            </button>
          </div>

          <button class="primary-btn ripple-trigger" type="submit" :disabled="registerSubmitting">
            <span v-if="!registerSubmitting" class="btn-sparkle">♡</span>
            {{ registerSubmitting ? '注册中...' : '提交注册并登录' }}
          </button>
          <p v-if="registerError" class="error-text">{{ registerError }}</p>
          <p v-if="sendCodeError" class="error-text">{{ sendCodeError }}</p>
        </form>

        <form v-else class="auth-form" @submit.prevent="submitForgotPassword">
          <label class="field-label" for="forgot-email">邮箱</label>
          <input id="forgot-email" v-model.trim="forgotForm.email" class="field-input" type="email" autocomplete="email" placeholder="you@example.com" required />

          <label class="field-label" for="forgot-captcha-answer">图形验证码</label>
          <div class="captcha-row">
            <input
              id="forgot-captcha-answer"
              v-model.trim="forgotForm.captchaAnswer"
              class="field-input grow"
              type="text"
              autocomplete="off"
              placeholder="算一算等于几？"
              required
            />
            <button class="captcha-preview ripple-trigger" type="button" :disabled="captchaLoading" aria-label="刷新图形验证码" @click="refreshCaptcha">
              <span v-if="captchaLoading" class="captcha-loading">刷新中...</span>
              <span v-else class="captcha-svg" v-html="captcha.svgContent || placeholderCaptcha"></span>
            </button>
          </div>

          <label class="field-label" for="forgot-email-code">邮箱验证码</label>
          <div class="inline-actions">
            <input id="forgot-email-code" v-model.trim="forgotForm.emailCode" class="field-input grow" type="text" autocomplete="off" placeholder="6 位验证码" required />
            <button class="ghost-btn ripple-trigger" type="button" :disabled="forgotCodeLocked" @click="sendForgotCode">
              {{ forgotCodeButtonText }}
            </button>
          </div>

          <label class="field-label" for="forgot-password">新密码</label>
          <input
            id="forgot-password"
            v-model="forgotForm.newPassword"
            class="field-input"
            type="password"
            minlength="8"
            autocomplete="new-password"
            placeholder="至少 8 位"
            required
          />

          <label class="field-label" for="forgot-password-confirm">确认新密码</label>
          <input
            id="forgot-password-confirm"
            v-model="forgotForm.confirmPassword"
            class="field-input"
            type="password"
            minlength="8"
            autocomplete="new-password"
            placeholder="再输一次"
            required
          />

          <button class="primary-btn ripple-trigger" type="submit" :disabled="forgotSubmitting">
            <span v-if="!forgotSubmitting" class="btn-sparkle">♡</span>
            {{ forgotSubmitting ? '提交中...' : '重置密码' }}
          </button>
          <p v-if="forgotError" class="error-text">{{ forgotError }}</p>
          <p v-if="sendCodeError" class="error-text">{{ sendCodeError }}</p>
        </form>
      </section>
    </div>

    <div v-if="themePanelOpen" class="theme-backdrop" @click.self="themePanelOpen = false">
      <div class="theme-panel" role="dialog" aria-label="自定义登录页图片与主题">
        <header class="theme-head">
          <h2>✦ 自定义登录页</h2>
          <button class="theme-close" type="button" aria-label="关闭" @click="themePanelOpen = false">×</button>
        </header>
        <p class="theme-tip">选择喜欢的风格，或上传属于你的二次元图片，设置会保存在当前浏览器。</p>
        <p v-if="siteThemeActive" class="theme-site-note">✦ 当前显示的是全站配置（管理员已设置），在这里修改只会影响你当前浏览器。</p>
        <p v-else-if="siteAppearance && hasLocalTheme" class="theme-site-note">
          ✦ 你正在使用浏览器本地自定义，覆盖了全站配置；点「恢复默认风格」可回到全站配置。
        </p>

        <section class="theme-section">
          <h3>可爱主题色</h3>
          <div class="preset-grid">
            <button
              v-for="preset in THEME_PRESETS"
              :key="preset.id"
              class="preset-swatch"
              :class="{ active: theme.preset === preset.id }"
              type="button"
              :style="{ background: preset.gradient }"
              :title="preset.name"
              @click="applyPreset(preset.id)"
            >
              <span class="preset-emoji">{{ preset.emoji }}</span>
              <span class="preset-name">{{ preset.name }}</span>
              <span v-if="theme.preset === preset.id" class="preset-check">✓</span>
            </button>
          </div>
        </section>

        <section class="theme-section">
          <h3>背景图片</h3>
          <div class="image-url-row">
            <input v-model.trim="bgImageUrlDraft" class="field-input grow" type="text" placeholder="粘贴图片链接，如 https://..." />
            <button class="ghost-btn ripple-trigger" type="button" :disabled="!bgImageUrlDraft" @click="applyBgUrl">应用</button>
          </div>
          <div class="upload-row">
            <label class="upload-btn ripple-trigger">
              上传背景图
              <input type="file" accept="image/*" class="hidden-file" @change="onUploadBg" />
            </label>
            <button v-if="theme.bgImage" class="ghost-btn ripple-trigger" type="button" @click="clearBg">清除背景</button>
          </div>
        </section>

        <section class="theme-section">
          <h3>看板娘 / 吉祥物</h3>
          <div class="image-url-row">
            <input v-model.trim="mascotUrlDraft" class="field-input grow" type="text" placeholder="粘贴二次元角色图链接" />
            <button class="ghost-btn ripple-trigger" type="button" :disabled="!mascotUrlDraft" @click="applyMascotUrl">应用</button>
          </div>
          <div class="upload-row">
            <label class="upload-btn ripple-trigger">
              上传角色图
              <input type="file" accept="image/*" class="hidden-file" @change="onUploadMascot" />
            </label>
            <button v-if="theme.mascotImage" class="ghost-btn ripple-trigger" type="button" @click="clearMascot">恢复默认</button>
          </div>
        </section>

        <footer class="theme-foot">
          <button class="primary-btn ripple-trigger" type="button" @click="resetTheme">恢复默认风格</button>
        </footer>
      </div>
    </div>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';
import { fetchSiteLoginAppearance } from '../services/siteLoginAppearanceApi';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();

const initializing = ref(true);
const loginSubmitting = ref(false);
const registerSubmitting = ref(false);
const forgotSubmitting = ref(false);
const oauthSubmitting = ref(false);
const captchaLoading = ref(false);
const sendCodeSubmitting = ref(false);
const registerCodeCooldownSec = ref(0);
const forgotCodeCooldownSec = ref(0);

const loginError = ref('');
const registerError = ref('');
const forgotError = ref('');
const oauthError = ref('');
const sendCodeError = ref('');

const loginForm = reactive({
  email: '',
  password: ''
});

const registerForm = reactive({
  nickname: '',
  email: '',
  password: '',
  captchaAnswer: '',
  emailCode: ''
});

const forgotForm = reactive({
  email: '',
  captchaAnswer: '',
  emailCode: '',
  newPassword: '',
  confirmPassword: ''
});

const captcha = reactive({
  captchaId: '',
  svgContent: '',
  expiresInSec: 0
});

const placeholderCaptcha =
  '<svg xmlns="http://www.w3.org/2000/svg" width="160" height="48"><rect width="100%" height="100%" fill="#ffe9f1"/><text x="50%" y="52%" dominant-baseline="middle" text-anchor="middle" fill="#c95f86" font-size="11">点击刷新</text></svg>';

let cooldownTimer = 0;

// ---------- 可爱主题 / 二次元图片自定义 ----------
const THEME_STORAGE_KEY = 'shizuki.authTheme.v1';

const THEME_PRESETS = [
  {
    id: 'milkshake',
    name: '草莓奶昔',
    emoji: '🍓',
    dark: false,
    gradient: 'linear-gradient(135deg, #ffe0ec 0%, #ffeef2 30%, #fdf3ff 58%, #e8f7ff 85%, #e0f4ff 100%)',
    accent: '#ff7eaa',
    accentSoft: 'rgba(255, 126, 170, 0.16)'
  },
  {
    id: 'blueberry',
    name: '蓝莓奶盖',
    emoji: '🫐',
    dark: false,
    gradient: 'linear-gradient(135deg, #e6e9ff 0%, #f2ecff 32%, #fdeaff 60%, #ffe9f5 100%)',
    accent: '#8b7cf6',
    accentSoft: 'rgba(139, 124, 246, 0.16)'
  },
  {
    id: 'peach',
    name: '蜜桃乌龙',
    emoji: '🍑',
    dark: false,
    gradient: 'linear-gradient(135deg, #ffe3d3 0%, #fff0e0 34%, #fff8e8 62%, #fff3e3 100%)',
    accent: '#ff9d76',
    accentSoft: 'rgba(255, 157, 118, 0.18)'
  },
  {
    id: 'matcha',
    name: '抹茶奶盖',
    emoji: '🍵',
    dark: false,
    gradient: 'linear-gradient(135deg, #e8f5e4 0%, #f2faee 36%, #eefaf2 64%, #e4f6ea 100%)',
    accent: '#7bbf8f',
    accentSoft: 'rgba(123, 191, 143, 0.18)'
  },
  {
    id: 'mint',
    name: '薄荷苏打',
    emoji: '🍃',
    dark: false,
    gradient: 'linear-gradient(135deg, #d9f7ef 0%, #e6fbf5 34%, #eef9ff 64%, #e3f4ff 100%)',
    accent: '#5fc6b6',
    accentSoft: 'rgba(95, 198, 182, 0.18)'
  },
  {
    id: 'galaxy',
    name: '星空糖',
    emoji: '🌌',
    dark: true,
    gradient: 'linear-gradient(135deg, #2a2348 0%, #3d3566 38%, #4a3f7a 66%, #5c4a8a 100%)',
    accent: '#b7a6ff',
    accentSoft: 'rgba(183, 166, 255, 0.2)'
  }
];

function createDefaultTheme() {
  return { preset: 'milkshake', bgImage: '', mascotImage: '' };
}

const theme = reactive(createDefaultTheme());
const themePanelOpen = ref(false);
const bgImageUrlDraft = ref('');
const mascotUrlDraft = ref('');

// 站点级登录页外观（管理员配置，对所有访客生效）
const siteAppearance = ref(null);
const hasLocalTheme = ref(false);

const activePreset = computed(() => THEME_PRESETS.find((preset) => preset.id === theme.preset) || THEME_PRESETS[0]);
const pageThemeClass = computed(() => (activePreset.value.dark ? 'theme-dark' : 'theme-light'));
const siteThemeActive = computed(() => !hasLocalTheme.value && Boolean(siteAppearance.value?.configured));
const pageStyle = computed(() => {
  const style = {
    '--auth-accent': activePreset.value.accent,
    '--auth-accent-soft': activePreset.value.accentSoft
  };
  if (theme.bgImage) {
    style['--auth-bg-image'] = `url("${theme.bgImage}")`;
  }
  return style;
});

function readStoredTheme() {
  try {
    const raw = window.localStorage.getItem(THEME_STORAGE_KEY);
    if (!raw) return;
    const parsed = JSON.parse(raw);
    if (!parsed || typeof parsed !== 'object') return;
    hasLocalTheme.value = true;
    if (THEME_PRESETS.some((preset) => preset.id === parsed.preset)) {
      theme.preset = parsed.preset;
    }
    if (typeof parsed.bgImage === 'string' && parsed.bgImage) theme.bgImage = parsed.bgImage;
    if (typeof parsed.mascotImage === 'string' && parsed.mascotImage) theme.mascotImage = parsed.mascotImage;
  } catch {
    // ignore corrupted local theme
  }
}

function persistTheme() {
  try {
    window.localStorage.setItem(
      THEME_STORAGE_KEY,
      JSON.stringify({ preset: theme.preset, bgImage: theme.bgImage, mascotImage: theme.mascotImage })
    );
    hasLocalTheme.value = true;
  } catch {
    // localStorage quota exceeded: keep in-memory theme but notify softly
  }
}

async function loadSiteAppearance() {
  try {
    const appearance = await fetchSiteLoginAppearance();
    if (!appearance) return;
    siteAppearance.value = appearance;
    if (!hasLocalTheme.value) {
      // 未做浏览器本地自定义时，全站配置作为默认呈现
      theme.preset = appearance.themePreset || 'milkshake';
      theme.bgImage = appearance.bgImageUrl || '';
      theme.mascotImage = appearance.mascotImageUrl || '';
    }
  } catch {
    // 站点配置接口不可用时保持本地/默认主题
  }
}

function applyPreset(presetId) {
  theme.preset = THEME_PRESETS.some((preset) => preset.id === presetId) ? presetId : 'milkshake';
  persistTheme();
}

function applyBgUrl() {
  const url = String(bgImageUrlDraft.value || '').trim();
  if (!url) return;
  theme.bgImage = url;
  persistTheme();
  bgImageUrlDraft.value = '';
}

function applyMascotUrl() {
  const url = String(mascotUrlDraft.value || '').trim();
  if (!url) return;
  theme.mascotImage = url;
  persistTheme();
  mascotUrlDraft.value = '';
}

function clearBg() {
  theme.bgImage = '';
  persistTheme();
}

function clearMascot() {
  theme.mascotImage = '';
  persistTheme();
}

function resetTheme() {
  Object.assign(theme, createDefaultTheme());
  bgImageUrlDraft.value = '';
  mascotUrlDraft.value = '';
  try {
    window.localStorage.removeItem(THEME_STORAGE_KEY);
  } catch {
    // ignore storage errors
  }
  hasLocalTheme.value = false;
  if (siteAppearance.value?.configured) {
    theme.preset = siteAppearance.value.themePreset || 'milkshake';
    theme.bgImage = siteAppearance.value.bgImageUrl || '';
    theme.mascotImage = siteAppearance.value.mascotImageUrl || '';
  }
}

function readImageFile(file, maxSize, callback) {
  if (!file || !/^image\//.test(file.type)) return;
  const reader = new FileReader();
  reader.onload = () => {
    const img = new Image();
    img.onload = () => {
      const scale = Math.min(1, maxSize / Math.max(img.width, img.height));
      const width = Math.max(1, Math.round(img.width * scale));
      const height = Math.max(1, Math.round(img.height * scale));
      const canvas = document.createElement('canvas');
      canvas.width = width;
      canvas.height = height;
      const ctx = canvas.getContext('2d');
      if (!ctx) {
        callback(String(reader.result || ''));
        return;
      }
      ctx.drawImage(img, 0, 0, width, height);
      callback(canvas.toDataURL('image/jpeg', 0.86));
    };
    img.onerror = () => callback(String(reader.result || ''));
    img.src = String(reader.result || '');
  };
  reader.readAsDataURL(file);
}

function onUploadBg(event) {
  const file = event.target?.files?.[0];
  readImageFile(file, 1600, (dataUrl) => {
    if (dataUrl) {
      theme.bgImage = dataUrl;
      persistTheme();
    }
  });
  if (event.target) event.target.value = '';
}

function onUploadMascot(event) {
  const file = event.target?.files?.[0];
  readImageFile(file, 640, (dataUrl) => {
    if (dataUrl) {
      theme.mascotImage = dataUrl;
      persistTheme();
    }
  });
  if (event.target) event.target.value = '';
}
// ---------- 主题自定义结束 ----------

function normalizeMode(raw) {
  return raw === 'register' || raw === 'forgot' ? raw : 'login';
}

function normalizeRedirectPath(path) {
  if (!path || typeof path !== 'string') return '/profile';
  if (!path.startsWith('/')) return '/profile';
  if (path.startsWith('/auth')) return '/profile';
  return path;
}

function readErrorMessage(error) {
  if (error && typeof error === 'object') {
    if (typeof error.detail === 'string' && error.detail) return error.detail;
    if (typeof error.message === 'string' && error.message) return error.message;
  }
  return '请求失败，请稍后重试';
}

const activeMode = computed(() => normalizeMode(typeof route.query.mode === 'string' ? route.query.mode : 'login'));
const redirectTarget = computed(() => normalizeRedirectPath(typeof route.query.redirect === 'string' ? route.query.redirect : '/profile'));

const reasonHint = computed(() => {
  const reason = typeof route.query.reason === 'string' ? route.query.reason : '';
  if (reason === 'session_expired') return '当前登录态已过期，请重新登录。';
  if (reason === 'signed_out') return '你已安全退出登录。';
  if (reason === 'oauth_failed') return 'OAuth 登录失败，请重试或使用邮箱登录。';
  return '';
});

const registerCodeLocked = computed(() => sendCodeSubmitting.value || registerCodeCooldownSec.value > 0);
const forgotCodeLocked = computed(() => sendCodeSubmitting.value || forgotCodeCooldownSec.value > 0);
const registerCodeButtonText = computed(() => {
  if (sendCodeSubmitting.value) return '发送中...';
  if (registerCodeCooldownSec.value > 0) return `${registerCodeCooldownSec.value}s`;
  return '发送验证码';
});
const forgotCodeButtonText = computed(() => {
  if (sendCodeSubmitting.value) return '发送中...';
  if (forgotCodeCooldownSec.value > 0) return `${forgotCodeCooldownSec.value}s`;
  return '发送验证码';
});

function clearErrors() {
  loginError.value = '';
  registerError.value = '';
  forgotError.value = '';
  oauthError.value = '';
  sendCodeError.value = '';
}

function setMode(mode) {
  const normalized = normalizeMode(mode);
  router.replace({
    path: '/auth',
    query: {
      ...route.query,
      mode: normalized
    }
  });
}

function startCooldown(target, seconds) {
  if (cooldownTimer) {
    window.clearInterval(cooldownTimer);
    cooldownTimer = 0;
  }
  target.value = Math.max(0, Number(seconds) || 0);
  if (target.value <= 0) return;

  cooldownTimer = window.setInterval(() => {
    if (target.value <= 1) {
      target.value = 0;
      window.clearInterval(cooldownTimer);
      cooldownTimer = 0;
      return;
    }
    target.value -= 1;
  }, 1000);
}

async function redirectAfterLogin(preferredPath) {
  const target = normalizeRedirectPath(preferredPath || redirectTarget.value);
  await router.replace(target);
}

async function refreshCaptcha(options = {}) {
  captchaLoading.value = true;
  if (options.clearError !== false) {
    sendCodeError.value = '';
  }
  try {
    const payload = await auth.createImageCaptcha();
    captcha.captchaId = payload.captchaId || '';
    captcha.svgContent = payload.svgContent || '';
    captcha.expiresInSec = Number(payload.expiresInSec) || 0;
  } catch (error) {
    sendCodeError.value = readErrorMessage(error);
  } finally {
    captchaLoading.value = false;
  }
}

async function sendRegisterCode() {
  sendCodeError.value = '';
  if (!registerForm.email) {
    sendCodeError.value = '请先输入邮箱';
    return;
  }
  if (!captcha.captchaId) {
    sendCodeError.value = '图形验证码已失效，请刷新后重试';
    return;
  }
  if (!registerForm.captchaAnswer) {
    sendCodeError.value = '请输入图形验证码';
    return;
  }

  sendCodeSubmitting.value = true;
  try {
    const payload = await auth.sendRegisterVerification({
      email: registerForm.email,
      captchaId: captcha.captchaId,
      captchaAnswer: registerForm.captchaAnswer
    });
    startCooldown(registerCodeCooldownSec, payload.cooldownSec || 60);
  } catch (error) {
    sendCodeError.value = readErrorMessage(error);
  } finally {
    sendCodeSubmitting.value = false;
    await refreshCaptcha({ clearError: false });
  }
}

async function sendForgotCode() {
  sendCodeError.value = '';
  if (!forgotForm.email) {
    sendCodeError.value = '请先输入邮箱';
    return;
  }
  if (!captcha.captchaId) {
    sendCodeError.value = '图形验证码已失效，请刷新后重试';
    return;
  }
  if (!forgotForm.captchaAnswer) {
    sendCodeError.value = '请输入图形验证码';
    return;
  }

  sendCodeSubmitting.value = true;
  try {
    const payload = await auth.sendResetPasswordVerification({
      email: forgotForm.email,
      captchaId: captcha.captchaId,
      captchaAnswer: forgotForm.captchaAnswer
    });
    startCooldown(forgotCodeCooldownSec, payload.cooldownSec || 60);
  } catch (error) {
    sendCodeError.value = readErrorMessage(error);
  } finally {
    sendCodeSubmitting.value = false;
    await refreshCaptcha({ clearError: false });
  }
}

async function submitLogin() {
  clearErrors();
  loginSubmitting.value = true;
  try {
    await auth.loginByEmail({
      email: loginForm.email,
      password: loginForm.password
    });
    await redirectAfterLogin();
  } catch (error) {
    loginError.value = readErrorMessage(error);
  } finally {
    loginSubmitting.value = false;
  }
}

async function submitRegister() {
  clearErrors();
  registerSubmitting.value = true;
  try {
    await auth.registerByEmail({
      email: registerForm.email,
      password: registerForm.password,
      nickname: registerForm.nickname,
      emailCode: registerForm.emailCode
    });
    await redirectAfterLogin();
  } catch (error) {
    registerError.value = readErrorMessage(error);
  } finally {
    registerSubmitting.value = false;
  }
}

async function submitForgotPassword() {
  clearErrors();
  forgotSubmitting.value = true;
  try {
    await auth.resetPasswordByEmail({
      email: forgotForm.email,
      emailCode: forgotForm.emailCode,
      newPassword: forgotForm.newPassword,
      confirmPassword: forgotForm.confirmPassword
    });
    loginForm.email = forgotForm.email;
    loginForm.password = '';
    setMode('login');
  } catch (error) {
    forgotError.value = readErrorMessage(error);
  } finally {
    forgotSubmitting.value = false;
  }
}

async function startOAuth(provider) {
  clearErrors();
  oauthSubmitting.value = true;
  try {
    await auth.startOAuthLogin(provider, redirectTarget.value);
  } catch (error) {
    oauthError.value = readErrorMessage(error);
    oauthSubmitting.value = false;
  }
}

watch(
  () => route.query.mode,
  (mode) => {
    const raw = typeof mode === 'string' ? mode : '';
    const normalized = normalizeMode(raw);
    if (raw === normalized) return;
    setMode(normalized);
  },
  { immediate: true }
);

watch(
  activeMode,
  async (mode) => {
    clearErrors();
    if ((mode === 'register' || mode === 'forgot') && !captcha.captchaId) {
      await refreshCaptcha();
    }
  },
  { immediate: true }
);

onMounted(async () => {
  readStoredTheme();
  await Promise.allSettled([loadSiteAppearance(), auth.ensureReady()]);
  if (auth.isAuthenticated.value) {
    await redirectAfterLogin();
    return;
  }
  initializing.value = false;
});

onBeforeUnmount(() => {
  if (cooldownTimer) {
    window.clearInterval(cooldownTimer);
    cooldownTimer = 0;
  }
});
</script>

<style scoped>
.auth-page {
  position: relative;
  min-height: 100%;
  overflow-x: hidden;
  overflow-y: auto;
  display: grid;
  place-items: center;
  padding: 22px 18px;
  font-family: var(--font-cute, 'Zen Maru Gothic', 'LXGW WenKai Screen', 'Noto Sans SC', sans-serif);
  color: #5b4a56;
  background: linear-gradient(135deg, #ffe0ec 0%, #ffeef2 30%, #fdf3ff 58%, #e8f7ff 85%, #e0f4ff 100%);
  animation: page-enter 0.4s ease-out;
}

.bg-aurora {
  position: absolute;
  inset: -20%;
  pointer-events: none;
  background:
    radial-gradient(circle at 20% 25%, rgba(255, 182, 213, 0.55), transparent 42%),
    radial-gradient(circle at 82% 18%, rgba(255, 221, 189, 0.5), transparent 40%),
    radial-gradient(circle at 72% 82%, rgba(190, 227, 255, 0.5), transparent 44%),
    radial-gradient(circle at 24% 84%, rgba(214, 190, 255, 0.45), transparent 42%);
  filter: blur(8px);
  animation: aurora-drift 18s ease-in-out infinite alternate;
}

.bg-image-layer {
  position: absolute;
  inset: 0;
  pointer-events: none;
  background-image: var(--auth-bg-image, none);
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
}

.bg-image-layer::after {
  content: '';
  position: absolute;
  inset: 0;
  background: rgba(255, 240, 246, 0.42);
  backdrop-filter: blur(2px);
}

.theme-dark .bg-image-layer::after {
  background: rgba(30, 22, 52, 0.5);
}

/* ---------- 漂浮小装饰 ---------- */
.kawaii-decor {
  position: absolute;
  inset: 0;
  pointer-events: none;
  overflow: hidden;
}

.kawaii-decor span {
  position: absolute;
  color: rgba(255, 130, 175, 0.55);
  animation: floaty 6s ease-in-out infinite;
}

.theme-dark .kawaii-decor span {
  color: rgba(216, 195, 255, 0.5);
}

.kawaii-decor .deco-star { font-size: 26px; }
.kawaii-decor .deco-heart { font-size: 20px; }

.kawaii-decor .s1 { top: 8%; left: 9%; animation-delay: 0s; }
.kawaii-decor .h1 { top: 16%; right: 12%; animation-delay: 0.8s; }
.kawaii-decor .s2 { top: 30%; left: 4%; animation-delay: 1.4s; font-size: 18px; }
.kawaii-decor .h2 { top: 42%; right: 5%; animation-delay: 2s; }
.kawaii-decor .s3 { bottom: 18%; left: 13%; animation-delay: 0.4s; }
.kawaii-decor .h3 { bottom: 8%; right: 18%; animation-delay: 1.1s; font-size: 26px; }
.kawaii-decor .s4 { bottom: 34%; left: 3%; animation-delay: 1.8s; font-size: 20px; }
.kawaii-decor .h4 { top: 64%; left: 16%; animation-delay: 2.4s; font-size: 16px; }
.kawaii-decor .s5 { bottom: 6%; left: 40%; animation-delay: 0.2s; font-size: 18px; }

.kawaii-decor .deco-cloud {
  width: 120px;
  height: 34px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.55);
  filter: blur(1px);
}

.kawaii-decor .c1 { top: 6%; right: 22%; animation-delay: 0.6s; }
.kawaii-decor .c2 { top: 52%; left: -1%; animation-delay: 1.6s; transform: scale(0.8); }
.kawaii-decor .c3 { bottom: 4%; left: 26%; animation-delay: 2.2s; transform: scale(0.7); }

/* ---------- 布局 ---------- */
.auth-center {
  position: relative;
  z-index: 1;
  width: min(1020px, 100%);
  display: grid;
  grid-template-columns: minmax(0, 0.95fr) minmax(0, 1.1fr);
  gap: 20px;
  align-items: center;
  animation: rise-in 0.45s ease-out;
}

/* ---------- 左侧 hero / 看板娘 ---------- */
.hero {
  border-radius: 32px;
  padding: 28px 24px;
  display: grid;
  justify-items: center;
  align-content: center;
  gap: 10px;
  text-align: center;
  background: rgba(255, 255, 255, 0.62);
  border: 1.5px solid rgba(255, 255, 255, 0.85);
  box-shadow: 0 22px 52px rgba(214, 148, 178, 0.28);
  backdrop-filter: blur(14px);
  min-height: 520px;
}

.theme-dark .hero {
  background: rgba(48, 40, 82, 0.55);
  border-color: rgba(216, 195, 255, 0.28);
  box-shadow: 0 22px 52px rgba(12, 8, 30, 0.42);
}

.mascot-frame {
  position: relative;
  width: 168px;
  height: 168px;
  margin-bottom: 6px;
}

.mascot-img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  border-radius: 46% 54% 52% 48% / 58% 44% 56% 42%;
  border: 4px solid rgba(255, 255, 255, 0.95);
  box-shadow: 0 16px 34px rgba(216, 140, 176, 0.35);
  animation: bob 3.4s ease-in-out infinite;
}

/* CSS 默认看板娘：一只圆圆的小猫团子 */
.mascot-css {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  animation: bob 3.4s ease-in-out infinite;
}

.blob-body {
  position: relative;
  width: 150px;
  height: 150px;
  border-radius: 52% 48% 55% 45% / 58% 52% 48% 42%;
  background: linear-gradient(150deg, #fff1f6 0%, #ffd9e8 55%, #ffc4da 100%);
  border: 4px solid #fff;
  box-shadow: 0 16px 34px rgba(216, 140, 176, 0.38), inset 0 -12px 22px rgba(255, 148, 188, 0.22);
}

.blob-body .ear {
  position: absolute;
  top: -16px;
  width: 40px;
  height: 40px;
  background: linear-gradient(150deg, #ffd9e8 40%, #ffb7d1 100%);
  border: 4px solid #fff;
  border-radius: 55% 45% 55% 45%;
}

.blob-body .ear.left { left: 12px; transform: rotate(-24deg); }
.blob-body .ear.right { right: 12px; transform: rotate(24deg); }

.blob-body .eye {
  position: absolute;
  top: 58px;
  width: 18px;
  height: 10px;
  border-bottom: 4px solid #6f4a5a;
  border-radius: 50%;
}

.blob-body .eye.left { left: 42px; }
.blob-body .eye.right { right: 42px; }

.blob-body .blush {
  position: absolute;
  top: 74px;
  width: 22px;
  height: 12px;
  border-radius: 50%;
  background: rgba(255, 138, 180, 0.5);
  filter: blur(1px);
}

.blob-body .blush.left { left: 20px; }
.blob-body .blush.right { right: 20px; }

.blob-body .mouth {
  position: absolute;
  top: 82px;
  left: 50%;
  transform: translateX(-50%);
  width: 16px;
  height: 8px;
  border-bottom: 3px solid #6f4a5a;
  border-radius: 0 0 18px 18px;
}

.blob-body .whisker {
  position: absolute;
  top: 76px;
  width: 26px;
  height: 2.5px;
  background: rgba(111, 74, 90, 0.45);
  border-radius: 999px;
}

.blob-body .whisker.left { left: -6px; transform: rotate(-12deg); }
.blob-body .whisker.right { right: -6px; transform: rotate(12deg); }

.sparkle {
  position: absolute;
  color: #ff9ec2;
  font-size: 18px;
  animation: twinkle 2.2s ease-in-out infinite;
}

.sparkle.t1 { top: 6px; left: 8px; }
.sparkle.t2 { top: 2px; right: 22px; animation-delay: 0.7s; }
.sparkle.t3 { bottom: 8px; left: 20px; animation-delay: 1.3s; }

.theme-dark .sparkle { color: #cfb8ff; }

.greeting {
  margin: 0;
  font-size: 15px;
  letter-spacing: 0.06em;
  color: #e06a97;
}

.theme-dark .greeting { color: #e7c9ff; }

.hero h1 {
  margin: 0;
  font-size: clamp(26px, 3.6vw, 36px);
  font-weight: 700;
  color: #6f4a5a;
  line-height: 1.2;
}

.theme-dark .hero h1 { color: #f2e9ff; }

.hero-desc {
  margin: 0;
  color: rgba(111, 74, 90, 0.78);
  font-size: 13.5px;
  line-height: 1.7;
  max-width: 300px;
}

.theme-dark .hero-desc { color: rgba(238, 228, 255, 0.82); }

.reason-hint {
  margin: 0;
  padding: 6px 12px;
  border-radius: 999px;
  background: rgba(255, 226, 235, 0.85);
  color: #c2577f;
  font-size: 12.5px;
}

.theme-dark .reason-hint {
  background: rgba(120, 96, 190, 0.4);
  color: #ffd7ea;
}

.customize-btn {
  margin-top: 6px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  border: 0;
  border-radius: 999px;
  padding: 9px 18px;
  background: rgba(255, 126, 170, 0.16);
  color: #d65f8d;
  font-family: var(--font-cute, inherit);
  font-size: 13px;
  font-weight: 600;
  cursor: pointer;
  box-shadow: inset 0 0 0 1.5px rgba(255, 126, 170, 0.4);
  transition: transform 0.25s cubic-bezier(0.34, 1.56, 0.64, 1), background-color 0.25s ease;
}

.customize-btn:hover {
  transform: translateY(-2px) scale(1.04);
  background: rgba(255, 126, 170, 0.26);
}

.customize-icon {
  color: #ff7eaa;
  font-size: 15px;
}

.theme-dark .customize-btn {
  background: rgba(183, 166, 255, 0.18);
  color: #d6c6ff;
  box-shadow: inset 0 0 0 1.5px rgba(183, 166, 255, 0.45);
}

/* ---------- 右侧卡片 ---------- */
.auth-shell {
  border-radius: 32px;
  padding: 22px;
  display: grid;
  align-content: start;
  gap: 16px;
  background: rgba(255, 255, 255, 0.78);
  border: 1.5px solid rgba(255, 255, 255, 0.92);
  box-shadow: 0 24px 56px rgba(210, 140, 175, 0.3);
  backdrop-filter: blur(16px);
  max-height: 92vh;
  overflow-y: auto;
}

.theme-dark .auth-shell {
  background: rgba(44, 36, 76, 0.72);
  border-color: rgba(216, 195, 255, 0.26);
  box-shadow: 0 24px 56px rgba(10, 6, 26, 0.5);
}

.auth-tabs {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 6px;
  padding: 5px;
  border-radius: 999px;
  background: rgba(255, 214, 230, 0.55);
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.8);
}

.theme-dark .auth-tabs {
  background: rgba(84, 70, 140, 0.42);
  box-shadow: inset 0 0 0 1px rgba(216, 195, 255, 0.22);
}

.tab-btn {
  border: 0;
  border-radius: 999px;
  min-height: 38px;
  background: transparent;
  color: rgba(111, 74, 90, 0.75);
  font-family: var(--font-cute, inherit);
  font-size: 14px;
  font-weight: 600;
  cursor: pointer;
  transition: transform 0.2s ease, background-color 0.25s ease, color 0.25s ease, box-shadow 0.25s ease;
}

.tab-btn:hover {
  transform: translateY(-1px);
}

.tab-btn.active {
  background: var(--auth-accent, #ff7eaa);
  color: #fff;
  box-shadow: 0 8px 18px var(--auth-accent-soft, rgba(255, 126, 170, 0.35));
}

.theme-dark .tab-btn { color: rgba(238, 228, 255, 0.8); }
.theme-dark .tab-btn.active { color: #2c244c; }

.auth-form {
  display: grid;
  gap: 9px;
  animation: fade-up 0.25s ease-out;
}

.field-label {
  font-size: 12.5px;
  color: rgba(111, 74, 90, 0.85);
  font-weight: 600;
}

.theme-dark .field-label { color: rgba(238, 228, 255, 0.85); }

.field-input {
  border: 1.5px solid rgba(255, 184, 208, 0.55);
  border-radius: 16px;
  min-height: 44px;
  padding: 0 14px;
  background: rgba(255, 255, 255, 0.9);
  color: #6f4a5a;
  font-family: var(--font-cute, inherit);
  font-size: 14px;
  transition: border-color 0.2s ease, box-shadow 0.2s ease, transform 0.2s ease;
}

.field-input::placeholder {
  color: rgba(111, 74, 90, 0.42);
}

.field-input:focus {
  border-color: var(--auth-accent, #ff7eaa);
  box-shadow: 0 0 0 4px var(--auth-accent-soft, rgba(255, 126, 170, 0.2));
  transform: translateY(-1px);
}

.theme-dark .field-input {
  background: rgba(24, 18, 46, 0.6);
  color: #f2e9ff;
  border-color: rgba(183, 166, 255, 0.4);
}

.theme-dark .field-input::placeholder { color: rgba(220, 205, 255, 0.4); }

.captcha-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 170px;
  gap: 8px;
  align-items: stretch;
}

.captcha-preview {
  border: 1.5px solid rgba(255, 184, 208, 0.55);
  border-radius: 16px;
  overflow: hidden;
  background: rgba(255, 255, 255, 0.92);
  display: grid;
  place-items: center;
  cursor: pointer;
  transition: transform 0.2s ease, box-shadow 0.2s ease;
}

.captcha-preview:hover {
  transform: translateY(-1px);
  box-shadow: 0 8px 18px var(--auth-accent-soft, rgba(255, 126, 170, 0.28));
}

.captcha-loading {
  font-size: 12px;
  color: rgba(111, 74, 90, 0.75);
}

.theme-dark .captcha-preview { background: rgba(24, 18, 46, 0.6); border-color: rgba(183, 166, 255, 0.4); }
.theme-dark .captcha-loading { color: rgba(238, 228, 255, 0.8); }

.captcha-svg :deep(svg) {
  width: 100%;
  height: 48px;
  display: block;
}

.inline-actions {
  display: flex;
  gap: 8px;
  align-items: center;
}

.grow {
  flex: 1;
  min-width: 0;
}

.primary-btn,
.ghost-btn,
.oauth-btn {
  border: 0;
  border-radius: 999px;
  min-height: 42px;
  padding: 0 16px;
  font-family: var(--font-cute, inherit);
  font-size: 14px;
  font-weight: 600;
  cursor: pointer;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 6px;
  transition: transform 0.25s cubic-bezier(0.34, 1.56, 0.64, 1), box-shadow 0.25s ease, background-color 0.25s ease;
}

.primary-btn {
  background: linear-gradient(120deg, var(--auth-accent, #ff7eaa), #ffb199);
  color: #fff;
  box-shadow: 0 10px 22px var(--auth-accent-soft, rgba(255, 126, 170, 0.4));
}

.primary-btn:hover {
  transform: translateY(-2px) scale(1.02);
}

.btn-sparkle {
  font-size: 15px;
  opacity: 0.9;
}

.ghost-btn,
.oauth-btn {
  background: rgba(255, 255, 255, 0.85);
  color: #d65f8d;
  box-shadow: inset 0 0 0 1.5px rgba(255, 126, 170, 0.4);
}

.ghost-btn:hover,
.oauth-btn:hover {
  transform: translateY(-2px);
}

.theme-dark .ghost-btn,
.theme-dark .oauth-btn {
  background: rgba(183, 166, 255, 0.14);
  color: #d6c6ff;
  box-shadow: inset 0 0 0 1.5px rgba(183, 166, 255, 0.45);
}

.primary-btn:disabled,
.ghost-btn:disabled,
.oauth-btn:disabled {
  opacity: 0.56;
  cursor: not-allowed;
  transform: none;
}

.oauth-block {
  margin-top: 6px;
  padding-top: 12px;
  border-top: 1.5px dashed rgba(255, 150, 190, 0.45);
  display: grid;
  gap: 8px;
}

.theme-dark .oauth-block { border-top-color: rgba(183, 166, 255, 0.3); }

.oauth-title {
  margin: 0;
  color: rgba(111, 74, 90, 0.8);
  font-size: 12.5px;
}

.theme-dark .oauth-title { color: rgba(238, 228, 255, 0.85); }

.oauth-actions {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.state-tip {
  color: rgba(111, 74, 90, 0.85);
  text-align: center;
  padding: 18px 0;
  font-size: 14px;
}

.theme-dark .state-tip { color: rgba(238, 228, 255, 0.85); }

.error-text {
  color: #e2587f;
  font-size: 12.5px;
  line-height: 1.5;
  margin: 0;
}

.theme-dark .error-text { color: #ff9ec4; }

/* ---------- 自定义面板 ---------- */
.theme-backdrop {
  position: fixed;
  inset: 0;
  z-index: 200;
  display: grid;
  place-items: center;
  background: rgba(96, 66, 88, 0.32);
  backdrop-filter: blur(6px);
  animation: fade-in 0.22s ease-out;
}

.theme-panel {
  width: min(420px, calc(100vw - 32px));
  max-height: 88vh;
  overflow-y: auto;
  border-radius: 28px;
  padding: 20px;
  display: grid;
  gap: 16px;
  background: rgba(255, 255, 255, 0.94);
  border: 1.5px solid rgba(255, 184, 208, 0.6);
  box-shadow: 0 28px 64px rgba(160, 90, 130, 0.35);
  font-family: var(--font-cute, 'Zen Maru Gothic', 'LXGW WenKai Screen', 'Noto Sans SC', sans-serif);
  color: #6f4a5a;
  animation: rise-in 0.3s ease-out;
}

.theme-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.theme-head h2 {
  margin: 0;
  font-size: 18px;
  font-weight: 700;
  color: #d65f8d;
}

.theme-close {
  border: 0;
  width: 32px;
  height: 32px;
  border-radius: 50%;
  background: rgba(255, 126, 170, 0.14);
  color: #d65f8d;
  font-size: 18px;
  line-height: 1;
  cursor: pointer;
}

.theme-tip {
  margin: 0;
  font-size: 12.5px;
  color: rgba(111, 74, 90, 0.75);
  line-height: 1.6;
}

.theme-site-note {
  margin: 0;
  padding: 8px 12px;
  border-radius: 12px;
  background: rgba(255, 126, 170, 0.12);
  box-shadow: inset 0 0 0 1px rgba(255, 126, 170, 0.35);
  color: #c2577f;
  font-size: 12px;
  line-height: 1.55;
}

.theme-section {
  display: grid;
  gap: 8px;
}

.theme-section h3 {
  margin: 0;
  font-size: 13.5px;
  font-weight: 600;
  color: #a25678;
}

.preset-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.preset-swatch {
  position: relative;
  border: 2px solid transparent;
  border-radius: 16px;
  min-height: 62px;
  display: grid;
  place-items: center;
  cursor: pointer;
  font-family: var(--font-cute, inherit);
  transition: transform 0.2s ease, border-color 0.2s ease;
}

.preset-swatch:hover {
  transform: translateY(-2px) scale(1.03);
}

.preset-swatch.active {
  border-color: #ff7eaa;
  box-shadow: 0 0 0 3px rgba(255, 126, 170, 0.25);
}

.preset-emoji {
  font-size: 18px;
}

.preset-name {
  font-size: 11px;
  color: rgba(111, 74, 90, 0.85);
  background: rgba(255, 255, 255, 0.7);
  border-radius: 999px;
  padding: 2px 8px;
}

.preset-check {
  position: absolute;
  top: 4px;
  right: 6px;
  color: #fff;
  font-size: 12px;
  background: #ff7eaa;
  border-radius: 50%;
  width: 16px;
  height: 16px;
  display: grid;
  place-items: center;
}

.image-url-row {
  display: flex;
  gap: 8px;
  align-items: center;
}

.upload-row {
  display: flex;
  gap: 8px;
  align-items: center;
}

.upload-btn {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  min-height: 42px;
  padding: 0 16px;
  border-radius: 999px;
  background: linear-gradient(120deg, #ff7eaa, #ffb199);
  color: #fff;
  font-size: 13.5px;
  font-weight: 600;
  cursor: pointer;
  box-shadow: 0 8px 18px rgba(255, 126, 170, 0.35);
}

.hidden-file {
  display: none;
}

.theme-foot {
  display: grid;
}

/* ---------- 动画 ---------- */
@keyframes page-enter {
  from { opacity: 0; }
  to { opacity: 1; }
}

@keyframes rise-in {
  from {
    opacity: 0;
    transform: translateY(14px) scale(0.98);
  }
  to {
    opacity: 1;
    transform: translateY(0) scale(1);
  }
}

@keyframes fade-up {
  from {
    opacity: 0;
    transform: translateY(8px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@keyframes fade-in {
  from { opacity: 0; }
  to { opacity: 1; }
}

@keyframes floaty {
  0%, 100% { transform: translateY(0) rotate(-3deg); }
  50% { transform: translateY(-14px) rotate(3deg); }
}

@keyframes bob {
  0%, 100% { transform: translateY(0); }
  50% { transform: translateY(-8px); }
}

@keyframes twinkle {
  0%, 100% { opacity: 0.35; transform: scale(0.85); }
  50% { opacity: 1; transform: scale(1.15); }
}

@keyframes aurora-drift {
  0% { transform: translate3d(0, 0, 0) scale(1); }
  100% { transform: translate3d(3%, -2%, 0) scale(1.08); }
}

/* ---------- 响应式 ---------- */
@media (max-width: 980px) {
  .auth-center {
    grid-template-columns: 1fr;
  }

  .hero {
    min-height: 0;
    padding: 20px 16px;
  }

  .mascot-frame {
    width: 120px;
    height: 120px;
  }

  .blob-body {
    width: 110px;
    height: 110px;
  }

  .hero-desc {
    max-width: none;
  }
}

@media (max-height: 700px) and (min-width: 981px) {
  .hero {
    min-height: 0;
  }
}
</style>
