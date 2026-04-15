package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, long j10, int i10) {
        super(1);
        this.f1405b = i10;
        this.f1407d = obj;
        this.f1406c = j10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f1405b;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f1407d;
        switch (i10) {
            case 0:
                a0 a0Var2 = (a0) obj2;
                long jC = f3.j.c(((f3.j) ((r.c) obj).e()).f6660a, this.f1406c);
                int i11 = a0.f1171t;
                a0Var2.g(jC);
                a0Var2.f1174c.b();
                break;
            default:
                s1.d dVar = (s1.d) obj;
                h0.u0 u0Var = (h0.u0) obj2;
                if (((Boolean) u0Var.f7875s.getValue()).booleanValue() || ((Boolean) u0Var.f7876t.getValue()).booleanValue()) {
                    q.t0.q(dVar, this.f1406c, 0L, 0.0f, 126);
                }
                break;
        }
        return a0Var;
    }
}
