package io.github.shizuki.site.content.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.Set;

public class AuthorPostUpsertRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String summary;

    @NotBlank
    private String categoryCode;

    private String slugCode;

    private String coverImageUrl;

    @NotBlank
    private String visibility;

    private Set<String> allowedGroupCodes;

    private Set<String> tags;

    @NotBlank
    private String markdownBucket;

    @NotBlank
    private String markdownKey;

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

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Set<String> getAllowedGroupCodes() {
        return allowedGroupCodes;
    }

    public void setAllowedGroupCodes(Set<String> allowedGroupCodes) {
        this.allowedGroupCodes = allowedGroupCodes;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
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
}
