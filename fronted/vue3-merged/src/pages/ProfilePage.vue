<template>
  <section class="route-page profile-page motion-managed">
    <div class="profile-shell">
      <aside class="profile-tabs liquid-material">
        <button
          v-for="tab in tabs"
          :key="tab.key"
          class="tab-btn ripple-trigger"
          :class="{ active: activeTab === tab.key }"
          type="button"
          @click="openTab(tab.key)"
        >
          <span class="tab-title">{{ tab.label }}</span>
          <span class="tab-caption">{{ tab.caption }}</span>
        </button>
      </aside>

      <section class="profile-main liquid-material">
        <ProfileHeroCard
          :avatar-url="avatarPreview"
          :avatar-action-label="activeTab === ProfileTabKey.ACCOUNT ? '打开头像操作' : '查看头像'"
          :eyebrow="heroEyebrow"
          :title="heroTitle"
          :subtitle="heroSubtitle"
          :user-id-text="userIdText"
          :groups-text="groupsText"
          :chips="heroChips"
          @avatar-click="handleHeroAvatarClick"
        />

        <p v-if="globalHint" class="state-tip">{{ globalHint }}</p>
        <p v-if="activeTab === ProfileTabKey.ACCOUNT && accountLoading" class="state-tip">正在同步账号数据...</p>

        <ProfileSectionAccordion :sections="activeSections" :open-key="openSectionKey" @toggle="toggleActiveSection">
          <template #section-nickname>
            <form class="stack-form" @submit.prevent="saveNickname">
              <label class="field-label" for="nickname-input">昵称</label>
              <div class="inline-actions">
                <input id="nickname-input" v-model.trim="profileForm.nickname" class="field-input grow" type="text" maxlength="128" required />
                <button class="primary-btn ripple-trigger" type="submit" :disabled="profileSubmitting">
                  {{ profileSubmitting ? '保存中...' : '保存昵称' }}
                </button>
              </div>
            </form>
            <p v-if="profileError" class="error-text">{{ profileError }}</p>
          </template>

          <template #section-session>
            <p class="helper-text">你可以在这里快速退出当前会话。</p>
            <button class="danger-btn ripple-trigger" type="button" @click="handleLogout">安全退出</button>
          </template>

          <template #section-avatar>
            <div class="avatar-workbench">
              <img :src="avatarPreview" alt="avatar" class="avatar-image" />
              <div class="avatar-controls">
                <div class="inline-actions">
                  <button class="ghost-btn ripple-trigger" type="button" @click="openAvatarActions">头像操作</button>
                  <button class="ghost-btn ripple-trigger" type="button" @click="triggerAvatarFilePicker">重新选择图片</button>
                </div>
                <p v-if="selectedAvatarFile" class="helper-text">
                  已选择：{{ selectedAvatarFile.name }}（{{ selectedAvatarFile.type || 'unknown' }}）
                </p>
                <button
                  class="primary-btn ripple-trigger"
                  type="button"
                  :disabled="avatarUploading || !selectedAvatarFile"
                  @click="submitAvatarUpload"
                >
                  {{ avatarUploading ? '上传中...' : '上传到 OSS' }}
                </button>
                <p class="helper-text">支持 png/jpeg/webp，最大 2MB。</p>
              </div>
            </div>
            <p v-if="avatarError" class="error-text">{{ avatarError }}</p>
          </template>

          <template #section-account-info>
            <table class="kv-table">
              <tbody>
                <tr>
                  <th>用户名</th>
                  <td>{{ account.username || '-' }}</td>
                </tr>
                <tr>
                  <th>邮箱</th>
                  <td>{{ account.email || '-' }}</td>
                </tr>
                <tr>
                  <th>邮箱验证</th>
                  <td>{{ account.emailVerified ? '已验证' : '未验证' }}</td>
                </tr>
                <tr>
                  <th>本地密码</th>
                  <td>{{ account.hasPassword ? '已设置' : '未设置' }}</td>
                </tr>
              </tbody>
            </table>
          </template>

          <template #section-email-bind>
            <form class="stack-form" @submit.prevent="submitBindEmail">
              <label class="field-label" for="bind-email">邮箱</label>
              <input id="bind-email" v-model.trim="bindEmailForm.email" class="field-input" type="email" autocomplete="email" required />

              <label class="field-label" for="bind-password">密码</label>
              <input id="bind-password" v-model="bindEmailForm.password" class="field-input" type="password" minlength="8" autocomplete="new-password" required />

              <label class="field-label" for="bind-captcha-answer">图形验证码</label>
              <div class="captcha-row">
                <input
                  id="bind-captcha-answer"
                  v-model.trim="bindEmailForm.captchaAnswer"
                  class="field-input grow"
                  type="text"
                  autocomplete="off"
                  required
                />
                <button class="captcha-preview ripple-trigger" type="button" :disabled="captchaLoading" @click="refreshCaptcha">
                  <span v-if="captchaLoading">刷新中...</span>
                  <span v-else class="captcha-svg" v-html="captcha.svgContent || placeholderCaptcha"></span>
                </button>
              </div>

              <label class="field-label" for="bind-email-code">邮箱验证码</label>
              <div class="inline-actions">
                <input id="bind-email-code" v-model.trim="bindEmailForm.emailCode" class="field-input grow" type="text" autocomplete="off" required />
                <button class="ghost-btn ripple-trigger" type="button" :disabled="bindCodeLocked" @click="sendBindEmailCode">
                  {{ bindCodeButtonText }}
                </button>
              </div>

              <button class="primary-btn ripple-trigger" type="submit" :disabled="bindEmailSubmitting">
                {{ bindEmailSubmitting ? '绑定中...' : '绑定邮箱' }}
              </button>
            </form>
            <p v-if="bindCodeError" class="error-text">{{ bindCodeError }}</p>
            <p v-if="bindEmailError" class="error-text">{{ bindEmailError }}</p>
          </template>

          <template #section-oauth-bind>
            <p class="helper-text">绑定后可使用对应平台直接登录当前账号。</p>
            <div class="inline-actions">
              <button class="oauth-btn ripple-trigger" type="button" :disabled="oauthBindingSubmitting" @click="startOAuthBind('github')">
                绑定 GitHub
              </button>
              <button class="oauth-btn ripple-trigger" type="button" :disabled="oauthBindingSubmitting" @click="startOAuthBind('linuxdo')">
                绑定 LinuxDo
              </button>
            </div>

            <table class="simple-table">
              <thead>
                <tr>
                  <th>Provider</th>
                  <th>Login</th>
                  <th>绑定时间</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="item in account.oauthBindings" :key="`${item.provider}-${item.providerLogin}`">
                  <td>{{ item.provider }}</td>
                  <td>{{ item.providerLogin || '-' }}</td>
                  <td>{{ item.boundAt || '-' }}</td>
                </tr>
                <tr v-if="!account.oauthBindings.length">
                  <td colspan="3">暂无绑定</td>
                </tr>
              </tbody>
            </table>
            <p v-if="oauthBindingError" class="error-text">{{ oauthBindingError }}</p>
          </template>

          <template #section-change-password>
            <form class="stack-form" @submit.prevent="submitChangePassword">
              <label class="field-label" for="change-email">邮箱</label>
              <input id="change-email" v-model.trim="changePasswordForm.email" class="field-input" type="email" autocomplete="email" required />

              <label class="field-label" for="change-captcha-answer">图形验证码</label>
              <div class="captcha-row">
                <input
                  id="change-captcha-answer"
                  v-model.trim="changePasswordForm.captchaAnswer"
                  class="field-input grow"
                  type="text"
                  autocomplete="off"
                  required
                />
                <button class="captcha-preview ripple-trigger" type="button" :disabled="captchaLoading" @click="refreshCaptcha">
                  <span v-if="captchaLoading">刷新中...</span>
                  <span v-else class="captcha-svg" v-html="captcha.svgContent || placeholderCaptcha"></span>
                </button>
              </div>

              <label class="field-label" for="change-email-code">邮箱验证码</label>
              <div class="inline-actions">
                <input id="change-email-code" v-model.trim="changePasswordForm.emailCode" class="field-input grow" type="text" autocomplete="off" required />
                <button class="ghost-btn ripple-trigger" type="button" :disabled="changePwdCodeLocked" @click="sendChangePwdCode">
                  {{ changePwdCodeButtonText }}
                </button>
              </div>

              <label class="field-label" for="change-new-password">新密码</label>
              <input id="change-new-password" v-model="changePasswordForm.newPassword" class="field-input" type="password" minlength="8" autocomplete="new-password" required />

              <label class="field-label" for="change-confirm-password">确认新密码</label>
              <input id="change-confirm-password" v-model="changePasswordForm.confirmPassword" class="field-input" type="password" minlength="8" autocomplete="new-password" required />

              <button class="primary-btn ripple-trigger" type="submit" :disabled="changePasswordSubmitting">
                {{ changePasswordSubmitting ? '提交中...' : '修改密码' }}
              </button>
            </form>
            <p v-if="changePwdCodeError" class="error-text">{{ changePwdCodeError }}</p>
            <p v-if="changePasswordError" class="error-text">{{ changePasswordError }}</p>
          </template>

          <template #section-workspace>
            <div class="placeholder-card">
              <p class="placeholder-title">创作工作台</p>
              <p class="helper-text">后续将接入草稿、发布与文章统计，这里先保留结构入口。</p>
              <div class="inline-actions compact">
                <span class="status-chip">草稿 0</span>
                <span class="status-chip">已发布 0</span>
                <span class="status-chip">收藏 0</span>
              </div>
            </div>
          </template>

          <template #section-archive>
            <div class="placeholder-card">
              <p class="placeholder-title">归档与历史</p>
              <p class="helper-text">可在此扩展浏览记录、点赞记录、收藏列表。</p>
            </div>
          </template>

          <template #section-appearance>
            <div class="placeholder-card">
              <p class="placeholder-title">外观设置</p>
              <p class="helper-text">打开外观面板调整主题与背景效果。</p>
              <button class="primary-btn ripple-trigger" type="button" @click="settingsVisible = true">打开外观设置</button>
            </div>
          </template>

          <template #section-advanced>
            <div class="placeholder-card">
              <p class="placeholder-title">高级偏好</p>
              <p class="helper-text">本区域用于后续扩展实验功能和行为偏好。</p>
            </div>
          </template>
        </ProfileSectionAccordion>
      </section>
    </div>

    <ProfileAvatarActionSheet
      :visible="avatarActionVisible"
      @close="avatarActionVisible = false"
      @view="openAvatarPreview"
      @edit="handleAvatarEdit"
    />

    <ProfileAvatarPreviewDialog
      :visible="avatarPreviewVisible"
      :avatar-url="avatarPreview"
      @close="avatarPreviewVisible = false"
    />

    <input
      ref="avatarFileInput"
      class="hidden-file-input"
      type="file"
      accept="image/png,image/jpeg,image/webp"
      @change="onAvatarFileChange"
    />

    <SettingsPanel :visible="settingsVisible" @close="settingsVisible = false" />
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import ProfileAvatarActionSheet from '../components/profile/ProfileAvatarActionSheet.vue';
import ProfileAvatarPreviewDialog from '../components/profile/ProfileAvatarPreviewDialog.vue';
import ProfileHeroCard from '../components/profile/ProfileHeroCard.vue';
import ProfileSectionAccordion from '../components/profile/ProfileSectionAccordion.vue';
import SettingsPanel from '../components/SettingsPanel.vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  ProfileSectionKey,
  ProfileTabKey,
  buildSectionSummary,
  createProfileAccordionState,
  getTabOpenSection,
  toggleProfileAccordion
} from './profileUiState';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();

