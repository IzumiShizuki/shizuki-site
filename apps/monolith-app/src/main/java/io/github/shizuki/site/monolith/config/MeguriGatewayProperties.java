package io.github.shizuki.site.monolith.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Configuration for the website-side Meguri gateway.
 *
 * <p>The monolith is the trusted server-side caller of the remote
 * {@code meguri-core} runtime: it injects the shared bearer token and the
 * {@code X-Meguri-*} identity headers, so neither the token nor the canonical
 * {@code meguri_user_id} ever reaches the browser. This mirrors the desktop
 * pet's local gateway ({@code apps/desktop-airi/src/web-server.mjs} in the
 * meguri-pet repository) and the Notion contract
 * “07｜AstrBot／桌宠／网站多端接入实施提示词”.</p>
 */
@Component
@ConfigurationProperties(prefix = "shizuki.meguri.gateway")
public class MeguriGatewayProperties {

    /** Master switch; when false every gateway endpoint except bootstrap fails closed. */
    private boolean enabled = false;

    /** Public HTTPS entry of the remote meguri-core, without a trailing slash. */
    private String baseUrl = "https://bot.shizuki.online/meguri-core";

    /** Inline bearer token for meguri-core. Prefer {@link #tokenFile} in production. */
    private String token = "";

    /** File containing the bearer token; wins over {@link #token} when readable. */
    private String tokenFile = "";

    /** Tenant forwarded as X-Meguri-Tenant-ID. */
    private String tenantId = "meguri-staging";

    /**
     * Canonical meguri user id bound to the site owner (ADMIN group). Using the
     * same id as the desktop pet / AstrBot binding keeps long-term memory shared
     * across all three clients.
     */
    private String ownerUserId = "local-airi-user";

    /** Website turns default to not writing formal long-term memory. */
    private boolean formalMemoryAllowed = false;

    /** Directory that contains the sprite PNG files (e.g. ce04001l.png). Empty disables sprites. */
    private String spriteDir = "";

    /** Sprite shown before the first semantic event arrives. */
    private String defaultSprite = "ce04001l.png";

    private long connectTimeoutMs = 3000;

    private long turnReadTimeoutMs = 30000;

    private long healthReadTimeoutMs = 2500;

    /** Upper bound for one user message forwarded to the core. */
    private int maxMessageLength = 4000;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getBaseUrl() {
        return normalizedBaseUrl();
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getToken() {
        return token == null ? "" : token.trim();
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenFile() {
        return tokenFile == null ? "" : tokenFile.trim();
    }

    public void setTokenFile(String tokenFile) {
        this.tokenFile = tokenFile;
    }

    public String getTenantId() {
        return tenantId == null ? "" : tenantId.trim();
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getOwnerUserId() {
        return ownerUserId == null ? "" : ownerUserId.trim();
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public boolean isFormalMemoryAllowed() {
        return formalMemoryAllowed;
    }

    public void setFormalMemoryAllowed(boolean formalMemoryAllowed) {
        this.formalMemoryAllowed = formalMemoryAllowed;
    }

    public String getSpriteDir() {
        return spriteDir == null ? "" : spriteDir.trim();
    }

    public void setSpriteDir(String spriteDir) {
        this.spriteDir = spriteDir;
    }

    public String getDefaultSprite() {
        return defaultSprite == null ? "" : defaultSprite.trim();
    }

    public void setDefaultSprite(String defaultSprite) {
        this.defaultSprite = defaultSprite;
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs > 0 ? connectTimeoutMs : 3000;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public long getTurnReadTimeoutMs() {
        return turnReadTimeoutMs > 0 ? turnReadTimeoutMs : 30000;
    }

    public void setTurnReadTimeoutMs(long turnReadTimeoutMs) {
        this.turnReadTimeoutMs = turnReadTimeoutMs;
    }

    public long getHealthReadTimeoutMs() {
        return healthReadTimeoutMs > 0 ? healthReadTimeoutMs : 2500;
    }

    public void setHealthReadTimeoutMs(long healthReadTimeoutMs) {
        this.healthReadTimeoutMs = healthReadTimeoutMs;
    }

    public int getMaxMessageLength() {
        return maxMessageLength > 0 ? maxMessageLength : 4000;
    }

    public void setMaxMessageLength(int maxMessageLength) {
        this.maxMessageLength = maxMessageLength;
    }

    private String normalizedBaseUrl() {
        if (!StringUtils.hasText(baseUrl)) {
            return "";
        }
        String trimmed = baseUrl.trim();
        while (trimmed.endsWith("/")) {
            trimmed = trimmed.substring(0, trimmed.length() - 1);
        }
        return trimmed;
    }
}
