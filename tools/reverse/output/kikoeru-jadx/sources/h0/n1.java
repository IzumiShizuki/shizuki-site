package h0;

import u.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1 f7786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.c0 f7787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.c0 f7788c;

    public n1(v1 v1Var, p1 p1Var) {
        this.f7786a = v1Var;
        this.f7787b = x0.v.o(new m1(p1Var, 1));
        this.f7788c = x0.v.o(new m1(p1Var, 0));
    }

    @Override // u.v1
    public final boolean a() {
        return this.f7786a.a();
    }

    @Override // u.v1
    public final Object b(s.v0 v0Var, ic.n nVar, ac.c cVar) {
        return this.f7786a.b(v0Var, nVar, cVar);
    }

    @Override // u.v1
    public final boolean c() {
        return ((Boolean) this.f7788c.getValue()).booleanValue();
    }

    @Override // u.v1
    public final boolean d() {
        return ((Boolean) this.f7787b.getValue()).booleanValue();
    }

    @Override // u.v1
    public final float e(float f10) {
        return this.f7786a.e(f10);
    }
}
