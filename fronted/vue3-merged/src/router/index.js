import { createRouter, createWebHashHistory } from 'vue-router';
import AiTavernPage from '../pages/AiTavernPage.vue';
import AuthorPage from '../pages/AuthorPage.vue';
import AppsPage from '../pages/AppsPage.vue';
import BlogPage from '../pages/BlogPage.vue';
import HomePage from '../pages/HomePage.vue';
import MusicLibraryPage from '../pages/MusicLibraryPage.vue';
import ProfilePage from '../pages/ProfilePage.vue';

export const routePathByKey = {
  home: '/',
  blog: '/blog',
  'music-library': '/music-library',
  apps: '/apps',
  'ai-tavern': '/ai-tavern',
  profile: '/profile',
  author: '/author'
};

const routes = [
  { path: '/', name: 'home', component: HomePage },
  { path: '/blog', name: 'blog', component: BlogPage },
  { path: '/music-library', name: 'music-library', component: MusicLibraryPage },
  { path: '/apps', name: 'apps', component: AppsPage },
  { path: '/ai-tavern', name: 'ai-tavern', component: AiTavernPage },
  { path: '/profile', name: 'profile', component: ProfilePage },
  { path: '/author', name: 'author', component: AuthorPage }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
  scrollBehavior() {
    return { top: 0 };
  }
});

export default router;
