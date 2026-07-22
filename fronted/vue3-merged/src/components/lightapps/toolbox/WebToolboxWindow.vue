<template>
  <section class="lightapp-window toolbox-window">
    <LightAppTopToolbar :window-id="props.windowId" layout="space-between">
      <div class="toolbar-search-wrap">
        <i class="fas fa-magnifying-glass" aria-hidden="true"></i>
        <input v-model.trim="searchQuery" class="toolbar-search" type="search" placeholder="搜索工具..." />
      </div>
      <div class="toolbar-actions">
        <button class="icon-action-btn ripple-trigger" type="button" title="工具总览" aria-label="工具总览" @click="activeTool = 'home'">
          <i class="fas fa-border-all" aria-hidden="true"></i>
        </button>
        <button class="chip-btn ripple-trigger" type="button" :disabled="!activeResultText" @click="copyActiveResult">
          复制结果
        </button>
        <button class="icon-action-btn ripple-trigger" type="button" title="清空当前工具" aria-label="清空当前工具" @click="clearActiveTool">
          <i class="fas fa-eraser" aria-hidden="true"></i>
        </button>
      </div>
    </LightAppTopToolbar>

    <p v-if="infoText" class="feedback-text info-text">{{ infoText }}</p>
    <p v-if="errorText" class="feedback-text error-text">{{ errorText }}</p>

    <div class="toolbox-shell">
      <aside class="tool-rail liquid-material" aria-label="工具导航">
        <button class="rail-home ripple-trigger" :class="{ active: activeTool === 'home' }" type="button" @click="activeTool = 'home'">
          <span class="rail-icon"><i class="fas fa-sparkles" aria-hidden="true"></i></span>
          <span>
            <strong>Web Toolbox</strong>
            <small>{{ WEB_TOOLBOX_TOOLS.length }} 个本地工具</small>
          </span>
        </button>

        <section v-for="group in filteredGroups" :key="group.code" class="rail-group">
          <p class="rail-group-label">{{ group.label }}</p>
          <button
            v-for="tool in group.tools"
            :key="tool.code"
            class="rail-tool ripple-trigger"
            :class="{ active: activeTool === tool.code }"
            type="button"
            @click="selectTool(tool.code)"
          >
            <span class="rail-icon"><i :class="tool.iconClass" aria-hidden="true"></i></span>
            <span>
              <strong>{{ tool.title }}</strong>
              <small>{{ tool.summary }}</small>
            </span>
          </button>
        </section>

        <p v-if="!filteredGroups.length" class="rail-empty">没有匹配的工具</p>
      </aside>

      <main class="tool-workspace liquid-material">
        <template v-if="activeTool === 'home'">
          <header class="toolbox-hero">
            <div>
              <p class="eyebrow">LOCAL FIRST · WEB UTILITY LAB</p>
              <h2>随手处理文本、URL 与结构化数据</h2>
              <p>无需上传文件，不依赖后端。输入和结果只停留在当前浏览器会话。</p>
            </div>
            <div class="hero-orbit" aria-hidden="true">
              <span><i class="fas fa-link"></i></span>
              <span><i class="fas fa-code"></i></span>
              <span><i class="fas fa-qrcode"></i></span>
            </div>
          </header>

          <section v-for="group in WEB_TOOLBOX_GROUPS" :key="`home_${group.code}`" class="overview-group">
            <div class="overview-head">
              <h3>{{ group.label }}</h3>
              <span>{{ group.tools.length }}</span>
            </div>
            <div class="overview-grid">
              <button
                v-for="tool in group.tools"
                :key="`card_${tool.code}`"
                class="overview-card ripple-trigger"
                type="button"
                @click="selectTool(tool.code)"
              >
                <span class="card-icon"><i :class="tool.iconClass" aria-hidden="true"></i></span>
                <strong>{{ tool.title }}</strong>
                <small>{{ tool.summary }}</small>
                <i class="fas fa-arrow-right card-arrow" aria-hidden="true"></i>
              </button>
            </div>
          </section>
        </template>

        <template v-else>
          <header class="workspace-head">
            <span class="workspace-icon"><i :class="currentTool?.iconClass" aria-hidden="true"></i></span>
            <div>
              <p class="eyebrow">{{ currentGroupLabel }}</p>
              <h2>{{ currentTool?.title }}</h2>
              <p>{{ currentTool?.summary }}</p>
            </div>
          </header>

          <section v-if="activeTool === 'unicode'" class="tool-panel two-pane">
            <div class="input-pane">
              <div class="pane-toolbar">
                <label class="segmented-control">
                  <input v-model="unicodeState.mode" type="radio" value="encode" />
                  <span>转义编码</span>
                  <input v-model="unicodeState.mode" type="radio" value="decode" />
                  <span>转义解码</span>
                </label>
              </div>
              <textarea v-model="unicodeState.input" class="tool-textarea" rows="14" placeholder="输入中文、Emoji 或 Unicode 转义"></textarea>
            </div>
            <ResultPane :result="unicodeResult" />
          </section>

          <section v-else-if="activeTool === 'utf8'" class="tool-panel two-pane">
            <div class="input-pane">
              <div class="pane-toolbar form-controls">
                <select v-model="utf8State.mode">
                  <option value="encode">文本 → 字节</option>
                  <option value="decode">字节 → 文本</option>
                </select>
                <select v-model="utf8State.format">
                  <option value="hex">Hex</option>
                  <option value="percent">% 百分号</option>
                  <option value="base64">Base64</option>
                </select>
              </div>
              <textarea v-model="utf8State.input" class="tool-textarea" rows="14" placeholder="输入文本或 UTF-8 字节"></textarea>
            </div>
            <ResultPane :result="utf8Result" />
          </section>

          <section v-else-if="activeTool === 'encoding'" class="tool-panel two-pane">
            <div class="input-pane">
              <div class="pane-toolbar form-controls">
                <select v-model="encodingState.encoding">
                  <option value="gbk">GBK / GB18030</option>
                  <option value="big5">Big5</option>
                  <option value="shift_jis">Shift_JIS</option>
                  <option value="euc-kr">EUC-KR</option>
                  <option value="utf-8">UTF-8</option>
                </select>
                <select v-model="encodingState.format">
                  <option value="hex">Hex 字节</option>
                  <option value="percent">% 百分号</option>
                  <option value="base64">Base64</option>
                </select>
              </div>
              <textarea v-model="encodingState.input" class="tool-textarea" rows="14" placeholder="输入指定编码的字节，例如 C4 E3 BA C3"></textarea>
              <p class="pane-hint">浏览器使用 WHATWG TextDecoder 在本地解码常见东亚编码。</p>
            </div>
            <ResultPane :result="encodingResult" />
          </section>

          <section v-else-if="activeTool === 'base64'" class="tool-panel two-pane">
            <div class="input-pane">
              <div class="pane-toolbar">
                <label class="segmented-control">
                  <input v-model="base64State.mode" type="radio" value="encode" />
                  <span>编码</span>
                  <input v-model="base64State.mode" type="radio" value="decode" />
                  <span>解码</span>
                </label>
              </div>
              <textarea v-model="base64State.input" class="tool-textarea" rows="14" placeholder="输入 UTF-8 文本或 Base64"></textarea>
            </div>
            <ResultPane :result="base64Result" />
          </section>

          <section v-else-if="activeTool === 'md5'" class="tool-panel hash-layout">
            <label class="stack-field">
              <span>待计算文本</span>
              <textarea v-model="md5State.input" class="tool-textarea" rows="10" placeholder="输入任意文本"></textarea>
            </label>
            <div class="hash-result">
              <span>MD5 · 32 位小写</span>
              <code>{{ md5Result.value || 'd41d8cd98f00b204e9800998ecf8427e' }}</code>
            </div>
          </section>

          <section v-else-if="activeTool === 'url-codec'" class="tool-panel two-pane">
            <div class="input-pane">
              <div class="pane-toolbar form-controls">
                <select v-model="urlCodecState.mode">
                  <option value="encode">编码</option>
                  <option value="decode">解码</option>
                </select>
                <select v-model="urlCodecState.scope">
                  <option value="component">URL 组件</option>
                  <option value="url">完整 URL</option>
                  <option value="form">表单参数 (+)</option>
                </select>
              </div>
              <textarea v-model="urlCodecState.input" class="tool-textarea" rows="14" placeholder="输入 URL 或需要编码的文本"></textarea>
            </div>
            <ResultPane :result="urlCodecResult" />
          </section>

          <section v-else-if="activeTool === 'json'" class="tool-panel two-pane json-panel">
            <div class="input-pane">
              <div class="pane-toolbar form-controls">
                <select v-model="jsonState.mode">
                  <option value="format">格式化</option>
                  <option value="minify">压缩</option>
                </select>
                <select v-model.number="jsonState.indent" :disabled="jsonState.mode === 'minify'">
                  <option :value="2">2 空格</option>
                  <option :value="4">4 空格</option>
                </select>
                <label class="check-control"><input v-model="jsonState.sortKeys" type="checkbox" /> 键名排序</label>
              </div>
              <textarea v-model="jsonState.input" class="tool-textarea code-textarea" rows="18" placeholder="支持 JSON、JSON5 和尾逗号"></textarea>
            </div>
            <ResultPane :result="jsonResult" code />
          </section>

          <section v-else-if="activeTool === 'url-params'" class="tool-panel params-layout">
            <label class="stack-field">
              <span>URL</span>
              <textarea v-model="urlParamsState.input" class="tool-textarea" rows="4" placeholder="https://example.com/path?name=shizuki&tag=vue#page?tab=2"></textarea>
            </label>
            <div v-if="urlParamsResult.error" class="inline-error">{{ urlParamsResult.error }}</div>
            <template v-else>
              <div class="url-structure-grid">
                <div><span>协议</span><strong>{{ urlParamsResult.value.protocol || '-' }}</strong></div>
                <div><span>主机</span><strong>{{ urlParamsResult.value.host || '-' }}</strong></div>
                <div><span>路径</span><strong>{{ urlParamsResult.value.pathname || '/' }}</strong></div>
                <div><span>Hash</span><strong>{{ urlParamsResult.value.hash || '-' }}</strong></div>
              </div>
              <div class="params-table-wrap">
                <table class="params-table">
                  <thead><tr><th>来源</th><th>键</th><th>值</th></tr></thead>
                  <tbody>
                    <tr v-for="item in urlParamsResult.value.pairs" :key="item.id">
                      <td><span class="source-pill">{{ item.source }}</span></td>
                      <td>{{ item.key }}</td>
                      <td>{{ item.value }}</td>
                    </tr>
                    <tr v-if="!urlParamsResult.value.pairs.length"><td colspan="3" class="empty-cell">没有查询参数</td></tr>
                  </tbody>
                </table>
              </div>
            </template>
          </section>

          <section v-else-if="activeTool === 'toon'" class="tool-panel two-pane json-panel">
            <div class="input-pane">
              <div class="pane-toolbar form-controls">
                <select v-model="toonState.mode">
                  <option value="json-to-toon">JSON → TOON</option>
                  <option value="toon-to-json">TOON → JSON</option>
                </select>
              </div>
              <textarea v-model="toonState.input" class="tool-textarea code-textarea" rows="18" placeholder="输入 JSON / JSON5 或 TOON"></textarea>
            </div>
            <ResultPane :result="toonResult" code />
          </section>

          <section v-else-if="activeTool === 'password'" class="tool-panel password-layout">
            <div class="password-output">
              <span>安全随机密码</span>
              <code>{{ passwordValue }}</code>
              <button class="primary-btn ripple-trigger" type="button" @click="refreshPassword">
                <i class="fas fa-arrows-rotate" aria-hidden="true"></i> 重新生成
              </button>
            </div>
            <div class="password-options">
              <label class="range-field"><span>长度 {{ passwordState.length }}</span><input v-model.number="passwordState.length" type="range" min="8" max="64" /></label>
              <label><input v-model="passwordState.lowercase" type="checkbox" /> 小写字母</label>
              <label><input v-model="passwordState.uppercase" type="checkbox" /> 大写字母</label>
              <label><input v-model="passwordState.numbers" type="checkbox" /> 数字</label>
              <label><input v-model="passwordState.symbols" type="checkbox" /> 符号</label>
              <label><input v-model="passwordState.excludeAmbiguous" type="checkbox" /> 排除易混淆字符</label>
            </div>
          </section>

          <section v-else-if="activeTool === 'timestamp'" class="tool-panel timestamp-layout">
            <div class="timestamp-input-row">
              <label class="stack-field">
                <span>时间戳或日期文本</span>
                <input v-model.trim="timestampState.input" type="text" placeholder="例如 1712345678 或 2026-07-22 12:00:00" />
              </label>
              <label class="stack-field">
                <span>数字单位</span>
                <select v-model="timestampState.unit">
                  <option value="auto">自动识别</option>
                  <option value="seconds">秒</option>
                  <option value="milliseconds">毫秒</option>
                </select>
              </label>
              <button class="primary-btn ripple-trigger" type="button" @click="useCurrentTimestamp">使用当前时间</button>
            </div>
            <div v-if="timestampResult.error" class="inline-error">{{ timestampResult.error }}</div>
            <div v-else class="timestamp-grid">
              <div><span>秒</span><strong>{{ timestampResult.value.seconds }}</strong></div>
              <div><span>毫秒</span><strong>{{ timestampResult.value.milliseconds }}</strong></div>
              <div><span>ISO 8601</span><strong>{{ timestampResult.value.iso }}</strong></div>
              <div><span>本地时间</span><strong>{{ timestampResult.value.local }}</strong></div>
            </div>
          </section>

          <section v-else-if="activeTool === 'change-rate'" class="tool-panel change-layout">
            <div class="change-inputs">
              <label class="stack-field"><span>初始值</span><input v-model.trim="changeState.start" type="number" step="any" /></label>
              <i class="fas fa-arrow-right" aria-hidden="true"></i>
              <label class="stack-field"><span>结束值</span><input v-model.trim="changeState.end" type="number" step="any" /></label>
            </div>
            <div v-if="changeResult.error" class="inline-error">{{ changeResult.error }}</div>
            <div v-else class="change-result-grid" :class="`is-${changeResult.value.direction}`">
              <div class="change-primary">
                <span>涨跌幅</span>
                <strong>{{ formatPercent(changeResult.value.percentage) }}</strong>
              </div>
              <div><span>差额</span><strong>{{ formatNumber(changeResult.value.amount) }}</strong></div>
              <div><span>变化倍数</span><strong>{{ changeResult.value.multiple == null ? '不可计算' : `${formatNumber(changeResult.value.multiple)}x` }}</strong></div>
              <div><span>方向</span><strong>{{ changeDirectionLabel }}</strong></div>
            </div>
          </section>

          <section v-else-if="activeTool === 'qr-tools'" class="tool-panel qr-launcher">
            <div class="qr-visual" aria-hidden="true">
              <i class="fas fa-qrcode"></i>
              <span></span><span></span><span></span>
            </div>
            <div>
              <p class="eyebrow">QR TOOL SUITE</p>
              <h3>二维码生成、识别与 WiFi 卡片</h3>
              <p>二维码功能保留为独立窗口，便于同时打开工具箱和二维码预览。</p>
              <button class="primary-btn ripple-trigger" type="button" @click="openQrTools">
                <i class="fas fa-up-right-from-square" aria-hidden="true"></i> 打开二维码工具
              </button>
            </div>
          </section>
        </template>
      </main>
    </div>
  </section>
