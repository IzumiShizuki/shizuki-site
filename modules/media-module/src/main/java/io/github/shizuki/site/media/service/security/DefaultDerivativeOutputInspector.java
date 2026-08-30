package io.github.shizuki.site.media.service.security;

import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 * WebP 独立复检器。完整读取、解析 RIFF、拒绝隐私元数据块并用 ImageIO 插件解码全部帧。
 * AVIF 在没有独立安全解码器时明确返回不支持，因此不会被加入访客派生计划。
 */
@Component
public class DefaultDerivativeOutputInspector implements DerivativeOutputInspector {

    private static final Set<String> PRIVATE_WEBP_CHUNKS = Set.of("EXIF", "XMP ", "ICCP");
    private static final Set<String> PRIVATE_METADATA_TOKENS = Set.of(
        "exif", "gps", "xmp", "iptc", "photoshop", "camera", "device",
        "latitude", "longitude", "geolocation"
    );

    private final MediaStorageProperties properties;

    public DefaultDerivativeOutputInspector(MediaStorageProperties properties) {
        this.properties = properties;
        ImageIO.scanForPlugins();
    }

    @Override
    public boolean supports(ImageVariantTypeEnum variant) {
        return variant != null
            && variant != ImageVariantTypeEnum.DISPLAY_AVIF
            && ImageIO.getImageReadersByMIMEType("image/webp").hasNext();
    }

    @Override
    public DerivativeOutputInspection inspect(InputStream inputStream,
                                              long storageSizeBytes,
                                              String storageContentType,
                                              ImageVariantTypeEnum variant) {
        if (!supports(variant)) {
            throw new IllegalStateException("no approved independent decoder is available for this derivative");
        }
        String normalizedType = normalizeContentType(storageContentType);
        if (!"image/webp".equals(normalizedType)) {
            throw invalid("derivative storage content type is not image/webp");
        }
        byte[] bytes = readCompleteObject(inputStream, storageSizeBytes);
        rejectPrivateWebpChunks(bytes);
        Decoded decoded = decodeAllFrames(bytes);
        return new DerivativeOutputInspection(
            sha256(bytes),
            decoded.width(),
            decoded.height(),
            decoded.frameCount()
        );
    }

