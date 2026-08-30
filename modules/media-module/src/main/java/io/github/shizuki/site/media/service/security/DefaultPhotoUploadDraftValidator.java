package io.github.shizuki.site.media.service.security;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.model.AssetKindEnum;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.Iterator;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 使用 JDK ImageIO 完成有界读取、魔数识别和安全解码的上传草稿校验器。
 *
 * <p>当前可信解码范围为 JPEG、PNG 和 GIF。WebP/APNG 虽可在上传策略中声明，但在部署安全
 * 解码器前会失败关闭，不能因为扩展名或客户端 MIME 正确就进入可发布状态。
 */
@Component
public class DefaultPhotoUploadDraftValidator implements PhotoUploadDraftValidator {

    private static final byte[] PNG_SIGNATURE = new byte[] {
        (byte) 0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A
    };
    private static final byte[] GIF87A_SIGNATURE = "GIF87a".getBytes(StandardCharsets.US_ASCII);
    private static final byte[] GIF89A_SIGNATURE = "GIF89a".getBytes(StandardCharsets.US_ASCII);

    private final MediaStorageProperties properties;

    public DefaultPhotoUploadDraftValidator(MediaStorageProperties properties) {
        this.properties = properties;
    }

    @Override
    public ProtectedPhotoProcessingContext validate(
        InputStream inputStream,
        long storageSizeBytes,
        String declaredContentType,
        AssetKindEnum assetKind
    ) {
        requireImageKind(assetKind);
        validateLimits();
        if (inputStream == null) {
            throw invalid("Uploaded image content is unavailable");
        }
        if (storageSizeBytes < 0L || storageSizeBytes > properties.getMaxUploadSize()) {
            throw invalid("Uploaded image exceeds the encoded byte limit");
        }

        EncodedImage encoded = readCompleteObject(inputStream, storageSizeBytes);
        DetectedImageFormat detected = detectFormat(encoded.bytes());
        String normalizedDeclaredType = normalizeContentType(declaredContentType);
        if (!detected.contentType().equals(normalizedDeclaredType)) {
            throw invalid("Declared image content type does not match the object signature");
        }
        validateKindMatchesFormat(assetKind, detected);

        DecodedImage decoded = decodeAllFrames(encoded.bytes(), detected, assetKind);
        byte[] protectedExif = extractProtectedExif(encoded.bytes(), detected);
        ImageUploadDraftMetadata draftMetadata = new ImageUploadDraftMetadata(
            encoded.sha256(),
            detected.contentType(),
            encoded.bytes().length,
            decoded.width(),
            decoded.height(),
            decoded.frameCount(),
            protectedExif.length > 0,
            false
        );
        return new ProtectedPhotoProcessingContext(draftMetadata, protectedExif);
    }

