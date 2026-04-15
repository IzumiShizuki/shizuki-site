package n1;

import g2.g1;
import g2.n1;
import g2.u0;
import g2.w0;
import g2.x0;
import i2.l0;
import i2.q0;
import i2.z;
import j1.p;
import q1.k;
import r.y1;
import vb.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p implements z, i2.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v1.b f15245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j1.d f15247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g2.p f15248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f15249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f15250t;

    public static boolean C0(long j10) {
        return !p1.e.a(j10, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean D0(long j10) {
        return !p1.e.a(j10, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean B0() {
        return this.f15246p && this.f15245o.h() != 9205357640488583168L;
    }

    public final long E0(long j10) {
        boolean z10 = false;
        boolean z11 = f3.a.d(j10) && f3.a.c(j10);
        if (f3.a.f(j10) && f3.a.e(j10)) {
            z10 = true;
        }
        if ((!B0() && z11) || z10) {
            return f3.a.a(j10, f3.a.h(j10), 0, f3.a.g(j10), 0, 10);
        }
        long jH = this.f15245o.h();
        int iRound = D0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : f3.a.j(j10);
        int iRound2 = C0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : f3.a.i(j10);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3.b.f(iRound2, j10))) & 4294967295L) | (((long) Float.floatToRawIntBits(f3.b.g(iRound, j10))) << 32);
        if (B0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!D0(this.f15245o.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f15245o.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!C0(this.f15245o.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f15245o.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : n1.l(jFloatToRawIntBits2, this.f15248r.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return f3.a.a(j10, f3.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j10), 0, f3.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j10), 0, 10);
    }

    @Override // i2.p
    public final void R(l0 l0Var) {
        s1.b bVar = l0Var.f8782a;
        long jH = this.f15245o.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(D0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (bVar.f19346b.D() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(C0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (bVar.f19346b.D() & 4294967295L)))) & 4294967295L);
        long jL = (Float.intBitsToFloat((int) (bVar.f19346b.D() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.f19346b.D() & 4294967295L)) == 0.0f) ? 0L : n1.l(jFloatToRawIntBits, this.f15248r.a(jFloatToRawIntBits, bVar.f19346b.D()));
        long jA = this.f15247q.a((((long) Math.round(Float.intBitsToFloat((int) (jL >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jL & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.f19346b.D() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.f19346b.D() & 4294967295L)))) & 4294967295L), l0Var.getLayoutDirection());
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((y1) bVar.f19346b.f3618b).i0(f10, f11);
        try {
            this.f15245o.g(l0Var, jL, this.f15249s, this.f15250t);
            ((y1) bVar.f19346b.f3618b).i0(-f10, -f11);
            l0Var.b();
        } catch (Throwable th2) {
            ((y1) bVar.f19346b.f3618b).i0(-f10, -f11);
            throw th2;
        }
    }

    @Override // i2.z
    public final int b(q0 q0Var, u0 u0Var, int i10) {
        if (!B0()) {
            return u0Var.L(i10);
        }
        long jE0 = E0(f3.b.b(i10, 0, 13));
        return Math.max(f3.a.i(jE0), u0Var.L(i10));
    }

    @Override // i2.z
    public final int c(q0 q0Var, u0 u0Var, int i10) {
        if (!B0()) {
            return u0Var.b(i10);
        }
        long jE0 = E0(f3.b.b(i10, 0, 13));
        return Math.max(f3.a.i(jE0), u0Var.b(i10));
    }

    @Override // i2.z
    public final int d(q0 q0Var, u0 u0Var, int i10) {
        if (!B0()) {
            return u0Var.t(i10);
        }
        long jE0 = E0(f3.b.b(0, i10, 7));
        return Math.max(f3.a.j(jE0), u0Var.t(i10));
    }

    @Override // i2.z
    public final int f(q0 q0Var, u0 u0Var, int i10) {
        if (!B0()) {
            return u0Var.m(i10);
        }
        long jE0 = E0(f3.b.b(0, i10, 7));
        return Math.max(f3.a.j(jE0), u0Var.m(i10));
    }

    @Override // i2.z
    public final w0 g(x0 x0Var, u0 u0Var, long j10) {
        g1 g1VarV = u0Var.v(E0(j10));
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, s.f22820a, new b0.p(g1VarV, 7));
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f15245o + ", sizeToIntrinsics=" + this.f15246p + ", alignment=" + this.f15247q + ", alpha=" + this.f15249s + ", colorFilter=" + this.f15250t + ')';
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
