<template>
  <section class="lightapp-window pomodoro-window">
    <LightAppTopToolbar :window-id="props.windowId">
      <div class="toolbar-switches with-divider" role="tablist" aria-label="Pomodoro modes">
        <button
          v-for="item in POMODORO_MODE_ITEMS"
          :key="`pomodoro_mode_${item.mode}`"
          class="icon-action-btn toolbar-tab-btn ripple-trigger"
          :class="{ 'is-active': mode === item.mode }"
          type="button"
          role="tab"
          :aria-selected="mode === item.mode"
          :title="item.label"
          :aria-label="item.label"
          @click="switchMode(item.mode)"
        >
          <i :class="item.iconClass" aria-hidden="true"></i>
        </button>
      </div>

      <div class="template-toolbar">
        <label class="template-picker">
          <span>模板</span>
          <select v-model.number="activeTemplateId">
            <option v-for="item in templates" :key="item.pomodoroId" :value="item.pomodoroId">
              {{ item.title }}
            </option>
          </select>
        </label>
        <div class="template-actions">
          <button class="icon-action-btn ripple-trigger" type="button" title="添加番茄钟" aria-label="添加番茄钟" @click="openCreateForm">
            <i class="fas fa-plus" aria-hidden="true"></i>
          </button>
          <button
            class="icon-action-btn ripple-trigger"
            type="button"
            title="编辑当前模板"
            aria-label="编辑当前模板"
            :disabled="!currentTemplate"
            @click="openEditForm"
          >
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
          <button
            class="icon-action-btn ripple-trigger danger"
            type="button"
            title="删除当前模板"
            aria-label="删除当前模板"
            :disabled="!currentTemplate || templates.length <= 1 || saving"
            @click="removeTemplate"
          >
            <i class="fas fa-trash" aria-hidden="true"></i>
          </button>
        </div>
      </div>
    </LightAppTopToolbar>

    <Transition name="panel-collapse">
      <form v-if="showForm" class="template-form liquid-material" @submit.prevent="submitTemplate">
        <div class="form-grid">
          <label>
            标题
            <input v-model.trim="draft.title" type="text" maxlength="120" placeholder="例如：考试冲刺" />
          </label>
          <label>
            专注(分钟)
            <input v-model.number="draft.focusMinutes" type="number" min="5" max="120" />
          </label>
          <label>
            短休息(分钟)
            <input v-model.number="draft.shortBreakMinutes" type="number" min="1" max="60" />
          </label>
          <label>
            长休息(分钟)
            <input v-model.number="draft.longBreakMinutes" type="number" min="5" max="90" />
          </label>
          <label>
            长休息间隔(轮)
            <input v-model.number="draft.longBreakEvery" type="number" min="2" max="12" />
          </label>
          <label class="check-row">
            <input v-model="draft.autoStartNext" type="checkbox" />
            <span>自动开始下一段</span>
          </label>
        </div>

        <div class="ringtone-block">
          <div class="ringtone-row">
            <label>
              铃声类型
              <select v-model="draft.ringtoneType">
                <option value="BUILTIN">内置铃声</option>
                <option value="UPLOAD">上传 MP3</option>
              </select>
            </label>
            <label v-if="draft.ringtoneType === 'BUILTIN'">
              内置铃声
              <select v-model="draft.ringtoneCode">
                <option v-for="item in BUILTIN_RINGTONES" :key="item.code" :value="item.code">
                  {{ item.name }}
                </option>
              </select>
            </label>
            <div v-else class="upload-col">
              <button class="chip-btn ripple-trigger" type="button" :disabled="uploading" @click="triggerUpload">
                {{ uploading ? '上传中...' : auth.isAuthenticated.value ? '上传 MP3 到账户' : '上传 MP3（本会话）' }}
              </button>
              <input
                ref="uploadInputRef"
                type="file"
                class="hidden-input"
                accept="audio/mpeg,audio/mp3"
                @change="onUploadFileChange"
              />
              <small v-if="draft.ringtoneName" class="upload-name">当前：{{ draft.ringtoneName }}</small>
            </div>
          </div>

          <div class="source-links">
            <a
              v-for="item in RINGTONE_SOURCE_LINKS"
              :key="item.url"
              :href="item.url"
              target="_blank"
              rel="noopener noreferrer"
            >
              <strong>{{ item.name }}</strong>
              <span>{{ item.note }}</span>
            </a>
          </div>
        </div>

        <div class="form-actions">
          <button
            class="icon-action-btn ripple-trigger"
            type="submit"
            :title="saving ? '保存中' : editingTemplateId ? '更新模板' : '创建模板'"
            :aria-label="saving ? '保存中' : editingTemplateId ? '更新模板' : '创建模板'"
            :disabled="saving || !draft.title.trim()"
          >
            <i :class="saving ? 'fas fa-spinner fa-spin' : editingTemplateId ? 'fas fa-check' : 'fas fa-plus'" aria-hidden="true"></i>
          </button>
          <button class="icon-action-btn ripple-trigger" type="button" title="取消编辑" aria-label="取消编辑" :disabled="saving" @click="closeForm">
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
        </div>
      </form>
    </Transition>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>
    <p v-if="infoText" class="info-text">{{ infoText }}</p>

    <section class="timer-panel liquid-material">
      <p class="mode-label">{{ currentModeLabel }}</p>
      <p class="time-text">{{ formattedTime }}</p>
      <div class="progress-track" role="progressbar" :aria-valuenow="progressPercent" aria-valuemin="0" aria-valuemax="100">
        <span class="progress-fill" :style="{ width: `${progressPercent}%` }"></span>
      </div>
      <p class="sub-hint">{{ isRunning ? '进行中' : '已暂停' }}</p>
      <p class="template-hint">当前模板：{{ currentTemplate?.title || '-' }}</p>
    </section>

    <section class="control-row">
      <button class="icon-action-btn ripple-trigger" type="button" :title="isRunning ? '暂停' : '开始'" :aria-label="isRunning ? '暂停' : '开始'" @click="toggleRunning">
        <i :class="isRunning ? 'fas fa-pause' : 'fas fa-play'" aria-hidden="true"></i>
      </button>
      <button class="icon-action-btn ripple-trigger" type="button" title="重置" aria-label="重置" @click="resetCurrent">
        <i class="fas fa-rotate-left" aria-hidden="true"></i>
      </button>
      <button class="icon-action-btn ripple-trigger" type="button" title="下一段" aria-label="下一段" @click="skipCurrent">
        <i class="fas fa-forward-step" aria-hidden="true"></i>
      </button>
      <button v-if="isRinging" class="icon-action-btn ripple-trigger" type="button" title="停止铃声" aria-label="停止铃声" @click="stopRingtone">
        <i class="fas fa-volume-xmark" aria-hidden="true"></i>
      </button>
    </section>

    <section class="stats-row">
      <p>今日完成专注：{{ todayFocusCount }} 次</p>
      <p>下一次长休息剩余：{{ nextLongBreakIn }} 次专注</p>
    </section>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppPomodoro,
  deleteLightAppPomodoro,
  listLightAppPomodoros,
  updateLightAppPomodoro
} from '../../../services/lightAppsApi';
import {
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';
import {
  BUILTIN_RINGTONES,
  LEGACY_POMODORO_STORAGE_KEY,
  RINGTONE_SOURCE_LINKS,
  TEMP_RINGTONES_SESSION_KEY,
  createDefaultPomodoroTemplate,
  findBuiltinRingtone,
  migrateLegacyPomodoroState,
  nextLocalTemplateId,
  normalizePomodoroTemplate,
  normalizePomodoroTemplates,
  normalizeTempRingtoneMap,
  parseJsonObject
} from './pomodoroState';
import {
  POMODORO_MODE_ITEMS,
  POMODORO_MODE_FOCUS,
  POMODORO_MODE_LONG_BREAK,
  POMODORO_MODE_SHORT_BREAK,
  normalizePomodoroMode,
  registerPomodoroModeChangeHandler,
  resolvePomodoroWindowState
} from './pomodoroWindowState';
import LightAppTopToolbar from '../LightAppTopToolbar.vue';

const auth = useAuthSession();
const RUNTIME_KEY = 'shizuki.lightapps.pomodoro.runtime.v2';
const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const modeState = resolvePomodoroWindowState(props.windowId);

const templates = ref([]);
const activeTemplateId = ref(0);
const showForm = ref(false);
const editingTemplateId = ref(0);
const loading = ref(false);
const saving = ref(false);
const uploading = ref(false);
const errorText = ref('');
const infoText = ref('');
const uploadInputRef = ref(null);
const mode = computed({
  get() {
    return normalizePomodoroMode(modeState.mode);
  },
  set(value) {
    modeState.mode = normalizePomodoroMode(value);
  }
});
const remainingSeconds = ref(25 * 60);
const isRunning = ref(false);
const isRinging = ref(false);
const completedFocusRounds = ref(0);
const tempRingtones = ref({});

const stats = reactive({
  date: '',
  focusCount: 0
});

const draft = reactive({
  title: '',
  focusMinutes: 25,
  shortBreakMinutes: 5,
  longBreakMinutes: 15,
  longBreakEvery: 4,
  autoStartNext: false,
  ringtoneType: 'BUILTIN',
  ringtoneName: '',
  ringtoneCode: BUILTIN_RINGTONES[0]?.code || 'soft-bell',
  ringtoneAssetId: null
});

const downloadUrlCache = new Map();
let timerId = 0;
let ringAudio = null;

function unwrapApi(response) {
  if (response && typeof response === 'object' && Object.prototype.hasOwnProperty.call(response, 'data')) {
    return response.data;
  }
  return response;
}

function clampNumber(value, min, max, fallback) {
  const normalized = Number(value);
  if (!Number.isFinite(normalized)) return fallback;
  if (normalized < min) return min;
  if (normalized > max) return max;
  return Math.round(normalized);
}

function sanitizeAudioFileName(raw) {
  const source = String(raw || '').trim();
  if (!source) return 'pomodoro-ringtone.mp3';
  const lowered = source.toLowerCase();
  const ext = lowered.endsWith('.mp3') ? '.mp3' : '.mp3';
  const base = lowered
    .replace(/\.[a-z0-9]+$/, '')
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
  return `${base || 'pomodoro-ringtone'}${ext}`;
}

function todayKey() {
  return new Date().toISOString().slice(0, 10);
}

function ensureTodayStats() {
  const key = todayKey();
  if (stats.date !== key) {
    stats.date = key;
    stats.focusCount = 0;
  }
}

function currentTemplateOrDefault() {
  return currentTemplate.value || createDefaultPomodoroTemplate(1);
}

function durationByMode(targetMode) {
  const template = currentTemplateOrDefault();
  if (targetMode === POMODORO_MODE_SHORT_BREAK) return template.shortBreakMinutes * 60;
  if (targetMode === POMODORO_MODE_LONG_BREAK) return template.longBreakMinutes * 60;
  return template.focusMinutes * 60;
}

function formatTime(seconds) {
  const safe = Math.max(0, Number(seconds) || 0);
  const mins = Math.floor(safe / 60);
  const secs = safe % 60;
  return `${String(mins).padStart(2, '0')}:${String(secs).padStart(2, '0')}`;
}

function currentModeLabelFrom(targetMode) {
  if (targetMode === POMODORO_MODE_SHORT_BREAK) return '短休息';
  if (targetMode === POMODORO_MODE_LONG_BREAK) return '长休息';
  return '专注时间';
}

function stopTimer() {
  if (timerId) {
    window.clearInterval(timerId);
    timerId = 0;
  }
  isRunning.value = false;
}

function persistRuntime() {
  if (typeof window === 'undefined') return;
  try {
    window.localStorage.setItem(
      RUNTIME_KEY,
      JSON.stringify({
        date: stats.date,
        focusCount: stats.focusCount,
        completedFocusRounds: completedFocusRounds.value,
        activeTemplateId: activeTemplateId.value,
        mode: mode.value
      })
    );
  } catch {
    // ignore
  }
}

function loadRuntime() {
  ensureTodayStats();
  if (typeof window === 'undefined') return;
  const parsed = parseJsonObject(window.localStorage.getItem(RUNTIME_KEY));
  if (!parsed) return;
  if (parsed.date === todayKey()) {
    stats.date = parsed.date;
    stats.focusCount = clampNumber(parsed.focusCount, 0, 9999, 0);
  }
  completedFocusRounds.value = clampNumber(parsed.completedFocusRounds, 0, 9999, 0);
  const savedMode = String(parsed.mode || '').trim();
  mode.value = normalizePomodoroMode(savedMode);
}

function loadTempRingtones() {
  if (typeof window === 'undefined') return;
  const parsed = parseJsonObject(window.sessionStorage.getItem(TEMP_RINGTONES_SESSION_KEY));
  tempRingtones.value = normalizeTempRingtoneMap(parsed);
}

function persistTempRingtones() {
  if (typeof window === 'undefined') return true;
  try {
    window.sessionStorage.setItem(TEMP_RINGTONES_SESSION_KEY, JSON.stringify(tempRingtones.value));
    return true;
  } catch {
    return false;
  }
}

function syncDraftFromTemplate(template) {
  const normalized = normalizePomodoroTemplate(template, 0);
  draft.title = normalized.title;
  draft.focusMinutes = normalized.focusMinutes;
  draft.shortBreakMinutes = normalized.shortBreakMinutes;
  draft.longBreakMinutes = normalized.longBreakMinutes;
  draft.longBreakEvery = normalized.longBreakEvery;
  draft.autoStartNext = normalized.autoStartNext;
  draft.ringtoneType = normalized.ringtoneType;
  draft.ringtoneName = normalized.ringtoneName;
  draft.ringtoneCode = normalized.ringtoneCode;
  draft.ringtoneAssetId = normalized.ringtoneAssetId;
}

function resetDraftToDefault() {
  syncDraftFromTemplate(createDefaultPomodoroTemplate(0));
}

function closeForm() {
  showForm.value = false;
  editingTemplateId.value = 0;
  resetDraftToDefault();
}

function openCreateForm() {
  editingTemplateId.value = 0;
  if (currentTemplate.value) {
    syncDraftFromTemplate(currentTemplate.value);
    draft.title = `${currentTemplate.value.title}-副本`;
  } else {
    resetDraftToDefault();
  }
  showForm.value = true;
}

function openEditForm() {
  if (!currentTemplate.value) return;
  editingTemplateId.value = currentTemplate.value.pomodoroId;
  syncDraftFromTemplate(currentTemplate.value);
  showForm.value = true;
}

function applyTemplates(nextList, preferredId = 0) {
  templates.value = normalizePomodoroTemplates(nextList);
  const preferred = Number(preferredId);
  const hasPreferred = templates.value.some((item) => item.pomodoroId === preferred);
  if (hasPreferred) {
    activeTemplateId.value = preferred;
  } else {
    activeTemplateId.value = templates.value[0]?.pomodoroId || 0;
  }
  if (!isRunning.value) {
    remainingSeconds.value = durationByMode(mode.value);
  }
  persistRuntime();
}

function clearLegacyStorage() {
  if (typeof window === 'undefined') return;
  try {
    window.localStorage.removeItem(LEGACY_POMODORO_STORAGE_KEY);
  } catch {
    // ignore
  }
}

function readLegacyTemplate(fallbackId) {
  if (typeof window === 'undefined') return null;
  const parsed = parseJsonObject(window.localStorage.getItem(LEGACY_POMODORO_STORAGE_KEY));
  return migrateLegacyPomodoroState(parsed, fallbackId);
}

async function hydrate() {
  errorText.value = '';
  infoText.value = '';
  loading.value = true;
  await auth.ensureReady();
  loadTempRingtones();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    let guestPomodoros = Array.isArray(guest.pomodoros) ? guest.pomodoros : [];
    if (!guestPomodoros.length) {
      const legacy = readLegacyTemplate(1);
      if (legacy) {
        guestPomodoros = [legacy];
        updateGuestLightAppData((current) => ({
          ...current,
          pomodoros: guestPomodoros
        }));
        clearLegacyStorage();
      }
    }

    applyTemplates(coerceMissingGuestUploadRingtones(guestPomodoros), activeTemplateId.value);
    loading.value = false;
    return;
  }

  try {
    let list = await listLightAppPomodoros(auth.authorizedFetch);
    if (!list.length) {
      const legacy = readLegacyTemplate(1);
      if (legacy) {
        await createLightAppPomodoro(buildPomodoroPayload(legacy), auth.authorizedFetch);
        list = await listLightAppPomodoros(auth.authorizedFetch);
        clearLegacyStorage();
        infoText.value = '已将旧版番茄钟设置迁移为模板。';
      }
    }
    if (!list.length) {
      await createLightAppPomodoro(buildPomodoroPayload(createDefaultPomodoroTemplate(1)), auth.authorizedFetch);
      list = await listLightAppPomodoros(auth.authorizedFetch);
    }

    applyTemplates(list, activeTemplateId.value);
    writeRemoteLightAppCache({ pomodoros: templates.value });
  } catch (error) {
    const cached = readRemoteLightAppCache();
    applyTemplates(cached.pomodoros || [], activeTemplateId.value);
    errorText.value = error?.message || '模板加载失败，已回退缓存。';
  } finally {
    loading.value = false;
  }
}

