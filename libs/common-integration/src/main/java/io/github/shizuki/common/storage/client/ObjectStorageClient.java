package io.github.shizuki.common.storage.client;

import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import java.io.InputStream;
import java.util.List;

public interface ObjectStorageClient {

    void putObject(String bucket, String key, InputStream inputStream, StorageObjectMetadata metadata);

    void deleteObject(String bucket, String key);

    String generateGetUrl(String bucket, String key, long expireSeconds);

    String generatePutUrl(String bucket, String key, long expireSeconds);

    /**
     * 为私有源对象生成带 OSS 图片处理参数的短时 GET 签名地址。
     *
     * @param bucket 私有 bucket
     * @param key 私有对象键
     * @param operations 图片处理操作（不含 image/ 前缀）
     * @param expireSeconds 有效秒数
     * @return 短时签名地址
     */
    String generateProcessedGetUrl(String bucket, String key, List<String> operations, long expireSeconds);

    /**
     * 使用 OSS {@code sys/saveas} 将处理后的派生保存为新对象。
     *
     * @param sourceBucket 源 bucket
     * @param sourceKey 源对象键
     * @param destinationBucket 目标 bucket
     * @param destinationKey 目标对象键
     * @param operations 图片处理操作（不含 image/ 前缀）
     */
    void saveProcessedObject(
        String sourceBucket,
        String sourceKey,
        String destinationBucket,
        String destinationKey,
        List<String> operations
    );

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
