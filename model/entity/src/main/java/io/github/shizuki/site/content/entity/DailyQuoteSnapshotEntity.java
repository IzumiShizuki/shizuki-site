package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import io.github.shizuki.site.common.mybatis.SmallIntBooleanTypeHandler;
import java.time.LocalDate;
import java.time.LocalDateTime;

/** Immutable canonical quote snapshot for one site-local date. */
@TableName(value = "CTN_DAILY_QUOTE_SNAPSHOT", autoResultMap = true)
public class DailyQuoteSnapshotEntity extends BaseEntity {

    @TableField("quote_date")
    private LocalDate quoteDate;

    @TableField("quote_id")
    private Long quoteId;

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

    @TableField(value = "stale_flag", typeHandler = SmallIntBooleanTypeHandler.class)
    private Boolean stale;

    @TableField("fetched_at")
    private LocalDateTime fetchedAt;

    public LocalDate getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(LocalDate quoteDate) {
        this.quoteDate = quoteDate;
    }

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

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

    public Boolean getStale() {
        return stale;
    }

    public void setStale(Boolean stale) {
        this.stale = stale;
    }

    public LocalDateTime getFetchedAt() {
        return fetchedAt;
    }

    public void setFetchedAt(LocalDateTime fetchedAt) {
        this.fetchedAt = fetchedAt;
    }
}
