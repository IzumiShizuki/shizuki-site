package t;

import b0.i0;
import cg.d0;
import h1.s;
import x0.o;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20071a = new s();

    public static void b(g gVar, cg.d dVar, ic.a aVar) {
        gVar.f20071a.add(new f1.f(new d0(dVar, aVar), 262103052, true));
    }

    public final void a(c cVar, o oVar, int i10) {
        oVar.Y(1320309496);
        int i11 = (oVar.f(cVar) ? 4 : 2) | i10 | (oVar.f(this) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            s sVar = this.f20071a;
            int size = sVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((ic.o) sVar.get(i12)).g(cVar, oVar, Integer.valueOf(i11 & 14));
            }
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new i0(this, cVar, i10, 14);
        }
    }
}
