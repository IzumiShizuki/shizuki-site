package io.github.shizuki.site.content.support;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.NotionSyncCursorEntity;
import io.github.shizuki.site.content.entity.NotionSyncJobEntity;
import io.github.shizuki.site.content.entity.PostContentEntity;
import io.github.shizuki.site.content.entity.PostEntity;
import io.github.shizuki.site.content.entity.PostGroupAclEntity;
import io.github.shizuki.site.content.entity.PostTagEntity;
import io.github.shizuki.site.content.mapper.NotionSyncCursorMapper;
import io.github.shizuki.site.content.mapper.NotionSyncJobMapper;
import io.github.shizuki.site.content.mapper.PostContentMapper;
import io.github.shizuki.site.content.mapper.PostGroupAclMapper;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.mapper.PostTagMapper;
import io.github.shizuki.site.content.model.ContentVisibilityEnum;
import io.github.shizuki.site.content.support.NotionBlockCodec.DecodeResult;
import io.github.shizuki.site.content.support.NotionBlockCodec.EncodeResult;
import io.github.shizuki.site.content.support.NotionClient.PageData;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Component
public class PostNotionSyncService {

    public static final String DIRECTION_PULL = "PULL";
    public static final String DIRECTION_PUSH = "PUSH";
    public static final String DIRECTION_BOTH = "BOTH";
    public static final String TARGET_POST = "POST";
    public static final String TARGET_ALL = "ALL";
    public static final String JOB_TRIGGER_MANUAL = "MANUAL";
    public static final String JOB_TRIGGER_NIGHTLY = "NIGHTLY";
    public static final String JOB_TRIGGER_SAVE = "SAVE";
    public static final String JOB_STATUS_PENDING = "PENDING";
    public static final String JOB_STATUS_RUNNING = "RUNNING";
    public static final String JOB_STATUS_SUCCEEDED = "SUCCEEDED";
    public static final String JOB_STATUS_FAILED = "FAILED";
    public static final String JOB_STATUS_PARTIAL = "PARTIAL";
    public static final String SYNC_STATUS_LOCAL_ONLY = "LOCAL_ONLY";
    public static final String SYNC_STATUS_SYNCED = "SYNCED";
    public static final String SYNC_STATUS_SYNC_ERROR = "SYNC_ERROR";
    public static final String SYNC_STATUS_CONFLICT = "CONFLICT";
    public static final String SYNC_STATUS_REMOTE_LOCKED = "REMOTE_LOCKED";
    public static final String CONTENT_MODE_NOTION_BLOCKS = "NOTION_BLOCKS";

    private final PostMapper postMapper;
    private final PostContentMapper postContentMapper;
    private final PostTagMapper postTagMapper;
    private final PostGroupAclMapper postGroupAclMapper;
    private final NotionSyncCursorMapper notionSyncCursorMapper;
    private final NotionSyncJobMapper notionSyncJobMapper;
    private final NotionProperties notionProperties;
    private final NotionClient notionClient;
    private final NotionBlockCodec notionBlockCodec;

    public PostNotionSyncService(PostMapper postMapper,
                                 PostContentMapper postContentMapper,
                                 PostTagMapper postTagMapper,
                                 PostGroupAclMapper postGroupAclMapper,
                                 NotionSyncCursorMapper notionSyncCursorMapper,
                                 NotionSyncJobMapper notionSyncJobMapper,
                                 NotionProperties notionProperties,
                                 NotionClient notionClient,
                                 NotionBlockCodec notionBlockCodec) {
        this.postMapper = postMapper;
        this.postContentMapper = postContentMapper;
        this.postTagMapper = postTagMapper;
        this.postGroupAclMapper = postGroupAclMapper;
        this.notionSyncCursorMapper = notionSyncCursorMapper;
        this.notionSyncJobMapper = notionSyncJobMapper;
        this.notionProperties = notionProperties;
        this.notionClient = notionClient;
        this.notionBlockCodec = notionBlockCodec;
    }

