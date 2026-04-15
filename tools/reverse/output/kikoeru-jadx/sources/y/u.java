package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f25262a = new v(k.f25158c, j1.c.f9674m);

    public static final v a(h hVar, j1.f fVar, x0.o oVar, int i10) {
        if (jc.l.a(hVar, k.f25158c) && fVar.equals(j1.c.f9674m)) {
            oVar.W(346089448);
            oVar.p(false);
            return f25262a;
        }
        oVar.W(346143295);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && oVar.f(hVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !oVar.f(fVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objK = oVar.K();
        if (z12 || objK == x0.k.f24334a) {
            objK = new v(hVar, fVar);
            oVar.h0(objK);
        }
        v vVar = (v) objK;
        oVar.p(false);
        return vVar;
    }
}
