import { createRouter, createWebHashHistory } from 'vue-router';
import HomePage from '../pages/HomePage.vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  isMobileShellPath,
  mapDesktopPathToMobile,
  mapMobilePathToDesktop,
  shouldUseMobileShell
} from '../mobile/mobileMode';
import * as musicApi from '../services/musicApi';
import { resolveOAuthCallbackRedirect } from './oauthCallbackGuard';

const MobileShell = () => import('../mobile/MobileShell.vue');
const MobileMusicHomePage = () => import('../mobile/pages/MobileMusicHomePage.vue');
const MobilePlaylistPage = () => import('../mobile/pages/MobilePlaylistPage.vue');
const MobileSearchPage = () => import('../mobile/pages/MobileSearchPage.vue');
const MobileProfilePage = () => import('../mobile/pages/MobileProfilePage.vue');
const MobileAuthPage = () => import('../mobile/pages/MobileAuthPage.vue');

const AiHubPage = () => import('../pages/AiHubPage.vue');
const AdminPage = () => import('../pages/AdminPage.vue');
const AuthorPage = () => import('../pages/AuthorPage.vue');
const AuthCallbackPage = () => import('../pages/AuthCallbackPage.vue');
const AuthPage = () => import('../pages/AuthPage.vue');
const AppsPage = () => import('../pages/AppsPage.vue');
const BlogListPage = () => import('../pages/BlogListPage.vue');
const BlogPage = () => import('../pages/BlogPage.vue');
const BlogPresentationPage = () => import('../pages/BlogPresentationPage.vue');
const MusicLibraryPage = () => import('../pages/MusicLibraryPage.vue');
const MusicLibraryHomeView = () => import('../pages/music/MusicLibraryHomeView.vue');
const MusicVoiceHomeView = () => import('../pages/music/MusicVoiceHomeView.vue');
const MusicVoiceWorkDetailView = () => import('../pages/music/MusicVoiceWorkDetailView.vue');
const MusicPlaylistDetailView = () => import('../pages/music/MusicPlaylistDetailView.vue');
const MusicPlayerDetailView = () => import('../pages/music/MusicPlayerDetailView.vue');
const ProfilePage = () => import('../pages/ProfilePage.vue');

export const routePathByKey = {
  home: '/',
  blog: '/blog',
  'music-library': '/music-library/music',
  apps: '/apps',
  'ai-hub': '/ai-hub',
  auth: '/auth',
  profile: '/profile',
  admin: '/admin',
  author: '/author'
};

const VOICE_ACCESS_CACHE_TTL_MS = 60 * 1000;
const voiceAccessCache = {
  key: '',
  visible: false,
  expiresAt: 0
};

function normalizeRedirectPath(path) {
  if (!path || typeof path !== 'string') return '/profile';
  if (!path.startsWith('/')) return '/profile';
  if (path.startsWith('/auth')) return '/profile';
  return path;
}

function normalizeProviderRows(payload) {
  return Array.isArray(payload) ? payload : [];
}

function isAsmrVoiceVisible(payload) {
  const rows = normalizeProviderRows(payload);
  const asmr = rows.find((item) => String(item?.provider || item?.providerCode || '').trim().toLowerCase() === 'asmr');
  if (!asmr) return false;
  const enabled = Boolean(asmr?.enabled);
  const visible = Boolean(asmr?.visible);
  return enabled && visible;
}

async function resolveVoiceRouteVisible(auth) {
  const userId = auth?.isAuthenticated?.value ? String(auth?.user?.value?.userId || auth?.user?.value?.id || 'me') : 'guest';
  const cacheKey = `${userId}`;
  const now = Date.now();
  if (voiceAccessCache.key === cacheKey && voiceAccessCache.expiresAt > now) {
    return voiceAccessCache.visible;
  }
  try {
    const providers = await musicApi.listMusicProviders(
      auth?.isAuthenticated?.value ? auth.authorizedFetch : undefined
    );
    const visible = isAsmrVoiceVisible(providers);
    voiceAccessCache.key = cacheKey;
    voiceAccessCache.visible = visible;
    voiceAccessCache.expiresAt = now + VOICE_ACCESS_CACHE_TTL_MS;
    return visible;
  } catch {
    return true;
  }
}