    @Transactional
    public NotionSyncJobEntity createJob(String triggerType, String directionCode, String targetTypeCode, Long postId, Long ownerUserId) {
        ensureNotionConfigured();
        NotionSyncJobEntity job = new NotionSyncJobEntity();
        LocalDateTime now = LocalDateTime.now();
        job.setTriggerType(normalizeCode(triggerType));
        job.setDirectionCode(normalizeDirection(directionCode));
        job.setTargetTypeCode(normalizeTargetType(targetTypeCode));
        job.setPostId(TARGET_POST.equals(job.getTargetTypeCode()) ? postId : null);
        job.setOwnerUserId(ownerUserId == null || ownerUserId <= 0 ? notionProperties.getOwnerUserId() : ownerUserId);
        job.setStatusCode(JOB_STATUS_PENDING);
        job.setResultCount(0);
        job.setErrorCount(0);
        job.setSkippedCount(0);
        job.setConflictCount(0);
        job.setErrorText("");
        job.setCreatedAt(now);
        job.setUpdatedAt(now);
        notionSyncJobMapper.insert(job);
        return job;
    }

    public NotionSyncJobEntity getJob(Long jobId) {
        return notionSyncJobMapper.selectById(jobId);
    }

    @Transactional
    public SyncExecutionResult executeJob(Long jobId) {
        NotionSyncJobEntity job = notionSyncJobMapper.selectById(jobId);
        if (job == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Notion sync job not found");
        }
        job.setStatusCode(JOB_STATUS_RUNNING);
        job.setStartedTime(LocalDateTime.now());
        job.setErrorText("");
        notionSyncJobMapper.updateById(job);
        try {
            SyncExecutionResult result = switch (normalizeCode(job.getDirectionCode())) {
                case DIRECTION_PULL -> runPull(job);
                case DIRECTION_PUSH -> runPush(job);
                case DIRECTION_BOTH -> runBoth(job);
                default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported sync direction");
            };
            applyJobResult(job, result);
            return result;
        } catch (Exception exception) {
            SyncExecutionResult result = new SyncExecutionResult(0, 1, 0, 0, readError(exception));
            applyJobResult(job, result);
            return result;
        }
    }

    @Transactional
    public SyncExecutionResult runNightlyReconcile() {
        SyncExecutionResult pull = pullAllOwnerPosts();
        SyncExecutionResult push = pushUnsyncedOwnerPosts();
        SyncExecutionResult deleted = reconcileRemoteTrashDeletes();
        upsertCursor();
        return pull.merge(push).merge(deleted);
    }

    @Transactional
    public SyncExecutionResult pullPost(Long postId) {
        PostEntity post = requirePost(postId);
        if (!isOwnerScoped(post)) {
            return SyncExecutionResult.skipped("Post is outside notion owner scope");
        }
        if (!StringUtils.hasText(post.getNotionPageId())) {
            bootstrapBySlug(post);
        }
        if (!StringUtils.hasText(post.getNotionPageId())) {
            return SyncExecutionResult.skipped("Post is not linked to notion");
        }
        PageData pageData = notionClient.retrievePage(post.getNotionPageId());
        if (pageData.inTrash()) {
            deleteLocalPostGraph(post.getId());
            return new SyncExecutionResult(1, 0, 0, 0, "");
        }
        syncLocalFromRemote(post, pageData);
        return new SyncExecutionResult(1, 0, 0, 0, "");
    }

    @Transactional
    public SyncExecutionResult pushPost(Long postId) {
        PostEntity post = requirePost(postId);
        if (!isOwnerScoped(post)) {
            return SyncExecutionResult.skipped("Post is outside notion owner scope");
        }
        PostContentEntity content = requirePostContent(post.getId());
        if (content.getUnsupportedBlockFlag() != null && content.getUnsupportedBlockFlag() == 1) {
            markSyncStatus(post, SYNC_STATUS_REMOTE_LOCKED, "Page contains unsupported notion blocks");
            return new SyncExecutionResult(0, 0, 0, 1, "Page contains unsupported notion blocks");
        }
        bootstrapBySlug(post);
        if (StringUtils.hasText(post.getNotionPageId())) {
            PageData remote = notionClient.retrievePage(post.getNotionPageId());
            if (remote.inTrash()) {
                markSyncStatus(post, SYNC_STATUS_SYNC_ERROR, "Remote page is in trash");
                return new SyncExecutionResult(0, 1, 0, 0, "Remote page is in trash");
            }
            if (remote.lastEditedTime() != null
                && post.getUpdatedAt() != null
                && remote.lastEditedTime().isAfter(post.getUpdatedAt())) {
                markSyncStatus(post, SYNC_STATUS_CONFLICT, "Notion page is newer than local post");
                return new SyncExecutionResult(0, 0, 0, 1, "Notion page is newer than local post");
            }
        }
        persistRemoteStateFromLocal(post, content);
        return new SyncExecutionResult(1, 0, 0, 0, "");
    }

