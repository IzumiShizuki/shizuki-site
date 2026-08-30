package io.github.shizuki.site.content.provider;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.springframework.stereotype.Component;

/** 有界读取、拒绝重复字段/尾随内容并执行 provider schema 的 JSON 入口。 */
@Component
public class BoundedProviderJsonParser {

    private final ObjectMapper strictMapper;

    public BoundedProviderJsonParser(ObjectMapper objectMapper) {
        this.strictMapper = Objects.requireNonNull(objectMapper, "objectMapper").copy()
            .enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION)
            .enable(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
    }

    public <T> T parse(
        InputStream responseBody,
        ProviderHttpPolicy policy,
        ProviderJsonSchema<T> schema
    ) {
        Objects.requireNonNull(responseBody, "responseBody");
        Objects.requireNonNull(policy, "policy");
        Objects.requireNonNull(schema, "schema");
        try {
            byte[] bytes = responseBody.readNBytes(policy.maxResponseBytes() + 1);
            if (bytes.length > policy.maxResponseBytes()) {
                throw unavailable("provider response exceeds the configured size limit");
            }
            JsonNode root = strictMapper.readTree(bytes);
            if (root == null || !root.isObject()) {
                throw unavailable("provider response must be one JSON object");
            }
            return Objects.requireNonNull(schema.normalize(root), "provider schema result");
        } catch (BusinessException exception) {
            throw exception;
        } catch (IOException | RuntimeException exception) {
            throw unavailable("provider response failed strict JSON validation");
        }
    }

    private BusinessException unavailable(String message) {
        return new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, message);
    }
}
