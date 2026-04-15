package ld;

import yc.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ee.f {
    @Override // ee.f
    public final int a() {
        return 3;
    }

    @Override // ee.f
    public final int b(yc.b bVar, yc.b bVar2, yc.e eVar) {
        jc.l.e(bVar, "superDescriptor");
        jc.l.e(bVar2, "subDescriptor");
        if (!(bVar2 instanceof k0) || !(bVar instanceof k0)) {
            return 3;
        }
        k0 k0Var = (k0) bVar2;
        k0 k0Var2 = (k0) bVar;
        if (!jc.l.a(k0Var.getName(), k0Var2.getName())) {
            return 3;
        }
        if (nh.b.A(k0Var) && nh.b.A(k0Var2)) {
            return 1;
        }
        return (nh.b.A(k0Var) || nh.b.A(k0Var2)) ? 2 : 3;
    }
}
