在我实习期间做过一个 **日志脱敏插件**，最开始我们的思路是 **通过 AOP 做日志脱敏**。当时觉得只要在日志输出的地方做一个切面，在方法执行后拦截日志字符串，然后对敏感信息进行处理就可以了。例如针对常见的 `logger.info()`、`logger.error()` 等调用进行拦截，在切面中对字符串执行脱敏逻辑。

这种方式实现起来其实很简单，比如通过 AOP 拦截日志方法调用：

```java
@Around("execution(* org.slf4j.Logger.*(..))")
public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
    Object[] args = joinPoint.getArgs();
    if(args.length > 0 && args[0] instanceof String){
        args[0] = AutoLogDesensitizeUtil.desensitize((String) args[0]);
    }
    return joinPoint.proceed(args);
}
```

这样所有日志字符串都会在输出前进行脱敏处理。

但是在实际测试过程中我们发现这种方案有几个比较严重的问题。

第一，**AOP只能拦截方法调用，但日志不一定都来自业务代码**。很多日志其实来自第三方框架，比如 MyBatis、Spring、Netty 等，这些日志不会经过我们的业务层方法，所以 AOP 根本拦截不到。

第二，**日志框架内部也会自己生成日志**，例如 SQL 日志、启动日志等，这些日志完全绕过了业务代码，因此 AOP 方案的覆盖范围其实非常有限。

第三，**AOP 会引入额外的代理层和运行时开销**，而日志是一个高频操作，如果在每一次日志调用时都执行切面逻辑，会对性能产生一定影响。

后来我们重新分析日志的工作流程，发现 **真正的日志输出其实都会经过日志框架的 Layout 或 Encoder 阶段**。日志框架在输出日志之前会先进行格式化，例如 PatternLayout 会把日志事件转换成字符串。

于是我们调整方案，把脱敏逻辑放在 **日志格式化阶段**。

具体做法是 **替换日志框架的 Layout 实现**，在日志格式化之后统一执行脱敏逻辑。例如在 Log4j1.x 中，我通过反射获取 rootLogger 的所有 appender，然后把默认的 PatternLayout 替换成我们自定义的 Layout。

例如：

```java
Class<?> logManagerClass = Class.forName("org.apache.log4j.LogManager");
Object rootLogger = logManagerClass.getMethod("getRootLogger").invoke(null);
```

然后遍历所有 appender：

```java
Enumeration<?> appenders = (Enumeration<?>) getAppendersMethod.invoke(rootLogger);
```

如果发现 Layout 是 PatternLayout，就替换成我们自己的 Layout：

```java
setLayoutMethod.invoke(appender,
Class.forName("com.example.log.DesensitizedLog4j1Layout").newInstance());
```

在自定义 Layout 中，我们只需要重写 `format()` 方法：

```java
@Override
public String format(LoggingEvent event) {
    String original = super.format(event);
    return AutoLogDesensitizeUtil.desensitize(original);
}
```

这样 **所有日志在输出之前都会统一经过脱敏处理**，不管日志是来自业务代码还是第三方框架。

脱敏逻辑本身是通过 **正则规则实现的可扩展脱敏器**。我实现了 `PatternSensitiveDesensitizer`，并通过配置文件加载敏感信息规则，例如手机号、邮箱等：

```properties
sensitive.type.phone.pattern=...
sensitive.type.email.pattern=...
```

同时支持配置：

- 脱敏起始位置
- 脱敏结束位置
- 最小识别长度

例如手机号：

```text
13812345678
→ 138****5678
```

为了让插件使用更简单，我还提供了一个 Spring Boot 注解：

```java
@EnableLoggingDesensitize(load = {"phone","email"})
```

在 Spring Boot 启动时自动加载脱敏规则并初始化插件。

最终日志处理流程变成：

```
日志调用
↓
日志框架生成 LoggingEvent
↓
Layout 格式化日志
↓
执行脱敏处理
↓
输出日志
```

相比最初的 AOP 方案，这种方式有几个明显优势：

第一，**可以覆盖所有日志来源，包括框架日志和第三方库日志**。
第二，**不会增加额外的代理层，对性能影响更小**。
第三，**可以同时兼容 Log4j、Logback 等不同日志框架**。

通过这次优化，我们最终实现了一个 **可扩展、低侵入、跨日志框架的日志脱敏插件**。