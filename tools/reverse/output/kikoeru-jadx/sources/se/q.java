package se;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends w0 implements ve.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f19978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f19979c;

    public q(a0 a0Var, a0 a0Var2) {
        jc.l.e(a0Var, "lowerBound");
        jc.l.e(a0Var2, "upperBound");
        this.f19978b = a0Var;
        this.f19979c = a0Var2;
    }

    public abstract a0 D();

    public abstract String F(de.i iVar, de.i iVar2);

    @Override // se.w
    public le.o n0() {
        return D().n0();
    }

    @Override // se.w
    public final List q() {
        return D().q();
    }

    @Override // se.w
    public final h0 r() {
        return D().r();
    }

    @Override // se.w
    public final k0 t() {
        return D().t();
    }

    public String toString() {
        return de.i.f5908e.V(this);
    }

    @Override // se.w
    public final boolean u() {
        return D().u();
    }
}
