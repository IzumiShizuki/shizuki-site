package qd;

import ce.j0;
import java.util.List;
import jc.l;
import m0.w;
import se.f0;
import se.n0;
import se.u0;
import se.x0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static n0 a(q0 q0Var, a aVar, w wVar, se.w wVar2) {
        l.e(aVar, "typeAttr");
        l.e(wVar, "typeParameterUpperBoundEraser");
        if (!aVar.f18140c) {
            aVar = a.a(aVar, b.f18144a, false, null, null, 61);
        }
        int iOrdinal = aVar.f18139b.ordinal();
        x0 x0Var = x0.INVARIANT;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new f0(wVar2, x0Var);
            }
            throw new j0();
        }
        if (!q0Var.e0().f20008b) {
            return new f0(ie.d.e(q0Var).n(), x0Var);
        }
        List listO = wVar2.t().o();
        l.d(listO, "getParameters(...)");
        return !listO.isEmpty() ? new f0(wVar2, x0.OUT_VARIANCE) : u0.k(q0Var, aVar);
    }
}