const settingsVisible = ref(false);
const avatarFileInput = ref(null);

const tabs = [
  { key: ProfileTabKey.PROFILE, label: '个人', caption: '资料与会话' },
  { key: ProfileTabKey.ACCOUNT, label: '账号', caption: '绑定与安全' },
  { key: ProfileTabKey.ARTICLES, label: '文章', caption: '创作工作台' },
  { key: ProfileTabKey.SETTINGS, label: '设置', caption: '外观与偏好' }
];

const accountLoading = ref(false);
const profileSubmitting = ref(false);
const bindEmailSubmitting = ref(false);
const changePasswordSubmitting = ref(false);
const oauthBindingSubmitting = ref(false);
const avatarUploading = ref(false);
const captchaLoading = ref(false);
const bindCodeSubmitting = ref(false);
const changePwdCodeSubmitting = ref(false);

const bindCodeCooldownSec = ref(0);
const changePwdCodeCooldownSec = ref(0);
const selectedAvatarFile = ref(null);
const avatarActionVisible = ref(false);
const avatarPreviewVisible = ref(false);

const globalHint = ref('');
const profileError = ref('');
const bindEmailError = ref('');
const changePasswordError = ref('');
const oauthBindingError = ref('');
const avatarError = ref('');
const bindCodeError = ref('');
const changePwdCodeError = ref('');

