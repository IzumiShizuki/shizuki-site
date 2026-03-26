package io.github.shizuki.site.media.config;

import com.aliyun.oss.OSS;
import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.storage.config.OssProperties;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.DefaultApplicationArguments;

class OssBucketStartupValidatorTest {

    @Test
    void shouldPassWhenAllBucketsExist() {
        TestableOssBucketStartupValidator validator = newValidator("https://oss-cn-hangzhou.aliyuncs.com", "ak", "sk");
        validator.bucketExists("shizuki-private", true);
        validator.bucketExists("shizuki-public", true);

        validator.run(new DefaultApplicationArguments(new String[0]));

        Assertions.assertTrue(validator.createClientCalled());
        Assertions.assertTrue(validator.shutdownCalled());
        Assertions.assertEquals(2, validator.bucketChecks());
    }

    @Test
    void shouldFailFastWhenBucketMissing() {
        TestableOssBucketStartupValidator validator = newValidator("https://oss-cn-hangzhou.aliyuncs.com", "ak", "sk");
        validator.bucketExists("shizuki-private", true);
        validator.bucketExists("shizuki-public", false);

        IllegalStateException exception = Assertions.assertThrows(
            IllegalStateException.class,
            () -> validator.run(new DefaultApplicationArguments(new String[0]))
        );

        Assertions.assertTrue(exception.getMessage().contains("shizuki-public"));
        Assertions.assertTrue(validator.shutdownCalled());
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

        TestableOssBucketStartupValidator validator = new TestableOssBucketStartupValidator(mediaStorageProperties, ossProperties);

        validator.run(new DefaultApplicationArguments(new String[0]));

        Assertions.assertFalse(validator.createClientCalled());
    }

    @Test
    void shouldFailFastWhenSecretConfigStillUsesPlaceholder() {
        TestableOssBucketStartupValidator validator = newValidator(
            "https://oss-cn-hangzhou.aliyuncs.com",
            "<OSS_ACCESS_KEY_ID>",
            "sk"
        );

        IllegalStateException exception = Assertions.assertThrows(
            IllegalStateException.class,
            () -> validator.run(new DefaultApplicationArguments(new String[0]))
        );

        Assertions.assertTrue(exception.getMessage().contains("shizuki.oss.access-key-id"));
        Assertions.assertFalse(validator.createClientCalled());
    }

    private static TestableOssBucketStartupValidator newValidator(String endpoint, String accessKeyId, String accessKeySecret) {
        MediaStorageProperties mediaStorageProperties = new MediaStorageProperties();
        mediaStorageProperties.setValidateBucketsOnStartup(true);
        mediaStorageProperties.setPrivateBucket("shizuki-private");
        mediaStorageProperties.setPublicBucket("shizuki-public");

        OssProperties ossProperties = new OssProperties();
        ossProperties.setEndpoint(endpoint);
        ossProperties.setAccessKeyId(accessKeyId);
        ossProperties.setAccessKeySecret(accessKeySecret);

        return new TestableOssBucketStartupValidator(mediaStorageProperties, ossProperties);
    }

    private static final class TestableOssBucketStartupValidator extends OssBucketStartupValidator {

        private final Map<String, Boolean> bucketExistence = new HashMap<>();
        private boolean createClientCalled;
        private boolean shutdownCalled;
        private int bucketChecks;

        private TestableOssBucketStartupValidator(MediaStorageProperties mediaStorageProperties,
                                                  OssProperties ossProperties) {
            super(mediaStorageProperties, ossProperties, new SecretValueValidator());
        }

        void bucketExists(String bucket, boolean exists) {
            bucketExistence.put(bucket, exists);
        }

        boolean createClientCalled() {
            return createClientCalled;
        }

        boolean shutdownCalled() {
            return shutdownCalled;
        }

        int bucketChecks() {
            return bucketChecks;
        }

        @Override
        OSS createClient(String endpoint, String accessKeyId, String accessKeySecret) {
            createClientCalled = true;
            return (OSS) Proxy.newProxyInstance(
                OSS.class.getClassLoader(),
                new Class<?>[]{OSS.class},
                (proxy, method, args) -> {
                    return switch (method.getName()) {
                        case "doesBucketExist" -> {
                            bucketChecks++;
                            yield bucketExistence.getOrDefault(String.valueOf(args[0]), false);
                        }
                        case "shutdown" -> {
                            shutdownCalled = true;
                            yield null;
                        }
                        default -> defaultValue(method.getReturnType());
                    };
                }
            );
        }

        private static Object defaultValue(Class<?> returnType) {
            if (!returnType.isPrimitive()) {
                return null;
            }
            if (boolean.class.equals(returnType)) {
                return false;
            }
            if (char.class.equals(returnType)) {
                return '\0';
            }
            if (byte.class.equals(returnType)) {
                return (byte) 0;
            }
            if (short.class.equals(returnType)) {
                return (short) 0;
            }
            if (int.class.equals(returnType)) {
                return 0;
            }
            if (long.class.equals(returnType)) {
                return 0L;
            }
            if (float.class.equals(returnType)) {
                return 0F;
            }
            if (double.class.equals(returnType)) {
                return 0D;
            }
            return null;
        }
    }
}