function persistGuestPomodoros(nextList, preferredId = 0) {
  const normalized = coerceMissingGuestUploadRingtones(nextList);
  applyTemplates(normalized, preferredId || normalized[0]?.pomodoroId || 0);
  updateGuestLightAppData((current) => ({
    ...current,
    pomodoros: normalized
  }));
}

function coerceMissingGuestUploadRingtones(nextList) {
  const normalized = normalizePomodoroTemplates(nextList);
  return normalized.map((item) => {
    if (item.ringtoneType !== 'UPLOAD') return item;
    const code = String(item.ringtoneCode || '').trim();
    if (item.ringtoneAssetId || (code && tempRingtones.value[code])) {
      return item;
    }
    const fallback = findBuiltinRingtone(BUILTIN_RINGTONES[0]?.code);
    return {
      ...item,
      ringtoneType: 'BUILTIN',
      ringtoneCode: fallback?.code || BUILTIN_RINGTONES[0]?.code || 'soft-bell',
      ringtoneName: fallback?.name || 'Built-in Bell',
      ringtoneAssetId: null
    };
  });
}

function buildPomodoroPayload(source = draft) {
  const normalized = normalizePomodoroTemplate(source, 0);
  return {
    title: normalized.title,
    focusMinutes: normalized.focusMinutes,
    shortBreakMinutes: normalized.shortBreakMinutes,
    longBreakMinutes: normalized.longBreakMinutes,
    longBreakEvery: normalized.longBreakEvery,
    autoStartNext: normalized.autoStartNext,
    ringtoneType: normalized.ringtoneType,
    ringtoneName: normalized.ringtoneName,
    ringtoneCode: normalized.ringtoneType === 'BUILTIN' ? normalized.ringtoneCode : null,
    ringtoneAssetId: normalized.ringtoneType === 'UPLOAD' ? normalized.ringtoneAssetId : null,
    sortNum: normalized.sortNum
  };
}

