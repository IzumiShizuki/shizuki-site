<template>
  <div class="m-auth-page">
    <header class="auth-head">
      <div class="auth-logo">
        <img src="/images/katanegai.jpg" alt="Shizuki" />
      </div>
      <h1 class="auth-title">{{ modeTitle }}</h1>
      <p class="auth-sub">Shizuki Site · 与网页端同一账号</p>
    </header>

    <div class="auth-tabs">
      <button
        v-for="tab in modeTabs"
        :key="tab.value"
        type="button"
        class="auth-tab"
        :class="{ active: mode === tab.value }"
        @click="switchMode(tab.value)"
      >
        {{ tab.label }}
      </button>
    </div>

    <form class="auth-form m-card" @submit.prevent="submit">
      <div class="m-input-group">
        <label class="m-input-label" for="m-auth-email">邮箱</label>
        <input
          id="m-auth-email"
          v-model.trim="form.email"
          class="m-input"
          type="email"
          autocomplete="email"
          inputmode="email"
          placeholder="you@example.com"
          required
        />
      </div>

      <div v-if="mode === 'register'" class="m-input-group">
        <label class="m-input-label" for="m-auth-nickname">昵称</label>
        <input
          id="m-auth-nickname"
          v-model.trim="form.nickname"
          class="m-input"
          type="text"
          autocomplete="nickname"
          placeholder="怎么称呼你？"
          required
        />
      </div>

      <div v-if="mode !== 'reset'" class="m-input-group">
        <label class="m-input-label" for="m-auth-password">密码</label>
        <input
          id="m-auth-password"
          v-model="form.password"
          class="m-input"
          type="password"
          :autocomplete="mode === 'login' ? 'current-password' : 'new-password'"
          placeholder="********"
          required
        />
      </div>

      <template v-if="mode !== 'login'">
        <div class="m-input-group">
          <label class="m-input-label" for="m-auth-captcha">图形验证码</label>
          <div class="m-input-row">
            <input
              id="m-auth-captcha"
              v-model.trim="form.captchaAnswer"
              class="m-input"
              type="text"
              inputmode="text"
              autocomplete="off"
              placeholder="输入右图字符"
              required
            />
            <button type="button" class="captcha-box" aria-label="刷新验证码" @click="refreshCaptcha">
              <span v-if="captchaLoading" class="captcha-loading">…</span>
              <span v-else-if="captcha.svgContent" class="captcha-svg" v-html="captcha.svgContent"></span>
              <span v-else class="captcha-loading">点击加载</span>
            </button>
          </div>
        </div>

        <div class="m-input-group">
          <label class="m-input-label" for="m-auth-code">邮箱验证码</label>
          <div class="m-input-row">
            <input
              id="m-auth-code"
              v-model.trim="form.emailCode"
              class="m-input"
              type="text"
              inputmode="numeric"
              autocomplete="one-time-code"
              placeholder="6 位验证码"
              required
            />
            <button type="button" class="m-input-side m-press" :disabled="codeCooldown > 0 || sendingCode" @click="sendCode">
              {{ codeCooldown > 0 ? `${codeCooldown}s` : sendingCode ? '发送中…' : '发送验证码' }}
            </button>
          </div>
        </div>
      </template>

      <template v-if="mode === 'reset'">
        <div class="m-input-group">
          <label class="m-input-label" for="m-auth-newpass">新密码</label>
          <input
            id="m-auth-newpass"
            v-model="form.newPassword"
            class="m-input"
            type="password"
            autocomplete="new-password"
            placeholder="********"
            required
          />
        </div>
        <div class="m-input-group">
          <label class="m-input-label" for="m-auth-confirm">确认新密码</label>
          <input
            id="m-auth-confirm"
            v-model="form.confirmPassword"
            class="m-input"
            type="password"
            autocomplete="new-password"
            placeholder="********"
            required
          />
        </div>
      </template>

      <p v-if="errorText" class="m-hint-error">{{ errorText }}</p>
      <p v-if="okText" class="m-hint-ok">{{ okText }}</p>

      <button type="submit" class="m-btn-primary m-press" :disabled="submitting">
        <i v-if="submitting" class="fa-solid fa-circle-notch fa-spin" aria-hidden="true"></i>
        {{ submitLabel }}
      </button>

      <button v-if="mode === 'login'" type="button" class="auth-link" @click="switchMode('reset')">
        忘记密码？
      </button>
    </form>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, reactive, ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useMobileShell } from '../mobileShellContext';

