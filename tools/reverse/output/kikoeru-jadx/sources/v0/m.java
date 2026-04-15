package v0;

import g2.g1;
import g2.u0;
import g2.w0;
import g2.x0;
import i2.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j1.p implements i2.l, i2.z {
    @Override // i2.z
    public final /* synthetic */ int b(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.k(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int c(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.d(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int d(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.g(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int f(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.n(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final w0 g(x0 x0Var, u0 u0Var, long j10) {
        long j11 = k.f22246b;
        g1 g1VarV = u0Var.v(j10);
        boolean z10 = this.f9703n && ((Boolean) i2.f.i(this, k.f22245a)).booleanValue();
        int iMax = z10 ? Math.max(g1VarV.f7180a, x0Var.a0(f3.h.b(j11))) : g1VarV.f7180a;
        int iMax2 = z10 ? Math.max(g1VarV.f7181b, x0Var.a0(f3.h.a(j11))) : g1VarV.f7181b;
        return x0Var.b0(iMax, iMax2, vb.s.f22820a, new l(iMax, iMax2, g1VarV));
    }
}
