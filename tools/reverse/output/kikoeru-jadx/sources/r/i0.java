package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends androidx.lifecycle.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f18456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f18457c;

    public i0(Object obj) {
        super(5);
        this.f18456b = x0.v.v(obj);
        this.f18457c = x0.v.v(obj);
    }

    @Override // androidx.lifecycle.q
    public final Object b1() {
        return this.f18456b.getValue();
    }

    @Override // androidx.lifecycle.q
    public final Object g1() {
        return this.f18457c.getValue();
    }

    @Override // androidx.lifecycle.q
    public final void x1(Object obj) {
        this.f18456b.setValue(obj);
    }

    @Override // androidx.lifecycle.q
    public final void A1() {
    }

    @Override // androidx.lifecycle.q
    public final void z1(q1 q1Var) {
    }
}
