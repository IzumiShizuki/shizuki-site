package io.github.shizuki.site.media.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Schema(description = "在线环境音导入请求")
public class AmbientSoundImportRequest {

    @NotBlank
    @Pattern(regexp = "[1-9]\\d{0,19}", message = "sound_id must be a positive Freesound numeric identifier")
    @Schema(description = "Freesound 音频 ID", example = "123456")
    private String soundId;

    public String getSoundId() {
        return soundId;
    }

    public void setSoundId(String soundId) {
        this.soundId = soundId;
    }
}
