package io.github.shizuki.site.media.service.download;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.request.PhotoDownloadPolicyUpdateRequest;
import io.github.shizuki.site.media.service.authorization.MediaAssociationRow;
import java.security.SecureRandom;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PhotoDownloadPolicyServiceTest {

    private MediaAssociationMapper mapper;
    private String mediaRef;
    private MediaAssociationRow association;

    @BeforeEach
    void setUp() {
        mapper = Mockito.mock(MediaAssociationMapper.class);
        mediaRef = OpaqueMediaReference.generate(new SecureRandom());
        association = new MediaAssociationRow();
        association.setAssociationType("ALBUM");
        association.setAssociationId(7L);
        association.setAssociationVersion(2);
        when(mapper.findByMediaRef(mediaRef)).thenReturn(List.of(association));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void originalModeRequiresExplicitPrivacyAcknowledgement() {
        setAdmin();

        assertThatThrownBy(() -> service().update(
            mediaRef,
            new PhotoDownloadPolicyUpdateRequest(PhotoDownloadModeEnum.ORIGINAL, 2, false)
        )).isInstanceOf(BusinessException.class)
            .hasMessageContaining("explicit metadata and privacy acknowledgement");
        verify(mapper, never()).updateAlbumDownloadMode(Mockito.anyLong(), Mockito.anyInt(), Mockito.anyString());
    }

    @Test
    void acknowledgedOriginalModeUpdatesOnlyTheExactAlbumAssociationVersion() {
        setAdmin();
        when(mapper.updateAlbumDownloadMode(7L, 2, "ORIGINAL")).thenReturn(1);

        var result = service().update(
            mediaRef,
            new PhotoDownloadPolicyUpdateRequest(PhotoDownloadModeEnum.ORIGINAL, 2, true)
        );

        assertThat(result.version()).isEqualTo(3);
        assertThat(result.etag()).isEqualTo("\"v3\"");
        verify(mapper).updateAlbumDownloadMode(7L, 2, "ORIGINAL");
    }

    @Test
    void momentsCannotAcquireAnAlbumDownloadPolicy() {
        setAdmin();
        association.setAssociationType("MOMENT");

        assertThatThrownBy(() -> service().update(
            mediaRef,
            new PhotoDownloadPolicyUpdateRequest(PhotoDownloadModeEnum.SANITIZED, 2, false)
        )).isInstanceOf(BusinessException.class);
    }

    @Test
    void serviceRequiresBothAdminGroupAndLifeContentPermission() {
        LoginUserContext.set(new LoginUser(9L, Set.of("ADMIN"), Set.of()));

        assertThatThrownBy(() -> service().update(
            mediaRef,
            new PhotoDownloadPolicyUpdateRequest(PhotoDownloadModeEnum.NONE, 2, false)
        )).isInstanceOf(BusinessException.class)
            .hasMessageContaining("permission is required");
        verify(mapper, never()).findByMediaRef(mediaRef);
    }

    private void setAdmin() {
        LoginUserContext.set(new LoginUser(9L, Set.of("ADMIN"), Set.of("life.content.manage")));
    }

    private PhotoDownloadPolicyService service() {
        return new PhotoDownloadPolicyService(mapper);
    }
}
