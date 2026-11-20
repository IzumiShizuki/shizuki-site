<template>
  <section class="local-note" aria-label="本机 Obsidian 笔记">
    <strong>Obsidian 笔记</strong>
    <p v-if="!link">这台设备还没有关联笔记。可从 Obsidian 复制笔记链接后粘贴到这里。</p>
    <div class="actions">
      <a v-if="link" :href="link">打开本机笔记 ↗</a>
      <button type="button" @click="edit">{{ link ? '替换关联' : '关联笔记' }}</button>
      <button v-if="link" type="button" @click="save('')">解除关联</button>
      <button type="button" @click="copy">复制返回 Todo 的 Markdown</button>
    </div>
    <form v-if="editing" @submit.prevent="attach">
      <label>笔记链接 <input v-model.trim="draft" required placeholder="obsidian://open?vault=…&amp;file=…" /></label>
      <button>保存</button><button type="button" @click="editing=false">取消</button>
    </form>
    <p v-if="feedback" role="status">{{ feedback }}</p>
    <textarea v-if="manualCopy" :value="manualCopy" readonly aria-label="手动复制返回链接" />
  </section>
</template>
<script setup>
import { computed, ref, watch } from 'vue';
import { noteUrl, returnMarkdown } from './todoRunBoard';
const props = defineProps({ accountId:String, todoId:String, title:String });
const key = computed(() => props.accountId && props.todoId ? 'todo-note:v1:' + encodeURIComponent(props.accountId) + ':' + props.todoId : '');
const link = ref(''), draft = ref(''), feedback = ref(''), manualCopy = ref(''), editing = ref(false);
watch(key, k => {
  link.value = draft.value = feedback.value = manualCopy.value = ''; editing.value = false;
  try { if (k) link.value = noteUrl(localStorage.getItem(k)); }
  catch { feedback.value = '浏览器未允许使用本机存储。'; }
}, { immediate:true, flush:'sync' });
function edit() { draft.value = link.value; feedback.value = ''; editing.value = true; }
function attach() {
  const value = noteUrl(draft.value);
  if (!value) { feedback.value = '请使用含 vault 和相对 file 的 Obsidian 打开链接。'; return; }
  save(value);
}
function save(value) {
  if (!key.value) return;
  try {
    if (value) localStorage.setItem(key.value, value); else localStorage.removeItem(key.value);
    link.value = value; editing.value = false; feedback.value = value ? '已在这台设备保存。' : '已解除关联。';
  } catch { feedback.value = '本机存储不可用，未保存。'; }
}
async function copy() {
  const text = returnMarkdown(props.title, props.todoId, window.location);
  manualCopy.value = '';
  if (!text) { feedback.value = '请从网站打开任务并复制返回链接。'; return; }
  try { await navigator.clipboard.writeText(text); feedback.value = '返回链接已复制。'; }
  catch { manualCopy.value = text; feedback.value = '请手动复制下方链接。'; }
}
</script>
<style scoped>
.local-note { display:grid; gap:8px; border-top:1px solid var(--la-border,#cbd5e1); padding-top:12px; }
p { margin:0; } .actions,form { display:flex; flex-wrap:wrap; align-items:center; gap:7px; }
input,textarea { max-width:100%; } a { font-weight:600; }
button { font:inherit; color:inherit; background:var(--la-btn-bg,transparent); border:1px solid var(--la-border,#cbd5e1); border-radius:7px; padding:5px 9px; }
</style>
