package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.response.PageResponse;
import io.github.shizuki.site.content.dto.AuthorProfileResponse;
import io.github.shizuki.site.content.dto.AuthorProfileUpsertRequest;
import io.github.shizuki.site.content.dto.AuthorPostItemResponse;
import io.github.shizuki.site.content.dto.AuthorPostUpsertRequest;
import io.github.shizuki.site.content.dto.AuthorWhisperRequest;
import io.github.shizuki.site.content.dto.AppSummary;
import io.github.shizuki.site.content.dto.ContentVisibilityResponse;
import io.github.shizuki.site.content.dto.ContentVisibilityUpdateRequest;
import io.github.shizuki.site.content.dto.PostCategoryPolicyResponse;
import io.github.shizuki.site.content.dto.PostCategoryPolicyUpdateRequest;
import io.github.shizuki.site.content.dto.PostCategoryMetaResponse;
import io.github.shizuki.site.content.dto.PostCategoryMetaUpsertRequest;
import io.github.shizuki.site.content.dto.PostContentRelayResponse;
import io.github.shizuki.site.content.dto.PostDetailResponse;
import io.github.shizuki.site.content.dto.PostEditorPolicyResponse;
import io.github.shizuki.site.content.dto.PostSidebarResponse;
import io.github.shizuki.site.content.dto.PostSummary;
import io.github.shizuki.site.content.dto.ReportRequest;
import java.util.List;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

public interface ContentService {

    /**
     * 分页查询帖子。
     */
    PageResponse<PostSummary> listPosts(long pageNo, long pageSize);

    /**
     * 分页查询帖子（支持关键词、分类、标签筛选）。
     */
    PageResponse<PostSummary> listPosts(long pageNo, long pageSize, String keyword, String categoryCode, String tagCode);

    /**
     * 分页查询帖子（支持关键词、分类、标签和发布时间区间筛选）。
     */
    PageResponse<PostSummary> listPosts(
        long pageNo,
        long pageSize,
        String keyword,
        String categoryCode,
        String tagCode,
        String publishedFrom,
        String publishedTo
    );

    /**
     * 查询公开帖子详情。
     */
    PostDetailResponse getPublishedPostDetail(Long postId);

    /**
     * 下载公开帖子 markdown 内容。
     */
    String downloadPublishedPostMarkdown(Long postId);

    /**
     * 查询博客列表页右侧聚合信息。
     */
    PostSidebarResponse getPostSidebar();

    /**
     * 查询作者主页公开资料。
     */
    AuthorProfileResponse getAuthorProfile();

    /**
     * 管理员查询作者主页资料。
     */
    AuthorProfileResponse getAdminAuthorProfile();

    /**
     * 管理员更新作者主页资料。
     */
    AuthorProfileResponse upsertAdminAuthorProfile(AuthorProfileUpsertRequest request);

    /**
     * 分页查询应用。
     */
    PageResponse<AppSummary> listApps(long pageNo, long pageSize);

    /**
     * 查询当前登录作者的文章列表。
     */
    PageResponse<AuthorPostItemResponse> listMyPosts(long pageNo, long pageSize, String keyword, String statusCode);

    /**
     * 查询当前登录作者的文章详情。
     */
    PostDetailResponse getMyPostDetail(Long postId);

    /**
     * 查询当前作者可读的分类默认分组策略和分组选项。
     */
    PostEditorPolicyResponse getMyPostCategoryPolicies();

    /**
     * 中转上传 markdown 文件。
     */
    PostContentRelayResponse relayPostMarkdown(MultipartFile file);

    /**
     * 创建作者文章草稿。
     */
    AuthorPostItemResponse createMyPost(AuthorPostUpsertRequest request);

    /**
     * 更新作者文章草稿。
     */
    AuthorPostItemResponse updateMyPost(Long postId, AuthorPostUpsertRequest request);

    /**
     * 发布作者文章。
     */
    AuthorPostItemResponse publishMyPost(Long postId);

    /**
     * 下线作者文章。
     */
    AuthorPostItemResponse unpublishMyPost(Long postId);

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
     * 提交匿名悄悄话给作者。
     */
    Map<String, Object> submitAuthorWhisper(AuthorWhisperRequest request);

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

    /**
     * 查询分类访问策略。
     */
    List<PostCategoryPolicyResponse> listPostCategoryPolicies();

    /**
     * 更新分类访问策略。
     */
    PostCategoryPolicyResponse updatePostCategoryPolicy(String categoryCode, PostCategoryPolicyUpdateRequest request);

    /**
     * 查询博客分类展示元数据。
     */
    List<PostCategoryMetaResponse> listPostCategoryMetas();

    /**
     * 更新博客分类展示元数据。
     */
    PostCategoryMetaResponse upsertPostCategoryMeta(String categoryCode, PostCategoryMetaUpsertRequest request);
}