    @Transactional
    public SyncExecutionResult pullAllOwnerPosts() {
        ensureNotionConfigured();
        List<PageData> remotePages = notionClient.queryOwnerPages(false).stream()
            .sorted(Comparator.comparing(PageData::lastEditedTime, Comparator.nullsLast(Comparator.naturalOrder())))
            .toList();
        int success = 0;
        int errors = 0;
        for (PageData pageData : remotePages) {
            try {
                syncLocalFromRemote(resolveLocalPost(pageData), pageData);
                success++;
            } catch (Exception exception) {
                errors++;
            }
        }
        upsertCursor();
        return new SyncExecutionResult(success, errors, 0, 0, "");
    }

    @Transactional
    public SyncExecutionResult pushUnsyncedOwnerPosts() {
        ensureNotionConfigured();
        List<PostEntity> ownerPosts = postMapper.selectList(
            new LambdaQueryWrapper<PostEntity>()
                .eq(PostEntity::getDeleted, 0)
                .eq(PostEntity::getUserId, notionProperties.getOwnerUserId())
        );
        int success = 0;
        int errors = 0;
        int skipped = 0;
        int conflicts = 0;
        String lastMessage = "";
        for (PostEntity post : ownerPosts) {
            SyncExecutionResult result = pushPost(post.getId());
            success += result.successCount();
            errors += result.errorCount();
            skipped += result.skippedCount();
            conflicts += result.conflictCount();
            if (StringUtils.hasText(result.message())) {
                lastMessage = result.message();
            }
        }
        return new SyncExecutionResult(success, errors, skipped, conflicts, lastMessage);
    }

    @Transactional
    public SyncExecutionResult reconcileRemoteTrashDeletes() {
        if (!notionClient.isConfigured()) {
            return SyncExecutionResult.skipped("Notion integration disabled");
        }
        List<PostEntity> localPosts = postMapper.selectList(
            new LambdaQueryWrapper<PostEntity>()
                .eq(PostEntity::getDeleted, 0)
                .eq(PostEntity::getUserId, notionProperties.getOwnerUserId())
                .isNotNull(PostEntity::getNotionPageId)
        );
        int success = 0;
        int errors = 0;
        for (PostEntity localPost : localPosts) {
            try {
                PageData pageData = notionClient.retrievePage(localPost.getNotionPageId());
                if (pageData.inTrash()) {
                    deleteLocalPostGraph(localPost.getId());
                    success++;
                }
            } catch (BusinessException exception) {
                errors++;
            }
        }
        return new SyncExecutionResult(success, errors, 0, 0, "");
    }

    @Transactional
    public void trashRemotePage(PostEntity post) {
        if (post == null || !StringUtils.hasText(post.getNotionPageId()) || !isOwnerScoped(post) || !notionClient.isConfigured()) {
            return;
        }
        notionClient.trashPage(post.getNotionPageId());
    }

    @Transactional
    public void bootstrapBySlug(PostEntity post) {
        if (post == null || StringUtils.hasText(post.getNotionPageId()) || !notionClient.isConfigured()) {
            return;
        }
        String slug = normalizeSlug(post.getSlugCode());
        if (!StringUtils.hasText(slug)) {
            return;
        }
        List<PageData> matches = notionClient.queryPagesBySlug(slug);
        if (matches.isEmpty()) {
            return;
        }
        PageData page = matches.get(0);
        post.setNotionPageId(page.pageId());
        post.setNotionDataSourceId(notionProperties.getDataSourceId());
        post.setNotionLastEditedTime(page.lastEditedTime());
        post.setSyncStatusCode(SYNC_STATUS_SYNCED);
        post.setSyncErrorText("");
        postMapper.updateById(post);
    }

    private SyncExecutionResult runPull(NotionSyncJobEntity job) {
        return TARGET_ALL.equals(normalizeCode(job.getTargetTypeCode()))
            ? pullAllOwnerPosts().merge(reconcileRemoteTrashDeletes())
            : pullPost(job.getPostId());
    }

    private SyncExecutionResult runPush(NotionSyncJobEntity job) {
        return TARGET_ALL.equals(normalizeCode(job.getTargetTypeCode()))
            ? pushUnsyncedOwnerPosts()
            : pushPost(job.getPostId());
    }

