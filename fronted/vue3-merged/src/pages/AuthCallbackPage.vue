<template>
  <section class="route-page callback-page">
    <header class="page-header">
      <p class="eyebrow">OAuth Callback</p>
      <h1>授权回调处理中</h1>
      <p>{{ statusText }}</p>
      <p v-if="errorText" class="error-text">{{ errorText }}</p>
      <button v-if="errorText" class="back-btn ripple-trigger" type="button" @click="goAuthPage">返回登录页</button>
    </header>
  </section>
</template>

<script setup>
import { onMounted, ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();
const statusText = ref('正在校验授权信息...');
const errorText = ref('');
const hasHandledCallback = ref(false);

function normalizeRedirectPath(path) {
  if (!path || typeof path !== 'string') return '/profile';
  if (!path.startsWith('/')) return '/profile';
  if (path.startsWith('/auth')) return '/profile';
  return path;
}

function readErrorMessage(error) {
  const mapOAuthExchangeFailure = (message) => {
    const normalized = String(message || '').toLowerCase();
    if (normalized.includes('bad_verification_code') || normalized.includes('incorrect or expired')) {
      return '授权码无效或已过期，请返回登录页重新发起 GitHub 授权。';
    }
    return message;
  };

  if (error && typeof error === 'object') {
    if (typeof error.detail === 'string' && error.detail) return mapOAuthExchangeFailure(error.detail);
    if (typeof error.message === 'string' && error.message) return mapOAuthExchangeFailure(error.message);
  }
  return 'OAuth 回调处理失败';
}

function goAuthPage() {
  const redirect = normalizeRedirectPath(typeof route.query.redirect === 'string' ? route.query.redirect : '/profile');
  router.replace({
    path: '/auth',
    query: {
      reason: 'oauth_failed',
      redirect
    }
  });
}

function readQueryParamFromLocation(key) {
  if (typeof window === 'undefined') return '';
  const params = new URLSearchParams(window.location.search || '');
  return params.get(key) || '';
}

function clearOAuthSearchParams() {
  if (typeof window === 'undefined') return;

  const currentUrl = new URL(window.location.href);
  let changed = false;
  ['code', 'state', 'error', 'error_description'].forEach((key) => {
    if (!currentUrl.searchParams.has(key)) return;
    currentUrl.searchParams.delete(key);
    changed = true;
  });

  if (!changed) return;
  const nextSearch = currentUrl.searchParams.toString();
  const nextUrl = `${currentUrl.origin}${currentUrl.pathname}${nextSearch ? `?${nextSearch}` : ''}${currentUrl.hash}`;
  window.history.replaceState(window.history.state, '', nextUrl);
}

onMounted(async () => {
  if (hasHandledCallback.value) return;
  hasHandledCallback.value = true;

  await auth.ensureReady();

  // Hash 路由下 OAuth 平台通常会把 code/state 放在 location.search，而不是 hash query。
  const code =
    (typeof route.query.code === 'string' ? route.query.code : '') ||
    readQueryParamFromLocation('code');
  const state =
    (typeof route.query.state === 'string' ? route.query.state : '') ||
    readQueryParamFromLocation('state');
  const oauthError =
    (typeof route.query.error === 'string' ? route.query.error : '') ||
    readQueryParamFromLocation('error');
  const oauthErrorDescription =
    (typeof route.query.error_description === 'string' ? route.query.error_description : '') ||
    readQueryParamFromLocation('error_description');
  if (oauthError && !code) {
    clearOAuthSearchParams();
    statusText.value = 'OAuth 提供方拒绝授权';
    errorText.value = oauthErrorDescription
      ? `${oauthError} (${oauthErrorDescription})`
      : oauthError;
    return;
  }
  if (!code || !state) {
    if (auth.isAuthenticated.value) {
      const redirect = normalizeRedirectPath(typeof route.query.redirect === 'string' ? route.query.redirect : '/profile');
      await router.replace(redirect);
      return;
    }
    statusText.value = '回调参数不完整';
    errorText.value = '缺少 code 或 state，无法完成 OAuth 登录';
    return;
  }
  clearOAuthSearchParams();

  try {
    statusText.value = '正在向后端换取登录凭据...';
    const result = await auth.handleOAuthCallback({ code, state });
    if (result.resultType === 'BIND_SUCCESS') {
      statusText.value = '绑定成功，正在跳转账号中心...';
      await router.replace(normalizeRedirectPath(result.redirect || '/profile?tab=account'));
      return;
    }
    if (result.resultType === 'BIND_REQUIRED') {
      statusText.value = 'OAuth 账号冲突';
      errorText.value = '当前流程不支持登录页冲突绑定，请联系管理员处理。';
      return;
    }

    statusText.value = '登录成功，正在跳转...';
    await router.replace(normalizeRedirectPath(result.redirect || '/profile'));
  } catch (error) {
    statusText.value = 'OAuth 登录失败';
    errorText.value = readErrorMessage(error);
  }
});
</script>

<style scoped>
.callback-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 12px;
}

.page-header {
  padding: 8px 4px 4px;
  display: grid;
  gap: 8px;
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
  color: rgba(223, 230, 249, 0.88);
}

.error-text {
  color: rgba(255, 188, 204, 0.95);
}

.back-btn {
  justify-self: start;
  border: 0;
  border-radius: 10px;
  min-width: 132px;
  height: 36px;
  padding: 0 12px;
  background: rgba(var(--accent-rgb), 0.28);
  color: rgba(247, 242, 255, 0.95);
}
</style>
