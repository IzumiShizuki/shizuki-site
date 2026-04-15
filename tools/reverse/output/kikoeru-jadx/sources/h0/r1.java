package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.i0 f7827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2.c0 f7828b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g2.c0 f7829c;

    public r1(g2.c0 c0Var, t2.i0 i0Var) {
        this.f7827a = i0Var;
        this.f7829c = c0Var;
    }

    public final long a(long j10) {
        p1.c cVarS;
        g2.c0 c0Var = this.f7828b;
        p1.c cVar = p1.c.f16482e;
        if (c0Var != null) {
            if (c0Var.h()) {
                g2.c0 c0Var2 = this.f7829c;
                cVarS = c0Var2 != null ? c0Var2.s(c0Var, true) : null;
            } else {
                cVarS = cVar;
            }
            if (cVarS != null) {
                cVar = cVarS;
            }
        }
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = cVar.f16483a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = cVar.f16485c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = cVar.f16484b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = cVar.f16486d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f7827a.f20345b.g(d(j10));
    }

    public final boolean c(long j10) {
        long jD = d(a(j10));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        t2.i0 i0Var = this.f7827a;
        int iE = i0Var.f20345b.e(fIntBitsToFloat);
        int i10 = (int) (jD >> 32);
        return Float.intBitsToFloat(i10) >= i0Var.e(iE) && Float.intBitsToFloat(i10) <= i0Var.f(iE);
    }

    public final long d(long j10) {
        g2.c0 c0Var;
        g2.c0 c0Var2 = this.f7828b;
        if (c0Var2 == null) {
            return j10;
        }
        if (!c0Var2.h()) {
            c0Var2 = null;
        }
        if (c0Var2 == null || (c0Var = this.f7829c) == null) {
            return j10;
        }
        g2.c0 c0Var3 = c0Var.h() ? c0Var : null;
        return c0Var3 == null ? j10 : c0Var2.o(c0Var3, j10);
    }

    public final long e(long j10) {
        g2.c0 c0Var;
        g2.c0 c0Var2 = this.f7828b;
        if (c0Var2 == null) {
            return j10;
        }
        if (!c0Var2.h()) {
            c0Var2 = null;
        }
        if (c0Var2 == null || (c0Var = this.f7829c) == null) {
            return j10;
        }
        g2.c0 c0Var3 = c0Var.h() ? c0Var : null;
        return c0Var3 == null ? j10 : c0Var3.o(c0Var2, j10);
    }
}
