package r1;

import o.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f18685a;

    static {
        q qVar = d.f18657e;
        int i10 = qVar.f18652c;
        e eVar = new e(qVar, qVar, 1);
        int i11 = qVar.f18652c;
        l lVar = d.f18676x;
        int i12 = (lVar.f18652c << 6) | i11;
        g gVar = new g(qVar, lVar, 0);
        int i13 = (i11 << 6) | lVar.f18652c;
        g gVar2 = new g(lVar, qVar, 0);
        y yVar = o.n.f16024a;
        y yVar2 = new y();
        yVar2.h(i10 | (i10 << 6), eVar);
        yVar2.h(i12, gVar);
        yVar2.h(i13, gVar2);
        f18685a = yVar2;
    }
}
