<template>
  <section class="wechat-panel" aria-label="微信提醒与订阅" :aria-busy="busy || loading">
    <div class="binding-line">
      <div>
        <p class="binding-title">{{ status?.bound ? status.maskedIdentity : '把关心的更新，送到微信' }}</p>
        <p class="muted">{{ stateText }}</p>
      </div>
      <button type="button" :disabled="busy || loading" @click="load()">刷新状态</button>
    </div>
    <p v-if="error" class="error" role="alert">{{ error }}</p>
    <p v-if="hint" class="muted" role="status">{{ hint }}</p>
    <p v-if="loading && !status" role="status">正在读取提醒设置…</p>
    <template v-if="status">
      <p v-if="!status.available" class="setup-note">站长尚未启用微信提醒。完成机器人接入后，就可以在这里绑定并选择订阅。</p>
      <template v-else>
        <p class="muted">先添加站长提供的机器人为微信好友，再生成绑定指令并私聊发送。默认不订阅任何更新。</p>
        <div class="actions">
          <button type="button" :disabled="busy || loading || cooldown > 0" @click="generate">
            {{ cooldown > 0 ? cooldown + ' 秒后可重新生成' : status.bound ? '更换绑定微信' : '生成绑定指令' }}
          </button>
          <button v-if="status.bound && !confirmUnbind" type="button" :disabled="busy || loading" @click="confirmUnbind = true">解绑微信</button>
        </div>
        <div v-if="challenge" class="binding-code">
          <label :for="id + '-command'">把这条指令私聊发给机器人</label>
          <div class="command-row">
            <input :id="id + '-command'" :value="challenge.command" readonly autocomplete="off" spellcheck="false" @focus="$event.target.select()" />
            <button type="button" @click="copyCommand">复制指令</button>
          </div>
          <p class="muted">有效至 {{ formatTime(challenge.expiresAt) }}，请勿转发。发送后会自动刷新绑定结果。</p>
        </div>
      </template>
      <div v-if="status.bound && !status.available && !confirmUnbind" class="actions">
        <button type="button" :disabled="busy || loading" @click="confirmUnbind = true">解绑微信</button>
      </div>
      <div v-if="confirmUnbind && status.bound" class="unbind-confirm" role="group" aria-label="确认解绑微信">
        <p>解绑后会清空订阅，并取消尚未发送的提醒。</p>
        <div class="actions">
          <button type="button" :disabled="busy" @click="unbind">确认解绑</button>
          <button type="button" :disabled="busy" @click="confirmUnbind = false">保留绑定</button>
        </div>
      </div>
      <form v-if="status.bound" @submit.prevent="save">
        <fieldset :disabled="busy || loading || !status.available">
          <legend>订阅同组成员的更新</legend>
          <p class="muted">只提醒其他成员新发布的公开内容；同一条更新只提醒一次。</p>
          <p v-if="!status.groups.length" class="muted">当前没有可订阅的分组，加入分组后再来看看。</p>
          <div v-for="group in status.groups" :key="group.code" class="group-row">
            <span>{{ group.name || group.code }}</span>
            <label v-for="kind in kinds" :key="kind.code">
              <input v-model="selected" type="checkbox" :value="group.code + ':' + kind.code" :aria-label="(group.name || group.code) + '：' + kind.label" @change="dirty = true" />
              {{ kind.label }}
            </label>
          </div>
          <div class="delivery-options">
            <label><input v-model="paused" type="checkbox" @change="dirty = true" /> 暂停所有提醒</label>
            <label><input v-model="quiet" type="checkbox" @change="dirty = true" /> 开启免打扰时段（北京时间）</label>
            <div v-if="quiet" class="quiet-hours">
              <label :for="id + '-start'">开始
                <select :id="id + '-start'" v-model.number="quietStart" @change="dirty = true"><option v-for="hour in 24" :key="hour" :value="hour - 1">{{ String(hour - 1).padStart(2, '0') }}:00</option></select>
              </label>
              <label :for="id + '-end'">结束
                <select :id="id + '-end'" v-model.number="quietEnd" @change="dirty = true"><option v-for="hour in 24" :key="hour" :value="hour - 1">{{ String(hour - 1).padStart(2, '0') }}:00</option></select>
              </label>
              <span class="muted">时段内的提醒延后发送</span>
            </div>
          </div>
          <div class="save-row">
            <button type="submit" :disabled="!dirty">{{ busy ? '正在保存…' : '保存订阅' }}</button>
            <span class="muted">{{ dirty ? '有尚未保存的修改' : '设置已同步' }}</span>
          </div>
        </fieldset>
      </form>
      <details v-if="status.history.length" class="history">
        <summary>最近提醒记录 <span>{{ status.history.length }}</span></summary>
        <ul>
          <li v-for="item in status.history" :key="item.id">
            <span>{{ item.kind === 'POST' ? '文章更新' : '动态更新' }}</span>
            <span>{{ deliveryStatus(item.status) }}</span>
            <time :datetime="item.createdAt">{{ formatTime(item.createdAt) }}</time>
          </li>
        </ul>
        <p class="muted">显示最近 30 天记录；提交微信平台不代表对方已阅读。</p>
      </details>
    </template>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, ref, useId, watch } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import { createWechatNotificationsApi } from '../../services/wechatNotificationsApi';

