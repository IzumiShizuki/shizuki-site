package io.github.shizuki.site.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.dto.AuthorPostItemResponse;
import io.github.shizuki.site.content.dto.AuthorPostUpsertRequest;
import io.github.shizuki.site.content.dto.ContentVisibilityResponse;
import io.github.shizuki.site.content.dto.ContentVisibilityUpdateRequest;
import io.github.shizuki.site.content.dto.PostCategoryPolicyResponse;
import io.github.shizuki.site.content.dto.PostCategoryPolicyUpdateRequest;
import io.github.shizuki.site.content.dto.PostContentRelayResponse;
import io.github.shizuki.site.content.dto.PostDetailResponse;
import io.github.shizuki.site.content.dto.PostSidebarResponse;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.entity.AppEntity;
import io.github.shizuki.site.content.entity.AppGroupAclEntity;
import io.github.shizuki.site.content.entity.ContentReportEntity;
import io.github.shizuki.site.content.entity.PostCategoryPolicyEntity;
import io.github.shizuki.site.content.entity.PostCategoryPolicyGroupEntity;
import io.github.shizuki.site.content.entity.PostEntity;
import io.github.shizuki.site.content.entity.PostGroupAclEntity;
import io.github.shizuki.site.content.entity.PostTagEntity;
import io.github.shizuki.site.content.mapper.AppGroupAclMapper;
import io.github.shizuki.site.content.mapper.AppMapper;
import io.github.shizuki.site.content.mapper.ContentReportMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyGroupMapper;
import io.github.shizuki.site.content.mapper.PostCategoryPolicyMapper;
import io.github.shizuki.site.content.mapper.PostGroupAclMapper;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.mapper.PostTagMapper;
import io.github.shizuki.site.content.model.ContentVisibilityEnum;
import io.github.shizuki.site.content.service.ContentService;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ContentServiceImpl implements ContentService {

    private static final String POST_STATUS_DRAFT = "DRAFT";
    private static final String POST_STATUS_PUBLISHED = "PUBLISHED";
    private static final long DEFAULT_POST_NUM_BASE = 500_000L;

    private static final Pattern ASCII_WORD_PATTERN = Pattern.compile("[A-Za-z0-9_]+(?:'[A-Za-z0-9_]+)?");
    private static final Pattern MARKDOWN_IMAGE_PATTERN = Pattern.compile("!\\[[^\\]]*]\\(([^)\\s]+)(?:\\s+\"[^\"]*\")?\\)");
    private static final DateTimeFormatter ARCHIVE_MONTH_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM");

    private final PostMapper postMapper;
    private final AppMapper appMapper;
    private final ContentReportMapper contentReportMapper;
    private final PostGroupAclMapper postGroupAclMapper;
    private final AppGroupAclMapper appGroupAclMapper;
    private final PostTagMapper postTagMapper;
    private final PostCategoryPolicyMapper postCategoryPolicyMapper;
    private final PostCategoryPolicyGroupMapper postCategoryPolicyGroupMapper;
    private final ObjectStorageClient objectStorageClient;

    @Value("${shizuki.blog.storage.private-bucket:${shizuki.media.storage.private-bucket:}}")
    private String blogPrivateBucket;

    @Value("${shizuki.blog.storage.max-upload-size:1048576}")
    private long blogMaxUploadSize;

    public ContentServiceImpl(PostMapper postMapper,
                              AppMapper appMapper,
                              ContentReportMapper contentReportMapper,
                              PostGroupAclMapper postGroupAclMapper,
                              AppGroupAclMapper appGroupAclMapper,
                              PostTagMapper postTagMapper,
                              PostCategoryPolicyMapper postCategoryPolicyMapper,
                              PostCategoryPolicyGroupMapper postCategoryPolicyGroupMapper,
                              ObjectStorageClient objectStorageClient) {
        this.postMapper = postMapper;
        this.appMapper = appMapper;
        this.contentReportMapper = contentReportMapper;
        this.postGroupAclMapper = postGroupAclMapper;
        this.appGroupAclMapper = appGroupAclMapper;
        this.postTagMapper = postTagMapper;
        this.postCategoryPolicyMapper = postCategoryPolicyMapper;
        this.postCategoryPolicyGroupMapper = postCategoryPolicyGroupMapper;
        this.objectStorageClient = objectStorageClient;
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
        ViewerContext viewer = currentViewer();
        long normalizedPageNo = pageNo <= 0 ? 1 : pageNo;
        long normalizedPageSize = Math.max(1L, Math.min(pageSize <= 0 ? 10L : pageSize, 100L));

        List<PostEntity> candidates = loadPublishedPostCandidates(viewer);

        String normalizedKeyword = normalizeKeyword(keyword);
        String normalizedCategory = normalizeCategoryCode(categoryCode, false);
        String normalizedTag = normalizeTagCode(tagCode);
        PublishedRange range = resolvePublishedRange(publishedFrom, publishedTo);
        Map<Long, List<String>> tagCache = new HashMap<>();

        List<PostEntity> filtered = candidates.stream()
            .filter(post -> canAccessPublishedPost(post, viewer))
            .filter(post -> matchesKeyword(post, normalizedKeyword, tagCache))
            .filter(post -> matchesCategory(post, normalizedCategory))
            .filter(post -> matchesTag(post.getId(), normalizedTag, tagCache))
            .filter(post -> matchesPublishedRange(post, range))
            .toList();

        long total = filtered.size();
        int fromIndex = (int) Math.min((normalizedPageNo - 1) * normalizedPageSize, total);
        int toIndex = (int) Math.min(fromIndex + normalizedPageSize, total);

        List<PostSummary> items = filtered.subList(fromIndex, toIndex).stream()
            .map(post -> new PostSummary(
                post.getId(),
                post.getTitle(),
                post.getSummary(),
                post.getCoverImageUrl(),
                normalizeVisibility(post.getVisibility()).name(),
                post.getCategoryCode(),
                loadPostTags(post.getId(), tagCache),
                post.getReadingMinutes() == null ? 1 : post.getReadingMinutes(),
                post.getLikeCount() == null ? 0L : post.getLikeCount(),
                post.getPublishedAt()
            ))
            .toList();

        return PageResponse.of(items, total, normalizedPageNo, normalizedPageSize);
    }

    @Override
    public PostSidebarResponse getPostSidebar() {
        ViewerContext viewer = currentViewer();
        List<PostEntity> candidates = loadPublishedPostCandidates(viewer);

        Map<Long, List<String>> tagCache = new HashMap<>();
        List<PostEntity> visiblePosts = candidates.stream()
            .filter(post -> canAccessPublishedPost(post, viewer))
            .toList();

        List<PostSidebarResponse.LatestPostItem> latestPosts = visiblePosts.stream()
            .sorted(
                Comparator.comparing(this::resolvePostPublishTime, Comparator.reverseOrder())
                    .thenComparing(PostEntity::getId, Comparator.reverseOrder())
            )
            .limit(5)
            .map(post -> new PostSidebarResponse.LatestPostItem(
                post.getId(),
                post.getTitle(),
                resolvePostPublishTime(post),
                post.getCoverImageUrl()
            ))
            .toList();

        Map<String, Long> categoryCounter = new HashMap<>();
        Map<String, Long> tagCounter = new HashMap<>();
        Map<String, Long> archiveCounter = new HashMap<>();

        for (PostEntity post : visiblePosts) {
            String category = normalizeDisplayCategory(post.getCategoryCode());
            categoryCounter.merge(category, 1L, Long::sum);

            LocalDateTime publishTime = resolvePostPublishTime(post);
            String month = ARCHIVE_MONTH_FORMATTER.format(publishTime);
            archiveCounter.merge(month, 1L, Long::sum);

            for (String tag : loadPostTags(post.getId(), tagCache)) {
                if (!StringUtils.hasText(tag)) {
                    continue;
                }
                tagCounter.merge(tag, 1L, Long::sum);
            }
        }

        List<PostSidebarResponse.CategoryStatItem> categories = categoryCounter.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry::getKey))
            .map(entry -> new PostSidebarResponse.CategoryStatItem(entry.getKey(), entry.getValue()))
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

    private List<PostEntity> loadPublishedPostCandidates(ViewerContext viewer) {
        if (viewer.admin()) {
            return postMapper.selectList(
                new LambdaQueryWrapper<PostEntity>()
                    .eq(PostEntity::getStatusCode, POST_STATUS_PUBLISHED)
                    .orderByDesc(PostEntity::getPublishedAt)
                    .orderByDesc(PostEntity::getId)
            );
        }
        return postMapper.selectVisiblePublishedPostsRaw(viewer.userId(), viewer.groups());
    }

    private LocalDateTime resolvePostPublishTime(PostEntity post) {
        if (post == null) {
            return LocalDateTime.MIN;
        }
        if (post.getPublishedAt() != null) {
            return post.getPublishedAt();
        }
        if (post.getCreatedAt() != null) {
            return post.getCreatedAt();
        }
        return LocalDateTime.MIN;
    }

    private String normalizeDisplayCategory(String categoryCode) {
        String normalized = readString(categoryCode, "").trim().toLowerCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : "uncategorized";
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
        LocalDateTime publishedAt = resolvePostPublishTime(post);
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

        return toPostDetailResponse(post, readPostMarkdown(post));
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
        return toPostDetailResponse(post, readPostMarkdown(post));
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
        report.setStatus("CREATED");
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
        if (!StringUtils.hasText(title) || !StringUtils.hasText(summary)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Title and summary are required");
        }
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

    private PostDetailResponse toPostDetailResponse(PostEntity post, String markdown) {
        return new PostDetailResponse(
            post.getId(),
            post.getTitle(),
            post.getSummary(),
            post.getCoverImageUrl(),
            post.getCategoryCode(),
            post.getSlugCode(),
            readString(post.getVisibility(), ContentVisibilityEnum.PUBLIC.name()),
            readString(post.getStatusCode(), POST_STATUS_DRAFT),
            loadPostTags(post.getId()),
            post.getWordCount() == null ? 0L : post.getWordCount(),
            post.getLineCount() == null ? 0L : post.getLineCount(),
            post.getReadingMinutes() == null ? 1 : post.getReadingMinutes(),
            post.getLikeCount() == null ? 0L : post.getLikeCount(),
            post.getPublishedAt(),
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
            post.getPublishedAt(),
            post.getUpdatedAt()
        );
    }

    private String readPostMarkdown(PostEntity post) {
        String bucket = readString(post.getMarkdownBucket(), "").trim();
        String key = readString(post.getMarkdownKey(), "").trim();
        if (!StringUtils.hasText(bucket) || !StringUtils.hasText(key)) {
            return "";
        }
        return readMarkdownObject(bucket, key);
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
        int readingMinutes = (int) Math.max(1L, (long) Math.ceil(Math.max(1L, wordCount) / 300.0d));
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
}
