package z4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import tc.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f26449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f26450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f26451l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, b0 b0Var, b0 b0Var2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f26449j = b0Var;
        this.f26450k = b0Var2;
        this.f26451l = j13;
    }

    @Override // z4.s
    public final j a(m mVar) {
        b0 b0Var = this.f26449j;
        if (b0Var == null) {
            return this.f26456a;
        }
        m4.q qVar = mVar.f26437a;
        return new j(b0Var.h(0L, qVar.f14531a, 0L, qVar.f14540j), 0L, -1L);
    }

    @Override // z4.n
    public final long d(long j10) {
        if (this.f26444f != null) {
            return r0.size();
        }
        long j11 = this.f26451l;
        if (j11 != -1) {
            return (j11 - this.f26442d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f26457b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f26443e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = ab.a.f295a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // z4.n
    public final j h(k kVar, long j10) {
        long j11 = this.f26442d;
        List list = this.f26444f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).f26452a : (j10 - j11) * this.f26443e;
        m4.q qVar = kVar.f26437a;
        return new j(this.f26450k.h(j10, qVar.f14531a, j12, qVar.f14540j), 0L, -1L);
    }
}
