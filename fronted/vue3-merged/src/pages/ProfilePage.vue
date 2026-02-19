<template>
  <section class="route-page">
    <header class="page-header">
      <p class="eyebrow">Profile</p>
      <h1>个人页面</h1>
      <p>这是个人中心占位页面，设置入口已放在这里。</p>
    </header>

    <div class="profile-grid">
      <article class="profile-card liquid-material">
        <h2>账号信息</h2>
        <p>昵称：Shizuki</p>
        <p>身份：站点管理者（占位）</p>
      </article>

      <article class="profile-card liquid-material">
        <h2>设置</h2>
        <p>在这里可以配置全局交互色（默认淡紫）并实时生效。</p>
        <button class="settings-btn ripple-trigger" type="button" @click="settingsVisible = true">打开设置</button>
      </article>
    </div>

    <SettingsPanel :visible="settingsVisible" @close="settingsVisible = false" />
  </section>
</template>

<script setup>
import { ref } from 'vue';
import SettingsPanel from '../components/SettingsPanel.vue';

const settingsVisible = ref(false);
</script>

<style scoped>
.route-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
}

.page-header {
  padding: 8px 4px 14px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 4px;
  font-size: clamp(28px, 4vw, 42px);
}

.page-header p {
  margin-top: 10px;
  max-width: 680px;
  color: rgba(223, 230, 249, 0.86);
}

.profile-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.profile-card {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 14px 16px;
  display: grid;
  gap: 8px;
}

.profile-card h2 {
  font-size: 18px;
}

.profile-card p {
  color: rgba(223, 230, 249, 0.86);
  line-height: 1.6;
}

.settings-btn {
  margin-top: 6px;
  justify-self: start;
  border: 0;
  border-radius: 10px;
  min-width: 120px;
  height: 34px;
  padding: 0 12px;
  background: rgba(var(--accent-rgb), 0.28);
  color: rgba(247, 242, 255, 0.95);
}

@media (max-width: 900px) {
  .profile-grid {
    grid-template-columns: 1fr;
  }
}
</style>
