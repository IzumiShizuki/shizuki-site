package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

class PortainerClientTest {

    private PortainerTransport transport;
    private PortainerClient client;

    @BeforeEach
    void setUp() {
        AdminOpsProperties properties = new AdminOpsProperties();
        properties.getPortainer().setBaseUrl("https://ops.shizuki.online");
        properties.getPortainer().setApiKey("test-api-key");
        properties.getPortainer().setEndpointId(2L);

        transport = Mockito.mock(PortainerTransport.class);
        client = new PortainerClient(properties, transport, new com.fasterxml.jackson.databind.ObjectMapper());
    }

    @Test
    void shouldParseContainerSnapshotsFromPortainerPayload() {
        Mockito.when(transport.get(Mockito.anyString(), Mockito.anyString()))
            .thenReturn("""
                [
                  {
                    "Id": "abc123",
                    "Names": ["/shizuki-site-backend"],
                    "Image": "shizuki-site/backend:latest",
                    "State": "running",
                    "Status": "Up 3 minutes",
                    "Ports": [
                      {"PrivatePort": 8080, "PublicPort": 18080, "Type": "tcp", "IP": "0.0.0.0"},
                      {"PrivatePort": 8081, "Type": "tcp"}
                    ]
                  }
                ]
                """);

        var containers = client.listContainers();

        Assertions.assertEquals(1, containers.size());
        PortainerClient.ContainerSnapshot item = containers.get(0);
        Assertions.assertEquals("abc123", item.containerId());
        Assertions.assertEquals("shizuki-site-backend", item.containerName());
        Assertions.assertEquals("running", item.state());
        Assertions.assertEquals(2, item.ports().size());
        Assertions.assertEquals(8080, item.ports().get(0).privatePort());
        Assertions.assertEquals(18080, item.ports().get(0).publicPort());
    }

    @Test
    void shouldThrowInternalErrorWhenPortainerPayloadMalformed() {
        Mockito.when(transport.get(Mockito.anyString(), Mockito.anyString()))
            .thenReturn("{not-json}");

        BusinessException ex = Assertions.assertThrows(BusinessException.class, () -> client.listContainers());
        Assertions.assertEquals(ErrorCode.INTERNAL_ERROR, ex.getErrorCode());
    }

    @Test
    void shouldMapTimeoutToInternalError() {
        Mockito.when(transport.get(Mockito.anyString(), Mockito.anyString()))
            .thenThrow(new ResourceAccessException("read timed out"));

        BusinessException ex = Assertions.assertThrows(BusinessException.class, () -> client.listContainers());
        Assertions.assertEquals(ErrorCode.INTERNAL_ERROR, ex.getErrorCode());
        Assertions.assertTrue(ex.getMessage().toLowerCase().contains("timeout"));
    }

    @Test
    void shouldMapAction404ToNotFound() {
        Mockito.doThrow(new HttpClientErrorException(HttpStatus.NOT_FOUND))
            .when(transport).post(Mockito.anyString(), Mockito.anyString());

        BusinessException ex = Assertions.assertThrows(BusinessException.class, () -> client.invokeContainerAction("abc123", "restart"));
        Assertions.assertEquals(ErrorCode.NOT_FOUND, ex.getErrorCode());
    }

    @Test
    void shouldAppendGracefulStopTimeoutForRestartAndStopAction() {
        client.invokeContainerAction("abc123", "restart");

        ArgumentCaptor<String> urlCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(transport).post(urlCaptor.capture(), Mockito.eq("test-api-key"));
        Assertions.assertTrue(urlCaptor.getValue().contains("/restart?t=10"));
    }
}
