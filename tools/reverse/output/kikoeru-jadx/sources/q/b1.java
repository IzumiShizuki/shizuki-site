package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends j1.p implements i2.p, h2.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q1 f17239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0.d0 f17240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ic.n f17241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0.a1 f17242r = new x0.a1(0.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z0 f17243s;

    public b1(q1 q1Var, b0.d0 d0Var, ic.n nVar) {
        this.f17239o = q1Var;
        this.f17240p = d0Var;
        this.f17241q = nVar;
    }

    @Override // h2.e
    public final /* synthetic */ a2.c K() {
        return h2.b.f8105d;
    }

    @Override // i2.p
    public final void R(i2.l0 l0Var) {
        z0 z0Var = this.f17243s;
        t1.b bVar = z0Var != null ? z0Var.f17487a : null;
        if (bVar == null) {
            throw new IllegalArgumentException("Error: layer never initialized");
        }
        t0.N(l0Var, bVar, new a1(l0Var, 0));
        if (((Boolean) this.f17240p.b()).booleanValue()) {
            return;
        }
        u3.x0.k(l0Var, bVar);
    }

    @Override // j1.p
    public final void r0() {
        z0 z0Var = new z0(this, i2.f.w(this).b());
        this.f17239o.f17421i.add(z0Var);
        this.f17243s = z0Var;
    }

    @Override // h2.f
    public final /* synthetic */ Object s(h2.g gVar) {
        return a0.c.a(this, gVar);
    }

    @Override // j1.p
    public final void t0() {
        z0 z0Var = this.f17243s;
        if (z0Var != null) {
            this.f17239o.f17421i.remove(z0Var);
            i2.f.w(this).a(z0Var.f17487a);
        }
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
