package io.github.shizuki.site.media.service.security;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import org.junit.jupiter.api.Test;

class DefaultDerivativeOutputInspectorTest {

    private static final byte[] CLEAN_WEBP = Base64.getDecoder().decode(
        "UklGRjgAAABXRUJQVlA4ICwAAADQAQCdASoDAAIAAUAmJaACdLoB+AADsAD+899n/npmvMH+Tn/xZyMR2XgAAA=="
    );

    @Test
    void completelyDecodesCleanWebpAndReturnsVerifiedDimensionsAndHash() {
        DerivativeOutputInspection result = inspector(defaultLimits()).inspect(
            new ByteArrayInputStream(CLEAN_WEBP),
            CLEAN_WEBP.length,
            "image/webp",
            ImageVariantTypeEnum.DISPLAY_WEBP
        );

        assertThat(result.width()).isEqualTo(3);
        assertThat(result.height()).isEqualTo(2);
        assertThat(result.frameCount()).isEqualTo(1);
        assertThat(result.sha256()).matches("[0-9a-f]{64}");
    }

    @Test
    void rejectsGpsCameraAndDeviceExifEvenWhenThePixelsStillDecode() {
        byte[] exif = "Exif\0\0GPSLatitude=31.230416;GPSLongitude=121.473701;Camera=Test;Device=Phone"
            .getBytes(StandardCharsets.ISO_8859_1);
        byte[] unsafeWebp = appendChunk(CLEAN_WEBP, "EXIF", exif);

        assertThatThrownBy(() -> inspector(defaultLimits()).inspect(
            new ByteArrayInputStream(unsafeWebp),
            unsafeWebp.length,
            "image/webp",
            ImageVariantTypeEnum.FULL_SANITIZED
        )).isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("private metadata");
    }

    @Test
    void rejectsEquivalentXmpAndIccMetadataChunks() {
        for (String chunkType : new String[] {"XMP ", "ICCP"}) {
            byte[] unsafeWebp = appendChunk(
                CLEAN_WEBP,
                chunkType,
                "device-model-private-data".getBytes(StandardCharsets.US_ASCII)
            );
            assertThatThrownBy(() -> inspector(defaultLimits()).inspect(
                new ByteArrayInputStream(unsafeWebp),
                unsafeWebp.length,
                "image/webp",
                ImageVariantTypeEnum.THUMB_WEBP
            )).isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("private metadata");
        }
    }

    @Test
    void rejectsTruncatedAndOversizedDecodedOutput() {
        assertThatThrownBy(() -> inspector(defaultLimits()).inspect(
            new ByteArrayInputStream(Arrays.copyOf(CLEAN_WEBP, CLEAN_WEBP.length - 1)),
            CLEAN_WEBP.length,
            "image/webp",
            ImageVariantTypeEnum.DISPLAY_WEBP
        )).isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("size differs");

        MediaStorageProperties smallPixelLimit = defaultLimits();
        smallPixelLimit.setMaxImagePixels(5);
        assertThatThrownBy(() -> inspector(smallPixelLimit).inspect(
            new ByteArrayInputStream(CLEAN_WEBP),
            CLEAN_WEBP.length,
            "image/webp",
            ImageVariantTypeEnum.DISPLAY_WEBP
        )).isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("pixel limit");
    }

    @Test
    void keepsAvifIneligibleWithoutAnIndependentDecoder() {
        assertThat(inspector(defaultLimits()).supports(ImageVariantTypeEnum.DISPLAY_AVIF)).isFalse();
    }

    private DefaultDerivativeOutputInspector inspector(MediaStorageProperties properties) {
        return new DefaultDerivativeOutputInspector(properties);
    }

    private MediaStorageProperties defaultLimits() {
        MediaStorageProperties properties = new MediaStorageProperties();
        properties.setMaxUploadSize(1024 * 1024L);
        properties.setMaxImagePixels(1_000_000L);
        properties.setMaxImageTotalPixels(1_000_000L);
        properties.setMaxAnimatedImageFrames(1);
        return properties;
    }

    private byte[] appendChunk(byte[] webp, String chunkType, byte[] payload) {
        int padding = payload.length & 1;
        byte[] result = Arrays.copyOf(webp, webp.length + 8 + payload.length + padding);
        int offset = webp.length;
        byte[] type = chunkType.getBytes(StandardCharsets.US_ASCII);
        System.arraycopy(type, 0, result, offset, 4);
        writeLittleEndianInt(result, offset + 4, payload.length);
        System.arraycopy(payload, 0, result, offset + 8, payload.length);
        writeLittleEndianInt(result, 4, result.length - 8);
        return result;
    }

    private void writeLittleEndianInt(byte[] target, int offset, int value) {
        target[offset] = (byte) value;
        target[offset + 1] = (byte) (value >>> 8);
        target[offset + 2] = (byte) (value >>> 16);
        target[offset + 3] = (byte) (value >>> 24);
    }
}
