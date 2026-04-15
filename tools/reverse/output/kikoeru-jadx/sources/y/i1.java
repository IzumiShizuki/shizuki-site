package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f25149a = new j1(k.f25156a, j1.c.f9671j);

    public static final j1 a(f fVar, j1.g gVar, x0.o oVar, int i10) {
        if (jc.l.a(fVar, k.f25156a) && jc.l.a(gVar, j1.c.f9671j)) {
            oVar.W(-848964613);
            oVar.p(false);
            return f25149a;
        }
        oVar.W(-848913742);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && oVar.f(fVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !oVar.f(gVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objK = oVar.K();
        if (z12 || objK == x0.k.f24334a) {
            objK = new j1(fVar, gVar);
            oVar.h0(objK);
        }
        j1 j1Var = (j1) objK;
        oVar.p(false);
        return j1Var;
    }
}
