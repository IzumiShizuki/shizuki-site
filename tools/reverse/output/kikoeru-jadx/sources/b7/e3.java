package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e3 implements p4.g, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m4.l0 f1755a;

    public /* synthetic */ e3(m4.l0 l0Var) {
        this.f1755a = l0Var;
    }

    @Override // p4.k
    public void a(Object obj) {
        ((m4.w0) obj).h(this.f1755a);
    }

    @Override // p4.g
    public void accept(Object obj) {
        z3 z3Var = (z3) obj;
        z3Var.r0();
        v4.v vVar = (v4.v) z3Var.f2227a;
        vVar.m2();
        m4.l0 l0Var = vVar.L;
        m4.l0 l0Var2 = this.f1755a;
        if (l0Var2.equals(l0Var)) {
            return;
        }
        vVar.L = l0Var2;
        vVar.f22683m.e(15, new v4.q(vVar, 2));
    }
}
