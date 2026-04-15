package m6;

import java.math.BigInteger;
import r5.a0;
import r5.b0;
import r5.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f14766a;

    public a(b bVar) {
        this.f14766a = bVar;
    }

    @Override // r5.b0
    public final boolean e() {
        return true;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        b bVar = this.f14766a;
        long j11 = (((long) bVar.f14770d.f14807i) * j10) / 1000000;
        long j12 = bVar.f14768b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j11);
        long j13 = bVar.f14769c;
        c0 c0Var = new c0(j10, p4.c0.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j13 - j12)).divide(BigInteger.valueOf(bVar.f14772f)).longValue() + j12) - 30000, bVar.f14768b, j13 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override // r5.b0
    public final long m() {
        b bVar = this.f14766a;
        return (bVar.f14772f * 1000000) / ((long) bVar.f14770d.f14807i);
    }
}
