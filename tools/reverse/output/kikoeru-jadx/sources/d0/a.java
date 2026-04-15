package d0;

import java.util.concurrent.CancellationException;
import x0.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5265a;

    public a(d dVar) {
        this.f5265a = dVar;
    }

    @Override // b2.a
    public final Object D(long j10, long j11, yb.c cVar) {
        return new f3.q(f3.q.a(j11, 0.0f, 0.0f, 1));
    }

    @Override // b2.a
    public final long F(int i10, long j10) {
        d dVar = this.f5265a;
        y yVar = dVar.f5311d;
        if (i10 != 1 || Math.abs(((a1) yVar.f5433d).e()) <= 1.0E-6d) {
            return 0L;
        }
        float fE = ((a1) yVar.f5433d).e() * dVar.m();
        float f10 = ((dVar.k().f5412b + dVar.k().f5413c) * (-Math.signum(((a1) yVar.f5433d).e()))) + fE;
        if (((a1) yVar.f5433d).e() > 0.0f) {
            f10 = fE;
            fE = f10;
        }
        float f11 = -dVar.f5318k.e(-nh.b.j(Float.intBitsToFloat((int) (j10 >> 32)), fE, f10));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    @Override // b2.a
    public final Object V(long j10, yb.c cVar) {
        return new f3.q(0L);
    }

    @Override // b2.a
    public final long X(int i10, long j10, long j11) {
        if (i10 != 2 || Float.intBitsToFloat((int) (j11 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