</template>

<script setup>
import { computed, defineComponent, h, onBeforeUnmount, reactive, ref, watch } from 'vue';
import { openLightAppWindow } from '../../../utils/lightAppWindowBus';
import LightAppTopToolbar from '../LightAppTopToolbar.vue';
import {
  calculateChange,
  convertJsonToToon,
  convertToonToJson,
  createMd5,
  decodeBase64Text,
  decodeByteText,
  decodeUnicodeEscapes,
  encodeBase64Text,
  encodeUnicodeEscapes,
  encodeUtf8Bytes,
  findWebTool,
  formatJsonLike,
  generatePassword,
  parseUrlDetails,
  resolveTimestamp,
  transformUrlText,
  WEB_TOOLBOX_GROUPS,
  WEB_TOOLBOX_TOOLS
} from './webToolboxCore';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const ResultPane = defineComponent({
  name: 'WebToolboxResultPane',
  props: {
    result: { type: Object, required: true },
    code: { type: Boolean, default: false }
  },
  setup(componentProps) {
    return () => h('div', { class: 'result-pane' }, [
      h('div', { class: 'result-pane-head' }, [
        h('span', null, '结果'),
        h('small', null, componentProps.result.error ? '转换失败' : `${String(componentProps.result.value || '').length} chars`)
      ]),
      componentProps.result.error
        ? h('div', { class: 'inline-error' }, componentProps.result.error)
        : h('textarea', {
            class: ['tool-textarea', 'result-textarea', componentProps.code ? 'code-textarea' : ''],
            rows: 14,
            readonly: true,
            value: String(componentProps.result.value ?? ''),
            placeholder: '结果会显示在这里'
          })
    ]);
  }
});

