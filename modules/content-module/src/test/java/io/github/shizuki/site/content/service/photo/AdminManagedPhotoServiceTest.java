package io.github.shizuki.site.content.service.photo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.controller.photo.AdminManagedPhotoRequest;
import io.github.shizuki.site.content.controller.photo.AdminManagedPhotoResponse;
import io.github.shizuki.site.content.controller.photo.AdminManagedPhotoUpdateRequest;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.media.port.ManagedPhotoMediaPort;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminManagedPhotoServiceTest {

    @Mock
    private PhotoMapper photoMapper;
    @Mock
    private ManagedPhotoMediaPort mediaPort;

    private AdminManagedPhotoService service;

    @BeforeEach
    void setUp() {
        service = new AdminManagedPhotoService(photoMapper, mediaPort);
        LoginUserContext.set(new LoginUser(7L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void registersOnlyThroughTheMediaPrivacyBoundaryAndEnqueuesPrivateDerivatives() {
        when(photoMapper.insert(any(PhotoEntity.class))).thenAnswer(invocation -> {
            PhotoEntity photo = invocation.getArgument(0);
            photo.setId(41L);
            return 1;
        });
        when(photoMapper.selectManagedById(41L)).thenAnswer(invocation -> managedPhoto(41L, 0));

        AdminManagedPhotoResponse result = service.register(new AdminManagedPhotoRequest(
            99L, " Lake ", "Water at dusk", null, "Hangzhou", true
        ));

        assertThat(result.id()).isEqualTo(41L);
        assertThat(result.etag()).isEqualTo("\"v0\"");
        verify(mediaPort).requireOwnedPrivateImage(99L, 7L);
        verify(mediaPort).enqueuePrivateWorkingDerivatives(99L);
    }

    @Test
    void refusesLocationMetadataWithoutAnExplicitReviewAcknowledgement() {
        assertThatThrownBy(() -> service.register(new AdminManagedPhotoRequest(
            99L, "Lake", "Water", null, "Home address", false
        ))).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));

        verify(photoMapper, never()).insert(any(PhotoEntity.class));
        verify(mediaPort, never()).enqueuePrivateWorkingDerivatives(99L);
    }

    @Test
    void reportsTheCurrentVersionWhenAnEditorialUpdateIsStale() {
        when(photoMapper.selectManagedById(41L)).thenReturn(managedPhoto(41L, 4), managedPhoto(41L, 5));
        when(photoMapper.updateEditorial(41L, 4, "Lake", "Alt", null, null)).thenReturn(0);

        assertThatThrownBy(() -> service.update(41L, 4, new AdminManagedPhotoUpdateRequest(
            "Lake", "Alt", null, null, false
        ))).isInstanceOfSatisfying(BusinessException.class, exception -> {
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.CONFLICT);
            assertThat(exception.getDetails()).containsEntry("currentEtag", "\"v5\"");
        });
    }

    private PhotoEntity managedPhoto(long id, int version) {
        PhotoEntity photo = new PhotoEntity();
        photo.setId(id);
        photo.setTitle("Lake");
        photo.setAltText("Water at dusk");
        photo.setPublishedLocationLabel("Hangzhou");
        photo.setProcessingStatus("PENDING");
        photo.setDeleted(0);
        photo.setVersion(version);
        return photo;
    }
}
