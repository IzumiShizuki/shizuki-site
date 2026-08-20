package io.github.shizuki.site.content.support;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.jupiter.api.Test;

class KjToolSourceServiceTest {

    @Test
    void normalizesSupportedAndUnsupportedCatalogTypes() {
        KjToolSourceService service = service((action, id, maxBytes) -> """
            {
              "apps": [
                {"id":"drawing-1","name":"画板","type":"code","downloads":12},
                {"id":"site-1","name":"工具站","type":"website"},
                {"id":"python-1","name":"Python","type":"plugin-python"},
                {"id":"bad id","name":"非法标识","type":"code"}
              ],
              "categories": [{"id":"efficiency","name":"效率工具","icon":"fa-bolt"}]
            }
            """);

        KjToolSourceService.CatalogView catalog = service.catalog(false);

        assertTrue(catalog.enabled());
        assertEquals(3, catalog.tools().size());
        assertEquals("document", catalog.tools().get(0).launchMode());
        assertEquals("website", catalog.tools().get(1).launchMode());
        assertFalse(catalog.tools().get(2).compatible());
        assertTrue(catalog.tools().get(2).incompatibleReason().contains("plugin-python"));
        assertEquals("效率工具", catalog.categories().get(0).name());
    }

    @Test
    void normalizesDocumentAndWebsiteDetails() {
        KjToolSourceService documentService = service((action, id, maxBytes) -> """
            {"app":{"id":"drawing-1","name":"画板","type":"code","config":{
              "html":"<main>draw</main>","css":"main{color:red}","js":"document.title='draw'"
            }}}
            """);
        KjToolSourceService.ToolDetailView document = documentService.toolDetail("drawing-1");
        assertTrue(document.compatible());
        assertEquals("document", document.launchMode());
        assertEquals("<main>draw</main>", document.html());

        KjToolSourceService websiteService = service((action, id, maxBytes) -> """
            {"app":{"id":"site-1","name":"工具站","type":"website","config":{"url":"https://example.com/tool"}}}
            """);
        KjToolSourceService.ToolDetailView website = websiteService.toolDetail("site-1");
        assertTrue(website.compatible());
        assertEquals("website", website.launchMode());
        assertEquals("https://example.com/tool", website.url());
    }

    @Test
    void rejectsInvalidToolIdBeforeCallingUpstream() {
        AtomicInteger calls = new AtomicInteger();
        KjToolSourceService service = service((action, id, maxBytes) -> {
            calls.incrementAndGet();
            return "{}";
        });

        KjToolSourceService.KjToolSourceException exception = assertThrows(
            KjToolSourceService.KjToolSourceException.class,
            () -> service.toolDetail("../../admin"));

        assertEquals(400, exception.getStatus());
        assertEquals("KJ_TOOL_INVALID_ID", exception.getCode());
        assertEquals(0, calls.get());
    }

    @Test
    void disabledCatalogDoesNotCallUpstream() {
        KjToolSourceProperties properties = properties();
        properties.setEnabled(false);
        AtomicInteger calls = new AtomicInteger();
        KjToolSourceService service = new KjToolSourceService(
            properties,
            new ObjectMapper(),
            (action, id, maxBytes) -> {
                calls.incrementAndGet();
                return "{}";
            },
            System::currentTimeMillis);

        KjToolSourceService.CatalogView catalog = service.catalog(false);

        assertFalse(catalog.enabled());
        assertTrue(catalog.tools().isEmpty());
        assertEquals(0, calls.get());
        assertEquals(503, assertThrows(
            KjToolSourceService.KjToolSourceException.class,
            () -> service.toolDetail("drawing-1")).getStatus());
    }

    @Test
    void rejectsMalformedAndMissingUpstreamData() {
        KjToolSourceService malformed = service((action, id, maxBytes) -> "not-json");
        assertEquals("KJ_SOURCE_INVALID_RESPONSE", assertThrows(
            KjToolSourceService.KjToolSourceException.class,
            () -> malformed.catalog(false)).getCode());

        KjToolSourceService missing = service((action, id, maxBytes) -> "{\"apps\":{}}");
        assertEquals(502, assertThrows(
            KjToolSourceService.KjToolSourceException.class,
            () -> missing.catalog(false)).getStatus());

        KjToolSourceService gone = service((action, id, maxBytes) -> "{}");
        assertEquals(404, assertThrows(
            KjToolSourceService.KjToolSourceException.class,
            () -> gone.toolDetail("gone-1")).getStatus());
    }

    @Test
    void cachesCatalogAndDetailUntilExpiryAndSupportsRefresh() {
        AtomicInteger catalogCalls = new AtomicInteger();
        AtomicInteger detailCalls = new AtomicInteger();
        AtomicLong now = new AtomicLong(1_000L);
        KjToolSourceProperties properties = properties();
        properties.setCacheTtlSeconds(5);
        KjToolSourceService service = new KjToolSourceService(
            properties,
            new ObjectMapper(),
            (action, id, maxBytes) -> {
                if ("apps".equals(action)) {
                    catalogCalls.incrementAndGet();
                    return "{\"apps\":[]}";
                }
                detailCalls.incrementAndGet();
                return "{\"app\":{\"id\":\"clock-1\",\"name\":\"时钟\",\"type\":\"code\",\"config\":{\"html\":\"<p>clock</p>\"}}}";
            },
            now::get);

        service.catalog(false);
        service.catalog(false);
        assertEquals(1, catalogCalls.get());
        service.catalog(true);
        assertEquals(2, catalogCalls.get());

        service.toolDetail("clock-1");
        service.toolDetail("clock-1");
        assertEquals(1, detailCalls.get());
        now.addAndGet(5_001L);
        service.toolDetail("clock-1");
        assertEquals(2, detailCalls.get());
    }

    @Test
    void refusesUnsafeWebsiteUrlsAndEmptyDocumentPayloads() {
        KjToolSourceService unsafeWebsite = service((action, id, maxBytes) -> """
            {"app":{"id":"site-1","name":"bad","type":"website","config":{"url":"javascript:alert(1)"}}}
            """);
        assertFalse(unsafeWebsite.toolDetail("site-1").compatible());

        KjToolSourceService emptyDocument = service((action, id, maxBytes) -> """
            {"app":{"id":"code-1","name":"empty","type":"code","config":{}}}
            """);
        assertFalse(emptyDocument.toolDetail("code-1").compatible());
    }

    private static KjToolSourceService service(KjToolSourceService.UpstreamGateway gateway) {
        return new KjToolSourceService(properties(), new ObjectMapper(), gateway, System::currentTimeMillis);
    }

    private static KjToolSourceProperties properties() {
        KjToolSourceProperties properties = new KjToolSourceProperties();
        properties.setEnabled(true);
        properties.setCacheTtlSeconds(30);
        properties.setMaxCatalogItems(50);
        properties.setMaxResponseBytes(64 * 1024);
        return properties;
    }
}
