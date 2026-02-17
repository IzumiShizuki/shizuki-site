package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AdminMusicPlaylistReplaceRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderGuideUpsertRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderVisibilityUpdateRequest;
import io.github.shizuki.site.media.dto.AssetCreateRequest;
import io.github.shizuki.site.media.dto.AssetCreateResponse;
import io.github.shizuki.site.media.dto.AssetDownloadResponse;
import io.github.shizuki.site.media.dto.AssetReportResponse;
import io.github.shizuki.site.media.dto.MusicKeyGuideResponse;
import io.github.shizuki.site.media.dto.MusicPickRequest;
import io.github.shizuki.site.media.dto.MusicPickResponse;
import io.github.shizuki.site.media.dto.MusicProviderResponse;
import io.github.shizuki.site.media.dto.MusicQuotaResponse;
import io.github.shizuki.site.media.dto.MusicTrackResponse;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.SpotifyPreviewResponse;
import io.github.shizuki.site.media.dto.SpotifyTrackResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import java.util.List;

public interface MediaService {

    /**
     * 创建客户端上传策略（直传 OSS）。
     *
     * @param request 上传策略请求，包含资源类型、可见性与 content-type
     * @return 直传策略（bucket/key/签名 URL 等）
     */
    UploadPolicyResponse createUploadPolicy(UploadPolicyRequest request);

    /**
     * 创建资源元数据记录。
     *
     * @param request 资产创建请求
     * @return 资产创建结果（资产 ID、审核状态、类型等）
     */
    AssetCreateResponse createAsset(AssetCreateRequest request);

    /**
     * 生成资源下载地址。
     *
     * @param assetId 资源主键
     * @return 公开直链或私有签名下载链接
     */
    AssetDownloadResponse createDownloadUrl(Long assetId);

    /**
     * 举报资源。
     *
     * @param assetId 资源主键
     * @return 举报单创建结果
     */
    AssetReportResponse reportAsset(Long assetId);

    /**
     * 审核资源状态。
     *
     * @param assetId 资源主键
     * @param request 审核更新参数
     * @return 审核更新结果
     */
    AdminAssetAuditResponse auditAsset(Long assetId, AdminAssetUpdateRequest request);

    /**
     * 查询首页公开角色池。
     *
     * @return 公开角色列表（游客可访问）
     */
    List<PublicHomeRoleResponse> listPublicHomeRoles();

    /**
     * 查询默认音乐歌单（游客可访问）。
     *
     * @return 默认歌单（仅返回已启用曲目）
     */
    List<MusicTrackResponse> listDefaultMusicPlaylist();

    /**
     * 查询当前用户音乐配额。
     *
     * @return 包含选歌次数、上传字节、key 绑定状态的配额快照
     */
    MusicQuotaResponse myMusicQuota();

    /**
     * 执行一次选歌。
     *
     * @param request 选歌请求（provider 与关键字）
     * @return 选中的曲目与选歌后配额状态
     */
    MusicPickResponse pickMusic(MusicPickRequest request);

    /**
     * 查询 provider 列表。
     *
     * @return provider 配置列表（enabled/visible/sort）
     */
    List<MusicProviderResponse> listMusicProviders();

    /**
     * 查询 provider key 获取引导。
     *
     * @param provider provider 编码
     * @return 引导标题、说明与链接
     */
    MusicKeyGuideResponse getMusicKeyGuide(String provider);

    /**
     * Spotify 搜索（首版为预览能力）。
     *
     * @param query 搜索关键字
     * @param limit 返回上限（1~50）
     * @return 搜索结果列表
     */
    List<SpotifyTrackResponse> searchSpotify(String query, Integer limit);

    /**
     * Spotify 预览链接查询。
     *
     * @param trackId 曲目 ID
     * @return 预览地址（可能为空字符串）
     */
    SpotifyPreviewResponse getSpotifyPreview(String trackId);

    /**
     * 管理端查询默认歌单。
     *
     * @return 管理端完整歌单（含禁用项）
     */
    List<MusicTrackResponse> listAdminDefaultPlaylist();

    /**
     * 管理端替换默认歌单。
     *
     * @param request 歌单全量替换请求
     * @return 替换后的歌单
     */
    List<MusicTrackResponse> replaceAdminDefaultPlaylist(AdminMusicPlaylistReplaceRequest request);

    /**
     * 管理端查询 provider 配置。
     *
     * @return provider 配置列表
     */
    List<MusicProviderResponse> listAdminProviders();

    /**
     * 管理端更新 provider 显隐配置。
     *
     * @param provider provider 编码
     * @param request 更新请求（enabled/visible/sort）
     * @return 更新后的 provider 配置
     */
    MusicProviderResponse updateAdminProviderVisibility(String provider, AdminMusicProviderVisibilityUpdateRequest request);

    /**
     * 管理端查询 provider 引导。
     *
     * @return 引导配置列表
     */
    List<MusicKeyGuideResponse> listAdminProviderGuides();

    /**
     * 管理端更新 provider 引导。
     *
     * @param provider provider 编码
     * @param request 引导文案请求
     * @return 更新后的引导配置
     */
    MusicKeyGuideResponse upsertAdminProviderGuide(String provider, AdminMusicProviderGuideUpsertRequest request);
}
