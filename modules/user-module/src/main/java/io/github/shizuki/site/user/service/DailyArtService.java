package io.github.shizuki.site.user.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.shizuki.site.user.mapper.UserDailyArtMapper;
import io.github.shizuki.site.user.service.security.MusicApiKeyCryptoService;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@Service
public class DailyArtService {
    private static final ZoneId ZONE = ZoneId.of("Asia/Shanghai");
    private static final Pattern SESSION = Pattern.compile("([1-9][0-9]{0,11})_[A-Za-z0-9-]{8,256}");
    private static final List<Character> CHARACTERS = List.of(
            new Character("五河琴里", "五河琴里", "约会大作战"),
            new Character("比企谷小町", "比企谷小町", "我的青春恋爱物语果然有问题"),
            new Character("司波深雪", "司波深雪", "魔法科高校的劣等生"),
            new Character("土间埋", "土間うまる", "干物妹！小埋"),
            new Character("桐谷直叶", "桐谷直葉", "刀剑神域"),
            new Character("和泉纱雾", "和泉紗霧", "埃罗芒阿老师"),
            new Character("香风智乃", "香風智乃", "请问您今天要来点兔子吗？"),
            new Character("白", "白(ノーゲーム・ノーライフ)", "游戏人生"));
    private final UserDailyArtMapper repository;
    private final MusicApiKeyCryptoService crypto;
    private final PixivClient pixiv;
    private final ObjectMapper mapper;
    private final Clock clock;
    private final ThreadPoolExecutor workers = new ThreadPoolExecutor(4, 4, 30, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(32), runnable -> {
                Thread thread = new Thread(runnable, "pixiv-daily-art");
                thread.setDaemon(true);
                return thread;
            }, new ThreadPoolExecutor.AbortPolicy());

    @Autowired
    public DailyArtService(UserDailyArtMapper repository, MusicApiKeyCryptoService crypto,
                           PixivClient pixiv, ObjectMapper mapper) {
        this(repository, crypto, pixiv, mapper, Clock.systemUTC());
    }

    DailyArtService(UserDailyArtMapper repository, MusicApiKeyCryptoService crypto,
                    PixivClient pixiv, ObjectMapper mapper, Clock clock) {
        this.repository = repository;
        this.crypto = crypto;
        this.pixiv = pixiv;
        this.mapper = mapper;
        this.clock = clock;
    }

    @PreDestroy
    public void close() { workers.shutdownNow(); }

    public ObjectNode settings(Long userId) {
        ObjectNode config = read(repository.config(userId));
        ObjectNode visible = config.deepCopy();
        visible.remove("session_cipher");
        visible.put("connected", !config.path("session_cipher").asText().isBlank());
        if (!visible.has("manual_artists")) visible.set("manual_artists", mapper.createArrayNode());
        if (!visible.has("followed_artists")) visible.set("followed_artists", mapper.createArrayNode());
        return visible;
    }

    public ObjectNode connect(Long userId, String account, String rawSession) {
        String accountId = PixivClient.id(account);
        String session = session(rawSession);
        if (!session.substring(0, session.indexOf('_')).equals(accountId)) throw PixivClient.bad("登录会话与 Pixiv 账号 ID 不匹配");
        // Successful authenticated access is required before replacing any stored credentials.
        JsonNode follows = pixiv.following(accountId, session, 0, 48, false);
        requireFollowing(follows);
        JsonNode profile = pixiv.user(accountId);
        ObjectNode current = read(repository.config(userId));
        ObjectNode patch = mapper.createObjectNode().put("account_id", accountId)
                .put("account_name", profile.path("name").asText(accountId))
                .put("session_cipher", crypto.encrypt(session));
        if (!accountId.equals(current.path("account_id").asText())) {
            patch.set("followed_artists", artists(follows.path("users")));
            patch.put("truncated", follows.path("total").asInt() > follows.path("users").size());
            patch.put("synced_at", clock.instant().toString());
        }
        repository.patchConfig(userId, patch.toString());
        return settings(userId);
    }

    static String session(String raw) {
        String value = raw == null ? "" : raw.trim();
        if (value.contains("PHPSESSID=")) {
            var match = Pattern.compile("(?:^|;\\s*)PHPSESSID=([^;]+)").matcher(value);
            if (!match.find()) throw PixivClient.bad("请输入 PHPSESSID 的值");
            value = match.group(1).trim();
        }
        if (!SESSION.matcher(value).matches()) throw PixivClient.bad("PHPSESSID 格式不正确，请复制 Pixiv 登录会话的完整值");
        return value;
    }

