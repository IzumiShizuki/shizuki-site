<template>
  <transition name="dialog-fade">
    <div v-if="visible" class="adm-dialog-mask danger-mask" @click.self="$emit('close')">
      <section class="adm-dialog danger-dialog" @click.stop>
        <h3>删除分组（危险操作）</h3>
        <p>
          你将删除分组 <strong>{{ groupCode }}</strong>（{{ groupName || '-' }}），并级联清理用户归属、权限、配额与 ACL。
        </p>
        <label class="adm-label" for="danger-confirm-text">确认文本（输入 DELETE）</label>
        <input
          id="danger-confirm-text"
          :value="confirmText"
          class="adm-input"
          type="text"
          autocomplete="off"
          placeholder="请输入 DELETE"
          @input="$emit('update:confirmText', $event.target.value)"
        />

        <label class="adm-label" for="danger-privilege-code">管理员秘钥</label>
        <input
          id="danger-privilege-code"
          :value="privilegeCode"
          class="adm-input"
          type="password"
          autocomplete="off"
          placeholder="请输入管理员秘钥"
          @input="$emit('update:privilegeCode', $event.target.value)"
          @keyup.enter="$emit('confirm')"
        />

        <p v-if="error" class="adm-error">{{ error }}</p>
        <div class="adm-toolbar dialog-actions">
          <button class="adm-btn adm-btn--ghost ripple-trigger" type="button" :disabled="submitting" @click="$emit('close')">取消</button>
          <button class="adm-btn adm-btn--danger ripple-trigger" type="button" :disabled="submitting || !canSubmit" @click="$emit('confirm')">
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
.danger-mask {
  z-index: 1400;
}

.danger-dialog {
  width: min(560px, 100%);
  border-color: rgba(var(--adm-danger-rgb, 225, 83, 97), 0.5);
}

.danger-dialog strong {
  color: var(--adm-danger-text, rgba(255, 179, 192, 0.96));
}

.dialog-actions {
  justify-content: flex-end;
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