async function submitTemplate() {
  const title = String(draft.title || '').trim();
  if (!title) return;
  errorText.value = '';
  infoText.value = '';
  saving.value = true;

  try {
    await auth.ensureReady();
    const payload = buildPomodoroPayload(draft);

    if (payload.ringtoneType === 'UPLOAD') {
      if (auth.isAuthenticated.value && !payload.ringtoneAssetId) {
        throw new Error('请先上传 MP3 铃声');
      }
      if (!auth.isAuthenticated.value && !String(draft.ringtoneCode || '').trim()) {
        throw new Error('请先上传 MP3 铃声（游客仅本会话可用）');
      }
      payload.ringtoneCode = auth.isAuthenticated.value ? null : String(draft.ringtoneCode || '').trim();
    }

    if (auth.isAuthenticated.value) {
      if (editingTemplateId.value) {
        await updateLightAppPomodoro(editingTemplateId.value, payload, auth.authorizedFetch);
      } else {
        await createLightAppPomodoro(payload, auth.authorizedFetch);
      }
      const list = await listLightAppPomodoros(auth.authorizedFetch);
      applyTemplates(list, editingTemplateId.value || list[list.length - 1]?.pomodoroId || activeTemplateId.value);
      writeRemoteLightAppCache({ pomodoros: templates.value });
      closeForm();
      return;
    }

    const current = templates.value.slice();
    if (editingTemplateId.value) {
      const next = current.map((item) => {
        if (item.pomodoroId !== editingTemplateId.value) return item;
        return normalizePomodoroTemplate(
          {
            ...item,
            ...payload,
            ringtoneCode: payload.ringtoneType === 'UPLOAD' ? String(draft.ringtoneCode || '') : payload.ringtoneCode,
            ringtoneAssetId: payload.ringtoneType === 'UPLOAD' ? null : payload.ringtoneAssetId,
            updatedAt: new Date().toISOString()
          },
          item.pomodoroId
        );
      });
      persistGuestPomodoros(next, editingTemplateId.value);
      closeForm();
      return;
    }

    const newId = nextLocalTemplateId(current);
    const maxSort = current.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
    const created = normalizePomodoroTemplate(
      {
        ...payload,
        pomodoroId: newId,
        ringtoneCode: payload.ringtoneType === 'UPLOAD' ? String(draft.ringtoneCode || '') : payload.ringtoneCode,
        ringtoneAssetId: null,
        sortNum: maxSort + 10,
        updatedAt: new Date().toISOString()
      },
      newId
    );
    persistGuestPomodoros([...current, created], created.pomodoroId);
    closeForm();
  } catch (error) {
    errorText.value = error?.message || '模板保存失败';
  } finally {
    saving.value = false;
  }
}

