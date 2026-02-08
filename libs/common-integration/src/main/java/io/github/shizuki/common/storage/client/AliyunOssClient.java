package io.github.shizuki.common.storage.client;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.HttpMethod;
import com.aliyun.oss.model.GeneratePresignedUrlRequest;
import com.aliyun.oss.model.ObjectMetadata;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class AliyunOssClient implements ObjectStorageClient {

    private final OssProperties ossProperties;

    public AliyunOssClient(OssProperties ossProperties) {
        this.ossProperties = ossProperties;
    }

    @Override
    public void putObject(String bucket, String key, InputStream inputStream, StorageObjectMetadata metadata) {
        OSS ossClient = createClient();
        try {
            ObjectMetadata objectMetadata = new ObjectMetadata();
            if (metadata != null) {
                objectMetadata.setContentType(metadata.getContentType());
                if (metadata.getContentLength() > 0) {
                    objectMetadata.setContentLength(metadata.getContentLength());
                }
            }
            ossClient.putObject(bucket, key, inputStream, objectMetadata);
        } finally {
            ossClient.shutdown();
        }
    }

    @Override
    public void deleteObject(String bucket, String key) {
        OSS ossClient = createClient();
        try {
            ossClient.deleteObject(bucket, key);
        } finally {
            ossClient.shutdown();
        }
    }

    @Override
    public String generateGetUrl(String bucket, String key, long expireSeconds) {
        return generatePresignedUrl(bucket, key, expireSeconds, HttpMethod.GET);
    }

    @Override
    public String generatePutUrl(String bucket, String key, long expireSeconds) {
        return generatePresignedUrl(bucket, key, expireSeconds, HttpMethod.PUT);
    }

    private String generatePresignedUrl(String bucket, String key, long expireSeconds, HttpMethod httpMethod) {
        OSS ossClient = createClient();
        try {
            Date expiration = new Date(System.currentTimeMillis() + Math.max(1, expireSeconds) * 1000L);
            GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucket, key, httpMethod);
            request.setExpiration(expiration);
            URL url = ossClient.generatePresignedUrl(request);
            return url.toString();
        } finally {
            ossClient.shutdown();
        }
    }

    private OSS createClient() {
        if (!StringUtils.hasText(ossProperties.getEndpoint())
            || !StringUtils.hasText(ossProperties.getAccessKeyId())
            || !StringUtils.hasText(ossProperties.getAccessKeySecret())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OSS config is missing");
        }
        return new OSSClientBuilder()
            .build(ossProperties.getEndpoint(), ossProperties.getAccessKeyId(), ossProperties.getAccessKeySecret());
    }
}
