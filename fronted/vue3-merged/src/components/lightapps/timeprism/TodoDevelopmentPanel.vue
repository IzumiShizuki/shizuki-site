<template>
  <section class="todo-dev-panel" aria-label="研发详情">
    <header class="todo-dev-header">
      <strong>研发详情</strong>
      <button type="button" :disabled="busy" @click="load">刷新研发进度</button>
    </header>
    <p v-if="error" class="todo-dev-error" role="alert">{{ error }}</p>
    <p v-if="loading" role="status">加载研发进度…</p>

    <form v-else-if="loaded && !context && !error" class="todo-dev-enable" @submit.prevent="enable">
      <template v-if="projectId">
        <label>
          代码仓库
          <input v-model.trim="repository" placeholder="owner/repository" maxlength="201" required />
        </label>
        <label class="todo-dev-checkbox">
          <input v-model="skipResearch" type="checkbox" />
          跳过调研，从方案设计开始
        </label>
        <button type="submit" :disabled="busy || !validRepository">启用研发模式</button>
      </template>
      <p v-else>请先编辑待办，将其分配到一个项目。</p>
    </form>

    <template v-if="context">
      <dl class="todo-dev-facts">
        <dt>仓库</dt><dd>{{ context.repository }}</dd>
        <dt>阶段</dt><dd>{{ stageLabel(context.stage) }} · {{ statusLabel(context.status) }}</dd>
        <dt v-if="context.next_step">下一步</dt><dd v-if="context.next_step">{{ context.next_step }}</dd>
        <dt v-if="context.required_artifact">阶段交付物</dt>
        <dd v-if="context.required_artifact">{{ artifactLabel(context.required_artifact) }}</dd>
        <dt v-if="context.skill_ids?.length">阶段 Skills</dt>
        <dd v-if="context.skill_ids?.length">{{ context.skill_ids.join('、') }}</dd>
      </dl>

      <div v-if="context.status === 'AWAITING_APPROVAL'" class="todo-dev-review">
        <p>{{ context.stage === 'VERIFICATION' ? '确认后将研发流程标记为完成。' : '确认后将进入下一研发阶段。' }}</p>
        <button type="button" :disabled="busy || !loaded" @click="approve">通过{{ stageLabel(context.stage) }}</button>
      </div>

      <div v-if="context.events?.length" class="todo-dev-history">
        <h5>阶段记录</h5>
        <ol>
          <li v-for="(entry, index) in context.events" :key="entry.event_id ?? index">
            <small>{{ stageLabel(entry.stage) }} · {{ eventLabel(entry.event_type) }}<template v-if="entry.source"> · {{ sourceLabel(entry.source) }}</template><template v-if="entry.created_at"> · {{ entry.created_at.replace('T', ' ') }} UTC</template></small>
            <p v-if="entry.summary">{{ entry.summary }}</p>
            <ul v-if="entry.artifacts?.length">
              <li v-for="(artifact, artifactIndex) in entry.artifacts" :key="artifactIndex">
                <a v-if="safeLink(artifact.url)" :href="safeLink(artifact.url)" target="_blank" rel="noopener noreferrer">
                  {{ artifact.kind || '交付物' }}：{{ artifact.url }}
                </a>
                <span v-else>{{ artifact.kind || '交付物' }}：{{ artifact.url }}</span>
              </li>
            </ul>
          </li>
        </ol>
      </div>
    </template>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import {
  approveTodoDevelopment,
  enableTodoDevelopment,
  readTodoDevelopment,
  TODO_DEV_STAGES,
  TODO_DEV_STATUSES
} from '../../../services/todoDevelopmentApi';

const props = defineProps({
  todoId: { type: [Number, String], required: true },
  projectId: { type: [Number, String], default: null },
  authorizedFetch: { type: Function, required: true }
});
const emit = defineEmits(['updated']);
const repository = ref('');
const skipResearch = ref(false);
const loading = ref(false);
const submitting = ref(false);
const loaded = ref(false);
const error = ref('');
const context = ref(null);
const pendingApproval = ref(null);
let active = true;

const busy = computed(() => loading.value || submitting.value);
const validRepository = computed(() => /^[a-z0-9][a-z0-9_.-]{0,99}\/[a-z0-9][a-z0-9_.-]{0,99}$/i.test(repository.value));

const eventLabels = {
  ENABLE: '已启用',
  PROGRESS: '进展',
  SUBMIT: '提交成果',
  APPROVE: '已确认'
};

const artifactLabels = {
  research: '调研结论',
  design: '设计方案',
  implementation: '实现记录',
  verification: '测试证据'
};

