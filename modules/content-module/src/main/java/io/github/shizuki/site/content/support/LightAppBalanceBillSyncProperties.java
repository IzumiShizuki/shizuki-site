package io.github.shizuki.site.content.support;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.light-app.balance.bill-sync")
public class LightAppBalanceBillSyncProperties {

    private boolean enabled = false;
    private String apiBaseUrl = "http://127.0.0.1:39031";
    private String apiToken = "";
    private String storageStateEncryptionKey = "";
    private int bindSessionTtlMinutes = 10;
    private String nightlyCron = "0 0 0 * * *";
    private String timezone = "Asia/Shanghai";
    private int initialLookbackHours = 36;
    private int resyncLookbackHours = 48;
    private long connectTimeoutMs = 2000L;
    private long readTimeoutMs = 120000L;
    private String rawArchiveRoot = "./data/lightapp-balance-sync";

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getStorageStateEncryptionKey() {
        return storageStateEncryptionKey;
    }

    public void setStorageStateEncryptionKey(String storageStateEncryptionKey) {
        this.storageStateEncryptionKey = storageStateEncryptionKey;
    }

    public int getBindSessionTtlMinutes() {
        return bindSessionTtlMinutes;
    }

    public void setBindSessionTtlMinutes(int bindSessionTtlMinutes) {
        this.bindSessionTtlMinutes = Math.max(1, bindSessionTtlMinutes);
    }

    public String getNightlyCron() {
        return nightlyCron;
    }

    public void setNightlyCron(String nightlyCron) {
        this.nightlyCron = nightlyCron;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getInitialLookbackHours() {
        return initialLookbackHours;
    }

    public void setInitialLookbackHours(int initialLookbackHours) {
        this.initialLookbackHours = Math.max(1, initialLookbackHours);
    }

    public int getResyncLookbackHours() {
        return resyncLookbackHours;
    }

    public void setResyncLookbackHours(int resyncLookbackHours) {
        this.resyncLookbackHours = Math.max(1, resyncLookbackHours);
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(200L, connectTimeoutMs);
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = Math.max(1000L, readTimeoutMs);
    }

    public String getRawArchiveRoot() {
        return rawArchiveRoot;
    }

    public void setRawArchiveRoot(String rawArchiveRoot) {
        this.rawArchiveRoot = rawArchiveRoot;
    }

    public boolean isConfigured() {
        return enabled
            && apiBaseUrl != null
            && !apiBaseUrl.trim().isEmpty();
    }
}
