<template>
  <section class="route-page profile-page motion-managed">
    <div class="profile-stage liquid-material">
      <aside class="profile-anchor-nav" aria-label="个人分组导航">
        <RouteDotRail
          :items="navGroups"
          :active-key="activeGroup"
          distribution="mid-sixths"
          aria-label="个人分组导航"
          @select="navigateToGroup"
        />
      </aside>

      <section ref="profileContentPanel" class="profile-content-panel">
        <div class="profile-hero-sticky">
          <ProfileHeroCard
            :avatar-url="avatarPreview"
            avatar-action-label="查看或修改头像"
            :eyebrow="heroEyebrow"
            :title="heroTitle"
            :subtitle="heroSubtitle"
            :user-id-text="userIdText"
            :groups-text="groupsText"
            :chips="heroChips"
            @avatar-click="openAvatarActions"
          />
        </div>

        <p v-if="globalHint" class="state-tip">{{ globalHint }}</p>
        <section
          :id="ProfileTabKey.PROFILE"
          :ref="(el) => setGroupRef(ProfileTabKey.PROFILE, el)"
          :data-group-key="ProfileTabKey.PROFILE"
          class="profile-group"
        >
          <header class="group-header">
            <p class="group-eyebrow">Profile</p>
            <h3 class="group-title">个人概览</h3>
            <p class="group-caption">核心状态与快捷操作集中展示。</p>
          </header>

          <ProfileSectionAccordion
            :sections="profileSections"
            :open-keys="accordionState[ProfileTabKey.PROFILE]"
            @toggle="toggleGroupSection(ProfileTabKey.PROFILE, $event)"
          >
            <template #section-overview>
              <div class="overview-grid">
                <article v-for="card in profileOverviewCards" :key="card.key" class="overview-card">
                  <p class="overview-label">{{ card.label }}</p>
                  <p class="overview-value">{{ card.value }}</p>
                  <p class="overview-hint">{{ card.hint }}</p>
                </article>
              </div>
            </template>

            <template #section-quick-actions>
              <div class="quick-grid">
                <button class="quick-btn ripple-trigger" type="button" @click="openAccountSection(ProfileSectionKey.ACCOUNT.AVATAR)">
                  修改头像
                </button>
                <button class="quick-btn ripple-trigger" type="button" @click="openAccountSection(ProfileSectionKey.ACCOUNT.ACCOUNT_INFO)">
                  查看账号信息
                </button>
                <button class="quick-btn ripple-trigger" type="button" @click="openAccountSection(ProfileSectionKey.ACCOUNT.EMAIL_BIND)">
                  绑定邮箱
                </button>
                <button class="quick-btn ripple-trigger" type="button" @click="openAccountSection(ProfileSectionKey.ACCOUNT.OAUTH_BIND)">
                  绑定 GitHub / LinuxDo
                </button>
                <button class="quick-btn ripple-trigger" type="button" @click="openAccountSection(ProfileSectionKey.ACCOUNT.MUSIC_AUTH)">
                  音乐授权与排序
                </button>
                <button class="quick-btn ripple-trigger" type="button" @click="openAccountSection(ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD)">
                  修改密码
                </button>
                <button class="quick-btn ripple-trigger" type="button" @click="openSettingsAppearance">
                  外观设置
                </button>
              </div>
            </template>

            <template #section-recent>
              <div class="recent-grid">
                <div v-for="row in profileRecentRows" :key="row.key" class="recent-item">
                  <span class="recent-label">{{ row.label }}</span>
                  <span class="recent-value">{{ row.value }}</span>
                </div>
              </div>
              <div class="inline-actions compact">
                <button class="danger-btn ripple-trigger" type="button" @click="handleLogout">安全退出</button>
              </div>
            </template>
          </ProfileSectionAccordion>
        </section>

        <section
          :id="ProfileTabKey.ACCOUNT"
          :ref="(el) => setGroupRef(ProfileTabKey.ACCOUNT, el)"
          :data-group-key="ProfileTabKey.ACCOUNT"
          class="profile-group"
        >
          <header class="group-header">
            <p class="group-eyebrow">Account</p>
            <h3 class="group-title">账号与安全</h3>
            <p class="group-caption">绑定、改密、授权与个人凭据管理。</p>
          </header>

          <p v-if="accountLoading" class="state-tip">正在同步账号数据...</p>

          <ProfileSectionAccordion
            :sections="accountSections"
            :open-keys="accordionState[ProfileTabKey.ACCOUNT]"
            :avatar-url="avatarPreview"
            avatar-action-label="查看或修改头像"
            @toggle="toggleGroupSection(ProfileTabKey.ACCOUNT, $event)"
            @avatar-click="handleSectionAvatarClick"
          >
            <template #section-avatar>
              <div class="avatar-workbench">
                <img :src="avatarPreview" alt="avatar" class="avatar-image" />
                <div class="avatar-controls">
                  <div class="inline-actions">
                    <button class="ghost-btn ripple-trigger" type="button" @click="openAvatarActions">头像操作</button>
                    <button class="ghost-btn ripple-trigger" type="button" @click="triggerAvatarFilePicker">选择新图片</button>
                  </div>
                  <p v-if="selectedAvatarFile" class="helper-text">
                    已裁剪待上传：{{ selectedAvatarFile.name }}（{{ selectedAvatarFile.type || 'unknown' }}）
                  </p>
                  <button
                    class="primary-btn ripple-trigger"
                    type="button"
                    :disabled="avatarUploading || !selectedAvatarFile"
                    @click="submitAvatarUpload"
                  >
                    {{ avatarUploading ? '上传中...' : '上传到 OSS' }}
                  </button>
                  <p class="helper-text">支持 png/jpeg/webp。选择后先裁剪为圆形预览，最终上传 512x512 PNG。</p>
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
                    <th>昵称</th>
                    <td>{{ account.nickname || '-' }}</td>
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

            <template #section-music-auth>
              <div class="music-auth-grid">
                <article class="music-auth-card">
                  <p class="music-auth-title">TuneHub Key</p>
                  <p class="helper-text">用于 TuneHub 聚合能力，默认推荐会优先使用该 Key。</p>
                  <div class="stack-form">
                    <input
                      v-model.trim="musicTunehubKeyInput"
                      class="field-input"
                      type="password"
                      placeholder="输入 TuneHub API Key"
                      autocomplete="off"
                    />
                    <div class="inline-actions">
                      <button class="primary-btn ripple-trigger" type="button" :disabled="musicTunehubBusy" @click="saveMusicTunehubKey">
                        {{ musicTunehubBusy ? '保存中...' : '保存 Key' }}
                      </button>
                      <button class="ghost-btn ripple-trigger" type="button" :disabled="musicTunehubBusy" @click="deleteMusicTunehubKey">
                        删除 Key
                      </button>
                      <button class="ghost-btn ripple-trigger" type="button" :disabled="musicTunehubBusy" @click="loadMusicTunehubStatus">
                        刷新状态
                      </button>
                    </div>
                  </div>
                  <p class="helper-text">{{ musicTunehubStatusText }}</p>
                </article>

                <article class="music-auth-card">
                  <p class="music-auth-title">推荐顺序（拖拽调整）</p>
                  <p class="helper-text">按顺序推荐：网易云 / 酷我 / QQ。拖拽卡片即可调整优先级。</p>
                  <div class="provider-order-list">
                    <button
                      v-for="item in musicProviderOrderCards"
                      :key="item.code"
                      class="provider-order-item ripple-trigger"
                      type="button"
                      draggable="true"
                      @dragstart="onProviderDragStart(item.code)"
                      @dragover.prevent="onProviderDragOver(item.code)"
                      @drop.prevent="onProviderDrop"
                      @dragend="onProviderDragEnd"
                    >
                      <span class="provider-icon" :class="`provider-${item.code}`">{{ item.iconText }}</span>
                      <span class="provider-name">{{ item.name }}</span>
                      <label class="provider-toggle">
                        <input
                          :checked="musicProviderEnabled[item.code]"
                          type="checkbox"
                          @change="toggleMusicProvider(item.code, $event.target.checked)"
                        />
                        <span>启用</span>
                      </label>
                      <i class="fas fa-grip-vertical"></i>
                    </button>
                  </div>
                  <div class="inline-actions compact">
                    <button class="primary-btn ripple-trigger" type="button" :disabled="musicPreferenceBusy" @click="saveMusicPreferences">
                      {{ musicPreferenceBusy ? '保存中...' : '保存排序' }}
                    </button>
                  </div>
                  <p v-if="musicPreferenceError" class="error-text">{{ musicPreferenceError }}</p>
                </article>

                <article class="music-auth-card">
                  <p class="music-auth-title">平台状态</p>
                  <div class="provider-chip-row">
                    <span class="provider-chip netease">网易云</span>
                    <span class="provider-chip kuwo">酷我</span>
                    <span class="provider-chip qq">QQ 音乐</span>
                    <span class="provider-chip spotify">Spotify（预览模式）</span>
                  </div>
                  <p class="helper-text">Spotify 当前采用最小授权预览模式，不要求用户 OAuth 才能展示基础结果。</p>
                </article>
              </div>
            </template>
          </ProfileSectionAccordion>
        </section>

        <section
          :id="ProfileTabKey.ARTICLES"
          :ref="(el) => setGroupRef(ProfileTabKey.ARTICLES, el)"
          :data-group-key="ProfileTabKey.ARTICLES"
          class="profile-group"
        >
          <header class="group-header">
            <p class="group-eyebrow">Articles</p>
            <h3 class="group-title">创作与归档</h3>
            <p class="group-caption">文章工作台与历史内容入口。</p>
          </header>

          <ProfileSectionAccordion
            :sections="articlesSections"
            :open-keys="accordionState[ProfileTabKey.ARTICLES]"
            @toggle="toggleGroupSection(ProfileTabKey.ARTICLES, $event)"
          >
            <template #section-workspace>
              <div class="placeholder-card">
                <p class="placeholder-title">创作工作台</p>
                <p class="helper-text">同步创作统计并提供快速入口。</p>
                <div class="inline-actions">
                  <button class="primary-btn ripple-trigger" type="button" :disabled="!canManagePosts" @click="goToBlogEditor">
                    新建文章
                  </button>
                  <button class="ghost-btn ripple-trigger" type="button" @click="goToBlogList">打开博客页</button>
                  <button
                    class="ghost-btn ripple-trigger"
                    type="button"
                    :disabled="articlesState.loading || !canManagePosts"
                    @click="loadProfileArticles(true)"
                  >
                    {{ articlesState.loading ? '同步中...' : '刷新数据' }}
                  </button>
                </div>
                <p v-if="!canManagePosts" class="helper-text">当前账号未开通创作权限，无法读取“我的文章”统计。</p>
                <p v-else-if="articlesState.loading" class="helper-text">正在加载文章统计...</p>
                <p v-else-if="articlesState.error" class="error-text">{{ articlesState.error }}</p>
                <div v-else class="article-stats-grid">
                  <article v-for="card in articleWorkspaceCards" :key="card.key" class="article-stat-card">
                    <p class="overview-label">{{ card.label }}</p>
                    <p class="overview-value">{{ card.value }}</p>
                    <p class="overview-hint">{{ card.hint }}</p>
                  </article>
                </div>
              </div>
            </template>

            <template #section-archive>
              <div class="placeholder-card">
                <p class="placeholder-title">归档与历史</p>
                <p class="helper-text">按分类汇总，并展示最近发布/更新记录。</p>
                <p v-if="!canManagePosts" class="helper-text">无创作权限时不展示归档详情。</p>
                <p v-else-if="articlesState.loading" class="helper-text">正在加载归档数据...</p>
                <p v-else-if="articlesState.error" class="error-text">{{ articlesState.error }}</p>
                <template v-else>
                  <div class="archive-chip-grid">
                    <span v-for="item in articleCategoryCards" :key="item.categoryCode" class="status-chip">
                      {{ item.categoryCode }} · {{ item.count }}
                    </span>
                    <span v-if="!articleCategoryCards.length" class="helper-text">暂无分类归档数据。</span>
                  </div>

                  <div class="archive-list-grid">
                    <article class="archive-list-card">
                      <p class="music-auth-title">最近发布</p>
                      <ul v-if="articlesState.recentPublished.length" class="archive-list">
                        <li v-for="item in articlesState.recentPublished" :key="`pub-${item.postId}`">
                          <span>{{ item.title }}</span>
                          <span>{{ formatDateLabel(item.publishedAt) }}</span>
                        </li>
                      </ul>
                      <p v-else class="helper-text">暂无发布记录。</p>
                    </article>
                    <article class="archive-list-card">
                      <p class="music-auth-title">最近更新</p>
                      <ul v-if="articlesState.recentUpdated.length" class="archive-list">
                        <li v-for="item in articlesState.recentUpdated" :key="`upd-${item.postId}`">
                          <span>{{ item.title }}</span>
                          <span>{{ formatDateLabel(item.updatedAt || item.publishedAt) }}</span>
                        </li>
                      </ul>
                      <p v-else class="helper-text">暂无更新记录。</p>
                    </article>
                  </div>
                </template>
              </div>
            </template>
          </ProfileSectionAccordion>
        </section>

        <section
          :id="ProfileTabKey.SETTINGS"
          :ref="(el) => setGroupRef(ProfileTabKey.SETTINGS, el)"
          :data-group-key="ProfileTabKey.SETTINGS"
          class="profile-group"
        >
          <header class="group-header">
            <p class="group-eyebrow">Settings</p>
            <h3 class="group-title">外观与偏好</h3>
            <p class="group-caption">外观面板与高级选项入口。</p>
          </header>

          <ProfileSectionAccordion
            :sections="settingsSections"
            :open-keys="accordionState[ProfileTabKey.SETTINGS]"
            @toggle="toggleGroupSection(ProfileTabKey.SETTINGS, $event)"
          >
            <template #section-appearance>
              <div class="placeholder-card">
                <p class="placeholder-title">外观设置</p>
                <p class="helper-text">在此直接调整主题交互色。</p>
                <AppearanceSettingsContent />
              </div>
            </template>

            <template #section-advanced>
              <div class="placeholder-card">
                <p class="placeholder-title">高级偏好</p>
                <p class="helper-text">提供常用偏好开关与外观重置操作。</p>
                <div class="advanced-pref-grid">
                  <article class="advanced-pref-card">
                    <p class="music-auth-title">AI 对话侧栏默认开关</p>
                    <label class="provider-toggle">
                      <input
                        :checked="ui.state.aiPanelOpen"
                        type="checkbox"
                        @change="toggleAiPanelDefault($event.target.checked)"
                      />
                      <span>{{ ui.state.aiPanelOpen ? '已开启' : '已关闭' }}</span>
                    </label>
                  </article>
                  <article class="advanced-pref-card">
                    <p class="music-auth-title">外观与背景</p>
                    <div class="inline-actions compact">
                      <button class="ghost-btn ripple-trigger" type="button" @click="resetAppearancePreference">恢复默认外观</button>
                      <button class="ghost-btn ripple-trigger" type="button" @click="clearProfileRouteBackground">
                        清除当前页背景覆盖
                      </button>
                    </div>
                    <p class="helper-text">仅清除 `profile` 路由背景，不影响全局背景设置。</p>
                  </article>
                </div>
              </div>
            </template>
          </ProfileSectionAccordion>
        </section>
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

    <ProfileAvatarCropDialog
      :visible="avatarCropVisible"
      :source-url="avatarCropSourceUrl"
      :source-name="avatarCropSourceName"
      :submitting="avatarUploading"
      @close="closeAvatarCropDialog"
      @confirm="handleAvatarCropConfirm"
    />

    <input
      ref="avatarFileInput"
      class="hidden-file-input"
      type="file"
      accept="image/png,image/jpeg,image/webp"
      @change="onAvatarFileChange"
    />
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import RouteDotRail from '../components/common/RouteDotRail.vue';
import AppearanceSettingsContent from '../components/profile/AppearanceSettingsContent.vue';
import ProfileAvatarActionSheet from '../components/profile/ProfileAvatarActionSheet.vue';
import ProfileAvatarCropDialog from '../components/profile/ProfileAvatarCropDialog.vue';
import ProfileAvatarPreviewDialog from '../components/profile/ProfileAvatarPreviewDialog.vue';
import ProfileHeroCard from '../components/profile/ProfileHeroCard.vue';
import ProfileSectionAccordion from '../components/profile/ProfileSectionAccordion.vue';
import { useUiPreferences } from '../composables/useUiPreferences';
import { listMyPosts } from '../services/blogApi';
import * as musicApi from '../services/musicApi';
import { useAuthSession } from '../composables/useAuthSession';
import { summarizeAuthorPosts } from './profileArticlesState';
import {
  ProfileSectionKey,
  ProfileTabKey,
  buildSectionSummary,
  createProfileAccordionState,
  ensureProfileTabHasOpenSection,
  getTabOpenSections,
  normalizeProfileTabKey,
  toggleProfileAccordion
} from './profileUiState';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();
const ui = useUiPreferences();