    public ObjectNode disconnect(Long userId) {
        ObjectNode patch = mapper.createObjectNode().put("account_id", "").put("account_name", "")
                .put("session_cipher", "").put("synced_at", "").put("truncated", false);
        patch.set("followed_artists", mapper.createArrayNode());
        repository.patchConfig(userId, patch.toString());
        return settings(userId);
    }

    public ObjectNode sync(Long userId, boolean includePrivate) {
        ObjectNode config = read(repository.config(userId));
        String cipher = config.path("session_cipher").asText();
        if (cipher.isBlank()) throw PixivClient.bad("请先关联 Pixiv 账号");
        String session = crypto.decrypt(cipher);
        LinkedHashMap<String, JsonNode> imported = new LinkedHashMap<>();
        boolean truncated = false;
        int scopeLimit = includePrivate ? 120 : 240;
        for (boolean hidden : includePrivate ? List.of(false, true) : List.of(false)) {
            int offset = 0;
            while (offset < scopeLimit) {
                int limit = Math.min(48, scopeLimit - offset);
                JsonNode page = pixiv.following(config.path("account_id").asText(), session, offset, limit, hidden);
                requireFollowing(page);
                ArrayNode batch = artists(page.path("users"));
                batch.forEach(artist -> imported.put(artist.path("id").asText(), artist));
                offset += page.path("users").size();
                if (page.path("users").size() < limit || offset >= page.path("total").asInt(offset)) break;
                if (offset >= scopeLimit) truncated = true;
            }
        }
        ObjectNode patch = mapper.createObjectNode().put("synced_at", clock.instant().toString())
                .put("truncated", truncated).put("include_private", includePrivate);
        ArrayNode followed = mapper.createArrayNode();
        imported.values().forEach(followed::add);
        patch.set("followed_artists", followed);
        if (repository.patchConnectedConfig(userId, patch.toString(), cipher) == 0) {
            throw PixivClient.bad("同步期间 Pixiv 关联已更新，请重新同步");
        }
        return settings(userId);
    }

    private static void requireFollowing(JsonNode data) {
        if (!data.path("users").isArray()) throw PixivClient.bad("无法读取关注列表，请更新 Pixiv 登录会话后重试");
    }

    public ObjectNode saveArtists(Long userId, List<String> rawIds) {
        if (rawIds == null || rawIds.size() > 32) throw PixivClient.bad("最多添加 32 位手动画师");
        ObjectNode current = read(repository.config(userId));
        LinkedHashMap<String, JsonNode> existing = combinedArtists(current);
        ArrayNode manual = mapper.createArrayNode();
        var ids = new java.util.LinkedHashSet<String>();
        for (String raw : rawIds) {
            String id = PixivClient.id(raw);
            if (!ids.add(id)) throw PixivClient.bad("画师列表存在重复 ID");
            JsonNode artist = existing.get(id);
            if (artist == null) {
                JsonNode user = pixiv.user(id);
                artist = artist(id, user.path("name").asText(id));
            }
            manual.add(artist);
        }
        ObjectNode patch = mapper.createObjectNode();
        patch.set("manual_artists", manual);
        repository.patchConfig(userId, patch.toString());
        return settings(userId);
    }