    private SyncExecutionResult runBoth(NotionSyncJobEntity job) {
        if (TARGET_ALL.equals(normalizeCode(job.getTargetTypeCode()))) {
            return runNightlyReconcile();
        }
        PostEntity post = requirePost(job.getPostId());
        if (!StringUtils.hasText(post.getNotionPageId())) {
            return pushPost(post.getId());
        }
        return pullPost(post.getId());
    }

    private void syncLocalFromRemote(PostEntity post, PageData pageData) {
        LocalDateTime now = LocalDateTime.now();
        Map<String, Object> properties = pageData.properties();
        post.setUserId(notionProperties.getOwnerUserId());
        post.setPostNum(post.getPostNum() == null || post.getPostNum() <= 0 ? generatePostNum() : post.getPostNum());
        post.setTitle(limit(readTitle(properties, notionProperties.getProperties().getTitle()), 255));
        post.setSummary(limit(readRichText(properties, notionProperties.getProperties().getSummary()), 500));
        post.setCategoryCode(normalizeCategory(readScalar(properties, notionProperties.getProperties().getCategory()), "general"));
        post.setSlugCode(normalizeSlug(readRichText(properties, notionProperties.getProperties().getSlug())));
        post.setVisibility(normalizeVisibility(readSelect(properties, notionProperties.getProperties().getVisibility())).name());
        post.setStatusCode(normalizeStatus(readSelect(properties, notionProperties.getProperties().getStatus())));
        post.setCoverImageUrl(limit(readUrl(properties, notionProperties.getProperties().getCoverImageUrl()), 512));
        post.setPublishedAt(readDate(properties, notionProperties.getProperties().getPublishedAt()));
        post.setNotionPageId(pageData.pageId());
        post.setNotionDataSourceId(notionProperties.getDataSourceId());
        post.setNotionLastEditedTime(pageData.lastEditedTime());
        post.setSyncStatusCode(SYNC_STATUS_SYNCED);
        post.setSyncErrorText("");
        post.setLastRemotePullTime(now);
        post.setUpdatedAt(now);
        if (post.getId() == null || post.getId() <= 0) {
            post.setCreatedAt(now);
            postMapper.insert(post);
        } else {
            postMapper.updateById(post);
        }

        List<Map<String, Object>> blocks = notionClient.listBlockChildrenRecursively(pageData.pageId());
        DecodeResult decodeResult = notionBlockCodec.decodeBlocks(blocks);
        PostContentEntity content = findPostContent(post.getId());
        if (content == null) {
            content = new PostContentEntity();
            content.setPostId(post.getId());
            content.setCreatedAt(now);
        }
        content.setContentMode(CONTENT_MODE_NOTION_BLOCKS);
        content.setNotionBlocksJson(notionBlockCodec.writeBlocksJson(blocks));
        content.setMarkdownCache(decodeResult.markdownCache());
        content.setContentHash(decodeResult.contentHash());
        content.setUnsupportedBlockFlag(decodeResult.unsupportedBlock() ? 1 : 0);
        content.setUpdatedAt(now);
        if (content.getId() == null || content.getId() <= 0) {
            postContentMapper.insert(content);
        } else {
            postContentMapper.updateById(content);
        }

        replaceTags(post.getId(), readMultiSelect(properties, notionProperties.getProperties().getTags()));
        replaceGroups(post.getId(), readMultiSelect(properties, notionProperties.getProperties().getAllowedGroups()));
        applyMarkdownMetrics(post, decodeResult.markdownCache());
        if (decodeResult.unsupportedBlock()) {
            post.setSyncStatusCode(SYNC_STATUS_REMOTE_LOCKED);
            post.setSyncErrorText("Page contains unsupported notion blocks");
        }
        postMapper.updateById(post);
    }

