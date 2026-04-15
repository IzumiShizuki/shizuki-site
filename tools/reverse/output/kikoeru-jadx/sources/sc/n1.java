package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 extends l1 implements pc.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f19836g = {jc.z.f10839a.g(new jc.s(n1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1 f19837e = nd.h.r(null, new m1(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19838f = ub.a.c(ub.i.f21540a, new m1(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof n1) && jc.l.a(v(), ((n1) obj).v());
    }

    @Override // pc.b
    public final String getName() {
        return q.t0.E(new StringBuilder("<get-"), v().f19859f, '>');
    }

    public final int hashCode() {
        return v().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.u
    public final tc.g i() {
        return (tc.g) this.f19838f.getValue();
    }

    @Override // sc.u
    public final yc.c r() {
        pc.u uVar = f19836g[0];
        Object objB = this.f19837e.b();
        jc.l.d(objB, "getValue(...)");
        return (bd.q0) objB;
    }

    public final String toString() {
        return "getter of " + v();
    }

    @Override // sc.l1
    public final yc.j0 u() {
        pc.u uVar = f19836g[0];
        Object objB = this.f19837e.b();
        jc.l.d(objB, "getValue(...)");
        return (bd.q0) objB;
    }
}
