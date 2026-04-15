package q1;

import b0.o1;
import g2.g1;
import g2.u0;
import g2.w0;
import g2.x0;
import i2.q0;
import i2.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j1.p implements i2.z, y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ic.k f17548o;

    public l(ic.k kVar) {
        this.f17548o = kVar;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

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
        g1 g1VarV = u0Var.v(j10);
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new o1(27, g1VarV, this));
    }

    @Override // i2.y1
    public final boolean h() {
        return false;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f17548o + ')';
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
    }
}
