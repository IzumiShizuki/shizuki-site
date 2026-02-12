package io.github.shizuki.common.core.time;

import java.time.Instant;
import org.springframework.stereotype.Component;

/**
 * 系统时钟实现。
 */
@Component
public class SystemClockProvider implements ClockProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public Instant now() {
        return Instant.now();
    }
}
