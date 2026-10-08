package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.net.InetSocketAddress;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URLDecoder;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow;
import java.util.regex.Pattern;

/** Read-only Pixiv Web Ajax access. Credentials are sent only to the fixed Pixiv host. */
@Component
public class PixivClient {
    private static final String BASE = "https://www.pixiv.net";
    private static final Pattern ID = Pattern.compile("[1-9][0-9]{0,11}");
    private final ObjectMapper mapper;
    private final HttpClient client;
    private final PixivPreviewCache previews = new PixivPreviewCache();
    private final Map<String, Cached> metadata = Collections.synchronizedMap(new LinkedHashMap<>() {
        @Override protected boolean removeEldestEntry(Map.Entry<String, Cached> eldest) { return size() > 128; }
    });

    @Autowired
    public PixivClient(ObjectMapper mapper,
            @Value("${shizuki.pixiv.proxy-url:${shizuki.media.wallpaper.discovery.proxy-url:}}") String proxyUrl) {
        this(mapper, createClient(proxyUrl));
    }

    PixivClient(ObjectMapper mapper, HttpClient client) {
        this.mapper = mapper;
        this.client = client;
    }

    private static HttpClient createClient(String proxyUrl) {
        HttpClient.Builder builder = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5))
                .followRedirects(HttpClient.Redirect.NEVER);
        if (proxyUrl != null && !proxyUrl.isBlank()) {
            URI proxy = URI.create(proxyUrl);
            if (!"http".equalsIgnoreCase(proxy.getScheme()) || proxy.getHost() == null) {
                throw new IllegalArgumentException("Pixiv proxy must be an HTTP proxy");
            }
            builder.proxy(ProxySelector.of(new InetSocketAddress(proxy.getHost(), proxy.getPort() < 0 ? 80 : proxy.getPort())));
            if (proxy.getRawUserInfo() != null) {
                String[] auth = proxy.getRawUserInfo().split(":", 2);
                String username = URLDecoder.decode(auth[0], StandardCharsets.UTF_8);
                char[] password = URLDecoder.decode(auth.length > 1 ? auth[1] : "", StandardCharsets.UTF_8).toCharArray();
                builder.authenticator(new Authenticator() {
                    @Override protected PasswordAuthentication getPasswordAuthentication() {
                        return getRequestorType() == RequestorType.PROXY && proxy.getHost().equalsIgnoreCase(getRequestingHost())
                                ? new PasswordAuthentication(username, password) : null;
                    }
                });
            }
        }
        return builder.build();
    }

    public static String id(String value) {
        String candidate = value == null ? "" : value.trim();
        if (!ID.matcher(candidate).matches()) {
            try {
                URI uri = URI.create(candidate);
                if (!"https".equalsIgnoreCase(uri.getScheme()) || !"www.pixiv.net".equalsIgnoreCase(uri.getHost())) {
                    throw new IllegalArgumentException();
                }
                var match = Pattern.compile("^/(?:[a-z]{2}/)?users/([1-9][0-9]{0,11})(?:/.*)?$").matcher(uri.getPath());
                if (!match.matches()) throw new IllegalArgumentException();
                candidate = match.group(1);
            } catch (IllegalArgumentException exception) {
                throw bad("请输入正确的 Pixiv 用户 ID 或 https://www.pixiv.net/users/ 主页链接");
            }
        }
        return candidate;
    }

    public JsonNode user(String userId) {
        return json("/ajax/user/" + id(userId) + "?full=1&lang=zh", "");
    }

    public JsonNode following(String userId, String session, int offset, int limit, boolean hidden) {
        return json("/ajax/user/" + id(userId) + "/following?offset=" + offset + "&limit=" + limit
                + "&rest=" + (hidden ? "hide" : "show") + "&lang=zh", session);
    }

    public List<JsonNode> latest(String userId) {
        JsonNode works = json("/ajax/user/" + id(userId) + "/works/latest?lang=zh", "").path("illusts");
        List<JsonNode> result = new ArrayList<>();
        works.forEach(work -> { if (safe(work)) result.add(work); });
        return result;
    }

    public List<JsonNode> search(String query) {
        String word = query == null ? "" : query.trim();
        if (word.isEmpty() || word.length() > 80) throw bad("搜索关键词须为 1 至 80 个字符");
        String encoded = URLEncoder.encode(word, StandardCharsets.UTF_8);
        JsonNode data = json("/ajax/search/artworks/" + encoded + "?word=" + encoded
                + "&order=date_d&mode=safe&p=1&s_mode=s_tag&type=illust_and_ugoira&lang=zh", "")
                .path("illustManga").path("data");
        List<JsonNode> result = new ArrayList<>();
        data.forEach(work -> { if (safe(work)) result.add(work); });
        return result;
    }

    public static boolean safe(JsonNode work) {
        if (!zero(work.path("xRestrict")) || (work.has("restrict") && !zero(work.path("restrict")))
                || work.path("isMasked").asBoolean() || work.path("isUnlisted").asBoolean()
                || !ID.matcher(work.path("id").asText()).matches()) return false;
        JsonNode sensitivity = work.path("sl");
        if (work.has("sl") && (!sensitivity.isIntegralNumber() || !sensitivity.canConvertToInt()
                || sensitivity.intValue() < 0 || sensitivity.intValue() > 4)) return false;
        JsonNode tags = work.path("tags");
        if (tags.isObject()) tags = tags.path("tags");
        for (JsonNode tag : tags) {
            String value = tag.isObject() ? tag.path("tag").asText() : tag.asText();
            String normalized = java.text.Normalizer.normalize(value, java.text.Normalizer.Form.NFKC)
                    .replaceAll("[-_\\s]", "");
            if ("R18".equalsIgnoreCase(normalized) || "R18G".equalsIgnoreCase(normalized)) return false;
        }
        return true;
    }

    private static boolean zero(JsonNode value) {
        return value.isIntegralNumber() && value.canConvertToInt() && value.intValue() == 0;
    }

    public record Preview(byte[] bytes, String contentType) { }

    public Preview preview(String artworkId) {
        String checkedId = id(artworkId);
        JsonNode detail = json("/ajax/illust/" + checkedId + "?lang=zh", "");
        // Detail uses illustId; listings use id. Never trust a client-provided image URL.
        var normalized = detail.deepCopy();
        if (normalized.isObject()) ((com.fasterxml.jackson.databind.node.ObjectNode) normalized)
                .put("id", detail.path("illustId").asText());
        if (!safe(normalized) || !checkedId.equals(detail.path("illustId").asText())) throw bad("作品已不可用或不属于全年龄内容");
        String url = detail.path("urls").path("regular").asText();
        URI uri;
        try { uri = URI.create(url); } catch (IllegalArgumentException exception) { throw bad("作品图片地址不可用"); }
        String host = uri.getHost();
        if (!"https".equalsIgnoreCase(uri.getScheme()) || host == null
                || !(host.equals("i.pximg.net") || host.equals("s.pximg.net"))
                || uri.getRawUserInfo() != null || (uri.getPort() != -1 && uri.getPort() != 443)) {
            throw bad("作品图片来源不受信任");
        }
        return previews.getOrLoad(uri.toString(), () -> {
            HttpResponse<byte[]> response = send(request(uri).GET().build(), 8 * 1024 * 1024);
            String type = response.headers().firstValue("Content-Type").orElse("").split(";")[0].trim().toLowerCase(java.util.Locale.ROOT);
            if (!List.of("image/jpeg", "image/png", "image/webp").contains(type)) throw bad("作品图片格式不受支持");
            return new Preview(response.body(), type);
        });
    }

    private JsonNode json(String path, String session) {
        boolean cacheable = (session == null || session.isBlank()) && !path.startsWith("/ajax/illust/");
        Cached cached = cacheable ? metadata.get(path) : null;
        if (cached != null && cached.expiresAt() > System.currentTimeMillis()) return cached.data().deepCopy();
        HttpRequest.Builder request = request(URI.create(BASE + path)).header("Accept", "application/json");
        if (session != null && !session.isBlank()) request.header("Cookie", "PHPSESSID=" + session);
        HttpResponse<byte[]> response = send(request.GET().build(), 2 * 1024 * 1024);
        try {
            JsonNode data = mapper.readTree(response.body());
            if (data == null || data.path("error").asBoolean() || !data.has("body")) throw bad("Pixiv 请求失败；请检查登录会话或稍后重试");
            JsonNode body = data.path("body");
            if (cacheable) metadata.put(path, new Cached(body.deepCopy(), System.currentTimeMillis() + 600000));
            return body;
        } catch (java.io.IOException exception) { throw bad("Pixiv 返回了无法读取的数据，请稍后重试"); }
    }

    private HttpRequest.Builder request(URI uri) {
        return HttpRequest.newBuilder(uri).timeout(Duration.ofSeconds(5))
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/126.0.0.0 Safari/537.36")
                .header("Referer", BASE + "/");
    }

    private HttpResponse<byte[]> send(HttpRequest request, int maxBytes) {
        try {
            HttpResponse<byte[]> response = client.send(request, ignored -> new LimitedBody(maxBytes));
            if (response.statusCode() < 200 || response.statusCode() >= 300) throw bad("Pixiv 暂时不可用或登录会话已失效，请更新会话后重试");
            return response;
        } catch (java.io.IOException exception) { throw bad("无法连接 Pixiv，请稍后重试或检查服务器代理"); }
        catch (InterruptedException exception) { Thread.currentThread().interrupt(); throw bad("Pixiv 请求已中断"); }
    }

    static BusinessException bad(String message) { return new BusinessException(ErrorCode.BAD_REQUEST, message); }
    private record Cached(JsonNode data, long expiresAt) { }

    /** Cancel as soon as the stream exceeds the limit, before accumulating an unbounded body. */
    static final class LimitedBody implements HttpResponse.BodySubscriber<byte[]> {
        private final int limit;
        private final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        private final CompletableFuture<byte[]> result = new CompletableFuture<>();
        private Flow.Subscription subscription;
        LimitedBody(int limit) { this.limit = limit; }
        public CompletionStage<byte[]> getBody() { return result; }
        public void onSubscribe(Flow.Subscription value) { subscription = value; value.request(1); }
        public void onNext(List<ByteBuffer> items) {
            for (ByteBuffer item : items) {
                if (item.remaining() > limit - bytes.size()) {
                    subscription.cancel();
                    result.completeExceptionally(new java.io.IOException("Pixiv response too large"));
                    return;
                }
                byte[] chunk = new byte[item.remaining()];
                item.get(chunk);
                bytes.writeBytes(chunk);
            }
            subscription.request(1);
        }
        public void onError(Throwable error) { result.completeExceptionally(error); }
        public void onComplete() { result.complete(bytes.toByteArray()); }
    }
}