const account = reactive({
  userId: 0,
  username: '',
  nickname: '',
  email: '',
  emailVerified: 0,
  avatarUrl: '',
  hasPassword: false,
  oauthBindings: []
});

const profileForm = reactive({
  nickname: ''
});

const bindEmailForm = reactive({
  email: '',
  password: '',
  captchaAnswer: '',
  emailCode: ''
});

const changePasswordForm = reactive({
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

const accordionState = reactive(createProfileAccordionState());

const placeholderCaptcha =
  '<svg xmlns="http://www.w3.org/2000/svg" width="156" height="46"><rect width="100%" height="100%" fill="#1a2537"/><text x="50%" y="52%" dominant-baseline="middle" text-anchor="middle" fill="#d2deef" font-size="11">刷新验证码</text></svg>';

let bindCooldownTimer = 0;
let changePwdCooldownTimer = 0;

function normalizeTab(raw) {
  return tabs.some((item) => item.key === raw) ? raw : ProfileTabKey.PROFILE;
}

function normalizeRedirectPath(path) {
  if (!path || typeof path !== 'string') return '/profile';
  if (!path.startsWith('/')) return '/profile';
  if (path.startsWith('/auth')) return '/profile';
  return path;
}

function toNumber(value) {
  const n = Number(value);
  return Number.isFinite(n) ? n : 0;
}

function readErrorMessage(error) {
  if (error && typeof error === 'object') {
    if (typeof error.detail === 'string' && error.detail) return error.detail;
    if (typeof error.message === 'string' && error.message) return error.message;
  }
  return '请求失败，请稍后重试';
}

function clearErrors() {
  profileError.value = '';
  bindEmailError.value = '';
  changePasswordError.value = '';
  oauthBindingError.value = '';
  avatarError.value = '';
  bindCodeError.value = '';
  changePwdCodeError.value = '';
}

function openTab(tabKey) {
  const normalized = normalizeTab(tabKey);
  if (activeTab.value === normalized) return;
  router.replace({ path: '/profile', query: { tab: normalized } });
}

function setGlobalHint(message) {
  globalHint.value = message;
}

function normalizeBindingView(raw) {
  return {
    provider: String(raw?.provider || ''),
    providerLogin: String(raw?.providerLogin || raw?.provider_login || ''),
    boundAt: String(raw?.boundAt || raw?.bound_at || '')
  };
}

function normalizeAccountView(raw) {
  return {
    userId: toNumber(raw?.userId ?? raw?.user_id),
    username: String(raw?.username || ''),
    nickname: String(raw?.nickname || ''),
    email: String(raw?.email || ''),
    emailVerified: toNumber(raw?.emailVerified ?? raw?.email_verified),
    avatarUrl: String(raw?.avatarUrl || raw?.avatar_url || ''),
    hasPassword: Boolean(raw?.hasPassword ?? raw?.has_password),
    oauthBindings: Array.isArray(raw?.oauthBindings || raw?.oauth_bindings)
      ? (raw?.oauthBindings || raw?.oauth_bindings).map(normalizeBindingView)
      : []
  };
}

function applyAccordionState(nextState) {
  Object.keys(accordionState).forEach((tabKey) => {
    accordionState[tabKey] = nextState[tabKey] ?? null;
  });
}

function forceOpenSection(tabKey, sectionKey) {
  const nextState = createProfileAccordionState({
    ...accordionState,
    [tabKey]: sectionKey
  });
  applyAccordionState(nextState);
}

function toggleActiveSection(sectionKey) {
  const nextState = toggleProfileAccordion(accordionState, activeTab.value, sectionKey);
  applyAccordionState(nextState);

  const openAccountSection = getTabOpenSection(nextState, ProfileTabKey.ACCOUNT);
  if (
    activeTab.value === ProfileTabKey.ACCOUNT &&
    (openAccountSection === ProfileSectionKey.ACCOUNT.EMAIL_BIND ||
      openAccountSection === ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD) &&
    !captcha.captchaId
  ) {
    refreshCaptcha();
  }
}

function startCooldown(target, seconds, timerType) {
  const value = Math.max(0, toNumber(seconds));
  if (timerType === 'bind' && bindCooldownTimer) {
    window.clearInterval(bindCooldownTimer);
    bindCooldownTimer = 0;
  }
  if (timerType === 'change' && changePwdCooldownTimer) {
    window.clearInterval(changePwdCooldownTimer);
    changePwdCooldownTimer = 0;
  }

  target.value = value;
  if (value <= 0) return;

  const timer = window.setInterval(() => {
    if (target.value <= 1) {
      target.value = 0;
      window.clearInterval(timer);
      if (timerType === 'bind') bindCooldownTimer = 0;
      if (timerType === 'change') changePwdCooldownTimer = 0;
      return;
    }
    target.value -= 1;
  }, 1000);

  if (timerType === 'bind') bindCooldownTimer = timer;
  if (timerType === 'change') changePwdCooldownTimer = timer;
}

async function refreshCaptcha() {
  captchaLoading.value = true;
  try {
    const payload = await auth.createImageCaptcha();
    captcha.captchaId = payload.captchaId || '';
    captcha.svgContent = payload.svgContent || '';
    captcha.expiresInSec = toNumber(payload.expiresInSec);
  } catch (error) {
    const message = readErrorMessage(error);
    bindCodeError.value = message;
    changePwdCodeError.value = message;
  } finally {
    captchaLoading.value = false;
  }
}

async function loadAccountProfile() {
  accountLoading.value = true;
  clearErrors();
  try {
    const payload = normalizeAccountView(await auth.getAccountProfile());
    account.userId = payload.userId;
    account.username = payload.username;
    account.nickname = payload.nickname;
    account.email = payload.email;
    account.emailVerified = payload.emailVerified;
    account.avatarUrl = payload.avatarUrl;
    account.hasPassword = payload.hasPassword;
    account.oauthBindings = payload.oauthBindings;

    profileForm.nickname = payload.nickname || auth.user.value?.nickname || '';
    bindEmailForm.email = payload.email || '';
    changePasswordForm.email = payload.email || '';
  } catch (error) {
    setGlobalHint(readErrorMessage(error));
  } finally {
    accountLoading.value = false;
  }
}

async function saveNickname() {
  profileError.value = '';
  profileSubmitting.value = true;
  try {
    const payload = normalizeAccountView(
      await auth.updateProfile({
        nickname: profileForm.nickname
      })
    );
    account.nickname = payload.nickname;
    setGlobalHint('昵称已更新');
  } catch (error) {
    profileError.value = readErrorMessage(error);
  } finally {
    profileSubmitting.value = false;
  }
}

async function sendBindEmailCode() {
  bindCodeError.value = '';
  if (!bindEmailForm.email) {
    bindCodeError.value = '请先输入邮箱';
    return;
  }
  if (!captcha.captchaId) {
    bindCodeError.value = '图形验证码已失效，请先刷新';
    return;
  }
  if (!bindEmailForm.captchaAnswer) {
    bindCodeError.value = '请输入图形验证码';
    return;
  }

  bindCodeSubmitting.value = true;
  try {
    const payload = await auth.sendEmailVerification({
      email: bindEmailForm.email,
      purpose: 'BIND',
      captchaId: captcha.captchaId,
      captchaAnswer: bindEmailForm.captchaAnswer
    });
    startCooldown(bindCodeCooldownSec, payload.cooldownSec || 60, 'bind');
  } catch (error) {
    bindCodeError.value = readErrorMessage(error);
  } finally {
    bindCodeSubmitting.value = false;
    await refreshCaptcha();
  }
}

async function submitBindEmail() {
  bindEmailError.value = '';
  bindEmailSubmitting.value = true;
  try {
    await auth.bindEmailCredential({
      email: bindEmailForm.email,
      password: bindEmailForm.password,
      emailCode: bindEmailForm.emailCode
    });
    await loadAccountProfile();
    setGlobalHint('邮箱绑定成功');
  } catch (error) {
    bindEmailError.value = readErrorMessage(error);
  } finally {
    bindEmailSubmitting.value = false;
  }
}

async function startOAuthBind(provider) {
  oauthBindingError.value = '';
  oauthBindingSubmitting.value = true;
  try {
    await auth.startOAuthBind(provider, '/profile?tab=account');
  } catch (error) {
    oauthBindingError.value = readErrorMessage(error);
    oauthBindingSubmitting.value = false;
  }
}

async function sendChangePwdCode() {
  changePwdCodeError.value = '';
  if (!changePasswordForm.email) {
    changePwdCodeError.value = '请先输入邮箱';
    return;
  }
  if (!captcha.captchaId) {
    changePwdCodeError.value = '图形验证码已失效，请先刷新';
    return;
  }
  if (!changePasswordForm.captchaAnswer) {
    changePwdCodeError.value = '请输入图形验证码';
    return;
  }

  changePwdCodeSubmitting.value = true;
  try {
    const payload = await auth.sendResetPasswordVerification({
      email: changePasswordForm.email,
      captchaId: captcha.captchaId,
      captchaAnswer: changePasswordForm.captchaAnswer
    });
    startCooldown(changePwdCodeCooldownSec, payload.cooldownSec || 60, 'change');
  } catch (error) {
    changePwdCodeError.value = readErrorMessage(error);
  } finally {
    changePwdCodeSubmitting.value = false;
    await refreshCaptcha();
  }
}

async function submitChangePassword() {
  changePasswordError.value = '';
  changePasswordSubmitting.value = true;
  try {
    await auth.changePasswordByEmail({
      email: changePasswordForm.email,
      emailCode: changePasswordForm.emailCode,
      newPassword: changePasswordForm.newPassword,
      confirmPassword: changePasswordForm.confirmPassword
    });
    setGlobalHint('密码修改成功');
    changePasswordForm.emailCode = '';
    changePasswordForm.newPassword = '';
    changePasswordForm.confirmPassword = '';
  } catch (error) {
    changePasswordError.value = readErrorMessage(error);
  } finally {
    changePasswordSubmitting.value = false;
  }
}

function onAvatarFileChange(event) {
  const file = event?.target?.files?.[0];
  selectedAvatarFile.value = file || null;
  if (file) {
    forceOpenSection(ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.AVATAR);
    router.replace({ path: '/profile', query: { tab: ProfileTabKey.ACCOUNT } });
  }
}

async function submitAvatarUpload() {
  avatarError.value = '';
  if (!selectedAvatarFile.value) {
    avatarError.value = '请先选择头像文件';
    return;
  }
  avatarUploading.value = true;
  try {
    const avatarUrl = await auth.uploadAvatar(selectedAvatarFile.value);
    account.avatarUrl = avatarUrl;
    selectedAvatarFile.value = null;
    if (avatarFileInput.value) {
      avatarFileInput.value.value = '';
    }
    setGlobalHint('头像上传成功');
  } catch (error) {
    avatarError.value = readErrorMessage(error);
  } finally {
    avatarUploading.value = false;
  }
}

function triggerAvatarFilePicker() {
  if (avatarFileInput.value) {
    avatarFileInput.value.click();
  }
}

function openAvatarActions() {
  avatarActionVisible.value = true;
}

function openAvatarPreview() {
  avatarActionVisible.value = false;
  avatarPreviewVisible.value = true;
}

async function handleAvatarEdit() {
  avatarActionVisible.value = false;
  if (activeTab.value !== ProfileTabKey.ACCOUNT) {
    await router.replace({ path: '/profile', query: { tab: ProfileTabKey.ACCOUNT } });
  }
  forceOpenSection(ProfileTabKey.ACCOUNT, ProfileSectionKey.ACCOUNT.AVATAR);
  triggerAvatarFilePicker();
}

function handleHeroAvatarClick() {
  if (activeTab.value === ProfileTabKey.ACCOUNT) {
    openAvatarActions();
    return;
  }
  avatarPreviewVisible.value = true;
}

async function handleLogout() {
  if (typeof window !== 'undefined') {
    const confirmed = window.confirm('确认登出当前账号？');
    if (!confirmed) return;
  }

  await auth.logout();
  settingsVisible.value = false;
  router.replace({
    path: '/auth',
    query: {
      reason: 'signed_out',
      redirect: '/profile'
    }
  });
}

const activeTab = computed(() => {
  const raw = typeof route.query.tab === 'string' ? route.query.tab : '';
  return normalizeTab(raw);
});

const openSectionKey = computed(() => getTabOpenSection(accordionState, activeTab.value));

const displayName = computed(() => auth.user.value?.nickname || account.nickname || '未命名用户');
const userIdText = computed(() => {
  const id = toNumber(auth.user.value?.userId || account.userId);
  return id > 0 ? String(id) : '未知';
});
const groupsText = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.length ? groups.join(' / ') : '未分组';
});
const avatarPreview = computed(() => {
  return account.avatarUrl || auth.user.value?.avatarUrl || '/images/katanegai.jpg';
});
const oauthBindingCount = computed(() => account.oauthBindings.length);

