package t9;

import androidx.lifecycle.k;
import androidx.lifecycle.x0;
import hf.y;
import i2.j;
import ic.n;
import j1.q;
import j2.h0;
import jc.l;
import jc.z;
import m0.a5;
import m0.p3;
import q9.j0;
import ub.a0;
import ub.p;
import x0.j1;
import x0.n2;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import y.k1;
import y.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f20581a = ub.a.d(new j0(10));

    public static final void a(w0 w0Var, o oVar, int i10) {
        oVar.Y(649113356);
        if (oVar.N(i10 & 1, (i10 & 3) != 2)) {
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            g gVar = (g) g8.a.w(x0VarA, z.f10839a.b(g.class), null, x0VarA instanceof k ? ((k) x0VarA).c() : i4.a.f9001b);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = v.v(Boolean.FALSE);
                oVar.h0(objK);
            }
            final w0 w0Var2 = (w0) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = v.v(Boolean.FALSE);
                oVar.h0(objK2);
            }
            final w0 w0Var3 = (w0) objK2;
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = v.v(0L);
                oVar.h0(objK3);
            }
            final w0 w0Var4 = (w0) objK3;
            Object objK4 = oVar.K();
            if (objK4 == r0Var) {
                objK4 = v.v("");
                oVar.h0(objK4);
            }
            final w0 w0Var5 = (w0) objK4;
            Object objK5 = oVar.K();
            if (objK5 == r0Var) {
                objK5 = v.v(a.f20565a);
                oVar.h0(objK5);
            }
            final w0 w0Var6 = (w0) objK5;
            Object objK6 = oVar.K();
            if (objK6 == r0Var) {
                objK6 = v.o(new ma.c(w0Var6, 27));
                oVar.h0(objK6);
            }
            final n2 n2Var = (n2) objK6;
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    p1VarR.f24421d = new aa.g(w0Var, i10, 20);
                    return;
                }
                return;
            }
            Object objK7 = oVar.K();
            if (objK7 == r0Var) {
                objK7 = new m9.i(w0Var, w0Var3, w0Var4, 3);
                oVar.h0(objK7);
            }
            a2.c.b((ic.a) objK7, f1.g.f(-677060668, new ha.c(gVar, w0Var, w0Var6, w0Var5), oVar), null, f1.g.f(-259171966, new aa.g(w0Var, 21), oVar), i.f20590e, f1.g.f(158716736, new n() { // from class: t9.b
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    o oVar2 = (o) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (oVar2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        q qVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), 8, 2);
                        y.v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
                        int iQ = v.q(oVar2);
                        j1 j1VarL = oVar2.l();
                        q qVarC = j1.a.c(qVarK, oVar2);
                        i2.k.f8771g0.getClass();
                        i2.i iVar = j.f8733b;
                        oVar2.a0();
                        if (oVar2.S) {
                            oVar2.k(iVar);
                        } else {
                            oVar2.k0();
                        }
                        v.A(j.f8738g, vVarA, oVar2);
                        v.A(j.f8737f, j1VarL, oVar2);
                        i2.h hVar = j.f8741j;
                        if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                            h0.s(iQ, oVar2, iQ, hVar);
                        }
                        v.A(j.f8735d, qVarC, oVar2);
                        w0 w0Var7 = w0Var2;
                        boolean zBooleanValue = ((Boolean) w0Var7.getValue()).booleanValue();
                        Object objK8 = oVar2.K();
                        r0 r0Var2 = x0.k.f24334a;
                        if (objK8 == r0Var2) {
                            objK8 = new aa.d(w0Var7, 28);
                            oVar2.h0(objK8);
                        }
                        a2.c.f(zBooleanValue, (ic.k) objK8, null, f1.g.f(-709258444, new q9.g(n2Var, w0Var7, w0Var3, w0Var4, w0Var6, 2), oVar2), oVar2, 3120);
                        w0 w0Var8 = w0Var5;
                        String str = (String) w0Var8.getValue();
                        Object objK9 = oVar2.K();
                        if (objK9 == r0Var2) {
                            objK9 = new aa.d(w0Var8, 29);
                            oVar2.h0(objK9);
                        }
                        a5.a(str, (ic.k) objK9, null, false, false, null, i.f20592g, null, null, null, false, null, null, null, false, 0, 0, null, null, oVar2, 1572912, 0, 1048508);
                        oVar2.p(true);
                    } else {
                        oVar2.Q();
                    }
                    return a0.f21526a;
                }
            }, oVar), null, 0L, 0L, null, oVar, 224304, 964);
        } else {
            oVar.Q();
        }
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            p1VarR2.f24421d = new aa.g(w0Var, i10, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r16, x0.o r17) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.e.b(int, x0.o):void");
    }

    public static final void c(k1 k1Var, o oVar, int i10) {
        o oVar2;
        l.e(k1Var, "<this>");
        oVar.Y(-813665817);
        int i11 = i10 & 1;
        if (oVar.N(i11, i11 != 0)) {
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            boolean zH = oVar.h(yVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new ba.d(yVar, 6, false);
                oVar.h0(objK2);
            }
            oVar2 = oVar;
            p3.a((ic.a) objK2, null, false, i.f20593h, oVar2, 24576, 14);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new r9.e(i10, 1, k1Var);
        }
    }
}