const auth = useAuthSession();
const id = useId();
const kinds = [{ code: 'POST', label: '文章' }, { code: 'MOMENT', label: '动态' }];
const status = ref(null), loading = ref(false), busy = ref(false), error = ref(''), hint = ref('');
const selected = ref([]), paused = ref(false), quiet = ref(false), quietStart = ref(22), quietEnd = ref(8);
const dirty = ref(false), challenge = ref(null), confirmUnbind = ref(false), cooldown = ref(0);
let api, generation = 0, pollTimer, tickTimer, initialBoundAt;
const stateText = computed(() => !status.value ? '读取绑定状态' : !status.value.available ? '暂未启用'
  : status.value.bound ? (status.value.paused ? '已绑定 · 提醒已暂停' : '已绑定 · 按订阅提醒') : '尚未绑定微信');
const message = e => String(e?.detail || e?.message || '操作失败，请稍后重试');

function apply(value) {
  status.value = value;
  if (!dirty.value) {
    const groups = new Set(value.groups.map(g => g.code));
    selected.value = value.subscriptions.filter(s => groups.has(s.groupCode)).map(s => s.groupCode + ':' + s.kind);
    paused.value = value.paused;
    quiet.value = value.quietStart !== null;
    quietStart.value = value.quietStart ?? 22;
    quietEnd.value = value.quietEnd ?? 8;
  }
  if (challenge.value && value.bound && value.boundAt !== initialBoundAt) {
    challenge.value = null;
    hint.value = '微信绑定成功，请选择分组和更新类型并保存订阅。';
  }
}
async function load() {
  if (!api || loading.value || busy.value) return;
  const version = generation;
  loading.value = true; error.value = '';
  try { const value = await api.status(); if (version === generation) apply(value); }
  catch (e) { if (version === generation) error.value = message(e); }
  finally { if (version === generation) loading.value = false; }
}
async function action(run) {
  if (!api || busy.value || loading.value) return;
  const version = generation, current = api;
  busy.value = true; error.value = ''; hint.value = '';
  try { await run(current, () => version === generation); }
  catch (e) { if (version === generation) error.value = message(e); }
  finally { if (version === generation) busy.value = false; }
}
async function generate() {
  await action(async (client, active) => {
    const value = await client.challenge();
    if (!active()) return;
    initialBoundAt = status.value?.boundAt;
    challenge.value = value; cooldown.value = 30;
    schedulePoll();
  });
}
function schedulePoll() {
  clearTimeout(pollTimer);
  if (!challenge.value) return;
  pollTimer = setTimeout(async () => {
    if (!challenge.value) return;
    if (Date.parse(challenge.value.expiresAt) <= Date.now()) {
      challenge.value = null; hint.value = '绑定指令已过期，请重新生成。'; return;
    }
    await load(); schedulePoll();
  }, 5000);
}
async function save() {
  if (quiet.value && quietStart.value === quietEnd.value) { error.value = '免打扰开始和结束时间需要不同。'; return; }
  await action(async (client, active) => {
    const subscriptions = selected.value.map(key => {
      const split = key.lastIndexOf(':'); return { groupCode: key.slice(0, split), kind: key.slice(split + 1) };
    });
    await client.save({ paused: paused.value, quietStart: quiet.value ? quietStart.value : null,
      quietEnd: quiet.value ? quietEnd.value : null, subscriptions });
    if (!active()) return;
    dirty.value = false;
    const value = await client.status();
    if (active()) { apply(value); hint.value = '订阅已保存。'; }
  });
}
async function unbind() {
  await action(async (client, active) => {
    await client.unbind();
    if (!active()) return;
    dirty.value = false; challenge.value = null; confirmUnbind.value = false; clearTimeout(pollTimer);
    const value = await client.status();
    if (active()) { apply(value); hint.value = '微信已解绑，订阅已清空。'; }
  });
}
async function copyCommand() {
  const version = generation, command = challenge.value?.command;
  if (!command) return;
  try {
    await navigator.clipboard.writeText(command);
    if (version === generation) hint.value = '指令已复制，请私聊发送给机器人。';
  } catch { if (version === generation) hint.value = '未能自动复制，请选中上面的指令手动复制。'; }
}
function formatTime(value) {
  const date = new Date(value);
  return Number.isNaN(date.getTime()) ? '时间未知' : new Intl.DateTimeFormat('zh-CN', {
    timeZone: 'Asia/Shanghai', month: 'numeric', day: 'numeric', hour: '2-digit', minute: '2-digit'
  }).format(date);
}
function deliveryStatus(value) {
  return { PENDING: '等待发送', LEASED: '发送中', SENT: '已提交微信平台', FAILED: '发送失败', CANCELLED: '已取消' }[value] || '状态未知';
}
watch(() => auth.isAuthenticated.value ? auth.user.value?.userId : null, userId => {
  generation++; clearTimeout(pollTimer); clearInterval(tickTimer);
  status.value = null; challenge.value = null; selected.value = []; dirty.value = false;
  busy.value = loading.value = confirmUnbind.value = false; cooldown.value = 0; error.value = hint.value = '';
  api = userId ? createWechatNotificationsApi(auth.authorizedFetch, userId) : null;
  if (api) {
    load();
    tickTimer = setInterval(() => { if (cooldown.value > 0) cooldown.value--; }, 1000);
  }
}, { immediate: true });
onBeforeUnmount(() => { generation++; clearTimeout(pollTimer); clearInterval(tickTimer); });
</script>

