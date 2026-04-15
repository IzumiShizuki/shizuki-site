package s9;

import fg.f;
import gh.g;
import ic.n;
import m0.z8;
import q1.h0;
import ub.a0;
import x0.o;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f19671b;

    public /* synthetic */ c(f fVar, int i10) {
        this.f19670a = i10;
        this.f19671b = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f19670a) {
            case 0:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z8.b((String) this.f19671b.getValue(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                o oVar2 = (o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z8.b((String) this.f19671b.getValue(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                o oVar3 = (o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p.a(androidx.compose.foundation.a.b(g.k(androidx.compose.foundation.layout.c.j(j1.n.f9689a, 30), g0.g.f7122a), h0.e(((Number) this.f19671b.getValue()).longValue()), h0.f17515a), oVar3, 0);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
