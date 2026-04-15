package m0;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13071a = 56;

    public static final void a(c2 c2Var, j1.q qVar, Set set, ic.k kVar, f1.f fVar, x0.o oVar, int i10) {
        j1.q qVar2;
        ic.k kVar2;
        oVar.Y(-9746411);
        int i11 = (oVar.f(c2Var) ? 4 : 2) | i10 | 3120;
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new l3(7);
                oVar.h0(objK);
            }
            ic.k kVar3 = (ic.k) objK;
            f1.f fVarF = f1.g.f(-1281726977, new g7(set, kVar3, c2Var, fVar), oVar);
            j1.n nVar = j1.n.f9689a;
            y.d.a(nVar, null, fVarF, oVar, 3078);
            kVar2 = kVar3;
            qVar2 = nVar;
        } else {
            oVar.Q();
            qVar2 = qVar;
            kVar2 = kVar;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new d4(c2Var, qVar2, set, kVar2, fVar, i10);
        }
    }
}
