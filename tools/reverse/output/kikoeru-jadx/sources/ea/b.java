package ea;

import i2.l0;
import i8.l;
import x0.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v1.b implements u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f6426f;

    public b(l lVar) {
        this.f6426f = lVar;
    }

    @Override // x0.u1
    public final void a() {
        this.f6426f.a();
    }

    @Override // x0.u1
    public final void c() {
        this.f6426f.c();
    }

    @Override // x0.u1
    public final void d() {
        this.f6426f.d();
    }

    @Override // v1.b
    public final long h() {
        return this.f6426f.h();
    }

    @Override // v1.b
    public final void i(l0 l0Var) {
        try {
            this.f6426f.g(l0Var, l0Var.e(), 1.0f, null);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
