import { createApp } from 'vue';
import '@fortawesome/fontawesome-free/css/all.min.css';
import './styles/global.css';
import './styles/liquid-material.css';
import './styles/theme.css';
import App from './App.vue';
import router from './router';

createApp(App).use(router).mount('#app');
