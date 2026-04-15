package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements v, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f780c;

    public k0(String str, j0 j0Var) {
        this.f778a = str;
        this.f779b = j0Var;
    }

    @Override // androidx.lifecycle.v
    public final void i(x xVar, o oVar) {
        if (oVar == o.ON_DESTROY) {
            this.f780c = false;
            xVar.f().q1(this);
        }
    }

    public final void u(q qVar, v2.e eVar) {
        jc.l.e(eVar, "registry");
        jc.l.e(qVar, "lifecycle");
        if (this.f780c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f780c = true;
        qVar.W0(this);
        eVar.y(this.f778a, (d.h) this.f779b.f777b.f4205f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
