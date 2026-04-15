package i8;

import g2.g1;
import g2.l1;
import g2.n1;
import g2.u0;
import g2.w0;
import g2.x0;
import i2.l0;
import i2.q0;
import i2.z;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends j1.p implements i2.p, z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f9453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j1.d f9454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g2.p f9455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f9456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q1.k f9457s;

    public final long B0(long j10) {
        if (p1.e.e(j10)) {
            return 0L;
        }
        long jH = this.f9453o.h();
        if (jH == 9205357640488583168L) {
            return j10;
        }
        float fD = p1.e.d(jH);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = p1.e.d(j10);
        }
        float fB = p1.e.b(jH);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = p1.e.b(j10);
        }
        long jD = nh.a.d(fD, fB);
        long jA = this.f9455q.a(jD, j10);
        int i10 = l1.f7233a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j10;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j10 : n1.l(jD, jA);
    }

    public final long C0(long j10) {
        float fJ;
        int i10;
        float fJ2;
        boolean zF = f3.a.f(j10);
        boolean zE = f3.a.e(j10);
        if (!zF || !zE) {
            boolean z10 = f3.a.d(j10) && f3.a.c(j10);
            long jH = this.f9453o.h();
            if (jH != 9205357640488583168L) {
                if (z10 && (zF || zE)) {
                    fJ = f3.a.h(j10);
                    i10 = f3.a.g(j10);
                } else {
                    float fD = p1.e.d(jH);
                    float fB = p1.e.b(jH);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fJ = f3.a.j(j10);
                    } else {
                        t8.e eVar = w.f9470b;
                        fJ = nh.b.j(fD, f3.a.j(j10), f3.a.h(j10));
                    }
                    if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                        t8.e eVar2 = w.f9470b;
                        fJ2 = nh.b.j(fB, f3.a.i(j10), f3.a.g(j10));
                        long jB0 = B0(nh.a.d(fJ, fJ2));
                        return f3.a.a(j10, f3.b.g(lc.b.R(p1.e.d(jB0)), j10), 0, f3.b.f(lc.b.R(p1.e.b(jB0)), j10), 0, 10);
                    }
                    i10 = f3.a.i(j10);
                }
                fJ2 = i10;
                long jB02 = B0(nh.a.d(fJ, fJ2));
                return f3.a.a(j10, f3.b.g(lc.b.R(p1.e.d(jB02)), j10), 0, f3.b.f(lc.b.R(p1.e.b(jB02)), j10), 0, 10);
            }
            if (z10) {
                return f3.a.a(j10, f3.a.h(j10), 0, f3.a.g(j10), 0, 10);
            }
        }
        return j10;
    }

    @Override // i2.p
    public final void R(l0 l0Var) {
        s1.b bVar = l0Var.f8782a;
        long jB0 = B0(bVar.f19346b.D());
        j1.d dVar = this.f9454p;
        t8.e eVar = w.f9470b;
        long jC = gh.g.c(lc.b.R(p1.e.d(jB0)), lc.b.R(p1.e.b(jB0)));
        long jD = bVar.f19346b.D();
        long jA = dVar.a(jC, gh.g.c(lc.b.R(p1.e.d(jD)), lc.b.R(p1.e.b(jD))), l0Var.getLayoutDirection());
        int i10 = (int) (jA & 4294967295L);
        float f10 = (int) (jA >> 32);
        float f11 = i10;
        ((y1) bVar.f19346b.f3618b).i0(f10, f11);
        this.f9453o.g(l0Var, jB0, this.f9456r, this.f9457s);
        ((y1) bVar.f19346b.f3618b).i0(-f10, -f11);
        l0Var.b();
    }

    @Override // i2.z
    public final int b(q0 q0Var, u0 u0Var, int i10) {
        if (this.f9453o.h() == 9205357640488583168L) {
            return u0Var.L(i10);
        }
        int iL = u0Var.L(f3.a.h(C0(f3.b.b(i10, 0, 13))));
        return Math.max(lc.b.R(p1.e.b(B0(nh.a.d(i10, iL)))), iL);
    }

    @Override // i2.z
    public final int c(q0 q0Var, u0 u0Var, int i10) {
        if (this.f9453o.h() == 9205357640488583168L) {
            return u0Var.b(i10);
        }
        int iB = u0Var.b(f3.a.h(C0(f3.b.b(i10, 0, 13))));
        return Math.max(lc.b.R(p1.e.b(B0(nh.a.d(i10, iB)))), iB);
    }

    @Override // i2.z
    public final int d(q0 q0Var, u0 u0Var, int i10) {
        if (this.f9453o.h() == 9205357640488583168L) {
            return u0Var.t(i10);
        }
        int iT = u0Var.t(f3.a.g(C0(f3.b.b(0, i10, 7))));
        return Math.max(lc.b.R(p1.e.d(B0(nh.a.d(iT, i10)))), iT);
    }

    @Override // i2.z
    public final int f(q0 q0Var, u0 u0Var, int i10) {
        if (this.f9453o.h() == 9205357640488583168L) {
            return u0Var.m(i10);
        }
        int iM = u0Var.m(f3.a.g(C0(f3.b.b(0, i10, 7))));
        return Math.max(lc.b.R(p1.e.d(B0(nh.a.d(iM, i10)))), iM);
    }

    @Override // i2.z
    public final w0 g(x0 x0Var, u0 u0Var, long j10) {
        g1 g1VarV = u0Var.v(C0(j10));
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new p(g1VarV, 1));
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
