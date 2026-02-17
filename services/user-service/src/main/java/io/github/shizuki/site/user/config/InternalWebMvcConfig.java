package io.github.shizuki.site.user.config;

import io.github.shizuki.site.user.security.InternalMusicApiKeyAuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 用户服务 Web 配置。
 */
@Configuration
public class InternalWebMvcConfig implements WebMvcConfigurer {

    private final InternalMusicApiKeyAuthInterceptor internalMusicApiKeyAuthInterceptor;

    public InternalWebMvcConfig(InternalMusicApiKeyAuthInterceptor internalMusicApiKeyAuthInterceptor) {
        this.internalMusicApiKeyAuthInterceptor = internalMusicApiKeyAuthInterceptor;
    }

    /**
     * 仅对内部音乐 API Key 接口开启签名校验。
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(internalMusicApiKeyAuthInterceptor)
            .addPathPatterns("/api/v1/internal/music/api-keys/**");
    }
}
