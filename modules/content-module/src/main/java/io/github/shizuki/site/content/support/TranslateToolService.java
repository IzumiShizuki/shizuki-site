package io.github.shizuki.site.content.support;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;

/**
 * Web Toolbox「文本翻译」的服务端代理。
 *
 * <p>负责统一语言代码映射、按引擎（百度翻译 / DeepL）调用上游接口、
 * 以及针对匿名访客的轻量限流与每日字符预算保护。</p>
 */
@Service
public class TranslateToolService {

    public static final String PROVIDER_BAIDU = "baidu";
    public static final String PROVIDER_DEEPL = "deepl";

    private static final String DEEPL_FREE_ENDPOINT = "https://api-free.deepl.com/v2/translate";
    private static final String DEEPL_PRO_ENDPOINT = "https://api.deepl.com/v2/translate";

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /** 统一语言代码与各引擎语言代码的映射；null 表示该引擎不支持。 */
    record LanguageMapping(String unified, String label, String baidu, String deeplSource, String deeplTarget) {
    }

    static final List<LanguageMapping> LANGUAGES = List.of(
        new LanguageMapping("auto", "自动检测", "auto", "", null),
        new LanguageMapping("zh", "中文（简体）", "zh", "ZH", "ZH"),
        new LanguageMapping("cht", "中文（繁体）", "cht", "ZH", "ZH-HANT"),
        new LanguageMapping("yue", "粤语", "yue", null, null),
        new LanguageMapping("wyw", "文言文", "wyw", null, null),
        new LanguageMapping("en", "英语", "en", "EN", "EN-US"),
        new LanguageMapping("ja", "日语", "jp", "JA", "JA"),
        new LanguageMapping("ko", "韩语", "kor", "KO", "KO"),
        new LanguageMapping("fr", "法语", "fra", "FR", "FR"),
        new LanguageMapping("de", "德语", "de", "DE", "DE"),
        new LanguageMapping("es", "西班牙语", "spa", "ES", "ES"),
        new LanguageMapping("ru", "俄语", "ru", "RU", "RU"),
        new LanguageMapping("pt", "葡萄牙语", "pt", "PT", "PT-PT"),
        new LanguageMapping("it", "意大利语", "it", "IT", "IT"),
        new LanguageMapping("nl", "荷兰语", "nl", "NL", "NL"),
        new LanguageMapping("pl", "波兰语", "pl", "PL", "PL"),
        new LanguageMapping("th", "泰语", "th", null, null),
        new LanguageMapping("vi", "越南语", "vie", null, null),
        new LanguageMapping("ar", "阿拉伯语", "ara", "AR", "AR"));

    private static final Map<String, String> BAIDU_ERROR_MESSAGES = Map.ofEntries(
        Map.entry("52001", "百度翻译请求超时，请稍后重试"),
        Map.entry("52002", "百度翻译系统错误，请稍后重试"),
        Map.entry("52003", "百度翻译未授权：APP ID 无效或服务未开通"),
        Map.entry("54000", "百度翻译请求参数缺失"),
        Map.entry("54001", "百度翻译签名错误：请检查 APP ID 与密钥配置"),
        Map.entry("54003", "百度翻译访问频率超限，请稍后重试"),
        Map.entry("54004", "百度翻译账户余额不足"),
        Map.entry("54005", "长文本翻译请求过于频繁，请稍后重试"),
        Map.entry("58000", "服务器 IP 未在百度翻译平台白名单内"),
        Map.entry("58001", "百度翻译不支持该语言方向"),
        Map.entry("58002", "百度翻译服务已关闭"),
        Map.entry("90107", "百度翻译认证未通过或未生效"));

    private final TranslateToolProperties properties;
    private final HttpClient httpClient;
    private final FixedWindowLimiter requestLimiter = new FixedWindowLimiter();
    private final DailyCharBudget dailyBudget = new DailyCharBudget();

