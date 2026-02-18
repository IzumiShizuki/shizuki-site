package io.github.shizuki.site.media.service.security;

import io.github.shizuki.site.media.model.AssetKindEnum;
import java.util.Map;

/**
 * 资产安全检查器。
 *
 * <p>用于在资产落库前执行统一风险检查（去重、扫描状态注入等）。
 */
public interface AssetSecurityInspector {

    /**
     * 执行资产安全检查。
     *
     * @param userId 当前用户 ID
     * @param bucket 对象桶
     * @param key 对象 key
     * @param assetKind 资产类型
     * @param requestContentType 请求声明的内容类型
     * @param requestMetadata 请求携带的扩展元数据
     * @return 检查结果
     */
    AssetInspectionResult inspect(Long userId,
                                  String bucket,
                                  String key,
                                  AssetKindEnum assetKind,
                                  String requestContentType,
                                  Map<String, Object> requestMetadata);
}
