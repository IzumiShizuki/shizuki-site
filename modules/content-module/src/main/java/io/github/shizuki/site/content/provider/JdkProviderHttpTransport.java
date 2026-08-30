package io.github.shizuki.site.content.provider;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

/** JDK transport with fixed connect/read bounds and redirects disabled. */
@Component
public class JdkProviderHttpTransport implements ProviderHttpTransport {

    private final Map<ProviderHttpPolicy, HttpClient> clients = new ConcurrentHashMap<>();

    @Override
    public InputStream get(URI endpoint, ProviderHttpPolicy policy) {
        URI allowedEndpoint = policy.requireAllowedEndpoint(endpoint);
        HttpClient client = clients.computeIfAbsent(policy, this::newClient);
        try {
            HttpResponse<InputStream> response = client.send(
                policy.requestBuilder(allowedEndpoint).GET().build(),
                HttpResponse.BodyHandlers.ofInputStream()
            );
            if (response.statusCode() != 200) {
                closeQuietly(response.body());
                throw unavailable("provider returned a non-success status");
            }
            long contentLength = response.headers().firstValueAsLong("Content-Length").orElse(-1L);
            if (contentLength > policy.maxResponseBytes()) {
                closeQuietly(response.body());
                throw unavailable("provider response exceeds the configured size limit");
            }
            return response.body();
        } catch (BusinessException exception) {
            throw exception;
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw unavailable("provider request was interrupted");
        } catch (IOException | RuntimeException exception) {
            throw unavailable("provider request failed");
        }
    }

    private HttpClient newClient(ProviderHttpPolicy policy) {
        return HttpClient.newBuilder()
            .connectTimeout(policy.connectTimeout())
            .followRedirects(HttpClient.Redirect.NEVER)
            .build();
    }

    private void closeQuietly(InputStream stream) {
        if (stream == null) {
            return;
        }
        try {
            stream.close();
        } catch (IOException ignored) {
            // A failed error-response close does not change the upstream result.
        }
    }

    private BusinessException unavailable(String message) {
        return new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, message);
    }
}
