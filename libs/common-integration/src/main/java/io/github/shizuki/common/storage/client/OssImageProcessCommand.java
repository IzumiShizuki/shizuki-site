package io.github.shizuki.common.storage.client;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * 阿里云 OSS 图片处理命令编码器。
 *
 * <p>调用方只能提供单段图片变换；{@code image/} 与 {@code sys/saveas} 由这里统一拼接，
 * 避免把 bucket 或对象键直接写入处理查询参数。
 */
public final class OssImageProcessCommand {

    private static final Pattern SAFE_OPERATION = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_,.-]{0,255}");
    private static final Pattern SAFE_BUCKET = Pattern.compile("[a-z0-9][a-z0-9-]{1,62}");

    private OssImageProcessCommand() {
    }

    /**
     * 构造临时图片处理命令。
     *
     * @param operations 图片变换段
     * @return OSS process 参数
     */
    public static String transform(List<String> operations) {
        if (operations == null || operations.isEmpty()) {
            throw new IllegalArgumentException("at least one OSS image operation is required");
        }
        List<String> safeOperations = operations.stream()
            .map(OssImageProcessCommand::validateOperation)
            .toList();
        return "image/" + String.join("/", safeOperations);
    }

    /**
     * 构造将派生保存到指定目标的 {@code sys/saveas} 命令。
     *
     * @param operations 图片变换段
     * @param destinationBucket 目标 bucket
     * @param destinationKey 目标对象键
     * @return OSS process 参数
     */
    public static String saveAs(
        List<String> operations,
        String destinationBucket,
        String destinationKey
    ) {
        String bucket = Objects.requireNonNull(destinationBucket, "destinationBucket").trim();
        if (!SAFE_BUCKET.matcher(bucket).matches()) {
            throw new IllegalArgumentException("invalid OSS destination bucket");
        }
        String key = Objects.requireNonNull(destinationKey, "destinationKey");
        if (key.isBlank() || key.length() > 1024 || key.indexOf('\0') >= 0) {
            throw new IllegalArgumentException("invalid OSS destination key");
        }
        return transform(operations)
            + "/sys/saveas,o_" + encode(key)
            + ",b_" + encode(bucket);
    }

    private static String validateOperation(String operation) {
        String normalized = Objects.requireNonNull(operation, "operation").trim();
        if (!SAFE_OPERATION.matcher(normalized).matches()
            || normalized.equalsIgnoreCase("sys")
            || normalized.regionMatches(true, 0, "sys,", 0, 4)
            || normalized.toLowerCase(java.util.Locale.ROOT).contains("saveas")) {
            throw new IllegalArgumentException("invalid OSS image operation");
        }
        return normalized;
    }

    private static String encode(String raw) {
        return Base64.getUrlEncoder()
            .withoutPadding()
            .encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }
}
