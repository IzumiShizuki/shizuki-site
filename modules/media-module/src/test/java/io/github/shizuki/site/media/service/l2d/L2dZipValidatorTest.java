package io.github.shizuki.site.media.service.l2d;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class L2dZipValidatorTest {

    private final L2dZipValidator validator = new L2dZipValidator(new ObjectMapper(), defaultProperties());

    @Test
    void shouldValidateLive2dZipSuccessfully() throws Exception {
        byte[] zipBytes = buildZip(Map.of(
            "haru/haru.model3.json", """
                {
                  "FileReferences": {
                    "Moc": "haru.moc3",
                    "Textures": ["haru.2048/texture_00.png"],
                    "Motions": {
                      "Idle": [{"File": "motions/idle.motion3.json"}]
                    },
                    "Expressions": [{"File": "expressions/f01.exp3.json"}],
                    "Physics": "haru.physics3.json"
                  }
                }
                """,
            "haru/haru.moc3", "moc",
            "haru/haru.2048/texture_00.png", "png",
            "haru/motions/idle.motion3.json", "{}",
            "haru/expressions/f01.exp3.json", "{}",
            "haru/haru.physics3.json", "{}"
        ));

        L2dValidationResult result = validator.validate(new ByteArrayInputStream(zipBytes));

        Assertions.assertEquals("haru/haru.model3.json", result.getEntryModelJson());
        Assertions.assertEquals("haru/haru.moc3", result.getMocPath());
        Assertions.assertEquals(1, result.getTextureCount());
        Assertions.assertEquals(1, result.getMotionGroupCount());
        Assertions.assertTrue(result.isHasPhysics());
    }

    @Test
    void shouldRejectWhenTextureMissing() throws Exception {
        byte[] zipBytes = buildZip(Map.of(
            "haru/haru.model3.json", """
                {
                  "FileReferences": {
                    "Moc": "haru.moc3",
                    "Textures": ["haru.2048/texture_00.png"]
                  }
                }
                """,
            "haru/haru.moc3", "moc"
        ));

        Assertions.assertThrows(BusinessException.class, () -> validator.validate(new ByteArrayInputStream(zipBytes)));
    }

    @Test
    void shouldRejectUnsafeZipSlipPath() throws Exception {
        Map<String, String> files = new LinkedHashMap<>();
        files.put("../haru.model3.json", "{}");
        byte[] zipBytes = buildZip(files);

        Assertions.assertThrows(BusinessException.class, () -> validator.validate(new ByteArrayInputStream(zipBytes)));
    }

    @Test
    void shouldRejectWhenModelFileCountInvalid() throws Exception {
        byte[] zipBytes = buildZip(Map.of(
            "a.model3.json", "{}",
            "b.model3.json", "{}"
        ));

        Assertions.assertThrows(BusinessException.class, () -> validator.validate(new ByteArrayInputStream(zipBytes)));
    }

    @Test
    void shouldRejectWhenDuplicateEntryPathExists() throws Exception {
        byte[] zipBytes = buildZipEntries(List.of(
            new ZipContentEntry("haru\\haru.model3.json", """
                {
                  "FileReferences": {
                    "Moc": "haru.moc3",
                    "Textures": ["haru.2048/texture_00.png"]
                  }
                }
                """),
            new ZipContentEntry("haru/haru.model3.json", "{}"),
            new ZipContentEntry("haru/haru.moc3", "moc"),
            new ZipContentEntry("haru/haru.2048/texture_00.png", "png")
        ));

        Assertions.assertThrows(BusinessException.class, () -> validator.validate(new ByteArrayInputStream(zipBytes)));
    }

    @Test
    void shouldRejectWhenZipTotalSizeTooLarge() throws Exception {
        MediaStorageProperties limitedProperties = defaultProperties();
        limitedProperties.setMaxL2dZipTotalSize(20);
        L2dZipValidator limitedValidator = new L2dZipValidator(new ObjectMapper(), limitedProperties);

        byte[] zipBytes = buildZip(Map.of(
            "haru/haru.model3.json", """
                {
                  "FileReferences": {
                    "Moc": "haru.moc3",
                    "Textures": ["haru.2048/texture_00.png"]
                  }
                }
                """,
            "haru/haru.moc3", "moc-content-over-limit",
            "haru/haru.2048/texture_00.png", "png-content-over-limit"
        ));

        Assertions.assertThrows(BusinessException.class, () -> limitedValidator.validate(new ByteArrayInputStream(zipBytes)));
    }

    private byte[] buildZip(Map<String, String> files) throws IOException {
        List<ZipContentEntry> entries = new ArrayList<>();
        for (Map.Entry<String, String> entry : files.entrySet()) {
            entries.add(new ZipContentEntry(entry.getKey(), entry.getValue()));
        }
        return buildZipEntries(entries);
    }

    private byte[] buildZipEntries(List<ZipContentEntry> entries) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(output, StandardCharsets.UTF_8)) {
            for (ZipContentEntry entry : entries) {
                zipOutputStream.putNextEntry(new ZipEntry(entry.key()));
                zipOutputStream.write(entry.value().getBytes(StandardCharsets.UTF_8));
                zipOutputStream.closeEntry();
            }
        }
        return output.toByteArray();
    }

    private MediaStorageProperties defaultProperties() {
        MediaStorageProperties properties = new MediaStorageProperties();
        properties.setMaxL2dZipEntryCount(2048);
        properties.setMaxL2dZipEntryNameLength(1024);
        properties.setMaxL2dZipSingleEntrySize(20L * 1024 * 1024);
        properties.setMaxL2dZipTotalSize(100L * 1024 * 1024);
        return properties;
    }

    private record ZipContentEntry(String key, String value) {
    }
}
