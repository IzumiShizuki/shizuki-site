package la;

import android.view.ViewConfiguration;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f12013a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2.g f12014b = new h2.g(new i9.f(5));

    public static final void a(w.k kVar, x0.w0 w0Var, x0.o oVar, int i10) {
        jc.l.e(w0Var, "pressedInteraction");
        oVar.Y(-784019837);
        int i11 = (oVar.f(kVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            boolean z10 = (i11 & 14) == 4;
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new e(w0Var, kVar, 1);
                oVar.h0(objK);
            }
            x0.v.c(kVar, (ic.k) objK, oVar);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.h0(kVar, w0Var, i10, 8);
        }
    }
}
