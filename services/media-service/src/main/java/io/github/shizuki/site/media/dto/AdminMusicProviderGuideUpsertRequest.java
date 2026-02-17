package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 管理员更新 Provider 引导请求。
 */
@Schema(description = "管理员更新 Provider 引导请求")
public class AdminMusicProviderGuideUpsertRequest {

    @Schema(description = "引导标题")
    private String title;

    @Schema(description = "引导内容")
    private String content;

    @Schema(description = "引导链接")
    private String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
