<template>
  <section class="route-page ai-hub-page">
    <header class="page-header">
      <p class="eyebrow">AI Hub</p>
      <h1>把快聊、完整对话、AI 小镇和自宅入口放进同一个壳层。</h1>
      <p class="intro-copy">
        这里先交付 AI 一期的统一入口。顶部 <strong>AI Chat</strong> 继续保留为全局快聊浮层，本页负责承接普通对话、酒馆模式、AI 小镇、自宅 companion 和 Agent 系统的后续落点。
      </p>
    </header>

    <section class="hero-band liquid-material">
      <div class="hero-copy">
        <span class="hero-chip ready">一期壳层已就位</span>
        <span class="hero-chip">顶部 AI Chat 继续可用</span>
        <h2>先把入口统一，再把能力逐个接上。</h2>
        <p>
          当前 AI Hub 不再伪装成“已经完成的 AI 酒馆”。它会先聚合所有 AI 入口，并在每个区域明确告诉你现在能做什么、下一步接什么。
        </p>
      </div>

      <div class="hero-actions">
        <button class="hero-action primary ripple-trigger" type="button" @click="handleOpenQuickChat">
          <i class="fas fa-bolt" aria-hidden="true"></i>
          唤起顶部 AI Chat
        </button>
        <div class="hero-note">
          <strong>快聊仍然是快聊。</strong>
          <span>在 AI Hub 页面内会以浮层方式打开，不再挤占右侧 1/4 辅助栏。</span>
        </div>
      </div>
    </section>

    <section class="hub-grid" aria-label="AI Hub capabilities">
      <article
        v-for="card in featureCards"
        :key="card.title"
        class="hub-card liquid-material"
        :class="[`tone-${card.tone}`]"
      >
        <div class="card-topline">
          <span class="card-kicker">{{ card.kicker }}</span>
          <span class="status-pill" :class="card.tone">{{ card.status }}</span>
        </div>
        <h3>{{ card.title }}</h3>
        <p>{{ card.description }}</p>

        <ul class="card-points">
          <li v-for="point in card.points" :key="point">{{ point }}</li>
        </ul>

        <button
          class="card-action ripple-trigger"
          type="button"
          :disabled="!card.action"
          @click="handleCardAction(card.action)"
        >
          {{ card.actionLabel }}
        </button>
      </article>
    </section>

    <section class="roadmap-shell liquid-material">
      <header class="roadmap-head">
        <p class="eyebrow">Phase 1 Map</p>
        <h2>AI 一期的顺序不是堆功能，而是先把入口和边界画清楚。</h2>
      </header>

      <ol class="roadmap-list">
        <li v-for="stage in roadmapStages" :key="stage.title" class="roadmap-item">
          <span class="roadmap-index">{{ stage.index }}</span>
          <div class="roadmap-copy">
            <strong>{{ stage.title }}</strong>
            <p>{{ stage.description }}</p>
          </div>
        </li>
      </ol>
    </section>
  </section>
</template>

<script setup>
import { openAiChat } from '../utils/aiChatBus';

const featureCards = [
  {
    kicker: 'Quick Chat',
    status: '当前可用',
    tone: 'ready',
    title: '顶部 AI Chat 快聊',
    description: '保留全局快问快答入口，不把它混进完整对话路线里。',
    points: ['任意页面都能唤起', '在 AI Hub 内以浮层打开', '适合短问答、临时查询与快速试探'],
    action: 'open-quick-chat',
    actionLabel: '现在就打开'
  },
  {
    kicker: 'Normal Chat',
    status: '当前可用',
    tone: 'ready',
    title: '普通对话模式',
    description: '共享聊天壳层，优先落地 normal / tavern 双模式会话的普通模式部分。',
    points: ['承接基础会话', '为角色卡、世界书绑定留接口', '作为后续权限与配额整合基础'],
    action: 'open-normal-chat',
    actionLabel: '进入普通对话'
  },
  {
    kicker: 'Tavern Mode',
    status: '当前可用',
    tone: 'ready',
    title: '酒馆模式',
    description: '强调角色人格、设定和沉浸感，而不是普通问答式聊天。',
    points: ['角色卡与世界书管理会先补齐', '保留独立模式语义', '后续接入记忆隔离与设定注入'],
    action: 'open-tavern-chat',
    actionLabel: '进入酒馆模式'
  },
  {
    kicker: 'AI Town',
    status: '待接入',
    tone: 'planned',
    title: 'AI 小镇公开漫游',
    description: '图书馆、教室、自宅外部三块场景会先作为公开入口出现。',
    points: ['先做场景切换与 NPC 展示', '管理员特殊 NPC 入口单独预留', '后续再挂接记忆与权限守卫'],
    action: '',
    actionLabel: '等待接入'
  },
  {
    kicker: 'Home Companion',
    status: '待接入',
    tone: 'planned',
    title: '自宅 companion',
    description: '这是管理员专属的高亲密度入口，会和世界书、角色形象、记忆服务一起落地。',
    points: ['入口独立于 AI 小镇公开漫游', '需要人格配置与记忆开关', '会直连管理员专用 MemoryOS scope'],
    action: '',
    actionLabel: '等待接入'
  },
  {
    kicker: 'Agent',
    status: '一期占位',
    tone: 'backlog',
    title: 'Agent 系统',
    description: '先在 AI Hub 里留出位置，不在本期提前塞进伪完成能力。',
    points: ['记录产品与技术 backlog', '明确不是一期交付范围', '后续再单独接入做事型智能体'],
    action: '',
    actionLabel: 'Backlog'
  }
];

