package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 音乐选歌请求。
 */
@Schema(description = "音乐选歌请求")
public class MusicPickRequest {

    @Schema(description = "Provider 编码", example = "tunehub")
    private String provider;

    @Schema(description = "搜索关键字", example = "晴天")
    private String query;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
