package io.github.shizuki.common.core.time;

import java.time.Instant;

/**
 * 时间提供器抽象。
 */
public interface ClockProvider {

    /**
     * 获取当前时间。
     *
     * @return 当前时间
     */
    Instant now();
}
