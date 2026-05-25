package io.github.shizuki.site.media.mq;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MusicTrackCacheEntity;
import io.github.shizuki.site.media.mapper.MusicTrackCacheMapper;
import io.github.shizuki.site.media.util.MusicTrackCacheObjectCodes;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class MusicTrackCacheUploadConsumerTest {

    @Test
    void shouldSkipObjectExistsProbeForSourceOnlyPlaceholder() throws Exception {
        MusicTrackCacheMapper mapper = Mockito.mock(MusicTrackCacheMapper.class);
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);

        MediaStorageProperties mediaStorageProperties = new MediaStorageProperties();
        mediaStorageProperties.setPublicBucket("music-public");

        OssProperties ossProperties = new OssProperties();
        ossProperties.setEndpoint("https://oss-cn-hangzhou.aliyuncs.com");

        MusicTrackCacheEntity existing = new MusicTrackCacheEntity();
        existing.setId(10L);
        existing.setProviderCode("netease");
        existing.setTrackId("3003");
        existing.setBucketCode("music-public");
        existing.setObjectCode(MusicTrackCacheObjectCodes.SOURCE_ONLY_OBJECT_CODE);

        Mockito.when(mapper.selectOne(ArgumentMatchers.any())).thenReturn(existing);

        MusicTrackCacheUploadConsumer consumer = new MusicTrackCacheUploadConsumer(
            mapper,
            objectStorageClient,
            mediaStorageProperties,
            ossProperties,
            new ObjectMapper()
        );

        String payload = new ObjectMapper().writeValueAsString(
            new MusicTrackCacheUploadEvent("netease", "3003", "not-a-url", "demo", "artist")
        );
        consumer.onMessage(payload);

        Mockito.verify(objectStorageClient, Mockito.never())
            .objectExists(ArgumentMatchers.anyString(), ArgumentMatchers.anyString());
    }
}
