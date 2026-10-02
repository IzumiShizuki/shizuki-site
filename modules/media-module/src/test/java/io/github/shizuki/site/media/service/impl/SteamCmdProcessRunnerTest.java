package io.github.shizuki.site.media.service.impl;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SteamCmdProcessRunnerTest {
    private static final List<String> WORKSHOP_COMMAND = List.of(
            "steamcmd", "+workshop_download_item", "431960", "123", "+quit");

    @Test
    void retriesExplicitNetworkFailureAndStopsAfterSuccessfulSecondAttempt() {
        Queue<Process> processes = new ArrayDeque<>(List.of(
                new FakeProcess(1, "Failed to connect to Steam servers"),
                new FakeProcess(0, "Workshop download complete")));
        AtomicInteger starts = new AtomicInteger();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> {
            starts.incrementAndGet();
            return processes.remove();
        });

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> true);

        assertTrue(result.succeeded());
        assertEquals(2, starts.get());
        assertEquals(2, result.attempt());
    }

    @Test
    void doesNotRetryAuthenticationEvenWhenItTimesOutWaitingForGuard() {
        AtomicInteger starts = new AtomicInteger();
        FakeProcess hung = new FakeProcess(1, "Steam Guard authorization code required").neverCompletes();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> {
            starts.incrementAndGet();
            return hung;
        });

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 1, ignored -> { }, () -> false);

        assertEquals(SteamCmdProcessRunner.Category.AUTHENTICATION, result.failure().category());
        assertEquals(1, starts.get());
        assertFalse(hung.isAlive());
        assertFalse(result.failure().safeMessage().contains("authorization code"));
    }

    @Test
    void retainsClassificationEvidenceEvenWhenItFallsOutsideTheOutputTail() {
        AtomicInteger starts = new AtomicInteger();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> {
            starts.incrementAndGet();
            return new FakeProcess(1, "Steam Guard authorization code required "
                    + "x".repeat(SteamCmdProcessRunner.MAX_OUTPUT_CHARS + 100));
        });

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> false);

        assertEquals(SteamCmdProcessRunner.Category.AUTHENTICATION, result.failure().category());
        assertEquals(1, starts.get());
        assertFalse(result.output().contains("Steam Guard"));
    }

    @Test
    void doesNotGuessThatGenericSteamFailureIsTransient() {
        AtomicInteger starts = new AtomicInteger();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> {
            starts.incrementAndGet();
            return new FakeProcess(5, "ERROR! Download item 123 failed (Failure).");
        });

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> false);

        assertEquals(SteamCmdProcessRunner.Category.UNKNOWN, result.failure().category());
        assertEquals(1, starts.get());
        assertFalse(result.failure().safeMessage().contains("Download item"));
    }

    @Test
    void acceptsNonzeroExitOnlyWithSuccessMarkerAndValidatedContent() {
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command ->
                new FakeProcess(1, "Success. Downloaded item 123 to /workshop/content/123"));

        SteamCmdProcessRunner.Execution accepted = runner.run(WORKSHOP_COMMAND, 5, ignored -> { }, () -> true);
        SteamCmdProcessRunner.Execution rejected = runner.run(WORKSHOP_COMMAND, 5, ignored -> { }, () -> false);

        assertTrue(accepted.succeeded());
        assertEquals(SteamCmdProcessRunner.Category.UNKNOWN, rejected.failure().category());
    }

    @Test
    void retriesTransientErrorEvenWhenSteamCmdExitsZeroAndAcceptsValidatedSuccessMarker() {
        AtomicInteger starts = new AtomicInteger();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> {
            starts.incrementAndGet();
            String output = starts.get() == 1
                    ? "Failed to connect to Steam servers"
                    : "Failed to connect to one server; Success. Downloaded item 123 to: /content/123";
            return new FakeProcess(0, output);
        });

        SteamCmdProcessRunner.Execution result = runner.run(WORKSHOP_COMMAND, 5, ignored -> { }, () -> true);

        assertTrue(result.succeeded());
        assertEquals(2, starts.get());
    }

    @Test
    void zeroExitWithoutErrorEvidenceStillRequiresValidContent() {
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> new FakeProcess(0, "Workshop command complete"));

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> false);

        assertEquals(SteamCmdProcessRunner.Category.CONTENT, result.failure().category());
    }

    @Test
    void genericErrorWithZeroExitDoesNotPassOnlyBecauseContentExists() {
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command ->
                new FakeProcess(0, "ERROR! Download item 123 failed (Failure)."));

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> true);

        assertEquals(SteamCmdProcessRunner.Category.UNKNOWN, result.failure().category());
        assertFalse(result.succeeded());
    }

    @Test
    void unmarkedNonzeroExitDoesNotTreatPreviouslyPresentContentAsThisRunSuccess() {
        AtomicInteger validationCalls = new AtomicInteger();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command ->
                new FakeProcess(1, "ERROR! Download item 123 failed (Failure)."));

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> {
            validationCalls.incrementAndGet();
            return true;
        });

        assertEquals(SteamCmdProcessRunner.Category.UNKNOWN, result.failure().category());
        assertEquals(0, validationCalls.get(), "old files in the destination must not validate an unmarked attempt");
    }

    @Test
    void classifiesOwnershipTimeoutExecutionAndInvalidContentEvidence() {
        assertEquals(SteamCmdProcessRunner.Category.OWNERSHIP,
                SteamCmdProcessRunner.SteamCmdFailureClassifier.classify("No subscription", false, false).category());
        assertEquals(SteamCmdProcessRunner.Category.TIMEOUT,
                SteamCmdProcessRunner.SteamCmdFailureClassifier.classify("", true, false).category());
        assertEquals(SteamCmdProcessRunner.Category.EXECUTION,
                SteamCmdProcessRunner.SteamCmdFailureClassifier.classify("", false, true).category());
        assertEquals(SteamCmdProcessRunner.Category.CONTENT,
                SteamCmdProcessRunner.SteamCmdFailureClassifier.classify("Workshop item not found", false, false).category());
    }

    @Test
    void stopsAfterTheFixedTwoAttemptRetryBudgetIsExhausted() {
        AtomicInteger starts = new AtomicInteger();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> {
            starts.incrementAndGet();
            return new FakeProcess(1, "Connection reset by peer");
        });

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> false);

        assertEquals(SteamCmdProcessRunner.MAX_ATTEMPTS, starts.get());
        assertEquals(SteamCmdProcessRunner.MAX_ATTEMPTS, result.attempt());
        assertEquals(SteamCmdProcessRunner.Category.NETWORK, result.failure().category());
    }

    @Test
    void drainsButRetainsOnlyTheBoundedOutputTail() {
        String longOutput = "sensitive-token-" + "x".repeat(SteamCmdProcessRunner.MAX_OUTPUT_CHARS + 200);
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> new FakeProcess(7, longOutput));

        SteamCmdProcessRunner.Execution result = runner.run(List.of("steamcmd"), 5, ignored -> { }, () -> false);

        assertEquals(SteamCmdProcessRunner.MAX_OUTPUT_CHARS, result.output().length());
        assertFalse(result.output().contains("sensitive-token"));
    }

    @Test
    void interruptionTerminatesTheProcessAndRestoresInterruptFlag() throws Exception {
        FakeProcess process = new FakeProcess(1, "waiting").blockUntilInterrupted();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> process);
        AtomicReference<SteamCmdProcessRunner.Execution> result = new AtomicReference<>();
        AtomicReference<Boolean> interruptRestored = new AtomicReference<>(false);
        Thread worker = new Thread(() -> {
            result.set(runner.run(List.of("steamcmd"), 30, ignored -> { }, () -> false));
            interruptRestored.set(Thread.currentThread().isInterrupted());
        });
        worker.start();
        assertTrue(process.waitStarted.await(2, TimeUnit.SECONDS));
        worker.interrupt();
        worker.join(2_000L);

        assertFalse(worker.isAlive());
        assertFalse(process.isAlive());
        assertEquals(SteamCmdProcessRunner.Category.INTERRUPTED, result.get().failure().category());
        assertTrue(interruptRestored.get());
    }

    @Test
    void progressSamplerFailureStillTerminatesTheProcess() {
        FakeProcess process = new FakeProcess(1, "downloading").neverCompletes();
        SteamCmdProcessRunner runner = new SteamCmdProcessRunner(command -> process);

        org.junit.jupiter.api.Assertions.assertThrows(IllegalStateException.class,
                () -> runner.run(List.of("steamcmd"), 30, ignored -> {
                    throw new IllegalStateException("progress store failed");
                }, () -> false));

        assertFalse(process.isAlive());
    }

    private static final class FakeProcess extends Process {
        private final int exitCode;
        private final InputStream output;
        private boolean alive;
        private boolean neverCompletes;
        private boolean blockUntilInterrupted;
        private final CountDownLatch waitStarted = new CountDownLatch(1);

        private FakeProcess(int exitCode, String output) {
            this.exitCode = exitCode;
            this.output = new ByteArrayInputStream(output.getBytes(StandardCharsets.UTF_8));
        }

        private FakeProcess neverCompletes() {
            alive = true;
            neverCompletes = true;
            return this;
        }

        private FakeProcess blockUntilInterrupted() {
            alive = true;
            neverCompletes = true;
            blockUntilInterrupted = true;
            return this;
        }

        @Override
        public java.io.OutputStream getOutputStream() {
            return java.io.OutputStream.nullOutputStream();
        }

        @Override
        public InputStream getInputStream() {
            return output;
        }

        @Override
        public InputStream getErrorStream() {
            return InputStream.nullInputStream();
        }

        @Override
        public int waitFor() {
            alive = false;
            return exitCode;
        }

        @Override
        public boolean waitFor(long timeout, TimeUnit unit) throws InterruptedException {
            if (!alive) {
                return true;
            }
            if (neverCompletes) {
                waitStarted.countDown();
                if (blockUntilInterrupted) {
                    Thread.sleep(10_000L);
                }
                TimeUnit.MILLISECONDS.sleep(Math.min(20L, unit.toMillis(timeout)));
                return false;
            }
            alive = false;
            return true;
        }

        @Override
        public int exitValue() {
            if (alive) {
                throw new IllegalThreadStateException("still running");
            }
            return exitCode;
        }

        @Override
        public void destroy() {
            alive = false;
        }

        @Override
        public Process destroyForcibly() {
            alive = false;
            return this;
        }

        @Override
        public boolean isAlive() {
            return alive;
        }
    }
}
