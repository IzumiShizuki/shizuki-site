package io.github.shizuki.site.user.notification;

import static io.github.shizuki.site.user.notification.AccountContactModels.*;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import jakarta.validation.Valid;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/me/contact-bindings")
public class AccountContactBindingController {
    private final AccountContactBindingService service;

    public AccountContactBindingController(AccountContactBindingService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<Status>> status() {
        return noStore(service.status(user()));
    }

    @PostMapping("/challenge")
    public ResponseEntity<ApiResponse<Challenge>> challenge(@Valid @RequestBody ChallengeRequest request) {
        return noStore(service.challenge(user(), request.platform()));
    }

    @PutMapping("/{id}/capabilities")
    public ApiResponse<Boolean> capabilities(@PathVariable String id, @Valid @RequestBody CapabilitiesRequest request) {
        service.updateCapabilities(user(), id, request);
        return ApiResponse.success(true);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Boolean> unbind(@PathVariable String id) {
        service.unbind(user(), id);
        return ApiResponse.success(true);
    }

    private long user() {
        return LoginUserContext.get().map(u -> u.getUserId()).filter(id -> id != null && id > 0)
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "Login required"));
    }

    private <T> ResponseEntity<ApiResponse<T>> noStore(T value) {
        return ResponseEntity.ok().cacheControl(CacheControl.noStore()).body(ApiResponse.success(value));
    }
}
