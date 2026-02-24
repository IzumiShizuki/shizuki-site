<template>
  <transition name="dialog-fade">
    <div v-if="visible" class="dialog-mask" @click.self="$emit('close')">
      <section class="dialog-shell liquid-material" @click.stop>
        <h3>删除分组（危险操作）</h3>
        <p class="helper-text">
          你将删除分组 <strong>{{ groupCode }}</strong>（{{ groupName || '-' }}），并级联清理用户归属、权限、配额与 ACL。
        </p>
        <label class="field-label" for="danger-confirm-text">确认文本（输入 DELETE）</label>
        <input
          id="danger-confirm-text"
          :value="confirmText"
          class="field-input"
          type="text"
          autocomplete="off"
          placeholder="请输入 DELETE"
          @input="$emit('update:confirmText', $event.target.value)"
        />

        <label class="field-label" for="danger-privilege-code">管理员秘钥</label>
        <input
          id="danger-privilege-code"
          :value="privilegeCode"
          class="field-input"
          type="password"
          autocomplete="off"
          placeholder="请输入管理员秘钥"
          @input="$emit('update:privilegeCode', $event.target.value)"
          @keyup.enter="$emit('confirm')"
        />

        <p v-if="error" class="error-text">{{ error }}</p>
        <div class="inline-actions">
          <button class="ghost-btn ripple-trigger" type="button" :disabled="submitting" @click="$emit('close')">取消</button>
          <button class="danger-btn ripple-trigger" type="button" :disabled="submitting || !canSubmit" @click="$emit('confirm')">
            {{ submitting ? '删除中...' : '确认删除' }}
          </button>
        </div>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  visible: { type: Boolean, default: false },
  groupCode: { type: String, default: '' },
  groupName: { type: String, default: '' },
  privilegeCode: { type: String, default: '' },
  confirmText: { type: String, default: '' },
  submitting: { type: Boolean, default: false },
  error: { type: String, default: '' }
});

defineEmits(['close', 'confirm', 'update:privilegeCode', 'update:confirmText']);

const canSubmit = computed(() => props.confirmText === 'DELETE' && String(props.privilegeCode || '').trim().length > 0);
</script>

<style scoped>
.dialog-mask {
  position: fixed;
  inset: 0;
  z-index: 1400;
  display: grid;
  place-items: center;
  background: rgba(6, 10, 20, 0.54);
  backdrop-filter: blur(5px);
  padding: 12px;
}

.dialog-shell {
  --liquid-bg: rgba(18, 24, 36, 0.78);
  --liquid-border: rgba(255, 255, 255, 0.24);
  --liquid-shadow: 0 22px 48px rgba(0, 0, 0, 0.35);
  width: min(560px, 100%);
  border-radius: 14px;
  padding: 16px;
  display: grid;
  gap: 10px;
}

.dialog-shell h3 {
  font-size: 20px;
}

.helper-text {
  color: rgba(223, 230, 249, 0.9);
}

.field-label {
  font-size: 12px;
  color: rgba(218, 229, 247, 0.88);
}

.field-input {
  border: 0;
  border-radius: 10px;
  min-height: 38px;
  padding: 0 12px;
  background: rgba(8, 14, 24, 0.56);
  color: rgba(237, 245, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(165, 186, 223, 0.22);
}

.inline-actions {
  display: flex;
  gap: 8px;
  justify-content: flex-end;
}

.ghost-btn,
.danger-btn {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 14px;
  color: rgba(242, 247, 255, 0.94);
}

.ghost-btn {
  background: rgba(255, 255, 255, 0.18);
}

.danger-btn {
  background: rgba(252, 96, 130, 0.34);
}

.error-text {
  color: rgba(255, 188, 206, 0.96);
}

.dialog-fade-enter-active,
.dialog-fade-leave-active {
  transition: opacity 0.2s ease;
}

.dialog-fade-enter-from,
.dialog-fade-leave-to {
  opacity: 0;
}
</style>
