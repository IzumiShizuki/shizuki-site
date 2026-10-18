package io.github.shizuki.site.user.notification;

import static io.github.shizuki.site.user.notification.WechatNotificationModels.*;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import jakarta.validation.Valid;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/me/wechat-notifications")
public class WechatNotificationController {
    private final WechatNotificationService service;
    public WechatNotificationController(WechatNotificationService service) { this.service=service; }
    @GetMapping
    public ResponseEntity<ApiResponse<Status>> status() { return noStore(service.status(user())); }
    @PostMapping("/binding-code")
    public ResponseEntity<ApiResponse<Challenge>> challenge() { return noStore(service.challenge(user())); }
    @DeleteMapping("/binding")
    public ApiResponse<Boolean> unbind() { service.unbind(user()); return ApiResponse.success(true); }
    @PutMapping("/preferences")
    public ApiResponse<Boolean> update(@Valid @RequestBody Preferences input) {
        service.update(user(), input); return ApiResponse.success(true);
    }
    private long user() {
        return LoginUserContext.get().map(u->u.getUserId()).filter(id->id!=null && id>0)
            .orElseThrow(()->new BusinessException(ErrorCode.UNAUTHORIZED,"Login required"));
    }
    private <T> ResponseEntity<ApiResponse<T>> noStore(T value) {
        return ResponseEntity.ok().cacheControl(CacheControl.noStore()).body(ApiResponse.success(value));
    }
}
