import { createApp } from 'vue';
import '@fortawesome/fontawesome-free/css/all.min.css';
import './styles/global.css';
import './styles/liquid-material.css';
import './styles/theme.css';
import App from './App.vue';
import router from './router';
import { initAosManager } from './utils/aosManager';
import { initWindowLifecycleDiag } from './utils/windowLifecycleDiag';

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

const app = createApp(App);
app.use(router);
initAosManager();
initWindowLifecycleDiag({ router });
app.mount('#app');
settleBootLoader();
