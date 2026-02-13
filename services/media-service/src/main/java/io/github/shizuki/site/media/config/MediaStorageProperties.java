package io.github.shizuki.site.media.config;

import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 媒体存储配置。
 *
 * <p>包含上传签名、公开/私有桶映射、MIME 白名单以及 L2D ZIP 校验阈值。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.media.storage")
public class MediaStorageProperties {

    /**
     * 私有资源桶。
     */
    private String privateBucket = "shizuki-private";
    /**
     * 公开资源桶。
     */
    private String publicBucket = "shizuki-public";
    /**
     * 公开访问基础地址（可选，优先级高于 endpoint 推导）。
     */
    private String publicBaseUrl;
    /**
     * 签名地址默认有效期（秒）。
     */
    private long signExpireSeconds = 600L;
    /**
     * 单文件上传大小上限（字节）。
     */
    private long maxUploadSize = 50 * 1024 * 1024L;
    /**
     * L2D ZIP entry 最大数量。
     */
    private int maxL2dZipEntryCount = 2048;
    /**
     * L2D ZIP entry 文件名最大长度。
     */
    private int maxL2dZipEntryNameLength = 1024;
    /**
     * L2D ZIP 单 entry 最大体积（字节）。
     */
    private long maxL2dZipSingleEntrySize = 20L * 1024L * 1024L;
    /**
     * L2D ZIP 总解压大小上限（字节）。
     */
    private long maxL2dZipTotalSize = 100L * 1024L * 1024L;
    /**
     * 是否启用“同用户 + object_hash”去重。
     */
    private boolean enableObjectHashDedup = true;
    /**
     * 是否启用安全扫描钩子（一期仅写入 PENDING 状态占位）。
     */
    private boolean enableSecurityScanHook = false;
    /**
     * 上传 MIME 白名单。
     */
    private Set<String> allowedContentTypes = new HashSet<>();

    public String getPrivateBucket() {
        return privateBucket;
    }

    public void setPrivateBucket(String privateBucket) {
        this.privateBucket = privateBucket;
    }

    public String getPublicBucket() {
        return publicBucket;
    }

    public void setPublicBucket(String publicBucket) {
        this.publicBucket = publicBucket;
    }

    public String getPublicBaseUrl() {
        return publicBaseUrl;
    }

    public void setPublicBaseUrl(String publicBaseUrl) {
        this.publicBaseUrl = publicBaseUrl;
    }

    public long getSignExpireSeconds() {
        return signExpireSeconds;
    }

    public void setSignExpireSeconds(long signExpireSeconds) {
        this.signExpireSeconds = signExpireSeconds;
    }

    public long getMaxUploadSize() {
        return maxUploadSize;
    }

    public void setMaxUploadSize(long maxUploadSize) {
        this.maxUploadSize = maxUploadSize;
    }

    public Set<String> getAllowedContentTypes() {
        return allowedContentTypes;
    }

    public void setAllowedContentTypes(Set<String> allowedContentTypes) {
        this.allowedContentTypes = allowedContentTypes;
    }

    public int getMaxL2dZipEntryCount() {
        return maxL2dZipEntryCount;
    }

    public void setMaxL2dZipEntryCount(int maxL2dZipEntryCount) {
        this.maxL2dZipEntryCount = maxL2dZipEntryCount;
    }

    public int getMaxL2dZipEntryNameLength() {
        return maxL2dZipEntryNameLength;
    }

    public void setMaxL2dZipEntryNameLength(int maxL2dZipEntryNameLength) {
        this.maxL2dZipEntryNameLength = maxL2dZipEntryNameLength;
    }

    public long getMaxL2dZipSingleEntrySize() {
        return maxL2dZipSingleEntrySize;
    }

    public void setMaxL2dZipSingleEntrySize(long maxL2dZipSingleEntrySize) {
        this.maxL2dZipSingleEntrySize = maxL2dZipSingleEntrySize;
    }

    public long getMaxL2dZipTotalSize() {
        return maxL2dZipTotalSize;
    }

    public void setMaxL2dZipTotalSize(long maxL2dZipTotalSize) {
        this.maxL2dZipTotalSize = maxL2dZipTotalSize;
    }

    public boolean isEnableObjectHashDedup() {
        return enableObjectHashDedup;
    }

    public void setEnableObjectHashDedup(boolean enableObjectHashDedup) {
        this.enableObjectHashDedup = enableObjectHashDedup;
    }

    public boolean isEnableSecurityScanHook() {
        return enableSecurityScanHook;
    }

    public void setEnableSecurityScanHook(boolean enableSecurityScanHook) {
        this.enableSecurityScanHook = enableSecurityScanHook;
    }
}
