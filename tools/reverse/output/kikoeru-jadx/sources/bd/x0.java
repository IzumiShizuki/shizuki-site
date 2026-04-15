package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ub.p f2684l;

    public x0(yc.b bVar, y0 y0Var, int i10, zc.h hVar, be.e eVar, se.w wVar, boolean z10, boolean z11, boolean z12, se.w wVar2, yc.m0 m0Var, ic.a aVar) {
        super(bVar, y0Var, i10, hVar, eVar, wVar, z10, z11, z12, wVar2, m0Var);
        this.f2684l = ub.a.d(aVar);
    }

    @Override // bd.y0
    public final y0 D1(wc.f fVar, be.e eVar, int i10) {
        zc.h annotations = getAnnotations();
        jc.l.d(annotations, "<get-annotations>(...)");
        se.w wVarB = b();
        jc.l.d(wVarB, "getType(...)");
        return new x0(fVar, null, i10, annotations, eVar, wVarB, E1(), this.f2711h, this.f2712i, this.f2713j, yc.m0.p0, new e(3, this));
    }
}
