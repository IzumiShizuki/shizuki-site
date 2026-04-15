package q;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r.z0 f17461a = r.d.q(7, null);

    public static final n2 a(long j10, r.u1 u1Var, x0.o oVar, int i10, int i11) {
        r.j jVar = u1Var;
        if ((i11 & 2) != 0) {
            jVar = f17461a;
        }
        r.j jVar2 = jVar;
        boolean zF = oVar.f(q1.q.f(j10));
        Object objK = oVar.K();
        if (zF || objK == x0.k.f24334a) {
            r1.c cVarF = q1.q.f(j10);
            r rVar = r.f17425e;
            a0 a0Var = new a0(0, cVarF);
            r.v1 v1Var = r.w1.f18620a;
            r.v1 v1Var2 = new r.v1(rVar, a0Var);
            oVar.h0(v1Var2);
            objK = v1Var2;
        }
        return r.e.c(new q1.q(j10), (r.v1) objK, jVar2, null, "ColorAnimation", oVar, (i10 << 3) & 896, 8);
    }
}
