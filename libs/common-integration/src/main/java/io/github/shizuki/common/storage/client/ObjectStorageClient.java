package io.github.shizuki.common.storage.client;

import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import java.io.InputStream;

public interface ObjectStorageClient {

    void putObject(String bucket, String key, InputStream inputStream, StorageObjectMetadata metadata);

    void deleteObject(String bucket, String key);

    String generateGetUrl(String bucket, String key, long expireSeconds);

    String generatePutUrl(String bucket, String key, long expireSeconds);
}
