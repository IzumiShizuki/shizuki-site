package io.github.shizuki.site.media.service.authorization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.response.PublicMediaPresentationResponse;
import io.github.shizuki.site.media.service.gateway.MediaGatewayCapabilityCodec;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import java.security.SecureRandom;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MediaAssociationAuthorizationServiceTest {

    private MediaAssociationMapper associationMapper;
    private MediaAssetVariantMapper variantMapper;
    private MediaDerivativeFeatureProperties properties;
    private MediaGatewayCapabilityCodec capabilityCodec;
    private String mediaRef;
    private MediaAssociationRow association;

    @BeforeEach
    void setUp() {
        associationMapper = Mockito.mock(MediaAssociationMapper.class);
        variantMapper = Mockito.mock(MediaAssetVariantMapper.class);
        properties = new MediaDerivativeFeatureProperties();
        properties.setProcessorVersion("v7");
        MediaGatewayProperties gatewayProperties = new MediaGatewayProperties();
        gatewayProperties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        gatewayProperties.afterPropertiesSet();
        capabilityCodec = new MediaGatewayCapabilityCodec(gatewayProperties);
        mediaRef = OpaqueMediaReference.generate(new SecureRandom());
        association = publicAssociation();
        when(associationMapper.findByMediaRef(mediaRef)).thenReturn(List.of(association));
    }

    @AfterEach
    void tearDown() {
        LoginUserContext.clear();
    }

    @Test
    void returnsOnlySiteOwnedRoutesForEligiblePublicAssociationVariants() throws Exception {
        when(variantMapper.findByIdentity(
            Mockito.eq(42L),
            Mockito.anyString(),
            Mockito.eq("PUBLIC_MATERIALIZED"),
            Mockito.eq("v7")
        )).thenAnswer(invocation -> switch (invocation.getArgument(1, String.class)) {
            case "THUMB_WEBP" -> readyVariant(101L, 480, 360);
            case "DISPLAY_WEBP" -> readyVariant(102L, 1280, 720);
            case "FULL_SANITIZED" -> readyVariant(103L, 2560, 1440);
            default -> null;
        });

        PublicMediaPresentationResponse response = service()
            .resolvePublicPresentation(mediaRef)
            .orElseThrow();

        assertThat(response.variants()).extracting(route -> route.variant().name())
            .containsExactly("THUMB_WEBP", "DISPLAY_WEBP", "FULL_SANITIZED");
        assertThat(response.variants()).allSatisfy(route ->
            assertThat(route.path()).startsWith("/api/v1/media/" + mediaRef + "/variants/")
        );
        String json = new ObjectMapper().writeValueAsString(response).toLowerCase();
        assertThat(json)
            .doesNotContain("bucket", "objectkey", "object_key", "signature", "x-oss", "http://", "https://")
            .contains("/api/v1/media/med_");
    }

    @Test
    void rejectsUnlistedPrivateDraftAndNonReadyAssociationsWithoutLookingUpStorage() {
        association.setVisibilityStatus("UNLISTED");
        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).isEmpty();

        association.setVisibilityStatus("PRIVATE");
        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).isEmpty();

        association.setVisibilityStatus("PUBLIC");
        association.setLifecycleStatus("DRAFT");
        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).isEmpty();

        association.setLifecycleStatus("PUBLISHED");
        association.setProcessingStatus("FAILED");
        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).isEmpty();

        verify(variantMapper, never()).findByIdentity(
            Mockito.anyLong(),
            anyString(),
            anyString(),
            anyString()
        );
    }

    @Test
    void appliesSanitizedDownloadPermissionPerAssociation() {
        association.setDownloadMode("NONE");

        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.FULL_SANITIZED)).isEmpty();

        association.setDownloadMode("SANITIZED");
        when(variantMapper.findByIdentity(42L, "FULL_SANITIZED", "PUBLIC_MATERIALIZED", "v7"))
            .thenReturn(readyVariant(103L, 2560, 1440));
        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.FULL_SANITIZED)).isPresent();
    }

    @Test
    void deniesAmbiguousReferencesEvenIfTheDatabaseWereToContainACrossTableCollision() {
        when(associationMapper.findByMediaRef(mediaRef)).thenReturn(List.of(association, publicAssociation()));

        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).isEmpty();
    }

    @Test
    void deniesAssociationWhoseDeliveryGateWasRevokedBeforeTheContentTransition() {
        association.setDeliveryRevoked(true);

        assertThat(service().authorizePublicVariant(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)).isEmpty();
        verify(variantMapper, never()).findByIdentity(
            Mockito.anyLong(),
            anyString(),
            anyString(),
            anyString()
        );
    }

    @Test
    void unlistedCapabilityIsAssociationVariantAndVersionBound() {
        association.setVisibilityStatus("UNLISTED");
        when(variantMapper.findByIdentity(42L, "DISPLAY_WEBP", "PRIVATE_WORKING", "v7"))
            .thenReturn(readyVariant(201L, 1280, 720));

        String capability = service()
            .issueUnlistedCapability(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)
            .orElseThrow();

        assertThat(service().authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            capability
        )).isPresent();
        assertThat(service().authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.THUMB_WEBP,
            capability
        )).isEmpty();

        association.setContentVersion(4);
        assertThat(service().authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            capability
        )).isEmpty();
    }

    @Test
    void adminPreviewCapabilityRequiresTheBoundCurrentAdministrator() {
        association.setLifecycleStatus("DRAFT");
        association.setVisibilityStatus("PRIVATE");
        when(variantMapper.findByIdentity(42L, "DISPLAY_WEBP", "PRIVATE_WORKING", "v7"))
            .thenReturn(readyVariant(301L, 1280, 720));
        LoginUserContext.set(new LoginUser(9L, java.util.Set.of("ADMIN"), java.util.Set.of()));

        String capability = service()
            .issueAdminPreviewCapability(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP)
            .orElseThrow();
        assertThat(service().authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            capability
        )).isPresent();

        LoginUserContext.set(new LoginUser(10L, java.util.Set.of("ADMIN"), java.util.Set.of()));
        assertThat(service().authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            capability
        )).isEmpty();
    }

    private MediaAssociationAuthorizationService service() {
        return new MediaAssociationAuthorizationService(
            associationMapper,
            variantMapper,
            properties,
            capabilityCodec
        );
    }

    private MediaAssociationRow publicAssociation() {
        MediaAssociationRow row = new MediaAssociationRow();
        row.setAssociationType("ALBUM");
        row.setAssociationId(7L);
        row.setMediaRef(mediaRef);
        row.setPhotoId(8L);
        row.setSourceAssetId(42L);
        row.setAltText("一张安全的照片");
        row.setProcessingStatus("READY");
        row.setLifecycleStatus("PUBLISHED");
        row.setVisibilityStatus("PUBLIC");
        row.setContentVersion(3);
        row.setAssociationVersion(2);
        row.setDownloadMode("SANITIZED");
        row.setDeliveryRevoked(false);
        return row;
    }

    private MediaAssetVariantEntity readyVariant(long assetId, int width, int height) {
        MediaAssetVariantEntity entity = new MediaAssetVariantEntity();
        entity.setVariantAssetId(assetId);
        entity.setProcessStatus("READY");
        entity.setWidth(width);
        entity.setHeight(height);
        return entity;
    }
}
