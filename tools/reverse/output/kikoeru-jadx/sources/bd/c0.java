package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p implements yc.h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f2553h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f2554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be.c f2555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.i f2556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.i f2557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final le.k f2558g;

    static {
        jc.s sVar = new jc.s(c0.class, "fragments", "getFragments()Ljava/util/List;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f2553h = new pc.u[]{a0Var.g(sVar), q.t0.H(c0.class, "empty", "getEmpty()Z", 0, a0Var)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(h0 h0Var, be.c cVar, re.l lVar) {
        jc.l.e(cVar, "fqName");
        jc.l.e(lVar, "storageManager");
        be.d dVar = cVar.f2744a;
        super(zc.g.f26696a, dVar.c() ? be.d.f2746e : dVar.g());
        this.f2554c = h0Var;
        this.f2555d = cVar;
        this.f2556e = new re.i(lVar, new b0(this, 0));
        this.f2557f = new re.i(lVar, new b0(this, 1));
        this.f2558g = new le.k(lVar, new b0(this, 2));
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.j(this, obj);
    }

    public final boolean equals(Object obj) {
        yc.h0 h0Var = obj instanceof yc.h0 ? (yc.h0) obj : null;
        if (h0Var == null) {
            return false;
        }
        c0 c0Var = (c0) h0Var;
        return jc.l.a(this.f2555d, c0Var.f2555d) && jc.l.a(this.f2554c, c0Var.f2554c);
    }

    public final int hashCode() {
        return this.f2555d.hashCode() + (this.f2554c.hashCode() * 31);
    }

    @Override // yc.k
    public final yc.k y() {
        be.c cVar = this.f2555d;
        if (cVar.f2744a.c()) {
            return null;
        }
        return this.f2554c.K0(cVar.b());
    }
}
