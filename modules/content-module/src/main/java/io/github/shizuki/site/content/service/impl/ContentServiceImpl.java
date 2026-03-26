package io.github.shizuki.site.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.dto.AuthorProfileResponse;
import io.github.shizuki.site.content.dto.AuthorProfileUpsertRequest;
import io.github.shizuki.site.content.dto.AuthorPostItemResponse;
import io.github.shizuki.site.content.dto.AuthorPostUpsertRequest;
import io.github.shizuki.site.content.dto.AuthorWhisperItemResponse;
import io.github.shizuki.site.content.dto.AuthorWhisperRequest;
import io.github.shizuki.site.content.dto.ContentVisibilityResponse;
import io.github.shizuki.site.content.dto.ContentVisibilityUpdateRequest;
import io.github.shizuki.site.content.dto.PostCategoryPolicyResponse;
import io.github.shizuki.site.content.dto.PostCategoryPolicyUpdateRequest;
import io.github.shizuki.site.content.dto.PostCategoryMetaResponse;
import io.github.shizuki.site.content.dto.PostCategoryMetaUpsertRequest;
import io.github.shizuki.site.content.dto.PostContentRelayResponse;
import io.github.shizuki.site.content.dto.PostDetailResponse;
import io.github.shizuki.site.content.dto.PostPresentationDownloadResponse;
import io.github.shizuki.site.content.dto.PostPresentationResponse;
import io.github.shizuki.site.content.dto.PostEditorPolicyResponse;
import io.github.shizuki.site.content.dto.PostSidebarResponse;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.entity.AppEntity;
import io.github.shizuki.site.content.entity.AppGroupAclEntity;
import io.github.shizuki.site.content.entity.AuthorProfileEntity;
import io.github.shizuki.site.content.entity.ContentReportEntity;
import io.github.shizuki.site.content.entity.PostCategoryMetaEntity;
import io.github.shizuki.site.content.entity.PostCategoryPolicyEntity;
import io.github.shizuki.site.content.entity.PostCategoryPolicyGroupEntity;
import io.github.shizuki.site.content.entity.PostEntity;
import io.github.shizuki.site.content.entity.PostGroupAclEntity;
import io.github.shizuki.site.content.entity.PostPresentationEntity;
import io.github.shizuki.site.content.entity.PostTagEntity;
import io.github.shizuki.site.content.mapper.AppGroupAclMapper;
import io.github.shizuki.site.content.mapper.AppMapper;
import io.github.shizuki.site.content.mapper.AuthorProfileMapper;
import io.github.shizuki.site.content.mapper.ContentReportMapper;
import io.github.shizuki.site.content.mapper.PostCategoryMetaMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyGroupMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyMapper;
import io.github.shizuki.site.content.mapper.PostGroupAclMapper;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.mapper.PostPresentationMapper;
import io.github.shizuki.site.content.mapper.PostTagMapper;
import io.github.shizuki.site.content.model.ContentVisibilityEnum;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.support.AuthorProfileHttpCacheSupport;
import io.github.shizuki.site.content.support.PostPresentationGeneratorClient;
import io.github.shizuki.site.content.support.PostPresentationTemplateService;
import io.github.shizuki.site.content.support.PostPresentationTemplateService.PresentationDeck;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ContentServiceImpl implements ContentService {

    private static final String POST_STATUS_DRAFT = "DRAFT";
    private static final String POST_STATUS_PUBLISHED = "PUBLISHED";
    private static final long DEFAULT_POST_NUM_BASE = 500_000L;
    private static final String INITIAL_SEED_SLUG_CODE = "initial-overview-v01";
    private static final String INITIAL_SEED_MARKDOWN_CLASSPATH = "monolith/blog-seed/initial-overview-v0.1.md";
    private static final String DEFAULT_AUTHOR_CODE = "shizuki";
    private static final int AUTHOR_PROFILE_MAX_JSON_LENGTH = 64_000;
    private static final String REPORT_STATUS_CREATED = "CREATED";
    private static final String REPORT_TARGET_AUTHOR_WHISPER = "AUTHOR_WHISPER";
    private static final String POST_PRESENTATION_STATUS_NOT_GENERATED = "NOT_GENERATED";
    private static final String POST_PRESENTATION_STATUS_GENERATING = "GENERATING";
    private static final String POST_PRESENTATION_STATUS_READY = "READY";
    private static final String POST_PRESENTATION_STATUS_FAILED = "FAILED";
    private static final String PPT_CONTENT_TYPE =
        "application/vnd.openxmlformats-officedocument.presentationml.presentation";

    private static final Pattern ASCII_WORD_PATTERN = Pattern.compile("[A-Za-z0-9_]+(?:'[A-Za-z0-9_]+)?");
    private static final Pattern MARKDOWN_IMAGE_PATTERN = Pattern.compile("!\\[[^\\]]*]\\(([^)\\s]+)(?:\\s+\"[^\"]*\")?\\)");
    private static final DateTimeFormatter ARCHIVE_MONTH_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM");
    private static final double AVG_READING_UNITS_PER_MINUTE = 300.0d;

    private final PostMapper postMapper;
    private final AppMapper appMapper;
    private final ContentReportMapper contentReportMapper;
    private final PostGroupAclMapper postGroupAclMapper;
    private final AppGroupAclMapper appGroupAclMapper;
    private final PostTagMapper postTagMapper;
    private final PostCategoryPolicyMapper postCategoryPolicyMapper;
    private final PostCategoryPolicyGroupMapper postCategoryPolicyGroupMapper;
    private final PostCategoryMetaMapper postCategoryMetaMapper;
    private final PostPresentationMapper postPresentationMapper;
    private final AuthorProfileMapper authorProfileMapper;
    private final ObjectStorageClient objectStorageClient;
    private final ObjectMapper objectMapper;
    private final PostPresentationTemplateService postPresentationTemplateService;
    private final PostPresentationGeneratorClient postPresentationGeneratorClient;
    private final Executor postPresentationExecutor;

    @Value("${shizuki.blog.storage.private-bucket:${shizuki.media.storage.private-bucket:}}")
    private String blogPrivateBucket;

    @Value("${shizuki.blog.storage.max-upload-size:1048576}")
    private long blogMaxUploadSize;

    @Value("${shizuki.blog.presentation.download-expire-seconds:900}")
    private long presentationDownloadExpireSeconds;

    @Value("${shizuki.content.author-profile.cache.ttl-seconds:120}")
    private long authorProfileCacheTtlSeconds;

    private final Object authorProfileCacheLock = new Object();
    private volatile AuthorProfileCacheSnapshot authorProfileCacheSnapshot;

    public ContentServiceImpl(PostMapper postMapper,
                              AppMapper appMapper,
                              ContentReportMapper contentReportMapper,
                              PostGroupAclMapper postGroupAclMapper,
                              AppGroupAclMapper appGroupAclMapper,
                              PostTagMapper postTagMapper,
                              PostCategoryPolicyMapper postCategoryPolicyMapper,
                              PostCategoryPolicyGroupMapper postCategoryPolicyGroupMapper,
                              PostCategoryMetaMapper postCategoryMetaMapper,
                              PostPresentationMapper postPresentationMapper,
                              AuthorProfileMapper authorProfileMapper,
                              ObjectStorageClient objectStorageClient,
                              ObjectMapper objectMapper,
                              PostPresentationTemplateService postPresentationTemplateService,
                              PostPresentationGeneratorClient postPresentationGeneratorClient,
                              @Qualifier("postPresentationExecutor") Executor postPresentationExecutor) {
        this.postMapper = postMapper;
        this.appMapper = appMapper;
        this.contentReportMapper = contentReportMapper;
        this.postGroupAclMapper = postGroupAclMapper;
        this.appGroupAclMapper = appGroupAclMapper;
        this.postTagMapper = postTagMapper;
        this.postCategoryPolicyMapper = postCategoryPolicyMapper;
        this.postCategoryPolicyGroupMapper = postCategoryPolicyGroupMapper;
        this.postCategoryMetaMapper = postCategoryMetaMapper;
        this.postPresentationMapper = postPresentationMapper;
        this.authorProfileMapper = authorProfileMapper;
        this.objectStorageClient = objectStorageClient;
        this.objectMapper = objectMapper;
        this.postPresentationTemplateService = postPresentationTemplateService;
        this.postPresentationGeneratorClient = postPresentationGeneratorClient;
        this.postPresentationExecutor = postPresentationExecutor;
    }

    @Override
    public PageResponse<PostSummary> listPosts(long pageNo, long pageSize) {
        return listPosts(pageNo, pageSize, null, null, null);
    }

    @Override
    public PageResponse<PostSummary> listPosts(long pageNo, long pageSize, String keyword, String categoryCode, String tagCode) {
        return listPosts(pageNo, pageSize, keyword, categoryCode, tagCode, null, null);
    }

    @Override
    public PageResponse<PostSummary> listPosts(
        long pageNo,
        long pageSize,
        String keyword,
        String categoryCode,
        String tagCode,
        String publishedFrom,
        String publishedTo
    ) {
        long normalizedPageNo = pageNo <= 0 ? 1 : pageNo;
        long normalizedPageSize = Math.max(1L, Math.min(pageSize <= 0 ? 10L : pageSize, 100L));

        List<PostEntity> candidates = loadPublishedPostCandidates();

        String normalizedKeyword = normalizeKeyword(keyword);
        String normalizedCategory = normalizeCategoryCode(categoryCode, false);
        String normalizedTag = normalizeTagCode(tagCode);
        PublishedRange range = resolvePublishedRange(publishedFrom, publishedTo);
        Map<Long, List<String>> tagCache = new HashMap<>();

        List<PostEntity> filtered = candidates.stream()
            .filter(post -> matchesKeyword(post, normalizedKeyword, tagCache))
            .filter(post -> matchesCategory(post, normalizedCategory))
            .filter(post -> matchesTag(post.getId(), normalizedTag, tagCache))
            .filter(post -> matchesPublishedRange(post, range))
            .sorted(
                Comparator.comparing(this::resolvePostPublishTimeForSort, Comparator.reverseOrder())
                    .thenComparing(PostEntity::getId, Comparator.reverseOrder())
            )
            .toList();

        long total = filtered.size();
        int fromIndex = (int) Math.min((normalizedPageNo - 1) * normalizedPageSize, total);
        int toIndex = (int) Math.min(fromIndex + normalizedPageSize, total);

        List<PostSummary> items = filtered.subList(fromIndex, toIndex).stream()
            .map(post -> {
                MarkdownMetrics summaryMetrics = resolveSummaryMetrics(post);
                return new PostSummary(
                    post.getId(),
                    post.getTitle(),
                    post.getSummary(),
                    post.getCoverImageUrl(),
                    normalizeVisibility(post.getVisibility()).name(),
                    post.getCategoryCode(),
                    loadPostTags(post.getId(), tagCache),
                    summaryMetrics.wordCount(),
                    summaryMetrics.readingMinutes(),
                    post.getLikeCount() == null ? 0L : post.getLikeCount(),
                    resolvePostPublishTimeForDisplay(post)
                );
            })
            .toList();

        return PageResponse.of(items, total, normalizedPageNo, normalizedPageSize);
    }

    @Override
    public PostSidebarResponse getPostSidebar() {
        List<PostEntity> candidates = loadPublishedPostCandidates();

        Map<Long, List<String>> tagCache = new HashMap<>();
        List<PostEntity> visiblePosts = candidates;

        List<PostSidebarResponse.LatestPostItem> latestPosts = visiblePosts.stream()
            .sorted(
                Comparator.comparing(this::resolvePostPublishTimeForSort, Comparator.reverseOrder())
                    .thenComparing(PostEntity::getId, Comparator.reverseOrder())
            )
            .limit(5)
            .map(post -> new PostSidebarResponse.LatestPostItem(
                post.getId(),
                normalizePostTitle(post.getTitle()),
                resolvePostPublishTimeForDisplay(post),
                post.getCoverImageUrl()
            ))
            .toList();

        Map<String, Long> categoryCounter = new HashMap<>();
        Map<String, Long> tagCounter = new HashMap<>();
        Map<String, Long> archiveCounter = new HashMap<>();

        for (PostEntity post : visiblePosts) {
            String category = normalizeDisplayCategory(post.getCategoryCode());
            categoryCounter.merge(category, 1L, Long::sum);

            LocalDateTime publishTime = resolvePostPublishTimeForDisplay(post);
            if (publishTime != null) {
                String month = ARCHIVE_MONTH_FORMATTER.format(publishTime);
                archiveCounter.merge(month, 1L, Long::sum);
            }

            for (String tag : loadPostTags(post.getId(), tagCache)) {
                if (!StringUtils.hasText(tag)) {
                    continue;
                }
                tagCounter.merge(tag, 1L, Long::sum);
            }
        }

        Set<String> knownCategoryCodes = new LinkedHashSet<>(collectKnownCategoryCodes());
        knownCategoryCodes.addAll(categoryCounter.keySet());
        Map<String, PostCategoryMetaEntity> categoryMetaMap = loadCategoryMetaMap(knownCategoryCodes);

        List<PostSidebarResponse.CategoryStatItem> categories = knownCategoryCodes.stream()
            .map(this::normalizeDisplayCategory)
            .distinct()
            .filter(categoryCode -> {
                PostCategoryMetaEntity meta = categoryMetaMap.get(categoryCode);
                return meta == null || meta.getEnabledFlag() == null || meta.getEnabledFlag() == 1;
            })
            .sorted((left, right) -> {
                PostCategoryMetaEntity leftMeta = categoryMetaMap.get(left);
                PostCategoryMetaEntity rightMeta = categoryMetaMap.get(right);
                int leftSortNum = leftMeta == null || leftMeta.getSortNum() == null ? Integer.MAX_VALUE : leftMeta.getSortNum();
                int rightSortNum = rightMeta == null || rightMeta.getSortNum() == null ? Integer.MAX_VALUE : rightMeta.getSortNum();
                int sortCompare = Integer.compare(leftSortNum, rightSortNum);
                if (sortCompare != 0) {
                    return sortCompare;
                }
                long leftCount = categoryCounter.getOrDefault(left, 0L);
                long rightCount = categoryCounter.getOrDefault(right, 0L);
                int countCompare = Long.compare(rightCount, leftCount);
                if (countCompare != 0) {
                    return countCompare;
                }
                return left.compareTo(right);
            })
            .map(categoryCode -> {
                PostCategoryMetaEntity meta = categoryMetaMap.get(categoryCode);
                String displayName = normalizeCategoryDisplayName(categoryCode, meta);
                String coverImageUrl = meta == null ? "" : readString(meta.getCoverImageUrl(), "");
                return new PostSidebarResponse.CategoryStatItem(
                    categoryCode,
                    categoryCounter.getOrDefault(categoryCode, 0L),
                    displayName,
                    coverImageUrl
                );
            })
            .toList();

        List<PostSidebarResponse.TagStatItem> tags = tagCounter.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry::getKey))
            .limit(20)
            .map(entry -> new PostSidebarResponse.TagStatItem(entry.getKey(), entry.getValue()))
            .toList();

        List<PostSidebarResponse.ArchiveStatItem> archives = archiveCounter.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByKey().reversed())
            .map(entry -> new PostSidebarResponse.ArchiveStatItem(entry.getKey(), entry.getValue()))
            .toList();

        return new PostSidebarResponse(latestPosts, categories, tags, archives);
    }

    private MarkdownMetrics resolveSummaryMetrics(PostEntity post) {
        if (post == null) {
            return new MarkdownMetrics(0L, 0L, 1);
        }
        long persistedWordCount = post.getWordCount() == null ? 0L : post.getWordCount();
        long persistedLineCount = post.getLineCount() == null ? 0L : post.getLineCount();
        int persistedReadingMinutes = post.getReadingMinutes() == null ? 0 : post.getReadingMinutes();
        if (persistedWordCount > 0 && persistedLineCount > 0 && persistedReadingMinutes > 0) {
            return new MarkdownMetrics(persistedWordCount, persistedLineCount, persistedReadingMinutes);
        }

        MarkdownMetrics calculated;
        try {
            String markdown = readPostMarkdown(post);
            calculated = computeMarkdownMetrics(markdown);
        } catch (BusinessException ignored) {
            calculated = new MarkdownMetrics(0L, 0L, 1);
        }

        long finalWordCount = persistedWordCount > 0 ? persistedWordCount : calculated.wordCount();
        long finalLineCount = persistedLineCount > 0 ? persistedLineCount : calculated.lineCount();
        int finalReadingMinutes = persistedReadingMinutes > 0 ? persistedReadingMinutes : calculated.readingMinutes();
        return new MarkdownMetrics(finalWordCount, finalLineCount, finalReadingMinutes);
    }

    @Override
    public AuthorProfileResponse getAuthorProfile() {
        return resolveAuthorProfileSnapshot(false).response();
    }

    @Override
    public AuthorProfileResponse getAdminAuthorProfile() {
        requireAdmin();
        return resolveAuthorProfileResponse(DEFAULT_AUTHOR_CODE);
    }

    @Override
    public AuthorProfileResponse upsertAdminAuthorProfile(AuthorProfileUpsertRequest request) {
        requireAdmin();
        if (request == null || request.getProfileJson() == null || request.getProfileJson().isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "profile_json is required");
        }

        AuthorProfileEntity entity = findAuthorProfileEntity(DEFAULT_AUTHOR_CODE);
        if (entity == null) {
            entity = new AuthorProfileEntity();
            entity.setAuthorCode(DEFAULT_AUTHOR_CODE);
            entity.setCreatedAt(LocalDateTime.now());
        }

        Map<String, Object> normalizedProfileJson = normalizeProfileJson(request.getProfileJson());
        String serializedProfile = writeProfileJson(normalizedProfileJson);
        if (serializedProfile.length() > AUTHOR_PROFILE_MAX_JSON_LENGTH) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "profile_json is too large");
        }

        entity.setProfileJson(serializedProfile);
        entity.setEnabledFlag(request.getEnabled() == null ? 1 : (request.getEnabled() ? 1 : 0));
        entity.setUpdatedAt(LocalDateTime.now());

        if (entity.getId() == null || entity.getId() <= 0) {
            authorProfileMapper.insert(entity);
        } else {
            authorProfileMapper.updateById(entity);
        }
        AuthorProfileResponse response = toAuthorProfileResponse(entity);
        refreshAuthorProfileSnapshot(response);
        return response;
    }

    private AuthorProfileCacheSnapshot resolveAuthorProfileSnapshot(boolean forceRefresh) {
        long now = System.currentTimeMillis();
        AuthorProfileCacheSnapshot snapshot = authorProfileCacheSnapshot;
        if (!forceRefresh && snapshot != null && snapshot.expireAtMs() > now) {
            return snapshot;
        }

        synchronized (authorProfileCacheLock) {
            long nowInLock = System.currentTimeMillis();
            AuthorProfileCacheSnapshot inLock = authorProfileCacheSnapshot;
            if (!forceRefresh && inLock != null && inLock.expireAtMs() > nowInLock) {
                return inLock;
            }

            AuthorProfileResponse response = resolveAuthorProfileResponse(DEFAULT_AUTHOR_CODE);
            AuthorProfileCacheSnapshot refreshed = buildAuthorProfileSnapshot(response, nowInLock);
            authorProfileCacheSnapshot = refreshed;
            return refreshed;
        }
    }

    private void refreshAuthorProfileSnapshot(AuthorProfileResponse response) {
        synchronized (authorProfileCacheLock) {
            authorProfileCacheSnapshot = buildAuthorProfileSnapshot(response, System.currentTimeMillis());
        }
    }

    private AuthorProfileCacheSnapshot buildAuthorProfileSnapshot(AuthorProfileResponse response, long nowEpochMillis) {
        long ttlMs = resolveAuthorProfileCacheTtlMillis();
        String etag = AuthorProfileHttpCacheSupport.buildWeakEtag(response);
        long lastModifiedEpochMillis = AuthorProfileHttpCacheSupport.resolveLastModifiedEpochMillis(response, nowEpochMillis);
        return new AuthorProfileCacheSnapshot(
            response,
            etag,
            lastModifiedEpochMillis,
            nowEpochMillis + ttlMs
        );
    }

    private long resolveAuthorProfileCacheTtlMillis() {
        long normalizedSeconds = Math.max(1L, authorProfileCacheTtlSeconds);
        return normalizedSeconds * 1000L;
    }

    private AuthorProfileResponse resolveAuthorProfileResponse(String authorCode) {
        AuthorProfileEntity entity = findAuthorProfileEntity(authorCode);
        if (entity == null) {
            return new AuthorProfileResponse(
                normalizeAuthorCode(authorCode),
                true,
                buildDefaultAuthorProfileJson(),
                null
            );
        }
        return toAuthorProfileResponse(entity);
    }

    private AuthorProfileEntity findAuthorProfileEntity(String authorCode) {
        String normalized = normalizeAuthorCode(authorCode);
        return authorProfileMapper.selectOne(
            new LambdaQueryWrapper<AuthorProfileEntity>()
                .eq(AuthorProfileEntity::getAuthorCode, normalized)
        );
    }

    private AuthorProfileResponse toAuthorProfileResponse(AuthorProfileEntity entity) {
        if (entity == null) {
            return new AuthorProfileResponse(DEFAULT_AUTHOR_CODE, true, buildDefaultAuthorProfileJson(), null);
        }
        return new AuthorProfileResponse(
            normalizeAuthorCode(entity.getAuthorCode()),
            entity.getEnabledFlag() == null || entity.getEnabledFlag() == 1,
            readProfileJson(entity.getProfileJson()),
            entity.getUpdatedAt()
        );
    }

    private String normalizeAuthorCode(String authorCode) {
        String normalized = readString(authorCode, "").trim().toLowerCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : DEFAULT_AUTHOR_CODE;
    }

    private Map<String, Object> readProfileJson(String profileJson) {
        if (!StringUtils.hasText(profileJson)) {
            return buildDefaultAuthorProfileJson();
        }
        try {
            Map<String, Object> parsed = objectMapper.readValue(profileJson, new TypeReference<Map<String, Object>>() {
            });
            return normalizeProfileJson(parsed);
        } catch (Exception ignored) {
            return buildDefaultAuthorProfileJson();
        }
    }

    private String writeProfileJson(Map<String, Object> profileJson) {
        try {
            return objectMapper.writeValueAsString(profileJson);
        } catch (JsonProcessingException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "profile_json serialization failed");
        }
    }

    private Map<String, Object> normalizeProfileJson(Map<String, Object> source) {
        Map<String, Object> raw = source == null ? Map.of() : source;
        Map<String, Object> normalized = new LinkedHashMap<>();

        normalized.put("hero", normalizeHeroSection(toMap(raw.get("hero"))));
        normalized.put("identity", normalizeIdentitySection(toMap(raw.get("identity"))));
        normalized.put("skills", normalizeStringList(raw.get("skills"), defaultSkills()));
        normalized.put("journey", normalizeJourneySection(raw.get("journey")));
        normalized.put("about", normalizeAboutSection(toMap(raw.get("about"))));
        normalized.put("site", normalizeSiteSection(toMap(raw.get("site"))));
        return normalized;
    }

    private Map<String, Object> normalizeHeroSection(Map<String, Object> source) {
        Map<String, Object> normalized = defaultHeroSection();
        normalized.put("greeting", readStringField(source, normalized.get("greeting").toString(), "greeting"));
        normalized.put("name", readStringField(source, normalized.get("name").toString(), "name"));
        normalized.put("quote", readStringField(source, normalized.get("quote").toString(), "quote"));
        normalized.put("avatar_url", readStringField(source, normalized.get("avatar_url").toString(), "avatar_url", "avatarUrl"));
        normalized.put("cover_image_url", readStringField(source, normalized.get("cover_image_url").toString(), "cover_image_url", "coverImageUrl"));
        return normalized;
    }

    private Map<String, Object> normalizeIdentitySection(Map<String, Object> source) {
        Map<String, Object> normalized = defaultIdentitySection();
        normalized.put("birth_year", readStringField(source, normalized.get("birth_year").toString(), "birth_year", "birthYear"));
        normalized.put("school", readStringField(source, normalized.get("school").toString(), "school"));
        normalized.put("major", readStringField(source, normalized.get("major").toString(), "major"));
        normalized.put("role", readStringField(source, normalized.get("role").toString(), "role"));
        normalized.put(
            "current_status",
            readStringField(
                source,
                normalized.get("current_status").toString(),
                "current_status",
                "currentStatus",
                "activity_status",
                "activityStatus"
            )
        );
        normalized.put("labels", normalizeStringList(source.get("labels"), castStringList(normalized.get("labels"))));
        return normalized;
    }

    private List<Map<String, Object>> normalizeJourneySection(Object raw) {
        List<Map<String, Object>> fallback = defaultJourneySection();
        if (!(raw instanceof List<?> source) || source.isEmpty()) {
            return fallback;
        }

        List<Map<String, Object>> normalized = new ArrayList<>();
        for (Object item : source) {
            Map<String, Object> map = toMap(item);
            if (map.isEmpty()) {
                continue;
            }
            String year = readStringField(map, "", "year");
            String title = readStringField(map, "", "title");
            String description = readStringField(map, "", "description");
            if (!StringUtils.hasText(title) && !StringUtils.hasText(description)) {
                continue;
            }
            Map<String, Object> row = new LinkedHashMap<>();
            row.put("year", StringUtils.hasText(year) ? year : "未定");
            row.put("title", StringUtils.hasText(title) ? title : "持续迭代");
            row.put("description", StringUtils.hasText(description) ? description : "继续完善作者主页与站点表达。");
            row.put("image_url", readStringField(map, "/images/katanegai.jpg", "image_url", "imageUrl"));
            row.put("stack", normalizeStringList(map.get("stack"), List.of("Shizuki Site")));
            normalized.add(row);
        }
        return normalized.isEmpty() ? fallback : normalized;
    }

    private Map<String, Object> normalizeAboutSection(Map<String, Object> source) {
        Map<String, Object> normalized = defaultAboutSection();
        normalized.put("intro", normalizeStringList(source.get("intro"), castStringList(normalized.get("intro"))));
        normalized.put("mission", readStringField(source, normalized.get("mission").toString(), "mission"));
        normalized.put("focus", normalizeStringList(source.get("focus"), castStringList(normalized.get("focus"))));
        normalized.put("music", normalizeStringList(source.get("music"), castStringList(normalized.get("music"))));
        normalized.put("intro_image_url", readStringField(source, normalized.get("intro_image_url").toString(), "intro_image_url", "introImageUrl"));
        normalized.put("mission_image_url", readStringField(source, normalized.get("mission_image_url").toString(), "mission_image_url", "missionImageUrl"));
        normalized.put("links_image_url", readStringField(source, normalized.get("links_image_url").toString(), "links_image_url", "linksImageUrl"));
        normalized.put("links", normalizeLinks(source.get("links")));
        return normalized;
    }

    private Map<String, Object> normalizeSiteSection(Map<String, Object> source) {
        Map<String, Object> normalized = defaultSiteSection();
        normalized.put(
            "browser_title",
            readStringField(source, normalized.get("browser_title").toString(), "browser_title", "browserTitle")
        );
        normalized.put("favicon_url", readStringField(source, normalized.get("favicon_url").toString(), "favicon_url", "faviconUrl"));
        return normalized;
    }

    private List<Map<String, Object>> normalizeLinks(Object raw) {
        List<Map<String, Object>> fallback = defaultLinks();
        if (!(raw instanceof List<?> source) || source.isEmpty()) {
            return fallback;
        }
        List<Map<String, Object>> normalized = new ArrayList<>();
        for (Object item : source) {
            Map<String, Object> map = toMap(item);
            String label = readStringField(map, "", "label");
            String url = readStringField(map, "", "url");
            if (!StringUtils.hasText(label) || !StringUtils.hasText(url)) {
                continue;
            }
            Map<String, Object> link = new LinkedHashMap<>();
            link.put("label", label);
            link.put("url", url);
            normalized.add(link);
        }
        return normalized.isEmpty() ? fallback : normalized;
    }

    private List<String> normalizeStringList(Object raw, List<String> fallback) {
        if (!(raw instanceof List<?> source) || source.isEmpty()) {
            return fallback;
        }
        List<String> normalized = source.stream()
            .map(item -> item == null ? "" : String.valueOf(item).trim())
            .filter(StringUtils::hasText)
            .distinct()
            .toList();
        return normalized.isEmpty() ? fallback : normalized;
    }

    private Map<String, Object> toMap(Object raw) {
        if (!(raw instanceof Map<?, ?> map) || map.isEmpty()) {
            return Map.of();
        }
        Map<String, Object> normalized = new LinkedHashMap<>();
        map.forEach((key, value) -> {
            if (key != null) {
                normalized.put(String.valueOf(key), value);
            }
        });
        return normalized;
    }

    private String readStringField(Map<String, Object> source, String fallback, String... keys) {
        if (source == null || source.isEmpty() || keys == null || keys.length == 0) {
            return fallback;
        }
        for (String key : keys) {
            Object value = source.get(key);
            if (value == null) {
                continue;
            }
            String text = String.valueOf(value).trim();
            if (StringUtils.hasText(text)) {
                return text;
            }
        }
        return fallback;
    }

    private Map<String, Object> buildDefaultAuthorProfileJson() {
        Map<String, Object> profile = new LinkedHashMap<>();
        profile.put("hero", defaultHeroSection());
        profile.put("identity", defaultIdentitySection());
        profile.put("skills", defaultSkills());
        profile.put("journey", defaultJourneySection());
        profile.put("about", defaultAboutSection());
        profile.put("site", defaultSiteSection());
        return profile;
    }

    private Map<String, Object> defaultHeroSection() {
        Map<String, Object> hero = new LinkedHashMap<>();
        hero.put("greeting", "你好，很高兴认识你");
        hero.put("name", "Shizuki");
        hero.put("quote", "愿你终将与热爱相逢");
        hero.put("avatar_url", "/images/katanegai.jpg");
        hero.put("cover_image_url", "/images/katanegai.jpg");
        return hero;
    }

    private Map<String, Object> defaultIdentitySection() {
        Map<String, Object> identity = new LinkedHashMap<>();
        identity.put("birth_year", "2006");
        identity.put("school", "中国计量大学");
        identity.put("major", "计算机科学与技术");
        identity.put("role", "大一学生 / 独立开发者");
        identity.put("current_status", "学习中");
        identity.put("labels", List.of("学习陪伴", "内容沉淀", "图形渲染"));
        return identity;
    }

    private List<String> defaultSkills() {
        return List.of("Java", "Vue3", "Spring Boot", "MySQL", "OpenGL", "Vulkan", "Markdown");
    }

    private List<Map<String, Object>> defaultJourneySection() {
        List<Map<String, Object>> journey = new ArrayList<>();

        Map<String, Object> phase1 = new LinkedHashMap<>();
        phase1.put("year", "2024");
        phase1.put("title", "确定 Shizuki Site 长期方向");
        phase1.put("description", "明确学习陪伴、内容沉淀、作品展示三条主线，搭建基础技术架构。");
        phase1.put("image_url", "/images/katanegai.jpg");
        phase1.put("stack", List.of("Spring Boot", "Vue3", "MySQL"));
        journey.add(phase1);

        Map<String, Object> phase2 = new LinkedHashMap<>();
        phase2.put("year", "2025");
        phase2.put("title", "完成博客与音乐模块一期");
        phase2.put("description", "打通博客阅读/编辑流程与音乐播放器链路，开始文档化沉淀。");
        phase2.put("image_url", "/images/katanegai.jpg");
        phase2.put("stack", List.of("Markdown", "Flyway", "Vite"));
        journey.add(phase2);

        Map<String, Object> phase3 = new LinkedHashMap<>();
        phase3.put("year", "2026");
        phase3.put("title", "完善作者主页与展示能力");
        phase3.put("description", "升级作者介绍、建站经历和关于模块，提升站点表达与可维护性。");
        phase3.put("image_url", "/images/katanegai.jpg");
        phase3.put("stack", List.of("Vue3", "Spring Boot", "Beads"));
        journey.add(phase3);

        return journey;
    }

    private Map<String, Object> defaultAboutSection() {
        Map<String, Object> about = new LinkedHashMap<>();
        about.put("intro", List.of(
            "Shizuki Site 是一个长期学习与创作系统。",
            "这里记录技术实践、项目迭代与个人成长。"
        ));
        about.put("mission", "持续构建一个可陪伴、可沉淀、可展示的个人站点。");
        about.put("focus", List.of("博客写作", "工程化实践", "图形与交互体验"));
        about.put("music", List.of("初音未来", "日语流行", "游戏原声"));
        about.put("intro_image_url", "/images/katanegai.jpg");
        about.put("mission_image_url", "/images/katanegai.jpg");
        about.put("links_image_url", "/images/katanegai.jpg");
        about.put("links", defaultLinks());
        return about;
    }

    private Map<String, Object> defaultSiteSection() {
        Map<String, Object> site = new LinkedHashMap<>();
        site.put("browser_title", "Levitation + Menu");
        site.put("favicon_url", "/images/katanegai.jpg");
        return site;
    }

    private List<Map<String, Object>> defaultLinks() {
        List<Map<String, Object>> links = new ArrayList<>();

        Map<String, Object> blogLink = new LinkedHashMap<>();
        blogLink.put("label", "博客列表");
        blogLink.put("url", "/#/blog");
        links.add(blogLink);

        Map<String, Object> homeLink = new LinkedHashMap<>();
        homeLink.put("label", "项目首页");
        homeLink.put("url", "/#/");
        links.add(homeLink);

        return links;
    }

    private List<String> castStringList(Object value) {
        if (value instanceof List<?> source) {
            return source.stream().map(String::valueOf).toList();
        }
        return List.of();
    }

    private record AuthorProfileCacheSnapshot(
        AuthorProfileResponse response,
        String etag,
        long lastModifiedEpochMillis,
        long expireAtMs
    ) {
    }

    private List<PostEntity> loadPublishedPostCandidates() {
        return postMapper.selectList(
            new LambdaQueryWrapper<PostEntity>()
                .eq(PostEntity::getDeleted, 0)
                .eq(PostEntity::getStatusCode, POST_STATUS_PUBLISHED)
                .orderByDesc(PostEntity::getPublishedAt)
                .orderByDesc(PostEntity::getId)
        );
    }

    private LocalDateTime resolvePostPublishTimeForDisplay(PostEntity post) {
        if (post == null) {
            return null;
        }
        LocalDateTime publishedAt = normalizePublishTime(post.getPublishedAt());
        if (publishedAt != null) {
            return publishedAt;
        }
        LocalDateTime createdAt = normalizePublishTime(post.getCreatedAt());
        if (createdAt != null) {
            return createdAt;
        }
        LocalDateTime updatedAt = normalizePublishTime(post.getUpdatedAt());
        if (updatedAt != null) {
            return updatedAt;
        }
        return null;
    }

    private LocalDateTime resolvePostPublishTimeForSort(PostEntity post) {
        LocalDateTime publishTime = resolvePostPublishTimeForDisplay(post);
        return publishTime == null ? LocalDateTime.MIN : publishTime;
    }

    private LocalDateTime normalizePublishTime(LocalDateTime value) {
        if (value == null) {
            return null;
        }
        if (value.getYear() <= 0) {
            return null;
        }
        if (value.equals(LocalDateTime.MIN)) {
            return null;
        }
        if (value.equals(LocalDateTime.MAX)) {
            return null;
        }
        return value;
    }

    private LocalDateTime resolvePostPublishTimeForFilter(PostEntity post) {
        LocalDateTime publishTime = resolvePostPublishTimeForDisplay(post);
        if (publishTime != null) {
            return publishTime;
        }
        return LocalDateTime.MIN;
    }

    private String normalizeDisplayCategory(String categoryCode) {
        String normalized = readString(categoryCode, "").trim().toLowerCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : "uncategorized";
    }

    private String normalizePostTitle(String title) {
        String normalized = readString(title, "").trim();
        return StringUtils.hasText(normalized) ? normalized : "未命名文章";
    }

    private String normalizeCategoryDisplayName(String categoryCode, PostCategoryMetaEntity meta) {
        String displayName = meta == null ? "" : readString(meta.getDisplayName(), "").trim();
        if (StringUtils.hasText(displayName)) {
            return displayName;
        }
        return normalizeDisplayCategory(categoryCode);
    }

    private Set<String> collectKnownCategoryCodes() {
        Set<String> categories = new LinkedHashSet<>();

        List<PostEntity> posts = postMapper.selectList(
            new LambdaQueryWrapper<PostEntity>()
                .select(PostEntity::getCategoryCode)
                .eq(PostEntity::getDeleted, 0)
                .orderByAsc(PostEntity::getCategoryCode)
        );
        posts.stream()
            .map(PostEntity::getCategoryCode)
            .map(this::normalizeDisplayCategory)
            .filter(StringUtils::hasText)
            .forEach(categories::add);

        postCategoryPolicyMapper.selectList(
                new LambdaQueryWrapper<PostCategoryPolicyEntity>()
                    .select(PostCategoryPolicyEntity::getCategoryCode)
                    .orderByAsc(PostCategoryPolicyEntity::getCategoryCode)
            ).stream()
            .map(PostCategoryPolicyEntity::getCategoryCode)
            .map(this::normalizeDisplayCategory)
            .filter(StringUtils::hasText)
            .forEach(categories::add);

        postCategoryMetaMapper.selectList(
                new LambdaQueryWrapper<PostCategoryMetaEntity>()
                    .select(PostCategoryMetaEntity::getCategoryCode)
                    .orderByAsc(PostCategoryMetaEntity::getCategoryCode)
            ).stream()
            .map(PostCategoryMetaEntity::getCategoryCode)
            .map(this::normalizeDisplayCategory)
            .filter(StringUtils::hasText)
            .forEach(categories::add);

        return categories;
    }

    private Map<String, PostCategoryMetaEntity> loadCategoryMetaMap(Set<String> categoryCodes) {
        List<PostCategoryMetaEntity> existing = postCategoryMetaMapper.selectList(
            new LambdaQueryWrapper<PostCategoryMetaEntity>().orderByAsc(PostCategoryMetaEntity::getCategoryCode)
        );
        Map<String, PostCategoryMetaEntity> map = existing.stream()
            .collect(Collectors.toMap(
                item -> normalizeDisplayCategory(item.getCategoryCode()),
                Function.identity(),
                (left, right) -> left,
                HashMap::new
            ));

        for (String categoryCode : categoryCodes) {
            String normalized = normalizeDisplayCategory(categoryCode);
            if (map.containsKey(normalized)) {
                continue;
            }
            PostCategoryMetaEntity fallback = new PostCategoryMetaEntity();
            fallback.setCategoryCode(normalized);
            fallback.setDisplayName(normalized);
            fallback.setSortNum(Integer.MAX_VALUE);
            fallback.setEnabledFlag(1);
            map.put(normalized, fallback);
        }
        return map;
    }

    private PostCategoryMetaResponse toPostCategoryMetaResponse(PostCategoryMetaEntity entity) {
        String categoryCode = normalizeDisplayCategory(entity.getCategoryCode());
        return new PostCategoryMetaResponse(
            categoryCode,
            normalizeCategoryDisplayName(categoryCode, entity),
            readString(entity.getCoverImageUrl(), ""),
            entity.getSortNum() == null ? Integer.MAX_VALUE : entity.getSortNum(),
            entity.getEnabledFlag() == null || entity.getEnabledFlag() == 1
        );
    }

    private PublishedRange resolvePublishedRange(String publishedFrom, String publishedTo) {
        LocalDateTime from = parseFilterDateTime(publishedFrom);
        LocalDateTime to = parseFilterDateTime(publishedTo);
        if (from != null && to != null && !from.isBefore(to)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "published_from must be before published_to");
        }
        return new PublishedRange(from, to);
    }

    private LocalDateTime parseFilterDateTime(String raw) {
        String normalized = readString(raw, "").trim();
        if (!StringUtils.hasText(normalized)) {
            return null;
        }
        try {
            return LocalDateTime.parse(normalized, DateTimeFormatter.ISO_DATE_TIME);
        } catch (DateTimeParseException ignored) {
            try {
                return OffsetDateTime.parse(normalized, DateTimeFormatter.ISO_DATE_TIME).toLocalDateTime();
            } catch (DateTimeParseException exception) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid datetime format: " + normalized);
            }
        }
    }

    private boolean matchesPublishedRange(PostEntity post, PublishedRange range) {
        if (range == null || range.isEmpty()) {
            return true;
        }
        LocalDateTime publishedAt = resolvePostPublishTimeForFilter(post);
        if (range.from() != null && publishedAt.isBefore(range.from())) {
            return false;
        }
        if (range.to() != null && !publishedAt.isBefore(range.to())) {
            return false;
        }
        return true;
    }

    @Override
    public PostDetailResponse getPublishedPostDetail(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null || !POST_STATUS_PUBLISHED.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT))) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }

        ViewerContext viewer = currentViewer();
        if (!canAccessPublishedPost(post, viewer)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post");
        }

        return toPostDetailResponse(post, readPostMarkdown(post), isPostEditable(post, viewer));
    }

    @Override
    public String downloadPublishedPostMarkdown(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null || !POST_STATUS_PUBLISHED.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT))) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }

        ViewerContext viewer = currentViewer();
        if (!canAccessPublishedPost(post, viewer)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post");
        }

        return readPostMarkdown(post);
    }

    @Override
    public PageResponse<AppSummary> listApps(long pageNo, long pageSize) {
        ViewerContext viewer = currentViewer();
        long limit = Math.max(1L, pageSize);
        long offset = pageNo <= 1 ? 0L : (pageNo - 1) * limit;

        if (viewer.admin()) {
            Long total = appMapper.selectCount(new LambdaQueryWrapper<AppEntity>());
            List<AppSummary> items = appMapper.selectList(
                    new LambdaQueryWrapper<AppEntity>()
                        .orderByDesc(AppEntity::getId)
                        .last("LIMIT " + limit + " OFFSET " + offset)
                ).stream()
                .map(app -> new AppSummary(app.getId(), app.getName(), app.getCategory(), Boolean.TRUE.equals(app.getPinAble())))
                .toList();
            return PageResponse.of(items, total == null ? 0L : total, pageNo, pageSize);
        }

        Long total = appMapper.countVisibleApps(viewer.userId(), viewer.groups());
        List<AppSummary> items = appMapper.selectVisibleApps(viewer.userId(), viewer.groups(), offset, limit)
            .stream()
            .map(app -> new AppSummary(app.getId(), app.getName(), app.getCategory(), Boolean.TRUE.equals(app.getPinAble())))
            .toList();
        return PageResponse.of(items, total == null ? 0L : total, pageNo, pageSize);
    }

    @Override
    public PageResponse<AuthorPostItemResponse> listMyPosts(long pageNo, long pageSize, String keyword, String statusCode) {
        Long userId = requireLoginUserId();
        long normalizedPageNo = pageNo <= 0 ? 1 : pageNo;
        long normalizedPageSize = Math.max(1L, Math.min(pageSize <= 0 ? 10L : pageSize, 100L));
        String normalizedKeyword = normalizeKeyword(keyword);
        String normalizedStatus = normalizeStatus(statusCode, false);

        List<PostEntity> all = postMapper.selectAuthorPosts(userId);
        Map<Long, List<String>> tagCache = new HashMap<>();
        List<PostEntity> filtered = all.stream()
            .filter(post -> matchesKeyword(post, normalizedKeyword, tagCache))
            .filter(post -> !StringUtils.hasText(normalizedStatus)
                || normalizedStatus.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT)))
            .toList();

        long total = filtered.size();
        int fromIndex = (int) Math.min((normalizedPageNo - 1) * normalizedPageSize, total);
        int toIndex = (int) Math.min(fromIndex + normalizedPageSize, total);

        List<AuthorPostItemResponse> items = filtered.subList(fromIndex, toIndex).stream()
            .map(this::toAuthorPostItemResponse)
            .toList();

        return PageResponse.of(items, total, normalizedPageNo, normalizedPageSize);
    }

    @Override
    public PostDetailResponse getMyPostDetail(Long postId) {
        Long userId = requireLoginUserId();
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!Objects.equals(userId, post.getUserId()) && !currentViewer().admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post");
        }
        return toPostDetailResponse(post, readPostMarkdown(post), true);
    }

    @Override
    public PostEditorPolicyResponse getMyPostCategoryPolicies() {
        requireLoginUserId();
        requirePermission("blog.post.write");

        ViewerContext viewer = currentViewer();
        List<PostCategoryPolicyEntity> policies = postCategoryPolicyMapper.selectList(
            new LambdaQueryWrapper<PostCategoryPolicyEntity>().orderByAsc(PostCategoryPolicyEntity::getCategoryCode)
        );
        Map<String, PostCategoryPolicyEntity> policyMap = policies.stream()
            .collect(Collectors.toMap(
                item -> normalizeDisplayCategory(item.getCategoryCode()),
                Function.identity(),
                (left, right) -> left,
                LinkedHashMap::new
            ));

        Set<String> categories = new LinkedHashSet<>(collectKnownCategoryCodes());
        categories.addAll(policyMap.keySet());

        List<String> sortedCategories = categories.stream()
            .map(this::normalizeDisplayCategory)
            .filter(StringUtils::hasText)
            .distinct()
            .sorted()
            .toList();

        Set<String> groupOptions = new LinkedHashSet<>(List.of("USER", "FRIEND", "ADMIN", "GUEST", "INTERVIEWER"));
        groupOptions.addAll(viewer.groups());

        List<PostEditorPolicyResponse.CategoryDefaultItem> categoryDefaults = new ArrayList<>();
        for (String categoryCode : sortedCategories) {
            PostCategoryPolicyEntity policy = policyMap.get(categoryCode);
            boolean enabled = policy != null && policy.getEnabledFlag() != null && policy.getEnabledFlag() == 1;
            Set<String> allowedGroups = enabled ? loadCategoryPolicyGroups(categoryCode) : Set.of();
            groupOptions.addAll(allowedGroups);
            categoryDefaults.add(new PostEditorPolicyResponse.CategoryDefaultItem(categoryCode, enabled, allowedGroups));
        }

        List<String> normalizedGroupOptions = groupOptions.stream()
            .map(item -> item == null ? "" : item.trim().toUpperCase(Locale.ROOT))
            .filter(StringUtils::hasText)
            .distinct()
            .sorted()
            .toList();

        return new PostEditorPolicyResponse(normalizedGroupOptions, categoryDefaults);
    }

    @Override
    public PostContentRelayResponse relayPostMarkdown(MultipartFile file) {
        Long userId = requireLoginUserId();
        requirePermission("blog.post.write");
        if (file == null || file.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Upload file is required");
        }

        String bucket = readString(blogPrivateBucket, "");
        if (!StringUtils.hasText(bucket)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Blog storage bucket is not configured");
        }

        long maxSize = blogMaxUploadSize <= 0 ? 1_048_576L : blogMaxUploadSize;
        long size = Math.max(0L, file.getSize());
        if (size <= 0L || size > maxSize) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Markdown file size exceeds limit");
        }

        String contentType = normalizeMarkdownContentType(file.getContentType());
        String key = buildMarkdownObjectKey(userId);

        try (InputStream inputStream = file.getInputStream()) {
            StorageObjectMetadata metadata = new StorageObjectMetadata();
            metadata.setContentType(contentType);
            metadata.setContentLength(size);
            objectStorageClient.putObject(bucket, key, inputStream, metadata);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Relay markdown upload failed");
        }

        return new PostContentRelayResponse(bucket, key, contentType, size);
    }

    @Override
    public AuthorPostItemResponse createMyPost(AuthorPostUpsertRequest request) {
        Long userId = requireLoginUserId();
        requirePermission("blog.post.write");
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }

        PreparedPostPayload payload = preparePostPayload(request, null);
        PostEntity post = new PostEntity();
        post.setUserId(userId);
        post.setPostNum(generatePostNum());
        post.setTitle(payload.title());
        post.setSummary(payload.summary());
        post.setCategoryCode(payload.categoryCode());
        post.setSlugCode(payload.slugCode());
        post.setCoverImageUrl(payload.coverImageUrl());
        post.setVisibility(payload.visibility().name());
        post.setStatusCode(POST_STATUS_DRAFT);
        post.setMarkdownBucket(payload.markdownBucket());
        post.setMarkdownKey(payload.markdownKey());
        post.setWordCount(payload.wordCount());
        post.setLineCount(payload.lineCount());
        post.setReadingMinutes(payload.readingMinutes());
        post.setLikeCount(0L);
        post.setCreatedAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());
        postMapper.insert(post);

        if (payload.visibility() == ContentVisibilityEnum.GROUP) {
            replacePostAcl(post.getId(), payload.allowedGroups());
        }
        replacePostTags(post.getId(), payload.tags());

        return toAuthorPostItemResponse(post);
    }

    @Override
    public AuthorPostItemResponse updateMyPost(Long postId, AuthorPostUpsertRequest request) {
        Long userId = requireLoginUserId();
        requirePermission("blog.post.write");
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }

        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!Objects.equals(post.getUserId(), userId) && !currentViewer().admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to update this post");
        }

        PreparedPostPayload payload = preparePostPayload(request, postId);
        post.setTitle(payload.title());
        post.setSummary(payload.summary());
        post.setCategoryCode(payload.categoryCode());
        post.setSlugCode(payload.slugCode());
        post.setCoverImageUrl(payload.coverImageUrl());
        post.setVisibility(payload.visibility().name());
        post.setMarkdownBucket(payload.markdownBucket());
        post.setMarkdownKey(payload.markdownKey());
        post.setWordCount(payload.wordCount());
        post.setLineCount(payload.lineCount());
        post.setReadingMinutes(payload.readingMinutes());
        post.setUpdatedAt(LocalDateTime.now());
        postMapper.updateById(post);

        if (payload.visibility() == ContentVisibilityEnum.GROUP) {
            replacePostAcl(post.getId(), payload.allowedGroups());
        } else {
            clearPostAcl(post.getId());
        }
        replacePostTags(post.getId(), payload.tags());

        return toAuthorPostItemResponse(post);
    }

    @Override
    public AuthorPostItemResponse publishMyPost(Long postId) {
        Long userId = requireLoginUserId();
        requirePermission("blog.post.publish");

        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!Objects.equals(post.getUserId(), userId) && !currentViewer().admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to publish this post");
        }

        validatePostReadyForPublish(post);

        post.setStatusCode(POST_STATUS_PUBLISHED);
        if (post.getPublishedAt() == null) {
            post.setPublishedAt(LocalDateTime.now());
        }
        post.setUpdatedAt(LocalDateTime.now());
        postMapper.updateById(post);
        return toAuthorPostItemResponse(post);
    }

    @Override
    public AuthorPostItemResponse unpublishMyPost(Long postId) {
        Long userId = requireLoginUserId();
        requirePermission("blog.post.publish");

        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!Objects.equals(post.getUserId(), userId) && !currentViewer().admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to unpublish this post");
        }

        post.setStatusCode(POST_STATUS_DRAFT);
        post.setPublishedAt(null);
        post.setUpdatedAt(LocalDateTime.now());
        postMapper.updateById(post);
        return toAuthorPostItemResponse(post);
    }

    @Override
    public PostPresentationResponse generateMyPostPresentation(Long postId) {
        Long userId = requireLoginUserId();
        requirePermission("blog.post.write");

        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!Objects.equals(post.getUserId(), userId) && !currentViewer().admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to generate presentation for this post");
        }

        schedulePresentationGeneration(post);
        return getMyPostPresentation(postId);
    }

    @Override
    public PostPresentationResponse getMyPostPresentation(Long postId) {
        Long userId = requireLoginUserId();
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!Objects.equals(post.getUserId(), userId) && !currentViewer().admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post presentation");
        }
        return buildPostPresentationResponse(post.getId(), findPostPresentation(post.getId()), true);
    }

    @Override
    public PostPresentationDownloadResponse getMyPostPresentationDownload(Long postId) {
        Long userId = requireLoginUserId();
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!Objects.equals(post.getUserId(), userId) && !currentViewer().admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post presentation");
        }
        PostPresentationEntity entity = requireReadyPresentation(post.getId());
        String bucket = readString(entity.getPptBucket(), "").trim();
        String key = readString(entity.getPptKey(), "").trim();
        if (!StringUtils.hasText(bucket) || !StringUtils.hasText(key)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Presentation PPT not found");
        }
        long expireSeconds = presentationDownloadExpireSeconds <= 0 ? 900L : presentationDownloadExpireSeconds;
        String fileName = sanitizePresentationFileName(post);
        return new PostPresentationDownloadResponse(objectStorageClient.generateGetUrl(bucket, key, expireSeconds), fileName);
    }

    @Override
    public PostPresentationResponse getPublishedPostPresentation(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null || !POST_STATUS_PUBLISHED.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT))) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        ViewerContext viewer = currentViewer();
        if (!canAccessPublishedPost(post, viewer)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post presentation");
        }
        return buildPostPresentationResponse(post.getId(), findPostPresentation(post.getId()), true);
    }

    @Override
    public PostPresentationDownloadResponse getPublishedPostPresentationDownload(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null || !POST_STATUS_PUBLISHED.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT))) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        ViewerContext viewer = currentViewer();
        if (!canAccessPublishedPost(post, viewer)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post presentation");
        }
        PostPresentationEntity entity = requireReadyPresentation(post.getId());
        String bucket = readString(entity.getPptBucket(), "").trim();
        String key = readString(entity.getPptKey(), "").trim();
        if (!StringUtils.hasText(bucket) || !StringUtils.hasText(key)) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Presentation PPT not found");
        }
        long expireSeconds = presentationDownloadExpireSeconds <= 0 ? 900L : presentationDownloadExpireSeconds;
        String fileName = sanitizePresentationFileName(post);
        return new PostPresentationDownloadResponse(objectStorageClient.generateGetUrl(bucket, key, expireSeconds), fileName);
    }

    @Override
    public Map<String, Object> likePost(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!POST_STATUS_PUBLISHED.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT))) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Post is not published");
        }
        if (!canAccessPublishedPost(post, currentViewer())) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this post");
        }

        post.setLikeCount((post.getLikeCount() == null ? 0L : post.getLikeCount()) + 1);
        postMapper.updateById(post);
        return Map.of("post_id", postId, "liked", true, "like_count", post.getLikeCount());
    }

    @Override
    public Map<String, Object> likeApp(Long appId) {
        AppEntity app = appMapper.selectById(appId);
        if (app == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "App not found");
        }
        if (!canAccessApp(app, currentViewer())) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "No permission to access this app");
        }

        app.setLikeCount((app.getLikeCount() == null ? 0L : app.getLikeCount()) + 1);
        appMapper.updateById(app);
        return Map.of("app_id", appId, "liked", true, "like_count", app.getLikeCount());
    }

    @Override
    public Map<String, Object> report(ReportRequest request) {
        ContentReportEntity report = new ContentReportEntity();
        report.setTargetType(request.getTargetType());
        report.setTargetId(request.getTargetId());
        report.setReason(request.getReason());
        report.setStatus(REPORT_STATUS_CREATED);
        report.setCreatedAt(LocalDateTime.now());
        contentReportMapper.insert(report);
        return Map.of(
            "report_id", report.getId(),
            "target_type", report.getTargetType(),
            "target_id", report.getTargetId(),
            "status", report.getStatus()
        );
    }

    @Override
    public Map<String, Object> submitAuthorWhisper(AuthorWhisperRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "request body is required");
        }

        String content = trimToEmpty(request.getContent());
        if (!StringUtils.hasText(content)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "content is required");
        }

        Long normalizedPostId = request.getPostId();
        if (normalizedPostId != null && normalizedPostId > 0) {
            PostEntity post = postMapper.selectById(normalizedPostId);
            if (post == null || !POST_STATUS_PUBLISHED.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT))) {
                throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
            }
        } else {
            normalizedPostId = 0L;
        }

        String whisperReason = buildWhisperReason(content, request.getNickname(), request.getRemark());
        ContentReportEntity report = new ContentReportEntity();
        report.setTargetType(REPORT_TARGET_AUTHOR_WHISPER);
        report.setTargetId(normalizedPostId);
        report.setReason(whisperReason);
        report.setStatus(REPORT_STATUS_CREATED);
        report.setCreatedAt(LocalDateTime.now());
        contentReportMapper.insert(report);

        return Map.of(
            "whisper_id", report.getId(),
            "status", report.getStatus(),
            "target_post_id", normalizedPostId,
            "accepted", true
        );
    }

    @Override
    public PageResponse<AuthorWhisperItemResponse> listAuthorWhispers(long pageNo, long pageSize) {
        requireAdmin();

        long normalizedPageNo = pageNo <= 0 ? 1 : pageNo;
        long normalizedPageSize = Math.max(1L, Math.min(pageSize <= 0 ? 20L : pageSize, 100L));

        List<ContentReportEntity> allWhispers = contentReportMapper.selectList(
            new LambdaQueryWrapper<ContentReportEntity>()
                .eq(ContentReportEntity::getTargetType, REPORT_TARGET_AUTHOR_WHISPER)
                .orderByDesc(ContentReportEntity::getCreatedAt)
                .orderByDesc(ContentReportEntity::getId)
        );

        long total = allWhispers.size();
        int fromIndex = (int) Math.min((normalizedPageNo - 1) * normalizedPageSize, total);
        int toIndex = (int) Math.min(fromIndex + normalizedPageSize, total);
        List<ContentReportEntity> pageRows = allWhispers.subList(fromIndex, toIndex);

        Map<Long, String> postTitleMap = resolveWhisperPostTitleMap(pageRows);
        List<AuthorWhisperItemResponse> items = pageRows.stream()
            .map(row -> toAuthorWhisperItem(row, postTitleMap))
            .toList();

        return PageResponse.of(items, total, normalizedPageNo, normalizedPageSize);
    }

    private String buildWhisperReason(String content, String nickname, String remark) {
        String normalizedNickname = trimToEmpty(nickname);
        String normalizedRemark = trimToEmpty(remark);
        String normalizedContent = trimToEmpty(content);

        List<String> sections = new ArrayList<>();
        sections.add("content=" + normalizedContent);
        if (StringUtils.hasText(normalizedNickname)) {
            sections.add("nickname=" + normalizedNickname);
        }
        if (StringUtils.hasText(normalizedRemark)) {
            sections.add("remark=" + normalizedRemark);
        }
        String payload = String.join(" | ", sections);
        if (payload.length() <= 255) {
            return payload;
        }
        return payload.substring(0, 255);
    }

    private AuthorWhisperItemResponse toAuthorWhisperItem(ContentReportEntity row, Map<Long, String> postTitleMap) {
        if (row == null) {
            return new AuthorWhisperItemResponse(null, REPORT_STATUS_CREATED, 0L, "站点留言", "", "", "", null);
        }
        long postId = row.getTargetId() == null || row.getTargetId() <= 0 ? 0L : row.getTargetId();
        Map<String, String> parsed = parseWhisperReason(row.getReason());
        String content = readString(parsed.get("content"), "");
        String nickname = readString(parsed.get("nickname"), "");
        String remark = readString(parsed.get("remark"), "");
        String postTitle = postId > 0
            ? readString(postTitleMap.get(postId), "已删除或不可见文章")
            : "站点留言";
        return new AuthorWhisperItemResponse(
            row.getId(),
            readString(row.getStatus(), REPORT_STATUS_CREATED),
            postId,
            postTitle,
            content,
            nickname,
            remark,
            row.getCreatedAt()
        );
    }

    private Map<Long, String> resolveWhisperPostTitleMap(List<ContentReportEntity> whispers) {
        if (whispers == null || whispers.isEmpty()) {
            return Map.of();
        }
        Set<Long> postIds = whispers.stream()
            .map(ContentReportEntity::getTargetId)
            .filter(Objects::nonNull)
            .filter(id -> id > 0)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        if (postIds.isEmpty()) {
            return Map.of();
        }
        return postMapper.selectBatchIds(postIds).stream()
            .filter(Objects::nonNull)
            .collect(Collectors.toMap(
                PostEntity::getId,
                post -> normalizePostTitle(post.getTitle()),
                (left, right) -> left
            ));
    }

    private Map<String, String> parseWhisperReason(String reason) {
        String raw = trimToEmpty(reason);
        if (!StringUtils.hasText(raw)) {
            return Map.of("content", "", "nickname", "", "remark", "");
        }

        Map<String, String> parsed = new LinkedHashMap<>();
        String[] sections = raw.split("\\s*\\|\\s*");
        for (String section : sections) {
            String normalizedSection = trimToEmpty(section);
            if (!StringUtils.hasText(normalizedSection)) {
                continue;
            }
            int separatorIndex = normalizedSection.indexOf('=');
            if (separatorIndex <= 0) {
                continue;
            }
            String key = normalizedSection.substring(0, separatorIndex).trim().toLowerCase(Locale.ROOT);
            String value = normalizedSection.substring(separatorIndex + 1).trim();
            if (StringUtils.hasText(key) && !parsed.containsKey(key)) {
                parsed.put(key, value);
            }
        }

        parsed.putIfAbsent("content", raw);
        parsed.putIfAbsent("nickname", "");
        parsed.putIfAbsent("remark", "");
        return parsed;
    }

    private String trimToEmpty(String value) {
        return StringUtils.trimWhitespace(readString(value, ""));
    }

    @Override
    public ContentVisibilityResponse getPostVisibility(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        return new ContentVisibilityResponse(postId, normalizeVisibility(post.getVisibility()).name(), loadPostAclGroups(postId));
    }

    @Override
    public ContentVisibilityResponse updatePostVisibility(Long postId, ContentVisibilityUpdateRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }

        ContentVisibilityEnum visibility = ContentVisibilityEnum.from(request.getVisibility());
        Set<String> allowedGroups = normalizeGroupCodes(request.getAllowedGroupCodes());
        validateVisibilityAcl(visibility, allowedGroups);

        post.setVisibility(visibility.name());
        post.setUpdatedAt(LocalDateTime.now());
        postMapper.updateById(post);

        if (visibility == ContentVisibilityEnum.GROUP) {
            replacePostAcl(postId, allowedGroups);
        } else {
            clearPostAcl(postId);
        }
        return new ContentVisibilityResponse(postId, visibility.name(), visibility == ContentVisibilityEnum.GROUP ? allowedGroups : Set.of());
    }

    @Override
    public ContentVisibilityResponse getAppVisibility(Long appId) {
        AppEntity app = appMapper.selectById(appId);
        if (app == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "App not found");
        }
        return new ContentVisibilityResponse(appId, normalizeVisibility(app.getVisibility()).name(), loadAppAclGroups(appId));
    }

    @Override
    public ContentVisibilityResponse updateAppVisibility(Long appId, ContentVisibilityUpdateRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }
        AppEntity app = appMapper.selectById(appId);
        if (app == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "App not found");
        }

        ContentVisibilityEnum visibility = ContentVisibilityEnum.from(request.getVisibility());
        Set<String> allowedGroups = normalizeGroupCodes(request.getAllowedGroupCodes());
        validateVisibilityAcl(visibility, allowedGroups);

        app.setVisibility(visibility.name());
        app.setUpdatedAt(LocalDateTime.now());
        appMapper.updateById(app);

        if (visibility == ContentVisibilityEnum.GROUP) {
            replaceAppAcl(appId, allowedGroups);
        } else {
            clearAppAcl(appId);
        }
        return new ContentVisibilityResponse(appId, visibility.name(), visibility == ContentVisibilityEnum.GROUP ? allowedGroups : Set.of());
    }

    @Override
    public List<PostCategoryPolicyResponse> listPostCategoryPolicies() {
        List<PostCategoryPolicyEntity> policies = postCategoryPolicyMapper.selectList(
            new LambdaQueryWrapper<PostCategoryPolicyEntity>().orderByAsc(PostCategoryPolicyEntity::getCategoryCode)
        );
        return policies.stream()
            .map(policy -> new PostCategoryPolicyResponse(
                policy.getCategoryCode(),
                policy.getEnabledFlag() != null && policy.getEnabledFlag() == 1,
                loadCategoryPolicyGroups(policy.getCategoryCode())
            ))
            .toList();
    }

    @Override
    public PostCategoryPolicyResponse updatePostCategoryPolicy(String categoryCode, PostCategoryPolicyUpdateRequest request) {
        requireAdmin();
        String normalizedCategory = normalizeCategoryCode(categoryCode, true);
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }

        boolean enabled = request.getEnabled() == null || request.getEnabled();
        Set<String> allowedGroups = normalizeGroupCodes(request.getAllowedGroupCodes());
        if (enabled && allowedGroups.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups are required when category policy is enabled");
        }

        PostCategoryPolicyEntity policy = postCategoryPolicyMapper.selectOne(
            new LambdaQueryWrapper<PostCategoryPolicyEntity>().eq(PostCategoryPolicyEntity::getCategoryCode, normalizedCategory)
        );
        if (policy == null) {
            policy = new PostCategoryPolicyEntity();
            policy.setCategoryCode(normalizedCategory);
            policy.setEnabledFlag(enabled ? 1 : 0);
            policy.setCreatedAt(LocalDateTime.now());
            policy.setUpdatedAt(LocalDateTime.now());
            postCategoryPolicyMapper.insert(policy);
        } else {
            policy.setEnabledFlag(enabled ? 1 : 0);
            policy.setUpdatedAt(LocalDateTime.now());
            postCategoryPolicyMapper.updateById(policy);
        }

        replaceCategoryPolicyGroups(normalizedCategory, allowedGroups);
        return new PostCategoryPolicyResponse(normalizedCategory, enabled, allowedGroups);
    }

    @Override
    public List<PostCategoryMetaResponse> listPostCategoryMetas() {
        requireAdmin();
        Map<String, PostCategoryMetaEntity> metaMap = loadCategoryMetaMap(collectKnownCategoryCodes());
        return metaMap.values().stream()
            .sorted(
                Comparator.comparing(
                        (PostCategoryMetaEntity item) -> item.getSortNum() == null ? Integer.MAX_VALUE : item.getSortNum()
                    )
                    .thenComparing(PostCategoryMetaEntity::getCategoryCode)
            )
            .map(this::toPostCategoryMetaResponse)
            .toList();
    }

    @Override
    public PostCategoryMetaResponse upsertPostCategoryMeta(String categoryCode, PostCategoryMetaUpsertRequest request) {
        requireAdmin();
        String normalizedCategory = normalizeCategoryCode(categoryCode, true);
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }

        PostCategoryMetaEntity entity = postCategoryMetaMapper.selectOne(
            new LambdaQueryWrapper<PostCategoryMetaEntity>().eq(PostCategoryMetaEntity::getCategoryCode, normalizedCategory)
        );
        if (entity == null) {
            entity = new PostCategoryMetaEntity();
            entity.setCategoryCode(normalizedCategory);
            entity.setCreatedAt(LocalDateTime.now());
        }

        String displayName = readString(request.getDisplayName(), "").trim();
        if (displayName.length() > 128) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Display name is too long");
        }
        String coverImageUrl = readString(request.getCoverImageUrl(), "").trim();
        if (coverImageUrl.length() > 512) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Cover image url is too long");
        }
        Integer sortNum = request.getSortNum() == null ? Integer.MAX_VALUE : request.getSortNum();
        if (sortNum < 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Sort number must be >= 0");
        }
        boolean enabled = request.getEnabled() == null || request.getEnabled();

        entity.setDisplayName(StringUtils.hasText(displayName) ? displayName : normalizedCategory);
        entity.setCoverImageUrl(StringUtils.hasText(coverImageUrl) ? coverImageUrl : null);
        entity.setSortNum(sortNum);
        entity.setEnabledFlag(enabled ? 1 : 0);
        entity.setUpdatedAt(LocalDateTime.now());

        if (entity.getId() == null || entity.getId() <= 0) {
            postCategoryMetaMapper.insert(entity);
        } else {
            postCategoryMetaMapper.updateById(entity);
        }
        return toPostCategoryMetaResponse(entity);
    }

    @Override
    public void deletePostCategoryMeta(String categoryCode) {
        requireAdmin();
        String normalizedCategory = normalizeCategoryCode(categoryCode, true);

        Long usingCount = postMapper.selectCount(
            new LambdaQueryWrapper<PostEntity>()
                .eq(PostEntity::getDeleted, 0)
                .eq(PostEntity::getCategoryCode, normalizedCategory)
        );
        if (usingCount != null && usingCount > 0) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Category is still used by existing posts and cannot be deleted"
            );
        }

        PostCategoryMetaEntity meta = postCategoryMetaMapper.selectOne(
            new LambdaQueryWrapper<PostCategoryMetaEntity>().eq(PostCategoryMetaEntity::getCategoryCode, normalizedCategory)
        );
        if (meta != null && meta.getId() != null) {
            postCategoryMetaMapper.deleteById(meta.getId());
        }

        clearCategoryPolicyGroups(normalizedCategory);

        PostCategoryPolicyEntity policy = postCategoryPolicyMapper.selectOne(
            new LambdaQueryWrapper<PostCategoryPolicyEntity>().eq(PostCategoryPolicyEntity::getCategoryCode, normalizedCategory)
        );
        if (policy != null && policy.getId() != null) {
            postCategoryPolicyMapper.deleteById(policy.getId());
        }
    }

    private boolean canAccessPublishedPost(PostEntity post, ViewerContext viewer) {
        if (post == null || !POST_STATUS_PUBLISHED.equalsIgnoreCase(readString(post.getStatusCode(), POST_STATUS_DRAFT))) {
            return false;
        }
        ContentVisibilityEnum visibility = normalizeVisibility(post.getVisibility());
        if (visibility == ContentVisibilityEnum.PUBLIC) {
            return canAccessByCategoryPolicy(post.getCategoryCode(), viewer);
        }
        boolean owner = viewer.userId() != null && viewer.userId().equals(post.getUserId());
        if (owner || viewer.admin()) {
            return true;
        }
        if (visibility != ContentVisibilityEnum.GROUP) {
            return false;
        }
        Set<String> allowedGroups = loadPostAclGroups(post.getId());
        return viewer.groups().stream().anyMatch(allowedGroups::contains);
    }

    private boolean canAccessByCategoryPolicy(String categoryCode, ViewerContext viewer) {
        if (viewer.admin()) {
            return true;
        }
        String normalizedCategory = normalizeCategoryCode(categoryCode, false);
        if (!StringUtils.hasText(normalizedCategory)) {
            return true;
        }

        PostCategoryPolicyEntity policy = postCategoryPolicyMapper.selectOne(
            new LambdaQueryWrapper<PostCategoryPolicyEntity>().eq(PostCategoryPolicyEntity::getCategoryCode, normalizedCategory)
        );
        if (policy == null || policy.getEnabledFlag() == null || policy.getEnabledFlag() != 1) {
            return true;
        }

        Set<String> allowedGroups = loadCategoryPolicyGroups(normalizedCategory);
        if (allowedGroups.isEmpty()) {
            return false;
        }
        return viewer.groups().stream().anyMatch(allowedGroups::contains);
    }

    private boolean isPostEditable(PostEntity post, ViewerContext viewer) {
        if (post == null || viewer == null) {
            return false;
        }
        if (viewer.admin()) {
            return true;
        }
        return viewer.userId() != null && viewer.userId().equals(post.getUserId());
    }

    private boolean canAccessApp(AppEntity app, ViewerContext viewer) {
        ContentVisibilityEnum visibility = normalizeVisibility(app.getVisibility());
        if (visibility == ContentVisibilityEnum.PUBLIC) {
            return true;
        }
        boolean owner = viewer.userId() != null && viewer.userId().equals(app.getUserId());
        if (owner || viewer.admin()) {
            return true;
        }
        if (visibility != ContentVisibilityEnum.GROUP) {
            return false;
        }
        Set<String> allowedGroups = loadAppAclGroups(app.getId());
        return viewer.groups().stream().anyMatch(allowedGroups::contains);
    }

    private Set<String> loadPostAclGroups(Long postId) {
        return postGroupAclMapper.selectList(
                new LambdaQueryWrapper<PostGroupAclEntity>()
                    .eq(PostGroupAclEntity::getPostId, postId)
                    .orderByAsc(PostGroupAclEntity::getGroupCode)
            ).stream()
            .map(PostGroupAclEntity::getGroupCode)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private Set<String> loadAppAclGroups(Long appId) {
        return appGroupAclMapper.selectList(
                new LambdaQueryWrapper<AppGroupAclEntity>()
                    .eq(AppGroupAclEntity::getAppId, appId)
                    .orderByAsc(AppGroupAclEntity::getGroupCode)
            ).stream()
            .map(AppGroupAclEntity::getGroupCode)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private Set<String> loadCategoryPolicyGroups(String categoryCode) {
        return postCategoryPolicyGroupMapper.selectList(
                new LambdaQueryWrapper<PostCategoryPolicyGroupEntity>()
                    .eq(PostCategoryPolicyGroupEntity::getCategoryCode, categoryCode)
                    .orderByAsc(PostCategoryPolicyGroupEntity::getGroupCode)
            ).stream()
            .map(PostCategoryPolicyGroupEntity::getGroupCode)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private List<String> loadPostTags(Long postId) {
        return loadPostTags(postId, null);
    }

    private List<String> loadPostTags(Long postId, Map<Long, List<String>> tagCache) {
        if (postId == null || postId <= 0) {
            return List.of();
        }
        if (tagCache != null && tagCache.containsKey(postId)) {
            return tagCache.get(postId);
        }
        List<String> tags = postTagMapper.selectList(
                new LambdaQueryWrapper<PostTagEntity>()
                    .eq(PostTagEntity::getPostId, postId)
                    .orderByAsc(PostTagEntity::getTagCode)
            ).stream()
            .map(PostTagEntity::getTagCode)
            .toList();
        if (tagCache != null) {
            tagCache.put(postId, tags);
        }
        return tags;
    }

    private void replacePostAcl(Long postId, Set<String> groups) {
        clearPostAcl(postId);
        LocalDateTime now = LocalDateTime.now();
        for (String group : groups) {
            PostGroupAclEntity acl = new PostGroupAclEntity();
            acl.setPostId(postId);
            acl.setGroupCode(group);
            acl.setCreatedAt(now);
            acl.setUpdatedAt(now);
            postGroupAclMapper.insert(acl);
        }
    }

    private void replaceAppAcl(Long appId, Set<String> groups) {
        clearAppAcl(appId);
        LocalDateTime now = LocalDateTime.now();
        for (String group : groups) {
            AppGroupAclEntity acl = new AppGroupAclEntity();
            acl.setAppId(appId);
            acl.setGroupCode(group);
            acl.setCreatedAt(now);
            acl.setUpdatedAt(now);
            appGroupAclMapper.insert(acl);
        }
    }

    private void replacePostTags(Long postId, Set<String> tags) {
        clearPostTags(postId);
        LocalDateTime now = LocalDateTime.now();
        for (String tag : normalizeTagCodes(tags)) {
            PostTagEntity entity = new PostTagEntity();
            entity.setPostId(postId);
            entity.setTagCode(tag);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            postTagMapper.insert(entity);
        }
    }

    private void replaceCategoryPolicyGroups(String categoryCode, Set<String> groups) {
        clearCategoryPolicyGroups(categoryCode);
        LocalDateTime now = LocalDateTime.now();
        for (String group : groups) {
            PostCategoryPolicyGroupEntity entity = new PostCategoryPolicyGroupEntity();
            entity.setCategoryCode(categoryCode);
            entity.setGroupCode(group);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            postCategoryPolicyGroupMapper.insert(entity);
        }
    }

    private void clearPostAcl(Long postId) {
        List<PostGroupAclEntity> existing = postGroupAclMapper.selectList(
            new LambdaQueryWrapper<PostGroupAclEntity>().eq(PostGroupAclEntity::getPostId, postId)
        );
        existing.forEach(acl -> postGroupAclMapper.deleteById(acl.getId()));
    }

    private void clearAppAcl(Long appId) {
        List<AppGroupAclEntity> existing = appGroupAclMapper.selectList(
            new LambdaQueryWrapper<AppGroupAclEntity>().eq(AppGroupAclEntity::getAppId, appId)
        );
        existing.forEach(acl -> appGroupAclMapper.deleteById(acl.getId()));
    }

    private void clearPostTags(Long postId) {
        List<PostTagEntity> existing = postTagMapper.selectList(
            new LambdaQueryWrapper<PostTagEntity>().eq(PostTagEntity::getPostId, postId)
        );
        existing.forEach(tag -> postTagMapper.deleteById(tag.getId()));
    }

    private void clearCategoryPolicyGroups(String categoryCode) {
        List<PostCategoryPolicyGroupEntity> existing = postCategoryPolicyGroupMapper.selectList(
            new LambdaQueryWrapper<PostCategoryPolicyGroupEntity>().eq(PostCategoryPolicyGroupEntity::getCategoryCode, categoryCode)
        );
        existing.forEach(item -> postCategoryPolicyGroupMapper.deleteById(item.getId()));
    }

    private void validateVisibilityAcl(ContentVisibilityEnum visibility, Set<String> groups) {
        if (visibility == ContentVisibilityEnum.GROUP && (groups == null || groups.isEmpty())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups are required for GROUP visibility");
        }
        if (visibility != ContentVisibilityEnum.GROUP && groups != null && !groups.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Allowed groups can only be set for GROUP visibility");
        }
    }

    private Set<String> normalizeGroupCodes(Set<String> groups) {
        if (groups == null || groups.isEmpty()) {
            return Set.of();
        }
        Set<String> normalized = groups.stream()
            .map(value -> value == null ? null : value.trim())
            .filter(StringUtils::hasText)
            .map(value -> value.toUpperCase(Locale.ROOT))
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    private Set<String> normalizeTagCodes(Set<String> tags) {
        if (tags == null || tags.isEmpty()) {
            return Set.of();
        }
        Set<String> normalized = tags.stream()
            .map(this::normalizeTagCode)
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    private String normalizeTagCode(String raw) {
        String value = readString(raw, "").trim().toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(value)) {
            return "";
        }
        return value.replaceAll("[^a-z0-9_-]", "");
    }

    private ContentVisibilityEnum normalizeVisibility(String raw) {
        if (!StringUtils.hasText(raw)) {
            return ContentVisibilityEnum.PUBLIC;
        }
        try {
            return ContentVisibilityEnum.from(raw);
        } catch (BusinessException exception) {
            return ContentVisibilityEnum.PUBLIC;
        }
    }

    private PreparedPostPayload preparePostPayload(AuthorPostUpsertRequest request, Long updatingPostId) {
        String title = readString(request.getTitle(), "").trim();
        String summary = readString(request.getSummary(), "").trim();
        if (title.length() > 255) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Title is too long");
        }
        if (summary.length() > 500) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Summary is too long");
        }

        ContentVisibilityEnum visibility = ContentVisibilityEnum.from(request.getVisibility());
        Set<String> allowedGroups = normalizeGroupCodes(request.getAllowedGroupCodes());
        validateVisibilityAcl(visibility, allowedGroups);

        String categoryCode = normalizeCategoryCode(request.getCategoryCode(), true);
        String slugCode = normalizeSlugCode(request.getSlugCode());
        validateSlugUnique(slugCode, updatingPostId);

        String markdownBucket = readString(request.getMarkdownBucket(), "").trim();
        String markdownKey = readString(request.getMarkdownKey(), "").trim();
        if (!StringUtils.hasText(markdownBucket) || !StringUtils.hasText(markdownKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Markdown bucket/key are required");
        }

        String configuredBucket = readString(blogPrivateBucket, "").trim();
        if (StringUtils.hasText(configuredBucket) && !configuredBucket.equals(markdownBucket)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Markdown bucket is not allowed");
        }

        if (!objectStorageClient.objectExists(markdownBucket, markdownKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Markdown object does not exist in storage");
        }

        String markdown = readMarkdownObject(markdownBucket, markdownKey);
        MarkdownMetrics metrics = computeMarkdownMetrics(markdown);
        String coverImageUrl = resolveCoverImageUrl(request.getCoverImageUrl(), markdown);

        return new PreparedPostPayload(
            title,
            summary,
            categoryCode,
            slugCode,
            coverImageUrl,
            visibility,
            allowedGroups,
            normalizeTagCodes(request.getTags()),
            markdownBucket,
            markdownKey,
            metrics.wordCount(),
            metrics.lineCount(),
            metrics.readingMinutes()
        );
    }

    private void validatePostReadyForPublish(PostEntity post) {
        String title = readString(post.getTitle(), "").trim();
        String summary = readString(post.getSummary(), "").trim();
        if (!StringUtils.hasText(title)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Title is required before publishing");
        }
        if (!StringUtils.hasText(summary)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Summary is required before publishing");
        }
        if (title.length() > 255) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Title is too long");
        }
        if (summary.length() > 500) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Summary is too long");
        }

        normalizeCategoryCode(readString(post.getCategoryCode(), "").trim(), true);

        String markdownBucket = readString(post.getMarkdownBucket(), "").trim();
        String markdownKey = readString(post.getMarkdownKey(), "").trim();
        if (!StringUtils.hasText(markdownBucket) || !StringUtils.hasText(markdownKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Markdown content is required before publishing");
        }

        String configuredBucket = readString(blogPrivateBucket, "").trim();
        if (StringUtils.hasText(configuredBucket) && !configuredBucket.equals(markdownBucket)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Markdown bucket is not allowed");
        }
        if (!objectStorageClient.objectExists(markdownBucket, markdownKey)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Markdown object does not exist in storage");
        }
    }

    private String normalizeCategoryCode(String raw, boolean required) {
        String normalized = readString(raw, "").trim().toLowerCase(Locale.ROOT);
        normalized = normalized.replaceAll("[^a-z0-9_-]", "");
        if (!StringUtils.hasText(normalized)) {
            if (required) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Category code is required");
            }
            return "";
        }
        if (normalized.length() > 64) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Category code is too long");
        }
        return normalized;
    }

    private String normalizeSlugCode(String raw) {
        String normalized = readString(raw, "").trim().toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            return null;
        }
        normalized = normalized.replaceAll("[^a-z0-9_-]", "");
        if (!StringUtils.hasText(normalized)) {
            return null;
        }
        if (normalized.length() > 128) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Slug is too long");
        }
        return normalized;
    }

    private String normalizeStatus(String raw, boolean required) {
        String normalized = readString(raw, "").trim().toUpperCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            if (required) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Status is required");
            }
            return "";
        }
        if (!POST_STATUS_DRAFT.equals(normalized) && !POST_STATUS_PUBLISHED.equals(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported status: " + normalized);
        }
        return normalized;
    }

    private String normalizeKeyword(String raw) {
        String normalized = readString(raw, "").trim();
        return normalized.length() > 128 ? normalized.substring(0, 128) : normalized;
    }

    private void validateSlugUnique(String slugCode, Long updatingPostId) {
        if (!StringUtils.hasText(slugCode)) {
            return;
        }
        LambdaQueryWrapper<PostEntity> wrapper = new LambdaQueryWrapper<PostEntity>()
            .eq(PostEntity::getSlugCode, slugCode);
        if (updatingPostId != null && updatingPostId > 0) {
            wrapper.ne(PostEntity::getId, updatingPostId);
        }
        Long count = postMapper.selectCount(wrapper);
        if (count != null && count > 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Slug already exists");
        }
    }

    private boolean matchesKeyword(PostEntity post, String keyword, Map<Long, List<String>> tagCache) {
        if (!StringUtils.hasText(keyword)) {
            return true;
        }
        String normalized = keyword.toLowerCase(Locale.ROOT);
        if (readString(post.getTitle(), "").toLowerCase(Locale.ROOT).contains(normalized)
            || readString(post.getSummary(), "").toLowerCase(Locale.ROOT).contains(normalized)) {
            return true;
        }
        return loadPostTags(post.getId(), tagCache).stream()
            .anyMatch(tag -> readString(tag, "").toLowerCase(Locale.ROOT).contains(normalized));
    }

    private boolean matchesCategory(PostEntity post, String categoryCode) {
        if (!StringUtils.hasText(categoryCode)) {
            return true;
        }
        return categoryCode.equalsIgnoreCase(readString(post.getCategoryCode(), ""));
    }

    private boolean matchesTag(Long postId, String tagCode, Map<Long, List<String>> tagCache) {
        if (!StringUtils.hasText(tagCode)) {
            return true;
        }
        return loadPostTags(postId, tagCache).stream().anyMatch(tagCode::equals);
    }

    private PostPresentationEntity findPostPresentation(Long postId) {
        if (postId == null || postId <= 0) {
            return null;
        }
        try {
            return postPresentationMapper.selectOne(
                new LambdaQueryWrapper<PostPresentationEntity>()
                    .eq(PostPresentationEntity::getPostId, postId)
                    .last("LIMIT 1")
            );
        } catch (RuntimeException exception) {
            if (isMissingPresentationTable(exception)) {
                return null;
            }
            throw exception;
        }
    }

    private PostPresentationEntity requireReadyPresentation(Long postId) {
        PostPresentationEntity entity = findPostPresentation(postId);
        if (entity == null || !POST_PRESENTATION_STATUS_READY.equalsIgnoreCase(readString(entity.getStatusCode(), ""))) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Presentation is not ready");
        }
        return entity;
    }

    private PostPresentationResponse buildPostPresentationResponse(Long postId, PostPresentationEntity entity, boolean includeMarkdown) {
        if (entity == null) {
            return new PostPresentationResponse(
                postId,
                POST_PRESENTATION_STATUS_NOT_GENERATED,
                0,
                null,
                PostPresentationTemplateService.TEMPLATE_VERSION,
                "",
                false,
                ""
            );
        }

        String status = readString(entity.getStatusCode(), POST_PRESENTATION_STATUS_NOT_GENERATED);
        boolean pptReady = POST_PRESENTATION_STATUS_READY.equalsIgnoreCase(status)
            && StringUtils.hasText(readString(entity.getPptBucket(), ""))
            && StringUtils.hasText(readString(entity.getPptKey(), ""));
        String slidevMarkdown = "";
        if (includeMarkdown
            && POST_PRESENTATION_STATUS_READY.equalsIgnoreCase(status)
            && StringUtils.hasText(readString(entity.getSlidevBucket(), ""))
            && StringUtils.hasText(readString(entity.getSlidevKey(), ""))) {
            try {
                slidevMarkdown = readMarkdownObject(entity.getSlidevBucket(), entity.getSlidevKey());
            } catch (BusinessException ignored) {
                slidevMarkdown = "";
            }
        }

        return new PostPresentationResponse(
            postId,
            status,
            entity.getSlideCount() == null ? 0 : entity.getSlideCount(),
            entity.getGeneratedAt(),
            readString(entity.getTemplateVersion(), PostPresentationTemplateService.TEMPLATE_VERSION),
            slidevMarkdown,
            pptReady,
            readString(entity.getErrorText(), "")
        );
    }

    private void schedulePresentationGeneration(PostEntity post) {
        if (post == null || post.getId() == null || post.getId() <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Post is required for presentation generation");
        }
        String storageBucket = readString(blogPrivateBucket, "").trim();
        if (!StringUtils.hasText(storageBucket)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Blog storage bucket is not configured");
        }

        String markdown = readPostMarkdown(post);
        if (!StringUtils.hasText(markdown)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Post markdown is empty");
        }

        PostPresentationEntity existing;
        String previousSlidevBucket;
        String previousSlidevKey;
        String previousPptBucket;
        String previousPptKey;
        try {
            existing = findPostPresentation(post.getId());
            previousSlidevBucket = existing == null ? "" : readString(existing.getSlidevBucket(), "");
            previousSlidevKey = existing == null ? "" : readString(existing.getSlidevKey(), "");
            previousPptBucket = existing == null ? "" : readString(existing.getPptBucket(), "");
            previousPptKey = existing == null ? "" : readString(existing.getPptKey(), "");

            PostPresentationEntity entity = existing == null ? new PostPresentationEntity() : existing;
            LocalDateTime now = LocalDateTime.now();
            if (entity.getId() == null || entity.getId() <= 0) {
                entity.setPostId(post.getId());
                entity.setCreatedAt(now);
            }
            entity.setStatusCode(POST_PRESENTATION_STATUS_GENERATING);
            entity.setSlidevBucket(null);
            entity.setSlidevKey(null);
            entity.setPptBucket(null);
            entity.setPptKey(null);
            entity.setSlideCount(0);
            entity.setTemplateVersion(PostPresentationTemplateService.TEMPLATE_VERSION);
            entity.setErrorText("");
            entity.setGeneratedAt(null);
            entity.setUpdatedAt(now);
            if (entity.getId() == null || entity.getId() <= 0) {
                postPresentationMapper.insert(entity);
            } else {
                postPresentationMapper.updateById(entity);
            }
        } catch (RuntimeException exception) {
            if (isMissingPresentationTable(exception)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Presentation feature is not initialized yet");
            }
            throw exception;
        }

        PresentationSource source = new PresentationSource(
            post.getId(),
            post.getUserId(),
            readString(post.getTitle(), "未命名文章"),
            readString(post.getSummary(), ""),
            readString(post.getCategoryCode(), "uncategorized"),
            resolvePostPublishTimeForDisplay(post)
        );

        postPresentationExecutor.execute(() ->
            generatePostPresentationAsync(source, markdown, previousSlidevBucket, previousSlidevKey, previousPptBucket, previousPptKey)
        );
    }

    private boolean isMissingPresentationTable(Throwable exception) {
        Throwable cursor = exception;
        while (cursor != null) {
            String message = readString(cursor.getMessage(), "").toLowerCase(Locale.ROOT);
            if (message.contains("ctn_post_presentation")
                && (message.contains("doesn't exist")
                    || message.contains("does not exist")
                    || message.contains("not exist")
                    || message.contains("unknown table")
                    || message.contains("不存在"))) {
                return true;
            }
            cursor = cursor.getCause();
        }
        return false;
    }

    private void generatePostPresentationAsync(
        PresentationSource source,
        String markdown,
        String previousSlidevBucket,
        String previousSlidevKey,
        String previousPptBucket,
        String previousPptKey
    ) {
        String storageBucket = readString(blogPrivateBucket, "").trim();
        String nextSlidevKey = "";
        String nextPptKey = "";
        try {
            PostEntity templatePost = new PostEntity();
            templatePost.setId(source.postId());
            templatePost.setUserId(source.userId());
            templatePost.setTitle(source.title());
            templatePost.setSummary(source.summary());
            templatePost.setCategoryCode(source.categoryCode());

            PresentationDeck deck = postPresentationTemplateService.build(templatePost, markdown, source.publishedAt());
            String fileBaseName = sanitizePresentationFileBaseName(source.postId(), source.title());

            nextSlidevKey = buildPresentationObjectKey(source.userId(), source.postId(), fileBaseName + ".md");
            persistTextObject(storageBucket, nextSlidevKey, deck.slidevMarkdown(), "text/markdown; charset=UTF-8");

            PostPresentationGeneratorClient.PresentationRenderResult renderResult =
                postPresentationGeneratorClient.renderPptx(deck.slidevMarkdown(), fileBaseName);
            nextPptKey = buildPresentationObjectKey(source.userId(), source.postId(), fileBaseName + ".pptx");
            persistBinaryObject(storageBucket, nextPptKey, renderResult.pptBytes(), PPT_CONTENT_TYPE);

            PostPresentationEntity entity = requirePresentationEntityForUpdate(source.postId());
            entity.setStatusCode(POST_PRESENTATION_STATUS_READY);
            entity.setSlidevBucket(storageBucket);
            entity.setSlidevKey(nextSlidevKey);
            entity.setPptBucket(storageBucket);
            entity.setPptKey(nextPptKey);
            entity.setSlideCount(renderResult.slideCount() > 0 ? renderResult.slideCount() : deck.slideCount());
            entity.setTemplateVersion(PostPresentationTemplateService.TEMPLATE_VERSION);
            entity.setErrorText("");
            entity.setGeneratedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
            postPresentationMapper.updateById(entity);

            deleteStoredObjectQuietly(previousSlidevBucket, previousSlidevKey, storageBucket, nextSlidevKey);
            deleteStoredObjectQuietly(previousPptBucket, previousPptKey, storageBucket, nextPptKey);
        } catch (Exception exception) {
            deleteStoredObjectQuietly(storageBucket, nextSlidevKey, "", "");
            deleteStoredObjectQuietly(storageBucket, nextPptKey, "", "");
            try {
                PostPresentationEntity entity = requirePresentationEntityForUpdate(source.postId());
                entity.setStatusCode(POST_PRESENTATION_STATUS_FAILED);
                entity.setSlidevBucket(null);
                entity.setSlidevKey(null);
                entity.setPptBucket(null);
                entity.setPptKey(null);
                entity.setSlideCount(0);
                entity.setTemplateVersion(PostPresentationTemplateService.TEMPLATE_VERSION);
                entity.setErrorText(resolveGenerationErrorMessage(exception));
                entity.setGeneratedAt(null);
                entity.setUpdatedAt(LocalDateTime.now());
                postPresentationMapper.updateById(entity);
            } catch (Exception ignored) {
                // ignore secondary failure to keep async task bounded
            }
        }
    }

    private PostPresentationEntity requirePresentationEntityForUpdate(Long postId) {
        PostPresentationEntity entity = findPostPresentation(postId);
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Presentation state not found");
        }
        return entity;
    }

    private void persistTextObject(String bucket, String key, String content, String contentType) {
        byte[] bytes = readString(content, "").getBytes(StandardCharsets.UTF_8);
        persistBinaryObject(bucket, key, bytes, contentType);
    }

    private void persistBinaryObject(String bucket, String key, byte[] bytes, String contentType) {
        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setContentType(contentType);
        metadata.setContentLength(bytes == null ? 0L : bytes.length);
        byte[] payload = bytes == null ? new byte[0] : bytes;
        objectStorageClient.putObject(bucket, key, new ByteArrayInputStream(payload), metadata);
    }

    private void deleteStoredObjectQuietly(String bucket, String key, String keepBucket, String keepKey) {
        String normalizedBucket = readString(bucket, "").trim();
        String normalizedKey = readString(key, "").trim();
        if (!StringUtils.hasText(normalizedBucket) || !StringUtils.hasText(normalizedKey)) {
            return;
        }
        if (normalizedBucket.equals(readString(keepBucket, "").trim()) && normalizedKey.equals(readString(keepKey, "").trim())) {
            return;
        }
        try {
            objectStorageClient.deleteObject(normalizedBucket, normalizedKey);
        } catch (Exception ignored) {
            // ignore cleanup failures
        }
    }

    private String resolveGenerationErrorMessage(Exception exception) {
        if (exception instanceof BusinessException businessException) {
            String detail = readString(businessException.getMessage(), "").trim();
            return StringUtils.hasText(detail) ? detail : "Presentation generation failed";
        }
        String message = readString(exception == null ? "" : exception.getMessage(), "").trim();
        return StringUtils.hasText(message) ? message : "Presentation generation failed";
    }

    private String buildPresentationObjectKey(Long userId, Long postId, String fileName) {
        String safeFileName = sanitizeObjectSegment(fileName);
        String random = UUID.randomUUID().toString().replace("-", "");
        return "blog-presentations/user-"
            + (userId == null || userId <= 0 ? 0 : userId)
            + "/post-"
            + (postId == null || postId <= 0 ? 0 : postId)
            + "/"
            + System.currentTimeMillis()
            + "-"
            + random
            + "-"
            + safeFileName;
    }

    private String sanitizeObjectSegment(String value) {
        String normalized = readString(value, "")
            .trim()
            .toLowerCase(Locale.ROOT)
            .replaceAll("[^a-z0-9._-]+", "-")
            .replaceAll("-+", "-")
            .replaceAll("^-+|-+$", "");
        return StringUtils.hasText(normalized) ? normalized : "presentation";
    }

    private String sanitizePresentationFileBaseName(Long postId, String title) {
        String normalizedTitle = readString(title, "")
            .trim()
            .toLowerCase(Locale.ROOT)
            .replaceAll("[^a-z0-9_-]+", "-")
            .replaceAll("-+", "-")
            .replaceAll("^-+|-+$", "");
        if (!StringUtils.hasText(normalizedTitle)) {
            return "post-" + (postId == null || postId <= 0 ? "presentation" : postId + "-presentation");
        }
        return normalizedTitle;
    }

    private String sanitizePresentationFileName(PostEntity post) {
        String baseName = sanitizePresentationFileBaseName(post == null ? null : post.getId(), post == null ? "" : post.getTitle());
        return baseName + ".pptx";
    }

    private PostDetailResponse toPostDetailResponse(PostEntity post, String markdown, boolean editable) {
        ContentVisibilityEnum visibility = normalizeVisibility(post.getVisibility());
        Set<String> allowedGroupCodes = visibility == ContentVisibilityEnum.GROUP ? loadPostAclGroups(post.getId()) : Set.of();
        return new PostDetailResponse(
            post.getId(),
            post.getTitle(),
            post.getSummary(),
            post.getCoverImageUrl(),
            post.getCategoryCode(),
            post.getSlugCode(),
            visibility.name(),
            allowedGroupCodes,
            readString(post.getStatusCode(), POST_STATUS_DRAFT),
            loadPostTags(post.getId()),
            post.getWordCount() == null ? 0L : post.getWordCount(),
            post.getLineCount() == null ? 0L : post.getLineCount(),
            post.getReadingMinutes() == null ? 1 : post.getReadingMinutes(),
            post.getLikeCount() == null ? 0L : post.getLikeCount(),
            resolvePostPublishTimeForDisplay(post),
            editable,
            markdown
        );
    }

    private AuthorPostItemResponse toAuthorPostItemResponse(PostEntity post) {
        return new AuthorPostItemResponse(
            post.getId(),
            post.getTitle(),
            post.getSummary(),
            post.getCategoryCode(),
            post.getSlugCode(),
            post.getCoverImageUrl(),
            readString(post.getVisibility(), ContentVisibilityEnum.PUBLIC.name()),
            readString(post.getStatusCode(), POST_STATUS_DRAFT),
            loadPostTags(post.getId()),
            post.getWordCount() == null ? 0L : post.getWordCount(),
            post.getLineCount() == null ? 0L : post.getLineCount(),
            post.getReadingMinutes() == null ? 1 : post.getReadingMinutes(),
            post.getLikeCount() == null ? 0L : post.getLikeCount(),
            resolvePostPublishTimeForDisplay(post),
            post.getUpdatedAt()
        );
    }

    private String readPostMarkdown(PostEntity post) {
        String bucket = readString(post.getMarkdownBucket(), "").trim();
        String key = readString(post.getMarkdownKey(), "").trim();
        if (StringUtils.hasText(bucket) && StringUtils.hasText(key)) {
            return readMarkdownObject(bucket, key);
        }
        if (isInitialSeedPost(post)) {
            return readInitialSeedMarkdown();
        }
        return "";
    }

    private boolean isInitialSeedPost(PostEntity post) {
        if (post == null) {
            return false;
        }
        String slugCode = readString(post.getSlugCode(), "").trim().toLowerCase(Locale.ROOT);
        return INITIAL_SEED_SLUG_CODE.equals(slugCode);
    }

    private String readInitialSeedMarkdown() {
        ClassPathResource resource = new ClassPathResource(INITIAL_SEED_MARKDOWN_CLASSPATH);
        if (!resource.exists()) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Seed markdown resource is missing: " + INITIAL_SEED_MARKDOWN_CLASSPATH
            );
        }
        try (InputStream inputStream = resource.getInputStream()) {
            byte[] bytes = inputStream.readAllBytes();
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Read seed markdown content failed");
        }
    }

    private String readMarkdownObject(String bucket, String key) {
        try (InputStream inputStream = objectStorageClient.getObjectStream(bucket, key)) {
            byte[] bytes = inputStream.readAllBytes();
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Read markdown content failed");
        }
    }

    private MarkdownMetrics computeMarkdownMetrics(String markdown) {
        String safeMarkdown = readString(markdown, "");
        long lineCount = safeMarkdown.isEmpty() ? 0L : safeMarkdown.split("\\R", -1).length;

        long cjkCharCount = safeMarkdown.codePoints()
            .filter(this::isCjkCodePoint)
            .count();

        Matcher matcher = ASCII_WORD_PATTERN.matcher(safeMarkdown);
        long asciiWordCount = 0L;
        while (matcher.find()) {
            asciiWordCount++;
        }

        long wordCount = cjkCharCount + asciiWordCount;
        int readingMinutes = (int) Math.max(1L, (long) Math.ceil(Math.max(1L, wordCount) / AVG_READING_UNITS_PER_MINUTE));
        return new MarkdownMetrics(wordCount, lineCount, readingMinutes);
    }

    private String resolveCoverImageUrl(String requestedCoverImageUrl, String markdown) {
        String normalizedCover = normalizeCoverImageUrl(requestedCoverImageUrl);
        if (StringUtils.hasText(normalizedCover)) {
            return normalizedCover;
        }
        return extractFirstMarkdownImage(markdown);
    }

    private String normalizeCoverImageUrl(String raw) {
        String normalized = readString(raw, "").trim();
        if (!StringUtils.hasText(normalized)) {
            return "";
        }
        return isSupportedCoverUrl(normalized) ? normalized : "";
    }

    private String extractFirstMarkdownImage(String markdown) {
        String safeMarkdown = readString(markdown, "");
        if (!StringUtils.hasText(safeMarkdown)) {
            return "";
        }
        Matcher matcher = MARKDOWN_IMAGE_PATTERN.matcher(safeMarkdown);
        while (matcher.find()) {
            String candidate = readString(matcher.group(1), "").trim();
            if (!StringUtils.hasText(candidate)) {
                continue;
            }
            if (candidate.startsWith("<") && candidate.endsWith(">") && candidate.length() > 2) {
                candidate = candidate.substring(1, candidate.length() - 1).trim();
            }
            if (isSupportedCoverUrl(candidate)) {
                return candidate;
            }
        }
        return "";
    }

    private boolean isSupportedCoverUrl(String url) {
        String normalized = readString(url, "").trim().toLowerCase(Locale.ROOT);
        return normalized.startsWith("http://") || normalized.startsWith("https://") || normalized.startsWith("/");
    }

    private boolean isCjkCodePoint(int codePoint) {
        Character.UnicodeBlock block = Character.UnicodeBlock.of(codePoint);
        return block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            || block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            || block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            || block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C
            || block == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D
            || block == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS;
    }

    private long generatePostNum() {
        long now = System.currentTimeMillis();
        long suffix = Math.abs(UUID.randomUUID().getLeastSignificantBits() % 1000L);
        return DEFAULT_POST_NUM_BASE + now * 1000L + suffix;
    }

    private String buildMarkdownObjectKey(Long userId) {
        String random = UUID.randomUUID().toString().replace("-", "");
        return "blog-posts/user-" + userId + "/" + System.currentTimeMillis() + "-" + random + ".md";
    }

    private String normalizeMarkdownContentType(String contentType) {
        String normalized = readString(contentType, "").trim().toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalized)) {
            return "text/markdown";
        }
        if ("text/markdown".equals(normalized)
            || "text/plain".equals(normalized)
            || "application/octet-stream".equals(normalized)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported markdown content type: " + normalized);
    }

    private ViewerContext currentViewer() {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null) {
            return new ViewerContext(null, Set.of("GUEST"), false, Set.of());
        }

        Long userId = loginUser.getUserId();
        if (userId == null || userId <= 0) {
            userId = null;
        }

        Set<String> groups = normalizeGroupCodes(loginUser.getGroups());
        if (groups.isEmpty()) {
            groups = Set.of("GUEST");
        }
        Set<String> permissions = normalizePermissionCodes(loginUser.getPermissions());
        boolean admin = groups.contains("ADMIN");
        return new ViewerContext(userId, groups, admin, permissions);
    }

    private Long requireLoginUserId() {
        ViewerContext viewer = currentViewer();
        if (viewer.userId() == null || viewer.userId() <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return viewer.userId();
    }

    private void requirePermission(String permissionCode) {
        ViewerContext viewer = currentViewer();
        if (viewer.userId() == null || viewer.userId() <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        if (viewer.admin() || viewer.permissions().contains(permissionCode)) {
            return;
        }
        throw new BusinessException(ErrorCode.FORBIDDEN, "Permission denied: " + permissionCode);
    }

    private void requireAdmin() {
        ViewerContext viewer = currentViewer();
        if (!viewer.admin()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Group required: ADMIN");
        }
    }

    private Set<String> normalizePermissionCodes(Set<String> permissions) {
        if (permissions == null || permissions.isEmpty()) {
            return Set.of();
        }
        Set<String> normalized = permissions.stream()
            .map(item -> item == null ? null : item.trim().toLowerCase(Locale.ROOT))
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
    }

    private String readString(String value, String fallback) {
        return StringUtils.hasText(value) ? value : fallback;
    }

    private record ViewerContext(Long userId, Set<String> groups, boolean admin, Set<String> permissions) {
    }

    private record MarkdownMetrics(long wordCount, long lineCount, int readingMinutes) {
    }

    private record PublishedRange(LocalDateTime from, LocalDateTime to) {
        private boolean isEmpty() {
            return from == null && to == null;
        }
    }

    private record PreparedPostPayload(
        String title,
        String summary,
        String categoryCode,
        String slugCode,
        String coverImageUrl,
        ContentVisibilityEnum visibility,
        Set<String> allowedGroups,
        Set<String> tags,
        String markdownBucket,
        String markdownKey,
        Long wordCount,
        Long lineCount,
        Integer readingMinutes
    ) {
    }

    private record PresentationSource(
        Long postId,
        Long userId,
        String title,
        String summary,
        String categoryCode,
        LocalDateTime publishedAt
    ) {
    }
}
