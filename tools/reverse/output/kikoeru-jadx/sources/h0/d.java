package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f7603b = new d(3);

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        j1.q qVar = (j1.q) obj;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(-2126899193);
        long j10 = ((l0.q1) oVar.j(l0.r1.f11608a)).f11600a;
        boolean zE = oVar.e(j10);
        Object objK = oVar.K();
        if (zE || objK == x0.k.f24334a) {
            objK = new c(j10, 0);
            oVar.h0(objK);
        }
        j1.q qVarE = qVar.e(androidx.compose.ui.draw.a.b(j1.n.f9689a, (ic.k) objK));
        oVar.p(false);
        return qVarE;
    }
}
