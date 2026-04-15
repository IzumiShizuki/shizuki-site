package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f11655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i10, ic.a aVar) {
        super(1);
        this.f11654b = i10;
        this.f11655c = aVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f11654b;
        ub.a0 a0Var = ub.a0.f21526a;
        ic.a aVar = this.f11655c;
        switch (i10) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                aVar.b();
                break;
            default:
                q2.g gVar = new q2.g(((Number) aVar.b()).floatValue(), new oc.a(0.0f, 1.0f), 0);
                pc.u[] uVarArr = q2.v.f17698a;
                q2.w wVar = q2.t.f17672c;
                pc.u uVar = q2.v.f17698a[1];
                wVar.a((q2.k) obj, gVar);
                break;
        }
        return a0Var;
    }
}
