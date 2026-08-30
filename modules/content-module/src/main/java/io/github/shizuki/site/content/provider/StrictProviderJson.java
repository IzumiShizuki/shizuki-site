package io.github.shizuki.site.content.provider;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/** Provider schema 共用的严格字段与标量读取规则。 */
public final class StrictProviderJson {

    private StrictProviderJson() {
    }

    public static void requireExactFields(JsonNode root, Set<String> required, Set<String> optional) {
        if (root == null || !root.isObject()) {
            throw invalid();
        }
        Set<String> allowed = new HashSet<>(required);
        allowed.addAll(optional);
        Iterator<Map.Entry<String, JsonNode>> fields = root.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            if (!allowed.contains(field.getKey())) {
                throw invalid();
            }
        }
        for (String name : required) {
            if (!root.has(name) || root.get(name).isNull()) {
                throw invalid();
            }
        }
    }

    public static String requiredText(JsonNode root, String field, int maxLength) {
        JsonNode value = root.get(field);
        if (value == null || !value.isTextual()) {
            throw invalid();
        }
        String text = value.textValue().trim();
        if (text.isEmpty() || text.length() > maxLength) {
            throw invalid();
        }
        return text;
    }

    public static double requiredFiniteNumber(JsonNode root, String field) {
        JsonNode value = root.get(field);
        if (value == null || !value.isNumber() || !Double.isFinite(value.doubleValue())) {
            throw invalid();
        }
        return value.doubleValue();
    }

    private static BusinessException invalid() {
        return new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "provider response does not match its schema");
    }
}