    private void persistRemoteStateFromLocal(PostEntity post, PostContentEntity content) {
        LocalDateTime now = LocalDateTime.now();
        String markdown = readString(content.getMarkdownCache(), "");
        EncodeResult encodeResult = notionBlockCodec.encodeMarkdown(markdown);
        content.setContentMode(CONTENT_MODE_NOTION_BLOCKS);
        content.setNotionBlocksJson(notionBlockCodec.writeBlocksJson(encodeResult.blocks()));
        content.setContentHash(encodeResult.contentHash());
        content.setUpdatedAt(now);
        postContentMapper.updateById(content);

        Map<String, Object> propertyPayload = buildPropertyPayload(post);
        PageData pageData;
        if (StringUtils.hasText(post.getNotionPageId())) {
            notionClient.updatePage(post.getNotionPageId(), propertyPayload, false);
            notionClient.replaceBlockChildren(post.getNotionPageId(), encodeResult.blocks());
            pageData = notionClient.retrievePage(post.getNotionPageId());
        } else {
            pageData = notionClient.createPage(propertyPayload);
            notionClient.replaceBlockChildren(pageData.pageId(), encodeResult.blocks());
            pageData = notionClient.retrievePage(pageData.pageId());
        }
        post.setNotionPageId(pageData.pageId());
        post.setNotionDataSourceId(notionProperties.getDataSourceId());
        post.setNotionLastEditedTime(pageData.lastEditedTime());
        post.setSyncStatusCode(SYNC_STATUS_SYNCED);
        post.setSyncErrorText("");
        post.setLastRemotePushTime(now);
        post.setUpdatedAt(now);
        postMapper.updateById(post);
    }

    private Map<String, Object> buildPropertyPayload(PostEntity post) {
        NotionProperties.PropertyMapping mapping = notionProperties.getProperties();
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put(mapping.getTitle(), Map.of("title", richTextArray(readString(post.getTitle(), ""))));
        payload.put(mapping.getSummary(), Map.of("rich_text", richTextArray(readString(post.getSummary(), ""))));
        payload.put(mapping.getCategory(), Map.of("rich_text", richTextArray(readString(post.getCategoryCode(), ""))));
        payload.put(mapping.getSlug(), Map.of("rich_text", richTextArray(readString(post.getSlugCode(), ""))));
        payload.put(mapping.getTags(), Map.of("multi_select", loadTags(post.getId()).stream().map(tag -> Map.of("name", tag)).toList()));
        payload.put(mapping.getAllowedGroups(), Map.of("multi_select", loadGroups(post.getId()).stream().map(group -> Map.of("name", group)).toList()));
        payload.put(mapping.getVisibility(), Map.of("select", Map.of("name", readString(post.getVisibility(), ContentVisibilityEnum.PUBLIC.name()))));
        payload.put(mapping.getStatus(), Map.of("select", Map.of("name", normalizeStatus(readString(post.getStatusCode(), "DRAFT")))));
        payload.put(mapping.getCoverImageUrl(), Map.of("url", emptyToNull(post.getCoverImageUrl())));
        payload.put(mapping.getAuthorUserId(), Map.of("number", notionProperties.getOwnerUserId()));
        payload.put(mapping.getPublishedAt(), Map.of("date", post.getPublishedAt() == null ? null : Map.of("start", post.getPublishedAt().toString())));
        return payload;
    }

    private List<Map<String, Object>> richTextArray(String value) {
        if (!StringUtils.hasText(value)) {
            return List.of();
        }
        return List.of(Map.of("type", "text", "text", Map.of("content", value)));
    }

    private PostEntity resolveLocalPost(PageData pageData) {
        PostEntity post = postMapper.selectOne(
            new LambdaQueryWrapper<PostEntity>()
                .eq(PostEntity::getDeleted, 0)
                .eq(PostEntity::getNotionPageId, pageData.pageId())
                .last("LIMIT 1")
        );
        if (post != null) {
            return post;
        }
        String slug = normalizeSlug(readRichText(pageData.properties(), notionProperties.getProperties().getSlug()));
        if (StringUtils.hasText(slug)) {
            post = postMapper.selectOne(
                new LambdaQueryWrapper<PostEntity>()
                    .eq(PostEntity::getDeleted, 0)
                    .eq(PostEntity::getUserId, notionProperties.getOwnerUserId())
                    .eq(PostEntity::getSlugCode, slug)
                    .last("LIMIT 1")
            );
        }
        if (post != null) {
            return post;
        }
        PostEntity created = new PostEntity();
        created.setUserId(notionProperties.getOwnerUserId());
        created.setPostNum(generatePostNum());
        created.setCreatedAt(LocalDateTime.now());
        created.setUpdatedAt(LocalDateTime.now());
        return created;
    }

