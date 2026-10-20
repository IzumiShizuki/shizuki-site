package io.github.shizuki.site.user.notification;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.Instant;
import java.util.List;

public final class AccountContactModels {
    private AccountContactModels() {}

    public record ChallengeRequest(@NotBlank @Pattern(regexp = "QQ|WECHAT") String platform) {}
    public record CapabilitiesRequest(boolean todoEditEnabled, boolean todoNotifyEnabled) {}
    public record Confirmation(@NotBlank @Size(max=64) String code, @NotBlank @Pattern(regexp="QQ|WECHAT") String platform,
                               @NotNull @Valid WechatNotificationModels.PrivateSender sender) {}
    public record ContactBinding(String id, String platform, String maskedIdentity, boolean todoEditEnabled,
                                 boolean todoNotifyEnabled, String bindingVersion, Instant boundAt) {}
    public record Challenge(String platform, String command, Instant expiresAt) {}
    public record Status(boolean available, List<ContactBinding> bindings) {}
}