const avatarFileInput = ref(null);
const profileContentPanel = ref(null);
const activeGroup = ref(ProfileTabKey.PROFILE);
const groupRefs = reactive({
  [ProfileTabKey.PROFILE]: null,
  [ProfileTabKey.ACCOUNT]: null,
  [ProfileTabKey.ARTICLES]: null,
  [ProfileTabKey.SETTINGS]: null
});
const navGroups = [
  { key: ProfileTabKey.PROFILE, label: '个人', icon: 'fas fa-id-card' },
  { key: ProfileTabKey.ACCOUNT, label: '账号', icon: 'fas fa-shield-halved' },
  { key: ProfileTabKey.ARTICLES, label: '文章', icon: 'fas fa-newspaper' },
  { key: ProfileTabKey.SETTINGS, label: '设置', icon: 'fas fa-sliders' }
];
const GROUP_DEFAULT_SECTION = Object.freeze({
  [ProfileTabKey.PROFILE]: ProfileSectionKey.PROFILE.QUICK_ACTIONS,
  [ProfileTabKey.ACCOUNT]: ProfileSectionKey.ACCOUNT.AVATAR,
  [ProfileTabKey.ARTICLES]: ProfileSectionKey.ARTICLES.WORKSPACE,
  [ProfileTabKey.SETTINGS]: ProfileSectionKey.SETTINGS.APPEARANCE
});
const accountSectionLoaded = ref(false);

