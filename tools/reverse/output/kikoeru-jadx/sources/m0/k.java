package m0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1.q f13154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1.q f13155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f13158e;

    static {
        float f10 = 24;
        j1.n nVar = j1.n.f9689a;
        f13154a = androidx.compose.foundation.layout.a.n(nVar, f10, 0.0f, f10, 0.0f, 10);
        f13155b = androidx.compose.foundation.layout.a.n(nVar, f10, 0.0f, f10, 28, 2);
        f13156c = lc.b.C(40);
        f13157d = lc.b.C(36);
        f13158e = lc.b.C(38);
    }

    public static final void a(ic.n nVar, ic.n nVar2, x0.o oVar, int i10) {
        boolean z10;
        boolean z11;
        j1.h hVar = j1.c.f9662a;
        j1.f fVar = j1.c.f9674m;
        oVar.Y(1213983107);
        int i11 = i10 | (oVar.h(nVar) ? 32 : 16) | (oVar.h(nVar2) ? 256 : 128);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = d.f12827b;
                oVar.h0(objK);
            }
            g2.v0 v0Var = (g2.v0) objK;
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(layoutWeightElement, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar2 = i2.j.f8738g;
            x0.v.A(hVar2, v0Var, oVar);
            i2.h hVar3 = i2.j.f8737f;
            x0.v.A(hVar3, j1VarL, oVar);
            i2.h hVar4 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar4);
            }
            i2.h hVar5 = i2.j.f8735d;
            x0.v.A(hVar5, qVarC, oVar);
            if (nVar == null) {
                oVar.W(1809237538);
                oVar.p(false);
                z10 = false;
            } else {
                oVar.W(1809237539);
                j1.q qVarE = androidx.compose.ui.layout.a.c(f13154a, "title").e(new HorizontalAlignElement(fVar));
                g2.v0 v0VarD = y.p.d(hVar, false);
                int iQ2 = x0.v.q(oVar);
                x0.j1 j1VarL2 = oVar.l();
                j1.q qVarC2 = j1.a.c(qVarE, oVar);
                oVar.a0();
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                x0.v.A(hVar2, v0VarD, oVar);
                x0.v.A(hVar3, j1VarL2, oVar);
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                    j2.h0.s(iQ2, oVar, iQ2, hVar4);
                }
                x0.v.A(hVar5, qVarC2, oVar);
                nVar.q(oVar, 0);
                oVar.p(true);
                z10 = false;
                oVar.p(false);
            }
            if (nVar2 == null) {
                oVar.W(1809370342);
                oVar.p(z10);
                z11 = true;
            } else {
                oVar.W(1809370343);
                j1.q qVarE2 = androidx.compose.ui.layout.a.c(f13155b, "text").e(new HorizontalAlignElement(fVar));
                g2.v0 v0VarD2 = y.p.d(hVar, z10);
                int iQ3 = x0.v.q(oVar);
                x0.j1 j1VarL3 = oVar.l();
                j1.q qVarC3 = j1.a.c(qVarE2, oVar);
                oVar.a0();
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                x0.v.A(hVar2, v0VarD2, oVar);
                x0.v.A(hVar3, j1VarL3, oVar);
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                    j2.h0.s(iQ3, oVar, iQ3, hVar4);
                }
                x0.v.A(hVar5, qVarC3, oVar);
                nVar2.q(oVar, 0);
                z11 = true;
                oVar.p(true);
                oVar.p(false);
            }
            oVar.p(z11);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.h0(nVar, nVar2, i10, 12);
        }
    }

    public static final void b(final f1.f fVar, final j1.q qVar, final ic.n nVar, final ic.n nVar2, final q1.l0 l0Var, final long j10, final long j11, x0.o oVar, final int i10) {
        oVar.Y(1945098332);
        int i11 = i10 | (oVar.h(fVar) ? 4 : 2) | (oVar.f(qVar) ? 32 : 16) | (oVar.h(nVar) ? 256 : 128) | (oVar.h(nVar2) ? 2048 : 1024) | (oVar.f(l0Var) ? 16384 : 8192) | (oVar.e(j10) ? 131072 : 65536) | (oVar.e(j11) ? 1048576 : 524288);
        if (oVar.N(i11 & 1, (599187 & i11) != 599186)) {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            int i12 = ((i11 >> 3) & 14) | 1572864;
            int i13 = i11 >> 9;
            android.support.v4.media.session.b.m(qVar, l0Var, j10, j11, null, 0.0f, f1.g.f(802957984, new f((Object) nVar, (Object) nVar2, (ic.o) fVar, 0), oVar), oVar, i12 | (i13 & 112) | (i13 & 896) | (i13 & 7168), 48);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(qVar, nVar, nVar2, l0Var, j10, j11, i10) { // from class: m0.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j1.q f12698b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ic.n f12699c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ic.n f12700d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ q1.l0 f12701e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f12702f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f12703g;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(1);
                    k.b(this.f12697a, this.f12698b, this.f12699c, this.f12700d, this.f12701e, this.f12702f, this.f12703g, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void c(float f10, float f11, f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(1271829505);
        if (oVar.N(i10 & 1, (i10 & 147) != 146)) {
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new h(f10, f11);
                oVar.h0(objK);
            }
            g2.v0 v0Var = (g2.v0) objK;
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(j1.n.f9689a, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0Var, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            fVar.q(oVar, 6);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(f10, f11, fVar, i10);
        }
    }
}
