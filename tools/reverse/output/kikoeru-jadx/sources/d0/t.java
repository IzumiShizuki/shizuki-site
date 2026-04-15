package d0;

import b0.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.g0 f5398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.j f5399c;

    public t(d dVar, s sVar, ah.j jVar) {
        this.f5397a = dVar;
        this.f5398b = sVar;
        this.f5399c = jVar;
    }

    @Override // b0.n0
    public final int a() {
        return this.f5398b.j().f390b;
    }

    @Override // b0.n0
    public final Object b(int i10) {
        Object objT = this.f5399c.t(i10);
        return objT == null ? this.f5398b.k(i10) : objT;
    }

    @Override // b0.n0
    public final /* synthetic */ Object c(int i10) {
        return null;
    }

    @Override // b0.n0
    public final int d(Object obj) {
        return this.f5399c.s(obj);
    }

    @Override // b0.n0
    public final void e(int i10, Object obj, x0.o oVar) {
        oVar.W(-1201380429);
        b0.g0.b(obj, i10, this.f5397a.A, f1.g.f(1142237095, new a0.k(this, i10, 2), oVar), oVar, 3072);
        oVar.p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return jc.l.a(this.f5398b, ((t) obj).f5398b);
    }

    public final int hashCode() {
        return this.f5398b.hashCode();
    }
}