const MUSIC_PROVIDER_ORDER_DEFAULT = ['netease', 'kuwo', 'qq'];
const MUSIC_PROVIDER_CATALOG = Object.freeze({
  netease: { code: 'netease', name: '网易云', iconText: '网' },
  kuwo: { code: 'kuwo', name: '酷我', iconText: '酷' },
  qq: { code: 'qq', name: 'QQ 音乐', iconText: 'Q' }
});

const accountLoading = ref(false);
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
const selectedAvatarPreviewUrl = ref('');

const avatarActionVisible = ref(false);
const avatarPreviewVisible = ref(false);
const avatarCropVisible = ref(false);
const avatarCropSourceUrl = ref('');
const avatarCropSourceName = ref('avatar.png');

const globalHint = ref('');
const bindEmailError = ref('');
const changePasswordError = ref('');
const oauthBindingError = ref('');
const avatarError = ref('');
const bindCodeError = ref('');
const changePwdCodeError = ref('');
const musicPreferenceError = ref('');

const musicPreferenceSnapshot = ref({});
const musicPreferenceBusy = ref(false);
const musicProviderOrder = ref(MUSIC_PROVIDER_ORDER_DEFAULT.slice());
const musicProviderEnabled = reactive({
  netease: true,
  kuwo: true,
  qq: true
});
const musicDragProviderCode = ref('');

const musicTunehubBusy = ref(false);
const musicTunehubKeyInput = ref('');
const musicTunehubStatus = ref({
  keyBound: false,
  keyMask: '',
  updatedAt: ''
});

const articlesState = reactive({
  loaded: false,
  loading: false,
  error: '',
  total: 0,
  draftCount: 0,
  publishedCount: 0,
  otherCount: 0,
  latestUpdatedAt: '',
  latestPublishedAt: '',
  categories: [],
  recentUpdated: [],
  recentPublished: []
});

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
let groupObserver = null;
let groupObserverReady = false;
let groupObserverResumeTimer = 0;

function normalizeGroupKey(raw, fallback = ProfileTabKey.PROFILE) {
  return normalizeProfileTabKey(raw, fallback);
}

function tryResolveGroupKey(raw) {
  const candidate = normalizeProfileTabKey(raw, '__invalid__');
  return candidate === '__invalid__' ? '' : candidate;
}

function cleanProfileQuery(rawQuery = route.query) {
  const next = {};
  Object.entries(rawQuery || {}).forEach(([key, value]) => {
    if (key === 'tab' || value == null) return;
    next[key] = value;
  });
  return next;
}

