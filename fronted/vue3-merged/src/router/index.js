import { createRouter, createWebHashHistory } from 'vue-router';
import AiTavernPage from '../pages/AiTavernPage.vue';
import AdminPage from '../pages/AdminPage.vue';
import AuthorPage from '../pages/AuthorPage.vue';
import AuthCallbackPage from '../pages/AuthCallbackPage.vue';
import AuthPage from '../pages/AuthPage.vue';
import AppsPage from '../pages/AppsPage.vue';
import BlogPage from '../pages/BlogPage.vue';
import HomePage from '../pages/HomePage.vue';
import MusicLibraryPage from '../pages/MusicLibraryPage.vue';
import ProfilePage from '../pages/ProfilePage.vue';
import { useAuthSession } from '../composables/useAuthSession';
import { resolveOAuthCallbackRedirect } from './oauthCallbackGuard';

export const routePathByKey = {
  home: '/',
  blog: '/blog',
  'music-library': '/music-library',
  apps: '/apps',
  'ai-tavern': '/ai-tavern',
  auth: '/auth',
  profile: '/profile',
  admin: '/admin',
  author: '/author'
};

function normalizeRedirectPath(path) {
  if (!path || typeof path !== 'string') return '/profile';
  if (!path.startsWith('/')) return '/profile';
  if (path.startsWith('/auth')) return '/profile';
  return path;
}

const routes = [
  { path: '/', name: 'home', component: HomePage },
  { path: '/blog', name: 'blog', component: BlogPage },
  { path: '/music-library', name: 'music-library', component: MusicLibraryPage },
  { path: '/apps', name: 'apps', component: AppsPage },
  { path: '/ai-tavern', name: 'ai-tavern', component: AiTavernPage },
  { path: '/auth', name: 'auth', component: AuthPage },
  { path: '/auth/callback', name: 'auth-callback', component: AuthCallbackPage },
  { path: '/profile', name: 'profile', component: ProfilePage, meta: { requiresAuth: true } },
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

  const auth = useAuthSession();
  await auth.ensureReady();

  if (to.meta?.requiresAuth && !auth.isAuthenticated.value) {
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

  if (to.path === '/auth' && auth.isAuthenticated.value) {
    const redirect = normalizeRedirectPath(typeof to.query.redirect === 'string' ? to.query.redirect : '/profile');
    return redirect;
  }

  return true;
});

export default router;
