package io.github.shizuki.site.content.model;

import java.util.Arrays;

/**
 * 公开个人内容的稳定类型标识。
 *
 * <p>短前缀只用于区分路由标识和游标载荷，不承载数据库表名或内部主键。
 */
public enum PublicContentType {
    ALBUM(1, "alb"),
    MOMENT(2, "mom");

    private final int wireCode;
    private final String identifierPrefix;

    PublicContentType(int wireCode, String identifierPrefix) {
        this.wireCode = wireCode;
        this.identifierPrefix = identifierPrefix;
    }

    int wireCode() {
        return wireCode;
    }

    /**
     * 获取公开标识前缀。
     *
     * @return URL 安全的类型前缀
     */
    public String identifierPrefix() {
        return identifierPrefix;
    }

    static PublicContentType fromWireCode(int wireCode) {
        return Arrays.stream(values())
            .filter(type -> type.wireCode == wireCode)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Unknown public content type"));
    }
}
