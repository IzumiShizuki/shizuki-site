package m0;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f12819h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f12821j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f12824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f12825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f12826o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c9 f12812a = new c9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12813b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12814c = 72;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12815d = 40;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f12820i = 24;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f12822k = 28;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f12823l = 32;

    static {
        float f10 = 16;
        f12816e = f10;
        f12817f = f10;
        f12818g = f10;
        f12819h = f10;
        float f11 = 20;
        f12821j = f11;
        f12824m = f11;
        f12825n = f11;
        f12826o = f10;
    }

    public final void a(j1.q qVar, ic.n nVar, f1.f fVar, ic.n nVar2, ic.n nVar3, ic.n nVar4, x0.o oVar, int i10) {
        int i11;
        float f10;
        boolean z10;
        ic.n nVar5 = nVar4;
        oVar.Y(598947838);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(fVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(nVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(nVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(nVar5) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= oVar.f(this) ? 1048576 : 524288;
        }
        if (oVar.N(i11 & 1, (599187 & i11) != 599186)) {
            float f11 = nVar == null ? f12813b : f12814c;
            j1.q qVarF = androidx.compose.foundation.layout.c.f(qVar, f11, 0.0f, 2);
            y.j1 j1VarA = y.i1.a(y.k.f25156a, j1.c.f9671j, oVar, 0);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarF, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, j1VarA, oVar);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            int i12 = i11;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC, oVar);
            if (1.0f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            j1.q qVarN = androidx.compose.foundation.layout.a.n(new LayoutWeightElement(1.0f, true), f12818g, 0.0f, f12819h, 0.0f, 10);
            if (nVar != null) {
                oVar.W(1807018686);
                float f12 = f12815d;
                float f13 = f12816e;
                j1.q qVarM = androidx.compose.foundation.layout.c.m(j1.n.f9689a, f13 + f12, f11, 12);
                float f14 = f12817f;
                j1.q qVarN2 = androidx.compose.foundation.layout.a.n(qVarM, f13, f14, 0.0f, f14, 4);
                g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
                int iQ2 = x0.v.q(oVar);
                x0.j1 j1VarL2 = oVar.l();
                j1.q qVarC2 = j1.a.c(qVarN2, oVar);
                oVar.a0();
                f10 = f11;
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                x0.v.A(hVar, v0VarD, oVar);
                x0.v.A(hVar2, j1VarL2, oVar);
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                    j2.h0.s(iQ2, oVar, iQ2, hVar3);
                }
                x0.v.A(hVar4, qVarC2, oVar);
                nVar.q(oVar, Integer.valueOf((i12 >> 3) & 14));
                oVar.p(true);
                oVar.p(false);
            } else {
                f10 = f11;
                oVar.W(1807574144);
                oVar.p(false);
            }
            float f15 = f12822k;
            float f16 = f12823l;
            if (nVar3 != null) {
                oVar.W(1807622349);
                android.support.v4.media.session.b.a(ud.b.x(new f3.f(f12820i), new f3.f(f12821j)), qVarN, f1.g.f(979717374, new i(nVar3, fVar, 2), oVar), oVar, 390);
                oVar.p(false);
            } else {
                oVar.W(1807914338);
                android.support.v4.media.session.b.a(ud.b.x(new f3.f(nVar != null ? f16 : f15), new f3.f(nVar != null ? f12825n : f12824m)), qVarN, f1.g.f(-1888627961, new i(fVar, nVar2), oVar), oVar, 384);
                oVar.p(false);
            }
            if (nVar4 != null) {
                oVar.W(1808643799);
                float f17 = nVar != null ? f16 : f15;
                nVar5 = nVar4;
                z10 = true;
                android.support.v4.media.session.b.h(f17, null, f1.g.f(-1476831345, new b9(f10, nVar5), oVar), oVar, 384, 2);
                oVar.p(false);
            } else {
                nVar5 = nVar4;
                z10 = true;
                oVar.W(1809267488);
                oVar.p(false);
            }
            oVar.p(z10);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new o5(this, qVar, nVar, fVar, nVar2, nVar3, nVar5, i10);
        }
    }
}