function resolveInitialGroupFromRoute() {
  const fromHash = tryResolveGroupKey(String(route.hash || '').replace(/^#/, ''));
  if (fromHash) return fromHash;
  const fromLegacyTab = tryResolveGroupKey(typeof route.query.tab === 'string' ? route.query.tab : '');
  if (fromLegacyTab) return fromLegacyTab;
  return ProfileTabKey.PROFILE;
}

async function replaceRouteHash(groupKey) {
  const normalized = normalizeGroupKey(groupKey);
  const targetHash = `#${normalized}`;
  const nextQuery = cleanProfileQuery();
  const hasLegacyTab = Object.prototype.hasOwnProperty.call(route.query || {}, 'tab');
  if (route.hash === targetHash && !hasLegacyTab) return;
  await router.replace({ path: '/profile', query: nextQuery, hash: targetHash });
}

function setGroupRef(groupKey, element) {
  groupRefs[groupKey] = element || null;
}

function scrollToGroup(groupKey, smooth = true) {
  const normalized = normalizeGroupKey(groupKey);
  const target = groupRefs[normalized];
  if (!target || typeof target.scrollIntoView !== 'function') return;
  target.scrollIntoView({
    behavior: smooth ? 'smooth' : 'auto',
    block: 'start',
    inline: 'nearest'
  });
}

function suspendGroupObserver(durationMs = 420) {
  groupObserverReady = false;
  if (typeof window === 'undefined') return;
  if (groupObserverResumeTimer) {
    window.clearTimeout(groupObserverResumeTimer);
    groupObserverResumeTimer = 0;
  }
  groupObserverResumeTimer = window.setTimeout(() => {
    groupObserverReady = true;
    groupObserverResumeTimer = 0;
  }, Math.max(0, Number(durationMs) || 0));
}

function ensureGroupSectionVisible(groupKey) {
  const normalizedGroup = normalizeGroupKey(groupKey);
  const fallbackSectionKey = GROUP_DEFAULT_SECTION[normalizedGroup];
  if (!fallbackSectionKey) return;
  const nextState = ensureProfileTabHasOpenSection(accordionState, normalizedGroup, fallbackSectionKey);
  applyAccordionState(nextState);
}

function ensureAllGroupSectionsVisible() {
  navGroups.forEach((group) => ensureGroupSectionVisible(group.key));
}

async function navigateToGroup(groupKey) {
  const normalized = normalizeGroupKey(groupKey);
  suspendGroupObserver();
  ensureGroupSectionVisible(normalized);
  activeGroup.value = normalized;
  await replaceRouteHash(normalized);
  await nextTick();
  scrollToGroup(normalized, true);
  if (normalized === ProfileTabKey.ACCOUNT) {
    await ensureAccountSectionReady();
  }
}

function setupGroupObserver() {
  if (typeof window === 'undefined' || typeof IntersectionObserver !== 'function') return;
  if (groupObserver) {
    groupObserver.disconnect();
    groupObserver = null;
  }

  const rootEl = profileContentPanel.value;
  if (!rootEl) return;

  groupObserver = new IntersectionObserver(
    (entries) => {
      if (!groupObserverReady) return;
      const visibleEntries = entries.filter((entry) => entry.isIntersecting && entry.intersectionRatio > 0);
      if (!visibleEntries.length) return;

      visibleEntries.sort((a, b) => b.intersectionRatio - a.intersectionRatio);
      const candidate = tryResolveGroupKey(visibleEntries[0]?.target?.dataset?.groupKey);
      if (!candidate || candidate === activeGroup.value) return;
      activeGroup.value = candidate;
    },
    {
      root: rootEl,
      threshold: [0.2, 0.35, 0.55, 0.72],
      rootMargin: '-18% 0px -50% 0px'
    }
  );

  navGroups.forEach((group) => {
    const target = groupRefs[group.key];
    if (!target) return;
    groupObserver.observe(target);
  });
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

function normalizeMusicPreferencePayload(payload) {
  if (!payload || typeof payload !== 'object') return {};
  if (Array.isArray(payload)) return {};
  return { ...payload };
}

function normalizeMusicProviderOrder(rawOrder) {
  const seen = new Set();
  const normalized = [];
  const source = Array.isArray(rawOrder) ? rawOrder : [];
  source.forEach((item) => {
    const code = String(item || '').trim().toLowerCase();
    if (!MUSIC_PROVIDER_CATALOG[code] || seen.has(code)) return;
    seen.add(code);
    normalized.push(code);
  });
  MUSIC_PROVIDER_ORDER_DEFAULT.forEach((code) => {
    if (seen.has(code)) return;
    normalized.push(code);
  });
  return normalized;
}

function normalizeMusicProviderEnabled(rawEnabled) {
  const source = rawEnabled && typeof rawEnabled === 'object' && !Array.isArray(rawEnabled) ? rawEnabled : {};
  return {
    netease: source.netease !== false,
    kuwo: source.kuwo !== false,
    qq: source.qq !== false
  };
}

function normalizeApiKeyStatus(raw) {
  return {
    keyBound: Boolean(raw?.keyBound ?? raw?.key_bound),
    keyMask: String(raw?.keyMask || raw?.key_mask || '').trim(),
    updatedAt: String(raw?.updatedAt || raw?.updated_at || '').trim()
  };
}

function applyMusicPreferences(payload) {
  const normalizedPayload = normalizeMusicPreferencePayload(payload);
  musicPreferenceSnapshot.value = normalizedPayload;

  const nestedMusic = normalizedPayload.music && typeof normalizedPayload.music === 'object' ? normalizedPayload.music : {};
  const orderRaw = normalizedPayload['music.provider_order'] || nestedMusic.provider_order;
  const enabledRaw = normalizedPayload['music.provider_enabled'] || nestedMusic.provider_enabled;

  musicProviderOrder.value = normalizeMusicProviderOrder(orderRaw);
  const normalizedEnabled = normalizeMusicProviderEnabled(enabledRaw);
  musicProviderEnabled.netease = normalizedEnabled.netease;
  musicProviderEnabled.kuwo = normalizedEnabled.kuwo;
  musicProviderEnabled.qq = normalizedEnabled.qq;
}

function clearErrors() {
  bindEmailError.value = '';
  changePasswordError.value = '';
  oauthBindingError.value = '';
  avatarError.value = '';
  bindCodeError.value = '';
  changePwdCodeError.value = '';
  musicPreferenceError.value = '';
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
    accordionState[tabKey] = Array.isArray(nextState[tabKey]) ? nextState[tabKey] : [];
  });
}

function forceOpenSection(tabKey, sectionKey) {
  const normalizedTab = normalizeGroupKey(tabKey);
  const current = getTabOpenSections(accordionState, normalizedTab) || [];
  if (current.includes(sectionKey)) return;
  const nextState = createProfileAccordionState({
    ...accordionState,
    [normalizedTab]: [...current, sectionKey]
  });
  applyAccordionState(nextState);
}

function toggleGroupSection(groupKey, sectionKey) {
  const normalizedGroup = normalizeGroupKey(groupKey);
  let nextState = toggleProfileAccordion(accordionState, normalizedGroup, sectionKey);
  if (!(getTabOpenSections(nextState, normalizedGroup) || []).length) {
    nextState = ensureProfileTabHasOpenSection(nextState, normalizedGroup, GROUP_DEFAULT_SECTION[normalizedGroup]);
  }
  applyAccordionState(nextState);

  const openAccountSections = getTabOpenSections(nextState, ProfileTabKey.ACCOUNT) || [];
  if (
    normalizedGroup === ProfileTabKey.ACCOUNT &&
    (openAccountSections.includes(ProfileSectionKey.ACCOUNT.EMAIL_BIND) ||
      openAccountSections.includes(ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD)) &&
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
  if (!auth.isAuthenticated.value) return false;
  accountLoading.value = true;
  clearErrors();
  let success = false;
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
    success = true;
    void loadMusicAuthorizationState();
  } catch (error) {
    setGlobalHint(readErrorMessage(error));
  } finally {
    accountLoading.value = false;
  }
  return success;
}

async function ensureAccountSectionReady() {
  if (accountSectionLoaded.value) return;
  const ok = await loadAccountProfile();
  if (ok) {
    accountSectionLoaded.value = true;
  }
}

function formatDateLabel(value) {
  if (!value) return '-';
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) return '-';
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')}`;
}

function applyArticlesSummary(summary) {
  articlesState.total = summary.total;
  articlesState.draftCount = summary.draftCount;
  articlesState.publishedCount = summary.publishedCount;
  articlesState.otherCount = summary.otherCount;
  articlesState.latestUpdatedAt = summary.latestUpdatedAt;
  articlesState.latestPublishedAt = summary.latestPublishedAt;
  articlesState.categories = Array.isArray(summary.categories) ? summary.categories : [];
  articlesState.recentUpdated = Array.isArray(summary.recentUpdated) ? summary.recentUpdated : [];
  articlesState.recentPublished = Array.isArray(summary.recentPublished) ? summary.recentPublished : [];
}

function resetArticlesSummary() {
  applyArticlesSummary({
    total: 0,
    draftCount: 0,
    publishedCount: 0,
    otherCount: 0,
    latestUpdatedAt: '',
    latestPublishedAt: '',
    categories: [],
    recentUpdated: [],
    recentPublished: []
  });
}

async function loadProfileArticles(force = false) {
  if (articlesState.loading) return;
  if (articlesState.loaded && !force) return;
  if (!canManagePosts.value) {
    resetArticlesSummary();
    articlesState.error = '';
    articlesState.loaded = true;
    return;
  }

  articlesState.loading = true;
  articlesState.error = '';
  try {
    const payload = await listMyPosts({ pageNo: 1, pageSize: 200 }, auth.authorizedFetch);
    const posts = Array.isArray(payload?.items) ? payload.items : [];
    applyArticlesSummary(summarizeAuthorPosts(posts));
  } catch (error) {
    resetArticlesSummary();
    articlesState.error = readErrorMessage(error);
  } finally {
    articlesState.loading = false;
    articlesState.loaded = true;
  }
}

async function ensureArticlesSectionReady() {
  if (articlesState.loaded) return;
  if (!canManagePosts.value) {
    resetArticlesSummary();
    articlesState.error = '';
    articlesState.loaded = true;
    return;
  }
  await loadProfileArticles();
}

async function goToBlogEditor() {
  if (!canManagePosts.value) return;
  await router.push({ name: 'blog-editor' });
}

async function goToBlogList() {
  await router.push({ name: 'blog' });
}

function toggleAiPanelDefault(nextChecked) {
  ui.setAiPanelOpen(Boolean(nextChecked));
  setGlobalHint(`AI 对话侧栏已${ui.state.aiPanelOpen ? '开启' : '关闭'}`);
}

function resetAppearancePreference() {
  ui.resetAccent();
  ui.setAccentMode('solid');
  ui.setAccentGradientPreset('berry');
  setGlobalHint('已恢复默认外观');
}

