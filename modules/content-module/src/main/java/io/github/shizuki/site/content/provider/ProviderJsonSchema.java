package io.github.shizuki.site.content.provider;

import com.fasterxml.jackson.databind.JsonNode;

/** 把严格验证过的 provider JSON 根对象归一化为站内事实。 */
@FunctionalInterface
public interface ProviderJsonSchema<T> {

    T normalize(JsonNode root);
}
