<template>
  <section ref="panel" class="account-closure" aria-label="账号注销">
    <button v-if="!expanded" class="closure-link" type="button" @click="open">注销账号</button>
    <form v-else class="closure-form" :aria-busy="submitting" @submit.prevent="submit">
      <h4>注销当前账号</h4>
      <p>注销后无法恢复。账号资料、登录凭据和第三方绑定将被删除，所有设备都会退出登录。</p>
      <p>已发布的内容和历史记录仍会保留，账号身份将显示为“已注销用户”。</p>
      <label :for="inputId">请输入“注销账号”确认</label>
      <input :id="inputId" ref="confirmationInput" v-model="confirmation" type="text"
        autocomplete="off" :disabled="submitting" required />
      <p v-if="error" class="closure-error" role="alert">{{ error }}</p>
      <div class="closure-actions">
        <button type="button" :disabled="submitting" @click="cancel">取消</button>
        <button class="closure-submit" type="submit" :disabled="submitting || confirmation !== '注销账号'">
          {{ submitting ? '正在注销…' : '确认注销账号' }}
        </button>
      </div>
    </form>
  </section>
</template>

<script setup>
import { nextTick, ref, useId } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';

const emit = defineEmits(['closed']);
const auth = useAuthSession();
const inputId = `account-closure-${useId()}`;
const expanded = ref(false);
const confirmation = ref('');
const confirmationInput = ref(null);
const panel = ref(null);
const submitting = ref(false);
const error = ref('');

async function open() {
  expanded.value = true;
  await nextTick();
  confirmationInput.value?.focus({ preventScroll: true });
  panel.value?.scrollIntoView?.({ block: 'start' });
}

function cancel() {
  expanded.value = false;
  confirmation.value = '';
  error.value = '';
}

async function submit() {
  if (submitting.value || confirmation.value !== '注销账号') return;
  submitting.value = true;
  error.value = '';
  try {
    await auth.closeAccount(confirmation.value);
    emit('closed');
  } catch (failure) {
    error.value = String(failure?.detail || failure?.message || '注销失败，请稍后重试');
  } finally {
    submitting.value = false;
  }
}
</script>

<style scoped>
.account-closure { margin-top: 24px; color: var(--theme-text-primary, #f6e5de); }
.closure-form { display: grid; gap: 12px; max-width: 64ch; }
.closure-form h4, .closure-form p { margin: 0; }
.closure-form p { line-height: 1.65; }
.closure-form h4 { font-size: 1rem; }
.closure-form input, .account-closure button {
  min-height: 44px; border: 1px solid var(--theme-border-strong, #9e7c70);
  border-radius: 10px; padding: 10px 14px; font: inherit; color: inherit;
  background: var(--theme-input-surface, rgba(24, 14, 12, 0.45));
}
.closure-form input { width: 100%; box-sizing: border-box; }
.account-closure button { cursor: pointer; }
.closure-actions { display: flex; flex-wrap: wrap; gap: 10px; }
.account-closure .closure-link { background: transparent; }
.account-closure .closure-submit { background: #a52d35; border-color: #a52d35; color: #fff; }
.closure-error { color: var(--theme-danger, #ffb9bf); }
.account-closure button:disabled { opacity: 0.5; cursor: not-allowed; }
.account-closure button:enabled:hover { filter: brightness(1.12); }
.account-closure :is(button, input):focus-visible { outline: 2px solid var(--theme-accent, #f2b39d); outline-offset: 3px; }
</style>