    public ObjectNode today(Long userId) {
        String date = LocalDate.now(clock.withZone(ZONE)).toString();
        ObjectNode saved = read(repository.daily(userId));
        if (!date.equals(saved.path("date").asText())) saved = mapper.createObjectNode();
        ObjectNode config = read(repository.config(userId));
        List<JsonNode> artistPool = new ArrayList<>(combinedArtists(config).values());
        Collections.shuffle(artistPool, new Random(seed(userId, date, "artists")));
        Character character = CHARACTERS.get(Math.floorMod(seed(userId, date, "character"), CHARACTERS.size()));
        List<CompletableFuture<Fetch>> artworkJobs = new ArrayList<>();
        if (!saved.has("artworks")) {
            for (JsonNode artist : artistPool.stream().limit(3).toList()) {
                String artistId = artist.path("id").asText();
                artworkJobs.add(fetch(() -> pixiv.latest(artistId)));
            }
        }
        CompletableFuture<Fetch> wifeJob = saved.has("wife") ? null : fetch(() -> pixiv.search(character.tag()));
        ObjectNode candidate = mapper.createObjectNode().put("date", date);
        ArrayNode recommendations = mapper.createArrayNode();
        int failed = 0;
        for (CompletableFuture<Fetch> job : artworkJobs) {
            Fetch result = job.join();
            if (result.failed()) failed++;
            List<JsonNode> works = new ArrayList<>(result.works());
            Collections.shuffle(works, new Random(seed(userId, date, "works")));
            works.stream().limit(2).map(this::artwork).forEach(recommendations::add);
        }
        if (!recommendations.isEmpty()) candidate.set("artworks", recommendations);
        if (wifeJob != null) {
            Fetch result = wifeJob.join();
            List<JsonNode> matching = result.works().stream().filter(work -> {
                for (JsonNode tag : work.path("tags")) if (character.tag().equals(tag.asText())) return true;
                return false;
            }).toList();
            if (!matching.isEmpty()) {
                JsonNode selected = matching.get(Math.floorMod(seed(userId, date, "wife-image"), matching.size()));
                ObjectNode wife = character(character);
                wife.set("artwork", artwork(selected));
                candidate.set("wife", wife);
            }
        }
        if (candidate.size() > 1) repository.saveDaily(userId, candidate.toString());
        ObjectNode persisted = read(repository.daily(userId));
        if (date.equals(persisted.path("date").asText())) saved = persisted;
        saved.put("date", date);
        if (!saved.has("wife")) saved.set("wife", character(character));
        String state = saved.has("artworks") ? (failed > 0 ? "partial" : "ready")
                : artistPool.isEmpty() ? "empty" : failed > 0 ? "unavailable" : "no_works";
        saved.put("recommendation_state", state);
        if (!saved.has("artworks")) saved.set("artworks", mapper.createArrayNode());
        return saved;
    }

    private CompletableFuture<Fetch> fetch(java.util.function.Supplier<List<JsonNode>> action) {
        try {
            return CompletableFuture.supplyAsync(() -> {
                try { return new Fetch(action.get(), false); }
                catch (RuntimeException exception) { return new Fetch(List.of(), true); }
            }, workers);
        } catch (java.util.concurrent.RejectedExecutionException exception) {
            return CompletableFuture.completedFuture(new Fetch(List.of(), true));
        }
    }

    public ObjectNode search(String query) {
        ObjectNode result = mapper.createObjectNode();
        ArrayNode works = mapper.createArrayNode();
        pixiv.search(query).stream().limit(24).map(this::artwork).forEach(works::add);
        result.set("artworks", works);
        return result;
    }

    private ObjectNode artwork(JsonNode work) {
        String id = work.path("id").asText();
        ObjectNode result = mapper.createObjectNode().put("id", id).put("title", work.path("title").asText())
                .put("artist_id", work.path("userId").asText()).put("artist_name", work.path("userName").asText())
                .put("source_url", "https://www.pixiv.net/artworks/" + id)
                .put("image_url", "/api/v1/daily-art/pixiv/artworks/" + id + "/preview");
        result.set("tags", work.path("tags").deepCopy());
        return result;
    }

    private ObjectNode character(Character value) {
        return mapper.createObjectNode().put("name", value.name()).put("tag", value.tag())
                .put("series", value.series()).put("search_url", "https://www.pixiv.net/tags/"
                        + java.net.URLEncoder.encode(value.tag(), java.nio.charset.StandardCharsets.UTF_8) + "/artworks?mode=safe");
    }

    private ArrayNode artists(JsonNode users) {
        ArrayNode result = mapper.createArrayNode();
        for (JsonNode user : users) {
            String id = user.path("userId").asText();
            if (id.matches("[1-9][0-9]{0,11}")) result.add(artist(id, user.path("userName").asText(id)));
        }
        return result;
    }

    private ObjectNode artist(String id, String name) {
        return mapper.createObjectNode().put("id", id).put("name", name).put("source_url", "https://www.pixiv.net/users/" + id);
    }

    private LinkedHashMap<String, JsonNode> combinedArtists(ObjectNode config) {
        LinkedHashMap<String, JsonNode> result = new LinkedHashMap<>();
        for (String key : List.of("manual_artists", "followed_artists")) {
            for (JsonNode artist : config.path(key)) result.putIfAbsent(artist.path("id").asText(), artist);
        }
        return result;
    }

    private ObjectNode read(String json) {
        if (json == null || json.isBlank()) return mapper.createObjectNode();
        try {
            JsonNode node = mapper.readTree(json);
            return node instanceof ObjectNode object ? object : mapper.createObjectNode();
        } catch (java.io.IOException exception) { throw PixivClient.bad("每日内容数据无法读取"); }
    }

    static int seed(Long userId, String date, String scope) { return (userId + ":" + date + ":" + scope).hashCode(); }
    private record Fetch(List<JsonNode> works, boolean failed) { }
    private record Character(String name, String tag, String series) { }
}
