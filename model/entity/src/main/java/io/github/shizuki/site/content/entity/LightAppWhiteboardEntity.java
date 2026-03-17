package io.github.shizuki.site.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.github.shizuki.common.core.model.BaseEntity;

@TableName("CTN_LA_WHITEBOARD")
public class LightAppWhiteboardEntity extends BaseEntity {

    @TableField("user_id")
    private Long userId;

    @TableField("title_text")
    private String title;

    @TableField("board_kind_code")
    private String boardKindCode;

    @TableField("document_json")
    private String documentJson;

    @TableField("thumbnail_asset_id")
    private Long thumbnailAssetId;

    @TableField("sort_num")
    private Integer sortNum;

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

    public String getBoardKindCode() {
        return boardKindCode;
    }

    public void setBoardKindCode(String boardKindCode) {
        this.boardKindCode = boardKindCode;
    }

    public String getDocumentJson() {
        return documentJson;
    }

    public void setDocumentJson(String documentJson) {
        this.documentJson = documentJson;
    }

    public Long getThumbnailAssetId() {
        return thumbnailAssetId;
    }

    public void setThumbnailAssetId(Long thumbnailAssetId) {
        this.thumbnailAssetId = thumbnailAssetId;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }
}
