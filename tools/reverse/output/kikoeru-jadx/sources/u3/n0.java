package u3;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class n0 extends m0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p3.b f21319n;

    public n0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f21319n = null;
    }

    @Override // u3.t0
    public w0 b() {
        return w0.c(null, this.f21313c.consumeStableInsets());
    }

    @Override // u3.t0
    public w0 c() {
        return w0.c(null, this.f21313c.consumeSystemWindowInsets());
    }

    @Override // u3.t0
    public final p3.b j() {
        if (this.f21319n == null) {
            WindowInsets windowInsets = this.f21313c;
            this.f21319n = p3.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f21319n;
    }

    @Override // u3.t0
    public boolean o() {
        return this.f21313c.isConsumed();
    }

    @Override // u3.t0
    public void u(p3.b bVar) {
        this.f21319n = bVar;
    }

    public n0(w0 w0Var, n0 n0Var) {
        super(w0Var, n0Var);
        this.f21319n = null;
        this.f21319n = n0Var.f21319n;
    }
}