const TOOLBOX_ACTIVE_STORAGE_KEY = 'shizuki.web-toolbox.active.v1';
const activeTool = ref(readInitialTool());
const searchQuery = ref('');
const infoText = ref('');
const errorText = ref('');
const passwordValue = ref('');

const unicodeState = reactive({ input: 'Hello 世界 👋', mode: 'encode' });
const utf8State = reactive({ input: '你好 Shizuki', mode: 'encode', format: 'hex' });
const encodingState = reactive({ input: 'C4 E3 BA C3', encoding: 'gbk', format: 'hex' });
const base64State = reactive({ input: 'Shizuki 轻应用', mode: 'encode' });
const md5State = reactive({ input: '' });
const urlCodecState = reactive({ input: 'https://example.com/search?q=你好 world', mode: 'encode', scope: 'url' });
const jsonState = reactive({ input: '{\n  app: "shizuki",\n  tools: ["url", "json", "qr"],\n}', mode: 'format', indent: 2, sortKeys: false });
const urlParamsState = reactive({ input: 'https://example.com/search?q=shizuki&tag=vue&tag=tools#page?tab=2' });
const toonState = reactive({ input: '{\n  users: [\n    { id: 1, name: "Shizuki", role: "owner" },\n    { id: 2, name: "Guest", role: "reader" }\n  ]\n}', mode: 'json-to-toon' });
const passwordState = reactive({ length: 20, lowercase: true, uppercase: true, numbers: true, symbols: true, excludeAmbiguous: true });
const timestampState = reactive({ input: String(Date.now()), unit: 'auto' });
const changeState = reactive({ start: '100', end: '125' });

