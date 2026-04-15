package ba;

import com.cnl.kikoeru.R;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0[] f2395a = {new c0("MAIN_PAGE_DEFAULT", na.q.g(R.string.main_repository)), new c0("MAIN_PAGE_POPULAR", na.q.g(R.string.main_popular)), new c0("MAIN_PAGE_RECOMMEND", na.q.g(R.string.main_recommend))};

    public static final void a(y.d1 d1Var, k0 k0Var, j1.q qVar, j1.q qVar2, x0.o oVar, int i10) {
        int i11;
        j1.q qVar3;
        j1.q qVar4;
        jc.l.e(d1Var, "padding");
        oVar.Y(-893210278);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(d1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(k0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            qVar3 = qVar;
            i11 |= oVar.f(qVar3) ? 256 : 128;
        } else {
            qVar3 = qVar;
        }
        int i12 = i11 | 3072;
        if (oVar.N(i12 & 1, (i12 & 1171) != 1170)) {
            androidx.lifecycle.x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            yb.c cVar = null;
            z0 z0Var = (z0) g8.a.w(x0VarA, jc.z.f10839a.b(z0.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            boolean zH = oVar.h(z0Var) | oVar.h(k0Var);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new androidx.lifecycle.r(z0Var, k0Var, cVar, 1);
                oVar.h0(objK);
            }
            x0.v.e((ic.n) objK, z0Var, oVar);
            a2.c.g(k0Var.f2399a, qVar3, null, null, 0.0f, null, null, false, null, null, null, f1.g.f(198801337, new e0(d1Var, k0Var, z0Var, 0), oVar), oVar, (i12 >> 3) & 112);
            qVar4 = j1.n.f9689a;
        } else {
            oVar.Q();
            qVar4 = qVar2;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f0(d1Var, k0Var, qVar, qVar4, i10, 0);
        }
    }

    public static final void b(k0 k0Var, j1.q qVar, x0.o oVar, int i10) {
        oVar.Y(756770428);
        int i11 = (oVar.h(k0Var) ? 4 : 2) | i10 | 48;
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            d0.d dVar = k0Var.f2399a;
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            la.d1.a(dVar.j(), f1.g.f(2506586, new l(2, dVar), oVar), f1.g.f(-2065262597, new h0(0, dVar, (hf.y) objK), oVar), oVar, 3504);
            qVar = j1.n.f9689a;
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h0(k0Var, qVar, i10, 1);
        }
    }
}
