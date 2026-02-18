package io.github.shizuki.site.media.service.l2d;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.springframework.stereotype.Component;

/**
 * L2D ZIP 包结构校验器。
 *
 * <p>职责：
 * 1) 读取 ZIP 并做基础安全校验（Zip Slip、大小、数量、路径长度）；
 * 2) 解析唯一 model3.json；
 * 3) 校验 FileReferences 中各类引用文件是否存在；
 * 4) 产出可落库的统计信息与引用清单。
 */
@Component
public class L2dZipValidator {

    /**
     * JSON 解析组件。
     */
    private final ObjectMapper objectMapper;
    /**
     * 媒体上传与 ZIP 校验限制配置。
     */
    private final MediaStorageProperties storageProperties;

    /**
     * 构造校验器。
     */
    public L2dZipValidator(ObjectMapper objectMapper, MediaStorageProperties storageProperties) {
        this.objectMapper = objectMapper;
        this.storageProperties = storageProperties;
    }

    /**
     * 校验 L2D ZIP 输入流并返回结构化结果。
     */
    public L2dValidationResult validate(InputStream inputStream) {
        if (inputStream == null) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "L2D zip stream is required");
        }

        ZipScanResult zipScan = scanZip(inputStream);
        String modelPath = findSingleModelPath(zipScan.modelJsonFiles().keySet());
        JsonNode modelJson = parseJson(zipScan.modelJsonFiles().get(modelPath), "Invalid model3 json: " + modelPath);
        JsonNode fileReferences = pick(modelJson, "FileReferences", "fileReferences");
        if (fileReferences == null || fileReferences.isNull()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "FileReferences is required in model3 json");
        }

        String basePath = dirname(modelPath);
        Set<String> references = new LinkedHashSet<>();

        // Moc 为必填入口二进制资源，缺失即不可渲染。
        String moc = text(pick(fileReferences, "Moc", "moc"));
        if (moc == null || moc.isBlank()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Moc path is required");
        }
        String mocPath = resolve(basePath, moc);
        requireFile(zipScan.paths(), mocPath, "Moc file missing");
        references.add(mocPath);

        // Textures 至少一张，且所有声明文件必须在包内真实存在。
        List<String> textures = readStringArray(pick(fileReferences, "Textures", "textures"));
        if (textures.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Textures are required");
        }
        for (String texture : textures) {
            String texturePath = resolve(basePath, texture);
            requireFile(zipScan.paths(), texturePath, "Texture file missing");
            references.add(texturePath);
        }

        // Motions 按组统计；每条 motion 的 file 字段若存在则必须可解析到真实文件。
        int motionGroupCount = 0;
        JsonNode motionsNode = pick(fileReferences, "Motions", "motions");
        if (motionsNode != null && motionsNode.isObject()) {
            motionGroupCount = motionsNode.size();
            motionsNode.fields().forEachRemaining(entry -> {
                JsonNode motions = entry.getValue();
                if (motions != null && motions.isArray()) {
                    for (JsonNode motion : motions) {
                        String motionFile = text(pick(motion, "File", "file"));
                        if (motionFile != null && !motionFile.isBlank()) {
                            String motionPath = resolve(basePath, motionFile);
                            requireFile(zipScan.paths(), motionPath, "Motion file missing");
                            references.add(motionPath);
                        }
                    }
                }
            });
        }

        // Expressions 为可选，但声明后必须存在对应文件。
        int expressionCount = 0;
        JsonNode expressionsNode = pick(fileReferences, "Expressions", "expressions");
        if (expressionsNode != null && expressionsNode.isArray()) {
            expressionCount = expressionsNode.size();
            for (JsonNode expression : expressionsNode) {
                String expressionFile = text(pick(expression, "File", "file"));
                if (expressionFile != null && !expressionFile.isBlank()) {
                    String expressionPath = resolve(basePath, expressionFile);
                    requireFile(zipScan.paths(), expressionPath, "Expression file missing");
                    references.add(expressionPath);
                }
            }
        }

        // 物理参数文件可选，存在即校验并标记。
        boolean hasPhysics = false;
        String physics = text(pick(fileReferences, "Physics", "physics"));
        if (physics != null && !physics.isBlank()) {
            String physicsPath = resolve(basePath, physics);
            requireFile(zipScan.paths(), physicsPath, "Physics file missing");
            references.add(physicsPath);
            hasPhysics = true;
        }

        // 姿态文件可选，存在即校验并标记。
        boolean hasPose = false;
        String pose = text(pick(fileReferences, "Pose", "pose"));
        if (pose != null && !pose.isBlank()) {
            String posePath = resolve(basePath, pose);
            requireFile(zipScan.paths(), posePath, "Pose file missing");
            references.add(posePath);
            hasPose = true;
        }

        L2dValidationResult result = new L2dValidationResult();
        result.setEntryModelJson(modelPath);
        result.setMocPath(mocPath);
        result.setTextureCount(textures.size());
        result.setMotionGroupCount(motionGroupCount);
        result.setExpressionCount(expressionCount);
        result.setHasPhysics(hasPhysics);
        result.setHasPose(hasPose);
        result.setReferences(references);
        return result;
    }

    /**
     * 扫描 ZIP：只保存 entry 名称索引与 model3.json 内容，不缓存其他文件字节。
     */
    private ZipScanResult scanZip(InputStream inputStream) {
        Set<String> paths = new LinkedHashSet<>();
        Map<String, byte[]> modelJsonFiles = new LinkedHashMap<>();
        long totalSize = 0L;
        int count = 0;

        try (ZipInputStream zipInputStream = new ZipInputStream(inputStream, StandardCharsets.UTF_8)) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                count++;
                if (count > storageProperties.getMaxL2dZipEntryCount()) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Zip contains too many entries");
                }
                if (entry.isDirectory()) {
                    continue;
                }

                String path = normalizeEntryPath(entry.getName());
                if (!paths.add(path)) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Duplicate zip entry path: " + path);
                }

                boolean capture = path.toLowerCase(Locale.ROOT).endsWith(".model3.json");
                EntryReadResult readResult = readEntry(zipInputStream, capture);
                totalSize += readResult.size();
                if (totalSize > storageProperties.getMaxL2dZipTotalSize()) {
                    throw new BusinessException(ErrorCode.BAD_REQUEST, "Zip total content too large");
                }

                if (capture && readResult.bytes() != null) {
                    modelJsonFiles.put(path, readResult.bytes());
                }
            }
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid zip file");
        }

        if (paths.isEmpty()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Zip file is empty");
        }
        return new ZipScanResult(paths, modelJsonFiles);
    }

    /**
     * 读取单个 entry 内容，返回读取长度；必要时捕获内容字节。
     */
    private EntryReadResult readEntry(ZipInputStream zipInputStream, boolean captureBytes) throws IOException {
        long singleEntryLimit = storageProperties.getMaxL2dZipSingleEntrySize();
        long size = 0L;
        byte[] buffer = new byte[8192];
        ByteArrayOutputStream output = captureBytes ? new ByteArrayOutputStream() : null;

        int read;
        while ((read = zipInputStream.read(buffer)) != -1) {
            size += read;
            if (size > singleEntryLimit) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Zip entry too large");
            }
            if (captureBytes) {
                output.write(buffer, 0, read);
            }
        }
        return new EntryReadResult(size, output == null ? null : output.toByteArray());
    }

    /**
     * 确保 ZIP 中恰好存在一个 model3.json。
     */
    private String findSingleModelPath(Set<String> modelPaths) {
        if (modelPaths.size() != 1) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Zip must contain exactly one .model3.json");
        }
        return modelPaths.iterator().next();
    }

    /**
     * 解析 JSON，失败转业务异常便于接口统一返回 400。
     */
    private JsonNode parseJson(byte[] bytes, String message) {
        try {
            return objectMapper.readTree(bytes);
        } catch (IOException exception) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, message);
        }
    }

    /**
     * 断言文件存在。
     */
    private void requireFile(Set<String> paths, String path, String message) {
        if (!paths.contains(path)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, message + ": " + path);
        }
    }

    /**
     * 归一化 ZIP entry 路径，并做 Zip Slip 相关防护。
     */
    private String normalizeEntryPath(String path) {
        if (path == null || path.isBlank()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid zip entry path");
        }
        if (path.length() > storageProperties.getMaxL2dZipEntryNameLength()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Zip entry path too long");
        }
        String normalized = path.replace('\\', '/');
        if (normalized.startsWith("/") || normalized.contains("..")) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsafe zip entry path: " + normalized);
        }
        return normalized;
    }

    /**
     * 将 model 相对路径解析为 ZIP 内标准路径并复用安全校验。
     */
    private String resolve(String basePath, String relativePath) {
        String joined = (basePath.isBlank() ? "" : basePath + "/") + relativePath;
        return normalizeEntryPath(joined);
    }

    /**
     * 获取父目录路径。
     */
    private String dirname(String path) {
        int index = path.lastIndexOf('/');
        if (index < 0) {
            return "";
        }
        return path.substring(0, index);
    }

    /**
     * 读取 JSON 字符串数组节点，过滤空值。
     */
    private List<String> readStringArray(JsonNode arrayNode) {
        List<String> values = new ArrayList<>();
        if (arrayNode == null || !arrayNode.isArray()) {
            return values;
        }
        for (JsonNode value : arrayNode) {
            String text = text(value);
            if (text != null && !text.isBlank()) {
                values.add(text);
            }
        }
        return values;
    }

    /**
     * 从 JSON 节点读取文本并 trim。
     */
    private String text(JsonNode node) {
        if (node == null || node.isNull()) {
            return null;
        }
        String value = node.asText();
        return value == null ? null : value.trim();
    }

    /**
     * 兼容大小写/驼峰差异，按候选字段名顺序取值。
     */
    private JsonNode pick(JsonNode source, String... names) {
        if (source == null) {
            return null;
        }
        for (String name : names) {
            JsonNode node = source.get(name);
            if (node != null) {
                return node;
            }
        }
        return null;
    }

    private record ZipScanResult(Set<String> paths, Map<String, byte[]> modelJsonFiles) {
    }

    private record EntryReadResult(long size, byte[] bytes) {
    }
}
