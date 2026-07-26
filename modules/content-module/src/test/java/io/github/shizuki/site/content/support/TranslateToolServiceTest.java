package io.github.shizuki.site.content.support;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TranslateToolServiceTest {

    @Test
    void mapsUnifiedLanguagesToProviderCodes() {
        assertEquals("auto", TranslateToolService.mapLanguage("baidu", "auto", true));
        assertEquals("jp", TranslateToolService.mapLanguage("baidu", "ja", false));
        assertEquals("kor", TranslateToolService.mapLanguage("baidu", "ko", false));
        assertEquals("", TranslateToolService.mapLanguage("deepl", "auto", true));
        assertEquals("ZH", TranslateToolService.mapLanguage("deepl", "zh", true));
        assertEquals("ZH-HANT", TranslateToolService.mapLanguage("deepl", "cht", false));
        assertEquals("EN-US", TranslateToolService.mapLanguage("deepl", "en", false));
    }

    @Test
    void rejectsUnsupportedDirections() {
        assertNull(TranslateToolService.mapLanguage("baidu", "auto", false), "auto 不能作为目标语言");
        assertNull(TranslateToolService.mapLanguage("deepl", "auto", false));
        assertNull(TranslateToolService.mapLanguage("deepl", "yue", false), "DeepL 不支持粤语");
        assertNull(TranslateToolService.mapLanguage("deepl", "th", true), "DeepL 不支持泰语");
        assertNull(TranslateToolService.mapLanguage("unknown", "zh", true));
        assertNull(TranslateToolService.mapLanguage("baidu", "xx", true));
    }

    @Test
    void baiduSignMatchesDocumentedExample() {
        // 百度官方文档示例：appid=2015063000000001 q=apple salt=1435660288 密钥=12345678
        assertEquals("f89f9594663708c1605f3d736d01d2d4",
            TranslateToolService.baiduSign("2015063000000001", "apple", "1435660288", "12345678"));
        // 含中文与换行的 UTF-8 用例
        assertEquals("9c0ae807865221148e515f925a257618",
            TranslateToolService.baiduSign("myapp", "你好\n世界", "42", "secret"));
    }

    @Test
    void parsesBaiduSuccessAndJoinsSegments() {
        String body = "{\"from\":\"en\",\"to\":\"zh\",\"trans_result\":["
            + "{\"src\":\"hello\",\"dst\":\"你好\"},"
            + "{\"src\":\"world\",\"dst\":\"世界\"}]}";
        TranslateToolService.BaiduOutcome outcome = TranslateToolService.parseBaiduResponse(body);
        assertEquals("你好\n世界", outcome.text());
        assertEquals("en", outcome.detectedLanguage());
    }

    @Test
    void mapsBaiduErrorCodesToFriendlyMessages() {
        String qps = "{\"error_code\":\"54003\",\"error_msg\":\"Invalid Access Limit\"}";
        TranslateToolService.TranslateToolException limited = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> TranslateToolService.parseBaiduResponse(qps));
        assertEquals(429, limited.getStatus());

        String badSign = "{\"error_code\":\"54001\",\"error_msg\":\"Invalid Sign\"}";
        TranslateToolService.TranslateToolException sign = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> TranslateToolService.parseBaiduResponse(badSign));
        assertEquals(502, sign.getStatus());
        assertTrue(sign.getMessage().contains("签名"));
    }

    @Test
    void parsesDeeplResponseWithDetectedLanguage() {
        String body = "{\"translations\":[{\"detected_source_language\":\"EN\",\"text\":\"你好，世界\"}]}";
        TranslateToolService.DeeplOutcome outcome = TranslateToolService.parseDeeplResponse(body);
        assertEquals("你好，世界", outcome.text());
        assertEquals("EN", outcome.detectedLanguage());
        assertEquals("en", TranslateToolService.unifiedFromDeepl(outcome.detectedLanguage()));
    }

    @Test
    void mapsDetectedLanguagesBackToUnifiedCodes() {
        assertEquals("ja", TranslateToolService.unifiedFromBaidu("jp"));
        assertEquals("zh", TranslateToolService.unifiedFromBaidu("zh"));
        assertEquals("xx", TranslateToolService.unifiedFromBaidu("xx"));
        assertEquals("zh", TranslateToolService.unifiedFromDeepl("ZH"));
        assertEquals("tr", TranslateToolService.unifiedFromDeepl("TR"));
        assertEquals("", TranslateToolService.unifiedFromDeepl(null));
    }

    @Test
    void resolvesDeeplEndpointByKeySuffix() {
        TranslateToolProperties.Deepl freeConfig = new TranslateToolProperties.Deepl();
        freeConfig.setAuthKey("abcd-1234:fx");
        assertEquals("https://api-free.deepl.com/v2/translate", TranslateToolService.resolveDeeplEndpoint(freeConfig));

        TranslateToolProperties.Deepl proConfig = new TranslateToolProperties.Deepl();
        proConfig.setAuthKey("abcd-1234");
        assertEquals("https://api.deepl.com/v2/translate", TranslateToolService.resolveDeeplEndpoint(proConfig));

        TranslateToolProperties.Deepl explicitConfig = new TranslateToolProperties.Deepl();
        explicitConfig.setAuthKey("abcd-1234:fx");
        explicitConfig.setEndpoint("https://example.com/v2/translate");
        assertEquals("https://example.com/v2/translate", TranslateToolService.resolveDeeplEndpoint(explicitConfig));
    }

    @Test
    void limiterEnforcesPerMinuteWindow() {
        TranslateToolService.FixedWindowLimiter limiter = new TranslateToolService.FixedWindowLimiter();
        long base = 1_700_000_000_000L;
        assertTrue(limiter.tryAcquire("1.2.3.4", base, 2));
        assertTrue(limiter.tryAcquire("1.2.3.4", base + 1000, 2));
        assertFalse(limiter.tryAcquire("1.2.3.4", base + 2000, 2));
        // 其他 IP 不受影响
        assertTrue(limiter.tryAcquire("5.6.7.8", base + 2000, 2));
        // 下一分钟窗口重置
        assertTrue(limiter.tryAcquire("1.2.3.4", base + 61_000, 2));
    }

    @Test
    void dailyBudgetResetsOnNewDay() {
        TranslateToolService.DailyCharBudget budget = new TranslateToolService.DailyCharBudget();
        assertTrue(budget.tryConsume(100L, 60, 100L));
        assertFalse(budget.tryConsume(100L, 60, 100L));
        assertTrue(budget.tryConsume(101L, 60, 100L));
        // 预算为 0 表示不限制
        assertTrue(budget.tryConsume(101L, 999_999, 0L));
    }

    @Test
    void validatesRequestsBeforeCallingUpstream() {
        TranslateToolProperties properties = new TranslateToolProperties();
        properties.setMaxTextLength(10);
        TranslateToolService service = new TranslateToolService(properties);

        TranslateToolService.TranslateToolException blank = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> service.translate("baidu", "   ", "auto", "zh", "test"));
        assertEquals(400, blank.getStatus());

        TranslateToolService.TranslateToolException tooLong = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> service.translate("baidu", "0123456789A", "auto", "zh", "test"));
        assertEquals("TRANSLATE_TEXT_TOO_LONG", tooLong.getCode());

        TranslateToolService.TranslateToolException sameLanguage = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> service.translate("baidu", "hello", "en", "en", "test"));
        assertEquals(400, sameLanguage.getStatus());

        TranslateToolService.TranslateToolException autoTarget = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> service.translate("baidu", "hello", "auto", "auto", "test"));
        assertEquals(400, autoTarget.getStatus());

        TranslateToolService.TranslateToolException unsupported = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> service.translate("deepl", "hello", "auto", "yue", "test"));
        assertEquals("TRANSLATE_LANGUAGE_UNSUPPORTED", unsupported.getCode());

        // 未配置密钥时应返回 503，而不是把请求发往上游
        TranslateToolService.TranslateToolException notConfigured = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> service.translate("baidu", "hello", "auto", "zh", "test"));
        assertEquals(503, notConfigured.getStatus());
        assertEquals("TRANSLATE_NOT_CONFIGURED", notConfigured.getCode());
    }

    @Test
    void disabledServiceShortCircuits() {
        TranslateToolProperties properties = new TranslateToolProperties();
        properties.setEnabled(false);
        TranslateToolService service = new TranslateToolService(properties);
        TranslateToolService.TranslateToolException disabled = assertThrows(
            TranslateToolService.TranslateToolException.class,
            () -> service.translate("baidu", "hello", "auto", "zh", "test"));
        assertEquals(503, disabled.getStatus());
        assertEquals("TRANSLATE_DISABLED", disabled.getCode());
    }

    @Test
    void providersViewReflectsConfiguration() {
        TranslateToolProperties properties = new TranslateToolProperties();
        properties.getBaidu().setAppId("app");
        properties.getBaidu().setAppSecret("secret");
        TranslateToolService service = new TranslateToolService(properties);
        TranslateToolService.ProvidersView view = service.providers();
        assertTrue(view.enabled());
        assertEquals("baidu", view.defaultProvider());
        assertEquals(2, view.providers().size());
        assertTrue(view.providers().get(0).configured());
        assertFalse(view.providers().get(1).configured());
    }
}
