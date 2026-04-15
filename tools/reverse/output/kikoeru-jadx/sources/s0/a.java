package s0;

import ic.n;
import ub.a0;
import x0.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19318a = new a();

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        o oVar = (o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            oVar.Q();
        }
        return a0.f21526a;
    }
}
