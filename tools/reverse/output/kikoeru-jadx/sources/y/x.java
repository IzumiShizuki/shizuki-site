package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements h2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f25282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r1 f25283b;

    public x(ic.k kVar) {
        this.f25282a = kVar;
    }

    @Override // j1.q
    public final Object a(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }

    @Override // j1.q
    public final /* synthetic */ j1.q e(j1.q qVar) {
        return a0.c.r(this, qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && ((x) obj).f25282a == this.f25282a;
    }

    public final int hashCode() {
        return this.f25282a.hashCode();
    }

    @Override // h2.c
    public final void i(h2.f fVar) {
        r1 r1Var = (r1) fVar.s(u1.f25267a);
        if (jc.l.a(r1Var, this.f25283b)) {
            return;
        }
        this.f25283b = r1Var;
        this.f25282a.a(r1Var);
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
