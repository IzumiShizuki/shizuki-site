package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;

/** Curated local quote with source provenance and review state. */
@TableName(value = "CTN_QUOTE", autoResultMap = true)
public class QuoteEntity extends BaseEntity {

    @TableField("quote_text")
    private String text;

    @TableField("author_text")
    private String author;

    @TableField("source_title")
    private String sourceTitle;

    @TableField("category_code")
    private String categoryCode;

    @TableField("provider_code")
    private String providerCode;

    @TableField("provider_uuid")
    private String providerUuid;

    @TableField("source_url")
    private String sourceUrl;

    @TableField("approval_status")
    private String approvalStatus;

    @TableField(value = "enabled_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean enabled;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderUuid() {
        return providerUuid;
    }

    public void setProviderUuid(String providerUuid) {
        this.providerUuid = providerUuid;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
