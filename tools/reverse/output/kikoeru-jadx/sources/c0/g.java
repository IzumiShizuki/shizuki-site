package c0;

import b0.g0;
import b0.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.j f3064c;

    public g(z zVar, f fVar, ah.j jVar) {
        this.f3062a = zVar;
        this.f3063b = fVar;
        this.f3064c = jVar;
    }

    @Override // b0.n0
    public final int a() {
        return this.f3063b.j().f390b;
    }

    @Override // b0.n0
    public final Object b(int i10) {
        Object objT = this.f3064c.t(i10);
        return objT == null ? this.f3063b.k(i10) : objT;
    }

    @Override // b0.n0
    public final Object c(int i10) {
        return this.f3063b.i(i10);
    }

    @Override // b0.n0
    public final int d(Object obj) {
        return this.f3064c.s(obj);
    }

    @Override // b0.n0
    public final void e(int i10, Object obj, x0.o oVar) {
        oVar.W(89098518);
        g0.b(obj, i10, this.f3062a.f3198s, f1.g.f(608834466, new a0.k(this, i10, 1), oVar), oVar, 3072);
        oVar.p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return jc.l.a(this.f3063b, ((g) obj).f3063b);
    }

    public final int hashCode() {
        return this.f3063b.hashCode();
    }
}
