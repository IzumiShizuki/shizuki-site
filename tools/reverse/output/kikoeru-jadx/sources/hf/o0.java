package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8574f;

    public /* synthetic */ o0(int i10, Object obj) {
        this.f8573e = i10;
        this.f8574f = obj;
    }

    @Override // hf.g1
    public final boolean k() {
        switch (this.f8573e) {
        }
        return false;
    }

    @Override // hf.g1
    public final void l(Throwable th2) {
        switch (this.f8573e) {
            case 0:
                ((n0) this.f8574f).a();
                break;
            case 1:
                ((ic.k) this.f8574f).a(th2);
                break;
            default:
                h1 h1Var = (h1) this.f8574f;
                Object obj = k1.f8563a.get(j());
                if (!(obj instanceof s)) {
                    h1Var.h(a0.F(obj));
                } else {
                    h1Var.h(ub.a.b(((s) obj).f8586a));
                }
                break;
        }
    }
}
