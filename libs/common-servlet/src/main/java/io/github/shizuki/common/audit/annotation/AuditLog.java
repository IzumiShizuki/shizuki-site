package io.github.shizuki.common.audit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 审计日志标记注解。
 *
 * <p>标记在方法上后，由 {@code AuditLogAspect} 统一记录调用审计信息。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuditLog {

    /**
     * 审计动作编码（如 {@code user.login}）。
     *
     * @return 动作编码
     */
    String action();

    /**
     * 审计资源编码（如 {@code usr_account}）。
     *
     * @return 资源编码
     */
    String resource() default "unknown";
}
