package k6;

import android.util.Pair;
import p4.c0;
import r5.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f11122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f11123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11124c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.f11122a = jArr;
        this.f11123b = jArr2;
        this.f11124c = j10 == -9223372036854775807L ? c0.N(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iE = c0.e(jArr, j10, true);
        long j11 = jArr[iE];
        long j12 = jArr2[iE];
        int i10 = iE + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // k6.f
    public final long b(long j10) {
        return c0.N(((Long) a(j10, this.f11122a, this.f11123b).second).longValue());
    }

    @Override // k6.f
    public final long d() {
        return -1L;
    }

    @Override // r5.b0
    public final boolean e() {
        return true;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        Pair pairA = a(c0.c0(c0.j(j10, 0L, this.f11124c)), this.f11123b, this.f11122a);
        r5.c0 c0Var = new r5.c0(c0.N(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override // k6.f
    public final int l() {
        return -2147483647;
    }

    @Override // r5.b0
    public final long m() {
        return this.f11124c;
    }
}
