package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 壁纸在线发现（内嵌浏览）配置：
 * - Steam 创意工坊搜索代理（优先 Steam Web API，缺省回退社区页抓取）
 * - Wallhaven 搜索与拉取
 */
@Component
@ConfigurationProperties(prefix = "shizuki.media.wallpaper.discovery")
public class WallpaperDiscoveryProperties {

    /** 是否开放在线发现接口（搜索代理与 Wallhaven 导入）。 */
    private boolean enabled = true;

    /** steamcommunity 浏览页基地址，可替换为镜像/反代地址。 */
    private String workshopBrowseBaseUrl = "https://steamcommunity.com";

    /** Steam Web API 基地址。 */
    private String steamApiBaseUrl = "https://api.steampowered.com";

    /** Steam Web API Key（配置后搜索走 IPublishedFileService/QueryFiles，更稳定）。 */
    private String steamApiKey = "";

    /** Wallhaven 基地址，可替换为镜像/反代地址。 */
    private String wallhavenBaseUrl = "https://wallhaven.cc";

    /** Wallhaven API Key（可选，用于 NSFW 过滤级别与更高配额）。 */
    private String wallhavenApiKey = "";

    /** 上游请求超时（秒）。 */
    private long requestTimeoutSeconds = 15;

    /** 搜索每页条数。 */
    private int pageSize = 24;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getWorkshopBrowseBaseUrl() {
        return workshopBrowseBaseUrl;
    }

    public void setWorkshopBrowseBaseUrl(String workshopBrowseBaseUrl) {
        this.workshopBrowseBaseUrl = workshopBrowseBaseUrl;
    }

    public String getSteamApiBaseUrl() {
        return steamApiBaseUrl;
    }

    public void setSteamApiBaseUrl(String steamApiBaseUrl) {
        this.steamApiBaseUrl = steamApiBaseUrl;
    }

    public String getSteamApiKey() {
        return steamApiKey;
    }

    public void setSteamApiKey(String steamApiKey) {
        this.steamApiKey = steamApiKey;
    }

    public String getWallhavenBaseUrl() {
        return wallhavenBaseUrl;
    }

    public void setWallhavenBaseUrl(String wallhavenBaseUrl) {
        this.wallhavenBaseUrl = wallhavenBaseUrl;
    }

    public String getWallhavenApiKey() {
        return wallhavenApiKey;
    }

    public void setWallhavenApiKey(String wallhavenApiKey) {
        this.wallhavenApiKey = wallhavenApiKey;
    }

    public long getRequestTimeoutSeconds() {
        return requestTimeoutSeconds;
    }

    public void setRequestTimeoutSeconds(long requestTimeoutSeconds) {
        this.requestTimeoutSeconds = requestTimeoutSeconds;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
