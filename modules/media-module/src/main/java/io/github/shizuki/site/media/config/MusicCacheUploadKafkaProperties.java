package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 音乐缓存异步上传 Kafka 配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.cache-upload.kafka")
public class MusicCacheUploadKafkaProperties {

    private boolean enabled = true;
    private String topic = "music.track.cache.upload";
    private String groupId = "music-track-cache-upload-consumer";

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? "music.track.cache.upload" : topic.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? "music-track-cache-upload-consumer" : groupId.trim();
    }
}
