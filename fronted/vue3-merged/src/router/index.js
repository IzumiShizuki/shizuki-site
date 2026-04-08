import { createRouter, createWebHashHistory } from 'vue-router';
import HomePage from '../pages/HomePage.vue';
import { useAuthSession } from '../composables/useAuthSession';
import { resolveOAuthCallbackRedirect } from './oauthCallbackGuard';

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
const MusicPlaylistDetailView = () => import('../pages/music/MusicPlaylistDetailView.vue');
const MusicPlayerDetailView = () => import('../pages/music/MusicPlayerDetailView.vue');
const ProfilePage = () => import('../pages/ProfilePage.vue');

export const routePathByKey = {
  home: '/',
  blog: '/blog',
  'music-library': '/music-library',
  apps: '/apps',
  'ai-hub': '/ai-hub',
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
  { path: '/blog', name: 'blog', component: BlogListPage },
  { path: '/blog/editor/:postId?', name: 'blog-editor', component: BlogPage, meta: { requiresAuth: true } },
  { path: '/blog/:postId/presentation', name: 'blog-presentation', component: BlogPresentationPage },
  { path: '/blog/:postId', name: 'blog-detail', component: BlogPage },
  {
    path: '/music-library',
    component: MusicLibraryPage,
    children: [
      { path: '', name: 'music-library', component: MusicLibraryHomeView },
      { path: 'playlist/:playlistCode', name: 'music-library-playlist', component: MusicPlaylistDetailView },
      { path: 'player', name: 'music-library-player', component: MusicPlayerDetailView }
    ]
  },
  { path: '/apps', name: 'apps', component: AppsPage },
  { path: '/ai-hub', alias: '/ai-tavern', name: 'ai-hub', component: AiHubPage },
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
