package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f19973b;

    public n(a0 a0Var) {
        this.f19973b = a0Var;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        return z10 == u() ? this : this.f19973b.z(z10).C(r());
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return h0Var != r() ? new c0(this, h0Var) : this;
    }

    @Override // se.m
    public final a0 G() {
        return this.f19973b;
    }
}
