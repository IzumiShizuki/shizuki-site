package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f13649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f3.c f13650b;

    public t2(u2 u2Var, ic.k kVar) {
        this.f13649a = new x(u2Var, new n2(this, 1), new androidx.lifecycle.n0(17, this), s2.f13594d, kVar);
    }

    public final Object a(ac.i iVar) {
        x xVar = this.f13649a;
        Object objR = a.a.r(xVar, u2.f13690a, xVar.f13855k.e(), iVar);
        return objR == zb.a.f26667a ? objR : ub.a0.f21526a;
    }

    public final f3.c b() {
        f3.c cVar = this.f13650b;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
