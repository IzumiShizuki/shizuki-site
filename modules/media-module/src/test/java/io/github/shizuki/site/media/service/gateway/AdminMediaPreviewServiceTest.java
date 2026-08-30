package io.github.shizuki.site.media.service.gateway;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.authorization.MediaAssociationAuthorizationService;
import java.io.ByteArrayInputStream;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminMediaPreviewServiceTest {

    @Mock
    private MediaAssociationAuthorizationService authorizationService;
    @Mock
    private MediaGatewayService gatewayService;

    private AdminMediaPreviewService service;

    @BeforeEach
    void setUp() {
        service = new AdminMediaPreviewService(authorizationService, gatewayService);
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void capabilityIsIssuedAndConsumedOnlyInsideServerBoundary() {
        String mediaRef = "med_AAAAAAAAAAAAAAAAAAAAAAAAAAA";
        MediaGatewayStream stream = new MediaGatewayStream(
            new ByteArrayInputStream(new byte[] {1, 2}),
            "image/webp",
            2,
            "private, no-store, max-age=0",
            "\"preview\""
        );
        when(authorizationService.issueAdminPreviewCapability(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP))
            .thenReturn(Optional.of("server-only-capability"));
        when(gatewayService.open(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP, "server-only-capability"))
            .thenReturn(stream);

        assertThat(service.open(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).isSameAs(stream);
        verify(gatewayService).open(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP, "server-only-capability");
    }
}
