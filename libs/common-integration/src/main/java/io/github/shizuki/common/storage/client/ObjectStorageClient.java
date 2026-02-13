package io.github.shizuki.common.storage.client;

import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import java.io.InputStream;

public interface ObjectStorageClient {

    void putObject(String bucket, String key, InputStream inputStream, StorageObjectMetadata metadata);

    void deleteObject(String bucket, String key);

    String generateGetUrl(String bucket, String key, long expireSeconds);

    String generatePutUrl(String bucket, String key, long expireSeconds);

    /**
     * 判断对象是否存在。
     */
    boolean objectExists(String bucket, String key);

    /**
     * 读取对象元数据（大小、内容类型、ETag 等）。
     */
    StorageObjectMetadata getObjectMetadata(String bucket, String key);

    /**
     * 以流方式读取对象内容，调用方负责关闭流。
     */
    InputStream getObjectStream(String bucket, String key);
}
