package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(boolean z10, Object obj, int i10) {
        super(1);
        this.f17340b = i10;
        this.f17341c = z10;
        this.f17342d = obj;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f17340b;
        ub.a0 a0Var = ub.a0.f21526a;
        boolean z10 = false;
        Object obj2 = this.f17342d;
        boolean z11 = this.f17341c;
        switch (i10) {
            case 0:
                q1.i0 i0Var = (q1.i0) obj;
                if (!z11 && ((Boolean) ((ic.a) obj2).b()).booleanValue()) {
                    z10 = true;
                }
                i0Var.d(z10);
                break;
            default:
                q2.k kVar = (q2.k) obj;
                if (!z11) {
                    q2.v.a(kVar);
                }
                v0.i0 i0Var2 = new v0.i0((v0.l0) obj2, 0);
                pc.u[] uVarArr = q2.v.f17698a;
                kVar.l(q2.j.f17611h, new q2.a(null, i0Var2));
                break;
        }
        return a0Var;
    }
}
