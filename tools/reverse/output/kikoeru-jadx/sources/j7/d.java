package j7;

import i7.a0;
import i7.c0;
import i7.z;
import ic.n;
import jc.l;
import lf.f;
import x0.k;
import x0.o;
import x0.v;
import yb.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f10599a;

    static {
        a0 a0Var = new a0(false);
        f10599a = new c0(z.f9388b, a0Var, a0Var);
    }

    public static final b a(f fVar, o oVar) {
        l.e(fVar, "<this>");
        oVar.X(388053246);
        oVar.X(1046463091);
        boolean zF = oVar.f(fVar);
        Object objK = oVar.K();
        Object obj = k.f24334a;
        if (zF || objK == obj) {
            objK = new b(fVar);
            oVar.h0(objK);
        }
        b bVar = (b) objK;
        oVar.p(false);
        oVar.X(1046463169);
        Object obj2 = i.f26088a;
        boolean zH = oVar.h(obj2) | oVar.h(bVar);
        Object objK2 = oVar.K();
        yb.c cVar = null;
        if (zH || objK2 == obj) {
            objK2 = new c(bVar, cVar, 1);
            oVar.h0(objK2);
        }
        oVar.p(false);
        v.e((n) objK2, bVar, oVar);
        oVar.X(1046463438);
        boolean zH2 = oVar.h(obj2) | oVar.h(bVar);
        Object objK3 = oVar.K();
        if (zH2 || objK3 == obj) {
            objK3 = new c(bVar, cVar, 3);
            oVar.h0(objK3);
        }
        oVar.p(false);
        v.e((n) objK3, bVar, oVar);
        oVar.p(false);
        return bVar;
    }
}
