package io.github.shizuki.site.media.mq;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MusicTrackCacheEntity;
import io.github.shizuki.site.media.mapper.MusicTrackCacheMapper;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 音乐缓存上传消费者。
 */
@Component
@ConditionalOnProperty(prefix = "shizuki.music.cache-upload.kafka", name = "enabled", havingValue = "true", matchIfMissing = true)
public class MusicTrackCacheUploadConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MusicTrackCacheUploadConsumer.class);

    private final MusicTrackCacheMapper musicTrackCacheMapper;
    private final ObjectStorageClient objectStorageClient;
    private final MediaStorageProperties mediaStorageProperties;
    private final OssProperties ossProperties;
    private final ObjectMapper objectMapper;

    public MusicTrackCacheUploadConsumer(MusicTrackCacheMapper musicTrackCacheMapper,
                                         ObjectStorageClient objectStorageClient,
                                         MediaStorageProperties mediaStorageProperties,
                                         OssProperties ossProperties,
                                         ObjectMapper objectMapper) {
        this.musicTrackCacheMapper = musicTrackCacheMapper;
        this.objectStorageClient = objectStorageClient;
        this.mediaStorageProperties = mediaStorageProperties;
        this.ossProperties = ossProperties;
        this.objectMapper = objectMapper;
    }

    @KafkaListener(
        topics = "${shizuki.music.cache-upload.kafka.topic:music.track.cache.upload}",
        groupId = "${shizuki.music.cache-upload.kafka.group-id:music-track-cache-upload-consumer}"
    )
    public void onMessage(String payload) {
        long startMs = System.currentTimeMillis();
        MusicTrackCacheUploadEvent event = parseEvent(payload);
        if (event == null) {
            return;
        }
        String provider = readString(event.provider(), "").toLowerCase(Locale.ROOT);
        String trackId = readString(event.trackId(), "");
        String sourceAudioUrl = readString(event.sourceAudioUrl(), "");
        String title = readString(event.title(), "");
        String artist = readString(event.artist(), "");
        if (!StringUtils.hasText(provider) || !StringUtils.hasText(trackId) || !StringUtils.hasText(sourceAudioUrl)) {
            return;
        }

        try {
            MusicTrackCacheEntity existing = loadTrackCache(provider, trackId);
            if (existing != null && objectStorageClient.objectExists(existing.getBucketCode(), existing.getObjectCode())) {
                touchTrackCacheLastListen(existing);
                LOGGER.info("MUSIC_CACHE_UPLOAD_CONSUME_OK provider={} trackId={} cacheHit=true durationMs={}",
                    provider,
                    trackId,
                    Math.max(1L, System.currentTimeMillis() - startMs));
                return;
            }

            try (InputStream in = new URL(sourceAudioUrl).openStream()) {
                String bucket = mediaStorageProperties.getPublicBucket();
                String extension = inferAudioExtension(sourceAudioUrl);
                String key = buildTrackObjectKey(provider, trackId, title, artist);
                StorageObjectMetadata metadata = new StorageObjectMetadata();
                metadata.setContentType(inferAudioContentType(extension));
                objectStorageClient.putObject(bucket, key, in, metadata);

                String publicUrl = buildPublicUrl(bucket, key);
                MusicTrackCacheEntity entity = existing == null ? new MusicTrackCacheEntity() : existing;
                entity.setProviderCode(provider);
                entity.setTrackId(trackId);
                entity.setBucketCode(bucket);
                entity.setObjectCode(key);
                entity.setPublicUrl(publicUrl);
                entity.setSourceUrl(sourceAudioUrl);
                entity.setLastListenTime(LocalDateTime.now());
                entity.setUpdatedAt(LocalDateTime.now());
                if (existing == null) {
                    entity.setCreatedAt(LocalDateTime.now());
                    musicTrackCacheMapper.insert(entity);
                } else {
                    musicTrackCacheMapper.updateById(entity);
                }
            } catch (DuplicateKeyException duplicateKeyException) {
                MusicTrackCacheEntity concurrent = loadTrackCache(provider, trackId);
                if (concurrent != null) {
                    touchTrackCacheLastListen(concurrent);
                }
            }

            LOGGER.info("MUSIC_CACHE_UPLOAD_CONSUME_OK provider={} trackId={} cacheHit=false durationMs={}",
                provider,
                trackId,
                Math.max(1L, System.currentTimeMillis() - startMs));
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_CACHE_UPLOAD_CONSUME_FAIL provider={} trackId={} reason={}",
                provider,
                trackId,
                sanitizeLogMessage(ex.getMessage()));
            // 缓存上传属于非阻塞链路，失败后直接跳过当前消息，避免同一失效 URL 无限重试刷屏。
            return;
        }
    }

    private String buildTrackObjectKey(String provider, String trackId, String title, String artist) {
        String normalizedProvider = sanitizeObjectNamePart(provider, "source", 32);
        String normalizedTrackId = sanitizeObjectNamePart(trackId, "track", 64);
        String normalizedTitle = sanitizeObjectNamePart(title, "unknown-title", 80);
        String normalizedArtist = sanitizeObjectNamePart(artist, "unknown-artist", 80);
        String fileName = normalizedTitle + "-" + normalizedArtist + "-" + normalizedProvider + ".mp3";
        return "music-cache/" + normalizedProvider + "/" + normalizedTrackId + "/" + fileName;
    }

    private String sanitizeObjectNamePart(String raw, String fallback, int maxLength) {
        String value = readString(raw, fallback)
            .replaceAll("[\\\\/:*?\"<>|\\s]+", "_")
            .replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}_\\-\\.]+", "");
        if (!StringUtils.hasText(value)) {
            value = fallback;
        }
        if (value.length() > maxLength) {
            value = value.substring(0, maxLength);
        }
        return value;
    }

    private MusicTrackCacheUploadEvent parseEvent(String payload) {
        if (!StringUtils.hasText(payload)) {
            return null;
        }
        try {
            return objectMapper.readValue(payload, MusicTrackCacheUploadEvent.class);
        } catch (Exception ex) {
            LOGGER.warn("MUSIC_CACHE_UPLOAD_CONSUME_FAIL provider=- trackId=- reason={}",
                sanitizeLogMessage(ex.getMessage()));
            return null;
        }
    }

    private MusicTrackCacheEntity loadTrackCache(String provider, String trackId) {
        return musicTrackCacheMapper.selectOne(
            new LambdaQueryWrapper<MusicTrackCacheEntity>()
                .eq(MusicTrackCacheEntity::getProviderCode, provider)
                .eq(MusicTrackCacheEntity::getTrackId, trackId)
        );
    }

    private void touchTrackCacheLastListen(MusicTrackCacheEntity entity) {
        if (entity == null || entity.getId() == null) {
            return;
        }
        entity.setLastListenTime(LocalDateTime.now());
        entity.setUpdatedAt(LocalDateTime.now());
        musicTrackCacheMapper.updateById(entity);
    }

    private String inferAudioExtension(String sourceAudioUrl) {
        String url = readString(sourceAudioUrl, "").toLowerCase(Locale.ROOT);
        int queryIndex = url.indexOf('?');
        if (queryIndex >= 0) {
            url = url.substring(0, queryIndex);
        }
        int hashIndex = url.indexOf('#');
        if (hashIndex >= 0) {
            url = url.substring(0, hashIndex);
        }
        if (url.endsWith(".m4a")) return "m4a";
        if (url.endsWith(".aac")) return "aac";
        if (url.endsWith(".flac")) return "flac";
        if (url.endsWith(".ogg")) return "ogg";
        if (url.endsWith(".wav")) return "wav";
        if (url.endsWith(".mp3")) return "mp3";
        return "mp3";
    }

    private String inferAudioContentType(String extension) {
        String ext = readString(extension, "mp3").toLowerCase(Locale.ROOT);
        return switch (ext) {
            case "m4a" -> "audio/mp4";
            case "aac" -> "audio/aac";
            case "flac" -> "audio/flac";
            case "ogg" -> "audio/ogg";
            case "wav" -> "audio/wav";
            default -> "audio/mpeg";
        };
    }

    private String buildPublicUrl(String bucket, String key) {
        String base = readString(mediaStorageProperties.getPublicBaseUrl(), "");
        if (StringUtils.hasText(base)) {
            String normalizedBase = base.endsWith("/") ? base.substring(0, base.length() - 1) : base;
            return normalizedBase + "/" + key;
        }
        URI endpointUri = URI.create("https://" + readString(ossProperties.getEndpoint(), ""));
        String scheme = endpointUri.getScheme() == null ? "https" : endpointUri.getScheme();
        String host = endpointUri.getHost();
        if (!StringUtils.hasText(host)) {
            throw new IllegalStateException("Invalid OSS endpoint for public URL");
        }
        if (host.startsWith(bucket + ".")) {
            return scheme + "://" + host + "/" + key;
        }
        return scheme + "://" + bucket + "." + host + "/" + key;
    }

    private String readString(Object raw, String fallback) {
        if (raw == null) {
            return fallback;
        }
        String value = String.valueOf(raw).trim();
        return StringUtils.hasText(value) ? value : fallback;
    }

    private String sanitizeLogMessage(String raw) {
        if (!StringUtils.hasText(raw)) {
            return "unknown_error";
        }
        String normalized = raw.replace('\n', ' ').replace('\r', ' ').trim();
        if (normalized.length() > 220) {
            return normalized.substring(0, 220) + "...";
        }
        return normalized;
    }
}
