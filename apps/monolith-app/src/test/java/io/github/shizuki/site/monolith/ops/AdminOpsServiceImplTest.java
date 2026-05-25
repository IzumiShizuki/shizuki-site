package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.response.MusicMetingStatusResponse;
import io.github.shizuki.site.media.service.MediaService;
import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AdminOpsServiceImplTest {

    private AdminOpsProperties properties;
    private PortainerClient portainerClient;
    private MediaService mediaService;
    private AdminOpsServiceImpl service;

    @BeforeEach
    void setUp() {
        properties = new AdminOpsProperties();
        properties.getPortainer().setBaseUrl("https://ops.shizuki.online");
        properties.getPortainer().setApiKey("api-key");
        properties.getPortainer().setEndpointId(1L);

        portainerClient = Mockito.mock(PortainerClient.class);
        mediaService = Mockito.mock(MediaService.class);
        service = new AdminOpsServiceImpl(properties, portainerClient, mediaService);
    }

    @Test
    void shouldKeepMetingStatusWhenPortainerUnavailable() {
        Mockito.when(mediaService.getMetingStatus()).thenReturn(new MusicMetingStatusResponse(true, List.of("netease", "kuwo")));
        Mockito.when(portainerClient.listContainers())
            .thenThrow(new BusinessException(ErrorCode.INTERNAL_ERROR, "Portainer request timeout"));

        var overview = service.getOverview();

        Assertions.assertTrue(overview.meting().available());
        Assertions.assertFalse(overview.portainerReachable());
        Assertions.assertEquals(0, overview.containerTotal());
        Assertions.assertTrue(overview.portainerMessage().toLowerCase().contains("timeout"));
    }

    @Test
    void shouldFilterContainersByAllowedNamesAndBuildOverviewCount() {
        Mockito.when(mediaService.getMetingStatus()).thenReturn(new MusicMetingStatusResponse(false, List.of("netease", "kuwo", "qq")));
        Mockito.when(portainerClient.listContainers()).thenReturn(List.of(
            new PortainerClient.ContainerSnapshot("id-backend", "shizuki-site-backend", "backend:v1", "running", "Up", List.of()),
            new PortainerClient.ContainerSnapshot("id-random", "random-service", "random:v1", "running", "Up", List.of()),
            new PortainerClient.ContainerSnapshot("id-meting", "shizuki-site-meting-api", "meting:v1", "exited", "Exited (0)", List.of())
        ));

        var containers = service.listContainers();
        var overview = service.getOverview();

        Assertions.assertEquals(2, containers.size());
        Assertions.assertTrue(overview.portainerReachable());
        Assertions.assertEquals(2, overview.containerTotal());
        Assertions.assertEquals(1, overview.containerRunning());
        Assertions.assertEquals(1, overview.containerStopped());
    }

    @Test
    void shouldRejectContainerMutationWhenDisabled() {
        properties.setEnableMutations(false);

        BusinessException ex = Assertions.assertThrows(
            BusinessException.class,
            () -> service.actionContainer("id-backend", "restart")
        );

        Assertions.assertEquals(ErrorCode.FORBIDDEN, ex.getErrorCode());
    }

    @Test
    void shouldExecuteActionForManageableContainer() {
        properties.setEnableMutations(true);
        Mockito.when(portainerClient.listContainers()).thenReturn(List.of(
            new PortainerClient.ContainerSnapshot("id-backend-012345", "shizuki-site-backend", "backend:v1", "running", "Up", List.of())
        ));

        var response = service.actionContainer("id-backend", "restart");

        Assertions.assertEquals("restart", response.action());
        Assertions.assertEquals("ACCEPTED", response.status());
        Mockito.verify(portainerClient).invokeContainerAction("id-backend-012345", "restart");
    }
}
