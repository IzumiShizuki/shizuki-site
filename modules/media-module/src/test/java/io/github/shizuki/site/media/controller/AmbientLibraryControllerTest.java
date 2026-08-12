package io.github.shizuki.site.media.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.site.media.config.FreesoundProperties;
import io.github.shizuki.site.media.integration.FreesoundProvider;
import io.github.shizuki.site.media.request.AmbientSoundImportRequest;
import io.github.shizuki.site.media.response.AmbientSoundImportResponse;
import io.github.shizuki.site.media.service.AmbientLibraryService;
import org.junit.jupiter.api.Test;

class AmbientLibraryControllerTest {

    @Test
    void shouldExposeAvailabilityEvenWhenProviderIsDisabled() {
        FreesoundProperties properties = new FreesoundProperties();
        AmbientLibraryController controller = new AmbientLibraryController(
            mock(FreesoundProvider.class), properties, mock(AmbientLibraryService.class));

        ApiResponse<java.util.Map<String, Object>> response = controller.status();

        assertThat(response.data())
            .containsEntry("provider", "freesound")
            .containsEntry("enabled", false);
    }

    @Test
    void shouldDelegateAuthenticatedImportBySoundIdOnly() {
        AmbientLibraryService service = mock(AmbientLibraryService.class);
        AmbientSoundImportResponse imported = new AmbientSoundImportResponse(
            "freesound", "123", 9001L, "Rain", "author", "cc0", "CC0 公有领域",
            false, "https://freesound.org/s/123/", 60d,
            "https://signed.example/ambient.mp3", 600L, false);
        when(service.importSound("123")).thenReturn(imported);
        AmbientLibraryController controller = new AmbientLibraryController(
            mock(FreesoundProvider.class), new FreesoundProperties(), service);
        AmbientSoundImportRequest request = new AmbientSoundImportRequest();
        request.setSoundId("123");

        ApiResponse<AmbientSoundImportResponse> response = controller.importSound(request);

        assertThat(response.data()).isEqualTo(imported);
        assertThat(response.data().assetId()).isEqualTo(9001L);
    }
}
