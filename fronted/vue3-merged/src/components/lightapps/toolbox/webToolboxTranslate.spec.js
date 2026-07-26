import { afterEach, describe, expect, it, vi } from 'vitest';
import {
  describeTranslateError,
  fetchTranslateProviders,
  findTranslateLanguage,
  isTranslateLanguageSupported,
  normalizeTranslateProviders,
  normalizeTranslateResult,
  requestTranslation,
  translateSourceLanguages,
  translateTargetLanguages
} from './webToolboxTranslate';
import { HttpError } from '../../../services/httpClient';

function jsonResponse(payload, init = {}) {
  return new Response(JSON.stringify(payload), {
    status: init.status ?? 200,
    headers: { 'Content-Type': 'application/json' }
  });
}

afterEach(() => {
  vi.unstubAllGlobals();
});

describe('webToolboxTranslate', () => {
  it('filters languages per provider', () => {
    const baiduSources = translateSourceLanguages('baidu').map((item) => item.code);
    expect(baiduSources).toContain('auto');
    expect(baiduSources).toContain('yue');
    expect(baiduSources).toContain('wyw');

    const deeplSources = translateSourceLanguages('deepl').map((item) => item.code);
    expect(deeplSources).toContain('auto');
    expect(deeplSources).not.toContain('yue');
    expect(deeplSources).not.toContain('th');

    const deeplTargets = translateTargetLanguages('deepl').map((item) => item.code);
    expect(deeplTargets).not.toContain('auto');
    expect(deeplTargets).toContain('cht');
  });

  it('checks language support with target semantics', () => {
    expect(isTranslateLanguageSupported('baidu', 'auto')).toBe(true);
    expect(isTranslateLanguageSupported('baidu', 'auto', { target: true })).toBe(false);
    expect(isTranslateLanguageSupported('deepl', 'vi')).toBe(false);
    expect(isTranslateLanguageSupported('', 'zh')).toBe(true);
    expect(findTranslateLanguage('ZH')).toMatchObject({ code: 'zh' });
    expect(findTranslateLanguage('nope')).toBeNull();
  });

  it('normalizes translate results from snake_case or camelCase payloads', () => {
    expect(normalizeTranslateResult({ provider: 'baidu', detected_from: 'en', text: '你好' })).toMatchObject({
      provider: 'baidu',
      detectedFrom: 'en',
      text: '你好'
    });
    expect(normalizeTranslateResult({ detectedFrom: 'ja', text: '' })).toMatchObject({ detectedFrom: 'ja', text: '' });
    expect(normalizeTranslateResult(null).text).toBe('');
  });

  it('normalizes provider info and falls back to a configured default', () => {
    const info = normalizeTranslateProviders({
      enabled: true,
      default_provider: 'deepl',
      max_text_length: 5000,
      providers: [
        { code: 'baidu', label: '百度翻译', configured: false },
        { code: 'deepl', label: 'DeepL', configured: true }
      ]
    });
    expect(info.defaultProvider).toBe('deepl');
    expect(info.maxTextLength).toBe(5000);
    expect(info.providers).toHaveLength(2);

    const fallback = normalizeTranslateProviders({
      default_provider: 'nope',
      providers: [
        { code: 'baidu', configured: false },
        { code: 'deepl', configured: true }
      ]
    });
    expect(fallback.defaultProvider).toBe('deepl');
    expect(normalizeTranslateProviders(null).maxTextLength).toBe(3000);
  });

  it('describes translate errors in a friendly way', () => {
    expect(describeTranslateError(new HttpError('too many', { status: 429, detail: '请求过于频繁，请稍候再试' })))
      .toBe('请求过于频繁，请稍候再试');
    expect(describeTranslateError(new HttpError('bad', { status: 503, detail: '' })))
      .toBe('翻译服务未启用或未配置');
    expect(describeTranslateError(new HttpError('net', { status: 0, problemCode: 'NETWORK_ERROR' })))
      .toBe('网络连接失败，请检查网络后重试');
    expect(describeTranslateError(new HttpError('timeout', { status: 0, problemCode: 'TIMEOUT' })))
      .toBe('翻译请求超时，请稍后重试');
    const abortError = new Error('aborted');
    abortError.name = 'AbortError';
    expect(describeTranslateError(abortError)).toBe('翻译请求已取消');
    expect(describeTranslateError(new Error('boom'))).toBe('boom');
  });

  it('posts translation requests and unwraps the data envelope', async () => {
    const fetchMock = vi.fn().mockResolvedValue(jsonResponse({
      data: { provider: 'baidu', from: 'auto', to: 'zh', detected_from: 'en', text: '你好，世界' }
    }));
    vi.stubGlobal('fetch', fetchMock);

    const result = await requestTranslation({ text: 'hello, world', from: 'auto', to: 'zh', provider: 'baidu' });
    expect(result).toMatchObject({ text: '你好，世界', detectedFrom: 'en' });

    expect(fetchMock).toHaveBeenCalledTimes(1);
    const [url, options] = fetchMock.mock.calls[0];
    expect(String(url)).toContain('/api/v1/tools/translate');
    expect(options.method).toBe('POST');
    expect(JSON.parse(options.body)).toEqual({ text: 'hello, world', from: 'auto', to: 'zh', provider: 'baidu' });
  });

  it('fetches provider availability', async () => {
    const fetchMock = vi.fn().mockResolvedValue(jsonResponse({
      data: {
        enabled: true,
        default_provider: 'baidu',
        max_text_length: 3000,
        providers: [{ code: 'baidu', label: '百度翻译', configured: true }]
      }
    }));
    vi.stubGlobal('fetch', fetchMock);

    const info = await fetchTranslateProviders();
    expect(info.enabled).toBe(true);
    expect(info.providers[0]).toMatchObject({ code: 'baidu', configured: true });
    expect(String(fetchMock.mock.calls[0][0])).toContain('/api/v1/tools/translate/providers');
  });

  it('surfaces problem detail from backend errors', async () => {
    const fetchMock = vi.fn().mockResolvedValue(new Response(
      JSON.stringify({ status: 503, code: 'TRANSLATE_NOT_CONFIGURED', detail: '服务器尚未配置百度翻译密钥' }),
      { status: 503, headers: { 'Content-Type': 'application/problem+json' } }
    ));
    vi.stubGlobal('fetch', fetchMock);

    let caught = null;
    try {
      await requestTranslation({ text: 'hello', from: 'auto', to: 'zh', provider: 'baidu' });
    } catch (error) {
      caught = error;
    }
    expect(caught).toBeInstanceOf(HttpError);
    expect(describeTranslateError(caught)).toBe('服务器尚未配置百度翻译密钥');
  });
});
