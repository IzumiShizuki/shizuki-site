package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f19926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f19927c;

    public a(a0 a0Var, a0 a0Var2) {
        jc.l.e(a0Var, "delegate");
        jc.l.e(a0Var2, "abbreviation");
        this.f19926b = a0Var;
        this.f19927c = a0Var2;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return new a(this.f19926b.C(h0Var), this.f19927c);
    }

    @Override // se.m
    public final a0 G() {
        return this.f19926b;
    }

    @Override // se.m
    public final m J(a0 a0Var) {
        return new a(a0Var, this.f19927c);
    }

    @Override // se.a0, se.w0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final a z(boolean z10) {
        return new a(this.f19926b.z(z10), this.f19927c.z(z10));
    }

    @Override // se.m, se.w
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = this.f19926b;
        jc.l.e(a0Var, "type");
        a0 a0Var2 = this.f19927c;
        jc.l.e(a0Var2, "type");
        return new a(a0Var, a0Var2);
    }
}
