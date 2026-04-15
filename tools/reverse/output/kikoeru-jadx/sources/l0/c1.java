package l0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f11436a = new c1();

    @Override // g2.v0
    public final /* synthetic */ int c(g2.y yVar, List list, int i10) {
        return a0.c.f(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int f(g2.y yVar, List list, int i10) {
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(g2.y yVar, List list, int i10) {
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            g2.g1 g1VarV = ((g2.u0) list.get(i10)).v(j10);
            iMax = Math.max(iMax, g1VarV.f7180a);
            iMax2 = Math.max(iMax2, g1VarV.f7181b);
            arrayList.add(g1VarV);
        }
        return x0Var.b0(iMax, iMax2, vb.s.f22820a, new d0.u(4, arrayList));
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }
}
