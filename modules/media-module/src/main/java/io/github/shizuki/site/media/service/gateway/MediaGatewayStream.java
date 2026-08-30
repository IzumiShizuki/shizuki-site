package io.github.shizuki.site.media.service.gateway;

import java.io.InputStream;

/**
 * 已授权的网关流。对象存储定位只在服务内部存在，不进入该边界对象。
 */
public record MediaGatewayStream(
    InputStream inputStream,
    String contentType,
    long contentLength,
    String cacheControl,
    String siteEtag
) {
}
