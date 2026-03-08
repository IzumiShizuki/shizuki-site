package io.github.shizuki.site.media.service.impl;

import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Component;

/**
 * Workshop 导入异步执行器。
 */
@Component
public class WorkshopImportWorker {

    public void submit(Runnable runnable) {
        CompletableFuture.runAsync(runnable);
    }
}