let feedbackTimer = 0;

function readInitialTool() {
  if (typeof window === 'undefined') return 'url-codec';
  const saved = String(window.localStorage.getItem(TOOLBOX_ACTIVE_STORAGE_KEY) || '').trim();
  return findWebTool(saved) ? saved : 'url-codec';
}

function resultOf(callback) {
  try {
    return { value: callback(), error: '' };
  } catch (error) {
    return { value: '', error: error?.message || '处理失败' };
  }
}

const currentTool = computed(() => findWebTool(activeTool.value));
const currentGroupLabel = computed(() => WEB_TOOLBOX_GROUPS.find((group) => group.tools.some((tool) => tool.code === activeTool.value))?.label || '工具箱');
const filteredGroups = computed(() => {
  const query = searchQuery.value.toLowerCase();
  if (!query) return WEB_TOOLBOX_GROUPS;
  return WEB_TOOLBOX_GROUPS
    .map((group) => ({
      ...group,
      tools: group.tools.filter((tool) => `${tool.title} ${tool.summary} ${tool.code}`.toLowerCase().includes(query))
    }))
    .filter((group) => group.tools.length);
});

const unicodeResult = computed(() => resultOf(() => unicodeState.mode === 'decode'
  ? decodeUnicodeEscapes(unicodeState.input)
  : encodeUnicodeEscapes(unicodeState.input)));
const utf8Result = computed(() => resultOf(() => utf8State.mode === 'decode'
  ? decodeByteText(utf8State.input, utf8State.format, 'utf-8')
  : encodeUtf8Bytes(utf8State.input, utf8State.format)));
const encodingResult = computed(() => resultOf(() => decodeByteText(encodingState.input, encodingState.format, encodingState.encoding)));
const base64Result = computed(() => resultOf(() => base64State.mode === 'decode'
  ? decodeBase64Text(base64State.input)
  : encodeBase64Text(base64State.input)));
