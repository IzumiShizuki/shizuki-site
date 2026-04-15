package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements pc.w, e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f19905d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc.q0 f19906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f19907b = nd.h.r(null, new bd.e(23, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f19908c;

    static {
        jc.s sVar = new jc.s(w1.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f19905d = new pc.u[]{a0Var.g(sVar), q.t0.H(w1.class, "container", "getContainer()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", 0, a0Var)};
    }

    public w1(x1 x1Var, yc.q0 q0Var) {
        this.f19906a = q0Var;
        this.f19908c = nd.h.r(null, new bd.i(15, x1Var, this, false));
    }

    public static d0 d(yc.e eVar) {
        Class clsJ = f2.j(eVar);
        d0 d0Var = (d0) (clsJ != null ? g8.a.H(clsJ) : null);
        if (d0Var != null) {
            return d0Var;
        }
        throw new hc.a("Type parameter container is not resolved: " + eVar.y());
    }

    @Override // sc.e0
    public final yc.h a() {
        return this.f19906a;
    }

    public final x1 b() {
        pc.u uVar = f19905d[1];
        Object objB = this.f19908c.b();
        jc.l.d(objB, "getValue(...)");
        return (x1) objB;
    }

    public final String c() {
        String strB = this.f19906a.getName().b();
        jc.l.d(strB, "asString(...)");
        return strB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return b().equals(w1Var.b()) && c().equals(w1Var.c());
    }

    public final int hashCode() {
        return c().hashCode() + (b().hashCode() * 31);
    }

    public final String toString() {
        pc.z zVar;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f19906a.e0().ordinal();
        if (iOrdinal == 0) {
            zVar = pc.z.f16984a;
        } else if (iOrdinal == 1) {
            zVar = pc.z.f16985b;
        } else {
            if (iOrdinal != 2) {
                throw new ce.j0();
            }
            zVar = pc.z.f16986c;
        }
        int iOrdinal2 = zVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal2 != 2) {
                    throw new ce.j0();
                }
                sb.append("out ");
            }
        }
        sb.append(c());
        return sb.toString();
    }
}
