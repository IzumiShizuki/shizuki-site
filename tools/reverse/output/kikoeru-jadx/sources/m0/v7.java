package m0;

import androidx.compose.material.MinimumInteractiveModifier;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13768a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13770c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f13773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f13774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f13775h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13769b = 14;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f13771d = 24;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f13772e = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r.u1 f13776i = new r.u1(100, (r.v) null, 6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f13777j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f13778k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f13779l = 125;

    static {
        float f10 = 34;
        f13768a = f10;
        float f11 = 20;
        f13770c = f11;
        f13773f = f10;
        f13774g = f11;
        f13775h = f10 - f11;
    }

    public static final void a(final boolean z10, final ic.k kVar, j1.q qVar, final boolean z11, final w1 w1Var, x0.o oVar, final int i10) {
        final j1.q qVar2;
        j1.q qVar3;
        oVar.Y(25866825);
        int i11 = i10 | (oVar.g(z10) ? 4 : 2) | (oVar.h(kVar) ? 32 : 16) | 384 | (oVar.g(z11) ? 2048 : 1024) | 24576 | (oVar.f(w1Var) ? 131072 : 65536);
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            oVar.S();
            int i12 = i10 & 1;
            j1.q qVar4 = j1.n.f9689a;
            if (i12 == 0 || oVar.x()) {
                qVar3 = qVar4;
            } else {
                oVar.Q();
                qVar3 = qVar;
            }
            oVar.q();
            oVar.W(1799821714);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = q.t0.I(oVar);
            }
            w.k kVar2 = (w.k) objK;
            oVar.p(false);
            x0.m1 m1Var = j2.l1.f9866h;
            float fQ = ((f3.c) oVar.j(m1Var)).Q(f13775h);
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = x0.v.v(Boolean.FALSE);
                oVar.h0(objK2);
            }
            x0.w0 w0Var = (x0.w0) objK2;
            final float fQ2 = ((f3.c) oVar.j(m1Var)).Q(f13779l);
            boolean zC = oVar.c(fQ) | oVar.c(fQ2);
            Object objK3 = oVar.K();
            if (zC || objK3 == obj) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Boolean.FALSE, Float.valueOf(0.0f));
                linkedHashMap.put(Boolean.TRUE, Float.valueOf(fQ));
                a4 a4Var = new a4(linkedHashMap);
                Boolean boolValueOf = Boolean.valueOf(z10);
                x xVar = new x(boolValueOf, new l3(8), new ic.a() { // from class: m0.r7
                    @Override // ic.a
                    public final Object b() {
                        return Float.valueOf(fQ2);
                    }
                }, f13776i, new g1.d(24));
                xVar.f13857m.setValue(a4Var);
                xVar.i(boolValueOf);
                oVar.h0(xVar);
                objK3 = xVar;
            }
            x xVar2 = (x) objK3;
            int i13 = i11 >> 3;
            Object objY = x0.v.y(kVar, oVar);
            int i14 = i11 & 14;
            Object objY2 = x0.v.y(Boolean.valueOf(z10), oVar);
            boolean zF = oVar.f(xVar2) | oVar.f(objY2) | oVar.f(objY);
            Object objK4 = oVar.K();
            if (zF || objK4 == obj) {
                objK4 = new e.j(xVar2, objY2, objY, w0Var, null, 16);
                oVar.h0(objK4);
            }
            x0.v.e((ic.n) objK4, xVar2, oVar);
            Boolean boolValueOf2 = Boolean.valueOf(z10);
            Boolean bool = (Boolean) w0Var.getValue();
            bool.getClass();
            boolean zF2 = (i14 == 4) | oVar.f(xVar2);
            Object objK5 = oVar.K();
            yb.c cVar = null;
            if (zF2 || objK5 == obj) {
                objK5 = new l0.g1(z10, xVar2, (yb.c) null);
                oVar.h0(objK5);
            }
            x0.v.f(boolValueOf2, bool, (ic.n) objK5, oVar);
            boolean z12 = oVar.j(j2.l1.f9872n) == f3.m.f6668b;
            j1.q qVarC = kVar != null ? androidx.compose.foundation.selection.c.c(z10, kVar2, z11, new q2.h(2), kVar) : qVar4;
            if (kVar != null) {
                x0.o2 o2Var = t3.f13651a;
                qVar4 = MinimumInteractiveModifier.f666a;
            }
            j1.q qVarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.q(u.l0.a(qVar3.e(qVar4).e(qVarC), xVar2.f13850f, u.e1.f20883b, z11 && kVar != null, kVar2, false, new n(0, xVar2, cVar), z12), j1.c.f9666e, 2), f13772e));
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarH, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC2, oVar);
            boolean zBooleanValue = ((Boolean) xVar2.f13852h.getValue()).booleanValue();
            boolean zF3 = oVar.f(xVar2);
            Object objK6 = oVar.K();
            if (zF3 || objK6 == obj) {
                objK6 = new r(xVar2, 5);
                oVar.h0(objK6);
            }
            b(zBooleanValue, z11, w1Var, (ic.a) objK6, kVar2, oVar, (i13 & 896) | 6 | ((i11 >> 6) & 7168));
            oVar.p(true);
            qVar2 = qVar3;
        } else {
            oVar.Q();
            qVar2 = qVar;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(z10, kVar, qVar2, z11, w1Var, i10) { // from class: m0.s7

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f13616a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ic.k f13617b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j1.q f13618c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f13619d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ w1 f13620e;

                @Override // ic.n
                public final Object q(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iD = x0.v.D(1);
                    v7.a(this.f13616a, this.f13617b, this.f13618c, this.f13619d, this.f13620e, (x0.o) obj2, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void b(final boolean z10, final boolean z11, final w1 w1Var, final ic.a aVar, final w.k kVar, x0.o oVar, final int i10) {
        int i11;
        int i12;
        long j10;
        x0.r0 r0Var;
        boolean z12;
        long jA;
        x0.o oVar2 = oVar;
        oVar2.Y(70908914);
        int i13 = i10 & 6;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f554a;
        if (i13 == 0) {
            i11 = (oVar2.f(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.g(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar2.f(w1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar2.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar2.f(kVar) ? 131072 : 65536;
        }
        int i14 = i11;
        if (oVar2.N(i14 & 1, (74899 & i14) != 74898)) {
            Object objK = oVar2.K();
            x0.r0 r0Var2 = x0.k.f24334a;
            if (objK == r0Var2) {
                objK = new h1.s();
                oVar2.h0(objK);
            }
            h1.s sVar = (h1.s) objK;
            boolean z13 = (458752 & i14) == 131072;
            Object objK2 = oVar2.K();
            if (z13 || objK2 == r0Var2) {
                objK2 = new m1(kVar, sVar, null, 2);
                oVar2.h0(objK2);
            }
            x0.v.e((ic.n) objK2, kVar, oVar2);
            float f10 = !sVar.isEmpty() ? f13778k : f13777j;
            oVar2.W(-1176343362);
            if (z11) {
                i12 = i14;
                j10 = z10 ? w1Var.f13792b : w1Var.f13794d;
            } else {
                i12 = i14;
                j10 = z10 ? w1Var.f13796f : w1Var.f13798h;
            }
            x0.w0 w0VarY = x0.v.y(new q1.q(j10), oVar2);
            oVar2.p(false);
            j1.h hVar = j1.c.f9666e;
            j1.n nVar = j1.n.f9689a;
            j1.q qVarE = bVar.a(nVar, hVar).e(androidx.compose.foundation.layout.c.f557c);
            boolean zF = oVar2.f(w0VarY);
            Object objK3 = oVar2.K();
            if (zF || objK3 == r0Var2) {
                objK3 = new aa.d(w0VarY, 12);
                oVar2.h0(objK3);
            }
            nh.b.a(0, (ic.k) objK3, qVarE, oVar2);
            oVar2.W(-66424183);
            x0.w0 w0VarY2 = x0.v.y(new q1.q(z11 ? z10 ? w1Var.f13791a : w1Var.f13793c : z10 ? w1Var.f13795e : w1Var.f13797g), oVar2);
            oVar2.p(false);
            r1 r1Var = (r1) oVar2.j(x2.f13883a);
            float f11 = ((f3.f) oVar2.j(x2.f13884b)).f6657a + f10;
            if (!q1.q.c(((q1.q) w0VarY2.getValue()).f17577a, ((b1) oVar2.j(c1.f12773a)).i()) || r1Var == null) {
                r0Var = r0Var2;
                z12 = false;
                oVar2.W(-674731226);
                oVar2.p(false);
                jA = ((q1.q) w0VarY2.getValue()).f17577a;
            } else {
                oVar2.W(-674820165);
                r0Var = r0Var2;
                z12 = false;
                jA = r1Var.a(((q1.q) w0VarY2.getValue()).f17577a, f11, oVar, 0);
                oVar2 = oVar;
                oVar2.p(false);
            }
            x0.n2 n2VarA = q.u1.a(jA, null, oVar2, 0, 14);
            j1.q qVarA = bVar.a(nVar, j1.c.f9665d);
            boolean z14 = (i12 & 57344) == 16384;
            Object objK4 = oVar2.K();
            if (z14 || objK4 == r0Var) {
                objK4 = new da.z(6, aVar);
                oVar2.h0(objK4);
            }
            j1.q qVarG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.f.a(androidx.compose.foundation.layout.a.g(qVarA, (ic.k) objK4), kVar, l5.a(f13771d, 4, 0L, z12)), f13770c);
            g0.f fVar = g0.g.f7122a;
            y.d.d(androidx.compose.foundation.a.b(lc.b.U(qVarG, f10, fVar, z12, 24), ((q1.q) n2VarA.getValue()).f17577a, fVar), oVar2);
        } else {
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.t7
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v7.b(z10, z11, w1Var, aVar, kVar, (x0.o) obj, x0.v.D(i10 | 1));
                    return ub.a0.f21526a;
                }
            };
        }
    }
}