    private void upsertCursor() {
        if (!notionClient.isConfigured()) {
            return;
        }
        NotionSyncCursorEntity cursor = notionSyncCursorMapper.selectOne(
            new LambdaQueryWrapper<NotionSyncCursorEntity>()
                .eq(NotionSyncCursorEntity::getDeleted, 0)
                .eq(NotionSyncCursorEntity::getSyncScopeCode, "OWNER_" + notionProperties.getOwnerUserId())
                .last("LIMIT 1")
        );
        if (cursor == null) {
            cursor = new NotionSyncCursorEntity();
            cursor.setSyncScopeCode("OWNER_" + notionProperties.getOwnerUserId());
            cursor.setDataSourceId(notionProperties.getDataSourceId());
            cursor.setCreatedAt(LocalDateTime.now());
        }
        LocalDateTime maxEdited = postMapper.selectList(
            new LambdaQueryWrapper<PostEntity>()
                .eq(PostEntity::getDeleted, 0)
                .eq(PostEntity::getUserId, notionProperties.getOwnerUserId())
                .isNotNull(PostEntity::getNotionLastEditedTime)
        ).stream()
            .map(PostEntity::getNotionLastEditedTime)
            .filter(Objects::nonNull)
            .max(LocalDateTime::compareTo)
            .orElse(null);
        cursor.setCursorValue(maxEdited == null ? "" : maxEdited.toString());
        cursor.setStatusCode("IDLE");
        cursor.setErrorText("");
        cursor.setLastSyncedTime(LocalDateTime.now());
        cursor.setUpdatedAt(LocalDateTime.now());
        if (cursor.getId() == null || cursor.getId() <= 0) {
            notionSyncCursorMapper.insert(cursor);
        } else {
            notionSyncCursorMapper.updateById(cursor);
        }
    }

    private void applyJobResult(NotionSyncJobEntity job, SyncExecutionResult result) {
        job.setResultCount(result.successCount());
        job.setErrorCount(result.errorCount());
        job.setSkippedCount(result.skippedCount());
        job.setConflictCount(result.conflictCount());
        job.setErrorText(result.message());
        job.setFinishedTime(LocalDateTime.now());
        job.setUpdatedAt(LocalDateTime.now());
        if (result.errorCount() > 0 && result.successCount() == 0) {
            job.setStatusCode(JOB_STATUS_FAILED);
        } else if (result.errorCount() > 0 || result.conflictCount() > 0) {
            job.setStatusCode(JOB_STATUS_PARTIAL);
        } else {
            job.setStatusCode(JOB_STATUS_SUCCEEDED);
        }
        notionSyncJobMapper.updateById(job);
    }

    private void markSyncStatus(PostEntity post, String statusCode, String errorText) {
        post.setSyncStatusCode(statusCode);
        post.setSyncErrorText(errorText);
        post.setUpdatedAt(LocalDateTime.now());
        postMapper.updateById(post);
    }

    private void deleteLocalPostGraph(Long postId) {
        if (postId == null || postId <= 0) {
            return;
        }
        PostContentEntity content = findPostContent(postId);
        if (content != null && content.getId() != null) {
            postContentMapper.deleteById(content.getId());
        }
        postTagMapper.selectList(
            new LambdaQueryWrapper<PostTagEntity>().eq(PostTagEntity::getPostId, postId)
        ).forEach(tag -> postTagMapper.deleteById(tag.getId()));
        postGroupAclMapper.selectList(
            new LambdaQueryWrapper<PostGroupAclEntity>().eq(PostGroupAclEntity::getPostId, postId)
        ).forEach(acl -> postGroupAclMapper.deleteById(acl.getId()));
        postMapper.deleteById(postId);
    }

    private void replaceTags(Long postId, List<String> tags) {
        postTagMapper.selectList(
            new LambdaQueryWrapper<PostTagEntity>().eq(PostTagEntity::getPostId, postId)
        ).forEach(tag -> postTagMapper.deleteById(tag.getId()));
        LocalDateTime now = LocalDateTime.now();
        for (String tag : normalizeTags(tags)) {
            PostTagEntity entity = new PostTagEntity();
            entity.setPostId(postId);
            entity.setTagCode(tag);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            postTagMapper.insert(entity);
        }
    }

    private void replaceGroups(Long postId, List<String> groups) {
        postGroupAclMapper.selectList(
            new LambdaQueryWrapper<PostGroupAclEntity>().eq(PostGroupAclEntity::getPostId, postId)
        ).forEach(acl -> postGroupAclMapper.deleteById(acl.getId()));
        LocalDateTime now = LocalDateTime.now();
        for (String group : normalizeGroups(groups)) {
            PostGroupAclEntity entity = new PostGroupAclEntity();
            entity.setPostId(postId);
            entity.setGroupCode(group);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            postGroupAclMapper.insert(entity);
        }
    }

