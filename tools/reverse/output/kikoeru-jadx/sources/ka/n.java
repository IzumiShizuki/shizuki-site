package ka;

import ba.u0;
import ba.v0;
import com.cnl.kikoeru.R;
import h1.s;
import h1.z;
import hf.a0;
import j2.h0;
import java.io.Serializable;
import java.util.ListIterator;
import n7.b0;
import q.l0;
import x0.j1;
import x0.p1;
import x0.w0;
import y.u;
import y.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f11286a = new s();

    public static final void a(j1.q qVar, x0.o oVar, int i10) {
        x0.o oVar2 = oVar;
        oVar2.Y(515170022);
        int i11 = (oVar2.f(qVar) ? 4 : 2) | i10;
        if (oVar2.N(i11 & 1, (i11 & 3) != 2)) {
            j1.q qVarX = b0.x(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.f557c.e(qVar)), b0.v(oVar2), true);
            v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
            int iQ = x0.v.q(oVar2);
            j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(qVarX, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(i2.j.f8738g, vVarA, oVar2);
            x0.v.A(i2.j.f8737f, j1VarL, oVar2);
            i2.h hVar = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar2);
            oVar2.W(1221037593);
            s sVar = f11286a;
            ListIterator listIterator = sVar.listIterator();
            while (true) {
                z zVar = (z) listIterator;
                if (!zVar.hasNext()) {
                    break;
                }
                k kVar = (k) zVar.next();
                boolean zH = oVar2.h(kVar);
                Object objK = oVar2.K();
                yb.c cVar = null;
                if (zH || objK == x0.k.f24334a) {
                    objK = new v0(7, kVar, cVar);
                    oVar2.h0(objK);
                }
                x0.v.e((ic.n) objK, kVar, oVar2);
                w0 w0Var = kVar.f11277h;
                int i12 = kVar.f11276g;
                androidx.compose.animation.b.c(((Boolean) w0Var.getValue()).booleanValue(), null, l0.a(r.d.r(i12, 0, null, 6), 14).a(l0.b(r.d.r(i12, 0, null, 6), 2)), l0.d(r.d.r(i12, 0, null, 6), 14).a(l0.c(r.d.r(i12, 0, null, 6), 2)), null, f1.g.f(-1816960785, new l(kVar, 0), oVar2), oVar2, 1572870, 18);
            }
            oVar2.p(false);
            if (sVar.size() > 0) {
                oVar2.W(1221105682);
                android.support.v4.media.session.b.m(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.r(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), 2), 8), g0.g.a(32), 0L, 0L, null, 4, b.f11243e, oVar, 1769478, 28);
                oVar2 = oVar;
            } else {
                oVar2.W(-805972506);
            }
            oVar2.p(false);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.r(i10, 8, qVar);
        }
    }

    public static final void b(k kVar) {
        jc.l.e(kVar, "<this>");
        a0.y(a0.d(), null, null, new u0(kVar, kVar, null, 27), 3);
    }

    public static void c(Serializable serializable, long j10, ic.k kVar, String str, int i10) {
        if ((i10 & 1) != 0) {
            j10 = 2000;
        }
        long j11 = j10;
        yb.c cVar = null;
        ic.k kVar2 = (i10 & 4) != 0 ? null : kVar;
        String strG = na.q.g(R.string.btn_cancel);
        if ((i10 & 16) != 0) {
            str = na.q.g(R.string.btn_confirm);
        }
        float f10 = 8;
        j1.q qVarM = androidx.compose.foundation.layout.a.m(j1.n.f9689a, f10, f10, f10, 0);
        jc.l.e(serializable, "<this>");
        jc.l.e(qVarM, "modifier");
        a0.y(a0.d(), null, null, new a9.k(10, new k(x0.v.v(serializable.toString()), qVarM, j11, kVar2, strG, str), cVar), 3);
    }
}
