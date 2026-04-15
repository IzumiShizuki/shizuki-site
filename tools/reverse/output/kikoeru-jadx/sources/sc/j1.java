package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j1 extends q1 implements ic.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f19815l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(i0 i0Var, yc.k0 k0Var) {
        super(i0Var, k0Var);
        jc.l.e(k0Var, "descriptor");
        h1 h1Var = new h1(this, 0);
        ub.i iVar = ub.i.f21540a;
        this.f19815l = ub.a.c(iVar, h1Var);
        ub.a.c(iVar, new h1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.u
    public final pc.p d() {
        return (i1) this.f19815l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((i1) this.f19815l.getValue()).h(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.q1
    public final n1 w() {
        return (i1) this.f19815l.getValue();
    }
}
