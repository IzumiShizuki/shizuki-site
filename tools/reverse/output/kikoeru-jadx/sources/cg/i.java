package cg;

import hd.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f4048b = new i(2);

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && oVar.z()) {
            oVar.Q();
        } else {
            w1.f fVarB = n7.e.f15459a;
            if (fVarB == null) {
                w1.e eVar = new w1.e("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = w1.g0.f23208a;
                q1.n0 n0Var = new q1.n0(q1.q.f17569b);
                q0 q0Var = new q0((byte) 0, 6);
                q0Var.u(20.0f, 11.0f);
                q0Var.q(7.83f);
                q0Var.t(5.59f, -5.59f);
                q0Var.s(12.0f, 4.0f);
                q0Var.t(-8.0f, 8.0f);
                q0Var.t(8.0f, 8.0f);
                q0Var.t(1.41f, -1.41f);
                q0Var.s(7.83f, 13.0f);
                q0Var.q(20.0f);
                q0Var.z(-2.0f);
                q0Var.l();
                w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                fVarB = eVar.b();
                n7.e.f15459a = fVarB;
            }
            v0.j.b(fVarB, null, null, q1.q.f17571d, oVar, 3120, 4);
        }
        return ub.a0.f21526a;
    }
}
