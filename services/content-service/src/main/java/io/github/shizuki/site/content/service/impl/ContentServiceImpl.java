package io.github.shizuki.site.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.dto.ContentVisibilityResponse;
import io.github.shizuki.site.content.dto.ContentVisibilityUpdateRequest;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.entity.AppEntity;
import io.github.shizuki.site.content.entity.AppGroupAclEntity;
import io.github.shizuki.site.content.entity.ContentReportEntity;
import io.github.shizuki.site.content.entity.PostEntity;
import io.github.shizuki.site.content.entity.PostGroupAclEntity;
import io.github.shizuki.site.content.mapper.AppGroupAclMapper;
import io.github.shizuki.site.content.mapper.AppMapper;
import io.github.shizuki.site.content.mapper.ContentReportMapper;
import io.github.shizuki.site.content.mapper.PostGroupAclMapper;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.model.ContentVisibilityEnum;
import io.github.shizuki.site.content.service.ContentService;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ContentServiceImpl implements ContentService {

    private final PostMapper postMapper;
    private final AppMapper appMapper;
    private final ContentReportMapper contentReportMapper;
    private final PostGroupAclMapper postGroupAclMapper;
    private final AppGroupAclMapper appGroupAclMapper;

    public ContentServiceImpl(PostMapper postMapper,
                              AppMapper appMapper,
                              ContentReportMapper contentReportMapper,
                              PostGroupAclMapper postGroupAclMapper,
                              AppGroupAclMapper appGroupAclMapper) {
        this.postMapper = postMapper;
        this.appMapper = appMapper;
        this.contentReportMapper = contentReportMapper;
        this.postGroupAclMapper = postGroupAclMapper;
        this.appGroupAclMapper = appGroupAclMapper;
    }

    @Override
    public PageResponse<PostSummary> listPosts(long pageNo, long pageSize) {
        ViewerContext viewer = currentViewer();
        long limit = Math.max(1L, pageSize);
        long offset = pageNo <= 1 ? 0L : (pageNo - 1) * limit;

        if (viewer.admin()) {
            Long total = postMapper.selectCount(new LambdaQueryWrapper<PostEntity>());
            List<PostSummary> items = postMapper.selectList(
                    new LambdaQueryWrapper<PostEntity>()
                        .orderByDesc(PostEntity::getId)
                        .last("LIMIT " + limit + " OFFSET " + offset)
                ).stream()
                .map(post -> new PostSummary(post.getId(), post.getTitle(), post.getSummary(), normalizeVisibility(post.getVisibility()).name()))
                .toList();
            return PageResponse.of(items, total == null ? 0L : total, pageNo, pageSize);
        }

        Long total = postMapper.countVisiblePosts(viewer.userId(), viewer.groups());
        List<PostSummary> items = postMapper.selectVisiblePosts(viewer.userId(), viewer.groups(), offset, limit)
            .stream()
            .map(post -> new PostSummary(post.getId(), post.getTitle(), post.getSummary(), normalizeVisibility(post.getVisibility()).name()))
            .toList();
        return PageResponse.of(items, total == null ? 0L : total, pageNo, pageSize);
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
    public Map<String, Object> likePost(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
        }
        if (!canAccessPost(post, currentViewer())) {
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

    private boolean canAccessPost(PostEntity post, ViewerContext viewer) {
        ContentVisibilityEnum visibility = normalizeVisibility(post.getVisibility());
        if (visibility == ContentVisibilityEnum.PUBLIC) {
            return true;
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
            .map(value -> value.toUpperCase())
            .collect(Collectors.toCollection(LinkedHashSet::new));
        return normalized.isEmpty() ? Set.of() : normalized;
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

    private ViewerContext currentViewer() {
        LoginUser loginUser = LoginUserContext.get().orElse(null);
        if (loginUser == null) {
            return new ViewerContext(null, Set.of("GUEST"), false);
        }

        Long userId = loginUser.getUserId();
        if (userId == null || userId <= 0) {
            userId = null;
        }

        Set<String> groups = normalizeGroupCodes(loginUser.getGroups());
        if (groups.isEmpty()) {
            groups = Set.of("GUEST");
        }
        boolean admin = groups.contains("ADMIN");
        return new ViewerContext(userId, groups, admin);
    }

    private record ViewerContext(Long userId, Set<String> groups, boolean admin) {
    }
}