const bindCodeLocked = computed(() => bindCodeSubmitting.value || bindCodeCooldownSec.value > 0);
const changePwdCodeLocked = computed(() => changePwdCodeSubmitting.value || changePwdCodeCooldownSec.value > 0);
const bindCodeButtonText = computed(() => {
  if (bindCodeSubmitting.value) return '发送中...';
  if (bindCodeCooldownSec.value > 0) return `${bindCodeCooldownSec.value}s`;
  return '发送验证码';
});
const changePwdCodeButtonText = computed(() => {
  if (changePwdCodeSubmitting.value) return '发送中...';
  if (changePwdCodeCooldownSec.value > 0) return `${changePwdCodeCooldownSec.value}s`;
  return '发送验证码';
});

const heroEyebrow = computed(() => {
  if (activeTab.value === ProfileTabKey.ACCOUNT) return 'Account Security';
  if (activeTab.value === ProfileTabKey.ARTICLES) return 'Content Workspace';
  if (activeTab.value === ProfileTabKey.SETTINGS) return 'Appearance';
  return 'User Center';
});

const heroTitle = computed(() => {
  if (activeTab.value === ProfileTabKey.ACCOUNT) return '账号与安全';
  if (activeTab.value === ProfileTabKey.ARTICLES) return '内容工作台';
  if (activeTab.value === ProfileTabKey.SETTINGS) return '偏好与外观';
  return `你好，${displayName.value}`;
});

