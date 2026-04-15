package r;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f18373a = d.q(7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f18374b;

    static {
        p1.c cVar = f2.f18406a;
        f18374b = d.q(3, new f3.f(0.1f));
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final n2 a(float f10, u1 u1Var, x0.o oVar, int i10) {
        return c(new f3.f(f10), w1.f18622c, u1Var, null, "DpAnimation", oVar, (i10 << 3) & 896, 8);
    }

    public static final n2 b(float f10, j jVar, x0.o oVar) {
        Float fValueOf = Float.valueOf(0.01f);
        if (jVar == f18373a) {
            oVar.W(1125558999);
            boolean zC = oVar.c(0.01f);
            Object objK = oVar.K();
            if (zC || objK == x0.k.f24334a) {
                objK = d.q(3, fValueOf);
                oVar.h0(objK);
            }
            jVar = (z0) objK;
            oVar.p(false);
        } else {
            oVar.W(1125668925);
            oVar.p(false);
        }
        return c(Float.valueOf(f10), w1.f18620a, jVar, fValueOf, "FloatAnimation", oVar, 0, 0);
    }

    public static final n2 c(Object obj, v1 v1Var, j jVar, Float f10, String str, x0.o oVar, int i10, int i11) {
        if ((i11 & 8) != 0) {
            f10 = null;
        }
        Object objK = oVar.K();
        Object obj2 = x0.k.f24334a;
        if (objK == obj2) {
            objK = x0.v.v(null);
            oVar.h0(objK);
        }
        x0.w0 w0Var = (x0.w0) objK;
        Object objK2 = oVar.K();
        if (objK2 == obj2) {
            objK2 = new c(obj, v1Var, f10);
            oVar.h0(objK2);
        }
        c cVar = (c) objK2;
        x0.w0 w0VarY = x0.v.y(null, oVar);
        if (f10 != null && (jVar instanceof z0)) {
            z0 z0Var = (z0) jVar;
            if (!jc.l.a(z0Var.f18639c, f10)) {
                jVar = new z0(z0Var.f18637a, z0Var.f18638b, f10);
            }
        }
        x0.w0 w0VarY2 = x0.v.y(jVar, oVar);
        Object objK3 = oVar.K();
        if (objK3 == obj2) {
            objK3 = g8.a.c(-1, 6, null);
            oVar.h0(objK3);
        }
        kf.j jVar2 = (kf.j) objK3;
        boolean zH = oVar.h(jVar2) | oVar.h(obj);
        Object objK4 = oVar.K();
        if (zH || objK4 == obj2) {
            objK4 = new b0.s1(14, jVar2, obj);
            oVar.h0(objK4);
        }
        x0.v.h((ic.a) objK4, oVar);
        boolean zH2 = oVar.h(jVar2) | oVar.h(cVar) | oVar.f(w0VarY2) | oVar.f(w0VarY);
        Object objK5 = oVar.K();
        if (zH2 || objK5 == obj2) {
            Object gVar = new cg.g(jVar2, cVar, w0VarY2, w0VarY, (yb.c) null);
            oVar.h0(gVar);
            objK5 = gVar;
        }
        x0.v.e((ic.n) objK5, jVar2, oVar);
        n2 n2Var = (n2) w0Var.getValue();
        return n2Var == null ? cVar.f18333c : n2Var;
    }
}
