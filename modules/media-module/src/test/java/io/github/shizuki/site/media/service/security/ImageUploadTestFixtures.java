package io.github.shizuki.site.media.service.security;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageOutputStream;

final class ImageUploadTestFixtures {

    private ImageUploadTestFixtures() {
    }

    static byte[] png(int width, int height) {
        return singleImage("png", width, height);
    }

    static byte[] jpegWithExif(int width, int height) {
        byte[] jpeg = singleImage("jpeg", width, height);
        byte[] exif = "Exif\0\0II*\0fixture-private-metadata".getBytes(StandardCharsets.ISO_8859_1);
        int segmentLength = exif.length + 2;
        ByteArrayOutputStream output = new ByteArrayOutputStream(jpeg.length + exif.length + 4);
        output.write(jpeg, 0, 2);
        output.write(0xFF);
        output.write(0xE1);
        output.write((segmentLength >>> 8) & 0xFF);
        output.write(segmentLength & 0xFF);
        output.writeBytes(exif);
        output.write(jpeg, 2, jpeg.length - 2);
        return output.toByteArray();
    }

    static byte[] gif(int width, int height, int frameCount) {
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("gif");
        if (!writers.hasNext()) {
            throw new IllegalStateException("GIF writer unavailable");
        }
        ImageWriter writer = writers.next();
        try (ByteArrayOutputStream output = new ByteArrayOutputStream();
             ImageOutputStream imageOutput = ImageIO.createImageOutputStream(output)) {
            writer.setOutput(imageOutput);
            writer.prepareWriteSequence(null);
            ImageWriteParam writeParam = writer.getDefaultWriteParam();
            for (int index = 0; index < frameCount; index++) {
                BufferedImage image = image(width, height, index);
                IIOMetadata metadata = writer.getDefaultImageMetadata(
                    ImageTypeSpecifier.createFromRenderedImage(image),
                    writeParam
                );
                writer.writeToSequence(new IIOImage(image, null, metadata), writeParam);
                image.flush();
            }
            writer.endWriteSequence();
            imageOutput.flush();
            return output.toByteArray();
        } catch (IOException exception) {
            throw new IllegalStateException("Could not build GIF fixture", exception);
        } finally {
            writer.dispose();
        }
    }

    static byte[] damagedPng() {
        byte[] valid = png(2, 2);
        return java.util.Arrays.copyOf(valid, 18);
    }

    static byte[] unsupportedWebpHeader() {
        ByteBuffer buffer = ByteBuffer.allocate(20);
        buffer.put("RIFF".getBytes(StandardCharsets.US_ASCII));
        buffer.putInt(Integer.reverseBytes(12));
        buffer.put("WEBPVP8 ".getBytes(StandardCharsets.US_ASCII));
        buffer.putInt(0);
        return buffer.array();
    }

    static String sha256(byte[] bytes) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException(exception);
        }
    }

    private static byte[] singleImage(String format, int width, int height) {
        BufferedImage image = image(width, height, 0);
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            if (!ImageIO.write(image, format, output)) {
                throw new IllegalStateException(format + " writer unavailable");
            }
            return output.toByteArray();
        } catch (IOException exception) {
            throw new IllegalStateException("Could not build image fixture", exception);
        } finally {
            image.flush();
        }
    }

    private static BufferedImage image(int width, int height, int colorOffset) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        int rgb = new Color((30 + colorOffset * 31) % 255, 80, 160).getRGB();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, rgb);
            }
        }
        return image;
    }
}
