package io.github.shizuki.common.storage.model;

public class StorageObjectMetadata {

    private String contentType;
    private long contentLength;
    /**
     * 对象 ETag（通常可作为内容指纹使用）。
     */
    private String etag;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}
