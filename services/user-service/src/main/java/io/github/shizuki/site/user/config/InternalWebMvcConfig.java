package io.github.shizuki.site.user.config;

import io.github.shizuki.site.user.security.InternalMusicApiKeyAuthInterceptor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 用户服务 Web 配置。
 */
@Configuration
public class InternalWebMvcConfig implements WebMvcConfigurer {

    private final ObjectProvider<InternalMusicApiKeyAuthInterceptor> internalMusicApiKeyAuthInterceptorProvider;

    public InternalWebMvcConfig(ObjectProvider<InternalMusicApiKeyAuthInterceptor> internalMusicApiKeyAuthInterceptorProvider) {
        this.internalMusicApiKeyAuthInterceptorProvider = internalMusicApiKeyAuthInterceptorProvider;
    }

    /**
     * 仅对内部音乐 API Key 接口开启签名校验。
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InternalMusicApiKeyAuthInterceptor interceptor = internalMusicApiKeyAuthInterceptorProvider.getIfAvailable();
        if (interceptor == null) {
            return;
        }
        registry.addInterceptor(interceptor)
            .addPathPatterns("/api/v1/internal/music/api-keys/**");
    }
}