const md5Result = computed(() => resultOf(() => createMd5(md5State.input)));
const urlCodecResult = computed(() => resultOf(() => transformUrlText(urlCodecState.input, urlCodecState)));
const jsonResult = computed(() => resultOf(() => formatJsonLike(jsonState.input, jsonState)));
const urlParamsResult = computed(() => resultOf(() => parseUrlDetails(urlParamsState.input)));
const toonResult = computed(() => resultOf(() => toonState.mode === 'toon-to-json'
  ? convertToonToJson(toonState.input, 2)
  : convertJsonToToon(toonState.input)));
const timestampResult = computed(() => resultOf(() => resolveTimestamp(timestampState.input, timestampState.unit)));
const changeResult = computed(() => resultOf(() => calculateChange(changeState.start, changeState.end)));
const changeDirectionLabel = computed(() => {
  if (changeResult.value.error) return '-';
  if (changeResult.value.value.direction === 'up') return '上涨';
  if (changeResult.value.value.direction === 'down') return '下跌';
  return '持平';
});

const activeResultText = computed(() => {
  const resultMap = {
    unicode: unicodeResult.value,
    utf8: utf8Result.value,
    encoding: encodingResult.value,
    base64: base64Result.value,
    md5: md5Result.value,
    'url-codec': urlCodecResult.value,
    json: jsonResult.value,
    toon: toonResult.value
  };
  if (activeTool.value === 'password') return passwordValue.value;
  if (activeTool.value === 'url-params' && !urlParamsResult.value.error) return JSON.stringify(urlParamsResult.value.value, null, 2);
  if (activeTool.value === 'timestamp' && !timestampResult.value.error) return JSON.stringify(timestampResult.value.value, null, 2);
  if (activeTool.value === 'change-rate' && !changeResult.value.error) return JSON.stringify(changeResult.value.value, null, 2);
  const result = resultMap[activeTool.value];
  return result && !result.error ? String(result.value ?? '') : '';
});

function selectTool(code) {
  activeTool.value = code;
  searchQuery.value = '';
  if (code === 'password' && !passwordValue.value) refreshPassword();
}

function showFeedback(message, type = 'info') {
  if (feedbackTimer) window.clearTimeout(feedbackTimer);
  infoText.value = type === 'info' ? message : '';
  errorText.value = type === 'error' ? message : '';
  feedbackTimer = window.setTimeout(() => {
    infoText.value = '';
    errorText.value = '';
    feedbackTimer = 0;
  }, 2200);
}

async function copyActiveResult() {
  if (!activeResultText.value) return;
  try {
    await navigator.clipboard.writeText(activeResultText.value);
    showFeedback('结果已复制');
  } catch (error) {
    showFeedback(error?.message || '复制失败', 'error');
  }
}

function refreshPassword() {
  try {
    passwordValue.value = generatePassword(passwordState);
    errorText.value = '';
  } catch (error) {
    passwordValue.value = '';
    showFeedback(error?.message || '密码生成失败', 'error');
  }
}

function useCurrentTimestamp() {
  timestampState.input = String(Date.now());
  timestampState.unit = 'milliseconds';
}

function openQrTools() {
  openLightAppWindow('qr-tools', { source: 'web_toolbox' });
}

function clearActiveTool() {
  const inputMap = {
    unicode: unicodeState,
    utf8: utf8State,
    encoding: encodingState,
    base64: base64State,
    md5: md5State,
    'url-codec': urlCodecState,
    json: jsonState,
    'url-params': urlParamsState,
    toon: toonState,
    timestamp: timestampState
  };
  const target = inputMap[activeTool.value];
  if (target && Object.prototype.hasOwnProperty.call(target, 'input')) target.input = '';
  if (activeTool.value === 'change-rate') {
    changeState.start = '';
    changeState.end = '';
  }
  if (activeTool.value === 'password') passwordValue.value = '';
}

function formatNumber(value) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return '-';
  return new Intl.NumberFormat('zh-CN', { maximumFractionDigits: 6 }).format(numeric);
}

function formatPercent(value) {
  if (value == null || !Number.isFinite(Number(value))) return '不可计算';
  const numeric = Number(value);
  return `${numeric > 0 ? '+' : ''}${formatNumber(numeric)}%`;
}

watch(activeTool, (value) => {
  if (typeof window !== 'undefined' && findWebTool(value)) {
    window.localStorage.setItem(TOOLBOX_ACTIVE_STORAGE_KEY, value);
  }
});

watch(passwordState, refreshPassword, { deep: true, immediate: true });

onBeforeUnmount(() => {
  if (feedbackTimer) window.clearTimeout(feedbackTimer);
});
</script>

<style scoped>
.lightapp-window {
  --tool-border: var(--theme-border, rgba(255, 255, 255, 0.42));
  --tool-panel: var(--theme-panel-surface, rgba(var(--glass-rgb), 0.24));
  --tool-panel-strong: var(--theme-panel-surface-elevated, rgba(var(--glass-rgb), 0.34));
  --tool-text: var(--theme-text-primary, rgba(33, 41, 56, 0.94));
  --tool-muted: var(--theme-text-secondary, rgba(63, 73, 94, 0.72));
  color: var(--tool-text);
  display: grid;
  gap: 10px;
  min-width: 0;
  min-height: 100%;
}

