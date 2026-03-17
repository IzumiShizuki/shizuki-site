package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "轻应用画板创建/更新请求")
public class LightAppWhiteboardUpsertRequest {

    @NotBlank
    @Size(max = 200)
    @Schema(description = "画板标题")
    private String title;

    @Size(max = 32)
    @Schema(description = "画板类型 DRAWING/FLOWCHART/MINDMAP")
    private String boardKind;

    @NotBlank
    @Size(max = 2000000)
    @Schema(description = "画板文档JSON")
    private String documentJson;

    @Schema(description = "缩略图资产ID")
    private Long thumbnailAssetId;

    @Schema(description = "排序值")
    private Integer sortNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBoardKind() {
        return boardKind;
    }

    public void setBoardKind(String boardKind) {
        this.boardKind = boardKind;
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