    public TranslateToolService(TranslateToolProperties properties) {
        this.properties = properties;
        this.httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(Math.max(500, properties.getConnectTimeoutMs())))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();
    }

    /** 提供给前端的引擎可用性信息（不泄露任何密钥）。 */
    public ProvidersView providers() {
        return new ProvidersView(
            properties.isEnabled(),
            normalizeProvider(properties.getDefaultProvider()),
            properties.getMaxTextLength(),
            List.of(
                new ProviderView(PROVIDER_BAIDU, "百度翻译", properties.getBaidu().isConfigured()),
                new ProviderView(PROVIDER_DEEPL, "DeepL", properties.getDeepl().isConfigured())));
    }

    public TranslationResult translate(String provider, String text, String from, String to, String clientKey) {
        if (!properties.isEnabled()) {
            throw new TranslateToolException(503, "TRANSLATE_DISABLED", "翻译服务当前未启用");
        }
        String normalizedText = text == null ? "" : text;
        if (normalizedText.isBlank()) {
            throw new TranslateToolException(400, "TRANSLATE_INVALID_PARAM", "请输入需要翻译的文本");
        }
        int maxLength = Math.max(1, properties.getMaxTextLength());
        if (normalizedText.length() > maxLength) {
            throw new TranslateToolException(400, "TRANSLATE_TEXT_TOO_LONG",
                "文本过长：最多 " + maxLength + " 字符，当前 " + normalizedText.length() + " 字符");
        }

        String normalizedProvider = normalizeProvider(provider);
        if (normalizedProvider.isEmpty()) {
            normalizedProvider = normalizeProvider(properties.getDefaultProvider());
        }
        if (!PROVIDER_BAIDU.equals(normalizedProvider) && !PROVIDER_DEEPL.equals(normalizedProvider)) {
            throw new TranslateToolException(400, "TRANSLATE_INVALID_PARAM", "未知翻译引擎: " + normalizedProvider);
        }

        String normalizedFrom = normalizeLanguage(from, "auto");
        String normalizedTo = normalizeLanguage(to, "");
        LanguageMapping fromMapping = findLanguage(normalizedFrom);
        LanguageMapping toMapping = findLanguage(normalizedTo);
        if (fromMapping == null) {
            throw new TranslateToolException(400, "TRANSLATE_INVALID_PARAM", "未知源语言: " + normalizedFrom);
        }
        if (toMapping == null || "auto".equals(normalizedTo)) {
            throw new TranslateToolException(400, "TRANSLATE_INVALID_PARAM", "请选择有效的目标语言");
        }
        if (!"auto".equals(normalizedFrom) && normalizedFrom.equals(normalizedTo)) {
            throw new TranslateToolException(400, "TRANSLATE_INVALID_PARAM", "源语言与目标语言相同，无需翻译");
        }
        String providerFrom = mapLanguage(normalizedProvider, normalizedFrom, true);
        String providerTo = mapLanguage(normalizedProvider, normalizedTo, false);
        if (providerFrom == null || providerTo == null) {
            throw new TranslateToolException(400, "TRANSLATE_LANGUAGE_UNSUPPORTED",
                providerLabel(normalizedProvider) + " 暂不支持所选语言方向");
        }

        if (PROVIDER_BAIDU.equals(normalizedProvider) && !properties.getBaidu().isConfigured()) {
            throw new TranslateToolException(503, "TRANSLATE_NOT_CONFIGURED",
                "服务器尚未配置百度翻译密钥（BAIDU_TRANSLATE_APP_ID / BAIDU_TRANSLATE_APP_SECRET）");
        }
        if (PROVIDER_DEEPL.equals(normalizedProvider) && !properties.getDeepl().isConfigured()) {
            throw new TranslateToolException(503, "TRANSLATE_NOT_CONFIGURED",
                "服务器尚未配置 DeepL 密钥（DEEPL_AUTH_KEY）");
        }

        long nowMs = System.currentTimeMillis();
        String limiterKey = clientKey == null || clientKey.isBlank() ? "anonymous" : clientKey;
        if (!requestLimiter.tryAcquire(limiterKey, nowMs, Math.max(1, properties.getRateLimitPerMinute()))) {
            throw new TranslateToolException(429, "TRANSLATE_RATE_LIMITED", "请求过于频繁，请稍候再试");
        }
        if (!dailyBudget.tryConsume(nowMs / 86_400_000L, normalizedText.length(), properties.getDailyCharBudget())) {
            throw new TranslateToolException(429, "TRANSLATE_BUDGET_EXHAUSTED", "今日翻译额度已用完，请明天再试");
        }

        if (PROVIDER_BAIDU.equals(normalizedProvider)) {
            return translateWithBaidu(normalizedText, normalizedFrom, normalizedTo, providerFrom, providerTo);
        }
        return translateWithDeepl(normalizedText, normalizedFrom, normalizedTo, providerFrom, providerTo);
    }

    private TranslationResult translateWithBaidu(String text, String from, String to, String baiduFrom, String baiduTo) {
        TranslateToolProperties.Baidu config = properties.getBaidu();
        String salt = Long.toString(ThreadLocalRandom.current().nextLong(100_000_000L, 1_000_000_000L));
        String sign = baiduSign(config.getAppId(), text, salt, config.getAppSecret());
        String form = "q=" + formEncode(text)
            + "&from=" + formEncode(baiduFrom)
            + "&to=" + formEncode(baiduTo)
            + "&appid=" + formEncode(config.getAppId())
            + "&salt=" + formEncode(salt)
            + "&sign=" + formEncode(sign);
        HttpRequest request = HttpRequest.newBuilder(URI.create(config.getEndpoint()))
            .timeout(Duration.ofMillis(Math.max(1000, properties.getReadTimeoutMs())))
            .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
            .POST(HttpRequest.BodyPublishers.ofString(form, StandardCharsets.UTF_8))
            .build();
        HttpResponse<String> response = send(request, "百度翻译");
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR",
                "百度翻译服务异常（HTTP " + response.statusCode() + "）");
        }
        BaiduOutcome outcome = parseBaiduResponse(response.body());
        String detected = "auto".equals(from) ? unifiedFromBaidu(outcome.detectedLanguage()) : "";
        return new TranslationResult(PROVIDER_BAIDU, from, to, detected, outcome.text());
    }

    private TranslationResult translateWithDeepl(String text, String from, String to, String deeplFrom, String deeplTo) {
        TranslateToolProperties.Deepl config = properties.getDeepl();
        String body;
        try {
            ObjectNode root = MAPPER.createObjectNode();
            root.putArray("text").add(text);
            root.put("target_lang", deeplTo);
            if (!deeplFrom.isEmpty()) {
                root.put("source_lang", deeplFrom);
            }
            body = MAPPER.writeValueAsString(root);
        } catch (JsonProcessingException exception) {
            throw new TranslateToolException(500, "TRANSLATE_INTERNAL_ERROR", "构造 DeepL 请求失败");
        }
        HttpRequest request = HttpRequest.newBuilder(URI.create(resolveDeeplEndpoint(config)))
            .timeout(Duration.ofMillis(Math.max(1000, properties.getReadTimeoutMs())))
            .header("Authorization", "DeepL-Auth-Key " + config.getAuthKey())
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(body, StandardCharsets.UTF_8))
            .build();
        HttpResponse<String> response = send(request, "DeepL");
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw deeplHttpError(response.statusCode());
        }
        DeeplOutcome outcome = parseDeeplResponse(response.body());
        String detected = "auto".equals(from) ? unifiedFromDeepl(outcome.detectedLanguage()) : "";
        return new TranslationResult(PROVIDER_DEEPL, from, to, detected, outcome.text());
    }

    private HttpResponse<String> send(HttpRequest request, String providerLabel) {
        try {
            return httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        } catch (IOException exception) {
            throw new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR",
                providerLabel + "连接失败或超时，请稍后重试");
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR", providerLabel + "请求被中断");
        }
    }

    // ---------- 纯函数与解析逻辑（便于单元测试） ----------

    static String normalizeProvider(String provider) {
        return provider == null ? "" : provider.trim().toLowerCase(Locale.ROOT);
    }

    static String normalizeLanguage(String language, String fallback) {
        String normalized = language == null ? "" : language.trim().toLowerCase(Locale.ROOT);
        return normalized.isEmpty() ? fallback : normalized;
    }

    static String providerLabel(String provider) {
        return PROVIDER_DEEPL.equals(provider) ? "DeepL" : "百度翻译";
    }

    static LanguageMapping findLanguage(String unified) {
        for (LanguageMapping mapping : LANGUAGES) {
            if (mapping.unified().equals(unified)) {
                return mapping;
            }
        }
        return null;
    }

    /**
     * 统一语言代码映射到引擎语言代码。
     *
     * @return 引擎代码；DeepL 源语言为 auto 时返回空串（表示省略参数）；不支持时返回 null
     */
    static String mapLanguage(String provider, String unified, boolean source) {
        LanguageMapping mapping = findLanguage(unified);
        if (mapping == null) {
            return null;
        }
        if (PROVIDER_BAIDU.equals(provider)) {
            if (!source && "auto".equals(unified)) {
                return null;
            }
            return mapping.baidu();
        }
        if (PROVIDER_DEEPL.equals(provider)) {
            return source ? mapping.deeplSource() : mapping.deeplTarget();
        }
        return null;
    }

    static String unifiedFromBaidu(String baiduCode) {
        String normalized = baiduCode == null ? "" : baiduCode.trim().toLowerCase(Locale.ROOT);
        if (normalized.isEmpty()) {
            return "";
        }
        for (LanguageMapping mapping : LANGUAGES) {
            if (normalized.equals(mapping.baidu())) {
                return mapping.unified();
            }
        }
        return normalized;
    }

    static String unifiedFromDeepl(String detected) {
        String normalized = detected == null ? "" : detected.trim().toUpperCase(Locale.ROOT);
        if (normalized.isEmpty()) {
            return "";
        }
        for (LanguageMapping mapping : LANGUAGES) {
            if (mapping.deeplSource() != null && normalized.equals(mapping.deeplSource())) {
                return mapping.unified();
            }
        }
        return normalized.toLowerCase(Locale.ROOT);
    }

    static String resolveDeeplEndpoint(TranslateToolProperties.Deepl config) {
        if (!config.getEndpoint().isEmpty()) {
            return config.getEndpoint();
        }
        return config.getAuthKey().endsWith(":fx") ? DEEPL_FREE_ENDPOINT : DEEPL_PRO_ENDPOINT;
    }

    /** 百度签名：MD5(appid + q + salt + 密钥)，q 为原始 UTF-8 文本。 */
    static String baiduSign(String appId, String query, String salt, String secret) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest((appId + query + salt + secret).getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(hash);
        } catch (NoSuchAlgorithmException exception) {
            throw new TranslateToolException(500, "TRANSLATE_INTERNAL_ERROR", "当前运行环境不支持 MD5");
        }
    }

    static String formEncode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    record BaiduOutcome(String detectedLanguage, String text) {
    }

    static BaiduOutcome parseBaiduResponse(String body) {
        JsonNode root = readTree(body, "百度翻译");
        String errorCode = root.path("error_code").asText("");
        if (!errorCode.isEmpty() && !"0".equals(errorCode)) {
            int status = "54003".equals(errorCode) || "54005".equals(errorCode) ? 429 : 502;
            String message = BAIDU_ERROR_MESSAGES.getOrDefault(errorCode,
                "百度翻译返回错误 " + errorCode + "：" + root.path("error_msg").asText("未知错误"));
            throw new TranslateToolException(status, "TRANSLATE_UPSTREAM_ERROR", message);
        }
        JsonNode segments = root.path("trans_result");
        if (!segments.isArray() || segments.isEmpty()) {
            throw new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR", "百度翻译未返回结果");
        }
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < segments.size(); index += 1) {
            if (index > 0) {
                builder.append('\n');
            }
            builder.append(segments.get(index).path("dst").asText(""));
        }
        return new BaiduOutcome(root.path("from").asText(""), builder.toString());
    }

    record DeeplOutcome(String detectedLanguage, String text) {
    }

    static DeeplOutcome parseDeeplResponse(String body) {
        JsonNode root = readTree(body, "DeepL");
        JsonNode translations = root.path("translations");
        if (!translations.isArray() || translations.isEmpty()) {
            throw new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR", "DeepL 未返回结果");
        }
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < translations.size(); index += 1) {
            if (index > 0) {
                builder.append('\n');
            }
            builder.append(translations.get(index).path("text").asText(""));
        }
        String detected = translations.get(0).path("detected_source_language").asText("");
        return new DeeplOutcome(detected, builder.toString());
    }

    static TranslateToolException deeplHttpError(int statusCode) {
        if (statusCode == 401 || statusCode == 403) {
            return new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR", "DeepL 认证失败：请检查 DEEPL_AUTH_KEY 配置");
        }
        if (statusCode == 456) {
            return new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR", "DeepL 本期字符配额已用完");
        }
        if (statusCode == 429) {
            return new TranslateToolException(429, "TRANSLATE_UPSTREAM_ERROR", "DeepL 请求过于频繁，请稍后重试");
        }
        return new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR", "DeepL 服务异常（HTTP " + statusCode + "）");
    }

    private static JsonNode readTree(String body, String providerLabel) {
        try {
            return MAPPER.readTree(body == null ? "" : body);
        } catch (JsonProcessingException exception) {
            throw new TranslateToolException(502, "TRANSLATE_UPSTREAM_ERROR", providerLabel + "返回了无法解析的内容");
        }
    }

    // ---------- 限流与预算 ----------

    /** 按 key 的固定一分钟窗口限流器。 */
    static final class FixedWindowLimiter {

        private record Window(long windowIndex, AtomicInteger count) {
        }

        private final ConcurrentHashMap<String, Window> windows = new ConcurrentHashMap<>();

        boolean tryAcquire(String key, long nowMs, int limit) {
            long windowIndex = nowMs / 60_000L;
            if (windows.size() > 4096) {
                windows.entrySet().removeIf((entry) -> entry.getValue().windowIndex() != windowIndex);
            }
            Window window = windows.compute(key, (ignored, current) ->
                current == null || current.windowIndex() != windowIndex
                    ? new Window(windowIndex, new AtomicInteger())
                    : current);
            return window.count().incrementAndGet() <= limit;
        }
    }

    /** 全站共享的每日字符预算（UTC 日界）。 */
    static final class DailyCharBudget {

        private long epochDay = -1L;
        private long usedChars;

        synchronized boolean tryConsume(long epochDay, int chars, long budget) {
            if (budget <= 0) {
                return true;
            }
            if (this.epochDay != epochDay) {
                this.epochDay = epochDay;
                this.usedChars = 0L;
            }
            if (this.usedChars + chars > budget) {
                return false;
            }
            this.usedChars += chars;
            return true;
        }
    }

    // ---------- 对外数据结构 ----------

    public record TranslationResult(
        String provider,
        String from,
        String to,
        @JsonProperty("detected_from") String detectedFrom,
        String text) {
    }

    public record ProviderView(String code, String label, boolean configured) {
    }

    public record ProvidersView(
        boolean enabled,
        @JsonProperty("default_provider") String defaultProvider,
        @JsonProperty("max_text_length") int maxTextLength,
        List<ProviderView> providers) {
    }

    /** 翻译代理业务异常：status 直接作为 HTTP 状态返回。 */
    public static class TranslateToolException extends RuntimeException {

        private final int status;
        private final String code;

        public TranslateToolException(int status, String code, String message) {
            super(message);
            this.status = status;
            this.code = code;
        }

        public int getStatus() {
            return status;
        }

        public String getCode() {
            return code;
        }
    }
}
