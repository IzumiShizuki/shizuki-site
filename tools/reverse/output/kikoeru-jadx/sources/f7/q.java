package f7;

import e7.d0;
import e7.l0;
import e7.m0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf7/q;", "Le7/m0;", "Lf7/p;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@l0("dialog")
public final class q extends m0 {
    @Override // e7.m0
    public final e7.u a() {
        f1.f fVar = e.f6762a;
        return new p(this);
    }

    @Override // e7.m0
    public final void d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((e7.j) it.next());
        }
    }

    @Override // e7.m0
    public final void e(e7.j jVar, boolean z10) {
        b().e(jVar, z10);
        int iC0 = vb.m.c0((Iterable) b().f6358f.f12434a.getValue(), jVar);
        int i10 = 0;
        for (Object obj : (Iterable) b().f6358f.f12434a.getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            e7.j jVar2 = (e7.j) obj;
            if (i10 > iC0) {
                b().c(jVar2);
            }
            i10 = i11;
        }
    }
}
