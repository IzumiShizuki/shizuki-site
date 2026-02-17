package io.github.shizuki.site.user.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 内部音乐接口签名鉴权拦截器。
 */
@Component
@ConditionalOnBean(InternalRequestSignatureVerifier.class)
public class InternalMusicApiKeyAuthInterceptor implements HandlerInterceptor {

    private final InternalRequestSignatureVerifier internalRequestSignatureVerifier;

    public InternalMusicApiKeyAuthInterceptor(InternalRequestSignatureVerifier internalRequestSignatureVerifier) {
        this.internalRequestSignatureVerifier = internalRequestSignatureVerifier;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        internalRequestSignatureVerifier.verify(request);
        return true;
    }
}
