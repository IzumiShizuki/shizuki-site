package v0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import g2.n1;
import g2.v0;
import j2.l1;
import lf.w0;
import m0.x3;
import s.i1;
import u.e1;
import x0.j1;
import x0.o2;
import x0.p1;
import x0.r0;
import x0.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f22247a = a2.c.e(w0.h.f23046b, w0.h.f23045a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f22248b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f22249c = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f22250d = w0.h.f23049e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f22251e = w0.h.f23047c;

    public static final void a(float f10, ic.k kVar, j1.q qVar, boolean z10, ic.a aVar, a0 a0Var, w.k kVar2, f1.f fVar, f1.f fVar2, oc.a aVar2, x0.o oVar, int i10, int i11) {
        int i12;
        a0 a0Var2;
        f1.f fVar3;
        int i13;
        oVar.Y(1191170377);
        if ((i10 & 6) == 0) {
            i12 = (oVar.c(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= oVar.h(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= oVar.g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= oVar.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            a0Var2 = a0Var;
            i12 |= oVar.f(a0Var2) ? 131072 : 65536;
        } else {
            a0Var2 = a0Var;
        }
        if ((1572864 & i10) == 0) {
            i12 |= oVar.f(kVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= oVar.d(0) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            fVar3 = fVar;
            i12 |= oVar.h(fVar3) ? 67108864 : 33554432;
        } else {
            fVar3 = fVar;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= oVar.h(fVar2) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (oVar.f(aVar2) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && oVar.z()) {
            oVar.Q();
        } else {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            oVar.X(-1537038585);
            boolean z11 = ((29360128 & i12) == 8388608) | ((((i13 & 14) ^ 6) > 4 && oVar.f(aVar2)) || (i13 & 6) == 4) | ((i12 & 57344) == 16384);
            Object objK = oVar.K();
            if (z11 || objK == x0.k.f24334a) {
                objK = new l0(f10, aVar, aVar2);
                oVar.h0(objK);
            }
            l0 l0Var = (l0) objK;
            oVar.p(false);
            l0Var.f22259d = kVar;
            l0Var.c(f10);
            int i14 = ((i12 >> 3) & 1008) | ((i12 >> 6) & 57344);
            int i15 = i12 >> 9;
            c(l0Var, qVar, z10, null, kVar2, fVar3, fVar2, oVar, i14 | (458752 & i15) | (i15 & 3670016));
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new g0(f10, kVar, qVar, z10, aVar, a0Var2, kVar2, fVar, fVar2, aVar2, i10, i11);
        }
    }

    public static final void b(float f10, ic.k kVar, j1.q qVar, boolean z10, oc.a aVar, ic.a aVar2, a0 a0Var, w.k kVar2, x0.o oVar, int i10) {
        float f11;
        int i11;
        ic.k kVar3;
        j1.q qVar2;
        ic.a aVar3;
        a0 a0VarC;
        int i12;
        boolean z11;
        boolean z12;
        a0 a0Var2;
        oVar.Y(-202044027);
        if ((i10 & 6) == 0) {
            f11 = f10;
            i11 = (oVar.c(f11) ? 4 : 2) | i10;
        } else {
            f11 = f10;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            kVar3 = kVar;
            i11 |= oVar.h(kVar3) ? 32 : 16;
        } else {
            kVar3 = kVar;
        }
        if ((i10 & 384) == 0) {
            qVar2 = qVar;
            i11 |= oVar.f(qVar2) ? 256 : 128;
        } else {
            qVar2 = qVar;
        }
        int i13 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i13 |= oVar.f(aVar) ? 16384 : 8192;
        }
        int i14 = i13 | 196608;
        if ((1572864 & i10) == 0) {
            aVar3 = aVar2;
            i14 |= oVar.h(aVar3) ? 1048576 : 524288;
        } else {
            aVar3 = aVar2;
        }
        if ((12582912 & i10) == 0) {
            i14 |= 4194304;
        }
        if ((100663296 & i10) == 0) {
            i14 |= oVar.f(kVar2) ? 67108864 : 33554432;
        }
        if ((38347923 & i14) == 38347922 && oVar.z()) {
            oVar.Q();
            z12 = z10;
            a0Var2 = a0Var;
        } else {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                a0VarC = e0.c(oVar);
                i12 = i14 & (-29360129);
                z11 = true;
            } else {
                oVar.Q();
                i12 = i14 & (-29360129);
                z11 = z10;
                a0VarC = a0Var;
            }
            oVar.q();
            int i15 = i12 >> 6;
            int i16 = (i12 & 14) | 905969664 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i15) | (i15 & 3670016) | (29360128 & (i12 << 6));
            int i17 = (i12 >> 12) & 14;
            ic.k kVar4 = kVar3;
            j1.q qVar3 = qVar2;
            boolean z13 = z11;
            a(f11, kVar4, qVar3, z13, aVar3, a0VarC, kVar2, f1.g.b(oVar, 308249025, new eg.f(kVar2, a0VarC, z11)), f1.g.b(oVar, -1843234110, new l0.g(a0VarC, z11, 1)), aVar, oVar, i16, i17);
            z12 = z13;
            a0Var2 = a0VarC;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f0(f10, kVar, qVar, z12, aVar, aVar2, a0Var2, kVar2, i10);
        }
    }

    public static final void c(l0 l0Var, j1.q qVar, boolean z10, a0 a0Var, w.k kVar, f1.f fVar, f1.f fVar2, x0.o oVar, int i10) {
        int i11;
        int i12;
        a0 a0VarC;
        a0 a0Var2;
        oVar.Y(-1303883986);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(l0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.f(kVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= oVar.h(fVar2) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && oVar.z()) {
            oVar.Q();
            a0Var2 = a0Var;
        } else {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                i12 = i11 & (-7169);
                a0VarC = e0.c(oVar);
            } else {
                oVar.Q();
                i12 = i11 & (-7169);
                a0VarC = a0Var;
            }
            oVar.q();
            int i13 = i12 >> 3;
            d(qVar, l0Var, z10, kVar, fVar, fVar2, oVar, (i12 & 896) | (i13 & 14) | ((i12 << 3) & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752));
            a0Var2 = a0VarC;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new uh.t(l0Var, qVar, z10, a0Var2, kVar, fVar, fVar2, i10);
        }
    }

    public static final void d(j1.q qVar, l0 l0Var, boolean z10, w.k kVar, f1.f fVar, f1.f fVar2, x0.o oVar, int i10) {
        int i11;
        yb.c cVar;
        j1.q suspendPointerInputElement;
        w.k kVar2;
        f1.f fVar3 = fVar2;
        oVar.Y(1390990089);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(kVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(fVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(fVar3) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((i12 & 74899) == 74898 && oVar.z()) {
            oVar.Q();
            kVar2 = kVar;
        } else {
            l0Var.f22262g = oVar.j(l1.f9872n) == f3.m.f6668b;
            yb.c cVar2 = null;
            j1.n nVar = j1.n.f9689a;
            if (z10) {
                w0 w0Var = new w0(25, l0Var, cVar2);
                c2.l lVar = c2.e0.f3261a;
                cVar = null;
                suspendPointerInputElement = new SuspendPointerInputElement(l0Var, kVar, null, new c2.d0(w0Var), 4);
            } else {
                cVar = null;
                suspendPointerInputElement = nVar;
            }
            boolean z11 = l0Var.f22262g;
            boolean zBooleanValue = ((Boolean) l0Var.f22264i.getValue()).booleanValue();
            oVar.X(1114013180);
            int i13 = i12 & 112;
            boolean z12 = i13 == 32;
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (z12 || objK == r0Var) {
                objK = new e.i(2, l0Var, cVar);
                oVar.h0(objK);
            }
            oVar.p(false);
            kVar2 = kVar;
            j1.q qVarA = u.l0.a(nVar, l0Var, e1.f20883b, z10, kVar2, zBooleanValue, (ic.o) objK, z11);
            o2 o2Var = k.f22245a;
            j1.q qVarA2 = q2.m.a(androidx.compose.foundation.layout.c.i(qVar.e(MinimumInteractiveModifier.f670a), w0.h.f23046b, w0.h.f23045a, 0.0f, 0.0f, 12), false, new q.j0(z10, l0Var, 1));
            float fE = l0Var.f22258c.e();
            oc.a aVar = l0Var.f22257b;
            j1.q qVarE = androidx.compose.foundation.a.g(q2.m.a(qVarA2, true, new i1(fE, new oc.a(aVar.f16305a, aVar.f16306b), 0)), z10, kVar2).e(suspendPointerInputElement).e(qVarA);
            oVar.X(1114013973);
            boolean z13 = i13 == 32;
            Object objK2 = oVar.K();
            if (z13 || objK2 == r0Var) {
                objK2 = new x3(1, l0Var);
                oVar.h0(objK2);
            }
            v0 v0Var = (v0) objK2;
            oVar.p(false);
            oVar.X(-1323940314);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            f1.f fVarK = n1.k(qVarE);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, v0Var, oVar);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar3);
            }
            fVarK.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            j1.q qVarC = androidx.compose.ui.layout.a.c(nVar, b0.f22173a);
            oVar.X(733328855);
            j1.h hVar4 = j1.c.f9662a;
            y.s sVarE = y.p.e(hVar4, oVar, 0);
            oVar.X(-1323940314);
            int iQ2 = x0.v.q(oVar);
            j1 j1VarL2 = oVar.l();
            f1.f fVarK2 = n1.k(qVarC);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, sVarE, oVar);
            x0.v.A(hVar2, j1VarL2, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar, iQ2, hVar3);
            }
            fVarK2.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            int i14 = (i12 >> 3) & 14;
            fVar.g(l0Var, oVar, Integer.valueOf(((i12 >> 9) & 112) | i14));
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
            j1.q qVarC2 = androidx.compose.ui.layout.a.c(nVar, b0.f22174b);
            oVar.X(733328855);
            y.s sVarE2 = y.p.e(hVar4, oVar, 0);
            oVar.X(-1323940314);
            int iQ3 = x0.v.q(oVar);
            j1 j1VarL3 = oVar.l();
            f1.f fVarK3 = n1.k(qVarC2);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, sVarE2, oVar);
            x0.v.A(hVar2, j1VarL3, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                j2.h0.s(iQ3, oVar, iQ3, hVar3);
            }
            fVarK3.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            fVar3 = fVar2;
            fVar3.g(l0Var, oVar, Integer.valueOf(i14 | ((i12 >> 12) & 112)));
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q.s(qVar, l0Var, z10, kVar2, fVar, fVar3, i10);
        }
    }

    public static final float e(float f10, float f11, float f12, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f13 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f13);
            } else {
                float fAbs = Math.abs(android.support.v4.media.session.b.L(f11, f12, f13) - f10);
                oc.c it = new oc.d(1, length, 1).iterator();
                while (it.f16312c) {
                    float f14 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(android.support.v4.media.session.b.L(f11, f12, f14) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f13 = f14;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f13);
            }
        }
        return fValueOf != null ? android.support.v4.media.session.b.L(f11, f12, fValueOf.floatValue()) : f10;
    }
}
