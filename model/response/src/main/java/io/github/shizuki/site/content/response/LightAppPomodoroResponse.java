package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppPomodoroResponse(
    Long pomodoroId,
    String title,
    int focusMinutes,
    int shortBreakMinutes,
    int longBreakMinutes,
    int longBreakEvery,
    boolean autoStartNext,
    String ringtoneType,
    String ringtoneName,
    String ringtoneCode,
    Long ringtoneAssetId,
    int sortNum,
    LocalDateTime updatedAt
) {
}
