package io.github.shizuki.site.monolith.ops;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DockerEngineClient {

    private final DockerEngineTransport transport;
    private final ObjectMapper objectMapper;

    public DockerEngineClient(DockerEngineTransport transport, ObjectMapper objectMapper) {
        this.transport = transport;
        this.objectMapper = objectMapper;
    }

    public List<ContainerSnapshot> listContainers() {
        DockerEngineTransport.Response response = transport.get("/containers/json?all=1");
        ensureSuccess(response, "Docker container list request failed");
        try {
            List<Map<String, Object>> payload = objectMapper.readValue(response.body(), new TypeReference<>() {
            });
            List<ContainerSnapshot> result = new ArrayList<>();
            for (Map<String, Object> row : payload) {
                result.add(toContainerSnapshot(row));
            }
            return result;
        } catch (Exception ex) {
            throw new BusinessException(
                ErrorCode.INTERNAL_ERROR,
                "Docker container list parse failed",
                Map.of("reason", sanitizeMessage(ex.getMessage()))
            );
        }
    }

    public void invokeContainerAction(String containerId, String action) {
        String normalizedContainerId = readString(containerId, "");
        String normalizedAction = readString(action, "").toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(normalizedContainerId) || !StringUtils.hasText(normalizedAction)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "containerId and action are required");
        }

        String encodedContainerId = URLEncoder.encode(normalizedContainerId, StandardCharsets.UTF_8);
        String suffix = ("stop".equals(normalizedAction) || "restart".equals(normalizedAction)) ? "?t=10" : "";
        DockerEngineTransport.Response response =
            transport.post("/containers/" + encodedContainerId + "/" + normalizedAction + suffix);

        if (response.statusCode() >= 200 && response.statusCode() < 300) {
            return;
        }

        String upstreamMessage = readUpstreamMessage(response);
        if (response.statusCode() == 404) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Container not found");
        }
        if (response.statusCode() == 304 || response.statusCode() == 409) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Container action rejected",
                Map.of("reason", upstreamMessage)
            );
        }
        throw new BusinessException(
            ErrorCode.INTERNAL_ERROR,
            "Docker container action failed",
            Map.of("upstream_status", response.statusCode(), "reason", upstreamMessage)
        );
    }

    private void ensureSuccess(DockerEngineTransport.Response response, String message) {
        if (response.statusCode() >= 200 && response.statusCode() < 300) {
            return;
        }
        throw new BusinessException(
            ErrorCode.INTERNAL_ERROR,
            message,
            Map.of("upstream_status", response.statusCode(), "reason", readUpstreamMessage(response))
        );
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

    private String readUpstreamMessage(DockerEngineTransport.Response response) {
        String body = readString(response.body(), "");
        if (!StringUtils.hasText(body)) {
            return response.reasonPhrase();
        }
        try {
            Map<String, Object> payload = objectMapper.readValue(body, new TypeReference<>() {
            });
            return readString(payload.get("message"), body);
        } catch (Exception ex) {
            return sanitizeMessage(body);
        }
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
