package io.github.shizuki.site.user.controller;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.core.response.ApiResponse;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.site.user.dto.MeResponse;
import io.github.shizuki.site.user.dto.PreferenceUpdateRequest;
import io.github.shizuki.site.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/me")
public class MeController {

    private final UserService userFacade;

    public MeController(UserService userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping
    public ApiResponse<MeResponse> me() {
        return ApiResponse.success(userFacade.currentUser());
    }

    @PutMapping("/preferences")
    @AuditLog(action = "user.preference.update", resource = "user_preference")
    public ApiResponse<Void> updatePreference(@Valid @RequestBody PreferenceUpdateRequest request) {
        Long userId = LoginUserContext.get().map(user -> user.getUserId()).orElse(0L);
        userFacade.savePreference(userId, request.getPreferenceJson());
        return ApiResponse.success(null);
    }
}
