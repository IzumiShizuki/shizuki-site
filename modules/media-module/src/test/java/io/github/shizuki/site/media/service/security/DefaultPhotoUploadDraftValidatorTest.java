package io.github.shizuki.site.media.service.security;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.model.AssetKindEnum;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DefaultPhotoUploadDraftValidatorTest {

    @ParameterizedTest
    @MethodSource("validImages")
    void validatesMagicDecodeLimitsAndFullStreamSha256(
        byte[] bytes,
        String contentType,
        AssetKindEnum assetKind,
        int width,
        int height,
        int frames
    ) {
        ProtectedPhotoProcessingContext context = validator(defaultLimits()).validate(
            new ByteArrayInputStream(bytes),
            bytes.length,
            contentType,
            assetKind
        );

        assertThat(context.draftMetadata())
            .extracting(
                ImageUploadDraftMetadata::sha256,
                ImageUploadDraftMetadata::detectedContentType,
                ImageUploadDraftMetadata::width,
                ImageUploadDraftMetadata::height,
                ImageUploadDraftMetadata::frameCount,
                ImageUploadDraftMetadata::publishable
            )
            .containsExactly(ImageUploadTestFixtures.sha256(bytes), contentType, width, height, frames, false);
    }

    @Test
    void keepsOriginalExifOnlyInsideProtectedProcessingContext() throws Exception {
        byte[] jpeg = ImageUploadTestFixtures.jpegWithExif(3, 2);

        ProtectedPhotoProcessingContext context = validator(defaultLimits()).validate(
            new ByteArrayInputStream(jpeg),
            jpeg.length,
            "image/jpeg",
            AssetKindEnum.STATIC_IMAGE
        );

        assertThat(context.hasProtectedExif()).isTrue();
        assertThat(context.draftMetadata().originalMetadataPresent()).isTrue();
        assertThat(ImageUploadDraftMetadata.class.getRecordComponents())
            .extracting(component -> component.getName().toLowerCase())
            .noneMatch(name -> name.contains("exif") || name.contains("coordinate") || name.contains("gps"));
        assertThat(Modifier.isPublic(
            ProtectedPhotoProcessingContext.class
                .getDeclaredMethod("originalExifPayloadForProcessing")
                .getModifiers()
        )).isFalse();

        byte[] firstRead = context.originalExifPayloadForProcessing();
        firstRead[0] = 0;
        assertThat(context.originalExifPayloadForProcessing()[0]).isNotZero();
    }

    @Test
    void rejectsMimeSpoofingBeforeDraftCanBecomePublishable() {
        byte[] png = ImageUploadTestFixtures.png(2, 2);

        assertRejected(png, png.length, "image/jpeg", AssetKindEnum.STATIC_IMAGE, "content type");
    }

    @Test
    void rejectsDamagedImageBeforeDraftCanBecomePublishable() {
        byte[] damaged = ImageUploadTestFixtures.damagedPng();

        assertRejected(damaged, damaged.length, "image/png", AssetKindEnum.STATIC_IMAGE, "damaged");
    }

    @Test
    void rejectsDeclaredAndActualEncodedByteOverflow() {
        MediaStorageProperties limits = defaultLimits();
        limits.setMaxUploadSize(16L);
        byte[] png = ImageUploadTestFixtures.png(2, 2);
        InputStream mustNotBeRead = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("stream should not be read after metadata overflow");
            }
        };

        assertThatThrownBy(() -> validator(limits).validate(
            mustNotBeRead,
            17L,
            "image/png",
            AssetKindEnum.STATIC_IMAGE
        )).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getMessage()).contains("byte limit")
        );

        assertThatThrownBy(() -> validator(limits).validate(
            new ByteArrayInputStream(png),
            0L,
            "image/png",
            AssetKindEnum.STATIC_IMAGE
        )).isInstanceOfSatisfying(BusinessException.class, exception ->
            assertThat(exception.getMessage()).contains("byte limit")
        );
    }

    @Test
    void rejectsPixelOverflowBeforeAllocatingAnOversizedDecodedFrame() {
        MediaStorageProperties limits = defaultLimits();
        limits.setMaxImagePixels(3L);
        byte[] png = ImageUploadTestFixtures.png(2, 2);

        assertThatThrownBy(() -> validator(limits).validate(
            new ByteArrayInputStream(png),
            png.length,
            "image/png",
            AssetKindEnum.STATIC_IMAGE
        )).isInstanceOfSatisfying(BusinessException.class, exception -> {
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST);
            assertThat(exception.getMessage()).contains("pixel limit");
        });
    }

    @Test
    void rejectsAnimatedImageFrameOverflow() {
        MediaStorageProperties limits = defaultLimits();
        limits.setMaxAnimatedImageFrames(1);
        byte[] gif = ImageUploadTestFixtures.gif(2, 2, 2);

        assertThatThrownBy(() -> validator(limits).validate(
            new ByteArrayInputStream(gif),
            gif.length,
            "image/gif",
            AssetKindEnum.ANIMATED_IMAGE
        )).isInstanceOfSatisfying(BusinessException.class, exception -> {
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST);
            assertThat(exception.getMessage()).contains("frame limit");
        });
    }

    @Test
    void rejectsUnsupportedDecoderEvenWhenMagicAndMimeAgree() {
        byte[] webp = ImageUploadTestFixtures.unsupportedWebpHeader();

        assertRejected(webp, webp.length, "image/webp", AssetKindEnum.STATIC_IMAGE, "safe decoder");
    }

    @Test
    void rejectsTruncatedStreamAgainstStorageMetadata() {
        byte[] png = ImageUploadTestFixtures.png(2, 2);

        assertRejected(png, png.length + 1L, "image/png", AssetKindEnum.STATIC_IMAGE, "storage metadata");
    }

    private static Stream<Arguments> validImages() {
        byte[] png = ImageUploadTestFixtures.png(3, 2);
        byte[] jpeg = ImageUploadTestFixtures.jpegWithExif(4, 3);
        byte[] gif = ImageUploadTestFixtures.gif(2, 3, 2);
        return Stream.of(
            Arguments.of(png, "image/png", AssetKindEnum.STATIC_IMAGE, 3, 2, 1),
            Arguments.of(jpeg, "image/jpeg", AssetKindEnum.STATIC_IMAGE, 4, 3, 1),
            Arguments.of(gif, "image/gif", AssetKindEnum.ANIMATED_IMAGE, 2, 3, 2)
        );
    }

    private MediaStorageProperties defaultLimits() {
        MediaStorageProperties properties = new MediaStorageProperties();
        properties.setMaxUploadSize(1024 * 1024L);
        properties.setMaxImagePixels(1_000_000L);
        properties.setMaxImageTotalPixels(2_000_000L);
        properties.setMaxAnimatedImageFrames(10);
        return properties;
    }

    private DefaultPhotoUploadDraftValidator validator(MediaStorageProperties properties) {
        return new DefaultPhotoUploadDraftValidator(properties);
    }

    private void assertRejected(
        byte[] bytes,
        long storageSize,
        String contentType,
        AssetKindEnum assetKind,
        String expectedMessage
    ) {
        assertThatThrownBy(() -> validator(defaultLimits()).validate(
            new ByteArrayInputStream(bytes),
            storageSize,
            contentType,
            assetKind
        )).isInstanceOfSatisfying(BusinessException.class, exception -> {
            assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST);
            assertThat(exception.getMessage()).containsIgnoringCase(expectedMessage);
        });
    }
}
