package io.github.shizuki.site.media.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.media.config.AsmrMusicProperties;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.web.client.RestClient;

class AsmrMusicProviderSearchTest {

    private final ObjectMapper json = new ObjectMapper();
    private final List<String> paths = new ArrayList<>();
    private HttpServer server;
    private AsmrMusicProvider provider;
    private String searchQuery;
    private Map<String, Object> searchBody;

    @BeforeEach
    void setUp() throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", this::respond);
        server.start();
        String source = "http://127.0.0.1:" + server.getAddress().getPort();
        AsmrMusicProperties properties = new AsmrMusicProperties();
        properties.setServer(source);
        properties.setBaseUrl(source);
        properties.setBaseUrls(List.of(source));
        provider = new AsmrMusicProvider(properties, RestClient.builder(), json);
    }

    @AfterEach
    void tearDown() {
        if (server != null) {
            server.stop(0);
        }
    }

    @Test
    void shouldCombineKeywordAllTagsAndAgeUnionBeforePaging() {
        var result = provider.searchFilteredWorks("雨の音", 2, 2, "dl_count", "asc",
            new LinkedHashSet<>(List.of(11L, 22L)), Set.of("general", "r15"));

        assertThat(searchQuery).isEqualTo("雨の音 $tagw:雨音$ $tagw:ASMR$ $-age:adult$");
        assertThat(searchBody).containsEntry("page", 2).containsEntry("pageSize", 2)
            .containsEntry("order", "dl_count").containsEntry("sort", "asc");
        assertThat(result.works()).extracting(AsmrMusicProvider.WorkSummary::id).containsExactly(3L, 4L);
        assertThat(result.currentPage()).isEqualTo(2);
        assertThat(result.pageSize()).isEqualTo(2);
        assertThat(result.totalCount()).isEqualTo(35);
        assertThat(paths.stream().filter("/api/tags/"::equals)).hasSize(1);
    }

    @ParameterizedTest
    @MethodSource("ageFilters")
    void shouldTranslateAgeUnionIntoUpstreamCondition(Set<String> categories, String expectedQuery) {
        provider.searchFilteredWorks("", 1, 20, "release", "desc", Set.of(), categories);

        if (expectedQuery.isEmpty()) {
            assertThat(paths).containsExactly("/api/works");
        } else {
            assertThat(searchQuery).isEqualTo(expectedQuery);
        }
    }

    static Stream<Arguments> ageFilters() {
        return Stream.of(
            Arguments.of(Set.of("general"), "$age:general$"),
            Arguments.of(Set.of("r15"), "$age:r15$"),
            Arguments.of(Set.of("adult"), "$age:adult$"),
            Arguments.of(Set.of("general", "r15"), "$-age:adult$"),
            Arguments.of(Set.of("general", "adult"), "$-age:r15$"),
            Arguments.of(Set.of("r15", "adult"), "$-age:general$"),
            Arguments.of(Set.of("general", "r15", "adult"), ""),
            Arguments.of(Set.of(), "")
        );
    }

    @Test
    void shouldAllowGeneratedFiltersBeyondUserKeywordLengthLimit() {
        String keyword = "a".repeat(64);
        provider.searchFilteredWorks(keyword, 1, 20, "release", "desc", Set.of(11L), Set.of("adult"));

        assertThat(searchQuery).isEqualTo(keyword + " $tagw:雨音$ $age:adult$");
        int completedRequests = paths.size();
        assertThatThrownBy(() -> provider.searchFilteredWorks(keyword + "b", 1, 20,
            "release", "desc", Set.of(11L), Set.of("adult")))
            .isInstanceOf(BusinessException.class).hasMessageContaining("too long");
        assertThat(paths).hasSize(completedRequests);
    }

    @Test
    void shouldReturnNoMatchesForUnknownTagWithoutBroadeningSearch() {
        var result = provider.searchFilteredWorks("rain", 1, 20, "release", "desc",
            Set.of(999L), Set.of());

        assertThat(result.works()).isEmpty();
        assertThat(result.totalCount()).isZero();
        assertThat(paths).containsExactly("/api/tags/");
    }

    @Test
    void shouldHonorInitialAndAppendSizesForFilteredSearch() {
        var initial = provider.searchFilteredWorks("", 1, 20, "release", "desc", Set.of(), Set.of("general"));
        var append = provider.searchFilteredWorks("", 3, 10, "release", "desc", Set.of(), Set.of("general"));
        var last = provider.searchFilteredWorks("", 4, 10, "release", "desc", Set.of(), Set.of("general"));

        assertThat(initial.works()).extracting(AsmrMusicProvider.WorkSummary::id)
            .containsExactlyElementsOf(IntStream.rangeClosed(1, 20).mapToObj(value -> (long) value).toList());
        assertThat(append.works()).extracting(AsmrMusicProvider.WorkSummary::id)
            .containsExactlyElementsOf(IntStream.rangeClosed(21, 30).mapToObj(value -> (long) value).toList());
        assertThat(last.works()).extracting(AsmrMusicProvider.WorkSummary::id)
            .containsExactly(31L, 32L, 33L, 34L, 35L);
        assertThat(last.totalCount()).isEqualTo(35);
    }

    @Test
    void shouldHonorInitialAndAppendSizesForUnfilteredList() {
        var initial = provider.listWorks(1, 20, "release", "desc");
        var append = provider.listWorks(3, 10, "release", "desc");

        assertThat(initial.works()).hasSize(20);
        assertThat(append.works()).extracting(AsmrMusicProvider.WorkSummary::id)
            .containsExactlyElementsOf(IntStream.rangeClosed(21, 30).mapToObj(value -> (long) value).toList());
        assertThat(append.pageSize()).isEqualTo(10);
    }

    private void respond(HttpExchange exchange) throws IOException {
        String path = exchange.getRequestURI().getPath();
        paths.add(path);
        Object response;
        if ("/api/tags/".equals(path)) {
            response = List.of(Map.of("id", 11, "name", "雨音"), Map.of("id", 22, "name", "ASMR"));
        } else {
            Map<String, Object> parameters;
            if ("POST".equals(exchange.getRequestMethod())) {
                searchQuery = path.substring("/api/search/".length());
                searchBody = json.readValue(exchange.getRequestBody(), new TypeReference<>() {});
                parameters = searchBody;
            } else {
                parameters = new LinkedHashMap<>();
                for (String part : exchange.getRequestURI().getRawQuery().split("&")) {
                    String[] pair = part.split("=", 2);
                    parameters.put(pair[0], URLDecoder.decode(pair[1], StandardCharsets.UTF_8));
                }
            }
            int page = Integer.parseInt(parameters.getOrDefault("page", 1).toString());
            int size = Integer.parseInt(parameters.getOrDefault("pageSize", 20).toString());
            List<Map<String, Object>> works = IntStream.range((page - 1) * size, Math.min(35, page * size))
                .mapToObj(index -> Map.<String, Object>of("id", index + 1, "title", "work-" + (index + 1)))
                .toList();
            response = Map.of("works", works,
                "pagination", Map.of("currentPage", page, "pageSize", size, "totalCount", 35));
        }
        byte[] bytes = json.writeValueAsBytes(response);
        exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
        exchange.sendResponseHeaders(200, bytes.length);
        try (var output = exchange.getResponseBody()) {
            output.write(bytes);
        }
    }
}
