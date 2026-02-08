package io.github.shizuki.common.security.context;

import io.github.shizuki.common.security.model.LoginUser;
import java.util.Optional;

public final class LoginUserContext {

    private static final ThreadLocal<LoginUser> CONTEXT = new ThreadLocal<>();

    private LoginUserContext() {
    }

    public static void set(LoginUser loginUser) {
        CONTEXT.set(loginUser);
    }

    public static Optional<LoginUser> get() {
        return Optional.ofNullable(CONTEXT.get());
    }

    public static LoginUser require() {
        return get().orElseThrow(() -> new IllegalStateException("login user not found"));
    }

    public static void clear() {
        CONTEXT.remove();
    }
}