    private EncodedImage readCompleteObject(InputStream inputStream, long storageSizeBytes) {
        MessageDigest digest = sha256Digest();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        long total = 0L;
        try {
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                total += read;
                if (total > properties.getMaxUploadSize() || total > Integer.MAX_VALUE - 8L) {
                    throw invalid("Uploaded image exceeds the encoded byte limit");
                }
                digest.update(buffer, 0, read);
                output.write(buffer, 0, read);
            }
        } catch (BusinessException exception) {
            throw exception;
        } catch (IOException exception) {
            throw invalid("Uploaded image could not be read completely");
        }
        if (total == 0L) {
            throw invalid("Uploaded image is empty");
        }
        if (storageSizeBytes > 0L && total != storageSizeBytes) {
            throw invalid("Uploaded image size differs from storage metadata");
        }
        return new EncodedImage(output.toByteArray(), HexFormat.of().formatHex(digest.digest()));
    }

    private DetectedImageFormat detectFormat(byte[] bytes) {
        if (startsWith(bytes, PNG_SIGNATURE)) {
            if (containsPngChunk(bytes, "acTL")) {
                return new DetectedImageFormat("image/apng", "PNG", false);
            }
            return new DetectedImageFormat("image/png", "PNG", true);
        }
        if (bytes.length >= 3
            && (bytes[0] & 0xFF) == 0xFF
            && (bytes[1] & 0xFF) == 0xD8
            && (bytes[2] & 0xFF) == 0xFF) {
            return new DetectedImageFormat("image/jpeg", "JPEG", true);
        }
        if (startsWith(bytes, GIF87A_SIGNATURE) || startsWith(bytes, GIF89A_SIGNATURE)) {
            return new DetectedImageFormat("image/gif", "GIF", true);
        }
        if (bytes.length >= 12
            && asciiEquals(bytes, 0, "RIFF")
            && asciiEquals(bytes, 8, "WEBP")) {
            return new DetectedImageFormat("image/webp", "WEBP", false);
        }
        throw invalid("Unsupported or unrecognized image signature");
    }

    private DecodedImage decodeAllFrames(
        byte[] bytes,
        DetectedImageFormat detected,
        AssetKindEnum assetKind
    ) {
        if (!detected.safeDecoderAvailable()) {
            throw invalid("No approved safe decoder is available for the uploaded image format");
        }
        try (ImageInputStream imageInput = ImageIO.createImageInputStream(new ByteArrayInputStream(bytes))) {
            if (imageInput == null) {
                throw invalid("Uploaded image could not be decoded");
            }
            Iterator<ImageReader> readers = ImageIO.getImageReaders(imageInput);
            if (!readers.hasNext()) {
                throw invalid("Uploaded image has no safe decoder");
            }
            ImageReader reader = readers.next();
            try {
                if (!reader.getFormatName().equalsIgnoreCase(detected.readerFormat())) {
                    throw invalid("Decoded image format differs from its signature");
                }
                // Frame counting needs a searchable input. The encoded object is already bounded and
                // held in memory, so random access is safe here and avoids ImageReader rejecting
                // getNumImages(true) when seekForwardOnly is enabled.
                reader.setInput(imageInput, false, false);
                int frameCount = reader.getNumImages(true);
                if (frameCount <= 0) {
                    throw invalid("Uploaded image contains no decodable frame");
                }
                if (assetKind == AssetKindEnum.STATIC_IMAGE && frameCount != 1) {
                    throw invalid("Static image upload contains multiple frames");
                }
                if (frameCount > properties.getMaxAnimatedImageFrames()) {
                    throw invalid("Uploaded image exceeds the frame limit");
                }

                long totalPixels = 0L;
                int firstWidth = 0;
                int firstHeight = 0;
                for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
                    int width = reader.getWidth(frameIndex);
                    int height = reader.getHeight(frameIndex);
                    long framePixels = multiplyPixels(width, height);
                    if (framePixels > properties.getMaxImagePixels()) {
                        throw invalid("Uploaded image exceeds the per-frame pixel limit");
                    }
                    totalPixels = Math.addExact(totalPixels, framePixels);
                    if (totalPixels > properties.getMaxImageTotalPixels()) {
                        throw invalid("Uploaded image exceeds the total decoded pixel limit");
                    }
                    BufferedImage decodedFrame = reader.read(frameIndex);
                    if (decodedFrame == null
                        || decodedFrame.getWidth() != width
                        || decodedFrame.getHeight() != height) {
                        throw invalid("Uploaded image frame could not be decoded safely");
                    }
                    decodedFrame.flush();
                    if (frameIndex == 0) {
                        firstWidth = width;
                        firstHeight = height;
                    }
                }
                return new DecodedImage(firstWidth, firstHeight, frameCount);
            } finally {
                reader.dispose();
            }
        } catch (BusinessException exception) {
            throw exception;
        } catch (IOException | RuntimeException exception) {
            throw invalid("Uploaded image is damaged or unsafe to decode");
        }
    }

    private byte[] extractProtectedExif(byte[] bytes, DetectedImageFormat format) {
        if ("image/jpeg".equals(format.contentType())) {
            return extractJpegExif(bytes);
        }
        if ("image/png".equals(format.contentType())) {
            return extractPngExif(bytes);
        }
        return new byte[0];
    }

    private byte[] extractJpegExif(byte[] bytes) {
        int offset = 2;
        while (offset + 4 <= bytes.length) {
            if ((bytes[offset] & 0xFF) != 0xFF) {
                return new byte[0];
            }
            int marker = bytes[offset + 1] & 0xFF;
            offset += 2;
            if (marker == 0xDA || marker == 0xD9) {
                break;
            }
            if (marker == 0x01 || (marker >= 0xD0 && marker <= 0xD7)) {
                continue;
            }
            if (offset + 2 > bytes.length) {
                return new byte[0];
            }
            int segmentLength = unsignedShort(bytes, offset);
            if (segmentLength < 2 || offset + segmentLength > bytes.length) {
                return new byte[0];
            }
            int payloadOffset = offset + 2;
            int payloadLength = segmentLength - 2;
            if (marker == 0xE1
                && payloadLength >= 6
                && asciiEquals(bytes, payloadOffset, "Exif")
                && bytes[payloadOffset + 4] == 0
                && bytes[payloadOffset + 5] == 0) {
                return Arrays.copyOfRange(bytes, payloadOffset, payloadOffset + payloadLength);
            }
            offset += segmentLength;
        }
        return new byte[0];
    }

    private byte[] extractPngExif(byte[] bytes) {
        int offset = PNG_SIGNATURE.length;
        while (offset + 12 <= bytes.length) {
            long length = unsignedInt(bytes, offset);
            long nextOffset = (long) offset + 12L + length;
            if (length > Integer.MAX_VALUE || nextOffset > bytes.length) {
                return new byte[0];
            }
            if (asciiEquals(bytes, offset + 4, "eXIf")) {
                return Arrays.copyOfRange(bytes, offset + 8, offset + 8 + (int) length);
            }
            offset = (int) nextOffset;
        }
        return new byte[0];
    }

    private boolean containsPngChunk(byte[] bytes, String expectedType) {
        int offset = PNG_SIGNATURE.length;
        while (offset + 12 <= bytes.length) {
            long length = unsignedInt(bytes, offset);
            long nextOffset = (long) offset + 12L + length;
            if (length > Integer.MAX_VALUE || nextOffset > bytes.length) {
                throw invalid("PNG chunk structure is damaged");
            }
            if (asciiEquals(bytes, offset + 4, expectedType)) {
                return true;
            }
            offset = (int) nextOffset;
        }
        return false;
    }

    private void validateKindMatchesFormat(AssetKindEnum assetKind, DetectedImageFormat format) {
        if (assetKind == AssetKindEnum.STATIC_IMAGE
            && !("image/jpeg".equals(format.contentType()) || "image/png".equals(format.contentType())
            || "image/webp".equals(format.contentType()))) {
            throw invalid("Animated image signature is not allowed for a static image draft");
        }
        if (assetKind == AssetKindEnum.ANIMATED_IMAGE
            && !("image/gif".equals(format.contentType()) || "image/apng".equals(format.contentType())
            || "image/webp".equals(format.contentType()))) {
            throw invalid("Static image signature is not allowed for an animated image draft");
        }
    }

    private void requireImageKind(AssetKindEnum assetKind) {
        if (assetKind != AssetKindEnum.STATIC_IMAGE && assetKind != AssetKindEnum.ANIMATED_IMAGE) {
            throw new IllegalArgumentException("photo draft validation requires an image asset kind");
        }
    }

    private void validateLimits() {
        if (properties.getMaxUploadSize() <= 0L
            || properties.getMaxImagePixels() <= 0L
            || properties.getMaxImageTotalPixels() <= 0L
            || properties.getMaxAnimatedImageFrames() <= 0) {
            throw new IllegalStateException("image upload safety limits must be positive");
        }
    }

    private long multiplyPixels(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw invalid("Uploaded image dimensions are invalid");
        }
        return Math.multiplyExact((long) width, (long) height);
    }

    private String normalizeContentType(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw invalid("Declared image content type is required");
        }
        String normalized = raw.trim().toLowerCase(Locale.ROOT);
        int semicolon = normalized.indexOf(';');
        return semicolon >= 0 ? normalized.substring(0, semicolon).trim() : normalized;
    }

    private MessageDigest sha256Digest() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("SHA-256 is unavailable", exception);
        }
    }

    private boolean startsWith(byte[] bytes, byte[] signature) {
        if (bytes.length < signature.length) {
            return false;
        }
        for (int index = 0; index < signature.length; index++) {
            if (bytes[index] != signature[index]) {
                return false;
            }
        }
        return true;
    }

    private boolean asciiEquals(byte[] bytes, int offset, String expected) {
        byte[] expectedBytes = expected.getBytes(StandardCharsets.US_ASCII);
        if (offset < 0 || offset + expectedBytes.length > bytes.length) {
            return false;
        }
        for (int index = 0; index < expectedBytes.length; index++) {
            if (bytes[offset + index] != expectedBytes[index]) {
                return false;
            }
        }
        return true;
    }

    private int unsignedShort(byte[] bytes, int offset) {
        return ((bytes[offset] & 0xFF) << 8) | (bytes[offset + 1] & 0xFF);
    }

    private long unsignedInt(byte[] bytes, int offset) {
        return ((long) (bytes[offset] & 0xFF) << 24)
            | ((long) (bytes[offset + 1] & 0xFF) << 16)
            | ((long) (bytes[offset + 2] & 0xFF) << 8)
            | (bytes[offset + 3] & 0xFFL);
    }

    private BusinessException invalid(String message) {
        return new BusinessException(ErrorCode.BAD_REQUEST, message);
    }

    private record EncodedImage(byte[] bytes, String sha256) {
    }

    private record DetectedImageFormat(String contentType, String readerFormat, boolean safeDecoderAvailable) {
    }

    private record DecodedImage(int width, int height, int frameCount) {
    }
}
