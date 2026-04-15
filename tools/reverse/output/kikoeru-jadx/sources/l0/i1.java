package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l1 f11506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(l1 l1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f11504e = i10;
        this.f11506g = l1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f11504e) {
            case 0:
                return new i1(this.f11506g, cVar, 0);
            default:
                return new i1(this.f11506g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f11504e) {
        }
        return ((i1) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.i1.u(java.lang.Object):java.lang.Object");
    }
}