const roadmapStages = [
  {
    index: '01',
    title: '统一入口',
    description: '先把 AI 相关能力聚合成一个明确的 Hub，而不是继续扩散在多个零散入口里。'
  },
  {
    index: '02',
    title: '普通对话与酒馆模式',
    description: '共享聊天壳层先建立起来，再把 normal / tavern 的模式差异补齐。'
  },
  {
    index: '03',
    title: 'AI 小镇与自宅 companion',
    description: '等入口稳定后，再把公开漫游、自宅 companion 和管理员特权能力分层接上。'
  },
  {
    index: '04',
    title: '权限、配额与验收',
    description: '最后再统一接配额守卫、记忆隔离和一期回归验收，不把这些基础能力散落到中途返工。'
  }
];

function handleOpenQuickChat() {
  openAiChat({ source: 'ai-hub', preferredMode: 'quick_chat' });
}

function handleCardAction(action) {
  if (action === 'open-quick-chat') {
    handleOpenQuickChat();
    return;
  }
  if (action === 'open-normal-chat') {
    openAiChat({ source: 'ai-hub', preferredMode: 'normal' });
    return;
  }
  if (action === 'open-tavern-chat') {
    openAiChat({ source: 'ai-hub', preferredMode: 'tavern' });
  }
}
</script>

<style scoped>
.route-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
}

.page-header {
  padding: 8px 4px 20px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 6px;
  max-width: 880px;
  font-size: clamp(30px, 4.3vw, 52px);
  line-height: 1.08;
}

.intro-copy {
  margin-top: 14px;
  max-width: 900px;
  color: rgba(223, 230, 249, 0.86);
  line-height: 1.7;
}

.hero-band {
  --liquid-bg: linear-gradient(145deg, rgba(18, 25, 41, 0.72), rgba(39, 24, 55, 0.56));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 18px 44px rgba(4, 7, 16, 0.34);
  border-radius: 26px;
  padding: 24px;
  display: grid;
  grid-template-columns: minmax(0, 1.7fr) minmax(280px, 0.95fr);
  gap: 18px;
  overflow: hidden;
}

.hero-copy {
  display: grid;
  gap: 12px;
}

.hero-copy h2 {
  font-size: clamp(22px, 3vw, 34px);
  line-height: 1.15;
}

.hero-copy p {
  max-width: 58ch;
  line-height: 1.7;
  color: rgba(233, 239, 250, 0.82);
}

.hero-chip {
  display: inline-flex;
  align-items: center;
  width: fit-content;
  padding: 7px 12px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.12);
  border: 1px solid rgba(255, 255, 255, 0.14);
  font-size: 12px;
  letter-spacing: 0.05em;
  text-transform: uppercase;
  color: rgba(240, 245, 255, 0.84);
}

.hero-chip.ready {
  background: rgba(104, 214, 164, 0.14);
  border-color: rgba(104, 214, 164, 0.28);
  color: rgba(196, 255, 227, 0.92);
}

.hero-actions {
  display: grid;
  align-content: end;
  gap: 14px;
}

.hero-action {
  min-height: 48px;
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
  padding: 0 18px;
  font-weight: 700;
  letter-spacing: 0.02em;
  color: rgba(247, 250, 255, 0.96);
}

.hero-action.primary {
  background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.58), rgba(255, 255, 255, 0.2));
  box-shadow: 0 14px 28px rgba(var(--accent-rgb), 0.18);
}

.hero-note {
  border-radius: 18px;
  padding: 16px 18px;
  background: rgba(7, 12, 24, 0.26);
  border: 1px solid rgba(255, 255, 255, 0.08);
  display: grid;
  gap: 6px;
  color: rgba(224, 231, 244, 0.78);
  line-height: 1.6;
}

.hero-note strong {
  color: rgba(248, 251, 255, 0.94);
}

