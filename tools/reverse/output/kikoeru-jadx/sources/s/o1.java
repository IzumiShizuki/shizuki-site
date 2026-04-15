package s;

import u.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements v1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f19240i = new androidx.media3.exoplayer.offline.u(16, m1.f19227b, k.f19198h);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.b1 f19241a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19245e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.b1 f19242b = new x0.b1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w.k f19243c = new w.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.b1 f19244d = new x0.b1(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u.k f19246f = new u.k(new q.a0(9, this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.c0 f19247g = x0.v.o(new n1(this, 1));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.c0 f19248h = x0.v.o(new n1(this, 0));

    public o1(int i10) {
        this.f19241a = new x0.b1(i10);
    }

    @Override // u.v1
    public final boolean a() {
        return this.f19246f.a();
    }

    @Override // u.v1
    public final Object b(v0 v0Var, ic.n nVar, ac.c cVar) {
        Object objB = this.f19246f.b(v0Var, nVar, cVar);
        return objB == zb.a.f26667a ? objB : ub.a0.f21526a;
    }

    @Override // u.v1
    public final boolean c() {
        return ((Boolean) this.f19248h.getValue()).booleanValue();
    }

    @Override // u.v1
    public final boolean d() {
        return ((Boolean) this.f19247g.getValue()).booleanValue();
    }

    @Override // u.v1
    public final float e(float f10) {
        return this.f19246f.e(f10);
    }
}
