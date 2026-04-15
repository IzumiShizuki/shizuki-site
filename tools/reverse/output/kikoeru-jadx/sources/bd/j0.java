package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends q implements yc.d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final be.c f2596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2597f;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(yc.y yVar, be.c cVar) {
        jc.l.e(yVar, "module");
        jc.l.e(cVar, "fqName");
        be.d dVar = cVar.f2744a;
        super(yVar, zc.g.f26696a, dVar.c() ? be.d.f2746e : dVar.g(), yc.m0.p0);
        this.f2596e = cVar;
        this.f2597f = "package " + cVar + " of " + yVar;
    }

    @Override // bd.q, yc.k
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public final yc.y y() {
        yc.k kVarY = super.y();
        jc.l.c(kVarY, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (yc.y) kVarY;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.M(this, obj);
    }

    @Override // bd.q, yc.l
    public yc.m0 m() {
        return yc.m0.p0;
    }

    @Override // bd.p
    public String toString() {
        return this.f2597f;
    }
}
