package io.github.shizuki.site.media.service.revocation;

import java.util.List;

/**
 * 使站内媒体路由的边缘缓存失效。实现不得接收或记录对象存储地址。
 */
public interface MediaRouteCacheInvalidator {

    void invalidate(List<String> sitePaths);
}
