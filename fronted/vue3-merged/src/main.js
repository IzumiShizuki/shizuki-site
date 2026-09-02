import { createApp } from 'vue';
import '@fortawesome/fontawesome-free/css/all.min.css';
import './styles/global.css';
import './styles/liquid-material.css';
import './styles/liquid-surface.css';
import './styles/theme.css';
import './styles/blog-m3e.css';
import App from './App.vue';
import DesktopControlOrb from './components/desktop/DesktopControlOrb.vue';
import router from './router';
import { guardDesktopHomeRoute, resolveDesktopSurface, shouldMountOrbSurface } from './desktop/desktopSurfaceMode';
import { initAosManager } from './utils/aosManager';
import { initWindowLifecycleDiag } from './utils/windowLifecycleDiag';
import { initNativeShell } from './mobile/nativeBootstrap';

function settleBootLoader() {
  if (typeof window === 'undefined' || typeof document === 'undefined') return;
  const boot = document.getElementById('app-boot');
  if (!boot) return;
  window.requestAnimationFrame(() => {
    boot.classList.add('is-hidden');
    window.setTimeout(() => {
      boot.remove();
    }, 420);
  });
}

const desktopSurface = resolveDesktopSurface();
const orbSurface = shouldMountOrbSurface(desktopSurface);
const app = createApp(orbSurface ? DesktopControlOrb : App);
if (!orbSurface) {
  router.beforeEach(destination => guardDesktopHomeRoute(desktopSurface, destination));
  app.use(router);
  initAosManager();
  initWindowLifecycleDiag({ router });
}
app.mount('#app');
settleBootLoader();
if (!orbSurface) initNativeShell(router);
