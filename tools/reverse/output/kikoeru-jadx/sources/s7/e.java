package s7;

import d9.f;
import d9.g;
import d9.m;
import d9.x;
import ic.o;
import jc.j;
import n7.w;
import ua.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e extends j implements o {
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        w wVar = (w) obj;
        ((Number) obj2).intValue();
        yb.c cVar = (yb.c) obj3;
        f fVar = (f) this.f10819b;
        switch (fVar.f5561e) {
            case 0:
                return l.X(((g) fVar.f5562f).f5563a, true, false, new d9.e(wVar, 0), cVar);
            case 1:
                return l.X(((d9.j) fVar.f5562f).f5571a, true, false, new d9.e(wVar, 1), cVar);
            case 2:
                return l.X(((m) fVar.f5562f).f5579a, true, false, new d9.e(wVar, 2), cVar);
            case 3:
                return l.X(((d9.o) fVar.f5562f).f5585a, true, false, new d9.e(wVar, 3), cVar);
            default:
                return l.X(((x) fVar.f5562f).f5614a, true, false, new d9.e(wVar, 4), cVar);
        }
    }
}
