package q;

import android.view.ViewConfiguration;
import i7.p2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f17477a = ViewConfiguration.getScrollFriction();

    public static final r.t a(x0.o oVar) {
        f3.c cVar = (f3.c) oVar.j(j2.l1.f9866h);
        boolean zC = oVar.c(cVar.a());
        Object objK = oVar.K();
        if (zC || objK == x0.k.f24334a) {
            objK = new r.t(new p2(cVar));
            oVar.h0(objK);
        }
        return (r.t) objK;
    }
}
