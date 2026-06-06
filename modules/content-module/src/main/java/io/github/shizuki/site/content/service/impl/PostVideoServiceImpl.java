package io.github.shizuki.site.content.service.impl;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.request.PostVideoProcessRequest;
import io.github.shizuki.site.content.response.PostVideoSourceResponse;
import io.github.shizuki.site.content.response.PostVideoSummaryResponse;
import io.github.shizuki.site.content.response.PostVideoTranscriptResponse;
import io.github.shizuki.site.content.service.PostVideoService;
import io.github.shizuki.site.content.support.PostVideoConverterClient;
import io.github.shizuki.site.content.support.PostVideoProperties;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PostVideoServiceImpl implements PostVideoService {

    private static final String WRITE_PERMISSION = "blog.post.write";

    private final PostVideoConverterClient converterClient;
    private final PostVideoProperties properties;

    public PostVideoServiceImpl(PostVideoConverterClient converterClient, PostVideoProperties properties) {
        this.converterClient = converterClient;
        this.properties = properties;
    }

    @Override
    public PostVideoSourceResponse inspect(PostVideoProcessRequest request) {
        validateAccess();
        validateRequest(request);
        return converterClient.inspect(request);
    }

    @Override
    public PostVideoTranscriptResponse transcribe(PostVideoProcessRequest request) {
        validateAccess();
        validateRequest(request);
        return converterClient.transcribe(request);
    }

    @Override
    public PostVideoSummaryResponse summarize(PostVideoProcessRequest request) {
        validateAccess();
        validateRequest(request);
        return converterClient.summarize(request);
    }

    private void validateAccess() {
        LoginUser user = LoginUserContext.get()
            .filter(loginUser -> loginUser.getUserId() != null && loginUser.getUserId() > 0)
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
        Set<String> groups = normalizeCodes(user.getGroups());
        Set<String> permissions = normalizeCodes(user.getPermissions());
        if (groups.contains("admin") || permissions.contains(WRITE_PERMISSION)) {
            return;
        }
        throw new BusinessException(ErrorCode.FORBIDDEN, "Permission denied: " + WRITE_PERMISSION);
    }

    private void validateRequest(PostVideoProcessRequest request) {
        if (request == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Request body is required");
        }
        String sourceUrl = readString(request.getSourceUrl(), "");
        String filePath = readString(request.getFilePath(), "");
        if (!StringUtils.hasText(sourceUrl) && !StringUtils.hasText(filePath)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "source_url or file_path is required");
        }
        if (StringUtils.hasText(sourceUrl)) {
            validateSourceUrl(sourceUrl);
        }
        if (StringUtils.hasText(filePath) && !properties.isAllowLocalFiles()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Local video files are not enabled");
        }
        if (request.getMaxKeyframes() != null && request.getMaxKeyframes() > properties.getMaxKeyframes()) {
            request.setMaxKeyframes(properties.getMaxKeyframes());
        }
    }

    private void validateSourceUrl(String sourceUrl) {
        URI uri;
        try {
            uri = URI.create(sourceUrl.trim());
        } catch (IllegalArgumentException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid video URL");
        }
        String scheme = readString(uri.getScheme(), "").toLowerCase(Locale.ROOT);
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Only http/https video URLs are supported");
        }
        String host = readString(uri.getHost(), "").toLowerCase(Locale.ROOT);
        if (!StringUtils.hasText(host) || !isAllowedHost(host)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Video URL domain is not allowed");
        }
    }

    private boolean isAllowedHost(String host) {
        for (String allowedDomain : properties.getAllowedDomains()) {
            String normalized = readString(allowedDomain, "").toLowerCase(Locale.ROOT);
            if (!StringUtils.hasText(normalized)) {
                continue;
            }
            if (host.equals(normalized) || host.endsWith("." + normalized)) {
                return true;
            }
        }
        return false;
    }

    private Set<String> normalizeCodes(Set<String> rawCodes) {
        if (rawCodes == null || rawCodes.isEmpty()) {
            return Set.of();
        }
        Set<String> result = new LinkedHashSet<>();
        for (String item : rawCodes) {
            String normalized = readString(item, "").toLowerCase(Locale.ROOT);
            if (StringUtils.hasText(normalized)) {
                result.add(normalized);
            }
        }
        return result;
    }

    private String readString(String value, String fallback) {
        return StringUtils.hasText(value) ? value.trim() : fallback;
    }
}
