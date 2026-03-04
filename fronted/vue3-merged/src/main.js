import { createApp } from 'vue';
import '@fortawesome/fontawesome-free/css/all.min.css';
import './styles/global.css';
import './styles/liquid-material.css';
import './styles/theme.css';
import './styles/music-replica.css';
import App from './App.vue';
import router from './router';
import { initAosManager } from './utils/aosManager';
import { initWindowLifecycleDiag } from './utils/windowLifecycleDiag';

const app = createApp(App);
app.use(router);
initAosManager();
initWindowLifecycleDiag({ router });
app.mount('#app');