async function removeTemplate() {
  if (!currentTemplate.value || templates.value.length <= 1) return;
  errorText.value = '';
  infoText.value = '';

  try {
    await auth.ensureReady();
    const targetId = currentTemplate.value.pomodoroId;

    if (auth.isAuthenticated.value) {
      await deleteLightAppPomodoro(targetId, auth.authorizedFetch);
      const list = await listLightAppPomodoros(auth.authorizedFetch);
      applyTemplates(list, list[0]?.pomodoroId || 0);
      writeRemoteLightAppCache({ pomodoros: templates.value });
      return;
    }

    const next = templates.value.filter((item) => item.pomodoroId !== targetId);
    persistGuestPomodoros(next, next[0]?.pomodoroId || 0);
  } catch (error) {
    errorText.value = error?.message || '删除模板失败';
  }
}

function switchMode(targetMode) {
  const normalizedMode = normalizePomodoroMode(targetMode);
  if (mode.value === normalizedMode) return;
  stopTimer();
  stopRingtone();
  mode.value = normalizedMode;
  remainingSeconds.value = durationByMode(normalizedMode);
  persistRuntime();
}

function startTimer() {
  if (isRunning.value) return;
  stopRingtone();
  isRunning.value = true;
  if (timerId) {
    window.clearInterval(timerId);
  }
  timerId = window.setInterval(tick, 1000);
}

