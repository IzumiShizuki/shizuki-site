package s;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends j1.p implements i2.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w.k f19297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19300r;

    public x(w.k kVar) {
        this.f19297o = kVar;
    }

    @Override // i2.p
    public final void R(i2.l0 l0Var) {
        l0Var.b();
        s1.b bVar = l0Var.f8782a;
        if (this.f19298p) {
            q.t0.q(l0Var, q1.q.b(0.3f, q1.q.f17569b), bVar.f19346b.D(), 0.0f, TinkerReport.KEY_APPLIED_DEXOPT_EXIST);
        } else if (this.f19299q || this.f19300r) {
            q.t0.q(l0Var, q1.q.b(0.1f, q1.q.f17569b), bVar.f19346b.D(), 0.0f, TinkerReport.KEY_APPLIED_DEXOPT_EXIST);
        }
    }

    @Override // j1.p
    public final void r0() {
        hf.a0.y(n0(), null, null, new ba.v0(15, this, null), 3);
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
