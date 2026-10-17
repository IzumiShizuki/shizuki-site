package io.github.shizuki.site.content.service.discovery;

import io.github.shizuki.site.content.config.PersonalContentFeatureProperties;
import io.github.shizuki.site.content.controller.album.PublicAlbumDetailResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumPhotoResponse;
import io.github.shizuki.site.content.response.PublicMomentDetailResponse;
import io.github.shizuki.site.content.response.PublicMomentResponse;
import io.github.shizuki.site.content.response.PublicPostDocument;
import io.github.shizuki.site.content.service.ContentService;
import io.github.shizuki.site.content.service.album.PublicAlbumQueryService;
import io.github.shizuki.site.content.service.moment.PublicMomentQueryService;
import io.github.shizuki.site.content.support.PublicMarkdown;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

/** Reuses the visitor read boundaries, including media publication eligibility and kill switches. */
@Service
public class PublicContentDiscoveryService {

    private final ContentService content;
    private final PublicAlbumQueryService albums;
    private final PublicMomentQueryService moments;
    private final PersonalContentFeatureProperties features;

    public PublicContentDiscoveryService(ContentService content, PublicAlbumQueryService albums,
                                         PublicMomentQueryService moments, PersonalContentFeatureProperties features) {
        this.content = content;
        this.albums = albums;
        this.moments = moments;
        this.features = features;
    }

    public PublicContentPage post(Long id) {
        PublicPostDocument post = content.getDiscoverablePost(id);
        String description = excerpt(post.summary() == null || post.summary().isBlank()
            ? PublicMarkdown.text(post.markdown()) : post.summary(), 180);
        return new PublicContentPage(post.title(), description, "/read/posts/" + post.postId(),
            "/blog/" + post.postId(), post.coverImageUrl(), timestamp(post.publishedAt()),
            "BlogPosting", PublicMarkdown.html(post.markdown()), false);
    }

    public PublicContentPage album(String slug) {
        requireIdentifier(slug);
        PublicAlbumDetailResponse album = albums.detail(slug);
        StringBuilder body = new StringBuilder("<p>" + escape(album.summary()) + "</p><div class=\"photo-grid\">");
        String cover = null;
        for (PublicAlbumPhotoResponse photo : album.photos()) {
            String path = photo.media() == null ? null : photo.media().variants().stream()
                .filter(variant -> variant.capability() == null || variant.capability().isBlank())
                .sorted(Comparator.comparingInt(variant -> variantPriority(variant.variant())))
                .map(variant -> safeMediaPath(variant.path())).filter(Objects::nonNull).findFirst().orElse(null);
            if (path == null) continue; // Never place link-only media capabilities in HTML or image URLs.
            if (cover == null) cover = path;
            body.append("<figure><img loading=\"lazy\" src=\"").append(escape(path)).append("\" alt=\"")
                .append(escape(photo.altText())).append("\"><figcaption>").append(escape(photo.caption()))
                .append("</figcaption></figure>");
        }
        body.append("</div>");
        if (album.noIndex()) body.append("<p>照片请在站内相册中查看。</p>");
        return new PublicContentPage(album.title(), excerpt(album.summary(), 180), "/read/albums/" + slug,
            "/albums/" + slug, cover, timestamp(album.publishedAt()), "ImageGallery", body.toString(), album.noIndex());
    }

    public PublicContentPage moment(String id) {
        requireIdentifier(id);
        PublicMomentDetailResponse detail = moments.detail(id);
        PublicMomentResponse moment = detail.moment();
        String description = excerpt(PublicMarkdown.text(moment.body()), 180);
        StringBuilder body = new StringBuilder(PublicMarkdown.html(moment.body()));
        String cover = null;
        for (var photo : moment.photos()) {
            String path = photo.variants().stream()
                .sorted(Comparator.comparingInt(variant -> variantPriority(variant.variant())))
                .map(variant -> safeMediaPath(variant.path()))
                .filter(Objects::nonNull).findFirst().orElse(null);
            if (path == null) continue;
            if (cover == null) cover = path;
            body.append("<figure><img loading=\"lazy\" src=\"").append(escape(path)).append("\" alt=\"")
                .append(escape(photo.altText())).append("\"></figure>");
        }
        if (detail.unlisted()) body.append("<p>关联照片请在站内动态中查看。</p>");
        return new PublicContentPage(excerpt(description, 48).isBlank() ? "一条动态" : excerpt(description, 48),
            description, "/read/moments/" + id, "/moments/" + id, cover, timestamp(moment.publishedAt()),
            "SocialMediaPosting", body.toString(), detail.noindex());
    }

    public List<PublicDiscoveryLink> catalog() {
        List<PublicDiscoveryLink> result = new ArrayList<>();
        for (PublicPostDocument post : content.listDiscoverablePosts()) {
            result.add(new PublicDiscoveryLink("/read/posts/" + post.postId(), post.title(), timestamp(post.publishedAt())));
        }
        if (!features.isPublicApiAvailable()) return List.copyOf(result);
        int limit = Math.min(50, features.getMaxPageSize());
        String cursor = null;
        do {
            var page = albums.list(cursor, limit);
            for (var album : page.items()) {
                result.add(new PublicDiscoveryLink("/read/albums/" + album.publicSlug(), album.title(), timestamp(album.publishedAt())));
            }
            String next = page.hasMore() ? page.nextCursor() : null;
            if (page.hasMore() && (next == null || Objects.equals(cursor, next))) throw new IllegalStateException("Album cursor did not advance");
            cursor = next;
        } while (cursor != null);
        do {
            var page = moments.feed(cursor, limit);
            for (var moment : page.items()) {
                result.add(new PublicDiscoveryLink("/read/moments/" + moment.publicId(),
                    excerpt(PublicMarkdown.text(moment.body()), 48), timestamp(moment.publishedAt())));
            }
            String next = page.hasMore() ? page.nextCursor() : null;
            if (page.hasMore() && (next == null || Objects.equals(cursor, next))) throw new IllegalStateException("Moment cursor did not advance");
            cursor = next;
        } while (cursor != null);
        return List.copyOf(result);
    }

    private static String safeMediaPath(String path) {
        return path != null && path.matches("/api/v1/media/med_[A-Za-z0-9_-]{27}/variants/(DISPLAY_WEBP|DISPLAY_AVIF|THUMB_WEBP)")
            ? path : null;
    }

    private static int variantPriority(ImageVariantTypeEnum type) {
        if (type == null) return Integer.MAX_VALUE;
        return switch (type) {
            case DISPLAY_WEBP -> 0;
            case DISPLAY_AVIF -> 1;
            case THUMB_WEBP -> 2;
            default -> Integer.MAX_VALUE;
        };
    }

    private static void requireIdentifier(String value) {
        if (value == null || !value.matches("[A-Za-z0-9_-]{1,240}")) {
            throw new IllegalArgumentException("Invalid public identifier");
        }
    }

    private static String timestamp(TemporalAccessor time) {
        if (time == null) return null;
        if (time instanceof java.time.LocalDateTime local) return local.atZone(ZoneId.of("Asia/Shanghai")).toOffsetDateTime().toString();
        return time.toString();
    }

    private static String excerpt(String value, int limit) {
        String source = value == null ? "" : value.replaceAll("(?U)\\s+", " ").strip();
        int count = source.codePointCount(0, source.length());
        return count <= limit ? source : source.substring(0, source.offsetByCodePoints(0, limit)) + "…";
    }

    private static String escape(String value) {
        return HtmlUtils.htmlEscape(value == null ? "" : value, "UTF-8");
    }
}
