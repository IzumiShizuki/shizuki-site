package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends nf.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f8518e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public a2(yb.c cVar, yb.h hVar) {
        b2 b2Var = b2.f8523a;
        super(cVar, hVar.R(b2Var) == null ? hVar.G(b2Var) : hVar);
        this.f8518e = new ThreadLocal();
        if (cVar.s().R(yb.d.f26087a) instanceof u) {
            return;
        }
        Object objN = nf.b.n(hVar, null);
        nf.b.g(hVar, objN);
        r0(hVar, objN);
    }

    @Override // nf.q
    public final void o0() {
        q0();
    }

    @Override // nf.q, hf.k1
    public final void p(Object obj) {
        q0();
        Object objA = a0.A(obj);
        yb.c cVar = this.f15852d;
        yb.h hVarS = cVar.s();
        Object objN = nf.b.n(hVarS, null);
        a2 a2VarG = objN != nf.b.f15817d ? a0.G(cVar, hVarS, objN) : null;
        try {
            cVar.h(objA);
            if (a2VarG == null || a2VarG.p0()) {
                nf.b.g(hVarS, objN);
            }
        } catch (Throwable th2) {
            if (a2VarG == null || a2VarG.p0()) {
                nf.b.g(hVarS, objN);
            }
            throw th2;
        }
    }

    public final boolean p0() {
        boolean z10 = this.threadLocalIsSet && this.f8518e.get() == null;
        this.f8518e.remove();
        return !z10;
    }

    public final void q0() {
        if (this.threadLocalIsSet) {
            ub.k kVar = (ub.k) this.f8518e.get();
            if (kVar != null) {
                nf.b.g((yb.h) kVar.f21543a, kVar.f21544b);
            }
            this.f8518e.remove();
        }
    }

    public final void r0(yb.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f8518e.set(new ub.k(hVar, obj));
    }
}
