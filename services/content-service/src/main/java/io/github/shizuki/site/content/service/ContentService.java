package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.dto.ReportRequest;
import java.util.Map;

public interface ContentService {

    PageResponse<PostSummary> listPosts(long pageNo, long pageSize);

    PageResponse<AppSummary> listApps(long pageNo, long pageSize);

    Map<String, Object> likePost(Long postId);

    Map<String, Object> likeApp(Long appId);

    Map<String, Object> report(ReportRequest request);
}
