package io.github.shizuki.site.media.service.download;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.service.authorization.AuthorizedMediaAssociation;
import io.github.shizuki.site.media.service.authorization.MediaAssociationAuthorizationService;
import io.github.shizuki.site.media.service.authorization.MediaAssociationRow;
import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OriginalDownloadAuthorizationServiceTest {

    private MediaAssociationMapper mapper;
    private MediaAssociationAuthorizationService presentationAuthorization;
    private OriginalDownloadCapabilityCodec codec;
    private String mediaRef;
    private MediaAssociationRow association;

    @BeforeEach
    void setUp() {
        mapper = Mockito.mock(MediaAssociationMapper.class);
        presentationAuthorization = Mockito.mock(MediaAssociationAuthorizationService.class);
        MediaGatewayProperties properties = new MediaGatewayProperties();
        properties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        properties.afterPropertiesSet();
        codec = new OriginalDownloadCapabilityCodec(properties);
        mediaRef = OpaqueMediaReference.generate(new SecureRandom());
        association = eligibleAssociation();
        when(mapper.findByMediaRef(mediaRef)).thenReturn(List.of(association));
    }

    @Test
    void publicOriginalDownloadRequiresANewVersionBoundCapability() {
        var issued = service().issue(mediaRef, null).orElseThrow();

        assertThat(service().authorize(mediaRef, issued.capability()))
            .contains(new AuthorizedOriginalDownload(mediaRef, 42L, 3, 2));

        association.setAssociationVersion(3);
        assertThat(service().authorize(mediaRef, issued.capability())).isEmpty();
    }

    @Test
    void noneAndSanitizedPoliciesNeverIssueOriginalCapability() {
        association.setDownloadMode("NONE");
        assertThat(service().issue(mediaRef, null)).isEmpty();

        association.setDownloadMode("SANITIZED");
        assertThat(service().issue(mediaRef, null)).isEmpty();
    }

    @Test
    void originalPolicyOnOneAssociationDoesNotElevateAnotherAssociationForTheSameSourcePhoto() {
        String otherMediaRef = OpaqueMediaReference.generate(new SecureRandom());
        MediaAssociationRow otherAssociation = eligibleAssociation();
        otherAssociation.setAssociationId(8L);
        otherAssociation.setMediaRef(otherMediaRef);
        otherAssociation.setDownloadMode("SANITIZED");
        when(mapper.findByMediaRef(otherMediaRef)).thenReturn(List.of(otherAssociation));

        var originalCapability = service().issue(mediaRef, null).orElseThrow();

        assertThat(service().issue(otherMediaRef, null)).isEmpty();
        assertThat(service().authorize(otherMediaRef, originalCapability.capability())).isEmpty();
        assertThat(service().authorize(mediaRef, originalCapability.capability())).isPresent();
    }

    @Test
    void unlistedOriginalCapabilityRequiresTheAssociationPresentationCapability() {
        association.setVisibilityStatus("UNLISTED");
        assertThat(service().issue(mediaRef, null)).isEmpty();

        when(presentationAuthorization.authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            "unlisted-cap"
        )).thenReturn(Optional.of(Mockito.mock(AuthorizedMediaAssociation.class)));

        assertThat(service().issue(mediaRef, "unlisted-cap")).isPresent();
    }

    @Test
    void revokedArchivedOrPrivateAssociationCannotUseAnExistingCapability() {
        var issued = service().issue(mediaRef, null).orElseThrow();

        association.setDeliveryRevoked(true);
        assertThat(service().authorize(mediaRef, issued.capability())).isEmpty();
        association.setDeliveryRevoked(false);
        association.setLifecycleStatus("ARCHIVED");
        assertThat(service().authorize(mediaRef, issued.capability())).isEmpty();
        association.setLifecycleStatus("PUBLISHED");
        association.setVisibilityStatus("PRIVATE");
        assertThat(service().authorize(mediaRef, issued.capability())).isEmpty();
    }

    private OriginalDownloadAuthorizationService service() {
        return new OriginalDownloadAuthorizationService(mapper, presentationAuthorization, codec);
    }

    private MediaAssociationRow eligibleAssociation() {
        MediaAssociationRow row = new MediaAssociationRow();
        row.setAssociationType("ALBUM");
        row.setAssociationId(7L);
        row.setMediaRef(mediaRef);
        row.setSourceAssetId(42L);
        row.setLifecycleStatus("PUBLISHED");
        row.setVisibilityStatus("PUBLIC");
        row.setProcessingStatus("READY");
        row.setDownloadMode("ORIGINAL");
        row.setDeliveryRevoked(false);
        row.setContentVersion(3);
        row.setAssociationVersion(2);
        return row;
    }
}
