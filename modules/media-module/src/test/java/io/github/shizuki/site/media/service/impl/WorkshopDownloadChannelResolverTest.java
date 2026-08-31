package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.site.media.config.WallpaperWorkshopProperties;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WorkshopDownloadChannelResolverTest {

    @Test
    void directDownloadHasPriority() {
        WorkshopDownloadChannelResolver.ChannelState state = resolver(new WallpaperWorkshopProperties()).resolve(true);

        assertEquals("DIRECT", state.channel());
        assertTrue(state.available());
    }

    @Test
    void reportsSteamCmdOnlyWhenExecutableAndCredentialsAreReady() {
        WallpaperWorkshopProperties properties = new WallpaperWorkshopProperties();
        properties.setEnabled(true);
        properties.setWorkshopAppId("431960");
        properties.setSteamcmdPath(javaExecutable());
        properties.setSteamUsername("configured-user");
        properties.setSteamPassword("configured-password");

        WorkshopDownloadChannelResolver.ChannelState state = resolver(properties).resolve(false);

        assertEquals("STEAMCMD", state.channel());
        assertTrue(state.available());
    }

    @Test
    void reportsUnavailableWhenSteamCmdAccountIsMissing() {
        WallpaperWorkshopProperties properties = new WallpaperWorkshopProperties();
        properties.setEnabled(true);
        properties.setWorkshopAppId("431960");
        properties.setSteamcmdPath(javaExecutable());

        WorkshopDownloadChannelResolver.ChannelState state = resolver(properties).resolve(false);

        assertEquals("UNAVAILABLE", state.channel());
        assertFalse(state.available());
        assertTrue(state.message().contains("账号"));
    }

    private WorkshopDownloadChannelResolver resolver(WallpaperWorkshopProperties properties) {
        return new WorkshopDownloadChannelResolver(properties);
    }

    private String javaExecutable() {
        String executable = System.getProperty("os.name", "").toLowerCase().contains("win") ? "java.exe" : "java";
        return Path.of(System.getProperty("java.home"), "bin", executable).toString();
    }
}
