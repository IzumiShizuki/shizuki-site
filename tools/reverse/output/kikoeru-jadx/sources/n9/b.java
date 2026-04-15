package n9;

import androidx.compose.foundation.layout.FillElement;
import androidx.lifecycle.x0;
import ba.q0;
import cg.g;
import com.cnl.kikoeru.R;
import g2.v0;
import hf.a0;
import hf.y;
import i2.h;
import i2.i;
import i2.j;
import ic.k;
import j1.q;
import j2.h0;
import java.util.List;
import jc.l;
import jc.n;
import jc.z;
import la.y0;
import lf.f;
import m0.d4;
import pc.f0;
import pc.u;
import x0.j1;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import y.k1;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ u[] f15662a = {z.f10839a.d(new n(b.class, "documentUri", "<v#0>"))};

    public static final void a(r9.c cVar, o oVar, int i10) {
        int i11;
        int i12;
        k kVar;
        o oVar2 = oVar;
        l.e(cVar, "page");
        oVar2.Y(-1165986904);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.f(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (oVar2.N(i11 & 1, (i11 & 3) != 2)) {
            x0 x0VarA = j4.a.a(oVar2);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            e eVar = (e) g8.a.w(x0VarA, z.f10839a.b(e.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            Object objK = oVar2.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = v.v(lf.e.f12389b);
                oVar2.h0(objK);
            }
            w0 w0Var = (w0) objK;
            la.l.g(((Boolean) cVar.f18968e.getValue()).booleanValue(), (String) cVar.f18969f.getValue(), eVar.f15669b, w0Var, oVar, 0);
            j7.b bVarA = j7.d.a((f) w0Var.getValue(), oVar);
            c0.z zVarL = lc.b.L(oVar);
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = v.m(oVar);
                oVar.h0(objK2);
            }
            y yVar = (y) objK2;
            k kVarN = na.c.n(oVar);
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            v0 v0VarD = p.d(j1.c.f9662a, false);
            int iQ = v.q(oVar);
            j1 j1VarL = oVar.l();
            q qVarC = j1.a.c(fillElement, oVar);
            i2.k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(j.f8738g, v0VarD, oVar);
            v.A(j.f8737f, j1VarL, oVar);
            h hVar = j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar);
            if (bVarA.c() == 0) {
                oVar.W(1387705649);
                kVar = kVarN;
                ka.b.k(na.q.g(R.string.no_result), null, fillElement, oVar, 384, 2);
            } else {
                kVar = kVarN;
                oVar.W(1385408084);
            }
            oVar.p(false);
            String strG = na.q.g(R.string.delete_download);
            String strG2 = na.q.g(R.string.export_download);
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = ud.b.x(new la.x0(nh.b.v(), strG), new la.x0(lc.b.z(), strG2));
                oVar.h0(objK3);
            }
            List list = (List) objK3;
            boolean zF = oVar.f(strG) | oVar.h(eVar) | oVar.f(strG2) | oVar.h(yVar) | oVar.h(kVar);
            Object objK4 = oVar.K();
            if (zF || objK4 == r0Var) {
                objK4 = new d4(strG, eVar, strG2, yVar, kVar);
                oVar.h0(objK4);
            }
            i12 = 1;
            la.l.d(bVarA, zVarL, null, null, 0.0f, null, null, list, null, (ic.n) objK4, oVar, 8, 0, 892);
            oVar2 = oVar;
            ka.b.e(zVarL, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.b.f554a.a(j1.n.f9689a, j1.c.f9670i), 25), 5, oVar2, 384, 0);
            oVar2.p(true);
        } else {
            i12 = 1;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new y0(cVar, i10, i12);
        }
    }

    public static final void b(k1 k1Var, r9.c cVar, o oVar, int i10) {
        int i11;
        l.e(k1Var, "<this>");
        l.e(cVar, "page");
        oVar.Y(1626233317);
        if ((i10 & 48) == 0) {
            i11 = (oVar.f(cVar) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if (oVar.N(i11 & 1, (i11 & 17) != 16)) {
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            k kVarN = na.c.n(oVar);
            w1.f fVarZ = lc.b.z();
            boolean zH = oVar.h(yVar) | oVar.h(kVarN);
            Object objK2 = oVar.K();
            if (zH || objK2 == obj) {
                objK2 = new fa.l(yVar, kVarN, 1);
                oVar.h0(objK2);
            }
            na.c.b(fVarZ, (ic.a) objK2, oVar, 0);
            w1.f fVarS = u3.x0.s();
            boolean z10 = (i11 & 112) == 32;
            Object objK3 = oVar.K();
            if (z10 || objK3 == obj) {
                objK3 = new a(cVar, 0);
                oVar.h0(objK3);
            }
            na.c.b(fVarS, (ic.a) objK3, oVar, 0);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.b(k1Var, cVar, i10, 2);
        }
    }

    public static final void c(y yVar, k kVar, q0 q0Var) {
        a0.y(yVar, null, null, new g(kVar, q0Var, f0.P(gg.c.a(), "documentUri", "", z.a(String.class)), (yb.c) null, 2), 3);
    }
}
