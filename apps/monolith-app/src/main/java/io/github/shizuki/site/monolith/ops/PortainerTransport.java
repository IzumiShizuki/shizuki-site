package io.github.shizuki.site.monolith.ops;

import io.github.shizuki.site.monolith.config.AdminOpsProperties;
import java.net.URI;
import java.net.http.HttpClient;
import java.time.Duration;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class PortainerTransport {

    private final RestClient restClient;

    public PortainerTransport(RestClient.Builder restClientBuilder, AdminOpsProperties adminOpsProperties) {
        HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(adminOpsProperties.getConnectTimeoutMs()))
            .build();
        JdkClientHttpRequestFactory requestFactory = new JdkClientHttpRequestFactory(httpClient);
        requestFactory.setReadTimeout(Duration.ofMillis(adminOpsProperties.getReadTimeoutMs()));
        this.restClient = restClientBuilder.requestFactory(requestFactory).build();
    }

    public String get(String url, String apiKey) {
        return restClient.get()
            .uri(URI.create(url))
            .header("X-API-Key", apiKey)
            .retrieve()
            .body(String.class);
    }

    public void post(String url, String apiKey) {
        restClient.post()
            .uri(URI.create(url))
            .header("X-API-Key", apiKey)
            .retrieve()
            .toBodilessEntity();
    }
}
