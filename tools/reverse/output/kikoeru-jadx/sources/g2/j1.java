package g2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends i2.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f7216b = new j1("Undefined intrinsics block and it is required");

    @Override // g2.v0
    public final w0 h(x0 x0Var, List list, long j10) {
        int size = list.size();
        vb.s sVar = vb.s.f22820a;
        if (size == 0) {
            return x0Var.b0(f3.a.j(j10), f3.a.i(j10), sVar, h1.f7195d);
        }
        if (size == 1) {
            g1 g1VarV = ((u0) list.get(0)).v(j10);
            return x0Var.b0(f3.b.g(g1VarV.f7180a, j10), f3.b.f(g1VarV.f7181b, j10), sVar, new b0.p(g1VarV, 1));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            g1 g1VarV2 = ((u0) list.get(i10)).v(j10);
            iMax = Math.max(g1VarV2.f7180a, iMax);
            iMax2 = Math.max(g1VarV2.f7181b, iMax2);
            arrayList.add(g1VarV2);
        }
        return x0Var.b0(f3.b.g(iMax, j10), f3.b.f(iMax2, j10), sVar, new d0.u(1, arrayList));
    }
}
