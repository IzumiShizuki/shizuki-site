package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f18464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f18465b = x0.v.v(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f18466c;

    public j1(q1 q1Var, v1 v1Var, String str) {
        this.f18466c = q1Var;
        this.f18464a = v1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i1 a(ic.k kVar, ic.k kVar2) {
        x0.e1 e1Var = this.f18465b;
        i1 i1Var = (i1) e1Var.getValue();
        q1 q1Var = this.f18466c;
        if (i1Var == null) {
            Object objA = kVar2.a(q1Var.f18539a.b1());
            Object objA2 = kVar2.a(q1Var.f18539a.b1());
            v1 v1Var = this.f18464a;
            p pVar = (p) v1Var.f18596a.a(objA2);
            pVar.d();
            m1 m1Var = new m1(q1Var, objA, pVar, v1Var);
            i1Var = new i1(this, m1Var, kVar, kVar2);
            e1Var.setValue(i1Var);
            q1Var.f18547i.add(m1Var);
        }
        i1Var.f18460c = (jc.m) kVar2;
        i1Var.f18459b = kVar;
        i1Var.a(q1Var.f());
        return i1Var;
    }
}
