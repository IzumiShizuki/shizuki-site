package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_POST_PRESENTATION")
public class PostPresentationEntity extends BaseEntity {

    @TableField("post_id")
    private Long postId;

    @TableField("status_code")
    private String statusCode;

    @TableField("slidev_bucket_name")
    private String slidevBucket;

    @TableField("slidev_object_key")
    private String slidevKey;

    @TableField("ppt_bucket_name")
    private String pptBucket;

    @TableField("ppt_object_key")
    private String pptKey;

    @TableField("slide_count")
    private Integer slideCount;

    @TableField("template_version")
    private String templateVersion;

    @TableField("error_text")
    private String errorText;

    @TableField("generated_time")
    private LocalDateTime generatedAt;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getSlidevBucket() {
        return slidevBucket;
    }

    public void setSlidevBucket(String slidevBucket) {
        this.slidevBucket = slidevBucket;
    }

    public String getSlidevKey() {
        return slidevKey;
    }

    public void setSlidevKey(String slidevKey) {
        this.slidevKey = slidevKey;
    }

    public String getPptBucket() {
        return pptBucket;
    }

    public void setPptBucket(String pptBucket) {
        this.pptBucket = pptBucket;
    }

    public String getPptKey() {
        return pptKey;
    }

    public void setPptKey(String pptKey) {
        this.pptKey = pptKey;
    }

    public Integer getSlideCount() {
        return slideCount;
    }

    public void setSlideCount(Integer slideCount) {
        this.slideCount = slideCount;
    }

    public String getTemplateVersion() {
        return templateVersion;
    }

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }
}