const heroSubtitle = computed(() => {
  if (activeTab.value === ProfileTabKey.ACCOUNT) return '绑定方式、邮箱验证与密码变更都集中在这里。';
  if (activeTab.value === ProfileTabKey.ARTICLES) return '先保留高质量结构入口，后续接入实际文章数据。';
  if (activeTab.value === ProfileTabKey.SETTINGS) return '把高频设置放前面，减少无关信息干扰。';
  return '个人信息默认保持简洁，按需展开查看细节。';
});

const heroChips = computed(() => {
  if (activeTab.value === ProfileTabKey.ACCOUNT) {
    return [
      account.email ? '邮箱已填写' : '邮箱未填写',
      account.emailVerified ? '邮箱已验证' : '邮箱未验证',
      account.hasPassword ? '已设置密码' : '未设置密码',
      `OAuth ${oauthBindingCount.value}`
    ];
  }
  if (activeTab.value === ProfileTabKey.ARTICLES) {
    return ['草稿入口', '发布入口', '归档入口'];
  }
  if (activeTab.value === ProfileTabKey.SETTINGS) {
    return ['主题面板', '实验偏好'];
  }
  return [groupsText.value, `权限 ${Array.isArray(auth.user.value?.permissions) ? auth.user.value.permissions.length : 0}`];
});

