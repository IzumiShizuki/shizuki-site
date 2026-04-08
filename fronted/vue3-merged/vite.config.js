import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import react from '@vitejs/plugin-react';

export default defineConfig({
  plugins: [vue(), react()],
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
});
