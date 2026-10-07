import { defineConfig, loadEnv } from 'vite';
import vue from '@vitejs/plugin-vue';
import react from '@vitejs/plugin-react';

export default defineConfig(({ mode }) => {
  const env = loadEnv(mode, process.cwd(), 'SHIZUKI_');
  const apiTarget = env.SHIZUKI_DEV_API_TARGET || 'http://111.228.35.186:5173';
  return {
    plugins: [vue(), react()],
    server: {
      proxy: {
        '/api': {
          target: apiTarget,
          changeOrigin: true,
          proxyTimeout: 30000
        },
        '/actuator': {
          target: apiTarget,
          changeOrigin: true
        }
      }
    },
    build: {
      rollupOptions: {
        output: {
          manualChunks: {
            'vendor': ['vue', 'vue-router', 'motion-v'],
            'tiptap': ['@tiptap/core', '@tiptap/react', '@tiptap/starter-kit'],
            'editor': ['@toast-ui/editor'],
            'react': ['react', 'react-dom']
          }
        }
      }
    },
    test: {
      environment: 'jsdom',
      clearMocks: true
    }
  };
});