function clearProfileRouteBackground() {
  ui.clearRouteBackground('profile');
  setGlobalHint('已清除个人页路由背景覆盖');
}

async function loadMusicPreferences() {
  musicPreferenceError.value = '';
  try {
    const payload = await auth.getPreference();
    applyMusicPreferences(payload);
  } catch (error) {
    applyMusicPreferences({});
    musicPreferenceError.value = readErrorMessage(error);
  }
}

async function saveMusicPreferences() {
  musicPreferenceBusy.value = true;
  musicPreferenceError.value = '';
  try {
    const nextPreference = {
      ...musicPreferenceSnapshot.value,
      'music.provider_order': musicProviderOrder.value.slice(),
      'music.provider_enabled': {
        netease: Boolean(musicProviderEnabled.netease),
        kuwo: Boolean(musicProviderEnabled.kuwo),
        qq: Boolean(musicProviderEnabled.qq)
      }
    };
    const mergedMusic = nextPreference.music && typeof nextPreference.music === 'object' && !Array.isArray(nextPreference.music)
      ? { ...nextPreference.music }
      : {};
    mergedMusic.provider_order = nextPreference['music.provider_order'];
    mergedMusic.provider_enabled = nextPreference['music.provider_enabled'];
    nextPreference.music = mergedMusic;
    await auth.updatePreference(nextPreference);
    musicPreferenceSnapshot.value = nextPreference;
    setGlobalHint('音乐推荐顺序已保存');
  } catch (error) {
    musicPreferenceError.value = readErrorMessage(error);
  } finally {
    musicPreferenceBusy.value = false;
  }
}

async function loadMusicTunehubStatus() {
  try {
    const payload = await musicApi.getMusicApiKeyStatus('tunehub', auth.authorizedFetch);
    musicTunehubStatus.value = normalizeApiKeyStatus(payload);
  } catch {
    musicTunehubStatus.value = {
      keyBound: false,
      keyMask: '',
      updatedAt: ''
    };
  }
}

async function saveMusicTunehubKey() {
  if (!String(musicTunehubKeyInput.value || '').trim()) {
    musicPreferenceError.value = '请输入 TuneHub API Key';
    return;
  }
  musicTunehubBusy.value = true;
  musicPreferenceError.value = '';
  try {
    const payload = await musicApi.upsertMusicApiKey('tunehub', musicTunehubKeyInput.value, auth.authorizedFetch);
    musicTunehubStatus.value = normalizeApiKeyStatus(payload);
    musicTunehubKeyInput.value = '';
    setGlobalHint('TuneHub Key 已更新');
  } catch (error) {
    musicPreferenceError.value = readErrorMessage(error);
  } finally {
    musicTunehubBusy.value = false;
  }
}

async function deleteMusicTunehubKey() {
  musicTunehubBusy.value = true;
  musicPreferenceError.value = '';
  try {
    await musicApi.deleteMusicApiKey('tunehub', auth.authorizedFetch);
    musicTunehubStatus.value = {
      keyBound: false,
      keyMask: '',
      updatedAt: ''
    };
    setGlobalHint('TuneHub Key 已删除');
  } catch (error) {
    musicPreferenceError.value = readErrorMessage(error);
  } finally {
    musicTunehubBusy.value = false;
  }
}

async function loadMusicAuthorizationState() {
  await Promise.all([loadMusicPreferences(), loadMusicTunehubStatus()]);
}

function onProviderDragStart(providerCode) {
  musicDragProviderCode.value = String(providerCode || '').trim();
}

function onProviderDragOver(targetProviderCode) {
  const sourceCode = String(musicDragProviderCode.value || '').trim();
  const targetCode = String(targetProviderCode || '').trim();
  if (!sourceCode || !targetCode || sourceCode === targetCode) return;
  const current = musicProviderOrder.value.slice();
  const fromIndex = current.indexOf(sourceCode);
  const toIndex = current.indexOf(targetCode);
  if (fromIndex < 0 || toIndex < 0) return;
  current.splice(fromIndex, 1);
  current.splice(toIndex, 0, sourceCode);
  musicProviderOrder.value = current;
}

function onProviderDrop() {
  musicDragProviderCode.value = '';
}

function onProviderDragEnd() {
  musicDragProviderCode.value = '';
}

function toggleMusicProvider(providerCode, checked) {
  const code = String(providerCode || '').trim().toLowerCase();
  if (!Object.prototype.hasOwnProperty.call(musicProviderEnabled, code)) return;
  musicProviderEnabled[code] = Boolean(checked);
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
    await auth.startOAuthBind(provider, '/profile#account');
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

function resetAvatarCropSource() {
  if (avatarCropSourceUrl.value && avatarCropSourceUrl.value.startsWith('blob:')) {
    URL.revokeObjectURL(avatarCropSourceUrl.value);
  }
  avatarCropSourceUrl.value = '';
  avatarCropSourceName.value = 'avatar.png';
}

function closeAvatarCropDialog() {
  avatarCropVisible.value = false;
  resetAvatarCropSource();
}

function onAvatarFileChange(event) {
  avatarError.value = '';
  const file = event?.target?.files?.[0];
  if (avatarFileInput.value) {
    avatarFileInput.value.value = '';
  }
  if (!file) return;

  const allowedTypes = new Set(['image/png', 'image/jpeg', 'image/webp']);
  const contentType = String(file.type || '').toLowerCase();
  if (!allowedTypes.has(contentType)) {
    avatarError.value = '头像文件仅支持 png/jpeg/webp';
    return;
  }

  if (Number(file.size || 0) > 8 * 1024 * 1024) {
    avatarError.value = '原始图片不能超过 8MB';
    return;
  }

  resetAvatarCropSource();
  avatarCropSourceUrl.value = URL.createObjectURL(file);
  avatarCropSourceName.value = String(file.name || 'avatar.png');
  avatarCropVisible.value = true;
}

async function handleAvatarCropConfirm(payload) {
  avatarError.value = '';
  try {
    const blob = payload?.blob;
    if (!blob) {
      throw new Error('裁剪结果不可用');
    }

    const file = new File([blob], `avatar-${Date.now()}.png`, {
      type: 'image/png'
    });
    if (file.size > 2 * 1024 * 1024) {
      throw new Error('裁剪后图片超过 2MB，请缩小裁剪区域后重试');
    }

    selectedAvatarFile.value = file;
    selectedAvatarPreviewUrl.value = String(payload?.previewUrl || '').trim();
    closeAvatarCropDialog();
    await openAccountSection(ProfileSectionKey.ACCOUNT.AVATAR);
    setGlobalHint('头像已裁剪，点击“上传到 OSS”即可生效');
  } catch (error) {
    avatarError.value = readErrorMessage(error);
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
    const uploadResult = await auth.uploadAvatar(selectedAvatarFile.value);
    const avatarUrl = String(uploadResult?.avatarUrl || uploadResult || '').trim();
    account.avatarUrl = avatarUrl;
    selectedAvatarFile.value = null;
    selectedAvatarPreviewUrl.value = '';
    if (uploadResult?.relayUsed) {
      setGlobalHint('直传失败，已自动切换中转上传并更新头像');
    } else {
      setGlobalHint('头像上传成功');
    }
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
  await openAccountSection(ProfileSectionKey.ACCOUNT.AVATAR);
  triggerAvatarFilePicker();
}

function handleSectionAvatarClick() {
  openAvatarActions();
}

async function openAccountSection(sectionKey) {
  await ensureAccountSectionReady();
  forceOpenSection(ProfileTabKey.ACCOUNT, sectionKey);
  await navigateToGroup(ProfileTabKey.ACCOUNT);
  if (
    sectionKey === ProfileSectionKey.ACCOUNT.EMAIL_BIND ||
    sectionKey === ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD
  ) {
    if (!captcha.captchaId) {
      await refreshCaptcha();
    }
  }
}

async function openSettingsAppearance() {
  await navigateToGroup(ProfileTabKey.SETTINGS);
  forceOpenSection(ProfileTabKey.SETTINGS, ProfileSectionKey.SETTINGS.APPEARANCE);
}

async function handleLogout() {
  if (typeof window !== 'undefined') {
    const confirmed = window.confirm('确认登出当前账号？');
    if (!confirmed) return;
  }

  await auth.logout();
  router.replace({
    path: '/auth',
    query: {
      reason: 'signed_out',
      redirect: '/profile'
    }
  });
}

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
  if (selectedAvatarPreviewUrl.value) return selectedAvatarPreviewUrl.value;
  return account.avatarUrl || auth.user.value?.avatarUrl || '/images/katanegai.jpg';
});

