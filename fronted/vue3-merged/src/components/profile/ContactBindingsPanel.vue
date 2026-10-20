<template>
  <section class="contact-bindings-panel" :aria-busy="busy || loading">
    <div class="panel-heading">
      <div>
        <h3>QQ / 微信账号绑定</h3>
        <p class="muted">绑定后的身份可用于 Todo 操作授权和提醒投递，主站与 DJ 站共用。</p>
      </div>
      <button type="button" :disabled="busy || loading" @click="load">刷新</button>
    </div>
    <p v-if="error" class="error" role="alert">{{ error }}</p>
    <p v-if="hint" class="muted" role="status">{{ hint }}</p>
    <p v-if="loading && !status" class="muted">正在读取绑定状态…</p>
    <template v-if="status">
      <p v-if="!status.available" class="notice">消息桥接尚未配置，暂时不能生成绑定指令。</p>
      <template v-else>
        <div class="add-row">
          <label for="contact-platform">添加身份</label>
          <select id="contact-platform" v-model="platform" :disabled="busy || loading">
            <option value="QQ">QQ</option>
            <option value="WECHAT">微信</option>
          </select>
          <button type="button" :disabled="busy || loading || cooldown > 0" @click="generate">
            {{ cooldown > 0 ? `${cooldown} 秒后重试` : '生成绑定指令' }}
          </button>
        </div>
        <div v-if="challenge" class="challenge">
          <p>请把下面指令私聊发送给对应机器人：</p>
          <div class="command-row">
            <input :value="challenge.command" readonly @focus="$event.target.select()" />
            <button type="button" @click="copyCommand">复制</button>
          </div>
          <p class="muted">有效至 {{ formatTime(challenge.expiresAt) }}。发送成功后点击刷新。</p>
        </div>
      </template>
      <div v-if="!status.bindings.length && status.available" class="empty muted">还没有绑定 QQ 或微信身份。</div>
      <ul v-else class="binding-list">
        <li v-for="item in status.bindings" :key="item.id">
          <div>
            <strong>{{ item.maskedIdentity }}</strong>
            <span class="muted">{{ item.platform === 'QQ' ? 'QQ' : '微信' }} · {{ formatTime(item.boundAt) }}</span>
          </div>
          <div class="capabilities">
            <label><input type="checkbox" :checked="item.todoEditEnabled" :disabled="busy" @change="update(item, 'todoEditEnabled', $event.target.checked)" /> Todo 操作</label>
            <label><input type="checkbox" :checked="item.todoNotifyEnabled" :disabled="busy" @change="update(item, 'todoNotifyEnabled', $event.target.checked)" /> Todo 提醒</label>
            <button type="button" :disabled="busy" @click="unbind(item)">解绑</button>
          </div>
        </li>
      </ul>
    </template>
  </section>
</template>

<script setup>
import { onBeforeUnmount, ref, watch } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import { createContactBindingsApi } from '../../services/contactBindingsApi';

const auth = useAuthSession();
const status = ref(null), loading = ref(false), busy = ref(false), error = ref(''), hint = ref('');
const platform = ref('QQ'), challenge = ref(null), cooldown = ref(0);
let api, timer, tick;
const message = e => String(e?.detail || e?.message || '操作失败，请稍后重试');

async function load() {
  if (!api || loading.value || busy.value) return;
  loading.value = true; error.value = '';
  try { status.value = await api.status(); } catch (e) { error.value = message(e); }
  finally { loading.value = false; }
}
async function generate() {
  if (!api || busy.value) return;
  busy.value = true; error.value = ''; hint.value = '';
  try {
    challenge.value = await api.challenge(platform.value);
    cooldown.value = 30;
  } catch (e) { error.value = message(e); }
  finally { busy.value = false; }
}
async function update(item, key, value) {
  if (!api || busy.value) return;
  const next = { todoEditEnabled: item.todoEditEnabled, todoNotifyEnabled: item.todoNotifyEnabled, [key]: value };
  busy.value = true; error.value = '';
  try { await api.updateCapabilities(item.id, next); item[key] = value; hint.value = 'Todo 权限已更新。'; }
  catch (e) { error.value = message(e); }
  finally { busy.value = false; }
}
async function unbind(item) {
  if (!api || busy.value || !window.confirm(`确定解绑 ${item.maskedIdentity} 吗？`)) return;
  busy.value = true; error.value = '';
  try {
    await api.unbind(item.id);
    status.value.bindings = status.value.bindings.filter(binding => binding.id !== item.id);
    hint.value = '绑定已解除。';
  }
  catch (e) { error.value = message(e); }
  finally { busy.value = false; }
}
async function copyCommand() {
  try { await navigator.clipboard.writeText(challenge.value.command); hint.value = '指令已复制。'; }
  catch { hint.value = '复制失败，请手动选择指令。'; }
}
function formatTime(value) {
  const date = new Date(value);
  return Number.isNaN(date.getTime()) ? '时间未知' : new Intl.DateTimeFormat('zh-CN', {
    timeZone: 'Asia/Shanghai', month: 'numeric', day: 'numeric', hour: '2-digit', minute: '2-digit'
  }).format(date);
}
watch(() => auth.isAuthenticated.value ? auth.user.value?.userId : null, userId => {
  clearInterval(tick); clearTimeout(timer);
  api = userId ? createContactBindingsApi(auth.authorizedFetch, userId) : null;
  status.value = null; challenge.value = null; cooldown.value = 0;
  if (api) { load(); tick = setInterval(() => { if (cooldown.value > 0) cooldown.value--; }, 1000); }
}, { immediate: true });
onBeforeUnmount(() => { clearInterval(tick); clearTimeout(timer); });
</script>

<style scoped>
.contact-bindings-panel { color: var(--theme-text-primary); font-size: 14px; line-height: 1.6; }
.panel-heading, .add-row, .command-row, .capabilities { display: flex; align-items: center; gap: 12px; flex-wrap: wrap; }
h3 { margin: 0 0 4px; font-size: 17px; }
.muted { color: var(--theme-text-secondary); font-size: 13px; }
.notice, .challenge { margin: 16px 0; padding: 14px; border-block: 1px solid var(--theme-border); }
.add-row { margin: 18px 0; }
select, button, input { font: inherit; min-height: 40px; }
select, button { padding: 7px 12px; border: 1px solid var(--theme-border); border-radius: 8px; background: var(--accent-mode-fill-soft); color: inherit; }
button { cursor: pointer; }
button:disabled { opacity: .55; cursor: default; }
.command-row input { flex: 1; min-width: 220px; padding: 10px; border: 1px solid var(--theme-border); border-radius: 8px; background: var(--theme-surface-soft); color: inherit; font-family: monospace; }
.binding-list { list-style: none; padding: 0; margin: 18px 0 0; }
.binding-list li { display: flex; justify-content: space-between; gap: 16px; padding: 14px 0; border-top: 1px solid var(--theme-border); }
.binding-list li > div:first-child { display: grid; gap: 3px; }
.capabilities label { display: inline-flex; align-items: center; gap: 5px; font-size: 13px; }
input[type=checkbox] { accent-color: var(--accent-hex); }
.error { color: var(--theme-danger, #b4233c); }
@media (max-width: 650px) { .binding-list li { display: grid; } .capabilities { align-items: start; } .command-row { align-items: stretch; flex-direction: column; } }
</style>
