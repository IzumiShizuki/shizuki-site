package io.github.shizuki.site.media.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.function.LongConsumer;

/** Runs SteamCMD with bounded output capture, cleanup, and a small transient-only retry budget. */
final class SteamCmdProcessRunner {

    static final int MAX_ATTEMPTS = 2;
    static final int MAX_OUTPUT_CHARS = 8_192;
    static final long MAX_ATTEMPT_TIMEOUT_SECONDS = 300L;
    private static final long MIN_ATTEMPT_TIMEOUT_SECONDS = 1L;

    private final ProcessStarter processStarter;

    SteamCmdProcessRunner() {
        this(command -> new ProcessBuilder(command).redirectErrorStream(true).start());
    }

    SteamCmdProcessRunner(ProcessStarter processStarter) {
        this.processStarter = processStarter;
    }

    Execution run(List<String> command,
                  long configuredTimeoutSeconds,
                  LongConsumer progressSampler,
                  BooleanSupplier validateDownloadedContent) {
        long attemptTimeout = Math.min(MAX_ATTEMPT_TIMEOUT_SECONDS,
                Math.max(MIN_ATTEMPT_TIMEOUT_SECONDS, configuredTimeoutSeconds));
        Execution last = null;
        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            last = executeOnce(command, attempt, attemptTimeout, progressSampler);
            if (last.failure().category() == Category.INTERRUPTED) {
                return last;
            }
            Failure failure = last.observedFailure();
            if (last.startFailed()) {
                failure = SteamCmdFailureClassifier.classify(last.output(), false, true);
            } else if (failure.permanent()) {
                // Permanent evidence observed anywhere in the bounded stream takes precedence over a timeout.
            } else if (last.timedOut()) {
                failure = SteamCmdFailureClassifier.classify(last.output(), true, false);
            } else if (failure.category() == Category.NONE) {
                failure = SteamCmdFailureClassifier.classify(last.output(), false, false);
            }
            if (failure.permanent()) {
                return last.withFailure(failure);
            }
            String expectedItemId = requestedWorkshopItemId(command);
            boolean successMarker = SteamCmdFailureClassifier.hasSuccessfulDownloadMarker(last.output(), expectedItemId);
            if (successMarker) {
                if (validateDownloadedContent.getAsBoolean()) {
                    return last.withFailure(Failure.NONE);
                }
                return last.withFailure(new Failure(Category.CONTENT,
                        "SteamCMD 已完成下载，但壁纸内容未通过导入检查", false, true));
            }
            if (failure.retryable()) {
                if (attempt < MAX_ATTEMPTS) {
                    continue;
                }
                return last.withFailure(failure);
            }
            if (last.exitCode() == 0 && !last.timedOut() && !last.startFailed()) {
                if (failure.category() == Category.NONE && validateDownloadedContent.getAsBoolean()) {
                    return last.withFailure(Failure.NONE);
                }
                if (failure.category() == Category.NONE) {
                    return last.withFailure(new Failure(Category.CONTENT,
                            "SteamCMD 未生成可用的壁纸内容，请检查创意工坊条目", false, true));
                }
            }
            if (failure.category() == Category.NONE) {
                failure = new Failure(Category.UNKNOWN,
                        "SteamCMD 下载失败，原因无法安全识别；可手动重试或本地导入", false, false);
            }
            return last.withFailure(failure);
        }
        return last == null ? Execution.startFailure("", 1) : last;
    }

    private static String requestedWorkshopItemId(List<String> command) {
        int operationIndex = command.indexOf("+workshop_download_item");
        if (operationIndex < 0 || operationIndex + 2 >= command.size()) {
            return "";
        }
        String itemId = command.get(operationIndex + 2);
        return itemId != null && itemId.matches("\\d{3,20}") ? itemId : "";
    }

    private Execution executeOnce(List<String> command,
                                  int attempt,
                                  long timeoutSeconds,
                                  LongConsumer progressSampler) {
        Process process = null;
        BoundedOutput output = new BoundedOutput(MAX_OUTPUT_CHARS);
        Thread drainThread = null;
        try {
            process = processStarter.start(command);
            Process running = process;
            drainThread = new Thread(() -> drain(running.getInputStream(), output), "steamcmd-output-drain");
            drainThread.setDaemon(true);
            drainThread.start();

            long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(timeoutSeconds);
            boolean completed = false;
            long nextProgressSample = System.nanoTime();
            while (!completed && System.nanoTime() < deadline) {
                long remainingNanos = deadline - System.nanoTime();
                long waitMillis = Math.max(1L, Math.min(200L,
                        TimeUnit.NANOSECONDS.toMillis(Math.max(0L, remainingNanos))));
                completed = process.waitFor(waitMillis, TimeUnit.MILLISECONDS);
                if (completed || System.nanoTime() >= nextProgressSample) {
                    progressSampler.accept(attempt);
                    nextProgressSample = System.nanoTime() + TimeUnit.SECONDS.toNanos(1);
                }
                if (!completed && SteamCmdFailureClassifier.hasSuccessfulDownloadMarker(
                        output.value(), requestedWorkshopItemId(command))) {
                    // SteamCMD can linger in shutdown after all files have been written. The caller
                    // still classifies final output and validates content before accepting this run.
                    terminate(process);
                    joinQuietly(drainThread);
                    return new Execution(0, false, false, output.value(), attempt,
                            output.observedFailure(), Failure.NONE);
                }
            }
            if (!completed) {
                terminate(process);
                joinQuietly(drainThread);
                return new Execution(-1, true, false, output.value(), attempt, output.observedFailure(), Failure.NONE);
            }
            joinQuietly(drainThread);
            return new Execution(process.exitValue(), false, false, output.value(), attempt,
                    output.observedFailure(), Failure.NONE);
        } catch (IOException exception) {
            terminate(process);
            joinQuietly(drainThread);
            return Execution.startFailure(output.value(), attempt);
        } catch (InterruptedException exception) {
            terminate(process);
            joinQuietlyUninterruptibly(drainThread);
            Thread.currentThread().interrupt();
            return new Execution(-1, false, true, output.value(), attempt, output.observedFailure(),
                    new Failure(Category.INTERRUPTED, "SteamCMD 执行被中断，请稍后重试", false, true));
        } catch (RuntimeException exception) {
            terminate(process);
            joinQuietly(drainThread);
            throw exception;
        }
    }

    private static void drain(InputStream stream, BoundedOutput output) {
        byte[] buffer = new byte[1_024];
        try (InputStream input = stream) {
            int read;
            while ((read = input.read(buffer)) >= 0) {
                output.append(new String(buffer, 0, read, StandardCharsets.UTF_8));
            }
        } catch (IOException ignored) {
            // Process output is diagnostic evidence only; a broken pipe is handled by exit/timeout state.
        }
    }

    private static void terminate(Process process) {
        if (process == null || !process.isAlive()) {
            return;
        }
        try (var descendants = process.descendants()) {
            descendants.forEach(ProcessHandle::destroyForcibly);
        } catch (UnsupportedOperationException ignored) {
            // In-memory Process implementations may not expose operating-system handles.
        }
        process.destroyForcibly();
        try {
            process.waitFor(3L, TimeUnit.SECONDS);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

    private static void joinQuietly(Thread thread) {
        if (thread == null) {
            return;
        }
        try {
            thread.join(1_000L);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

    private static void joinQuietlyUninterruptibly(Thread thread) {
        if (thread == null) {
            return;
        }
        boolean interrupted = false;
        while (thread.isAlive()) {
            try {
                thread.join(100L);
            } catch (InterruptedException exception) {
                interrupted = true;
            }
        }
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
    }

    interface ProcessStarter {
        Process start(List<String> command) throws IOException;
    }

    record Execution(int exitCode,
                     boolean timedOut,
                     boolean startFailed,
                     String output,
                     int attempt,
                     Failure observedFailure,
                     Failure failure) {
        private static Execution startFailure(String output, int attempt) {
            return new Execution(-1, false, true, output, attempt, Failure.NONE,
                    new Failure(Category.EXECUTION, "服务器无法启动 SteamCMD，请检查下载器配置", false, true));
        }

        private Execution withFailure(Failure value) {
            return new Execution(exitCode, timedOut, startFailed, output, attempt, observedFailure, value);
        }

        boolean succeeded() {
            return failure.category() == Category.NONE;
        }
    }

    enum Category {
        NONE, AUTHENTICATION, OWNERSHIP, TIMEOUT, NETWORK, EXECUTION, CONTENT, UNKNOWN, INTERRUPTED
    }

    record Failure(Category category, String safeMessage, boolean retryable, boolean permanent) {
        static final Failure NONE = new Failure(Category.NONE, "", false, false);
    }

    private static final class BoundedOutput {
        private final int maxChars;
        private final StringBuilder value = new StringBuilder();
        private String scanOverlap = "";
        private Failure observedFailure = Failure.NONE;

        private BoundedOutput(int maxChars) {
            this.maxChars = maxChars;
        }

        synchronized void append(String chunk) {
            String scanValue = scanOverlap + chunk;
            Failure detected = SteamCmdFailureClassifier.classify(scanValue, false, false);
            if (SteamCmdFailureClassifier.priority(detected) > SteamCmdFailureClassifier.priority(observedFailure)) {
                observedFailure = detected;
            }
            int overlapStart = Math.max(0, scanValue.length() - 2_048);
            scanOverlap = scanValue.substring(overlapStart);
            value.append(chunk);
            if (value.length() > maxChars) {
                value.delete(0, value.length() - maxChars);
            }
        }

        synchronized String value() {
            return value.toString();
        }

        synchronized Failure observedFailure() {
            return observedFailure;
        }
    }

    static final class SteamCmdFailureClassifier {
        private SteamCmdFailureClassifier() {
        }

        static Failure classify(String rawOutput, boolean timedOut, boolean startFailed) {
            String output = rawOutput == null ? "" : rawOutput.toLowerCase(Locale.ROOT);
            if (startFailed) {
                return new Failure(Category.EXECUTION, "服务器无法启动 SteamCMD，请检查下载器配置", false, true);
            }
            if (containsAny(output, "steam guard", "steamguard", "two-factor", "two factor", "auth code",
                    "invalid password", "login failure", "account logon denied", "please confirm your age")) {
                return new Failure(Category.AUTHENTICATION, "Steam 账号验证失败，请检查登录凭据或完成 Steam Guard 验证", false, true);
            }
            if (containsAny(output, "not subscribed", "no subscription", "access denied", "not owner",
                    "not owned", "does not own", "missing license", "no license")) {
                return new Failure(Category.OWNERSHIP, "当前 Steam 账号无权下载此创意工坊内容", false, true);
            }
            if (containsAny(output, "invalid workshop item", "invalid item", "item not found", "content unavailable",
                    "manifest unavailable", "no files downloaded")) {
                return new Failure(Category.CONTENT, "创意工坊内容无效或已不可用，请检查条目", false, true);
            }
            if (timedOut) {
                return new Failure(Category.TIMEOUT, "SteamCMD 下载超时，请稍后重试", true, false);
            }
            if (containsAny(output, "failed to connect", "connection timed out", "connection reset",
                    "network is unreachable", "network failure", "no connection", "http error 5")) {
                return new Failure(Category.NETWORK, "Steam 网络连接暂时失败，系统已进行有限重试", true, false);
            }
            if (containsAny(output, "error!", " failed", "failure", "cannot", "unable to")) {
                return new Failure(Category.UNKNOWN,
                        "SteamCMD 下载失败，原因无法安全识别；可手动重试或本地导入", false, false);
            }
            return Failure.NONE;
        }

        static boolean hasSuccessfulDownloadMarker(String rawOutput, String expectedItemId) {
            String output = rawOutput == null ? "" : rawOutput.toLowerCase(Locale.ROOT);
            String itemId = expectedItemId == null ? "" : expectedItemId.trim();
            return itemId.matches("\\d{3,20}")
                    && output.contains("success. downloaded item " + itemId + " to");
        }

        static int priority(Failure failure) {
            return switch (failure.category()) {
                case AUTHENTICATION, OWNERSHIP, CONTENT, EXECUTION, INTERRUPTED -> 4;
                case NETWORK, TIMEOUT -> 3;
                case UNKNOWN -> 2;
                case NONE -> 0;
            };
        }

        private static boolean containsAny(String text, String... tokens) {
            for (String token : tokens) {
                if (text.contains(token)) {
                    return true;
                }
            }
            return false;
        }
    }
}
