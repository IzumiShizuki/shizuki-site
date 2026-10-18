package io.github.shizuki.site.user.notification;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

public final class WechatNotificationModels {
    private WechatNotificationModels() {}
    public record Subscription(@NotBlank @Size(max=64) String groupCode,
                               @Pattern(regexp="POST|MOMENT") @NotNull String kind) {}
    public record Preferences(boolean paused, @Min(0) @Max(23) Integer quietStart,
                              @Min(0) @Max(23) Integer quietEnd,
                              @NotNull @Size(max=128) List<@NotNull @Valid Subscription> subscriptions) {}
    public record PrivateSender(@NotBlank @Size(max=128) String platformId,
                                @NotBlank @Size(max=256) String senderId,
                                @NotBlank @Size(max=768) String origin) {}
    public record Confirmation(@NotBlank @Size(max=64) String code, @NotNull @Valid PrivateSender sender) {}
    public record Control(@Pattern(regexp="PAUSE|RESUME|UNBIND") @NotNull String action,
                          @NotNull @Valid PrivateSender sender) {}
    public record LeaseRequest(@NotNull @Size(min=1,max=16) List<@NotBlank @Size(max=128) String> platformIds) {}
    public record LeaseToken(@NotBlank @Size(max=64) String token) {}
    public record Acknowledgment(@NotBlank @Size(max=64) String token, boolean success) {}
    public record Challenge(String code, String command, Instant expiresAt) {}
    public record Group(String code, String name) {}
    public record History(String id, String kind, String status, int attempts, Instant createdAt, String errorCode) {}
    public record Status(boolean available, boolean bound, String maskedIdentity, Instant boundAt,
                         boolean paused, Integer quietStart, Integer quietEnd, List<Group> groups,
                         List<Subscription> subscriptions, List<History> history) {}
    public record Lease(String id, String token) {}
    public record AuthorizedDelivery(boolean send, String origin, String text) {
        public static AuthorizedDelivery withheld() { return new AuthorizedDelivery(false, null, null); }
    }
}