const routes = [
  { path: '/', name: 'home', component: HomePage },
  { path: '/blog', name: 'blog', component: BlogListPage },
  { path: '/blog/editor/:postId?', name: 'blog-editor', component: BlogPage },
  { path: '/blog/:postId/presentation', name: 'blog-presentation', component: BlogPresentationPage },
  { path: '/blog/:postId', name: 'blog-detail', component: BlogPage },
  {
    path: '/music-library',
    name: 'music-library',
    redirect: '/music-library/music',
    component: MusicLibraryPage,
    children: [
      { path: 'music', name: 'music-library-music', component: MusicLibraryHomeView },
      {
        path: 'voice',
        name: 'music-library-voice',
        component: MusicVoiceHomeView,
        meta: { requiresVoiceAccess: true }
      },
      {
        path: 'voice/work/:workId',
        name: 'music-library-voice-work',
        component: MusicVoiceWorkDetailView,
        meta: { requiresVoiceAccess: true }
      },
      { path: 'playlist/:playlistCode', name: 'music-library-playlist', component: MusicPlaylistDetailView },
      { path: 'player', name: 'music-library-player', component: MusicPlayerDetailView }
    ]
  },
  {
    path: '/m',
    component: MobileShell,
    redirect: '/m/music',
    children: [
      { path: 'music', name: 'mobile-music', component: MobileMusicHomePage },
      { path: 'playlist/:playlistCode', name: 'mobile-playlist', component: MobilePlaylistPage },
      { path: 'search', name: 'mobile-search', component: MobileSearchPage },
      { path: 'profile', name: 'mobile-profile', component: MobileProfilePage, meta: { requiresAuth: true } },
      { path: 'auth', name: 'mobile-auth', component: MobileAuthPage }
    ]
  },
  { path: '/apps', name: 'apps', component: AppsPage },
  { path: '/ai-hub', alias: '/ai-tavern', name: 'ai-hub', component: AiHubPage },
  { path: '/auth', name: 'auth', component: AuthPage },
  { path: '/auth/callback', name: 'auth-callback', component: AuthCallbackPage },
  { path: '/profile', name: 'profile', component: ProfilePage },
  { path: '/admin', name: 'admin', component: AdminPage, meta: { requiresAuth: true, requiresAdmin: true } },
  { path: '/author', name: 'author', component: AuthorPage }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
  scrollBehavior() {
    return { top: 0 };
  }
});

router.beforeEach(async (to) => {
  const oauthCallbackRedirect = resolveOAuthCallbackRedirect(
    to.path,
    typeof window !== 'undefined' ? window.location.search : ''
  );
  if (oauthCallbackRedirect) {
    return oauthCallbackRedirect;
  }

  // 手机 / App 与桌面外壳互跳：手机浏览器自动进入移动版，桌面误入 /m 时回跳。
  if (shouldUseMobileShell()) {
    if (!isMobileShellPath(to.path)) {
      const mobilePath = mapDesktopPathToMobile(to.path);
      if (mobilePath) {
        return { path: mobilePath };
      }
    }
  } else if (isMobileShellPath(to.path)) {
    return { path: mapMobilePathToDesktop(to.path) || '/' };
  }

  const auth = useAuthSession();
  await auth.ensureReady();

  if (to.meta?.requiresAuth && !auth.isAuthenticated.value) {
    if (isMobileShellPath(to.path)) {
      return {
        path: '/m/auth',
        query: {
          redirect: to.fullPath
        }
      };
    }
    return {
      path: '/auth',
      query: {
        redirect: normalizeRedirectPath(to.fullPath)
      }
    };
  }

  if (to.meta?.requiresAdmin) {
    const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
    const isAdmin = groups.some((groupCode) => String(groupCode || '').toUpperCase() === 'ADMIN');
    if (!isAdmin) {
      return {
        path: '/profile',
        query: {
          tab: 'profile',
          reason: 'admin_only'
        }
      };
    }
  }

  if (to.meta?.requiresVoiceAccess) {
    const canAccessVoice = await resolveVoiceRouteVisible(auth);
    if (!canAccessVoice) {
      return {
        path: '/music-library/music',
        query: {
          reason: 'voice_forbidden'
        }
      };
    }
  }

  if (to.path === '/auth' && auth.isAuthenticated.value) {
    const redirect = normalizeRedirectPath(typeof to.query.redirect === 'string' ? to.query.redirect : '/profile');
    return redirect;
  }

  if (to.path === '/m/auth' && auth.isAuthenticated.value) {
    const rawRedirect = typeof to.query.redirect === 'string' ? to.query.redirect : '';
    return rawRedirect && rawRedirect.startsWith('/m') && !rawRedirect.startsWith('/m/auth')
      ? rawRedirect
      : '/m/profile';
  }

  return true;
});

export default router;