const groupCount = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.length;
});

const permissionCount = computed(() => {
  const permissions = Array.isArray(auth.user.value?.permissions) ? auth.user.value.permissions : [];
  return permissions.length;
});
const canManagePosts = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  const permissions = Array.isArray(auth.user.value?.permissions) ? auth.user.value.permissions : [];
  const isAdmin = groups.some((group) => String(group || '').trim().toUpperCase() === 'ADMIN');
  return isAdmin || permissions.some((code) => String(code || '').trim().toLowerCase() === 'blog.post.write');
});

const oauthBindingCount = computed(() => account.oauthBindings.length);
const musicProviderOrderCards = computed(() =>
  musicProviderOrder.value.map((code) => MUSIC_PROVIDER_CATALOG[code]).filter(Boolean)
);
const musicTunehubStatusText = computed(() => {
  if (!musicTunehubStatus.value.keyBound) return '状态：未绑定';
  if (musicTunehubStatus.value.keyMask) {
    return `状态：已绑定（${musicTunehubStatus.value.keyMask}）`;
  }
  return '状态：已绑定';
});

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
  if (activeGroup.value === ProfileTabKey.ACCOUNT) return 'Account Security';
  if (activeGroup.value === ProfileTabKey.ARTICLES) return 'Content Workspace';
  if (activeGroup.value === ProfileTabKey.SETTINGS) return 'Appearance';
  return 'Profile Overview';
});

const heroTitle = computed(() => {
  if (activeGroup.value === ProfileTabKey.ACCOUNT) return '账号与安全';
  if (activeGroup.value === ProfileTabKey.ARTICLES) return '内容工作台';
  if (activeGroup.value === ProfileTabKey.SETTINGS) return '偏好与外观';
  return `你好，${displayName.value}`;
});

const heroSubtitle = computed(() => {
  if (activeGroup.value === ProfileTabKey.ACCOUNT) return '账号与绑定集中管理，默认折叠，按需展开。';
  if (activeGroup.value === ProfileTabKey.ARTICLES) return '创作统计、归档信息与快捷入口集中展示。';
  if (activeGroup.value === ProfileTabKey.SETTINGS) return '保持轻量设置层次，把常用操作放前面。';
  return '个人页展示核心状态与常用入口，减少无关信息占屏。';
});

const heroChips = computed(() => {
  if (activeGroup.value === ProfileTabKey.ACCOUNT) {
    return [
      account.email ? '邮箱已填写' : '邮箱未填写',
      account.emailVerified ? '邮箱已验证' : '邮箱未验证',
      account.hasPassword ? '已设置密码' : '未设置密码',
      `OAuth ${oauthBindingCount.value}`
    ];
  }
  if (activeGroup.value === ProfileTabKey.ARTICLES) {
    return [
      `草稿 ${articlesState.draftCount}`,
      `已发布 ${articlesState.publishedCount}`,
      canManagePosts.value ? '创作可用' : '无创作权限'
    ];
  }
  if (activeGroup.value === ProfileTabKey.SETTINGS) {
    return ['主题调色', '偏好可配置'];
  }
  return [groupsText.value, `权限 ${permissionCount.value}`];
});

const profileOverviewCards = computed(() => [
  {
    key: 'blog-count',
    label: '博客数量',
    value: String(articlesState.total || 0),
    hint: canManagePosts.value ? '来自我的文章统计' : '无创作权限'
  },
  {
    key: 'draft-count',
    label: '草稿箱',
    value: String(articlesState.draftCount || 0),
    hint: canManagePosts.value ? '草稿状态文章' : '未开启创作'
  },
  {
    key: 'group-count',
    label: '分组数量',
    value: String(groupCount.value),
    hint: '实时读取当前登录态'
  },
  {
    key: 'oauth-count',
    label: 'OAuth 绑定',
    value: String(oauthBindingCount.value),
    hint: 'GitHub / LinuxDo'
  }
]);

const articleWorkspaceCards = computed(() => [
  {
    key: 'total',
    label: '总文章数',
    value: String(articlesState.total),
    hint: '当前可管理文章总数'
  },
  {
    key: 'draft',
    label: '草稿',
    value: String(articlesState.draftCount),
    hint: '可继续编辑'
  },
  {
    key: 'published',
    label: '已发布',
    value: String(articlesState.publishedCount),
    hint: '对外可见文章'
  },
  {
    key: 'latest-updated',
    label: '最近更新',
    value: formatDateLabel(articlesState.latestUpdatedAt),
    hint: '最近一次内容更新'
  }
]);

const articleCategoryCards = computed(() => articlesState.categories.slice(0, 10));

const profileRecentRows = computed(() => [
  {
    key: 'email',
    label: '邮箱状态',
    value: account.email ? (account.emailVerified ? '已绑定且已验证' : '已绑定未验证') : '未绑定'
  },
  {
    key: 'password',
    label: '密码状态',
    value: account.hasPassword ? '已设置' : '未设置'
  },
  {
    key: 'oauth',
    label: 'OAuth 绑定',
    value: `${oauthBindingCount.value} 个平台`
  },
  {
    key: 'permissions',
    label: '权限数量',
    value: `${permissionCount.value}`
  }
]);

const profileSections = computed(() => [
  {
    key: ProfileSectionKey.PROFILE.OVERVIEW,
    title: '概览面板',
    icon: 'fas fa-chart-pie',
    summary: buildSectionSummary(ProfileSectionKey.PROFILE.OVERVIEW, {
      nickname: profileForm.nickname || displayName.value
    }),
    statusText: '概览'
  },
  {
    key: ProfileSectionKey.PROFILE.QUICK_ACTIONS,
    title: '快捷入口',
    icon: 'fas fa-bolt',
    summary: buildSectionSummary(ProfileSectionKey.PROFILE.QUICK_ACTIONS),
    statusText: '常用'
  },
  {
    key: ProfileSectionKey.PROFILE.RECENT,
    title: '最近状态',
    icon: 'fas fa-clock-rotate-left',
    summary: buildSectionSummary(ProfileSectionKey.PROFILE.RECENT),
    statusText: '在线'
  }
]);

const accountSections = computed(() => [
  {
    key: ProfileSectionKey.ACCOUNT.AVATAR,
    title: '头像管理',
    icon: 'fas fa-image',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.AVATAR, {
      avatarUrl: account.avatarUrl
    }),
    statusText: account.avatarUrl ? '已设置' : '默认头像'
  },
  {
    key: ProfileSectionKey.ACCOUNT.ACCOUNT_INFO,
    title: '账号信息',
    icon: 'fas fa-id-badge',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.ACCOUNT_INFO, {
      email: account.email
    }),
    statusText: account.username || '未命名'
  },
  {
    key: ProfileSectionKey.ACCOUNT.EMAIL_BIND,
    title: '邮箱绑定',
    icon: 'fas fa-envelope',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.EMAIL_BIND, {
      emailVerified: Boolean(account.emailVerified)
    }),
    statusText: account.email ? '已绑定' : '未绑定'
  },
  {
    key: ProfileSectionKey.ACCOUNT.OAUTH_BIND,
    title: 'OAuth 绑定',
    icon: 'fas fa-link',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.OAUTH_BIND, {
      oauthBindingCount: oauthBindingCount.value
    }),
    statusText: `${oauthBindingCount.value} 个`
  },
  {
    key: ProfileSectionKey.ACCOUNT.MUSIC_AUTH,
    title: '音乐授权与推荐顺序',
    icon: 'fas fa-music',
    summary: buildSectionSummary(ProfileSectionKey.ACCOUNT.MUSIC_AUTH, {
      tunehubBound: musicTunehubStatus.value.keyBound
    }),
    statusText: musicTunehubStatus.value.keyBound ? '已配置' : '待配置'
  },
  {
    key: ProfileSectionKey.ACCOUNT.CHANGE_PASSWORD,
    title: '修改密码',
    icon: 'fas fa-key',
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
    icon: 'fas fa-pen-to-square',
    summary: buildSectionSummary(ProfileSectionKey.ARTICLES.WORKSPACE),
    statusText: articlesState.loading ? '同步中' : `${articlesState.draftCount} 草稿`
  },
  {
    key: ProfileSectionKey.ARTICLES.ARCHIVE,
    title: '归档历史',
    icon: 'fas fa-box-archive',
    summary: buildSectionSummary(ProfileSectionKey.ARTICLES.ARCHIVE),
    statusText: articlesState.loading ? '同步中' : `${articlesState.categories.length} 分类`
  }
]);