    private byte[] readCompleteObject(InputStream inputStream, long storageSizeBytes) {
        if (inputStream == null) {
            throw invalid("derivative object stream is unavailable");
        }
        if (storageSizeBytes <= 0 || storageSizeBytes > properties.getMaxUploadSize()) {
            throw invalid("derivative object exceeds the encoded byte limit");
        }
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        long total = 0;
        try {
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                total += read;
                if (total > properties.getMaxUploadSize() || total > Integer.MAX_VALUE - 8L) {
                    throw invalid("derivative object exceeds the encoded byte limit");
                }
                output.write(buffer, 0, read);
            }
        } catch (IllegalStateException exception) {
            throw exception;
        } catch (IOException exception) {
            throw invalid("derivative object could not be read completely");
        }
        if (total != storageSizeBytes) {
            throw invalid("derivative object size differs from storage metadata");
        }
        return output.toByteArray();
    }

    private void rejectPrivateWebpChunks(byte[] bytes) {
        if (bytes.length < 12 || !asciiEquals(bytes, 0, "RIFF") || !asciiEquals(bytes, 8, "WEBP")) {
            throw invalid("derivative object is not a WebP container");
        }
        long declaredLength = littleEndianUnsignedInt(bytes, 4) + 8L;
        if (declaredLength != bytes.length) {
            throw invalid("derivative WebP container length is invalid");
        }

        int offset = 12;
        while (offset < bytes.length) {
            if (offset + 8 > bytes.length) {
                throw invalid("derivative WebP chunk header is truncated");
            }
            String chunkType = new String(bytes, offset, 4, StandardCharsets.US_ASCII);
            long chunkLength = littleEndianUnsignedInt(bytes, offset + 4);
            long next = (long) offset + 8L + chunkLength + (chunkLength & 1L);
            if (next > bytes.length || next > Integer.MAX_VALUE) {
                throw invalid("derivative WebP chunk is truncated");
            }
            if (PRIVATE_WEBP_CHUNKS.contains(chunkType)) {
                throw invalid("derivative contains embedded private metadata");
            }
            offset = (int) next;
        }
        if (offset != bytes.length) {
            throw invalid("derivative WebP chunk alignment is invalid");
        }
    }

    private Decoded decodeAllFrames(byte[] bytes) {
        try (ImageInputStream imageInput = ImageIO.createImageInputStream(new ByteArrayInputStream(bytes))) {
            if (imageInput == null) {
                throw invalid("derivative object could not be decoded");
            }
            Iterator<ImageReader> readers = ImageIO.getImageReaders(imageInput);
            if (!readers.hasNext()) {
                throw invalid("derivative object has no approved decoder");
            }
            ImageReader reader = readers.next();
            try {
                if (!"webp".equalsIgnoreCase(reader.getFormatName())) {
                    throw invalid("derivative decoder format does not match WebP");
                }
                reader.setInput(imageInput, false, false);
                int frameCount = reader.getNumImages(true);
                if (frameCount != 1) {
                    throw invalid("visitor derivative must contain exactly one decoded frame");
                }
                int width = reader.getWidth(0);
                int height = reader.getHeight(0);
                long pixels = multiplyPixels(width, height);
                if (pixels > properties.getMaxImagePixels()) {
                    throw invalid("derivative object exceeds the decoded pixel limit");
                }
                IIOMetadata metadata = reader.getImageMetadata(0);
                rejectPrivateMetadataTree(metadata);
                BufferedImage image = reader.read(0);
                if (image == null || image.getWidth() != width || image.getHeight() != height) {
                    throw invalid("derivative frame could not be decoded completely");
                }
                image.flush();
                return new Decoded(width, height, frameCount);
            } finally {
                reader.dispose();
            }
        } catch (IllegalStateException exception) {
            throw exception;
        } catch (IOException | RuntimeException exception) {
            throw invalid("derivative object is damaged or unsafe to decode");
        }
    }

    private void rejectPrivateMetadataTree(IIOMetadata metadata) {
        if (metadata == null || metadata.getMetadataFormatNames() == null) {
            return;
        }
        for (String formatName : metadata.getMetadataFormatNames()) {
            if (containsPrivateToken(formatName)) {
                throw invalid("derivative metadata format is not visitor-safe");
            }
            scanMetadataNode(metadata.getAsTree(formatName));
        }
    }

    private void scanMetadataNode(Node node) {
        if (node == null) {
            return;
        }
        if (containsPrivateToken(node.getNodeName()) || containsPrivateToken(node.getNodeValue())) {
            throw invalid("derivative metadata tree is not visitor-safe");
        }
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            for (int index = 0; index < attributes.getLength(); index++) {
                Node attribute = attributes.item(index);
                if (containsPrivateToken(attribute.getNodeName())
                    || containsPrivateToken(attribute.getNodeValue())) {
                    throw invalid("derivative metadata attribute is not visitor-safe");
                }
            }
        }
        Node child = node.getFirstChild();
        while (child != null) {
            scanMetadataNode(child);
            child = child.getNextSibling();
        }
    }

    private boolean containsPrivateToken(String raw) {
        if (raw == null) {
            return false;
        }
        String normalized = raw.toLowerCase(Locale.ROOT);
        return PRIVATE_METADATA_TOKENS.stream().anyMatch(normalized::contains);
    }

    private String sha256(byte[] bytes) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("SHA-256 is unavailable", exception);
        }
    }

    private long multiplyPixels(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw invalid("derivative dimensions are invalid");
        }
        return Math.multiplyExact((long) width, (long) height);
    }

    private String normalizeContentType(String raw) {
        if (!StringUtils.hasText(raw)) {
            return null;
        }
        String normalized = raw.trim().toLowerCase(Locale.ROOT);
        int semicolon = normalized.indexOf(';');
        return semicolon < 0 ? normalized : normalized.substring(0, semicolon).trim();
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

    private long littleEndianUnsignedInt(byte[] bytes, int offset) {
        return (bytes[offset] & 0xFFL)
            | ((bytes[offset + 1] & 0xFFL) << 8)
            | ((bytes[offset + 2] & 0xFFL) << 16)
            | ((bytes[offset + 3] & 0xFFL) << 24);
    }

    private IllegalStateException invalid(String message) {
        return new IllegalStateException(message);
    }

    private record Decoded(int width, int height, int frameCount) {
    }
}
