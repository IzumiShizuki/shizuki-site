package io.github.shizuki.site.ai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "发送 AI 消息请求")
public class SendMessageRequest {

    @NotBlank
    @Schema(description = "用户消息内容", example = "帮我讲解一下二分查找")
    private String message;

    @Valid
    @Size(max = 40)
    @Schema(description = "前端维护的上下文消息列表，后端不持久化")
    private List<ContextMessage> context;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ContextMessage> getContext() {
        return context;
    }

    public void setContext(List<ContextMessage> context) {
        this.context = context;
    }

    @Schema(description = "上下文消息")
    public static class ContextMessage {

        @NotBlank
        @Schema(description = "角色，支持 user/assistant/system", example = "assistant")
        private String role;

        @NotBlank
        @Schema(description = "消息内容", example = "建议先复习时间复杂度" )
        private String content;

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