const route = useRoute();
const router = useRouter();
const shell = useMobileShell();
const { auth, library, showToast } = shell;

const mode = ref('login');
const submitting = ref(false);
const sendingCode = ref(false);
const captchaLoading = ref(false);
const codeCooldown = ref(0);
const errorText = ref('');
const okText = ref('');
const captcha = reactive({ captchaId: '', svgContent: '' });
const form = reactive({
  email: '',
  nickname: '',
  password: '',
  captchaAnswer: '',
  emailCode: '',
  newPassword: '',
  confirmPassword: ''
});

let cooldownTimer = null;

const modeTabs = [
  { value: 'login', label: '登录' },
  { value: 'register', label: '注册' },
  { value: 'reset', label: '重置密码' }
];

const modeTitle = computed(() => {
  if (mode.value === 'register') return '创建账号';
  if (mode.value === 'reset') return '重置密码';
  return '欢迎回来';
});

const submitLabel = computed(() => {
  if (submitting.value) return '请稍候…';
  if (mode.value === 'register') return '注册并登录';
  if (mode.value === 'reset') return '重置密码';
  return '登录';
});

function switchMode(next) {
  if (mode.value === next) return;
  mode.value = next;
  errorText.value = '';
  okText.value = '';
  form.captchaAnswer = '';
  form.emailCode = '';
  if (next !== 'login') refreshCaptcha();
}

async function refreshCaptcha() {
  if (captchaLoading.value) return;
  captchaLoading.value = true;
  try {
    const payload = await auth.createImageCaptcha();
    captcha.captchaId = payload?.captchaId || '';
    captcha.svgContent = payload?.svgContent || '';
  } catch (error) {
    errorText.value = error?.detail || error?.message || '验证码加载失败';
  } finally {
    captchaLoading.value = false;
  }
}

function startCooldown(seconds) {
  codeCooldown.value = Math.max(0, Math.floor(seconds || 60));
  if (cooldownTimer) clearInterval(cooldownTimer);
  cooldownTimer = setInterval(() => {
    codeCooldown.value -= 1;
    if (codeCooldown.value <= 0) clearInterval(cooldownTimer);
  }, 1000);
}

async function sendCode() {
  errorText.value = '';
  okText.value = '';
  if (!form.email) {
    errorText.value = '请先填写邮箱';
    return;
  }
  if (!captcha.captchaId || !form.captchaAnswer) {
    errorText.value = '请先完成图形验证码';
    return;
  }
  sendingCode.value = true;
  try {
    const send = mode.value === 'reset' ? auth.sendResetPasswordVerification : auth.sendRegisterVerification;
    const payload = await send({
      email: form.email,
      captchaId: captcha.captchaId,
      captchaAnswer: form.captchaAnswer
    });
    okText.value = '验证码已发送，请查收邮箱';
    startCooldown(payload?.cooldownSec || 60);
  } catch (error) {
    errorText.value = error?.detail || error?.message || '验证码发送失败';
    refreshCaptcha();
  } finally {
    sendingCode.value = false;
  }
}

function resolveRedirectPath() {
  const raw = typeof route.query.redirect === 'string' ? route.query.redirect : '';
  if (raw && raw.startsWith('/m')) return raw;
  return '/m/profile';
}

