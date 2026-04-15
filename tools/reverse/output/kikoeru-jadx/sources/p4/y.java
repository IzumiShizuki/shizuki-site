package p4;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f16631d = new ThreadLocal();

    public y(long j10) {
        g(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long jLongValue = this.f16628a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f16631d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f16629b = jLongValue - j10;
                notifyAll();
            }
            this.f16630c = j10;
            return j10 + this.f16629b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f16630c;
            if (j11 != -9223372036854775807L) {
                int i10 = c0.f16548a;
                long jV = c0.V(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + jV) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - jV) < Math.abs(j14 - jV) ? j13 : j14;
            }
            long j15 = j10;
            int i11 = c0.f16548a;
            return a(c0.V(j15, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f16630c;
        if (j11 != -9223372036854775807L) {
            int i10 = c0.f16548a;
            long jV = c0.V(j11, 90000L, 1000000L, RoundingMode.DOWN);
            long j12 = jV / 8589934592L;
            Long.signum(j12);
            long j13 = (j12 * 8589934592L) + j10;
            j10 = j13 >= jV ? j13 : ((j12 + 1) * 8589934592L) + j10;
        }
        long j14 = j10;
        int i11 = c0.f16548a;
        return a(c0.V(j14, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j10;
        j10 = this.f16628a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long e() {
        return this.f16629b;
    }

    public final synchronized boolean f() {
        return this.f16629b != -9223372036854775807L;
    }

    public final synchronized void g(long j10) {
        this.f16628a = j10;
        this.f16629b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f16630c = -9223372036854775807L;
    }

    public final synchronized void h(long j10, boolean z10) {
        try {
            c.i(this.f16628a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z10) {
                this.f16631d.set(Long.valueOf(j10));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
