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

    private String portalUrl = "https://ops.shizuki.online";
    private boolean enableMutations = false;
    private int connectTimeoutMs = 1200;
    private int readTimeoutMs = 5000;
    private List<String> allowedContainerNames = new ArrayList<>(List.of(
        "shizuki-site-backend",
        "shizuki-site-frontend",
        "shizuki-site-meting-api"
    ));
    private final Portainer portainer = new Portainer();

    public String getPortalUrl() {
        return portalUrl;
    }

    public void setPortalUrl(String portalUrl) {
        this.portalUrl = StringUtils.hasText(portalUrl) ? portalUrl.trim() : "https://ops.shizuki.online";
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

    public List<String> getAllowedContainerNames() {
        return allowedContainerNames;
    }

    public void setAllowedContainerNames(List<String> allowedContainerNames) {
        Set<String> normalized = new LinkedHashSet<>();
        if (allowedContainerNames != null) {
            for (String item : allowedContainerNames) {
                String value = normalizeContainerName(item);
                if (StringUtils.hasText(value)) {
                    normalized.add(value);
                }
            }
        }
        this.allowedContainerNames = new ArrayList<>(normalized);
    }

    public Portainer getPortainer() {
        return portainer;
    }

    public boolean isContainerAllowed(String containerName) {
        String normalized = normalizeContainerName(containerName);
        if (!StringUtils.hasText(normalized)) {
            return false;
        }
        if (allowedContainerNames == null || allowedContainerNames.isEmpty()) {
            return true;
        }
        return allowedContainerNames.stream().anyMatch(item -> item.equalsIgnoreCase(normalized));
    }

    public static String normalizeContainerName(String raw) {
        String value = StringUtils.hasText(raw) ? raw.trim() : "";
        while (value.startsWith("/")) {
            value = value.substring(1);
        }
        return value.toLowerCase(Locale.ROOT);
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