.hub-grid {
  margin-top: 18px;
  display: grid;
  grid-template-columns: repeat(12, minmax(0, 1fr));
  gap: 14px;
}

.hub-card {
  --liquid-bg: rgba(16, 22, 36, 0.44);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 14px 28px rgba(4, 8, 16, 0.2);
  grid-column: span 4;
  min-height: 280px;
  border-radius: 22px;
  padding: 18px;
  display: grid;
  align-content: start;
  gap: 12px;
}

.hub-card.tone-ready {
  --liquid-bg: linear-gradient(165deg, rgba(16, 31, 38, 0.72), rgba(23, 50, 49, 0.52));
}

.hub-card.tone-queued {
  --liquid-bg: linear-gradient(165deg, rgba(22, 25, 42, 0.7), rgba(44, 31, 59, 0.5));
}

.hub-card.tone-planned {
  --liquid-bg: linear-gradient(165deg, rgba(26, 25, 39, 0.72), rgba(56, 38, 38, 0.48));
}

.hub-card.tone-backlog {
  --liquid-bg: linear-gradient(165deg, rgba(20, 20, 29, 0.74), rgba(31, 34, 42, 0.56));
}

.card-topline {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.card-kicker {
  font-size: 11px;
  letter-spacing: 0.14em;
  text-transform: uppercase;
  color: rgba(202, 211, 230, 0.68);
}

.status-pill {
  display: inline-flex;
  align-items: center;
  min-height: 26px;
  padding: 0 10px;
  border-radius: 999px;
  border: 1px solid transparent;
  font-size: 12px;
}

.status-pill.ready {
  background: rgba(104, 214, 164, 0.14);
  border-color: rgba(104, 214, 164, 0.24);
  color: rgba(196, 255, 227, 0.92);
}

.status-pill.queued {
  background: rgba(var(--accent-rgb), 0.14);
  border-color: rgba(var(--accent-rgb), 0.22);
  color: rgba(231, 236, 255, 0.9);
}

.status-pill.planned,
.status-pill.backlog {
  background: rgba(255, 255, 255, 0.08);
  border-color: rgba(255, 255, 255, 0.12);
  color: rgba(224, 231, 245, 0.82);
}

.hub-card h3 {
  font-size: clamp(22px, 2vw, 26px);
  line-height: 1.18;
}

.hub-card p {
  color: rgba(224, 231, 245, 0.78);
  line-height: 1.66;
}

.card-points {
  margin: 0;
  padding-left: 18px;
  display: grid;
  gap: 8px;
  color: rgba(233, 239, 249, 0.84);
}

.card-action {
  margin-top: auto;
  min-height: 42px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(244, 248, 255, 0.92);
  font-weight: 700;
}

.card-action:disabled {
  cursor: default;
  opacity: 0.54;
}

.roadmap-shell {
  --liquid-bg: rgba(14, 20, 30, 0.44);
  --liquid-border: rgba(255, 255, 255, 0.12);
  --liquid-shadow: 0 14px 28px rgba(4, 7, 16, 0.18);
  margin-top: 18px;
  border-radius: 24px;
  padding: 22px;
}

.roadmap-head h2 {
  margin-top: 8px;
  font-size: clamp(24px, 3vw, 34px);
  line-height: 1.16;
}

.roadmap-list {
  margin: 18px 0 0;
  padding: 0;
  list-style: none;
  display: grid;
  gap: 12px;
}

.roadmap-item {
  display: grid;
  grid-template-columns: 62px minmax(0, 1fr);
  gap: 14px;
  align-items: start;
  padding: 16px 0;
  border-top: 1px solid rgba(255, 255, 255, 0.08);
}

.roadmap-item:first-child {
  border-top: 0;
  padding-top: 0;
}

.roadmap-index {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  min-height: 44px;
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(var(--accent-soft-rgb), 0.96);
  font-size: 18px;
  font-weight: 700;
}

.roadmap-copy {
  display: grid;
  gap: 6px;
}

.roadmap-copy strong {
  font-size: 18px;
}

.roadmap-copy p {
  color: rgba(224, 231, 245, 0.76);
  line-height: 1.66;
}

@media (max-width: 1180px) {
  .hub-card {
    grid-column: span 6;
  }
}

@media (max-width: 920px) {
  .hero-band {
    grid-template-columns: 1fr;
  }

  .hub-card {
    grid-column: span 12;
    min-height: 0;
  }
}

@media (max-width: 640px) {
  .hero-band,
  .roadmap-shell,
  .hub-card {
    border-radius: 20px;
  }

  .hero-band,
  .roadmap-shell {
    padding: 18px;
  }

  .roadmap-item {
    grid-template-columns: 1fr;
  }
}
</style>