.toolbar-search-wrap {
  min-width: min(320px, 50vw);
  display: flex;
  align-items: center;
  gap: 8px;
  border: 1px solid var(--tool-border);
  border-radius: 10px;
  background: var(--tool-panel);
  padding: 0 10px;
}

.toolbar-search-wrap i { color: var(--tool-muted); }
.toolbar-search { width: 100%; min-height: 32px; border: 0; outline: 0; background: transparent; color: var(--tool-text); }
.toolbar-actions { display: inline-flex; align-items: center; gap: 7px; flex-wrap: wrap; }
.chip-btn, .icon-action-btn, .primary-btn { border: 1px solid var(--tool-border); background: var(--tool-panel-strong); color: var(--tool-text); border-radius: 10px; min-height: 32px; }
.chip-btn { padding: 0 12px; }
.icon-action-btn { width: 32px; display: inline-grid; place-items: center; }
.primary-btn { padding: 0 14px; display: inline-flex; align-items: center; justify-content: center; gap: 8px; background: rgba(var(--accent-rgb), 0.16); border-color: rgba(var(--accent-rgb), 0.36); }
.feedback-text { margin: 0; padding: 7px 11px; border-radius: 10px; font-size: 13px; }
.info-text { color: rgba(34, 119, 75, 0.94); background: rgba(74, 174, 112, 0.1); }
.error-text, .inline-error { color: rgba(188, 43, 73, 0.96); background: rgba(208, 68, 95, 0.1); }
.inline-error { border: 1px solid rgba(208, 68, 95, 0.24); border-radius: 10px; padding: 10px; }

.toolbox-shell { display: grid; grid-template-columns: 255px minmax(0, 1fr); gap: 12px; min-width: 0; min-height: 0; }
.tool-rail, .tool-workspace { --liquid-bg: var(--tool-panel); --liquid-border: var(--tool-border); border-radius: 16px; }
.tool-rail { padding: 10px; display: grid; align-content: start; gap: 12px; max-height: calc(100cqh - 8px); overflow: auto; }
.rail-home, .rail-tool { width: 100%; border: 1px solid transparent; background: transparent; color: inherit; text-align: left; display: grid; grid-template-columns: 34px minmax(0, 1fr); align-items: center; gap: 9px; border-radius: 12px; padding: 8px; }
.rail-home { background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.16), rgba(255, 255, 255, 0.08)); border-color: rgba(var(--accent-rgb), 0.22); }
.rail-tool:hover, .rail-tool.active, .rail-home.active { background: var(--tool-panel-strong); border-color: rgba(var(--accent-rgb), 0.3); }
.rail-icon { width: 34px; height: 34px; border-radius: 11px; display: grid; place-items: center; background: rgba(var(--accent-rgb), 0.12); color: rgb(var(--accent-strong-rgb)); }
.rail-home strong, .rail-tool strong, .rail-home small, .rail-tool small { display: block; }
.rail-home strong, .rail-tool strong { font-size: 13px; }
.rail-home small, .rail-tool small { color: var(--tool-muted); font-size: 11px; margin-top: 2px; white-space: nowrap; overflow: hidden; text-overflow: ellipsis; }
.rail-group { display: grid; gap: 3px; }
.rail-group-label { margin: 0 8px 4px; color: var(--tool-muted); font-size: 10px; text-transform: uppercase; letter-spacing: 0.12em; }
.rail-empty { color: var(--tool-muted); text-align: center; font-size: 12px; }

.tool-workspace { padding: 16px; min-width: 0; overflow: auto; }
.toolbox-hero { min-height: 180px; border-radius: 18px; padding: clamp(20px, 4vw, 38px); display: flex; align-items: center; justify-content: space-between; gap: 20px; overflow: hidden; background: radial-gradient(circle at 80% 10%, rgba(var(--accent-rgb), 0.24), transparent 34%), linear-gradient(135deg, rgba(16, 29, 48, 0.96), rgba(47, 78, 104, 0.82)); color: rgba(248, 251, 255, 0.96); }
.toolbox-hero h2 { margin: 6px 0 8px; font-size: clamp(24px, 4vw, 38px); max-width: 680px; }
.toolbox-hero p { margin: 0; color: rgba(226, 235, 246, 0.78); }
.eyebrow { margin: 0; color: var(--tool-muted); font-size: 10px; letter-spacing: 0.14em; text-transform: uppercase; }
.toolbox-hero .eyebrow { color: rgba(209, 225, 243, 0.68); }
.hero-orbit { width: 132px; height: 132px; position: relative; flex: 0 0 auto; border: 1px solid rgba(255, 255, 255, 0.16); border-radius: 50%; animation: orbit-spin 18s linear infinite; }
.hero-orbit span { position: absolute; width: 40px; height: 40px; border-radius: 14px; display: grid; place-items: center; background: rgba(255, 255, 255, 0.14); backdrop-filter: blur(10px); }
.hero-orbit span:nth-child(1) { top: -10px; left: 46px; }
.hero-orbit span:nth-child(2) { bottom: 10px; left: -7px; }
.hero-orbit span:nth-child(3) { bottom: 8px; right: -7px; }
@keyframes orbit-spin { to { transform: rotate(360deg); } }
.overview-group { margin-top: 18px; }
.overview-head { display: flex; align-items: center; justify-content: space-between; margin-bottom: 9px; }
.overview-head h3 { margin: 0; font-size: 15px; }
.overview-head span { color: var(--tool-muted); font-size: 11px; }
.overview-grid { display: grid; grid-template-columns: repeat(3, minmax(0, 1fr)); gap: 10px; }
.overview-card { position: relative; min-height: 132px; border: 1px solid var(--tool-border); border-radius: 14px; background: var(--tool-panel); color: inherit; text-align: left; padding: 14px; display: grid; align-content: start; gap: 7px; transition: transform 160ms ease, border-color 160ms ease, background-color 160ms ease; }
.overview-card:hover { transform: translateY(-2px); border-color: rgba(var(--accent-rgb), 0.38); background: var(--tool-panel-strong); }
.card-icon, .workspace-icon { width: 38px; height: 38px; border-radius: 13px; display: grid; place-items: center; color: rgb(var(--accent-strong-rgb)); background: rgba(var(--accent-rgb), 0.13); }
.overview-card strong { font-size: 14px; }
.overview-card small { color: var(--tool-muted); line-height: 1.45; }
.card-arrow { position: absolute; right: 13px; top: 17px; color: var(--tool-muted); }

