package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.admin.response.AdminOpsContainerLogsResponse;
import io.github.shizuki.site.admin.response.AdminOpsMeguriStatusResponse;
import io.github.shizuki.site.admin.response.AdminOpsServiceHealthResponse;
import io.github.shizuki.site.admin.response.AdminPromptCacheMetricsResponse;
import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import jakarta.annotation.PreDestroy;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Read-only ops insight on top of the existing container management:
 * container logs, sidecar/service health probes and a Meguri Pet summary.
 */
@Component
public class AdminOpsInsightService {

    private static final String MEGURI_SERVICE_NAME = "meguri-pet";

    private final AdminOpsProperties properties;
    private final DockerEngineClient dockerEngineClient;
    private final MeguriPromptCacheMetricsService meguriMetricsService;
    private final HttpClient httpClient;
    private final ExecutorService probeExecutor = Executors.newCachedThreadPool(runnable -> {
        Thread thread = new Thread(runnable, "admin-ops-health-probe");
        thread.setDaemon(true);
        return thread;
    });

    public AdminOpsInsightService(AdminOpsProperties properties,
                                  DockerEngineClient dockerEngineClient,
                                  MeguriPromptCacheMetricsService meguriMetricsService) {
        this.properties = properties;
        this.dockerEngineClient = dockerEngineClient;
        this.meguriMetricsService = meguriMetricsService;
        this.httpClient = HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.NEVER)
            .connectTimeout(Duration.ofMillis(Math.max(200L, properties.getConnectTimeoutMs())))
            .build();
    }

    @PreDestroy
    void destroy() {
        probeExecutor.shutdownNow();
    }

    public AdminOpsContainerLogsResponse getContainerLogs(String containerId, Integer requestedTailLines) {
        DockerEngineClient.ContainerSnapshot target = findVisibleContainer(containerId);
        int tailLines = normalizeTailLines(requestedTailLines);
        List<String> lines = dockerEngineClient.fetchContainerLogs(target.containerId(), tailLines);
        return new AdminOpsContainerLogsResponse(
            readString(target.containerId(), ""),
            readString(target.containerName(), ""),
            tailLines,
            lines
        );
    }

    public List<AdminOpsServiceHealthResponse> checkServiceHealth() {
        Map<String, String> targets = collectHealthTargets();
        List<CompletableFuture<AdminOpsServiceHealthResponse>> futures = new ArrayList<>();
        for (Map.Entry<String, String> target : targets.entrySet()) {
            futures.add(CompletableFuture.supplyAsync(
                () -> probeService(target.getKey(), target.getValue()),
                probeExecutor
            ));
        }
        long deadlineMs = Math.max(1000L, (long) properties.getConnectTimeoutMs() + properties.getReadTimeoutMs());
        List<AdminOpsServiceHealthResponse> result = new ArrayList<>();
        for (CompletableFuture<AdminOpsServiceHealthResponse> future : futures) {
            try {
                result.add(future.get(deadlineMs, TimeUnit.MILLISECONDS));
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                break;
            } catch (Exception ex) {
                // Individual probe never throws; this covers scheduling failures only.
            }
        }
        return result;
    }

    public AdminOpsMeguriStatusResponse getMeguriStatus() {
        String meguriName = AdminOpsProperties.normalizeContainerName(properties.getMeguriContainerName());

        DockerEngineClient.ContainerSnapshot container = null;
        try {
            for (DockerEngineClient.ContainerSnapshot item : dockerEngineClient.listContainers()) {
                String currentName = AdminOpsProperties.normalizeContainerName(item.containerName());
                if (StringUtils.hasText(currentName) && currentName.equals(meguriName)) {
                    container = item;
                    break;
                }
            }
        } catch (RuntimeException ignored) {
            // Container API offline: report metrics + probe only.
        }

        boolean metricsPresent = false;
        String metricsReceivedAt = "";
        long metricsAgeSeconds = 0L;
        boolean metricsStale = true;
        try {
            AdminPromptCacheMetricsResponse metrics = meguriMetricsService.latest();
            if (metrics != null && metrics.available()) {
                metricsPresent = true;
                metricsReceivedAt = readString(metrics.receivedAt(), "");
                metricsAgeSeconds = Math.max(0L, metrics.ageSeconds());
                metricsStale = metrics.stale();
            }
        } catch (RuntimeException ignored) {
            // Metrics table unavailable: keep defaults.
        }

        AdminOpsServiceHealthResponse health = null;
        String healthUrl = findHealthUrl(MEGURI_SERVICE_NAME);
        if (StringUtils.hasText(healthUrl)) {
            health = probeService(MEGURI_SERVICE_NAME, healthUrl);
        }

        boolean running = container != null && "running".equalsIgnoreCase(readString(container.state(), ""));
        return new AdminOpsMeguriStatusResponse(
            container != null,
            container == null ? "" : readString(container.containerId(), ""),
            container == null ? properties.getMeguriContainerName() : readString(container.containerName(), ""),
            container == null ? "" : readString(container.state(), ""),
            container == null ? "" : readString(container.status(), ""),
            running,
            properties.isContainerManageable(properties.getMeguriContainerName()),
            metricsPresent,
            metricsReceivedAt,
            metricsAgeSeconds,
            metricsStale,
            health
        );
    }

    private DockerEngineClient.ContainerSnapshot findVisibleContainer(String containerId) {
        String normalizedInput = readString(containerId, "");
        if (!StringUtils.hasText(normalizedInput)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "containerId is required");
        }
        for (DockerEngineClient.ContainerSnapshot item : dockerEngineClient.listContainers()) {
            String containerName = readString(item.containerName(), "");
            if (!properties.isContainerVisible(containerName)) {
                continue;
            }
            String currentId = readString(item.containerId(), "");
            if (currentId.equals(normalizedInput) || currentId.startsWith(normalizedInput)
                || containerName.equalsIgnoreCase(normalizedInput)) {
                return item;
            }
        }
        throw new BusinessException(ErrorCode.NOT_FOUND, "Container not found or not visible");
    }

    private Map<String, String> collectHealthTargets() {
        Map<String, String> targets = new LinkedHashMap<>();
        for (AdminOpsProperties.ServiceHealthTarget target : properties.getServiceHealthTargets()) {
            String name = readString(target.getName(), "");
            String url = readString(target.getUrl(), "");
            if (!StringUtils.hasText(name) || !StringUtils.hasText(url)) {
                continue;
            }
            targets.put(name, url);
        }
        return targets;
    }

    private String findHealthUrl(String serviceName) {
        for (AdminOpsProperties.ServiceHealthTarget target : properties.getServiceHealthTargets()) {
            if (serviceName.equalsIgnoreCase(readString(target.getName(), ""))) {
                return readString(target.getUrl(), "");
            }
        }
        return "";
    }

    private AdminOpsServiceHealthResponse probeService(String name, String url) {
        long startedAt = System.nanoTime();
        try {
            HttpRequest request = HttpRequest.newBuilder(URI.create(url))
                .timeout(Duration.ofMillis(Math.max(500L, properties.getReadTimeoutMs())))
                .GET()
                .build();
            HttpResponse<Void> response = httpClient.send(request, HttpResponse.BodyHandlers.discarding());
            long latencyMs = elapsedMs(startedAt);
            boolean healthy = response.statusCode() >= 200 && response.statusCode() < 400;
            return new AdminOpsServiceHealthResponse(
                name,
                url,
                healthy,
                response.statusCode(),
                latencyMs,
                healthy ? "OK" : "HTTP " + response.statusCode()
            );
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            return new AdminOpsServiceHealthResponse(name, url, false, 0, elapsedMs(startedAt), "Probe interrupted");
        } catch (Exception ex) {
            return new AdminOpsServiceHealthResponse(name, url, false, 0, elapsedMs(startedAt), sanitizeMessage(ex.getMessage()));
        }
    }

    private long elapsedMs(long startedAtNanos) {
        return Math.max(0L, (System.nanoTime() - startedAtNanos) / 1_000_000L);
    }

    private int normalizeTailLines(Integer requestedTailLines) {
        int tailLines = requestedTailLines == null ? properties.getLogsTailLines() : requestedTailLines;
        return Math.min(Math.max(10, tailLines), properties.getLogsMaxTailLines());
    }

    private String readString(Object value, String fallback) {
        String text = value == null ? "" : String.valueOf(value).trim();
        return StringUtils.hasText(text) ? text : fallback;
    }

    private String sanitizeMessage(String message) {
        String text = readString(message, "Service unreachable").replace('\n', ' ').replace('\r', ' ');
        if (text.length() > 220) {
            return text.substring(0, 220) + "...";
        }
        return text;
    }
}
