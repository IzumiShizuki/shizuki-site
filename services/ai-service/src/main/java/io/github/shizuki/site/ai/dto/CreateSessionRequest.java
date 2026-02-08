package io.github.shizuki.site.ai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "创建 AI 会话请求")
public class CreateSessionRequest {

    @NotBlank
    @Schema(description = "会话标题", example = "算法面试训练")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
