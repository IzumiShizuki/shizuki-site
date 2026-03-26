package io.github.shizuki.site.media.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.ClientException;
import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.storage.config.OssProperties;
import java.util.LinkedHashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 启动时校验媒体存储 bucket 是否存在，避免运行期才暴露 NoSuchBucket。
 */
@Component("mediaOssBucketStartupValidator")
public class OssBucketStartupValidator implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OssBucketStartupValidator.class);

    private final MediaStorageProperties mediaStorageProperties;
    private final OssProperties ossProperties;
    private final SecretValueValidator secretValueValidator;

    public OssBucketStartupValidator(MediaStorageProperties mediaStorageProperties,
                                     OssProperties ossProperties,
                                     SecretValueValidator secretValueValidator) {
        this.mediaStorageProperties = mediaStorageProperties;
        this.ossProperties = ossProperties;
        this.secretValueValidator = secretValueValidator;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!mediaStorageProperties.isValidateBucketsOnStartup()) {
            return;
        }
        String endpoint = requireConfigValue(ossProperties.getEndpoint(), "shizuki.oss.endpoint");
        String accessKeyId = requireSecretValue(ossProperties.getAccessKeyId(), "shizuki.oss.access-key-id");
        String accessKeySecret = requireSecretValue(ossProperties.getAccessKeySecret(), "shizuki.oss.access-key-secret");
        Set<String> buckets = collectBuckets();
        LOGGER.debug("OSS_BUCKET_VALIDATE_START endpoint={} bucketCount={}", endpoint, buckets.size());

        OSS ossClient = createClient(endpoint, accessKeyId, accessKeySecret);
        try {
            for (String bucket : buckets) {
                validateBucketExists(ossClient, endpoint, bucket);
            }
            LOGGER.info("OSS_BUCKET_VALIDATE_DONE endpoint={} bucketCount={}", endpoint, buckets.size());
        } finally {
            try {
                ossClient.shutdown();
            } catch (Exception ignored) {
            }
        }
    }

    OSS createClient(String endpoint, String accessKeyId, String accessKeySecret) {
        return new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
    }

    void validateBucketExists(OSS ossClient, String endpoint, String bucket) {
        try {
            boolean exists = ossClient.doesBucketExist(bucket);
            if (!exists) {
                LOGGER.error("OSS_BUCKET_VALIDATE_FAIL endpoint={} bucket={} reason=NoSuchBucket", endpoint, bucket);
                throw new IllegalStateException(
                    "OSS bucket validation failed: bucket '" + bucket + "' does not exist (endpoint=" + endpoint + "). "
                        + "Please create the bucket or fix shizuki.media.storage/public-bucket/private-bucket."
                );
            }
            LOGGER.debug("OSS_BUCKET_VALIDATE_OK endpoint={} bucket={}", endpoint, bucket);
        } catch (OSSException | ClientException ex) {
            LOGGER.error(
                "OSS_BUCKET_VALIDATE_FAIL endpoint={} bucket={} error_type={} error_msg={}",
                endpoint,
                bucket,
                ex.getClass().getSimpleName(),
                ex.getMessage()
            );
            throw new IllegalStateException(
                "OSS bucket validation failed for bucket '" + bucket + "' (endpoint=" + endpoint + "): " + ex.getMessage(),
                ex
            );
        }
    }

    private Set<String> collectBuckets() {
        Set<String> buckets = new LinkedHashSet<>();
        String privateBucket = requireConfigValue(mediaStorageProperties.getPrivateBucket(), "shizuki.media.storage.private-bucket");
        String publicBucket = requireConfigValue(mediaStorageProperties.getPublicBucket(), "shizuki.media.storage.public-bucket");
        buckets.add(privateBucket);
        buckets.add(publicBucket);
        return buckets;
    }

    private String requireConfigValue(String value, String key) {
        if (!StringUtils.hasText(value) || secretValueValidator.isStructuredPlaceholder(value)) {
            throw new IllegalStateException("Startup blocked: missing or placeholder config '" + key + "'");
        }
        return value.trim();
    }

    private String requireSecretValue(String value, String key) {
        if (secretValueValidator.isInvalid(value)) {
            throw new IllegalStateException("Startup blocked: missing or invalid secret config '" + key + "'");
        }
        return value.trim();
    }
}
