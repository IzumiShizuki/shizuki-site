package s0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ba.q0;
import f3.m;
import g1.l;
import g2.v0;
import i2.j;
import j1.q;
import j2.h0;
import j2.l1;
import java.util.UUID;
import m0.v2;
import q9.j0;
import x0.j1;
import x0.k;
import x0.n;
import x0.o;
import x0.p1;
import x0.v;
import x0.w0;
import x0.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f19324a = new z(new j0(7));

    public static final void a(ic.a aVar, v2 v2Var, f1.f fVar, o oVar, int i10) {
        int i11;
        Object obj = v2Var;
        oVar.Y(1705178815);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(obj) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(fVar) ? 256 : 128;
        }
        int i12 = i11;
        if (oVar.N(i12 & 1, (i12 & 147) != 146)) {
            View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
            f3.c cVar = (f3.c) oVar.j(l1.f9866h);
            String str = (String) oVar.j(f19324a);
            m mVar = (m) oVar.j(l1.f9872n);
            n nVarX = v.x(oVar);
            w0 w0VarY = v.y(fVar, oVar);
            Object[] objArr = new Object[0];
            Object objK = oVar.K();
            Object obj2 = k.f24334a;
            if (objK == obj2) {
                objK = new j0(6);
                oVar.h0(objK);
            }
            UUID uuid = (UUID) l.e(objArr, (ic.a) objK, oVar);
            Object objK2 = oVar.K();
            if (objK2 == obj2) {
                i iVar = new i(aVar, view, cVar, v2Var, uuid);
                obj = v2Var;
                f1.f fVar2 = new f1.f(new ee.b(10, iVar, w0VarY), 1879981140, true);
                iVar.setParentCompositionContext(nVarX);
                iVar.f19339u.setValue(fVar2);
                iVar.f19340v = true;
                oVar.h0(iVar);
                objK2 = iVar;
            }
            i iVar2 = (i) objK2;
            int i13 = i12 & 14;
            boolean zH = oVar.h(iVar2) | (i13 == 4) | oVar.f(str) | oVar.d(mVar.ordinal());
            Object objK3 = oVar.K();
            if (zH || objK3 == obj2) {
                objK3 = new ba.i(iVar2, aVar, str, mVar);
                oVar.h0(objK3);
            }
            v.c(iVar2, (ic.k) objK3, oVar);
            boolean zH2 = oVar.h(iVar2) | (i13 == 4) | oVar.f(str) | oVar.d(mVar.ordinal());
            Object objK4 = oVar.K();
            if (zH2 || objK4 == obj2) {
                objK4 = new ba.c(iVar2, aVar, str, mVar);
                oVar.h0(objK4);
            }
            v.h((ic.a) objK4, oVar);
            boolean zH3 = oVar.h(iVar2) | ((i12 & 112) == 32);
            Object objK5 = oVar.K();
            if (zH3 || objK5 == obj2) {
                objK5 = new q0(18, iVar2, obj);
                oVar.h0(objK5);
            }
            v.c(obj, (ic.k) objK5, oVar);
            boolean zH4 = oVar.h(iVar2);
            Object objK6 = oVar.K();
            if (zH4 || objK6 == obj2) {
                objK6 = new c(iVar2, 0);
                oVar.h0(objK6);
            }
            q qVarD = androidx.compose.ui.layout.a.d(j1.n.f9689a, (ic.k) objK6);
            boolean zH5 = oVar.h(iVar2) | oVar.d(mVar.ordinal());
            Object objK7 = oVar.K();
            if (zH5 || objK7 == obj2) {
                objK7 = new i3.e(iVar2, mVar, 2);
                oVar.h0(objK7);
            }
            v0 v0Var = (v0) objK7;
            int iQ = v.q(oVar);
            j1 j1VarL = oVar.l();
            q qVarC = j1.a.c(qVarD, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar2 = j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar2);
            } else {
                oVar.k0();
            }
            v.A(j.f8738g, v0Var, oVar);
            v.A(j.f8737f, j1VarL, oVar);
            i2.h hVar = j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(aVar, obj, fVar, i10, 9);
        }
    }
}