.workspace-head { display: grid; grid-template-columns: 44px minmax(0, 1fr); gap: 11px; align-items: center; padding-bottom: 14px; border-bottom: 1px solid var(--tool-border); margin-bottom: 14px; }
.workspace-head h2, .workspace-head p { margin: 0; }
.workspace-head h2 { font-size: 21px; margin-top: 2px; }
.workspace-head p:not(.eyebrow) { color: var(--tool-muted); font-size: 12px; margin-top: 3px; }
.workspace-icon { width: 44px; height: 44px; }
.tool-panel { min-width: 0; }
.two-pane { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 12px; }
.input-pane, .result-pane, .stack-field { display: grid; gap: 8px; align-content: start; min-width: 0; }
.input-pane, .result-pane { padding: 12px; border: 1px solid var(--tool-border); border-radius: 14px; background: var(--tool-panel); }
.pane-toolbar, .result-pane-head { min-height: 34px; display: flex; align-items: center; justify-content: space-between; gap: 8px; flex-wrap: wrap; }
.result-pane-head { color: var(--tool-muted); font-size: 12px; }
.tool-textarea, .stack-field input, .stack-field select, .form-controls select { width: 100%; box-sizing: border-box; border: 1px solid var(--tool-border); border-radius: 10px; background: var(--tool-panel-strong); color: var(--tool-text); padding: 10px 12px; font: inherit; }
.tool-textarea { resize: vertical; min-height: 260px; line-height: 1.55; }
.code-textarea { font-family: 'Cascadia Code', 'JetBrains Mono', Consolas, monospace; font-size: 12px; tab-size: 2; }
.result-textarea { background: rgba(var(--accent-rgb), 0.06); }
.form-controls { justify-content: flex-start; }
.form-controls select { width: auto; min-width: 130px; min-height: 34px; padding: 0 9px; }
.segmented-control { display: inline-flex; align-items: center; border: 1px solid var(--tool-border); border-radius: 10px; overflow: hidden; }
.segmented-control input { position: absolute; opacity: 0; pointer-events: none; }
.segmented-control span { padding: 7px 12px; color: var(--tool-muted); font-size: 12px; }
.segmented-control input:checked + span { color: rgb(var(--accent-strong-rgb)); background: rgba(var(--accent-rgb), 0.16); }
.check-control, .password-options label { display: inline-flex; align-items: center; gap: 6px; color: var(--tool-muted); font-size: 12px; }
.pane-hint { margin: 0; color: var(--tool-muted); font-size: 11px; }

.hash-layout { display: grid; gap: 14px; }
.stack-field span { color: var(--tool-muted); font-size: 12px; }
.hash-result { border: 1px solid rgba(var(--accent-rgb), 0.28); border-radius: 15px; background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.12), rgba(255, 255, 255, 0.04)); padding: 18px; display: grid; gap: 8px; }
.hash-result span { color: var(--tool-muted); font-size: 11px; }
.hash-result code { font-size: clamp(15px, 3vw, 26px); word-break: break-all; }
.params-layout, .timestamp-layout, .change-layout { display: grid; gap: 14px; }
.url-structure-grid, .timestamp-grid, .change-result-grid { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 10px; }
.url-structure-grid > div, .timestamp-grid > div, .change-result-grid > div { border: 1px solid var(--tool-border); border-radius: 12px; background: var(--tool-panel); padding: 12px; display: grid; gap: 5px; }
.url-structure-grid span, .timestamp-grid span, .change-result-grid span { color: var(--tool-muted); font-size: 11px; }
.url-structure-grid strong, .timestamp-grid strong { overflow-wrap: anywhere; font-size: 13px; }
.params-table-wrap { overflow: auto; border: 1px solid var(--tool-border); border-radius: 12px; }
.params-table { width: 100%; border-collapse: collapse; font-size: 12px; }
.params-table th, .params-table td { padding: 10px 12px; text-align: left; border-bottom: 1px solid var(--tool-border); }
.params-table th { color: var(--tool-muted); font-weight: 600; background: var(--tool-panel); }
.source-pill { border-radius: 999px; background: rgba(var(--accent-rgb), 0.13); color: rgb(var(--accent-strong-rgb)); padding: 3px 8px; }
.empty-cell { text-align: center !important; color: var(--tool-muted); }

