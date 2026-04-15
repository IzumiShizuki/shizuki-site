package f1;

import jc.c0;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6628a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f6629b = new StackTraceElement[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f6630c = new n(0, new long[0], new Object[0]);

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final f b(x0.o oVar, int i10, jc.m mVar) {
        f fVar;
        oVar.U(Integer.rotateLeft(i10, 1), f6628a);
        Object objK = oVar.K();
        if (objK == x0.k.f24334a) {
            fVar = new f(mVar, i10, true);
            oVar.h0(fVar);
        } else {
            jc.l.c(objK, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            fVar = (f) objK;
            fVar.o(mVar);
        }
        oVar.p(false);
        return fVar;
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final void d(x0.o oVar, ic.n nVar) {
        jc.l.c(nVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        c0.c(2, nVar);
        nVar.q(oVar, 1);
    }

    public static final boolean e(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) > 2139095040;
    }

    public static final f f(int i10, ub.e eVar, x0.o oVar) {
        Object objK = oVar.K();
        if (objK == x0.k.f24334a) {
            objK = new f(eVar, i10, true);
            oVar.h0(objK);
        }
        f fVar = (f) objK;
        fVar.o(eVar);
        return fVar;
    }

    public static final boolean g(p1 p1Var, p1 p1Var2) {
        if (p1Var == null) {
            return true;
        }
        if (p1Var instanceof p1) {
            return !p1Var.b() || p1Var.equals(p1Var2) || jc.l.a(p1Var.f24420c, p1Var2.f24420c);
        }
        return false;
    }
}
