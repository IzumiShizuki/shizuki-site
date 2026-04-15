package r;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f18458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ic.k f18459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jc.m f18460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f18461d;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(j1 j1Var, m1 m1Var, ic.k kVar, ic.k kVar2) {
        this.f18461d = j1Var;
        this.f18458a = m1Var;
        this.f18459b = kVar;
        this.f18460c = (jc.m) kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ic.k, jc.m] */
    public final void a(k1 k1Var) {
        Object objA = this.f18460c.a(k1Var.c());
        boolean zG = this.f18461d.f18466c.g();
        m1 m1Var = this.f18458a;
        if (zG) {
            m1Var.g(this.f18460c.a(k1Var.a()), objA, (x) this.f18459b.a(k1Var));
        } else {
            m1Var.h(objA, (x) this.f18459b.a(k1Var));
        }
    }

    @Override // x0.n2
    public final Object getValue() {
        a(this.f18461d.f18466c.f());
        return this.f18458a.f18491j.getValue();
    }
}
