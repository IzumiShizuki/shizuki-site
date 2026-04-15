package a0;

import b0.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f74a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f75b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f76c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ah.j f77d;

    public l(g0 g0Var, j jVar, d dVar, ah.j jVar2) {
        this.f74a = g0Var;
        this.f75b = jVar;
        this.f76c = dVar;
        this.f77d = jVar2;
    }

    @Override // b0.n0
    public final int a() {
        return this.f75b.j().f390b;
    }

    @Override // b0.n0
    public final Object b(int i10) {
        Object objT = this.f77d.t(i10);
        return objT == null ? this.f75b.k(i10) : objT;
    }

    @Override // b0.n0
    public final Object c(int i10) {
        return this.f75b.i(i10);
    }

    @Override // b0.n0
    public final int d(Object obj) {
        return this.f77d.s(obj);
    }

    @Override // b0.n0
    public final void e(int i10, Object obj, x0.o oVar) {
        oVar.W(-462424778);
        b0.g0.b(obj, i10, this.f74a.f58q, f1.g.f(-824725566, new k(this, i10, 0), oVar), oVar, 3072);
        oVar.p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return jc.l.a(this.f75b, ((l) obj).f75b);
    }

    public final int hashCode() {
        return this.f75b.hashCode();
    }
}