<style scoped>
.wechat-panel { color: var(--theme-text-primary); font-size: 14px; line-height: 1.65; min-width: 0; }
.binding-line { display: flex; justify-content: space-between; align-items: start; gap: 16px; }
.binding-title { font-size: 17px; font-weight: 650; margin: 0 0 4px; }
p { margin: 8px 0; }
.muted { color: var(--theme-text-secondary); font-size: 13px; }
.actions { display: flex; gap: 10px; flex-wrap: wrap; margin: 16px 0; }
button, input, select { font: inherit; }
button, select { min-height: 44px; padding: 8px 14px; border: 1px solid var(--theme-border); border-radius: 10px; color: inherit; background: var(--accent-mode-fill-soft); }
button { cursor: pointer; }
button:disabled { opacity: .55; cursor: default; }
button:hover:not(:disabled) { background: var(--accent-mode-fill-soft-hover); }
:where(button, input, select, summary):focus-visible { outline: 2px solid var(--accent-hex); outline-offset: 3px; }
.binding-code, .unbind-confirm { padding-block: 16px; border-block: 1px solid var(--theme-border); margin-block: 16px; }
.command-row { display: flex; align-items: center; gap: 10px; margin-top: 8px; }
.command-row input { width: 100%; min-width: 0; box-sizing: border-box; padding: 12px; border: 1px solid var(--theme-border); border-radius: 10px; background: var(--theme-surface-soft); color: inherit; font-family: monospace; font-size: 13px; }
.command-row button { flex-shrink: 0; }
fieldset { border: 0; margin: 28px 0 0; padding: 0; min-width: 0; }
legend { font-size: 16px; font-weight: 650; padding: 0; }
.group-row { display: grid; grid-template-columns: minmax(0, 1fr) auto auto; gap: 24px; padding-block: 12px; border-bottom: 1px solid var(--theme-border); align-items: center; }
.group-row > span { overflow-wrap: anywhere; }
label { display: flex; align-items: center; gap: 8px; min-height: 44px; }
input[type=checkbox] { accent-color: var(--accent-hex); width: 18px; height: 18px; flex-shrink: 0; }
.delivery-options { display: grid; gap: 6px; margin-top: 20px; }
.quiet-hours, .save-row { display: flex; gap: 16px; flex-wrap: wrap; align-items: center; }
.save-row { margin-top: 20px; }
.history { margin-top: 28px; border-top: 1px solid var(--theme-border); padding-top: 16px; }
summary { cursor: pointer; min-height: 44px; font-weight: 600; }
summary > span { font-weight: 400; color: var(--theme-text-secondary); margin-left: 8px; }
ul { list-style: none; padding: 0; margin: 0; }
li { display: grid; grid-template-columns: 1fr 1fr auto; gap: 12px; padding-block: 10px; border-bottom: 1px solid var(--theme-border); font-size: 13px; }
time { font-variant-numeric: tabular-nums; color: var(--theme-text-secondary); }
.error { color: var(--theme-danger, #b4233c); }
@media (max-width: 600px) {
  .binding-line { flex-wrap: wrap; gap: 8px; }
  .command-row { align-items: stretch; flex-direction: column; }
  .command-row button { align-self: start; }
  .group-row { gap: 12px; }
  .quiet-hours { gap: 8px; }
  li { grid-template-columns: 1fr auto; }
  li time { grid-column: 1 / -1; }
}
</style>
