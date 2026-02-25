package io.github.shizuki.site.media.config;

import com.aliyun.oss.OSS;
import io.github.shizuki.common.storage.config.OssProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.DefaultApplicationArguments;

class OssBucketStartupValidatorTest {

    @Test
    void shouldPassWhenAllBucketsExist() {
        MediaStorageProperties mediaStorageProperties = new MediaStorageProperties();
        mediaStorageProperties.setValidateBucketsOnStartup(true);
        mediaStorageProperties.setPrivateBucket("shizuki-private");
        mediaStorageProperties.setPublicBucket("shizuki-public");

        OssProperties ossProperties = new OssProperties();
        ossProperties.setEndpoint("https://oss-cn-hangzhou.aliyuncs.com");
        ossProperties.setAccessKeyId("ak");
        ossProperties.setAccessKeySecret("sk");

        OssBucketStartupValidator validator = Mockito.spy(new OssBucketStartupValidator(mediaStorageProperties, ossProperties));
        OSS ossClient = Mockito.mock(OSS.class);
        Mockito.doReturn(ossClient).when(validator).createClient(Mockito.anyString(), Mockito.anyString(), Mockito.anyString());
        Mockito.when(ossClient.doesBucketExist(Mockito.anyString())).thenReturn(true);

        validator.run(new DefaultApplicationArguments(new String[0]));

        Mockito.verify(ossClient).doesBucketExist("shizuki-private");
        Mockito.verify(ossClient).doesBucketExist("shizuki-public");
        Mockito.verify(ossClient).shutdown();
    }

    @Test
    void shouldFailFastWhenBucketMissing() {
        MediaStorageProperties mediaStorageProperties = new MediaStorageProperties();
        mediaStorageProperties.setValidateBucketsOnStartup(true);
        mediaStorageProperties.setPrivateBucket("shizuki-private");
        mediaStorageProperties.setPublicBucket("shizuki-public");

        OssProperties ossProperties = new OssProperties();
        ossProperties.setEndpoint("https://oss-cn-hangzhou.aliyuncs.com");
        ossProperties.setAccessKeyId("ak");
        ossProperties.setAccessKeySecret("sk");

        OssBucketStartupValidator validator = Mockito.spy(new OssBucketStartupValidator(mediaStorageProperties, ossProperties));
        OSS ossClient = Mockito.mock(OSS.class);
        Mockito.doReturn(ossClient).when(validator).createClient(Mockito.anyString(), Mockito.anyString(), Mockito.anyString());
        Mockito.when(ossClient.doesBucketExist("shizuki-private")).thenReturn(true);
        Mockito.when(ossClient.doesBucketExist("shizuki-public")).thenReturn(false);

        IllegalStateException exception = Assertions.assertThrows(
            IllegalStateException.class,
            () -> validator.run(new DefaultApplicationArguments(new String[0]))
        );
        Assertions.assertTrue(exception.getMessage().contains("shizuki-public"));
        Mockito.verify(ossClient).shutdown();
    }

    @Test
    void shouldSkipValidationWhenDisabled() {
        MediaStorageProperties mediaStorageProperties = new MediaStorageProperties();
        mediaStorageProperties.setValidateBucketsOnStartup(false);
        mediaStorageProperties.setPrivateBucket("shizuki-private");
        mediaStorageProperties.setPublicBucket("shizuki-public");

        OssProperties ossProperties = new OssProperties();
        ossProperties.setEndpoint("https://oss-cn-hangzhou.aliyuncs.com");
        ossProperties.setAccessKeyId("ak");
        ossProperties.setAccessKeySecret("sk");

        OssBucketStartupValidator validator = Mockito.spy(new OssBucketStartupValidator(mediaStorageProperties, ossProperties));

        validator.run(new DefaultApplicationArguments(new String[0]));

        Mockito.verify(validator, Mockito.never()).createClient(Mockito.anyString(), Mockito.anyString(), Mockito.anyString());
    }
}
