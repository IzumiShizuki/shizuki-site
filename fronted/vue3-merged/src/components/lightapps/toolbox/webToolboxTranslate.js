import { HttpError, httpRequest, normalizeApiData } from '../../../services/httpClient';

/**
 * Web Toolbox「文本翻译」前端模块。
 * 文本经站点后端 /api/v1/tools/translate 代理转发给翻译引擎，
 * API Key 只保存在服务端，浏览器不会接触密钥。
 */

export const TRANSLATE_PROVIDERS = Object.freeze([
  { code: 'baidu', label: '百度翻译' },
  { code: 'deepl', label: 'DeepL' }
]);

export const TRANSLATE_LANGUAGES = Object.freeze([
  { code: 'auto', label: '自动检测', sourceOnly: true, providers: ['baidu', 'deepl'] },
  { code: 'zh', label: '中文（简体）', providers: ['baidu', 'deepl'] },
  { code: 'cht', label: '中文（繁体）', providers: ['baidu', 'deepl'] },
  { code: 'yue', label: '粤语', providers: ['baidu'] },
  { code: 'wyw', label: '文言文', providers: ['baidu'] },
  { code: 'en', label: '英语', providers: ['baidu', 'deepl'] },
  { code: 'ja', label: '日语', providers: ['baidu', 'deepl'] },
  { code: 'ko', label: '韩语', providers: ['baidu', 'deepl'] },
  { code: 'fr', label: '法语', providers: ['baidu', 'deepl'] },
  { code: 'de', label: '德语', providers: ['baidu', 'deepl'] },
  { code: 'es', label: '西班牙语', providers: ['baidu', 'deepl'] },
  { code: 'ru', label: '俄语', providers: ['baidu', 'deepl'] },
  { code: 'pt', label: '葡萄牙语', providers: ['baidu', 'deepl'] },
  { code: 'it', label: '意大利语', providers: ['baidu', 'deepl'] },
  { code: 'nl', label: '荷兰语', providers: ['baidu', 'deepl'] },
  { code: 'pl', label: '波兰语', providers: ['baidu', 'deepl'] },
  { code: 'th', label: '泰语', providers: ['baidu'] },
  { code: 'vi', label: '越南语', providers: ['baidu'] },
  { code: 'ar', label: '阿拉伯语', providers: ['baidu', 'deepl'] }
]);

export function findTranslateLanguage(code) {
  const normalized = String(code || '').trim().toLowerCase();
  return TRANSLATE_LANGUAGES.find((item) => item.code === normalized) || null;
}

export function isTranslateLanguageSupported(provider, code, options = {}) {
  const language = findTranslateLanguage(code);
  if (!language) return false;
  if (options.target && language.sourceOnly) return false;
  const normalizedProvider = String(provider || '').trim().toLowerCase();
  if (!normalizedProvider) return true;
  return language.providers.includes(normalizedProvider);
}

export function translateSourceLanguages(provider) {
  return TRANSLATE_LANGUAGES.filter((item) => isTranslateLanguageSupported(provider, item.code));
}

export function translateTargetLanguages(provider) {
  return TRANSLATE_LANGUAGES.filter((item) => isTranslateLanguageSupported(provider, item.code, { target: true }));
}

function toObject(value) {
  return value && typeof value === 'object' && !Array.isArray(value) ? value : {};
}

export function normalizeTranslateResult(raw) {
  const source = toObject(raw);
  return {
    provider: String(source.provider || ''),
    from: String(source.from || ''),
    to: String(source.to || ''),
    detectedFrom: String(source.detectedFrom ?? source.detected_from ?? ''),
    text: String(source.text ?? '')
  };
}

export function normalizeTranslateProviders(raw) {
  const source = toObject(raw);
  const rawProviders = Array.isArray(source.providers) ? source.providers : [];
  const providers = rawProviders
    .map((item) => {
      const entry = toObject(item);
      return {
        code: String(entry.code || '').toLowerCase(),
        label: String(entry.label || entry.code || ''),
        configured: Boolean(entry.configured)
      };
    })
    .filter((item) => item.code);
  const fallbackDefault = providers.find((item) => item.configured)?.code || 'baidu';
  const declaredDefault = String(source.defaultProvider ?? source.default_provider ?? '').toLowerCase();
  return {
    enabled: source.enabled !== false,
    defaultProvider: providers.some((item) => item.code === declaredDefault) ? declaredDefault : fallbackDefault,
    maxTextLength: Number(source.maxTextLength ?? source.max_text_length) > 0
      ? Number(source.maxTextLength ?? source.max_text_length)
      : 3000,
    providers
  };
}

export function describeTranslateError(error) {
  if (error?.name === 'AbortError') return '翻译请求已取消';
  if (error instanceof HttpError) {
    if (error.problemCode === 'TIMEOUT') return '翻译请求超时，请稍后重试';
    if (error.status === 0) return '网络连接失败，请检查网络后重试';
    const body = toObject(error.body);
    const backendDetail = String(body.detail ?? '').trim();
    if (backendDetail) return backendDetail;
    if (error.status === 429) return '请求过于频繁，请稍候再试';
    if (error.status === 503) return '翻译服务未启用或未配置';
    return `翻译失败（HTTP ${error.status}）`;
  }
  return String(error?.message || '翻译失败，请稍后重试');
}

export async function fetchTranslateProviders(options = {}) {
  const response = await httpRequest('/api/v1/tools/translate/providers', {
    method: 'GET',
    timeoutMs: 8000,
    signal: options.signal
  });
  return normalizeTranslateProviders(normalizeApiData(response) ?? response);
}

export async function requestTranslation(payload = {}) {
  const response = await httpRequest('/api/v1/tools/translate', {
    method: 'POST',
    timeoutMs: 20000,
    signal: payload.signal,
    body: {
      text: String(payload.text ?? ''),
      from: String(payload.from || 'auto'),
      to: String(payload.to || ''),
      provider: String(payload.provider || '')
    }
  });
  return normalizeTranslateResult(normalizeApiData(response) ?? response);
}
