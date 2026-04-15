package o1;

import d.i0;
import o.g0;
import o.l0;
import o.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2.v f16089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f16090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f16091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16092e;

    public g(k kVar, j2.v vVar) {
        this.f16088a = kVar;
        this.f16089b = vVar;
        int i10 = t0.f16044a;
        this.f16090c = new l0();
        this.f16091d = new l0();
    }

    public final void a() {
        if (this.f16092e) {
            return;
        }
        i0 i0Var = new i0(0, this, g.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 9);
        g0 g0Var = this.f16089b.N0;
        if (g0Var.f(i0Var) < 0) {
            g0Var.a(i0Var);
        }
        this.f16092e = true;
    }
}
