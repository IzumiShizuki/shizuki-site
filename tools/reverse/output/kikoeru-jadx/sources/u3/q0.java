package u3;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends p0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w0 f21323r = w0.c(null, WindowInsets.CONSUMED);

    public q0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }

    @Override // u3.m0, u3.t0
    public p3.b g(int i10) {
        return p3.b.c(this.f21313c.getInsets(u0.a(i10)));
    }

    @Override // u3.m0, u3.t0
    public p3.b h(int i10) {
        return p3.b.c(this.f21313c.getInsetsIgnoringVisibility(u0.a(i10)));
    }

    @Override // u3.m0, u3.t0
    public boolean q(int i10) {
        return this.f21313c.isVisible(u0.a(i10));
    }

    public q0(w0 w0Var, q0 q0Var) {
        super(w0Var, q0Var);
    }

    @Override // u3.m0, u3.t0
    public final void d(View view) {
    }
}
