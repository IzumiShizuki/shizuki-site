package io.github.shizuki.site.media.service.gateway;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.authorization.MediaAssociationAuthorizationService;
import org.springframework.stereotype.Service;

/** Consumes an admin-preview capability entirely inside the server boundary. */
@Service
public class AdminMediaPreviewService {

    private static final String MANAGE_PERMISSION = "life.content.manage";

    private final MediaAssociationAuthorizationService authorizationService;
    private final MediaGatewayService gatewayService;

    public AdminMediaPreviewService(
        MediaAssociationAuthorizationService authorizationService,
        MediaGatewayService gatewayService
    ) {
        this.authorizationService = authorizationService;
        this.gatewayService = gatewayService;
    }

    public MediaGatewayStream open(String mediaRef, ImageVariantTypeEnum variant) {
        requireAdministrator();
        String capability = authorizationService.issueAdminPreviewCapability(mediaRef, variant)
            .orElseThrow(this::notFound);
        return gatewayService.open(mediaRef, variant, capability);
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private BusinessException notFound() {
        return new BusinessException(ErrorCode.NOT_FOUND, "Album preview media is unavailable");
    }
}