    private List<String> loadTags(Long postId) {
        return postTagMapper.selectList(
            new LambdaQueryWrapper<PostTagEntity>()
                .eq(PostTagEntity::getPostId, postId)
                .orderByAsc(PostTagEntity::getTagCode)
        ).stream()
            .map(PostTagEntity::getTagCode)
            .toList();
    }

    private List<String> loadGroups(Long postId) {
        return postGroupAclMapper.selectList(
            new LambdaQueryWrapper<PostGroupAclEntity>()
                .eq(PostGroupAclEntity::getPostId, postId)
                .orderByAsc(PostGroupAclEntity::getGroupCode)
        ).stream()
            .map(PostGroupAclEntity::getGroupCode)
            .toList();
    }

    private void applyMarkdownMetrics(PostEntity post, String markdown) {
        String safeMarkdown = readString(markdown, "");
        long lineCount = safeMarkdown.isEmpty() ? 0L : safeMarkdown.split("\\R", -1).length;
        long wordCount = safeMarkdown.codePoints().count();
        int readingMinutes = (int) Math.max(1L, Math.ceil(Math.max(1L, wordCount) / 300.0d));
        post.setLineCount(lineCount);
        post.setWordCount(wordCount);
        post.setReadingMinutes(readingMinutes);
    }

    private String readTitle(Map<String, Object> properties, String propertyName) {
        return joinRichText(castMap(properties.get(propertyName)).get("title"));
    }

    private String readRichText(Map<String, Object> properties, String propertyName) {
        return joinRichText(castMap(properties.get(propertyName)).get("rich_text"));
    }

    private String readScalar(Map<String, Object> properties, String propertyName) {
        String richText = readRichText(properties, propertyName);
        if (StringUtils.hasText(richText)) {
            return richText;
        }
        return readSelect(properties, propertyName);
    }

    private String readSelect(Map<String, Object> properties, String propertyName) {
        return readString(castMap(castMap(properties.get(propertyName)).get("select")).get("name"), "");
    }

    private String readUrl(Map<String, Object> properties, String propertyName) {
        return readString(castMap(properties.get(propertyName)).get("url"), "");
    }

    private LocalDateTime readDate(Map<String, Object> properties, String propertyName) {
        String start = readString(castMap(castMap(properties.get(propertyName)).get("date")).get("start"), "");
        if (!StringUtils.hasText(start)) {
            return null;
        }
        try {
            return LocalDateTime.parse(start);
        } catch (RuntimeException ignored) {
            return java.time.LocalDate.parse(start).atStartOfDay();
        }
    }

    @SuppressWarnings("unchecked")
    private List<String> readMultiSelect(Map<String, Object> properties, String propertyName) {
        Object raw = castMap(properties.get(propertyName)).get("multi_select");
        if (!(raw instanceof List<?> list)) {
            return List.of();
        }
        List<String> values = new ArrayList<>();
        for (Object item : list) {
            if (!(item instanceof Map<?, ?> map)) {
                continue;
            }
            String name = readString(((Map<String, Object>) map).get("name"), "");
            if (StringUtils.hasText(name)) {
                values.add(name);
            }
        }
        return values;
    }

    @SuppressWarnings("unchecked")
    private String joinRichText(Object raw) {
        if (!(raw instanceof List<?> list)) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (Object item : list) {
            if (!(item instanceof Map<?, ?> map)) {
                continue;
            }
            Object plainText = ((Map<String, Object>) map).get("plain_text");
            if (plainText != null) {
                builder.append(plainText);
                continue;
            }
            Object text = ((Map<String, Object>) map).get("text");
            if (text instanceof Map<?, ?> textMap) {
                builder.append(readString(((Map<String, Object>) textMap).get("content"), ""));
            }
        }
        return builder.toString();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> castMap(Object value) {
        if (value instanceof Map<?, ?> map) {
            return (Map<String, Object>) map;
        }
        return Map.of();
    }

    private PostEntity requirePost(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null || post.getDeleted() != null && post.getDeleted() == 1) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        return post;
    }