.password-layout { display: grid; grid-template-columns: minmax(0, 1.3fr) minmax(260px, 0.7fr); gap: 12px; }
.password-output { min-height: 260px; border-radius: 18px; padding: 24px; display: grid; align-content: center; justify-items: center; gap: 18px; text-align: center; color: rgba(246, 250, 255, 0.96); background: radial-gradient(circle at top, rgba(69, 139, 192, 0.54), transparent 48%), linear-gradient(145deg, rgba(17, 31, 49, 0.97), rgba(29, 58, 78, 0.9)); }
.password-output span { color: rgba(220, 232, 245, 0.7); font-size: 11px; letter-spacing: 0.12em; text-transform: uppercase; }
.password-output code { font-size: clamp(18px, 4vw, 30px); overflow-wrap: anywhere; }
.password-options { border: 1px solid var(--tool-border); border-radius: 16px; background: var(--tool-panel); padding: 18px; display: grid; align-content: center; gap: 14px; }
.range-field { display: grid !important; gap: 8px !important; }
.timestamp-input-row { display: grid; grid-template-columns: minmax(0, 1fr) 160px auto; gap: 10px; align-items: end; }
.stack-field input, .stack-field select { min-height: 38px; }
.change-inputs { display: grid; grid-template-columns: minmax(0, 1fr) auto minmax(0, 1fr); align-items: end; gap: 12px; }
.change-inputs > i { margin-bottom: 12px; color: var(--tool-muted); }
.change-result-grid { grid-template-columns: repeat(3, minmax(0, 1fr)); }
.change-primary { grid-row: span 2; align-content: center; }
.change-primary strong { font-size: clamp(28px, 6vw, 54px); }
.change-result-grid.is-up .change-primary strong { color: rgba(49, 140, 86, 0.96); }
.change-result-grid.is-down .change-primary strong { color: rgba(196, 58, 82, 0.96); }

.qr-launcher { min-height: 360px; display: grid; grid-template-columns: minmax(220px, 0.7fr) minmax(0, 1.3fr); gap: 26px; align-items: center; border-radius: 20px; padding: clamp(22px, 5vw, 48px); background: radial-gradient(circle at 20% 20%, rgba(var(--accent-rgb), 0.24), transparent 38%), var(--tool-panel); border: 1px solid var(--tool-border); }
.qr-launcher h3 { margin: 6px 0 8px; font-size: clamp(24px, 4vw, 38px); }
.qr-launcher p:not(.eyebrow) { color: var(--tool-muted); line-height: 1.7; }
.qr-visual { width: min(250px, 100%); aspect-ratio: 1; justify-self: center; border-radius: 28px; display: grid; place-items: center; position: relative; color: rgba(249, 252, 255, 0.96); background: linear-gradient(145deg, rgba(18, 31, 48, 0.98), rgba(49, 89, 115, 0.88)); box-shadow: 0 24px 60px rgba(12, 23, 38, 0.22); }
.qr-visual > i { font-size: clamp(90px, 16vw, 160px); }
.qr-visual span { position: absolute; width: 12px; height: 12px; border-radius: 4px; background: rgba(var(--accent-rgb), 0.9); animation: qr-pulse 1.8s ease-in-out infinite; }
.qr-visual span:nth-child(2) { left: 18%; top: 16%; }
.qr-visual span:nth-child(3) { right: 14%; top: 28%; animation-delay: 0.3s; }
.qr-visual span:nth-child(4) { left: 32%; bottom: 12%; animation-delay: 0.6s; }
@keyframes qr-pulse { 50% { opacity: 0.36; transform: scale(0.72); } }

@container lightapp-window-body (max-width: 1050px) {
  .toolbox-shell { grid-template-columns: 210px minmax(0, 1fr); }
  .overview-grid { grid-template-columns: repeat(2, minmax(0, 1fr)); }
  .two-pane, .password-layout { grid-template-columns: 1fr; }
  .tool-textarea { min-height: 210px; }
}

@container lightapp-window-body (max-width: 720px) {
  .toolbox-shell { grid-template-columns: 1fr; }
  .tool-rail { max-height: none; grid-auto-flow: column; grid-auto-columns: minmax(190px, 230px); overflow-x: auto; overflow-y: hidden; }
  .rail-group { display: contents; }
  .rail-group-label { display: none; }
  .rail-home, .rail-tool { min-height: 64px; }
  .toolbox-hero { min-height: 150px; }
  .hero-orbit { display: none; }
  .overview-grid, .url-structure-grid, .timestamp-grid, .change-result-grid { grid-template-columns: 1fr; }
  .timestamp-input-row, .change-inputs { grid-template-columns: 1fr; }
  .change-inputs > i { transform: rotate(90deg); justify-self: center; margin: 0; }
  .change-primary { grid-row: auto; }
  .qr-launcher { grid-template-columns: 1fr; }
  .qr-visual { max-width: 180px; }
  .toolbar-search-wrap { min-width: 180px; flex: 1 1 220px; }
}

@media (prefers-reduced-motion: reduce) {
  .hero-orbit, .qr-visual span { animation: none; }
}
</style>
