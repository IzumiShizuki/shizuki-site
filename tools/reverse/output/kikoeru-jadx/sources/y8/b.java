package y8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import g2.v0;
import ic.n;
import j1.q;
import j2.h0;
import ub.a0;
import x0.o;
import x0.p1;
import x0.v;
import y.i1;
import y.j1;
import y.p;
import y.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f25892a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f25893b = 48;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f25894c = 32;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f25895d = 40;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f25896e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f25897f = 12;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f25898g = 4;

    public final void a(final q qVar, final boolean z10, final n nVar, final n nVar2, final n nVar3, final f1.f fVar, o oVar, final int i10) {
        int i11;
        b bVar;
        boolean z11;
        boolean z12;
        oVar.Y(-495587009);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(nVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(nVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(nVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            bVar = this;
            i11 |= oVar.f(bVar) ? 1048576 : 524288;
        } else {
            bVar = this;
        }
        if (oVar.N(i11 & 1, (599187 & i11) != 599186)) {
            q qVarF = androidx.compose.foundation.layout.c.f(qVar, z10 ? f25894c : f25893b, 0.0f, 2);
            float f10 = f25897f;
            float f11 = f25898g;
            float f12 = (nVar2 != null || z10) ? f10 : f11;
            if (z10) {
                f10 = 0;
            } else if (nVar2 == null) {
                f10 = f11;
            }
            float f13 = f25896e;
            q qVarC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.m(qVarF, f13, f12, f13, f10), 1.0f);
            j1 j1VarA = i1.a(y.k.f25161f, j1.c.f9672k, oVar, 54);
            int iQ = v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            q qVarC2 = j1.a.c(qVarC, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            v.A(hVar, j1VarA, oVar);
            i2.h hVar2 = i2.j.f8737f;
            v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            int i12 = i11;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            v.A(hVar4, qVarC2, oVar);
            if (nVar != null) {
                oVar.W(44948514);
                float f14 = f25895d;
                q qVarM = androidx.compose.foundation.layout.c.m(j1.n.f9689a, f14, f14, 12);
                v0 v0VarD = p.d(j1.c.f9665d, false);
                int iQ2 = v.q(oVar);
                x0.j1 j1VarL2 = oVar.l();
                q qVarC3 = j1.a.c(qVarM, oVar);
                oVar.a0();
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                v.A(hVar, v0VarD, oVar);
                v.A(hVar2, j1VarL2, oVar);
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                    h0.s(iQ2, oVar, iQ2, hVar3);
                }
                v.A(hVar4, qVarC3, oVar);
                nVar.q(oVar, Integer.valueOf((i12 >> 6) & 14));
                oVar.p(true);
                z11 = false;
            } else {
                z11 = false;
                oVar.W(41559935);
            }
            oVar.p(z11);
            y.e eVar = y.k.f25159d;
            if (1.0f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            y.v vVarA = u.a(eVar, j1.c.f9674m, oVar, 6);
            int iQ3 = v.q(oVar);
            x0.j1 j1VarL3 = oVar.l();
            q qVarC4 = j1.a.c(layoutWeightElement, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(hVar, vVarA, oVar);
            v.A(hVar2, j1VarL3, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                h0.s(iQ3, oVar, iQ3, hVar3);
            }
            v.A(hVar4, qVarC4, oVar);
            fVar.q(oVar, Integer.valueOf((i12 >> 15) & 14));
            if (nVar2 == null) {
                oVar.W(735418304);
                z12 = false;
            } else {
                z12 = false;
                oVar.W(2101933153);
                nVar2.q(oVar, Integer.valueOf((i12 >> 9) & 14));
            }
            oVar.p(z12);
            oVar.p(true);
            if (nVar3 == null) {
                oVar.W(45431958);
            } else {
                oVar.W(1465547);
                nVar3.q(oVar, Integer.valueOf((i12 >> 12) & 14));
            }
            oVar.p(z12);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            final b bVar2 = bVar;
            p1VarR.f24421d = new n() { // from class: y8.a
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f25884a.a(qVar, z10, nVar, nVar2, nVar3, fVar, (o) obj, v.D(i10 | 1));
                    return a0.f21526a;
                }
            };
        }
    }
}
