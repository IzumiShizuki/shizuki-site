package xe;

import jc.l;
import se.f0;
import se.k0;
import se.l0;
import se.n0;
import se.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l0 {
    @Override // se.l0
    public final n0 g(k0 k0Var) {
        l.e(k0Var, "key");
        fe.b bVar = k0Var instanceof fe.b ? (fe.b) k0Var : null;
        if (bVar == null) {
            return null;
        }
        return bVar.a().c() ? new f0(bVar.a().b(), x0.OUT_VARIANCE) : bVar.a();
    }
}
