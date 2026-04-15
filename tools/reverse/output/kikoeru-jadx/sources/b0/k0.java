package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.c f1281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.n f1282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.k0 f1283c;

    public k0(g1.c cVar, a0.n nVar) {
        this.f1281a = cVar;
        this.f1282b = nVar;
        long[] jArr = o.s0.f16040a;
        this.f1283c = new o.k0();
    }

    public final ic.n a(int i10, Object obj, Object obj2) {
        o.k0 k0Var = this.f1283c;
        j0 j0Var = (j0) k0Var.g(obj);
        if (j0Var != null && j0Var.f1273c == i10 && jc.l.a(j0Var.f1272b, obj2)) {
            f1.f fVar = j0Var.f1274d;
            if (fVar != null) {
                return fVar;
            }
            f1.f fVar2 = new f1.f(new i0(0, j0Var.f1275e, j0Var), 1403994769, true);
            j0Var.f1274d = fVar2;
            return fVar2;
        }
        j0 j0Var2 = new j0(this, i10, obj, obj2);
        k0Var.m(obj, j0Var2);
        f1.f fVar3 = j0Var2.f1274d;
        if (fVar3 != null) {
            return fVar3;
        }
        f1.f fVar4 = new f1.f(new i0(0, this, j0Var2), 1403994769, true);
        j0Var2.f1274d = fVar4;
        return fVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        j0 j0Var = (j0) this.f1283c.g(obj);
        if (j0Var != null) {
            return j0Var.f1272b;
        }
        n0 n0Var = (n0) this.f1282b.b();
        int iD = n0Var.d(obj);
        if (iD != -1) {
            return n0Var.c(iD);
        }
        return null;
    }
}