function toggleRunning() {
  if (isRunning.value) {
    stopTimer();
    return;
  }
  startTimer();
}

function resetCurrent() {
  stopTimer();
  stopRingtone();
  remainingSeconds.value = durationByMode(mode.value);
}

function skipCurrent() {
  stopTimer();
  stopRingtone();
  moveToNextSegment(false);
}

function moveToNextSegment(countCompletedFocus) {
  if (countCompletedFocus && mode.value === POMODORO_MODE_FOCUS) {
    ensureTodayStats();
    stats.focusCount += 1;
    completedFocusRounds.value += 1;
  }

  const template = currentTemplateOrDefault();
  if (mode.value === POMODORO_MODE_FOCUS) {
    const needLongBreak = completedFocusRounds.value > 0 && completedFocusRounds.value % template.longBreakEvery === 0;
    mode.value = needLongBreak ? POMODORO_MODE_LONG_BREAK : POMODORO_MODE_SHORT_BREAK;
  } else {
    mode.value = POMODORO_MODE_FOCUS;
  }

  remainingSeconds.value = durationByMode(mode.value);
  persistRuntime();

  if (template.autoStartNext) {
    startTimer();
  }
}

async function tick() {
  if (remainingSeconds.value <= 1) {
    stopTimer();
    moveToNextSegment(true);
    await playRingtoneLoop();
    return;
  }
  remainingSeconds.value -= 1;
}

