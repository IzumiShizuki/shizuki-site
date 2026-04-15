package sc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends n1 implements ic.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1 f19811h;

    public i1(j1 j1Var) {
        this.f19811h = j1Var;
    }

    @Override // pc.o
    public final pc.u f() {
        return this.f19811h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ub.h] */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((i1) this.f19811h.f19815l.getValue()).h(obj, obj2);
    }

    @Override // sc.l1
    public final q1 v() {
        return this.f19811h;
    }
}