async function submit() {
  if (submitting.value) return;
  errorText.value = '';
  okText.value = '';
  submitting.value = true;
  try {
    if (mode.value === 'login') {
      await auth.loginByEmail({ email: form.email, password: form.password });
      showToast('登录成功');
    } else if (mode.value === 'register') {
      await auth.registerByEmail({
        email: form.email,
        password: form.password,
        nickname: form.nickname,
        emailCode: form.emailCode
      });
      showToast('注册成功，已自动登录');
    } else {
      if (form.newPassword !== form.confirmPassword) {
        throw new Error('两次输入的新密码不一致');
      }
      await auth.resetPasswordByEmail({
        email: form.email,
        emailCode: form.emailCode,
        newPassword: form.newPassword,
        confirmPassword: form.confirmPassword
      });
      okText.value = '密码已重置，请用新密码登录';
      switchMode('login');
      return;
    }
    library.handleAuthChanged().catch(() => {});
    router.replace(resolveRedirectPath());
  } catch (error) {
    errorText.value = error?.detail || error?.message || '操作失败，请稍后重试';
    if (mode.value !== 'login') refreshCaptcha();
  } finally {
    submitting.value = false;
  }
}

onBeforeUnmount(() => {
  if (cooldownTimer) clearInterval(cooldownTimer);
});
</script>

<style scoped>
.m-auth-page {
  display: flex;
  flex-direction: column;
  gap: 18px;
  max-width: 460px;
  margin: 0 auto;
  width: 100%;
}

.auth-head {
  display: grid;
  justify-items: center;
  gap: 8px;
  padding-top: 10px;
  text-align: center;
}

.auth-logo {
  width: 74px;
  height: 74px;
  border-radius: 24px;
  overflow: hidden;
  border: 1.5px solid var(--m-border-strong);
  box-shadow: var(--m-shadow-soft), 0 0 30px rgba(var(--m-accent-rgb), 0.2);
}

.auth-logo img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.auth-title {
  margin: 4px 0 0;
  font-size: 24px;
  font-weight: 800;
}

.auth-sub {
  margin: 0;
  font-size: 12px;
  color: var(--m-text-faint);
  letter-spacing: 0.06em;
}

.auth-tabs {
  display: flex;
  gap: 6px;
  padding: 5px;
  border-radius: 999px;
  background: var(--m-surface-soft);
  border: 1px solid var(--m-border);
}

.auth-tab {
  flex: 1;
  padding: 10px 0;
  border: none;
  border-radius: 999px;
  background: transparent;
  color: var(--m-text-sub);
  font-size: 13.5px;
  font-weight: 600;
  cursor: pointer;
  transition: background 200ms ease, color 200ms ease;
}

.auth-tab.active {
  background: var(--m-accent-gradient);
  color: #3c2320;
  box-shadow: 0 6px 16px rgba(var(--m-accent-rgb), 0.3);
}

.auth-form {
  display: grid;
  gap: 16px;
  padding: 22px 20px;
}

.captcha-box {
  flex-shrink: 0;
  width: 108px;
  border-radius: 15px;
  border: 1px solid var(--m-border);
  background: rgba(255, 255, 255, 0.88);
  overflow: hidden;
  cursor: pointer;
  display: grid;
  place-items: center;
}

.captcha-svg {
  display: block;
  width: 100%;
}

.captcha-svg :deep(svg) {
  display: block;
  width: 100%;
  height: 46px;
}

.captcha-loading {
  font-size: 12px;
  color: #6b5a52;
  padding: 14px 0;
}

.auth-link {
  justify-self: center;
  border: none;
  background: transparent;
  color: var(--m-text-sub);
  font-size: 13px;
  cursor: pointer;
  text-decoration: underline;
  text-underline-offset: 3px;
}

@media (orientation: landscape) and (max-height: 560px) {
  .m-auth-page {
    max-width: 560px;
  }

  .auth-head {
    display: none;
  }
}
</style>