function ensureAudio() {
  if (ringAudio || typeof Audio === 'undefined') return ringAudio;
  ringAudio = new Audio();
  ringAudio.loop = true;
  ringAudio.preload = 'auto';
  return ringAudio;
}

function stopRingtone() {
  if (ringAudio) {
    ringAudio.pause();
    ringAudio.currentTime = 0;
  }
  isRinging.value = false;
}

async function resolveAssetDownloadUrl(assetId) {
  const normalizedId = Number(assetId);
  if (!Number.isInteger(normalizedId) || normalizedId <= 0) return '';

  const cached = downloadUrlCache.get(normalizedId);
  if (cached && cached.expireAt > Date.now() + 5000) {
    return cached.url;
  }

  const raw = unwrapApi(
    await auth.authorizedFetch(`/api/v1/assets/${encodeURIComponent(normalizedId)}/download-url`, {
      method: 'GET'
    })
  );
  const url = String(raw?.downloadUrl || raw?.download_url || raw?.publicUrl || raw?.public_url || '').trim();
  if (!url) return '';

  const expireSeconds = clampNumber(raw?.expireSeconds ?? raw?.expire_seconds, 30, 7200, 300);
  downloadUrlCache.set(normalizedId, {
    url,
    expireAt: Date.now() + Math.max(30, expireSeconds - 5) * 1000
  });
  return url;
}

async function resolveRingtoneUrl(template) {
  const normalized = normalizePomodoroTemplate(template, template?.pomodoroId || 1);
  if (normalized.ringtoneType === 'BUILTIN') {
    return findBuiltinRingtone(normalized.ringtoneCode)?.url || '';
  }

  if (!auth.isAuthenticated.value) {
    const code = String(normalized.ringtoneCode || '').trim();
    const temp = tempRingtones.value[code];
    return temp?.dataUrl || '';
  }

  if (!normalized.ringtoneAssetId) return '';
  return resolveAssetDownloadUrl(normalized.ringtoneAssetId);
}

async function playRingtoneLoop() {
  try {
    const template = currentTemplateOrDefault();
    const ringtoneUrl = await resolveRingtoneUrl(template);
    if (!ringtoneUrl) {
      infoText.value = '当前模板未配置可播放铃声。';
      return;
    }

    const audio = ensureAudio();
    if (!audio) return;
    stopRingtone();
    audio.src = ringtoneUrl;
    await audio.play();
    isRinging.value = true;
  } catch (error) {
    errorText.value = error?.message || '铃声播放失败';
    isRinging.value = false;
  }
}

function triggerUpload() {
  uploadInputRef.value?.click();
}

function fileToDataUrl(file) {
  return new Promise((resolve, reject) => {
    const reader = new FileReader();
    reader.onload = () => resolve(String(reader.result || ''));
    reader.onerror = () => reject(new Error('读取铃声文件失败'));
    reader.readAsDataURL(file);
  });
}