function artifactLabel(value) {
  return Object.hasOwn(artifactLabels, value) ? artifactLabels[value] : value;
}

function sourceLabel(value) {
  if (value === 'WEB') return '网站';
  if (value === 'MCP') return 'MCP';
  return value;
}

function stageLabel(value) {
  return TODO_DEV_STAGES[value] || value;
}

function statusLabel(value) {
  return TODO_DEV_STATUSES[value] || value;
}

function eventLabel(value) {
  return Object.hasOwn(eventLabels, value) ? eventLabels[value] : value;
}

function safeLink(value) {
  if (typeof value !== 'string') return '';
  try {
    const parsed = new URL(value);
    return ['http:', 'https:'].includes(parsed.protocol) && !parsed.username && !parsed.password ? parsed.href : '';
  } catch {
    return '';
  }
}

function applyContext(value) {
  context.value = value;
  if (pendingApproval.value?.expected_version !== value?.version) pendingApproval.value = null;
  emit('updated', props.todoId, value);
}

async function load() {
  if (busy.value) return;
  loading.value = true;
  loaded.value = false;
  error.value = '';
  try {
    const value = await readTodoDevelopment(props.todoId, props.authorizedFetch);
    if (!active) return;
    applyContext(value);
    loaded.value = true;
  } catch {
    error.value = '无法读取研发进度，请刷新重试。';
  } finally {
    loading.value = false;
  }
}

async function enable() {
  if (busy.value || !loaded.value || context.value || !props.projectId || !validRepository.value) return;
  submitting.value = true;
  error.value = '';
  try {
    const value = await enableTodoDevelopment(props.todoId, {
      repository: repository.value,
      skip_research: skipResearch.value
    }, props.authorizedFetch);
    if (active) applyContext(value);
  } catch (failure) {
    if (failure?.status === 409 && active) {
      submitting.value = false;
      await load();
    } else {
      // A lost response can mean the server already applied the write; read before retrying.
      loaded.value = false;
      error.value = '未能确认启用结果，请刷新后再操作。';
    }
  } finally {
    submitting.value = false;
  }
}

async function approve() {
  if (busy.value || !loaded.value || context.value?.status !== 'AWAITING_APPROVAL') return;
  submitting.value = true;
  error.value = '';
  try {
    if (!pendingApproval.value) {
      pendingApproval.value = {
        expected_version: context.value.version,
        request_id: globalThis.crypto.randomUUID()
      };
    }
    const value = await approveTodoDevelopment(props.todoId, pendingApproval.value, props.authorizedFetch);
    if (active) applyContext(value);
  } catch (failure) {
    if (failure?.status === 409 && active) {
      submitting.value = false;
      await load();
      if (loaded.value) error.value = '进度已刷新。请检查最新成果后，再决定是否通过。';
    } else {
      loaded.value = false;
      error.value = '未能确认审批结果，请刷新后再操作。';
    }
  } finally {
    submitting.value = false;
  }
}

onMounted(load);
onBeforeUnmount(() => { active = false; });
</script>

<style scoped>
.todo-dev-panel {
  display: grid;
  gap: 10px;
  min-width: 0;
  padding: 10px 0 2px;
  border-top: 1px solid var(--la-border);
  overflow-wrap: anywhere;
  font-size: 13px;
}

.todo-dev-panel p,
.todo-dev-panel h5 {
  margin: 0;
}

.todo-dev-header,
.todo-dev-enable,
.todo-dev-review {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px 12px;
}

.todo-dev-header {
  justify-content: space-between;
}

.todo-dev-panel button,
.todo-dev-enable input:not([type='checkbox']) {
  padding: 5px 9px;
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  border-radius: 8px;
  color: var(--la-text);
  font: inherit;
}

.todo-dev-panel button:disabled {
  opacity: 0.6;
}

.todo-dev-enable label {
  display: inline-flex;
  align-items: center;
  flex-wrap: wrap;
  gap: 6px;
}

.todo-dev-enable input:not([type='checkbox']) {
  max-width: 100%;
}

.todo-dev-facts {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 5px 12px;
  margin: 0;
}

.todo-dev-facts dd {
  margin: 0;
  white-space: pre-wrap;
}

.todo-dev-facts dt,
.todo-dev-history small {
  color: var(--la-muted);
}

.todo-dev-history ol,
.todo-dev-history ul {
  margin: 4px 0 0;
  padding-inline-start: 20px;
}

.todo-dev-history li + li {
  margin-top: 5px;
}

.todo-dev-error {
  color: var(--la-danger);
}
</style>