const settingsSections = computed(() => [
  {
    key: ProfileSectionKey.SETTINGS.APPEARANCE,
    title: '外观设置',
    icon: 'fas fa-palette',
    summary: buildSectionSummary(ProfileSectionKey.SETTINGS.APPEARANCE),
    statusText: '可编辑'
  },
  {
    key: ProfileSectionKey.SETTINGS.ADVANCED,
    title: '高级偏好',
    icon: 'fas fa-flask',
    summary: buildSectionSummary(ProfileSectionKey.SETTINGS.ADVANCED),
    statusText: '可配置'
  }
]);

watch(
  () => route.hash,
  (nextHash) => {
    const group = tryResolveGroupKey(String(nextHash || '').replace(/^#/, ''));
    if (!group || group === activeGroup.value) return;
    suspendGroupObserver();
    ensureGroupSectionVisible(group);
    activeGroup.value = group;
    nextTick(() => {
      scrollToGroup(group, false);
    });
  }
);

watch(
  () => activeGroup.value,
  async (group) => {
    ensureGroupSectionVisible(group);
    if (group === ProfileTabKey.ACCOUNT) {
      await ensureAccountSectionReady();
      if (!captcha.captchaId) {
        await refreshCaptcha();
      }
    }
    if (group === ProfileTabKey.ARTICLES) {
      await ensureArticlesSectionReady();
    }
  }
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
    return;
  }

  const initialGroup = resolveInitialGroupFromRoute();
  activeGroup.value = initialGroup;
  ensureAllGroupSectionsVisible();
  await replaceRouteHash(initialGroup);
  await nextTick();
  setupGroupObserver();
  suspendGroupObserver();
  scrollToGroup(initialGroup, false);

  if (initialGroup === ProfileTabKey.ACCOUNT) {
    await ensureAccountSectionReady();
    if (!captcha.captchaId) {
      await refreshCaptcha();
    }
  }
  if (initialGroup === ProfileTabKey.ARTICLES) {
    await ensureArticlesSectionReady();
  }
});

onBeforeUnmount(() => {
  if (groupObserver) {
    groupObserver.disconnect();
    groupObserver = null;
  }
  groupObserverReady = false;
  if (groupObserverResumeTimer) {
    window.clearTimeout(groupObserverResumeTimer);
    groupObserverResumeTimer = 0;
  }
  if (bindCooldownTimer) {
    window.clearInterval(bindCooldownTimer);
    bindCooldownTimer = 0;
  }
  if (changePwdCooldownTimer) {
    window.clearInterval(changePwdCooldownTimer);
    changePwdCooldownTimer = 0;
  }
  resetAvatarCropSource();
});
</script>

<style scoped>
.profile-page {
  height: 100%;
  min-height: 0;
  color: rgba(232, 241, 252, 0.95);
  font-family: var(--font-ui);
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

.profile-stage {
  --liquid-bg: linear-gradient(155deg, rgba(8, 17, 28, 0.58), rgba(6, 12, 21, 0.54));
  --liquid-border: rgba(155, 188, 214, 0.24);
  --liquid-shadow: 0 16px 34px rgba(3, 8, 15, 0.22);
  height: 100%;
  min-height: 0;
  border-radius: 16px;
  padding: 10px;
  display: grid;
  grid-template-columns: 116px minmax(0, 1fr);
  gap: 16px;
  align-items: start;
  overflow: hidden;
}

.profile-anchor-nav {
  display: flex;
  justify-content: center;
  align-items: center;
  align-self: stretch;
  position: sticky;
  top: 0;
  z-index: 7;
  width: 100%;
  height: 100%;
  min-height: clamp(420px, 70vh, 780px);
  padding-block: 6px;
}

.profile-anchor-nav :deep(.route-dot-rail) {
  height: 100%;
  min-height: 100%;
}

.profile-content-panel {
  min-height: 0;
  height: 100%;
  overflow: auto;
  position: relative;
  z-index: 1;
  padding-right: 6px;
  padding-bottom: 20px;
  display: flex;
  flex-direction: column;
  gap: 14px;
  scroll-padding-top: 182px;
}

.profile-content-panel::-webkit-scrollbar {
  width: 8px;
}

.profile-content-panel::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(116, 157, 194, 0.36);
}

.state-tip {
  margin: 2px 2px 3px;
  color: rgba(192, 216, 239, 0.95);
  font-size: 12px;
}

.profile-hero-sticky {
  position: sticky;
  top: 0;
  z-index: 6;
  padding-top: 2px;
  padding-bottom: 8px;
  background: linear-gradient(180deg, rgba(8, 16, 27, 0.95), rgba(8, 16, 27, 0));
}

.profile-group {
  display: grid;
  gap: 9px;
  scroll-margin-top: 182px;
  position: relative;
  z-index: 1;
}

.group-header {
  display: grid;
  gap: 3px;
  margin: 2px 2px 0;
}

.group-eyebrow {
  font-size: 11px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(138, 212, 236, 0.92);
}

.group-title {
  font-size: clamp(17px, 2vw, 21px);
  color: rgba(234, 245, 255, 0.96);
}

.group-caption {
  font-size: 12px;
  color: rgba(174, 202, 228, 0.88);
}

.overview-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.overview-card {
  border-radius: 13px;
  background: linear-gradient(148deg, rgba(10, 18, 30, 0.56), rgba(8, 15, 25, 0.48));
  box-shadow: inset 0 0 0 1px rgba(146, 178, 204, 0.2);
  padding: 10px;
  display: grid;
  gap: 5px;
}

.overview-label {
  font-size: 12px;
  color: rgba(181, 206, 230, 0.9);
}

.overview-value {
  font-size: 24px;
  font-weight: 650;
  color: rgba(237, 246, 255, 0.96);
}

.overview-hint {
  font-size: 11px;
  color: rgba(167, 194, 220, 0.86);
}

.quick-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.quick-btn {
  border: 0;
  border-radius: 12px;
  min-height: 42px;
  padding: 0 12px;
  font-size: 12px;
  color: rgba(229, 239, 251, 0.96);
  background: rgba(150, 185, 211, 0.14);
  box-shadow: inset 0 0 0 1px rgba(147, 181, 207, 0.24);
}

.quick-btn:hover {
  background: linear-gradient(145deg, rgba(61, 173, 207, 0.3), rgba(56, 120, 189, 0.26));
  box-shadow: inset 0 0 0 1px rgba(85, 199, 232, 0.44);
}

.recent-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.recent-item {
  border-radius: 12px;
  background: rgba(10, 18, 29, 0.52);
  box-shadow: inset 0 0 0 1px rgba(142, 175, 202, 0.22);
  padding: 8px 10px;
  display: grid;
  gap: 3px;
}

.recent-label {
  font-size: 11px;
  color: rgba(176, 202, 227, 0.86);
}

.recent-value {
  font-size: 13px;
  color: rgba(232, 242, 253, 0.96);
  font-weight: 600;
}

.stack-form {
  display: grid;
  gap: 8px;
}

