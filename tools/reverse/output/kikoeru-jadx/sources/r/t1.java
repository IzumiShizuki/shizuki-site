package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f18582a = ub.a.c(ub.i.f21541b, r1.f18560b);

    public static final void a(q1 q1Var, m1 m1Var, Object obj, Object obj2, x xVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(867041821);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(q1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(m1Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? oVar.f(obj) : oVar.h(obj) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? oVar.f(obj2) : oVar.h(obj2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? oVar.f(xVar) : oVar.h(xVar) ? 16384 : 8192;
        }
        if (!oVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            oVar.Q();
        } else if (q1Var.g()) {
            m1Var.g(obj, obj2, xVar);
        } else {
            m1Var.h(obj2, xVar);
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q.e0(q1Var, m1Var, obj, obj2, xVar, i10);
        }
    }

    public static final q1 b(q1 q1Var, Object obj, Object obj2, String str, x0.o oVar, int i10) {
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && oVar.f(q1Var)) || (i10 & 6) == 4;
        Object objK = oVar.K();
        Object obj3 = x0.k.f24334a;
        if (z11 || objK == obj3) {
            objK = new q1(new i0(obj), q1Var, q1Var.f18541c + " > " + str);
            oVar.h0(objK);
        }
        q1 q1Var2 = (q1) objK;
        if ((i11 <= 4 || !oVar.f(q1Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zF = oVar.f(q1Var2) | z10;
        Object objK2 = oVar.K();
        if (zF || objK2 == obj3) {
            objK2 = new p1(q1Var, q1Var2, 1);
            oVar.h0(objK2);
        }
        x0.v.c(q1Var2, (ic.k) objK2, oVar);
        if (q1Var.g()) {
            q1Var2.k(obj, obj2);
            return q1Var2;
        }
        q1Var2.p(obj2);
        q1Var2.f18549k.setValue(Boolean.FALSE);
        return q1Var2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ic.k, jc.m] */
    public static final j1 c(q1 q1Var, v1 v1Var, String str, x0.o oVar, int i10, int i11) {
        i1 i1Var;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = oVar.f(q1Var);
        Object objK = oVar.K();
        Object obj = x0.k.f24334a;
        if (zF || objK == obj) {
            objK = new j1(q1Var, v1Var, str);
            oVar.h0(objK);
        }
        j1 j1Var = (j1) objK;
        boolean zF2 = oVar.f(q1Var) | oVar.h(j1Var);
        Object objK2 = oVar.K();
        if (zF2 || objK2 == obj) {
            objK2 = new p1(q1Var, j1Var, 2);
            oVar.h0(objK2);
        }
        x0.v.c(j1Var, (ic.k) objK2, oVar);
        if (q1Var.g() && (i1Var = (i1) j1Var.f18465b.getValue()) != null) {
            q1 q1Var2 = j1Var.f18466c;
            i1Var.f18458a.g(i1Var.f18460c.a(q1Var2.f().a()), i1Var.f18460c.a(q1Var2.f().c()), (x) i1Var.f18459b.a(q1Var2.f()));
        }
        return j1Var;
    }

    public static final m1 d(q1 q1Var, Object obj, Object obj2, x xVar, v1 v1Var, x0.o oVar, int i10) {
        boolean zF = oVar.f(q1Var);
        Object objK = oVar.K();
        Object obj3 = x0.k.f24334a;
        if (zF || objK == obj3) {
            p pVar = (p) v1Var.f18596a.a(obj2);
            pVar.d();
            objK = new m1(q1Var, obj, pVar, v1Var);
            oVar.h0(objK);
        }
        m1 m1Var = (m1) objK;
        a(q1Var, m1Var, obj, obj2, xVar, oVar, 0);
        boolean zF2 = oVar.f(q1Var) | oVar.f(m1Var);
        Object objK2 = oVar.K();
        if (zF2 || objK2 == obj3) {
            objK2 = new p1(q1Var, m1Var, 3);
            oVar.h0(objK2);
        }
        x0.v.c(m1Var, (ic.k) objK2, oVar);
        return m1Var;
    }

    public static final q1 e(androidx.lifecycle.q qVar, String str, x0.o oVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && oVar.f(qVar)) || (i10 & 6) == 4;
        Object objK = oVar.K();
        Object obj = x0.k.f24334a;
        if (z11 || objK == obj) {
            objK = new q1(qVar, null, str);
            oVar.h0(objK);
        }
        q1 q1Var = (q1) objK;
        if (qVar instanceof w0) {
            oVar.W(1030829284);
            w0 w0Var = (w0) qVar;
            Object value = w0Var.f18605c.getValue();
            Object value2 = w0Var.f18604b.getValue();
            if ((i12 <= 4 || !oVar.f(qVar)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objK2 = oVar.K();
            if (z10 || objK2 == obj) {
                objK2 = new q.q(qVar, (yb.c) null);
                oVar.h0(objK2);
            }
            x0.v.f(value, value2, (ic.n) objK2, oVar);
            oVar.p(false);
        } else {
            oVar.W(1031290843);
            q1Var.a(0, qVar.g1(), oVar);
            oVar.p(false);
        }
        boolean zF = oVar.f(q1Var);
        Object objK3 = oVar.K();
        if (zF || objK3 == obj) {
            objK3 = new q.d0(q1Var, 1);
            oVar.h0(objK3);
        }
        x0.v.c(q1Var, (ic.k) objK3, oVar);
        return q1Var;
    }

    public static final q1 f(Object obj, String str, x0.o oVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        Object objK = oVar.K();
        x0.r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            objK = new q1(new i0(obj), null, str);
            oVar.h0(objK);
        }
        q1 q1Var = (q1) objK;
        q1Var.a((i10 & 8) | 48 | (i10 & 14), obj, oVar);
        Object objK2 = oVar.K();
        if (objK2 == r0Var) {
            objK2 = new q.d0(q1Var, 2);
            oVar.h0(objK2);
        }
        x0.v.c(q1Var, (ic.k) objK2, oVar);
        return q1Var;
    }
}