async function createAudioAssetByUpload(file) {
  const contentType = String(file?.type || '').trim().toLowerCase();
  if (!['audio/mpeg', 'audio/mp3'].includes(contentType)) {
    throw new Error('仅支持 MP3 格式');
  }
  const maxSize = 8 * 1024 * 1024;
  if (Number(file.size || 0) > maxSize) {
    throw new Error('铃声大小需 <= 8MB');
  }

  const fileName = sanitizeAudioFileName(file.name || 'pomodoro-ringtone.mp3');
  const policy = unwrapApi(
    await auth.authorizedFetch('/api/v1/assets/upload-policies', {
      method: 'POST',
      body: {
        fileName,
        contentType,
        assetKind: 'AUDIO',
        visibility: 'PRIVATE'
      }
    })
  );

  const uploadUrl = String(policy?.uploadUrl || policy?.upload_url || '').trim();
  let bucket = String(policy?.bucket || '').trim();
  let key = String(policy?.key || '').trim();
  let uploadContentType = contentType;
  if (!uploadUrl || !bucket || !key) {
    throw new Error('上传策略无效');
  }

  try {
    const directResult = await fetch(uploadUrl, {
      method: 'PUT',
      headers: {
        'Content-Type': contentType
      },
      body: file
    });
    if (!directResult.ok) {
      throw new Error(`direct upload failed (${directResult.status})`);
    }
  } catch {
    const relayForm = new FormData();
    relayForm.append('file', file, file.name || fileName);
    relayForm.append('asset_kind', 'AUDIO');
    relayForm.append('visibility', 'PRIVATE');

    const relayPayload = unwrapApi(
      await auth.authorizedFetch('/api/v1/assets/upload-relay', {
        method: 'POST',
        body: relayForm
      })
    );

    bucket = String(relayPayload?.bucket || '').trim();
    key = String(relayPayload?.key || '').trim();
    uploadContentType = String(relayPayload?.contentType || relayPayload?.content_type || contentType).trim() || contentType;
    if (!bucket || !key) {
      throw new Error('上传失败，请重试');
    }
  }

  const created = unwrapApi(
    await auth.authorizedFetch('/api/v1/assets', {
      method: 'POST',
      body: {
        bucket,
        key,
        assetType: 'audio',
        assetKind: 'AUDIO',
        contentType: uploadContentType,
        visibility: 'PRIVATE',
        metadata: {
          usage: 'pomodoro_ringtone'
        }
      }
    })
  );

  const assetId = Number(created?.assetId ?? created?.asset_id);
  if (!Number.isInteger(assetId) || assetId <= 0) {
    throw new Error('铃声资产创建失败');
  }

  const downloadInfo = unwrapApi(
    await auth.authorizedFetch(`/api/v1/assets/${encodeURIComponent(assetId)}/download-url`, {
      method: 'GET'
    })
  );

  const url = String(downloadInfo?.downloadUrl || downloadInfo?.download_url || downloadInfo?.publicUrl || downloadInfo?.public_url || '').trim();
  const expireSeconds = clampNumber(downloadInfo?.expireSeconds ?? downloadInfo?.expire_seconds, 30, 7200, 300);
  if (url) {
    downloadUrlCache.set(assetId, {
      url,
      expireAt: Date.now() + Math.max(30, expireSeconds - 5) * 1000
    });
  }

  return {
    assetId,
    name: String(file.name || 'Uploaded Ringtone').trim() || 'Uploaded Ringtone'
  };
}

async function onUploadFileChange(event) {
  const file = event?.target?.files?.[0];
  if (event?.target) {
    event.target.value = '';
  }
  if (!file) return;

  errorText.value = '';
  infoText.value = '';
  uploading.value = true;

  try {
    if (auth.isAuthenticated.value) {
      const uploaded = await createAudioAssetByUpload(file);
      draft.ringtoneType = 'UPLOAD';
      draft.ringtoneAssetId = uploaded.assetId;
      draft.ringtoneCode = '';
      draft.ringtoneName = uploaded.name;
      infoText.value = '上传铃声成功。';
      return;
    }

    const dataUrl = await fileToDataUrl(file);
    const code = `temp_${Date.now()}_${Math.random().toString(36).slice(2, 8)}`;
    tempRingtones.value = {
      ...tempRingtones.value,
      [code]: {
        name: String(file.name || 'Temp Ringtone').trim() || 'Temp Ringtone',
        dataUrl,
        contentType: String(file.type || 'audio/mpeg').trim() || 'audio/mpeg',
        size: clampNumber(file.size, 0, Number.MAX_SAFE_INTEGER, 0)
      }
    };

    if (!persistTempRingtones()) {
      delete tempRingtones.value[code];
      throw new Error('浏览器会话存储空间不足，无法保存临时铃声');
    }

    draft.ringtoneType = 'UPLOAD';
    draft.ringtoneAssetId = null;
    draft.ringtoneCode = code;
    draft.ringtoneName = tempRingtones.value[code].name;
    infoText.value = '临时铃声已保存到当前会话。';
  } catch (error) {
    errorText.value = error?.message || '铃声上传失败';
  } finally {
    uploading.value = false;
  }
}

const currentTemplate = computed(() => {
  const current = templates.value.find((item) => item.pomodoroId === activeTemplateId.value);
  return current || templates.value[0] || null;
});

const formattedTime = computed(() => formatTime(remainingSeconds.value));
const currentModeLabel = computed(() => currentModeLabelFrom(mode.value));
const todayFocusCount = computed(() => stats.focusCount);

const progressPercent = computed(() => {
  const duration = durationByMode(mode.value);
  if (duration <= 0) return 0;
  const progress = ((duration - remainingSeconds.value) / duration) * 100;
  return Math.max(0, Math.min(100, Math.round(progress)));
});

const nextLongBreakIn = computed(() => {
  const template = currentTemplateOrDefault();
  const every = clampNumber(template.longBreakEvery, 2, 12, 4);
  const remainder = completedFocusRounds.value % every;
  if (remainder === 0) return every;
  return every - remainder;
});

watch(
  () => currentTemplate.value,
  (next) => {
    if (!next || isRunning.value) return;
    remainingSeconds.value = durationByMode(mode.value);
  },
  { deep: true }
);

watch(activeTemplateId, () => {
  persistRuntime();
});

onMounted(async () => {
  registerPomodoroModeChangeHandler(props.windowId, switchMode);
  loadRuntime();
  await hydrate();
  if (!templates.value.length) {
    applyTemplates([createDefaultPomodoroTemplate(1)], 1);
  }
});

