<template>
  <section class="route-page auth-page">
    <div class="auth-center">
      <header class="hero">
        <p class="eyebrow">Auth Portal</p>
        <h1>账户入口</h1>
        <p>支持邮箱登录、注册与忘记密码，OAuth 仅负责登录流程。</p>
        <p v-if="reasonHint" class="reason-hint">{{ reasonHint }}</p>
      </header>

      <section class="auth-shell liquid-material">
        <div class="auth-tabs">
          <button class="tab-btn ripple-trigger" :class="{ active: activeMode === 'login' }" type="button" @click="setMode('login')">
            登录
          </button>
          <button class="tab-btn ripple-trigger" :class="{ active: activeMode === 'register' }" type="button" @click="setMode('register')">
            注册
          </button>
          <button class="tab-btn ripple-trigger" :class="{ active: activeMode === 'forgot' }" type="button" @click="setMode('forgot')">
            忘记密码
          </button>
        </div>

        <div v-if="initializing" class="state-tip">正在恢复会话状态...</div>

        <form v-else-if="activeMode === 'login'" class="auth-form" @submit.prevent="submitLogin">
          <label class="field-label" for="login-email">邮箱</label>
          <input id="login-email" v-model.trim="loginForm.email" class="field-input" type="email" autocomplete="email" required />

          <label class="field-label" for="login-password">密码</label>
          <input
            id="login-password"
            v-model="loginForm.password"
            class="field-input"
            type="password"
            autocomplete="current-password"
            required
          />

          <button class="primary-btn ripple-trigger" type="submit" :disabled="loginSubmitting">
            {{ loginSubmitting ? '登录中...' : '邮箱登录' }}
          </button>
          <p v-if="loginError" class="error-text">{{ loginError }}</p>

          <div class="oauth-block">
            <p class="oauth-title">或使用 OAuth 登录</p>
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
          <input id="register-nickname" v-model.trim="registerForm.nickname" class="field-input" type="text" autocomplete="nickname" required />

          <label class="field-label" for="register-email">邮箱</label>
          <input id="register-email" v-model.trim="registerForm.email" class="field-input" type="email" autocomplete="email" required />

          <label class="field-label" for="register-password">密码</label>
          <input
            id="register-password"
            v-model="registerForm.password"
            class="field-input"
            type="password"
            autocomplete="new-password"
            minlength="8"
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
              required
            />
            <button class="captcha-preview ripple-trigger" type="button" :disabled="captchaLoading" @click="refreshCaptcha">
              <span v-if="captchaLoading" class="captcha-loading">刷新中...</span>
              <span v-else class="captcha-svg" v-html="captcha.svgContent || placeholderCaptcha"></span>
            </button>
          </div>

          <label class="field-label" for="register-email-code">邮箱验证码</label>
          <div class="inline-actions">
            <input id="register-email-code" v-model.trim="registerForm.emailCode" class="field-input grow" type="text" autocomplete="off" required />
            <button class="ghost-btn ripple-trigger" type="button" :disabled="registerCodeLocked" @click="sendRegisterCode">
              {{ registerCodeButtonText }}
            </button>
          </div>

          <button class="primary-btn ripple-trigger" type="submit" :disabled="registerSubmitting">
            {{ registerSubmitting ? '注册中...' : '提交注册并登录' }}
          </button>
          <p v-if="registerError" class="error-text">{{ registerError }}</p>
          <p v-if="sendCodeError" class="error-text">{{ sendCodeError }}</p>
        </form>

        <form v-else class="auth-form" @submit.prevent="submitForgotPassword">
          <label class="field-label" for="forgot-email">邮箱</label>
          <input id="forgot-email" v-model.trim="forgotForm.email" class="field-input" type="email" autocomplete="email" required />

          <label class="field-label" for="forgot-captcha-answer">图形验证码</label>
          <div class="captcha-row">
            <input
              id="forgot-captcha-answer"
              v-model.trim="forgotForm.captchaAnswer"
              class="field-input grow"
              type="text"
              autocomplete="off"
              required
            />
            <button class="captcha-preview ripple-trigger" type="button" :disabled="captchaLoading" @click="refreshCaptcha">
              <span v-if="captchaLoading" class="captcha-loading">刷新中...</span>
              <span v-else class="captcha-svg" v-html="captcha.svgContent || placeholderCaptcha"></span>
            </button>
          </div>

          <label class="field-label" for="forgot-email-code">邮箱验证码</label>
          <div class="inline-actions">
            <input id="forgot-email-code" v-model.trim="forgotForm.emailCode" class="field-input grow" type="text" autocomplete="off" required />
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
            required
          />

          <button class="primary-btn ripple-trigger" type="submit" :disabled="forgotSubmitting">
            {{ forgotSubmitting ? '提交中...' : '重置密码' }}
          </button>
          <p v-if="forgotError" class="error-text">{{ forgotError }}</p>
          <p v-if="sendCodeError" class="error-text">{{ sendCodeError }}</p>
        </form>
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';

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
  '<svg xmlns="http://www.w3.org/2000/svg" width="160" height="48"><rect width="100%" height="100%" fill="#2a1916"/><text x="50%" y="52%" dominant-baseline="middle" text-anchor="middle" fill="#f3e3d7" font-size="11">点击刷新</text></svg>';

