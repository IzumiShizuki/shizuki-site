package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;
import java.time.LocalDateTime;

@TableName("CTN_POST")
public class PostEntity extends BaseEntity {

    @TableField("post_num")
    private Long postNum;

    @TableField("user_id")
    private Long userId;

    @TableField("title_text")
    private String title;

    @TableField("summary_text")
    private String summary;

    @TableField("visibility_status")
    private String visibility;

    @TableField("status_code")
    private String statusCode;

    @TableField("category_code")
    private String categoryCode;

    @TableField("slug_code")
    private String slugCode;

    @TableField("cover_image_url")
    private String coverImageUrl;

    @TableField("md_bucket_name")
    private String markdownBucket;

    @TableField("md_object_key")
    private String markdownKey;

    @TableField("word_count")
    private Long wordCount;

    @TableField("line_count")
    private Long lineCount;

    @TableField("reading_minutes")
    private Integer readingMinutes;

    @TableField("published_time")
    private LocalDateTime publishedAt;

    @TableField("like_value")
    private Long likeCount;

    @TableField("notion_page_id")
    private String notionPageId;

    @TableField("notion_data_source_id")
    private String notionDataSourceId;

    @TableField("notion_last_edited_time")
    private LocalDateTime notionLastEditedTime;

    @TableField("sync_status_code")
    private String syncStatusCode;

    @TableField("sync_error_text")
    private String syncErrorText;

    @TableField("last_remote_pull_time")
    private LocalDateTime lastRemotePullTime;

    @TableField("last_remote_push_time")
    private LocalDateTime lastRemotePushTime;

    public Long getPostNum() {
        return postNum;
    }

    public void setPostNum(Long postNum) {
        this.postNum = postNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getSlugCode() {
        return slugCode;
    }

    public void setSlugCode(String slugCode) {
        this.slugCode = slugCode;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getMarkdownBucket() {
        return markdownBucket;
    }

    public void setMarkdownBucket(String markdownBucket) {
        this.markdownBucket = markdownBucket;
    }

    public String getMarkdownKey() {
        return markdownKey;
    }

    public void setMarkdownKey(String markdownKey) {
        this.markdownKey = markdownKey;
    }

    public Long getWordCount() {
        return wordCount;
    }

    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }

    public Long getLineCount() {
        return lineCount;
    }

    public void setLineCount(Long lineCount) {
        this.lineCount = lineCount;
    }

    public Integer getReadingMinutes() {
        return readingMinutes;
    }

    public void setReadingMinutes(Integer readingMinutes) {
        this.readingMinutes = readingMinutes;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public String getNotionPageId() {
        return notionPageId;
    }

    public void setNotionPageId(String notionPageId) {
        this.notionPageId = notionPageId;
    }

    public String getNotionDataSourceId() {
        return notionDataSourceId;
    }

    public void setNotionDataSourceId(String notionDataSourceId) {
        this.notionDataSourceId = notionDataSourceId;
    }

    public LocalDateTime getNotionLastEditedTime() {
        return notionLastEditedTime;
    }

    public void setNotionLastEditedTime(LocalDateTime notionLastEditedTime) {
        this.notionLastEditedTime = notionLastEditedTime;
    }

    public String getSyncStatusCode() {
        return syncStatusCode;
    }

    public void setSyncStatusCode(String syncStatusCode) {
        this.syncStatusCode = syncStatusCode;
    }

    public String getSyncErrorText() {
        return syncErrorText;
    }

    public void setSyncErrorText(String syncErrorText) {
        this.syncErrorText = syncErrorText;
    }

    public LocalDateTime getLastRemotePullTime() {
        return lastRemotePullTime;
    }

    public void setLastRemotePullTime(LocalDateTime lastRemotePullTime) {
        this.lastRemotePullTime = lastRemotePullTime;
    }

    public LocalDateTime getLastRemotePushTime() {
        return lastRemotePushTime;
    }

    public void setLastRemotePushTime(LocalDateTime lastRemotePushTime) {
        this.lastRemotePushTime = lastRemotePushTime;
    }

}
