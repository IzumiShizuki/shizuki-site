package io.github.shizuki.site.media.service;

import io.github.shizuki.site.media.response.AmbientSoundImportResponse;

/**
 * 在线环境音导入服务。
 */
public interface AmbientLibraryService {

    /**
     * 将 Freesound 预览持久化为当前用户的私有音频资产。
     *
     * @param soundId Freesound 数字 ID
     * @return 可直接加入环境音混音器的站内资产
     */
    AmbientSoundImportResponse importSound(String soundId);
}
