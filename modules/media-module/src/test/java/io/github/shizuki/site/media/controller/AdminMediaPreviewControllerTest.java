package io.github.shizuki.site.media.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.security.annotation.RequireGroup;
import io.github.shizuki.common.security.annotation.RequirePermission;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.gateway.AdminMediaPreviewService;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@ExtendWith(MockitoExtension.class)
class AdminMediaPreviewControllerTest {

    @Mock
    private AdminMediaPreviewService previewService;

    @Test
    void streamsThroughDedicatedNoStoreAdminEndpointWithoutRedirect() {
        String mediaRef = "med_AAAAAAAAAAAAAAAAAAAAAAAAAAA";
        when(previewService.open(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).thenReturn(
            new MediaGatewayStream(
                new ByteArrayInputStream(new byte[] {1, 2, 3}),
                "image/webp",
                3,
                "private, no-store, max-age=0",
                "\"admin-preview\""
            )
        );

        ResponseEntity<StreamingResponseBody> response = new AdminMediaPreviewController(previewService)
            .preview(mediaRef, "DISPLAY_WEBP");

        assertThat(response.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(response.getHeaders().getFirst(HttpHeaders.CACHE_CONTROL))
            .isEqualTo("private, no-store, max-age=0");
        assertThat(response.getHeaders().getLocation()).isNull();
        assertThat(response.getHeaders().getFirst("X-Robots-Tag"))
            .contains("noindex", "noarchive");
        assertThat(response.getHeaders().containsKey(MediaGatewayController.CAPABILITY_HEADER)).isFalse();
    }

    @Test
    void previewControllerRequiresBothAdminAndScopedPermission() {
        RequireGroup group = AdminMediaPreviewController.class.getAnnotation(RequireGroup.class);
        RequirePermission permission = AdminMediaPreviewController.class.getAnnotation(RequirePermission.class);

        assertThat(group.value()).isEqualTo("ADMIN");
        assertThat(permission.value()).isEqualTo("life.content.manage");
    }
}
