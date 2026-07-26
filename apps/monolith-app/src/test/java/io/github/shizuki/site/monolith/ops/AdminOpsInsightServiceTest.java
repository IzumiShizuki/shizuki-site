package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.admin.response.AdminOpsContainerLogsResponse;
import io.github.shizuki.site.admin.response.AdminOpsMeguriStatusResponse;
import io.github.shizuki.site.admin.response.AdminPromptCacheMetricsResponse;
import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AdminOpsInsightServiceTest {

    private AdminOpsProperties properties;
    private DockerEngineClient dockerEngineClient;
    private MeguriPromptCacheMetricsService metricsService;
    private AdminOpsInsightService service;

    @BeforeEach
    void setUp() {
        properties = new AdminOpsProperties();
        dockerEngineClient = Mockito.mock(DockerEngineClient.class);
        metricsService = Mockito.mock(MeguriPromptCacheMetricsService.class);
        service = new AdminOpsInsightService(properties, dockerEngineClient, metricsService);
    }

    @Test
    void shouldDemultiplexFramedDockerLogStream() {
        byte[] payloadOne = "hello\n".getBytes(StandardCharsets.UTF_8);
        byte[] payloadTwo = "world\n".getBytes(StandardCharsets.UTF_8);
        byte[] framed = new byte[8 + payloadOne.length + 8 + payloadTwo.length];
        framed[0] = 1;
        framed[7] = (byte) payloadOne.length;
        System.arraycopy(payloadOne, 0, framed, 8, payloadOne.length);
        int secondFrame = 8 + payloadOne.length;
        framed[secondFrame] = 2;
        framed[secondFrame + 7] = (byte) payloadTwo.length;
        System.arraycopy(payloadTwo, 0, framed, secondFrame + 8, payloadTwo.length);

        Assertions.assertEquals("hello\nworld\n", DockerEngineClient.demultiplexLogStream(framed));
    }

    @Test
    void shouldPassThroughRawTtyLogStream() {
        byte[] raw = "plain text log line\n".getBytes(StandardCharsets.UTF_8);

        Assertions.assertEquals("plain text log line\n", DockerEngineClient.demultiplexLogStream(raw));
    }

    @Test
    void shouldReadLogsForVisibleContainerAndClampTail() {
        Mockito.when(dockerEngineClient.listContainers()).thenReturn(List.of(snapshot("abc123", "meguri-pet", "running")));
        Mockito.when(dockerEngineClient.fetchContainerLogs("abc123", 1000)).thenReturn(List.of("line-1", "line-2"));

        AdminOpsContainerLogsResponse response = service.getContainerLogs("meguri-pet", 9999);

        Assertions.assertEquals("abc123", response.containerId());
        Assertions.assertEquals("meguri-pet", response.containerName());
        Assertions.assertEquals(1000, response.tailLines());
        Assertions.assertEquals(List.of("line-1", "line-2"), response.lines());
    }

    @Test
    void shouldRejectLogsForUnknownContainer() {
        Mockito.when(dockerEngineClient.listContainers()).thenReturn(List.of(snapshot("abc123", "meguri-pet", "running")));

        BusinessException ex = Assertions.assertThrows(
            BusinessException.class,
            () -> service.getContainerLogs("missing-container", null)
        );
        Assertions.assertEquals(ErrorCode.NOT_FOUND, ex.getErrorCode());
    }

    @Test
    void shouldSummarizeMeguriStatusFromContainerAndMetrics() {
        Mockito.when(dockerEngineClient.listContainers()).thenReturn(List.of(snapshot("abc123", "meguri-pet", "running")));
        Mockito.when(metricsService.latest()).thenReturn(new AdminPromptCacheMetricsResponse(
            true, "2026-07-26T09:00:00Z", 42L, false, Map.of()));

        AdminOpsMeguriStatusResponse status = service.getMeguriStatus();

        Assertions.assertTrue(status.containerFound());
        Assertions.assertTrue(status.running());
        Assertions.assertTrue(status.manageable());
        Assertions.assertTrue(status.metricsPresent());
        Assertions.assertEquals(42L, status.metricsAgeSeconds());
        Assertions.assertFalse(status.metricsStale());
        Assertions.assertNull(status.health());
    }

    @Test
    void shouldReportMeguriMissingWhenContainerApiOffline() {
        Mockito.when(dockerEngineClient.listContainers())
            .thenThrow(new BusinessException(ErrorCode.INTERNAL_ERROR, "socket down"));
        Mockito.when(metricsService.latest()).thenReturn(new AdminPromptCacheMetricsResponse(
            false, "", 0L, true, Map.of()));

        AdminOpsMeguriStatusResponse status = service.getMeguriStatus();

        Assertions.assertFalse(status.containerFound());
        Assertions.assertFalse(status.running());
        Assertions.assertEquals("meguri-pet", status.containerName());
        Assertions.assertFalse(status.metricsPresent());
        Assertions.assertTrue(status.metricsStale());
    }

    @Test
    void shouldSkipBlankServiceHealthTargets() {
        AdminOpsProperties.ServiceHealthTarget blank = new AdminOpsProperties.ServiceHealthTarget();
        blank.setName("meguri-pet");
        blank.setUrl("");
        properties.setServiceHealthTargets(List.of(blank));

        Assertions.assertTrue(service.checkServiceHealth().isEmpty());
    }

    private DockerEngineClient.ContainerSnapshot snapshot(String id, String name, String state) {
        return new DockerEngineClient.ContainerSnapshot(id, name, "image:latest", state, "Up 5 minutes", List.of());
    }
}
