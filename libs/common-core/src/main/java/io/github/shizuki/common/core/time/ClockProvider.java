package io.github.shizuki.common.core.time;

import java.time.Instant;

public interface ClockProvider {
    Instant now();
}
