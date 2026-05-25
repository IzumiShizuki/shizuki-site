package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.admin.response.AdminOpsContainerActionResponse;
import io.github.shizuki.site.admin.response.AdminOpsContainerResponse;
import io.github.shizuki.site.admin.response.AdminOpsOverviewResponse;
import io.github.shizuki.site.media.response.MusicMetingStatusResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class AdminOpsServiceImpl implements AdminOpsService {

    private final AdminOpsProperties properties;
    private final PortainerClient portainerClient;
    private final MediaService mediaService;

    public AdminOpsServiceImpl(AdminOpsProperties properties,
                               PortainerClient portainerClient,
                               MediaService mediaService) {
        this.properties = properties;
        this.portainerClient = portainerClient;
        this.mediaService = mediaService;
    }

    @Override
    public AdminOpsOverviewResponse getOverview() {
        MusicMetingStatusResponse metingStatus = readMetingStatus();

        List<AdminOpsContainerResponse> containers = List.of();
        boolean portainerReachable = false;
        String portainerMessage = "Portainer unavailable";
        try {
            containers = listContainers();
            portainerReachable = true;
            portainerMessage = "OK";
        } catch (RuntimeException ex) {
            portainerMessage = sanitizeMessage(ex.getMessage());
        }

        int running = (int) containers.stream().filter(AdminOpsContainerResponse::running).count();
        int total = containers.size();
        int stopped = Math.max(0, total - running);

        return new AdminOpsOverviewResponse(
            properties.getPortalUrl(),
            metingStatus,
            portainerReachable,
            portainerMessage,
            total,
            running,
            stopped
        );
    }

    @Override
    public List<AdminOpsContainerResponse> listContainers() {
        List<PortainerClient.ContainerSnapshot> snapshots = portainerClient.listContainers();
        List<AdminOpsContainerResponse> result = new ArrayList<>();
        for (PortainerClient.ContainerSnapshot item : snapshots) {
            String containerName = readString(item.containerName(), "");
            if (!properties.isContainerAllowed(containerName)) {
                continue;
            }
            result.add(toContainerResponse(item));
        }
        return result;
    }

    @Override
    public AdminOpsContainerActionResponse actionContainer(String containerId, String action) {
        if (!properties.isEnableMutations()) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Ops mutations are disabled");
        }
        String normalizedAction = normalizeAction(action);
        if (!StringUtils.hasText(normalizedAction)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported action, expected start|stop|restart");
        }

        PortainerClient.ContainerSnapshot target = findManageableContainer(containerId);
        portainerClient.invokeContainerAction(target.containerId(), normalizedAction);
        return new AdminOpsContainerActionResponse(
            target.containerId(),
            target.containerName(),
            normalizedAction,
            "ACCEPTED",
            "Container action has been submitted"
        );
    }

    private PortainerClient.ContainerSnapshot findManageableContainer(String containerId) {
        String normalizedInput = readString(containerId, "");
        if (!StringUtils.hasText(normalizedInput)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "containerId is required");
        }
        List<PortainerClient.ContainerSnapshot> snapshots = portainerClient.listContainers();
        for (PortainerClient.ContainerSnapshot item : snapshots) {
            String containerName = readString(item.containerName(), "");
            if (!properties.isContainerAllowed(containerName)) {
                continue;
            }
            String currentId = readString(item.containerId(), "");
            if (currentId.equals(normalizedInput) || currentId.startsWith(normalizedInput)
                || containerName.equalsIgnoreCase(normalizedInput)) {
                return item;
            }
        }
        throw new BusinessException(ErrorCode.NOT_FOUND, "Container not found or not manageable");
    }

    private AdminOpsContainerResponse toContainerResponse(PortainerClient.ContainerSnapshot snapshot) {
        List<String> ports = new ArrayList<>();
        for (PortainerClient.PortBinding port : snapshot.ports()) {
            String label = formatPort(port);
            if (StringUtils.hasText(label)) {
                ports.add(label);
            }
        }
        boolean running = "running".equalsIgnoreCase(readString(snapshot.state(), ""));
        return new AdminOpsContainerResponse(
            readString(snapshot.containerId(), ""),
            readString(snapshot.containerName(), ""),
            readString(snapshot.image(), ""),
            readString(snapshot.state(), ""),
            readString(snapshot.status(), ""),
            ports,
            running,
            true
        );
    }

    private MusicMetingStatusResponse readMetingStatus() {
        try {
            MusicMetingStatusResponse response = mediaService.getMetingStatus();
            if (response != null) {
                return response;
            }
        } catch (RuntimeException ignored) {
            // fallback below
        }
        return new MusicMetingStatusResponse(false, List.of("netease", "kuwo", "qq"));
    }

    private String normalizeAction(String action) {
        String normalized = readString(action, "").toLowerCase(Locale.ROOT);
        if ("start".equals(normalized) || "stop".equals(normalized) || "restart".equals(normalized)) {
            return normalized;
        }
        return "";
    }

    private String formatPort(PortainerClient.PortBinding port) {
        if (port == null || port.privatePort() == null) {
            return "";
        }
        String type = readString(port.type(), "tcp");
        String privatePart = port.privatePort() + "/" + type;
        if (port.publicPort() == null) {
            return privatePart;
        }
        String prefix = StringUtils.hasText(port.ip()) ? port.ip() + ":" : "";
        return prefix + port.publicPort() + "->" + privatePart;
    }

    private String readString(Object value, String fallback) {
        String text = value == null ? "" : String.valueOf(value).trim();
        return StringUtils.hasText(text) ? text : fallback;
    }

    private String sanitizeMessage(String message) {
        String text = readString(message, "Portainer unavailable").replace('\n', ' ').replace('\r', ' ');
        if (text.length() > 220) {
            return text.substring(0, 220) + "...";
        }
        return text;
    }
}
