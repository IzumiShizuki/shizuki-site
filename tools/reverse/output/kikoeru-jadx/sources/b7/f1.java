package b7;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements h1, b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m4.u0 f1772a;

    public /* synthetic */ f1(m4.u0 u0Var) {
        this.f1772a = u0Var;
    }

    @Override // b7.b2
    public void b(s1 s1Var, int i10) {
        s1Var.f(i10, this.f1772a);
    }

    @Override // b7.h1
    public void c(t0 t0Var) {
        boolean z10;
        boolean z11;
        d0 d0Var = t0Var.f2069a;
        if (t0Var.T()) {
            m4.u0 u0Var = t0Var.f2089u;
            int i10 = p4.c0.f16548a;
            m4.u0 u0Var2 = this.f1772a;
            if (Objects.equals(u0Var, u0Var2)) {
                return;
            }
            t0Var.f2089u = u0Var2;
            m4.u0 u0Var3 = t0Var.f2090v;
            m4.u0 u0VarB = t0.b(t0Var.f2088t, u0Var2);
            t0Var.f2090v = u0VarB;
            if (u0VarB.equals(u0Var3)) {
                z10 = false;
                z11 = false;
            } else {
                ya.a1 a1Var = t0Var.f2085q;
                ya.a1 a1Var2 = t0Var.f2086r;
                ya.a1 a1VarN = t0.n(t0Var.f2084p, t0Var.f2083o, t0Var.f2087s, t0Var.f2090v, t0Var.C);
                t0Var.f2085q = a1VarN;
                t0Var.f2086r = t0.m(a1VarN, t0Var.f2083o, t0Var.C, t0Var.f2087s, t0Var.f2090v);
                z10 = !t0Var.f2085q.equals(a1Var);
                z11 = !t0Var.f2086r.equals(a1Var2);
                t0Var.f2076h.e(13, new l0(t0Var, 2));
            }
            if (z11) {
                d0Var.getClass();
                p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
                d0Var.f1706c.getClass();
            }
            if (z10) {
                d0Var.getClass();
                p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
                d0Var.f1706c.w();
            }
        }
    }
}