const profileSections = computed(() => [
  {
    key: ProfileSectionKey.PROFILE.NICKNAME,
    title: '昵称资料',
    summary: buildSectionSummary(ProfileSectionKey.PROFILE.NICKNAME, {
      nickname: profileForm.nickname || displayName.value
    }),
    statusText: profileForm.nickname ? '已填写' : '待设置'
  },
  {
    key: ProfileSectionKey.PROFILE.SESSION,
    title: '会话管理',
    summary: buildSectionSummary(ProfileSectionKey.PROFILE.SESSION),
    statusText: '在线'
  }
]);

const accountSections = computed(() => [
  {
    key: ProfileSectionKey.ACCOUNT.AVATAR,
    title: '头像管理',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.AVATAR, {
      avatarUrl: account.avatarUrl
    }),
    statusText: account.avatarUrl ? '已设置' : '默认头像'
  },
  {
    key: ProfileSectionKey.ACCOUNT.ACCOUNT_INFO,
    title: '账号信息',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.ACCOUNT_INFO, {
      email: account.email
    }),
    statusText: account.username || '未命名'
  },
  {
    key: ProfileSectionKey.ACCOUNT.EMAIL_BIND,
    title: '邮箱绑定',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.EMAIL_BIND, {
      emailVerified: Boolean(account.emailVerified)
    }),
    statusText: account.email ? '已绑定' : '未绑定'
  },
  {
    key: ProfileSectionKey.ACCOUNT.OAUTH_BIND,
    title: 'OAuth 绑定',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.OAUTH_BIND, {
      oauthBindingCount: oauthBindingCount.value
    }),
    statusText: `${oauthBindingCount.value} 个`
  },
  {
    key: ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD,
    title: '修改密码',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD, {
      hasPassword: account.hasPassword
    }),
    statusText: account.hasPassword ? '可修改' : '需先设置'
  }
]);

