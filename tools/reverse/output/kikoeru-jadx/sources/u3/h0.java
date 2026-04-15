package u3;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h0 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f21301c;

    public h0() {
        this.f21301c = u2.b.d();
    }

    @Override // u3.l0
    public w0 b() {
        a();
        w0 w0VarC = w0.c(null, this.f21301c.build());
        w0VarC.f21343a.r(this.f21307b);
        return w0VarC;
    }

    @Override // u3.l0
    public void d(p3.b bVar) {
        this.f21301c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // u3.l0
    public void e(p3.b bVar) {
        this.f21301c.setStableInsets(bVar.d());
    }

    @Override // u3.l0
    public void f(p3.b bVar) {
        this.f21301c.setSystemGestureInsets(bVar.d());
    }

    @Override // u3.l0
    public void g(p3.b bVar) {
        this.f21301c.setSystemWindowInsets(bVar.d());
    }

    @Override // u3.l0
    public void h(p3.b bVar) {
        this.f21301c.setTappableElementInsets(bVar.d());
    }

    public h0(w0 w0Var) {
        WindowInsets.Builder builderD;
        super(w0Var);
        WindowInsets windowInsetsB = w0Var.b();
        if (windowInsetsB != null) {
            builderD = u2.b.e(windowInsetsB);
        } else {
            builderD = u2.b.d();
        }
        this.f21301c = builderD;
    }
}
