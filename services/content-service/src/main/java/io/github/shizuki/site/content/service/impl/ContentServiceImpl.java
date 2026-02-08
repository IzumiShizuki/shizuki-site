package io.github.shizuki.site.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.dto.ReportRequest;
import io.github.shizuki.site.content.entity.AppEntity;
import io.github.shizuki.site.content.entity.ContentReportEntity;
import io.github.shizuki.site.content.entity.PostEntity;
import io.github.shizuki.site.content.mapper.AppMapper;
import io.github.shizuki.site.content.mapper.ContentReportMapper;
import io.github.shizuki.site.content.mapper.PostMapper;
import io.github.shizuki.site.content.service.ContentService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {

    private final PostMapper postMapper;
    private final AppMapper appMapper;
    private final ContentReportMapper contentReportMapper;

    public ContentServiceImpl(PostMapper postMapper, AppMapper appMapper, ContentReportMapper contentReportMapper) {
        this.postMapper = postMapper;
        this.appMapper = appMapper;
        this.contentReportMapper = contentReportMapper;
    }

    @Override
    public PageResponse<PostSummary> listPosts(long pageNo, long pageSize) {
        Page<PostEntity> page = postMapper.selectPage(
            new Page<>(pageNo, pageSize),
            new LambdaQueryWrapper<PostEntity>().orderByDesc(PostEntity::getPostId)
        );
        List<PostSummary> items = page.getRecords().stream()
            .map(post -> new PostSummary(post.getPostId(), post.getTitle(), post.getSummary(), post.getVisibility()))
            .toList();
        return PageResponse.of(items, page.getTotal(), pageNo, pageSize);
    }

    @Override
    public PageResponse<AppSummary> listApps(long pageNo, long pageSize) {
        Page<AppEntity> page = appMapper.selectPage(
            new Page<>(pageNo, pageSize),
            new LambdaQueryWrapper<AppEntity>().orderByDesc(AppEntity::getAppId)
        );
        List<AppSummary> items = page.getRecords().stream()
            .map(app -> new AppSummary(app.getAppId(), app.getName(), app.getCategory(), Boolean.TRUE.equals(app.getPinAble())))
            .toList();
        return PageResponse.of(items, page.getTotal(), pageNo, pageSize);
    }

    @Override
    public Map<String, Object> likePost(Long postId) {
        PostEntity post = postMapper.selectById(postId);
        if (post == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Post not found");
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
            "report_id", report.getReportId(),
            "target_type", report.getTargetType(),
            "target_id", report.getTargetId(),
            "status", report.getStatus()
        );
    }
}
