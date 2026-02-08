package io.github.shizuki.common.ratelimit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RateLimit {

    /**
     * 限流键前缀。为空时默认使用“类名:方法名”。
     */
    String key() default "";

    /**
     * 时间窗口内允许的最大请求数。
     */
    int limit() default 30;

    /**
     * 窗口大小（秒）。
     */
    int windowSeconds() default 60;
}