let cooldownTimer = 0;

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
  await auth.ensureReady();
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
  min-height: 100%;
  color: rgba(238, 246, 255, 0.96);
  display: grid;
  place-items: center;
  padding: 18px;
}

.auth-center {
  width: min(960px, 100%);
  display: grid;
  grid-template-columns: minmax(0, 0.95fr) minmax(0, 1.1fr);
  gap: 16px;
  align-items: stretch;
  animation: rise-in 0.35s ease-out;
}

.hero {
  border-radius: 16px;
  padding: 24px 20px;
  background:
    radial-gradient(circle at 18% 15%, rgba(80, 176, 247, 0.28), transparent 58%),
    radial-gradient(circle at 80% 84%, rgba(106, 220, 184, 0.22), transparent 62%),
    linear-gradient(155deg, rgba(10, 22, 34, 0.82), rgba(14, 32, 46, 0.64));
  border: 1px solid rgba(176, 213, 236, 0.22);
  box-shadow: 0 18px 42px rgba(4, 10, 18, 0.26);
  display: grid;
  align-content: center;
  gap: 10px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.14em;
  text-transform: uppercase;
  color: rgba(174, 219, 255, 0.95);
}

h1 {
  font-size: clamp(30px, 4.5vw, 42px);
  line-height: 1.1;
}

.hero p {
  color: rgba(223, 234, 249, 0.92);
  line-height: 1.65;
}

.reason-hint {
  color: rgba(255, 224, 133, 0.97);
}

.auth-shell {
  --liquid-bg: rgba(20, 33, 47, 0.5);
  --liquid-border: rgba(255, 255, 255, 0.22);
  --liquid-shadow: 0 18px 38px rgba(4, 8, 16, 0.28);
  border-radius: 16px;
  padding: 18px;
  display: grid;
  align-content: start;
  gap: 14px;
}

.auth-tabs {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.tab-btn {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  background: rgba(255, 255, 255, 0.17);
  color: rgba(232, 243, 255, 0.93);
  transition: transform 0.18s ease, background-color 0.2s ease;
}

.tab-btn:hover {
  transform: translateY(-1px);
}

.tab-btn.active {
  background: rgba(72, 198, 255, 0.24);
  box-shadow: inset 0 0 0 1px rgba(114, 225, 255, 0.48);
}

.auth-form {
  display: grid;
  gap: 10px;
  animation: fade-up 0.22s ease-out;
}

.field-label {
  font-size: 12px;
  color: rgba(215, 230, 249, 0.9);
}

.field-input {
  border: 0;
  border-radius: 10px;
  min-height: 40px;
  padding: 0 12px;
  background: rgba(8, 15, 24, 0.6);
  color: rgba(243, 250, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(165, 191, 220, 0.25);
}

.captcha-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 160px;
  gap: 8px;
  align-items: stretch;
}

.captcha-preview {
  border: 0;
  border-radius: 10px;
  overflow: hidden;
  background: rgba(10, 16, 24, 0.6);
  box-shadow: inset 0 0 0 1px rgba(165, 191, 220, 0.26);
  display: grid;
  place-items: center;
}

.captcha-loading {
  font-size: 12px;
  color: rgba(213, 228, 245, 0.9);
}

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
}

.primary-btn,
.ghost-btn,
.oauth-btn {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 12px;
  color: rgba(240, 248, 255, 0.96);
}

.primary-btn {
  background: linear-gradient(140deg, rgba(38, 173, 245, 0.46), rgba(41, 200, 161, 0.4));
}

.ghost-btn,
.oauth-btn {
  background: rgba(255, 255, 255, 0.17);
}

.primary-btn:disabled,
.ghost-btn:disabled,
.oauth-btn:disabled {
  opacity: 0.56;
  cursor: not-allowed;
}

.oauth-block {
  margin-top: 8px;
  padding-top: 10px;
  border-top: 1px dashed rgba(199, 223, 244, 0.28);
  display: grid;
  gap: 8px;
}

.oauth-title {
  color: rgba(216, 231, 247, 0.9);
}

.oauth-actions {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.state-tip {
  color: rgba(213, 231, 251, 0.9);
}

.error-text {
  color: rgba(255, 186, 204, 0.95);
  font-size: 12px;
  line-height: 1.5;
}

@keyframes fade-up {
  from {
    opacity: 0;
    transform: translateY(6px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@keyframes rise-in {
  from {
    opacity: 0;
    transform: translateY(10px) scale(0.99);
  }
  to {
    opacity: 1;
    transform: translateY(0) scale(1);
  }
}

@media (max-width: 980px) {
  .auth-center {
    grid-template-columns: 1fr;
  }

  .hero {
    padding: 18px 16px;
  }
}
</style>
