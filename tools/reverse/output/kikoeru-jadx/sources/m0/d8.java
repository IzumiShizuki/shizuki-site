package m0;

import androidx.compose.foundation.BorderModifierNodeElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d8 f12873a = new d8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12874b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12875c = 280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12876d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12877e = 2;

    public static g0.f d(x0.o oVar) {
        g0.f fVar = ((y5) oVar.j(z5.f13997a)).f13961a;
        pe.d dVar = g0.b.f7115a;
        return g0.f.b(fVar, null, dVar, dVar, 3);
    }

    public static j1.q e(j1.q qVar, boolean z10, boolean z11, w.k kVar, x1 x1Var) {
        return j1.a.a(qVar, new c8(z10, z11, kVar, x1Var));
    }

    public static x1 f(long j10, long j11, long j12, long j13, long j14, long j15, x0.o oVar, int i10) {
        long jB;
        long j16;
        long jB2;
        long jB3;
        long jB4 = (i10 & 1) != 0 ? q1.q.b(((Number) oVar.j(h1.f13043a)).floatValue(), ((q1.q) oVar.j(j1.f13125a)).f17577a) : j10;
        x0.z zVar = j1.f13125a;
        long j17 = ((q1.q) oVar.j(zVar)).f17577a;
        x0.o2 o2Var = c1.f12773a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j17);
        } else {
            q1.h0.r(j17);
        }
        long jB5 = q1.q.b(0.38f, jB4);
        long jB6 = q1.q.b(0.12f, ((b1) oVar.j(o2Var)).e());
        long jF = (i10 & 8) != 0 ? ((b1) oVar.j(o2Var)).f() : j11;
        long jB7 = ((b1) oVar.j(o2Var)).b();
        if ((i10 & 32) != 0) {
            long jF2 = ((b1) oVar.j(o2Var)).f();
            long j18 = ((q1.q) oVar.j(zVar)).f17577a;
            jB = q1.q.b((!((b1) oVar.j(o2Var)).j() ? ((double) q1.h0.r(j18)) < 0.5d : ((double) q1.h0.r(j18)) > 0.5d) ? 0.87f : 1.0f, jF2);
        } else {
            jB = j12;
        }
        if ((i10 & 64) != 0) {
            j16 = jB;
            jB2 = q1.q.b(0.42f, ((b1) oVar.j(o2Var)).e());
        } else {
            j16 = jB;
            jB2 = j13;
        }
        if ((i10 & 128) != 0) {
            long j19 = ((q1.q) oVar.j(zVar)).f17577a;
            if (((b1) oVar.j(o2Var)).j()) {
                q1.h0.r(j19);
            } else {
                q1.h0.r(j19);
            }
            jB3 = q1.q.b(0.38f, jB2);
        } else {
            jB3 = j14;
        }
        long jB8 = (i10 & 256) != 0 ? ((b1) oVar.j(o2Var)).b() : j15;
        long j20 = jB2;
        long jB9 = q1.q.b(0.54f, ((b1) oVar.j(o2Var)).e());
        long j21 = jB4;
        long j22 = ((q1.q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j22);
        } else {
            q1.h0.r(j22);
        }
        long jB10 = q1.q.b(0.38f, jB9);
        long jB11 = q1.q.b(0.54f, ((b1) oVar.j(o2Var)).e());
        long j23 = ((q1.q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j23);
        } else {
            q1.h0.r(j23);
        }
        long jB12 = q1.q.b(0.38f, jB11);
        long jB13 = ((b1) oVar.j(o2Var)).b();
        long jF3 = ((b1) oVar.j(o2Var)).f();
        long j24 = ((q1.q) oVar.j(zVar)).f17577a;
        long jB14 = q1.q.b((!((b1) oVar.j(o2Var)).j() ? ((double) q1.h0.r(j24)) < 0.5d : ((double) q1.h0.r(j24)) > 0.5d) ? 0.87f : 1.0f, jF3);
        long jE = ((b1) oVar.j(o2Var)).e();
        long j25 = ((q1.q) oVar.j(zVar)).f17577a;
        long jB15 = q1.q.b((!((b1) oVar.j(o2Var)).j() ? ((double) q1.h0.r(j25)) < 0.5d : ((double) q1.h0.r(j25)) > 0.5d) ? 0.6f : 0.74f, jE);
        long j26 = ((q1.q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j26);
        } else {
            q1.h0.r(j26);
        }
        long jB16 = q1.q.b(0.38f, jB15);
        long jB17 = ((b1) oVar.j(o2Var)).b();
        long jE2 = ((b1) oVar.j(o2Var)).e();
        long j27 = ((q1.q) oVar.j(zVar)).f17577a;
        long jB18 = q1.q.b((!((b1) oVar.j(o2Var)).j() ? ((double) q1.h0.r(j27)) < 0.5d : ((double) q1.h0.r(j27)) > 0.5d) ? 0.6f : 0.74f, jE2);
        long j28 = ((q1.q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j28);
        } else {
            q1.h0.r(j28);
        }
        return new x1(j21, jB5, jF, jB7, j16, j20, jB8, jB3, jB9, jB10, jB9, jB11, jB12, jB13, jB6, jB14, jB15, jB16, jB17, jB18, q1.q.b(0.38f, jB18));
    }

    public final void a(final boolean z10, final boolean z11, final w.k kVar, final x1 x1Var, final q1.l0 l0Var, float f10, float f11, x0.o oVar, final int i10) {
        final float f12;
        final float f13;
        int i11;
        float f14;
        float f15;
        oVar.Y(943754022);
        int i12 = i10 | (oVar.g(z10) ? 4 : 2) | (oVar.g(z11) ? 32 : 16) | (oVar.f(kVar) ? 256 : 128) | (oVar.f(x1Var) ? 2048 : 1024) | (oVar.f(l0Var) ? 16384 : 8192) | 589824;
        if (oVar.N(i12 & 1, (4793491 & i12) != 4793490)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                i11 = i12 & (-4128769);
                f14 = f12877e;
                f15 = f12876d;
            } else {
                oVar.Q();
                i11 = i12 & (-4128769);
                f14 = f10;
                f15 = f11;
            }
            oVar.q();
            s.o oVar2 = (s.o) lc.b.g(z10, z11, kVar, x1Var, f14, f15, oVar, i11 & 8190).getValue();
            y.p.a(new BorderModifierNodeElement(oVar2.f19235a, oVar2.f19236b, l0Var), oVar, 0);
            f12 = f14;
            f13 = f15;
        } else {
            oVar.Q();
            f12 = f10;
            f13 = f11;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(z10, z11, kVar, x1Var, l0Var, f12, f13, i10) { // from class: m0.b8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f12758b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f12759c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ w.k f12760d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ x1 f12761e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ q1.l0 f12762f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f12763g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f12764h;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(12582913);
                    this.f12757a.a(this.f12758b, this.f12759c, this.f12760d, this.f12761e, this.f12762f, this.f12763g, this.f12764h, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public final void b(final String str, final ic.n nVar, final boolean z10, final boolean z11, final y2.g0 g0Var, final w.k kVar, final boolean z12, final ic.n nVar2, final ic.n nVar3, final ic.n nVar4, final ic.n nVar5, final q1.l0 l0Var, final x1 x1Var, y.d1 d1Var, final f1.f fVar, x0.o oVar, final int i10) {
        int i11;
        ic.n nVar6;
        boolean z13;
        boolean z14;
        y2.g0 g0Var2;
        final y.d1 d1Var2;
        y.d1 e1Var;
        int i12;
        oVar.Y(1154925202);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            nVar6 = nVar;
            i11 |= oVar.h(nVar6) ? 32 : 16;
        } else {
            nVar6 = nVar;
        }
        if ((i10 & 384) == 0) {
            z13 = z10;
            i11 |= oVar.g(z13) ? 256 : 128;
        } else {
            z13 = z10;
        }
        if ((i10 & 3072) == 0) {
            z14 = z11;
            i11 |= oVar.g(z14) ? 2048 : 1024;
        } else {
            z14 = z11;
        }
        if ((i10 & 24576) == 0) {
            g0Var2 = g0Var;
            i11 |= oVar.f(g0Var2) ? 16384 : 8192;
        } else {
            g0Var2 = g0Var;
        }
        if ((i10 & 196608) == 0) {
            i11 |= oVar.f(kVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= oVar.g(z12) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= oVar.h(nVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= oVar.h(nVar3) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= oVar.h(nVar4) ? 536870912 : 268435456;
        }
        int i13 = 221184 | (oVar.h(nVar5) ? 4 : 2) | (oVar.f(l0Var) ? 32 : 16) | (oVar.f(x1Var) ? 256 : 128) | 1024;
        if (oVar.N(i11 & 1, ((306783379 & i11) == 306783378 && (74899 & i13) == 74898) ? false : true)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                float f10 = m8.f13298a;
                e1Var = new y.e1(f10, f10, f10, f10);
                i12 = i13 & (-7169);
            } else {
                oVar.Q();
                i12 = i13 & (-7169);
                e1Var = d1Var;
            }
            oVar.q();
            int i14 = i11 << 3;
            int i15 = ((i11 >> 3) & 7168) | (i14 & 112) | 6 | (i14 & 896);
            int i16 = i11 >> 9;
            int i17 = i15 | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | ((i12 << 21) & 29360128) | ((i11 << 15) & 234881024) | ((i11 << 21) & 1879048192);
            int i18 = i12 << 6;
            boolean z15 = z14;
            y.d1 d1Var3 = e1Var;
            m8.a(w8.f13843b, str, nVar6, g0Var2, nVar2, nVar3, nVar4, nVar5, z15, z13, z12, kVar, d1Var3, l0Var, x1Var, fVar, oVar, i17, ((i11 >> 18) & 14) | ((i11 >> 12) & 112) | (i18 & 7168) | (i18 & 57344) | 196608);
            d1Var2 = d1Var3;
        } else {
            oVar.Q();
            d1Var2 = d1Var;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.a8
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(i10 | 1);
                    this.f12668a.b(str, nVar, z10, z11, g0Var, kVar, z12, nVar2, nVar3, nVar4, nVar5, l0Var, x1Var, d1Var2, fVar, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public final void c(final String str, final ic.n nVar, final boolean z10, final boolean z11, final y2.g0 g0Var, final w.k kVar, final boolean z12, final ic.n nVar2, final ic.n nVar3, final ic.n nVar4, final ic.n nVar5, final q1.l0 l0Var, final x1 x1Var, y.d1 d1Var, x0.o oVar, final int i10) {
        int i11;
        boolean z13;
        boolean z14;
        final y.d1 d1Var2;
        y.d1 e1Var;
        int i12;
        oVar.Y(2088762355);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z13 = z10;
            i11 |= oVar.g(z13) ? 256 : 128;
        } else {
            z13 = z10;
        }
        if ((i10 & 3072) == 0) {
            z14 = z11;
            i11 |= oVar.g(z14) ? 2048 : 1024;
        } else {
            z14 = z11;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.f(g0Var) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i11 |= oVar.f(kVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= oVar.g(z12) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= oVar.h(nVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= oVar.h(nVar3) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= oVar.h(nVar4) ? 536870912 : 268435456;
        }
        int i13 = 24576 | (oVar.h(nVar5) ? 4 : 2) | (oVar.f(l0Var) ? 32 : 16) | (oVar.f(x1Var) ? 256 : 128) | 1024;
        if (oVar.N(i11 & 1, ((306783379 & i11) == 306783378 && (i13 & 9363) == 9362) ? false : true)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                if (nVar2 == null) {
                    float f10 = m8.f13298a;
                    e1Var = new y.e1(f10, f10, f10, f10);
                } else {
                    float f11 = m8.f13298a;
                    e1Var = new y.e1(f11, r8.f13576a, f11, r8.f13577b);
                }
                i12 = i13 & (-7169);
            } else {
                oVar.Q();
                i12 = i13 & (-7169);
                e1Var = d1Var;
            }
            oVar.q();
            int i14 = i11 << 3;
            int i15 = i11 >> 9;
            int i16 = (i14 & 896) | (i14 & 112) | 6 | ((i11 >> 3) & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | ((i12 << 21) & 29360128) | ((i11 << 15) & 234881024) | ((i11 << 21) & 1879048192);
            int i17 = i12 << 6;
            y.d1 d1Var3 = e1Var;
            m8.a(w8.f13842a, str, nVar, g0Var, nVar2, nVar3, nVar4, nVar5, z14, z13, z12, kVar, d1Var3, l0Var, x1Var, null, oVar, i16, ((i11 >> 18) & 14) | 196608 | ((i11 >> 12) & 112) | (i17 & 7168) | (i17 & 57344));
            d1Var2 = d1Var3;
        } else {
            oVar.Q();
            d1Var2 = d1Var;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.z7
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(i10 | 1);
                    this.f14002a.c(str, nVar, z10, z11, g0Var, kVar, z12, nVar2, nVar3, nVar4, nVar5, l0Var, x1Var, d1Var2, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }
}
