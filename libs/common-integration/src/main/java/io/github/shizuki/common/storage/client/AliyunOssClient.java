package io.github.shizuki.common.storage.client;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.HttpMethod;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.GeneratePresignedUrlRequest;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.ObjectMetadata;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.storage.config.OssProperties;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import java.io.FilterInputStream;
import java.io.IOException;
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

    @Override
    public boolean objectExists(String bucket, String key) {
        OSS ossClient = createClient();
        try {
            return ossClient.doesObjectExist(bucket, key);
        } finally {
            ossClient.shutdown();
        }
    }

    @Override
    public StorageObjectMetadata getObjectMetadata(String bucket, String key) {
        OSS ossClient = createClient();
        try {
            ObjectMetadata metadata = ossClient.getObjectMetadata(bucket, key);
            StorageObjectMetadata result = new StorageObjectMetadata();
            result.setContentType(metadata.getContentType());
            result.setContentLength(metadata.getContentLength());
            result.setEtag(metadata.getETag());
            return result;
        } catch (OSSException exception) {
            int statusCode = exception.getStatusCode();
            if (statusCode == 404) {
                throw new BusinessException(ErrorCode.NOT_FOUND, "OSS object metadata not found");
            }
            if (statusCode >= 500) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "OSS service unavailable");
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Read OSS object metadata failed");
        } catch (ClientException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "OSS metadata request failed");
        } catch (Exception exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Unexpected error while reading OSS metadata");
        } finally {
            ossClient.shutdown();
        }
    }

    @Override
    public InputStream getObjectStream(String bucket, String key) {
        OSS ossClient = createClient();
        try {
            OSSObject object = ossClient.getObject(bucket, key);
            InputStream objectContent = object.getObjectContent();
            // 返回可关闭的流包装器，确保调用方 close 时释放 OSSObject 与客户端连接。
            return new FilterInputStream(objectContent) {
                @Override
                public void close() throws IOException {
                    IOException closeException = null;
                    try {
                        super.close();
                    } catch (IOException exception) {
                        closeException = exception;
                    } finally {
                        try {
                            object.close();
                        } catch (Exception ignored) {
                        }
                        ossClient.shutdown();
                    }
                    if (closeException != null) {
                        throw closeException;
                    }
                }
            };
        } catch (Exception exception) {
            ossClient.shutdown();
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Read OSS object failed");
        }
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
