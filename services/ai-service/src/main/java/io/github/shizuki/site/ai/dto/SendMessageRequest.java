package io.github.shizuki.site.ai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "发送 AI 消息请求")
public class SendMessageRequest {

    @NotBlank
    @Schema(description = "用户消息内容", example = "帮我讲解一下二分查找")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
