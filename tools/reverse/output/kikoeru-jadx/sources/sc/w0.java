package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f19900g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f19901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1 f19902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19904f;

    static {
        jc.s sVar = new jc.s(w0.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f19900g = new pc.u[]{a0Var.g(sVar), q.t0.H(w0.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, a0Var), q.t0.H(w0.class, "members", "getMembers()Ljava/util/Collection;", 0, a0Var)};
    }

    public w0(x0 x0Var) {
        super(x0Var);
        this.f19901c = nd.h.r(null, new t0(x0Var, 1));
        this.f19902d = nd.h.r(null, new u0(this, 0));
        v0 v0Var = new v0(this, x0Var);
        ub.i iVar = ub.i.f21540a;
        this.f19903e = ub.a.c(iVar, v0Var);
        this.f19904f = ub.a.c(iVar, new u0(this, 1));
        nd.h.r(null, new v0(x0Var, this));
    }
}
