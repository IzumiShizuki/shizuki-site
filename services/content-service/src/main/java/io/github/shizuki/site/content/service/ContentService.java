package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.dto.ContentVisibilityResponse;
import io.github.shizuki.site.content.dto.ContentVisibilityUpdateRequest;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.dto.ReportRequest;
import java.util.Map;

public interface ContentService {

    /**
     * 分页查询帖子。
     */
    PageResponse<PostSummary> listPosts(long pageNo, long pageSize);

    /**
     * 分页查询应用。
     */
    PageResponse<AppSummary> listApps(long pageNo, long pageSize);

    /**
     * 点赞帖子。
     */
    Map<String, Object> likePost(Long postId);

    /**
     * 点赞应用。
     */
    Map<String, Object> likeApp(Long appId);

    /**
     * 提交举报。
     */
    Map<String, Object> report(ReportRequest request);

    /**
     * 查询帖子可见性配置。
     */
    ContentVisibilityResponse getPostVisibility(Long postId);

    /**
     * 更新帖子可见性配置。
     */
    ContentVisibilityResponse updatePostVisibility(Long postId, ContentVisibilityUpdateRequest request);

    /**
     * 查询应用可见性配置。
     */
    ContentVisibilityResponse getAppVisibility(Long appId);

    /**
     * 更新应用可见性配置。
     */
    ContentVisibilityResponse updateAppVisibility(Long appId, ContentVisibilityUpdateRequest request);
}
