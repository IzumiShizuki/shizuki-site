package io.github.shizuki.site.monolith.ops;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;

@Component
public class PortainerClient {

    private final AdminOpsProperties properties;
    private final PortainerTransport transport;
    private final ObjectMapper objectMapper;

    public PortainerClient(AdminOpsProperties properties, PortainerTransport transport, ObjectMapper objectMapper) {
        this.properties = properties;
        this.transport = transport;
        this.objectMapper = objectMapper;
    }

    public boolean isConfigured() {
        AdminOpsProperties.Portainer portainer = properties.getPortainer();
        return StringUtils.hasText(portainer.getBaseUrl())
            && StringUtils.hasText(portainer.getApiKey())
            && portainer.getEndpointId() > 0;
    }

    public List<ContainerSnapshot> listContainers() {
        ensureConfigured();
        String url = buildUrl("/api/endpoints/" + properties.getPortainer().getEndpointId() + "/docker/containers/json?all=true");
        String body = requestGet(url);
        try {
            List<Map<String, Object>> payload = objectMapper.readValue(body, new TypeReference<>() {
            });
            List<ContainerSnapshot> result = new ArrayList<>();
            for (Map<String, Object> item : payload) {
                result.add(toContainerSnapshot(item));
            }
            return result;
        } catch (Exception ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Portainer response parse failed",
                Map.of("reason", sanitizeMessage(ex.getMessage()))
            );
        }
    }

    public void invokeContainerAction(String containerId, String action) {
        ensureConfigured();
        String normalizedContainerId = readString(containerId, "");
        String normalizedAction = readString(action, "").toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalizedContainerId) || !StringUtils.hasText(normalizedAction)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "containerId and action are required");
        }
        String encodedContainerId = URLEncoder.encode(normalizedContainerId, StandardCharsets.UTF_8);
        String suffix = ("stop".equals(normalizedAction) || "restart".equals(normalizedAction)) ? "?t=10" : "";
        String url = buildUrl("/api/endpoints/" + properties.getPortainer().getEndpointId()
            + "/docker/containers/" + encodedContainerId + "/" + normalizedAction + suffix);
        requestPost(url);
    }

    private ContainerSnapshot toContainerSnapshot(Map<String, Object> row) {
        String id = readString(row.get("Id"), "");
        List<String> names = toStringList(row.get("Names"));
        String rawName = names.isEmpty() ? "" : names.get(0);
        String name = rawName.startsWith("/") ? rawName.substring(1) : rawName;
        String image = readString(row.get("Image"), "");
        String state = readString(row.get("State"), "").toLowerCase(Locale.ROOT);
        String status = readString(row.get("Status"), "");
        List<PortBinding> ports = toPortBindings(row.get("Ports"));
        return new ContainerSnapshot(id, name, image, state, status, ports);
    }

    private String requestGet(String url) {
        try {
            return transport.get(url, properties.getPortainer().getApiKey());
        } catch (RestClientResponseException ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Portainer request failed",
                Map.of("upstream_status", ex.getStatusCode().value(), "reason", sanitizeMessage(ex.getMessage()))
            );
        } catch (ResourceAccessException ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Portainer request timeout",
                Map.of("reason", sanitizeMessage(ex.getMessage()))
            );
        }
    }

    private void requestPost(String url) {
        try {
            transport.post(url, properties.getPortainer().getApiKey());
        } catch (RestClientResponseException ex) {
            if (ex.getStatusCode().value() == 404) {
                throw new BusinessException(ErrorCode.NOT_FOUND, "Portainer container endpoint not found");
            }
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Portainer action failed",
                Map.of("upstream_status", ex.getStatusCode().value(), "reason", sanitizeMessage(ex.getMessage()))
            );
        } catch (ResourceAccessException ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Portainer action timeout",
                Map.of("reason", sanitizeMessage(ex.getMessage()))
            );
        }
    }

    private void ensureConfigured() {
        if (isConfigured()) {
            return;
        }
        throw new BusinessException(ErrorCode.BAD_REQUEST, "Portainer integration is not configured");
    }

    private String buildUrl(String pathWithQuery) {
        String base = properties.getPortainer().getBaseUrl();
        if (pathWithQuery.startsWith("/")) {
            return base + pathWithQuery;
        }
        return base + "/" + pathWithQuery;
    }

    private List<PortBinding> toPortBindings(Object value) {
        if (!(value instanceof List<?> rows)) {
            return List.of();
        }
        List<PortBinding> ports = new ArrayList<>();
        for (Object row : rows) {
            if (!(row instanceof Map<?, ?> map)) {
                continue;
            }
            Map<String, Object> normalized = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                normalized.put(String.valueOf(entry.getKey()), entry.getValue());
            }
            Integer privatePort = readNullableInt(normalized.get("PrivatePort"));
            Integer publicPort = readNullableInt(normalized.get("PublicPort"));
            String type = readString(normalized.get("Type"), "tcp");
            String ip = readString(normalized.get("IP"), "");
            ports.add(new PortBinding(privatePort, publicPort, type, ip));
        }
        return ports;
    }

    private List<String> toStringList(Object value) {
        if (!(value instanceof List<?> rows)) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        for (Object row : rows) {
            String item = readString(row, "");
            if (StringUtils.hasText(item)) {
                result.add(item);
            }
        }
        return result;
    }

    private String readString(Object value, String fallback) {
        String text = value == null ? "" : String.valueOf(value).trim();
        return StringUtils.hasText(text) ? text : fallback;
    }

    private Integer readNullableInt(Object value) {
        if (value == null) {
            return null;
        }
        try {
            return Integer.parseInt(String.valueOf(value));
        } catch (Exception ex) {
            return null;
        }
    }

    private String sanitizeMessage(String raw) {
        String text = readString(raw, "unknown_error").replace('\n', ' ').replace('\r', ' ');
        if (text.length() > 240) {
            return text.substring(0, 240) + "...";
        }
        return text;
    }

    public record PortBinding(Integer privatePort, Integer publicPort, String type, String ip) {
    }

    public record ContainerSnapshot(String containerId,
                                    String containerName,
                                    String image,
                                    String state,
                                    String status,
                                    List<PortBinding> ports) {
    }
}
