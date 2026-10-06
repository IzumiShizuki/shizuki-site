package io.github.shizuki.site.media.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.media.integration.NeteaseCookieProvider;
import io.github.shizuki.site.media.integration.UserMusicGateway;
import io.github.shizuki.site.media.response.MeMusicLibrarySidebarResponse;
import io.github.shizuki.site.media.response.MusicPlaylistBundleResponse;
import io.github.shizuki.site.media.response.MusicPlaylistSummaryResponse;
import io.github.shizuki.site.media.response.MusicTrackResponse;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/** Account-backed platform library; credentials are always resolved for the current website user. */
@Service
public class PlatformMusicLibraryService {
    private final NeteaseCookieProvider netease;
    private final UserMusicGateway users;

    public PlatformMusicLibraryService(NeteaseCookieProvider netease, UserMusicGateway users) {
        this.netease = netease;
        this.users = users;
    }

    public MeMusicLibrarySidebarResponse accountLibrary(String provider) {
        requireNetease(provider);
        return netease.accountLibrary(requiredCookie(), requireUserId());
    }

    public MeMusicLibrarySidebarResponse accountLibraryIfBound(Long userId) {
        String cookie = users.getSourceAccountCookiePlaintext(userId, "netease");
        return StringUtils.hasText(cookie) ? netease.accountLibrary(cookie, userId) : null;
    }

    public List<String> likedTrackIds(String provider) {
        requireNetease(provider);
        return netease.likedTrackIds(requiredCookie());
    }

    public Map<String, Object> setTrackLiked(String provider, String trackId, boolean liked) {
        requireNetease(provider);
        netease.setTrackLiked(trackId, liked, requiredCookie());
        return Map.of("provider", "netease", "trackId", trackId, "liked", liked);
    }

    /** Compatibility for pages loaded before cloud playlists replaced local liked playlists. */
    public MusicPlaylistBundleResponse unlikePlaylistTrack(String code, String provider, String trackId) {
        requireNetease(provider);
        String cookie = requiredCookie();
        Long userId = requireUserId();
        MusicPlaylistSummaryResponse liked = netease.accountLibrary(cookie, userId).likedPlaylist();
        if (liked == null || !liked.playlistCode().equals(code)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "只能从当前账号喜欢的音乐中取消喜欢");
        }
        // Prepare the response before writing: a failed read must never hide a successful unlike.
        MusicPlaylistBundleResponse before = netease.accountPlaylistBundle(code.substring("account_netease_".length()), cookie, userId);
        netease.setTrackLiked(trackId, false, cookie);
        List<MusicTrackResponse> tracks = before.tracks().stream()
            .filter(track -> !track.trackId().equals(trackId)).toList();
        MusicPlaylistSummaryResponse profile = before.profile();
        return new MusicPlaylistBundleResponse(new MusicPlaylistSummaryResponse(
            profile.playlistCode(), profile.name(), profile.description(), profile.cover(), profile.playlistType(),
            profile.ownerUserId(), profile.isPublic(), tracks.size(), profile.sourceProvider()), tracks);
    }

    public List<MusicPlaylistSummaryResponse> podcasts(String query) {
        return netease.recommendedPodcasts(optionalCookie(), query);
    }

    public List<MusicTrackResponse> personalFm() {
        return netease.personalFmTracks(requiredCookie());
    }

    public List<MusicPlaylistSummaryResponse> personalPodcasts(String provider, String source) {
        requireNetease(provider);
        return netease.personalPodcasts(source, requiredCookie());
    }

    public Map<String, Object> setProgramLiked(String provider, String programId, boolean liked) {
        requireNetease(provider);
        netease.setProgramLiked(programId, liked, requiredCookie());
        return Map.of("provider", "netease", "programId", programId, "liked", liked);
    }

    public List<MusicTrackResponse> likedPrograms(String provider) {
        requireNetease(provider);
        return netease.likedPrograms(requiredCookie());
    }

    public Map<String, Object> programLikeState(String provider, String programId) {
        requireNetease(provider);
        return Map.of("programId", programId, "liked", netease.programLiked(programId, requiredCookie()));
    }

    public boolean handlesPlaylist(String code) {
        return code != null && (code.startsWith("account_netease_") || code.startsWith("podcast_netease_"));
    }

    public MusicPlaylistBundleResponse playlistBundle(String code) {
        if (code.startsWith("account_netease_")) {
            return netease.accountPlaylistBundle(code.substring("account_netease_".length()), requiredCookie(), requireUserId());
        }
        if (code.startsWith("podcast_netease_")) {
            return netease.podcastBundle(code.substring("podcast_netease_".length()), optionalCookie());
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "平台歌单编码无效");
    }

    private String optionalCookie() {
        long userId = LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
        return userId > 0 ? users.getSourceAccountCookiePlaintext(userId, "netease") : "";
    }

    private String requiredCookie() {
        String cookie = users.getSourceAccountCookiePlaintext(requireUserId(), "netease");
        if (!StringUtils.hasText(cookie)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "请先绑定网易云账号", Map.of("music_error_code", "SOURCE_ACCOUNT_REQUIRED", "provider", "netease"));
        }
        return cookie;
    }

    private Long requireUserId() {
        Long userId = LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
        if (userId <= 0L) throw new BusinessException(ErrorCode.UNAUTHORIZED, "请先登录网站账号");
        return userId;
    }

    private void requireNetease(String provider) {
        if (!"netease".equalsIgnoreCase(provider)) {
            throw new BusinessException(ErrorCode.FEATURE_DISABLED, "该平台暂未启用账号歌单与点赞接口");
        }
    }
}
