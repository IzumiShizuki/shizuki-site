package q9;

import j2.l1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.f f18093a;

    public s0(f1.f fVar) {
        this.f18093a = fVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        y.w wVar = (y.w) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        jc.l.e(wVar, "$this$ModalDrawer");
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(wVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            x0.v.a(l1.f9872n.a(f3.m.f6667a), f1.g.f(1437088585, new ee.b(9, this.f18093a, wVar), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
