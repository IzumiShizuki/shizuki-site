package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m implements j, ve.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f19968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19969c;

    public l(a0 a0Var, boolean z10) {
        this.f19968b = a0Var;
        this.f19969c = z10;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        return z10 ? this.f19968b.z(z10) : this;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return new l(this.f19968b.C(h0Var), this.f19969c);
    }

    @Override // se.m
    public final a0 G() {
        return this.f19968b;
    }

    @Override // se.m
    public final m J(a0 a0Var) {
        return new l(a0Var, this.f19969c);
    }

    @Override // se.j
    public final w0 i(w wVar) {
        jc.l.e(wVar, "replacement");
        return c.o(wVar.x(), this.f19969c);
    }

    @Override // se.j
    public final boolean k() {
        a0 a0Var = this.f19968b;
        a0Var.t();
        return a0Var.t().h() instanceof yc.q0;
    }

    @Override // se.a0
    public final String toString() {
        return this.f19968b + " & Any";
    }

    @Override // se.m, se.w
    public final boolean u() {
        return false;
    }
}
