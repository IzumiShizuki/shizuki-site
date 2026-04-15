package v0;

import j2.l1;
import l0.w0;
import m4.d1;
import r.v1;
import r.w1;
import u3.x0;
import x0.o2;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1.q f22332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f22333c = 240;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f22334d = w0.e.f23013a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f22335e = w0.a.f22983b - (w0.a.f22982a * 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r.r f22336f;

    static {
        float f10 = 10;
        f22331a = f10;
        f22332b = androidx.compose.foundation.layout.a.l(q2.m.a(androidx.compose.ui.layout.a.b(j1.n.f9689a, q.f22316b), true, r.f22317b), 0.0f, f10, 1);
        new r.r(0.2f, 0.8f);
        new r.r(0.4f, 1.0f);
        new r.r(0.0f, 0.65f);
        new r.r(0.1f, 0.45f);
        f22336f = new r.r(0.4f, 0.2f);
    }

    public static final void a(j1.q qVar, long j10, float f10, long j11, int i10, x0.o oVar, int i11) {
        int i12;
        long j12;
        float f11;
        long j13;
        float f12;
        long j14;
        long j15;
        float f13;
        long j16;
        int i13;
        Float fValueOf = Float.valueOf(290.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        oVar.Y(-115871647);
        if (((i11 | (oVar.f(qVar) ? 4 : 2) | 26000) & 9363) == 9362 && oVar.z()) {
            oVar.Q();
            j16 = j10;
            f13 = f10;
            j15 = j11;
            i13 = i10;
        } else {
            oVar.S();
            if ((i11 & 1) == 0 || oVar.x()) {
                float f14 = n.f22284a;
                oVar.X(1803349725);
                float f15 = w0.a.f22982a;
                long jA = c.a((a) oVar.j(c.f22176a), 26);
                oVar.p(false);
                float f16 = n.f22284a;
                oVar.X(-404222247);
                long j17 = q1.q.f17574g;
                oVar.p(false);
                i12 = n.f22285b;
                j12 = jA;
                f11 = f16;
                j13 = j17;
            } else {
                oVar.Q();
                j12 = j10;
                f11 = f10;
                j13 = j11;
                i12 = i10;
            }
            oVar.q();
            int i14 = i12;
            s1.h hVar = new s1.h(((f3.c) oVar.j(l1.f9866h)).Q(f11), 0.0f, i14, 0, 26);
            float f17 = f11;
            r.e0 e0VarP = r.d.p(oVar);
            v1 v1Var = w1.f18621b;
            d1 d1Var = r.w.f18601d;
            long j18 = j13;
            r.c0 c0VarJ = r.d.j(e0VarP, 0, 5, v1Var, r.d.o(r.d.r(6660, 0, d1Var, 2)), oVar, 33208, 16);
            r.c0 c0VarG = r.d.g(e0VarP, 286.0f, r.d.o(r.d.r(1332, 0, d1Var, 2)), oVar);
            r.g0 g0Var = new r.g0();
            g0Var.f18411a = 1332;
            r.f0 f0VarA = g0Var.a(fValueOf2, 0);
            r.r rVar = f22336f;
            f0VarA.f18400b = rVar;
            g0Var.a(fValueOf, 666);
            r.c0 c0VarG2 = r.d.g(e0VarP, 290.0f, r.d.o(new r.h0(g0Var)), oVar);
            r.g0 g0Var2 = new r.g0();
            g0Var2.f18411a = 1332;
            g0Var2.a(fValueOf2, 666).f18400b = rVar;
            g0Var2.a(fValueOf, g0Var2.f18411a);
            r.c0 c0VarG3 = r.d.g(e0VarP, 290.0f, r.d.o(new r.h0(g0Var2)), oVar);
            j1.q qVarJ = androidx.compose.foundation.layout.c.j(q2.m.a(qVar, true, s.k.f19197g), f22335e);
            oVar.X(821870113);
            boolean zE = oVar.e(j18) | oVar.h(hVar) | oVar.f(c0VarJ) | oVar.f(c0VarG2) | oVar.f(c0VarG3) | oVar.f(c0VarG) | oVar.e(j12);
            Object objK = oVar.K();
            if (zE || objK == x0.k.f24334a) {
                f12 = f17;
                j14 = j12;
                Object oVar2 = new o(f12, j18, j14, c0VarJ, c0VarG2, c0VarG3, c0VarG, hVar);
                oVar.h0(oVar2);
                objK = oVar2;
            } else {
                f12 = f17;
                j14 = j12;
            }
            oVar.p(false);
            nh.b.a(0, (ic.k) objK, qVarJ, oVar);
            j15 = j18;
            f13 = f12;
            j16 = j14;
            i13 = i14;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new p(qVar, j16, f13, j15, i13, i11);
        }
    }

    public static final void b(float f10, j1.q qVar, long j10, long j11, x0.o oVar, int i10) {
        long jA;
        long jA2;
        int i11;
        long j12;
        long j13;
        oVar.Y(905419617);
        int i12 = i10 | (oVar.c(f10) ? 4 : 2) | 25728;
        if ((i12 & 9363) == 9362 && oVar.z()) {
            oVar.Q();
            j12 = j10;
            j13 = j11;
        } else {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                float f11 = n.f22284a;
                oVar.X(-914312983);
                float f12 = w0.e.f23013a;
                o2 o2Var = c.f22176a;
                jA = c.a((a) oVar.j(o2Var), 26);
                oVar.p(false);
                oVar.X(1677541593);
                jA2 = c.a((a) oVar.j(o2Var), 44);
                oVar.p(false);
                i11 = i12 & (-8065);
            } else {
                oVar.Q();
                i11 = i12 & (-8065);
                jA = j10;
                jA2 = j11;
            }
            oVar.q();
            oVar.X(-1348535908);
            boolean z10 = (i11 & 14) == 4;
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new u(f10);
                oVar.h0(objK);
            }
            oVar.p(false);
            long j14 = jA;
            long j15 = jA2;
            c((ic.a) objK, qVar, j14, j15, oVar, 24624);
            j12 = j14;
            j13 = j15;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new v(f10, qVar, j12, j13, i10);
        }
    }

    public static final void c(ic.a aVar, j1.q qVar, long j10, long j11, x0.o oVar, int i10) {
        int i11;
        oVar.Y(-1796992155);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.e(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.e(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.d(0) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && oVar.z()) {
            oVar.Q();
        } else {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            oVar.X(-1348540816);
            boolean z10 = (i11 & 14) == 4;
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (z10 || objK == obj) {
                objK = new d0.i0(2, aVar);
                oVar.h0(objK);
            }
            ic.a aVar2 = (ic.a) objK;
            oVar.p(false);
            j1.q qVarE = qVar.e(f22332b);
            oVar.X(-1348540664);
            boolean zF = oVar.f(aVar2);
            Object objK2 = oVar.K();
            if (zF || objK2 == obj) {
                objK2 = new w0(3, aVar2);
                oVar.h0(objK2);
            }
            oVar.p(false);
            j1.q qVarK = androidx.compose.foundation.layout.c.k(q2.m.a(qVarE, true, (ic.k) objK2), f22333c, f22334d);
            oVar.X(-1348540492);
            boolean zF2 = ((((i11 & 7168) ^ 3072) > 2048 && oVar.e(j11)) || (i11 & 3072) == 2048) | ((57344 & i11) == 16384) | oVar.f(aVar2) | ((((i11 & 896) ^ 384) > 256 && oVar.e(j10)) || (i11 & 384) == 256);
            Object objK3 = oVar.K();
            if (zF2 || objK3 == obj) {
                Object sVar = new s(j11, aVar2, j10);
                oVar.h0(sVar);
                objK3 = sVar;
            }
            oVar.p(false);
            nh.b.a(0, (ic.k) objK3, qVarK, oVar);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new t(aVar, qVar, j10, j11, i10);
        }
    }

    public static final void d(s1.d dVar, float f10, float f11, long j10, s1.h hVar) {
        float f12 = 2;
        float f13 = hVar.f19352a / f12;
        float fD = p1.e.d(dVar.e()) - (f12 * f13);
        dVar.m0(j10, f10, f11, x0.b(f13, f13), nh.a.d(fD, fD), (768 & 64) != 0 ? 1.0f : 0.0f, hVar);
    }

    public static final void e(s1.d dVar, float f10, long j10, float f11) {
        float fD = p1.e.d(dVar.e());
        float fB = p1.e.b(dVar.e()) / 2;
        boolean z10 = dVar.getLayoutDirection() == f3.m.f6667a;
        dVar.w(j10, x0.b((z10 ? 0.0f : 1.0f - f10) * fD, fB), x0.b((z10 ? f10 : 1.0f) * fD, fB), f11, (496 & 16) != 0 ? 0 : 0);
    }
}
