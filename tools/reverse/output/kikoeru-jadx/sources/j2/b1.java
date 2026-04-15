package j2;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends j1.p implements n2.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewGroup f9730o;

    @Override // n2.a
    public final Object t(i2.g1 g1Var, b0.s1 s1Var, ac.c cVar) {
        long jH = g1Var.H(0L);
        p1.c cVar2 = (p1.c) s1Var.b();
        p1.c cVarI = cVar2 != null ? cVar2.i(jH) : null;
        if (cVarI != null) {
            this.f9730o.requestRectangleOnScreen(q1.h0.z(cVarI), false);
        }
        return ub.a0.f21526a;
    }
}