const articlesSections = computed(() => [
  {
    key: ProfileSectionKey.ARTICLES.WORKSPACE,
    title: '创作工作台',
    summary: buildSectionSummary(ProfileSectionKey.ARTICLES.WORKSPACE),
    statusText: '占位'
  },
  {
    key: ProfileSectionKey.ARTICLES.ARCHIVE,
    title: '归档历史',
    summary: buildSectionSummary(ProfileSectionKey.ARTICLES.ARCHIVE),
    statusText: '占位'
  }
]);

const settingsSections = computed(() => [
  {
    key: ProfileSectionKey.SETTINGS.APPEARANCE,
    title: '外观设置',
    summary: buildSectionSummary(ProfileSectionKey.SETTINGS.APPEARANCE),
    statusText: '可编辑'
  },
  {
    key: ProfileSectionKey.SETTINGS.ADVANCED,
    title: '高级偏好',
    summary: buildSectionSummary(ProfileSectionKey.SETTINGS.ADVANCED),
    statusText: '预留'
  }
]);

const activeSections = computed(() => {
  if (activeTab.value === ProfileTabKey.ACCOUNT) return accountSections.value;
  if (activeTab.value === ProfileTabKey.ARTICLES) return articlesSections.value;
  if (activeTab.value === ProfileTabKey.SETTINGS) return settingsSections.value;
  return profileSections.value;
});

watch(
  () => route.query.tab,
  (nextTab) => {
    const raw = typeof nextTab === 'string' ? nextTab : '';
    const normalized = normalizeTab(raw);
    if (raw === normalized) return;
    router.replace({ path: '/profile', query: { tab: normalized } });
  },
  { immediate: true }
);

watch(
  () => activeTab.value,
  async (tab) => {
    if (tab === ProfileTabKey.ACCOUNT) {
      await loadAccountProfile();
      if (!captcha.captchaId) {
        await refreshCaptcha();
      }
    }
  },
  { immediate: true }
);

onMounted(async () => {
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) {
    router.replace({
      path: '/auth',
      query: {
        reason: 'session_expired',
        redirect: normalizeRedirectPath('/profile')
      }
    });
  }
});

onBeforeUnmount(() => {
  if (bindCooldownTimer) {
    window.clearInterval(bindCooldownTimer);
    bindCooldownTimer = 0;
  }
  if (changePwdCooldownTimer) {
    window.clearInterval(changePwdCooldownTimer);
    changePwdCooldownTimer = 0;
  }
});
</script>

<style scoped>
.profile-page {
  height: 100%;
  color: rgba(236, 243, 255, 0.95);
  font-family: 'Avenir Next', 'PingFang SC', 'Noto Sans SC', sans-serif;
  animation: page-enter 0.32s ease;
}

@keyframes page-enter {
  from {
    opacity: 0;
    transform: translateY(8px);
  }

  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.profile-shell {
  height: 100%;
  min-height: 0;
  display: grid;
  grid-template-columns: 240px minmax(0, 1fr);
  gap: 12px;
}

.profile-tabs {
  --liquid-bg: linear-gradient(168deg, rgba(18, 27, 41, 0.48), rgba(12, 18, 30, 0.42));
  --liquid-border: rgba(225, 235, 248, 0.2);
  --liquid-shadow: 0 16px 30px rgba(4, 7, 12, 0.2);
  border-radius: 16px;
  padding: 10px;
  display: grid;
  gap: 8px;
  align-content: start;
}

.tab-btn {
  border: 0;
  border-radius: 12px;
  min-height: 54px;
  padding: 8px 12px;
  display: grid;
  gap: 2px;
  text-align: left;
  color: rgba(225, 236, 251, 0.92);
  background: rgba(255, 255, 255, 0.14);
}

.tab-btn.active {
  background: rgba(var(--accent-rgb), 0.24);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.44);
}

