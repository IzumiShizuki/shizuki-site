package io.github.shizuki.site.monolith.config;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@ConfigurationProperties(prefix = "shizuki.admin.ops")
public class AdminOpsProperties {

    private String portalUrl = "https://panel.shizuki.online/";
    private boolean enableMutations = false;
    private int connectTimeoutMs = 1200;
    private int readTimeoutMs = 5000;
    private List<String> visibleContainerNames = new ArrayList<>();
    private List<String> allowedContainerNames = new ArrayList<>(List.of(
        "shizuki-site-backend",
        "shizuki-site-frontend",
        "shizuki-site-meting-api"
    ));
    private final Docker docker = new Docker();
    private final Portainer portainer = new Portainer();

    public String getPortalUrl() {
        return portalUrl;
    }

    public void setPortalUrl(String portalUrl) {
        this.portalUrl = StringUtils.hasText(portalUrl) ? portalUrl.trim() : "https://panel.shizuki.online/";
    }

    public boolean isEnableMutations() {
        return enableMutations;
    }

    public void setEnableMutations(boolean enableMutations) {
        this.enableMutations = enableMutations;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(int connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(100, connectTimeoutMs);
    }

    public int getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(int readTimeoutMs) {
        this.readTimeoutMs = Math.max(200, readTimeoutMs);
    }

    public List<String> getVisibleContainerNames() {
        return visibleContainerNames;
    }

    public void setVisibleContainerNames(List<String> visibleContainerNames) {
        this.visibleContainerNames = normalizeContainerNameList(visibleContainerNames);
    }

    public List<String> getAllowedContainerNames() {
        return allowedContainerNames;
    }

    public void setAllowedContainerNames(List<String> allowedContainerNames) {
        this.allowedContainerNames = normalizeContainerNameList(allowedContainerNames);
    }

    public Docker getDocker() {
        return docker;
    }

    public Portainer getPortainer() {
        return portainer;
    }

    public boolean isContainerVisible(String containerName) {
        String normalized = normalizeContainerName(containerName);
        if (!StringUtils.hasText(normalized)) {
            return false;
        }
        if (visibleContainerNames == null || visibleContainerNames.isEmpty()) {
            return true;
        }
        return visibleContainerNames.stream().anyMatch(item -> item.equalsIgnoreCase(normalized));
    }

    public boolean isContainerManageable(String containerName) {
        String normalized = normalizeContainerName(containerName);
        if (!StringUtils.hasText(normalized)) {
            return false;
        }
        if (allowedContainerNames == null || allowedContainerNames.isEmpty()) {
            return true;
        }
        return allowedContainerNames.stream().anyMatch(item -> item.equalsIgnoreCase(normalized));
    }

    public boolean isContainerAllowed(String containerName) {
        return isContainerManageable(containerName);
    }

    public static String normalizeContainerName(String raw) {
        String value = StringUtils.hasText(raw) ? raw.trim() : "";
        while (value.startsWith("/")) {
            value = value.substring(1);
        }
        return value.toLowerCase(Locale.ROOT);
    }

    private List<String> normalizeContainerNameList(List<String> containerNames) {
        Set<String> normalized = new LinkedHashSet<>();
        if (containerNames != null) {
            for (String item : containerNames) {
                String value = normalizeContainerName(item);
                if (StringUtils.hasText(value)) {
                    normalized.add(value);
                }
            }
        }
        return new ArrayList<>(normalized);
    }

    public static class Docker {
        private String socketPath = "/var/run/docker.sock";

        public String getSocketPath() {
            return socketPath;
        }

        public void setSocketPath(String socketPath) {
            this.socketPath = StringUtils.hasText(socketPath) ? socketPath.trim() : "/var/run/docker.sock";
        }
    }

    public static class Portainer {
        private String baseUrl = "";
        private String apiKey = "";
        private long endpointId = 1L;

        public String getBaseUrl() {
            return baseUrl;
        }

        public void setBaseUrl(String baseUrl) {
            String normalized = StringUtils.hasText(baseUrl) ? baseUrl.trim() : "";
            while (normalized.endsWith("/")) {
                normalized = normalized.substring(0, normalized.length() - 1);
            }
            this.baseUrl = normalized;
        }

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = StringUtils.hasText(apiKey) ? apiKey.trim() : "";
        }

        public long getEndpointId() {
            return endpointId;
        }

        public void setEndpointId(long endpointId) {
            this.endpointId = Math.max(0L, endpointId);
        }
    }
}
