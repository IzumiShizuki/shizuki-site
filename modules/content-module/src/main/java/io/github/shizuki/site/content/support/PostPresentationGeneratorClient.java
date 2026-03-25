package io.github.shizuki.site.content.support;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.StringUtils;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Component
public class PostPresentationGeneratorClient {

    private static final long DEFAULT_CONNECT_TIMEOUT_MS = 2_000L;
    private static final long DEFAULT_READ_TIMEOUT_MS = 120_000L;
    private static final Pattern MESSAGE_PATTERN = Pattern.compile("\"message\"\\s*:\\s*\"([^\"]+)\"");

    private final RestClient restClient;
    private final String generatorBaseUrl;

    public PostPresentationGeneratorClient(
        RestClient.Builder restClientBuilder,
        @Value("${shizuki.blog.presentation.generator-base-url:}") String generatorBaseUrl,
        @Value("${shizuki.blog.presentation.connect-timeout-ms:2000}") long connectTimeoutMs,
        @Value("${shizuki.blog.presentation.read-timeout-ms:120000}") long readTimeoutMs
    ) {
        this.generatorBaseUrl = generatorBaseUrl == null ? "" : generatorBaseUrl.trim();
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(normalizeTimeout(connectTimeoutMs, DEFAULT_CONNECT_TIMEOUT_MS));
        requestFactory.setReadTimeout(normalizeTimeout(readTimeoutMs, DEFAULT_READ_TIMEOUT_MS));
        this.restClient = restClientBuilder
            .baseUrl(this.generatorBaseUrl)
            .requestFactory(requestFactory)
            .build();
    }

    public PresentationRenderResult renderPptx(String markdown, String fileName) {
        if (!StringUtils.hasText(generatorBaseUrl)) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Presentation generator is not configured");
        }
        try {
            PresentationRenderResponse response = restClient.post()
                .uri("/render/pptx")
                .body(new PresentationRenderRequest(markdown, fileName))
                .exchange((request, clientResponse) -> {
                    if (clientResponse.getStatusCode().isError()) {
                        String payload = StreamUtils.copyToString(clientResponse.getBody(), StandardCharsets.UTF_8);
                        throw new BusinessException(
                            ErrorCode.INTERNAL_ERROR,
                            resolveGeneratorErrorMessage(payload, clientResponse.getStatusCode().value())
                        );
                    }
                    return clientResponse.bodyTo(PresentationRenderResponse.class);
                });
            if (response == null || !StringUtils.hasText(response.pptBase64())) {
                throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Presentation generator returned empty payload");
            }
            byte[] pptBytes = Base64.getDecoder().decode(response.pptBase64());
            int slideCount = response.slideCount() == null || response.slideCount() < 0 ? 0 : response.slideCount();
            return new PresentationRenderResult(pptBytes, slideCount);
        } catch (BusinessException exception) {
            throw exception;
        } catch (IllegalArgumentException | RestClientException exception) {
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Presentation generator is unavailable");
        }
    }

    private int normalizeTimeout(long rawTimeout, long fallback) {
        long normalized = rawTimeout > 0 ? rawTimeout : fallback;
        return normalized >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) normalized;
    }

    private String resolveGeneratorErrorMessage(String payload, int statusCode) {
        String normalized = payload == null ? "" : payload.trim();
        if (StringUtils.hasText(normalized)) {
            Matcher matcher = MESSAGE_PATTERN.matcher(normalized);
            if (matcher.find()) {
                String message = matcher.group(1).trim();
                if (StringUtils.hasText(message)) {
                    return message;
                }
            }
            return normalized;
        }
        return statusCode >= 500
            ? "Presentation generator failed"
            : "Presentation generator request was rejected";
    }

    private record PresentationRenderRequest(
        String markdown,
        String fileName
    ) {
    }

    private record PresentationRenderResponse(
        String pptBase64,
        Integer slideCount
    ) {
    }

    public record PresentationRenderResult(
        byte[] pptBytes,
        int slideCount
    ) {
    }
}
