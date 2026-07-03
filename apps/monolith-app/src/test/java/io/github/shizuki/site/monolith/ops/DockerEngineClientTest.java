package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class DockerEngineClientTest {

    private DockerEngineTransport transport;
    private DockerEngineClient client;

    @BeforeEach
    void setUp() {
        transport = Mockito.mock(DockerEngineTransport.class);
        client = new DockerEngineClient(transport, new com.fasterxml.jackson.databind.ObjectMapper());
    }

    @Test
    void shouldParseContainerSnapshotsFromDockerPayload() {
        Mockito.when(transport.get(Mockito.anyString()))
            .thenReturn(new DockerEngineTransport.Response(
                200,
                "OK",
                """
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
                    """,
                java.util.Map.of("content-type", "application/json")
            ));

        List<DockerEngineClient.ContainerSnapshot> containers = client.listContainers();

        Assertions.assertEquals(1, containers.size());
        DockerEngineClient.ContainerSnapshot item = containers.get(0);
        Assertions.assertEquals("abc123", item.containerId());
        Assertions.assertEquals("shizuki-site-backend", item.containerName());
        Assertions.assertEquals("running", item.state());
        Assertions.assertEquals(2, item.ports().size());
        Assertions.assertEquals(8080, item.ports().get(0).privatePort());
        Assertions.assertEquals(18080, item.ports().get(0).publicPort());
    }

    @Test
    void shouldThrowInternalErrorWhenDockerPayloadMalformed() {
        Mockito.when(transport.get(Mockito.anyString()))
            .thenReturn(new DockerEngineTransport.Response(200, "OK", "{not-json}", java.util.Map.of()));

        BusinessException ex = Assertions.assertThrows(BusinessException.class, () -> client.listContainers());
        Assertions.assertEquals(ErrorCode.INTERNAL_ERROR, ex.getErrorCode());
    }

    @Test
    void shouldMapAction404ToNotFound() {
        Mockito.when(transport.post(Mockito.anyString()))
            .thenReturn(new DockerEngineTransport.Response(404, "Not Found", "{\"message\":\"No such container\"}", java.util.Map.of()));

        BusinessException ex = Assertions.assertThrows(BusinessException.class, () -> client.invokeContainerAction("abc123", "restart"));
        Assertions.assertEquals(ErrorCode.NOT_FOUND, ex.getErrorCode());
    }

    @Test
    void shouldAppendGracefulStopTimeoutForRestartAndStopAction() {
        Mockito.when(transport.post(Mockito.anyString()))
            .thenReturn(new DockerEngineTransport.Response(204, "No Content", "", java.util.Map.of()));

        client.invokeContainerAction("abc123", "restart");

        ArgumentCaptor<String> pathCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(transport).post(pathCaptor.capture());
        Assertions.assertTrue(pathCaptor.getValue().contains("/restart?t=10"));
    }
}