onBeforeUnmount(() => {
  registerPomodoroModeChangeHandler(props.windowId, null);
  stopTimer();
  stopRingtone();
  persistRuntime();
});
</script>

<style scoped>
.lightapp-window {
  --la-border: rgba(255, 255, 255, 0.44);
  --la-input-bg: rgba(var(--glass-rgb), 0.3);
  --la-btn-bg: rgba(var(--glass-rgb), 0.28);
  --la-panel-bg: rgba(var(--glass-rgb), 0.24);
  --la-text: rgba(35, 42, 58, 0.92);
  --la-muted: rgba(58, 67, 87, 0.72);
  display: grid;
  gap: 10px;
  color: var(--la-text);
  min-width: 0;
}

.template-toolbar {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
  align-items: center;
}

.toolbar-tab-btn {
  width: 32px;
  padding: 0;
}

.template-picker {
  display: grid;
  gap: 5px;
  font-size: 12px;
  color: var(--la-muted);
}

.template-picker select {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 8px;
  min-height: 32px;
  padding: 0 10px;
}

.template-actions {
  display: flex;
  align-items: center;
  gap: 6px;
  flex-wrap: wrap;
  justify-content: flex-end;
}

.chip-btn,
.icon-action-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
  min-height: 32px;
}

.chip-btn {
  padding: 0 10px;
}

.icon-action-btn {
  width: 32px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.icon-action-btn.danger {
  color: rgba(172, 44, 60, 0.88);
}

.template-form {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 10px;
}

.form-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.form-grid label,
.ringtone-row label {
  display: grid;
  gap: 5px;
  font-size: 12px;
  color: var(--la-muted);
}

.form-grid input,
.ringtone-row select,
.template-form input[type='text'] {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 8px;
  min-height: 32px;
  padding: 0 10px;
}

.check-row {
  display: inline-flex !important;
  align-items: center;
  gap: 6px;
}

.ringtone-block {
  display: grid;
  gap: 8px;
}

.ringtone-row {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.upload-col {
  display: grid;
  gap: 6px;
  align-content: center;
}

.upload-name {
  color: var(--la-muted);
  font-size: 12px;
}

.hidden-input {
  display: none;
}

.source-links {
  display: grid;
  gap: 6px;
}

.source-links a {
  border: 1px solid var(--la-border);
  background: rgba(var(--glass-rgb), 0.2);
  color: var(--la-text);
  border-radius: 10px;
  text-decoration: none;
  padding: 7px 10px;
  display: grid;
  gap: 2px;
}

.source-links span {
  font-size: 12px;
  color: var(--la-muted);
}

.form-actions {
  display: flex;
  align-items: center;
  gap: 8px;
  justify-content: flex-end;
}

.error-text {
  margin: 0;
  color: rgba(194, 52, 82, 0.92);
}

.info-text {
  margin: 0;
  color: rgba(47, 118, 77, 0.92);
}

.timer-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 12px;
  display: grid;
  gap: 8px;
  justify-items: center;
}

.mode-label,
.sub-hint,
.template-hint {
  margin: 0;
  font-size: 13px;
  color: var(--la-muted);
}

.time-text {
  margin: 0;
  font-size: clamp(36px, 7vw, 52px);
  font-weight: 700;
  line-height: 1;
  letter-spacing: 1px;
}

.progress-track {
  width: min(360px, 100%);
  height: 8px;
  border-radius: 999px;
  overflow: hidden;
  border: 1px solid var(--la-border);
  background: rgba(var(--glass-rgb), 0.2);
}

.progress-fill {
  display: block;
  height: 100%;
  background: linear-gradient(90deg, rgba(var(--accent-rgb), 0.9), rgba(255, 145, 112, 0.9));
  border-radius: 999px;
  transition: width 240ms linear;
}

.control-row,
.stats-row {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.control-row {
  justify-content: center;
}

.stats-row {
  color: var(--la-muted);
  font-size: 12px;
}

.stats-row p {
  margin: 0;
}

.panel-collapse-enter-active,
.panel-collapse-leave-active {
  transition:
    transform 180ms cubic-bezier(0.2, 0.88, 0.32, 1),
    opacity 140ms ease;
  transform-origin: top center;
}

.panel-collapse-enter-from,
.panel-collapse-leave-to {
  opacity: 0;
  transform: scaleY(0.86);
}

.panel-collapse-enter-to,
.panel-collapse-leave-from {
  opacity: 1;
  transform: scaleY(1);
}

@container lightapp-window-body (max-width: 960px) {
  .form-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .ringtone-row {
    grid-template-columns: 1fr;
  }

  .template-toolbar {
    grid-template-columns: 1fr;
  }
}

@container lightapp-window-body (max-width: 640px) {
  .form-grid {
    grid-template-columns: 1fr;
  }

  .control-row,
  .stats-row {
    justify-content: space-between;
  }
}
</style>
