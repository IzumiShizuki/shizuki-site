package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.dto.AdminAssetUpdateRequest;
import io.github.shizuki.site.media.dto.AdminMusicDefaultPlaylistBundleReplaceRequest;
import io.github.shizuki.site.media.dto.AdminAssetAuditResponse;
import io.github.shizuki.site.media.dto.AdminMusicPlaylistReplaceRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderGuideUpsertRequest;
import io.github.shizuki.site.media.dto.AdminMusicProviderVisibilityUpdateRequest;
import io.github.shizuki.site.media.dto.AdminMusicTrackUpsertRequest;
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
import io.github.shizuki.site.media.dto.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.dto.MeMusicPlaylistCreateRequest;
import io.github.shizuki.site.media.dto.MeMusicPlaylistTrackUpsertRequest;
import io.github.shizuki.site.media.dto.MeMusicPlaylistUpdateRequest;
import io.github.shizuki.site.media.dto.MusicDefaultPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicLibraryHomeResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.dto.MusicSearchResponse;
import io.github.shizuki.site.media.dto.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.dto.MusicResolvePlaybackRequest;
import io.github.shizuki.site.media.dto.PublicHomeRoleResponse;
import io.github.shizuki.site.media.dto.MusicSourcePlaylistImportResponse;
import io.github.shizuki.site.media.dto.SpotifyPreviewResponse;
import io.github.shizuki.site.media.dto.SpotifyTrackResponse;
import io.github.shizuki.site.media.dto.UploadPolicyRequest;
import io.github.shizuki.site.media.dto.UploadPolicyResponse;
import io.github.shizuki.site.media.dto.UploadRelayResponse;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface MediaService {

    /**
     * 创建客户端上传策略（直传 OSS）。
     *
     * @param request 上传策略请求，包含资源类型、可见性与 content-type
     * @return 直传策略（bucket/key/签名 URL 等）
     */
    UploadPolicyResponse createUploadPolicy(UploadPolicyRequest request);

    /**
     * 服务端中转上传文件到 OSS。
     *
     * @param file 客户端上传文件
     * @param assetKind 资源类型（STATIC_IMAGE/ANIMATED_IMAGE/LIVE2D_PACKAGE/AUDIO）
     * @param visibility 可见性（PUBLIC/PRIVATE/GROUP），为空时默认 PRIVATE
     * @return 中转上传后的对象定位信息
     */
    UploadRelayResponse uploadRelay(MultipartFile file, String assetKind, String visibility);

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
     * 查询默认歌单聚合（资料 + 曲目，游客可访问）。
     *
     * @return 默认歌单聚合
     */
    MusicDefaultPlaylistBundleResponse getDefaultPlaylistBundle();

    /**
     * 查询音乐库主列表聚合数据（游客可访问）。
     *
     * @return 主列表聚合
     */
    MusicLibraryHomeResponse getMusicLibraryHome();

    /**
     * 根据歌单编码查询歌单聚合（按公开/私有权限判断）。
     *
     * @param playlistCode 歌单业务编码
     * @return 歌单聚合
     */
    MusicPlaylistBundleResponse getMusicPlaylistBundle(String playlistCode);

    /**
     * 音乐聚合搜索（支持歌单/歌曲/歌手）。
     *
     * @param query 搜索词
     * @param type 类型（all/playlist/track/artist）
     * @param providers 平台列表（逗号分隔）
     * @param page 页码
     * @param limit 每页大小
     * @return 搜索聚合结果
     */
    MusicSearchResponse searchMusic(String query, String type, String providers, Integer page, Integer limit);

    /**
     * 按需解析歌曲播放信息（仅在真实播放动作触发）。
     *
     * @param request 解析请求
     * @return 可播放曲目信息
     */
    MusicTrackResponse resolvePlaybackTrack(MusicResolvePlaybackRequest request);

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
     * 管理端查询默认歌单聚合（资料 + 全量曲目）。
     *
     * @return 默认歌单聚合
     */
    MusicDefaultPlaylistBundleResponse getAdminDefaultPlaylistBundle();

    /**
     * 管理端替换默认歌单。
     *
     * @param request 歌单全量替换请求
     * @return 替换后的歌单
     */
    List<MusicTrackResponse> replaceAdminDefaultPlaylist(AdminMusicPlaylistReplaceRequest request);

    /**
     * 管理端替换默认歌单聚合（资料 + 全量曲目）。
     *
     * @param request 聚合替换请求
     * @return 替换后的聚合结果
     */
    MusicDefaultPlaylistBundleResponse replaceAdminDefaultPlaylistBundle(AdminMusicDefaultPlaylistBundleReplaceRequest request);

    /**
     * 管理端向默认歌单追加或更新单曲（按 provider + track_id 幂等）。
     *
     * @param request 默认歌单单曲写入请求
     */
    void upsertAdminDefaultPlaylistTrack(AdminMusicTrackUpsertRequest request);

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

    /**
     * 查询我的音乐库侧栏聚合。
     *
     * @return 默认/我喜欢/自建/收藏歌单
     */
    MeMusicLibrarySidebarResponse getMyMusicLibrarySidebar();

    /**
     * 创建我的自建歌单。
     *
     * @param request 创建请求
     * @return 创建后的歌单摘要
     */
    MusicPlaylistSummaryResponse createMyMusicPlaylist(MeMusicPlaylistCreateRequest request);

    /**
     * 更新我的歌单信息。
     *
     * @param playlistCode 歌单业务编码
     * @param request 更新请求
     * @return 更新后的歌单摘要
     */
    MusicPlaylistSummaryResponse updateMyMusicPlaylist(String playlistCode, MeMusicPlaylistUpdateRequest request);

    /**
     * 删除我的歌单。
     *
     * @param playlistCode 歌单业务编码
     */
    void deleteMyMusicPlaylist(String playlistCode);

    /**
     * 为我的歌单新增或更新曲目。
     *
     * @param playlistCode 歌单业务编码
     * @param request 曲目请求
     * @return 歌单聚合
     */
    MusicPlaylistBundleResponse upsertMyMusicPlaylistTrack(String playlistCode, MeMusicPlaylistTrackUpsertRequest request);

    /**
     * 从我的歌单删除曲目。
     *
     * @param playlistCode 歌单业务编码
     * @param provider provider 编码
     * @param trackId 曲目 ID
     * @return 歌单聚合
     */
    MusicPlaylistBundleResponse removeMyMusicPlaylistTrack(String playlistCode, String provider, String trackId);

    /**
     * 收藏公开歌单。
     *
     * @param playlistCode 歌单业务编码
     */
    void collectPlaylist(String playlistCode);

    /**
     * 取消收藏歌单。
     *
     * @param playlistCode 歌单业务编码
     */
    void uncollectPlaylist(String playlistCode);

    /**
     * 从已绑定音乐源账号导入歌单到站内。
     *
     * @param provider 来源平台（netease/qqmusic/kugou）
     * @return 导入统计
     */
    MusicSourcePlaylistImportResponse importSourceAccountPlaylists(String provider);
}
