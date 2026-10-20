package io.github.shizuki.site.user.notification;

import static io.github.shizuki.site.user.notification.WechatNotificationModels.*;
import io.github.shizuki.common.core.response.ApiResponse;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/** These routes bypass site JWT auth but ALWAYS require the separate bridge secret. */
@RestController
@RequestMapping("/api/v1/integrations/astrbot")
public class AstrBotBridgeController {
    private final WechatNotificationSettings settings;
    private final AccountContactBindingSettings contactSettings;
    private final WechatNotificationService service;
    private final AccountContactBindingService contactBindings;
    public AstrBotBridgeController(WechatNotificationSettings settings, WechatNotificationService service) {
        this(settings, null, service, null);
    }
    public AstrBotBridgeController(WechatNotificationSettings settings, AccountContactBindingSettings contactSettings,
                                   WechatNotificationService service,
                                   AccountContactBindingService contactBindings) {
        this.settings=settings; this.contactSettings=contactSettings; this.service=service; this.contactBindings=contactBindings;
    }
    @PostMapping("/contact-bindings/confirm")
    public ResponseEntity<ApiResponse<Boolean>> confirmContact(@RequestHeader(value="Authorization",required=false) String auth,
                                                               @Valid @RequestBody AccountContactModels.Confirmation input) {
        if (contactSettings == null || contactBindings == null) throw new io.github.shizuki.common.core.error.BusinessException(
            io.github.shizuki.common.core.error.ErrorCode.FEATURE_DISABLED, "Contact bindings unavailable");
        contactSettings.authenticate(auth);
        contactBindings.confirm(input); return result(true);
    }
    @PostMapping("/bindings/confirm")
    public ResponseEntity<ApiResponse<Boolean>> confirm(@RequestHeader(value="Authorization",required=false) String auth,
                                                        @Valid @RequestBody Confirmation input) {
        settings.authenticate(auth); service.confirm(input); return result(true);
    }
    @PostMapping("/controls")
    public ResponseEntity<ApiResponse<Boolean>> control(@RequestHeader(value="Authorization",required=false) String auth,
                                                        @Valid @RequestBody Control input) {
        settings.authenticate(auth); service.control(input); return result(true);
    }
    @PostMapping("/deliveries/lease")
    public ResponseEntity<ApiResponse<List<Lease>>> lease(@RequestHeader(value="Authorization",required=false) String auth,
                                                          @Valid @RequestBody LeaseRequest input) {
        settings.authenticate(auth); return result(service.lease(input));
    }
    @PostMapping("/deliveries/{id}/authorize")
    public ResponseEntity<ApiResponse<AuthorizedDelivery>> authorize(
        @RequestHeader(value="Authorization",required=false) String auth, @PathVariable String id,
        @Valid @RequestBody LeaseToken input) {
        settings.authenticate(auth); return result(service.authorize(id,input));
    }
    @PostMapping("/deliveries/{id}/ack")
    public ResponseEntity<ApiResponse<Boolean>> ack(@RequestHeader(value="Authorization",required=false) String auth,
                                                   @PathVariable String id, @Valid @RequestBody Acknowledgment input) {
        settings.authenticate(auth); service.acknowledge(id,input); return result(true);
    }
    private <T> ResponseEntity<ApiResponse<T>> result(T value) {
        return ResponseEntity.ok().cacheControl(CacheControl.noStore()).body(ApiResponse.success(value));
    }
}
