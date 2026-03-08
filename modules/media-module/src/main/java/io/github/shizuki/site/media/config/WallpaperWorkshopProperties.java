package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Workshop 半直连配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.media.wallpaper.workshop")
public class WallpaperWorkshopProperties {

    private boolean enabled = false;
    private String steamcmdPath = "steamcmd";
    private String steamUsername;
    private String steamPassword;
    private String workshopAppId = "431960";
    private String downloadRoot = "/tmp/steam-workshop";
    private long commandTimeoutSeconds = 180L;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSteamcmdPath() {
        return steamcmdPath;
    }

    public void setSteamcmdPath(String steamcmdPath) {
        this.steamcmdPath = steamcmdPath;
    }

    public String getSteamUsername() {
        return steamUsername;
    }

    public void setSteamUsername(String steamUsername) {
        this.steamUsername = steamUsername;
    }

    public String getSteamPassword() {
        return steamPassword;
    }

    public void setSteamPassword(String steamPassword) {
        this.steamPassword = steamPassword;
    }

    public String getWorkshopAppId() {
        return workshopAppId;
    }

    public void setWorkshopAppId(String workshopAppId) {
        this.workshopAppId = workshopAppId;
    }

    public String getDownloadRoot() {
        return downloadRoot;
    }

    public void setDownloadRoot(String downloadRoot) {
        this.downloadRoot = downloadRoot;
    }

    public long getCommandTimeoutSeconds() {
        return commandTimeoutSeconds;
    }

    public void setCommandTimeoutSeconds(long commandTimeoutSeconds) {
        this.commandTimeoutSeconds = commandTimeoutSeconds;
    }
}
