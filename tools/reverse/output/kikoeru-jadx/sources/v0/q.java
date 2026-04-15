package v0;

import g2.g1;
import g2.u0;
import g2.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f22316b = new q(3);

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0 x0Var = (x0) obj;
        long j10 = ((f3.a) obj3).f6651a;
        int iA0 = x0Var.a0(w.f22331a);
        int i10 = iA0 * 2;
        g1 g1VarV = ((u0) obj2).v(f3.b.i(0, i10, j10));
        int i11 = g1VarV.f7181b - i10;
        return x0Var.b0(g1VarV.f7180a, i11, vb.s.f22820a, new o1.j(iA0, 1, g1VarV));
    }
}