.field-label {
  font-size: 12px;
  color: rgba(198, 219, 239, 0.9);
}

.field-input,
select.field-input {
  border: 0;
  border-radius: 11px;
  min-height: 40px;
  padding: 0 12px;
  background: rgba(8, 15, 25, 0.62);
  color: rgba(236, 245, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(138, 172, 199, 0.26);
}

.field-input:focus-visible,
select.field-input:focus-visible,
.captcha-preview:focus-visible {
  outline: 2px solid rgba(90, 209, 240, 0.72);
  outline-offset: 2px;
}

.inline-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: center;
}

.inline-actions.compact {
  margin-top: 8px;
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
  border-radius: 11px;
  min-height: 36px;
  padding: 0 13px;
  color: rgba(234, 244, 255, 0.96);
}

.primary-btn {
  background: linear-gradient(145deg, rgba(66, 178, 211, 0.42), rgba(55, 117, 186, 0.36));
  box-shadow: inset 0 0 0 1px rgba(96, 209, 239, 0.4);
}

.ghost-btn,
.oauth-btn {
  background: rgba(148, 183, 208, 0.18);
  box-shadow: inset 0 0 0 1px rgba(141, 176, 202, 0.24);
}

.danger-btn {
  background: rgba(225, 92, 124, 0.24);
  box-shadow: inset 0 0 0 1px rgba(251, 154, 180, 0.36);
}

.status-chip {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  background: rgba(70, 187, 220, 0.16);
  color: rgba(206, 237, 249, 0.95);
  box-shadow: inset 0 0 0 1px rgba(90, 202, 232, 0.34);
}

.helper-text {
  color: rgba(174, 202, 228, 0.9);
  font-size: 12px;
}

.music-auth-grid {
  display: grid;
  gap: 10px;
}

.music-auth-card {
  border-radius: 13px;
  background: linear-gradient(148deg, rgba(9, 18, 30, 0.56), rgba(8, 15, 25, 0.5));
  box-shadow: inset 0 0 0 1px rgba(141, 173, 200, 0.18);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.music-auth-title {
  margin: 0;
  font-size: 14px;
  font-weight: 620;
}

.provider-order-list {
  display: grid;
  gap: 8px;
}

.provider-order-item {
  border: 0;
  border-radius: 11px;
  min-height: 44px;
  padding: 0 10px;
  background: rgba(146, 182, 208, 0.15);
  color: rgba(232, 242, 252, 0.95);
  display: grid;
  grid-template-columns: auto 1fr auto auto;
  gap: 8px;
  align-items: center;
  text-align: left;
  box-shadow: inset 0 0 0 1px rgba(140, 175, 202, 0.24);
}

.provider-order-item i {
  opacity: 0.7;
}

.provider-icon {
  width: 24px;
  height: 24px;
  border-radius: 8px;
  display: inline-grid;
  place-items: center;
  font-size: 12px;
  font-weight: 700;
  color: rgba(255, 255, 255, 0.95);
}

.provider-icon.provider-netease {
  background: linear-gradient(135deg, rgba(237, 70, 80, 0.94), rgba(255, 120, 120, 0.88));
}

.provider-icon.provider-kuwo {
  background: linear-gradient(135deg, rgba(66, 160, 255, 0.9), rgba(101, 126, 255, 0.86));
}

.provider-icon.provider-qq {
  background: linear-gradient(135deg, rgba(53, 185, 98, 0.9), rgba(70, 210, 120, 0.88));
}

.provider-name {
  font-size: 13px;
}

.provider-toggle {
  display: inline-flex;
  align-items: center;
  gap: 4px;
  font-size: 12px;
  color: rgba(201, 223, 244, 0.94);
}

.provider-chip-row {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.provider-chip {
  display: inline-flex;
  align-items: center;
  min-height: 26px;
  border-radius: 999px;
  padding: 0 10px;
  font-size: 12px;
  color: rgba(238, 246, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(201, 221, 248, 0.3);
}

.provider-chip.netease {
  background: rgba(237, 70, 80, 0.22);
}

.provider-chip.kuwo {
  background: rgba(66, 160, 255, 0.22);
}

.provider-chip.qq {
  background: rgba(53, 185, 98, 0.22);
}

.provider-chip.spotify {
  background: rgba(91, 133, 204, 0.24);
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
  border-bottom: 1px solid rgba(148, 182, 209, 0.2);
  text-align: left;
}

.kv-table th,
.simple-table th {
  color: rgba(179, 206, 233, 0.93);
  font-weight: 600;
}

.avatar-workbench {
  display: grid;
  grid-template-columns: 128px minmax(0, 1fr);
  gap: 12px;
  align-items: start;
}

.avatar-image {
  width: 112px;
  height: 112px;
  border-radius: 50%;
  object-fit: cover;
  box-shadow:
    0 10px 20px rgba(4, 7, 12, 0.24),
    inset 0 0 0 1px rgba(161, 191, 218, 0.34);
  background: rgba(8, 14, 22, 0.58);
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
  box-shadow: inset 0 0 0 1px rgba(136, 170, 196, 0.26);
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
  padding: 12px;
  border-radius: 13px;
  background:
    linear-gradient(140deg, rgba(9, 18, 30, 0.58), rgba(8, 15, 25, 0.48)),
    radial-gradient(circle at 90% 10%, rgba(63, 176, 208, 0.12), transparent 40%);
  box-shadow: inset 0 0 0 1px rgba(137, 169, 196, 0.2);
}

.placeholder-title {
  font-size: 14px;
  font-weight: 620;
  color: rgba(230, 241, 252, 0.95);
}

.article-stats-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.article-stat-card {
  border-radius: 12px;
  background: rgba(8, 14, 24, 0.54);
  box-shadow: inset 0 0 0 1px rgba(134, 169, 196, 0.24);
  padding: 8px 10px;
  display: grid;
  gap: 4px;
}

.archive-chip-grid {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.archive-list-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.archive-list-card {
  border-radius: 12px;
  background: rgba(8, 14, 24, 0.52);
  box-shadow: inset 0 0 0 1px rgba(132, 166, 193, 0.22);
  padding: 10px;
  display: grid;
  gap: 6px;
}

.archive-list {
  margin: 0;
  padding: 0;
  list-style: none;
  display: grid;
  gap: 6px;
}

.archive-list li {
  display: flex;
  justify-content: space-between;
  gap: 10px;
  font-size: 12px;
  color: rgba(223, 236, 249, 0.94);
}

.archive-list li span:last-child {
  flex-shrink: 0;
  color: rgba(169, 196, 220, 0.88);
}

.advanced-pref-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.advanced-pref-card {
  border-radius: 12px;
  background: rgba(8, 14, 24, 0.52);
  box-shadow: inset 0 0 0 1px rgba(132, 166, 193, 0.24);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.hidden-file-input {
  position: fixed;
  width: 0;
  height: 0;
  opacity: 0;
  pointer-events: none;
}

@media (max-width: 1060px) {
  .profile-stage {
    padding: 9px;
    grid-template-columns: 1fr;
    grid-template-rows: auto minmax(0, 1fr);
    gap: 10px;
    overflow: visible;
  }

  .profile-anchor-nav {
    width: 100%;
    height: auto;
    min-height: auto;
    position: static;
  }

  .quick-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}

@media (max-width: 760px) {
  .profile-stage {
    padding: 8px;
    border-radius: 14px;
    gap: 8px;
  }

  .profile-anchor-nav {
    position: static;
  }

  .profile-content-panel {
    scroll-padding-top: 0;
    padding-right: 0;
  }

  .profile-hero-sticky {
    position: relative;
    top: auto;
    padding-bottom: 0;
    background: transparent;
  }

  .profile-group {
    scroll-margin-top: 8px;
  }

  .overview-grid,
  .recent-grid,
  .quick-grid,
  .article-stats-grid,
  .archive-list-grid,
  .advanced-pref-grid {
    grid-template-columns: 1fr;
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

  .provider-order-item {
    grid-template-columns: auto 1fr auto;
    row-gap: 4px;
  }
}
</style>