.tab-title {
  font-size: 14px;
  font-weight: 640;
}

.tab-caption {
  font-size: 11px;
  color: rgba(200, 216, 238, 0.88);
}

.profile-main {
  --liquid-bg: linear-gradient(165deg, rgba(18, 27, 41, 0.45), rgba(10, 15, 25, 0.39));
  --liquid-border: rgba(220, 232, 248, 0.2);
  --liquid-shadow: 0 18px 32px rgba(3, 6, 11, 0.18);
  border-radius: 16px;
  padding: 14px;
  min-height: 0;
  overflow: auto;
  display: grid;
  align-content: start;
  gap: 10px;
}

.state-tip {
  margin: 2px 2px 4px;
  color: rgba(209, 224, 245, 0.94);
  font-size: 12px;
}

.stack-form {
  display: grid;
  gap: 8px;
}

.field-label {
  font-size: 12px;
  color: rgba(215, 228, 246, 0.9);
}

.field-input,
select.field-input {
  border: 0;
  border-radius: 10px;
  min-height: 38px;
  padding: 0 12px;
  background: rgba(8, 14, 24, 0.56);
  color: rgba(238, 245, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(175, 196, 227, 0.22);
}

.inline-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: center;
}

.inline-actions.compact {
  gap: 6px;
}

.grow {
  flex: 1;
}

.primary-btn,
.ghost-btn,
.oauth-btn,
.danger-btn {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 12px;
  color: rgba(240, 246, 255, 0.95);
}

.primary-btn {
  background: rgba(var(--accent-rgb), 0.34);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.38);
}

.ghost-btn,
.oauth-btn {
  background: rgba(255, 255, 255, 0.16);
}

.danger-btn {
  background: rgba(236, 97, 126, 0.25);
  box-shadow: inset 0 0 0 1px rgba(255, 176, 198, 0.32);
}

.status-chip {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  background: rgba(var(--accent-rgb), 0.22);
  color: rgba(240, 246, 255, 0.95);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.42);
}

.helper-text {
  color: rgba(206, 221, 241, 0.9);
  font-size: 12px;
}

.error-text {
  color: rgba(255, 188, 206, 0.96);
  font-size: 12px;
}

.kv-table,
.simple-table {
  width: 100%;
  border-collapse: collapse;
  font-size: 13px;
}

.kv-table th,
.kv-table td,
.simple-table th,
.simple-table td {
  padding: 8px 6px;
  border-bottom: 1px solid rgba(188, 209, 234, 0.18);
  text-align: left;
}

.kv-table th,
.simple-table th {
  color: rgba(194, 214, 239, 0.92);
  font-weight: 600;
}

.avatar-workbench {
  display: grid;
  grid-template-columns: 120px minmax(0, 1fr);
  gap: 12px;
  align-items: start;
}

.avatar-image {
  width: 108px;
  height: 108px;
  border-radius: 18px;
  object-fit: cover;
  box-shadow: inset 0 0 0 1px rgba(171, 194, 226, 0.3);
  background: rgba(9, 14, 21, 0.55);
}

.avatar-controls {
  display: grid;
  gap: 8px;
}

.captcha-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 156px;
  gap: 8px;
  align-items: stretch;
}

.captcha-preview {
  border: 0;
  border-radius: 10px;
  overflow: hidden;
  background: rgba(8, 14, 24, 0.56);
  box-shadow: inset 0 0 0 1px rgba(175, 196, 227, 0.22);
  color: rgba(224, 237, 251, 0.92);
}

.captcha-svg :deep(svg) {
  width: 100%;
  height: 46px;
  display: block;
}

.placeholder-card {
  display: grid;
  gap: 8px;
  padding: 10px;
  border-radius: 12px;
  background: rgba(11, 18, 28, 0.34);
  box-shadow: inset 0 0 0 1px rgba(173, 196, 228, 0.16);
}

.placeholder-title {
  font-size: 14px;
  font-weight: 620;
}

.hidden-file-input {
  position: fixed;
  width: 0;
  height: 0;
  opacity: 0;
  pointer-events: none;
}

@media (max-width: 960px) {
  .profile-shell {
    grid-template-columns: 1fr;
  }

  .profile-tabs {
    grid-template-columns: repeat(4, minmax(0, 1fr));
    align-items: stretch;
  }

  .tab-btn {
    min-height: 52px;
    padding: 8px;
  }

  .tab-caption {
    display: none;
  }
}

@media (max-width: 760px) {
  .profile-main {
    padding: 10px;
  }

  .avatar-workbench {
    grid-template-columns: 1fr;
  }

  .avatar-image {
    width: 96px;
    height: 96px;
  }

  .captcha-row {
    grid-template-columns: 1fr;
  }
}
</style>
