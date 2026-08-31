package io.github.shizuki.site.media.service.impl;

import io.github.shizuki.site.media.config.WallpaperWorkshopProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/** Maps Workshop metadata and server configuration to the channel import can actually attempt. */
@Component
public class WorkshopDownloadChannelResolver {

    private final WallpaperWorkshopProperties properties;

    public WorkshopDownloadChannelResolver(WallpaperWorkshopProperties properties) {
        this.properties = properties;
    }

    ChannelState resolve(boolean hasDirectDownload) {
        if (hasDirectDownload) {
            return new ChannelState("DIRECT", true, "可直接导入");
        }
        if (!properties.isEnabled()) {
            return unavailable("服务器未启用 SteamCMD");
        }
        if (!StringUtils.hasText(properties.getWorkshopAppId())) {
            return unavailable("服务器未配置 Workshop 应用");
        }
        if (!isCommandAvailable(properties.getSteamcmdPath())) {
            return unavailable("服务器未安装可用的 SteamCMD");
        }
        if (!StringUtils.hasText(properties.getSteamUsername())
                || !StringUtils.hasText(properties.getSteamPassword())) {
            return unavailable("服务器未配置 SteamCMD 账号");
        }
        return new ChannelState("STEAMCMD", true, "可通过 SteamCMD 导入");
    }

    boolean canRunSteamCmd() {
        return "STEAMCMD".equals(resolve(false).channel());
    }

    private ChannelState unavailable(String message) {
        return new ChannelState("UNAVAILABLE", false, message);
    }

    static boolean isCommandAvailable(String commandRaw) {
        String command = commandRaw == null ? "" : commandRaw.trim();
        if (!StringUtils.hasText(command)) {
            return false;
        }
        try {
            Path configured = Path.of(command);
            if (configured.isAbsolute() || command.contains("/") || command.contains("\\")) {
                return isExecutableFile(configured);
            }
        } catch (InvalidPathException exception) {
            return false;
        }
        String pathValue = System.getenv("PATH");
        if (!StringUtils.hasText(pathValue)) {
            return false;
        }
        for (String directory : pathValue.split(Patterns.PATH_SEPARATOR_REGEX)) {
            if (!StringUtils.hasText(directory)) {
                continue;
            }
            for (String candidate : commandCandidates(command)) {
                try {
                    if (isExecutableFile(Path.of(directory, candidate))) {
                        return true;
                    }
                } catch (InvalidPathException ignored) {
                    // Ignore malformed PATH entries and continue searching.
                }
            }
        }
        return false;
    }

    private static List<String> commandCandidates(String command) {
        List<String> candidates = new ArrayList<>();
        candidates.add(command);
        if (isWindows() && !command.contains(".")) {
            candidates.add(command + ".exe");
            candidates.add(command + ".cmd");
            candidates.add(command + ".bat");
        }
        return candidates;
    }

    private static boolean isExecutableFile(Path path) {
        return Files.isRegularFile(path) && (Files.isExecutable(path) || isWindows());
    }

    private static boolean isWindows() {
        return System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win");
    }

    record ChannelState(String channel, boolean available, String message) {
    }

    private static final class Patterns {

        private static final String PATH_SEPARATOR_REGEX = java.util.regex.Pattern.quote(File.pathSeparator);

        private Patterns() {
        }
    }
}
