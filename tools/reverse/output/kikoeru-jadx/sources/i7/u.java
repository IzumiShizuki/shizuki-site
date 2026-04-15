package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9325a = new Object();

    public static final lf.j0 a(lf.f fVar, k4.a aVar) {
        jc.l.e(fVar, "<this>");
        yb.c cVar = null;
        lf.f fVarF = f(fVar, new i(0, aVar, cVar));
        j jVar = new j(3, cVar);
        jc.l.e(fVarF, "<this>");
        k9.c cVarI = lf.p0.i(new lf.n(new v1(new a0.c0(2, cVar, 10), new h(new n(new s(fVarF, jVar, null, 0)), 0)), new k(3, null, 0)));
        lf.o0 o0VarA = lf.p0.a(1, cVarI.f11234c, (kf.a) cVarI.f11233b);
        yb.h hVar = (yb.h) cVarI.f11236e;
        lf.f fVar2 = (lf.f) cVarI.f11235d;
        app.nekogram.translator.r rVar = lf.p0.f12473a;
        lf.u0 u0Var = lf.s0.f12491a;
        lf.u0 u0Var2 = lf.s0.f12492b;
        hf.a0.x(aVar, hVar, u0Var2.equals(u0Var) ? hf.z.f8616a : hf.z.f8619d, new e.j(u0Var2, fVar2, o0VarA, rVar, (yb.c) null));
        return new lf.j0(o0VarA);
    }

    public static final l1 b(l1 l1Var, ic.n nVar) {
        jc.l.e(l1Var, "<this>");
        return new l1(new v1(l1Var.f9193a, nVar, 0), l1Var.f9194b, l1Var.f9195c, k1.f9182b);
    }

    public static final l1 c(l1 l1Var, ic.n nVar) {
        jc.l.e(l1Var, "<this>");
        return new l1(new v1(l1Var.f9193a, nVar, 1), l1Var.f9194b, l1Var.f9195c, k1.f9182b);
    }

    public static final boolean d(u2 u2Var, u2 u2Var2, d0 d0Var) {
        jc.l.e(u2Var, "<this>");
        if (u2Var2 == null || ((u2Var2 instanceof t2) && (u2Var instanceof s2))) {
            return true;
        }
        if ((u2Var instanceof t2) && (u2Var2 instanceof s2)) {
            return false;
        }
        return (u2Var.f9333c == u2Var2.f9333c && u2Var.f9334d == u2Var2.f9334d && u2Var2.a(d0Var) <= u2Var.a(d0Var)) ? false : true;
    }

    public static final lf.f e(ic.n nVar) {
        return lf.p0.g(new n(new ba.u0(nVar, null)), -2);
    }

    public static final lf.f f(lf.f fVar, ic.o oVar) {
        jc.l.e(fVar, "<this>");
        return e(new s(fVar, oVar, null, 1));
    }
}
