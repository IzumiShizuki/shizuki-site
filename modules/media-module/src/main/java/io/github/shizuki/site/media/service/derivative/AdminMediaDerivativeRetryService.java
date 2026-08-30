package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.common.core.concurrency.ManagementCommandVersionGuard;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.controller.AdminMediaDerivativeRetryResponse;
import io.github.shizuki.site.media.mapper.admin.AdminMediaDerivativeRetryMapper;
import io.github.shizuki.site.media.mapper.admin.AdminMediaDerivativeRetryRow;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.content.port.PublicContentCacheInvalidationPort;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminMediaDerivativeRetryService {

    private static final String MANAGE_PERMISSION = "life.content.manage";

    private final AdminMediaDerivativeRetryMapper mapper;
    private final MediaDerivativeFeatureProperties properties;
    private final PublicContentCacheInvalidationPort cacheInvalidationPort;

    @Autowired
    public AdminMediaDerivativeRetryService(
        AdminMediaDerivativeRetryMapper mapper,
        MediaDerivativeFeatureProperties properties,
        ObjectProvider<PublicContentCacheInvalidationPort> cacheInvalidationPortProvider
    ) {
        this(mapper, properties, cacheInvalidationPortProvider.getIfAvailable());
    }

    AdminMediaDerivativeRetryService(
        AdminMediaDerivativeRetryMapper mapper,
        MediaDerivativeFeatureProperties properties
    ) {
        this(mapper, properties, (PublicContentCacheInvalidationPort) null);
    }

    AdminMediaDerivativeRetryService(
        AdminMediaDerivativeRetryMapper mapper,
        MediaDerivativeFeatureProperties properties,
        PublicContentCacheInvalidationPort cacheInvalidationPort
    ) {
        this.mapper = mapper;
        this.properties = properties;
        this.cacheInvalidationPort = cacheInvalidationPort;
    }

    @Transactional(rollbackFor = Exception.class)
    public AdminMediaDerivativeRetryResponse retry(
        String mediaRef,
        ImageVariantTypeEnum variant,
        String ifMatch
    ) {
        requireAdministrator();
        if (!OpaqueMediaReference.isValid(mediaRef) || variant == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Failed media derivative was not found");
        }
        AdminMediaDerivativeRetryRow row = mapper.selectRetryTarget(
            mediaRef,
            variant.name(),
            properties.getProcessorVersion()
        );
        if (row == null || row.getVariantId() == null || row.getPhotoId() == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Failed media derivative was not found");
        }
        int currentVersion = valueOrZero(row.getVersion());
        long expected = ManagementCommandVersionGuard.requireMatch(ifMatch, currentVersion);
        if (!ImageDerivativeStatusEnum.FAILED.name().equals(row.getProcessStatus())) {
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "Media derivative is not retryable",
                Map.of("currentStatus", String.valueOf(row.getProcessStatus()))
            );
        }
        int updated = mapper.retryFailed(row.getVariantId(), (int) expected);
        if (updated != 1) {
            AdminMediaDerivativeRetryRow latest = mapper.selectRetryTarget(
                mediaRef,
                variant.name(),
                properties.getProcessorVersion()
            );
            int latestVersion = latest == null ? currentVersion : valueOrZero(latest.getVersion());
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "Media derivative version changed",
                Map.of(
                    "currentVersion", latestVersion,
                    "currentEtag", ManagementCommandVersionGuard.toStrongEtag(latestVersion)
                )
            );
        }
        if (mapper.markPhotoProcessing(row.getPhotoId()) != 1) {
            throw new BusinessException(ErrorCode.CONFLICT, "Photo processing state changed");
        }
        if (cacheInvalidationPort != null) {
            cacheInvalidationPort.invalidateByPhotoId(row.getPhotoId());
        }
        int nextVersion = currentVersion + 1;
        return new AdminMediaDerivativeRetryResponse(
            mediaRef,
            variant,
            ImageDerivativeStatusEnum.PENDING,
            nextVersion,
            ManagementCommandVersionGuard.toStrongEtag(nextVersion)
        );
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }
}
