package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends s1 implements pc.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f19871m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(i0 i0Var, yc.k0 k0Var) {
        super(i0Var, k0Var);
        jc.l.e(k0Var, "descriptor");
        this.f19871m = ub.a.c(ub.i.f21540a, new bd.e(21, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.l
    public final pc.g e() {
        return (r0) this.f19871m.getValue();
    }
}
