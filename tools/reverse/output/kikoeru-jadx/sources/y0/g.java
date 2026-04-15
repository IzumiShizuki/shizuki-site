package y0;

import java.util.List;
import x0.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f25318d = new g(0, 2, 1);

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        int i10 = ((f1.h) jVar.f(0)).f6631a;
        List list = (List) jVar.f(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            cVar.b(i12, obj);
            cVar.k(i12, obj);
        }
    }
}
