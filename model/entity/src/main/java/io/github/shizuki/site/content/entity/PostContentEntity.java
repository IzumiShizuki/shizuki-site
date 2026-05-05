package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("CTN_POST_CONTENT")
public class PostContentEntity extends BaseEntity {

    @TableField("post_id")
    private Long postId;

    @TableField("content_mode")
    private String contentMode;

    @TableField("notion_blocks_json")
    private String notionBlocksJson;

    @TableField("markdown_cache")
    private String markdownCache;

    @TableField("content_hash")
    private String contentHash;

    @TableField("unsupported_block_flag")
    private Integer unsupportedBlockFlag;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getContentMode() {
        return contentMode;
    }

    public void setContentMode(String contentMode) {
        this.contentMode = contentMode;
    }

    public String getNotionBlocksJson() {
        return notionBlocksJson;
    }

    public void setNotionBlocksJson(String notionBlocksJson) {
        this.notionBlocksJson = notionBlocksJson;
    }

    public String getMarkdownCache() {
        return markdownCache;
    }

    public void setMarkdownCache(String markdownCache) {
        this.markdownCache = markdownCache;
    }

    public String getContentHash() {
        return contentHash;
    }

    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }

    public Integer getUnsupportedBlockFlag() {
        return unsupportedBlockFlag;
    }

    public void setUnsupportedBlockFlag(Integer unsupportedBlockFlag) {
        this.unsupportedBlockFlag = unsupportedBlockFlag;
    }
}
