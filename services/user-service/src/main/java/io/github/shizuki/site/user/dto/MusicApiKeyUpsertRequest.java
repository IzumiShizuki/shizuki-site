package io.github.shizuki.site.user.dto;

import jakarta.validation.constraints.NotBlank;

/**
 * 绑定/更新音乐 provider API Key 请求体。
 */
public class MusicApiKeyUpsertRequest {

    /**
     * 用户在前端输入的 provider API Key 明文。
     */
    @NotBlank
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