    private PostContentEntity requirePostContent(Long postId) {
        PostContentEntity content = findPostContent(postId);
        if (content == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post content not found");
        }
        return content;
    }

    private PostContentEntity findPostContent(Long postId) {
        return postContentMapper.selectOne(
            new LambdaQueryWrapper<PostContentEntity>()
                .eq(PostContentEntity::getDeleted, 0)
                .eq(PostContentEntity::getPostId, postId)
                .last("LIMIT 1")
        );
    }

    private boolean isOwnerScoped(PostEntity post) {
        return post != null && Objects.equals(post.getUserId(), notionProperties.getOwnerUserId());
    }

    private void ensureNotionConfigured() {
        if (!notionClient.isConfigured()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Notion integration is not configured");
        }
    }

    private Set<String> normalizeTags(List<String> tags) {
        if (tags == null) {
            return Set.of();
        }
        return tags.stream()
            .map(this::normalizeTag)
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private Set<String> normalizeGroups(List<String> groups) {
        if (groups == null) {
            return Set.of();
        }
        return groups.stream()
            .map(item -> item == null ? "" : item.trim().toUpperCase(Locale.ROOT))
            .filter(StringUtils::hasText)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private String normalizeTag(String raw) {
        String value = readString(raw, "").trim().toLowerCase(Locale.ROOT);
        return value.replaceAll("[^a-z0-9_-]", "");
    }

    private String normalizeCategory(String raw, String fallback) {
        String value = readString(raw, fallback).trim().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_-]", "");
        return StringUtils.hasText(value) ? value : fallback;
    }

    private String normalizeSlug(String raw) {
        String value = readString(raw, "").trim().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9_-]", "");
        return StringUtils.hasText(value) ? value : null;
    }

    private ContentVisibilityEnum normalizeVisibility(String raw) {
        try {
            return ContentVisibilityEnum.from(readString(raw, ContentVisibilityEnum.PUBLIC.name()));
        } catch (BusinessException exception) {
            return ContentVisibilityEnum.PUBLIC;
        }
    }

    private String normalizeStatus(String raw) {
        String normalized = readString(raw, "DRAFT").trim().toUpperCase(Locale.ROOT);
        if (!"DRAFT".equals(normalized) && !"PUBLISHED".equals(normalized)) {
            return "DRAFT";
        }
        return normalized;
    }

    private String normalizeDirection(String raw) {
        String normalized = normalizeCode(raw);
        if (DIRECTION_PULL.equals(normalized) || DIRECTION_PUSH.equals(normalized) || DIRECTION_BOTH.equals(normalized)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported sync direction");
    }

    private String normalizeTargetType(String raw) {
        String normalized = normalizeCode(raw);
        if (TARGET_POST.equals(normalized) || TARGET_ALL.equals(normalized)) {
            return normalized;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported sync target type");
    }

    private String limit(String value, int maxLength) {
        String safe = readString(value, "");
        return safe.length() <= maxLength ? safe : safe.substring(0, maxLength);
    }

    private String emptyToNull(String value) {
        return StringUtils.hasText(value) ? value : null;
    }

    private long generatePostNum() {
        long now = System.currentTimeMillis();
        long suffix = Math.abs(UUID.randomUUID().getLeastSignificantBits() % 1000L);
        return 500_000L + now * 1000L + suffix;
    }

    private String readString(Object value, String fallback) {
        String text = value == null ? "" : String.valueOf(value);
        return StringUtils.hasText(text) ? text : fallback;
    }

    private String normalizeCode(String value) {
        return readString(value, "").trim().toUpperCase(Locale.ROOT);
    }

    private String readError(Exception exception) {
        String message = exception == null ? "" : readString(exception.getMessage(), "");
        return StringUtils.hasText(message) ? message : "Notion sync failed";
    }

    public record SyncExecutionResult(int successCount, int errorCount, int skippedCount, int conflictCount, String message) {
        public static SyncExecutionResult skipped(String message) {
            return new SyncExecutionResult(0, 0, 1, 0, message);
        }

        public SyncExecutionResult merge(SyncExecutionResult other) {
            if (other == null) {
                return this;
            }
            String mergedMessage = StringUtils.hasText(other.message) ? other.message : message;
            return new SyncExecutionResult(
                successCount + other.successCount,
                errorCount + other.errorCount,
                skippedCount + other.skippedCount,
                conflictCount + other.conflictCount,
                mergedMessage
            );
        }
    }
}
